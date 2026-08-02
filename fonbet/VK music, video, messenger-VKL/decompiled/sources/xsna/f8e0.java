package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.dto.hints.Hint;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import xsna.dw20;
import xsna.e3m;
import xsna.y7e0;

/* compiled from: ProtectHintRouter.kt */
/* loaded from: classes5.dex */
public final class f8e0 implements a8e0 {
    public final d8e0 a;
    public dw20 b;
    public ewt c;

    public f8e0(d8e0 d8e0Var) {
        this.a = d8e0Var;
    }

    @Override // xsna.a8e0
    public final void a(g8e0 g8e0Var, ewt ewtVar) {
        if (b()) {
            return;
        }
        this.c = ewtVar;
        Hint hint = g8e0Var.a;
        WeakReference<? extends AppCompatActivity> weakReference = g8e0Var.b;
        f880 f880Var = new f880(this, 15);
        yq1 yq1Var = new yq1(17, g8e0Var, this);
        d8e0 d8e0Var = this.a;
        d8e0Var.getClass();
        Context context = d8e0Var.a;
        AppCompatActivity appCompatActivity = weakReference.get();
        String str = hint.c;
        String str2 = hint.d;
        Map<String, String> map = hint.e;
        dw20 dw20Var = null;
        Drawable drawable = null;
        dw20Var = null;
        dw20Var = null;
        dw20Var = null;
        String str3 = map != null ? map.get("button_text") : null;
        if (appCompatActivity != null && str != null && str2 != null && str3 != null) {
            dw20.b j0 = new y7e0.a(appCompatActivity, new c8e0(d8e0Var, hint)).w0(str).s0(str2).j0(str3, new xm6(9, d8e0Var, yq1Var));
            e3m.a aVar = e3m.a;
            Drawable a = m33.a(R.drawable.vk_icon_cancel_20, context);
            if (a != null) {
                sjo.b(a, dhr0.t.c(R.attr.vk_ui_icon_secondary), PorterDuff.Mode.SRC_IN);
            } else {
                a = null;
            }
            dw20.b bVar = (dw20.b) j0.F(a, null);
            xa2 xa2Var = new xa2(f880Var, 9);
            bVar.getClass();
            bVar.d.Z0 = xa2Var;
            dw20.b b0 = bVar.b0(new b8e0(f880Var, 0));
            Drawable a2 = m33.a(R.drawable.vk_icon_error_outline_56, context);
            if (a2 != null) {
                sjo.b(a2, dhr0.t.c(R.attr.vk_ui_icon_warning), PorterDuff.Mode.SRC_IN);
                drawable = a2;
            }
            dw20Var = b0.N(drawable).E0(false).I0("getSecurityAuthRecommendations");
        }
        this.b = dw20Var;
    }

    @Override // xsna.a8e0
    public final boolean b() {
        dw20 dw20Var = this.b;
        return (dw20Var != null && dw20Var.isAdded()) || this.c != null;
    }

    @Override // xsna.a8e0
    public final void dismiss() {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        this.b = null;
        this.c = null;
    }
}
