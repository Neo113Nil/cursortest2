package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e39 {
    public final o39 a;
    public final Text b;
    public final MoneyEntity c;
    public final Text d;
    public final List e;
    public final a5b1 f;

    public e39(o39 o39Var, Text text, MoneyEntity moneyEntity, Text text2, List list, a5b1 a5b1Var) {
        this.a = o39Var;
        this.b = text;
        this.c = moneyEntity;
        this.d = text2;
        this.e = list;
        this.f = a5b1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.ybsdk.core.utils.text.Text] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.ybsdk.core.utils.text.Text] */
    public static e39 a(e39 e39Var, o39 o39Var, Text.Constant constant, MoneyEntity moneyEntity, Text.Constant constant2, ListBuilder listBuilder, a5b1 a5b1Var, int i) {
        if ((i & 1) != 0) {
            o39Var = e39Var.a;
        }
        o39 o39Var2 = o39Var;
        Text.Constant constant3 = constant;
        if ((i & 2) != 0) {
            constant3 = e39Var.b;
        }
        Text.Constant constant4 = constant3;
        if ((i & 4) != 0) {
            moneyEntity = e39Var.c;
        }
        MoneyEntity moneyEntity2 = moneyEntity;
        Text.Constant constant5 = constant2;
        if ((i & 8) != 0) {
            constant5 = e39Var.d;
        }
        Text.Constant constant6 = constant5;
        ListBuilder listBuilder2 = listBuilder;
        if ((i & 16) != 0) {
            listBuilder2 = e39Var.e;
        }
        ListBuilder listBuilder3 = listBuilder2;
        if ((i & 32) != 0) {
            a5b1Var = e39Var.f;
        }
        e39Var.getClass();
        return new e39(o39Var2, constant4, moneyEntity2, constant6, listBuilder3, a5b1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e39)) {
            return false;
        }
        e39 e39Var = (e39) obj;
        return jl40.l(this.a, e39Var.a) && jl40.l(this.b, e39Var.b) && jl40.l(this.c, e39Var.c) && jl40.l(this.d, e39Var.d) && jl40.l(this.e, e39Var.e) && jl40.l(this.f, e39Var.f);
    }

    public final int hashCode() {
        o39 o39Var = this.a;
        int c = n.c(this.b, (o39Var == null ? 0 : o39Var.hashCode()) * 31, 31);
        MoneyEntity moneyEntity = this.c;
        return this.f.hashCode() + unr0.c(n.c(this.d, (c + (moneyEntity != null ? moneyEntity.hashCode() : 0)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "CashbackDashboardState(lastCashbackEntity=" + this.a + ", cashbackTitle=" + this.b + ", cashbackAmount=" + this.c + ", dashboardDescription=" + this.d + ", items=" + this.e + ", state=" + this.f + Extension.C_BRAKE;
    }

    public e39() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e39(int i) {
        this(null, r2, null, r2, EmptyList.a, yep0.a);
        Text.Empty empty = Text.Empty.INSTANCE;
    }
}
