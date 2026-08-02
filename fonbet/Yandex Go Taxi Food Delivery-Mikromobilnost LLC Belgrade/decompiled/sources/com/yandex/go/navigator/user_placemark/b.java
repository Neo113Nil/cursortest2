package com.yandex.go.navigator.user_placemark;

import android.graphics.Bitmap;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import defpackage.m7x0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r4v;
import defpackage.vpr;
import defpackage.wr21;
import defpackage.yr21;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ yr21 a;

    public b(yr21 yr21Var) {
        this.a = yr21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1 userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1;
        int i;
        n4u0 n4u0Var;
        wr21 wr21Var;
        n4u0 n4u0Var2;
        if (continuation instanceof UserPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1) {
            userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1 = (UserPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.label;
                ModelProvider modelProvider = null;
                yr21 yr21Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    wr21 wr21Var2 = (wr21) obj;
                    n4u0Var = yr21Var.f;
                    boolean z = wr21Var2.b;
                    String str = wr21Var2.c;
                    if (z && wr21Var2.a && str.length() > 0) {
                        r4v r4vVar = yr21Var.c;
                        userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.L$0 = null;
                        userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.L$1 = null;
                        userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.L$2 = wr21Var2;
                        userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.L$3 = n4u0Var;
                        userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.label = 1;
                        Object b = ru.yandex.taxi.utils.a.b(r4vVar.a.b().b(((m7x0) r4vVar.b).a(str)), userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        wr21Var = wr21Var2;
                        n4u0Var2 = n4u0Var;
                        obj2 = b;
                    }
                    ((r0) n4u0Var).l(modelProvider);
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n4u0Var2 = (pz40) userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.L$3;
                wr21Var = (wr21) userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.L$2;
                kotlin.b.b(obj2);
                modelProvider = yr21Var.c(ImageProvider.fromBitmap((Bitmap) obj2, true, wr21Var.d));
                n4u0Var = n4u0Var2;
                ((r0) n4u0Var).l(modelProvider);
                return zy11.a;
            }
        }
        userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1 = new UserPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPlacemarkIconProvider$attach$$inlined$safeCollectIn$1$2$1.label;
        ModelProvider modelProvider2 = null;
        yr21 yr21Var2 = this.a;
        if (i != 0) {
        }
        modelProvider2 = yr21Var2.c(ImageProvider.fromBitmap((Bitmap) obj22, true, wr21Var.d));
        n4u0Var = n4u0Var2;
        ((r0) n4u0Var).l(modelProvider2);
        return zy11.a;
    }
}
