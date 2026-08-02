package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import defpackage.d27;
import defpackage.e27;
import defpackage.f27;
import defpackage.h0w;
import defpackage.h27;
import defpackage.in;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseButtonSectionDelegate$collectButtonSectionState$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        h27 h27Var = (h27) obj;
        Continuation continuation = (Continuation) obj2;
        c cVar = (c) this.receiver;
        boolean z = h27Var instanceof d27;
        zy11 zy11Var = zy11.a;
        if (z) {
            h0w h0wVar = cVar.c;
            d27 d27Var = (d27) h27Var;
            Object a = ((com.yandex.plus.acquisition.adapter.internal.processor.a) h0wVar.c).a(d27Var.b, d27Var.c, d27Var.d, UUID.randomUUID().toString(), d27Var.e, ((in) h0wVar.b).a(), continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (a != coroutineSingletons) {
                a = zy11Var;
            }
            return a == coroutineSingletons ? a : zy11Var;
        }
        if (h27Var instanceof f27) {
            cVar.d.c((f27) h27Var);
            return zy11Var;
        }
        if (h27Var instanceof e27) {
            cVar.e.a((e27) h27Var);
            return zy11Var;
        }
        cVar.getClass();
        w511.b();
        return null;
    }
}
