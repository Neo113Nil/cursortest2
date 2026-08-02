package com.yandex.go.xiva.data;

import com.yandex.go.xiva.domain.model.XivaToken;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/xiva/data/XivaTokenResult;", "", "Companion", "$serializer", "com/yandex/go/xiva/data/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class XivaTokenResult {
    public static final e Companion = new e();
    public final XivaToken a;

    public /* synthetic */ XivaTokenResult(int i, XivaToken xivaToken) {
        if (1 == (i & 1)) {
            this.a = xivaToken;
        } else {
            qje.Z(i, 1, XivaTokenResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* renamed from: a, reason: from getter */
    public final XivaToken getA() {
        return this.a;
    }
}
