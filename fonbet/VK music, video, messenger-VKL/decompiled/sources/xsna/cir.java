package xsna;

import android.graphics.drawable.Drawable;
import com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cir implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cir(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mir mirVar = (mir) obj2;
                if (((Boolean) obj).booleanValue()) {
                    zjr a = ((yuf0) vhr.d().b(yuf0.class)).a("firebase");
                    mirVar.c = a;
                    mirVar.e(a);
                    zjr zjrVar = mirVar.c;
                    if (zjrVar == null) {
                        zjrVar = null;
                    }
                    mirVar.e(zjrVar);
                }
                return s3q0.a;
            case 1:
                return zjt.U((zjt) obj2, (Drawable) obj);
            default:
                VKApplication.a aVar = VKApplication.c;
                ((CatalogVideoViewComponent) obj2).T8((cg50) obj);
                return s3q0.a;
        }
    }
}
