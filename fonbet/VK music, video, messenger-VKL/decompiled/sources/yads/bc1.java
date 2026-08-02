package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.collections.EmptyList;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class bc1 implements lsr {
    public final /* synthetic */ IntegrationInspectorActivity a;

    public bc1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.a = integrationInspectorActivity;
    }

    @Override // xsna.lsr
    public final Object emit(Object obj, spj spjVar) {
        p90 p90Var = (p90) obj;
        q90 c = IntegrationInspectorActivity.c(this.a);
        c.getClass();
        if (p90Var.c) {
            c.a.submitList(EmptyList.b);
            c.c.setVisibility(0);
        } else {
            c.a.submitList(p90Var.d);
            c.c.setVisibility(8);
        }
        c.b.setText(p90Var.b.a);
        return s3q0.a;
    }
}
