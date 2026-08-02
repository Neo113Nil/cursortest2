package com.ybsdk.core.common.utils.theme;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.ColorModel;
import defpackage.jl40;
import defpackage.lob1;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ybsdk/core/common/utils/theme/LateInitColorCallbackImpl;", "Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;", "Lcom/ybsdk/core/utils/ColorModel;", "lightThemeColor", "darkThemeColor", "<init>", "(Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;)V", "Landroid/content/Context;", "context", "", "get", "(Landroid/content/Context;)I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/ColorModel;", "component2", "copy", "(Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;)Lcom/ybsdk/core/common/utils/theme/LateInitColorCallbackImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/ColorModel;", "getLightThemeColor", "getDarkThemeColor", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LateInitColorCallbackImpl implements ColorModel.LateInitColor.LateInitColorCallback {
    public static final Parcelable.Creator<LateInitColorCallbackImpl> CREATOR = new Creator();
    private final ColorModel darkThemeColor;
    private final ColorModel lightThemeColor;

    public LateInitColorCallbackImpl(ColorModel colorModel, ColorModel colorModel2) {
        this.lightThemeColor = colorModel;
        this.darkThemeColor = colorModel2;
    }

    public static /* synthetic */ LateInitColorCallbackImpl copy$default(LateInitColorCallbackImpl lateInitColorCallbackImpl, ColorModel colorModel, ColorModel colorModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            colorModel = lateInitColorCallbackImpl.lightThemeColor;
        }
        if ((i & 2) != 0) {
            colorModel2 = lateInitColorCallbackImpl.darkThemeColor;
        }
        return lateInitColorCallbackImpl.copy(colorModel, colorModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final ColorModel getLightThemeColor() {
        return this.lightThemeColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorModel getDarkThemeColor() {
        return this.darkThemeColor;
    }

    public final LateInitColorCallbackImpl copy(ColorModel lightThemeColor, ColorModel darkThemeColor) {
        return new LateInitColorCallbackImpl(lightThemeColor, darkThemeColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LateInitColorCallbackImpl)) {
            return false;
        }
        LateInitColorCallbackImpl lateInitColorCallbackImpl = (LateInitColorCallbackImpl) other;
        return jl40.l(this.lightThemeColor, lateInitColorCallbackImpl.lightThemeColor) && jl40.l(this.darkThemeColor, lateInitColorCallbackImpl.darkThemeColor);
    }

    @Override // com.ybsdk.core.utils.ColorModel.LateInitColor.LateInitColorCallback
    public int get(Context context) {
        return lob1.f(context) ? this.darkThemeColor.get(context) : this.lightThemeColor.get(context);
    }

    public final ColorModel getDarkThemeColor() {
        return this.darkThemeColor;
    }

    public final ColorModel getLightThemeColor() {
        return this.lightThemeColor;
    }

    public int hashCode() {
        return this.darkThemeColor.hashCode() + (this.lightThemeColor.hashCode() * 31);
    }

    public String toString() {
        return "LateInitColorCallbackImpl(lightThemeColor=" + this.lightThemeColor + ", darkThemeColor=" + this.darkThemeColor + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.lightThemeColor, flags);
        dest.writeParcelable(this.darkThemeColor, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LateInitColorCallbackImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LateInitColorCallbackImpl createFromParcel(Parcel parcel) {
            return new LateInitColorCallbackImpl((ColorModel) parcel.readParcelable(LateInitColorCallbackImpl.class.getClassLoader()), (ColorModel) parcel.readParcelable(LateInitColorCallbackImpl.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LateInitColorCallbackImpl[] newArray(int i) {
            return new LateInitColorCallbackImpl[i];
        }
    }
}
