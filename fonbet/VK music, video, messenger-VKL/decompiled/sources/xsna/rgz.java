package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.ifz;

/* compiled from: ListViewHolderStatsElapsedTime.kt */
/* loaded from: classes7.dex */
public final class rgz extends kgz<ifz.f> {
    public static final /* synthetic */ int p = 0;
    public final TextView m;
    public io.reactivex.rxjava3.disposables.c n;
    public ifz.f o;

    public rgz(ViewGroup viewGroup) {
        super(viewGroup);
        TextView textView = (TextView) viewGroup.findViewById(R.id.key);
        this.m = (TextView) viewGroup.findViewById(R.id.value);
        textView.setText(R.string.voip_broadcast_stats_elapsed_time);
    }

    @Override // xsna.kgz
    public final void W5(ifz.f fVar) {
        ifz.f fVar2 = fVar;
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = fVar2;
        if (fVar2.a) {
            b6();
            this.n = io.reactivex.rxjava3.core.q.Q(1L, 1L, TimeUnit.SECONDS, asu0.a.d()).subscribe(new ew(new z8f(this, 24), 27));
        } else {
            TextView textView = this.m;
            textView.setText(uzp.g(textView.getContext(), fVar2.c, false));
        }
    }

    @Override // xsna.kgz
    public final void a6() {
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = null;
        this.o = null;
    }

    public final void b6() {
        ifz.f fVar = this.o;
        if (fVar != null) {
            TextView textView = this.m;
            Context context = textView.getContext();
            xuo0.a.getClass();
            textView.setText(uzp.g(context, uzp.f(xuo0.a(), fVar.b), false));
        }
    }
}
