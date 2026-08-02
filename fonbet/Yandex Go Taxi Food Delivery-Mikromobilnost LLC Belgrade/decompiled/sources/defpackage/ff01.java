package defpackage;

import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionsListShimmerType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ff01 {
    public final TransactionsFeedFilterEntity a;
    public final List b;
    public final boolean c;
    public final u8j0 d;
    public final ppl e;
    public final TransactionsState f;
    public final boolean g;
    public final TransactionsListShimmerType h;
    public final Throwable i;
    public final int j;
    public final boolean k;

    public ff01(TransactionsFeedFilterEntity transactionsFeedFilterEntity, List list, boolean z, u8j0 u8j0Var, ppl pplVar, TransactionsState transactionsState, boolean z2, TransactionsListShimmerType transactionsListShimmerType, Throwable th, int i, boolean z3) {
        this.a = transactionsFeedFilterEntity;
        this.b = list;
        this.c = z;
        this.d = u8j0Var;
        this.e = pplVar;
        this.f = transactionsState;
        this.g = z2;
        this.h = transactionsListShimmerType;
        this.i = th;
        this.j = i;
        this.k = z3;
    }

    public static ff01 a(ff01 ff01Var, TransactionsFeedFilterEntity transactionsFeedFilterEntity, u8j0 u8j0Var, ppl pplVar, TransactionsState transactionsState, boolean z, TransactionsListShimmerType transactionsListShimmerType, Throwable th, int i, int i2) {
        if ((i2 & 1) != 0) {
            transactionsFeedFilterEntity = ff01Var.a;
        }
        TransactionsFeedFilterEntity transactionsFeedFilterEntity2 = transactionsFeedFilterEntity;
        List list = ff01Var.b;
        boolean z2 = ff01Var.c;
        u8j0 u8j0Var2 = (i2 & 8) != 0 ? ff01Var.d : u8j0Var;
        ppl pplVar2 = (i2 & 16) != 0 ? ff01Var.e : pplVar;
        TransactionsState transactionsState2 = (i2 & 32) != 0 ? ff01Var.f : transactionsState;
        boolean z3 = (i2 & 64) != 0 ? ff01Var.g : z;
        TransactionsListShimmerType transactionsListShimmerType2 = (i2 & 128) != 0 ? ff01Var.h : transactionsListShimmerType;
        Throwable th2 = (i2 & 256) != 0 ? ff01Var.i : th;
        int i3 = (i2 & 512) != 0 ? ff01Var.j : i;
        boolean z4 = ff01Var.k;
        ff01Var.getClass();
        return new ff01(transactionsFeedFilterEntity2, list, z2, u8j0Var2, pplVar2, transactionsState2, z3, transactionsListShimmerType2, th2, i3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff01)) {
            return false;
        }
        ff01 ff01Var = (ff01) obj;
        return jl40.l(this.a, ff01Var.a) && this.b.equals(ff01Var.b) && this.c == ff01Var.c && this.d.equals(ff01Var.d) && jl40.l(this.e, ff01Var.e) && this.f == ff01Var.f && this.g == ff01Var.g && this.h == ff01Var.h && jl40.l(this.i, ff01Var.i) && this.j == ff01Var.j && this.k == ff01Var.k;
    }

    public final int hashCode() {
        TransactionsFeedFilterEntity transactionsFeedFilterEntity = this.a;
        int hashCode = (this.d.hashCode() + unr0.e(unr0.c((transactionsFeedFilterEntity == null ? 0 : transactionsFeedFilterEntity.hashCode()) * 31, 31, this.b), 31, this.c)) * 31;
        ppl pplVar = this.e;
        int hashCode2 = (this.h.hashCode() + unr0.e((this.f.hashCode() + ((hashCode + (pplVar == null ? 0 : pplVar.hashCode())) * 31)) * 31, 31, this.g)) * 31;
        Throwable th = this.i;
        return Boolean.hashCode(this.k) + oyr.b(this.j, (hashCode2 + (th != null ? th.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransactionsFeedScreenState(filter=");
        sb.append(this.a);
        sb.append(", bottomBarItems=");
        sb.append(this.b);
        sb.append(", isBottomBarDisplayed=");
        sb.append(this.c);
        sb.append(", filtersRequest=");
        sb.append(this.d);
        sb.append(", transactionsListDivData=");
        sb.append(this.e);
        sb.append(", transactionsState=");
        sb.append(this.f);
        sb.append(", isRefreshing=");
        sb.append(this.g);
        sb.append(", transactionsListShimmerType=");
        sb.append(this.h);
        sb.append(", transactionListError=");
        sb.append(this.i);
        sb.append(", transactionsListLoadDepth=");
        sb.append(this.j);
        sb.append(", hideFilters=");
        return x4e.i(sb, this.k, Extension.C_BRAKE);
    }
}
