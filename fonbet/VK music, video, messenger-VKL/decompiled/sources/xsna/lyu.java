package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ffj;

/* compiled from: HeaderViewHolder.kt */
/* loaded from: classes17.dex */
public final class lyu extends rxt0<ffj.b> {
    public final TextView l;

    public lyu(View view) {
        super(view);
        this.l = (TextView) view.findViewById(R.id.header);
    }

    @Override // xsna.rxt0
    public final void V5(ffj.b bVar) {
        bVar.getClass();
        this.l.setText((CharSequence) null);
    }
}
