package coil3.intercept;

import android.content.Context;
import coil3.graphics.EnumC0136DataSource;
import defpackage.adi0;
import defpackage.ago;
import defpackage.gev;
import defpackage.gp50;
import defpackage.ii10;
import defpackage.ji10;
import defpackage.l8w;
import defpackage.lg70;
import defpackage.mvg;
import defpackage.nc2;
import defpackage.ny61;
import defpackage.q7v;
import defpackage.t1o;
import defpackage.t3v0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt3v0;", "<anonymous>", "(Ltse;)Lt3v0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class EngineInterceptor$intercept$2 extends SuspendLambda implements wls {
    final /* synthetic */ ii10 $cacheKey;
    final /* synthetic */ l8w $chain;
    final /* synthetic */ ago $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ lg70 $options;
    final /* synthetic */ gev $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(a aVar, gev gevVar, Object obj, lg70 lg70Var, ago agoVar, ii10 ii10Var, l8w l8wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = gevVar;
        this.$mappedData = obj;
        this.$options = lg70Var;
        this.$eventListener = agoVar;
        this.$cacheKey = ii10Var;
        this.$chain = l8wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$intercept$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EngineInterceptor$intercept$2 engineInterceptor$intercept$2;
        boolean z;
        adi0 d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            gev gevVar = this.$request;
            Object obj2 = this.$mappedData;
            lg70 lg70Var = this.$options;
            ago agoVar = this.$eventListener;
            this.label = 1;
            engineInterceptor$intercept$2 = this;
            obj = a.c(aVar, gevVar, obj2, lg70Var, agoVar, engineInterceptor$intercept$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            engineInterceptor$intercept$2 = this;
        }
        t1o t1oVar = (t1o) obj;
        nc2 nc2Var = engineInterceptor$intercept$2.this$0.b;
        synchronized (nc2Var) {
            try {
                coil3.c cVar = (coil3.c) nc2Var.a.get();
                if (cVar == null) {
                    nc2Var.a();
                } else if (nc2Var.d == null) {
                    Context context = cVar.a.a;
                    nc2Var.d = context;
                    context.registerComponentCallbacks(nc2Var.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gp50 gp50Var = engineInterceptor$intercept$2.this$0.d;
        ii10 ii10Var = engineInterceptor$intercept$2.$cacheKey;
        gev gevVar2 = engineInterceptor$intercept$2.$request;
        if (ii10Var == null || !gevVar2.k.getWriteEnabled() || !t1oVar.a.a() || (d = ((coil3.c) gp50Var.b).d()) == null) {
            z = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(t1oVar.b));
            String str = t1oVar.d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            d.b(ii10Var, new ji10(t1oVar.a, linkedHashMap));
            z = true;
        }
        q7v q7vVar = t1oVar.a;
        gev gevVar3 = engineInterceptor$intercept$2.$request;
        EnumC0136DataSource enumC0136DataSource = t1oVar.c;
        ii10 ii10Var2 = z ? engineInterceptor$intercept$2.$cacheKey : null;
        String str2 = t1oVar.d;
        boolean z2 = t1oVar.b;
        l8w l8wVar = engineInterceptor$intercept$2.$chain;
        return new t3v0(q7vVar, gevVar3, enumC0136DataSource, ii10Var2, str2, z2, (l8wVar instanceof c) && ((c) l8wVar).g);
    }
}
