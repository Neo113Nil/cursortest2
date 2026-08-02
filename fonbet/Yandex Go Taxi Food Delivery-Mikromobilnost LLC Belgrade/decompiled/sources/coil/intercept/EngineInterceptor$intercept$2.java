package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.c;
import coil.graphics.DataSource;
import coil.memory.MemoryCache$Key;
import defpackage.au50;
import defpackage.bdi0;
import defpackage.cgo;
import defpackage.hev;
import defpackage.m;
import defpackage.mvg;
import defpackage.n8w;
import defpackage.ny61;
import defpackage.qg70;
import defpackage.tse;
import defpackage.u1o;
import defpackage.u3v0;
import defpackage.uh6;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu3v0;", "<anonymous>", "(Ltse;)Lu3v0;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class EngineInterceptor$intercept$2 extends SuspendLambda implements wls {
    final /* synthetic */ MemoryCache$Key $cacheKey;
    final /* synthetic */ n8w $chain;
    final /* synthetic */ cgo $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ qg70 $options;
    final /* synthetic */ hev $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(a aVar, hev hevVar, Object obj, qg70 qg70Var, cgo cgoVar, MemoryCache$Key memoryCache$Key, n8w n8wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = hevVar;
        this.$mappedData = obj;
        this.$options = qg70Var;
        this.$eventListener = cgoVar;
        this.$cacheKey = memoryCache$Key;
        this.$chain = n8wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$intercept$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EngineInterceptor$intercept$2 engineInterceptor$intercept$2;
        bdi0 bdi0Var;
        Bitmap bitmap;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            hev hevVar = this.$request;
            Object obj2 = this.$mappedData;
            qg70 qg70Var = this.$options;
            cgo cgoVar = this.$eventListener;
            this.label = 1;
            engineInterceptor$intercept$2 = this;
            obj = a.b(aVar, hevVar, obj2, qg70Var, cgoVar, engineInterceptor$intercept$2);
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
        u1o u1oVar = (u1o) obj;
        engineInterceptor$intercept$2.this$0.b.registerMemoryPressureCallbacks();
        au50 au50Var = engineInterceptor$intercept$2.this$0.d;
        MemoryCache$Key memoryCache$Key = engineInterceptor$intercept$2.$cacheKey;
        if (engineInterceptor$intercept$2.$request.q.getWriteEnabled() && (bdi0Var = (bdi0) ((c) au50Var.b).c.getValue()) != null && memoryCache$Key != null) {
            Drawable drawable = u1oVar.a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(u1oVar.b));
                String str = u1oVar.d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                bdi0Var.a.c(MemoryCache$Key.copy$default(memoryCache$Key, null, uh6.Q(memoryCache$Key.getExtras()), 1, null), bitmap, uh6.Q(linkedHashMap));
                z = true;
                Drawable drawable2 = u1oVar.a;
                hev hevVar2 = engineInterceptor$intercept$2.$request;
                DataSource dataSource = u1oVar.c;
                MemoryCache$Key memoryCache$Key2 = z ? engineInterceptor$intercept$2.$cacheKey : null;
                String str2 = u1oVar.d;
                boolean z2 = u1oVar.b;
                n8w n8wVar = engineInterceptor$intercept$2.$chain;
                Bitmap.Config[] configArr = m.a;
                return new u3v0(drawable2, hevVar2, dataSource, memoryCache$Key2, str2, z2, !(n8wVar instanceof b) && ((b) n8wVar).e());
            }
        }
        z = false;
        Drawable drawable22 = u1oVar.a;
        hev hevVar22 = engineInterceptor$intercept$2.$request;
        DataSource dataSource2 = u1oVar.c;
        if (z) {
        }
        String str22 = u1oVar.d;
        boolean z22 = u1oVar.b;
        n8w n8wVar2 = engineInterceptor$intercept$2.$chain;
        Bitmap.Config[] configArr2 = m.a;
        return new u3v0(drawable22, hevVar22, dataSource2, memoryCache$Key2, str22, z22, !(n8wVar2 instanceof b) && ((b) n8wVar2).e());
    }
}
