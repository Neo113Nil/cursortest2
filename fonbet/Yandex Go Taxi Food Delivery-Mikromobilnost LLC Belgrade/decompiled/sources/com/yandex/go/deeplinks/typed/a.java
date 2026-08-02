package com.yandex.go.deeplinks.typed;

import android.net.Uri;
import defpackage.h0h;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.v770;
import defpackage.vl3;
import defpackage.z0h;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.settings.main.l;

/* loaded from: classes.dex */
public abstract class a implements z0h {
    public final h0h a;

    public a(h0h h0hVar) {
        this.a = h0hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.z0h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Uri uri, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        TypedDeeplinkHandler$process$1 typedDeeplinkHandler$process$1;
        int i;
        a aVar;
        if (continuation instanceof TypedDeeplinkHandler$process$1) {
            typedDeeplinkHandler$process$1 = (TypedDeeplinkHandler$process$1) continuation;
            int i2 = typedDeeplinkHandler$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedDeeplinkHandler$process$1.label = i2 - Integer.MIN_VALUE;
                TypedDeeplinkHandler$process$1 typedDeeplinkHandler$process$12 = typedDeeplinkHandler$process$1;
                Object obj = typedDeeplinkHandler$process$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedDeeplinkHandler$process$12.label;
                if (i != 0) {
                    b.b(obj);
                    Object d = this.a.d(uri);
                    if (d == null) {
                        return n5u.a;
                    }
                    typedDeeplinkHandler$process$12.L$0 = null;
                    typedDeeplinkHandler$process$12.L$1 = null;
                    typedDeeplinkHandler$process$12.L$2 = null;
                    typedDeeplinkHandler$process$12.L$3 = null;
                    typedDeeplinkHandler$process$12.L$4 = null;
                    typedDeeplinkHandler$process$12.label = 1;
                    aVar = this;
                    if (aVar.c(oep0Var, d, v770Var, deeplinkSource, typedDeeplinkHandler$process$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    aVar = this;
                }
                return new m5u(aVar.b(), aVar instanceof l);
            }
        }
        typedDeeplinkHandler$process$1 = new TypedDeeplinkHandler$process$1(this, (ContinuationImpl) continuation);
        TypedDeeplinkHandler$process$1 typedDeeplinkHandler$process$122 = typedDeeplinkHandler$process$1;
        Object obj2 = typedDeeplinkHandler$process$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedDeeplinkHandler$process$122.label;
        if (i != 0) {
        }
        return new m5u(aVar.b(), aVar instanceof l);
    }

    public boolean b() {
        return !(this instanceof vl3);
    }

    public abstract Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation);
}
