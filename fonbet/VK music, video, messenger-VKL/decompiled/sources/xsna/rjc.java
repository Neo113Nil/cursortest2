package xsna;

import android.view.View;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.music.MusicTrack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rjc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rjc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                s6o s6oVar = (s6o) this.c;
                sjc sjcVar = (sjc) this.d;
                s6oVar.e.onClick(view);
                sjcVar.d.reset();
                sjcVar.e = null;
                sjcVar.b.invalidate();
                break;
            case 1:
                na50 na50Var = (na50) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                izs<MusicTrack, s3q0> izsVar = na50Var.n.e;
                if (izsVar != null) {
                    izsVar.invoke(musicTrack);
                    break;
                }
                break;
            default:
                ((ProfileGiftsFragment.b) this.c).q6(((GiftItem) this.d).k);
                break;
        }
    }
}
