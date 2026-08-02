package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akq0;
import defpackage.nzs;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedYBMethod;", "Landroid/os/Parcelable;", "", "isOwner", "", "methodId", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/YBCardType;", "type", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/YBCardType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getMethodId", "()Ljava/lang/String;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/YBCardType;", "getType", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/YBCardType;", "Companion", "akq0", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedYBMethod implements Parcelable {
    private final Boolean isOwner;
    private final String methodId;
    private final YBCardType type;
    public static final akq0 Companion = new akq0();
    public static final Parcelable.Creator<SelectedYBMethod> CREATOR = new Creator();

    public SelectedYBMethod(Boolean bool, String str, YBCardType yBCardType) {
        this.isOwner = bool;
        this.methodId = str;
        this.type = yBCardType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getMethodId() {
        return this.methodId;
    }

    public final YBCardType getType() {
        return this.type;
    }

    /* renamed from: isOwner, reason: from getter */
    public final Boolean getIsOwner() {
        return this.isOwner;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Boolean bool = this.isOwner;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.methodId);
        this.type.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedYBMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedYBMethod createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SelectedYBMethod(valueOf, parcel.readString(), YBCardType.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedYBMethod[] newArray(int i) {
            return new SelectedYBMethod[i];
        }
    }
}
