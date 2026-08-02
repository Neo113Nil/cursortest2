package defpackage;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;

/* loaded from: classes2.dex */
public final class fy20 extends ModalViewBehavior.a {
    public final /* synthetic */ ModalContentViewContainer a;

    public fy20(ModalContentViewContainer modalContentViewContainer) {
        this.a = modalContentViewContainer;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior.a
    public final void a(int i) {
        gje gjeVar;
        gje gjeVar2;
        gje gjeVar3;
        gje gjeVar4;
        sls slsVar;
        ModalContentViewContainer modalContentViewContainer = this.a;
        switch (i) {
            case 1:
                gjeVar = modalContentViewContainer.viewHolder;
                gjeVar.onModalHide();
                break;
            case 2:
                gjeVar2 = modalContentViewContainer.viewHolder;
                gjeVar2.onModalHide();
                break;
            case 3:
                gjeVar3 = modalContentViewContainer.viewHolder;
                gjeVar3.onModalExpanded();
                break;
            case 4:
            case 6:
                modalContentViewContainer.behavior.C(3);
                break;
            case 5:
                gjeVar4 = modalContentViewContainer.viewHolder;
                gjeVar4.onModalHide();
                slsVar = modalContentViewContainer.onHidden;
                slsVar.invoke();
                break;
        }
    }
}
