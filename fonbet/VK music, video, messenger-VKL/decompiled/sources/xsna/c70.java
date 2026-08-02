package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.music.MusicTrack;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.core.view.IntentAction;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashSet;

/* compiled from: Actions.java */
@Deprecated
/* loaded from: classes5.dex */
public final class c70 {
    public static final k70 a = new k70();

    /* compiled from: Actions.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IntentAction.values().length];
            a = iArr;
            try {
                iArr[IntentAction.ADD_TO_MY_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IntentAction.SHARE_TO_ALBUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IntentAction.SHARE_TO_WALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IntentAction.SHARE_TO_DOCS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IntentAction.SHARE_EXTERNAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IntentAction.SHARE_IN_STORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IntentAction.COPY_LINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IntentAction.MAKE_DUET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IntentAction.ADD_FAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IntentAction.REMOVE_FAVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: Actions.java */
    public static final class b {
        public final boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public final boolean i;
        public String j;
        public String k;
        public String l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;

        @Nullable
        public ze6 t;
        public final LinkedHashSet u;
        public boolean v;
        public int w;

        public b() {
            boolean z = o25.a().i().r;
            this.a = z;
            this.b = true;
            this.c = true;
            this.d = false;
            this.e = z;
            this.f = true;
            this.g = true;
            this.h = false;
            this.i = true;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = null;
            this.u = new LinkedHashSet();
            this.v = false;
        }

        public final void a(int i) {
            this.u.add(Integer.valueOf(i));
        }

        @NonNull
        public final ActionsInfo b() {
            ze6 ze6Var = this.t;
            int i = 1;
            int i2 = 0;
            if (ze6Var != null) {
                IntentAction[] a = ze6Var.a();
                this.j = this.t.b();
                if (a != null) {
                    int i3 = 0;
                    for (IntentAction intentAction : a) {
                        switch (a.a[intentAction.ordinal()]) {
                            case 1:
                                i3 |= 1024;
                                a(10);
                                break;
                            case 2:
                                i3 |= 256;
                                a(8);
                                break;
                            case 3:
                                i3 |= 1;
                                a(1);
                                break;
                            case 4:
                                i3 |= 512;
                                a(9);
                                break;
                            case 5:
                                i3 |= 16;
                                a(5);
                                break;
                            case 6:
                                i3 |= 4;
                                a(3);
                                break;
                            case 7:
                                i3 |= 8;
                                a(4);
                                break;
                            case 8:
                                i3 |= 64;
                                a(6);
                                break;
                            case 9:
                                i3 |= 32;
                                a(11);
                                this.m = false;
                                break;
                            case 10:
                                i3 |= 32;
                                a(12);
                                this.m = true;
                                break;
                        }
                    }
                    i2 = i3;
                }
            } else {
                if (this.b) {
                    a(1);
                } else {
                    i = 0;
                }
                if (this.c) {
                    i |= 2;
                    a(2);
                }
                if (this.d) {
                    i |= 32;
                    a(11);
                }
                if (this.s) {
                    i |= SQLiteDatabase.OPEN_PRIVATECACHE;
                    a(16);
                }
                if (this.e) {
                    i |= 4;
                    a(3);
                }
                if (this.f) {
                    i |= 8;
                    a(4);
                }
                if (this.g) {
                    i |= 16;
                    a(5);
                }
                if (this.h) {
                    i |= 64;
                    a(6);
                }
                if (this.i) {
                    i |= 128;
                    a(7);
                }
                if (this.n) {
                    i |= 2048;
                    a(13);
                }
                if (this.o) {
                    i |= 32768;
                    a(14);
                }
                if (this.p) {
                    i |= 524288;
                    a(17);
                }
                if (this.q) {
                    i |= 65536;
                    a(15);
                }
                if (this.r) {
                    a(18);
                    i2 = 1048576 | i;
                } else {
                    i2 = i;
                }
            }
            return new ActionsInfo(i2, this.j, this.k, this.l, this.m, this.u, Integer.valueOf(this.w), this.v);
        }

        @NonNull
        public final void c(boolean z) {
            if (z) {
                a(18);
            }
            this.r = z;
        }

        @NonNull
        public final void d(boolean z) {
            if (z) {
                a(17);
            }
            this.p = z;
            if (z) {
                a(14);
            }
            this.o = z;
        }

        @NonNull
        public final void e(boolean z, boolean z2) {
            if (z) {
                a(11);
            }
            this.d = z;
            this.m = z2;
        }

        @NonNull
        public final void f() {
            a(4);
            this.f = true;
        }

        @NonNull
        public final void g() {
            this.b = false;
            this.c = false;
            e(false, false);
            k(false);
            this.f = false;
            this.g = false;
            this.h = false;
            this.n = false;
            this.u.clear();
            this.v = false;
        }

        @NonNull
        public final void h(String str) {
            this.k = str;
        }

        public final void i(String str) {
            this.l = str;
        }

        @NonNull
        public final void j(boolean z) {
            if (z) {
                a(2);
            }
            this.c = z;
        }

        @NonNull
        public final void k(boolean z) {
            if (this.a && z) {
                a(3);
            }
            this.e = z;
        }

        @NonNull
        public final void l(boolean z) {
            if (z) {
                a(1);
            }
            this.b = z;
        }

        @NonNull
        public final void m(String str) {
            this.j = str;
        }
    }

    @NonNull
    public static ActionsInfo a() {
        b bVar = new b();
        bVar.b = false;
        bVar.c = false;
        return bVar.b();
    }

    @NonNull
    public static ActionsInfo b(@NonNull Article article) {
        return a.c(article);
    }

    @NonNull
    public static ActionsInfo c(@NonNull VideoFile videoFile, Boolean bool) {
        return a.g(videoFile, bool.booleanValue());
    }

    @NonNull
    public static ActionsInfo d(@NonNull ApiApplication apiApplication, @Nullable String str, @NonNull String str2, @Nullable String str3) {
        b bVar = new b();
        bVar.b = false;
        bVar.c = false;
        bVar.e(false, false);
        if (!"mini_app".equals(apiApplication.C)) {
            bVar.j = str2;
        } else if (str3 != null) {
            bVar.j = str3;
        }
        if (str != null && !y501.a().g(str)) {
            bVar.k(false);
        }
        return bVar.b();
    }

    @NonNull
    public static ActionsInfo e(@NonNull MusicTrack musicTrack, Boolean bool, Boolean bool2) {
        boolean z = (BuildInfo.g() || BuildInfo.t()) ? false : true;
        b bVar = new b();
        if (z) {
            bVar.f();
            boolean z2 = musicTrack.Tb() && bool2.booleanValue();
            if (z2) {
                bVar.a(16);
            }
            bVar.s = z2;
            bVar.k(o25.a().i().r && bool.booleanValue());
            bVar.d(true);
            bVar.a(15);
            bVar.q = true;
            bVar.b = false;
            bVar.c = false;
            bVar.v = true;
        } else {
            bVar.f();
            bVar.b = false;
            bVar.c = false;
        }
        return bVar.b();
    }

    @NonNull
    public static ActionsInfo f() {
        a.getClass();
        if (!BuildInfo.q()) {
            b bVar = new b();
            bVar.v = true;
            bVar.c(true);
            bVar.b = false;
            bVar.c = false;
            return bVar.b();
        }
        b bVar2 = new b();
        bVar2.g();
        bVar2.v = true;
        bVar2.d(true);
        bVar2.a(15);
        bVar2.q = true;
        bVar2.c(true);
        bVar2.f();
        bVar2.a(5);
        bVar2.g = true;
        return bVar2.b();
    }

    @NonNull
    public static ActionsInfo g() {
        b bVar = new b();
        bVar.b = false;
        bVar.c = false;
        bVar.k(true);
        return bVar.b();
    }

    @NonNull
    public static ActionsInfo h() {
        b bVar = new b();
        bVar.k(false);
        bVar.l(true);
        bVar.j(true);
        bVar.f();
        return bVar.b();
    }

    @NonNull
    public static ActionsInfo i(@Nullable Peer peer, String str) {
        b bVar = new b();
        bVar.b = false;
        bVar.c = false;
        if ((str != null && !y501.a().g(str)) || (peer != null && peer.Ab(Peer.Type.GROUP))) {
            bVar.k(false);
        }
        return bVar.b();
    }
}
