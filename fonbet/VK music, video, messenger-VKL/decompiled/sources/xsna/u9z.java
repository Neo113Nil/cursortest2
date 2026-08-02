package xsna;

import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import java.util.List;
import xsna.kb70;
import xsna.oy20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u9z implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u9z(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((w9z) this.d).ho((wh50) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                un20.g((kb70.d) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oy20.c.a((q630) this.d, (oy20) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                zc70.b((List) this.d, (yjl) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 4:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                nxf0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                tfj0.c((ShortVideoListView.e) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ u9z(List list, yjl yjlVar, int i, int i2) {
        this.b = 3;
        this.d = list;
        this.e = yjlVar;
        this.c = i;
    }
}
