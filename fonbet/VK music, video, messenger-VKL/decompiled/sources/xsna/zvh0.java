package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: SearchLoadingDelegate.kt */
/* loaded from: classes7.dex */
public final class zvh0 extends p1u0<awh0> {

    /* compiled from: SearchLoadingDelegate.kt */
    public static final class a extends vfz<awh0> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(awh0 awh0Var) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends awh0> b(ViewGroup viewGroup) {
        return new a(tf3.b(viewGroup, R.layout.vk_view_default_list_loading, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof awh0;
    }
}
