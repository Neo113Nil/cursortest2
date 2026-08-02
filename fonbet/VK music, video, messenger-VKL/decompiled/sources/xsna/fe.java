package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.pgm;

/* compiled from: AbstractFakeDialogViewHolder.kt */
/* loaded from: classes18.dex */
public abstract class fe<T extends pgm> extends vfz<T> {
    public final bpn0 l;

    public fe(ViewGroup viewGroup) {
        super(R.layout.vh_dialog, viewGroup);
        this.l = new bpn0(new com.vk.movika.sdk.base.ui.t(this, 1));
    }

    public abstract int h6();

    public abstract int i6();
}
