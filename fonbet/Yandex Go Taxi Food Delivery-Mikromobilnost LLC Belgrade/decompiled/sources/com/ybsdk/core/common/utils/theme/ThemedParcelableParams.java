package com.ybsdk.core.common.utils.theme;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.design.theme.ThemedParams;
import defpackage.jl40;
import defpackage.kob1;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/core/common/utils/theme/ThemedParcelableParams;", "Landroid/os/Parcelable;", "T", "Lcom/ybsdk/core/design/theme/ThemedParams;", "light", "dark", "<init>", "(Landroid/os/Parcelable;Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/os/Parcelable;", "component2", "copy", "(Landroid/os/Parcelable;Landroid/os/Parcelable;)Lcom/ybsdk/core/common/utils/theme/ThemedParcelableParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcelable;", "getLight", "getDark", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ThemedParcelableParams<T extends Parcelable> implements ThemedParams<T> {
    public static final Parcelable.Creator<ThemedParcelableParams<?>> CREATOR = new Creator();
    private final T dark;
    private final T light;

    public ThemedParcelableParams(T t, T t2) {
        this.light = t;
        this.dark = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemedParcelableParams copy$default(ThemedParcelableParams themedParcelableParams, Parcelable parcelable, Parcelable parcelable2, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = themedParcelableParams.light;
        }
        if ((i & 2) != 0) {
            parcelable2 = themedParcelableParams.dark;
        }
        return themedParcelableParams.copy(parcelable, parcelable2);
    }

    public final T component1() {
        return this.light;
    }

    public final T component2() {
        return this.dark;
    }

    public final ThemedParcelableParams<T> copy(T light, T dark) {
        return new ThemedParcelableParams<>(light, dark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedParcelableParams)) {
            return false;
        }
        ThemedParcelableParams themedParcelableParams = (ThemedParcelableParams) other;
        return jl40.l(this.light, themedParcelableParams.light) && jl40.l(this.dark, themedParcelableParams.dark);
    }

    @Override // com.ybsdk.core.design.theme.ThemedParams
    public T get(Context context) {
        return (T) kob1.d(this, context);
    }

    public int hashCode() {
        T t = this.light;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.dark;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "ThemedParcelableParams(light=" + this.light + ", dark=" + this.dark + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.light, flags);
        dest.writeParcelable(this.dark, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ThemedParcelableParams<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedParcelableParams<?> createFromParcel(Parcel parcel) {
            return new ThemedParcelableParams<>(parcel.readParcelable(ThemedParcelableParams.class.getClassLoader()), parcel.readParcelable(ThemedParcelableParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedParcelableParams<?>[] newArray(int i) {
            return new ThemedParcelableParams[i];
        }
    }

    @Override // com.ybsdk.core.design.theme.ThemedParams
    public T getDark() {
        return this.dark;
    }

    @Override // com.ybsdk.core.design.theme.ThemedParams
    public T getLight() {
        return this.light;
    }
}
