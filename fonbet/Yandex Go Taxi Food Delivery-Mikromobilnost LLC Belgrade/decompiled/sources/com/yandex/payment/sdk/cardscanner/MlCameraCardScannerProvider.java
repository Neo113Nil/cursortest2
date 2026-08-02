package com.yandex.payment.sdk.cardscanner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.yandex.payment.sdk.core.camerascanner.CameraCardScannerProvider;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cp7;
import defpackage.lg;
import defpackage.y0i0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/payment/sdk/cardscanner/MlCameraCardScannerProvider;", "Lcom/yandex/payment/sdk/core/camerascanner/CameraCardScannerProvider;", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "", UrbanAdsBottomSheetFragment.THEME_ID, "Lcp7;", "provide", "(Landroidx/fragment/app/Fragment;Ljava/lang/Integer;)Lcp7;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cardscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MlCameraCardScannerProvider implements CameraCardScannerProvider {
    public static final Parcelable.Creator<MlCameraCardScannerProvider> CREATOR = new Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.payment.sdk.core.camerascanner.CameraCardScannerProvider
    public cp7 provide(Fragment fragment, Integer themeId) {
        return new lg(fragment, themeId != null ? themeId.intValue() : y0i0.PaymentsdkYaTheme_CardScanner);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(1);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MlCameraCardScannerProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MlCameraCardScannerProvider createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new MlCameraCardScannerProvider();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MlCameraCardScannerProvider[] newArray(int i) {
            return new MlCameraCardScannerProvider[i];
        }
    }
}
