package com.yandex.go.xiva.data;

import defpackage.gsq0;
import defpackage.qje;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/xiva/data/XivaTokenClient;", "", "Companion", "$serializer", "com/yandex/go/xiva/data/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class XivaTokenClient {
    public static final c Companion = new c();
    public final String a;
    public final String b;

    public /* synthetic */ XivaTokenClient(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, XivaTokenClient$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = ConstantDeviceInfo.APP_PLATFORM;
        } else {
            this.b = str2;
        }
    }

    public XivaTokenClient(String str) {
        this.a = str;
        this.b = ConstantDeviceInfo.APP_PLATFORM;
    }
}
