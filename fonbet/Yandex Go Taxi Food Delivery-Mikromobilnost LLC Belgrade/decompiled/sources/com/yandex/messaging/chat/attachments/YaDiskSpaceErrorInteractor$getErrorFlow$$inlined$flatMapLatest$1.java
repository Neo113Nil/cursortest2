package com.yandex.messaging.chat.attachments;

import android.os.Looper;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import defpackage.bvf0;
import defpackage.ek51;
import defpackage.fyj;
import defpackage.j73;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oa;
import defpackage.osa0;
import defpackage.pz40;
import defpackage.s020;
import defpackage.uw80;
import defpackage.vpr;
import defpackage.z83;
import defpackage.zls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1", f = "YaDiskSpaceErrorInteractor.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $messageId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$messageId$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1 yaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1 = new YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1(this.$messageId$inlined, (Continuation) obj3);
        yaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        yaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return yaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            fyj fyjVar = (fyj) ((m8g) ((s020) this.L$1)).F0.get();
            String str = this.$messageId$inlined;
            fyjVar.getClass();
            z83.g(null, Looper.myLooper(), fyjVar.a);
            HashMap hashMap = fyjVar.c;
            pz40 pz40Var = (pz40) hashMap.get(str);
            pz40 pz40Var2 = pz40Var;
            if (pz40Var == null) {
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Number) ((oa) ((pz40) ((Map.Entry) it.next()).getValue())).j().getValue()).intValue() == 0) {
                        it.remove();
                    }
                }
                r0 c = bvf0.c(null);
                osa0 a = fyjVar.b.a(str);
                pz40Var2 = c;
                if (a != null) {
                    uw80[] a2 = a.a();
                    List d0 = a2 != null ? j73.d0(a2) : null;
                    List list = d0;
                    z83.c(null, list == null || list.isEmpty());
                    MessageData messageData = a.f;
                    boolean z = (messageData instanceof ImageMessageData) || (messageData instanceof GalleryMessageData);
                    if (d0 == null) {
                        d0 = EmptyList.a;
                    }
                    c.m(null, new ek51(str, d0, z));
                    hashMap.put(str, c);
                    pz40Var2 = c;
                }
            }
            this.label = 1;
            if (e.u(pz40Var2, vprVar, this) == coroutineSingletons) {
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
