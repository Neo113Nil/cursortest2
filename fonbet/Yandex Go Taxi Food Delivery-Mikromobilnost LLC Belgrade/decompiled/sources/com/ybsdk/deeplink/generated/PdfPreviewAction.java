package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\u0013R \u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/ybsdk/deeplink/generated/PdfPreviewAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "url", "", "isSharingEnabled", "fileName", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/ybsdk/deeplink/generated/PdfPreviewAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Z", "getFileName", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PdfPreviewAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<PdfPreviewAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String fileName;
    private final boolean isSharingEnabled;
    private final String url;

    public PdfPreviewAction(String str, boolean z, String str2) {
        this.url = str;
        this.isSharingEnabled = z;
        this.fileName = str2;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/pdf_preview", "url", str);
        j.appendQueryParameter("is_sharing_enabled", String.valueOf(z));
        if (str2 != null) {
            j.appendQueryParameter("file_name", str2);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ PdfPreviewAction copy$default(PdfPreviewAction pdfPreviewAction, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfPreviewAction.url;
        }
        if ((i & 2) != 0) {
            z = pdfPreviewAction.isSharingEnabled;
        }
        if ((i & 4) != 0) {
            str2 = pdfPreviewAction.fileName;
        }
        return pdfPreviewAction.copy(str, z, str2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSharingEnabled() {
        return this.isSharingEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public final PdfPreviewAction copy(String url, boolean isSharingEnabled, String fileName) {
        return new PdfPreviewAction(url, isSharingEnabled, fileName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfPreviewAction)) {
            return false;
        }
        PdfPreviewAction pdfPreviewAction = (PdfPreviewAction) other;
        return jl40.l(this.url, pdfPreviewAction.url) && this.isSharingEnabled == pdfPreviewAction.isSharingEnabled && jl40.l(this.fileName, pdfPreviewAction.fileName);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int e = unr0.e(this.url.hashCode() * 31, 31, this.isSharingEnabled);
        String str = this.fileName;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSharingEnabled() {
        return this.isSharingEnabled;
    }

    public String toString() {
        String str = this.url;
        boolean z = this.isSharingEnabled;
        return oyr.t(oo31.l("PdfPreviewAction(url=", str, ", isSharingEnabled=", ", fileName=", z), this.fileName, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeInt(this.isSharingEnabled ? 1 : 0);
        dest.writeString(this.fileName);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PdfPreviewAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PdfPreviewAction createFromParcel(Parcel parcel) {
            return new PdfPreviewAction(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PdfPreviewAction[] newArray(int i) {
            return new PdfPreviewAction[i];
        }
    }

    public /* synthetic */ PdfPreviewAction(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }
}
