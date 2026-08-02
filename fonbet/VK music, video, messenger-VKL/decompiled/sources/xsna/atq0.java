package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: UserProfileNotification.kt */
/* loaded from: classes5.dex */
public abstract class atq0 {

    /* compiled from: UserProfileNotification.kt */
    public static final class a {
        public final tlo0.f a;
        public final tlo0.f b;
        public final UserProfileAction.f.c.a c;

        public a(tlo0.f fVar, tlo0.f fVar2, UserProfileAction.f.c.a aVar) {
            this.a = fVar;
            this.b = fVar2;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.b.hashCode() + shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
        }

        public final String toString() {
            return "ClickableMessage(textSource=" + this.a + ", messageSource=" + this.b + ", onClickAction=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileNotification.kt */
    public static final class b extends atq0 {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ErrorDialog(throwable="), this.a, ')');
        }
    }

    /* compiled from: UserProfileNotification.kt */
    public static abstract class c extends atq0 {

        /* compiled from: UserProfileNotification.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: UserProfileNotification.kt */
        public static final class b extends c {
            public static final b a = new b();
        }

        /* compiled from: UserProfileNotification.kt */
        /* renamed from: xsna.atq0$c$c, reason: collision with other inner class name */
        public static final class C2572c extends c {
            public static final C2572c a = new C2572c();
        }

        /* compiled from: UserProfileNotification.kt */
        public static final class d extends c {
            public static final d a = new d();
        }

        /* compiled from: UserProfileNotification.kt */
        public static final class e extends c {
            public static final e a = new e();
        }
    }

    /* compiled from: UserProfileNotification.kt */
    public static final class d extends atq0 {
        public final Integer a;
        public final String b;
        public final tlo0 c;
        public final Integer d;
        public final int e;
        public final Integer f;
        public final izs<ikv0, s3q0> g;
        public final a h;

        public d() {
            this(null, null, null, null, 0, null, null, 255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && this.e == dVar.e && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            tlo0 tlo0Var = this.c;
            int hashCode3 = (hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            Integer num2 = this.d;
            int a = shy.a(this.e, (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
            Integer num3 = this.f;
            int hashCode4 = (a + (num3 == null ? 0 : num3.hashCode())) * 31;
            izs<ikv0, s3q0> izsVar = this.g;
            int hashCode5 = (hashCode4 + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
            a aVar = this.h;
            return hashCode5 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "SnackBar(textResId=" + this.a + ", message=" + this.b + ", textSource=" + this.c + ", drawableResId=" + this.d + ", drawableTintRes=" + this.e + ", buttonTextRes=" + this.f + ", buttonListener=" + this.g + ", clickableMessage=" + this.h + ')';
        }

        public d(Integer num, String str, tlo0.f fVar, Integer num2, int i, z6f0 z6f0Var, a aVar, int i2) {
            Integer valueOf = Integer.valueOf(R.string.cancel);
            num = (i2 & 1) != 0 ? null : num;
            str = (i2 & 2) != 0 ? null : str;
            fVar = (i2 & 4) != 0 ? null : fVar;
            num2 = (i2 & 8) != 0 ? null : num2;
            i = (i2 & 16) != 0 ? R.attr.colorAccent : i;
            valueOf = (i2 & 32) != 0 ? null : valueOf;
            z6f0Var = (i2 & 64) != 0 ? null : z6f0Var;
            aVar = (i2 & 128) != 0 ? null : aVar;
            this.a = num;
            this.b = str;
            this.c = fVar;
            this.d = num2;
            this.e = i;
            this.f = valueOf;
            this.g = z6f0Var;
            this.h = aVar;
        }
    }

    /* compiled from: UserProfileNotification.kt */
    public static final class e extends atq0 {
        public final boolean a;
        public final ContentTab b;
        public final boolean c;
        public final boolean d;

        public e(boolean z, ContentTab contentTab, boolean z2, boolean z3) {
            this.a = z;
            this.b = contentTab;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabPinningChanged(pinned=");
            sb.append(this.a);
            sb.append(", tab=");
            sb.append(this.b);
            sb.append(", private=");
            sb.append(this.c);
            sb.append(", onlyMobile=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: UserProfileNotification.kt */
    public static final class f extends atq0 {
        public final Integer a;
        public final String b;
        public final Throwable c;
        public final boolean d;

        public f() {
            this(null, null, null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d;
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.c;
            return Boolean.hashCode(this.d) + ((hashCode2 + (th != null ? th.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Toast(resId=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", throwable=");
            sb.append(this.c);
            sb.append(", isLongDuration=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public f(Integer num, String str, Throwable th, int i) {
            num = (i & 1) != 0 ? null : num;
            str = (i & 2) != 0 ? null : str;
            th = (i & 4) != 0 ? null : th;
            boolean z = (i & 8) == 0;
            this.a = num;
            this.b = str;
            this.c = th;
            this.d = z;
        }
    }
}
