package com.yandex.go.flex.common.descriptors.action;

import defpackage.dmr;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/descriptors/action/MarkNotifyAction;", "Ldmr;", "Companion", "$serializer", "com/yandex/go/flex/common/descriptors/action/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarkNotifyAction extends dmr {
    public static final e Companion = new e();
    public final kotlinx.serialization.json.b a;

    public MarkNotifyAction(int i, kotlinx.serialization.json.b bVar) {
        if (1 == (i & 1)) {
            this.a = bVar;
        } else {
            qje.Z(i, 1, MarkNotifyAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarkNotifyAction) && jl40.l(this.a, ((MarkNotifyAction) obj).a);
    }

    public final int hashCode() {
        kotlinx.serialization.json.b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "MarkNotifyAction(payload=" + this.a + Extension.C_BRAKE;
    }
}
