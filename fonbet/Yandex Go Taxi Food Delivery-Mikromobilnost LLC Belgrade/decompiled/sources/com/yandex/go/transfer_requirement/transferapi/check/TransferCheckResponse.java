package com.yandex.go.transfer_requirement.transferapi.check;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pr01;
import defpackage.qr01;
import defpackage.tc01;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/check/TransferCheckResponse;", "Lqr01;", "Companion", "$serializer", "com/yandex/go/transfer_requirement/transferapi/check/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferCheckResponse implements qr01 {
    public static final e Companion = new e();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(3))};
    public final d a;
    public final List b;

    public /* synthetic */ TransferCheckResponse(int i, d dVar, List list) {
        this.a = (i & 1) == 0 ? null : dVar;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    @Override // defpackage.qr01
    public final pr01 a() {
        return this.a;
    }

    @Override // defpackage.qr01
    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferCheckResponse)) {
            return false;
        }
        TransferCheckResponse transferCheckResponse = (TransferCheckResponse) obj;
        return jl40.l(this.a, transferCheckResponse.a) && jl40.l(this.b, transferCheckResponse.b);
    }

    public final int hashCode() {
        d dVar = this.a;
        return this.b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    public final String toString() {
        return "TransferCheckResponse(validResponse=" + this.a + ", errors=" + this.b + Extension.C_BRAKE;
    }

    public TransferCheckResponse(int i) {
        this.a = null;
        this.b = EmptyList.a;
    }

    public TransferCheckResponse() {
        this(0);
    }
}
