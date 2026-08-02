package com.yandex.mobile.drive.scan.ui;

import android.net.Uri;
import defpackage.dn31;
import defpackage.in31;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tk31;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.scan.ui.ScanPresenter$VideoSavedConsumer$accept$1", f = "ScanPresenter.kt", l = {373}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ScanPresenter$VideoSavedConsumer$accept$1 extends SuspendLambda implements wls {
    final /* synthetic */ in31 $event;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanPresenter$VideoSavedConsumer$accept$1(in31 in31Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$event = in31Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScanPresenter$VideoSavedConsumer$accept$1(this.$event, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScanPresenter$VideoSavedConsumer$accept$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uri uri = ((dn31) this.$event).b.a;
            if (!jl40.l(uri.getScheme(), "file")) {
                w511.f(unr0.n(uri, "Uri lacks 'file' scheme: "));
                return null;
            }
            String path = uri.getPath();
            if (path == null) {
                w511.f(unr0.n(uri, "Uri path is null: "));
                return null;
            }
            File file = new File(path);
            b bVar = this.this$0;
            tk31 tk31Var = new tk31(file, bVar.u - bVar.t);
            this.L$0 = null;
            this.label = 1;
            if (b.c(bVar, tk31Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
