package defpackage;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import flex.feature.document.fragment.DocumentBottomSheetFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class ivg implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ ivg(BottomSheetDialogFragment bottomSheetDialogFragment, int i) {
        this.a = i;
        this.b = bottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.a;
        BottomSheetDialogFragment bottomSheetDialogFragment = this.b;
        switch (i) {
            case 0:
                DebugMenuDialogFragment.onCreateDialog$lambda$4((DebugMenuDialogFragment) bottomSheetDialogFragment, dialogInterface);
                break;
            case 1:
                DocumentBottomSheetFragment.onCreateView$lambda$6$lambda$4((DocumentBottomSheetFragment) bottomSheetDialogFragment, dialogInterface);
                break;
            default:
                UrbanAdsBottomSheetFragment.onViewCreated$lambda$7((UrbanAdsBottomSheetFragment) bottomSheetDialogFragment, dialogInterface);
                break;
        }
    }
}
