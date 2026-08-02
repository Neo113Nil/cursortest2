package com.yandex.go.splash.dynamic;

import android.os.SystemClock;
import com.yandex.go.splash.data.dto.DynamicSplash;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.dynamic.DynamicSplashRepository$cacheImages$2", f = "DynamicSplashRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class DynamicSplashRepository$cacheImages$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<DynamicSplash> $splashScreens;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicSplashRepository$cacheImages$2(List list, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$splashScreens = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicSplashRepository$cacheImages$2(this.$splashScreens, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DynamicSplashRepository$cacheImages$2 dynamicSplashRepository$cacheImages$2 = (DynamicSplashRepository$cacheImages$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dynamicSplashRepository$cacheImages$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList t = g8e.t(obj);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List<DynamicSplash> list = this.$splashScreens;
        c cVar = this.this$0;
        for (DynamicSplash dynamicSplash : list) {
            String str = dynamicSplash.d;
            String str2 = dynamicSplash.a;
            boolean z2 = true;
            if (str != null) {
                String l = cVar.l.l("top_image/" + str2, "");
                if (l == null) {
                    l = "";
                }
                if (!new File(l).exists()) {
                    c.a(cVar, dynamicSplash, dynamicSplash.d, "top_image/", dynamicSplash.e, "background_image/", elapsedRealtime);
                    z = true;
                    if (dynamicSplash.e != null) {
                        String l2 = cVar.l.l("background_image/" + str2, "");
                        if (!new File(l2 != null ? l2 : "").exists()) {
                            c.a(cVar, dynamicSplash, dynamicSplash.e, "background_image/", dynamicSplash.d, "top_image/", elapsedRealtime);
                            if (z2) {
                                t.add(str2);
                            } else {
                                arrayList.add(str2);
                            }
                        }
                    }
                    z2 = z;
                    if (z2) {
                    }
                }
            }
            z = false;
            if (dynamicSplash.e != null) {
            }
            z2 = z;
            if (z2) {
            }
        }
        i d = ((j) this.this$0.e.a).d("Main.Splash.StartLoading");
        d.j((r2 & 1) == 0);
        d.e("id_list_loading", t);
        d.e("id_list_loaded", arrayList);
        d.m();
        return zy11.a;
    }
}
