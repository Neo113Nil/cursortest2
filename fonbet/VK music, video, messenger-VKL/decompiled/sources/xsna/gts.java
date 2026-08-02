package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: FriendsSelectionAdapter.kt */
/* loaded from: classes15.dex */
public final class gts extends vif0<nqs> {
    public final /* synthetic */ axu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gts(axu axuVar, View view) {
        super(view);
        this.n = axuVar;
    }

    @Override // xsna.vif0
    public final void i6(nqs nqsVar) {
        axu axuVar = this.n;
        axuVar.V5(axuVar.itemView.getContext().getString(R.string.search_global));
    }
}
