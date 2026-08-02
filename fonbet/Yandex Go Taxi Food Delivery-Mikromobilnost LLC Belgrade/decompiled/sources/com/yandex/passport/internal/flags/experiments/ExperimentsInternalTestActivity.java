package com.yandex.passport.internal.flags.experiments;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.app.a1;
import com.yandex.passport.internal.flags.presentation.o0;
import defpackage.b2x0;
import defpackage.ceu0;
import defpackage.es31;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.v0d;
import defpackage.y8f;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@jxi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/passport/internal/flags/experiments/ExperimentsInternalTestActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/flags/presentation/o0;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/flags/presentation/o0;", "viewModel", "Lcom/yandex/passport/internal/flags/presentation/d0;", ClidProvider.STATE, "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExperimentsInternalTestActivity extends ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(o0.class), new sls(this) { // from class: com.yandex.passport.internal.flags.experiments.ExperimentsInternalTestActivity$special$$inlined$viewModels$default$2
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
    }, new a1(2), new sls(this) { // from class: com.yandex.passport.internal.flags.experiments.ExperimentsInternalTestActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 getViewModel() {
        return (o0) this.viewModel.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        mkn.a(this, new b2x0(0, 0, 0, new ceu0(8)), new b2x0(0, 0, 0, new ceu0(8)));
        super.onCreate(savedInstanceState);
        v0d.a(this, new androidx.compose.runtime.internal.a(286889544, new i(this, 1), true));
    }
}
