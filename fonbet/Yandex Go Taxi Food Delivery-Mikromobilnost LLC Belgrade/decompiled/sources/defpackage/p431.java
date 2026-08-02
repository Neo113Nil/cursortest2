package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;

/* loaded from: classes12.dex */
public final class p431 extends wys {
    public final VaultsPagerView R;

    public p431(VaultsPagerView vaultsPagerView) {
        super(vaultsPagerView);
        this.R = vaultsPagerView;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        l431 l431Var = ((k431) obj).c;
        if (l431Var != null) {
            this.R.bind(l431Var);
        }
    }
}
