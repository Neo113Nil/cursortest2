package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LoaderViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class ssz extends p1u0<asz> {

    /* compiled from: LoaderViewTypeDelegate.kt */
    public static final class a extends vfz<asz> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(asz aszVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends asz> b(ViewGroup viewGroup) {
        return new a(R.layout.vkim_dialogs_list_item_load, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof asz;
    }
}
