package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acx;
import defpackage.auu0;
import defpackage.dbb1;
import defpackage.gsq0;
import defpackage.myi;
import defpackage.psq0;
import defpackage.qje;
import defpackage.sbx;
import defpackage.tje;
import defpackage.tyo0;
import defpackage.uhq0;
import defpackage.vhq0;
import defpackage.yjd;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002/0B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u0006\u0010\u000bB9\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010-\u001a\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;", "Landroid/os/Parcelable;", "", "methodId", "methodType", "rawPayloadString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "params", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$flows_payment_kit_release", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "T", "Lmyi;", "deserializer", "decoded", "(Lmyi;)Ljava/lang/Object;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getMethodId", "()Ljava/lang/String;", "getMethodType", "Lkotlinx/serialization/json/c;", "getRawPayload$flows_payment_kit_release", "()Lkotlinx/serialization/json/c;", "rawPayload", "Companion", "vhq0", "uhq0", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedPaymentMethodPayload implements Parcelable {

    @Deprecated
    public static final String KEY_METHOD_ID = "method_id";

    @Deprecated
    public static final String KEY_METHOD_TYPE = "method_type";
    private final String methodId;
    private final String methodType;
    private final String rawPayloadString;
    private static final vhq0 Companion = new vhq0();
    public static final Parcelable.Creator<SelectedPaymentMethodPayload> CREATOR = new Creator();

    /* renamed from: json, reason: collision with root package name */
    private static final sbx f98json = tje.a(sbx.d, new tyo0(24));

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectedPaymentMethodPayload(String str, String str2, Map<String, ? extends Object> map) {
        this(str, str2, r0.c((kotlinx.serialization.json.c) dbb1.d(r2.j()), r1));
        sbx sbxVar = f98json;
        KSerializer serializer = kotlinx.serialization.json.c.Companion.serializer();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(map);
        mapBuilder.put(KEY_METHOD_ID, str);
        mapBuilder.put(KEY_METHOD_TYPE, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 json$lambda$1(acx acxVar) {
        acxVar.c = true;
        return zy11.a;
    }

    public static final /* synthetic */ void write$Self$flows_payment_kit_release(SelectedPaymentMethodPayload self, yjd output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.methodId);
        output.g(serialDesc, 1, auu0.a, self.methodType);
        output.o(serialDesc, 2, self.rawPayloadString);
    }

    public final <T> T decoded(myi deserializer) {
        return (T) f98json.a(deserializer, getRawPayload$flows_payment_kit_release());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getMethodId() {
        return this.methodId;
    }

    public final String getMethodType() {
        return this.methodType;
    }

    public final kotlinx.serialization.json.c getRawPayload$flows_payment_kit_release() {
        sbx sbxVar = f98json;
        String str = this.rawPayloadString;
        sbxVar.getClass();
        return (kotlinx.serialization.json.c) sbxVar.b(kotlinx.serialization.json.c.Companion.serializer(), str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.methodId);
        dest.writeString(this.methodType);
        dest.writeString(this.rawPayloadString);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedPaymentMethodPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPaymentMethodPayload createFromParcel(Parcel parcel) {
            return new SelectedPaymentMethodPayload(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPaymentMethodPayload[] newArray(int i) {
            return new SelectedPaymentMethodPayload[i];
        }
    }

    public SelectedPaymentMethodPayload(String str, String str2, String str3) {
        this.methodId = str;
        this.methodType = str2;
        this.rawPayloadString = str3;
    }

    public /* synthetic */ SelectedPaymentMethodPayload(int i, String str, String str2, String str3, psq0 psq0Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, uhq0.a.getDescriptor());
            throw null;
        }
        this.methodId = str;
        this.methodType = str2;
        this.rawPayloadString = str3;
    }
}
