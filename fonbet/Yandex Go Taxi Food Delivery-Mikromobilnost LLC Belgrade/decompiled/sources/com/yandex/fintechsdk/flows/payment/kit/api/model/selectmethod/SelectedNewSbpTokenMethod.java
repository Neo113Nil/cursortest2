package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.whq0;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedNewSbpTokenMethod;", "Landroid/os/Parcelable;", "Lwhq0;", "<init>", "()V", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;", "payload", "", "matches", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;)Z", "toParcelable", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;)Landroid/os/Parcelable;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedNewSbpTokenMethod implements Parcelable, whq0 {
    public static final SelectedNewSbpTokenMethod INSTANCE = new SelectedNewSbpTokenMethod();
    public static final Parcelable.Creator<SelectedNewSbpTokenMethod> CREATOR = new Creator();

    private SelectedNewSbpTokenMethod() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.whq0
    public boolean matches(SelectedPaymentMethodPayload payload) {
        String methodType = payload.getMethodType();
        return jl40.l(methodType != null ? methodType.toLowerCase(Locale.ROOT) : null, "new_sbp_token");
    }

    @Override // defpackage.whq0
    public Parcelable toParcelable(SelectedPaymentMethodPayload payload) {
        if (!matches(payload)) {
            return null;
        }
        payload.decoded(a.Companion.serializer());
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(1);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedNewSbpTokenMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedNewSbpTokenMethod createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SelectedNewSbpTokenMethod.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedNewSbpTokenMethod[] newArray(int i) {
            return new SelectedNewSbpTokenMethod[i];
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedNewSbpTokenMethod$a;", "", "Companion", "com/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/a", "com/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/b", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a {
        public static final b Companion = new b();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("DecodedPayload(methodType=", this.a, Extension.C_BRAKE);
        }

        public a() {
            this.a = null;
        }
    }
}
