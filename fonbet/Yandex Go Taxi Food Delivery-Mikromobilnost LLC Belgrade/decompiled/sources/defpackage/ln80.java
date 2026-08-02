package defpackage;

import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ln80 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrganizationsListV2ModalView b;

    public /* synthetic */ ln80(OrganizationsListV2ModalView organizationsListV2ModalView, int i) {
        this.a = i;
        this.b = organizationsListV2ModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onAttachedToWindow$lambda$1;
        zy11 organizationsListFilterButtonView_delegate$lambda$0$0;
        int i = this.a;
        OrganizationsListV2ModalView organizationsListV2ModalView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$1 = OrganizationsListV2ModalView.onAttachedToWindow$lambda$1(organizationsListV2ModalView);
                return onAttachedToWindow$lambda$1;
            default:
                organizationsListFilterButtonView_delegate$lambda$0$0 = OrganizationsListV2ModalView.organizationsListFilterButtonView_delegate$lambda$0$0(organizationsListV2ModalView);
                return organizationsListFilterButtonView_delegate$lambda$0$0;
        }
    }
}
