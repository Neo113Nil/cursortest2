package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.messaging.input.util.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;

/* loaded from: classes5.dex */
public abstract class mcb1 {
    public static final void a(ButtonComponent buttonComponent, bj70 bj70Var) {
        buttonComponent.setButtonTitleColor(bj70Var.b);
        pi70 pi70Var = bj70Var.a;
        if (pi70Var instanceof ni70) {
            buttonComponent.setBackground(((ni70) pi70Var).a);
        } else if (pi70Var instanceof oi70) {
            buttonComponent.setButtonBackground(((oi70) pi70Var).a);
        } else {
            w511.b();
        }
    }

    public static SpannableStringBuilder b(ButtonComponent buttonComponent, CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        int d = c.d(mrg0.component_text_size_body, buttonComponent);
        if ((i2 & 8) != 0) {
            i = c.d(mrg0.component_text_size_caption, buttonComponent);
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append(charSequence, new AbsoluteSizeSpanFix(d, false), 33);
        if (charSequence2 != null && !evu0.J(charSequence2)) {
            append.append((CharSequence) "\n");
            append.append(charSequence2, new AbsoluteSizeSpanFix(i, false), 33);
        }
        return append;
    }

    public static final oz40 c(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1390485425);
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        btsVar.e0(-193764143);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new a(view);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        oz40 a = f.a(((a) Q).e, Boolean.FALSE, null, btsVar, 48, 2);
        btsVar.t(false);
        return a;
    }

    public static final dur0 d(long j, long j2, fid fidVar) {
        bts btsVar = (bts) fidVar;
        boolean z = btsVar.m(j.n) == LayoutDirection.Rtl;
        boolean d = btsVar.d(j) | btsVar.d(j2);
        Object Q = btsVar.Q();
        if (d || Q == did.a) {
            Q = new dur0(scc.g(new ldc(j), new ldc(j2), new ldc(j)), z);
            btsVar.o0(Q);
        }
        return (dur0) Q;
    }
}
