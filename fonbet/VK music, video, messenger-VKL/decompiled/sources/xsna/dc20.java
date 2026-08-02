package xsna;

import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.fragment.RestoreSearchFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dc20 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dc20(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ec20 ec20Var = (ec20) this.c;
                io.reactivex.rxjava3.subjects.a aVar = (io.reactivex.rxjava3.subjects.a) this.d;
                ec20Var.getClass();
                if (!aVar.N0()) {
                    aVar.onNext(obj);
                    aVar.onComplete();
                    break;
                }
                break;
            default:
                RestoreSearchFragment restoreSearchFragment = (RestoreSearchFragment) this.c;
                VkSearchView vkSearchView = (VkSearchView) this.d;
                restoreSearchFragment.e0.h5(((mru0) obj).a);
                vkSearchView.h5(true, !restoreSearchFragment.e0.I());
                break;
        }
    }
}
