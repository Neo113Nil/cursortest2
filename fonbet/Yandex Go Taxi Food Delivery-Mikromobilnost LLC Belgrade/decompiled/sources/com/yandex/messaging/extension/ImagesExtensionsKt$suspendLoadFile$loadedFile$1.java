package com.yandex.messaging.extension;

import android.net.Uri;
import defpackage.dnh;
import defpackage.fyc;
import defpackage.g9v;
import defpackage.gwk0;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yn50;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljava/io/File;", "<anonymous>", "(Ltse;)Ljava/io/File;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.ImagesExtensionsKt$suspendLoadFile$loadedFile$1", f = "ImagesExtensions.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImagesExtensionsKt$suspendLoadFile$loadedFile$1 extends SuspendLambda implements wls {
    final /* synthetic */ g9v $this_suspendLoadFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesExtensionsKt$suspendLoadFile$loadedFile$1(g9v g9vVar, Continuation continuation) {
        super(2, continuation);
        this.$this_suspendLoadFile = g9vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImagesExtensionsKt$suspendLoadFile$loadedFile$1(this.$this_suspendLoadFile, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImagesExtensionsKt$suspendLoadFile$loadedFile$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String path;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g9v g9vVar = this.$this_suspendLoadFile;
            this.label = 1;
            fyc b = gwk0.b();
            dnh dnhVar = new dnh();
            dnhVar.b = b;
            Uri c = ((yn50) g9vVar).c(dnhVar);
            String path2 = c != null ? c.getPath() : null;
            obj = (path2 == null || !new File(path2).exists()) ? b.s(this) : new myj0(c);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Uri uri = (Uri) ((oyj0) obj).b();
        if (uri == null || (path = uri.getPath()) == null) {
            return null;
        }
        return new File(path);
    }
}
