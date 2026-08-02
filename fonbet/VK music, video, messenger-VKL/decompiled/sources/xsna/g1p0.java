package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.h1p0;

/* compiled from: TogglesAdapter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class g1p0 extends FunctionReferenceImpl implements izs<ViewGroup, h1p0.d> {
    public static final g1p0 b = new g1p0(1, h1p0.d.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

    @Override // xsna.izs
    public final h1p0.d invoke(ViewGroup viewGroup) {
        return new h1p0.d(R.layout.item_toggle_category, viewGroup);
    }
}
