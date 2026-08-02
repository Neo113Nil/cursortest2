package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;

/* loaded from: classes14.dex */
public final class cn40 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffTrailView b;

    public /* synthetic */ cn40(TariffTrailView tariffTrailView, int i) {
        this.a = i;
        this.b = tariffTrailView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        CharSequence charSequence;
        String str;
        jq40 jq40Var;
        int i = this.a;
        TariffTrailView tariffTrailView = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.CheckBox");
                whVar.m(true);
                whVar.n(tariffTrailView.getIsChecked() ? 1 : 0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                StringBuilder sb = new StringBuilder();
                charSequence = tariffTrailView.contentDescription;
                if (charSequence == null) {
                    jq40Var = tariffTrailView.binding;
                    charSequence = jq40Var.f.getText();
                }
                tariffTrailView.appendContentDescription(sb, charSequence);
                str = tariffTrailView.cashBackValue;
                tariffTrailView.appendContentDescription(sb, tfe.a(str, new hh8(9, tariffTrailView), new w29(tariffTrailView, 0)));
                whVar.t(sb.toString());
                break;
        }
    }
}
