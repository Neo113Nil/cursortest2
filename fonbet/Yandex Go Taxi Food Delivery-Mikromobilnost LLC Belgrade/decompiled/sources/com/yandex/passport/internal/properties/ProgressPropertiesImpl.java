package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.ProgressSize;
import com.yandex.passport.api.u1;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000245B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010 ¨\u00066"}, d2 = {"Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "Lcom/yandex/passport/api/u1;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/ProgressAnimation;", "animation", "Lcom/yandex/passport/api/ProgressSize;", "size", "Lcom/yandex/passport/api/ProgressBackground;", C0553n3.g, "", "showCancelButton", "<init>", "(Lcom/yandex/passport/api/ProgressAnimation;Lcom/yandex/passport/api/ProgressSize;Lcom/yandex/passport/api/ProgressBackground;Z)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/ProgressAnimation;", "component2", "()Lcom/yandex/passport/api/ProgressSize;", "component3", "()Lcom/yandex/passport/api/ProgressBackground;", "component4", "()Z", "copy", "(Lcom/yandex/passport/api/ProgressAnimation;Lcom/yandex/passport/api/ProgressSize;Lcom/yandex/passport/api/ProgressBackground;Z)Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/ProgressAnimation;", "getAnimation", "Lcom/yandex/passport/api/ProgressSize;", "getSize", "Lcom/yandex/passport/api/ProgressBackground;", "getBackground", "Z", "getShowCancelButton", "Companion", "a", "com/yandex/passport/internal/properties/m", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProgressPropertiesImpl implements u1, Parcelable {
    public static final int $stable = 0;
    private static final String KEY_LOADER_PROPERTIES = "passport-loader-properties";
    private final ProgressAnimation animation;
    private final ProgressBackground background;
    private final boolean showCancelButton;
    private final ProgressSize size;
    public static final m Companion = new m();
    public static final Parcelable.Creator<ProgressPropertiesImpl> CREATOR = new Creator();

    public static final class a implements u1 {
        public ProgressAnimation a = new ProgressAnimation.Default(0, 1, null);
        public ProgressSize b = ProgressSize.Default.INSTANCE;
        public ProgressBackground c = ProgressBackground.Default.INSTANCE;
        public boolean w = true;

        @Override // com.yandex.passport.api.u1
        public final ProgressAnimation getAnimation() {
            return this.a;
        }

        @Override // com.yandex.passport.api.u1
        public final ProgressBackground getBackground() {
            return this.c;
        }

        @Override // com.yandex.passport.api.u1
        public final boolean getShowCancelButton() {
            return this.w;
        }

        @Override // com.yandex.passport.api.u1
        public final ProgressSize getSize() {
            return this.b;
        }
    }

    public /* synthetic */ ProgressPropertiesImpl(ProgressAnimation progressAnimation, ProgressSize progressSize, ProgressBackground progressBackground, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ProgressAnimation.Default(0L, 1, null) : progressAnimation, (i & 2) != 0 ? ProgressSize.Default.INSTANCE : progressSize, (i & 4) != 0 ? ProgressBackground.Default.INSTANCE : progressBackground, (i & 8) != 0 ? true : z);
    }

    public static /* synthetic */ ProgressPropertiesImpl copy$default(ProgressPropertiesImpl progressPropertiesImpl, ProgressAnimation progressAnimation, ProgressSize progressSize, ProgressBackground progressBackground, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            progressAnimation = progressPropertiesImpl.animation;
        }
        if ((i & 2) != 0) {
            progressSize = progressPropertiesImpl.size;
        }
        if ((i & 4) != 0) {
            progressBackground = progressPropertiesImpl.background;
        }
        if ((i & 8) != 0) {
            z = progressPropertiesImpl.showCancelButton;
        }
        return progressPropertiesImpl.copy(progressAnimation, progressSize, progressBackground, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ProgressAnimation getAnimation() {
        return this.animation;
    }

    /* renamed from: component2, reason: from getter */
    public final ProgressSize getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final ProgressBackground getBackground() {
        return this.background;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    public final ProgressPropertiesImpl copy(ProgressAnimation animation, ProgressSize size, ProgressBackground background, boolean showCancelButton) {
        return new ProgressPropertiesImpl(animation, size, background, showCancelButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressPropertiesImpl)) {
            return false;
        }
        ProgressPropertiesImpl progressPropertiesImpl = (ProgressPropertiesImpl) other;
        return jl40.l(this.animation, progressPropertiesImpl.animation) && jl40.l(this.size, progressPropertiesImpl.size) && jl40.l(this.background, progressPropertiesImpl.background) && this.showCancelButton == progressPropertiesImpl.showCancelButton;
    }

    @Override // com.yandex.passport.api.u1
    public ProgressAnimation getAnimation() {
        return this.animation;
    }

    @Override // com.yandex.passport.api.u1
    public ProgressBackground getBackground() {
        return this.background;
    }

    @Override // com.yandex.passport.api.u1
    public boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    @Override // com.yandex.passport.api.u1
    public ProgressSize getSize() {
        return this.size;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showCancelButton) + ((this.background.hashCode() + ((this.size.hashCode() + (this.animation.hashCode() * 31)) * 31)) * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_LOADER_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProgressPropertiesImpl(animation=");
        sb.append(this.animation);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", showCancelButton=");
        return unr0.u(sb, this.showCancelButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.animation, flags);
        dest.writeParcelable(this.size, flags);
        dest.writeParcelable(this.background, flags);
        dest.writeInt(this.showCancelButton ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProgressPropertiesImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressPropertiesImpl createFromParcel(Parcel parcel) {
            return new ProgressPropertiesImpl((ProgressAnimation) parcel.readParcelable(ProgressPropertiesImpl.class.getClassLoader()), (ProgressSize) parcel.readParcelable(ProgressPropertiesImpl.class.getClassLoader()), (ProgressBackground) parcel.readParcelable(ProgressPropertiesImpl.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressPropertiesImpl[] newArray(int i) {
            return new ProgressPropertiesImpl[i];
        }
    }

    public ProgressPropertiesImpl(ProgressAnimation progressAnimation, ProgressSize progressSize, ProgressBackground progressBackground, boolean z) {
        this.animation = progressAnimation;
        this.size = progressSize;
        this.background = progressBackground;
        this.showCancelButton = z;
    }

    public ProgressPropertiesImpl() {
        this(null, null, null, false, 15, null);
    }
}
