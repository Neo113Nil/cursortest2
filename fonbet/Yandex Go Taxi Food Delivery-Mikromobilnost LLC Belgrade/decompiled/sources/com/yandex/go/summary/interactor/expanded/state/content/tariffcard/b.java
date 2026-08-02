package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffDescriptionTextStyleUiState;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsHeaderRedesignExperiment;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.zone.dto.objects.AttributedDescription;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import defpackage.a1f0;
import defpackage.a6t0;
import defpackage.aau;
import defpackage.adu;
import defpackage.au2;
import defpackage.avj0;
import defpackage.bl00;
import defpackage.cvu0;
import defpackage.d1h0;
import defpackage.d6b1;
import defpackage.d9s;
import defpackage.dwh0;
import defpackage.evu0;
import defpackage.fbu;
import defpackage.fkx0;
import defpackage.gbu;
import defpackage.gcx0;
import defpackage.hbu;
import defpackage.hgx0;
import defpackage.hh4;
import defpackage.ibu;
import defpackage.iq2;
import defpackage.ize0;
import defpackage.jbu;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.jze0;
import defpackage.kbu;
import defpackage.kyh0;
import defpackage.kze0;
import defpackage.l8v;
import defpackage.lbu;
import defpackage.lgv;
import defpackage.mbu;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.nbu;
import defpackage.ncu;
import defpackage.ngx0;
import defpackage.nnm;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.o9u;
import defpackage.ovi0;
import defpackage.p0c0;
import defpackage.p9u;
import defpackage.pdu;
import defpackage.pex0;
import defpackage.pwy0;
import defpackage.pzt;
import defpackage.q5z;
import defpackage.q9u;
import defpackage.qdu;
import defpackage.r9u;
import defpackage.rdu;
import defpackage.rex0;
import defpackage.rya1;
import defpackage.s0c0;
import defpackage.sex0;
import defpackage.sfx0;
import defpackage.sjp;
import defpackage.sq00;
import defpackage.tex0;
import defpackage.tfx0;
import defpackage.tze0;
import defpackage.u92;
import defpackage.u9u;
import defpackage.up2;
import defpackage.uq90;
import defpackage.uze0;
import defpackage.v9u;
import defpackage.vfx0;
import defpackage.viv0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wp2;
import defpackage.x0f0;
import defpackage.x91;
import defpackage.xdu;
import defpackage.xo40;
import defpackage.y0f0;
import defpackage.y9u;
import defpackage.ydu;
import defpackage.yex0;
import defpackage.zuj0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes14.dex */
public final class b {
    public final wiq0 a;
    public final vfx0 b;
    public final uze0 c;
    public final viv0 d;
    public final com.yandex.go.route.interactor.c e;
    public final zuj0 f;
    public final fkx0 g;
    public final com.yandex.go.tariffcard.ui.f h;
    public final hh4 i;
    public final pwy0 j;
    public final o0 k;
    public final v9u l;
    public final sjp m;
    public final d n;
    public final com.yandex.go.pin.api.widget.b o;
    public final s0c0 p;
    public final sfx0 q;
    public final ru.yandex.taxi.widget.utils.e r;
    public volatile xdu s;

    public b(wiq0 wiq0Var, vfx0 vfx0Var, uze0 uze0Var, viv0 viv0Var, com.yandex.go.route.interactor.c cVar, zuj0 zuj0Var, fkx0 fkx0Var, com.yandex.go.tariffcard.ui.f fVar, hh4 hh4Var, pwy0 pwy0Var, o0 o0Var, v9u v9uVar, sjp sjpVar, d dVar, com.yandex.go.pin.api.widget.b bVar, s0c0 s0c0Var, sfx0 sfx0Var, ru.yandex.taxi.widget.utils.e eVar) {
        this.a = wiq0Var;
        this.b = vfx0Var;
        this.c = uze0Var;
        this.d = viv0Var;
        this.e = cVar;
        this.f = zuj0Var;
        this.g = fkx0Var;
        this.h = fVar;
        this.i = hh4Var;
        this.j = pwy0Var;
        this.k = o0Var;
        this.l = v9uVar;
        this.m = sjpVar;
        this.n = dVar;
        this.o = bVar;
        this.p = s0c0Var;
        this.q = sfx0Var;
        this.r = eVar;
    }

    public final CharSequence a(Integer num, String str) {
        if (num == null) {
            return str;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " ");
        Drawable t = vng.t(num.intValue(), ((avj0) this.f).a);
        return append.append(" ", t != null ? new CustomImageSpan(t, 2, false, false, null, 28, null) : null, 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.go.summary.interactor.expanded.state.content.tariffcard.b] */
    /* JADX WARN: Type inference failed for: r9v3, types: [nvi0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, ovi0 ovi0Var, gcx0 gcx0Var, r9u r9uVar, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getBackgroundHeaderUiState$1 headerUiStateInteractor$getBackgroundHeaderUiState$1;
        int i;
        String str;
        ovi0 ovi0Var2;
        if (continuationImpl instanceof HeaderUiStateInteractor$getBackgroundHeaderUiState$1) {
            headerUiStateInteractor$getBackgroundHeaderUiState$1 = (HeaderUiStateInteractor$getBackgroundHeaderUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getBackgroundHeaderUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getBackgroundHeaderUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$getBackgroundHeaderUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getBackgroundHeaderUiState$1.label;
                u9u u9uVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pex0 pex0Var = mi31Var.a;
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.L$0 = null;
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.L$1 = null;
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.L$2 = ovi0Var;
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.L$3 = null;
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.L$4 = r9uVar;
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.L$5 = "header";
                    headerUiStateInteractor$getBackgroundHeaderUiState$1.label = 1;
                    Object d = d(pex0Var, priceUpdate$PriceLoadingState, gcx0Var, headerUiStateInteractor$getBackgroundHeaderUiState$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = d;
                    str = "header";
                    ovi0Var2 = ovi0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) headerUiStateInteractor$getBackgroundHeaderUiState$1.L$5;
                    r9uVar = (r9u) headerUiStateInteractor$getBackgroundHeaderUiState$1.L$4;
                    ?? r9 = (nvi0) headerUiStateInteractor$getBackgroundHeaderUiState$1.L$2;
                    kotlin.b.b(obj);
                    ovi0Var2 = r9;
                }
                aau aauVar = (aau) obj;
                v9u v9uVar = this.l;
                long j = v9uVar.b;
                if (!(r9uVar instanceof o9u)) {
                    if (r9uVar instanceof p9u) {
                        p9u p9uVar = (p9u) r9uVar;
                        pzt g = v9uVar.g(p9uVar.b);
                        pzt g2 = v9uVar.g(p9uVar.c);
                        if (g != null || g2 != null) {
                            u9uVar = new u9u(g, g2);
                        }
                    } else {
                        if (!jl40.l(r9uVar, q9u.a)) {
                            w511.b();
                            return null;
                        }
                        u9uVar = new u9u(new pzt(new up2(v9uVar.c), new up2(j), 0.5f), new pzt(new up2(v9uVar.d), new up2(j), 0.667f));
                    }
                }
                return new pdu(str, aauVar, ovi0Var2, u9uVar);
            }
        }
        headerUiStateInteractor$getBackgroundHeaderUiState$1 = new HeaderUiStateInteractor$getBackgroundHeaderUiState$1(this, continuationImpl);
        Object obj2 = headerUiStateInteractor$getBackgroundHeaderUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getBackgroundHeaderUiState$1.label;
        u9u u9uVar2 = null;
        if (i != 0) {
        }
        aau aauVar2 = (aau) obj2;
        v9u v9uVar2 = this.l;
        long j2 = v9uVar2.b;
        if (!(r9uVar instanceof o9u)) {
        }
        return new pdu(str, aauVar2, ovi0Var2, u9uVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getCarHeaderUiState$1 headerUiStateInteractor$getCarHeaderUiState$1;
        int i;
        mi31 mi31Var2;
        String str;
        String d;
        nvi0 b;
        if (continuationImpl instanceof HeaderUiStateInteractor$getCarHeaderUiState$1) {
            headerUiStateInteractor$getCarHeaderUiState$1 = (HeaderUiStateInteractor$getCarHeaderUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getCarHeaderUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getCarHeaderUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$getCarHeaderUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getCarHeaderUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pex0 pex0Var = mi31Var.a;
                    headerUiStateInteractor$getCarHeaderUiState$1.L$0 = mi31Var;
                    headerUiStateInteractor$getCarHeaderUiState$1.L$1 = null;
                    headerUiStateInteractor$getCarHeaderUiState$1.L$2 = null;
                    headerUiStateInteractor$getCarHeaderUiState$1.L$3 = "header";
                    headerUiStateInteractor$getCarHeaderUiState$1.label = 1;
                    obj = d(pex0Var, priceUpdate$PriceLoadingState, gcx0Var, headerUiStateInteractor$getCarHeaderUiState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    mi31Var2 = mi31Var;
                    str = "header";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) headerUiStateInteractor$getCarHeaderUiState$1.L$3;
                    mi31Var2 = (mi31) headerUiStateInteractor$getCarHeaderUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                aau aauVar = (aau) obj;
                String str2 = mi31Var2.b;
                String str3 = mi31Var2.f;
                pex0 pex0Var2 = mi31Var2.a;
                d = this.d.d(str2, str3, pex0Var2.K0);
                if (d == null) {
                    b = mja1.a(d, null, 6);
                } else {
                    String str4 = pex0Var2.i;
                    if (str4 == null) {
                        str4 = "";
                    }
                    b = mja1.b(str4, null, 6);
                }
                return new qdu(str, aauVar, new y9u(b));
            }
        }
        headerUiStateInteractor$getCarHeaderUiState$1 = new HeaderUiStateInteractor$getCarHeaderUiState$1(this, continuationImpl);
        Object obj3 = headerUiStateInteractor$getCarHeaderUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getCarHeaderUiState$1.label;
        if (i != 0) {
        }
        aau aauVar2 = (aau) obj3;
        String str22 = mi31Var2.b;
        String str32 = mi31Var2.f;
        pex0 pex0Var22 = mi31Var2.a;
        d = this.d.d(str22, str32, pex0Var22.K0);
        if (d == null) {
        }
        return new qdu(str, aauVar2, new y9u(b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0277, code lost:
    
        if (r7 == r6) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getHeaderInfoUiState$1 headerUiStateInteractor$getHeaderInfoUiState$1;
        Object obj;
        int i;
        ncu ncuVar;
        yex0 yex0Var;
        Object l;
        Object h;
        ncu ncuVar2;
        hgx0 hgx0Var;
        pex0 pex0Var2 = pex0Var;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
        gcx0 gcx0Var2 = gcx0Var;
        if (continuationImpl instanceof HeaderUiStateInteractor$getHeaderInfoUiState$1) {
            headerUiStateInteractor$getHeaderInfoUiState$1 = (HeaderUiStateInteractor$getHeaderInfoUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getHeaderInfoUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getHeaderInfoUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = headerUiStateInteractor$getHeaderInfoUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getHeaderInfoUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Integer valueOf = pex0Var2.u0 == TariffOrderFlow.DELIVERY_FLOW ? Integer.valueOf(d1h0.ic_chevron_next_inverted) : null;
                    com.yandex.go.route.interactor.c cVar = this.e;
                    String F = q5z.F(cVar.g());
                    int size = cVar.c().b.size();
                    zuj0 zuj0Var = this.f;
                    String f = size > 1 ? ((avj0) zuj0Var).f(dwh0.summary_route_stops, cVar.c().b.size()) : q5z.F(cVar.d());
                    Pair pair = evu0.J(f) ? new Pair(a(valueOf, F), f) : new Pair(F, a(valueOf, f));
                    CharSequence charSequence = (CharSequence) pair.getFirst();
                    CharSequence charSequence2 = (CharSequence) pair.getSecond();
                    StringBuilder sb = new StringBuilder();
                    if (!evu0.J(charSequence)) {
                        sb.append(((avj0) zuj0Var).h(kyh0.new_mainscreen_from) + Extension.FIX_SPACE + ((Object) charSequence));
                    }
                    if (!evu0.J(charSequence2)) {
                        sb.append(Extension.FIX_SPACE + ((avj0) zuj0Var).h(kyh0.select_address_to) + Extension.FIX_SPACE + ((Object) charSequence2));
                    }
                    x91 x91Var = new x91(charSequence, charSequence2, gcx0Var2.d, gcx0Var2.c, sb.toString());
                    if (((tfx0) this.q).a(pex0Var2)) {
                        au2 au2Var = d6b1.b;
                        if (au2Var == null) {
                            lgv lgvVar = new lgv("Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                            a6t0 a6t0Var = new a6t0(iq2.g);
                            uq90 e = nnm.e(20.0f, 12.0f);
                            e.b(8.0f, 8.0f, true, true, -16.0f, 0.0f);
                            e.b(8.0f, 8.0f, false, true, 16.0f, 0.0f);
                            e.k(2.0f, 0.0f);
                            e.b(10.0f, 10.0f, true, true, -20.0f, 0.0f);
                            e.b(10.0f, 10.0f, false, true, 20.0f, 0.0f);
                            e.j(12.0f, 9.0f);
                            e.b(1.0f, 1.0f, true, false, 0.0f, -2.0f);
                            e.b(1.0f, 1.0f, false, false, 0.0f, 2.0f);
                            e.k(1.0f, 5.5f);
                            e.e(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
                            e.g(0.5f);
                            e.p(1.0f);
                            e.g(-4.0f);
                            e.p(-1.0f);
                            e.g(0.5f);
                            e.b(0.5f, 0.5f, false, false, 0.5f, -0.5f);
                            e.o(11.0f);
                            e.b(0.5f, 0.5f, false, false, -0.5f, -0.5f);
                            e.f(10.0f);
                            e.p(-1.0f);
                            e.g(2.5f);
                            e.e(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
                            e.c();
                            lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                            au2Var = rya1.a(lgvVar.d(), true);
                            d6b1.b = au2Var;
                        }
                        avj0 avj0Var = (avj0) zuj0Var;
                        yex0Var = new yex0(au2Var, gcx0Var2.b, avj0Var.h(kyh0.summary_accessibility_tariff_details), avj0Var.h(kyh0.summary_accessibility_open_tariff_details));
                    } else {
                        yex0Var = null;
                    }
                    ncuVar = new ncu(x91Var, yex0Var);
                    headerUiStateInteractor$getHeaderInfoUiState$1.L$0 = pex0Var2;
                    headerUiStateInteractor$getHeaderInfoUiState$1.L$1 = priceUpdate$PriceLoadingState2;
                    headerUiStateInteractor$getHeaderInfoUiState$1.L$2 = gcx0Var2;
                    headerUiStateInteractor$getHeaderInfoUiState$1.L$3 = ncuVar;
                    headerUiStateInteractor$getHeaderInfoUiState$1.label = 1;
                    l = l(pex0Var2, priceUpdate$PriceLoadingState2, gcx0Var2, headerUiStateInteractor$getHeaderInfoUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hgx0Var = (hgx0) headerUiStateInteractor$getHeaderInfoUiState$1.L$4;
                        ncuVar2 = (ncu) headerUiStateInteractor$getHeaderInfoUiState$1.L$3;
                        kotlin.b.b(obj2);
                        return new aau(ncuVar2, hgx0Var, (tze0) obj2);
                    }
                    ncu ncuVar3 = (ncu) headerUiStateInteractor$getHeaderInfoUiState$1.L$3;
                    gcx0 gcx0Var3 = (gcx0) headerUiStateInteractor$getHeaderInfoUiState$1.L$2;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = (PriceUpdate$PriceLoadingState) headerUiStateInteractor$getHeaderInfoUiState$1.L$1;
                    pex0 pex0Var3 = (pex0) headerUiStateInteractor$getHeaderInfoUiState$1.L$0;
                    kotlin.b.b(obj2);
                    ncuVar = ncuVar3;
                    pex0Var2 = pex0Var3;
                    l = obj2;
                    gcx0Var2 = gcx0Var3;
                    priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState3;
                }
                hgx0 hgx0Var2 = (hgx0) l;
                headerUiStateInteractor$getHeaderInfoUiState$1.L$0 = null;
                headerUiStateInteractor$getHeaderInfoUiState$1.L$1 = null;
                headerUiStateInteractor$getHeaderInfoUiState$1.L$2 = null;
                headerUiStateInteractor$getHeaderInfoUiState$1.L$3 = ncuVar;
                headerUiStateInteractor$getHeaderInfoUiState$1.L$4 = hgx0Var2;
                headerUiStateInteractor$getHeaderInfoUiState$1.label = 2;
                h = h(pex0Var2, priceUpdate$PriceLoadingState2, gcx0Var2, headerUiStateInteractor$getHeaderInfoUiState$1);
                if (h != obj) {
                    ncuVar2 = ncuVar;
                    obj2 = h;
                    hgx0Var = hgx0Var2;
                    return new aau(ncuVar2, hgx0Var, (tze0) obj2);
                }
                return obj;
            }
        }
        headerUiStateInteractor$getHeaderInfoUiState$1 = new HeaderUiStateInteractor$getHeaderInfoUiState$1(this, continuationImpl);
        Object obj22 = headerUiStateInteractor$getHeaderInfoUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getHeaderInfoUiState$1.label;
        if (i != 0) {
        }
        hgx0 hgx0Var22 = (hgx0) l;
        headerUiStateInteractor$getHeaderInfoUiState$1.L$0 = null;
        headerUiStateInteractor$getHeaderInfoUiState$1.L$1 = null;
        headerUiStateInteractor$getHeaderInfoUiState$1.L$2 = null;
        headerUiStateInteractor$getHeaderInfoUiState$1.L$3 = ncuVar;
        headerUiStateInteractor$getHeaderInfoUiState$1.L$4 = hgx0Var22;
        headerUiStateInteractor$getHeaderInfoUiState$1.label = 2;
        h = h(pex0Var2, priceUpdate$PriceLoadingState2, gcx0Var2, headerUiStateInteractor$getHeaderInfoUiState$1);
        if (h != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, MulticlassTariffsHeaderRedesignExperiment.Configuration configuration, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getMulticlassHeaderUiState$1 headerUiStateInteractor$getMulticlassHeaderUiState$1;
        Object obj;
        Object obj2;
        int i;
        ThemeType themeType;
        Object f;
        List list;
        List list2;
        jn40 jn40Var;
        mi31 mi31Var2;
        gcx0 gcx0Var2;
        Object d;
        String str;
        xo40 xo40Var;
        if (continuationImpl instanceof HeaderUiStateInteractor$getMulticlassHeaderUiState$1) {
            headerUiStateInteractor$getMulticlassHeaderUiState$1 = (HeaderUiStateInteractor$getMulticlassHeaderUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getMulticlassHeaderUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getMulticlassHeaderUiState$1.label = i2 - Integer.MIN_VALUE;
                HeaderUiStateInteractor$getMulticlassHeaderUiState$1 headerUiStateInteractor$getMulticlassHeaderUiState$12 = headerUiStateInteractor$getMulticlassHeaderUiState$1;
                obj = headerUiStateInteractor$getMulticlassHeaderUiState$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getMulticlassHeaderUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Map map = (Map) configuration.b.get(mi31Var.b);
                    List list3 = (map == null || (list2 = (List) map.get(mi31Var.f)) == null) ? configuration.a : list2;
                    themeType = this.j.getThemeType();
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$0 = mi31Var;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$1 = priceUpdate$PriceLoadingState;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$2 = gcx0Var;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$3 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$4 = list3;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$5 = themeType;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.label = 1;
                    f = f(mi31Var, themeType, headerUiStateInteractor$getMulticlassHeaderUiState$12);
                    if (f != obj2) {
                        list = list3;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$8;
                        xo40Var = (xo40) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$7;
                        kotlin.b.b(obj);
                        return new rdu(str, (aau) obj, xo40Var);
                    }
                    gcx0Var2 = (gcx0) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$2;
                    priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$1;
                    mi31Var2 = (mi31) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$0;
                    kotlin.b.b(obj);
                    xo40 xo40Var2 = (xo40) obj;
                    pex0 pex0Var = mi31Var2.a;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$0 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$1 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$2 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$3 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$4 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$5 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$6 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$7 = xo40Var2;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$8 = "header";
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.label = 3;
                    d = d(pex0Var, priceUpdate$PriceLoadingState, gcx0Var2, headerUiStateInteractor$getMulticlassHeaderUiState$12);
                    if (d != obj2) {
                        obj = d;
                        str = "header";
                        xo40Var = xo40Var2;
                        return new rdu(str, (aau) obj, xo40Var);
                    }
                    return obj2;
                }
                ThemeType themeType2 = (ThemeType) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$5;
                List list4 = (List) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$4;
                gcx0Var = (gcx0) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$2;
                PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = (PriceUpdate$PriceLoadingState) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$1;
                mi31 mi31Var3 = (mi31) headerUiStateInteractor$getMulticlassHeaderUiState$12.L$0;
                kotlin.b.b(obj);
                themeType = themeType2;
                mi31Var = mi31Var3;
                f = obj;
                list = list4;
                priceUpdate$PriceLoadingState = priceUpdate$PriceLoadingState2;
                l8v l8vVar = (l8v) f;
                jn40Var = mi31Var.a.V;
                if (jn40Var != null || (r14 = jn40Var.f) == null) {
                    Set set = EmptySet.a;
                }
                boolean c = themeType.c();
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$0 = mi31Var;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$1 = priceUpdate$PriceLoadingState;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$2 = gcx0Var;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$3 = null;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$4 = null;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$5 = null;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.L$6 = null;
                headerUiStateInteractor$getMulticlassHeaderUiState$12.label = 2;
                obj = this.n.a(set, list, c, l8vVar, headerUiStateInteractor$getMulticlassHeaderUiState$12);
                if (obj != obj2) {
                    gcx0 gcx0Var3 = gcx0Var;
                    mi31Var2 = mi31Var;
                    gcx0Var2 = gcx0Var3;
                    xo40 xo40Var22 = (xo40) obj;
                    pex0 pex0Var2 = mi31Var2.a;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$0 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$1 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$2 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$3 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$4 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$5 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$6 = null;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$7 = xo40Var22;
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.L$8 = "header";
                    headerUiStateInteractor$getMulticlassHeaderUiState$12.label = 3;
                    d = d(pex0Var2, priceUpdate$PriceLoadingState, gcx0Var2, headerUiStateInteractor$getMulticlassHeaderUiState$12);
                    if (d != obj2) {
                    }
                }
                return obj2;
            }
        }
        headerUiStateInteractor$getMulticlassHeaderUiState$1 = new HeaderUiStateInteractor$getMulticlassHeaderUiState$1(this, continuationImpl);
        HeaderUiStateInteractor$getMulticlassHeaderUiState$1 headerUiStateInteractor$getMulticlassHeaderUiState$122 = headerUiStateInteractor$getMulticlassHeaderUiState$1;
        obj = headerUiStateInteractor$getMulticlassHeaderUiState$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getMulticlassHeaderUiState$122.label;
        if (i != 0) {
        }
        l8v l8vVar2 = (l8v) f;
        jn40Var = mi31Var.a.V;
        if (jn40Var != null) {
        }
        Set set2 = EmptySet.a;
        boolean c2 = themeType.c();
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$0 = mi31Var;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$1 = priceUpdate$PriceLoadingState;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$2 = gcx0Var;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$3 = null;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$4 = null;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$5 = null;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.L$6 = null;
        headerUiStateInteractor$getMulticlassHeaderUiState$122.label = 2;
        obj = this.n.a(set2, list, c2, l8vVar2, headerUiStateInteractor$getMulticlassHeaderUiState$122);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(mi31 mi31Var, ThemeType themeType, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getPinImageBitmap$1 headerUiStateInteractor$getPinImageBitmap$1;
        int i;
        p0c0 p0c0Var;
        ThemeType themeType2 = themeType;
        try {
            if (continuationImpl instanceof HeaderUiStateInteractor$getPinImageBitmap$1) {
                headerUiStateInteractor$getPinImageBitmap$1 = (HeaderUiStateInteractor$getPinImageBitmap$1) continuationImpl;
                int i2 = headerUiStateInteractor$getPinImageBitmap$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    headerUiStateInteractor$getPinImageBitmap$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = headerUiStateInteractor$getPinImageBitmap$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = headerUiStateInteractor$getPinImageBitmap$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        p0c0 e = ((ru.yandex.taxi.styling.f) this.p).e(jl40.l(mi31Var.f, "multiclass_ultima") ? "ultima" : mi31Var.b);
                        xdu xduVar = this.s;
                        if (xduVar != null && jl40.l(xduVar.a, e) && xduVar.b == themeType2) {
                            return xduVar.c;
                        }
                        com.yandex.go.pin.api.widget.b bVar = this.o;
                        sq00 sq00Var = new sq00(e, null, true, null, null, null, null, false, false, null, null, 0.0f, 8186);
                        headerUiStateInteractor$getPinImageBitmap$1.L$0 = null;
                        headerUiStateInteractor$getPinImageBitmap$1.L$1 = themeType2;
                        headerUiStateInteractor$getPinImageBitmap$1.L$2 = null;
                        headerUiStateInteractor$getPinImageBitmap$1.L$3 = e;
                        headerUiStateInteractor$getPinImageBitmap$1.L$4 = null;
                        headerUiStateInteractor$getPinImageBitmap$1.label = 1;
                        obj = bVar.h(sq00Var, headerUiStateInteractor$getPinImageBitmap$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        p0c0Var = e;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p0c0Var = (p0c0) headerUiStateInteractor$getPinImageBitmap$1.L$3;
                        themeType2 = (ThemeType) headerUiStateInteractor$getPinImageBitmap$1.L$1;
                        kotlin.b.b(obj);
                    }
                    u92 u92Var = new u92(((bl00) obj).a.get$image());
                    this.s = new xdu(p0c0Var, themeType2, u92Var);
                    return u92Var;
                }
            }
            if (i != 0) {
            }
            u92 u92Var2 = new u92(((bl00) obj).a.get$image());
            this.s = new xdu(p0c0Var, themeType2, u92Var2);
            return u92Var2;
        } catch (Exception unused) {
            return null;
        }
        headerUiStateInteractor$getPinImageBitmap$1 = new HeaderUiStateInteractor$getPinImageBitmap$1(this, continuationImpl);
        Object obj2 = headerUiStateInteractor$getPinImageBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getPinImageBitmap$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getPriceDetailsUiState$1 headerUiStateInteractor$getPriceDetailsUiState$1;
        int i;
        nbu nbuVar;
        if (continuationImpl instanceof HeaderUiStateInteractor$getPriceDetailsUiState$1) {
            headerUiStateInteractor$getPriceDetailsUiState$1 = (HeaderUiStateInteractor$getPriceDetailsUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getPriceDetailsUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getPriceDetailsUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$getPriceDetailsUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getPriceDetailsUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = gcx0Var.q;
                    headerUiStateInteractor$getPriceDetailsUiState$1.L$0 = null;
                    headerUiStateInteractor$getPriceDetailsUiState$1.L$1 = null;
                    headerUiStateInteractor$getPriceDetailsUiState$1.L$2 = gcx0Var;
                    headerUiStateInteractor$getPriceDetailsUiState$1.label = 1;
                    obj = this.h.d(pex0Var, priceUpdate$PriceLoadingState, z, headerUiStateInteractor$getPriceDetailsUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gcx0Var = (gcx0) headerUiStateInteractor$getPriceDetailsUiState$1.L$2;
                    kotlin.b.b(obj);
                }
                nbuVar = (nbu) obj;
                wp2 wp2Var = gcx0Var.p;
                if (!jl40.l(nbuVar, kbu.a)) {
                    return null;
                }
                if (jl40.l(nbuVar, jbu.a)) {
                    return new jze0(gcx0Var.r, gcx0Var.s);
                }
                if (nbuVar instanceof lbu) {
                    lbu lbuVar = (lbu) nbuVar;
                    return new ize0(lbuVar.a, wp2Var, true, lbuVar.b);
                }
                if (nbuVar instanceof mbu) {
                    mbu mbuVar = (mbu) nbuVar;
                    return new ize0(mbuVar.a, wp2Var, false, mbuVar.b);
                }
                w511.b();
                return null;
            }
        }
        headerUiStateInteractor$getPriceDetailsUiState$1 = new HeaderUiStateInteractor$getPriceDetailsUiState$1(this, continuationImpl);
        Object obj2 = headerUiStateInteractor$getPriceDetailsUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getPriceDetailsUiState$1.label;
        if (i != 0) {
        }
        nbuVar = (nbu) obj2;
        wp2 wp2Var2 = gcx0Var.p;
        if (!jl40.l(nbuVar, kbu.a)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getPriceInfoUiState$1 headerUiStateInteractor$getPriceInfoUiState$1;
        Object obj;
        int i;
        Object g;
        a1f0 a1f0Var;
        gcx0 gcx0Var2;
        if (continuationImpl instanceof HeaderUiStateInteractor$getPriceInfoUiState$1) {
            headerUiStateInteractor$getPriceInfoUiState$1 = (HeaderUiStateInteractor$getPriceInfoUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getPriceInfoUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getPriceInfoUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = headerUiStateInteractor$getPriceInfoUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getPriceInfoUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    headerUiStateInteractor$getPriceInfoUiState$1.L$0 = pex0Var;
                    headerUiStateInteractor$getPriceInfoUiState$1.L$1 = priceUpdate$PriceLoadingState;
                    headerUiStateInteractor$getPriceInfoUiState$1.L$2 = gcx0Var;
                    headerUiStateInteractor$getPriceInfoUiState$1.label = 1;
                    obj2 = i(pex0Var, priceUpdate$PriceLoadingState, gcx0Var, headerUiStateInteractor$getPriceInfoUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a1f0Var = (a1f0) headerUiStateInteractor$getPriceInfoUiState$1.L$3;
                        gcx0Var2 = (gcx0) headerUiStateInteractor$getPriceInfoUiState$1.L$2;
                        kotlin.b.b(obj2);
                        return new tze0(a1f0Var, (kze0) obj2, gcx0Var2.m);
                    }
                    gcx0Var = (gcx0) headerUiStateInteractor$getPriceInfoUiState$1.L$2;
                    priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) headerUiStateInteractor$getPriceInfoUiState$1.L$1;
                    pex0Var = (pex0) headerUiStateInteractor$getPriceInfoUiState$1.L$0;
                    kotlin.b.b(obj2);
                }
                a1f0 a1f0Var2 = (a1f0) obj2;
                headerUiStateInteractor$getPriceInfoUiState$1.L$0 = null;
                headerUiStateInteractor$getPriceInfoUiState$1.L$1 = null;
                headerUiStateInteractor$getPriceInfoUiState$1.L$2 = gcx0Var;
                headerUiStateInteractor$getPriceInfoUiState$1.L$3 = a1f0Var2;
                headerUiStateInteractor$getPriceInfoUiState$1.label = 2;
                g = g(pex0Var, priceUpdate$PriceLoadingState, gcx0Var, headerUiStateInteractor$getPriceInfoUiState$1);
                if (g != obj) {
                    obj2 = g;
                    a1f0Var = a1f0Var2;
                    gcx0Var2 = gcx0Var;
                    return new tze0(a1f0Var, (kze0) obj2, gcx0Var2.m);
                }
                return obj;
            }
        }
        headerUiStateInteractor$getPriceInfoUiState$1 = new HeaderUiStateInteractor$getPriceInfoUiState$1(this, continuationImpl);
        Object obj22 = headerUiStateInteractor$getPriceInfoUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getPriceInfoUiState$1.label;
        if (i != 0) {
        }
        a1f0 a1f0Var22 = (a1f0) obj22;
        headerUiStateInteractor$getPriceInfoUiState$1.L$0 = null;
        headerUiStateInteractor$getPriceInfoUiState$1.L$1 = null;
        headerUiStateInteractor$getPriceInfoUiState$1.L$2 = gcx0Var;
        headerUiStateInteractor$getPriceInfoUiState$1.L$3 = a1f0Var22;
        headerUiStateInteractor$getPriceInfoUiState$1.label = 2;
        g = g(pex0Var, priceUpdate$PriceLoadingState, gcx0Var, headerUiStateInteractor$getPriceInfoUiState$1);
        if (g != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getPriceUiState$1 headerUiStateInteractor$getPriceUiState$1;
        int i;
        pex0 pex0Var2;
        ibu ibuVar;
        adu aduVar;
        if (continuationImpl instanceof HeaderUiStateInteractor$getPriceUiState$1) {
            headerUiStateInteractor$getPriceUiState$1 = (HeaderUiStateInteractor$getPriceUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getPriceUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getPriceUiState$1.label = i2 - Integer.MIN_VALUE;
                HeaderUiStateInteractor$getPriceUiState$1 headerUiStateInteractor$getPriceUiState$12 = headerUiStateInteractor$getPriceUiState$1;
                Object obj = headerUiStateInteractor$getPriceUiState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getPriceUiState$12.label;
                adu aduVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = pex0Var.h.b;
                    if (evu0.J(str)) {
                        str = this.g.a(pex0Var.h.a);
                    }
                    String str2 = gcx0Var.a ? str : null;
                    Integer num = new Integer(gcx0Var.o);
                    headerUiStateInteractor$getPriceUiState$12.L$0 = pex0Var;
                    headerUiStateInteractor$getPriceUiState$12.L$1 = null;
                    headerUiStateInteractor$getPriceUiState$12.L$2 = gcx0Var;
                    headerUiStateInteractor$getPriceUiState$12.L$3 = null;
                    headerUiStateInteractor$getPriceUiState$12.label = 1;
                    obj = this.h.c(pex0Var, priceUpdate$PriceLoadingState, num, str2, headerUiStateInteractor$getPriceUiState$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pex0Var2 = pex0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gcx0Var = (gcx0) headerUiStateInteractor$getPriceUiState$12.L$2;
                    pex0Var2 = (pex0) headerUiStateInteractor$getPriceUiState$12.L$0;
                    kotlin.b.b(obj);
                }
                ibuVar = (ibu) obj;
                wp2 wp2Var = gcx0Var.n;
                if (!jl40.l(ibuVar, fbu.a)) {
                    return new y0f0(gcx0Var.r, gcx0Var.s);
                }
                if (ibuVar instanceof gbu) {
                    gbu gbuVar = (gbu) ibuVar;
                    return new x0f0(gbuVar.a, wp2Var, true, null, gbuVar.b);
                }
                if (!(ibuVar instanceof hbu)) {
                    w511.b();
                    return null;
                }
                hbu hbuVar = (hbu) ibuVar;
                if (hbuVar.c) {
                    f5 f5Var = pex0Var2.w0;
                    if (f5Var instanceof ServiceLevelWidget$SurgeAlert) {
                        aduVar2 = new adu(((ServiceLevelWidget$SurgeAlert) f5Var).a.c);
                    } else {
                        if (f5Var instanceof ServiceLevelWidget$SurgeBalance) {
                            aduVar = new adu(null);
                            return new x0f0(hbuVar.a, wp2Var, false, aduVar, hbuVar.b);
                        }
                        if (!(f5Var instanceof ServiceLevelWidget$Invisible) && !jl40.l(f5Var, e5.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                    }
                }
                aduVar = aduVar2;
                return new x0f0(hbuVar.a, wp2Var, false, aduVar, hbuVar.b);
            }
        }
        headerUiStateInteractor$getPriceUiState$1 = new HeaderUiStateInteractor$getPriceUiState$1(this, continuationImpl);
        HeaderUiStateInteractor$getPriceUiState$1 headerUiStateInteractor$getPriceUiState$122 = headerUiStateInteractor$getPriceUiState$1;
        Object obj2 = headerUiStateInteractor$getPriceUiState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getPriceUiState$122.label;
        adu aduVar22 = null;
        if (i != 0) {
        }
        ibuVar = (ibu) obj2;
        wp2 wp2Var2 = gcx0Var.n;
        if (!jl40.l(ibuVar, fbu.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(pex0 pex0Var, String str, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getTariffDescriptionText$1 headerUiStateInteractor$getTariffDescriptionText$1;
        int i;
        FormattedText formattedText;
        if (continuationImpl instanceof HeaderUiStateInteractor$getTariffDescriptionText$1) {
            headerUiStateInteractor$getTariffDescriptionText$1 = (HeaderUiStateInteractor$getTariffDescriptionText$1) continuationImpl;
            int i2 = headerUiStateInteractor$getTariffDescriptionText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getTariffDescriptionText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$getTariffDescriptionText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getTariffDescriptionText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AttributedDescription attributedDescription = pex0Var.G0;
                    if (attributedDescription == null || (formattedText = attributedDescription.b) == null || !formattedText.d()) {
                        formattedText = null;
                    }
                    if (str != null) {
                        FormattedText a = formattedText != null ? d9s.a(str, formattedText) : null;
                        if (a != null) {
                            formattedText = a;
                        }
                    }
                    headerUiStateInteractor$getTariffDescriptionText$1.L$0 = null;
                    headerUiStateInteractor$getTariffDescriptionText$1.L$1 = null;
                    headerUiStateInteractor$getTariffDescriptionText$1.L$2 = null;
                    headerUiStateInteractor$getTariffDescriptionText$1.L$3 = null;
                    headerUiStateInteractor$getTariffDescriptionText$1.label = 1;
                    obj = this.r.x(formattedText, headerUiStateInteractor$getTariffDescriptionText$1);
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
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? "" : charSequence;
            }
        }
        headerUiStateInteractor$getTariffDescriptionText$1 = new HeaderUiStateInteractor$getTariffDescriptionText$1(this, continuationImpl);
        Object obj2 = headerUiStateInteractor$getTariffDescriptionText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getTariffDescriptionText$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getTariffDescriptionUiState$1 headerUiStateInteractor$getTariffDescriptionUiState$1;
        int i;
        wp2 wp2Var;
        TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState;
        float f;
        String e;
        int i2;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
        gcx0 gcx0Var2 = gcx0Var;
        if (continuationImpl instanceof HeaderUiStateInteractor$getTariffDescriptionUiState$1) {
            headerUiStateInteractor$getTariffDescriptionUiState$1 = (HeaderUiStateInteractor$getTariffDescriptionUiState$1) continuationImpl;
            int i3 = headerUiStateInteractor$getTariffDescriptionUiState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getTariffDescriptionUiState$1.label = i3 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$getTariffDescriptionUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getTariffDescriptionUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(pex0Var.b, "child_tariff")) {
                        return new rex0("", gcx0Var2.i, gcx0Var2.h, 0.5f, false, gcx0Var2.k);
                    }
                    if (priceUpdate$PriceLoadingState2 == PriceUpdate$PriceLoadingState.LOADING && ((e = pex0Var.e()) == null || evu0.J(e))) {
                        return new sex0(gcx0Var2.k, gcx0Var2.r, gcx0Var2.s);
                    }
                    wp2 wp2Var2 = gcx0Var2.i;
                    TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState2 = gcx0Var2.h;
                    String str = gcx0Var2.j;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.L$0 = null;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.L$1 = priceUpdate$PriceLoadingState2;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.L$2 = gcx0Var2;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.L$3 = wp2Var2;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.L$4 = tariffDescriptionTextStyleUiState2;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.F$0 = 0.5f;
                    headerUiStateInteractor$getTariffDescriptionUiState$1.label = 1;
                    Object j = j(pex0Var, str, headerUiStateInteractor$getTariffDescriptionUiState$1);
                    if (j == obj2) {
                        return obj2;
                    }
                    wp2Var = wp2Var2;
                    tariffDescriptionTextStyleUiState = tariffDescriptionTextStyleUiState2;
                    f = 0.5f;
                    obj = j;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = headerUiStateInteractor$getTariffDescriptionUiState$1.F$0;
                    TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState3 = (TariffDescriptionTextStyleUiState) headerUiStateInteractor$getTariffDescriptionUiState$1.L$4;
                    wp2 wp2Var3 = (wp2) headerUiStateInteractor$getTariffDescriptionUiState$1.L$3;
                    gcx0Var2 = (gcx0) headerUiStateInteractor$getTariffDescriptionUiState$1.L$2;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = (PriceUpdate$PriceLoadingState) headerUiStateInteractor$getTariffDescriptionUiState$1.L$1;
                    kotlin.b.b(obj);
                    f = f2;
                    tariffDescriptionTextStyleUiState = tariffDescriptionTextStyleUiState3;
                    wp2Var = wp2Var3;
                    priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState3;
                }
                CharSequence charSequence = (CharSequence) obj;
                i2 = ydu.a[priceUpdate$PriceLoadingState2.ordinal()];
                if (i2 != 1) {
                    return new rex0(charSequence, wp2Var, tariffDescriptionTextStyleUiState, f, !gcx0Var2.l, gcx0Var2.k);
                }
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    return new rex0(charSequence, wp2Var, tariffDescriptionTextStyleUiState, f, false, gcx0Var2.k);
                }
                w511.b();
                return null;
            }
        }
        headerUiStateInteractor$getTariffDescriptionUiState$1 = new HeaderUiStateInteractor$getTariffDescriptionUiState$1(this, continuationImpl);
        Object obj3 = headerUiStateInteractor$getTariffDescriptionUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getTariffDescriptionUiState$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj3;
        i2 = ydu.a[priceUpdate$PriceLoadingState2.ordinal()];
        if (i2 != 1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, gcx0 gcx0Var, ContinuationImpl continuationImpl) {
        HeaderUiStateInteractor$getTariffInfoUiState$1 headerUiStateInteractor$getTariffInfoUiState$1;
        int i;
        String str;
        pex0 pex0Var2;
        ngx0 ngx0Var;
        tex0 tex0Var;
        StringBuilder sb;
        if (continuationImpl instanceof HeaderUiStateInteractor$getTariffInfoUiState$1) {
            headerUiStateInteractor$getTariffInfoUiState$1 = (HeaderUiStateInteractor$getTariffInfoUiState$1) continuationImpl;
            int i2 = headerUiStateInteractor$getTariffInfoUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$getTariffInfoUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$getTariffInfoUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$getTariffInfoUiState$1.label;
                str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = pex0Var.l;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ngx0 ngx0Var2 = new ngx0(str2, gcx0Var.f, gcx0Var.e, gcx0Var.g);
                    headerUiStateInteractor$getTariffInfoUiState$1.L$0 = pex0Var;
                    headerUiStateInteractor$getTariffInfoUiState$1.L$1 = null;
                    headerUiStateInteractor$getTariffInfoUiState$1.L$2 = null;
                    headerUiStateInteractor$getTariffInfoUiState$1.L$3 = ngx0Var2;
                    headerUiStateInteractor$getTariffInfoUiState$1.label = 1;
                    Object k = k(pex0Var, priceUpdate$PriceLoadingState, gcx0Var, headerUiStateInteractor$getTariffInfoUiState$1);
                    if (k == obj2) {
                        return obj2;
                    }
                    pex0Var2 = pex0Var;
                    ngx0Var = ngx0Var2;
                    obj = k;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ngx0Var = (ngx0) headerUiStateInteractor$getTariffInfoUiState$1.L$3;
                    pex0Var2 = (pex0) headerUiStateInteractor$getTariffInfoUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                tex0Var = (tex0) obj;
                AttributedDescription attributedDescription = pex0Var2.G0;
                String str3 = attributedDescription == null ? attributedDescription.a : null;
                String str4 = ngx0Var.a;
                if (tex0Var instanceof rex0) {
                    if (!(tex0Var instanceof sex0)) {
                        w511.b();
                        return null;
                    }
                } else if (str3 != null && !evu0.J(str3)) {
                    str = str3;
                }
                String h = ((avj0) this.f).h(kyh0.pool_tariff_title);
                sb = new StringBuilder();
                sb.append(cvu0.v(h, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, str4, false));
                if (str != null && !evu0.J(str)) {
                    sb.append(Extension.FIX_SPACE.concat(str));
                }
                return new hgx0(ngx0Var, tex0Var, sb.toString());
            }
        }
        headerUiStateInteractor$getTariffInfoUiState$1 = new HeaderUiStateInteractor$getTariffInfoUiState$1(this, continuationImpl);
        Object obj3 = headerUiStateInteractor$getTariffInfoUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$getTariffInfoUiState$1.label;
        str = null;
        if (i != 0) {
        }
        tex0Var = (tex0) obj3;
        AttributedDescription attributedDescription2 = pex0Var2.G0;
        if (attributedDescription2 == null) {
        }
        String str42 = ngx0Var.a;
        if (tex0Var instanceof rex0) {
        }
        String h2 = ((avj0) this.f).h(kyh0.pool_tariff_title);
        sb = new StringBuilder();
        sb.append(cvu0.v(h2, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, str42, false));
        if (str != null) {
            sb.append(Extension.FIX_SPACE.concat(str));
        }
        return new hgx0(ngx0Var, tex0Var, sb.toString());
    }
}
