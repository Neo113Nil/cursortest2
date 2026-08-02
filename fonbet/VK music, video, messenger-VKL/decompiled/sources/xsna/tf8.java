package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.voip.ui.view.VoipWatchersView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.yf8;

/* compiled from: BroadcastFinishView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class tf8 extends FunctionReferenceImpl implements izs<yf8.d, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(yf8.d dVar) {
        String str;
        yf8.d dVar2 = dVar;
        wf8 wf8Var = (wf8) this.receiver;
        TextView textView = wf8Var.k;
        VoipWatchersView voipWatchersView = wf8Var.j;
        boolean z = dVar2.c;
        boolean z2 = dVar2.d;
        if (z || z2) {
            Collection<qvw0> collection = dVar2.a;
            int i = dVar2.b;
            if (z) {
                bwt0.p0(voipWatchersView, true);
                List H0 = j5g.H0(collection, 3);
                ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qvw0) it.next()).i());
                }
                int max = Math.max(0, i - arrayList.size());
                boolean z3 = max > 0;
                if (z3) {
                    str = "+" + uqm0.f(max);
                } else {
                    if (z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "";
                }
                if (!epx.f(voipWatchersView.k, arrayList) || !epx.f(voipWatchersView.l, str)) {
                    voipWatchersView.k = arrayList;
                    voipWatchersView.l = str;
                    voipWatchersView.a();
                }
            } else {
                bwt0.p0(voipWatchersView, false);
            }
            bwt0.p0(textView, z2);
            if (z2) {
                Context context = wf8Var.a;
                int min = Math.min(3, collection.size());
                String g0 = j5g.g0(j5g.H0(collection, min), ", ", null, null, 0, new kz0(4), 30);
                int max2 = Math.max(0, i - min);
                String f = uqm0.f(max2);
                textView.setText((min <= 0 || max2 <= 0) ? min > 0 ? context.getResources().getQuantityString(R.plurals.voip_broadcast_viewers_when_friends_only, min, g0) : max2 > 0 ? context.getResources().getQuantityString(R.plurals.voip_broadcast_viewers_when_others_only, max2, f) : context.getString(R.string.voip_broadcast_viewers_zero) : context.getResources().getQuantityString(R.plurals.voip_broadcast_viewers_when_friends_and_others, max2, g0, f));
            }
        } else {
            bwt0.p0(voipWatchersView, false);
            bwt0.p0(textView, false);
        }
        return s3q0.a;
    }
}
