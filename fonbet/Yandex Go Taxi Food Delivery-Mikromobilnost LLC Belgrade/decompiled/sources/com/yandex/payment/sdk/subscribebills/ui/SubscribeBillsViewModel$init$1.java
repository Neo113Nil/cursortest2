package com.yandex.payment.sdk.subscribebills.ui;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import defpackage.ahr;
import defpackage.bhr;
import defpackage.ds31;
import defpackage.gw00;
import defpackage.jir;
import defpackage.k5c;
import defpackage.l7s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ozu0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.subscribebills.ui.SubscribeBillsViewModel$init$1", f = "SubscribeBillsViewModel.kt", l = {66}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class SubscribeBillsViewModel$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ jir $errorBinding;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ boolean $isDebug;
    final /* synthetic */ boolean $isLightTheme;
    int label;
    final /* synthetic */ ozu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeBillsViewModel$init$1(ozu0 ozu0Var, AppCompatActivity appCompatActivity, ViewGroup viewGroup, boolean z, boolean z2, jir jirVar, FragmentManager fragmentManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ozu0Var;
        this.$activity = appCompatActivity;
        this.$container = viewGroup;
        this.$isLightTheme = z;
        this.$isDebug = z2;
        this.$errorBinding = jirVar;
        this.$fragmentManager = fragmentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubscribeBillsViewModel$init$1(this.this$0, this.$activity, this.$container, this.$isLightTheme, this.$isDebug, this.$errorBinding, this.$fragmentManager, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SubscribeBillsViewModel$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ozu0 ozu0Var = this.this$0;
            ahr ahrVar = ozu0Var.b;
            if (ahrVar != null) {
                Map map = ozu0Var.c;
                AppCompatActivity appCompatActivity = this.$activity;
                ViewGroup viewGroup = this.$container;
                OkHttpClient okHttpClient = ozu0Var.y;
                l7s0 l7s0Var = new l7s0(ozu0Var);
                boolean z = this.$isLightTheme;
                boolean z2 = this.$isDebug;
                k5c a = ds31.a(ozu0Var);
                String str = this.this$0.z;
                Map f = kotlin.collections.b.f();
                jir jirVar = this.$errorBinding;
                FragmentManager fragmentManager = this.$fragmentManager;
                Map e = gw00.e(new Pair(FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE, Boolean.TRUE));
                InputStream open = this.$activity.getAssets().open("rtp_skeleton.txt");
                char[] cArr = new char[2048];
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                StringBuilder sb = new StringBuilder(open.available());
                while (true) {
                    int read = bufferedReader.read(cArr);
                    BufferedReader bufferedReader2 = bufferedReader;
                    if (read == -1) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                    bufferedReader = bufferedReader2;
                }
                bhr bhrVar = new bhr(map, appCompatActivity, viewGroup, okHttpClient, l7s0Var, z, z2, a, str, "v2/rtp/start_screen", f, jirVar, fragmentManager, e, sb.toString(), false, this.this$0.x, 98304);
                this.label = 1;
                if (((com.yandex.payment.sdk.flex.impl.b) ahrVar).d(bhrVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
