package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSaveSettings;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "Landroid/net/Uri;", "deeplinkUri", "Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupApiVersion;", "apiVersion", "<init>", "(Landroid/net/Uri;Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupApiVersion;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "()Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupApiVersion;", "copy", "(Landroid/net/Uri;Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupApiVersion;)Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSaveSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDeeplinkUri", "Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupApiVersion;", "getApiVersion", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSaveSettings implements BaseDeeplinkAction {
    public static final Parcelable.Creator<AutoTopupSaveSettings> CREATOR = new Creator();
    private final AutoTopupApiVersion apiVersion;
    private final Uri deeplinkUri;

    public AutoTopupSaveSettings(Uri uri, AutoTopupApiVersion autoTopupApiVersion) {
        this.deeplinkUri = uri;
        this.apiVersion = autoTopupApiVersion;
    }

    public static /* synthetic */ AutoTopupSaveSettings copy$default(AutoTopupSaveSettings autoTopupSaveSettings, Uri uri, AutoTopupApiVersion autoTopupApiVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = autoTopupSaveSettings.deeplinkUri;
        }
        if ((i & 2) != 0) {
            autoTopupApiVersion = autoTopupSaveSettings.apiVersion;
        }
        return autoTopupSaveSettings.copy(uri, autoTopupApiVersion);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupApiVersion getApiVersion() {
        return this.apiVersion;
    }

    public final AutoTopupSaveSettings copy(Uri deeplinkUri, AutoTopupApiVersion apiVersion) {
        return new AutoTopupSaveSettings(deeplinkUri, apiVersion);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSaveSettings)) {
            return false;
        }
        AutoTopupSaveSettings autoTopupSaveSettings = (AutoTopupSaveSettings) other;
        return jl40.l(this.deeplinkUri, autoTopupSaveSettings.deeplinkUri) && this.apiVersion == autoTopupSaveSettings.apiVersion;
    }

    public final AutoTopupApiVersion getApiVersion() {
        return this.apiVersion;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public int hashCode() {
        return this.apiVersion.hashCode() + (this.deeplinkUri.hashCode() * 31);
    }

    public String toString() {
        return "AutoTopupSaveSettings(deeplinkUri=" + this.deeplinkUri + ", apiVersion=" + this.apiVersion + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplinkUri, flags);
        dest.writeString(this.apiVersion.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoTopupSaveSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupSaveSettings createFromParcel(Parcel parcel) {
            return new AutoTopupSaveSettings((Uri) parcel.readParcelable(AutoTopupSaveSettings.class.getClassLoader()), AutoTopupApiVersion.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupSaveSettings[] newArray(int i) {
            return new AutoTopupSaveSettings[i];
        }
    }
}
