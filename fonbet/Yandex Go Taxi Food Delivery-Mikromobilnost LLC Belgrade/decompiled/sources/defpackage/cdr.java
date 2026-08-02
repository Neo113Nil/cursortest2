package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final class cdr implements z910 {
    public final /* synthetic */ yx40 a;
    public final /* synthetic */ a b;

    public cdr(yx40 yx40Var, a aVar) {
        this.a = yx40Var;
        this.b = aVar;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        int i = ((x910) list.get(0)).l0(j).b;
        this.a.setIntValue(i);
        int floatValue = (int) ((Number) this.b.e()).floatValue();
        int i2 = floatValue == 0 ? i : floatValue;
        o l0 = ((x910) list.get(1)).l0(n8e.b(0, j, 0, i2, i2, 3));
        w = kVar.w(l0.a, i2, b.f(), new q83(l0, 4));
        return w;
    }
}
