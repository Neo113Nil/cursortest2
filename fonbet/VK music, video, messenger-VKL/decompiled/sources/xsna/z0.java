package xsna;

import xsna.kb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class z0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ z0(Object obj, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = xzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) this.d;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                a1.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((zsl) this.d).c((com.vk.newsfeed.common.recycler.holders.attachments.a) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                gjs.a((kb70.c) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
