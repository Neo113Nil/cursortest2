package com.yandex.go.agreement.trackable.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.agreement.trackable.mvp.TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1;
import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemSizeDto;
import defpackage.bdc;
import defpackage.cd;
import defpackage.irs0;
import defpackage.j101;
import defpackage.kdc;
import defpackage.m101;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v101;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xss0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final e b;
    public final c c;
    public final irs0 d;
    public final j101 e;

    public a(tt2 tt2Var, e eVar, c cVar, irs0 irs0Var, j101 j101Var) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = cVar;
        this.d = irs0Var;
        this.e = j101Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r6 == r8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r6 == r8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        TrackableAcceptanceUiStateMapper$loadImageByTag$1 trackableAcceptanceUiStateMapper$loadImageByTag$1;
        int i;
        BitmapDrawable bitmapDrawable;
        aVar.getClass();
        e eVar = aVar.b;
        if (continuationImpl instanceof TrackableAcceptanceUiStateMapper$loadImageByTag$1) {
            trackableAcceptanceUiStateMapper$loadImageByTag$1 = (TrackableAcceptanceUiStateMapper$loadImageByTag$1) continuationImpl;
            int i2 = trackableAcceptanceUiStateMapper$loadImageByTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackableAcceptanceUiStateMapper$loadImageByTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackableAcceptanceUiStateMapper$loadImageByTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackableAcceptanceUiStateMapper$loadImageByTag$1.label;
                if (i != 0) {
                    b.b(obj);
                    trackableAcceptanceUiStateMapper$loadImageByTag$1.L$0 = str;
                    trackableAcceptanceUiStateMapper$loadImageByTag$1.label = 1;
                    obj = e.i(eVar, str, null, trackableAcceptanceUiStateMapper$loadImageByTag$1, 14);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) trackableAcceptanceUiStateMapper$loadImageByTag$1.L$0;
                        b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        return pkf.g(bitmapDrawable, str, null);
                    }
                    str = (String) trackableAcceptanceUiStateMapper$loadImageByTag$1.L$0;
                    b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    trackableAcceptanceUiStateMapper$loadImageByTag$1.L$0 = str;
                    trackableAcceptanceUiStateMapper$loadImageByTag$1.label = 2;
                    obj = e.f(eVar, str, null, trackableAcceptanceUiStateMapper$loadImageByTag$1, 6);
                }
                return pkf.g(bitmapDrawable, str, null);
            }
        }
        trackableAcceptanceUiStateMapper$loadImageByTag$1 = new TrackableAcceptanceUiStateMapper$loadImageByTag$1(aVar, continuationImpl);
        Object obj2 = trackableAcceptanceUiStateMapper$loadImageByTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptanceUiStateMapper$loadImageByTag$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
        return pkf.g(bitmapDrawable, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, SlotButtonDto slotButtonDto, ContinuationImpl continuationImpl) {
        TrackableAcceptanceUiStateMapper$mapButtonState$1 trackableAcceptanceUiStateMapper$mapButtonState$1;
        int i;
        kdc d;
        int i2;
        int i3;
        aVar.getClass();
        irs0 irs0Var = aVar.d;
        if (continuationImpl instanceof TrackableAcceptanceUiStateMapper$mapButtonState$1) {
            trackableAcceptanceUiStateMapper$mapButtonState$1 = (TrackableAcceptanceUiStateMapper$mapButtonState$1) continuationImpl;
            int i4 = trackableAcceptanceUiStateMapper$mapButtonState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                trackableAcceptanceUiStateMapper$mapButtonState$1.label = i4 - Integer.MIN_VALUE;
                Object obj = trackableAcceptanceUiStateMapper$mapButtonState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackableAcceptanceUiStateMapper$mapButtonState$1.label;
                if (i != 0) {
                    b.b(obj);
                    SlotItemDto slotItemDto = slotButtonDto.g;
                    if (slotItemDto == null) {
                        return null;
                    }
                    j101 j101Var = aVar.e;
                    trackableAcceptanceUiStateMapper$mapButtonState$1.L$0 = slotButtonDto;
                    trackableAcceptanceUiStateMapper$mapButtonState$1.label = 1;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, j101Var, false, false, null, trackableAcceptanceUiStateMapper$mapButtonState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slotButtonDto = (SlotButtonDto) trackableAcceptanceUiStateMapper$mapButtonState$1.L$0;
                    b.b(obj);
                }
                xss0 xss0Var = (xss0) obj;
                d = aVar.b.d(slotButtonDto.f.d);
                if (d == null) {
                    d = new bdc(xng0.controlMinor);
                }
                SlotItemDto slotItemDto2 = slotButtonDto.g;
                SlotItemSizeDto slotItemSizeDto = slotItemDto2 == null ? slotItemDto2.b : null;
                i2 = slotItemSizeDto != null ? -1 : v101.a[slotItemSizeDto.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        i3 = mrg0.button_component_size_XS;
                    } else if (i2 == 2) {
                        i3 = mrg0.button_component_size_S;
                    } else if (i2 == 3) {
                        i3 = mrg0.button_component_size_M;
                    } else if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    return new m101(xss0Var, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto.f), d, i3);
                }
                i3 = mrg0.button_component_size_L;
                return new m101(xss0Var, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto.f), d, i3);
            }
        }
        trackableAcceptanceUiStateMapper$mapButtonState$1 = new TrackableAcceptanceUiStateMapper$mapButtonState$1(aVar, continuationImpl);
        Object obj2 = trackableAcceptanceUiStateMapper$mapButtonState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptanceUiStateMapper$mapButtonState$1.label;
        if (i != 0) {
        }
        xss0 xss0Var2 = (xss0) obj2;
        d = aVar.b.d(slotButtonDto.f.d);
        if (d == null) {
        }
        SlotItemDto slotItemDto22 = slotButtonDto.g;
        if (slotItemDto22 == null) {
        }
        if (slotItemSizeDto != null) {
        }
        if (i2 != -1) {
        }
        i3 = mrg0.button_component_size_L;
        return new m101(xss0Var2, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto.f), d, i3);
    }

    public final Object c(cd cdVar, TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1 trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1) {
        this.a.getClass();
        return tje.k0(uyj.a, new TrackableAcceptanceUiStateMapper$map$2(cdVar, this, null), trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1);
    }
}
