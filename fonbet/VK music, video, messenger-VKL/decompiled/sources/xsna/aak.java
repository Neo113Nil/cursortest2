package xsna;

import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import xsna.oy20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class aak implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aak(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                bak.b((String) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                jjz.a((kjz) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                oy20.a.b.a(this.c, (oy20.a) this.e, (androidx.compose.runtime.a) obj, I3);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int I4 = ne7.I(this.d | 1);
                ((m8d0) this.e).a(this.c, (androidx.compose.runtime.a) obj, I4);
                break;
            default:
                ((Integer) obj2).getClass();
                int I5 = ne7.I(this.d | 1);
                tfj0.b((ShortVideoListView.e) this.e, this.c, (androidx.compose.runtime.a) obj, I5);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ aak(q630 q630Var, oy20.a aVar, int i) {
        this.b = 2;
        this.c = q630Var;
        this.e = aVar;
        this.d = i;
    }
}
