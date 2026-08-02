package com.yandex.go.shortcuts.impl.view.adapter;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.da5;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.HeaderViewHolder$setFormattedText$1", f = "HeaderViewHolder.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class HeaderViewHolder$setFormattedText$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $setter;
    final /* synthetic */ da5 $text;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder$setFormattedText$1(g gVar, da5 da5Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$text = da5Var;
        this.$setter = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HeaderViewHolder$setFormattedText$1(this.this$0, this.$text, this.$setter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HeaderViewHolder$setFormattedText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        tls tlsVar;
        Throwable th;
        da5 da5Var;
        tls tlsVar2;
        g gVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                gVar = this.this$0;
                da5 da5Var2 = this.$text;
                tlsVar = this.$setter;
                try {
                    ru.yandex.taxi.widget.c cVar = gVar.T;
                    FormattedText formattedText = da5Var2.b;
                    this.L$0 = gVar;
                    this.L$1 = tlsVar;
                    this.L$2 = tlsVar;
                    this.L$3 = da5Var2;
                    this.L$4 = gVar;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    da5Var = da5Var2;
                    tlsVar2 = tlsVar;
                    obj = e;
                    gVar2 = gVar;
                } catch (Throwable th2) {
                    th = th2;
                    da5Var = da5Var2;
                    jst.e.k(th, "Shortcut text fail loading");
                    tlsVar.invoke(da5Var.a);
                    if (!gVar.d0) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = (g) this.L$4;
                da5Var = (da5) this.L$3;
                tlsVar = (tls) this.L$2;
                tlsVar2 = (tls) this.L$1;
                gVar2 = (g) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, "Shortcut text fail loading");
                    tlsVar.invoke(da5Var.a);
                    if (!gVar.d0) {
                        gVar.e0.invalidateComponent();
                    }
                    return zy11.a;
                }
            }
            tlsVar2.invoke((CharSequence) obj);
            if (!gVar2.d0) {
                gVar2.e0.invalidateComponent();
            }
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
