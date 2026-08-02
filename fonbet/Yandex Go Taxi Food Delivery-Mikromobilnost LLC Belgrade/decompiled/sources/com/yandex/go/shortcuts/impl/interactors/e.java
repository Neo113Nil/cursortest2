package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.request.MarkNotifyParam;
import com.yandex.go.shortcuts.impl.dto.ShortcutsApi;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final ShortcutsApi a;

    public e(ShortcutsApi shortcutsApi) {
        this.a = shortcutsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MarkNotifyParam markNotifyParam, ContinuationImpl continuationImpl) {
        MarkNotifyInteractorImpl$markNotify$1 markNotifyInteractorImpl$markNotify$1;
        int i;
        if (continuationImpl instanceof MarkNotifyInteractorImpl$markNotify$1) {
            markNotifyInteractorImpl$markNotify$1 = (MarkNotifyInteractorImpl$markNotify$1) continuationImpl;
            int i2 = markNotifyInteractorImpl$markNotify$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                markNotifyInteractorImpl$markNotify$1.label = i2 - Integer.MIN_VALUE;
                Object obj = markNotifyInteractorImpl$markNotify$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = markNotifyInteractorImpl$markNotify$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<zy11> e = this.a.e(markNotifyParam);
                    markNotifyInteractorImpl$markNotify$1.L$0 = null;
                    markNotifyInteractorImpl$markNotify$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(e, null, markNotifyInteractorImpl$markNotify$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        markNotifyInteractorImpl$markNotify$1 = new MarkNotifyInteractorImpl$markNotify$1(this, continuationImpl);
        Object obj2 = markNotifyInteractorImpl$markNotify$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = markNotifyInteractorImpl$markNotify$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlinx.serialization.json.b bVar, ContinuationImpl continuationImpl) {
        MarkNotifyInteractorImpl$markNotify$2 markNotifyInteractorImpl$markNotify$2;
        int i;
        if (continuationImpl instanceof MarkNotifyInteractorImpl$markNotify$2) {
            markNotifyInteractorImpl$markNotify$2 = (MarkNotifyInteractorImpl$markNotify$2) continuationImpl;
            int i2 = markNotifyInteractorImpl$markNotify$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                markNotifyInteractorImpl$markNotify$2.label = i2 - Integer.MIN_VALUE;
                Object obj = markNotifyInteractorImpl$markNotify$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = markNotifyInteractorImpl$markNotify$2.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (bVar != null) {
                    cmt<zy11> d = this.a.d(bVar);
                    markNotifyInteractorImpl$markNotify$2.L$0 = null;
                    markNotifyInteractorImpl$markNotify$2.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(d, null, markNotifyInteractorImpl$markNotify$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        markNotifyInteractorImpl$markNotify$2 = new MarkNotifyInteractorImpl$markNotify$2(this, continuationImpl);
        Object obj2 = markNotifyInteractorImpl$markNotify$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = markNotifyInteractorImpl$markNotify$2.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
