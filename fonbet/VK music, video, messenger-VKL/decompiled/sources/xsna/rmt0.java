package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.omt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rmt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rmt0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new omt0.d.b((BlockId) this.d));
                break;
            default:
                com.vk.writebar.d dVar = (com.vk.writebar.d) this.c;
                com.vk.writebar.g gVar = (com.vk.writebar.g) this.d;
                dVar.c = false;
                gVar.f = true;
                gVar.b.l0();
                h1y0 h1y0Var = gVar.d;
                if (h1y0Var != null) {
                    h1y0Var.c(false);
                }
                break;
        }
        return s3q0.a;
    }
}
