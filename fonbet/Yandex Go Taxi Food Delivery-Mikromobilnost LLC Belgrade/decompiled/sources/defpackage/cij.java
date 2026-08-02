package defpackage;

import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class cij implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DiffRateCalendarFragment b;

    public /* synthetic */ cij(DiffRateCalendarFragment diffRateCalendarFragment, int i) {
        this.a = i;
        this.b = diffRateCalendarFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$6$lambda$3;
        zy11 onViewCreated$lambda$6$lambda$4;
        zy11 viewBinding$lambda$9$lambda$7;
        int i = this.a;
        DiffRateCalendarFragment diffRateCalendarFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$6$lambda$3 = DiffRateCalendarFragment.onViewCreated$lambda$6$lambda$3(diffRateCalendarFragment, (String) obj);
                return onViewCreated$lambda$6$lambda$3;
            case 1:
                onViewCreated$lambda$6$lambda$4 = DiffRateCalendarFragment.onViewCreated$lambda$6$lambda$4(diffRateCalendarFragment, ((Integer) obj).intValue());
                return onViewCreated$lambda$6$lambda$4;
            default:
                viewBinding$lambda$9$lambda$7 = DiffRateCalendarFragment.getViewBinding$lambda$9$lambda$7(diffRateCalendarFragment, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$9$lambda$7;
        }
    }
}
