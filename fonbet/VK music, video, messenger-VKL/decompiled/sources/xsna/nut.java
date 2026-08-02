package xsna;

import android.content.Context;
import androidx.appcompat.app.d;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.infrastructure.exceptions.UnknownAccountException;
import com.vk.superapp.vksteps.ui.dialogs.AccountRevokePermissionDialogProvider$DialogResult;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bex0;
import xsna.kut;

/* compiled from: GetStepsCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsCommand$sendSteps$1", f = "GetStepsCommand.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class nut extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ SelectedDataSource $selectedDataSource;
    final /* synthetic */ long $startTimestamp;
    Object L$0;
    int label;
    final /* synthetic */ kut this$0;

    /* compiled from: GetStepsCommand.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountRevokePermissionDialogProvider$DialogResult.values().length];
            try {
                iArr[AccountRevokePermissionDialogProvider$DialogResult.NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountRevokePermissionDialogProvider$DialogResult.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(kut kutVar, long j, long j2, SelectedDataSource selectedDataSource, spj<? super nut> spjVar) {
        super(1, spjVar);
        this.this$0 = kutVar;
        this.$startTimestamp = j;
        this.$endTimestamp = j2;
        this.$selectedDataSource = selectedDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new nut(this.this$0, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((nut) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context mo2getContext;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mo2getContext = this.this$0.e.mo2getContext();
            if (mo2getContext == null) {
                r6y r6yVar = this.this$0.b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                }
                return s3q0.a;
            }
            xgx0 xgx0Var = xgx0.a;
            String str = "VkStepsGetStepsCommand.sendSteps() -> startTimestamp: " + this.$startTimestamp + ", endTimestamp: " + this.$endTimestamp + ", thread: " + Thread.currentThread().getName();
            xgx0Var.getClass();
            xgx0.a(str);
            int i2 = kut.a.$EnumSwitchMapping$1[((env0) this.this$0.l.getValue()).a().ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                xgx0.a("VkStepsGetStepsCommand.sendSteps() -> isAccountSwitched: false, thread: " + Thread.currentThread().getName());
                kut.d(this.this$0, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource, mo2getContext);
                return s3q0.a;
            }
            xgx0.a("VkStepsGetStepsCommand.sendSteps() -> isAccountSwitched: true, thread: " + Thread.currentThread().getName());
            this.L$0 = mo2getContext;
            this.label = 1;
            gzg0 gzg0Var = new gzg0(s7s0.c(this));
            d.a aVar = new d.a(mo2getContext);
            aVar.c(R.string.vk_run_change_account_title);
            aVar.a(false);
            aVar.setPositiveButton(android.R.string.ok, new xp(gzg0Var)).setNegativeButton(android.R.string.cancel, new yp(gzg0Var)).create().show();
            obj = gzg0Var.a();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Context context = (Context) this.L$0;
            kotlin.a.a(obj);
            mo2getContext = context;
        }
        int i3 = a.$EnumSwitchMapping$0[((AccountRevokePermissionDialogProvider$DialogResult) obj).ordinal()];
        if (i3 == 1) {
            kut kutVar = this.this$0;
            long j = this.$startTimestamp;
            long j2 = this.$endTimestamp;
            UnknownAccountException unknownAccountException = new UnknownAccountException(0);
            SelectedDataSource selectedDataSource = this.$selectedDataSource;
            myc0.h(g5z.a(kutVar.e), dgn0.f().getMain(), null, new zas(new mut(unknownAccountException, kutVar, j, j2, selectedDataSource, null), null), 2);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tw8 tw8Var = ((env0) this.this$0.l.getValue()).a;
            qcy<Object> qcyVar = env0.b[0];
            tw8Var.g("");
            kut.d(this.this$0, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource, mo2getContext);
        }
        return s3q0.a;
    }
}
