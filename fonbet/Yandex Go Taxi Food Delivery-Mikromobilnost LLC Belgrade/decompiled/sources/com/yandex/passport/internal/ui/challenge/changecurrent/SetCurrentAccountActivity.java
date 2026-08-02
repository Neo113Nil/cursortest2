package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.ChallengeActivity;
import com.yandex.passport.sloth.data.SlothTheme;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.w511;
import defpackage.y8f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0003*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/changecurrent/SetCurrentAccountActivity;", "Lcom/yandex/passport/internal/ui/challenge/ChallengeActivity;", "Lcom/yandex/passport/common/core/Uid;", "Lcom/yandex/passport/internal/ui/challenge/changecurrent/a;", "Lcom/yandex/passport/internal/ui/challenge/j;", "<init>", "()V", "Landroid/os/Bundle;", "parseChallengeData", "(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/j;", "toBundle", "(Lcom/yandex/passport/common/core/Uid;)Landroid/os/Bundle;", TarifficatorScenarioActivity.RESULT_KEY, "", "resultCodeFor", "(Lcom/yandex/passport/common/core/Uid;)I", "", "input", "transformResult", "(ZLcom/yandex/passport/internal/ui/challenge/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "extras", "createChallengeActivityComponent", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/changecurrent/a;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "Lcom/yandex/passport/internal/ui/challenge/t;", ClidProvider.STATE, "consumeViewState", "(Lcom/yandex/passport/internal/ui/challenge/t;)V", "isGoingToRecreate", "Z", "Lcom/yandex/passport/internal/ui/challenge/changecurrent/h;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/challenge/changecurrent/h;", "viewModel", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetCurrentAccountActivity extends ChallengeActivity<Uid, a, com.yandex.passport.internal.ui.challenge.j> {
    public static final int $stable = 8;
    private boolean isGoingToRecreate;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(h.class), new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentAccountActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentAccountActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentAccountActivity$special$$inlined$viewModels$default$3
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

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public void consumeViewState(com.yandex.passport.internal.ui.challenge.t state) {
        if (state instanceof com.yandex.passport.internal.ui.challenge.q) {
            com.yandex.passport.internal.ui.common.d delayedLoadingSlab = ((a) getComponent()).getDelayedLoadingSlab();
            delayedLoadingSlab.c(state);
            show(delayedLoadingSlab);
        } else if (state instanceof com.yandex.passport.internal.ui.challenge.s) {
            super.consumeViewState(state);
        } else if (state instanceof com.yandex.passport.internal.ui.challenge.r) {
            super.consumeViewState(state);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public a createChallengeActivityComponent(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle) {
        return passportProcessGlobalComponent.createSetCurrentAccountActivityComponent(new b(this, bundle));
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public h getViewModel() {
        return (h) this.viewModel.getValue();
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity, com.yandex.passport.internal.ui.ResultAwareActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        mkn.b(this);
        super.onCreate(savedInstanceState);
        SlothTheme W = com.yandex.passport.internal.properties.u.W(getComponent().getProperties().getTheme());
        int h = com.yandex.passport.internal.ui.sloth.e.h(W);
        if (h != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + W + " with nightMode=" + h + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(h);
        }
        if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
            }
            tje.N(eja1.s(this), null, null, new SetCurrentAccountActivity$onCreate$3(this, null), 3);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public com.yandex.passport.internal.ui.challenge.j parseChallengeData(Bundle bundle) {
        SetCurrentAccountPropertiesImpl.Companion.getClass();
        SetCurrentAccountPropertiesImpl a = com.yandex.passport.internal.properties.s.a(bundle);
        PassportUidImpl uid = a.getUid();
        return new com.yandex.passport.internal.ui.challenge.j(uid != null ? com.yandex.passport.internal.util.p.B(uid) : null, a.getTheme());
    }

    @Override // android.app.Activity
    public void recreate() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isGoingToRecreate = true", 8);
        }
        this.isGoingToRecreate = true;
        super.recreate();
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public int resultCodeFor(Uid result) {
        return (!(getComponent().getProperties().getUid() == null && result == null) && result == null) ? 6 : -1;
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public Bundle toBundle(Uid uid) {
        if (uid == null) {
            return null;
        }
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(uid);
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", A);
        return bundle;
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public Object transformResult(boolean z, com.yandex.passport.internal.ui.challenge.j jVar, Continuation<? super Uid> continuation) {
        Uid uid = jVar.a;
        if (z) {
            return uid;
        }
        return null;
    }
}
