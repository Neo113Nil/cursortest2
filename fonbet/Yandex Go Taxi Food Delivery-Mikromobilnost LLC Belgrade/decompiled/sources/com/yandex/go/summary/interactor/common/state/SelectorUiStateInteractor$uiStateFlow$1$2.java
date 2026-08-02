package com.yandex.go.summary.interactor.common.state;

import defpackage.akv0;
import defpackage.d6m;
import defpackage.mvg;
import defpackage.nmq0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xjv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lomq0;", "Ld6m;", "doubleSelectorModel", "Lzy11;", "<anonymous>", "(Lvpr;Ld6m;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$uiStateFlow$1$2", f = "SelectorUiStateInteractor.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_VERSION_TIMESTAMP, HProv.PP_VERSION_TIMESTAMP, HProv.PP_SECURITY_LEVEL, HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$uiStateFlow$1$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$uiStateFlow$1$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SelectorUiStateInteractor$uiStateFlow$1$2 selectorUiStateInteractor$uiStateFlow$1$2 = new SelectorUiStateInteractor$uiStateFlow$1$2(this.this$0, (Continuation) obj3);
        selectorUiStateInteractor$uiStateFlow$1$2.L$0 = (vpr) obj;
        selectorUiStateInteractor$uiStateFlow$1$2.L$1 = (d6m) obj2;
        return selectorUiStateInteractor$uiStateFlow$1$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r8 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r8 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r0.emit(r3, r7) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r8 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r8 == r2) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nmq0 nmq0Var;
        vpr vprVar = (vpr) this.L$0;
        d6m d6mVar = (d6m) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                akv0 akv0Var = this.this$0.h;
                boolean z = akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT)) || akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
                c cVar = this.this$0;
                if (!z) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.label = 5;
                    obj = c.f(cVar, d6mVar, this);
                    break;
                } else {
                    this.L$0 = vprVar;
                    this.L$1 = d6mVar;
                    this.label = 1;
                    obj = c.g(cVar, d6mVar, this);
                    break;
                }
                return coroutineSingletons;
            case 1:
                kotlin.b.b(obj);
                nmq0Var = (nmq0) obj;
                this.L$0 = vprVar;
                this.L$1 = d6mVar;
                this.L$2 = nmq0Var;
                this.label = 2;
                break;
            case 2:
                nmq0Var = (nmq0) this.L$2;
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = c.d(cVar2, d6mVar, nmq0Var, this);
                break;
            case 3:
                kotlin.b.b(obj);
                nmq0 nmq0Var2 = (nmq0) obj;
                if (nmq0Var2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    break;
                }
                return zy11.a;
            case 4:
                kotlin.b.b(obj);
                return zy11.a;
            case 5:
                vprVar = (vpr) this.L$2;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                obj = vprVar.emit(obj, this);
                break;
            case 6:
                kotlin.b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
