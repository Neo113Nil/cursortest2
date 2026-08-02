package xsna;

import java.util.List;
import xsna.q630;

/* compiled from: RadioTabsSheet.kt */
/* loaded from: classes3.dex */
public final class jve0 implements zzs<vnl, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ rg50 b;
    public final /* synthetic */ h17 c;

    public jve0(rg50 rg50Var, h17 h17Var) {
        this.b = rg50Var;
        this.c = h17Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(vnl vnlVar, wow<dtn0> wowVar, androidx.compose.runtime.a aVar, Integer num) {
        List<dtn0> list = wowVar.b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 48) == 0) {
            intValue |= aVar2.J(list) ? 32 : 16;
        }
        if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2009750567, intValue, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioTabsSheet.<anonymous>.<anonymous> (RadioTabsSheet.kt:60)");
            }
            if (list.size() > 1) {
                aVar2.K(-634990274);
                dtn0 dtn0Var = list.get(this.b.getIntValue());
                qzn0.c(dtn0Var.a, dtn0Var.b, o19.a(q630.a.a, f17.e(this.c)), aVar2, 0);
            } else {
                aVar2.K(-637370423);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
