package xsna;

import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import xsna.uuf;

/* compiled from: ClipsWrapperDecorationMviState.kt */
/* loaded from: classes17.dex */
public interface vpf extends km50 {

    /* compiled from: ClipsWrapperDecorationMviState.kt */
    public static final class a implements vpf, uuf.c.a {
        public final boolean b;
        public final ClipsDecorationKey c;

        public a(boolean z, ClipsDecorationKey clipsDecorationKey) {
            this.b = z;
            this.c = clipsDecorationKey;
        }

        @Override // xsna.vpf, xsna.uuf.c
        public final boolean e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        @Override // xsna.vpf
        public final ClipsDecorationKey f() {
            return this.c;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            ClipsDecorationKey clipsDecorationKey = this.c;
            return hashCode + (clipsDecorationKey == null ? 0 : clipsDecorationKey.hashCode());
        }

        public final String toString() {
            return "Hidden(isViewVisible=" + this.b + ", decorationKey=" + this.c + ')';
        }
    }

    /* compiled from: ClipsWrapperDecorationMviState.kt */
    public static final class b implements vpf, uuf.c.b {
        public final ClipsDecorationKey b;
        public final ClipsFeedDecorationPayload c;
        public final boolean d;

        public b(ClipsDecorationKey clipsDecorationKey, ClipsFeedDecorationPayload clipsFeedDecorationPayload, boolean z) {
            this.b = clipsDecorationKey;
            this.c = clipsFeedDecorationPayload;
            this.d = z;
        }

        @Override // xsna.uuf.c.b
        public final ClipsFeedDecorationPayload a() {
            return this.c;
        }

        @Override // xsna.vpf, xsna.uuf.c
        public final boolean e() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        @Override // xsna.vpf
        public final ClipsDecorationKey f() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(decorationKey=");
            sb.append(this.b);
            sb.append(", decorationPayload=");
            sb.append(this.c);
            sb.append(", isViewVisible=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    boolean e();

    ClipsDecorationKey f();
}
