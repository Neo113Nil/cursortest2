package com.yandex.messaging.internal.authorized;

import defpackage.a7m;
import defpackage.ijg0;
import defpackage.iyj0;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.oyj0;
import defpackage.oyq;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.y6m;
import defpackage.ydz;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$downloadAndSave$2", f = "FilesDownloaderWrapper.kt", l = {112, HProv.PP_PASSWD_TERM, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$downloadAndSave$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileId;
    final /* synthetic */ String $fileName;
    final /* synthetic */ boolean $ignoreCache;
    final /* synthetic */ List<ijg0> $queryParams;
    final /* synthetic */ boolean $shouldOpen;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$downloadAndSave$2(f fVar, String str, String str2, List list, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.$ignoreCache = z;
        this.this$0 = fVar;
        this.$fileId = str;
        this.$fileName = str2;
        this.$shouldOpen = z2;
        this.$queryParams = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z = this.$ignoreCache;
        return new FilesDownloaderWrapper$downloadAndSave$2(this.this$0, this.$fileId, this.$fileName, this.$queryParams, continuation, z, this.$shouldOpen);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FilesDownloaderWrapper$downloadAndSave$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (com.yandex.messaging.internal.authorized.f.a(r1, r4, r5, r6, r12) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (com.yandex.messaging.internal.authorized.f.a(r13, r1, r2, r3, r12) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r13 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    oyj0 oyj0Var = (oyj0) obj;
                    f fVar = this.this$0;
                    String str = this.$fileId;
                    String str2 = this.$fileName;
                    boolean z = this.$shouldOpen;
                    if (oyj0Var instanceof myj0) {
                        this.label = 3;
                    } else {
                        if (!(oyj0Var instanceof iyj0)) {
                            w511.b();
                            return null;
                        }
                        a7m a7mVar = (a7m) ((iyj0) oyj0Var).a;
                        fVar.e.b(str, null);
                        fVar.f(fVar.a.getString(a7mVar instanceof y6m ? oyh0.error_file_deleted_toast : oyh0.save_file_error_toast));
                    }
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        if (ydz.a.a()) {
            ydz.d();
        }
        if (!this.$ignoreCache) {
            if (((oyq) this.this$0.f.b).a(this.$fileId)) {
                f fVar2 = this.this$0;
                String str3 = this.$fileId;
                String str4 = this.$fileName;
                boolean z2 = this.$shouldOpen;
                this.label = 1;
            }
        }
        f fVar3 = this.this$0;
        ConcurrentHashMap concurrentHashMap = fVar3.g;
        String str5 = this.$fileId;
        String str6 = this.$fileName;
        List<ijg0> list = this.$queryParams;
        boolean z3 = this.$ignoreCache;
        Object obj2 = concurrentHashMap.get(str5);
        if (obj2 == null) {
            d dVar = new d(fVar3, str5, str6, list, z3);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str5, dVar);
            obj2 = putIfAbsent == null ? dVar : putIfAbsent;
        }
        this.label = 2;
        obj = ((d) obj2).b.s(this);
        return coroutineSingletons;
    }
}
