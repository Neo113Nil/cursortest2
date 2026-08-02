package defpackage;

import android.view.View;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;

/* loaded from: classes4.dex */
public final /* synthetic */ class njb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ njb(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
            case 1:
                slsVar.invoke();
                break;
            case 2:
                slsVar.invoke();
                break;
            case 3:
                slsVar.invoke();
                break;
            case 4:
                slsVar.invoke();
                break;
            case 5:
                ErrorView.setPrimaryButtonOnClickListener$lambda$7(slsVar, view);
                break;
            case 6:
                ErrorView.setPrimaryButtonOnClickListener$lambda$8(slsVar, view);
                break;
            case 7:
                ErrorView.setCloseButtonClickListener$lambda$10(slsVar, view);
                break;
            case 8:
                ErrorView.setSecondaryButtonClickListener$lambda$9(slsVar, view);
                break;
            case 9:
                FullscreenStatusView.setCloseButtonAction$lambda$13(slsVar, view);
                break;
            case 10:
                slsVar.invoke();
                break;
            case 11:
                slsVar.invoke();
                break;
            case 12:
                slsVar.invoke();
                break;
            case 13:
                ImageToolbarView.setOnCloseButtonClickListener$lambda$3(slsVar, view);
                break;
            case 14:
                slsVar.invoke();
                break;
            case 15:
                slsVar.invoke();
                break;
            case 16:
                slsVar.invoke();
                break;
            case 17:
                slsVar.invoke();
                break;
            case 18:
                slsVar.invoke();
                break;
            case 19:
                slsVar.invoke();
                break;
            case 20:
                slsVar.invoke();
                break;
            case 21:
                slsVar.invoke();
                break;
            case 22:
                slsVar.invoke();
                break;
            case 23:
                slsVar.invoke();
                break;
            case 24:
                slsVar.invoke();
                break;
            case 25:
                slsVar.invoke();
                break;
            case 26:
                slsVar.invoke();
                break;
            case 27:
                slsVar.invoke();
                break;
            case 28:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
    }
}
