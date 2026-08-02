package com.yandex.go.external_service.router;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import defpackage.dvw;
import defpackage.h1p;
import defpackage.i1p;
import defpackage.kol0;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.p2p;
import defpackage.uzf;
import defpackage.vje;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a implements vje {
    public final /* synthetic */ p2p a;
    public final /* synthetic */ h1p b;

    public a(p2p p2pVar, h1p h1pVar) {
        this.a = p2pVar;
        this.b = h1pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, Continuation continuation) {
        ExternalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1 externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1;
        int i;
        final ExternalServiceModalView externalServiceModalView;
        if (continuation instanceof ExternalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1) {
            externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1 = (ExternalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1) continuation;
            int i2 = externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.label;
                n5u n5uVar = n5u.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return n5uVar;
                }
                kotlin.b.b(obj);
                Uri data = intent.getData();
                if (data != null) {
                    p2p p2pVar = this.a;
                    if (p2pVar.b0.a(data, this.b)) {
                        if (p2pVar.x()) {
                            return new m5u(false, false);
                        }
                        externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.L$0 = null;
                        externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.L$1 = null;
                        externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.label = 1;
                        i1p i1pVar = p2pVar.f0;
                        Object obj3 = zy11.a;
                        if (i1pVar != null && (externalServiceModalView = (ExternalServiceModalView) ((uzf) i1pVar).f0.get()) != null) {
                            final kol0 kol0Var = new kol0(dvw.b(externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1));
                            if (p2pVar.u()) {
                                externalServiceModalView.collapse();
                            } else {
                                p2pVar.i();
                            }
                            WeakHashMap weakHashMap = androidx.core.view.b.a;
                            if (externalServiceModalView.isAttachedToWindow()) {
                                externalServiceModalView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.external_service.router.ExternalServiceModalViewRouter$dismissAndAwaitDetachView$lambda$0$$inlined$doOnDetach$1
                                    @Override // android.view.View.OnAttachStateChangeListener
                                    public void onViewAttachedToWindow(View view) {
                                    }

                                    @Override // android.view.View.OnAttachStateChangeListener
                                    public void onViewDetachedFromWindow(View view) {
                                        externalServiceModalView.removeOnAttachStateChangeListener(this);
                                        kol0Var.resumeWith(zy11.a);
                                    }
                                });
                            } else {
                                kol0Var.resumeWith(obj3);
                            }
                            Object a = kol0Var.a();
                            if (a == obj2) {
                                obj3 = a;
                            }
                        }
                        if (obj3 == obj2) {
                            return obj2;
                        }
                    }
                }
                return n5uVar;
            }
        }
        externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1 = new ExternalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj4 = externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceModalViewRouter$registerCloseSelfRouterDeeplinkHandler$1$processIntent$1.label;
        n5u n5uVar2 = n5u.a;
        if (i == 0) {
        }
    }
}
