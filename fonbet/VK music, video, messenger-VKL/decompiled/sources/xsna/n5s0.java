package xsna;

import com.vk.clips.sdk.shared.item.video.immediate.viewstate.CoverState;

/* compiled from: VideoBaseImmediateViewState.kt */
/* loaded from: classes17.dex */
public interface n5s0 {

    /* compiled from: VideoBaseImmediateViewState.kt */
    public static final class a implements n5s0 {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final qjt0 d;
        public final CoverState e;
        public final xcg0 f;
        public final boolean g;

        public a(String str, boolean z, boolean z2, qjt0 qjt0Var, CoverState coverState, xcg0 xcg0Var, boolean z3) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = qjt0Var;
            this.e = coverState;
            this.f = xcg0Var;
            this.g = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(uniqueKey=");
            sb.append(this.a);
            sb.append(", keepScreenOn=");
            sb.append(this.b);
            sb.append(", videoContainerVisible=");
            sb.append(this.c);
            sb.append(", videoTextureState=");
            sb.append(this.d);
            sb.append(", coverState=");
            sb.append(this.e);
            sb.append(", restrictionCoverState=");
            sb.append(this.f);
            sb.append(", loadingVisible=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: VideoBaseImmediateViewState.kt */
    public static final class b implements n5s0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2123484353;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
