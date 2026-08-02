package defpackage;

import android.view.View;
import com.ybsdk.feature.card.api.CardsSettingsTermParameter;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class mo8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardSettingsTermFragment b;

    public /* synthetic */ mo8(CardSettingsTermFragment cardSettingsTermFragment, int i) {
        this.a = i;
        this.b = cardSettingsTermFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        CardsSettingsTermParameter screenParams_delegate$lambda$0;
        View bottomSheetState$lambda$3;
        int i = this.a;
        CardSettingsTermFragment cardSettingsTermFragment = this.b;
        switch (i) {
            case 0:
                screenParams_delegate$lambda$0 = CardSettingsTermFragment.screenParams_delegate$lambda$0(cardSettingsTermFragment);
                return screenParams_delegate$lambda$0;
            default:
                bottomSheetState$lambda$3 = CardSettingsTermFragment.getBottomSheetState$lambda$3(cardSettingsTermFragment);
                return bottomSheetState$lambda$3;
        }
    }
}
