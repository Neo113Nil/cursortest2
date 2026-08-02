package xsna;

import com.vk.dto.stories.model.template.StoryTemplateData;

/* compiled from: StoryTemplateItem.kt */
/* loaded from: classes6.dex */
public abstract class ejm0 {

    /* compiled from: StoryTemplateItem.kt */
    public static final class a extends ejm0 {
        public final StoryTemplateData a;

        public a(StoryTemplateData storyTemplateData) {
            this.a = storyTemplateData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StoryTemplate(templateData=" + this.a + ')';
        }
    }

    /* compiled from: StoryTemplateItem.kt */
    public static final class b extends ejm0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoryTemplateMemoriesBanner(header=");
            sb.append(this.a);
            sb.append(", subhead=");
            sb.append(this.b);
            sb.append(", buttonText=");
            sb.append(this.c);
            sb.append(", backgroundImage=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: StoryTemplateItem.kt */
    public static final class c extends ejm0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 332513988;
        }

        public final String toString() {
            return "StoryTemplateSkeleton";
        }
    }
}
