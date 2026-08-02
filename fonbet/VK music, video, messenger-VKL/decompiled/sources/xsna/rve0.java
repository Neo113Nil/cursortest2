package xsna;

import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import com.vk.music.player.api.BottomPlayerAppearance;
import xsna.dll0;
import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rve0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Enum g;

    public /* synthetic */ rve0(Object obj, Object obj2, Enum r3, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = r3;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                awe0.c((dz40.r) this.e, (f3b0) this.f, (BottomPlayerAppearance) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                bll0.b((qa8) this.e, (dll0.a.b) this.f, (LoadingState) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
