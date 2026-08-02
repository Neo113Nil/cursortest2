package xsna;

import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import kotlin.NoWhenBranchMatchedException;
import xsna.g1e0;
import xsna.pdg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tgb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tgb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        Object obj;
        switch (this.b) {
            case 0:
                wgb wgbVar = (wgb) this.c;
                f1e0 f1e0Var = (f1e0) this.d;
                wgbVar.b.a(new g4(7, wgbVar, f1e0Var));
                uvf0 uvf0Var = wgbVar.i;
                g1e0.a aVar = new g1e0.a();
                aVar.g(f1e0Var);
                aVar.j(Source.NETWORK);
                aVar.a();
                aVar.c("ProfilesRemoteDataSource");
                pdg0 n = uvf0Var.a.n(uvf0Var, new d1e0(aVar.b()));
                if (n instanceof pdg0.a) {
                    obj = new ProfilesInfo();
                } else {
                    if (!(n instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = ((pdg0.b) n).a;
                }
                wgbVar.b(new jy5((ProfilesInfo) obj, wgbVar, f1e0Var, 1));
                return;
            case 1:
                swj swjVar = (swj) this.c;
                swjVar.c.remove((String) this.d);
                return;
            default:
                VkSearchView vkSearchView = (VkSearchView) this.c;
                vkSearchView.getEditView().removeTextChangedListener((yxh0) this.d);
                return;
        }
    }
}
