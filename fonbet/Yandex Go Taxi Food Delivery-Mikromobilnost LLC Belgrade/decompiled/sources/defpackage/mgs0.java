package defpackage;

import android.os.Bundle;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class mgs0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SingleCardFragment b;

    public /* synthetic */ mgs0(SingleCardFragment singleCardFragment, int i) {
        this.a = i;
        this.b = singleCardFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 cardAdditionalAdapter$lambda$14;
        zy11 zy11Var;
        boolean managementAdapter$lambda$5;
        zy11 managementAdapter$lambda$9;
        zy11 onViewCreated$lambda$15;
        boolean z;
        boolean cardAdditionalAdapter$lambda$10;
        int i = this.a;
        SingleCardFragment singleCardFragment = this.b;
        switch (i) {
            case 0:
                cardAdditionalAdapter$lambda$14 = SingleCardFragment.cardAdditionalAdapter$lambda$14(singleCardFragment, (String) obj, ((Boolean) obj2).booleanValue());
                return cardAdditionalAdapter$lambda$14;
            case 1:
                zy11Var = SingleCardFragment.settingsAdapter$lambda$4(singleCardFragment, (String) obj, ((Boolean) obj2).booleanValue());
                return zy11Var;
            case 2:
                managementAdapter$lambda$5 = SingleCardFragment.managementAdapter$lambda$5(singleCardFragment, (g9r0) obj, ((Boolean) obj2).booleanValue());
                return Boolean.valueOf(managementAdapter$lambda$5);
            case 3:
                managementAdapter$lambda$9 = SingleCardFragment.managementAdapter$lambda$9(singleCardFragment, (String) obj, ((Boolean) obj2).booleanValue());
                return managementAdapter$lambda$9;
            case 4:
                onViewCreated$lambda$15 = SingleCardFragment.onViewCreated$lambda$15(singleCardFragment, (String) obj, (Bundle) obj2);
                return onViewCreated$lambda$15;
            case 5:
                z = SingleCardFragment.settingsAdapter$lambda$0(singleCardFragment, (g9r0) obj, ((Boolean) obj2).booleanValue());
                return Boolean.valueOf(z);
            default:
                cardAdditionalAdapter$lambda$10 = SingleCardFragment.cardAdditionalAdapter$lambda$10(singleCardFragment, (g9r0) obj, ((Boolean) obj2).booleanValue());
                return Boolean.valueOf(cardAdditionalAdapter$lambda$10);
        }
    }
}
