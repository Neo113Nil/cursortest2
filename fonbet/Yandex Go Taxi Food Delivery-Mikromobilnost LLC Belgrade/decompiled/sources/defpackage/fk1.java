package defpackage;

import android.widget.ImageView;
import com.yandex.go.agreement.simple.ui.AgreementModalView;
import com.yandex.go.places.impl.ui.organizations.buttons.OrganizationActionButtonComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class fk1 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ fk1(ImageView imageView, int i) {
        this.a = i;
        this.b = imageView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 loadImage$lambda$0;
        zy11 createIconView$lambda$0$0;
        int i = this.a;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                loadImage$lambda$0 = AgreementModalView.loadImage$lambda$0(imageView);
                return loadImage$lambda$0;
            default:
                createIconView$lambda$0$0 = OrganizationActionButtonComponent.createIconView$lambda$0$0(imageView);
                return createIconView$lambda$0$0;
        }
    }
}
