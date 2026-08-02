package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.coroutines.h;
import com.yandex.go.superapp.orders.card.experiments.TrackingCardElementHorizontalPlacement;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import com.yandex.go.superapp.tracking.api.domain.models.TrackingCardStatus$Image$Clipping;
import com.yandex.go.superapp.tracking.domain.f;
import defpackage.a3p;
import defpackage.a78;
import defpackage.ajz;
import defpackage.an70;
import defpackage.aog0;
import defpackage.avc0;
import defpackage.avj0;
import defpackage.b3p;
import defpackage.bdc;
import defpackage.bjz;
import defpackage.bn70;
import defpackage.bvc0;
import defpackage.c501;
import defpackage.cdc;
import defpackage.cn70;
import defpackage.d3p;
import defpackage.d501;
import defpackage.dn70;
import defpackage.e58;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.f401;
import defpackage.f4h0;
import defpackage.fhw0;
import defpackage.fn70;
import defpackage.g301;
import defpackage.g401;
import defpackage.g92;
import defpackage.gei;
import defpackage.ghw0;
import defpackage.gw00;
import defpackage.h401;
import defpackage.hm70;
import defpackage.hn70;
import defpackage.i401;
import defpackage.im70;
import defpackage.in91;
import defpackage.j401;
import defpackage.j73;
import defpackage.jem;
import defpackage.jl40;
import defpackage.jm70;
import defpackage.k301;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.km70;
import defpackage.kyh0;
import defpackage.l401;
import defpackage.lm70;
import defpackage.lzg0;
import defpackage.m301;
import defpackage.m401;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.mm70;
import defpackage.mrg0;
import defpackage.n2s;
import defpackage.n301;
import defpackage.n401;
import defpackage.nm70;
import defpackage.ny61;
import defpackage.o301;
import defpackage.o401;
import defpackage.oiz;
import defpackage.om70;
import defpackage.ou6;
import defpackage.oxu0;
import defpackage.p301;
import defpackage.p401;
import defpackage.pdc;
import defpackage.pfv;
import defpackage.pg50;
import defpackage.piz;
import defpackage.pkf;
import defpackage.pm70;
import defpackage.pu6;
import defpackage.q401;
import defpackage.q48;
import defpackage.q6o0;
import defpackage.q6y0;
import defpackage.qg50;
import defpackage.qiz;
import defpackage.qje;
import defpackage.qm70;
import defpackage.r7p0;
import defpackage.rcc;
import defpackage.rn70;
import defpackage.s401;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sm70;
import defpackage.sn70;
import defpackage.t401;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tm70;
import defpackage.tn70;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u401;
import defpackage.u501;
import defpackage.ufu;
import defpackage.um70;
import defpackage.uyj;
import defpackage.vm70;
import defpackage.vn70;
import defpackage.vpr;
import defpackage.vt11;
import defpackage.w201;
import defpackage.w511;
import defpackage.w68;
import defpackage.wm70;
import defpackage.wn70;
import defpackage.xda;
import defpackage.xm70;
import defpackage.xng0;
import defpackage.y2y0;
import defpackage.yiz;
import defpackage.yl70;
import defpackage.ym70;
import defpackage.yuc0;
import defpackage.z2p;
import defpackage.zuc0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.common_models.net.z;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;
import ru.yandex.taxi.logistics.deliveries.multiorder.DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes.dex */
public final class e implements u501 {
    public final Context a;
    public final tt2 b;
    public final pdc c;
    public final zuj0 d;
    public final k7x0 e;
    public final n2s f;
    public final ru.yandex.taxi.widget.utils.e g;
    public final oxu0 h;
    public final ru.yandex.taxi.widget.c i;
    public final gei j;
    public final y k;
    public final d501 l;
    public final com.yandex.go.superapp.tracking.data.a m;

    public e(Context context, tt2 tt2Var, pdc pdcVar, zuj0 zuj0Var, k7x0 k7x0Var, n2s n2sVar, ru.yandex.taxi.widget.utils.e eVar, oxu0 oxu0Var, ru.yandex.taxi.widget.c cVar, gei geiVar, y yVar, d501 d501Var, com.yandex.go.superapp.tracking.data.a aVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = pdcVar;
        this.d = zuj0Var;
        this.e = k7x0Var;
        this.f = n2sVar;
        this.g = eVar;
        this.h = oxu0Var;
        this.i = cVar;
        this.j = geiVar;
        this.k = yVar;
        this.l = d501Var;
        this.m = aVar;
    }

    public static String A(c501 c501Var, wn70 wn70Var, boolean z) {
        if (wn70Var instanceof rn70) {
            return z ? c501Var.b() : c501Var.a();
        }
        if (wn70Var instanceof sn70) {
            return z ? c501Var.d() : c501Var.c();
        }
        if (jl40.l(wn70Var, tn70.a)) {
            return z ? c501Var.f() : c501Var.e();
        }
        if (wn70Var instanceof vn70) {
            return z ? c501Var.h() : c501Var.g();
        }
        w511.b();
        return null;
    }

    public static zuc0 C(String str, wn70 wn70Var) {
        String a = t7s.a(str);
        if (a != null) {
            str = a;
        }
        List Y = evu0.Y(str, new char[]{160}, 0, 6);
        return E(kotlin.collections.a.X(kotlin.collections.a.A0(Y, 3), " ", null, null, null, 62), (String) kotlin.collections.a.S(3, Y), wn70Var);
    }

    public static lm70 D(i401 i401Var) {
        String b = i401Var.b();
        TrackingCardStatus$Image$Clipping a = i401Var.a();
        int i = a == null ? -1 : fhw0.d[a.ordinal()];
        Integer num = null;
        if (i != -1) {
            if (i == 1) {
                num = 12;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                num = 20;
            }
        }
        return new lm70(b, num);
    }

    public static zuc0 E(String str, String str2, wn70 wn70Var) {
        bdc p = p(wn70Var, aog0.trackingText, xng0.textMain);
        yuc0 yuc0Var = new yuc0(p, str);
        if (str2 == null) {
            str2 = "";
        }
        return new zuc0(yuc0Var, new yuc0(p, str2), p, p, new bdc(xng0.bgTransparent));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, w201 w201Var, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getActionButtonsUiState$1 superappTrackingCardUiStateInteractor$getActionButtonsUiState$1;
        g301 D;
        List a;
        wn70 wn70Var2;
        m301 m301Var;
        List list;
        boolean z2;
        k301 k301Var;
        Object q;
        CharSequence charSequence;
        k301 k301Var2;
        k301 k301Var3;
        boolean z3;
        m301 m301Var2;
        Object q2;
        CharSequence charSequence2;
        m301 m301Var3;
        eVar.getClass();
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getActionButtonsUiState$1) {
            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1 = (SuperappTrackingCardUiStateInteractor$getActionButtonsUiState$1) continuationImpl;
            int i = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = i - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                m301 m301Var4 = null;
                switch (superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        if (!(w201Var instanceof d3p)) {
                            if (w201Var instanceof q6y0) {
                                y yVar = eVar.k;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = w201Var;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = wn70Var;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 2;
                                obj = yVar.f(superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                                break;
                            }
                            return null;
                        }
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 1;
                        Object w = eVar.w((d3p) w201Var, wn70Var, z, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                        if (w != obj2) {
                            return w;
                        }
                        return obj2;
                    case 1:
                        kotlin.b.b(obj);
                        return obj;
                    case 2:
                        z = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0;
                        wn70Var = (wn70) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1;
                        w201Var = (w201) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue() && (D = ((q6y0) w201Var).D()) != null && (a = D.a()) != null) {
                            if (a.isEmpty()) {
                                a = null;
                            }
                            if (a != null) {
                                k301 k301Var4 = (k301) kotlin.collections.a.S(scc.f(a), a);
                                if (k301Var4 == null) {
                                    wn70Var2 = wn70Var;
                                    m301Var = null;
                                    if (a.size() > 1) {
                                        FormattedText c = k301Var2.c();
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = wn70Var2;
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = null;
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = k301Var2;
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4 = m301Var;
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z;
                                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 5;
                                        obj = eVar.q(c, wn70Var2, z, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                                        if (obj != obj2) {
                                        }
                                        return obj2;
                                    }
                                    return new yl70(m301Var, m301Var4);
                                }
                                FormattedText c2 = k301Var4.c();
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = wn70Var;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = a;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = k301Var4;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z;
                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 3;
                                Object q3 = eVar.q(c2, wn70Var, z, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                                if (q3 != obj2) {
                                    boolean z4 = z;
                                    list = a;
                                    z2 = z4;
                                    wn70Var2 = wn70Var;
                                    k301Var = k301Var4;
                                    obj = q3;
                                    CharSequence charSequence3 = (CharSequence) obj;
                                    FormattedText b = k301Var.b();
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = wn70Var2;
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = list;
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = null;
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4 = charSequence3;
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z2;
                                    superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 4;
                                    q = eVar.q(b, wn70Var2, z2, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                                    if (q != obj2) {
                                        obj = q;
                                        charSequence = charSequence3;
                                        m301Var = new m301(charSequence, (CharSequence) obj, 12);
                                        List list2 = list;
                                        z = z2;
                                        a = list2;
                                        if (a.size() > 1 && (k301Var2 = (k301) kotlin.collections.a.S(scc.f(a) - 1, a)) != null) {
                                            FormattedText c3 = k301Var2.c();
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = wn70Var2;
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = null;
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = k301Var2;
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4 = m301Var;
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z;
                                            superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 5;
                                            obj = eVar.q(c3, wn70Var2, z, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                                            if (obj != obj2) {
                                                boolean z5 = z;
                                                k301Var3 = k301Var2;
                                                z3 = z5;
                                                m301Var2 = m301Var;
                                                CharSequence charSequence4 = (CharSequence) obj;
                                                FormattedText b2 = k301Var3.b();
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = null;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = null;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = null;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4 = charSequence4;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$5 = m301Var2;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z3;
                                                superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 6;
                                                q2 = eVar.q(b2, wn70Var2, z3, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                                                if (q2 != obj2) {
                                                    charSequence2 = charSequence4;
                                                    obj = q2;
                                                    m301Var3 = m301Var2;
                                                    m301Var4 = new m301(charSequence2, (CharSequence) obj, 12);
                                                    m301Var = m301Var3;
                                                }
                                            }
                                        }
                                        return new yl70(m301Var, m301Var4);
                                    }
                                }
                                return obj2;
                            }
                        }
                        return null;
                    case 3:
                        z2 = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0;
                        k301Var = (k301) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3;
                        list = (List) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2;
                        wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1;
                        kotlin.b.b(obj);
                        CharSequence charSequence32 = (CharSequence) obj;
                        FormattedText b3 = k301Var.b();
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = list;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4 = charSequence32;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z2;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 4;
                        q = eVar.q(b3, wn70Var2, z2, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                        if (q != obj2) {
                        }
                        return obj2;
                    case 4:
                        z2 = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0;
                        charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4;
                        list = (List) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2;
                        wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1;
                        kotlin.b.b(obj);
                        m301Var = new m301(charSequence, (CharSequence) obj, 12);
                        List list22 = list;
                        z = z2;
                        a = list22;
                        if (a.size() > 1) {
                        }
                        return new yl70(m301Var, m301Var4);
                    case 5:
                        z3 = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0;
                        m301Var2 = (m301) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4;
                        k301Var3 = (k301) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3;
                        wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1;
                        kotlin.b.b(obj);
                        CharSequence charSequence42 = (CharSequence) obj;
                        FormattedText b22 = k301Var3.b();
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$1 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$2 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$3 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4 = charSequence42;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$5 = m301Var2;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.Z$0 = z3;
                        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label = 6;
                        q2 = eVar.q(b22, wn70Var2, z3, superappTrackingCardUiStateInteractor$getActionButtonsUiState$1);
                        if (q2 != obj2) {
                        }
                        return obj2;
                    case 6:
                        m301Var3 = (m301) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$5;
                        charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.L$4;
                        kotlin.b.b(obj);
                        m301Var4 = new m301(charSequence2, (CharSequence) obj, 12);
                        m301Var = m301Var3;
                        return new yl70(m301Var, m301Var4);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        superappTrackingCardUiStateInteractor$getActionButtonsUiState$1 = new SuperappTrackingCardUiStateInteractor$getActionButtonsUiState$1(eVar, continuationImpl);
        Object obj3 = superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        m301 m301Var42 = null;
        switch (superappTrackingCardUiStateInteractor$getActionButtonsUiState$1.label) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r2v3, types: [nm70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, pu6 pu6Var, wn70 wn70Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$27 superappTrackingCardUiStateInteractor$getCardHeaderUiState$27;
        CoroutineSingletons coroutineSingletons;
        int i;
        pu6 pu6Var2;
        wn70 wn70Var2;
        jm70 jm70Var;
        Object i2;
        CharSequence charSequence;
        jm70 jm70Var2;
        int i3;
        int i4;
        CharSequence charSequence2;
        jm70 jm70Var3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z;
        Object f;
        CharSequence charSequence5;
        int i5;
        jm70 jm70Var4;
        wn70 wn70Var3;
        CharSequence charSequence6;
        fn70 fn70Var;
        int i6;
        y yVar = eVar.k;
        ru.yandex.taxi.widget.c cVar = eVar.i;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$27) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$27) continuationImpl;
            int i7 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = i7 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<ou6> I = kotlin.collections.a.I(pu6Var.m());
                    ArrayList arrayList = new ArrayList(tcc.n(I, 10));
                    for (ou6 ou6Var : I) {
                        arrayList.add(new im70(ou6Var.b(), ou6Var.a()));
                    }
                    jm70 jm70Var5 = new jm70(arrayList);
                    FormattedText v = pu6Var.v();
                    pu6Var2 = pu6Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = pu6Var2;
                    wn70Var2 = wn70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var5;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 1;
                    Object i8 = ru.yandex.taxi.widget.c.i(cVar, v, null, superappTrackingCardUiStateInteractor$getCardHeaderUiState$27, 30);
                    if (i8 != coroutineSingletons) {
                        jm70Var = jm70Var5;
                        obj = i8;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1;
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0;
                        charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4;
                        jm70Var2 = (jm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3;
                        wn70 wn70Var4 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1;
                        kotlin.b.b(obj);
                        wn70Var2 = wn70Var4;
                        charSequence2 = (CharSequence) obj;
                        if (!jm70Var2.a().isEmpty()) {
                            jm70Var3 = jm70Var2;
                            z = false;
                            if (!z) {
                            }
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4 = charSequence;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$5 = charSequence2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$6 = jm70Var2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$7 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0 = i4;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1 = i3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 4;
                            f = yVar.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$27);
                            if (f != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4 = jm70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$5 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$6 = charSequence;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$7 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0 = i4;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1 = i3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 3;
                        Object f2 = yVar.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$27);
                        if (f2 != coroutineSingletons) {
                            CharSequence charSequence7 = charSequence;
                            charSequence3 = charSequence2;
                            obj = f2;
                            charSequence4 = charSequence7;
                            jm70Var3 = jm70Var2;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0;
                        ?? r2 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$6;
                        CharSequence charSequence8 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$5;
                        CharSequence charSequence9 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4;
                        fn70Var = (jm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3;
                        wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1;
                        kotlin.b.b(obj);
                        jm70Var4 = r2;
                        charSequence5 = charSequence8;
                        charSequence6 = charSequence9;
                        if (((Boolean) obj).booleanValue()) {
                            if (wn70Var3 instanceof rn70) {
                                i6 = f4h0.ic_orders_bundle_arrow_focus;
                            } else {
                                if (!(wn70Var3 instanceof sn70) && !jl40.l(wn70Var3, tn70.a) && !(wn70Var3 instanceof vn70)) {
                                    w511.b();
                                    return null;
                                }
                                i6 = f4h0.ic_orders_bundle_arrow;
                            }
                            fn70Var = new hm70(i6);
                        }
                        return new hn70(charSequence6, null, null, null, null, i5 == 0, null, charSequence5, null, jm70Var4, fn70Var, false, 0, null, false, 0L, 0L, null, 2093822);
                    }
                    i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1;
                    i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0;
                    charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$7;
                    charSequence4 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$6;
                    jm70Var2 = (jm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4;
                    jm70Var3 = (jm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3;
                    wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        charSequence2 = charSequence3;
                        charSequence = charSequence4;
                        z = false;
                        if (!z) {
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4 = charSequence;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$5 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$6 = jm70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$7 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0 = i4;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1 = i3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 4;
                        f = yVar.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$27);
                        if (f != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    charSequence2 = charSequence3;
                    charSequence = charSequence4;
                    z = true;
                    if (!z) {
                        jm70Var2 = null;
                    }
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4 = charSequence;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$5 = charSequence2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$6 = jm70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$7 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0 = i4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1 = i3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 4;
                    f = yVar.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$27);
                    if (f != coroutineSingletons) {
                        charSequence5 = charSequence2;
                        obj = f;
                        i5 = i4;
                        jm70Var4 = jm70Var2;
                        wn70Var3 = wn70Var2;
                        charSequence6 = charSequence;
                        fn70Var = jm70Var3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return new hn70(charSequence6, null, null, null, null, i5 == 0, null, charSequence5, null, jm70Var4, fn70Var, false, 0, null, false, 0L, 0L, null, 2093822);
                    }
                    return coroutineSingletons;
                }
                jm70Var = (jm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3;
                wn70 wn70Var5 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1;
                pu6 pu6Var3 = (pu6) superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0;
                kotlin.b.b(obj);
                wn70Var2 = wn70Var5;
                pu6Var2 = pu6Var3;
                CharSequence charSequence10 = (CharSequence) obj;
                FormattedText n = pu6Var2.n();
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4 = charSequence10;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0 = 0;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1 = 0;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, n, null, superappTrackingCardUiStateInteractor$getCardHeaderUiState$27, 30);
                if (i2 != coroutineSingletons) {
                    charSequence = charSequence10;
                    obj = i2;
                    jm70Var2 = jm70Var;
                    i3 = 0;
                    i4 = 0;
                    charSequence2 = (CharSequence) obj;
                    if (!jm70Var2.a().isEmpty()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$27(eVar, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label;
        if (i != 0) {
        }
        CharSequence charSequence102 = (CharSequence) obj2;
        FormattedText n2 = pu6Var2.n();
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$0 = null;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$1 = wn70Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$2 = null;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$3 = jm70Var;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.L$4 = charSequence102;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$0 = 0;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.I$1 = 0;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$27.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar, n2, null, superappTrackingCardUiStateInteractor$getCardHeaderUiState$27, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
    
        if (r1 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0141, code lost:
    
        if (r6 == r4) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, xda xdaVar, wn70 wn70Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$14 superappTrackingCardUiStateInteractor$getCardHeaderUiState$14;
        xda xdaVar2;
        wn70 wn70Var2;
        Object g;
        CharSequence charSequence;
        CharSequence charSequence2;
        wn70 wn70Var3;
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement;
        h hVar;
        CharSequence charSequence3;
        int i;
        int i2;
        xda xdaVar3;
        int i3;
        xda xdaVar4;
        e eVar2;
        nm70 nm70Var;
        String s;
        int i4;
        int i5;
        fn70 fn70Var;
        String s2;
        wn70 wn70Var4;
        xda xdaVar5;
        boolean z;
        float f;
        Object q;
        int i6;
        fn70 fn70Var2;
        int i7;
        nm70 nm70Var2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        int i8;
        y yVar = eVar.k;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$14) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$14) continuationImpl;
            int i9 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = i9 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label) {
                    case 0:
                        kotlin.b.b(obj);
                        xdaVar2 = xdaVar;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = xdaVar2;
                        wn70Var2 = wn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 1;
                        g = yVar.g(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                        break;
                    case 1:
                        wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1;
                        xda xdaVar6 = (xda) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0;
                        kotlin.b.b(obj);
                        g = obj;
                        xdaVar2 = xdaVar6;
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement2 = (TrackingCardElementHorizontalPlacement) g;
                        h hVar2 = new h(new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$serviceIcon$4(eVar, xdaVar2, null));
                        charSequence = xdaVar2.d;
                        charSequence2 = xdaVar2.e;
                        if (evu0.J(xdaVar2.f)) {
                            wn70Var3 = wn70Var2;
                            trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement2;
                            hVar = hVar2;
                            charSequence3 = charSequence;
                            i = 0;
                            i2 = 0;
                            xdaVar3 = xdaVar2;
                            if (!evu0.J(xdaVar3.f)) {
                            }
                            xdaVar4 = xdaVar3;
                            i3 = i2;
                            nm70Var = null;
                            if (evu0.J(xdaVar4.f)) {
                            }
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                            z = false;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                            f = 0.0f;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                            q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                            if (q != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = xdaVar2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = trackingCardElementHorizontalPlacement2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = hVar2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 2;
                        Object F = yVar.F(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                        if (F != coroutineSingletons) {
                            wn70Var3 = wn70Var2;
                            trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement2;
                            hVar = hVar2;
                            i = 0;
                            i3 = 0;
                            xdaVar4 = xdaVar2;
                            obj = F;
                            charSequence3 = charSequence;
                            if (((Boolean) obj).booleanValue()) {
                                i2 = i3;
                                xdaVar3 = xdaVar4;
                                if (!evu0.J(xdaVar3.f) && trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) {
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = xdaVar3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = wn70Var3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = trackingCardElementHorizontalPlacement;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = hVar;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 4;
                                    obj = hVar.a(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                    break;
                                } else {
                                    xdaVar4 = xdaVar3;
                                    i3 = i2;
                                    nm70Var = null;
                                    if (evu0.J(xdaVar4.f)) {
                                    }
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                                    z = false;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                                    f = 0.0f;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                                    q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                    if (q != coroutineSingletons) {
                                    }
                                }
                            } else {
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = xdaVar4;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = wn70Var3;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = trackingCardElementHorizontalPlacement;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = hVar;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = eVar;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i3;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 3;
                                obj = yVar.d(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                if (obj != coroutineSingletons) {
                                    eVar2 = eVar;
                                    s = eVar2.s((String) obj);
                                    if (s != null) {
                                        nm70Var = new lm70(s);
                                        if (evu0.J(xdaVar4.f)) {
                                            s2 = eVar.s(xdaVar4.c);
                                            if (s2 != null) {
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = xdaVar4;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = wn70Var3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = s2;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = charSequence2;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = nm70Var;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 5;
                                                obj = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                                if (obj != coroutineSingletons) {
                                                    i4 = i;
                                                    i5 = i3;
                                                    wn70Var4 = wn70Var3;
                                                    xdaVar5 = xdaVar4;
                                                    fn70Var = !((Boolean) obj).booleanValue() ? new an70(Collections.singletonList(wm70.a(s2)), E(xdaVar5.f.toString(), null, wn70Var4), ym70.e) : new cn70(xdaVar5.f, s2);
                                                }
                                            }
                                            i4 = i;
                                            i5 = i3;
                                            fn70Var = null;
                                        } else {
                                            if (trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Trail) {
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 6;
                                                obj = hVar.a(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                                if (obj != coroutineSingletons) {
                                                    i4 = i;
                                                    i5 = i3;
                                                    fn70Var = (fn70) obj;
                                                }
                                            }
                                            i4 = i;
                                            i5 = i3;
                                            fn70Var = null;
                                        }
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                                        z = false;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                                        f = 0.0f;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                                        q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                        if (q != coroutineSingletons) {
                                            i6 = 0;
                                            fn70Var2 = fn70Var;
                                            obj = q;
                                            i7 = i5;
                                            nm70Var2 = nm70Var;
                                            charSequence4 = charSequence2;
                                            charSequence5 = charSequence3;
                                            i8 = 0;
                                            if (((Boolean) obj).booleanValue()) {
                                                f = 16.0f;
                                            }
                                            return new hn70(charSequence5, null, null, null, null, i7 == 0 ? true : z, null, charSequence4, null, nm70Var2, fn70Var2, i8 == 0 ? true : z, i6, new Float(f), false, 0L, 0L, null, 2028286);
                                        }
                                    }
                                    nm70Var = null;
                                    if (evu0.J(xdaVar4.f)) {
                                    }
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                                    z = false;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                                    f = 0.0f;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                                    q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                                    if (q != coroutineSingletons) {
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1;
                        i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0;
                        CharSequence charSequence6 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5;
                        charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4;
                        h hVar3 = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3;
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement3 = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2;
                        wn70 wn70Var5 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1;
                        xda xdaVar7 = (xda) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0;
                        kotlin.b.b(obj);
                        wn70Var3 = wn70Var5;
                        hVar = hVar3;
                        charSequence2 = charSequence6;
                        xdaVar4 = xdaVar7;
                        trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement3;
                        charSequence3 = charSequence;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1;
                        i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0;
                        eVar2 = (e) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6;
                        charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5;
                        charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4;
                        hVar = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3;
                        trackingCardElementHorizontalPlacement = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2;
                        wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1;
                        xdaVar4 = (xda) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0;
                        kotlin.b.b(obj);
                        s = eVar2.s((String) obj);
                        if (s != null) {
                        }
                        nm70Var = null;
                        if (evu0.J(xdaVar4.f)) {
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                        z = false;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                        f = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                        q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                        if (q != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1;
                        i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0;
                        charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5;
                        charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4;
                        hVar = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3;
                        trackingCardElementHorizontalPlacement = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2;
                        wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1;
                        xdaVar3 = (xda) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0;
                        kotlin.b.b(obj);
                        xdaVar4 = xdaVar3;
                        i3 = i2;
                        nm70Var = (lm70) obj;
                        if (evu0.J(xdaVar4.f)) {
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                        z = false;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                        f = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                        q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                        if (q != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1;
                        i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0;
                        nm70Var = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7;
                        charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6;
                        charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5;
                        s2 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4;
                        wn70Var4 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1;
                        xdaVar5 = (xda) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                        z = false;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                        f = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                        q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                        if (q != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1;
                        i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0;
                        nm70Var = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6;
                        charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5;
                        charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4;
                        kotlin.b.b(obj);
                        fn70Var = (fn70) obj;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4 = charSequence3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6 = nm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7 = fn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0 = i5;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$1 = i4;
                        z = false;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2 = 0;
                        f = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.F$0 = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$3 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label = 7;
                        q = yVar.q(superappTrackingCardUiStateInteractor$getCardHeaderUiState$14);
                        if (q != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                        int i10 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$4;
                        i8 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$2;
                        i7 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.I$0;
                        fn70 fn70Var3 = (fn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$7;
                        nm70 nm70Var3 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$6;
                        CharSequence charSequence7 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$5;
                        CharSequence charSequence8 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.L$4;
                        kotlin.b.b(obj);
                        i6 = i10;
                        fn70Var2 = fn70Var3;
                        nm70Var2 = nm70Var3;
                        charSequence4 = charSequence7;
                        charSequence5 = charSequence8;
                        z = false;
                        f = 0.0f;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return new hn70(charSequence5, null, null, null, null, i7 == 0 ? true : z, null, charSequence4, null, nm70Var2, fn70Var2, i8 == 0 ? true : z, i6, new Float(f), false, 0L, 0L, null, 2028286);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$14 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$14(eVar, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (superappTrackingCardUiStateInteractor$getCardHeaderUiState$14.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e eVar, jem jemVar, wn70 wn70Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$7 superappTrackingCardUiStateInteractor$getCardHeaderUiState$7;
        CoroutineSingletons coroutineSingletons;
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        jem jemVar2;
        wn70 wn70Var2;
        int i2;
        int i3;
        Object s;
        int i4;
        nm70 nm70Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str2;
        nm70 nm70Var2;
        CharSequence charSequence5;
        fn70 fn70Var;
        List list;
        nm70 nm70Var3;
        CharSequence charSequence6;
        zuc0 zuc0Var;
        y yVar = eVar.k;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$7) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$7 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$7) continuationImpl;
            int i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label = i5 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = jemVar.h;
                    charSequence = jemVar.d;
                    charSequence2 = jemVar.e;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$0 = jemVar;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$1 = wn70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$2 = str3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3 = charSequence;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4 = charSequence2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0 = 0;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$1 = 0;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label = 1;
                    Object n = yVar.n(superappTrackingCardUiStateInteractor$getCardHeaderUiState$7);
                    if (n != coroutineSingletons) {
                        str = str3;
                        obj = n;
                        jemVar2 = jemVar;
                        wn70Var2 = wn70Var;
                        i2 = 0;
                        i3 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0;
                        zuc0Var = (zuc0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$7;
                        list = (List) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$6;
                        nm70Var3 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$5;
                        charSequence6 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4;
                        charSequence4 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3;
                        kotlin.b.b(obj);
                        fn70Var = new an70(list, zuc0Var, !((Boolean) obj).booleanValue() ? ym70.h : ym70.f);
                        nm70Var2 = nm70Var3;
                        charSequence5 = charSequence6;
                        return new hn70(charSequence4, null, null, null, null, i4 != 0, null, charSequence5, null, nm70Var2, fn70Var, false, 0, null, false, 0L, 0L, null, 2093822);
                    }
                    int i6 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$1;
                    int i7 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0;
                    nm70Var = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$5;
                    charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4;
                    CharSequence charSequence7 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3;
                    String str4 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$2;
                    wn70 wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$1;
                    jem jemVar3 = (jem) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$0;
                    kotlin.b.b(obj);
                    i2 = i6;
                    i4 = i7;
                    str2 = str4;
                    wn70Var2 = wn70Var3;
                    jemVar2 = jemVar3;
                    charSequence4 = charSequence7;
                    if (((Boolean) obj).booleanValue()) {
                        avc0 b = in91.b();
                        b.b(jemVar2.f);
                        fn70 sm70Var = new sm70(b.a(), null, str2, new Integer(jemVar2.i), null, pm70.c, 50);
                        nm70Var2 = nm70Var;
                        charSequence5 = charSequence3;
                        fn70Var = sm70Var;
                        return new hn70(charSequence4, null, null, null, null, i4 != 0, null, charSequence5, null, nm70Var2, fn70Var, false, 0, null, false, 0L, 0L, null, 2093822);
                    }
                    if (str2 == null) {
                        str2 = null;
                    }
                    List A = j73.A(new xm70[]{str2 != null ? wm70.a(str2) : null, vm70.a(jemVar2.i)});
                    zuc0 C = C(jemVar2.f, wn70Var2);
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$0 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$1 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$2 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3 = charSequence4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4 = charSequence3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$5 = nm70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$6 = A;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$7 = C;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0 = i4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$1 = i2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label = 3;
                    Object t = yVar.t(superappTrackingCardUiStateInteractor$getCardHeaderUiState$7);
                    if (t != coroutineSingletons) {
                        list = A;
                        nm70Var3 = nm70Var;
                        charSequence6 = charSequence3;
                        obj = t;
                        zuc0Var = C;
                        fn70Var = new an70(list, zuc0Var, !((Boolean) obj).booleanValue() ? ym70.h : ym70.f);
                        nm70Var2 = nm70Var3;
                        charSequence5 = charSequence6;
                        return new hn70(charSequence4, null, null, null, null, i4 != 0, null, charSequence5, null, nm70Var2, fn70Var, false, 0, null, false, 0L, 0L, null, 2093822);
                    }
                    return coroutineSingletons;
                }
                i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$1;
                i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0;
                charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4;
                charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3;
                str = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$2;
                wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$1;
                jemVar2 = (jem) superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$0;
                kotlin.b.b(obj);
                String s2 = eVar.s((String) obj);
                lm70 lm70Var = s2 == null ? new lm70(s2) : null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$0 = jemVar2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$1 = wn70Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$2 = str;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3 = charSequence;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4 = charSequence2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$5 = lm70Var;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0 = i3;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$1 = i2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label = 2;
                s = yVar.s(superappTrackingCardUiStateInteractor$getCardHeaderUiState$7);
                if (s != coroutineSingletons) {
                    lm70 lm70Var2 = lm70Var;
                    obj = s;
                    i4 = i3;
                    nm70Var = lm70Var2;
                    CharSequence charSequence8 = charSequence;
                    charSequence3 = charSequence2;
                    charSequence4 = charSequence8;
                    str2 = str;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$7(eVar, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label;
        if (i != 0) {
        }
        String s22 = eVar.s((String) obj2);
        if (s22 == null) {
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$0 = jemVar2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$1 = wn70Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$2 = str;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$3 = charSequence;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$4 = charSequence2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.L$5 = lm70Var;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$0 = i3;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.I$1 = i2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$7.label = 2;
        s = yVar.s(superappTrackingCardUiStateInteractor$getCardHeaderUiState$7);
        if (s != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [dn70] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(e eVar, d3p d3pVar, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$6 superappTrackingCardUiStateInteractor$getCardHeaderUiState$6;
        int i;
        nm70 nm70Var;
        boolean z2;
        wn70 wn70Var2;
        nm70 nm70Var2;
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement;
        fn70 fn70Var;
        Object t;
        d3p d3pVar2;
        boolean z3;
        m301 m301Var;
        Object obj;
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement2;
        nm70 nm70Var3;
        d3p d3pVar3;
        nm70 nm70Var4;
        p301 p301Var;
        d3p d3pVar4 = d3pVar;
        eVar.getClass();
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$6) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$6 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$6) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label;
                nm70 nm70Var5 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = d3pVar4.g;
                    if (str != null) {
                        nm70Var = new lm70(str, new Integer(12));
                    } else {
                        Integer num = new Integer(d3pVar4.c.getLogoId());
                        if (num.intValue() == 0) {
                            num = null;
                        }
                        nm70Var = num != null ? new hm70(num.intValue()) : null;
                    }
                    y yVar = eVar.k;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$0 = d3pVar4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$1 = wn70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$2 = nm70Var;
                    z2 = z;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label = 1;
                    obj2 = yVar.o(superappTrackingCardUiStateInteractor$getCardHeaderUiState$6);
                    if (obj2 != coroutineSingletons) {
                        wn70Var2 = wn70Var;
                        nm70Var2 = nm70Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        trackingCardElementHorizontalPlacement2 = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$3;
                        nm70Var3 = (km70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$2;
                        d3pVar3 = (d3p) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$0;
                        kotlin.b.b(obj2);
                        dn70 dn70Var = (dn70) obj2;
                        obj = dn70Var != null ? dn70Var.b() : null;
                        p301Var = (p301) obj;
                        if (p301Var == null) {
                            fn70Var = dn70.a(p301Var);
                            trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement2;
                            nm70Var2 = nm70Var3;
                            d3pVar4 = d3pVar3;
                        } else {
                            trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement2;
                            nm70Var2 = nm70Var3;
                            d3pVar4 = d3pVar3;
                            fn70Var = null;
                        }
                        String str2 = d3pVar4.d;
                        String str3 = d3pVar4.e;
                        if (trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) {
                            String str4 = d3pVar4.g;
                            String str5 = d3pVar4.h;
                            if (str4 == null || str5 == null) {
                                nm70Var4 = nm70Var2;
                                return new hn70(str2, null, null, null, null, false, null, str3, null, nm70Var4, fn70Var, fn70Var instanceof om70, 0, null, false, 0L, 0L, null, 2073342);
                            }
                            nm70Var5 = new mm70(str4, str5);
                        }
                        nm70Var4 = nm70Var5;
                        return new hn70(str2, null, null, null, null, false, null, str3, null, nm70Var4, fn70Var, fn70Var instanceof om70, 0, null, false, 0L, 0L, null, 2073342);
                    }
                    z3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.Z$0;
                    TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement3 = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$3;
                    nm70 nm70Var6 = (km70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$2;
                    wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$1;
                    d3pVar2 = (d3p) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$0;
                    kotlin.b.b(obj2);
                    t = obj2;
                    trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement3;
                    nm70Var2 = nm70Var6;
                    m301Var = (m301) t;
                    if (m301Var == null) {
                        m301Var = null;
                    }
                    if (m301Var == null) {
                        d3pVar4 = d3pVar2;
                        fn70Var = om70.a(m301Var);
                        String str22 = d3pVar4.d;
                        String str32 = d3pVar4.e;
                        if (trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) {
                        }
                        nm70Var4 = nm70Var5;
                        return new hn70(str22, null, null, null, null, false, null, str32, null, nm70Var4, fn70Var, fn70Var instanceof om70, 0, null, false, 0L, 0L, null, 2073342);
                    }
                    a3p a3pVar = d3pVar2.i;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$0 = d3pVar2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$1 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$2 = nm70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$3 = trackingCardElementHorizontalPlacement;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.Z$0 = z3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label = 3;
                    Object x = eVar.x(a3pVar, wn70Var2, z3, superappTrackingCardUiStateInteractor$getCardHeaderUiState$6);
                    if (x != coroutineSingletons) {
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement4 = trackingCardElementHorizontalPlacement;
                        obj = x;
                        trackingCardElementHorizontalPlacement2 = trackingCardElementHorizontalPlacement4;
                        nm70Var3 = nm70Var2;
                        d3pVar3 = d3pVar2;
                        p301Var = (p301) obj;
                        if (p301Var == null) {
                        }
                        String str222 = d3pVar4.d;
                        String str322 = d3pVar4.e;
                        if (trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) {
                        }
                        nm70Var4 = nm70Var5;
                        return new hn70(str222, null, null, null, null, false, null, str322, null, nm70Var4, fn70Var, fn70Var instanceof om70, 0, null, false, 0L, 0L, null, 2073342);
                    }
                    return coroutineSingletons;
                }
                boolean z4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.Z$0;
                nm70 nm70Var7 = (km70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$2;
                wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$1;
                d3p d3pVar5 = (d3p) superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$0;
                kotlin.b.b(obj2);
                z2 = z4;
                d3pVar4 = d3pVar5;
                nm70Var2 = nm70Var7;
                trackingCardElementHorizontalPlacement = (TrackingCardElementHorizontalPlacement) obj2;
                fn70Var = trackingCardElementHorizontalPlacement != TrackingCardElementHorizontalPlacement.Trail ? nm70Var2 : null;
                if (fn70Var == null) {
                    z2p z2pVar = d3pVar4.j;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$0 = d3pVar4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$2 = nm70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.L$3 = trackingCardElementHorizontalPlacement;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label = 2;
                    t = eVar.t(z2pVar, wn70Var2, z2, superappTrackingCardUiStateInteractor$getCardHeaderUiState$6);
                    if (t != coroutineSingletons) {
                        d3pVar2 = d3pVar4;
                        z3 = z2;
                        nm70Var2 = nm70Var2;
                        m301Var = (m301) t;
                        if (m301Var == null) {
                        }
                        if (m301Var == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                String str2222 = d3pVar4.d;
                String str3222 = d3pVar4.e;
                if (trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) {
                }
                nm70Var4 = nm70Var5;
                return new hn70(str2222, null, null, null, null, false, null, str3222, null, nm70Var4, fn70Var, fn70Var instanceof om70, 0, null, false, 0L, 0L, null, 2073342);
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$6 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$6(eVar, continuationImpl);
        Object obj22 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$6.label;
        nm70 nm70Var52 = null;
        if (i != 0) {
        }
        trackingCardElementHorizontalPlacement = (TrackingCardElementHorizontalPlacement) obj22;
        if (trackingCardElementHorizontalPlacement != TrackingCardElementHorizontalPlacement.Trail) {
        }
        if (fn70Var == null) {
        }
        String str22222 = d3pVar4.d;
        String str32222 = d3pVar4.e;
        if (trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) {
        }
        nm70Var4 = nm70Var52;
        return new hn70(str22222, null, null, null, null, false, null, str32222, null, nm70Var4, fn70Var, fn70Var instanceof om70, 0, null, false, 0L, 0L, null, 2073342);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0798 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v35, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v40, types: [nm70] */
    /* JADX WARN: Type inference failed for: r3v43, types: [nm70] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v64, types: [nm70] */
    /* JADX WARN: Type inference failed for: r8v30, types: [nm70] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(e eVar, vpr vprVar, bjz bjzVar, wn70 wn70Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$25 superappTrackingCardUiStateInteractor$getCardHeaderUiState$25;
        int i;
        qiz qizVar;
        String str;
        wn70 wn70Var2;
        bjz bjzVar2;
        vpr vprVar2;
        h hVar;
        String h;
        y yVar;
        int i2;
        oiz oizVar;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy;
        int i3;
        Integer num;
        Integer num2;
        CoroutineSingletons coroutineSingletons;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy2;
        CoroutineSingletons coroutineSingletons2;
        String str2;
        h hVar2;
        int i4;
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement;
        String str3;
        int i5;
        String str4;
        int i6;
        String str5;
        h hVar3;
        h hVar4;
        String str6;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy3;
        int i7;
        vpr vprVar3;
        Integer num3;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy4;
        h hVar5;
        String str7;
        int i8;
        int i9;
        vpr vprVar4;
        wn70 wn70Var3;
        Integer num4;
        Integer num5;
        km70 km70Var;
        h hVar6;
        CoroutineSingletons coroutineSingletons3;
        int i10;
        qiz qizVar2;
        String str8;
        String str9;
        bjz bjzVar3;
        String str10;
        CoroutineSingletons coroutineSingletons4;
        vpr vprVar5;
        int i11;
        vpr vprVar6;
        km70 km70Var2;
        String str11;
        Integer num6;
        Integer num7;
        String str12;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy5;
        String str13;
        fn70 fn70Var;
        y yVar2;
        CoroutineSingletons coroutineSingletons5;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy6;
        String str14;
        String str15;
        int i12;
        Integer num8;
        Integer num9;
        wn70 wn70Var4;
        String str16;
        km70 km70Var3;
        int i13;
        Object obj;
        int i14;
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement2;
        km70 km70Var4;
        String str17;
        Integer num10;
        String str18;
        bjz bjzVar4;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy7;
        int i15;
        vpr vprVar7;
        int i16;
        km70 km70Var5;
        Integer num11;
        String str19;
        vpr vprVar8;
        String str20;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy8;
        vpr vprVar9;
        int i17;
        int i18;
        String str21;
        wn70 wn70Var5;
        String str22;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy9;
        km70 km70Var6;
        String str23;
        Integer num12;
        Integer num13;
        e eVar2;
        e eVar3 = eVar;
        y yVar3 = eVar3.k;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$25) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$25 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$25) continuationImpl;
            int i19 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$25.label;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$25.label = i19 - Integer.MIN_VALUE;
                SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$25 superappTrackingCardUiStateInteractor$getCardHeaderUiState$252 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$25;
                Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.result;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label;
                oiz oizVar2 = oiz.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        qiz qizVar3 = bjzVar.g;
                        ajz ajzVar = bjzVar.k;
                        String a = ajzVar != null ? ajzVar.a() : null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = wn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = qizVar3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = a;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 1;
                        Object j = yVar3.j(superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                        if (j != coroutineSingletons6) {
                            qizVar = qizVar3;
                            str = a;
                            wn70Var2 = wn70Var;
                            obj2 = j;
                            bjzVar2 = bjzVar;
                            vprVar2 = vprVar;
                            TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement3 = (TrackingCardElementHorizontalPlacement) obj2;
                            h hVar7 = new h(new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1(eVar3, null));
                            hVar = new h(new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1(hVar7, null));
                            h = ((avj0) eVar3.d).h(kyh0.delivery);
                            String str24 = bjzVar2.e;
                            LogisticsOrderTracking$Status logisticsOrderTracking$Status = bjzVar2.h;
                            int[] iArr = fhw0.c;
                            yVar = yVar3;
                            i2 = iArr[logisticsOrderTracking$Status.ordinal()];
                            oizVar = oizVar2;
                            if (i2 != 1) {
                                spannableTextStrategy = SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_DENSITY;
                            } else {
                                if (i2 != 2 && i2 != 3 && i2 != 4) {
                                    w511.b();
                                    return null;
                                }
                                spannableTextStrategy = SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE;
                            }
                            i3 = iArr[logisticsOrderTracking$Status.ordinal()];
                            SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy10 = spannableTextStrategy;
                            if (i3 != 1) {
                                num = null;
                            } else {
                                if (i3 != 2 && i3 != 3 && i3 != 4) {
                                    w511.b();
                                    return null;
                                }
                                num = new Integer(f1h0.ic_chevron_next_circle);
                            }
                            int i20 = (logisticsOrderTracking$Status == LogisticsOrderTracking$Status.Stub && bjzVar2.i == null) ? 0 : 1;
                            num2 = new Integer(qje.t(xng0.bgMain, eVar3.a));
                            String str25 = bjzVar2.f;
                            if (qizVar != null) {
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = wn70Var2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = qizVar;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = str;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = trackingCardElementHorizontalPlacement3;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = hVar7;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = hVar;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = h;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str24;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy10;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str25;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i20;
                                int i21 = i20;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = 0;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 2;
                                Object a2 = hVar7.a(superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                coroutineSingletons = coroutineSingletons6;
                                if (a2 != coroutineSingletons) {
                                    trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement3;
                                    vprVar3 = vprVar2;
                                    num3 = num;
                                    spannableTextStrategy4 = spannableTextStrategy10;
                                    hVar3 = hVar7;
                                    obj2 = a2;
                                    hVar5 = hVar;
                                    str6 = str25;
                                    str7 = str24;
                                    i8 = i21;
                                    i9 = 0;
                                    CoroutineSingletons coroutineSingletons7 = coroutineSingletons;
                                    vprVar4 = vprVar3;
                                    i5 = i9;
                                    wn70Var3 = wn70Var2;
                                    num4 = num3;
                                    num5 = num2;
                                    km70Var = (km70) obj2;
                                    hVar6 = hVar5;
                                    coroutineSingletons3 = coroutineSingletons7;
                                    SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy11 = spannableTextStrategy4;
                                    i10 = i8;
                                    qizVar2 = qizVar;
                                    str8 = h;
                                    str4 = str7;
                                    spannableTextStrategy3 = spannableTextStrategy11;
                                    str9 = str;
                                    bjzVar3 = bjzVar2;
                                    str10 = str6;
                                    if (jl40.l(qizVar2, oizVar) || trackingCardElementHorizontalPlacement != TrackingCardElementHorizontalPlacement.Trail) {
                                        coroutineSingletons4 = coroutineSingletons3;
                                        if ((qizVar2 instanceof piz) || trackingCardElementHorizontalPlacement != (trackingCardElementHorizontalPlacement2 = TrackingCardElementHorizontalPlacement.Trail)) {
                                            eVar3 = eVar;
                                            int i22 = i10;
                                            vprVar5 = vprVar4;
                                            if (str9 == null) {
                                                int i23 = lzg0.ic_delivery_car;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar5;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = wn70Var3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                                String str26 = str9;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = str26;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = str8;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str4;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy3;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num4;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num5;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str10;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = km70Var;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i23;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = i22;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$2 = i5;
                                                int i24 = i5;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 7;
                                                y yVar4 = yVar;
                                                Object r = yVar4.r(superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                                if (r == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                yVar2 = yVar4;
                                                coroutineSingletons5 = coroutineSingletons4;
                                                spannableTextStrategy6 = spannableTextStrategy3;
                                                str14 = str4;
                                                str15 = str26;
                                                i12 = i22;
                                                num8 = num5;
                                                num9 = num4;
                                                wn70Var4 = wn70Var3;
                                                str16 = str10;
                                                km70Var3 = km70Var;
                                                i13 = i23;
                                                obj = r;
                                                i14 = i24;
                                                if (((Boolean) obj).booleanValue()) {
                                                    avc0 b = in91.b();
                                                    b.b(str15);
                                                    b.c(Collections.singletonList(CarPlateAppearanceExperiment.CarPlateUsage.ORDER_LIST_ITEM));
                                                    str13 = str14;
                                                    num7 = num9;
                                                    spannableTextStrategy5 = spannableTextStrategy6;
                                                    coroutineSingletons4 = coroutineSingletons5;
                                                    km70Var2 = km70Var3;
                                                    str11 = str16;
                                                    str12 = str8;
                                                    num6 = num8;
                                                    vprVar6 = vprVar5;
                                                    fn70Var = new sm70(b.a(), null, null, new Integer(lzg0.ic_delivery_car), null, null, HProv.PP_INFO);
                                                    i11 = i12;
                                                    hn70 hn70Var = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                                                    gei geiVar = eVar3.j;
                                                    String str27 = bjzVar3.b;
                                                    String str28 = bjzVar3.e;
                                                    yiz yizVar = bjzVar3.i;
                                                    g X = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar.a.e(), str27), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar, str28, yizVar == null ? yizVar.a() : null, str27));
                                                    geiVar.b.getClass();
                                                    tpr F = kotlinx.coroutines.flow.e.F(X, uyj.a);
                                                    ghw0 ghw0Var = new ghw0(vprVar6, hn70Var);
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                                                    Object collect = F.collect(ghw0Var, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                                    if (collect != coroutineSingletons4) {
                                                    }
                                                } else {
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar5;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar3;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = wn70Var4;
                                                    vprVar9 = vprVar5;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = str15;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = str8;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str14;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy6;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num9;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num8;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str16;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = km70Var3;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = eVar3;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i13;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = i12;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$2 = i14;
                                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 8;
                                                    obj2 = yVar2.k(superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                                    coroutineSingletons6 = coroutineSingletons5;
                                                    if (obj2 != coroutineSingletons6) {
                                                        str13 = str14;
                                                        i17 = i12;
                                                        i18 = i13;
                                                        str21 = str16;
                                                        wn70Var5 = wn70Var4;
                                                        str22 = str15;
                                                        spannableTextStrategy9 = spannableTextStrategy6;
                                                        km70Var6 = km70Var3;
                                                        str23 = str8;
                                                        num12 = num8;
                                                        num13 = num9;
                                                        eVar2 = eVar3;
                                                        String s = eVar2.s((String) obj2);
                                                        fn70Var = s == null ? new an70(Collections.singletonList(wm70.a(s)), C(str22, wn70Var5), ym70.h) : new an70(Collections.singletonList(vm70.a(i18)), C(str22, wn70Var5), ym70.f);
                                                        km70Var2 = km70Var6;
                                                        coroutineSingletons4 = coroutineSingletons6;
                                                        str11 = str21;
                                                        str12 = str23;
                                                        num6 = num12;
                                                        num7 = num13;
                                                        spannableTextStrategy5 = spannableTextStrategy9;
                                                        vprVar6 = vprVar9;
                                                        i11 = i17;
                                                        hn70 hn70Var2 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                                                        gei geiVar2 = eVar3.j;
                                                        String str272 = bjzVar3.b;
                                                        String str282 = bjzVar3.e;
                                                        yiz yizVar2 = bjzVar3.i;
                                                        g X2 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar2.a.e(), str272), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar2, str282, yizVar2 == null ? yizVar2.a() : null, str272));
                                                        geiVar2.b.getClass();
                                                        tpr F2 = kotlinx.coroutines.flow.e.F(X2, uyj.a);
                                                        ghw0 ghw0Var2 = new ghw0(vprVar6, hn70Var2);
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                                                        Object collect2 = F2.collect(ghw0Var2, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                                        return collect2 != coroutineSingletons4 ? coroutineSingletons4 : collect2;
                                                    }
                                                }
                                            } else {
                                                i11 = i22;
                                                vprVar6 = vprVar5;
                                                km70Var2 = km70Var;
                                                str11 = str10;
                                                num6 = num5;
                                                num7 = num4;
                                                str12 = str8;
                                                spannableTextStrategy5 = spannableTextStrategy3;
                                                str13 = str4;
                                                fn70Var = null;
                                                hn70 hn70Var22 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                                                gei geiVar22 = eVar3.j;
                                                String str2722 = bjzVar3.b;
                                                String str2822 = bjzVar3.e;
                                                yiz yizVar22 = bjzVar3.i;
                                                g X22 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar22.a.e(), str2722), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar22, str2822, yizVar22 == null ? yizVar22.a() : null, str2722));
                                                geiVar22.b.getClass();
                                                tpr F22 = kotlinx.coroutines.flow.e.F(X22, uyj.a);
                                                ghw0 ghw0Var22 = new ghw0(vprVar6, hn70Var22);
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                                                Object collect22 = F22.collect(ghw0Var22, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                                if (collect22 != coroutineSingletons4) {
                                                }
                                            }
                                        } else {
                                            String a3 = ((piz) qizVar2).a();
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar4;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar3;
                                            TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement4 = trackingCardElementHorizontalPlacement;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = str8;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str4;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy3;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num4;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num5;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str10;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = km70Var;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i10;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = i5;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 6;
                                            eVar3 = eVar;
                                            int i25 = i10;
                                            vpr vprVar10 = vprVar4;
                                            obj2 = v(trackingCardElementHorizontalPlacement4, eVar3, hVar3, a3, trackingCardElementHorizontalPlacement2, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                            if (obj2 == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            km70Var4 = km70Var;
                                            str17 = str10;
                                            num10 = num4;
                                            str18 = str8;
                                            bjzVar4 = bjzVar3;
                                            spannableTextStrategy7 = spannableTextStrategy3;
                                            i15 = i25;
                                            vprVar7 = vprVar10;
                                            i11 = i15;
                                            fn70Var = (fn70) obj2;
                                            km70Var2 = km70Var4;
                                            str11 = str17;
                                            num7 = num10;
                                            spannableTextStrategy5 = spannableTextStrategy7;
                                            num6 = num5;
                                            str12 = str18;
                                            vprVar6 = vprVar7;
                                            str13 = str4;
                                            bjzVar3 = bjzVar4;
                                            hn70 hn70Var222 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                                            gei geiVar222 = eVar3.j;
                                            String str27222 = bjzVar3.b;
                                            String str28222 = bjzVar3.e;
                                            yiz yizVar222 = bjzVar3.i;
                                            g X222 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar222.a.e(), str27222), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar222, str28222, yizVar222 == null ? yizVar222.a() : null, str27222));
                                            geiVar222.b.getClass();
                                            tpr F222 = kotlinx.coroutines.flow.e.F(X222, uyj.a);
                                            ghw0 ghw0Var222 = new ghw0(vprVar6, hn70Var222);
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                                            Object collect222 = F222.collect(ghw0Var222, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                            if (collect222 != coroutineSingletons4) {
                                            }
                                        }
                                    } else {
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar4;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar3;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = str8;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str4;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy3;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num4;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num5;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str10;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = km70Var;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i10;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = i5;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 5;
                                        obj2 = hVar6.a(superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                        coroutineSingletons4 = coroutineSingletons3;
                                        if (obj2 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        i16 = i10;
                                        km70Var5 = km70Var;
                                        num11 = num4;
                                        str19 = str8;
                                        bjzVar4 = bjzVar3;
                                        vprVar8 = vprVar4;
                                        str20 = str10;
                                        spannableTextStrategy8 = spannableTextStrategy3;
                                        i11 = i16;
                                        fn70Var = (fn70) obj2;
                                        km70Var2 = km70Var5;
                                        str11 = str20;
                                        num7 = num11;
                                        spannableTextStrategy5 = spannableTextStrategy8;
                                        num6 = num5;
                                        str12 = str19;
                                        vprVar6 = vprVar8;
                                        str13 = str4;
                                        eVar3 = eVar;
                                        bjzVar3 = bjzVar4;
                                        hn70 hn70Var2222 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                                        gei geiVar2222 = eVar3.j;
                                        String str272222 = bjzVar3.b;
                                        String str282222 = bjzVar3.e;
                                        yiz yizVar2222 = bjzVar3.i;
                                        g X2222 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar2222.a.e(), str272222), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar2222, str282222, yizVar2222 == null ? yizVar2222.a() : null, str272222));
                                        geiVar2222.b.getClass();
                                        tpr F2222 = kotlinx.coroutines.flow.e.F(X2222, uyj.a);
                                        ghw0 ghw0Var2222 = new ghw0(vprVar6, hn70Var2222);
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                                        Object collect2222 = F2222.collect(ghw0Var2222, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                        if (collect2222 != coroutineSingletons4) {
                                        }
                                    }
                                }
                            } else {
                                coroutineSingletons = coroutineSingletons6;
                                int i26 = i20;
                                if (qizVar.equals(oizVar)) {
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = wn70Var2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = qizVar;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = str;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = trackingCardElementHorizontalPlacement3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = hVar7;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = hVar;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = h;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str24;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy10;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num2;
                                    oizVar = oizVar;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str25;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i26;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = 0;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 3;
                                    Object a4 = hVar.a(superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                    if (a4 != coroutineSingletons) {
                                        str4 = str24;
                                        i6 = i26;
                                        str5 = h;
                                        hVar3 = hVar7;
                                        obj2 = a4;
                                        hVar4 = hVar;
                                        str6 = str25;
                                        spannableTextStrategy3 = spannableTextStrategy10;
                                        trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement3;
                                        i7 = 0;
                                        int i27 = i7;
                                        if (trackingCardElementHorizontalPlacement != TrackingCardElementHorizontalPlacement.Lead) {
                                            obj2 = null;
                                        }
                                        Integer num14 = num2;
                                        km70Var = (km70) obj2;
                                        hVar6 = hVar4;
                                        coroutineSingletons3 = coroutineSingletons;
                                        vprVar4 = vprVar2;
                                        num5 = num14;
                                        Integer num15 = num;
                                        i10 = i6;
                                        qizVar2 = qizVar;
                                        str8 = str5;
                                        wn70Var3 = wn70Var2;
                                        num4 = num15;
                                        i5 = i27;
                                        str9 = str;
                                        bjzVar3 = bjzVar2;
                                        str10 = str6;
                                        if (jl40.l(qizVar2, oizVar)) {
                                        }
                                        coroutineSingletons4 = coroutineSingletons3;
                                        if (qizVar2 instanceof piz) {
                                        }
                                        eVar3 = eVar;
                                        int i222 = i10;
                                        vprVar5 = vprVar4;
                                        if (str9 == null) {
                                        }
                                    }
                                } else {
                                    oizVar = oizVar;
                                    if (!(qizVar instanceof piz)) {
                                        w511.b();
                                        return null;
                                    }
                                    String a5 = ((piz) qizVar).a();
                                    TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement5 = TrackingCardElementHorizontalPlacement.Lead;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = vprVar2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = bjzVar2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = wn70Var2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = qizVar;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = str;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = trackingCardElementHorizontalPlacement3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = hVar7;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = hVar;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = h;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = str24;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = spannableTextStrategy10;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = num;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = num2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = str25;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0 = i26;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1 = 0;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 4;
                                    spannableTextStrategy2 = spannableTextStrategy10;
                                    coroutineSingletons2 = coroutineSingletons;
                                    str2 = str24;
                                    Object v = v(trackingCardElementHorizontalPlacement3, eVar, hVar7, a5, trackingCardElementHorizontalPlacement5, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                                    if (v == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    hVar2 = hVar7;
                                    obj2 = v;
                                    i4 = i26;
                                    trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement3;
                                    str3 = str25;
                                    i5 = 0;
                                    str9 = str;
                                    bjzVar3 = bjzVar2;
                                    str10 = str3;
                                    vprVar4 = vprVar2;
                                    num5 = num2;
                                    km70Var = (km70) obj2;
                                    hVar6 = hVar;
                                    spannableTextStrategy3 = spannableTextStrategy2;
                                    hVar3 = hVar2;
                                    wn70Var3 = wn70Var2;
                                    num4 = num;
                                    i10 = i4;
                                    qizVar2 = qizVar;
                                    str8 = h;
                                    str4 = str2;
                                    coroutineSingletons3 = coroutineSingletons2;
                                    if (jl40.l(qizVar2, oizVar)) {
                                    }
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (qizVar2 instanceof piz) {
                                    }
                                    eVar3 = eVar;
                                    int i2222 = i10;
                                    vprVar5 = vprVar4;
                                    if (str9 == null) {
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        return coroutineSingletons6;
                    case 1:
                        String str29 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4;
                        qiz qizVar4 = (qiz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3;
                        wn70 wn70Var6 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2;
                        bjzVar2 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vprVar2 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        str = str29;
                        qizVar = qizVar4;
                        wn70Var2 = wn70Var6;
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement32 = (TrackingCardElementHorizontalPlacement) obj2;
                        h hVar72 = new h(new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1(eVar3, null));
                        hVar = new h(new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1(hVar72, null));
                        h = ((avj0) eVar3.d).h(kyh0.delivery);
                        String str242 = bjzVar2.e;
                        LogisticsOrderTracking$Status logisticsOrderTracking$Status2 = bjzVar2.h;
                        int[] iArr2 = fhw0.c;
                        yVar = yVar3;
                        i2 = iArr2[logisticsOrderTracking$Status2.ordinal()];
                        oizVar = oizVar2;
                        if (i2 != 1) {
                        }
                        i3 = iArr2[logisticsOrderTracking$Status2.ordinal()];
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy102 = spannableTextStrategy;
                        if (i3 != 1) {
                        }
                        if (logisticsOrderTracking$Status2 == LogisticsOrderTracking$Status.Stub) {
                            break;
                        }
                        num2 = new Integer(qje.t(xng0.bgMain, eVar3.a));
                        String str252 = bjzVar2.f;
                        if (qizVar != null) {
                        }
                        return coroutineSingletons;
                    case 2:
                        int i28 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1;
                        i8 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        ?? r4 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        Integer num16 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        num3 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy12 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r12 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        String str30 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        h hVar8 = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7;
                        h hVar9 = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6;
                        i9 = i28;
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement6 = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5;
                        String str31 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4;
                        qiz qizVar5 = (qiz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3;
                        wn70 wn70Var7 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2;
                        bjz bjzVar5 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vprVar3 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        str6 = r4;
                        coroutineSingletons = coroutineSingletons6;
                        spannableTextStrategy4 = spannableTextStrategy12;
                        wn70Var2 = wn70Var7;
                        oizVar = oizVar2;
                        num2 = num16;
                        bjzVar2 = bjzVar5;
                        yVar = yVar3;
                        trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement6;
                        hVar5 = hVar8;
                        hVar3 = hVar9;
                        str7 = r12;
                        h = str30;
                        str = str31;
                        qizVar = qizVar5;
                        CoroutineSingletons coroutineSingletons72 = coroutineSingletons;
                        vprVar4 = vprVar3;
                        i5 = i9;
                        wn70Var3 = wn70Var2;
                        num4 = num3;
                        num5 = num2;
                        km70Var = (km70) obj2;
                        hVar6 = hVar5;
                        coroutineSingletons3 = coroutineSingletons72;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy112 = spannableTextStrategy4;
                        i10 = i8;
                        qizVar2 = qizVar;
                        str8 = h;
                        str4 = str7;
                        spannableTextStrategy3 = spannableTextStrategy112;
                        str9 = str;
                        bjzVar3 = bjzVar2;
                        str10 = str6;
                        if (jl40.l(qizVar2, oizVar)) {
                        }
                        coroutineSingletons4 = coroutineSingletons3;
                        if (qizVar2 instanceof piz) {
                        }
                        eVar3 = eVar;
                        int i22222 = i10;
                        vprVar5 = vprVar4;
                        if (str9 == null) {
                        }
                        break;
                    case 3:
                        int i29 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1;
                        i6 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        ?? r42 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        Integer num17 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        Integer num18 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy13 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r122 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        String str32 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        h hVar10 = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7;
                        h hVar11 = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6;
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement7 = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5;
                        String str33 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4;
                        qiz qizVar6 = (qiz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3;
                        wn70 wn70Var8 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2;
                        bjz bjzVar6 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vpr vprVar11 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement7;
                        hVar4 = hVar10;
                        hVar3 = hVar11;
                        spannableTextStrategy3 = spannableTextStrategy13;
                        str4 = r122;
                        wn70Var2 = wn70Var8;
                        qizVar = qizVar6;
                        oizVar = oizVar2;
                        num2 = num17;
                        bjzVar2 = bjzVar6;
                        yVar = yVar3;
                        str6 = r42;
                        coroutineSingletons = coroutineSingletons6;
                        num = num18;
                        vprVar2 = vprVar11;
                        i7 = i29;
                        str5 = str32;
                        str = str33;
                        int i272 = i7;
                        if (trackingCardElementHorizontalPlacement != TrackingCardElementHorizontalPlacement.Lead) {
                        }
                        Integer num142 = num2;
                        km70Var = (km70) obj2;
                        hVar6 = hVar4;
                        coroutineSingletons3 = coroutineSingletons;
                        vprVar4 = vprVar2;
                        num5 = num142;
                        Integer num152 = num;
                        i10 = i6;
                        qizVar2 = qizVar;
                        str8 = str5;
                        wn70Var3 = wn70Var2;
                        num4 = num152;
                        i5 = i272;
                        str9 = str;
                        bjzVar3 = bjzVar2;
                        str10 = str6;
                        if (jl40.l(qizVar2, oizVar)) {
                        }
                        coroutineSingletons4 = coroutineSingletons3;
                        if (qizVar2 instanceof piz) {
                        }
                        eVar3 = eVar;
                        int i222222 = i10;
                        vprVar5 = vprVar4;
                        if (str9 == null) {
                        }
                        break;
                    case 4:
                        int i30 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1;
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        ?? r43 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        Integer num19 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        Integer num20 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy14 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r123 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        String str34 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        hVar = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7;
                        h hVar12 = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6;
                        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement8 = (TrackingCardElementHorizontalPlacement) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5;
                        String str35 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4;
                        qiz qizVar7 = (qiz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3;
                        wn70 wn70Var9 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2;
                        bjz bjzVar7 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vpr vprVar12 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        trackingCardElementHorizontalPlacement = trackingCardElementHorizontalPlacement8;
                        spannableTextStrategy2 = spannableTextStrategy14;
                        str2 = r123;
                        qizVar = qizVar7;
                        wn70Var2 = wn70Var9;
                        oizVar = oizVar2;
                        num2 = num19;
                        hVar2 = hVar12;
                        bjzVar2 = bjzVar7;
                        yVar = yVar3;
                        coroutineSingletons2 = coroutineSingletons6;
                        num = num20;
                        h = str34;
                        str = str35;
                        vprVar2 = vprVar12;
                        i5 = i30;
                        str3 = r43;
                        str9 = str;
                        bjzVar3 = bjzVar2;
                        str10 = str3;
                        vprVar4 = vprVar2;
                        num5 = num2;
                        km70Var = (km70) obj2;
                        hVar6 = hVar;
                        spannableTextStrategy3 = spannableTextStrategy2;
                        hVar3 = hVar2;
                        wn70Var3 = wn70Var2;
                        num4 = num;
                        i10 = i4;
                        qizVar2 = qizVar;
                        str8 = h;
                        str4 = str2;
                        coroutineSingletons3 = coroutineSingletons2;
                        if (jl40.l(qizVar2, oizVar)) {
                        }
                        coroutineSingletons4 = coroutineSingletons3;
                        if (qizVar2 instanceof piz) {
                        }
                        eVar3 = eVar;
                        int i2222222 = i10;
                        vprVar5 = vprVar4;
                        if (str9 == null) {
                        }
                        break;
                    case 5:
                        i16 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        ?? r3 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14;
                        ?? r44 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        Integer num21 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        num11 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        spannableTextStrategy8 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r10 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        str19 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        bjzVar4 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vprVar8 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        str4 = r10;
                        num5 = num21;
                        coroutineSingletons4 = coroutineSingletons6;
                        km70Var5 = r3;
                        str20 = r44;
                        i11 = i16;
                        fn70Var = (fn70) obj2;
                        km70Var2 = km70Var5;
                        str11 = str20;
                        num7 = num11;
                        spannableTextStrategy5 = spannableTextStrategy8;
                        num6 = num5;
                        str12 = str19;
                        vprVar6 = vprVar8;
                        str13 = str4;
                        eVar3 = eVar;
                        bjzVar3 = bjzVar4;
                        hn70 hn70Var22222 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                        gei geiVar22222 = eVar3.j;
                        String str2722222 = bjzVar3.b;
                        String str2822222 = bjzVar3.e;
                        yiz yizVar22222 = bjzVar3.i;
                        g X22222 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar22222.a.e(), str2722222), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar22222, str2822222, yizVar22222 == null ? yizVar22222.a() : null, str2722222));
                        geiVar22222.b.getClass();
                        tpr F22222 = kotlinx.coroutines.flow.e.F(X22222, uyj.a);
                        ghw0 ghw0Var22222 = new ghw0(vprVar6, hn70Var22222);
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                        Object collect22222 = F22222.collect(ghw0Var22222, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                        if (collect22222 != coroutineSingletons4) {
                        }
                        break;
                    case 6:
                        i15 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        ?? r32 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14;
                        ?? r45 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        Integer num22 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        num10 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        spannableTextStrategy7 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r102 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        str18 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        bjzVar4 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vprVar7 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        str4 = r102;
                        num5 = num22;
                        coroutineSingletons4 = coroutineSingletons6;
                        km70Var4 = r32;
                        str17 = r45;
                        i11 = i15;
                        fn70Var = (fn70) obj2;
                        km70Var2 = km70Var4;
                        str11 = str17;
                        num7 = num10;
                        spannableTextStrategy5 = spannableTextStrategy7;
                        num6 = num5;
                        str12 = str18;
                        vprVar6 = vprVar7;
                        str13 = str4;
                        bjzVar3 = bjzVar4;
                        hn70 hn70Var222222 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                        gei geiVar222222 = eVar3.j;
                        String str27222222 = bjzVar3.b;
                        String str28222222 = bjzVar3.e;
                        yiz yizVar222222 = bjzVar3.i;
                        g X222222 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar222222.a.e(), str27222222), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar222222, str28222222, yizVar222222 == null ? yizVar222222.a() : null, str27222222));
                        geiVar222222.b.getClass();
                        tpr F222222 = kotlinx.coroutines.flow.e.F(X222222, uyj.a);
                        ghw0 ghw0Var222222 = new ghw0(vprVar6, hn70Var222222);
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                        Object collect222222 = F222222.collect(ghw0Var222222, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                        if (collect222222 != coroutineSingletons4) {
                        }
                        break;
                    case 7:
                        int i31 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$2;
                        i12 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1;
                        int i32 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        ?? r8 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14;
                        ?? r9 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        Integer num23 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        Integer num24 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy15 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r13 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        String str36 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        str15 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4;
                        wn70 wn70Var10 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2;
                        bjz bjzVar8 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vpr vprVar13 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        i14 = i31;
                        obj = obj2;
                        yVar2 = yVar3;
                        coroutineSingletons5 = coroutineSingletons6;
                        spannableTextStrategy6 = spannableTextStrategy15;
                        str8 = str36;
                        vprVar5 = vprVar13;
                        num8 = num23;
                        str14 = r13;
                        bjzVar3 = bjzVar8;
                        str16 = r9;
                        km70Var3 = r8;
                        i13 = i32;
                        num9 = num24;
                        wn70Var4 = wn70Var10;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 8:
                        int i33 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$1;
                        i18 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.I$0;
                        eVar2 = (e) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15;
                        ?? r6 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14;
                        ?? r82 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13;
                        num12 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12;
                        Integer num25 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy16 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10;
                        ?? r15 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9;
                        str23 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8;
                        str22 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4;
                        wn70Var5 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2;
                        bjz bjzVar9 = (bjz) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1;
                        vpr vprVar14 = (vpr) superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0;
                        kotlin.b.b(obj2);
                        vprVar9 = vprVar14;
                        str13 = r15;
                        i17 = i33;
                        spannableTextStrategy9 = spannableTextStrategy16;
                        num13 = num25;
                        bjzVar3 = bjzVar9;
                        km70Var6 = r6;
                        str21 = r82;
                        String s2 = eVar2.s((String) obj2);
                        fn70Var = s2 == null ? new an70(Collections.singletonList(wm70.a(s2)), C(str22, wn70Var5), ym70.h) : new an70(Collections.singletonList(vm70.a(i18)), C(str22, wn70Var5), ym70.f);
                        km70Var2 = km70Var6;
                        coroutineSingletons4 = coroutineSingletons6;
                        str11 = str21;
                        str12 = str23;
                        num6 = num12;
                        num7 = num13;
                        spannableTextStrategy5 = spannableTextStrategy9;
                        vprVar6 = vprVar9;
                        i11 = i17;
                        hn70 hn70Var2222222 = new hn70(str13, null, null, spannableTextStrategy5, num7, i11 == 0, num6, str11, null, km70Var2, fn70Var, false, 0, null, false, 0L, 0L, str12, 1045126);
                        gei geiVar2222222 = eVar3.j;
                        String str272222222 = bjzVar3.b;
                        String str282222222 = bjzVar3.e;
                        yiz yizVar2222222 = bjzVar3.i;
                        g X2222222 = kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.logistics.deliveries.multiorder.b(geiVar2222222.a.e(), str272222222), new DeliveryMultiorderTitleUpdater$getTitleUpdates$$inlined$flatMapLatest$1(null, geiVar2222222, str282222222, yizVar2222222 == null ? yizVar2222222.a() : null, str272222222));
                        geiVar2222222.b.getClass();
                        tpr F2222222 = kotlinx.coroutines.flow.e.F(X2222222, uyj.a);
                        ghw0 ghw0Var2222222 = new ghw0(vprVar6, hn70Var2222222);
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$4 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$5 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$6 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$7 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$8 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$9 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$10 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$11 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$12 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$13 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$14 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.L$15 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$252.label = 9;
                        Object collect2222222 = F2222222.collect(ghw0Var2222222, superappTrackingCardUiStateInteractor$getCardHeaderUiState$252);
                        if (collect2222222 != coroutineSingletons4) {
                        }
                        break;
                    case 9:
                        kotlin.b.b(obj2);
                        return obj2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$25 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$25(eVar3, continuationImpl);
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$25 superappTrackingCardUiStateInteractor$getCardHeaderUiState$2522 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$25;
        Object obj22 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$2522.result;
        CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$2522.label;
        oiz oizVar22 = oiz.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0070, code lost:
    
        if (r5 == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(e eVar, qg50 qg50Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$22 superappTrackingCardUiStateInteractor$getCardHeaderUiState$22;
        int i;
        qg50 qg50Var2;
        Object f;
        km70 hm70Var;
        qg50 qg50Var3;
        String str;
        qg50 qg50Var4;
        pg50 pg50Var;
        km70 hm70Var2;
        String s;
        y yVar = eVar.k;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$22) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$22 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$22) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qg50Var2 = qg50Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0 = qg50Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = 1;
                    f = yVar.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$22);
                } else if (i == 1) {
                    qg50 qg50Var5 = (qg50) superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0;
                    kotlin.b.b(obj);
                    f = obj;
                    qg50Var2 = qg50Var5;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm70Var = (km70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$1;
                            qg50Var4 = (qg50) superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0;
                            kotlin.b.b(obj);
                            TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement = (TrackingCardElementHorizontalPlacement) obj;
                            return new hn70(qg50Var4.c, null, null, null, null, false, null, qg50Var4.d, null, (hm70Var == null && trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Lead) ? hm70Var : null, (hm70Var == null && trackingCardElementHorizontalPlacement == TrackingCardElementHorizontalPlacement.Trail) ? hm70Var : null, false, 0, null, false, 0L, 0L, null, 2093822);
                        }
                        qg50Var3 = (qg50) superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0;
                        kotlin.b.b(obj);
                        str = (String) obj;
                        if (str != null || (s = eVar.s(str)) == null) {
                            pg50Var = qg50Var3.e;
                            if (pg50Var != null) {
                                hm70Var = null;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0 = qg50Var3;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$1 = hm70Var;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = 4;
                                obj = yVar.B(superappTrackingCardUiStateInteractor$getCardHeaderUiState$22);
                                if (obj != coroutineSingletons) {
                                    qg50Var4 = qg50Var3;
                                    TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement2 = (TrackingCardElementHorizontalPlacement) obj;
                                    return new hn70(qg50Var4.c, null, null, null, null, false, null, qg50Var4.d, null, (hm70Var == null && trackingCardElementHorizontalPlacement2 == TrackingCardElementHorizontalPlacement.Lead) ? hm70Var : null, (hm70Var == null && trackingCardElementHorizontalPlacement2 == TrackingCardElementHorizontalPlacement.Trail) ? hm70Var : null, false, 0, null, false, 0L, 0L, null, 2093822);
                                }
                                return coroutineSingletons;
                            }
                            hm70Var2 = new hm70(pg50Var.a());
                        } else {
                            hm70Var2 = new lm70(s);
                        }
                        hm70Var = hm70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0 = qg50Var3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$1 = hm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = 4;
                        obj = yVar.B(superappTrackingCardUiStateInteractor$getCardHeaderUiState$22);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    qg50Var3 = (qg50) superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0;
                    kotlin.b.b(obj);
                    str = (String) obj;
                    if (str != null) {
                    }
                    pg50Var = qg50Var3.e;
                    if (pg50Var != null) {
                    }
                }
                if (((Boolean) f).booleanValue()) {
                    pg50 pg50Var2 = qg50Var2.e;
                    hm70Var = pg50Var2 != null ? new hm70(pg50Var2.b()) : null;
                    qg50Var3 = qg50Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0 = qg50Var3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$1 = hm70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = 4;
                    obj = yVar.B(superappTrackingCardUiStateInteractor$getCardHeaderUiState$22);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                int i3 = fhw0.b[qg50Var2.f.ordinal()];
                if (i3 == 1) {
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0 = qg50Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = 2;
                    Object A = yVar.A(superappTrackingCardUiStateInteractor$getCardHeaderUiState$22);
                    if (A != coroutineSingletons) {
                        qg50Var3 = qg50Var2;
                        obj = A;
                        str = (String) obj;
                        if (str != null) {
                        }
                        pg50Var = qg50Var3.e;
                        if (pg50Var != null) {
                        }
                    }
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.L$0 = qg50Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label = 3;
                    Object C = yVar.C(superappTrackingCardUiStateInteractor$getCardHeaderUiState$22);
                    if (C != coroutineSingletons) {
                        qg50Var3 = qg50Var2;
                        obj = C;
                        str = (String) obj;
                        if (str != null) {
                        }
                        pg50Var = qg50Var3.e;
                        if (pg50Var != null) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$22 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$22(eVar, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$22.label;
        if (i != 0) {
        }
        if (((Boolean) f).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        if (r2 == r5) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(e eVar, q6o0 q6o0Var, wn70 wn70Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$10 superappTrackingCardUiStateInteractor$getCardHeaderUiState$10;
        int i;
        lm70 lm70Var;
        wn70 wn70Var2;
        int i2;
        q6o0 q6o0Var2;
        a78 a78Var;
        String str;
        a78 a78Var2;
        nm70 nm70Var;
        q6o0 q6o0Var3;
        CharSequence charSequence;
        kdc kdcVar;
        wn70 wn70Var3;
        String str2;
        kdc kdcVar2;
        int i3;
        int i4;
        fn70 sm70Var;
        boolean z;
        float f;
        Object x;
        Object obj;
        int i5;
        int i6;
        nm70 nm70Var2;
        CharSequence charSequence2;
        String str3;
        fn70 fn70Var;
        q6o0 q6o0Var4 = q6o0Var;
        y yVar = eVar.k;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$10) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$10) continuationImpl;
            int i7 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = i7 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label;
                if (i != 0) {
                    lm70Var = null;
                    kotlin.b.b(obj2);
                    r7p0 number = q6o0Var4.g.getNumber();
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var4;
                    wn70Var2 = wn70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 1;
                    obj2 = eVar.r(number, superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            lm70Var = null;
                            a78Var = (a78) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2;
                            wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1;
                            q6o0Var2 = (q6o0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0;
                            kotlin.b.b(obj2);
                            str = (String) obj2;
                            wn70 wn70Var4 = wn70Var2;
                            q6o0 q6o0Var5 = q6o0Var2;
                            a78Var2 = a78Var;
                            String str4 = q6o0Var5.c;
                            cdc cdcVar = new cdc(q6o0Var5.e);
                            String str5 = q6o0Var5.d;
                            cdc cdcVar2 = new cdc(q6o0Var5.f);
                            String s = eVar.s(str);
                            if (s == null) {
                            }
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var5;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var4;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = a78Var2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$3 = lm70Var;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4 = str4;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5 = cdcVar;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6 = str5;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7 = cdcVar2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8 = r11;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0 = 0;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1 = 0;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 4;
                            obj2 = yVar.x(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                            if (obj2 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i == 3) {
                            lm70Var = null;
                            a78Var = (a78) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2;
                            wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1;
                            q6o0Var2 = (q6o0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0;
                            kotlin.b.b(obj2);
                            str = (String) obj2;
                            wn70 wn70Var42 = wn70Var2;
                            q6o0 q6o0Var52 = q6o0Var2;
                            a78Var2 = a78Var;
                            String str42 = q6o0Var52.c;
                            cdc cdcVar3 = new cdc(q6o0Var52.e);
                            String str52 = q6o0Var52.d;
                            cdc cdcVar22 = new cdc(q6o0Var52.f);
                            String s2 = eVar.s(str);
                            lm70 lm70Var2 = s2 == null ? new lm70(s2) : lm70Var;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var52;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var42;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = a78Var2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$3 = lm70Var;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4 = str42;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5 = cdcVar3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6 = str52;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7 = cdcVar22;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8 = lm70Var2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0 = 0;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1 = 0;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 4;
                            obj2 = yVar.x(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                            if (obj2 != coroutineSingletons) {
                                nm70Var = lm70Var2;
                                q6o0Var3 = q6o0Var52;
                                charSequence = str52;
                                kdcVar = cdcVar22;
                                wn70Var3 = wn70Var42;
                                str2 = str42;
                                kdcVar2 = cdcVar3;
                                i3 = 0;
                                i4 = 0;
                                if (((Boolean) obj2).booleanValue()) {
                                }
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = null;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = null;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = null;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$3 = null;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4 = str2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5 = kdcVar2;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6 = charSequence;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7 = kdcVar;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8 = nm70Var;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$9 = sm70Var;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0 = i4;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1 = i3;
                                z = false;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$2 = 0;
                                f = 0.0f;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.F$0 = 0.0f;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$3 = 0;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$4 = 0;
                                superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 5;
                                x = yVar.x(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                                if (x != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i8 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$4;
                            i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$2;
                            int i9 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0;
                            fn70 fn70Var2 = (fn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$9;
                            nm70 nm70Var3 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8;
                            kdcVar = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7;
                            CharSequence charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6;
                            kdcVar2 = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5;
                            ?? r11 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4;
                            kotlin.b.b(obj2);
                            i6 = i8;
                            fn70Var = fn70Var2;
                            nm70Var2 = nm70Var3;
                            charSequence2 = charSequence3;
                            str3 = r11;
                            f = 0.0f;
                            i4 = i9;
                            obj = obj2;
                            z = false;
                            return new hn70(str3, kdcVar2, null, null, null, i4 == 0 ? true : z, null, charSequence2, kdcVar, nm70Var2, fn70Var, i5 == 0 ? true : z, i6, new Float(!((Boolean) obj).booleanValue() ? 8.0f : f), false, 0L, 0L, null, 2027772);
                        }
                        i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1;
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0;
                        nm70Var = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8;
                        kdc kdcVar3 = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7;
                        charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6;
                        kdc kdcVar4 = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5;
                        ?? r8 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4;
                        a78Var2 = (a78) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2;
                        wn70 wn70Var5 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1;
                        q6o0 q6o0Var6 = (q6o0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0;
                        kotlin.b.b(obj2);
                        str2 = r8;
                        kdcVar = kdcVar3;
                        kdcVar2 = kdcVar4;
                        q6o0Var3 = q6o0Var6;
                        wn70Var3 = wn70Var5;
                        if (((Boolean) obj2).booleanValue()) {
                            qm70 qm70Var = qm70.c;
                            avc0 b = in91.b();
                            b.b(q6o0Var3.g.getNumber().a());
                            b.d(a78Var2);
                            bvc0 a = b.a();
                            String o = q6o0Var3.g.o();
                            if (o.length() > 0) {
                                o = ((m7x0) eVar.e).a(o);
                            }
                            sm70Var = new sm70(a, null, o, null, null, qm70Var, 50);
                        } else {
                            String s3 = eVar.s(q6o0Var3.g.o());
                            if (s3 == null) {
                                s3 = null;
                            }
                            sm70Var = new an70(scc.h(s3 != null ? wm70.a(s3) : null), E(q6o0Var3.g.getNumber().a(), null, wn70Var3), ym70.g);
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$3 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4 = str2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5 = kdcVar2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6 = charSequence;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7 = kdcVar;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8 = nm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$9 = sm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0 = i4;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1 = i3;
                        z = false;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$2 = 0;
                        f = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.F$0 = 0.0f;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$3 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$4 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 5;
                        x = yVar.x(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                        if (x != coroutineSingletons) {
                            obj = x;
                            i5 = 0;
                            i6 = 0;
                            nm70Var2 = nm70Var;
                            charSequence2 = charSequence;
                            str3 = str2;
                            fn70Var = sm70Var;
                            return new hn70(str3, kdcVar2, null, null, null, i4 == 0 ? true : z, null, charSequence2, kdcVar, nm70Var2, fn70Var, i5 == 0 ? true : z, i6, new Float(!((Boolean) obj).booleanValue() ? 8.0f : f), false, 0L, 0L, null, 2027772);
                        }
                        return coroutineSingletons;
                    }
                    lm70Var = null;
                    wn70 wn70Var6 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1;
                    q6o0 q6o0Var7 = (q6o0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0;
                    kotlin.b.b(obj2);
                    wn70Var2 = wn70Var6;
                    q6o0Var4 = q6o0Var7;
                }
                a78 a78Var3 = (a78) obj2;
                i2 = fhw0.a[q6o0Var4.g.q().ordinal()];
                if (i2 != 1) {
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = a78Var3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 2;
                    Object E = yVar.E(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                    if (E != coroutineSingletons) {
                        q6o0Var2 = q6o0Var4;
                        a78Var = a78Var3;
                        obj2 = E;
                        str = (String) obj2;
                        wn70 wn70Var422 = wn70Var2;
                        q6o0 q6o0Var522 = q6o0Var2;
                        a78Var2 = a78Var;
                        String str422 = q6o0Var522.c;
                        cdc cdcVar32 = new cdc(q6o0Var522.e);
                        String str522 = q6o0Var522.d;
                        cdc cdcVar222 = new cdc(q6o0Var522.f);
                        String s22 = eVar.s(str);
                        if (s22 == null) {
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var522;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var422;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = a78Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$3 = lm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4 = str422;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5 = cdcVar32;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6 = str522;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7 = cdcVar222;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8 = lm70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 4;
                        obj2 = yVar.x(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return lm70Var;
                    }
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = a78Var3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 3;
                    Object D = yVar.D(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                    if (D != coroutineSingletons) {
                        q6o0Var2 = q6o0Var4;
                        a78Var = a78Var3;
                        obj2 = D;
                        str = (String) obj2;
                        wn70 wn70Var4222 = wn70Var2;
                        q6o0 q6o0Var5222 = q6o0Var2;
                        a78Var2 = a78Var;
                        String str4222 = q6o0Var5222.c;
                        cdc cdcVar322 = new cdc(q6o0Var5222.e);
                        String str5222 = q6o0Var5222.d;
                        cdc cdcVar2222 = new cdc(q6o0Var5222.f);
                        String s222 = eVar.s(str);
                        if (s222 == null) {
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$0 = q6o0Var5222;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$1 = wn70Var4222;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$2 = a78Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$3 = lm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$4 = str4222;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$5 = cdcVar322;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$6 = str5222;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$7 = cdcVar2222;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.L$8 = lm70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$0 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.I$1 = 0;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label = 4;
                        obj2 = yVar.x(superappTrackingCardUiStateInteractor$getCardHeaderUiState$10);
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$10 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$10(eVar, continuationImpl);
        Object obj22 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$10.label;
        if (i != 0) {
        }
        a78 a78Var32 = (a78) obj22;
        i2 = fhw0.a[q6o0Var4.g.q().ordinal()];
        if (i2 != 1) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [an70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(e eVar, y2y0 y2y0Var, wn70 wn70Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$17 superappTrackingCardUiStateInteractor$getCardHeaderUiState$17;
        CoroutineSingletons coroutineSingletons;
        int i;
        String s;
        CharSequence charSequence;
        CharSequence charSequence2;
        kdc kdcVar;
        y2y0 y2y0Var2;
        wn70 wn70Var2;
        int i2;
        int i3;
        nm70 nm70Var;
        Object y;
        kdc kdcVar2;
        CharSequence charSequence3;
        nm70 nm70Var2;
        nm70 nm70Var3;
        Drawable drawable;
        CharSequence charSequence4;
        String str;
        wn70 wn70Var3;
        y2y0 y2y0Var3;
        int i4;
        CharSequence charSequence5;
        ListBuilder j;
        String a;
        eVar.getClass();
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$17) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$17 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$17) continuationImpl;
            int i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label = i5 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label;
                r10 = null;
                zuc0 zuc0Var = null;
                r10 = null;
                sm70 sm70Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s = eVar.s(y2y0Var.f);
                    pdc pdcVar = eVar.c;
                    q48 q48Var = y2y0Var.g;
                    kdc g = ((ufu) pdcVar).g(q48Var != null ? q48Var.b() : null);
                    charSequence = y2y0Var.d;
                    charSequence2 = y2y0Var.e;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0 = y2y0Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1 = wn70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2 = s;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$3 = g;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$4 = charSequence;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5 = charSequence2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0 = 0;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$1 = 0;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label = 1;
                    Object B = eVar.B(null, superappTrackingCardUiStateInteractor$getCardHeaderUiState$17);
                    if (B != coroutineSingletons) {
                        kdcVar = g;
                        obj = B;
                        y2y0Var2 = y2y0Var;
                        wn70Var2 = wn70Var;
                        i2 = 0;
                        i3 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0;
                        nm70Var3 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$7;
                        charSequence4 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$6;
                        charSequence5 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5;
                        str = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2;
                        wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1;
                        y2y0Var3 = (y2y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0;
                        kotlin.b.b(obj);
                        drawable = (Drawable) obj;
                        y2y0Var2 = y2y0Var3;
                        charSequence3 = charSequence5;
                        s = str;
                        wn70Var2 = wn70Var3;
                        i3 = i4;
                        charSequence2 = charSequence4;
                        ListBuilder a2 = rcc.a();
                        if (drawable != null) {
                            q48 q48Var2 = y2y0Var2.g;
                            a2.add(um70.a(new UiStateDrawableWrapper(new vt11(q48Var2 != null ? q48Var2.b() : null), drawable)));
                        }
                        if (s != null) {
                            a2.add(wm70.a(s));
                        }
                        j = a2.j();
                        if (!j.isEmpty()) {
                            q48 q48Var3 = y2y0Var2.g;
                            if (q48Var3 != null && (a = q48Var3.a()) != null) {
                                zuc0Var = C(a, wn70Var2);
                            }
                            sm70Var = new an70(j, zuc0Var, drawable != null ? ym70.h : ym70.f);
                        }
                        nm70Var2 = nm70Var3;
                        return new hn70(charSequence3, null, null, null, null, i3 == 0, null, charSequence2, null, nm70Var2, sm70Var, false, 0, null, false, 0L, 0L, null, 2077438);
                    }
                    i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$1;
                    i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0;
                    nm70 nm70Var4 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$6;
                    CharSequence charSequence6 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5;
                    charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$4;
                    kdc kdcVar3 = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$3;
                    String str2 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2;
                    wn70 wn70Var4 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1;
                    y2y0 y2y0Var4 = (y2y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0;
                    kotlin.b.b(obj);
                    y = obj;
                    nm70Var = nm70Var4;
                    kdcVar2 = kdcVar3;
                    s = str2;
                    wn70Var2 = wn70Var4;
                    y2y0Var2 = y2y0Var4;
                    charSequence2 = charSequence6;
                    if (((Boolean) y).booleanValue()) {
                        if (kdcVar2 != null || s != null) {
                            q48 q48Var4 = y2y0Var2.g;
                            sm70Var = new sm70(q48Var4 != null ? q48Var4.c() : null, kdcVar2 != null ? new Integer(s8o.m(kdcVar2, eVar.a)) : null, s, null, null, null, 120);
                        }
                        nm70Var2 = nm70Var;
                        return new hn70(charSequence3, null, null, null, null, i3 == 0, null, charSequence2, null, nm70Var2, sm70Var, false, 0, null, false, 0L, 0L, null, 2077438);
                    }
                    if (kdcVar2 == null) {
                        nm70Var3 = nm70Var;
                        drawable = null;
                        ListBuilder a22 = rcc.a();
                        if (drawable != null) {
                        }
                        if (s != null) {
                        }
                        j = a22.j();
                        if (!j.isEmpty()) {
                        }
                        nm70Var2 = nm70Var3;
                        return new hn70(charSequence3, null, null, null, null, i3 == 0, null, charSequence2, null, nm70Var2, sm70Var, false, 0, null, false, 0L, 0L, null, 2077438);
                    }
                    com.yandex.go.superapp.tracking.data.a aVar = eVar.m;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0 = y2y0Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2 = s;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$3 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$4 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5 = charSequence3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$6 = charSequence2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$7 = nm70Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0 = i3;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$1 = i2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label = 3;
                    Object b = aVar.b(kdcVar2, superappTrackingCardUiStateInteractor$getCardHeaderUiState$17);
                    if (b != coroutineSingletons) {
                        nm70Var3 = nm70Var;
                        charSequence4 = charSequence2;
                        str = s;
                        wn70Var3 = wn70Var2;
                        y2y0Var3 = y2y0Var2;
                        obj = b;
                        i4 = i3;
                        charSequence5 = charSequence3;
                        drawable = (Drawable) obj;
                        y2y0Var2 = y2y0Var3;
                        charSequence3 = charSequence5;
                        s = str;
                        wn70Var2 = wn70Var3;
                        i3 = i4;
                        charSequence2 = charSequence4;
                        ListBuilder a222 = rcc.a();
                        if (drawable != null) {
                        }
                        if (s != null) {
                        }
                        j = a222.j();
                        if (!j.isEmpty()) {
                        }
                        nm70Var2 = nm70Var3;
                        return new hn70(charSequence3, null, null, null, null, i3 == 0, null, charSequence2, null, nm70Var2, sm70Var, false, 0, null, false, 0L, 0L, null, 2077438);
                    }
                    return coroutineSingletons;
                }
                i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$1;
                i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0;
                charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5;
                charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$4;
                kdcVar = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$3;
                s = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2;
                wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1;
                y2y0Var2 = (y2y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0;
                kotlin.b.b(obj);
                nm70Var = (nm70) obj;
                y yVar = eVar.k;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0 = y2y0Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1 = wn70Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2 = s;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$3 = kdcVar;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$4 = charSequence;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5 = charSequence2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$6 = nm70Var;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0 = i3;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$1 = i2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label = 2;
                y = yVar.y(superappTrackingCardUiStateInteractor$getCardHeaderUiState$17);
                if (y != coroutineSingletons) {
                    kdcVar2 = kdcVar;
                    charSequence3 = charSequence;
                    if (((Boolean) y).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$17(eVar, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label;
        zuc0Var = null;
        zuc0 zuc0Var2 = null;
        sm70Var = null;
        sm70 sm70Var2 = null;
        if (i != 0) {
        }
        nm70Var = (nm70) obj2;
        y yVar2 = eVar.k;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$0 = y2y0Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$1 = wn70Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$2 = s;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$3 = kdcVar;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$4 = charSequence;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$5 = charSequence2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.L$6 = nm70Var;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$0 = i3;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.I$1 = i2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$17.label = 2;
        y = yVar2.y(superappTrackingCardUiStateInteractor$getCardHeaderUiState$17);
        if (y != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(e eVar, q6y0 q6y0Var, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$1 superappTrackingCardUiStateInteractor$getCardHeaderUiState$1;
        Object obj;
        int i;
        g301 D;
        q6y0 q6y0Var2;
        wn70 wn70Var2;
        boolean z2;
        Object obj2;
        boolean F;
        Object f;
        q6y0 q6y0Var3;
        Boolean bool;
        Integer num;
        Object obj3;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy;
        CharSequence charSequence;
        boolean z3;
        kdc kdcVar;
        Integer num2;
        wn70 wn70Var3;
        CharSequence charSequence2;
        int i2;
        y yVar;
        boolean z4;
        wn70 wn70Var4;
        q6y0 q6y0Var4;
        kdc kdcVar2;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy2;
        Boolean bool2;
        int i3;
        nm70 nm70Var;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy3;
        int i4;
        boolean z5;
        CharSequence charSequence3;
        Integer num3;
        e58 v;
        Integer num4;
        CharSequence charSequence4;
        fn70 fn70Var;
        Boolean bool3;
        String str;
        q6y0 q6y0Var5;
        Integer num5;
        wn70 wn70Var5;
        Boolean bool4;
        CharSequence charSequence5;
        fn70 sm70Var;
        String a;
        Context context = eVar.a;
        y yVar2 = eVar.k;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$1) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$1 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$1) continuationImpl;
            int i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = i5 - Integer.MIN_VALUE;
                Object obj4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    D = q6y0Var.D();
                    q6y0Var2 = q6y0Var;
                    if (D != null) {
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = q6y0Var2;
                        wn70Var2 = wn70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = D;
                        z2 = z;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 1;
                        Object f2 = yVar2.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
                        if (f2 != obj) {
                            obj2 = f2;
                        }
                    }
                    wn70Var2 = wn70Var;
                    z2 = z;
                    String title = q6y0Var2.getTitle();
                    kdc C = q6y0Var2.C();
                    n2s n2sVar = eVar.f;
                    kdc C2 = q6y0Var2.C();
                    n2sVar.getClass();
                    Boolean valueOf = Boolean.valueOf(C2 == null && s8o.m(C2, context) == n2sVar.a);
                    SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy4 = q6y0Var2.E() ? SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE : SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_DENSITY;
                    Integer num6 = q6y0Var2.E() ? new Integer(f1h0.ic_chevron_next_circle) : null;
                    F = q6y0Var2.F();
                    Integer num7 = new Integer(qje.t(xng0.bgMain, context));
                    CharSequence A = q6y0Var2.A();
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = q6y0Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3 = title;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4 = C;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5 = valueOf;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6 = spannableTextStrategy4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7 = num6;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8 = num7;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9 = A;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1 = F;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0 = 0;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 3;
                    f = yVar2.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
                    if (f != obj) {
                        Integer num8 = num6;
                        q6y0Var3 = q6y0Var2;
                        bool = valueOf;
                        num = num8;
                        obj3 = f;
                        spannableTextStrategy = spannableTextStrategy4;
                        charSequence = title;
                        z3 = z2;
                        kdcVar = C;
                        num2 = num7;
                        wn70Var3 = wn70Var2;
                        charSequence2 = A;
                        i2 = 0;
                        if (!((Boolean) obj3).booleanValue()) {
                        }
                    }
                }
                if (i == 1) {
                    obj2 = obj4;
                    boolean z6 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0;
                    D = (g301) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2;
                    wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1;
                    q6y0 q6y0Var6 = (q6y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0;
                    kotlin.b.b(obj2);
                    z2 = z6;
                    q6y0Var2 = q6y0Var6;
                } else {
                    if (i == 2) {
                        kotlin.b.b(obj4);
                        return obj4;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1;
                            nm70Var = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$11;
                            charSequence3 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$10;
                            num5 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9;
                            num3 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8;
                            spannableTextStrategy2 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7;
                            bool4 = (Boolean) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6;
                            kdcVar2 = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5;
                            charSequence5 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4;
                            v = (e58) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3;
                            wn70Var5 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1;
                            q6y0Var5 = (q6y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0;
                            kotlin.b.b(obj4);
                            str = null;
                            if (((Boolean) obj4).booleanValue()) {
                                q48 n = q6y0Var5.n();
                                sm70Var = new sm70(n != null ? n.c() : str, v.b(), v.c(), new Integer(v.a()), null, null, 112);
                            } else {
                                Integer b = v.b();
                                Object a2 = b != null ? tm70.a(b.intValue()) : str;
                                String c = v.c();
                                if (c == null) {
                                    c = str;
                                }
                                List A2 = j73.A(new xm70[]{a2, c != null ? wm70.a(c) : str, vm70.a(v.a())});
                                q48 n2 = q6y0Var5.n();
                                sm70Var = new an70(A2, (n2 == null || (a = n2.a()) == null) ? str : C(a, wn70Var5), ym70.f);
                            }
                            num4 = num5;
                            bool3 = bool4;
                            fn70Var = sm70Var;
                            charSequence4 = charSequence5;
                            return new hn70(charSequence4, kdcVar2, bool3, spannableTextStrategy2, num3, z4, num4, charSequence3, null, nm70Var, fn70Var, false, 0, null, false, 0L, 0L, null, 2093696);
                        }
                        i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0;
                        z5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1;
                        z3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0;
                        charSequence2 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9;
                        num2 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8;
                        num = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7;
                        spannableTextStrategy3 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6;
                        bool2 = (Boolean) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5;
                        kdcVar = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4;
                        charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3;
                        wn70Var4 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1;
                        q6y0Var4 = (q6y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0;
                        kotlin.b.b(obj4);
                        yVar = yVar2;
                        nm70 nm70Var2 = (nm70) obj4;
                        i3 = i4;
                        z4 = z5;
                        nm70Var = nm70Var2;
                        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy5 = spannableTextStrategy3;
                        kdcVar2 = kdcVar;
                        spannableTextStrategy2 = spannableTextStrategy5;
                        charSequence3 = charSequence2;
                        boolean z7 = z3;
                        num3 = num;
                        v = q6y0Var4.v();
                        if (v == null) {
                            num4 = num2;
                            charSequence4 = charSequence;
                            fn70Var = null;
                            bool3 = bool2;
                            return new hn70(charSequence4, kdcVar2, bool3, spannableTextStrategy2, num3, z4, num4, charSequence3, null, nm70Var, fn70Var, false, 0, null, false, 0L, 0L, null, 2093696);
                        }
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = q6y0Var4;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = wn70Var4;
                        q6y0 q6y0Var7 = q6y0Var4;
                        str = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3 = v;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4 = charSequence;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5 = kdcVar2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6 = bool2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7 = spannableTextStrategy2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8 = num3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9 = num2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$10 = charSequence3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$11 = nm70Var;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z7;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1 = z4;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0 = i3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 5;
                        obj4 = yVar.y(superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
                        if (obj4 != obj) {
                            q6y0Var5 = q6y0Var7;
                            num5 = num2;
                            wn70Var5 = wn70Var4;
                            bool4 = bool2;
                            charSequence5 = charSequence;
                            if (((Boolean) obj4).booleanValue()) {
                            }
                            num4 = num5;
                            bool3 = bool4;
                            fn70Var = sm70Var;
                            charSequence4 = charSequence5;
                            return new hn70(charSequence4, kdcVar2, bool3, spannableTextStrategy2, num3, z4, num4, charSequence3, null, nm70Var, fn70Var, false, 0, null, false, 0L, 0L, null, 2093696);
                        }
                    }
                    i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0;
                    boolean z8 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1;
                    boolean z9 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0;
                    CharSequence charSequence6 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9;
                    Integer num9 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8;
                    Integer num10 = (Integer) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7;
                    SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy6 = (SpannableTextStrategyInteractor.SpannableTextStrategy) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6;
                    Boolean bool5 = (Boolean) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5;
                    kdc kdcVar3 = (kdc) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4;
                    CharSequence charSequence7 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3;
                    wn70 wn70Var6 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1;
                    q6y0 q6y0Var8 = (q6y0) superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0;
                    kotlin.b.b(obj4);
                    q6y0Var3 = q6y0Var8;
                    bool = bool5;
                    F = z8;
                    z3 = z9;
                    charSequence2 = charSequence6;
                    kdcVar = kdcVar3;
                    wn70Var3 = wn70Var6;
                    num2 = num9;
                    num = num10;
                    charSequence = charSequence7;
                    spannableTextStrategy = spannableTextStrategy6;
                    obj3 = obj4;
                    if (!((Boolean) obj3).booleanValue()) {
                        yVar = yVar2;
                        String d = q6y0Var3.y().d();
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = q6y0Var3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = wn70Var3;
                        q6y0 q6y0Var9 = q6y0Var3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = null;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3 = charSequence;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4 = kdcVar;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5 = bool;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6 = spannableTextStrategy;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7 = num;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8 = num2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9 = charSequence2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z3;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1 = F;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0 = i2;
                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 4;
                        Object B = eVar.B(d, superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
                        if (B != obj) {
                            wn70Var4 = wn70Var3;
                            spannableTextStrategy3 = spannableTextStrategy;
                            bool2 = bool;
                            obj4 = B;
                            i4 = i2;
                            z5 = F;
                            q6y0Var4 = q6y0Var9;
                            nm70 nm70Var22 = (nm70) obj4;
                            i3 = i4;
                            z4 = z5;
                            nm70Var = nm70Var22;
                            SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy52 = spannableTextStrategy3;
                            kdcVar2 = kdcVar;
                            spannableTextStrategy2 = spannableTextStrategy52;
                            charSequence3 = charSequence2;
                            boolean z72 = z3;
                            num3 = num;
                            v = q6y0Var4.v();
                            if (v == null) {
                            }
                        }
                    }
                    yVar = yVar2;
                    q6y0 q6y0Var10 = q6y0Var3;
                    z4 = F;
                    wn70Var4 = wn70Var3;
                    q6y0Var4 = q6y0Var10;
                    kdcVar2 = kdcVar;
                    spannableTextStrategy2 = spannableTextStrategy;
                    bool2 = bool;
                    i3 = i2;
                    nm70Var = null;
                    charSequence3 = charSequence2;
                    boolean z722 = z3;
                    num3 = num;
                    v = q6y0Var4.v();
                    if (v == null) {
                    }
                }
                if (((Boolean) obj2).booleanValue()) {
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 2;
                    Object u = eVar.u(D, wn70Var2, z2, superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
                    return u == obj ? obj : u;
                }
                String title2 = q6y0Var2.getTitle();
                kdc C3 = q6y0Var2.C();
                n2s n2sVar2 = eVar.f;
                kdc C22 = q6y0Var2.C();
                n2sVar2.getClass();
                Boolean valueOf2 = Boolean.valueOf(C22 == null && s8o.m(C22, context) == n2sVar2.a);
                if (q6y0Var2.E()) {
                }
                if (q6y0Var2.E()) {
                }
                F = q6y0Var2.F();
                Integer num72 = new Integer(qje.t(xng0.bgMain, context));
                CharSequence A3 = q6y0Var2.A();
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = q6y0Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = wn70Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3 = title2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4 = C3;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5 = valueOf2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6 = spannableTextStrategy4;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7 = num6;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8 = num72;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9 = A3;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1 = F;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0 = 0;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 3;
                f = yVar2.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
                if (f != obj) {
                }
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$1(eVar, continuationImpl);
        Object obj42 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        String title22 = q6y0Var2.getTitle();
        kdc C32 = q6y0Var2.C();
        n2s n2sVar22 = eVar.f;
        kdc C222 = q6y0Var2.C();
        n2sVar22.getClass();
        Boolean valueOf22 = Boolean.valueOf(C222 == null && s8o.m(C222, context) == n2sVar22.a);
        if (q6y0Var2.E()) {
        }
        if (q6y0Var2.E()) {
        }
        F = q6y0Var2.F();
        Integer num722 = new Integer(qje.t(xng0.bgMain, context));
        CharSequence A32 = q6y0Var2.A();
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$0 = q6y0Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$1 = wn70Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$2 = null;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$3 = title22;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$4 = C32;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$5 = valueOf22;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$6 = spannableTextStrategy4;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$7 = num6;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$8 = num722;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.L$9 = A32;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$0 = z2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.Z$1 = F;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.I$0 = 0;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$1.label = 3;
        f = yVar2.f(superappTrackingCardUiStateInteractor$getCardHeaderUiState$1);
        if (f != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(e eVar, w201 w201Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$1 superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1;
        int i;
        int i2;
        Object obj;
        Object f;
        boolean z2;
        f401 f401Var;
        tpr g92Var;
        w201 w201Var2;
        boolean z3;
        Object z4;
        f401 f401Var2;
        tpr tprVar;
        Object y;
        tpr tprVar2;
        tpr tprVar3;
        w201 w201Var3;
        f401 f401Var3;
        eVar.getClass();
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$1) {
            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1 = (SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$1) continuationImpl;
            int i3 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label;
                i2 = 2;
                obj = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!(w201Var instanceof q6y0)) {
                        return new g92(i2, obj);
                    }
                    g301 D = ((q6y0) w201Var).D();
                    f401 b = D != null ? D.b() : null;
                    if (b != null) {
                        y yVar = eVar.k;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0 = w201Var;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1 = b;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0 = z;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = 1;
                        f = yVar.f(superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1);
                        if (f != obj3) {
                            f401 f401Var4 = b;
                            z2 = z;
                            f401Var = f401Var4;
                        }
                        return obj3;
                    }
                    q6y0 q6y0Var = (q6y0) w201Var;
                    g92Var = (q6y0Var.x().b() || q6y0Var.z() != DriveState.COMPLETE) ? new g92(i2, obj) : new g92(i2, new g401(q6y0Var.x().a()));
                    eVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    return kotlinx.coroutines.flow.e.F(g92Var, mdh.b);
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0;
                        f401Var = (f401) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1;
                        w201Var2 = (w201) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0;
                        kotlin.b.b(obj2);
                        tpr tprVar4 = (tpr) obj2;
                        String c = f401Var.c();
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0 = w201Var2;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1 = f401Var;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$2 = tprVar4;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0 = z3;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = 3;
                        z4 = eVar.z(c, superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1);
                        if (z4 != obj3) {
                            f401Var2 = f401Var;
                            tprVar = tprVar4;
                            obj2 = z4;
                            tpr tprVar5 = (tpr) obj2;
                            String a = f401Var2.a();
                            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0 = w201Var2;
                            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1 = f401Var2;
                            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$2 = tprVar;
                            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$3 = tprVar5;
                            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0 = z3;
                            superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = 4;
                            y = eVar.y(a, superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1);
                            if (y != obj3) {
                            }
                        }
                        return obj3;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0;
                        tprVar3 = (tpr) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$3;
                        tprVar2 = (tpr) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$2;
                        f401 f401Var5 = (f401) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1;
                        w201 w201Var4 = (w201) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0;
                        kotlin.b.b(obj2);
                        w201Var3 = w201Var4;
                        f401Var3 = f401Var5;
                        g92Var = kotlinx.coroutines.flow.e.n(tprVar2, tprVar3, (tpr) obj2, new SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2(w201Var3, eVar, f401Var3, z3, null));
                        eVar.b.getClass();
                        sjh sjhVar2 = uyj.a;
                        return kotlinx.coroutines.flow.e.F(g92Var, mdh.b);
                    }
                    z3 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0;
                    tprVar = (tpr) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$2;
                    f401 f401Var6 = (f401) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1;
                    w201 w201Var5 = (w201) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0;
                    kotlin.b.b(obj2);
                    f401Var2 = f401Var6;
                    w201Var2 = w201Var5;
                    tpr tprVar52 = (tpr) obj2;
                    String a2 = f401Var2.a();
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0 = w201Var2;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1 = f401Var2;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$2 = tprVar;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$3 = tprVar52;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0 = z3;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = 4;
                    y = eVar.y(a2, superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1);
                    if (y != obj3) {
                        tprVar2 = tprVar;
                        tprVar3 = tprVar52;
                        obj2 = y;
                        w201Var3 = w201Var2;
                        f401Var3 = f401Var2;
                        g92Var = kotlinx.coroutines.flow.e.n(tprVar2, tprVar3, (tpr) obj2, new SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2(w201Var3, eVar, f401Var3, z3, null));
                        eVar.b.getClass();
                        sjh sjhVar22 = uyj.a;
                        return kotlinx.coroutines.flow.e.F(g92Var, mdh.b);
                    }
                    return obj3;
                }
                boolean z5 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0;
                f401 f401Var7 = (f401) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1;
                w201 w201Var6 = (w201) superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0;
                kotlin.b.b(obj2);
                f401Var = f401Var7;
                w201Var = w201Var6;
                f = obj2;
                z2 = z5;
                if (((Boolean) f).booleanValue()) {
                    String b2 = f401Var.b();
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0 = w201Var;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1 = f401Var;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = 2;
                    Object y2 = eVar.y(b2, superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1);
                    if (y2 != obj3) {
                        w201Var2 = w201Var;
                        z3 = z2;
                        obj2 = y2;
                        tpr tprVar42 = (tpr) obj2;
                        String c2 = f401Var.c();
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$0 = w201Var2;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$1 = f401Var;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.L$2 = tprVar42;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.Z$0 = z3;
                        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label = 3;
                        z4 = eVar.z(c2, superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1);
                        if (z4 != obj3) {
                        }
                    }
                    return obj3;
                }
                q6y0 q6y0Var2 = (q6y0) w201Var;
                if (q6y0Var2.x().b()) {
                }
                eVar.b.getClass();
                sjh sjhVar222 = uyj.a;
                return kotlinx.coroutines.flow.e.F(g92Var, mdh.b);
            }
        }
        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1 = new SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$1(eVar, continuationImpl);
        Object obj22 = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getRatingUiStateFlow$1.label;
        i2 = 2;
        obj = null;
        if (i != 0) {
        }
        if (((Boolean) f).booleanValue()) {
        }
        q6y0 q6y0Var22 = (q6y0) w201Var;
        if (q6y0Var22.x().b()) {
        }
        eVar.b.getClass();
        sjh sjhVar2222 = uyj.a;
        return kotlinx.coroutines.flow.e.F(g92Var, mdh.b);
    }

    public static bdc p(wn70 wn70Var, int i, int i2) {
        if (wn70Var instanceof rn70) {
            return new bdc(i);
        }
        if ((wn70Var instanceof sn70) || (wn70Var instanceof vn70) || jl40.l(wn70Var, tn70.a)) {
            return new bdc(i2);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement, e eVar, h hVar, String str, TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement2, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1 superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1;
        Object obj;
        int i;
        String str2;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.label = i2 - Integer.MIN_VALUE;
                obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (trackingCardElementHorizontalPlacement2 != trackingCardElementHorizontalPlacement) {
                        return null;
                    }
                    y yVar = eVar.k;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$2 = hVar;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$3 = str;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$4 = null;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.label = 1;
                    obj = yVar.m(superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$3;
                        kotlin.b.b(obj);
                        lm70 lm70Var = (lm70) obj;
                        return lm70Var != null ? new lm70(str2) : lm70Var;
                    }
                    str = (String) superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$3;
                    hVar = (h) superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$2;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return new lm70(str);
                }
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$0 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$1 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$2 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$3 = str;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.L$4 = null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.label = 2;
                obj = hVar.a(superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1);
                if (obj != coroutineSingletons) {
                    str2 = str;
                    lm70 lm70Var2 = (lm70) obj;
                    if (lm70Var2 != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1(continuationImpl);
        obj = superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$remoteIcon$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(String str, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1 superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1;
        int i;
        String str2;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1) {
            superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1 = (SuperappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.label;
                y yVar = this.k;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.L$1 = null;
                        superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.label = 1;
                        obj = yVar.M(str, superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1);
                    }
                    superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.label = 2;
                    obj = yVar.L(superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        str2 = (String) obj;
                        String s = s(str2);
                        if (s != null) {
                            return new lm70(s);
                        }
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                str2 = (String) obj;
            }
        }
        superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1 = new SuperappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1(this, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$taxiTrackingServiceImage$1.label;
        y yVar2 = this.k;
        if (i != 0) {
        }
        str2 = (String) obj2;
    }

    @Override // defpackage.u501
    public final tpr a(w201 w201Var) {
        return kotlinx.coroutines.flow.e.X(((ru.yandex.taxi.styling.g) this.h).d(), new SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(tn70.a, w201Var, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0114, code lost:
    
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0191 -> B:14:0x0196). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(o oVar, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3;
        int i;
        FormattedText.a aVar;
        wn70 wn70Var2;
        Collection arrayList;
        Iterator it;
        boolean z2;
        FormattedText.g gVar;
        FormattedText.e eVar;
        FormattedText.d dVar;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3) {
            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 = (SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (oVar instanceof FormattedText.h) {
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$0 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0 = z;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label = 1;
                        obj = n((FormattedText.h) oVar, wn70Var, z, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3);
                    } else {
                        boolean z3 = oVar instanceof FormattedText.d;
                        d501 d501Var = this.l;
                        if (z3) {
                            dVar = (FormattedText.d) oVar;
                            String str = dVar.c;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$0 = null;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1 = wn70Var;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2 = dVar;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$3 = this;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0 = z;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label = 2;
                            obj = ((f) d501Var).b(str, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3);
                        } else if (oVar instanceof FormattedText.e) {
                            eVar = (FormattedText.e) oVar;
                            String str2 = eVar.c;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$0 = null;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1 = wn70Var;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2 = eVar;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$3 = this;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0 = z;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label = 3;
                            obj = ((f) d501Var).b(str2, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3);
                        } else if (oVar instanceof FormattedText.g) {
                            FormattedText.g gVar2 = (FormattedText.g) oVar;
                            FormattedText.h hVar = gVar2.b;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$0 = null;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1 = null;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2 = gVar2;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0 = z;
                            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label = 4;
                            obj = n(hVar, wn70Var, z, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3);
                            if (obj != coroutineSingletons) {
                                gVar = gVar2;
                                return FormattedText.g.e(gVar, (FormattedText.h) obj);
                            }
                        } else {
                            if (!(oVar instanceof FormattedText.a)) {
                                if (jl40.l(oVar, z.INSTANCE)) {
                                    return oVar;
                                }
                                w511.b();
                                return null;
                            }
                            FormattedText.a aVar2 = (FormattedText.a) oVar;
                            List list = aVar2.b;
                            aVar = aVar2;
                            wn70Var2 = wn70Var;
                            arrayList = new ArrayList(tcc.n(list, 10));
                            it = list.iterator();
                            z2 = z;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return (o) obj;
                }
                if (i == 2) {
                    z = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0;
                    this = (e) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$3;
                    dVar = (FormattedText.d) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2;
                    wn70Var = (wn70) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1;
                    kotlin.b.b(obj);
                    this.getClass();
                    return FormattedText.d.e(dVar, A((c501) obj, wn70Var, z));
                }
                if (i == 3) {
                    z = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0;
                    this = (e) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$3;
                    eVar = (FormattedText.e) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2;
                    wn70Var = (wn70) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1;
                    kotlin.b.b(obj);
                    this.getClass();
                    return FormattedText.e.e(eVar, A((c501) obj, wn70Var, z));
                }
                if (i == 4) {
                    gVar = (FormattedText.g) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2;
                    kotlin.b.b(obj);
                    return FormattedText.g.e(gVar, (FormattedText.h) obj);
                }
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z4 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0;
                arrayList = (Collection) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$9;
                aVar = (FormattedText.a) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$8;
                Iterator it2 = (Iterator) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$5;
                Collection collection = (Collection) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$4;
                wn70 wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1;
                kotlin.b.b(obj);
                SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$32 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3;
                boolean z5 = z4;
                wn70Var2 = wn70Var3;
                Iterator it3 = it2;
                SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$33 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$32;
                arrayList.add((o) obj);
                z2 = z5;
                superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$33;
                arrayList = collection;
                it = it3;
                if (it.hasNext()) {
                    o oVar2 = (o) it.next();
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$0 = null;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$1 = wn70Var2;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$2 = null;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$3 = null;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$4 = arrayList;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$5 = it;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$6 = null;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$7 = null;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$8 = aVar;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.L$9 = arrayList;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label = 5;
                    Object m = m(oVar2, wn70Var2, z2, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3);
                    if (m != coroutineSingletons) {
                        it3 = it;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$33 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3;
                        z5 = z2;
                        obj = m;
                        collection = arrayList;
                        arrayList.add((o) obj);
                        z2 = z5;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$33;
                        arrayList = collection;
                        it = it3;
                        if (it.hasNext()) {
                            return FormattedText.a.e(aVar, (List) arrayList);
                        }
                    }
                    return coroutineSingletons;
                }
            }
        }
        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3 = new SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3(this, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$3.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(FormattedText.h hVar, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5) {
            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5 = (SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = hVar.g;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$0 = null;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$1 = wn70Var;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$2 = hVar;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$3 = this;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.Z$0 = z;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.label = 1;
                    obj = ((f) this.l).b(str, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.Z$0;
                    this = (e) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$3;
                    hVar = (FormattedText.h) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$2;
                    wn70Var = (wn70) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.L$1;
                    kotlin.b.b(obj);
                }
                this.getClass();
                return FormattedText.h.e(hVar, null, null, A((c501) obj, wn70Var, z), 1983);
            }
        }
        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5 = new SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5(this, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$5.label;
        if (i != 0) {
        }
        this.getClass();
        return FormattedText.h.e(hVar, null, null, A((c501) obj2, wn70Var, z), 1983);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(FormattedText formattedText, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1;
        int i;
        Iterator it;
        wn70 wn70Var2;
        Collection collection;
        boolean z2;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1) {
            superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 = (SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = formattedText.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    wn70Var2 = wn70Var;
                    collection = arrayList;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.Z$0;
                    collection = (Collection) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$8;
                    it = (Iterator) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$5;
                    Collection collection2 = (Collection) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$4;
                    wn70 wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$1;
                    kotlin.b.b(obj);
                    SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$12 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1;
                    boolean z4 = z3;
                    wn70Var2 = wn70Var3;
                    SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$13 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$12;
                    collection.add((o) obj);
                    z2 = z4;
                    collection = collection2;
                    superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$13;
                    if (it.hasNext()) {
                        o oVar = (o) it.next();
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$1 = wn70Var2;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$2 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$3 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$4 = collection;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$5 = it;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$6 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$7 = null;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.L$8 = collection;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.Z$0 = z2;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.label = 1;
                        Object m = m(oVar, wn70Var2, z2, superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1);
                        if (m == obj2) {
                            return obj2;
                        }
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$13 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1;
                        z4 = z2;
                        obj = m;
                        collection2 = collection;
                        collection.add((o) obj);
                        z2 = z4;
                        collection = collection2;
                        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$13;
                        if (it.hasNext()) {
                            return new FormattedText((List) collection);
                        }
                    }
                }
            }
        }
        superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1 = new SuperappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1(this, continuationImpl);
        Object obj3 = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$applyTrackingCardStyledColor$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(FormattedText formattedText, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1 superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1;
        int i;
        ru.yandex.taxi.widget.c cVar;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1) {
            superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1 = (SuperappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (formattedText == null) {
                        return null;
                    }
                    superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$1 = null;
                    ru.yandex.taxi.widget.c cVar2 = this.i;
                    superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$2 = cVar2;
                    superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.Z$0 = z;
                    superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label = 1;
                    Object o = o(formattedText, wn70Var, z, superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1);
                    if (o != obj2) {
                        obj = o;
                        cVar = cVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                z = superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.Z$0;
                cVar = (ru.yandex.taxi.widget.c) superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$2;
                kotlin.b.b(obj);
                superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$0 = null;
                superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$1 = null;
                superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$2 = null;
                superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.Z$0 = z;
                superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label = 2;
                Object i3 = ru.yandex.taxi.widget.c.i(cVar, (FormattedText) obj, null, superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1, 30);
                return i3 != obj2 ? obj2 : i3;
            }
        }
        superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1 = new SuperappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1(this, continuationImpl);
        Object obj3 = superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label;
        if (i != 0) {
        }
        superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$0 = null;
        superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$1 = null;
        superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.L$2 = null;
        superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.Z$0 = z;
        superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1.label = 2;
        Object i32 = ru.yandex.taxi.widget.c.i(cVar, (FormattedText) obj3, null, superappTrackingCardUiStateInteractor$convertFormattedTextWithTrackingColor$1, 30);
        if (i32 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(r7p0 r7p0Var, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1 superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object f;
        r7p0 r7p0Var2;
        int i2;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1) {
            superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1 = (SuperappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1) continuationImpl;
            int i3 = superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label = i3 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label;
                y yVar = this.k;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.L$0 = r7p0Var;
                    superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label = 1;
                    obj = yVar.f(superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.I$0;
                        r7p0Var2 = (r7p0) superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.L$0;
                        kotlin.b.b(obj);
                        return new a78(i2, !((Boolean) obj).booleanValue() ? qje.t(xng0.textInvert, context) : qje.t(xng0.textMain, context), gw00.e(new Pair(r7p0Var2.a(), new w68(0.0f, tje.s(mrg0.component_text_size_subtitle, context), 24))));
                    }
                    r7p0Var = (r7p0) superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.L$0;
                    kotlin.b.b(obj);
                }
                int t = !((Boolean) obj).booleanValue() ? qje.t(aog0.trackingControlMinor, context) : qje.t(xng0.controlMinor, context);
                superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.L$0 = r7p0Var;
                superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.I$0 = t;
                superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label = 2;
                f = yVar.f(superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1);
                if (f != coroutineSingletons) {
                    r7p0Var2 = r7p0Var;
                    i2 = t;
                    obj = f;
                    return new a78(i2, !((Boolean) obj).booleanValue() ? qje.t(xng0.textInvert, context) : qje.t(xng0.textMain, context), gw00.e(new Pair(r7p0Var2.a(), new w68(0.0f, tje.s(mrg0.component_text_size_subtitle, context), 24))));
                }
                return coroutineSingletons;
            }
        }
        superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1 = new SuperappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1(this, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label;
        y yVar2 = this.k;
        Context context2 = this.a;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.L$0 = r7p0Var;
        superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.I$0 = t;
        superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1.label = 2;
        f = yVar2.f(superappTrackingCardUiStateInteractor$createScootersMultiOrderV2CarPlatesFormatter$1);
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final String s(String str) {
        if (str != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                return ((m7x0) this.e).a(str);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        if (r2 == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(z2p z2pVar, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getActionButtonUiState$1 superappTrackingCardUiStateInteractor$getActionButtonUiState$1;
        Object obj;
        int i;
        o[] oVarArr;
        String h;
        int i2;
        boolean z2;
        z2p z2pVar2;
        FormattedText.d dVar;
        o[] oVarArr2;
        FormattedText.VerticalAlignment verticalAlignment;
        int i3;
        wn70 wn70Var2;
        String f;
        FormattedText.h hVar;
        String g;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getActionButtonUiState$1) {
            superappTrackingCardUiStateInteractor$getActionButtonUiState$1 = (SuperappTrackingCardUiStateInteractor$getActionButtonUiState$1) continuationImpl;
            int i4 = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = i4 - Integer.MIN_VALUE;
                obj = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z2pVar == null) {
                        return null;
                    }
                    oVarArr = new o[2];
                    h = z2pVar.h();
                    i2 = 0;
                    if (h != null) {
                        verticalAlignment = FormattedText.VerticalAlignment.CENTER;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = z2pVar;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = wn70Var;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2 = oVarArr;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3 = h;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4 = verticalAlignment;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5 = oVarArr;
                        z2 = z;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0 = z2;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.I$0 = 0;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 1;
                        Object f2 = this.k.f(superappTrackingCardUiStateInteractor$getActionButtonUiState$1);
                        if (f2 != coroutineSingletons) {
                            z2pVar2 = z2pVar;
                            i3 = 0;
                            obj = f2;
                            wn70Var2 = wn70Var;
                            oVarArr2 = oVarArr;
                        }
                        return coroutineSingletons;
                    }
                    z2 = z;
                    z2pVar2 = z2pVar;
                    dVar = null;
                    oVarArr2 = oVarArr;
                    oVarArr[i2] = dVar;
                    f = z2pVar2.f();
                    if (f != null) {
                        hVar = new FormattedText.h(f, null, null, null, null, null, 2046);
                    } else {
                        hVar = null;
                    }
                    oVarArr2[1] = hVar;
                    FormattedText formattedText = new FormattedText(j73.A(oVarArr2));
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 2;
                    obj = ru.yandex.taxi.widget.c.i(this.i, formattedText, null, superappTrackingCardUiStateInteractor$getActionButtonUiState$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new m301((CharSequence) obj, null, 14);
                    }
                    i3 = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.I$0;
                    boolean z3 = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0;
                    oVarArr = (o[]) superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5;
                    verticalAlignment = (FormattedText.VerticalAlignment) superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4;
                    h = (String) superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3;
                    o[] oVarArr3 = (o[]) superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2;
                    wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1;
                    z2pVar2 = (z2p) superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0;
                    kotlin.b.b(obj);
                    z2 = z3;
                    oVarArr2 = oVarArr3;
                }
                FormattedText.VerticalAlignment verticalAlignment2 = verticalAlignment;
                String str = h;
                if (((Boolean) obj).booleanValue()) {
                    c501 g2 = z2pVar2.g();
                    if (g2 != null) {
                        g = g2.g();
                        if (g == null) {
                        }
                        dVar = new FormattedText.d(str, verticalAlignment2, g, 16, 32);
                        i2 = i3;
                        oVarArr[i2] = dVar;
                        f = z2pVar2.f();
                        if (f != null) {
                        }
                        oVarArr2[1] = hVar;
                        FormattedText formattedText2 = new FormattedText(j73.A(oVarArr2));
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0 = z2;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 2;
                        obj = ru.yandex.taxi.widget.c.i(this.i, formattedText2, null, superappTrackingCardUiStateInteractor$getActionButtonUiState$1, 30);
                    }
                    g = null;
                    if (g == null) {
                    }
                    dVar = new FormattedText.d(str, verticalAlignment2, g, 16, 32);
                    i2 = i3;
                    oVarArr[i2] = dVar;
                    f = z2pVar2.f();
                    if (f != null) {
                    }
                    oVarArr2[1] = hVar;
                    FormattedText formattedText22 = new FormattedText(j73.A(oVarArr2));
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 2;
                    obj = ru.yandex.taxi.widget.c.i(this.i, formattedText22, null, superappTrackingCardUiStateInteractor$getActionButtonUiState$1, 30);
                } else {
                    c501 g3 = z2pVar2.g();
                    if (g3 != null) {
                        g = A(g3, wn70Var2, z2);
                        if (g == null) {
                            g = "";
                        }
                        dVar = new FormattedText.d(str, verticalAlignment2, g, 16, 32);
                        i2 = i3;
                        oVarArr[i2] = dVar;
                        f = z2pVar2.f();
                        if (f != null) {
                        }
                        oVarArr2[1] = hVar;
                        FormattedText formattedText222 = new FormattedText(j73.A(oVarArr2));
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5 = null;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0 = z2;
                        superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 2;
                        obj = ru.yandex.taxi.widget.c.i(this.i, formattedText222, null, superappTrackingCardUiStateInteractor$getActionButtonUiState$1, 30);
                    }
                    g = null;
                    if (g == null) {
                    }
                    dVar = new FormattedText.d(str, verticalAlignment2, g, 16, 32);
                    i2 = i3;
                    oVarArr[i2] = dVar;
                    f = z2pVar2.f();
                    if (f != null) {
                    }
                    oVarArr2[1] = hVar;
                    FormattedText formattedText2222 = new FormattedText(j73.A(oVarArr2));
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$3 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$4 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.L$5 = null;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.Z$0 = z2;
                    superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label = 2;
                    obj = ru.yandex.taxi.widget.c.i(this.i, formattedText2222, null, superappTrackingCardUiStateInteractor$getActionButtonUiState$1, 30);
                }
            }
        }
        superappTrackingCardUiStateInteractor$getActionButtonUiState$1 = new SuperappTrackingCardUiStateInteractor$getActionButtonUiState$1(this, continuationImpl);
        obj = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getActionButtonUiState$1.label;
        if (i != 0) {
        }
        FormattedText.VerticalAlignment verticalAlignment22 = verticalAlignment;
        String str2 = h;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00fb, code lost:
    
        if (r3 == r5) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(g301 g301Var, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$3 superappTrackingCardUiStateInteractor$getCardHeaderUiState$3;
        Object obj;
        int i;
        g301 g301Var2;
        Object q;
        wn70 wn70Var2;
        g301 g301Var3;
        int i2;
        boolean z2;
        int i3;
        CharSequence charSequence;
        CharSequence charSequence2;
        p401 a;
        nm70 nm70Var;
        t401 d;
        CharSequence charSequence3;
        CharSequence charSequence4;
        nm70 nm70Var2;
        fn70 fn70Var;
        boolean z3;
        CharSequence charSequence5;
        CharSequence charSequence6;
        fn70 a2;
        int i4;
        CharSequence charSequence7;
        CharSequence charSequence8;
        t401 t401Var;
        nm70 nm70Var3;
        g301 g301Var4;
        wn70 wn70Var3;
        List singletonList;
        Object q2;
        CharSequence charSequence9;
        CharSequence charSequence10;
        g301 g301Var5;
        int i5;
        nm70 nm70Var4;
        t401 d2;
        boolean z4;
        wn70 wn70Var4 = wn70Var;
        boolean z5 = z;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$3) {
            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3 = (SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$3) continuationImpl;
            int i6 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = i6 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q401 c = g301Var.c().c();
                    FormattedText a3 = c != null ? c.a() : null;
                    g301Var2 = g301Var;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var2;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = wn70Var4;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z5;
                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 1;
                    obj2 = q(a3, wn70Var4, z5, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                i4 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0;
                                nm70Var3 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$6;
                                charSequence7 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5;
                                charSequence8 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4;
                                t401Var = (t401) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2;
                                wn70Var3 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1;
                                g301Var4 = (g301) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0;
                                kotlin.b.b(obj2);
                                CharSequence charSequence11 = charSequence7;
                                i3 = i4;
                                singletonList = Collections.singletonList(um70.a(new UiStateDrawableWrapper(null, (Drawable) obj2)));
                                charSequence2 = charSequence11;
                                nm70Var = nm70Var3;
                                g301Var3 = g301Var4;
                                d = t401Var;
                                wn70Var2 = wn70Var3;
                                charSequence = charSequence8;
                                String b = ((o401) d).b();
                                charSequence3 = charSequence2;
                                fn70Var = new an70(singletonList, b != null ? C(b, wn70Var2) : null, ym70.f);
                                charSequence4 = charSequence;
                                nm70Var2 = nm70Var;
                                d2 = g301Var3.c().d();
                                if (!(d2 instanceof h401)) {
                                }
                                return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                            }
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i5 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0;
                                charSequence9 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$6;
                                nm70Var4 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5;
                                charSequence10 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4;
                                charSequence5 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$3;
                                g301Var5 = (g301) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0;
                                kotlin.b.b(obj2);
                                fn70Var = om70.a(new m301(charSequence9, (CharSequence) obj2, 12));
                                nm70Var2 = nm70Var4;
                                g301Var3 = g301Var5;
                                charSequence3 = charSequence10;
                                charSequence4 = charSequence5;
                                i3 = i5;
                                d2 = g301Var3.c().d();
                                if (!(d2 instanceof h401)) {
                                    z4 = true;
                                } else {
                                    if (!(d2 instanceof i401) && !(d2 instanceof o401) && !(d2 instanceof s401) && !(d2 instanceof u401) && d2 != null) {
                                        w511.b();
                                        return null;
                                    }
                                    z4 = false;
                                }
                                return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                            }
                            i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1;
                            i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0;
                            boolean z6 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0;
                            nm70 nm70Var5 = (nm70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5;
                            charSequence6 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4;
                            CharSequence charSequence12 = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$3;
                            t401 t401Var2 = (t401) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2;
                            wn70Var2 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1;
                            g301 g301Var6 = (g301) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0;
                            kotlin.b.b(obj2);
                            z3 = z6;
                            charSequence5 = charSequence12;
                            d = t401Var2;
                            g301Var3 = g301Var6;
                            nm70Var = nm70Var5;
                            CharSequence charSequence13 = (CharSequence) obj2;
                            FormattedText b2 = ((h401) d).a().b();
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2 = null;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$3 = charSequence5;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4 = charSequence6;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5 = nm70Var;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$6 = charSequence13;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0 = i3;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1 = i2;
                            superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 5;
                            q2 = q(b2, wn70Var2, z3, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
                            if (q2 != obj) {
                                charSequence9 = charSequence13;
                                charSequence10 = charSequence6;
                                g301Var5 = g301Var3;
                                obj2 = q2;
                                i5 = i3;
                                nm70Var4 = nm70Var;
                                fn70Var = om70.a(new m301(charSequence9, (CharSequence) obj2, 12));
                                nm70Var2 = nm70Var4;
                                g301Var3 = g301Var5;
                                charSequence3 = charSequence10;
                                charSequence4 = charSequence5;
                                i3 = i5;
                                d2 = g301Var3.c().d();
                                if (!(d2 instanceof h401)) {
                                }
                                return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                            }
                            return obj;
                        }
                        i2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1;
                        i3 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0;
                        z2 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0;
                        charSequence = (CharSequence) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2;
                        wn70 wn70Var5 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1;
                        g301Var3 = (g301) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0;
                        kotlin.b.b(obj2);
                        wn70Var2 = wn70Var5;
                        charSequence2 = (CharSequence) obj2;
                        a = g301Var3.c().a();
                        if (!(a instanceof i401)) {
                            nm70Var = D((i401) a);
                        } else if (a instanceof j401) {
                            j401 j401Var = (j401) a;
                            nm70Var = new mm70(j401Var.b(), j401Var.a());
                        } else {
                            if (a != null) {
                                w511.b();
                                return null;
                            }
                            nm70Var = null;
                        }
                        d = g301Var3.c().d();
                        if (!(d instanceof i401)) {
                            a2 = D((i401) d);
                        } else {
                            if (!(d instanceof u401)) {
                                if (d instanceof o401) {
                                    n401 a4 = ((o401) d).a();
                                    if (a4 instanceof m401) {
                                        singletonList = Collections.singletonList(wm70.a(((m401) a4).a()));
                                        String b3 = ((o401) d).b();
                                        charSequence3 = charSequence2;
                                        fn70Var = new an70(singletonList, b3 != null ? C(b3, wn70Var2) : null, ym70.f);
                                        charSequence4 = charSequence;
                                        nm70Var2 = nm70Var;
                                        d2 = g301Var3.c().d();
                                        if (!(d2 instanceof h401)) {
                                        }
                                        return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                                    }
                                    if (!(a4 instanceof l401)) {
                                        w511.b();
                                        return null;
                                    }
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = wn70Var2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2 = d;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$3 = null;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4 = charSequence;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5 = charSequence2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$6 = nm70Var;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0 = i3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1 = i2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 3;
                                    Object c2 = this.m.c((l401) a4, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
                                    if (c2 != obj) {
                                        obj2 = c2;
                                        i4 = i3;
                                        charSequence7 = charSequence2;
                                        charSequence8 = charSequence;
                                        t401Var = d;
                                        nm70Var3 = nm70Var;
                                        g301Var4 = g301Var3;
                                        wn70Var3 = wn70Var2;
                                        CharSequence charSequence112 = charSequence7;
                                        i3 = i4;
                                        singletonList = Collections.singletonList(um70.a(new UiStateDrawableWrapper(null, (Drawable) obj2)));
                                        charSequence2 = charSequence112;
                                        nm70Var = nm70Var3;
                                        g301Var3 = g301Var4;
                                        d = t401Var;
                                        wn70Var2 = wn70Var3;
                                        charSequence = charSequence8;
                                        String b32 = ((o401) d).b();
                                        charSequence3 = charSequence2;
                                        fn70Var = new an70(singletonList, b32 != null ? C(b32, wn70Var2) : null, ym70.f);
                                        charSequence4 = charSequence;
                                        nm70Var2 = nm70Var;
                                        d2 = g301Var3.c().d();
                                        if (!(d2 instanceof h401)) {
                                        }
                                        return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                                    }
                                } else if (d instanceof s401) {
                                    s401 s401Var = (s401) d;
                                    String b4 = s401Var.a().b();
                                    c501 a5 = s401Var.a().a();
                                    bdc p = p(wn70Var2, aog0.trackingControlMain, xng0.controlMain);
                                    f fVar = (f) this.l;
                                    n301 n301Var = new n301(b4, fVar.a(a5, p, z2));
                                    List b5 = s401Var.b();
                                    ArrayList arrayList = new ArrayList(tcc.n(b5, 10));
                                    Iterator it = b5.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new o301(fVar.a((c501) it.next(), p(wn70Var2, aog0.trackingControlMinor, xng0.controlMinor), z2)));
                                    }
                                    a2 = dn70.a(new p301(n301Var, arrayList));
                                } else {
                                    if (!(d instanceof h401)) {
                                        if (d != null) {
                                            w511.b();
                                            return null;
                                        }
                                        charSequence3 = charSequence2;
                                        charSequence4 = charSequence;
                                        nm70Var2 = nm70Var;
                                        fn70Var = null;
                                        d2 = g301Var3.c().d();
                                        if (!(d2 instanceof h401)) {
                                        }
                                        return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                                    }
                                    FormattedText c3 = ((h401) d).a().c();
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = wn70Var2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2 = d;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$3 = charSequence;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4 = charSequence2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5 = nm70Var;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0 = i3;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1 = i2;
                                    superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 4;
                                    Object q3 = q(c3, wn70Var2, z2, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
                                    if (q3 != obj) {
                                        CharSequence charSequence14 = charSequence;
                                        z3 = z2;
                                        charSequence5 = charSequence14;
                                        charSequence6 = charSequence2;
                                        obj2 = q3;
                                        CharSequence charSequence132 = (CharSequence) obj2;
                                        FormattedText b22 = ((h401) d).a().b();
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var3;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2 = null;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$3 = charSequence5;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$4 = charSequence6;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$5 = nm70Var;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$6 = charSequence132;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z3;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0 = i3;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1 = i2;
                                        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 5;
                                        q2 = q(b22, wn70Var2, z3, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
                                        if (q2 != obj) {
                                        }
                                    }
                                }
                                return obj;
                            }
                            a2 = bn70.a(((u401) d).a());
                        }
                        fn70Var = a2;
                        charSequence3 = charSequence2;
                        charSequence4 = charSequence;
                        nm70Var2 = nm70Var;
                        d2 = g301Var3.c().d();
                        if (!(d2 instanceof h401)) {
                        }
                        return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                    }
                    boolean z7 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0;
                    wn70 wn70Var6 = (wn70) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1;
                    g301Var2 = (g301) superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0;
                    kotlin.b.b(obj2);
                    z5 = z7;
                    wn70Var4 = wn70Var6;
                }
                CharSequence charSequence15 = (CharSequence) obj2;
                q401 c4 = g301Var2.c().c();
                int i7 = (c4 == null && c4.b()) ? 1 : 0;
                q401 b6 = g301Var2.c().b();
                FormattedText a6 = b6 == null ? b6.a() : null;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var2;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = wn70Var4;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2 = charSequence15;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z5;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0 = i7;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1 = 0;
                superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 2;
                q = q(a6, wn70Var4, z5, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
                if (q != obj) {
                    wn70Var2 = wn70Var4;
                    g301Var3 = g301Var2;
                    i2 = 0;
                    z2 = z5;
                    i3 = i7;
                    charSequence = charSequence15;
                    obj2 = q;
                    charSequence2 = (CharSequence) obj2;
                    a = g301Var3.c().a();
                    if (!(a instanceof i401)) {
                    }
                    d = g301Var3.c().d();
                    if (!(d instanceof i401)) {
                    }
                    fn70Var = a2;
                    charSequence3 = charSequence2;
                    charSequence4 = charSequence;
                    nm70Var2 = nm70Var;
                    d2 = g301Var3.c().d();
                    if (!(d2 instanceof h401)) {
                    }
                    return new hn70(charSequence4, null, null, null, null, i3 == 0, null, charSequence3, null, nm70Var2, fn70Var, z4, 0, null, false, 0L, 0L, null, 2089678);
                }
                return obj;
            }
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3 = new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$3(this, continuationImpl);
        Object obj22 = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label;
        if (i != 0) {
        }
        CharSequence charSequence152 = (CharSequence) obj22;
        q401 c42 = g301Var2.c().c();
        if (c42 == null) {
        }
        q401 b62 = g301Var2.c().b();
        if (b62 == null) {
        }
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$0 = g301Var2;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$1 = wn70Var4;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.L$2 = charSequence152;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.Z$0 = z5;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$0 = i7;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.I$1 = 0;
        superappTrackingCardUiStateInteractor$getCardHeaderUiState$3.label = 2;
        q = q(a6, wn70Var4, z5, superappTrackingCardUiStateInteractor$getCardHeaderUiState$3);
        if (q != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(d3p d3pVar, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1 superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1;
        Object obj;
        int i;
        z2p m;
        Object t;
        m301 m301Var;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1) {
            superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1 = (SuperappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z2p c = d3pVar.c();
                    m = d3pVar.m();
                    if (c == null && m == null) {
                        return null;
                    }
                    superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$1 = wn70Var;
                    superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$3 = m;
                    superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.Z$0 = z;
                    superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label = 1;
                    obj2 = t(c, wn70Var, z, superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m301Var = (m301) superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$4;
                        kotlin.b.b(obj2);
                        return new yl70(m301Var, (m301) obj2);
                    }
                    z = superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.Z$0;
                    m = (z2p) superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$3;
                    wn70Var = (wn70) superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$1;
                    kotlin.b.b(obj2);
                }
                m301 m301Var2 = (m301) obj2;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$0 = null;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$1 = null;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$2 = null;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$3 = null;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$4 = m301Var2;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.Z$0 = z;
                superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label = 2;
                t = t(m, wn70Var, z, superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1);
                if (t != obj) {
                    obj2 = t;
                    m301Var = m301Var2;
                    return new yl70(m301Var, (m301) obj2);
                }
                return obj;
            }
        }
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1 = new SuperappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1(this, continuationImpl);
        Object obj22 = superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label;
        if (i != 0) {
        }
        m301 m301Var22 = (m301) obj22;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$0 = null;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$1 = null;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$2 = null;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$3 = null;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.L$4 = m301Var22;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.Z$0 = z;
        superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1.label = 2;
        t = t(m, wn70Var, z, superappTrackingCardUiStateInteractor$getEatsActionButtonsUiState$1);
        if (t != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(a3p a3pVar, wn70 wn70Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$getTimelineUiState$1 superappTrackingCardUiStateInteractor$getTimelineUiState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$getTimelineUiState$1) {
            superappTrackingCardUiStateInteractor$getTimelineUiState$1 = (SuperappTrackingCardUiStateInteractor$getTimelineUiState$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$getTimelineUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$getTimelineUiState$1.label = i2 - Integer.MIN_VALUE;
                obj = superappTrackingCardUiStateInteractor$getTimelineUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$getTimelineUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (a3pVar != null) {
                        superappTrackingCardUiStateInteractor$getTimelineUiState$1.L$0 = a3pVar;
                        superappTrackingCardUiStateInteractor$getTimelineUiState$1.L$1 = wn70Var;
                        superappTrackingCardUiStateInteractor$getTimelineUiState$1.Z$0 = z;
                        superappTrackingCardUiStateInteractor$getTimelineUiState$1.label = 1;
                        obj = this.k.v(superappTrackingCardUiStateInteractor$getTimelineUiState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = superappTrackingCardUiStateInteractor$getTimelineUiState$1.Z$0;
                wn70Var = (wn70) superappTrackingCardUiStateInteractor$getTimelineUiState$1.L$1;
                a3pVar = (a3p) superappTrackingCardUiStateInteractor$getTimelineUiState$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    b3p b3pVar = (b3p) kotlin.collections.a.S(a3pVar.a(), a3pVar.b());
                    if (b3pVar != null) {
                        String b = b3pVar.b();
                        c501 a = b3pVar.a();
                        bdc p = p(wn70Var, aog0.trackingControlMain, xng0.controlMain);
                        f fVar = (f) this.l;
                        n301 n301Var = new n301(b, fVar.a(a, p, z));
                        List b2 = a3pVar.b();
                        ArrayList arrayList = new ArrayList(tcc.n(b2, 10));
                        int i3 = 0;
                        for (Object obj2 : b2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            arrayList.add(new o301(fVar.a(((b3p) obj2).a(), i3 <= a3pVar.a() ? p(wn70Var, aog0.trackingControlMain, xng0.controlMain) : p(wn70Var, aog0.trackingControlMinor, xng0.controlMinor), z)));
                            i3 = i4;
                        }
                        return new p301(n301Var, arrayList);
                    }
                }
                return null;
            }
        }
        superappTrackingCardUiStateInteractor$getTimelineUiState$1 = new SuperappTrackingCardUiStateInteractor$getTimelineUiState$1(this, continuationImpl);
        obj = superappTrackingCardUiStateInteractor$getTimelineUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$getTimelineUiState$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(String str, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$ratingImageFlow$1 superappTrackingCardUiStateInteractor$ratingImageFlow$1;
        int i;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        tpr l;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$ratingImageFlow$1) {
            superappTrackingCardUiStateInteractor$ratingImageFlow$1 = (SuperappTrackingCardUiStateInteractor$ratingImageFlow$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$ratingImageFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$ratingImageFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$ratingImageFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$ratingImageFlow$1.label;
                int i3 = 2;
                ru.yandex.taxi.widget.utils.e eVar = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        return new g92(i3, uiStateDrawableWrapper);
                    }
                    superappTrackingCardUiStateInteractor$ratingImageFlow$1.L$0 = str;
                    superappTrackingCardUiStateInteractor$ratingImageFlow$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.o(eVar, str, null, superappTrackingCardUiStateInteractor$ratingImageFlow$1, 14);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) superappTrackingCardUiStateInteractor$ratingImageFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                uiStateDrawableWrapper = bitmapDrawable != null ? pkf.g(bitmapDrawable, str, null) : null;
                if (uiStateDrawableWrapper == null) {
                    return new g92(i3, uiStateDrawableWrapper);
                }
                l = eVar.l(str, 0, 0, pfv.a);
                return new b(l, str);
            }
        }
        superappTrackingCardUiStateInteractor$ratingImageFlow$1 = new SuperappTrackingCardUiStateInteractor$ratingImageFlow$1(this, continuationImpl);
        Object obj2 = superappTrackingCardUiStateInteractor$ratingImageFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$ratingImageFlow$1.label;
        int i32 = 2;
        ru.yandex.taxi.widget.utils.e eVar2 = this.g;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        if (bitmapDrawable2 != null) {
        }
        if (uiStateDrawableWrapper == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(String str, ContinuationImpl continuationImpl) {
        SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1 superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1) {
            superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1 = (SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1) continuationImpl;
            int i2 = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.label = 1;
                    obj = y(str, superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new d((tpr) obj, this);
            }
        }
        superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1 = new SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1(this, continuationImpl);
        Object obj3 = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$1.label;
        if (i != 0) {
        }
        return new d((tpr) obj3, this);
    }
}
