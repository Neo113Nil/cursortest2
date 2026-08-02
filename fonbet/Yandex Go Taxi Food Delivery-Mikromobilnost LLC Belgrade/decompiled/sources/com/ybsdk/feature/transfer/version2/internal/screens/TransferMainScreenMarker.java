package com.ybsdk.feature.transfer.version2.internal.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.offline.DownloadService;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/TransferMainScreenMarker;", "Lcom/ybsdk/core/navigation/cicerone/Screen;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getScreenKey", "()Ljava/lang/String;", "screenKey", "Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "getRequirements", "()Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", DownloadService.KEY_REQUIREMENTS, "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TransferMainScreenMarker implements Screen {
    public static final TransferMainScreenMarker INSTANCE = new TransferMainScreenMarker();
    public static final Parcelable.Creator<TransferMainScreenMarker> CREATOR = new Creator();

    private TransferMainScreenMarker() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ybsdk.core.navigation.cicerone.Screen
    public OpenScreenRequirement getRequirements() {
        return OpenScreenRequirement.WithoutRequirements.INSTANCE;
    }

    @Override // com.ybsdk.core.navigation.cicerone.Screen
    public String getScreenKey() {
        return "TransferMainScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(1);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferMainScreenMarker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferMainScreenMarker createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TransferMainScreenMarker.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferMainScreenMarker[] newArray(int i) {
            return new TransferMainScreenMarker[i];
        }
    }
}
