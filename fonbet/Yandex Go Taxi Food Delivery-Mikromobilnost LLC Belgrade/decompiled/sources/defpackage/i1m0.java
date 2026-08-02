package defpackage;

import android.view.View;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final /* synthetic */ class i1m0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ i1m0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean viewBinding$lambda$10$lambda$9;
        boolean onApplyInsets$lambda$12;
        BottomSheetDialogView.State showUnlock$lambda$34$lambda$32$lambda$31;
        rbv themeSelectionDelegate$lambda$9$lambda$8$lambda$6;
        zy11 onSelectionChange$lambda$10;
        boolean _init_$lambda$11;
        BottomSheetDialogView.State consumeSideEffect$lambda$35$lambda$32$lambda$31;
        g renderAccordingToViewState$lambda$20;
        stz0 render$lambda$10$lambda$9;
        int i = this.a;
        mun munVar = null;
        munVar = null;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return new j1m0((Map) obj);
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                boolean booleanValue = (obj2 != null ? (Boolean) obj2 : null).booleanValue();
                Object obj3 = list.get(1);
                boolean l = jl40.l(obj3, Boolean.FALSE);
                tig0 tig0Var = gu91.b;
                if (!l && obj3 != null) {
                    munVar = (mun) ((tls) tig0Var.b).invoke(obj3);
                }
                return new tvc0(munVar.a, booleanValue);
            case 2:
                return new mun(((Integer) obj).intValue());
            case 3:
                return new kgy(((Integer) obj).intValue());
            case 4:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int i2 = ((jl40.l(obj4, Boolean.FALSE) || obj4 == null) ? null : (sry0) ((tls) gu91.e.b).invoke(obj4)).a;
                Object obj5 = list2.get(1);
                return new try0(i2, (obj5 != null ? (Boolean) obj5 : null).booleanValue());
            case 5:
                return new sry0(((Integer) obj).intValue());
            case 6:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 7:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 8:
                return Boolean.valueOf(((Integer) obj).intValue() != 0);
            case 9:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 9));
                return zy11Var;
            case 10:
                viewBinding$lambda$10$lambda$9 = SavingsAccountFragment.getViewBinding$lambda$10$lambda$9(((Integer) obj).intValue());
                return Boolean.valueOf(viewBinding$lambda$10$lambda$9);
            case 11:
                onApplyInsets$lambda$12 = SavingsAccountFragment.onApplyInsets$lambda$12((View) obj);
                return Boolean.valueOf(onApplyInsets$lambda$12);
            case 12:
                showUnlock$lambda$34$lambda$32$lambda$31 = SavingsAccountFragment.showUnlock$lambda$34$lambda$32$lambda$31((BottomSheetDialogView.State) obj);
                return showUnlock$lambda$34$lambda$32$lambda$31;
            case 13:
                themeSelectionDelegate$lambda$9$lambda$8$lambda$6 = SavingsAccountThemeSelectorView.themeSelectionDelegate$lambda$9$lambda$8$lambda$6((String) obj);
                return themeSelectionDelegate$lambda$9$lambda$8$lambda$6;
            case 14:
                onSelectionChange$lambda$10 = SavingsAccountThemeSelectorView.onSelectionChange$lambda$10((s7m0) obj);
                return onSelectionChange$lambda$10;
            case 15:
                _init_$lambda$11 = SavingsAccountThemeSelectorView._init_$lambda$11(((Integer) obj).intValue());
                return Boolean.valueOf(_init_$lambda$11);
            case 16:
                return new pbv((String) obj, new ccv(txg0.ybsdk_ic_trash), rev.j, new ccv(txg0.ybsdk_ic_trash), (vfv) null, 48);
            case 17:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 18:
                return Boolean.valueOf(((kam0) obj).i);
            case 19:
                return ((kam0) obj).a;
            case 20:
                return new pbv((String) obj, (ccv) null, rev.h, new ccv(txg0.ybsdk_ic_product_deposit), (vfv) null, 50);
            case 21:
                return new pbv((String) obj, (ccv) null, rev.h, new ccv(txg0.ybsdk_ic_product_deposit), (vfv) null, 50);
            case 22:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 23:
                consumeSideEffect$lambda$35$lambda$32$lambda$31 = SbpPartnersFragment.consumeSideEffect$lambda$35$lambda$32$lambda$31((BottomSheetDialogView.State) obj);
                return consumeSideEffect$lambda$35$lambda$32$lambda$31;
            case 24:
                renderAccordingToViewState$lambda$20 = SbpPartnersFragment.renderAccordingToViewState$lambda$20((g) obj);
                return renderAccordingToViewState$lambda$20;
            case 25:
                render$lambda$10$lambda$9 = SbpPartnersFragment.render$lambda$10$lambda$9((stz0) obj);
                return render$lambda$10$lambda$9;
            case 26:
                return (String) obj;
            case 27:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.g = true;
                return zy11Var;
            case 28:
                return zy11Var;
            default:
                return Integer.valueOf(-((Integer) obj).intValue());
        }
    }
}
