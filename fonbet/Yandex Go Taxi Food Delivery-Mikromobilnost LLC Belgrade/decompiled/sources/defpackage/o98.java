package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeFragment;
import com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueFragment;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingFragment;

/* loaded from: classes3.dex */
public final class o98 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final owf c;

    public /* synthetic */ o98(n3w n3wVar, owf owfVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = owfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        owf owfVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new CardActivationFragment((fa8) n3wVar.a, (qn8) owfVar.get());
            case 1:
                return new CardDeletionFragment((bd8) n3wVar.a, (qn8) owfVar.get());
            case 2:
                return new CardLimitFragment((mi8) n3wVar.a, (qn8) owfVar.get());
            case 3:
                return new CardPinCodeFragment((ul8) n3wVar.a, (qn8) owfVar.get());
            case 4:
                return new CardReissueFragment((om8) n3wVar.a, (qn8) owfVar.get());
            default:
                return new CardSetStatusProcessingFragment((do8) n3wVar.a, (qn8) owfVar.get());
        }
    }
}
