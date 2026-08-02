package xsna;

import com.vk.dto.common.VideoFileOld;
import xsna.d280;

/* compiled from: OnBoardingScreenData.kt */
/* loaded from: classes5.dex */
public interface c280 {

    /* compiled from: OnBoardingScreenData.kt */
    public static final class a implements c280 {
        public static final a a = new a();
        public static final d280.b b = new d280.b(new VideoFileOld());
        public static final String c = "";
        public static final String d = "";

        @Override // xsna.c280
        public final d280 getContent() {
            return b;
        }

        @Override // xsna.c280
        public final String getDescription() {
            return d;
        }

        @Override // xsna.c280
        public final String getTitle() {
            return c;
        }
    }

    /* compiled from: OnBoardingScreenData.kt */
    public static final class b implements c280 {
        public final d280.b a;
        public final String b;
        public final String c;

        public b(d280.b bVar, String str, String str2) {
            this.a = bVar;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        @Override // xsna.c280
        public final d280 getContent() {
            return this.a;
        }

        @Override // xsna.c280
        public final String getDescription() {
            return this.c;
        }

        @Override // xsna.c280
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(content=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", description=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: OnBoardingScreenData.kt */
    public static final class c implements c280 {
        public final d280 a;
        public final String b;
        public final String c;
        public final String d;

        public c(d280 d280Var, String str, String str2, String str3) {
            this.a = d280Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        @Override // xsna.c280
        public final d280 getContent() {
            return this.a;
        }

        @Override // xsna.c280
        public final String getDescription() {
            return this.c;
        }

        @Override // xsna.c280
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Step(content=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", stepStatus=");
            return ho8.a(sb, this.d, ')');
        }
    }

    d280 getContent();

    String getDescription();

    String getTitle();
}
