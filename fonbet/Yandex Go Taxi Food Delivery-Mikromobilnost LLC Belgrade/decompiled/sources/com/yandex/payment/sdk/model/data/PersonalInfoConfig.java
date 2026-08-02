package com.yandex.payment.sdk.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.y4b0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/sdk/model/data/PersonalInfoConfig;", "Landroid/os/Parcelable;", "Lcom/yandex/payment/sdk/model/data/PersonalInfoMode;", "mode", "", "showName", "showPhone", "showEmail", "<init>", "(Lcom/yandex/payment/sdk/model/data/PersonalInfoMode;ZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/payment/sdk/model/data/PersonalInfoMode;", "getMode", "()Lcom/yandex/payment/sdk/model/data/PersonalInfoMode;", "Z", "getShowName", "()Z", "getShowPhone", "getShowEmail", "Companion", "a", "y4b0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersonalInfoConfig implements Parcelable {
    private static final PersonalInfoConfig DEFAULT;
    private final PersonalInfoMode mode;
    private final boolean showEmail;
    private final boolean showName;
    private final boolean showPhone;
    public static final y4b0 Companion = new y4b0();
    public static final Parcelable.Creator<PersonalInfoConfig> CREATOR = new Creator();

    public static final class a {
        public PersonalInfoMode a = PersonalInfoMode.HIDE;
        public boolean b;
        public boolean c;
        public boolean d;

        public final PersonalInfoConfig a() {
            return new PersonalInfoConfig(this.a, this.b, this.c, this.d);
        }

        public final void b(PersonalInfoMode personalInfoMode) {
            this.a = personalInfoMode;
        }

        public final void c() {
            this.d = true;
        }
    }

    static {
        a aVar = new a();
        aVar.a = PersonalInfoMode.SHOW_IF_NOT_AUTHORIZED;
        aVar.b = true;
        aVar.c = true;
        aVar.d = true;
        DEFAULT = aVar.a();
    }

    public PersonalInfoConfig(PersonalInfoMode personalInfoMode, boolean z, boolean z2, boolean z3) {
        this.mode = personalInfoMode;
        this.showName = z;
        this.showPhone = z2;
        this.showEmail = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PersonalInfoMode getMode() {
        return this.mode;
    }

    public final boolean getShowEmail() {
        return this.showEmail;
    }

    public final boolean getShowName() {
        return this.showName;
    }

    public final boolean getShowPhone() {
        return this.showPhone;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mode.name());
        dest.writeInt(this.showName ? 1 : 0);
        dest.writeInt(this.showPhone ? 1 : 0);
        dest.writeInt(this.showEmail ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PersonalInfoConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalInfoConfig createFromParcel(Parcel parcel) {
            return new PersonalInfoConfig(PersonalInfoMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalInfoConfig[] newArray(int i) {
            return new PersonalInfoConfig[i];
        }
    }
}
