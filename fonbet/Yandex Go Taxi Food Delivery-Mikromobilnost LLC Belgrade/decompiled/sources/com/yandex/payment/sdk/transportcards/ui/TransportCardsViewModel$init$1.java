package com.yandex.payment.sdk.transportcards.ui;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.adjust.sdk.Constants;
import com.google.gson.reflect.TypeToken;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import defpackage.ahr;
import defpackage.apa1;
import defpackage.bhr;
import defpackage.ds31;
import defpackage.gw00;
import defpackage.jir;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u111;
import defpackage.u3u;
import defpackage.wls;
import defpackage.wpy0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.transportcards.ui.TransportCardsViewModel$init$1", f = "TransportCardsViewModel.kt", l = {52}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class TransportCardsViewModel$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ String $body;
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ String $deeplink;
    final /* synthetic */ jir $errorBinding;
    final /* synthetic */ boolean $isDebug;
    final /* synthetic */ boolean $isLightTheme;
    final /* synthetic */ boolean $isNfcSupported;
    Object L$0;
    int label;
    final /* synthetic */ u111 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportCardsViewModel$init$1(String str, u111 u111Var, AppCompatActivity appCompatActivity, ViewGroup viewGroup, boolean z, boolean z2, String str2, boolean z3, jir jirVar, Continuation continuation) {
        super(2, continuation);
        this.$body = str;
        this.this$0 = u111Var;
        this.$activity = appCompatActivity;
        this.$container = viewGroup;
        this.$isLightTheme = z;
        this.$isDebug = z2;
        this.$deeplink = str2;
        this.$isNfcSupported = z3;
        this.$errorBinding = jirVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportCardsViewModel$init$1(this.$body, this.this$0, this.$activity, this.$container, this.$isLightTheme, this.$isDebug, this.$deeplink, this.$isNfcSupported, this.$errorBinding, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportCardsViewModel$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map map = (Map) new u3u().d(this.$body, TypeToken.get(new TransportCardsViewModel$init$1$mapBody$1().getType()));
            u111 u111Var = this.this$0;
            ahr ahrVar = u111Var.b;
            if (ahrVar != null) {
                bhr bhrVar = new bhr(u111Var.c, this.$activity, this.$container, u111Var.y, new wpy0(15, u111Var), this.$isLightTheme, this.$isDebug, ds31.a(u111Var), this.this$0.z, "v2/transport/decide_next_action", kotlin.collections.b.n(kotlin.collections.b.i(new Pair(Constants.DEEPLINK, this.$deeplink), new Pair("is_nfc_supported", String.valueOf(this.$isNfcSupported))), map), this.$errorBinding, null, gw00.e(new Pair(FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE, Boolean.TRUE)), null, apa1.e(FeatureFlag.DEBRANDING_FLAG), this.this$0.x, 20480);
                this.L$0 = null;
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
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
