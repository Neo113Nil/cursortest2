package com.yandex.passport.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-BC\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013JL\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\u0013¨\u0006."}, d2 = {"Lcom/yandex/passport/internal/AnimationTheme;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/o;", "", "openEnterAnimation", "openExitAnimation", "closeForwardEnterAnimation", "closeForwardExitAnimation", "closeBackEnterAnimation", "closeBackExitAnimation", "<init>", "(IIIIII)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IIIIII)Lcom/yandex/passport/internal/AnimationTheme;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getOpenEnterAnimation", "getOpenExitAnimation", "getCloseForwardEnterAnimation", "getCloseForwardExitAnimation", "getCloseBackEnterAnimation", "getCloseBackExitAnimation", "Companion", "com/yandex/passport/internal/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AnimationTheme implements Parcelable, com.yandex.passport.api.o {
    public static final int $stable = 0;
    private final int closeBackEnterAnimation;
    private final int closeBackExitAnimation;
    private final int closeForwardEnterAnimation;
    private final int closeForwardExitAnimation;
    private final int openEnterAnimation;
    private final int openExitAnimation;
    public static final c Companion = new c();
    public static final Parcelable.Creator<AnimationTheme> CREATOR = new Creator();

    public /* synthetic */ AnimationTheme(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }

    public static /* synthetic */ AnimationTheme copy$default(AnimationTheme animationTheme, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = animationTheme.openEnterAnimation;
        }
        if ((i7 & 2) != 0) {
            i2 = animationTheme.openExitAnimation;
        }
        if ((i7 & 4) != 0) {
            i3 = animationTheme.closeForwardEnterAnimation;
        }
        if ((i7 & 8) != 0) {
            i4 = animationTheme.closeForwardExitAnimation;
        }
        if ((i7 & 16) != 0) {
            i5 = animationTheme.closeBackEnterAnimation;
        }
        if ((i7 & 32) != 0) {
            i6 = animationTheme.closeBackExitAnimation;
        }
        int i8 = i5;
        int i9 = i6;
        return animationTheme.copy(i, i2, i3, i4, i8, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOpenEnterAnimation() {
        return this.openEnterAnimation;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOpenExitAnimation() {
        return this.openExitAnimation;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCloseForwardEnterAnimation() {
        return this.closeForwardEnterAnimation;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCloseForwardExitAnimation() {
        return this.closeForwardExitAnimation;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCloseBackEnterAnimation() {
        return this.closeBackEnterAnimation;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCloseBackExitAnimation() {
        return this.closeBackExitAnimation;
    }

    public final AnimationTheme copy(int openEnterAnimation, int openExitAnimation, int closeForwardEnterAnimation, int closeForwardExitAnimation, int closeBackEnterAnimation, int closeBackExitAnimation) {
        return new AnimationTheme(openEnterAnimation, openExitAnimation, closeForwardEnterAnimation, closeForwardExitAnimation, closeBackEnterAnimation, closeBackExitAnimation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationTheme)) {
            return false;
        }
        AnimationTheme animationTheme = (AnimationTheme) other;
        return this.openEnterAnimation == animationTheme.openEnterAnimation && this.openExitAnimation == animationTheme.openExitAnimation && this.closeForwardEnterAnimation == animationTheme.closeForwardEnterAnimation && this.closeForwardExitAnimation == animationTheme.closeForwardExitAnimation && this.closeBackEnterAnimation == animationTheme.closeBackEnterAnimation && this.closeBackExitAnimation == animationTheme.closeBackExitAnimation;
    }

    @Override // com.yandex.passport.api.o
    public int getCloseBackEnterAnimation() {
        return this.closeBackEnterAnimation;
    }

    @Override // com.yandex.passport.api.o
    public int getCloseBackExitAnimation() {
        return this.closeBackExitAnimation;
    }

    @Override // com.yandex.passport.api.o
    public int getCloseForwardEnterAnimation() {
        return this.closeForwardEnterAnimation;
    }

    @Override // com.yandex.passport.api.o
    public int getCloseForwardExitAnimation() {
        return this.closeForwardExitAnimation;
    }

    @Override // com.yandex.passport.api.o
    public int getOpenEnterAnimation() {
        return this.openEnterAnimation;
    }

    @Override // com.yandex.passport.api.o
    public int getOpenExitAnimation() {
        return this.openExitAnimation;
    }

    public int hashCode() {
        return Integer.hashCode(this.closeBackExitAnimation) + oyr.b(this.closeBackEnterAnimation, oyr.b(this.closeForwardExitAnimation, oyr.b(this.closeForwardEnterAnimation, oyr.b(this.openExitAnimation, Integer.hashCode(this.openEnterAnimation) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationTheme(openEnterAnimation=");
        sb.append(this.openEnterAnimation);
        sb.append(", openExitAnimation=");
        sb.append(this.openExitAnimation);
        sb.append(", closeForwardEnterAnimation=");
        sb.append(this.closeForwardEnterAnimation);
        sb.append(", closeForwardExitAnimation=");
        sb.append(this.closeForwardExitAnimation);
        sb.append(", closeBackEnterAnimation=");
        sb.append(this.closeBackEnterAnimation);
        sb.append(", closeBackExitAnimation=");
        return oyr.s(sb, this.closeBackExitAnimation, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.openEnterAnimation);
        dest.writeInt(this.openExitAnimation);
        dest.writeInt(this.closeForwardEnterAnimation);
        dest.writeInt(this.closeForwardExitAnimation);
        dest.writeInt(this.closeBackEnterAnimation);
        dest.writeInt(this.closeBackExitAnimation);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnimationTheme> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnimationTheme createFromParcel(Parcel parcel) {
            return new AnimationTheme(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnimationTheme[] newArray(int i) {
            return new AnimationTheme[i];
        }
    }

    public AnimationTheme(int i, int i2, int i3, int i4, int i5, int i6) {
        this.openEnterAnimation = i;
        this.openExitAnimation = i2;
        this.closeForwardEnterAnimation = i3;
        this.closeForwardExitAnimation = i4;
        this.closeBackEnterAnimation = i5;
        this.closeBackExitAnimation = i6;
    }

    public AnimationTheme() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }
}
