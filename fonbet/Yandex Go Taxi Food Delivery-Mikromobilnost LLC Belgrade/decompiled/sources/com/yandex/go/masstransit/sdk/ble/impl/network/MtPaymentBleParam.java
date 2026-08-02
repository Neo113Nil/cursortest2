package com.yandex.go.masstransit.sdk.ble.impl.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/impl/network/MtPaymentBleParam;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/ble/impl/network/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtPaymentBleParam {
    public static final a Companion = new a();
    public final zzs a;

    public /* synthetic */ MtPaymentBleParam(int i, zzs zzsVar) {
        if ((i & 1) == 0) {
            this.a = zzs.f;
        } else {
            this.a = zzsVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MtPaymentBleParam) && jl40.l(this.a, ((MtPaymentBleParam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MtPaymentBleParam(location=" + this.a + Extension.C_BRAKE;
    }

    public MtPaymentBleParam(zzs zzsVar) {
        this.a = zzsVar;
    }

    public MtPaymentBleParam() {
        this(zzs.f);
    }
}
