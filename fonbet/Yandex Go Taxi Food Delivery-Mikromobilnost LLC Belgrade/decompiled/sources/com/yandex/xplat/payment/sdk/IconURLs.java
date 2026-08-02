package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jiu;
import defpackage.mbb1;
import defpackage.n5v;
import defpackage.tyj0;
import defpackage.y3x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/yandex/xplat/payment/sdk/IconURLs;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "light", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLight", "()Ljava/lang/String;", "getDark", "Companion", "n5v", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class IconURLs implements Parcelable {
    private final String dark;
    private final String light;
    public static final n5v Companion = new n5v();
    public static final Parcelable.Creator<IconURLs> CREATOR = new Creator();

    public IconURLs(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public static tyj0 fromJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new jiu(14));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.light);
        dest.writeString(this.dark);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconURLs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IconURLs createFromParcel(Parcel parcel) {
            return new IconURLs(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IconURLs[] newArray(int i) {
            return new IconURLs[i];
        }
    }
}
