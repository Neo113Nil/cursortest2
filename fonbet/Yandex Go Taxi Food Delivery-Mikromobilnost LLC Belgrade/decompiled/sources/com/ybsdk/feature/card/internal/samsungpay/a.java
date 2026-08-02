package com.ybsdk.feature.card.internal.samsungpay;

import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import defpackage.gzl0;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a {
    public final SamsungPayState.InitializationResult a;
    public final List b;
    public final gzl0 c;

    public a(SamsungPayState.InitializationResult initializationResult, List list, gzl0 gzl0Var) {
        this.a = initializationResult;
        this.b = list;
        this.c = gzl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        gzl0 gzl0Var = this.c;
        return c + (gzl0Var == null ? 0 : gzl0Var.hashCode());
    }

    public final String toString() {
        return "SamsungInitialData(initializationResult=" + this.a + ", cardIds=" + this.b + ", walletInfoResult=" + this.c + Extension.C_BRAKE;
    }

    public /* synthetic */ a(SamsungPayState.InitializationResult initializationResult) {
        this(initializationResult, EmptyList.a, null);
    }
}
