package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionSwitchAccount;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fk50(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UIBlockActionSwitchAccount uIBlockActionSwitchAccount;
        switch (this.b) {
            case 0:
                yzt0 yzt0Var = (yzt0) this.c;
                kvi kviVar = (kvi) this.d;
                yzt0Var.b(new g22(21, (wh50) this.e, (wh50) this.f), kviVar);
                return new ik50(kviVar);
            default:
                nq8 nq8Var = (nq8) this.c;
                bi20 bi20Var = (bi20) this.d;
                MusicOwner musicOwner = (MusicOwner) obj;
                Iterator it = nq8Var.a((CatalogExtendedData) this.f, ((CatalogBlock) this.e).j, bi20Var).iterator();
                while (true) {
                    if (it.hasNext()) {
                        uIBlockActionSwitchAccount = it.next();
                        if (((UIBlockAction) uIBlockActionSwitchAccount) instanceof UIBlockActionSwitchAccount) {
                        }
                    } else {
                        uIBlockActionSwitchAccount = 0;
                    }
                }
                return new UIBlockMusicOwner(bi20Var.b(), bi20Var.o, musicOwner, uIBlockActionSwitchAccount instanceof UIBlockActionSwitchAccount ? uIBlockActionSwitchAccount : null);
        }
    }
}
