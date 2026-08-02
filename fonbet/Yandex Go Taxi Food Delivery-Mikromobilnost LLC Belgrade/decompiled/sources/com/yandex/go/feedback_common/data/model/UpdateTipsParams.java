package com.yandex.go.feedback_common.data.model;

import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feedback_common/data/model/UpdateTipsParams;", "", "Companion", "$serializer", "com/yandex/go/feedback_common/data/model/c", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdateTipsParams {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final Tips c;

    public /* synthetic */ UpdateTipsParams(int i, String str, String str2, Tips tips) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, UpdateTipsParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = tips;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTipsParams)) {
            return false;
        }
        UpdateTipsParams updateTipsParams = (UpdateTipsParams) obj;
        return jl40.l(this.a, updateTipsParams.a) && jl40.l(this.b, updateTipsParams.b) && jl40.l(this.c, updateTipsParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("UpdateTipsParams(launchId=", this.a, ", orderId=", this.b, ", tips=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public UpdateTipsParams(String str, String str2, Tips tips) {
        this.a = str;
        this.b = str2;
        this.c = tips;
    }
}
