package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView;

/* loaded from: classes2.dex */
public final /* synthetic */ class lg8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ lg8(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean createNextActionListener$lambda$40;
        boolean createNextActionListener$lambda$0;
        int i2 = this.a;
        sls slsVar = this.b;
        switch (i2) {
            case 0:
                createNextActionListener$lambda$40 = CardInputMainView.createNextActionListener$lambda$40(slsVar, textView, i, keyEvent);
                return createNextActionListener$lambda$40;
            default:
                createNextActionListener$lambda$0 = CardInputView.createNextActionListener$lambda$0(slsVar, textView, i, keyEvent);
                return createNextActionListener$lambda$0;
        }
    }
}
