package com.yandex.go.taxi.order.promotions.notification.ui;

import defpackage.bdc;
import defpackage.isc;
import defpackage.jsc;
import defpackage.kdc;
import defpackage.ksc;
import defpackage.n3h;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.sb0;
import defpackage.ufu;
import defpackage.uzg;
import defpackage.w511;
import defpackage.xng0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final e a;
    public final pdc b;
    public final c c;
    public final n3h d;
    public final ru.yandex.taxi.communications.data.a e;
    public final nw70 f;

    public a(e eVar, pdc pdcVar, c cVar, n3h n3hVar, ru.yandex.taxi.communications.data.a aVar, nw70 nw70Var) {
        this.a = eVar;
        this.b = pdcVar;
        this.c = cVar;
        this.d = n3hVar;
        this.e = aVar;
        this.f = nw70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, qoh qohVar, String str, ContinuationImpl continuationImpl) {
        CommunicationUiStateMapper$getClickCallback$1 communicationUiStateMapper$getClickCallback$1;
        int i;
        ksc kscVar;
        aVar.getClass();
        if (continuationImpl instanceof CommunicationUiStateMapper$getClickCallback$1) {
            communicationUiStateMapper$getClickCallback$1 = (CommunicationUiStateMapper$getClickCallback$1) continuationImpl;
            int i2 = communicationUiStateMapper$getClickCallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                communicationUiStateMapper$getClickCallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = communicationUiStateMapper$getClickCallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = communicationUiStateMapper$getClickCallback$1.label;
                sb0 sb0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    communicationUiStateMapper$getClickCallback$1.L$0 = null;
                    communicationUiStateMapper$getClickCallback$1.L$1 = str;
                    communicationUiStateMapper$getClickCallback$1.label = 1;
                    obj = qohVar.s(communicationUiStateMapper$getClickCallback$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) communicationUiStateMapper$getClickCallback$1.L$1;
                    kotlin.b.b(obj);
                }
                kscVar = (ksc) obj;
                if (!(kscVar instanceof isc)) {
                    sb0Var = new sb0(18, aVar, str, (isc) kscVar);
                } else if (!(kscVar instanceof jsc)) {
                    w511.b();
                    return null;
                }
                return new sb0(19, aVar, str, sb0Var);
            }
        }
        communicationUiStateMapper$getClickCallback$1 = new CommunicationUiStateMapper$getClickCallback$1(aVar, continuationImpl);
        Object obj3 = communicationUiStateMapper$getClickCallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = communicationUiStateMapper$getClickCallback$1.label;
        sb0 sb0Var2 = null;
        if (i != 0) {
        }
        kscVar = (ksc) obj3;
        if (!(kscVar instanceof isc)) {
        }
        return new sb0(19, aVar, str, sb0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, CommunicationItem communicationItem, ContinuationImpl continuationImpl) {
        CommunicationUiStateMapper$mapNotificationTrail$1 communicationUiStateMapper$mapNotificationTrail$1;
        int i;
        uzg uzgVar;
        kdc kdcVar;
        aVar.getClass();
        if (continuationImpl instanceof CommunicationUiStateMapper$mapNotificationTrail$1) {
            communicationUiStateMapper$mapNotificationTrail$1 = (CommunicationUiStateMapper$mapNotificationTrail$1) continuationImpl;
            int i2 = communicationUiStateMapper$mapNotificationTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                communicationUiStateMapper$mapNotificationTrail$1.label = i2 - Integer.MIN_VALUE;
                Object obj = communicationUiStateMapper$mapNotificationTrail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = communicationUiStateMapper$mapNotificationTrail$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CommunicationItem.a aVar2 = communicationItem.g;
                    uzgVar = aVar2 != null ? aVar2.a : null;
                    if (uzgVar == null) {
                        return jsc.a;
                    }
                    kdc f = ((ufu) aVar.b).f(new bdc(xng0.textMain), uzgVar.a);
                    e eVar = aVar.a;
                    FormattedText formattedText = (FormattedText) uzgVar.d.getValue();
                    communicationUiStateMapper$mapNotificationTrail$1.L$0 = null;
                    communicationUiStateMapper$mapNotificationTrail$1.L$1 = uzgVar;
                    communicationUiStateMapper$mapNotificationTrail$1.L$2 = f;
                    communicationUiStateMapper$mapNotificationTrail$1.label = 1;
                    Object t = eVar.t(formattedText, communicationUiStateMapper$mapNotificationTrail$1);
                    if (t == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = t;
                    kdcVar = f;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kdcVar = (kdc) communicationUiStateMapper$mapNotificationTrail$1.L$2;
                    uzgVar = (uzg) communicationUiStateMapper$mapNotificationTrail$1.L$1;
                    kotlin.b.b(obj);
                }
                return new isc(kdcVar, (CharSequence) obj, uzgVar.c);
            }
        }
        communicationUiStateMapper$mapNotificationTrail$1 = new CommunicationUiStateMapper$mapNotificationTrail$1(aVar, continuationImpl);
        Object obj2 = communicationUiStateMapper$mapNotificationTrail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = communicationUiStateMapper$mapNotificationTrail$1.label;
        if (i != 0) {
        }
        return new isc(kdcVar, (CharSequence) obj2, uzgVar.c);
    }
}
