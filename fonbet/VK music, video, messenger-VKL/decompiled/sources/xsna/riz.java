package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.design.compose.header.b;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.e95;
import xsna.kja0;
import xsna.ma5;
import xsna.r95;
import xsna.wkj;

/* compiled from: LiveCoverAvatarSlotImpl.kt */
/* loaded from: classes5.dex */
public final class riz implements e95.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public riz(b.C1661b c1661b, la5 la5Var, ka5 ka5Var, lja0 lja0Var, float f, boolean z) {
        this.a = androidx.compose.runtime.k.b(c1661b);
        this.b = androidx.compose.runtime.k.b(la5Var);
        this.c = androidx.compose.runtime.k.b(ka5Var);
        this.d = androidx.compose.runtime.k.b(lja0Var);
        this.e = cq.f(f);
        this.f = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        Object bVar;
        androidx.compose.runtime.a M = aVar.M(-207262095);
        int i2 = (i & 6) == 0 ? (M.J(q630Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-207262095, i2, -1, "com.vk.profile.design.compose.header.header.LiveCoverAvatarSlotImpl.Content (LiveCoverAvatarSlotImpl.kt:43)");
            }
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            izs izsVar = (izs) M.r(h85.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            wh50 wh50Var2 = this.a;
            ?? r10 = ((b.C1661b) ((zak0) wh50Var2).getValue()).a;
            ArrayList arrayList = new ArrayList();
            for (r95 r95Var : r10) {
                if (r95Var instanceof r95.a) {
                    r95.a aVar2 = (r95.a) r95Var;
                    String str = aVar2.a;
                    bVar = new ma5.a(str, str, aVar2.b, aVar2.c);
                } else {
                    if (!(r95Var instanceof r95.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new ma5.b((r95.b) r95Var);
                }
                arrayList.add(bVar);
            }
            int i3 = i2;
            eb5 eb5Var = new eb5((la5) ((zak0) this.b).getValue(), (ka5) ((zak0) this.c).getValue());
            float f = ((pco) ((zak0) this.e).getValue()).b;
            lja0 lja0Var = (lja0) ((zak0) this.d).getValue();
            kja0.c cVar = kja0.c.a;
            ((b.C1661b) ((zak0) wh50Var2).getValue()).getClass();
            ((b.C1661b) ((zak0) wh50Var2).getValue()).getClass();
            fb5 fb5Var = new fb5(f, wkj.a.a, lja0Var, cVar, true, (!((b.C1661b) ((zak0) wh50Var2).getValue()).c || arrayList.size() <= 1) ? null : 6000L, ((Boolean) ((zak0) this.f).getValue()).booleanValue(), ((Boolean) wh50Var.getValue()).booleanValue());
            cl8 cl8Var = booleanValue ? new cl8(new y7z(e43.l(new l5g(l5g.g), new l5g(l5g.i)), null, 0L, 9187343241974906880L, 0)) : null;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new w3i(3, wh50Var);
                M.R(x2);
            }
            xa5.b(arrayList, eb5Var, fb5Var, izsVar, q630Var, cl8Var, (izs) x2, M, ((i3 << 12) & 57344) | 1835008, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qiz(this, q630Var, i, 0);
        }
    }
}
