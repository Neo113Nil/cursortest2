package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class co1 implements do1 {
    public final String a;
    public final String b;
    public final wp2 c;
    public final String d;
    public final String e;
    public final String f;
    public final AiWidgetEvaluationSwipeDirection g;

    public co1(String str, String str2, AppColor$Palette appColor$Palette, String str3, String str4, String str5, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection) {
        this.a = str;
        this.b = str2;
        this.c = appColor$Palette;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = aiWidgetEvaluationSwipeDirection;
    }

    @Override // defpackage.do1
    public final wp2 a() {
        return this.c;
    }

    @Override // defpackage.do1
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1)) {
            return false;
        }
        co1 co1Var = (co1) obj;
        return jl40.l(this.a, co1Var.a) && jl40.l(this.b, co1Var.b) && jl40.l(this.c, co1Var.c) && this.d.equals(co1Var.d) && jl40.l(this.e, co1Var.e) && this.f.equals(co1Var.f) && this.g == co1Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(n.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("Onboarding(creativeId=", this.a, ", uiKey=", this.b, ", color=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", text=");
        g8e.D(v, this.e, ", hint=", this.f, ", swipeDirection=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
