package xsna;

import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ifz;

/* compiled from: ListViewHolderSpectatorsCount.kt */
/* loaded from: classes7.dex */
public final class pgz extends kgz<ifz.d> {
    public static final /* synthetic */ int n = 0;
    public final TextView m;

    public pgz(TextView textView) {
        super(textView);
        this.m = textView;
    }

    @Override // xsna.kgz
    public final void W5(ifz.d dVar) {
        TextView textView = this.m;
        textView.setText(enj.f(R.plurals.voip_broadcast_spectators_count, dVar.a, textView.getContext()));
    }
}
