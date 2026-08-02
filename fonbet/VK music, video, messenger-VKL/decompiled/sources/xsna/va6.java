package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import io.jsonwebtoken.JwtParser;

/* compiled from: BaseCheckMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public final class va6 extends hk {
    public final /* synthetic */ wa6<p0c<?>> b;

    public va6(wa6<p0c<?>> wa6Var) {
        this.b = wa6Var;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        wa6<p0c<?>> wa6Var = this.b;
        TextView textView = wa6Var.x;
        if (textView == null) {
            textView = null;
        }
        if (textView.getVisibility() == 0) {
            TextView textView2 = wa6Var.x;
            if (textView2 == null) {
                textView2 = null;
            }
            if (myc0.f(textView2.getText())) {
                TextView textView3 = wa6Var.x;
                if (textView3 == null) {
                    textView3 = null;
                }
                String valueOf = String.valueOf(textView3.getText());
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = wa6Var.y;
                if (his0.s(vkAuthErrorStatedEditText != null ? vkAuthErrorStatedEditText : null)) {
                    StringBuilder b = v1v.b(valueOf, JwtParser.SEPARATOR_CHAR);
                    b.append((Object) amVar.h());
                    amVar.A(b.toString());
                }
            }
        }
    }
}
