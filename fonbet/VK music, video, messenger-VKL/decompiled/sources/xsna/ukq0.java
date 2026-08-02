package xsna;

import android.location.Location;
import android.os.Parcelable;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.presentation.h;
import com.vk.location.common.LocationCommon;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserLocationWorkDelegate.kt */
@b6l(c = "com.vk.geo.impl.presentation.map.UserLocationWorkDelegate$determineUserCoordinate$1", f = "UserLocationWorkDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ukq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $fallback;
    final /* synthetic */ boolean $withNavigation;
    int label;
    final /* synthetic */ vkq0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukq0(vkq0 vkq0Var, gzs<s3q0> gzsVar, boolean z, spj<? super ukq0> spjVar) {
        super(2, spjVar);
        this.this$0 = vkq0Var;
        this.$fallback = gzsVar;
        this.$withNavigation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ukq0(this.this$0, this.$fallback, this.$withNavigation, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ukq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Location f = kzz.f(this.this$0.a);
        LocationCommon.a.getClass();
        if (f == LocationCommon.b) {
            gzs<s3q0> gzsVar = this.$fallback;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            return s3q0.a;
        }
        double latitude = f.getLatitude();
        double longitude = f.getLongitude();
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        long a = gqr.a((float) latitude, (float) longitude);
        izs<? super Coordinate, s3q0> izsVar = this.this$0.l;
        if (izsVar != null) {
            izsVar.invoke(new Coordinate(a));
        }
        this.this$0.l = null;
        this.this$0.j = new Coordinate(a);
        if (this.$withNavigation) {
            this.this$0.g.invoke(new Coordinate(a));
            this.this$0.f.invoke(new h.f(a, new ZoomLevel(16.0f), false, 28));
        }
        return s3q0.a;
    }
}
