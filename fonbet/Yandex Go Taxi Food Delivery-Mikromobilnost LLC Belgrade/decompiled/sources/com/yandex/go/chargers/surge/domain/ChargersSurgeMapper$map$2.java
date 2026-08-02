package com.yandex.go.chargers.surge.domain;

import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import defpackage.hwa;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.n4v;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ufu;
import defpackage.vva;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvva;", "<anonymous>", "(Ltse;)Lvva;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.surge.domain.ChargersSurgeMapper$map$2", f = "ChargersSurgeMapper.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSurgeMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersSurgeDto $dto;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSurgeMapper$map$2(a aVar, ChargersSurgeDto chargersSurgeDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dto = chargersSurgeDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersSurgeMapper$map$2(this.this$0, this.$dto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSurgeMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kdc kdcVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            kdc e = ((ufu) this.this$0.a).e(this.$dto.c);
            if (e != null) {
                e eVar = this.this$0.b;
                String str = this.$dto.b;
                this.L$0 = e;
                this.label = 1;
                Object q = eVar.q(str, this);
                if (q == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kdcVar = e;
                obj = q;
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kdcVar = (kdc) this.L$0;
        b.b(obj);
        n4v n4vVar = (n4v) obj;
        if (n4vVar != null) {
            a aVar = this.this$0;
            ChargersSurgeModalDto chargersSurgeModalDto = this.$dto.d;
            aVar.getClass();
            hwa b = a.b(chargersSurgeModalDto);
            if (b != null) {
                return new vva(y6i0.d(this.$dto.a, 0, 100), n4vVar, kdcVar, b);
            }
        }
        return null;
    }
}
