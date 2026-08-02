package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/api/ProgressAnimation;", "Landroid/os/Parcelable;", "Default", "Lottie", "Lcom/yandex/passport/api/ProgressAnimation$Default;", "Lcom/yandex/passport/api/ProgressAnimation$Lottie;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ProgressAnimation extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/api/ProgressAnimation$Default;", "Lcom/yandex/passport/api/ProgressAnimation;", "", "visibilityDelay", "<init>", "(J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "copy", "(J)Lcom/yandex/passport/api/ProgressAnimation$Default;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVisibilityDelay", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default implements ProgressAnimation {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Default> CREATOR = new Creator();
        private final long visibilityDelay;

        public /* synthetic */ Default(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
        }

        public static /* synthetic */ Default copy$default(Default r0, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = r0.visibilityDelay;
            }
            return r0.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getVisibilityDelay() {
            return this.visibilityDelay;
        }

        public final Default copy(long visibilityDelay) {
            return new Default(visibilityDelay);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && this.visibilityDelay == ((Default) other).visibilityDelay;
        }

        public final long getVisibilityDelay() {
            return this.visibilityDelay;
        }

        public int hashCode() {
            return Long.hashCode(this.visibilityDelay);
        }

        public String toString() {
            return b64.o(new StringBuilder("Default(visibilityDelay="), this.visibilityDelay, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.visibilityDelay);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(long j) {
            this.visibilityDelay = j;
        }

        public Default() {
            this(0L, 1, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/yandex/passport/api/ProgressAnimation$Lottie;", "Lcom/yandex/passport/api/ProgressAnimation;", "", "lottieAnimationResId", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/yandex/passport/api/ProgressAnimation$Lottie;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getLottieAnimationResId", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Lottie implements ProgressAnimation {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Lottie> CREATOR = new Creator();
        private final int lottieAnimationResId;

        public Lottie(int i) {
            this.lottieAnimationResId = i;
        }

        public static /* synthetic */ Lottie copy$default(Lottie lottie, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = lottie.lottieAnimationResId;
            }
            return lottie.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLottieAnimationResId() {
            return this.lottieAnimationResId;
        }

        public final Lottie copy(int lottieAnimationResId) {
            return new Lottie(lottieAnimationResId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Lottie) && this.lottieAnimationResId == ((Lottie) other).lottieAnimationResId;
        }

        public final int getLottieAnimationResId() {
            return this.lottieAnimationResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.lottieAnimationResId);
        }

        public String toString() {
            return oyr.s(new StringBuilder("Lottie(lottieAnimationResId="), this.lottieAnimationResId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.lottieAnimationResId);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Lottie> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Lottie createFromParcel(Parcel parcel) {
                return new Lottie(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Lottie[] newArray(int i) {
                return new Lottie[i];
            }
        }
    }
}
