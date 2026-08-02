package defpackage;

import android.net.Uri;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class no8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardSettingsTermFragment b;

    public /* synthetic */ no8(CardSettingsTermFragment cardSettingsTermFragment, int i) {
        this.a = i;
        this.b = cardSettingsTermFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean bottomSheetState$lambda$6$lambda$5$lambda$4;
        zy11 initBottomSheet$lambda$2$lambda$1;
        int i = this.a;
        CardSettingsTermFragment cardSettingsTermFragment = this.b;
        switch (i) {
            case 0:
                bottomSheetState$lambda$6$lambda$5$lambda$4 = CardSettingsTermFragment.getBottomSheetState$lambda$6$lambda$5$lambda$4(cardSettingsTermFragment, (Uri) obj);
                return Boolean.valueOf(bottomSheetState$lambda$6$lambda$5$lambda$4);
            default:
                initBottomSheet$lambda$2$lambda$1 = CardSettingsTermFragment.initBottomSheet$lambda$2$lambda$1(cardSettingsTermFragment, ((Boolean) obj).booleanValue());
                return initBottomSheet$lambda$2$lambda$1;
        }
    }
}
