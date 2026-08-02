package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: PostingCtaAttachChoiceBottomSheetDelegate.kt */
/* loaded from: classes4.dex */
public final class wdc0 {
    public final rsx a;
    public final n7b0 b;
    public dw20 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final ComposeView e;

    public wdc0(cf00 cf00Var, b290 b290Var, rsx rsxVar, n7b0 n7b0Var) {
        this.a = rsxVar;
        this.b = n7b0Var;
        ComposeView composeView = new ComposeView((Context) cf00Var.invoke(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setContent(new jai(-1837117907, new jkg(this, 12), true));
        this.e = composeView;
    }
}
