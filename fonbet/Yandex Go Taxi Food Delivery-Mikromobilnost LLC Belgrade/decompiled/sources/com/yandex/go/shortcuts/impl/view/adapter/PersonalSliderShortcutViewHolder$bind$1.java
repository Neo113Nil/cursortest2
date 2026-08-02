package com.yandex.go.shortcuts.impl.view.adapter;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.PersonalSliderShortcutViewHolder$bind$1", f = "PersonalSliderShortcutViewHolder.kt", l = {HProv.PP_ENUM_LOG, 139}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PersonalSliderShortcutViewHolder$bind$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalSliderShortcutViewHolder$bind$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalSliderShortcutViewHolder$bind$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalSliderShortcutViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (kotlinx.coroutines.a.i(5000, r6) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003a -> B:9:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0047 -> B:9:0x004a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nVar = this.this$0;
            if (!kotlinx.coroutines.a.p(get_context())) {
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar = (n) this.L$0;
            kotlin.b.b(obj);
            if (!nVar.a0) {
                RecyclerView recyclerView = nVar.V;
                recyclerView.smoothScrollBy(0, recyclerView.getHeight());
            }
            if (!kotlinx.coroutines.a.p(get_context())) {
                return zy11.a;
            }
            if (nVar.a0) {
                this.L$0 = nVar;
                this.label = 1;
            } else {
                this.L$0 = nVar;
                this.label = 2;
            }
            if (!kotlinx.coroutines.a.p(get_context())) {
            }
        }
    }
}
