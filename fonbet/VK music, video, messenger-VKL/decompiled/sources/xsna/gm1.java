package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: AlbumSettingsCounterAdapter.kt */
/* loaded from: classes4.dex */
public final class gm1 extends vif0<rxj> {
    public final TextView n;

    public gm1(View view) {
        super(view);
        this.n = (TextView) view.findViewById(R.id.tv_count);
    }

    @Override // xsna.vif0
    public final void i6(rxj rxjVar) {
        this.n.setText(enj.f(R.plurals.photo_album_count, rxjVar.a, this.itemView.getContext()));
    }
}
