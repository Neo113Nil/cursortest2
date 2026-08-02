package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;

/* loaded from: classes14.dex */
public final class i431 extends ViewPager2.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ VaultsPagerView b;

    public i431(VaultsPagerView vaultsPagerView, int i) {
        this.a = i;
        this.b = vaultsPagerView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        boolean tryPerformVaultClick;
        v2y v2yVar;
        if (i == 0) {
            int i2 = this.a;
            VaultsPagerView vaultsPagerView = this.b;
            tryPerformVaultClick = vaultsPagerView.tryPerformVaultClick(i2);
            if (tryPerformVaultClick) {
                v2yVar = vaultsPagerView.binding;
                v2yVar.d.unregisterOnPageChangeCallback(this);
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        v2y v2yVar;
        int i2 = this.a;
        if (i == i2) {
            VaultsPagerView vaultsPagerView = this.b;
            v2yVar = vaultsPagerView.binding;
            v2yVar.d.unregisterOnPageChangeCallback(this);
            vaultsPagerView.tryPerformVaultClick(i2);
        }
    }
}
