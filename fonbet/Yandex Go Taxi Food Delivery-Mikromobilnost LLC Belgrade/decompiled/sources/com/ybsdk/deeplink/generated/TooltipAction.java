package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u00015BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001bR \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/ybsdk/deeplink/generated/TooltipAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", RemoteBioParameters.X, RemoteBioParameters.Y, "", "gravity", "title", "subtitle", "duration", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/deeplink/generated/TooltipAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getX", "getY", "Ljava/lang/String;", "getGravity", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getDuration", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "grb1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TooltipAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<TooltipAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final Integer duration;
    private final String gravity;
    private final String subtitle;
    private final String title;
    private final int x;
    private final int y;

    public TooltipAction(int i, int i2, String str, String str2, String str3, Integer num) {
        this.x = i;
        this.y = i2;
        this.gravity = str;
        this.title = str2;
        this.subtitle = str3;
        this.duration = num;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/tooltip");
        l.appendQueryParameter(RemoteBioParameters.X, String.valueOf(i));
        l.appendQueryParameter(RemoteBioParameters.Y, String.valueOf(i2));
        l.appendQueryParameter("gravity", str);
        if (str2 != null) {
            l.appendQueryParameter("title", str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("subtitle", str3);
        }
        if (num != null) {
            l.appendQueryParameter("duration", String.valueOf(num.intValue()));
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ TooltipAction copy$default(TooltipAction tooltipAction, int i, int i2, String str, String str2, String str3, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tooltipAction.x;
        }
        if ((i3 & 2) != 0) {
            i2 = tooltipAction.y;
        }
        if ((i3 & 4) != 0) {
            str = tooltipAction.gravity;
        }
        if ((i3 & 8) != 0) {
            str2 = tooltipAction.title;
        }
        if ((i3 & 16) != 0) {
            str3 = tooltipAction.subtitle;
        }
        if ((i3 & 32) != 0) {
            num = tooltipAction.duration;
        }
        String str4 = str3;
        Integer num2 = num;
        return tooltipAction.copy(i, i2, str, str2, str4, num2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final int getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGravity() {
        return this.gravity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    public final TooltipAction copy(int x, int y, String gravity, String title, String subtitle, Integer duration) {
        return new TooltipAction(x, y, gravity, title, subtitle, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipAction)) {
            return false;
        }
        TooltipAction tooltipAction = (TooltipAction) other;
        return this.x == tooltipAction.x && this.y == tooltipAction.y && jl40.l(this.gravity, tooltipAction.gravity) && jl40.l(this.title, tooltipAction.title) && jl40.l(this.subtitle, tooltipAction.subtitle) && jl40.l(this.duration, tooltipAction.duration);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        int b = unr0.b(oyr.b(this.y, Integer.hashCode(this.x) * 31, 31), 31, this.gravity);
        String str = this.title;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.duration;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = this.x;
        int i2 = this.y;
        String str = this.gravity;
        String str2 = this.title;
        String str3 = this.subtitle;
        Integer num = this.duration;
        StringBuilder s = b64.s(i, i2, "TooltipAction(x=", ", y=", ", gravity=");
        g8e.D(s, str, ", title=", str2, ", subtitle=");
        s.append(str3);
        s.append(", duration=");
        s.append(num);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.x);
        dest.writeInt(this.y);
        dest.writeString(this.gravity);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        Integer num = this.duration;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TooltipAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TooltipAction createFromParcel(Parcel parcel) {
            return new TooltipAction(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TooltipAction[] newArray(int i) {
            return new TooltipAction[i];
        }
    }

    public /* synthetic */ TooltipAction(int i, int i2, String str, String str2, String str3, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? "top" : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : num);
    }
}
