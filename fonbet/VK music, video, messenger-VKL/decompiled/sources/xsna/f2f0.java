package xsna;

/* compiled from: ReactionUiModel.kt */
/* loaded from: classes18.dex */
public interface f2f0 {

    /* compiled from: ReactionUiModel.kt */
    public static final class a implements f2f0 {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public a(int i, String str, String str2, String str3, String str4) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // xsna.f2f0
        public final int a() {
            return this.a;
        }

        @Override // xsna.f2f0
        public final String b() {
            return this.c;
        }

        @Override // xsna.f2f0
        public final String c() {
            return this.d;
        }

        @Override // xsna.f2f0
        public final String d() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        @Override // xsna.f2f0
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BadgeModel(reactionId=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", animationUrl=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            sb.append(this.d);
            sb.append(", addReactionDescription=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: ReactionUiModel.kt */
    public static final class b implements f2f0 {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public b(int i, String str, String str2, String str3, String str4) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // xsna.f2f0
        public final int a() {
            return this.a;
        }

        @Override // xsna.f2f0
        public final String b() {
            return this.c;
        }

        @Override // xsna.f2f0
        public final String c() {
            return this.d;
        }

        @Override // xsna.f2f0
        public final String d() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        @Override // xsna.f2f0
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimpleModel(reactionId=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", animationUrl=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            sb.append(this.d);
            sb.append(", addReactionDescription=");
            return ho8.a(sb, this.e, ')');
        }
    }

    int a();

    String b();

    String c();

    String d();

    String getTitle();
}
