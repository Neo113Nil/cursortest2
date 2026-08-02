package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.bvf0;
import defpackage.cgo;
import defpackage.hev;
import defpackage.mvg;
import defpackage.nm91;
import defpackage.ny61;
import defpackage.pw01;
import defpackage.qg70;
import defpackage.tse;
import defpackage.u1o;
import defpackage.wis0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu1o;", "<anonymous>", "(Ltse;)Lu1o;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class EngineInterceptor$transform$3 extends SuspendLambda implements wls {
    final /* synthetic */ cgo $eventListener;
    final /* synthetic */ qg70 $options;
    final /* synthetic */ hev $request;
    final /* synthetic */ u1o $result;
    final /* synthetic */ List<pw01> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$transform$3(a aVar, u1o u1oVar, qg70 qg70Var, List list, cgo cgoVar, hev hevVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$result = u1oVar;
        this.$options = qg70Var;
        this.$transformations = list;
        this.$eventListener = cgoVar;
        this.$request = hevVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, continuation);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$transform$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (defpackage.j73.y(defpackage.m.a, defpackage.mga1.d(r1)) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0089 -> B:5:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap a;
        qg70 qg70Var;
        tse tseVar;
        Bitmap bitmap;
        int size;
        List<pw01> list;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            tse tseVar2 = (tse) this.L$0;
            a aVar = this.this$0;
            Drawable drawable = this.$result.a;
            qg70 qg70Var2 = this.$options;
            aVar.getClass();
            if (drawable instanceof BitmapDrawable) {
                a = ((BitmapDrawable) drawable).getBitmap();
            }
            a = nm91.a(drawable, qg70Var2.b, qg70Var2.d, qg70Var2.e, qg70Var2.f);
            this.$eventListener.getClass();
            List<pw01> list2 = this.$transformations;
            qg70Var = this.$options;
            tseVar = tseVar2;
            bitmap = a;
            size = list2.size();
            list = list2;
            i = 0;
            if (i < size) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = this.I$1;
            i = this.I$0;
            qg70Var = (qg70) this.L$2;
            list = (List) this.L$1;
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
            bitmap = (Bitmap) obj;
            bvf0.t(tseVar);
            i++;
            if (i < size) {
                pw01 pw01Var = list.get(i);
                wis0 wis0Var = qg70Var.d;
                this.L$0 = tseVar;
                this.L$1 = list;
                this.L$2 = qg70Var;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                obj = pw01Var.b(bitmap, wis0Var);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bitmap = (Bitmap) obj;
                bvf0.t(tseVar);
                i++;
                if (i < size) {
                    this.$eventListener.getClass();
                    u1o u1oVar = this.$result;
                    return new u1o(new BitmapDrawable(this.$request.a.getResources(), bitmap), u1oVar.b, u1oVar.c, u1oVar.d);
                }
            }
        }
    }
}
