package defpackage;

import android.os.Bundle;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class pd8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardDetailsFragment b;

    public /* synthetic */ pd8(CardDetailsFragment cardDetailsFragment, int i) {
        this.a = i;
        this.b = cardDetailsFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onViewCreated$lambda$31;
        boolean z;
        int i = this.a;
        CardDetailsFragment cardDetailsFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$31 = CardDetailsFragment.onViewCreated$lambda$31(cardDetailsFragment, (String) obj, (Bundle) obj2);
                return onViewCreated$lambda$31;
            default:
                z = CardDetailsFragment.settingsAdapter$lambda$0(cardDetailsFragment, (g9r0) obj, ((Boolean) obj2).booleanValue());
                return Boolean.valueOf(z);
        }
    }
}
