package xsna;

import java.util.Arrays;
import java.util.Objects;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bJ;

/* compiled from: DropDuplicatePacketsFilter.java */
/* loaded from: classes8.dex */
public final class ogy0 extends mgy0 {
    public final a[] b;

    /* compiled from: DropDuplicatePacketsFilter.java */
    public class a {
        public final int a;
        public final long[] b;

        public a(int i) {
            this.a = i;
            long[] jArr = new long[i];
            this.b = jArr;
            Arrays.fill(jArr, -1L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogy0(rgy0 rgy0Var) {
        super(rgy0Var);
        int[] iArr = {32, 32, 1024};
        this.b = new a[aG.values().length];
        for (aG aGVar : aG.values()) {
            this.b[aGVar.ordinal()] = new a(iArr[aGVar.ordinal()]);
        }
    }

    @Override // xsna.hly0
    public final void a(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) throws bJ {
        if (tly0Var.o() != null) {
            a aVar = this.b[tly0Var.o().ordinal()];
            Long p = tly0Var.p();
            int longValue = (int) (p.longValue() % aVar.a);
            long longValue2 = p.longValue();
            long[] jArr = aVar.b;
            if (longValue2 <= jArr[longValue]) {
                Objects.toString(tly0Var);
                return;
            }
            jArr[longValue] = p.longValue();
        }
        b(tly0Var, cVar);
    }
}
