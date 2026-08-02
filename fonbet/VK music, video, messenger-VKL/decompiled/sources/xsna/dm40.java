package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zl40;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$internalToggleMode$event$1", f = "MusicKidsModeManagerImpl.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class dm40 extends SuspendLambda implements wzs<yvj, spj<? super zl40.a>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ zl40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm40(zl40 zl40Var, Context context, spj<? super dm40> spjVar) {
        super(2, spjVar);
        this.this$0 = zl40Var;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dm40(this.this$0, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super zl40.a> spjVar) {
        return ((dm40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        z1h0 u;
        FragmentImpl u2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        zl40 zl40Var = this.this$0;
        Context context = this.$context;
        this.label = 1;
        zl40Var.getClass();
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        ComponentCallbacks2 h = e3m.h(context);
        z1h0 z1h0Var = null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || (u2 = Y.u()) == null || (supportFragmentManager = u2.getParentFragmentManager()) == null) {
            Activity h2 = e3m.h(context);
            AppCompatActivity appCompatActivity = h2 instanceof AppCompatActivity ? (AppCompatActivity) h2 : null;
            supportFragmentManager = appCompatActivity != null ? appCompatActivity.getSupportFragmentManager() : null;
        }
        ComponentCallbacks2 h3 = e3m.h(context);
        ey50 ey50Var2 = h3 instanceof ey50 ? (ey50) h3 : null;
        ww50<?> Y2 = ey50Var2 != null ? ey50Var2.Y() : null;
        if (Y2 == null || (u = Y2.u()) == null) {
            Activity h4 = e3m.h(context);
            if (h4 instanceof AppCompatActivity) {
                z1h0Var = (AppCompatActivity) h4;
            }
        } else {
            z1h0Var = u;
        }
        if (supportFragmentManager != null && z1h0Var != null) {
            supportFragmentManager.f("related_pin_code_request_key");
            supportFragmentManager.l0("related_pin_code_request_key", z1h0Var, new bm40(lq9Var));
            ((com.vk.superapp.multiaccount.api.e) zl40Var.e.getValue()).f(supportFragmentManager, zl40Var.d.c());
        }
        Object n = lq9Var.n();
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
