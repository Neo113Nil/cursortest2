package com.yandex.go.navigator.settings.network.repository;

import com.yandex.go.navigator.settings.network.api.NavigatorSettingsApi;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.my30;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.x6v;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final h3y a;

    public a(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        NavigatorVoiceRepository$getFile$1 navigatorVoiceRepository$getFile$1;
        int i;
        if (continuationImpl instanceof NavigatorVoiceRepository$getFile$1) {
            navigatorVoiceRepository$getFile$1 = (NavigatorVoiceRepository$getFile$1) continuationImpl;
            int i2 = navigatorVoiceRepository$getFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorVoiceRepository$getFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorVoiceRepository$getFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorVoiceRepository$getFile$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<rvj0> a = ((NavigatorSettingsApi) this.a.get()).a(str, x6v.a);
                    my30 my30Var = new my30(str, 8);
                    navigatorVoiceRepository$getFile$1.L$0 = null;
                    navigatorVoiceRepository$getFile$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, my30Var, navigatorVoiceRepository$getFile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((rvj0) obj).byteStream();
            }
        }
        navigatorVoiceRepository$getFile$1 = new NavigatorVoiceRepository$getFile$1(this, continuationImpl);
        Object obj2 = navigatorVoiceRepository$getFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorVoiceRepository$getFile$1.label;
        if (i != 0) {
        }
        return ((rvj0) obj2).byteStream();
    }
}
