package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.auth.LegacyAccountType;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lcom/yandex/plus/pay/api/model/ParentInfo;", "Landroid/os/Parcelable;", "", "displayName", "fio", "image", LegacyAccountType.STRING_LOGIN, "publicName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/ParentInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "getFio", "getImage", "getLogin", "getPublicName", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ParentInfo implements Parcelable {
    public static final Parcelable.Creator<ParentInfo> CREATOR = new Creator();
    private final String displayName;
    private final String fio;
    private final String image;
    private final String login;
    private final String publicName;

    public ParentInfo(String str, String str2, String str3, String str4, String str5) {
        this.displayName = str;
        this.fio = str2;
        this.image = str3;
        this.login = str4;
        this.publicName = str5;
    }

    public static /* synthetic */ ParentInfo copy$default(ParentInfo parentInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parentInfo.displayName;
        }
        if ((i & 2) != 0) {
            str2 = parentInfo.fio;
        }
        if ((i & 4) != 0) {
            str3 = parentInfo.image;
        }
        if ((i & 8) != 0) {
            str4 = parentInfo.login;
        }
        if ((i & 16) != 0) {
            str5 = parentInfo.publicName;
        }
        String str6 = str5;
        String str7 = str3;
        return parentInfo.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFio() {
        return this.fio;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPublicName() {
        return this.publicName;
    }

    public final ParentInfo copy(String displayName, String fio, String image, String login, String publicName) {
        return new ParentInfo(displayName, fio, image, login, publicName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentInfo)) {
            return false;
        }
        ParentInfo parentInfo = (ParentInfo) other;
        return jl40.l(this.displayName, parentInfo.displayName) && jl40.l(this.fio, parentInfo.fio) && jl40.l(this.image, parentInfo.image) && jl40.l(this.login, parentInfo.login) && jl40.l(this.publicName, parentInfo.publicName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFio() {
        return this.fio;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLogin() {
        return this.login;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    public int hashCode() {
        return this.publicName.hashCode() + unr0.b(unr0.b(unr0.b(this.displayName.hashCode() * 31, 31, this.fio), 31, this.image), 31, this.login);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParentInfo(displayName=");
        sb.append(this.displayName);
        sb.append(", fio=");
        sb.append(this.fio);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", publicName=");
        return b64.p(sb, this.publicName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.displayName);
        dest.writeString(this.fio);
        dest.writeString(this.image);
        dest.writeString(this.login);
        dest.writeString(this.publicName);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ParentInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParentInfo createFromParcel(Parcel parcel) {
            return new ParentInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParentInfo[] newArray(int i) {
            return new ParentInfo[i];
        }
    }
}
