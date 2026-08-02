package xsna;

import android.view.View;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.av20;

/* compiled from: VoipScheduleCallRepeatPicker.kt */
/* loaded from: classes7.dex */
public final class axw0 implements av20.b<ScheduledCallRecurrence> {
    public final /* synthetic */ bxw0 a;
    public final /* synthetic */ Ref$ObjectRef<dw20> b;

    public axw0(bxw0 bxw0Var, Ref$ObjectRef<dw20> ref$ObjectRef) {
        this.a = bxw0Var;
        this.b = ref$ObjectRef;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        this.a.b.invoke((ScheduledCallRecurrence) obj);
        dw20 dw20Var = this.b.element;
        if (dw20Var != null) {
            dw20Var.tn();
        }
    }
}
