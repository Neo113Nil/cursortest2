package com.yandex.go.taxi.order.details.v1.elements.source;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Button;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SourceElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.a22;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.h7j;
import defpackage.i7j;
import defpackage.ibk0;
import defpackage.j7j;
import defpackage.k7j;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.o7j;
import defpackage.pkf;
import defpackage.qje;
import defpackage.s9k0;
import defpackage.sak0;
import defpackage.sjh;
import defpackage.tak0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wdt0;
import defpackage.xng0;
import defpackage.zuj0;
import java.util.Collections;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class d {
    public final wdt0 a;
    public final tt2 b;
    public final zuj0 c;
    public final a22 d;
    public final e e;

    public d(i7j i7jVar, wdt0 wdt0Var, tt2 tt2Var, zuj0 zuj0Var, a22 a22Var, e eVar) {
        this.a = wdt0Var;
        this.b = tt2Var;
        this.c = zuj0Var;
        this.d = a22Var;
        this.e = eVar;
    }

    public static ibk0 b(DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState) {
        int i = k7j.a[detailsCardSourceStyleInteractor$SourceEditState.ordinal()];
        return i != 1 ? i != 2 ? s9k0.a : new tak0("CHANGE_ENTRANCE".toLowerCase(Locale.ROOT)) : new sak0("CHANGE_DESTINATION".toLowerCase(Locale.ROOT));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState, i1 i1Var, ContinuationImpl continuationImpl) {
        DetailsCardSourceStyleMapper$getInteractionMode$1 detailsCardSourceStyleMapper$getInteractionMode$1;
        int i;
        if (continuationImpl instanceof DetailsCardSourceStyleMapper$getInteractionMode$1) {
            detailsCardSourceStyleMapper$getInteractionMode$1 = (DetailsCardSourceStyleMapper$getInteractionMode$1) continuationImpl;
            int i2 = detailsCardSourceStyleMapper$getInteractionMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardSourceStyleMapper$getInteractionMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardSourceStyleMapper$getInteractionMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardSourceStyleMapper$getInteractionMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Button)) {
                        return (detailsCardSourceStyleInteractor$SourceEditState == DetailsCardSourceStyleInteractor$SourceEditState.ADDRESS || detailsCardSourceStyleInteractor$SourceEditState == DetailsCardSourceStyleInteractor$SourceEditState.ENTRANCE) ? new com.yandex.go.taxi.order.details.v1.ui.e(2) : new com.yandex.go.taxi.order.details.v1.ui.e(0);
                    }
                    FormattedText formattedText = ((OrderDetailsCardResponse$AccessoryResponse$Button) i1Var).a;
                    detailsCardSourceStyleMapper$getInteractionMode$1.L$0 = null;
                    detailsCardSourceStyleMapper$getInteractionMode$1.L$1 = null;
                    detailsCardSourceStyleMapper$getInteractionMode$1.label = 1;
                    obj = e.s(this.e, formattedText, detailsCardSourceStyleMapper$getInteractionMode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                int i3 = xng0.textMain;
                avj0 avj0Var = (avj0) this.c;
                return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj, qje.t(i3, avj0Var.a), qje.t(xng0.controlMinor, avj0Var.a), Collections.singletonList(new Integer(avj0Var.c(mrg0.go_design_m_space))));
            }
        }
        detailsCardSourceStyleMapper$getInteractionMode$1 = new DetailsCardSourceStyleMapper$getInteractionMode$1(this, continuationImpl);
        Object obj2 = detailsCardSourceStyleMapper$getInteractionMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleMapper$getInteractionMode$1.label;
        if (i != 0) {
        }
        int i32 = xng0.textMain;
        avj0 avj0Var2 = (avj0) this.c;
        return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj2, qje.t(i32, avj0Var2.a), qje.t(xng0.controlMinor, avj0Var2.a), Collections.singletonList(new Integer(avj0Var2.c(mrg0.go_design_m_space))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
    
        if (r5 == r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(j7j j7jVar, ContinuationImpl continuationImpl) {
        DetailsCardSourceStyleMapper$internalStyle$1 detailsCardSourceStyleMapper$internalStyle$1;
        Object obj;
        int i;
        FormattedText b;
        Object s;
        CharSequence charSequence;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState;
        String str;
        Object s2;
        FormattedText formattedText;
        CharSequence charSequence2;
        UiStateDrawableWrapper g;
        Object a;
        int i2;
        CharSequence charSequence3;
        FormattedText formattedText2;
        int i3;
        int i4;
        j7j j7jVar2 = j7jVar;
        if (continuationImpl instanceof DetailsCardSourceStyleMapper$internalStyle$1) {
            detailsCardSourceStyleMapper$internalStyle$1 = (DetailsCardSourceStyleMapper$internalStyle$1) continuationImpl;
            int i5 = detailsCardSourceStyleMapper$internalStyle$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                detailsCardSourceStyleMapper$internalStyle$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = detailsCardSourceStyleMapper$internalStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardSourceStyleMapper$internalStyle$1.label;
                e eVar = this.e;
                int i6 = 2;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                    String str2 = j7jVar2.a;
                    b = ru.yandex.taxi.common_models.net.b.b(bVar, str2 == null ? "" : str2, new Integer(16), "textMain", null, null, 56);
                    detailsCardSourceStyleMapper$internalStyle$1.L$0 = j7jVar2;
                    detailsCardSourceStyleMapper$internalStyle$1.L$1 = b;
                    detailsCardSourceStyleMapper$internalStyle$1.label = 1;
                    s = e.s(eVar, b, detailsCardSourceStyleMapper$internalStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = detailsCardSourceStyleMapper$internalStyle$1.I$4;
                            i3 = detailsCardSourceStyleMapper$internalStyle$1.I$3;
                            i6 = detailsCardSourceStyleMapper$internalStyle$1.I$1;
                            i2 = detailsCardSourceStyleMapper$internalStyle$1.I$0;
                            g = (UiStateDrawableWrapper) detailsCardSourceStyleMapper$internalStyle$1.L$9;
                            CharSequence charSequence4 = (CharSequence) detailsCardSourceStyleMapper$internalStyle$1.L$8;
                            charSequence2 = (CharSequence) detailsCardSourceStyleMapper$internalStyle$1.L$7;
                            DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState2 = (DetailsCardSourceStyleInteractor$SourceEditState) detailsCardSourceStyleMapper$internalStyle$1.L$3;
                            formattedText2 = (FormattedText) detailsCardSourceStyleMapper$internalStyle$1.L$1;
                            kotlin.b.b(obj2);
                            charSequence3 = charSequence4;
                            detailsCardSourceStyleInteractor$SourceEditState = detailsCardSourceStyleInteractor$SourceEditState2;
                            UiStateDrawableWrapper uiStateDrawableWrapper = g;
                            CharSequence charSequence5 = charSequence2;
                            DetailsCardListItem.a aVar = new DetailsCardListItem.a(i2, i6, i3 == 0, i4 == 0, (f) obj2, 4);
                            ibk0 b2 = b(detailsCardSourceStyleInteractor$SourceEditState);
                            String a2 = formattedText2.a();
                            return new o7j(b2, aVar, charSequence5, charSequence3, uiStateDrawableWrapper, !(a2 != null || a2.length() == 0), false);
                        }
                        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState3 = (DetailsCardSourceStyleInteractor$SourceEditState) detailsCardSourceStyleMapper$internalStyle$1.L$3;
                        charSequence = (CharSequence) detailsCardSourceStyleMapper$internalStyle$1.L$2;
                        formattedText = (FormattedText) detailsCardSourceStyleMapper$internalStyle$1.L$1;
                        j7j j7jVar3 = (j7j) detailsCardSourceStyleMapper$internalStyle$1.L$0;
                        kotlin.b.b(obj2);
                        detailsCardSourceStyleInteractor$SourceEditState = detailsCardSourceStyleInteractor$SourceEditState3;
                        j7jVar2 = j7jVar3;
                        charSequence2 = charSequence;
                        CharSequence charSequence6 = (CharSequence) obj2;
                        g = pkf.g(this.a.b(j7jVar2.c), "internalIcon", null);
                        int u = tje.u(20, ((avj0) this.c).a);
                        detailsCardSourceStyleMapper$internalStyle$1.L$0 = null;
                        detailsCardSourceStyleMapper$internalStyle$1.L$1 = formattedText;
                        detailsCardSourceStyleMapper$internalStyle$1.L$2 = null;
                        detailsCardSourceStyleMapper$internalStyle$1.L$3 = detailsCardSourceStyleInteractor$SourceEditState;
                        detailsCardSourceStyleMapper$internalStyle$1.L$4 = null;
                        detailsCardSourceStyleMapper$internalStyle$1.L$5 = null;
                        detailsCardSourceStyleMapper$internalStyle$1.L$6 = null;
                        detailsCardSourceStyleMapper$internalStyle$1.L$7 = charSequence2;
                        detailsCardSourceStyleMapper$internalStyle$1.L$8 = charSequence6;
                        detailsCardSourceStyleMapper$internalStyle$1.L$9 = g;
                        detailsCardSourceStyleMapper$internalStyle$1.I$0 = u;
                        detailsCardSourceStyleMapper$internalStyle$1.I$1 = 2;
                        detailsCardSourceStyleMapper$internalStyle$1.I$2 = 0;
                        detailsCardSourceStyleMapper$internalStyle$1.I$3 = 1;
                        detailsCardSourceStyleMapper$internalStyle$1.I$4 = 0;
                        detailsCardSourceStyleMapper$internalStyle$1.label = 3;
                        a = a(detailsCardSourceStyleInteractor$SourceEditState, null, detailsCardSourceStyleMapper$internalStyle$1);
                        if (a != obj) {
                            i2 = u;
                            charSequence3 = charSequence6;
                            formattedText2 = formattedText;
                            i3 = 1;
                            obj2 = a;
                            i4 = 0;
                            UiStateDrawableWrapper uiStateDrawableWrapper2 = g;
                            CharSequence charSequence52 = charSequence2;
                            DetailsCardListItem.a aVar2 = new DetailsCardListItem.a(i2, i6, i3 == 0, i4 == 0, (f) obj2, 4);
                            ibk0 b22 = b(detailsCardSourceStyleInteractor$SourceEditState);
                            String a22 = formattedText2.a();
                            return new o7j(b22, aVar2, charSequence52, charSequence3, uiStateDrawableWrapper2, !(a22 != null || a22.length() == 0), false);
                        }
                        return obj;
                    }
                    FormattedText formattedText3 = (FormattedText) detailsCardSourceStyleMapper$internalStyle$1.L$1;
                    j7j j7jVar4 = (j7j) detailsCardSourceStyleMapper$internalStyle$1.L$0;
                    kotlin.b.b(obj2);
                    b = formattedText3;
                    j7jVar2 = j7jVar4;
                    s = obj2;
                }
                charSequence = (CharSequence) s;
                detailsCardSourceStyleInteractor$SourceEditState = j7jVar2.d;
                if (detailsCardSourceStyleInteractor$SourceEditState == null) {
                    detailsCardSourceStyleInteractor$SourceEditState = DetailsCardSourceStyleInteractor$SourceEditState.UNEDITABLE;
                }
                str = j7jVar2.b;
                if (str != null || str.length() == 0) {
                    str = null;
                }
                if (str == null) {
                    str = ((avj0) this.d.a).h(kyh0.order_options_entrance);
                    if (detailsCardSourceStyleInteractor$SourceEditState != DetailsCardSourceStyleInteractor$SourceEditState.ENTRANCE) {
                        str = null;
                    }
                }
                FormattedText b3 = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str != null ? "" : str, new Integer(13), "textMinor", null, null, 56);
                detailsCardSourceStyleMapper$internalStyle$1.L$0 = j7jVar2;
                detailsCardSourceStyleMapper$internalStyle$1.L$1 = b;
                detailsCardSourceStyleMapper$internalStyle$1.L$2 = charSequence;
                detailsCardSourceStyleMapper$internalStyle$1.L$3 = detailsCardSourceStyleInteractor$SourceEditState;
                detailsCardSourceStyleMapper$internalStyle$1.L$4 = null;
                detailsCardSourceStyleMapper$internalStyle$1.L$5 = null;
                detailsCardSourceStyleMapper$internalStyle$1.label = 2;
                s2 = e.s(eVar, b3, detailsCardSourceStyleMapper$internalStyle$1);
                if (s2 != obj) {
                    formattedText = b;
                    obj2 = s2;
                    charSequence2 = charSequence;
                    CharSequence charSequence62 = (CharSequence) obj2;
                    g = pkf.g(this.a.b(j7jVar2.c), "internalIcon", null);
                    int u2 = tje.u(20, ((avj0) this.c).a);
                    detailsCardSourceStyleMapper$internalStyle$1.L$0 = null;
                    detailsCardSourceStyleMapper$internalStyle$1.L$1 = formattedText;
                    detailsCardSourceStyleMapper$internalStyle$1.L$2 = null;
                    detailsCardSourceStyleMapper$internalStyle$1.L$3 = detailsCardSourceStyleInteractor$SourceEditState;
                    detailsCardSourceStyleMapper$internalStyle$1.L$4 = null;
                    detailsCardSourceStyleMapper$internalStyle$1.L$5 = null;
                    detailsCardSourceStyleMapper$internalStyle$1.L$6 = null;
                    detailsCardSourceStyleMapper$internalStyle$1.L$7 = charSequence2;
                    detailsCardSourceStyleMapper$internalStyle$1.L$8 = charSequence62;
                    detailsCardSourceStyleMapper$internalStyle$1.L$9 = g;
                    detailsCardSourceStyleMapper$internalStyle$1.I$0 = u2;
                    detailsCardSourceStyleMapper$internalStyle$1.I$1 = 2;
                    detailsCardSourceStyleMapper$internalStyle$1.I$2 = 0;
                    detailsCardSourceStyleMapper$internalStyle$1.I$3 = 1;
                    detailsCardSourceStyleMapper$internalStyle$1.I$4 = 0;
                    detailsCardSourceStyleMapper$internalStyle$1.label = 3;
                    a = a(detailsCardSourceStyleInteractor$SourceEditState, null, detailsCardSourceStyleMapper$internalStyle$1);
                    if (a != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardSourceStyleMapper$internalStyle$1 = new DetailsCardSourceStyleMapper$internalStyle$1(this, continuationImpl);
        Object obj22 = detailsCardSourceStyleMapper$internalStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleMapper$internalStyle$1.label;
        e eVar2 = this.e;
        int i62 = 2;
        if (i != 0) {
        }
        charSequence = (CharSequence) s;
        detailsCardSourceStyleInteractor$SourceEditState = j7jVar2.d;
        if (detailsCardSourceStyleInteractor$SourceEditState == null) {
        }
        str = j7jVar2.b;
        if (str != null) {
        }
        str = null;
        if (str == null) {
        }
        FormattedText b32 = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str != null ? "" : str, new Integer(13), "textMinor", null, null, 56);
        detailsCardSourceStyleMapper$internalStyle$1.L$0 = j7jVar2;
        detailsCardSourceStyleMapper$internalStyle$1.L$1 = b;
        detailsCardSourceStyleMapper$internalStyle$1.L$2 = charSequence;
        detailsCardSourceStyleMapper$internalStyle$1.L$3 = detailsCardSourceStyleInteractor$SourceEditState;
        detailsCardSourceStyleMapper$internalStyle$1.L$4 = null;
        detailsCardSourceStyleMapper$internalStyle$1.L$5 = null;
        detailsCardSourceStyleMapper$internalStyle$1.label = 2;
        s2 = e.s(eVar2, b32, detailsCardSourceStyleMapper$internalStyle$1);
        if (s2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(j7j j7jVar, OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement, ContinuationImpl continuationImpl) {
        DetailsCardSourceStyleMapper$mapStyle$1 detailsCardSourceStyleMapper$mapStyle$1;
        Object obj;
        int i;
        h7j h7jVar;
        Object c;
        if (continuationImpl instanceof DetailsCardSourceStyleMapper$mapStyle$1) {
            detailsCardSourceStyleMapper$mapStyle$1 = (DetailsCardSourceStyleMapper$mapStyle$1) continuationImpl;
            int i2 = detailsCardSourceStyleMapper$mapStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardSourceStyleMapper$mapStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardSourceStyleMapper$mapStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardSourceStyleMapper$mapStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardSourceStyleMapper$mapStyle$1.L$0 = j7jVar;
                    detailsCardSourceStyleMapper$mapStyle$1.L$1 = orderDetailsCardResponse$CardElement$SourceElement;
                    detailsCardSourceStyleMapper$mapStyle$1.label = 1;
                    obj2 = bvf0.n(new DetailsCardSourceIntegrityVerifier$contractModelOrNull$2(orderDetailsCardResponse$CardElement$SourceElement, null), detailsCardSourceStyleMapper$mapStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    orderDetailsCardResponse$CardElement$SourceElement = (OrderDetailsCardResponse$CardElement$SourceElement) detailsCardSourceStyleMapper$mapStyle$1.L$1;
                    j7jVar = (j7j) detailsCardSourceStyleMapper$mapStyle$1.L$0;
                    kotlin.b.b(obj2);
                }
                h7jVar = (h7j) obj2;
                if (h7jVar != null || orderDetailsCardResponse$CardElement$SourceElement == null) {
                    detailsCardSourceStyleMapper$mapStyle$1.L$0 = null;
                    detailsCardSourceStyleMapper$mapStyle$1.L$1 = null;
                    detailsCardSourceStyleMapper$mapStyle$1.L$2 = null;
                    detailsCardSourceStyleMapper$mapStyle$1.label = 3;
                    c = c(j7jVar, detailsCardSourceStyleMapper$mapStyle$1);
                    if (c != obj) {
                        return c;
                    }
                } else {
                    detailsCardSourceStyleMapper$mapStyle$1.L$0 = null;
                    detailsCardSourceStyleMapper$mapStyle$1.L$1 = null;
                    detailsCardSourceStyleMapper$mapStyle$1.L$2 = null;
                    detailsCardSourceStyleMapper$mapStyle$1.label = 2;
                    Object e = e(h7jVar, j7jVar, detailsCardSourceStyleMapper$mapStyle$1);
                    if (e != obj) {
                        return e;
                    }
                }
                return obj;
            }
        }
        detailsCardSourceStyleMapper$mapStyle$1 = new DetailsCardSourceStyleMapper$mapStyle$1(this, continuationImpl);
        Object obj22 = detailsCardSourceStyleMapper$mapStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleMapper$mapStyle$1.label;
        if (i != 0) {
        }
        h7jVar = (h7j) obj22;
        if (h7jVar != null) {
        }
        detailsCardSourceStyleMapper$mapStyle$1.L$0 = null;
        detailsCardSourceStyleMapper$mapStyle$1.L$1 = null;
        detailsCardSourceStyleMapper$mapStyle$1.L$2 = null;
        detailsCardSourceStyleMapper$mapStyle$1.label = 3;
        c = c(j7jVar, detailsCardSourceStyleMapper$mapStyle$1);
        if (c != obj) {
            return obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        if (r6 == r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h7j h7jVar, j7j j7jVar, ContinuationImpl continuationImpl) {
        DetailsCardSourceStyleMapper$remoteStyle$1 detailsCardSourceStyleMapper$remoteStyle$1;
        Object obj;
        int i;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState;
        Object s;
        Object s2;
        h7j h7jVar2;
        CharSequence charSequence;
        j7j j7jVar2;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState2;
        OrderDetailsCardResponse.CardIcon cardIcon;
        Object obj2;
        CharSequence charSequence2;
        h7j h7jVar3;
        CharSequence charSequence3;
        String str;
        Object a;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        int i2;
        int i3;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState3;
        Object obj3;
        int i4;
        h7j h7jVar4 = h7jVar;
        j7j j7jVar3 = j7jVar;
        if (continuationImpl instanceof DetailsCardSourceStyleMapper$remoteStyle$1) {
            detailsCardSourceStyleMapper$remoteStyle$1 = (DetailsCardSourceStyleMapper$remoteStyle$1) continuationImpl;
            int i5 = detailsCardSourceStyleMapper$remoteStyle$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                detailsCardSourceStyleMapper$remoteStyle$1.label = i5 - Integer.MIN_VALUE;
                Object obj4 = detailsCardSourceStyleMapper$remoteStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardSourceStyleMapper$remoteStyle$1.label;
                e eVar = this.e;
                int i6 = 2;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    detailsCardSourceStyleInteractor$SourceEditState = j7jVar3.d;
                    if (detailsCardSourceStyleInteractor$SourceEditState == null) {
                        detailsCardSourceStyleInteractor$SourceEditState = DetailsCardSourceStyleInteractor$SourceEditState.UNEDITABLE;
                    }
                    FormattedText formattedText = h7jVar4.a;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$0 = h7jVar4;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$1 = j7jVar3;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState;
                    detailsCardSourceStyleMapper$remoteStyle$1.label = 1;
                    s = e.s(eVar, formattedText, detailsCardSourceStyleMapper$remoteStyle$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) detailsCardSourceStyleMapper$remoteStyle$1.L$3;
                            detailsCardSourceStyleInteractor$SourceEditState2 = (DetailsCardSourceStyleInteractor$SourceEditState) detailsCardSourceStyleMapper$remoteStyle$1.L$2;
                            j7jVar2 = (j7j) detailsCardSourceStyleMapper$remoteStyle$1.L$1;
                            h7jVar2 = (h7j) detailsCardSourceStyleMapper$remoteStyle$1.L$0;
                            kotlin.b.b(obj4);
                            CharSequence charSequence4 = (CharSequence) obj4;
                            cardIcon = h7jVar2.c;
                            detailsCardSourceStyleMapper$remoteStyle$1.L$0 = h7jVar2;
                            detailsCardSourceStyleMapper$remoteStyle$1.L$1 = null;
                            detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState2;
                            detailsCardSourceStyleMapper$remoteStyle$1.L$3 = charSequence;
                            detailsCardSourceStyleMapper$remoteStyle$1.L$4 = charSequence4;
                            detailsCardSourceStyleMapper$remoteStyle$1.label = 3;
                            if (cardIcon != null || (str = cardIcon.b) == null) {
                                obj2 = null;
                            } else {
                                this.b.getClass();
                                sjh sjhVar = uyj.a;
                                obj2 = tje.k0(mdh.b, new DetailsCardSourceStyleMapper$loadDrawable$2(this, str, j7jVar2, null), detailsCardSourceStyleMapper$remoteStyle$1);
                            }
                            if (obj2 != obj) {
                                h7j h7jVar5 = h7jVar2;
                                charSequence2 = charSequence;
                                h7jVar3 = h7jVar5;
                                Object obj5 = obj2;
                                charSequence3 = charSequence4;
                                obj4 = obj5;
                                UiStateDrawableWrapper g = pkf.g((Drawable) obj4, h7jVar3.c.b, null);
                                int c = ((avj0) this.c).c(mrg0.go_design_s_space);
                                i1 i1Var = h7jVar3.d;
                                detailsCardSourceStyleMapper$remoteStyle$1.L$0 = null;
                                detailsCardSourceStyleMapper$remoteStyle$1.L$1 = null;
                                detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState2;
                                detailsCardSourceStyleMapper$remoteStyle$1.L$3 = charSequence2;
                                detailsCardSourceStyleMapper$remoteStyle$1.L$4 = charSequence3;
                                detailsCardSourceStyleMapper$remoteStyle$1.L$5 = g;
                                detailsCardSourceStyleMapper$remoteStyle$1.I$0 = c;
                                detailsCardSourceStyleMapper$remoteStyle$1.I$1 = 2;
                                detailsCardSourceStyleMapper$remoteStyle$1.I$2 = 0;
                                detailsCardSourceStyleMapper$remoteStyle$1.I$3 = 1;
                                detailsCardSourceStyleMapper$remoteStyle$1.I$4 = 1;
                                detailsCardSourceStyleMapper$remoteStyle$1.label = 4;
                                a = a(detailsCardSourceStyleInteractor$SourceEditState2, i1Var, detailsCardSourceStyleMapper$remoteStyle$1);
                                if (a != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = detailsCardSourceStyleMapper$remoteStyle$1.I$4;
                            i3 = detailsCardSourceStyleMapper$remoteStyle$1.I$3;
                            i6 = detailsCardSourceStyleMapper$remoteStyle$1.I$1;
                            int i7 = detailsCardSourceStyleMapper$remoteStyle$1.I$0;
                            UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) detailsCardSourceStyleMapper$remoteStyle$1.L$5;
                            charSequence3 = (CharSequence) detailsCardSourceStyleMapper$remoteStyle$1.L$4;
                            charSequence2 = (CharSequence) detailsCardSourceStyleMapper$remoteStyle$1.L$3;
                            DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState4 = (DetailsCardSourceStyleInteractor$SourceEditState) detailsCardSourceStyleMapper$remoteStyle$1.L$2;
                            kotlin.b.b(obj4);
                            i2 = i7;
                            obj3 = obj4;
                            uiStateDrawableWrapper = uiStateDrawableWrapper2;
                            detailsCardSourceStyleInteractor$SourceEditState3 = detailsCardSourceStyleInteractor$SourceEditState4;
                            return new o7j(b(detailsCardSourceStyleInteractor$SourceEditState3), new DetailsCardListItem.a(i2, i6, i3 == 0, i4 == 0, (f) obj3, 4), charSequence2, charSequence3, uiStateDrawableWrapper, true, false);
                        }
                        CharSequence charSequence5 = (CharSequence) detailsCardSourceStyleMapper$remoteStyle$1.L$4;
                        CharSequence charSequence6 = (CharSequence) detailsCardSourceStyleMapper$remoteStyle$1.L$3;
                        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState5 = (DetailsCardSourceStyleInteractor$SourceEditState) detailsCardSourceStyleMapper$remoteStyle$1.L$2;
                        h7j h7jVar6 = (h7j) detailsCardSourceStyleMapper$remoteStyle$1.L$0;
                        kotlin.b.b(obj4);
                        charSequence3 = charSequence5;
                        h7jVar3 = h7jVar6;
                        charSequence2 = charSequence6;
                        detailsCardSourceStyleInteractor$SourceEditState2 = detailsCardSourceStyleInteractor$SourceEditState5;
                        UiStateDrawableWrapper g2 = pkf.g((Drawable) obj4, h7jVar3.c.b, null);
                        int c2 = ((avj0) this.c).c(mrg0.go_design_s_space);
                        i1 i1Var2 = h7jVar3.d;
                        detailsCardSourceStyleMapper$remoteStyle$1.L$0 = null;
                        detailsCardSourceStyleMapper$remoteStyle$1.L$1 = null;
                        detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState2;
                        detailsCardSourceStyleMapper$remoteStyle$1.L$3 = charSequence2;
                        detailsCardSourceStyleMapper$remoteStyle$1.L$4 = charSequence3;
                        detailsCardSourceStyleMapper$remoteStyle$1.L$5 = g2;
                        detailsCardSourceStyleMapper$remoteStyle$1.I$0 = c2;
                        detailsCardSourceStyleMapper$remoteStyle$1.I$1 = 2;
                        detailsCardSourceStyleMapper$remoteStyle$1.I$2 = 0;
                        detailsCardSourceStyleMapper$remoteStyle$1.I$3 = 1;
                        detailsCardSourceStyleMapper$remoteStyle$1.I$4 = 1;
                        detailsCardSourceStyleMapper$remoteStyle$1.label = 4;
                        a = a(detailsCardSourceStyleInteractor$SourceEditState2, i1Var2, detailsCardSourceStyleMapper$remoteStyle$1);
                        if (a != obj) {
                            uiStateDrawableWrapper = g2;
                            i2 = c2;
                            i3 = 1;
                            detailsCardSourceStyleInteractor$SourceEditState3 = detailsCardSourceStyleInteractor$SourceEditState2;
                            obj3 = a;
                            i4 = 1;
                            return new o7j(b(detailsCardSourceStyleInteractor$SourceEditState3), new DetailsCardListItem.a(i2, i6, i3 == 0, i4 == 0, (f) obj3, 4), charSequence2, charSequence3, uiStateDrawableWrapper, true, false);
                        }
                        return obj;
                    }
                    DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState6 = (DetailsCardSourceStyleInteractor$SourceEditState) detailsCardSourceStyleMapper$remoteStyle$1.L$2;
                    j7jVar3 = (j7j) detailsCardSourceStyleMapper$remoteStyle$1.L$1;
                    h7j h7jVar7 = (h7j) detailsCardSourceStyleMapper$remoteStyle$1.L$0;
                    kotlin.b.b(obj4);
                    detailsCardSourceStyleInteractor$SourceEditState = detailsCardSourceStyleInteractor$SourceEditState6;
                    h7jVar4 = h7jVar7;
                    s = obj4;
                }
                CharSequence charSequence7 = (CharSequence) s;
                FormattedText formattedText2 = h7jVar4.b;
                detailsCardSourceStyleMapper$remoteStyle$1.L$0 = h7jVar4;
                detailsCardSourceStyleMapper$remoteStyle$1.L$1 = j7jVar3;
                detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState;
                detailsCardSourceStyleMapper$remoteStyle$1.L$3 = charSequence7;
                detailsCardSourceStyleMapper$remoteStyle$1.label = 2;
                s2 = e.s(eVar, formattedText2, detailsCardSourceStyleMapper$remoteStyle$1);
                if (s2 != obj) {
                    h7jVar2 = h7jVar4;
                    charSequence = charSequence7;
                    j7jVar2 = j7jVar3;
                    detailsCardSourceStyleInteractor$SourceEditState2 = detailsCardSourceStyleInteractor$SourceEditState;
                    obj4 = s2;
                    CharSequence charSequence42 = (CharSequence) obj4;
                    cardIcon = h7jVar2.c;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$0 = h7jVar2;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$1 = null;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState2;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$3 = charSequence;
                    detailsCardSourceStyleMapper$remoteStyle$1.L$4 = charSequence42;
                    detailsCardSourceStyleMapper$remoteStyle$1.label = 3;
                    if (cardIcon != null) {
                    }
                    obj2 = null;
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardSourceStyleMapper$remoteStyle$1 = new DetailsCardSourceStyleMapper$remoteStyle$1(this, continuationImpl);
        Object obj42 = detailsCardSourceStyleMapper$remoteStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleMapper$remoteStyle$1.label;
        e eVar2 = this.e;
        int i62 = 2;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) s;
        FormattedText formattedText22 = h7jVar4.b;
        detailsCardSourceStyleMapper$remoteStyle$1.L$0 = h7jVar4;
        detailsCardSourceStyleMapper$remoteStyle$1.L$1 = j7jVar3;
        detailsCardSourceStyleMapper$remoteStyle$1.L$2 = detailsCardSourceStyleInteractor$SourceEditState;
        detailsCardSourceStyleMapper$remoteStyle$1.L$3 = charSequence72;
        detailsCardSourceStyleMapper$remoteStyle$1.label = 2;
        s2 = e.s(eVar2, formattedText22, detailsCardSourceStyleMapper$remoteStyle$1);
        if (s2 != obj) {
        }
        return obj;
    }
}
