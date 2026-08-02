package com.yandex.go.taxi.order.details.v1.elements.destination;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Button;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddDestinationElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DestinationElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.a22;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.f5j;
import defpackage.g5j;
import defpackage.h5j;
import defpackage.i5j;
import defpackage.ibk0;
import defpackage.j5j;
import defpackage.kyh0;
import defpackage.l9k0;
import defpackage.mdh;
import defpackage.mrg0;
import defpackage.n5j;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.qje;
import defpackage.s9k0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zzi;
import java.util.Collections;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class d {
    public final zzi a;
    public final tt2 b;
    public final zuj0 c;
    public final a22 d;
    public final e e;

    public d(h5j h5jVar, zzi zziVar, tt2 tt2Var, zuj0 zuj0Var, a22 a22Var, e eVar) {
        this.a = zziVar;
        this.b = tt2Var;
        this.c = zuj0Var;
        this.d = a22Var;
        this.e = eVar;
    }

    public static ibk0 c(i5j i5jVar) {
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState = i5jVar.c;
        return (detailsCardDestinationStyleInteractor$DestinationState == DetailsCardDestinationStyleInteractor$DestinationState.ADD || detailsCardDestinationStyleInteractor$DestinationState == DetailsCardDestinationStyleInteractor$DestinationState.EDIT) ? new l9k0("CHANGE_DESTINATION".toLowerCase(Locale.ROOT)) : s9k0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r2 == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i5j i5jVar, f5j f5jVar, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$addDestinationRemoteStyle$1 detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1;
        Object obj;
        int i;
        i5j i5jVar2;
        OrderDetailsCardResponse.CardIcon cardIcon;
        Object obj2;
        CharSequence charSequence;
        String str;
        int c;
        Object b;
        i5j i5jVar3;
        int i2;
        CharSequence charSequence2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        int i3;
        f5j f5jVar2 = f5jVar;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$addDestinationRemoteStyle$1) {
            detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1 = (DetailsCardDestinationStyleMapper$addDestinationRemoteStyle$1) continuationImpl;
            int i4 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label;
                int i5 = 2;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    FormattedText formattedText = f5jVar2.a;
                    i5jVar2 = i5jVar;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0 = i5jVar2;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1 = f5jVar2;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label = 1;
                    obj3 = e.s(this.e, formattedText, detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$4;
                            i2 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$3;
                            i5 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$1;
                            int i6 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$0;
                            uiStateDrawableWrapper = (UiStateDrawableWrapper) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$3;
                            charSequence2 = (CharSequence) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$2;
                            i5jVar3 = (i5j) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0;
                            kotlin.b.b(obj3);
                            c = i6;
                            return new n5j(charSequence2, null, uiStateDrawableWrapper, new DetailsCardListItem.a(c, i5, i2 == 0, i3 == 0, (f) obj3, 4), true, false, true, c(i5jVar3));
                        }
                        CharSequence charSequence3 = (CharSequence) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$2;
                        f5j f5jVar3 = (f5j) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1;
                        i5j i5jVar4 = (i5j) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0;
                        kotlin.b.b(obj3);
                        charSequence = charSequence3;
                        f5jVar2 = f5jVar3;
                        i5jVar2 = i5jVar4;
                        UiStateDrawableWrapper g = pkf.g((Drawable) obj3, f5jVar2.b.b, null);
                        c = ((avj0) this.c).c(mrg0.go_design_s_space);
                        i1 i1Var = f5jVar2.c;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0 = i5jVar2;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1 = null;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$2 = charSequence;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$3 = g;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$0 = c;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$1 = 2;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$2 = 0;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$3 = 1;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$4 = 1;
                        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label = 3;
                        b = b(i5jVar2, i1Var, detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1);
                        if (b != obj) {
                            i5jVar3 = i5jVar2;
                            i2 = 1;
                            charSequence2 = charSequence;
                            uiStateDrawableWrapper = g;
                            obj3 = b;
                            i3 = 1;
                            return new n5j(charSequence2, null, uiStateDrawableWrapper, new DetailsCardListItem.a(c, i5, i2 == 0, i3 == 0, (f) obj3, 4), true, false, true, c(i5jVar3));
                        }
                        return obj;
                    }
                    f5jVar2 = (f5j) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1;
                    i5jVar2 = (i5j) detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0;
                    kotlin.b.b(obj3);
                }
                CharSequence charSequence4 = (CharSequence) obj3;
                cardIcon = f5jVar2.b;
                detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0 = i5jVar2;
                detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1 = f5jVar2;
                detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$2 = charSequence4;
                detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label = 2;
                if (cardIcon != null || (str = cardIcon.b) == null) {
                    obj2 = null;
                } else {
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    obj2 = tje.k0(mdh.b, new DetailsCardDestinationStyleMapper$loadLeadIcon$2(this, str, i5jVar2, null), detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1);
                }
                if (obj2 != obj) {
                    Object obj4 = obj2;
                    charSequence = charSequence4;
                    obj3 = obj4;
                    UiStateDrawableWrapper g2 = pkf.g((Drawable) obj3, f5jVar2.b.b, null);
                    c = ((avj0) this.c).c(mrg0.go_design_s_space);
                    i1 i1Var2 = f5jVar2.c;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0 = i5jVar2;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$2 = charSequence;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$3 = g2;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$0 = c;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$1 = 2;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$2 = 0;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$3 = 1;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.I$4 = 1;
                    detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label = 3;
                    b = b(i5jVar2, i1Var2, detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1);
                    if (b != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1 = new DetailsCardDestinationStyleMapper$addDestinationRemoteStyle$1(this, continuationImpl);
        Object obj32 = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label;
        int i52 = 2;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj32;
        cardIcon = f5jVar2.b;
        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$0 = i5jVar2;
        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$1 = f5jVar2;
        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.L$2 = charSequence42;
        detailsCardDestinationStyleMapper$addDestinationRemoteStyle$1.label = 2;
        if (cardIcon != null) {
        }
        obj2 = null;
        if (obj2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(i5j i5jVar, i1 i1Var, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$getInteractionMode$1 detailsCardDestinationStyleMapper$getInteractionMode$1;
        int i;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$getInteractionMode$1) {
            detailsCardDestinationStyleMapper$getInteractionMode$1 = (DetailsCardDestinationStyleMapper$getInteractionMode$1) continuationImpl;
            int i2 = detailsCardDestinationStyleMapper$getInteractionMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$getInteractionMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardDestinationStyleMapper$getInteractionMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$getInteractionMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Button)) {
                        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState = i5jVar.c;
                        int i3 = detailsCardDestinationStyleInteractor$DestinationState == null ? -1 : j5j.a[detailsCardDestinationStyleInteractor$DestinationState.ordinal()];
                        int i4 = 2;
                        if (i3 != 1 && i3 != 2) {
                            i4 = 0;
                        }
                        return new com.yandex.go.taxi.order.details.v1.ui.e(i4);
                    }
                    FormattedText formattedText = ((OrderDetailsCardResponse$AccessoryResponse$Button) i1Var).a;
                    detailsCardDestinationStyleMapper$getInteractionMode$1.L$0 = null;
                    detailsCardDestinationStyleMapper$getInteractionMode$1.L$1 = null;
                    detailsCardDestinationStyleMapper$getInteractionMode$1.label = 1;
                    obj = e.s(this.e, formattedText, detailsCardDestinationStyleMapper$getInteractionMode$1);
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
                int i5 = xng0.textMain;
                avj0 avj0Var = (avj0) this.c;
                return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj, qje.t(i5, avj0Var.a), qje.t(xng0.controlMinor, avj0Var.a), Collections.singletonList(new Integer(avj0Var.c(mrg0.go_design_m_space))));
            }
        }
        detailsCardDestinationStyleMapper$getInteractionMode$1 = new DetailsCardDestinationStyleMapper$getInteractionMode$1(this, continuationImpl);
        Object obj2 = detailsCardDestinationStyleMapper$getInteractionMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$getInteractionMode$1.label;
        if (i != 0) {
        }
        int i52 = xng0.textMain;
        avj0 avj0Var2 = (avj0) this.c;
        return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj2, qje.t(i52, avj0Var2.a), qje.t(xng0.controlMinor, avj0Var2.a), Collections.singletonList(new Integer(avj0Var2.c(mrg0.go_design_m_space))));
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
    public final Object d(i5j i5jVar, OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$handleAddDestinationStyle$1 detailsCardDestinationStyleMapper$handleAddDestinationStyle$1;
        Object obj;
        int i;
        f5j f5jVar;
        Object g;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$handleAddDestinationStyle$1) {
            detailsCardDestinationStyleMapper$handleAddDestinationStyle$1 = (DetailsCardDestinationStyleMapper$handleAddDestinationStyle$1) continuationImpl;
            int i2 = detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$0 = i5jVar;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$1 = orderDetailsCardResponse$CardElement$AddDestinationElement;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label = 1;
                    obj2 = bvf0.n(new DetailsCardDestinationIntegrityVerifier$addDestinationContractModelOrNull$2(orderDetailsCardResponse$CardElement$AddDestinationElement, null), detailsCardDestinationStyleMapper$handleAddDestinationStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    orderDetailsCardResponse$CardElement$AddDestinationElement = (OrderDetailsCardResponse$CardElement$AddDestinationElement) detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$1;
                    i5jVar = (i5j) detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$0;
                    kotlin.b.b(obj2);
                }
                f5jVar = (f5j) obj2;
                if (f5jVar != null || orderDetailsCardResponse$CardElement$AddDestinationElement == null) {
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$0 = null;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label = 3;
                    g = g(i5jVar, detailsCardDestinationStyleMapper$handleAddDestinationStyle$1);
                    if (g != obj) {
                        return g;
                    }
                } else {
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$0 = null;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label = 2;
                    Object a = a(i5jVar, f5jVar, detailsCardDestinationStyleMapper$handleAddDestinationStyle$1);
                    if (a != obj) {
                        return a;
                    }
                }
                return obj;
            }
        }
        detailsCardDestinationStyleMapper$handleAddDestinationStyle$1 = new DetailsCardDestinationStyleMapper$handleAddDestinationStyle$1(this, continuationImpl);
        Object obj22 = detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label;
        if (i != 0) {
        }
        f5jVar = (f5j) obj22;
        if (f5jVar != null) {
        }
        detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$0 = null;
        detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$1 = null;
        detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.L$2 = null;
        detailsCardDestinationStyleMapper$handleAddDestinationStyle$1.label = 3;
        g = g(i5jVar, detailsCardDestinationStyleMapper$handleAddDestinationStyle$1);
        if (g != obj) {
            return obj;
        }
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
    public final Object e(i5j i5jVar, OrderDetailsCardResponse$CardElement$DestinationElement orderDetailsCardResponse$CardElement$DestinationElement, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$handleEditDestinationStyle$1 detailsCardDestinationStyleMapper$handleEditDestinationStyle$1;
        Object obj;
        int i;
        g5j g5jVar;
        Object g;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$handleEditDestinationStyle$1) {
            detailsCardDestinationStyleMapper$handleEditDestinationStyle$1 = (DetailsCardDestinationStyleMapper$handleEditDestinationStyle$1) continuationImpl;
            int i2 = detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$0 = i5jVar;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$1 = orderDetailsCardResponse$CardElement$DestinationElement;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label = 1;
                    obj2 = bvf0.n(new DetailsCardDestinationIntegrityVerifier$destinationContractModelOrNull$2(orderDetailsCardResponse$CardElement$DestinationElement, null), detailsCardDestinationStyleMapper$handleEditDestinationStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    orderDetailsCardResponse$CardElement$DestinationElement = (OrderDetailsCardResponse$CardElement$DestinationElement) detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$1;
                    i5jVar = (i5j) detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$0;
                    kotlin.b.b(obj2);
                }
                g5jVar = (g5j) obj2;
                if (g5jVar != null || orderDetailsCardResponse$CardElement$DestinationElement == null) {
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$0 = null;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label = 3;
                    g = g(i5jVar, detailsCardDestinationStyleMapper$handleEditDestinationStyle$1);
                    if (g != obj) {
                        return g;
                    }
                } else {
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$0 = null;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label = 2;
                    Object h = h(i5jVar, g5jVar, detailsCardDestinationStyleMapper$handleEditDestinationStyle$1);
                    if (h != obj) {
                        return h;
                    }
                }
                return obj;
            }
        }
        detailsCardDestinationStyleMapper$handleEditDestinationStyle$1 = new DetailsCardDestinationStyleMapper$handleEditDestinationStyle$1(this, continuationImpl);
        Object obj22 = detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label;
        if (i != 0) {
        }
        g5jVar = (g5j) obj22;
        if (g5jVar != null) {
        }
        detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$0 = null;
        detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$1 = null;
        detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.L$2 = null;
        detailsCardDestinationStyleMapper$handleEditDestinationStyle$1.label = 3;
        g = g(i5jVar, detailsCardDestinationStyleMapper$handleEditDestinationStyle$1);
        if (g != obj) {
            return obj;
        }
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
    public final Object f(i5j i5jVar, OrderDetailsCardResponse$CardElement$DestinationElement orderDetailsCardResponse$CardElement$DestinationElement, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$handleStaticDestinationStyle$1 detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1;
        Object obj;
        int i;
        g5j g5jVar;
        Object g;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$handleStaticDestinationStyle$1) {
            detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1 = (DetailsCardDestinationStyleMapper$handleStaticDestinationStyle$1) continuationImpl;
            int i2 = detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$0 = i5jVar;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$1 = orderDetailsCardResponse$CardElement$DestinationElement;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label = 1;
                    obj2 = bvf0.n(new DetailsCardDestinationIntegrityVerifier$destinationContractModelOrNull$2(orderDetailsCardResponse$CardElement$DestinationElement, null), detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    orderDetailsCardResponse$CardElement$DestinationElement = (OrderDetailsCardResponse$CardElement$DestinationElement) detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$1;
                    i5jVar = (i5j) detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$0;
                    kotlin.b.b(obj2);
                }
                g5jVar = (g5j) obj2;
                if (g5jVar != null || orderDetailsCardResponse$CardElement$DestinationElement == null) {
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$0 = null;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label = 3;
                    g = g(i5jVar, detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1);
                    if (g != obj) {
                        return g;
                    }
                } else {
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$0 = null;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$1 = null;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label = 2;
                    Object h = h(i5jVar, g5jVar, detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1);
                    if (h != obj) {
                        return h;
                    }
                }
                return obj;
            }
        }
        detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1 = new DetailsCardDestinationStyleMapper$handleStaticDestinationStyle$1(this, continuationImpl);
        Object obj22 = detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label;
        if (i != 0) {
        }
        g5jVar = (g5j) obj22;
        if (g5jVar != null) {
        }
        detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$0 = null;
        detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$1 = null;
        detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.L$2 = null;
        detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1.label = 3;
        g = g(i5jVar, detailsCardDestinationStyleMapper$handleStaticDestinationStyle$1);
        if (g != obj) {
            return obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        if (r2 != r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(i5j i5jVar, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$internalStyle$1 detailsCardDestinationStyleMapper$internalStyle$1;
        Object obj;
        int i;
        String str;
        String str2;
        String str3;
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState;
        String str4;
        Object s;
        CharSequence charSequence;
        String str5;
        Object b;
        i5j i5jVar2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        int i2;
        int i3;
        int i4;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i5;
        i5j i5jVar3 = i5jVar;
        zuj0 zuj0Var = this.d.a;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$internalStyle$1) {
            detailsCardDestinationStyleMapper$internalStyle$1 = (DetailsCardDestinationStyleMapper$internalStyle$1) continuationImpl;
            int i6 = detailsCardDestinationStyleMapper$internalStyle$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$internalStyle$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = detailsCardDestinationStyleMapper$internalStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$internalStyle$1.label;
                e eVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState2 = i5jVar3.c;
                    if ((detailsCardDestinationStyleInteractor$DestinationState2 == null ? -1 : j5j.a[detailsCardDestinationStyleInteractor$DestinationState2.ordinal()]) == 1) {
                        str = ((avj0) zuj0Var).h(kyh0.order_options_change_destination);
                    } else {
                        str = i5jVar3.a;
                        if (str == null) {
                            str2 = "";
                            FormattedText b2 = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str2, new Integer(16), "textMain", null, null, 56);
                            str3 = str2;
                            detailsCardDestinationStyleMapper$internalStyle$1.L$0 = i5jVar3;
                            detailsCardDestinationStyleMapper$internalStyle$1.L$1 = str3;
                            detailsCardDestinationStyleMapper$internalStyle$1.L$2 = null;
                            detailsCardDestinationStyleMapper$internalStyle$1.label = 1;
                            obj2 = e.s(eVar, b2, detailsCardDestinationStyleMapper$internalStyle$1);
                        }
                    }
                    str2 = str;
                    FormattedText b22 = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str2, new Integer(16), "textMain", null, null, 56);
                    str3 = str2;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$0 = i5jVar3;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$1 = str3;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$internalStyle$1.label = 1;
                    obj2 = e.s(eVar, b22, detailsCardDestinationStyleMapper$internalStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = detailsCardDestinationStyleMapper$internalStyle$1.I$4;
                            i2 = detailsCardDestinationStyleMapper$internalStyle$1.I$3;
                            int i7 = detailsCardDestinationStyleMapper$internalStyle$1.I$1;
                            int i8 = detailsCardDestinationStyleMapper$internalStyle$1.I$0;
                            UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) detailsCardDestinationStyleMapper$internalStyle$1.L$9;
                            CharSequence charSequence4 = (CharSequence) detailsCardDestinationStyleMapper$internalStyle$1.L$8;
                            CharSequence charSequence5 = (CharSequence) detailsCardDestinationStyleMapper$internalStyle$1.L$7;
                            str5 = (String) detailsCardDestinationStyleMapper$internalStyle$1.L$1;
                            i5j i5jVar4 = (i5j) detailsCardDestinationStyleMapper$internalStyle$1.L$0;
                            kotlin.b.b(obj2);
                            i5jVar2 = i5jVar4;
                            uiStateDrawableWrapper = uiStateDrawableWrapper2;
                            charSequence2 = charSequence4;
                            charSequence3 = charSequence5;
                            i5 = i7;
                            i4 = i8;
                            return new n5j(charSequence3, charSequence2, uiStateDrawableWrapper, new DetailsCardListItem.a(i4, i5, i2 == 0, i3 == 0, (f) obj2, 4), !evu0.J(str5), false, false, c(i5jVar2));
                        }
                        CharSequence charSequence6 = (CharSequence) detailsCardDestinationStyleMapper$internalStyle$1.L$3;
                        String str6 = (String) detailsCardDestinationStyleMapper$internalStyle$1.L$1;
                        i5j i5jVar5 = (i5j) detailsCardDestinationStyleMapper$internalStyle$1.L$0;
                        kotlin.b.b(obj2);
                        charSequence = charSequence6;
                        str5 = str6;
                        i5jVar3 = i5jVar5;
                        CharSequence charSequence7 = (CharSequence) obj2;
                        UiStateDrawableWrapper g = pkf.g(this.a.b(i5jVar3.d), "internalIcon", null);
                        int u = tje.u(20, ((avj0) this.c).a);
                        detailsCardDestinationStyleMapper$internalStyle$1.L$0 = i5jVar3;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$1 = str5;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$2 = null;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$3 = null;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$4 = null;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$5 = null;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$6 = null;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$7 = charSequence;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$8 = charSequence7;
                        detailsCardDestinationStyleMapper$internalStyle$1.L$9 = g;
                        detailsCardDestinationStyleMapper$internalStyle$1.I$0 = u;
                        detailsCardDestinationStyleMapper$internalStyle$1.I$1 = 2;
                        detailsCardDestinationStyleMapper$internalStyle$1.I$2 = 0;
                        detailsCardDestinationStyleMapper$internalStyle$1.I$3 = 1;
                        detailsCardDestinationStyleMapper$internalStyle$1.I$4 = 0;
                        detailsCardDestinationStyleMapper$internalStyle$1.label = 3;
                        b = b(i5jVar3, null, detailsCardDestinationStyleMapper$internalStyle$1);
                        if (b != obj) {
                            i5jVar2 = i5jVar3;
                            uiStateDrawableWrapper = g;
                            i2 = 1;
                            obj2 = b;
                            i3 = 0;
                            i4 = u;
                            charSequence2 = charSequence7;
                            charSequence3 = charSequence;
                            i5 = 2;
                            return new n5j(charSequence3, charSequence2, uiStateDrawableWrapper, new DetailsCardListItem.a(i4, i5, i2 == 0, i3 == 0, (f) obj2, 4), !evu0.J(str5), false, false, c(i5jVar2));
                        }
                        return obj;
                    }
                    String str7 = (String) detailsCardDestinationStyleMapper$internalStyle$1.L$1;
                    i5j i5jVar6 = (i5j) detailsCardDestinationStyleMapper$internalStyle$1.L$0;
                    kotlin.b.b(obj2);
                    str3 = str7;
                    i5jVar3 = i5jVar6;
                }
                CharSequence charSequence8 = (CharSequence) obj2;
                detailsCardDestinationStyleInteractor$DestinationState = i5jVar3.c;
                if ((detailsCardDestinationStyleInteractor$DestinationState != null ? j5j.a[detailsCardDestinationStyleInteractor$DestinationState.ordinal()] : -1) != 2) {
                    str4 = i5jVar3.b;
                    if (str4 != null) {
                        if (str4.length() <= 0) {
                            str4 = null;
                        }
                    }
                    str4 = ((avj0) zuj0Var).h(kyh0.order_options_change_destination);
                } else {
                    str4 = null;
                }
                FormattedText b3 = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str4 != null ? "" : str4, new Integer(13), "textMinor", null, null, 56);
                detailsCardDestinationStyleMapper$internalStyle$1.L$0 = i5jVar3;
                detailsCardDestinationStyleMapper$internalStyle$1.L$1 = str3;
                detailsCardDestinationStyleMapper$internalStyle$1.L$2 = null;
                detailsCardDestinationStyleMapper$internalStyle$1.L$3 = charSequence8;
                detailsCardDestinationStyleMapper$internalStyle$1.L$4 = null;
                detailsCardDestinationStyleMapper$internalStyle$1.L$5 = null;
                detailsCardDestinationStyleMapper$internalStyle$1.label = 2;
                s = e.s(eVar, b3, detailsCardDestinationStyleMapper$internalStyle$1);
                if (s != obj) {
                    charSequence = charSequence8;
                    obj2 = s;
                    str5 = str3;
                    CharSequence charSequence72 = (CharSequence) obj2;
                    UiStateDrawableWrapper g2 = pkf.g(this.a.b(i5jVar3.d), "internalIcon", null);
                    int u2 = tje.u(20, ((avj0) this.c).a);
                    detailsCardDestinationStyleMapper$internalStyle$1.L$0 = i5jVar3;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$1 = str5;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$2 = null;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$3 = null;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$4 = null;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$5 = null;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$6 = null;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$7 = charSequence;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$8 = charSequence72;
                    detailsCardDestinationStyleMapper$internalStyle$1.L$9 = g2;
                    detailsCardDestinationStyleMapper$internalStyle$1.I$0 = u2;
                    detailsCardDestinationStyleMapper$internalStyle$1.I$1 = 2;
                    detailsCardDestinationStyleMapper$internalStyle$1.I$2 = 0;
                    detailsCardDestinationStyleMapper$internalStyle$1.I$3 = 1;
                    detailsCardDestinationStyleMapper$internalStyle$1.I$4 = 0;
                    detailsCardDestinationStyleMapper$internalStyle$1.label = 3;
                    b = b(i5jVar3, null, detailsCardDestinationStyleMapper$internalStyle$1);
                    if (b != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardDestinationStyleMapper$internalStyle$1 = new DetailsCardDestinationStyleMapper$internalStyle$1(this, continuationImpl);
        Object obj22 = detailsCardDestinationStyleMapper$internalStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$internalStyle$1.label;
        e eVar2 = this.e;
        if (i != 0) {
        }
        CharSequence charSequence82 = (CharSequence) obj22;
        detailsCardDestinationStyleInteractor$DestinationState = i5jVar3.c;
        if ((detailsCardDestinationStyleInteractor$DestinationState != null ? j5j.a[detailsCardDestinationStyleInteractor$DestinationState.ordinal()] : -1) != 2) {
        }
        FormattedText b32 = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str4 != null ? "" : str4, new Integer(13), "textMinor", null, null, 56);
        detailsCardDestinationStyleMapper$internalStyle$1.L$0 = i5jVar3;
        detailsCardDestinationStyleMapper$internalStyle$1.L$1 = str3;
        detailsCardDestinationStyleMapper$internalStyle$1.L$2 = null;
        detailsCardDestinationStyleMapper$internalStyle$1.L$3 = charSequence82;
        detailsCardDestinationStyleMapper$internalStyle$1.L$4 = null;
        detailsCardDestinationStyleMapper$internalStyle$1.L$5 = null;
        detailsCardDestinationStyleMapper$internalStyle$1.label = 2;
        s = e.s(eVar2, b32, detailsCardDestinationStyleMapper$internalStyle$1);
        if (s != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r2 == r4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(i5j i5jVar, g5j g5jVar, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleMapper$remoteStyle$1 detailsCardDestinationStyleMapper$remoteStyle$1;
        Object obj;
        int i;
        i5j i5jVar2;
        FormattedText formattedText;
        Object s;
        g5j g5jVar2;
        CharSequence charSequence;
        i5j i5jVar3;
        OrderDetailsCardResponse.CardIcon cardIcon;
        Object obj2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        Object b;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        i5j i5jVar4;
        CharSequence charSequence4;
        int i2;
        CharSequence charSequence5;
        int i3;
        int i4;
        g5j g5jVar3 = g5jVar;
        if (continuationImpl instanceof DetailsCardDestinationStyleMapper$remoteStyle$1) {
            detailsCardDestinationStyleMapper$remoteStyle$1 = (DetailsCardDestinationStyleMapper$remoteStyle$1) continuationImpl;
            int i5 = detailsCardDestinationStyleMapper$remoteStyle$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleMapper$remoteStyle$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = detailsCardDestinationStyleMapper$remoteStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleMapper$remoteStyle$1.label;
                e eVar = this.e;
                int i6 = 2;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    FormattedText formattedText2 = g5jVar3.a;
                    i5jVar2 = i5jVar;
                    detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar2;
                    detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = g5jVar3;
                    detailsCardDestinationStyleMapper$remoteStyle$1.label = 1;
                    obj3 = e.s(eVar, formattedText2, detailsCardDestinationStyleMapper$remoteStyle$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) detailsCardDestinationStyleMapper$remoteStyle$1.L$2;
                            g5jVar2 = (g5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$1;
                            i5jVar3 = (i5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$0;
                            kotlin.b.b(obj3);
                            CharSequence charSequence6 = (CharSequence) obj3;
                            cardIcon = g5jVar2.c;
                            detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar3;
                            detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = g5jVar2;
                            detailsCardDestinationStyleMapper$remoteStyle$1.L$2 = charSequence;
                            detailsCardDestinationStyleMapper$remoteStyle$1.L$3 = charSequence6;
                            detailsCardDestinationStyleMapper$remoteStyle$1.label = 3;
                            if (cardIcon != null || (str = cardIcon.b) == null) {
                                obj2 = null;
                            } else {
                                this.b.getClass();
                                sjh sjhVar = uyj.a;
                                obj2 = tje.k0(mdh.b, new DetailsCardDestinationStyleMapper$loadLeadIcon$2(this, str, i5jVar3, null), detailsCardDestinationStyleMapper$remoteStyle$1);
                            }
                            if (obj2 != obj) {
                                Object obj4 = obj2;
                                charSequence2 = charSequence;
                                charSequence3 = charSequence6;
                                obj3 = obj4;
                                UiStateDrawableWrapper g = pkf.g((Drawable) obj3, g5jVar2.c.b, null);
                                int c = ((avj0) this.c).c(mrg0.go_design_s_space);
                                i1 i1Var = g5jVar2.d;
                                detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar3;
                                detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = null;
                                detailsCardDestinationStyleMapper$remoteStyle$1.L$2 = charSequence2;
                                detailsCardDestinationStyleMapper$remoteStyle$1.L$3 = charSequence3;
                                detailsCardDestinationStyleMapper$remoteStyle$1.L$4 = g;
                                detailsCardDestinationStyleMapper$remoteStyle$1.I$0 = c;
                                detailsCardDestinationStyleMapper$remoteStyle$1.I$1 = 2;
                                detailsCardDestinationStyleMapper$remoteStyle$1.I$2 = 0;
                                detailsCardDestinationStyleMapper$remoteStyle$1.I$3 = 1;
                                detailsCardDestinationStyleMapper$remoteStyle$1.I$4 = 1;
                                detailsCardDestinationStyleMapper$remoteStyle$1.label = 4;
                                b = b(i5jVar3, i1Var, detailsCardDestinationStyleMapper$remoteStyle$1);
                                if (b != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = detailsCardDestinationStyleMapper$remoteStyle$1.I$4;
                            i4 = detailsCardDestinationStyleMapper$remoteStyle$1.I$3;
                            i6 = detailsCardDestinationStyleMapper$remoteStyle$1.I$1;
                            int i7 = detailsCardDestinationStyleMapper$remoteStyle$1.I$0;
                            uiStateDrawableWrapper = (UiStateDrawableWrapper) detailsCardDestinationStyleMapper$remoteStyle$1.L$4;
                            charSequence5 = (CharSequence) detailsCardDestinationStyleMapper$remoteStyle$1.L$3;
                            charSequence4 = (CharSequence) detailsCardDestinationStyleMapper$remoteStyle$1.L$2;
                            i5jVar4 = (i5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$0;
                            kotlin.b.b(obj3);
                            i2 = i7;
                            return new n5j(charSequence4, charSequence5, uiStateDrawableWrapper, new DetailsCardListItem.a(i2, i6, i4 == 0, i3 == 0, (f) obj3, 4), true, false, true, c(i5jVar4));
                        }
                        charSequence3 = (CharSequence) detailsCardDestinationStyleMapper$remoteStyle$1.L$3;
                        CharSequence charSequence7 = (CharSequence) detailsCardDestinationStyleMapper$remoteStyle$1.L$2;
                        g5j g5jVar4 = (g5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$1;
                        i5j i5jVar5 = (i5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$0;
                        kotlin.b.b(obj3);
                        charSequence2 = charSequence7;
                        g5jVar2 = g5jVar4;
                        i5jVar3 = i5jVar5;
                        UiStateDrawableWrapper g2 = pkf.g((Drawable) obj3, g5jVar2.c.b, null);
                        int c2 = ((avj0) this.c).c(mrg0.go_design_s_space);
                        i1 i1Var2 = g5jVar2.d;
                        detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar3;
                        detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = null;
                        detailsCardDestinationStyleMapper$remoteStyle$1.L$2 = charSequence2;
                        detailsCardDestinationStyleMapper$remoteStyle$1.L$3 = charSequence3;
                        detailsCardDestinationStyleMapper$remoteStyle$1.L$4 = g2;
                        detailsCardDestinationStyleMapper$remoteStyle$1.I$0 = c2;
                        detailsCardDestinationStyleMapper$remoteStyle$1.I$1 = 2;
                        detailsCardDestinationStyleMapper$remoteStyle$1.I$2 = 0;
                        detailsCardDestinationStyleMapper$remoteStyle$1.I$3 = 1;
                        detailsCardDestinationStyleMapper$remoteStyle$1.I$4 = 1;
                        detailsCardDestinationStyleMapper$remoteStyle$1.label = 4;
                        b = b(i5jVar3, i1Var2, detailsCardDestinationStyleMapper$remoteStyle$1);
                        if (b != obj) {
                            uiStateDrawableWrapper = g2;
                            i5jVar4 = i5jVar3;
                            charSequence4 = charSequence2;
                            i2 = c2;
                            obj3 = b;
                            charSequence5 = charSequence3;
                            i3 = 1;
                            i4 = 1;
                            return new n5j(charSequence4, charSequence5, uiStateDrawableWrapper, new DetailsCardListItem.a(i2, i6, i4 == 0, i3 == 0, (f) obj3, 4), true, false, true, c(i5jVar4));
                        }
                        return obj;
                    }
                    g5jVar3 = (g5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$1;
                    i5jVar2 = (i5j) detailsCardDestinationStyleMapper$remoteStyle$1.L$0;
                    kotlin.b.b(obj3);
                }
                CharSequence charSequence8 = (CharSequence) obj3;
                formattedText = g5jVar3.b;
                if (formattedText == null) {
                    formattedText = FormattedText.c;
                }
                detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar2;
                detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = g5jVar3;
                detailsCardDestinationStyleMapper$remoteStyle$1.L$2 = charSequence8;
                detailsCardDestinationStyleMapper$remoteStyle$1.label = 2;
                s = e.s(eVar, formattedText, detailsCardDestinationStyleMapper$remoteStyle$1);
                if (s != obj) {
                    i5j i5jVar6 = i5jVar2;
                    g5jVar2 = g5jVar3;
                    charSequence = charSequence8;
                    obj3 = s;
                    i5jVar3 = i5jVar6;
                    CharSequence charSequence62 = (CharSequence) obj3;
                    cardIcon = g5jVar2.c;
                    detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar3;
                    detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = g5jVar2;
                    detailsCardDestinationStyleMapper$remoteStyle$1.L$2 = charSequence;
                    detailsCardDestinationStyleMapper$remoteStyle$1.L$3 = charSequence62;
                    detailsCardDestinationStyleMapper$remoteStyle$1.label = 3;
                    if (cardIcon != null) {
                    }
                    obj2 = null;
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardDestinationStyleMapper$remoteStyle$1 = new DetailsCardDestinationStyleMapper$remoteStyle$1(this, continuationImpl);
        Object obj32 = detailsCardDestinationStyleMapper$remoteStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleMapper$remoteStyle$1.label;
        e eVar2 = this.e;
        int i62 = 2;
        if (i != 0) {
        }
        CharSequence charSequence82 = (CharSequence) obj32;
        formattedText = g5jVar3.b;
        if (formattedText == null) {
        }
        detailsCardDestinationStyleMapper$remoteStyle$1.L$0 = i5jVar2;
        detailsCardDestinationStyleMapper$remoteStyle$1.L$1 = g5jVar3;
        detailsCardDestinationStyleMapper$remoteStyle$1.L$2 = charSequence82;
        detailsCardDestinationStyleMapper$remoteStyle$1.label = 2;
        s = e.s(eVar2, formattedText, detailsCardDestinationStyleMapper$remoteStyle$1);
        if (s != obj) {
        }
        return obj;
    }
}
