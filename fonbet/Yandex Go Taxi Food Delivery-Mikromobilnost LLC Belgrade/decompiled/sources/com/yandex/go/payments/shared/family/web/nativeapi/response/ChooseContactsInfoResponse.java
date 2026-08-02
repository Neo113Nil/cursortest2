package com.yandex.go.payments.shared.family.web.nativeapi.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qlb;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/family/web/nativeapi/response/ChooseContactsInfoResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/family/web/nativeapi/response/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChooseContactsInfoResponse {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(20))};
    public final List a;

    public /* synthetic */ ChooseContactsInfoResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChooseContactsInfoResponse) && jl40.l(this.a, ((ChooseContactsInfoResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ChooseContactsInfoResponse(contacts=", Extension.C_BRAKE, this.a);
    }

    public ChooseContactsInfoResponse(List list) {
        this.a = list;
    }

    public ChooseContactsInfoResponse() {
        this(EmptyList.a);
    }
}
