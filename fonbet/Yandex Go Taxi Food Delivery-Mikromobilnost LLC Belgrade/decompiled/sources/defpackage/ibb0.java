package defpackage;

import com.ybsdk.feature.pfm.internal.ui.PfmFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ibb0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PfmFragment b;

    public /* synthetic */ ibb0(PfmFragment pfmFragment, int i) {
        this.a = i;
        this.b = pfmFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 createBottomSheetDialog_fBvOVSU$lambda$25$lambda$24;
        zy11 onViewCreated$lambda$13$lambda$7;
        zy11 firstVisibleItemScrollListener$lambda$5;
        int i = this.a;
        PfmFragment pfmFragment = this.b;
        switch (i) {
            case 0:
                createBottomSheetDialog_fBvOVSU$lambda$25$lambda$24 = PfmFragment.createBottomSheetDialog_fBvOVSU$lambda$25$lambda$24(pfmFragment, ((Boolean) obj).booleanValue());
                return createBottomSheetDialog_fBvOVSU$lambda$25$lambda$24;
            case 1:
                onViewCreated$lambda$13$lambda$7 = PfmFragment.onViewCreated$lambda$13$lambda$7(pfmFragment, (tb6) obj);
                return onViewCreated$lambda$13$lambda$7;
            default:
                firstVisibleItemScrollListener$lambda$5 = PfmFragment.firstVisibleItemScrollListener$lambda$5(pfmFragment, ((Integer) obj).intValue());
                return firstVisibleItemScrollListener$lambda$5;
        }
    }
}
