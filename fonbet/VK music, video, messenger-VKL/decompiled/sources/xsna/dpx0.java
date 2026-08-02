package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.api.dto.menu.QueueParams;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dpx0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dpx0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                fpx0 fpx0Var = (fpx0) this.c;
                QueueParams queueParams = (QueueParams) this.d;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Subscribed: key=" + queueParams.d});
                }
                fpx0Var.c.e(queueParams.d, false);
                return s3q0.a;
            default:
                jys jysVar = (jys) this.c;
                oys oysVar = (oys) this.d;
                mc90 b = jysVar.b();
                Integer valueOf = b != null ? Integer.valueOf(b.k()) : null;
                Boolean bool = (Boolean) ((zak0) oysVar.c).getValue();
                bool.booleanValue();
                return new Pair(valueOf, bool);
        }
    }
}
