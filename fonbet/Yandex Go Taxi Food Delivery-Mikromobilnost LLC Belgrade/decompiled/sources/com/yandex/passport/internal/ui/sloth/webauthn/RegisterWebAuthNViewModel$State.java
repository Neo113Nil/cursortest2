package com.yandex.passport.internal.ui.sloth.webauthn;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"com/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNViewModel$State", "Landroid/os/Parcelable;", "", "resultCode", "Landroid/content/Intent;", "resultIntent", "Lcom/yandex/passport/sloth/data/SlothParams;", "slothParams", "<init>", "(Ljava/lang/Integer;Landroid/content/Intent;Lcom/yandex/passport/sloth/data/SlothParams;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Integer;", "component2", "()Landroid/content/Intent;", "component3", "()Lcom/yandex/passport/sloth/data/SlothParams;", "Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNViewModel$State;", "copy", "(Ljava/lang/Integer;Landroid/content/Intent;Lcom/yandex/passport/sloth/data/SlothParams;)Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNViewModel$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getResultCode", "Landroid/content/Intent;", "getResultIntent", "Lcom/yandex/passport/sloth/data/SlothParams;", "getSlothParams", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RegisterWebAuthNViewModel$State implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RegisterWebAuthNViewModel$State> CREATOR = new Creator();
    private final Integer resultCode;
    private final Intent resultIntent;
    private final SlothParams slothParams;

    public /* synthetic */ RegisterWebAuthNViewModel$State(Integer num, Intent intent, SlothParams slothParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : intent, (i & 4) != 0 ? null : slothParams);
    }

    public static /* synthetic */ RegisterWebAuthNViewModel$State copy$default(RegisterWebAuthNViewModel$State registerWebAuthNViewModel$State, Integer num, Intent intent, SlothParams slothParams, int i, Object obj) {
        if ((i & 1) != 0) {
            num = registerWebAuthNViewModel$State.resultCode;
        }
        if ((i & 2) != 0) {
            intent = registerWebAuthNViewModel$State.resultIntent;
        }
        if ((i & 4) != 0) {
            slothParams = registerWebAuthNViewModel$State.slothParams;
        }
        return registerWebAuthNViewModel$State.copy(num, intent, slothParams);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Intent getResultIntent() {
        return this.resultIntent;
    }

    /* renamed from: component3, reason: from getter */
    public final SlothParams getSlothParams() {
        return this.slothParams;
    }

    public final RegisterWebAuthNViewModel$State copy(Integer resultCode, Intent resultIntent, SlothParams slothParams) {
        return new RegisterWebAuthNViewModel$State(resultCode, resultIntent, slothParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterWebAuthNViewModel$State)) {
            return false;
        }
        RegisterWebAuthNViewModel$State registerWebAuthNViewModel$State = (RegisterWebAuthNViewModel$State) other;
        return jl40.l(this.resultCode, registerWebAuthNViewModel$State.resultCode) && jl40.l(this.resultIntent, registerWebAuthNViewModel$State.resultIntent) && jl40.l(this.slothParams, registerWebAuthNViewModel$State.slothParams);
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final Intent getResultIntent() {
        return this.resultIntent;
    }

    public final SlothParams getSlothParams() {
        return this.slothParams;
    }

    public int hashCode() {
        Integer num = this.resultCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Intent intent = this.resultIntent;
        int hashCode2 = (hashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        SlothParams slothParams = this.slothParams;
        return hashCode2 + (slothParams != null ? slothParams.hashCode() : 0);
    }

    public String toString() {
        return "State(resultCode=" + this.resultCode + ", resultIntent=" + this.resultIntent + ", slothParams=" + this.slothParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Integer num = this.resultCode;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        dest.writeParcelable(this.resultIntent, flags);
        dest.writeParcelable(this.slothParams, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegisterWebAuthNViewModel$State> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterWebAuthNViewModel$State createFromParcel(Parcel parcel) {
            return new RegisterWebAuthNViewModel$State(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Intent) parcel.readParcelable(RegisterWebAuthNViewModel$State.class.getClassLoader()), (SlothParams) parcel.readParcelable(RegisterWebAuthNViewModel$State.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterWebAuthNViewModel$State[] newArray(int i) {
            return new RegisterWebAuthNViewModel$State[i];
        }
    }

    public RegisterWebAuthNViewModel$State(Integer num, Intent intent, SlothParams slothParams) {
        this.resultCode = num;
        this.resultIntent = intent;
        this.slothParams = slothParams;
    }

    public RegisterWebAuthNViewModel$State() {
        this(null, null, null, 7, null);
    }
}
