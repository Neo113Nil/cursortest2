package xsna;

import com.vk.core.tips.TipAnchorView;
import com.vk.core.tips.Tooltip;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o0l implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o0l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new e1l((Long) this.c, (Long) this.d, (Long) this.e, (k9x) this.f, 0, (eai0) this.g, (Locale) this.h);
            default:
                TipAnchorView tipAnchorView = (TipAnchorView) this.c;
                com.vk.core.tips.c cVar = (com.vk.core.tips.c) this.d;
                Tooltip tooltip = (Tooltip) this.e;
                Tooltip.g gVar = (Tooltip.g) this.f;
                dq2 dq2Var = (dq2) this.g;
                r4p0 r4p0Var = (r4p0) this.h;
                tipAnchorView.setBackground(cVar);
                tooltip.l = 1;
                tooltip.o(cVar, gVar, dq2Var, new defpackage.e0(tooltip, gVar, r4p0Var));
                return s3q0.a;
        }
    }
}
