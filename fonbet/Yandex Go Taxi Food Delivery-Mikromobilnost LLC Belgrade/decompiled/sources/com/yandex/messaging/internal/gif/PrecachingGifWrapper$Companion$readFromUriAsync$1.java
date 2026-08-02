package com.yandex.messaging.internal.gif;

import android.content.Context;
import android.net.Uri;
import defpackage.imz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/internal/gif/b;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/internal/gif/b;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.PrecachingGifWrapper$Companion$readFromUriAsync$1", f = "PrecachingGifWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PrecachingGifWrapper$Companion$readFromUriAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $maxGifMemorySize;
    final /* synthetic */ tse $precachingScope;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrecachingGifWrapper$Companion$readFromUriAsync$1(long j, Uri uri, Context context, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.$maxGifMemorySize = j;
        this.$uri = uri;
        this.$context = context;
        this.$precachingScope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrecachingGifWrapper$Companion$readFromUriAsync$1(this.$maxGifMemorySize, this.$uri, this.$context, this.$precachingScope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrecachingGifWrapper$Companion$readFromUriAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        String path;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$maxGifMemorySize <= 0 || (uri = this.$uri) == null || (path = uri.getPath()) == null) {
            return null;
        }
        Context context = this.$context;
        tse tseVar = this.$precachingScope;
        long j = this.$maxGifMemorySize;
        File file = new File(path);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        imz imzVar = new imz(1L, 134217728L, false);
        long length = file.length();
        if (1 > length || length > imzVar.b) {
            return null;
        }
        try {
            return new b(context, file, tseVar, j);
        } catch (Exception unused) {
            return null;
        }
    }
}
