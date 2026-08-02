package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fqi implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fqi(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                gqi.a((xvy) this.d, (gzs) this.e, (ffs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(7);
                lzk.f((q630) this.d, this.c, (izs) this.e, (vxk) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                String str = (String) this.d;
                gzs gzsVar = (gzs) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                cg70.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((gab0) this.d).a((spg0) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((d.b) this.d).a((spg0) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fqi(q630 q630Var, int i, izs izsVar, vxk vxkVar, int i2) {
        this.b = 1;
        this.d = q630Var;
        this.c = i;
        this.e = izsVar;
        this.f = vxkVar;
    }
}
