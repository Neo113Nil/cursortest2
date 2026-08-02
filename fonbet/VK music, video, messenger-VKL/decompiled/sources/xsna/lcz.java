package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LinkView.kt */
/* loaded from: classes7.dex */
public final class lcz extends zcz {
    public final View A;

    public lcz(Context context, ViewGroup viewGroup, boolean z) {
        super(context, viewGroup, false, z);
        this.A = viewGroup.findViewById(R.id.update_link_progress_view);
    }

    @Override // xsna.zcz
    public final void a() {
        bwt0.p0(this.k, true);
        bwt0.p0(this.A, false);
    }

    @Override // xsna.zcz
    public final void c() {
        bwt0.p0(this.k, false);
        bwt0.p0(this.A, true);
    }
}
