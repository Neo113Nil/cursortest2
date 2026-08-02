package defpackage;

import android.view.View;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalView;

/* loaded from: classes2.dex */
public final /* synthetic */ class fwb implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ fwb(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                CitySuggestDialogModalView.onDetachedFromWindow$lambda$0(view, z);
                break;
            default:
                int i = scq0.Z;
                break;
        }
    }
}
