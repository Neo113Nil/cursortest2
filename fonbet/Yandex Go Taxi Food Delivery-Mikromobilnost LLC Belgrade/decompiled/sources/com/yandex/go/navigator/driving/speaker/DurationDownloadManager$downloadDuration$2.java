package com.yandex.go.navigator.driving.speaker;

import defpackage.jst;
import defpackage.mvg;
import defpackage.my31;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.speaker.DurationDownloadManager$downloadDuration$2", f = "DurationDownloadManager.kt", l = {38, 43, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DurationDownloadManager$downloadDuration$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationDownloadManager$downloadDuration$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DurationDownloadManager$downloadDuration$2(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DurationDownloadManager$downloadDuration$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (com.yandex.go.navigator.driving.speaker.a.a(r1, r10) != r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[Catch: all -> 0x00aa, LOOP:0: B:19:0x009e->B:21:0x00a5, LOOP_END, TryCatch #3 {all -> 0x00aa, blocks: (B:18:0x009c, B:19:0x009e, B:21:0x00a5, B:23:0x00ac), top: B:17:0x009c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[EDGE_INSN: B:22:0x00ac->B:23:0x00ac BREAK  A[LOOP:0: B:19:0x009e->B:21:0x00a5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        a aVar;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        int read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    aVar = (a) this.L$0;
                    kotlin.b.b(obj);
                    Closeable closeable = (Closeable) obj;
                    try {
                        inputStream = (InputStream) closeable;
                        fileOutputStream = new FileOutputStream(aVar.e.a + "/durations.json");
                        try {
                            bArr = new byte[1024];
                            while (true) {
                                read = inputStream.read(bArr);
                                if (read != -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            ooc.g(closeable, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            kotlin.b.b(obj);
            failure = zy11.a;
            if (Result.a(failure) != null) {
                jst.e.getClass();
            }
            return new Result(failure);
        }
        kotlin.b.b(obj);
        aVar = this.this$0;
        String str = this.$url;
        my31 my31Var = aVar.c;
        my31Var.getClass();
        if (new File(my31Var.a.a + "/durations.json").exists()) {
            this.L$0 = null;
            this.label = 1;
            if (a.a(aVar, this) == coroutineSingletons) {
            }
            failure = zy11.a;
            if (Result.a(failure) != null) {
            }
            return new Result(failure);
        }
        if (str != null) {
            com.yandex.go.navigator.settings.network.repository.a aVar2 = aVar.d;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = aVar2.a(str, this);
            if (obj == coroutineSingletons) {
            }
            Closeable closeable2 = (Closeable) obj;
            inputStream = (InputStream) closeable2;
            fileOutputStream = new FileOutputStream(aVar.e.a + "/durations.json");
            bArr = new byte[1024];
            while (true) {
                read = inputStream.read(bArr);
                if (read != -1) {
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            ooc.g(closeable2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        failure = zy11.a;
        if (Result.a(failure) != null) {
        }
        return new Result(failure);
        return coroutineSingletons;
    }
}
