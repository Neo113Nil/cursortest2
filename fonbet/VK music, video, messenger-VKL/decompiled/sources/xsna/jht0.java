package xsna;

import xsna.iht0;

/* compiled from: VideoSlotInfo.kt */
/* loaded from: classes6.dex */
public interface jht0 {

    /* compiled from: VideoSlotInfo.kt */
    public static final class a implements jht0 {
        public final iht0.c a;
        public final boolean b;
        public final String c;
        public final Integer d;
        public final Integer e;
        public final Float f;
        public final Float g;
        public final boolean h;

        public /* synthetic */ a(iht0.c cVar, String str) {
            this(cVar, false, str, null, null, null, null, false);
        }

        public static a b(a aVar, boolean z, Integer num, Integer num2, Float f, Float f2, boolean z2, int i) {
            iht0.c cVar = aVar.a;
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            boolean z3 = z;
            String str = aVar.c;
            if ((i & 8) != 0) {
                num = aVar.d;
            }
            Integer num3 = num;
            if ((i & 16) != 0) {
                num2 = aVar.e;
            }
            Integer num4 = num2;
            if ((i & 32) != 0) {
                f = aVar.f;
            }
            Float f3 = f;
            if ((i & 64) != 0) {
                f2 = aVar.g;
            }
            return new a(cVar, z3, str, num3, num4, f3, f2, (i & 128) != 0 ? aVar.h : z2);
        }

        @Override // xsna.jht0
        public final String a() {
            return this.c;
        }

        public final Float c() {
            return this.g;
        }

        public final Float d() {
            return this.f;
        }

        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h;
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.d;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f = this.f;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.g;
            return Boolean.hashCode(this.h) + ((hashCode4 + (f2 != null ? f2.hashCode() : 0)) * 31);
        }

        @Override // xsna.jht0
        public final boolean isActive() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("List(videoSlot=");
            sb.append(this.a);
            sb.append(", isActive=");
            sb.append(this.b);
            sb.append(", currentVideoId=");
            sb.append(this.c);
            sb.append(", primaryIndex=");
            sb.append(this.d);
            sb.append(", secondaryIndex=");
            sb.append(this.e);
            sb.append(", visibilityPercentage=");
            sb.append(this.f);
            sb.append(", lastFrameOffsetDeltaPercent=");
            sb.append(this.g);
            sb.append(", isScrollInProgress=");
            return defpackage.q0.a(sb, this.h, ')');
        }

        public a(iht0.c cVar, boolean z, String str, Integer num, Integer num2, Float f, Float f2, boolean z2) {
            this.a = cVar;
            this.b = z;
            this.c = str;
            this.d = num;
            this.e = num2;
            this.f = f;
            this.g = f2;
            this.h = z2;
        }
    }

    /* compiled from: VideoSlotInfo.kt */
    public static final class b implements jht0 {
        public final iht0 a;
        public final String b;

        public b(iht0 iht0Var, String str) {
            this.a = iht0Var;
            this.b = str;
        }

        @Override // xsna.jht0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // xsna.jht0
        public final boolean isActive() {
            return false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Removed(videoSlot=");
            sb.append(this.a);
            sb.append(", currentVideoId=");
            return ho8.a(sb, this.b, ')');
        }
    }

    String a();

    boolean isActive();
}
