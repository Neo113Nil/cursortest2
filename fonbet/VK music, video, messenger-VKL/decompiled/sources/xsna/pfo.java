package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pfo implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pfo(String str, boolean z, q630 q630Var, int i) {
        this.d = str;
        this.c = z;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(385);
                sfo.b(this.c, (BlockId) this.d, (jai) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                String str = (String) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.product_info.e.b(ne7.I(1), (androidx.compose.runtime.a) obj, str, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pfo(boolean z, BlockId blockId, jai jaiVar, int i) {
        this.c = z;
        this.d = blockId;
        this.e = jaiVar;
    }
}
