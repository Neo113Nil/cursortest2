package com.yandex.go.taxi.order.details.v2.state.elements.companion.icon;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.icon.RideCardCompanionIconDataSource$loadCompanionImageByTag$2", f = "RideCardCompanionIconDataSource.kt", l = {38, 38}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionIconDataSource$loadCompanionImageByTag$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionIconDataSource$loadCompanionImageByTag$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardCompanionIconDataSource$loadCompanionImageByTag$2(this.this$0, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompanionIconDataSource$loadCompanionImageByTag$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.b;
            String str = this.$imageTag;
            this.label = 1;
            obj = e.i(eVar, str, null, this, 14);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return (BitmapDrawable) obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        e eVar2 = this.this$0.b;
        String str2 = this.$imageTag;
        this.label = 2;
        obj = e.f(eVar2, str2, null, this, 6);
    }
}
