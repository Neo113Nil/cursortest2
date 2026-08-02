package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.b7z0;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uye;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsUiStateInteractor$createExpirationTickerFlow$1", f = "MtTicketsUiStateInteractor.kt", l = {173, 177}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsUiStateInteractor$createExpirationTickerFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $expirationDates;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsUiStateInteractor$createExpirationTickerFlow$1(l lVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$expirationDates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtTicketsUiStateInteractor$createExpirationTickerFlow$1 mtTicketsUiStateInteractor$createExpirationTickerFlow$1 = new MtTicketsUiStateInteractor$createExpirationTickerFlow$1(this.this$0, this.$expirationDates, continuation);
        mtTicketsUiStateInteractor$createExpirationTickerFlow$1.L$0 = obj;
        return mtTicketsUiStateInteractor$createExpirationTickerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsUiStateInteractor$createExpirationTickerFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x017e, code lost:
    
        if (r1.emit(r8, r23) != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a5, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r23) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a7, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x012b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01a5 -> B:6:0x01a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map linkedHashMap;
        long j;
        Long l;
        l lVar;
        uye uyeVar;
        Ref$BooleanRef ref$BooleanRef;
        boolean z;
        Ref$LongRef ref$LongRef;
        char c;
        long uptimeMillis;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = true;
        Long l2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.d.keySet().retainAll(this.$expirationDates.keySet());
            Map<String, String> map = this.$expirationDates;
            l lVar2 = this.this$0;
            linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                lVar2.getClass();
                try {
                    l = Long.valueOf(OffsetDateTime.parse(str2).toInstant().toEpochMilli());
                } catch (Throwable unused) {
                    l = l2;
                }
                if (l != null) {
                    long longValue = l.longValue();
                    b7z0 b7z0Var = lVar2.c;
                    LinkedHashMap linkedHashMap2 = lVar2.d;
                    uyeVar = (uye) linkedHashMap2.get(str);
                    lVar = lVar2;
                    if (uyeVar == null || uyeVar.a != longValue) {
                        long a = longValue - b7z0Var.a();
                        uye uyeVar2 = new uye(longValue, a < 0 ? 0L : a, b7z0Var.uptimeMillis());
                        linkedHashMap2.put(str, uyeVar2);
                        uyeVar = uyeVar2;
                    }
                } else {
                    lVar = lVar2;
                    uyeVar = null;
                }
                linkedHashMap.put(key, uyeVar);
                lVar2 = lVar;
                l2 = null;
            }
            j = 0;
            ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = z2;
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            l lVar3 = this.this$0;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
            while (r11.hasNext()) {
            }
            this.L$0 = vprVar;
            this.L$1 = linkedHashMap;
            this.L$2 = ref$BooleanRef;
            this.L$3 = ref$LongRef;
            this.L$4 = null;
            z = true;
            this.label = 1;
        } else if (i == 1) {
            ref$LongRef = (Ref$LongRef) this.L$3;
            ref$BooleanRef = (Ref$BooleanRef) this.L$2;
            linkedHashMap = (Map) this.L$1;
            kotlin.b.b(obj);
            z = true;
            j = 0;
            if (ref$BooleanRef.element) {
                return zy11.a;
            }
            long j2 = ref$LongRef.element > 3600000 ? 1000L : 100L;
            this.L$0 = vprVar;
            this.L$1 = linkedHashMap;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            c = 2;
            this.label = 2;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Map map2 = (Map) this.L$1;
            kotlin.b.b(obj);
            linkedHashMap = map2;
            c = 2;
            z = true;
            j = 0;
            z2 = z;
            ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = z2;
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            l lVar32 = this.this$0;
            LinkedHashMap linkedHashMap32 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key2 = entry2.getKey();
                uye uyeVar3 = (uye) entry2.getValue();
                if (uyeVar3 == null) {
                    uptimeMillis = j;
                } else {
                    uptimeMillis = uyeVar3.b - (lVar32.c.uptimeMillis() - uyeVar3.c);
                    if (uptimeMillis < j) {
                        uptimeMillis = j;
                    }
                    if (uptimeMillis > j) {
                        ref$BooleanRef.element = false;
                        if (uptimeMillis < ref$LongRef.element) {
                            ref$LongRef.element = uptimeMillis;
                        }
                    }
                }
                linkedHashMap32.put(key2, new Long(uptimeMillis));
            }
            this.L$0 = vprVar;
            this.L$1 = linkedHashMap;
            this.L$2 = ref$BooleanRef;
            this.L$3 = ref$LongRef;
            this.L$4 = null;
            z = true;
            this.label = 1;
        }
    }
}
