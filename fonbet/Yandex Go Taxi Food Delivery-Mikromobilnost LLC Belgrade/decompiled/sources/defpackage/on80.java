package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes13.dex */
public final class on80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrganizationsListV2ModalView b;

    public /* synthetic */ on80(OrganizationsListV2ModalView organizationsListV2ModalView, int i) {
        this.a = i;
        this.b = organizationsListV2ModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View content;
        int i;
        t1w currentInsets;
        jsj jsjVar;
        int minItemsContainerHeight;
        int i2 = this.a;
        OrganizationsListV2ModalView organizationsListV2ModalView = this.b;
        switch (i2) {
            case 0:
                content = organizationsListV2ModalView.getContent();
                int height = content.getHeight();
                i = ((SlideableModalView) organizationsListV2ModalView).topSystemWindowInset;
                int i3 = height - i;
                currentInsets = organizationsListV2ModalView.getCurrentInsets();
                organizationsListV2ModalView.minItemsContainerHeight = i3 - currentInsets.d;
                jsjVar = organizationsListV2ModalView.flexContentContainer;
                ViewGroup.LayoutParams layoutParams = jsjVar.a.getLayoutParams();
                minItemsContainerHeight = organizationsListV2ModalView.getMinItemsContainerHeight();
                layoutParams.height = minItemsContainerHeight;
                break;
            default:
                int width = organizationsListV2ModalView.getCardContainer().getWidth();
                if (width > 0) {
                    organizationsListV2ModalView.getPresenter().l0.T(Long.valueOf((long) vez0.R(width, Resources.getSystem().getDisplayMetrics())));
                    break;
                }
                break;
        }
    }
}
