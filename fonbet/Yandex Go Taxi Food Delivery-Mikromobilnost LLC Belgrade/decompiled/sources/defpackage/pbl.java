package defpackage;

import android.database.Cursor;
import com.yandex.div.storage.database.c;
import ru.yandex.taxi.layers.presentation.pickup.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class pbl implements yvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pbl(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return (Cursor) ((tls) obj).invoke((c.b) obj2);
            default:
                bqb0 bqb0Var = (bqb0) ((tt) obj2).m;
                return new b(bqb0Var.a, (xm00) obj, bqb0Var.b, bqb0Var.c, bqb0Var.d, bqb0Var.e);
        }
    }
}
