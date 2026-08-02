package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class onv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ onv0(int i, Object obj, izs izsVar) {
        this.b = i;
        this.c = izsVar;
        this.d = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(((exm0) this.d).c);
                break;
            default:
                this.c.invoke(new wqs0.f.b((BlockId.CompositeId) this.d));
                break;
        }
        return s3q0.a;
    }
}
