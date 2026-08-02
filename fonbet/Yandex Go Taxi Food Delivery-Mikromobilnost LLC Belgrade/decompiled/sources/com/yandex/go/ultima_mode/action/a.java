package com.yandex.go.ultima_mode.action;

import android.net.Uri;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.pv01;
import defpackage.tu11;
import defpackage.uu11;
import defpackage.vu11;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes14.dex */
public final class a {
    public final n3h a;
    public final com.yandex.go.ultima_mode.preferences.a b;

    public a(n3h n3hVar, com.yandex.go.ultima_mode.preferences.a aVar) {
        this.a = n3hVar;
        this.b = aVar;
    }

    public final Object a(vu11 vu11Var, SuspendLambda suspendLambda) {
        if (vu11Var instanceof tu11) {
            this.a.a(Uri.parse(((tu11) vu11Var).b), DeeplinkSource.UNSPECIFIED);
        } else if (vu11Var instanceof uu11) {
            return b(suspendLambda);
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        UltimaModeActionHandler$toggleUltimaMode$1 ultimaModeActionHandler$toggleUltimaMode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        if (continuationImpl instanceof UltimaModeActionHandler$toggleUltimaMode$1) {
            ultimaModeActionHandler$toggleUltimaMode$1 = (UltimaModeActionHandler$toggleUltimaMode$1) continuationImpl;
            int i2 = ultimaModeActionHandler$toggleUltimaMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ultimaModeActionHandler$toggleUltimaMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ultimaModeActionHandler$toggleUltimaMode$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ultimaModeActionHandler$toggleUltimaMode$1.label;
                com.yandex.go.ultima_mode.preferences.a aVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    ultimaModeActionHandler$toggleUltimaMode$1.label = 1;
                    aVar.getClass();
                    obj = aVar.a(new pv01(12, aVar), ultimaModeActionHandler$toggleUltimaMode$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ultimaModeActionHandler$toggleUltimaMode$1.Z$0 = booleanValue;
                ultimaModeActionHandler$toggleUltimaMode$1.label = 2;
                aVar.getClass();
                a = aVar.a(new zo1(aVar, !booleanValue, 17), ultimaModeActionHandler$toggleUltimaMode$1);
                if (a != coroutineSingletons) {
                    a = zy11.a;
                }
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        ultimaModeActionHandler$toggleUltimaMode$1 = new UltimaModeActionHandler$toggleUltimaMode$1(this, continuationImpl);
        Object obj2 = ultimaModeActionHandler$toggleUltimaMode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ultimaModeActionHandler$toggleUltimaMode$1.label;
        com.yandex.go.ultima_mode.preferences.a aVar2 = this.b;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ultimaModeActionHandler$toggleUltimaMode$1.Z$0 = booleanValue2;
        ultimaModeActionHandler$toggleUltimaMode$1.label = 2;
        aVar2.getClass();
        a = aVar2.a(new zo1(aVar2, !booleanValue2, 17), ultimaModeActionHandler$toggleUltimaMode$1);
        if (a != coroutineSingletons) {
        }
        if (a != coroutineSingletons) {
        }
    }
}
