package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019JR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lcom/ybsdk/api/YBSdkVisualParams;", "Landroid/os/Parcelable;", "", "showAsSlidableView", "showLogOut", "drawSdkUnderSafeArea", "", "coinImage", "skinSelectionImageDark", "skinSelectionImageLight", "<init>", "(ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "copy", "(ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ybsdk/api/YBSdkVisualParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowAsSlidableView", "getShowLogOut", "getDrawSdkUnderSafeArea", "Ljava/lang/Integer;", "getCoinImage", "getSkinSelectionImageDark", "getSkinSelectionImageLight", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkVisualParams implements Parcelable {
    public static final Parcelable.Creator<YBSdkVisualParams> CREATOR = new Creator();
    private final Integer coinImage;
    private final boolean drawSdkUnderSafeArea;
    private final boolean showAsSlidableView;
    private final boolean showLogOut;
    private final Integer skinSelectionImageDark;
    private final Integer skinSelectionImageLight;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ YBSdkVisualParams(boolean r2, boolean r3, boolean r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.api.YBSdkVisualParams.<init>(boolean, boolean, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ YBSdkVisualParams copy$default(YBSdkVisualParams yBSdkVisualParams, boolean z, boolean z2, boolean z3, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = yBSdkVisualParams.showAsSlidableView;
        }
        if ((i & 2) != 0) {
            z2 = yBSdkVisualParams.showLogOut;
        }
        if ((i & 4) != 0) {
            z3 = yBSdkVisualParams.drawSdkUnderSafeArea;
        }
        if ((i & 8) != 0) {
            num = yBSdkVisualParams.coinImage;
        }
        if ((i & 16) != 0) {
            num2 = yBSdkVisualParams.skinSelectionImageDark;
        }
        if ((i & 32) != 0) {
            num3 = yBSdkVisualParams.skinSelectionImageLight;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        return yBSdkVisualParams.copy(z, z2, z3, num, num4, num5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowAsSlidableView() {
        return this.showAsSlidableView;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLogOut() {
        return this.showLogOut;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDrawSdkUnderSafeArea() {
        return this.drawSdkUnderSafeArea;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCoinImage() {
        return this.coinImage;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSkinSelectionImageDark() {
        return this.skinSelectionImageDark;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getSkinSelectionImageLight() {
        return this.skinSelectionImageLight;
    }

    public final YBSdkVisualParams copy(boolean showAsSlidableView, boolean showLogOut, boolean drawSdkUnderSafeArea, Integer coinImage, Integer skinSelectionImageDark, Integer skinSelectionImageLight) {
        return new YBSdkVisualParams(showAsSlidableView, showLogOut, drawSdkUnderSafeArea, coinImage, skinSelectionImageDark, skinSelectionImageLight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YBSdkVisualParams)) {
            return false;
        }
        YBSdkVisualParams yBSdkVisualParams = (YBSdkVisualParams) other;
        return this.showAsSlidableView == yBSdkVisualParams.showAsSlidableView && this.showLogOut == yBSdkVisualParams.showLogOut && this.drawSdkUnderSafeArea == yBSdkVisualParams.drawSdkUnderSafeArea && jl40.l(this.coinImage, yBSdkVisualParams.coinImage) && jl40.l(this.skinSelectionImageDark, yBSdkVisualParams.skinSelectionImageDark) && jl40.l(this.skinSelectionImageLight, yBSdkVisualParams.skinSelectionImageLight);
    }

    public final Integer getCoinImage() {
        return this.coinImage;
    }

    public final boolean getDrawSdkUnderSafeArea() {
        return this.drawSdkUnderSafeArea;
    }

    public final boolean getShowAsSlidableView() {
        return this.showAsSlidableView;
    }

    public final boolean getShowLogOut() {
        return this.showLogOut;
    }

    public final Integer getSkinSelectionImageDark() {
        return this.skinSelectionImageDark;
    }

    public final Integer getSkinSelectionImageLight() {
        return this.skinSelectionImageLight;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.showAsSlidableView) * 31, 31, this.showLogOut), 31, this.drawSdkUnderSafeArea);
        Integer num = this.coinImage;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.skinSelectionImageDark;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.skinSelectionImageLight;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.showAsSlidableView;
        boolean z2 = this.showLogOut;
        boolean z3 = this.drawSdkUnderSafeArea;
        Integer num = this.coinImage;
        Integer num2 = this.skinSelectionImageDark;
        Integer num3 = this.skinSelectionImageLight;
        StringBuilder u = qv10.u("YBSdkVisualParams(showAsSlidableView=", ", showLogOut=", ", drawSdkUnderSafeArea=", z, z2);
        u.append(z3);
        u.append(", coinImage=");
        u.append(num);
        u.append(", skinSelectionImageDark=");
        u.append(num2);
        u.append(", skinSelectionImageLight=");
        u.append(num3);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.showAsSlidableView ? 1 : 0);
        dest.writeInt(this.showLogOut ? 1 : 0);
        dest.writeInt(this.drawSdkUnderSafeArea ? 1 : 0);
        Integer num = this.coinImage;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Integer num2 = this.skinSelectionImageDark;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num2);
        }
        Integer num3 = this.skinSelectionImageLight;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num3);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBSdkVisualParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkVisualParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new YBSdkVisualParams(z3, z4, z2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkVisualParams[] newArray(int i) {
            return new YBSdkVisualParams[i];
        }
    }

    public YBSdkVisualParams(boolean z) {
        this(z, false, false, null, null, null, 62, null);
    }

    public YBSdkVisualParams(boolean z, boolean z2) {
        this(z, z2, false, null, null, null, 60, null);
    }

    public YBSdkVisualParams(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, null, null, null, 56, null);
    }

    public YBSdkVisualParams(boolean z, boolean z2, boolean z3, Integer num) {
        this(z, z2, z3, num, null, null, 48, null);
    }

    public YBSdkVisualParams(boolean z, boolean z2, boolean z3, Integer num, Integer num2) {
        this(z, z2, z3, num, num2, null, 32, null);
    }

    public YBSdkVisualParams(boolean z, boolean z2, boolean z3, Integer num, Integer num2, Integer num3) {
        this.showAsSlidableView = z;
        this.showLogOut = z2;
        this.drawSdkUnderSafeArea = z3;
        this.coinImage = num;
        this.skinSelectionImageDark = num2;
        this.skinSelectionImageLight = num3;
    }

    public YBSdkVisualParams() {
        this(false, false, false, null, null, null, 63, null);
    }
}
