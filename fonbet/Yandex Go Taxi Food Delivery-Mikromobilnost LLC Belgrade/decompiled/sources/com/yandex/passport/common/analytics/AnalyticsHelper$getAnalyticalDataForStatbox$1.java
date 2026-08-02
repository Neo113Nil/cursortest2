package com.yandex.passport.common.analytics;

import android.os.Build;
import android.text.TextUtils;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qke;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.common.analytics.AnalyticsHelper$getAnalyticalDataForStatbox$1", f = "AnalyticsHelper.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AnalyticsHelper$getAnalyticalDataForStatbox$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationPackageName;
    final /* synthetic */ String $applicationVersion;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsHelper$getAnalyticalDataForStatbox$1(f fVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$applicationPackageName = str;
        this.$applicationVersion = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsHelper$getAnalyticalDataForStatbox$1(this.this$0, this.$applicationPackageName, this.$applicationVersion, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsHelper$getAnalyticalDataForStatbox$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar2 = this.this$0;
            String str = this.$applicationPackageName;
            String str2 = this.$applicationVersion;
            int i2 = f.f;
            a b = fVar2.b(str, str2);
            d dVar = this.this$0.b;
            long c = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
            this.L$0 = fVar2;
            this.L$1 = b;
            this.label = 1;
            Object a = dVar.a(c, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            fVar = fVar2;
            aVar = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$1;
            fVar = (f) this.L$0;
            kotlin.b.b(obj);
        }
        b bVar = (b) obj;
        int i3 = f.f;
        fVar.getClass();
        aVar.getClass();
        Pair pair = new Pair("manufacturer", Build.MANUFACTURER);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_platform", String.format(Locale.US, "Android %s (%s)", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE, Build.VERSION.CODENAME}, 2)));
        Pair pair4 = new Pair("am_version_name", "7.55.1(755015154)");
        String str3 = aVar.d;
        Pair pair5 = new Pair(CommonUrlParts.APP_ID, str3);
        String str4 = aVar.e;
        Pair pair6 = new Pair(CommonUrlParts.APP_VERSION, str4);
        if (!TextUtils.isEmpty(str4)) {
            str3 = oyr.f(HexString.CHAR_SPACE, str3, str4);
        }
        Pair pair7 = new Pair("am_app", str3);
        String str5 = bVar.a;
        if (str5 == null) {
            str5 = null;
        }
        Pair pair8 = new Pair(CommonUrlParts.DEVICE_ID, str5);
        String str6 = bVar.b;
        return Collections.unmodifiableMap(qke.k(kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("uuid", str6 != null ? str6 : null))));
    }
}
