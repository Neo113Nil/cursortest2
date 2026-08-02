package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersPhotoRemoveButton;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final /* synthetic */ class mi00 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ pav c;

    public /* synthetic */ mi00(tls tlsVar, pav pavVar) {
        this.b = tlsVar;
        this.c = pavVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pav pavVar = this.c;
        tls tlsVar = this.b;
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        switch (i) {
            case 0:
                View inflate = layoutInflater.inflate(uuh0.tab_bar_map_filter_item, viewGroup, false);
                int i2 = o6h0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                if (goImageView != null) {
                    i2 = o6h0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                break;
            default:
                View inflate2 = layoutInflater.inflate(qrh0.scooters_photo_on_comment_item, viewGroup, false);
                int i3 = pfh0.image_view;
                GoImageView goImageView2 = (GoImageView) cma1.O(i3, inflate2);
                if (goImageView2 != null) {
                    i3 = pfh0.remove_button;
                    ScootersPhotoRemoveButton scootersPhotoRemoveButton = (ScootersPhotoRemoveButton) cma1.O(i3, inflate2);
                    if (scootersPhotoRemoveButton != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                break;
        }
        return null;
    }

    public /* synthetic */ mi00(pav pavVar, tls tlsVar) {
        this.c = pavVar;
        this.b = tlsVar;
    }
}
