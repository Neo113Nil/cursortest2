package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0015R \u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/ybsdk/deeplink/generated/SnackbarAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "text", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/deeplink/generated/SnackbarAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getDescription", "Ljava/lang/Integer;", "getDuration", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SnackbarAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SnackbarAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String description;
    private final Integer duration;
    private final String text;

    public SnackbarAction(String str, String str2, Integer num) {
        this.text = str;
        this.description = str2;
        this.duration = num;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/snackbar", "text", str);
        if (str2 != null) {
            j.appendQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        }
        if (num != null) {
            j.appendQueryParameter("duration", String.valueOf(num.intValue()));
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ SnackbarAction copy$default(SnackbarAction snackbarAction, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = snackbarAction.text;
        }
        if ((i & 2) != 0) {
            str2 = snackbarAction.description;
        }
        if ((i & 4) != 0) {
            num = snackbarAction.duration;
        }
        return snackbarAction.copy(str, str2, num);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    public final SnackbarAction copy(String text, String description, Integer duration) {
        return new SnackbarAction(text, description, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnackbarAction)) {
            return false;
        }
        SnackbarAction snackbarAction = (SnackbarAction) other;
        return jl40.l(this.text, snackbarAction.text) && jl40.l(this.description, snackbarAction.description) && jl40.l(this.duration, snackbarAction.duration);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.duration;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.description;
        return oo31.j(b64.v("SnackbarAction(text=", str, ", description=", str2, ", duration="), this.duration, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.description);
        Integer num = this.duration;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SnackbarAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SnackbarAction createFromParcel(Parcel parcel) {
            return new SnackbarAction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SnackbarAction[] newArray(int i) {
            return new SnackbarAction[i];
        }
    }

    public /* synthetic */ SnackbarAction(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
