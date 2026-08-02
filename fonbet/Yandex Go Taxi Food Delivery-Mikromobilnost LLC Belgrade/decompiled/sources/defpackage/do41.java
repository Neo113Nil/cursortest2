package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class do41 {
    public final String a;
    public final ArrayList b = new ArrayList();

    public do41(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final pw50 b(ao41 ao41Var) {
        this.b.add(ao41Var);
        return new pw50(3, this, ao41Var);
    }
}
