package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: ClipsExternalEventsAdapter.kt */
/* loaded from: classes.dex */
public final class c2e extends l5a {
    public final io.reactivex.rxjava3.disposables.b c;

    public c2e(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
    }

    public static void b(UIBlockList uIBlockList, bta btaVar) {
        for (UIBlock uIBlock : uIBlockList.Sb()) {
            btaVar.invoke(uIBlockList, uIBlock);
            if (uIBlock instanceof UIBlockList) {
                b((UIBlockList) uIBlock, btaVar);
            }
        }
    }

    @Override // xsna.l5a
    public final void a() {
        this.c.b(xwk.e().T().m().d.a0(asu0.a.d()).subscribe(new b2e(new a2e(this, 0), 0)));
    }
}
