package com.ybsdk.feature.divkit.common.screen.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.utils.ColorModel;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonStatusBar;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/ColorModel;", "color", "Lcom/ybsdk/core/design/theme/ThemedParams;", "", "iconsColor", "<init>", "(Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/theme/ThemedParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/ColorModel;", "component2", "()Lcom/ybsdk/core/design/theme/ThemedParams;", "copy", "(Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/theme/ThemedParams;)Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonStatusBar;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/ColorModel;", "getColor", "Lcom/ybsdk/core/design/theme/ThemedParams;", "getIconsColor", "feature-divkit-common-screen-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivkitCommonStatusBar implements Parcelable {
    public static final Parcelable.Creator<DivkitCommonStatusBar> CREATOR = new Creator();
    private final ColorModel color;
    private final ThemedParams<Boolean> iconsColor;

    public DivkitCommonStatusBar(ColorModel colorModel, ThemedParams<Boolean> themedParams) {
        this.color = colorModel;
        this.iconsColor = themedParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivkitCommonStatusBar copy$default(DivkitCommonStatusBar divkitCommonStatusBar, ColorModel colorModel, ThemedParams themedParams, int i, Object obj) {
        if ((i & 1) != 0) {
            colorModel = divkitCommonStatusBar.color;
        }
        if ((i & 2) != 0) {
            themedParams = divkitCommonStatusBar.iconsColor;
        }
        return divkitCommonStatusBar.copy(colorModel, themedParams);
    }

    /* renamed from: component1, reason: from getter */
    public final ColorModel getColor() {
        return this.color;
    }

    public final ThemedParams<Boolean> component2() {
        return this.iconsColor;
    }

    public final DivkitCommonStatusBar copy(ColorModel color, ThemedParams<Boolean> iconsColor) {
        return new DivkitCommonStatusBar(color, iconsColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivkitCommonStatusBar)) {
            return false;
        }
        DivkitCommonStatusBar divkitCommonStatusBar = (DivkitCommonStatusBar) other;
        return jl40.l(this.color, divkitCommonStatusBar.color) && jl40.l(this.iconsColor, divkitCommonStatusBar.iconsColor);
    }

    public final ColorModel getColor() {
        return this.color;
    }

    public final ThemedParams<Boolean> getIconsColor() {
        return this.iconsColor;
    }

    public int hashCode() {
        return this.iconsColor.hashCode() + (this.color.hashCode() * 31);
    }

    public String toString() {
        return "DivkitCommonStatusBar(color=" + this.color + ", iconsColor=" + this.iconsColor + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.color, flags);
        dest.writeParcelable(this.iconsColor, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DivkitCommonStatusBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DivkitCommonStatusBar createFromParcel(Parcel parcel) {
            return new DivkitCommonStatusBar((ColorModel) parcel.readParcelable(DivkitCommonStatusBar.class.getClassLoader()), (ThemedParams) parcel.readParcelable(DivkitCommonStatusBar.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DivkitCommonStatusBar[] newArray(int i) {
            return new DivkitCommonStatusBar[i];
        }
    }
}
