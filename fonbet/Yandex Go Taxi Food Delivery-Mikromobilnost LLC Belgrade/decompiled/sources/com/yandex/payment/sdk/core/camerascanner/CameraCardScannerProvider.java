package com.yandex.payment.sdk.core.camerascanner;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cp7;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/payment/sdk/core/camerascanner/CameraCardScannerProvider;", "Landroid/os/Parcelable;", "Landroidx/fragment/app/Fragment;", "fragment", "", UrbanAdsBottomSheetFragment.THEME_ID, "Lcp7;", "provide", "(Landroidx/fragment/app/Fragment;Ljava/lang/Integer;)Lcp7;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CameraCardScannerProvider extends Parcelable {
    static /* synthetic */ cp7 provide$default(CameraCardScannerProvider cameraCardScannerProvider, Fragment fragment, Integer num, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: provide");
            return null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return cameraCardScannerProvider.provide(fragment, num);
    }

    cp7 provide(Fragment fragment, Integer themeId);
}
