package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.rcz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class g8x extends t46 {
    public final Context e;
    public final i620 f;
    public rez0 g;
    public ijz0 h;
    public i8x i;
    public d j;
    public final int k;
    public final float l;
    public a m;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final boolean g;

        @Nullable
        public final String h;

        @Nullable
        public final String i;

        @Nullable
        public final String j;

        @Nullable
        public final String k;

        @Nullable
        public final String l;

        @Nullable
        public final String m;

        @Nullable
        public final String n;

        public b(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = z;
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = str4;
            this.l = str5;
            this.m = str6;
            this.n = str7;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("InstreamAdCompanionBanner{width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            sb.append(this.c);
            sb.append(", assetHeight=");
            sb.append(this.d);
            sb.append(", expandedWidth=");
            sb.append(this.e);
            sb.append(", expandedHeight=");
            sb.append(this.f);
            sb.append(", isClickable=");
            sb.append(this.g);
            sb.append(", staticResource='");
            sb.append(this.h);
            sb.append("', iframeResource='");
            sb.append(this.i);
            sb.append("', htmlResource='");
            sb.append(this.j);
            sb.append("', apiFramework='");
            sb.append(this.k);
            sb.append("', adSlotID='");
            sb.append(this.l);
            sb.append("', required='");
            sb.append(this.m);
            sb.append("', bundleId='");
            return i5s.a(sb, this.n, "'}");
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class c {
        public final float a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        @Nullable
        public final kiw g;

        @Nullable
        public final String h;

        @Nullable
        public final String i;

        @NonNull
        public final ArrayList<fvr> j;

        @NonNull
        public final ArrayList k;

        @NonNull
        public final String l;

        @Nullable
        public final c900 m;

        public c(boolean z, boolean z2, boolean z3, float f, String str, boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z5, String str2, kiw kiwVar, String str3, c900 c900Var) {
            this.b = z;
            this.d = z2;
            this.c = z4;
            this.e = z3;
            this.a = f;
            this.h = str;
            this.j = arrayList;
            this.k = arrayList2;
            this.f = z5;
            this.l = str2;
            this.g = kiwVar;
            this.i = str3;
            this.m = c900Var;
        }

        @NonNull
        public final String toString() {
            return "InstreamAudioAdBanner{duration=" + this.a + ", allowSeek=" + this.b + ", allowPause=" + this.c + ", allowSkip=" + this.d + ", allowTrackChange=" + this.e + ", hasAdChoices=" + this.f + ", adChoicesIcon=" + this.g + ", adText='" + this.h + "', bundleId='" + this.i + "', shareButtonDatas=" + this.j + ", companionBanners=" + this.k + ", advertisingLabel='" + this.l + "', loudnessMetadata=" + this.m + '}';
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface d {
        void a(float f, float f2);

        void b(@NonNull g8x g8xVar, @NonNull c cVar);

        void c(@NonNull g8x g8xVar);

        void d(@NonNull g8x g8xVar, @NonNull c cVar);

        void e(@NonNull g8x g8xVar);

        void f(@NonNull g8x g8xVar);

        void g(@NonNull String str, @NonNull g8x g8xVar);
    }

    public g8x(int i, @NonNull i620 i620Var, @NonNull Context context) {
        super(context, i, "instreamaudioads");
        this.k = 10;
        this.l = 1.0f;
        this.e = context;
        this.f = i620Var;
        String str = gt50.a;
        gu8.d("Instream audio ad created with slotId. Version - 5.50.2");
    }

    public final void c(rez0 rez0Var, xla xlaVar) {
        d dVar = this.j;
        if (dVar == null) {
            return;
        }
        iaz0 iaz0Var = (iaz0) xlaVar.b;
        if (rez0Var == null) {
            if (iaz0Var == null) {
                iaz0 iaz0Var2 = iaz0.c;
            }
            dVar.e(this);
            return;
        }
        for (pjz0 pjz0Var : rez0Var.b.values()) {
            if (!pjz0Var.d.isEmpty() || !pjz0Var.f.isEmpty() || !pjz0Var.e.isEmpty()) {
                this.g = rez0Var;
                ijz0 ijz0Var = new ijz0(this, rez0Var, this.a, this.b, this.f);
                this.h = ijz0Var;
                ijz0Var.p = this.k;
                float f = this.l;
                o6z0 o6z0Var = ijz0Var.f;
                i8x i8xVar = o6z0Var.g;
                if (i8xVar != null) {
                    i8xVar.setVolume(f);
                }
                o6z0Var.f = f;
                i8x i8xVar2 = this.i;
                if (i8xVar2 != null) {
                    this.h.c(i8xVar2);
                }
                gu8.c(null, "InstreamAudioAd: Midpoints are not configured, duration is not set or <= zero");
                d dVar2 = this.j;
                if (dVar2 == null) {
                    return;
                }
                f8x f8xVar = new f8x(this, dVar2);
                ijz0 ijz0Var2 = this.h;
                if (ijz0Var2 == null) {
                    gu8.c(null, "InstreamAudioAd: Unable to start ad - not loaded yet");
                    f8xVar.b("preroll", iaz0.u, this);
                    return;
                }
                pjz0 b2 = ijz0Var2.c.b("preroll");
                if (b2 == null) {
                    gu8.c(null, "InstreamAudioAdEngine: No section with name preroll");
                    return;
                }
                jjz0 jjz0Var = new jjz0(ijz0Var2, f8xVar);
                rcz0 rcz0Var = ijz0Var2.q;
                xrz0 xrz0Var = ijz0Var2.j;
                udz0 udz0Var = ijz0Var2.d.j;
                synchronized (rcz0Var) {
                    if (xrz0Var != null) {
                        try {
                            if (xrz0Var.c.c.equals(b2.c)) {
                                if (b2.k()) {
                                    if (-1.0f == xrz0Var.d) {
                                    }
                                }
                                gu8.c(null, "LoadPlayCoordinator: ignore prepare because section+point is playing right now, section " + b2.c + ", point -1.0");
                                jjz0Var.a(iaz0.w, b2);
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (rcz0Var.a(b2, -1.0f) != null) {
                        gu8.c(null, "LoadPlayCoordinator: ignore second prepare for section " + b2.c + ", point -1.0");
                        jjz0Var.a(iaz0.w, b2);
                        return;
                    }
                    rcz0Var.a.add(new rcz0.a(b2));
                    sjz0 sjz0Var = new sjz0(b2, udz0Var, jjz0Var);
                    if (b2.k()) {
                        sjz0Var.e();
                    } else {
                        sjz0Var.d();
                    }
                    return;
                }
            }
        }
        d dVar3 = this.j;
        if (iaz0Var == null) {
            iaz0 iaz0Var3 = iaz0.c;
        }
        dVar3.e(this);
    }

    public final void d(String str) {
        ijz0 ijz0Var = this.h;
        if (ijz0Var == null) {
            gu8.c(null, "InstreamAudioAd: Unable to start ad – not loaded yet");
            return;
        }
        if (ijz0Var.f.g == null) {
            gu8.c(null, "InstreamAudioAd: Unable to start ad – player has not set");
            return;
        }
        ijz0Var.d(ijz0Var.j);
        pjz0 b2 = ijz0Var.c.b(str);
        if (b2 == null) {
            gu8.c(null, "InstreamAudioAdEngine: No section with name ".concat(str));
        } else {
            ijz0Var.q.b(b2, -1.0f, ijz0Var.d.j, ijz0Var.r, new xx50(ijz0Var, b2));
        }
    }

    public final void e() {
        this.j = null;
        ijz0 ijz0Var = this.h;
        if (ijz0Var != null) {
            o6z0 o6z0Var = ijz0Var.f;
            o6z0Var.b.close();
            i8x i8xVar = o6z0Var.g;
            if (i8xVar != null) {
                i8xVar.destroy();
            }
            o6z0Var.g = null;
        }
    }

    @NonNull
    public final List<String> f() {
        if (this.g == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList c2 = this.g.c();
        if (c2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        int size = c2.size();
        int i = 0;
        while (i < size) {
            Object obj = c2.get(i);
            i++;
            pjz0 pjz0Var = (pjz0) obj;
            if (!pjz0Var.d.isEmpty() || !pjz0Var.f.isEmpty() || !pjz0Var.e.isEmpty()) {
                arrayList.add(pjz0Var.c);
            }
        }
        return arrayList;
    }
}
