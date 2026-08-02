package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0010R \u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ybsdk/deeplink/generated/SetHeaderClickableAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "isClickable", "<init>", "(Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/ybsdk/deeplink/generated/SetHeaderClickableAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SetHeaderClickableAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SetHeaderClickableAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final Boolean isClickable;

    public SetHeaderClickableAction(Boolean bool) {
        this.isClickable = bool;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/set_header_clickable");
        if (bool != null) {
            l.appendQueryParameter("is_clickable", String.valueOf(bool.booleanValue()));
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ SetHeaderClickableAction copy$default(SetHeaderClickableAction setHeaderClickableAction, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = setHeaderClickableAction.isClickable;
        }
        return setHeaderClickableAction.copy(bool);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsClickable() {
        return this.isClickable;
    }

    public final SetHeaderClickableAction copy(Boolean isClickable) {
        return new SetHeaderClickableAction(isClickable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetHeaderClickableAction) && jl40.l(this.isClickable, ((SetHeaderClickableAction) other).isClickable);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public int hashCode() {
        Boolean bool = this.isClickable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isClickable() {
        return this.isClickable;
    }

    public String toString() {
        return "SetHeaderClickableAction(isClickable=" + this.isClickable + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Boolean bool = this.isClickable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SetHeaderClickableAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetHeaderClickableAction createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SetHeaderClickableAction(valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetHeaderClickableAction[] newArray(int i) {
            return new SetHeaderClickableAction[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetHeaderClickableAction() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SetHeaderClickableAction(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
