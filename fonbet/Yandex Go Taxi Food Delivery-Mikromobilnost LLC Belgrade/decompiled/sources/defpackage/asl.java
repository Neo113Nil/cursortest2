package defpackage;

import com.ybsdk.feature.status.screen.internal.ui.DivkitCommonFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class asl implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DivkitCommonFragment b;

    public /* synthetic */ asl(DivkitCommonFragment divkitCommonFragment, int i) {
        this.a = i;
        this.b = divkitCommonFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderEducationV2$lambda$15$lambda$14$lambda$13;
        zy11 viewBinding$lambda$3$lambda$1;
        zy11 viewBinding$lambda$3$lambda$2;
        int i = this.a;
        DivkitCommonFragment divkitCommonFragment = this.b;
        switch (i) {
            case 0:
                renderEducationV2$lambda$15$lambda$14$lambda$13 = DivkitCommonFragment.renderEducationV2$lambda$15$lambda$14$lambda$13(divkitCommonFragment);
                return renderEducationV2$lambda$15$lambda$14$lambda$13;
            case 1:
                viewBinding$lambda$3$lambda$1 = DivkitCommonFragment.getViewBinding$lambda$3$lambda$1(divkitCommonFragment);
                return viewBinding$lambda$3$lambda$1;
            default:
                viewBinding$lambda$3$lambda$2 = DivkitCommonFragment.getViewBinding$lambda$3$lambda$2(divkitCommonFragment);
                return viewBinding$lambda$3$lambda$2;
        }
    }
}
