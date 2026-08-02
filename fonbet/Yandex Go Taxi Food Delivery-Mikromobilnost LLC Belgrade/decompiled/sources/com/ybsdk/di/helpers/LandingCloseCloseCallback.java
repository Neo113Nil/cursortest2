package com.ybsdk.di.helpers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.YBSdk;
import com.ybsdk.feature.webview.api.WebViewCloseCallback;
import defpackage.x8g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/di/helpers/LandingCloseCloseCallback;", "Lcom/ybsdk/feature/webview/api/WebViewCloseCallback;", "<init>", "()V", "Lzy11;", "onCloseCallback", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LandingCloseCloseCallback implements WebViewCloseCallback {
    public static final LandingCloseCloseCallback INSTANCE = new LandingCloseCloseCallback();
    public static final Parcelable.Creator<LandingCloseCloseCallback> CREATOR = new Creator();

    private LandingCloseCloseCallback() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ybsdk.feature.webview.api.WebViewCloseCallback
    public void onCloseCallback() {
        ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).d().k.a.a("card_landing.close", null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(1);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LandingCloseCloseCallback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LandingCloseCloseCallback createFromParcel(Parcel parcel) {
            parcel.readInt();
            return LandingCloseCloseCallback.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LandingCloseCloseCallback[] newArray(int i) {
            return new LandingCloseCloseCallback[i];
        }
    }
}
