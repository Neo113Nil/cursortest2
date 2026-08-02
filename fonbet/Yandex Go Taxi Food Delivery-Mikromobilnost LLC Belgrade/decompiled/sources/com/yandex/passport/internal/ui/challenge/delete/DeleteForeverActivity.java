package com.yandex.passport.internal.ui.challenge.delete;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.challenge.ChallengeActivity;
import com.yandex.passport.sloth.data.SlothTheme;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ds31;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kum;
import defpackage.m50;
import defpackage.mkn;
import defpackage.n751;
import defpackage.nns0;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.u1w;
import defpackage.w511;
import defpackage.y8f;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 <2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001c\u0010\u0017\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0094@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0006J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020'038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/delete/DeleteForeverActivity;", "Lcom/yandex/passport/internal/ui/challenge/ChallengeActivity;", "Lcom/yandex/passport/api/r0;", "Lcom/yandex/passport/internal/ui/challenge/delete/i0;", "Lcom/yandex/passport/internal/ui/challenge/k;", "<init>", "()V", "Landroid/os/Bundle;", "parseChallengeData", "(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/k;", "toBundle", "(Lcom/yandex/passport/api/r0;)Landroid/os/Bundle;", TarifficatorScenarioActivity.RESULT_KEY, "", "resultCodeFor", "(Lcom/yandex/passport/api/r0;)I", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "", "input", "transformResult", "(ZLcom/yandex/passport/internal/ui/challenge/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "extras", "createChallengeActivityComponent", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/delete/i0;", "logic", "(Lcom/yandex/passport/internal/ui/challenge/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/passport/internal/ui/challenge/delete/w0;", ClidProvider.STATE, "consumeViewState", "(Lcom/yandex/passport/internal/ui/challenge/delete/w0;)V", "showPhonishDialog", "Lcom/yandex/passport/common/core/Uid;", "uid", "isPhonish", "Lcom/yandex/passport/internal/properties/LoginProperties;", "createLoginProperties", "(Lcom/yandex/passport/common/core/Uid;Z)Lcom/yandex/passport/internal/properties/LoginProperties;", "startBindSlothOrError", "", "it", "reloginOrError", "(Ljava/lang/Throwable;)V", "isGoingToRecreate", "Z", "isSetContentSlothUi", "wasRelogin", "Lm50;", "bouncerResultLauncher", "Lm50;", "Lcom/yandex/passport/internal/ui/challenge/delete/f1;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/challenge/delete/f1;", "viewModel", "Companion", "com/yandex/passport/internal/ui/challenge/delete/g0", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteForeverActivity extends ChallengeActivity<com.yandex.passport.api.r0, i0, com.yandex.passport.internal.ui.challenge.k> {
    public static final int $stable = 8;
    public static final g0 Companion = new g0();
    private boolean isGoingToRecreate;
    private boolean isSetContentSlothUi;
    private boolean wasRelogin;
    private final m50 bouncerResultLauncher = registerForActivityResult(new BouncerActivity.a(), new com.yandex.passport.internal.links.h(this, 3));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(f1.class), new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity$special$$inlined$viewModels$default$3
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
    public static final void bouncerResultLauncher$lambda$0(DeleteForeverActivity deleteForeverActivity, com.yandex.passport.api.w wVar) {
        if (wVar instanceof com.yandex.passport.api.u) {
            deleteForeverActivity.getViewModel().Y(n.e);
            return;
        }
        if (wVar instanceof com.yandex.passport.api.q) {
            deleteForeverActivity.getViewModel().Y(n.b);
            return;
        }
        if (wVar instanceof com.yandex.passport.api.s) {
            deleteForeverActivity.getViewModel().Y(new n0(((com.yandex.passport.api.s) wVar).a));
            return;
        }
        if (wVar instanceof com.yandex.passport.api.t) {
            deleteForeverActivity.getViewModel().Y(n.c);
            return;
        }
        deleteForeverActivity.getViewModel().Y(new n0(new IllegalStateException("DeleteForeverActivity not support this bouncer answer: " + wVar)));
    }

    private final void consumeViewState(w0 state) {
        if (state instanceof s0) {
            return;
        }
        if (state instanceof r0) {
            showPhonishDialog();
            return;
        }
        if (state instanceof t0) {
            t0 t0Var = (t0) state;
            this.bouncerResultLauncher.a(createLoginProperties(t0Var.a, t0Var.b));
        } else {
            if (state instanceof u0) {
                return;
            }
            if (jl40.l(state, v0.a)) {
                startBindSlothOrError();
            } else {
                w511.b();
            }
        }
    }

    private final LoginProperties createLoginProperties(Uid uid, boolean isPhonish) {
        LoginProperties.a aVar = new LoginProperties.a();
        Filter.a aVar2 = new Filter.a();
        aVar2.a = com.yandex.passport.internal.util.p.x(uid.getEnvironment());
        if (isPhonish) {
            aVar2.c(PassportAccountType.PHONISH);
        }
        aVar.b = aVar2.a();
        VisualProperties.a aVar3 = new VisualProperties.a();
        aVar3.G = getComponent().getProperties().getProgressProperties();
        VisualProperties.Companion.getClass();
        aVar.H = com.yandex.passport.internal.properties.b0.a(aVar3);
        aVar.A = com.yandex.passport.internal.util.p.A(uid);
        LoginProperties.Companion.getClass();
        return com.yandex.passport.internal.a0.b0(com.yandex.passport.internal.properties.i.b(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloginOrError(Throwable it) {
        if (this.wasRelogin) {
            getViewModel().Y(new n0(it));
            return;
        }
        f1 viewModel = getViewModel();
        p0 p0Var = p0.c;
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new DeleteForeverViewModel$wishSloth$1(viewModel, p0Var, null), 3);
        this.wasRelogin = true;
    }

    private final void showPhonishDialog() {
        com.lightside.slab.c cVar = getUi().a;
        final int i = 0;
        cVar.b(new kum(new nns0(cVar.a.getContext(), i)));
        com.yandex.passport.internal.ui.m mVar = new com.yandex.passport.internal.ui.m(this);
        mVar.d(R.string.passport_phonish_permanent_deletion_alert_text);
        mVar.e(R.string.passport_native_to_browser_prompt_confirmation_title, new DialogInterface.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.challenge.delete.f0
            public final /* synthetic */ DeleteForeverActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                DeleteForeverActivity deleteForeverActivity = this.b;
                switch (i3) {
                    case 0:
                        DeleteForeverActivity.showPhonishDialog$lambda$5(deleteForeverActivity, dialogInterface, i2);
                        break;
                    default:
                        DeleteForeverActivity.showPhonishDialog$lambda$6(deleteForeverActivity, dialogInterface, i2);
                        break;
                }
            }
        });
        int i2 = R.string.passport_native_to_browser_prompt_refusal_title;
        final int i3 = 1;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.challenge.delete.f0
            public final /* synthetic */ DeleteForeverActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                int i32 = i3;
                DeleteForeverActivity deleteForeverActivity = this.b;
                switch (i32) {
                    case 0:
                        DeleteForeverActivity.showPhonishDialog$lambda$5(deleteForeverActivity, dialogInterface, i22);
                        break;
                    default:
                        DeleteForeverActivity.showPhonishDialog$lambda$6(deleteForeverActivity, dialogInterface, i22);
                        break;
                }
            }
        };
        mVar.i = getText(i2);
        mVar.j = onClickListener;
        mVar.d = new com.yandex.passport.internal.ui.e(2, this);
        mVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPhonishDialog$lambda$5(DeleteForeverActivity deleteForeverActivity, DialogInterface dialogInterface, int i) {
        deleteForeverActivity.getViewModel().Y(n.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPhonishDialog$lambda$6(DeleteForeverActivity deleteForeverActivity, DialogInterface dialogInterface, int i) {
        deleteForeverActivity.getViewModel().Y(n.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPhonishDialog$lambda$7(DeleteForeverActivity deleteForeverActivity, DialogInterface dialogInterface) {
        deleteForeverActivity.getViewModel().Y(n.b);
    }

    private final void startBindSlothOrError() {
        if (!this.isSetContentSlothUi) {
            setContentView(getComponent().getDeleteForeverSlothUi().getRoot());
            this.isSetContentSlothUi = true;
            View e = ((com.yandex.passport.sloth.ui.d0) getComponent().getDeleteForeverSlothUi().b.e.getValue()).e();
            com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(8, this);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.o(e, aVar);
        }
        tje.N(eja1.s(this), null, null, new DeleteForeverActivity$startBindSlothOrError$2(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 startBindSlothOrError$lambda$11(DeleteForeverActivity deleteForeverActivity, View view, n751 n751Var) {
        u1w g = n751Var.a.g(647);
        view.setBackgroundColor(deleteForeverActivity.getColor(R.color.passport_roundabout_background));
        view.setPadding(g.a, g.b, g.c, g.d);
        return n751.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object transformResult$consumeViewState(DeleteForeverActivity deleteForeverActivity, w0 w0Var, Continuation continuation) {
        deleteForeverActivity.consumeViewState(w0Var);
        return zy11.a;
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public i0 createChallengeActivityComponent(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle) {
        return passportProcessGlobalComponent.createDeleteForeverActivityComponent(new j0(this, bundle));
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public f1 getViewModel() {
        return (f1) this.viewModel.getValue();
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
            tje.N(eja1.s(this), null, null, new DeleteForeverActivity$onCreate$3(this, null), 3);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public com.yandex.passport.internal.ui.challenge.k parseChallengeData(Bundle bundle) {
        PassportDeleteAccountPropertiesImpl.Companion.getClass();
        PassportDeleteAccountPropertiesImpl a = com.yandex.passport.internal.properties.k.a(bundle);
        return new com.yandex.passport.internal.ui.challenge.k(com.yandex.passport.internal.util.p.B(a.getUid()), a.getTheme());
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
    public int resultCodeFor(com.yandex.passport.api.r0 result) {
        return com.yandex.passport.internal.ui.c.C(result).getResultCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transformResult(boolean z, com.yandex.passport.internal.ui.challenge.k kVar, Continuation<? super com.yandex.passport.api.r0> continuation) {
        DeleteForeverActivity$transformResult$1 deleteForeverActivity$transformResult$1;
        int i;
        if (continuation instanceof DeleteForeverActivity$transformResult$1) {
            deleteForeverActivity$transformResult$1 = (DeleteForeverActivity$transformResult$1) continuation;
            int i2 = deleteForeverActivity$transformResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverActivity$transformResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteForeverActivity$transformResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverActivity$transformResult$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y0 y0Var = getViewModel().c;
                    com.yandex.passport.internal.ui.challenge.c cVar = new com.yandex.passport.internal.ui.challenge.c(new jqr((y0Var != null ? y0Var : null).i, new DeleteForeverActivity$transformResult$2(2, this, DeleteForeverActivity.class, "consumeViewState", "consumeViewState(Lcom/yandex/passport/internal/ui/challenge/delete/DeleteForeverModel$State;)V", 4), 3), i3);
                    deleteForeverActivity$transformResult$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(cVar, deleteForeverActivity$transformResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((u0) obj).a;
            }
        }
        deleteForeverActivity$transformResult$1 = new DeleteForeverActivity$transformResult$1(this, continuation);
        Object obj2 = deleteForeverActivity$transformResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverActivity$transformResult$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return ((u0) obj2).a;
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity, com.yandex.passport.internal.ui.ResultAwareActivity
    public /* bridge */ /* synthetic */ Object logic(Object obj, Continuation continuation) {
        return logic((com.yandex.passport.internal.ui.challenge.k) obj, (Continuation<? super com.yandex.passport.api.r0>) continuation);
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public Bundle toBundle(com.yandex.passport.api.r0 r0Var) {
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public Object logic(com.yandex.passport.internal.ui.challenge.k kVar, Continuation<? super com.yandex.passport.api.r0> continuation) {
        return super.logic((DeleteForeverActivity) kVar, (Continuation) continuation);
    }
}
