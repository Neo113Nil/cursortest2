package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fxw0;

/* compiled from: VoipCreateScheduledCallContentStateMapper.kt */
/* loaded from: classes7.dex */
public final class enw0 extends knw0 {
    public final b25 d;

    public enw0(b25 b25Var, Context context, vxw0 vxw0Var) {
        super(context, vxw0Var);
        this.d = b25Var;
    }

    @Override // xsna.knw0, xsna.lnw0, xsna.kww0
    public final List<VoipScheduleCallViewState.ScreenState.Item> a(fxw0.a aVar) {
        hfz bVar;
        cn o = this.d.o();
        String str = o.b;
        if (aVar.c.isEmpty()) {
            bVar = null;
        } else {
            fxw0.a.AbstractC2899a abstractC2899a = aVar.l;
            if (abstractC2899a instanceof fxw0.a.AbstractC2899a.C2900a) {
                a.b.C1179b c1179b = new a.b.C1179b(str);
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                bVar = new VoipScheduleCallViewState.ScreenState.Item.a.C2073a(c1179b, ImageList.a.c(-1, -1, o.c), str, o.j);
            } else {
                if (!(abstractC2899a instanceof fxw0.a.AbstractC2899a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rww0 rww0Var = ((fxw0.a.AbstractC2899a.b) abstractC2899a).a;
                bVar = new VoipScheduleCallViewState.ScreenState.Item.a.b(rww0Var.c, rww0Var.b, rww0Var.d);
            }
        }
        return rl3.I(new VoipScheduleCallViewState.ScreenState.Item[]{bVar, g(aVar), lnw0.f(aVar, false), lnw0.e(aVar), c(aVar), b(aVar), h(aVar), new VoipScheduleCallViewState.ScreenState.Item.e()});
    }

    @Override // xsna.lnw0
    public final VoipScheduleCallViewState.ScreenState.Item.b d(fxw0.a aVar) {
        return lnw0.f(aVar, false);
    }
}
