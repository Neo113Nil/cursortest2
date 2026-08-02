package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.keyboard.delegators.KeyboardImageView;

/* loaded from: classes4.dex */
public final /* synthetic */ class fkx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyboardImageView b;

    public /* synthetic */ fkx(KeyboardImageView keyboardImageView, int i) {
        this.a = i;
        this.b = keyboardImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyboardImageView keyboardImageView = this.b;
        switch (i) {
            case 0:
                KeyboardImageView.renderBiometricButton$lambda$1(keyboardImageView, view);
                break;
            default:
                KeyboardImageView.renderBackButton$lambda$2(keyboardImageView, view);
                break;
        }
    }
}
