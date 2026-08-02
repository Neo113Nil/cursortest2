package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.rsf;
import defpackage.unr0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtStatusesParam;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtStatusesParam {
    public static final s Companion = new s();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(21)), null};
    public final boolean a;
    public final List b;
    public final zzs c;

    public /* synthetic */ DebtStatusesParam(int i, boolean z, List list, zzs zzsVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, DebtStatusesParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtStatusesParam)) {
            return false;
        }
        DebtStatusesParam debtStatusesParam = (DebtStatusesParam) obj;
        return this.a == debtStatusesParam.a && jl40.l(this.b, debtStatusesParam.b) && jl40.l(this.c, debtStatusesParam.c);
    }

    public final int hashCode() {
        int c = unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        zzs zzsVar = this.c;
        return c + (zzsVar == null ? 0 : zzsVar.hashCode());
    }

    public final String toString() {
        return "DebtStatusesParam(isCashAvailable=" + this.a + ", availablePaymentMethods=" + this.b + ", location=" + this.c + Extension.C_BRAKE;
    }

    public DebtStatusesParam(zzs zzsVar, ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
        this.c = zzsVar;
    }
}
