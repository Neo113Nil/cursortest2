package com.yandex.messaging.internal;

import androidx.room.util.a;
import com.yandex.messaging.internal.net.Error;
import defpackage.iyj0;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Loyj0;", "Lj3b;", "Lcom/yandex/messaging/internal/net/Error;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1", f = "GetChatInfoWithErrorUseCase.kt", l = {64, 71, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1 extends SuspendLambda implements wls {
    final /* synthetic */ oyj0 $this_checkChatOrganizationsAvailability;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1(oyj0 oyj0Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$this_checkChatOrganizationsAvailability = oyj0Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1 getChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1 = new GetChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1(this.$this_checkChatOrganizationsAvailability, this.this$0, continuation);
        getChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1.L$0 = obj;
        return getChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatInfoWithErrorUseCase$checkChatOrganizationsAvailability$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        j3b j3bVar = (j3b) this.$this_checkChatOrganizationsAvailability.b();
        if (j3bVar != null) {
            j3b j3bVar2 = j3bVar.H ? null : j3bVar;
            if (j3bVar2 != null) {
                final long j = j3bVar2.a;
                Boolean bool = (Boolean) this.this$0.c.B(new yls() { // from class: q4t
                    @Override // defpackage.yls
                    public final Object apply(Object obj2) {
                        boolean z;
                        at2 at2Var = ((k020) obj2).b;
                        List a = at2Var.a0().a(j);
                        if (a.isEmpty()) {
                            a = Collections.singletonList(0L);
                        }
                        boolean z2 = true;
                        List<n5b0> list = (List) a.b(at2Var.W().a, true, false, new dia0(15));
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (n5b0 n5b0Var : list) {
                                if (n5b0Var.a == 0 && n5b0Var.g) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!((n5b0) obj3).g) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Long.valueOf(((n5b0) it.next()).a));
                        }
                        if (!z) {
                            arrayList2 = kotlin.collections.a.o0(arrayList2, 0L);
                        }
                        if (!arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (a.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                });
                if (bool != null ? bool.booleanValue() : true) {
                    oyj0 oyj0Var = this.$this_checkChatOrganizationsAvailability;
                    this.label = 2;
                    return vprVar.emit(oyj0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                iyj0 iyj0Var = new iyj0(Error.GENERIC);
                this.label = 3;
                if (vprVar.emit(iyj0Var, this) == coroutineSingletons) {
                }
            }
        }
        oyj0 oyj0Var2 = this.$this_checkChatOrganizationsAvailability;
        this.label = 1;
        if (vprVar.emit(oyj0Var2, this) == coroutineSingletons) {
        }
    }
}
