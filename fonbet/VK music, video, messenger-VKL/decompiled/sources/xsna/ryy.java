package xsna;

import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.List;

/* compiled from: LeadFormPage.kt */
/* loaded from: classes4.dex */
public abstract class ryy {

    /* compiled from: LeadFormPage.kt */
    public static abstract class a extends ryy {

        /* compiled from: LeadFormPage.kt */
        /* renamed from: xsna.ryy$a$a, reason: collision with other inner class name */
        public static final class C3642a extends a {
            public final String a;
            public final String b;
            public final String c;
            public final boolean d;
            public final List<ShitAttachment.LeadForm.LeadFormBlock.Answer> e;

            public C3642a(String str, String str2, String str3, boolean z, List<ShitAttachment.LeadForm.LeadFormBlock.Answer> list) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = z;
                this.e = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3642a)) {
                    return false;
                }
                C3642a c3642a = (C3642a) obj;
                return epx.f(this.a, c3642a.a) && epx.f(this.b, c3642a.b) && epx.f(this.c, c3642a.c) && this.d == c3642a.d && epx.f(this.e, c3642a.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MultipleAnswersPage(formId=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", blockId=");
                sb.append(this.c);
                sb.append(", allAnswersRequired=");
                sb.append(this.d);
                sb.append(", answers=");
                return ms9.a(')', sb, this.e);
            }
        }

        /* compiled from: LeadFormPage.kt */
        public static final class b extends a {
            public final String a;
            public final String b;
            public final String c;
            public final boolean d;
            public final List<ShitAttachment.LeadForm.LeadFormBlock.Answer> e;

            public b(String str, String str2, String str3, boolean z, List<ShitAttachment.LeadForm.LeadFormBlock.Answer> list) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = z;
                this.e = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OneAnswerPage(formId=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", blockId=");
                sb.append(this.c);
                sb.append(", allAnswersRequired=");
                sb.append(this.d);
                sb.append(", answers=");
                return ms9.a(')', sb, this.e);
            }
        }

        /* compiled from: LeadFormPage.kt */
        public static final class c extends a {
            public final String a;
            public final String b;
            public final String c;
            public final boolean d;

            public c(String str, String str2, String str3, boolean z) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TextAnswerPage(formId=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", blockId=");
                sb.append(this.c);
                sb.append(", allAnswersRequired=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: LeadFormPage.kt */
    public static final class b extends ryy {
        public final String a;
        public final String b;
        public final List<ShitAttachment.LeadForm.ContactField> c;
        public final ShitAttachment.LeadForm.Agreement d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, List<? extends ShitAttachment.LeadForm.ContactField> list, ShitAttachment.LeadForm.Agreement agreement) {
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = agreement;
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
            return this.d.hashCode() + fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "ContactsPage(formId=" + this.a + ", title=" + this.b + ", contactFields=" + this.c + ", agreement=" + this.d + ')';
        }
    }

    /* compiled from: LeadFormPage.kt */
    public static final class c extends ryy {
        public final String a;
        public final String b;
        public final String c;
        public final List<ImageSize> d;

        public c(String str, String str2, String str3, List<ImageSize> list) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
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

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainPage(formId=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", images=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: LeadFormPage.kt */
    public static final class d extends ryy {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.g;
            return this.h.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultPage(formId=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", siteUrl=");
            sb.append(this.d);
            sb.append(", siteUrlTarget=");
            sb.append(this.e);
            sb.append(", phone=");
            sb.append(this.f);
            sb.append(", promoCode=");
            sb.append(this.g);
            sb.append(", buttonText=");
            return ho8.a(sb, this.h, ')');
        }
    }
}
