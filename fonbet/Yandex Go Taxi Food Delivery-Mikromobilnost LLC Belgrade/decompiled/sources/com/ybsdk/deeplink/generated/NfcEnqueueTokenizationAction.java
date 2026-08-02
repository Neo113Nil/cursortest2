package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.nzs;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R \u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/ybsdk/deeplink/generated/NfcEnqueueTokenizationAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "wipeData", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "copy", "(Z)Lcom/ybsdk/deeplink/generated/NfcEnqueueTokenizationAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWipeData", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcEnqueueTokenizationAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<NfcEnqueueTokenizationAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final boolean wipeData;

    public NfcEnqueueTokenizationAction(boolean z) {
        this.wipeData = z;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/nfc_enqueue_tokenization");
        l.appendQueryParameter("wipe_data", String.valueOf(z));
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ NfcEnqueueTokenizationAction copy$default(NfcEnqueueTokenizationAction nfcEnqueueTokenizationAction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcEnqueueTokenizationAction.wipeData;
        }
        return nfcEnqueueTokenizationAction.copy(z);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWipeData() {
        return this.wipeData;
    }

    public final NfcEnqueueTokenizationAction copy(boolean wipeData) {
        return new NfcEnqueueTokenizationAction(wipeData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NfcEnqueueTokenizationAction) && this.wipeData == ((NfcEnqueueTokenizationAction) other).wipeData;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final boolean getWipeData() {
        return this.wipeData;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wipeData);
    }

    public String toString() {
        return nzs.b("NfcEnqueueTokenizationAction(wipeData=", Extension.C_BRAKE, this.wipeData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.wipeData ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcEnqueueTokenizationAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NfcEnqueueTokenizationAction createFromParcel(Parcel parcel) {
            return new NfcEnqueueTokenizationAction(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NfcEnqueueTokenizationAction[] newArray(int i) {
            return new NfcEnqueueTokenizationAction[i];
        }
    }

    public NfcEnqueueTokenizationAction() {
        this(false, 1, null);
    }

    public /* synthetic */ NfcEnqueueTokenizationAction(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
