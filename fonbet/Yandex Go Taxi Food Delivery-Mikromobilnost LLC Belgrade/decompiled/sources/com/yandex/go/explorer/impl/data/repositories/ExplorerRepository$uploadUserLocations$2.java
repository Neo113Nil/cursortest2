package com.yandex.go.explorer.impl.data.repositories;

import com.yandex.go.explorer.impl.data.api.ExplorerInternalApi;
import com.yandex.go.explorer.impl.data.models.UserLocationsRequestDto;
import defpackage.ato;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.data.repositories.ExplorerRepository$uploadUserLocations$2", f = "ExplorerRepository.kt", l = {52, 61, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRepository$uploadUserLocations$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRepository$uploadUserLocations$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRepository$uploadUserLocations$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRepository$uploadUserLocations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r8.a(r7) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        if (r8 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.explorer.impl.data.storage.a aVar = this.this$0.a;
                this.label = 1;
                obj = aVar.b(this);
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return Boolean.TRUE;
                }
                cVar = (c) this.L$1;
                kotlin.b.b(obj);
                com.yandex.go.explorer.impl.data.storage.a aVar2 = cVar.a;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                return Boolean.TRUE;
            }
            cVar = this.this$0;
            ato atoVar = cVar.d;
            cmt<zy11> b = ((ExplorerInternalApi) atoVar.a.getValue()).b(new UserLocationsRequestDto(list));
            this.L$0 = null;
            this.L$1 = cVar;
            this.label = 2;
            if (ru.yandex.taxi.network.api.a.a(b, null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            com.yandex.go.explorer.impl.data.storage.a aVar22 = cVar.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }
}
