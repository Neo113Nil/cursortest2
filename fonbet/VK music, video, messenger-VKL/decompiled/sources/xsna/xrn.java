package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: DividerItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class xrn extends p1u0<wrn> {

    /* compiled from: DividerItemAdapterDelegate.kt */
    public static final class a extends vfz<wrn> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(wrn wrnVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends wrn> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.im_channel_item_separator, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof wrn;
    }
}
