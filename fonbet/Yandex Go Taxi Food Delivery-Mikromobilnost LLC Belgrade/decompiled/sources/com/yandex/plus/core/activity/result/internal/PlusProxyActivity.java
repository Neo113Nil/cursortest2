package com.yandex.plus.core.activity.result.internal;

import androidx.activity.ComponentActivity;
import defpackage.es31;
import defpackage.i3y;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.y8f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/plus/core/activity/result/internal/PlusProxyActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/yandex/plus/core/activity/result/internal/d;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/plus/core/activity/result/internal/d;", "viewModel", "plus-core-activity-result-helper_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusProxyActivity extends ComponentActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(d.class), new sls(this) { // from class: com.yandex.plus.core.activity.result.internal.PlusProxyActivity$special$$inlined$viewModels$default$2
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }, new sls(this) { // from class: com.yandex.plus.core.activity.result.internal.PlusProxyActivity$special$$inlined$viewModels$default$1
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }, new sls(this) { // from class: com.yandex.plus.core.activity.result.internal.PlusProxyActivity$special$$inlined$viewModels$default$3
        final /* synthetic */ sls $extrasProducer = null;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            y8f y8fVar;
            sls slsVar = this.$extrasProducer;
            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : y8fVar;
        }
    });

    public final d getViewModel() {
        return (d) this.viewModel.getValue();
    }
}
