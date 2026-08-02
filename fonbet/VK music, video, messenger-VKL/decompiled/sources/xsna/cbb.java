package xsna;

import android.content.Context;
import com.vk.music.player.LoopMode;
import java.util.Collections;

/* compiled from: ChannelReadChangesMerger.kt */
/* loaded from: classes2.dex */
public final class cbb implements nk50, izn, nya0, dwz0 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ cbb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.nya0
    public LoopMode a() {
        return ((hya0) this.c).a.n0();
    }

    @Override // xsna.nya0
    public void b(LoopMode loopMode) {
        ((hya0) this.c).a.b(loopMode);
    }

    @Override // xsna.nk50
    public ovj c() {
        return (ovj) this.c;
    }

    @Override // xsna.nya0
    public void d(boolean z) {
        hya0 hya0Var = (hya0) this.c;
        hya0Var.a.d(z);
        hya0Var.a.M0(z);
    }

    @Override // xsna.izn
    public void e(yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2125477765);
        if ((i & 6) == 0) {
            i2 = (M.y(yzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2125477765, i2, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackContent.kt:127)");
            }
            yzsVar.invoke(Integer.valueOf(((rg50) this.c).getIntValue()), M, Integer.valueOf((i2 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g4o(this, yzsVar, i, 0);
        }
    }

    public boolean f(final int i, final long j) {
        return ((Boolean) ((xgl0) this.c).u(new izs() { // from class: xsna.bbb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                boolean z;
                int i2;
                uib a = ((xgl0) obj).a();
                long j2 = j;
                bdb bdbVar = a.d(Collections.singletonList(Long.valueOf(j2))).get(Long.valueOf(j2));
                if (bdbVar != null && (i2 = bdbVar.e) > bdbVar.d && i2 == i) {
                    a.w(j2);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    @Override // xsna.dwz0
    public Object zza() {
        switch (this.b) {
            case 7:
                return (Context) ((mbl) this.c).b;
            default:
                return new sp01((Context) ((mbl) ((cbb) this.c).c).b);
        }
    }

    public cbb(eml emlVar) {
        this.b = 1;
        this.c = (ovj) emlVar.b;
    }

    public cbb() {
        this.b = 2;
        this.c = new yd10();
    }
}
