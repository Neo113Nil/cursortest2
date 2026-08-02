package com.yandex.go.places.impl.ui.common.map.location;

import android.graphics.Bitmap;
import defpackage.evu0;
import defpackage.g16;
import defpackage.kj;
import defpackage.mvg;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qje;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.common.map.location.PlacesUserAvatarProviderImpl$loadUserAvatar$2", f = "PlacesUserAvatarProviderImpl.kt", l = {41, 46, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesUserAvatarProviderImpl$loadUserAvatar$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesUserAvatarProviderImpl$loadUserAvatar$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesUserAvatarProviderImpl$loadUserAvatar$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesUserAvatarProviderImpl$loadUserAvatar$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r7 != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable unused) {
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 3;
            aVar.c.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(o400.a, new PlacesUserAvatarProviderImpl$loadDefaultUserAvatar$2(aVar, null), this);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            this.label = 1;
            kj Ig = aVar2.d.a.Ig();
            String str = Ig != null ? Ig.h : null;
            if (str != null && !evu0.J(str)) {
                g16 b = aVar2.b.b().b(str);
                int i2 = aVar2.e;
                obj = ru.yandex.taxi.utils.a.b(b.g(i2, i2).e(nfv.a), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            obj = null;
            if (obj == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return (Bitmap) obj;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (Bitmap) obj;
            }
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        a aVar3 = this.this$0;
        if (bitmap != null) {
            return a.a(aVar3, bitmap, qje.t(xng0.bgMain, aVar3.a));
        }
        this.label = 2;
        aVar3.c.getClass();
        sjh sjhVar2 = uyj.a;
        obj = tje.k0(o400.a, new PlacesUserAvatarProviderImpl$loadDefaultUserAvatar$2(aVar3, null), this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        return (Bitmap) obj;
    }
}
