package defpackage;

import android.net.Uri;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class lgs0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SingleCardFragment b;

    public /* synthetic */ lgs0(SingleCardFragment singleCardFragment, int i) {
        this.a = i;
        this.b = singleCardFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 cardAdditionalAdapter$lambda$12;
        zy11 cardAdditionalAdapter$lambda$13;
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 managementAdapter$lambda$7;
        zy11 managementAdapter$lambda$8;
        zy11 onCreate$lambda$17;
        boolean z;
        int i = this.a;
        SingleCardFragment singleCardFragment = this.b;
        switch (i) {
            case 0:
                cardAdditionalAdapter$lambda$12 = SingleCardFragment.cardAdditionalAdapter$lambda$12(singleCardFragment, (z8r0) obj);
                return cardAdditionalAdapter$lambda$12;
            case 1:
                cardAdditionalAdapter$lambda$13 = SingleCardFragment.cardAdditionalAdapter$lambda$13(singleCardFragment, (String) obj);
                return cardAdditionalAdapter$lambda$13;
            case 2:
                zy11Var = SingleCardFragment.settingsAdapter$lambda$2(singleCardFragment, (z8r0) obj);
                return zy11Var;
            case 3:
                zy11Var2 = SingleCardFragment.settingsAdapter$lambda$3(singleCardFragment, (String) obj);
                return zy11Var2;
            case 4:
                managementAdapter$lambda$7 = SingleCardFragment.managementAdapter$lambda$7(singleCardFragment, (z8r0) obj);
                return managementAdapter$lambda$7;
            case 5:
                managementAdapter$lambda$8 = SingleCardFragment.managementAdapter$lambda$8(singleCardFragment, (String) obj);
                return managementAdapter$lambda$8;
            case 6:
                onCreate$lambda$17 = SingleCardFragment.onCreate$lambda$17(singleCardFragment, (String) obj);
                return onCreate$lambda$17;
            default:
                z = SingleCardFragment.setupClickListeners$lambda$28$lambda$27(singleCardFragment, (Uri) obj);
                return Boolean.valueOf(z);
        }
    }
}
