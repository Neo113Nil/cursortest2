package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.vfc;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/ColoredTextEntity;", "Landroid/os/Parcelable;", "", "text", "Lcom/ybsdk/core/utils/ColorModel;", "color", "", "shouldShowShimmer", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/ColorModel;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/utils/ColorModel;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/utils/ColorModel;Z)Lcom/ybsdk/core/common/domain/entities/ColoredTextEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lcom/ybsdk/core/utils/ColorModel;", "getColor", "Z", "getShouldShowShimmer", "Lcom/ybsdk/core/utils/text/Text$Constant;", "getTextModel", "()Lcom/ybsdk/core/utils/text/Text$Constant;", "textModel", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ColoredTextEntity implements Parcelable {
    public static final Parcelable.Creator<ColoredTextEntity> CREATOR = new Creator();
    private final ColorModel color;
    private final boolean shouldShowShimmer;
    private final String text;

    public ColoredTextEntity(String str, ColorModel colorModel, boolean z) {
        this.text = str;
        this.color = colorModel;
        this.shouldShowShimmer = z;
    }

    public static /* synthetic */ ColoredTextEntity copy$default(ColoredTextEntity coloredTextEntity, String str, ColorModel colorModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coloredTextEntity.text;
        }
        if ((i & 2) != 0) {
            colorModel = coloredTextEntity.color;
        }
        if ((i & 4) != 0) {
            z = coloredTextEntity.shouldShowShimmer;
        }
        return coloredTextEntity.copy(str, colorModel, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorModel getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowShimmer() {
        return this.shouldShowShimmer;
    }

    public final ColoredTextEntity copy(String text, ColorModel color, boolean shouldShowShimmer) {
        return new ColoredTextEntity(text, color, shouldShowShimmer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColoredTextEntity)) {
            return false;
        }
        ColoredTextEntity coloredTextEntity = (ColoredTextEntity) other;
        return jl40.l(this.text, coloredTextEntity.text) && jl40.l(this.color, coloredTextEntity.color) && this.shouldShowShimmer == coloredTextEntity.shouldShowShimmer;
    }

    public final ColorModel getColor() {
        return this.color;
    }

    public final boolean getShouldShowShimmer() {
        return this.shouldShowShimmer;
    }

    public final String getText() {
        return this.text;
    }

    public final Text.Constant getTextModel() {
        return g8e.i(Text.Companion, this.text);
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowShimmer) + vfc.d(this.color, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.text;
        ColorModel colorModel = this.color;
        boolean z = this.shouldShowShimmer;
        StringBuilder sb = new StringBuilder("ColoredTextEntity(text=");
        sb.append(str);
        sb.append(", color=");
        sb.append(colorModel);
        sb.append(", shouldShowShimmer=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeParcelable(this.color, flags);
        dest.writeInt(this.shouldShowShimmer ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements Parcelable.Creator<ColoredTextEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ColoredTextEntity createFromParcel(Parcel parcel) {
            return new ColoredTextEntity(parcel.readString(), (ColorModel) parcel.readParcelable(ColoredTextEntity.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ColoredTextEntity[] newArray(int i) {
            return new ColoredTextEntity[i];
        }
    }

    public /* synthetic */ ColoredTextEntity(String str, ColorModel colorModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, colorModel, (i & 4) != 0 ? false : z);
    }
}
