package xsna;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.yandex.div.internal.widget.SwitchView;
import xsna.mcz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qcz implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qcz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                ((zcz) this.c).e.onNext(new mcz.d(z));
                break;
            case 1:
                CheckBox checkBox = ((MarketEditAlbumCoverFragment) this.c).V;
                if (checkBox == null) {
                    checkBox = null;
                }
                checkBox.setEnabled(!z);
                break;
            default:
                SwitchView.setOnCheckedChangeListener$lambda$2((izs) this.c, compoundButton, z);
                break;
        }
    }
}
