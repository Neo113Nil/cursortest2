package com.yandex.go.taxi.order.chat.web_preloading;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.yandex.messenger.websdk.internal.webview.ChatBackgroundController$BackgroundFragment;
import defpackage.d1b;
import defpackage.f1b;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qh41;
import defpackage.tse;
import defpackage.wls;
import defpackage.y0b;
import defpackage.ye0;
import defpackage.z0b;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.web_preloading.TaxiOrderWebMessengerPreloaderImpl$startPreloading$2", f = "TaxiOrderWebMessengerPreloaderImpl.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderWebMessengerPreloaderImpl$startPreloading$2 extends SuspendLambda implements wls {
    final /* synthetic */ ViewGroup $preloadContainer;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderWebMessengerPreloaderImpl$startPreloading$2(ViewGroup viewGroup, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$preloadContainer = viewGroup;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderWebMessengerPreloaderImpl$startPreloading$2(this.$preloadContainer, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderWebMessengerPreloaderImpl$startPreloading$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatBackgroundController$BackgroundFragment a;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int childCount = this.$preloadContainer.getChildCount();
            if (childCount > 0) {
                return zy11Var;
            }
            d1b d1bVar = (d1b) this.this$0.b.d.x.getValue();
            d1bVar.a.b("wm_chat_background_init");
            Object obj2 = d1bVar.d;
            y0b y0bVar = obj2 instanceof y0b ? (y0b) obj2 : null;
            if (y0bVar != null && (a = y0bVar.a()) != null) {
                a.setPreloadingInstance(null);
            }
            d1bVar.d.n();
            ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment = new ChatBackgroundController$BackgroundFragment();
            ye0 z0bVar = new z0b(d1bVar, chatBackgroundController$BackgroundFragment);
            chatBackgroundController$BackgroundFragment.setPreloadingInstance(d1bVar);
            if (d1bVar.e) {
                z0bVar = z0bVar.m();
            }
            d1bVar.d = z0bVar;
            FragmentManager supportFragmentManager = this.this$0.c.getSupportFragmentManager();
            androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
            h.h(this.$preloadContainer.getId(), chatBackgroundController$BackgroundFragment, null);
            h.l(true, true);
            ru.yandex.taxi.messenger.domain.a aVar = this.this$0.e;
            this.L$0 = null;
            this.I$0 = childCount;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        WebMessenger webMessenger = this.this$0.b;
        webMessenger.getClass();
        jl40.m();
        qh41 qh41Var = webMessenger.d;
        qh41Var.r.b("wm_preload_background");
        final f1b f1bVar = (f1b) qh41Var.w.getValue();
        synchronized (f1bVar) {
            try {
                if (f1bVar.a == 0) {
                    d1b d1bVar2 = f1bVar.b;
                    d1bVar2.e = true;
                    d1bVar2.b(d1bVar2.d.m());
                }
                f1bVar.a++;
                new Cancelable() { // from class: e1b
                    @Override // com.yandex.messenger.websdk.api.Cancelable
                    public final void cancel() {
                        f1b f1bVar2 = f1b.this;
                        int i2 = f1bVar2.a - 1;
                        f1bVar2.a = i2;
                        if (i2 == 0) {
                            d1b d1bVar3 = f1bVar2.b;
                            d1bVar3.e = false;
                            d1bVar3.b(d1bVar3.d.o());
                        }
                    }
                };
            } catch (Throwable th) {
                throw th;
            }
        }
        return zy11Var;
    }
}
