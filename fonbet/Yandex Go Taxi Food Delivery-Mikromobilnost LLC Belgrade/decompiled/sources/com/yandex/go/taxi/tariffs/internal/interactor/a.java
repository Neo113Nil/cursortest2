package com.yandex.go.taxi.tariffs.internal.interactor;

import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.go.taxi.tariffs.internal.repository.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.ny61;
import defpackage.o820;
import defpackage.qrw;
import defpackage.sxg;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final ck31 a;
    public final com.yandex.go.route.interactor.b b;
    public final ru.yandex.taxi.shortcuts.interactors.a c;
    public final qrw d;
    public final r e;

    public a(ck31 ck31Var, com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.shortcuts.interactors.a aVar, qrw qrwVar, r rVar) {
        this.a = ck31Var;
        this.b = bVar;
        this.c = aVar;
        this.d = qrwVar;
        this.e = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
    
        if (r12 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, o820 o820Var, String str2, ContinuationImpl continuationImpl) {
        UpdateDestinationAddressInteractorImpl$loadVerticalForDestination$1 updateDestinationAddressInteractorImpl$loadVerticalForDestination$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str3;
        if (continuationImpl instanceof UpdateDestinationAddressInteractorImpl$loadVerticalForDestination$1) {
            updateDestinationAddressInteractorImpl$loadVerticalForDestination$1 = (UpdateDestinationAddressInteractorImpl$loadVerticalForDestination$1) continuationImpl;
            int i2 = updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$0 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$1 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$2 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3 = str2;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label = 1;
                    obj = this.c.a(zzsVar, str, o820Var, false, updateDestinationAddressInteractorImpl$loadVerticalForDestination$1);
                } else if (i == 1) {
                    str2 = (String) updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3;
                        kotlin.b.b(obj);
                        this.d.getClass();
                        return qrw.d(str3, (List) obj);
                    }
                    str3 = (String) updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3;
                    kotlin.b.b(obj);
                    h i3 = ((k) this.a).i();
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$0 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$1 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$2 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3 = str3;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$4 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(i3, updateDestinationAddressInteractorImpl$loadVerticalForDestination$1);
                }
                this.b.l(((sxg) obj).a.a);
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$0 = null;
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$1 = null;
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$2 = null;
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3 = str2;
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$4 = null;
                updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label = 2;
                if (this.e.a(updateDestinationAddressInteractorImpl$loadVerticalForDestination$1) != coroutineSingletons) {
                    str3 = str2;
                    h i32 = ((k) this.a).i();
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$0 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$1 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$2 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3 = str3;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$4 = null;
                    updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(i32, updateDestinationAddressInteractorImpl$loadVerticalForDestination$1);
                }
                return coroutineSingletons;
            }
        }
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1 = new UpdateDestinationAddressInteractorImpl$loadVerticalForDestination$1(this, continuationImpl);
        Object obj2 = updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label;
        if (i != 0) {
        }
        this.b.l(((sxg) obj2).a.a);
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$0 = null;
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$1 = null;
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$2 = null;
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$3 = str2;
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.L$4 = null;
        updateDestinationAddressInteractorImpl$loadVerticalForDestination$1.label = 2;
        if (this.e.a(updateDestinationAddressInteractorImpl$loadVerticalForDestination$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
