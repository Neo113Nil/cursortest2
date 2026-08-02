package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.tba0;

/* compiled from: PhotoTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class sba0 extends vif0<tba0.a> {
    public final TextView n;

    public sba0(View view) {
        super(view);
        this.n = (TextView) view.findViewById(R.id.counter);
    }

    @Override // xsna.vif0
    public final void i6(tba0.a aVar) {
        int i = aVar.a;
        this.n.setText(a6(R.plurals.profile_photo_tags_count, i, Integer.valueOf(i)));
    }
}
