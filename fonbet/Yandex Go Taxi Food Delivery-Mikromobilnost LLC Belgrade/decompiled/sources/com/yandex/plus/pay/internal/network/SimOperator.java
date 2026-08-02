package com.yandex.plus.pay.internal.network;

import defpackage.b64;
import defpackage.jl40;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/plus/pay/internal/network/SimOperator;", "Ljava/io/Serializable;", "", "mcc", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "mnc", "b", "value", "getValue", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SimOperator implements Serializable {
    private final String mcc;
    private final String mnc;
    private final String value;

    public SimOperator(String str, String str2) {
        this.mcc = str;
        this.mnc = str2;
        this.value = str.concat(str2);
    }

    /* renamed from: a, reason: from getter */
    public final String getMcc() {
        return this.mcc;
    }

    /* renamed from: b, reason: from getter */
    public final String getMnc() {
        return this.mnc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimOperator)) {
            return false;
        }
        SimOperator simOperator = (SimOperator) obj;
        return jl40.l(this.mcc, simOperator.mcc) && jl40.l(this.mnc, simOperator.mnc);
    }

    public final int hashCode() {
        return this.mnc.hashCode() + (this.mcc.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimOperator(mcc=");
        sb.append(this.mcc);
        sb.append(", mnc=");
        return b64.p(sb, this.mnc, ')');
    }
}
