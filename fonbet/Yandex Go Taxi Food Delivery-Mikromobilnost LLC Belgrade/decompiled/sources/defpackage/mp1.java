package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mp1 implements sp1 {
    public final do1 a;
    public final AiWidgetEvaluationSwipeDirection b;
    public final boolean c;

    public mp1(do1 do1Var, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, boolean z) {
        this.a = do1Var;
        this.b = aiWidgetEvaluationSwipeDirection;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp1)) {
            return false;
        }
        mp1 mp1Var = (mp1) obj;
        return jl40.l(this.a, mp1Var.a) && this.b == mp1Var.b && this.c == mp1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardSwiped(card=");
        sb.append(this.a);
        sb.append(", direction=");
        sb.append(this.b);
        sb.append(", isTap=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
