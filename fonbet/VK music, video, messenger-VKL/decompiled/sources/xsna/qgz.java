package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ifz;

/* compiled from: ListViewHolderStatsCommon.kt */
/* loaded from: classes7.dex */
public final class qgz extends kgz<ifz.e> {
    public static final /* synthetic */ int o = 0;
    public final TextView m;
    public final TextView n;

    public qgz(ViewGroup viewGroup) {
        super(viewGroup);
        this.m = (TextView) viewGroup.findViewById(R.id.key);
        this.n = (TextView) viewGroup.findViewById(R.id.value);
    }

    @Override // xsna.kgz
    public final void W5(ifz.e eVar) {
        ifz.e eVar2 = eVar;
        this.m.setText(eVar2.a);
        this.n.setText(eVar2.b);
    }
}
