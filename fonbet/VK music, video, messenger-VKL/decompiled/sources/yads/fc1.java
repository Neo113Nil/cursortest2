package yads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class fc1 extends Lambda implements gzs {
    public final /* synthetic */ IntegrationInspectorActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.b = integrationInspectorActivity;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        nc1 b;
        IntegrationInspectorActivity integrationInspectorActivity = this.b;
        b = this.b.b();
        ec1 ec1Var = new ec1(b);
        return new q90(integrationInspectorActivity, ec1Var, new LinearLayoutManager(1, false), new w40(ec1Var, (z70) IntegrationInspectorActivity.a(this.b).r.getValue()));
    }
}
