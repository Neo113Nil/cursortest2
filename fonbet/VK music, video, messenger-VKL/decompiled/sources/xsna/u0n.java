package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0n implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0n(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List list;
        Object obj;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                return new Drawable[]{m33.a(R.drawable.vk_icon_illustration_disclaimer_contraindications_feed_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_bad_feed_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_credits_feed_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_bankruptcy_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_energy_drinks_360w, context)};
            case 1:
                f18 f18Var = ((cpt) this.c).a;
                qcy<Object> qcyVar = cpt.b[0];
                return f18Var.a();
            case 2:
                return new it80(((vja0) this.c).b());
            case 3:
                final q7h0 q7h0Var = (q7h0) this.c;
                final Locale locale = Locale.getDefault();
                final long currentTimeMillis = System.currentTimeMillis();
                hfr j = rli0.j(new ulp0(rli0.l(rl3.D(TimeZone.getAvailableIDs()), new hyu(17)), new izs(q7h0Var, locale, currentTimeMillis) { // from class: xsna.p7h0
                    public final /* synthetic */ Locale b;
                    public final /* synthetic */ long c;

                    {
                        this.b = locale;
                        this.c = currentTimeMillis;
                    }

                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return q7h0.a(this.c, (String) obj2, this.b);
                    }
                }), new oi40(12));
                r420 r420Var = new r420(2);
                List B = rli0.B(j);
                g5g.L(B, r420Var);
                Iterator it = ((ArrayList) B).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        ArrayList b = y57.b(next);
                        while (it.hasNext()) {
                            b.add(it.next());
                        }
                        list = b;
                    } else {
                        list = Collections.singletonList(next);
                    }
                } else {
                    list = EmptyList.b;
                }
                TimeZone timeZone = TimeZone.getDefault();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((VoipScheduleCallTimeZone) obj).b.equals(timeZone.getID())) {
                        }
                    } else {
                        obj = null;
                    }
                }
                VoipScheduleCallTimeZone voipScheduleCallTimeZone = (VoipScheduleCallTimeZone) obj;
                if (voipScheduleCallTimeZone == null) {
                    voipScheduleCallTimeZone = (VoipScheduleCallTimeZone) j5g.Y(list);
                }
                return new Pair(voipScheduleCallTimeZone, list);
            default:
                return rhs.b().h(ImageRequest.a((Uri) this.c));
        }
    }
}
