package com.yandex.go.order.ui.card.eats;

import defpackage.d3p;
import defpackage.j73;
import defpackage.m301;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.u501;
import defpackage.w201;
import defpackage.yl70;
import defpackage.z2p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a implements u501 {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, d3p d3pVar, ContinuationImpl continuationImpl) {
        ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1 externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1;
        Object obj;
        int i;
        z2p m;
        Object c;
        m301 m301Var;
        aVar.getClass();
        if (continuationImpl instanceof ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1) {
            externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1 = (ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1) continuationImpl;
            int i2 = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label;
                if (i != 0) {
                    b.b(obj2);
                    z2p c2 = d3pVar.c();
                    m = d3pVar.m();
                    if (c2 == null && m == null) {
                        return null;
                    }
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = null;
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = m;
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 1;
                    obj2 = aVar.c(c2, externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m301Var = (m301) externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3;
                        b.b(obj2);
                        return new yl70(m301Var, (m301) obj2);
                    }
                    m = (z2p) externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2;
                    b.b(obj2);
                }
                m301 m301Var2 = (m301) obj2;
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = null;
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = null;
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = m301Var2;
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 2;
                c = aVar.c(m, externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                if (c != obj) {
                    obj2 = c;
                    m301Var = m301Var2;
                    return new yl70(m301Var, (m301) obj2);
                }
                return obj;
            }
        }
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1 = new ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1(aVar, continuationImpl);
        Object obj22 = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label;
        if (i != 0) {
        }
        m301 m301Var22 = (m301) obj22;
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = null;
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = null;
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = m301Var22;
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 2;
        c = aVar.c(m, externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonsUiState$1);
        if (c != obj) {
        }
        return obj;
    }

    @Override // defpackage.u501
    public final tpr a(w201 w201Var) {
        return new rol0(new ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1((d3p) w201Var, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(z2p z2pVar, ContinuationImpl continuationImpl) {
        ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1 externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1;
        int i;
        if (continuationImpl instanceof ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1) {
            externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1 = (ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1) continuationImpl;
            int i2 = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (z2pVar == null) {
                        return null;
                    }
                    String str = z2pVar.b;
                    FormattedText.d dVar = str != null ? new FormattedText.d(str, FormattedText.VerticalAlignment.CENTER, null, 16, 36) : null;
                    String str2 = z2pVar.a;
                    FormattedText formattedText = new FormattedText(j73.A(new o[]{dVar, str2 != null ? new FormattedText.h(str2, null, null, null, null, null, 2046) : null}));
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = null;
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = null;
                    externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 1;
                    obj = c.i(this.a, formattedText, null, externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1, 30);
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
                return new m301((CharSequence) obj, null, 14);
            }
        }
        externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1 = new ExternalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1(this, continuationImpl);
        Object obj2 = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceTrackingTrackingCardUiStateInteractor$getActionButtonUiState$1.label;
        if (i != 0) {
        }
        return new m301((CharSequence) obj2, null, 14);
    }
}
