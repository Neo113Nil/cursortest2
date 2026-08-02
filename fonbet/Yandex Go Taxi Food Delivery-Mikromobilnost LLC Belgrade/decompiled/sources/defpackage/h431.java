package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import java.util.List;

/* loaded from: classes14.dex */
public final class h431 extends ViewPager2.a {
    public final /* synthetic */ VaultsPagerView a;

    public h431(VaultsPagerView vaultsPagerView) {
        this.a = vaultsPagerView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        l431 l431Var;
        v2y v2yVar;
        v2y v2yVar2;
        super.onPageSelected(i);
        VaultsPagerView vaultsPagerView = this.a;
        l431Var = vaultsPagerView.data;
        if (l431Var == null) {
            return;
        }
        List list = l431Var.a;
        vaultsPagerView.position = i;
        if (list.size() <= i) {
            return;
        }
        v2yVar = vaultsPagerView.binding;
        v2yVar.b.setVisibility(i != 0 ? 0 : 8);
        v2yVar2 = vaultsPagerView.binding;
        v2yVar2.c.setVisibility(i != list.size() + (-1) ? 0 : 8);
    }
}
