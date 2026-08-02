package xsna;

import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import java.util.List;

/* compiled from: VkFriendsPickerPresenter.kt */
/* loaded from: classes6.dex */
public final class iwu0 implements c.l<List<? extends WebUserShortInfo>> {
    public final VkFriendsPickerActivity b;
    public final long c;
    public boolean e;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public String f = "";
    public final ListDataSet<jtx> g = new ListDataSet<>();

    public iwu0(VkFriendsPickerActivity vkFriendsPickerActivity, long j) {
        this.b = vkFriendsPickerActivity;
        this.c = j;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<WebUserShortInfo>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends WebUserShortInfo>> ui(int i, com.vk.lists.c cVar) {
        if (this.c != 0) {
            vdx0 vdx0Var = e370.e;
            return (vdx0Var != null ? vdx0Var : null).d().g(i, this.c, cVar.k(), this.f);
        }
        vdx0 vdx0Var2 = e370.e;
        (vdx0Var2 != null ? vdx0Var2 : null).getClass();
        return ((ffn0) vdx0.h.getValue()).a(i, cVar.k());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<WebUserShortInfo>> qVar, boolean z, com.vk.lists.c cVar) {
        this.d.b(qVar.subscribe(new pd40(new vx30(z, this, cVar), 21), new le50(new yyl0(this, 20), 26)));
    }
}
