package defpackage;

import com.yandex.go.taxi.order.change.source.interactor.b0;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes14.dex */
public final class k821 extends ad5 {
    public final eg01 A;
    public final i3y B;
    public final String C;
    public r821 D;
    public final b0 x;
    public final d821 y;
    public final cc9 z;

    public k821(b0 b0Var, d821 d821Var, cc9 cc9Var, eg01 eg01Var) {
        super(j821.class);
        this.x = b0Var;
        this.y = d821Var;
        this.z = cc9Var;
        this.A = eg01Var;
        this.B = a.b(LazyThreadSafetyMode.NONE, new z121(8));
        this.C = UUID.randomUUID().toString();
    }

    public final void Kg(boolean z) {
        r821 r821Var = this.D;
        r821 r821Var2 = r821Var != null ? new r821(r821Var.a, r821Var.b, r821Var.c, z) : null;
        if (r821Var2 != null) {
            ((j821) Dg()).render(r821Var2);
        }
    }
}
