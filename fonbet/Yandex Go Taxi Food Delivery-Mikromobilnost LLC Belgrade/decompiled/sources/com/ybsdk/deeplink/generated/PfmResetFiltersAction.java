package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.vfc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/deeplink/generated/PfmResetFiltersAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResetFiltersAction implements BaseDeeplinkAction {
    public static final PfmResetFiltersAction INSTANCE = new PfmResetFiltersAction();
    private static final Uri deeplinkUri = vfc.m("ybapp", "screen.open", "/pfm_reset_filters");
    public static final Parcelable.Creator<PfmResetFiltersAction> CREATOR = new Creator();

    private PfmResetFiltersAction() {
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return deeplinkUri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(1);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PfmResetFiltersAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PfmResetFiltersAction createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PfmResetFiltersAction.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PfmResetFiltersAction[] newArray(int i) {
            return new PfmResetFiltersAction[i];
        }
    }
}
