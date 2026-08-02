package com.yandex.go.taxi.summary.mobilityhub.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.avj0;
import defpackage.f1h0;
import defpackage.gx0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.p4h0;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final zuj0 b;
    public final pwy0 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final com.yandex.go.route.interactor.b e;

    public a(tt2 tt2Var, zuj0 zuj0Var, pwy0 pwy0Var, ru.yandex.taxi.widget.utils.e eVar, com.yandex.go.route.interactor.b bVar) {
        this.a = tt2Var;
        this.b = zuj0Var;
        this.c = pwy0Var;
        this.d = eVar;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ThemeType themeType, ContinuationImpl continuationImpl) {
        AddressIconsStateInteractor$sourceIcon$1 addressIconsStateInteractor$sourceIcon$1;
        int i;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        BitmapDrawable bitmapDrawable;
        aVar.getClass();
        if (continuationImpl instanceof AddressIconsStateInteractor$sourceIcon$1) {
            addressIconsStateInteractor$sourceIcon$1 = (AddressIconsStateInteractor$sourceIcon$1) continuationImpl;
            int i2 = addressIconsStateInteractor$sourceIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressIconsStateInteractor$sourceIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressIconsStateInteractor$sourceIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressIconsStateInteractor$sourceIcon$1.label;
                uiStateDrawableWrapper = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        if ((str.length() != 0 ? str : null) != null) {
                            ru.yandex.taxi.widget.utils.e eVar = aVar.d;
                            addressIconsStateInteractor$sourceIcon$1.L$0 = str;
                            addressIconsStateInteractor$sourceIcon$1.L$1 = themeType;
                            addressIconsStateInteractor$sourceIcon$1.L$2 = null;
                            addressIconsStateInteractor$sourceIcon$1.label = 1;
                            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, addressIconsStateInteractor$sourceIcon$1, 6);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return pkf.g(vng.t(p4h0.ic_mobility_source_icon, ((avj0) aVar.b).a), "source_default", themeType);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                themeType = (ThemeType) addressIconsStateInteractor$sourceIcon$1.L$1;
                str = (String) addressIconsStateInteractor$sourceIcon$1.L$0;
                kotlin.b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    uiStateDrawableWrapper = pkf.g(bitmapDrawable, "source_" + str, themeType);
                }
                if (uiStateDrawableWrapper != null) {
                    return uiStateDrawableWrapper;
                }
                return pkf.g(vng.t(p4h0.ic_mobility_source_icon, ((avj0) aVar.b).a), "source_default", themeType);
            }
        }
        addressIconsStateInteractor$sourceIcon$1 = new AddressIconsStateInteractor$sourceIcon$1(aVar, continuationImpl);
        Object obj2 = addressIconsStateInteractor$sourceIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressIconsStateInteractor$sourceIcon$1.label;
        uiStateDrawableWrapper = null;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        if (uiStateDrawableWrapper != null) {
        }
        return pkf.g(vng.t(p4h0.ic_mobility_source_icon, ((avj0) aVar.b).a), "source_default", themeType);
    }

    public final tpr b() {
        m0 m0Var = new m0(this.e.k(), this.c.a(), new AddressIconsStateInteractor$stateFlow$1(this, null));
        int i = p4h0.ic_mobility_source_icon;
        avj0 avj0Var = (avj0) this.b;
        tpr d = com.yandex.go.coroutines.b.d(m0Var, new AddressIconsStateInteractor$stateFlow$$inlined$start$1(new gx0(pkf.g(vng.t(i, avj0Var.a), "source_default", null), pkf.g(vng.t(f1h0.ic_destination_pin_two_flag_24, avj0Var.a), "destination_two_flags", null)), null));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(d, mdh.b);
    }
}
