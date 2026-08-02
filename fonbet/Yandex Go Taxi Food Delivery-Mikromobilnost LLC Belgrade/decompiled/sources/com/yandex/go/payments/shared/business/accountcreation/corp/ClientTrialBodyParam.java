package com.yandex.go.payments.shared.business.accountcreation.corp;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.z2c;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/ClientTrialBodyParam;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClientTrialBodyParam {
    public static final a Companion = new a();
    public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(0))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Map h;

    public /* synthetic */ ClientTrialBodyParam(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        if (127 != (i2 & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i2, HProv.PP_VERSION_TIMESTAMP, ClientTrialBodyParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        if ((i2 & 128) == 0) {
            this.h = kotlin.collections.b.f();
        } else {
            this.h = map;
        }
    }

    public ClientTrialBodyParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = map;
    }
}
