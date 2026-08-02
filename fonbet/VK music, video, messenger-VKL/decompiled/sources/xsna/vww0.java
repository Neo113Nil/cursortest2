package xsna;

import android.content.Context;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallHighlightItem;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fxw0;
import xsna.kww0;

/* compiled from: VoipScheduleCallReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class vww0 extends FunctionReferenceImpl implements izs<fxw0, VoipScheduleCallViewState.ScreenState> {
    @Override // xsna.izs
    public final VoipScheduleCallViewState.ScreenState invoke(fxw0 fxw0Var) {
        fxw0 fxw0Var2 = fxw0Var;
        kww0 kww0Var = (kww0) this.receiver;
        Context context = kww0Var.a;
        if (fxw0Var2 instanceof fxw0.d) {
            return VoipScheduleCallViewState.ScreenState.c.a;
        }
        if (fxw0Var2 instanceof fxw0.f) {
            return VoipScheduleCallViewState.ScreenState.c.a;
        }
        if (fxw0Var2 instanceof fxw0.e) {
            return VoipScheduleCallViewState.ScreenState.c.a;
        }
        if (fxw0Var2 instanceof fxw0.c) {
            return VoipScheduleCallViewState.ScreenState.c.a;
        }
        if (!(fxw0Var2 instanceof fxw0.a)) {
            if (!(fxw0Var2 instanceof fxw0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable th = ((fxw0.b) fxw0Var2).b;
            return new VoipScheduleCallViewState.ScreenState.b(h03.a(th) ? context.getString(R.string.common_network_error) : j03.g(context, th, R.string.error));
        }
        fxw0.a aVar = (fxw0.a) fxw0Var2;
        List<VoipScheduleCallViewState.ScreenState.Item> a = kww0Var.a(aVar);
        ScheduledCallHighlightItem scheduledCallHighlightItem = aVar.w;
        Integer num = null;
        if (scheduledCallHighlightItem != null) {
            Iterator<VoipScheduleCallViewState.ScreenState.Item> it = a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                rfc a2 = fpf0.a(it.next().getClass());
                if (kww0.a.$EnumSwitchMapping$0[scheduledCallHighlightItem.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (a2.equals(fpf0.a(VoipScheduleCallViewState.ScreenState.Item.EditText.class))) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                int intValue2 = valueOf.intValue();
                if (intValue != 0) {
                    intValue2--;
                }
                num = Integer.valueOf(intValue2);
            }
        }
        return new VoipScheduleCallViewState.ScreenState.a(num, a, aVar.q);
    }
}
