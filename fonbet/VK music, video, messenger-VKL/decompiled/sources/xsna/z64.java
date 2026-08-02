package xsna;

import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import xsna.dz40;
import xsna.wpc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z64 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fm50 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z64(fm50 fm50Var, Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = fm50Var;
        this.f = obj;
        this.g = obj2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                p74.e((wpc0.a.C3948a) this.e, (tcc0) this.f, (PostEditingReason) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zk4.b((dz40.b) this.e, (f3b0) this.f, (BottomPlayerAppearance) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
