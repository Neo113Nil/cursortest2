package defpackage;

import android.graphics.drawable.Drawable;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersPhotoRemoveButton;

/* loaded from: classes6.dex */
public final /* synthetic */ class lho0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersPhotoRemoveButton b;

    public /* synthetic */ lho0(ScootersPhotoRemoveButton scootersPhotoRemoveButton, int i) {
        this.a = i;
        this.b = scootersPhotoRemoveButton;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Drawable requireBackgroundDrawableWithTint;
        Drawable requireDrawableWithTint;
        Drawable requireBackgroundDrawableWithTint2;
        Drawable requireBackgroundDrawableWithTint3;
        int i = this.a;
        ScootersPhotoRemoveButton scootersPhotoRemoveButton = this.b;
        switch (i) {
            case 0:
                requireBackgroundDrawableWithTint = scootersPhotoRemoveButton.requireBackgroundDrawableWithTint(xng0.error);
                return requireBackgroundDrawableWithTint;
            case 1:
                return scootersPhotoRemoveButton.getContext().getString(kyh0.scooters_loading_error);
            case 2:
                requireDrawableWithTint = scootersPhotoRemoveButton.requireDrawableWithTint(q0h0.ic_scooters_error_bg_color, xng0.bgMain);
                return requireDrawableWithTint;
            case 3:
                requireBackgroundDrawableWithTint2 = scootersPhotoRemoveButton.requireBackgroundDrawableWithTint(xng0.bgMain);
                return requireBackgroundDrawableWithTint2;
            case 4:
                return scootersPhotoRemoveButton.getContext().getString(kyh0.scooters_remove);
            case 5:
                return tje.y(dzg0.ic_cross_close, scootersPhotoRemoveButton.getContext());
            case 6:
                requireBackgroundDrawableWithTint3 = scootersPhotoRemoveButton.requireBackgroundDrawableWithTint(xng0.bgMain);
                return requireBackgroundDrawableWithTint3;
            default:
                return scootersPhotoRemoveButton.getContext().getString(kyh0.scooters_loading);
        }
    }
}
