package xsna;

import android.widget.CompoundButton;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import xsna.xn50;
import xsna.zw00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dx00 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dx00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = MarketEditAlbumCoverFragment.c0;
                xn50.a.c((MarketEditAlbumCoverFragment) obj, new zw00.a.C4205a(z));
                break;
            default:
                ((rnw0) obj).d.e().e().h(z);
                break;
        }
    }
}
