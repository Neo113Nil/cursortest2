package xsna;

import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: ClipInPlaylist.kt */
/* loaded from: classes16.dex */
public final class zzc {
    public final String a;
    public final a b;

    /* compiled from: ClipInPlaylist.kt */
    public interface a {

        /* compiled from: ClipInPlaylist.kt */
        /* renamed from: xsna.zzc$a$a, reason: collision with other inner class name */
        public static final class C4211a implements a {
            public final b a;
            public final Object b;
            public final tlo0.e c;
            public final tlo0 d;
            public final boolean e;

            public C4211a(b bVar, Image image, tlo0.e eVar, tlo0 tlo0Var, boolean z) {
                this.a = bVar;
                this.b = image;
                this.c = eVar;
                this.d = tlo0Var;
                this.e = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4211a)) {
                    return false;
                }
                C4211a c4211a = (C4211a) obj;
                return epx.f(this.a, c4211a.a) && epx.f(this.b, c4211a.b) && this.c.equals(c4211a.c) && this.d.equals(c4211a.d) && this.e == c4211a.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + com.vk.movika.sdk.base.model.history.b.a((this.c.hashCode() + ((qow.a(this.b) + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Open(title=");
                sb.append(this.a);
                sb.append(", cover=");
                sb.append((Object) qow.b(this.b));
                sb.append(", views=");
                sb.append(this.c);
                sb.append(", likes=");
                sb.append(this.d);
                sb.append(", locked=");
                return defpackage.q0.a(sb, this.e, ')');
            }
        }

        /* compiled from: ClipInPlaylist.kt */
        public static final class b implements a {
            public final b.C4212b a;
            public final tlo0.h b;
            public final Object c;

            public b(b.C4212b c4212b, tlo0.h hVar, Image image) {
                this.a = c4212b;
                this.b = hVar;
                this.c = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return qow.a(this.c) + u11.c(this.a.a.hashCode() * 31, 31, this.b.a);
            }

            public final String toString() {
                return "Restricted(title=" + this.a + ", description=" + this.b + ", icon=" + ((Object) qow.b(this.c)) + ')';
            }
        }
    }

    /* compiled from: ClipInPlaylist.kt */
    public static abstract class b {

        /* compiled from: ClipInPlaylist.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: ClipInPlaylist.kt */
        /* renamed from: xsna.zzc$b$b, reason: collision with other inner class name */
        public static final class C4212b extends b {
            public final String a;

            public C4212b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4212b) && epx.f(this.a, ((C4212b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Text(desc="), this.a, ')');
            }
        }

        public final tlo0 a() {
            if (equals(a.a)) {
                return tq.h(tlo0.Companion, R.string.clips_playlist_no_description);
            }
            if (this instanceof C4212b) {
                return oq.d(tlo0.Companion, ((C4212b) this).a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public zzc(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return epx.f(this.a, zzcVar.a) && epx.f(this.b, zzcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipInPlaylist(videoId=" + this.a + ", content=" + this.b + ')';
    }
}
