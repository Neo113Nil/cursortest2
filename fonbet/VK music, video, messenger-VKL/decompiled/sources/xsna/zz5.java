package xsna;

import android.widget.CompoundButton;
import com.vk.balance.BalanceFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import xsna.xn50;
import xsna.zw00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class zz5 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FragmentImpl c;

    public /* synthetic */ zz5(int i, FragmentImpl fragmentImpl) {
        this.b = i;
        this.c = fragmentImpl;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        FragmentImpl fragmentImpl = this.c;
        switch (i) {
            case 0:
                int i2 = BalanceFragment.i0;
                uz5 uz5Var = (uz5) ((BalanceFragment) fragmentImpl).S;
                if (uz5Var != null) {
                    uz5Var.M4(z);
                    break;
                }
                break;
            default:
                int i3 = MarketEditAlbumCoverFragment.c0;
                xn50.a.c((MarketEditAlbumCoverFragment) fragmentImpl, new zw00.a.c(z));
                break;
        }
    }
}
