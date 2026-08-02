package com.yandex.go.tariffcard.ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.go.tariffcard.api.experiment.HeaderBackground;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsHeaderRedesignExperiment;
import com.yandex.go.zone.dto.objects.AttributedDescription;
import defpackage.avj0;
import defpackage.bl00;
import defpackage.d1h0;
import defpackage.d9s;
import defpackage.dwh0;
import defpackage.evu0;
import defpackage.fkx0;
import defpackage.i3y;
import defpackage.ibu;
import defpackage.icu;
import defpackage.idu;
import defpackage.jcu;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.kcu;
import defpackage.kdu;
import defpackage.kyh0;
import defpackage.lcu;
import defpackage.ldu;
import defpackage.lt00;
import defpackage.mdh;
import defpackage.mdu;
import defpackage.mi31;
import defpackage.mqg0;
import defpackage.nbu;
import defpackage.ndu;
import defpackage.ny61;
import defpackage.o9u;
import defpackage.odu;
import defpackage.p9u;
import defpackage.pex0;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.q4g;
import defpackage.q5z;
import defpackage.q9u;
import defpackage.r8u;
import defpackage.r9u;
import defpackage.rxy;
import defpackage.s0c0;
import defpackage.s8o;
import defpackage.s8u;
import defpackage.sfx0;
import defpackage.sjh;
import defpackage.sjp;
import defpackage.sq00;
import defpackage.t8u;
import defpackage.tfx0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vhx0;
import defpackage.viv0;
import defpackage.vng;
import defpackage.w511;
import defpackage.w8u;
import defpackage.ybo;
import defpackage.z9u;
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
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes14.dex */
public final class e {
    public final Context a;
    public final zuj0 b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final fkx0 d;
    public final tt2 e;
    public final com.yandex.go.route.interactor.c f;
    public final f g;
    public final viv0 h;
    public final sjp i;
    public final sfx0 j;
    public final rxy k;
    public final ru.yandex.taxi.preorder.source.cars.a l;
    public final com.yandex.go.pin.api.widget.b m;
    public final s0c0 n;
    public final com.yandex.go.tariffcard.ui.adapter.header.multiclass.c o;
    public final pwy0 p;
    public final q4g q;

    public e(Context context, zuj0 zuj0Var, ru.yandex.taxi.widget.utils.e eVar, fkx0 fkx0Var, tt2 tt2Var, com.yandex.go.route.interactor.c cVar, f fVar, viv0 viv0Var, sjp sjpVar, sfx0 sfx0Var, rxy rxyVar, ru.yandex.taxi.preorder.source.cars.a aVar, com.yandex.go.pin.api.widget.b bVar, s0c0 s0c0Var, com.yandex.go.tariffcard.ui.adapter.header.multiclass.c cVar2, pwy0 pwy0Var, q4g q4gVar) {
        this.a = context;
        this.b = zuj0Var;
        this.c = eVar;
        this.d = fkx0Var;
        this.e = tt2Var;
        this.f = cVar;
        this.g = fVar;
        this.h = viv0Var;
        this.i = sjpVar;
        this.j = sfx0Var;
        this.k = rxyVar;
        this.l = aVar;
        this.m = bVar;
        this.n = s0c0Var;
        this.o = cVar2;
        this.p = pwy0Var;
        this.q = q4gVar;
    }

    public final CharSequence a(Integer num, String str) {
        if (num == null) {
            return str;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " ");
        Drawable t = vng.t(num.intValue(), ((avj0) this.b).a);
        return append.append(" ", t != null ? new CustomImageSpan(t, 2, false, false, null, 28, null) : null, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x019d, code lost:
    
        if (r2 == r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c7, code lost:
    
        if (r2 == r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01eb, code lost:
    
        if (r2 == r8) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, kdu kduVar, r9u r9uVar, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$create$1 tariffOptionsCardHeaderFactory$create$1;
        Object obj;
        int i;
        mi31 mi31Var2;
        r9u r9uVar2;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2;
        kdu kduVar2;
        Drawable drawable;
        Object b;
        r9u r9uVar3;
        Drawable drawable2;
        kdu kduVar3;
        boolean z;
        int i2;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$create$1) {
            tariffOptionsCardHeaderFactory$create$1 = (TariffOptionsCardHeaderFactory$create$1) continuationImpl;
            int i3 = tariffOptionsCardHeaderFactory$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$create$1.label = i3 - Integer.MIN_VALUE;
                TariffOptionsCardHeaderFactory$create$1 tariffOptionsCardHeaderFactory$create$12 = tariffOptionsCardHeaderFactory$create$1;
                Object obj2 = tariffOptionsCardHeaderFactory$create$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$create$12.label;
                viv0 viv0Var = this.h;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    HeaderBackground f = viv0Var.f(mi31Var.b, mi31Var.f, mi31Var.a.K0);
                    String str = f != null ? f.a : null;
                    if (str != null) {
                        tariffOptionsCardHeaderFactory$create$12.L$0 = mi31Var;
                        tariffOptionsCardHeaderFactory$create$12.L$1 = priceUpdate$PriceLoadingState;
                        tariffOptionsCardHeaderFactory$create$12.L$2 = kduVar;
                        tariffOptionsCardHeaderFactory$create$12.L$3 = r9uVar;
                        tariffOptionsCardHeaderFactory$create$12.L$4 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$5 = null;
                        tariffOptionsCardHeaderFactory$create$12.label = 1;
                        this.e.getClass();
                        sjh sjhVar = uyj.a;
                        obj2 = tje.k0(mdh.b, new TariffOptionsCardHeaderFactory$getBackgroundImage$2(this, str, null), tariffOptionsCardHeaderFactory$create$12);
                        if (obj2 != obj) {
                            mi31Var2 = mi31Var;
                            r9uVar2 = r9uVar;
                            priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
                            kduVar2 = kduVar;
                        }
                        return obj;
                    }
                    mi31Var2 = mi31Var;
                    r9uVar2 = r9uVar;
                    priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
                    kduVar2 = kduVar;
                    drawable = null;
                    boolean h = viv0Var.h();
                    tariffOptionsCardHeaderFactory$create$12.L$0 = mi31Var2;
                    tariffOptionsCardHeaderFactory$create$12.L$1 = priceUpdate$PriceLoadingState2;
                    tariffOptionsCardHeaderFactory$create$12.L$2 = kduVar2;
                    tariffOptionsCardHeaderFactory$create$12.L$3 = r9uVar2;
                    tariffOptionsCardHeaderFactory$create$12.L$4 = null;
                    tariffOptionsCardHeaderFactory$create$12.L$5 = drawable;
                    tariffOptionsCardHeaderFactory$create$12.Z$0 = h;
                    tariffOptionsCardHeaderFactory$create$12.label = 2;
                    b = this.i.b.b(tariffOptionsCardHeaderFactory$create$12);
                    if (b != obj) {
                        r9uVar3 = r9uVar2;
                        drawable2 = drawable;
                        obj2 = b;
                        kduVar3 = kduVar2;
                        z = h;
                        MulticlassTariffsHeaderRedesignExperiment multiclassTariffsHeaderRedesignExperiment = (MulticlassTariffsHeaderRedesignExperiment) obj2;
                        List list = (List) multiclassTariffsHeaderRedesignExperiment.b.get(mi31Var2.b);
                        if (list == null) {
                        }
                        if (i2 == 0) {
                        }
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj2);
                            return (w8u) obj2;
                        }
                        if (i == 4) {
                            kotlin.b.b(obj2);
                            return (w8u) obj2;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return (w8u) obj2;
                    }
                    boolean z2 = tariffOptionsCardHeaderFactory$create$12.Z$0;
                    Drawable drawable3 = (Drawable) tariffOptionsCardHeaderFactory$create$12.L$5;
                    r9u r9uVar4 = (r9u) tariffOptionsCardHeaderFactory$create$12.L$3;
                    kduVar3 = (kdu) tariffOptionsCardHeaderFactory$create$12.L$2;
                    priceUpdate$PriceLoadingState2 = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderFactory$create$12.L$1;
                    mi31Var2 = (mi31) tariffOptionsCardHeaderFactory$create$12.L$0;
                    kotlin.b.b(obj2);
                    z = z2;
                    drawable2 = drawable3;
                    r9uVar3 = r9uVar4;
                    MulticlassTariffsHeaderRedesignExperiment multiclassTariffsHeaderRedesignExperiment2 = (MulticlassTariffsHeaderRedesignExperiment) obj2;
                    List list2 = (List) multiclassTariffsHeaderRedesignExperiment2.b.get(mi31Var2.b);
                    i2 = (list2 == null && list2.contains(mi31Var2.f)) ? 1 : 0;
                    if (i2 == 0) {
                        idu iduVar = kduVar3.a;
                        MulticlassTariffsHeaderRedesignExperiment.Configuration configuration = multiclassTariffsHeaderRedesignExperiment2.c;
                        tariffOptionsCardHeaderFactory$create$12.L$0 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$1 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$2 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$3 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$4 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$5 = null;
                        tariffOptionsCardHeaderFactory$create$12.L$6 = null;
                        tariffOptionsCardHeaderFactory$create$12.Z$0 = z;
                        tariffOptionsCardHeaderFactory$create$12.I$0 = i2;
                        tariffOptionsCardHeaderFactory$create$12.label = 3;
                        obj2 = c(mi31Var2, priceUpdate$PriceLoadingState2, z, iduVar, configuration, tariffOptionsCardHeaderFactory$create$12);
                    } else {
                        boolean z3 = z;
                        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = priceUpdate$PriceLoadingState2;
                        Drawable drawable4 = drawable2;
                        mi31 mi31Var3 = mi31Var2;
                        if (drawable4 != null) {
                            idu iduVar2 = kduVar3.b;
                            tariffOptionsCardHeaderFactory$create$12.L$0 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$1 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$2 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$3 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$4 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$5 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$6 = null;
                            tariffOptionsCardHeaderFactory$create$12.Z$0 = z3;
                            tariffOptionsCardHeaderFactory$create$12.I$0 = i2;
                            tariffOptionsCardHeaderFactory$create$12.label = 4;
                            obj2 = e(mi31Var3, priceUpdate$PriceLoadingState3, drawable4, z3, iduVar2, r9uVar3, tariffOptionsCardHeaderFactory$create$12);
                        } else {
                            idu iduVar3 = kduVar3.a;
                            tariffOptionsCardHeaderFactory$create$12.L$0 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$1 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$2 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$3 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$4 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$5 = null;
                            tariffOptionsCardHeaderFactory$create$12.L$6 = null;
                            tariffOptionsCardHeaderFactory$create$12.Z$0 = z3;
                            tariffOptionsCardHeaderFactory$create$12.I$0 = i2;
                            tariffOptionsCardHeaderFactory$create$12.label = 5;
                            obj2 = d(mi31Var3, priceUpdate$PriceLoadingState3, z3, iduVar3, tariffOptionsCardHeaderFactory$create$12);
                        }
                    }
                    return obj;
                }
                r9uVar2 = (r9u) tariffOptionsCardHeaderFactory$create$12.L$3;
                kduVar2 = (kdu) tariffOptionsCardHeaderFactory$create$12.L$2;
                priceUpdate$PriceLoadingState2 = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderFactory$create$12.L$1;
                mi31Var2 = (mi31) tariffOptionsCardHeaderFactory$create$12.L$0;
                kotlin.b.b(obj2);
                drawable = (Drawable) obj2;
                boolean h2 = viv0Var.h();
                tariffOptionsCardHeaderFactory$create$12.L$0 = mi31Var2;
                tariffOptionsCardHeaderFactory$create$12.L$1 = priceUpdate$PriceLoadingState2;
                tariffOptionsCardHeaderFactory$create$12.L$2 = kduVar2;
                tariffOptionsCardHeaderFactory$create$12.L$3 = r9uVar2;
                tariffOptionsCardHeaderFactory$create$12.L$4 = null;
                tariffOptionsCardHeaderFactory$create$12.L$5 = drawable;
                tariffOptionsCardHeaderFactory$create$12.Z$0 = h2;
                tariffOptionsCardHeaderFactory$create$12.label = 2;
                b = this.i.b.b(tariffOptionsCardHeaderFactory$create$12);
                if (b != obj) {
                }
                return obj;
            }
        }
        tariffOptionsCardHeaderFactory$create$1 = new TariffOptionsCardHeaderFactory$create$1(this, continuationImpl);
        TariffOptionsCardHeaderFactory$create$1 tariffOptionsCardHeaderFactory$create$122 = tariffOptionsCardHeaderFactory$create$1;
        Object obj22 = tariffOptionsCardHeaderFactory$create$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$create$122.label;
        viv0 viv0Var2 = this.h;
        if (i != 0) {
        }
        drawable = (Drawable) obj22;
        boolean h22 = viv0Var2.h();
        tariffOptionsCardHeaderFactory$create$122.L$0 = mi31Var2;
        tariffOptionsCardHeaderFactory$create$122.L$1 = priceUpdate$PriceLoadingState2;
        tariffOptionsCardHeaderFactory$create$122.L$2 = kduVar2;
        tariffOptionsCardHeaderFactory$create$122.L$3 = r9uVar2;
        tariffOptionsCardHeaderFactory$create$122.L$4 = null;
        tariffOptionsCardHeaderFactory$create$122.L$5 = drawable;
        tariffOptionsCardHeaderFactory$create$122.Z$0 = h22;
        tariffOptionsCardHeaderFactory$create$122.label = 2;
        b = this.i.b.b(tariffOptionsCardHeaderFactory$create$122);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, boolean z, idu iduVar, MulticlassTariffsHeaderRedesignExperiment.Configuration configuration, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$createMulticlassHeader$1 tariffOptionsCardHeaderFactory$createMulticlassHeader$1;
        Object obj;
        int i;
        boolean z2;
        List list;
        List list2;
        jn40 jn40Var;
        Object b;
        z9u z9uVar;
        mi31 mi31Var2;
        Object g;
        lt00 lt00Var;
        mi31 mi31Var3 = mi31Var;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$createMulticlassHeader$1) {
            tariffOptionsCardHeaderFactory$createMulticlassHeader$1 = (TariffOptionsCardHeaderFactory$createMulticlassHeader$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$createMulticlassHeader$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$createMulticlassHeader$1.label = i2 - Integer.MIN_VALUE;
                TariffOptionsCardHeaderFactory$createMulticlassHeader$1 tariffOptionsCardHeaderFactory$createMulticlassHeader$12 = tariffOptionsCardHeaderFactory$createMulticlassHeader$1;
                Object obj2 = tariffOptionsCardHeaderFactory$createMulticlassHeader$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$createMulticlassHeader$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Map map = (Map) configuration.b.get(mi31Var3.b);
                    List list3 = (map == null || (list2 = (List) map.get(mi31Var3.f)) == null) ? configuration.a : list2;
                    pex0 pex0Var = mi31Var3.a;
                    boolean k = this.h.k(mi31Var3.b);
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$0 = mi31Var3;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$1 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$2 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$3 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$4 = list3;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.Z$0 = z;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.label = 1;
                    obj2 = f(pex0Var, priceUpdate$PriceLoadingState, null, false, k, z, null, iduVar, tariffOptionsCardHeaderFactory$createMulticlassHeader$12);
                    if (obj2 != obj) {
                        z2 = z;
                        list = list3;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lt00Var = (lt00) tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$6;
                        z9uVar = (z9u) tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$5;
                        kotlin.b.b(obj2);
                        return new r8u(z9uVar, lt00Var, tje.y(!this.p.getThemeType().c() ? d1h0.bg_multiclass_map_dark : d1h0.bg_multiclass_map, this.c.a), (Drawable) obj2);
                    }
                    z2 = tariffOptionsCardHeaderFactory$createMulticlassHeader$12.Z$0;
                    z9uVar = (z9u) tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$5;
                    mi31Var2 = (mi31) tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$0;
                    kotlin.b.b(obj2);
                    lt00 lt00Var2 = (lt00) obj2;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$0 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$1 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$2 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$3 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$4 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$5 = z9uVar;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$6 = lt00Var2;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.Z$0 = z2;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.label = 3;
                    g = g(mi31Var2, tariffOptionsCardHeaderFactory$createMulticlassHeader$12);
                    if (g != obj) {
                        obj2 = g;
                        lt00Var = lt00Var2;
                        return new r8u(z9uVar, lt00Var, tje.y(!this.p.getThemeType().c() ? d1h0.bg_multiclass_map_dark : d1h0.bg_multiclass_map, this.c.a), (Drawable) obj2);
                    }
                    return obj;
                }
                z2 = tariffOptionsCardHeaderFactory$createMulticlassHeader$12.Z$0;
                list = (List) tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$4;
                mi31 mi31Var4 = (mi31) tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$0;
                kotlin.b.b(obj2);
                mi31Var3 = mi31Var4;
                z9u z9uVar2 = (z9u) obj2;
                jn40Var = mi31Var3.a.V;
                if (jn40Var != null || (r4 = jn40Var.f) == null) {
                    Set set = EmptySet.a;
                }
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$0 = mi31Var3;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$1 = null;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$2 = null;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$3 = null;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$4 = null;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$5 = z9uVar2;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.Z$0 = z2;
                tariffOptionsCardHeaderFactory$createMulticlassHeader$12.label = 2;
                b = this.o.b(set, new TariffOptionsCardHeaderFactory$getMapRoutes$2(this, null), list, tariffOptionsCardHeaderFactory$createMulticlassHeader$12);
                if (b != obj) {
                    z9uVar = z9uVar2;
                    obj2 = b;
                    mi31Var2 = mi31Var3;
                    lt00 lt00Var22 = (lt00) obj2;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$0 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$1 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$2 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$3 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$4 = null;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$5 = z9uVar;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.L$6 = lt00Var22;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.Z$0 = z2;
                    tariffOptionsCardHeaderFactory$createMulticlassHeader$12.label = 3;
                    g = g(mi31Var2, tariffOptionsCardHeaderFactory$createMulticlassHeader$12);
                    if (g != obj) {
                    }
                }
                return obj;
            }
        }
        tariffOptionsCardHeaderFactory$createMulticlassHeader$1 = new TariffOptionsCardHeaderFactory$createMulticlassHeader$1(this, continuationImpl);
        TariffOptionsCardHeaderFactory$createMulticlassHeader$1 tariffOptionsCardHeaderFactory$createMulticlassHeader$122 = tariffOptionsCardHeaderFactory$createMulticlassHeader$1;
        Object obj22 = tariffOptionsCardHeaderFactory$createMulticlassHeader$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$createMulticlassHeader$122.label;
        if (i != 0) {
        }
        z9u z9uVar22 = (z9u) obj22;
        jn40Var = mi31Var3.a.V;
        if (jn40Var != null) {
        }
        Set set2 = EmptySet.a;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.L$0 = mi31Var3;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.L$1 = null;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.L$2 = null;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.L$3 = null;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.L$4 = null;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.L$5 = z9uVar22;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.Z$0 = z2;
        tariffOptionsCardHeaderFactory$createMulticlassHeader$122.label = 2;
        b = this.o.b(set2, new TariffOptionsCardHeaderFactory$getMapRoutes$2(this, null), list, tariffOptionsCardHeaderFactory$createMulticlassHeader$122);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, boolean z, idu iduVar, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$createStandardHeader$1 tariffOptionsCardHeaderFactory$createStandardHeader$1;
        Object obj;
        int i;
        boolean z2;
        Object k0;
        z9u z9uVar;
        mi31 mi31Var2 = mi31Var;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$createStandardHeader$1) {
            tariffOptionsCardHeaderFactory$createStandardHeader$1 = (TariffOptionsCardHeaderFactory$createStandardHeader$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$createStandardHeader$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$createStandardHeader$1.label = i2 - Integer.MIN_VALUE;
                TariffOptionsCardHeaderFactory$createStandardHeader$1 tariffOptionsCardHeaderFactory$createStandardHeader$12 = tariffOptionsCardHeaderFactory$createStandardHeader$1;
                Object obj2 = tariffOptionsCardHeaderFactory$createStandardHeader$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$createStandardHeader$12.label;
                viv0 viv0Var = this.h;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = mi31Var2.a;
                    boolean k = viv0Var.k(mi31Var2.b);
                    tariffOptionsCardHeaderFactory$createStandardHeader$12.L$0 = mi31Var2;
                    tariffOptionsCardHeaderFactory$createStandardHeader$12.L$1 = null;
                    tariffOptionsCardHeaderFactory$createStandardHeader$12.L$2 = null;
                    tariffOptionsCardHeaderFactory$createStandardHeader$12.Z$0 = z;
                    tariffOptionsCardHeaderFactory$createStandardHeader$12.label = 1;
                    obj2 = f(pex0Var, priceUpdate$PriceLoadingState, null, false, k, z, null, iduVar, tariffOptionsCardHeaderFactory$createStandardHeader$12);
                    if (obj2 != obj) {
                        z2 = z;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z9uVar = (z9u) tariffOptionsCardHeaderFactory$createStandardHeader$12.L$3;
                    kotlin.b.b(obj2);
                    return new s8u(z9uVar, (Drawable) obj2);
                }
                z2 = tariffOptionsCardHeaderFactory$createStandardHeader$12.Z$0;
                mi31 mi31Var3 = (mi31) tariffOptionsCardHeaderFactory$createStandardHeader$12.L$0;
                kotlin.b.b(obj2);
                mi31Var2 = mi31Var3;
                z9u z9uVar2 = (z9u) obj2;
                tariffOptionsCardHeaderFactory$createStandardHeader$12.L$0 = null;
                tariffOptionsCardHeaderFactory$createStandardHeader$12.L$1 = null;
                tariffOptionsCardHeaderFactory$createStandardHeader$12.L$2 = null;
                tariffOptionsCardHeaderFactory$createStandardHeader$12.L$3 = z9uVar2;
                tariffOptionsCardHeaderFactory$createStandardHeader$12.Z$0 = z2;
                tariffOptionsCardHeaderFactory$createStandardHeader$12.label = 2;
                String d = viv0Var.d(mi31Var2.b, mi31Var2.f, mi31Var2.a.K0);
                this.e.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(mdh.b, new TariffOptionsCardHeaderFactory$getCarImage$2(d, this, mi31Var2, null), tariffOptionsCardHeaderFactory$createStandardHeader$12);
                if (k0 != obj) {
                    obj2 = k0;
                    z9uVar = z9uVar2;
                    return new s8u(z9uVar, (Drawable) obj2);
                }
                return obj;
            }
        }
        tariffOptionsCardHeaderFactory$createStandardHeader$1 = new TariffOptionsCardHeaderFactory$createStandardHeader$1(this, continuationImpl);
        TariffOptionsCardHeaderFactory$createStandardHeader$1 tariffOptionsCardHeaderFactory$createStandardHeader$122 = tariffOptionsCardHeaderFactory$createStandardHeader$1;
        Object obj22 = tariffOptionsCardHeaderFactory$createStandardHeader$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$createStandardHeader$122.label;
        viv0 viv0Var2 = this.h;
        if (i != 0) {
        }
        z9u z9uVar22 = (z9u) obj22;
        tariffOptionsCardHeaderFactory$createStandardHeader$122.L$0 = null;
        tariffOptionsCardHeaderFactory$createStandardHeader$122.L$1 = null;
        tariffOptionsCardHeaderFactory$createStandardHeader$122.L$2 = null;
        tariffOptionsCardHeaderFactory$createStandardHeader$122.L$3 = z9uVar22;
        tariffOptionsCardHeaderFactory$createStandardHeader$122.Z$0 = z2;
        tariffOptionsCardHeaderFactory$createStandardHeader$122.label = 2;
        String d2 = viv0Var2.d(mi31Var2.b, mi31Var2.f, mi31Var2.a.K0);
        this.e.getClass();
        sjh sjhVar2 = uyj.a;
        k0 = tje.k0(mdh.b, new TariffOptionsCardHeaderFactory$getCarImage$2(d2, this, mi31Var2, null), tariffOptionsCardHeaderFactory$createStandardHeader$122);
        if (k0 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Drawable drawable, boolean z, idu iduVar, r9u r9uVar, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$createUltimaHeader$1 tariffOptionsCardHeaderFactory$createUltimaHeader$1;
        int i;
        Drawable drawable2;
        r9u r9uVar2;
        boolean z2;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$createUltimaHeader$1) {
            tariffOptionsCardHeaderFactory$createUltimaHeader$1 = (TariffOptionsCardHeaderFactory$createUltimaHeader$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$createUltimaHeader$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$createUltimaHeader$1.label = i2 - Integer.MIN_VALUE;
                TariffOptionsCardHeaderFactory$createUltimaHeader$1 tariffOptionsCardHeaderFactory$createUltimaHeader$12 = tariffOptionsCardHeaderFactory$createUltimaHeader$1;
                Object obj = tariffOptionsCardHeaderFactory$createUltimaHeader$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$createUltimaHeader$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pex0 pex0Var = mi31Var.a;
                    Integer num = new Integer(((avj0) this.b).a(mqg0.white));
                    boolean k = this.h.k(mi31Var.b);
                    String s = q5z.s(s8o.m(iduVar.e, this.a));
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$0 = null;
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$1 = null;
                    drawable2 = drawable;
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$2 = drawable2;
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$3 = null;
                    r9uVar2 = r9uVar;
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$4 = r9uVar2;
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.Z$0 = z;
                    tariffOptionsCardHeaderFactory$createUltimaHeader$12.label = 1;
                    obj = f(pex0Var, priceUpdate$PriceLoadingState, num, true, k, z, s, iduVar, tariffOptionsCardHeaderFactory$createUltimaHeader$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r9u r9uVar3 = (r9u) tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$4;
                    Drawable drawable3 = (Drawable) tariffOptionsCardHeaderFactory$createUltimaHeader$12.L$2;
                    kotlin.b.b(obj);
                    r9uVar2 = r9uVar3;
                    drawable2 = drawable3;
                }
                z9u z9uVar = (z9u) obj;
                q4g q4gVar = this.q;
                q4gVar.getClass();
                i3y i3yVar = (i3y) q4gVar.w;
                z2 = r9uVar2 instanceof o9u;
                odu oduVar = ldu.a;
                if (!z2) {
                    if (r9uVar2 instanceof p9u) {
                        p9u p9uVar = (p9u) r9uVar2;
                        mdu p = q4g.p(p9uVar.b);
                        mdu p2 = q4g.p(p9uVar.c);
                        if (p != null || p2 != null) {
                            oduVar = new ndu(p, p2);
                        }
                    } else {
                        if (!jl40.l(r9uVar2, q9u.a)) {
                            w511.b();
                            return null;
                        }
                        oduVar = new ndu(new mdu(((Number) ((i3y) q4gVar.x).getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), 0.5f), new mdu(((Number) ((i3y) q4gVar.y).getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), 0.667f));
                    }
                }
                return new t8u(z9uVar, drawable2, oduVar);
            }
        }
        tariffOptionsCardHeaderFactory$createUltimaHeader$1 = new TariffOptionsCardHeaderFactory$createUltimaHeader$1(this, continuationImpl);
        TariffOptionsCardHeaderFactory$createUltimaHeader$1 tariffOptionsCardHeaderFactory$createUltimaHeader$122 = tariffOptionsCardHeaderFactory$createUltimaHeader$1;
        Object obj3 = tariffOptionsCardHeaderFactory$createUltimaHeader$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$createUltimaHeader$122.label;
        if (i != 0) {
        }
        z9u z9uVar2 = (z9u) obj3;
        q4g q4gVar2 = this.q;
        q4gVar2.getClass();
        i3y i3yVar2 = (i3y) q4gVar2.w;
        z2 = r9uVar2 instanceof o9u;
        odu oduVar2 = ldu.a;
        if (!z2) {
        }
        return new t8u(z9uVar2, drawable2, oduVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Integer num, boolean z, boolean z2, boolean z3, String str, idu iduVar, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$getHeaderInfo$1 tariffOptionsCardHeaderFactory$getHeaderInfo$1;
        Object obj;
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        String sb;
        String str2;
        Integer num2;
        boolean z4;
        String str3;
        boolean z5;
        pex0 pex0Var2;
        idu iduVar2;
        String str4;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2;
        boolean z6;
        Object c;
        boolean z7;
        idu iduVar3;
        CharSequence charSequence3;
        String str5;
        String str6;
        lcu lcuVar;
        String str7;
        pex0 pex0Var3;
        CharSequence charSequence4;
        Object d;
        ibu ibuVar;
        idu iduVar4;
        pex0 pex0Var4;
        String str8;
        String str9;
        String str10;
        CharSequence charSequence5;
        CharSequence charSequence6;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$getHeaderInfo$1) {
            tariffOptionsCardHeaderFactory$getHeaderInfo$1 = (TariffOptionsCardHeaderFactory$getHeaderInfo$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$getHeaderInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$getHeaderInfo$1.label = i2 - Integer.MIN_VALUE;
                TariffOptionsCardHeaderFactory$getHeaderInfo$1 tariffOptionsCardHeaderFactory$getHeaderInfo$12 = tariffOptionsCardHeaderFactory$getHeaderInfo$1;
                Object obj2 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$getHeaderInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                    ybo yboVar = pex0Var.h;
                    Integer valueOf = tariffOrderFlow == TariffOrderFlow.DELIVERY_FLOW ? Integer.valueOf(d1h0.ic_chevron_next_inverted) : null;
                    com.yandex.go.route.interactor.c cVar = this.f;
                    String F = q5z.F(cVar.g());
                    int size = cVar.c().b.size();
                    zuj0 zuj0Var = this.b;
                    String f = size > 1 ? ((avj0) zuj0Var).f(dwh0.summary_route_stops, cVar.c().b.size()) : q5z.F(cVar.d());
                    Pair pair = evu0.J(f) ? new Pair(a(valueOf, F), f) : new Pair(F, a(valueOf, f));
                    charSequence = (CharSequence) pair.getFirst();
                    charSequence2 = (CharSequence) pair.getSecond();
                    String obj3 = charSequence.toString();
                    String obj4 = charSequence2.toString();
                    StringBuilder sb2 = new StringBuilder();
                    if (!evu0.J(obj3)) {
                        sb2.append(((avj0) zuj0Var).h(kyh0.new_mainscreen_from) + Extension.FIX_SPACE + obj3);
                    }
                    if (!evu0.J(obj4)) {
                        sb2.append(Extension.FIX_SPACE + ((avj0) zuj0Var).h(kyh0.select_address_to) + Extension.FIX_SPACE + obj4);
                    }
                    sb = sb2.toString();
                    String str11 = yboVar.b;
                    if (evu0.J(str11)) {
                        str11 = this.d.a(yboVar.a);
                    }
                    String str12 = str11;
                    String str13 = pex0Var.l;
                    if (str13 == null) {
                        str13 = "";
                    }
                    str2 = str13;
                    String str14 = pex0Var.b;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0 = pex0Var;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$1 = priceUpdate$PriceLoadingState;
                    num2 = num;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$2 = num2;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$3 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4 = iduVar;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$5 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$6 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$7 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$8 = str12;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9 = charSequence;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10 = charSequence2;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11 = sb;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12 = str2;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13 = str14;
                    z4 = z;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$0 = z4;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1 = z2;
                    str3 = str12;
                    z5 = z3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$2 = z5;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.label = 1;
                    Object h = h(pex0Var, priceUpdate$PriceLoadingState, str, iduVar, tariffOptionsCardHeaderFactory$getHeaderInfo$12);
                    if (h != obj) {
                        pex0Var2 = pex0Var;
                        iduVar2 = iduVar;
                        obj2 = h;
                        str4 = str14;
                        priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
                        z6 = z2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z7 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1;
                        ibu ibuVar2 = (ibu) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$15;
                        lcuVar = (lcu) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$14;
                        String str15 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13;
                        String str16 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12;
                        String str17 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11;
                        CharSequence charSequence7 = (CharSequence) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10;
                        CharSequence charSequence8 = (CharSequence) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9;
                        idu iduVar5 = (idu) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4;
                        pex0Var4 = (pex0) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0;
                        kotlin.b.b(obj2);
                        ibuVar = ibuVar2;
                        str8 = str15;
                        str9 = str16;
                        str10 = str17;
                        charSequence5 = charSequence7;
                        charSequence6 = charSequence8;
                        iduVar4 = iduVar5;
                        return new z9u(charSequence6, charSequence5, str10, str9, str8, lcuVar, ibuVar, (nbu) obj2, z7, ((tfx0) this.j).a(pex0Var4), iduVar4);
                    }
                    boolean z8 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$2;
                    boolean z9 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1;
                    boolean z10 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$0;
                    lcu lcuVar2 = (lcu) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$14;
                    str6 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13;
                    str7 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12;
                    str5 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11;
                    charSequence4 = (CharSequence) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10;
                    charSequence3 = (CharSequence) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9;
                    idu iduVar6 = (idu) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$1;
                    pex0Var3 = (pex0) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0;
                    kotlin.b.b(obj2);
                    z5 = z8;
                    z7 = z9;
                    iduVar3 = iduVar6;
                    z4 = z10;
                    lcuVar = lcuVar2;
                    priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState3;
                    ibu ibuVar3 = (ibu) obj2;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0 = pex0Var3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$1 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$2 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$3 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4 = iduVar3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$5 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$6 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$7 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$8 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9 = charSequence3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10 = charSequence4;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11 = str5;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12 = str7;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13 = str6;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$14 = lcuVar;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$15 = ibuVar3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$0 = z4;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1 = z7;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$2 = z5;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.label = 3;
                    d = this.g.d(pex0Var3, priceUpdate$PriceLoadingState2, z4, tariffOptionsCardHeaderFactory$getHeaderInfo$12);
                    obj = obj;
                    if (d != obj) {
                        ibuVar = ibuVar3;
                        iduVar4 = iduVar3;
                        obj2 = d;
                        pex0Var4 = pex0Var3;
                        str8 = str6;
                        str9 = str7;
                        str10 = str5;
                        charSequence5 = charSequence4;
                        charSequence6 = charSequence3;
                        return new z9u(charSequence6, charSequence5, str10, str9, str8, lcuVar, ibuVar, (nbu) obj2, z7, ((tfx0) this.j).a(pex0Var4), iduVar4);
                    }
                    return obj;
                }
                boolean z11 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$2;
                z6 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1;
                boolean z12 = tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$0;
                String str18 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13;
                str2 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12;
                sb = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11;
                charSequence2 = (CharSequence) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10;
                charSequence = (CharSequence) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9;
                String str19 = (String) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$8;
                iduVar2 = (idu) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4;
                Integer num3 = (Integer) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$2;
                priceUpdate$PriceLoadingState2 = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$1;
                pex0Var2 = (pex0) tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0;
                kotlin.b.b(obj2);
                str3 = str19;
                num2 = num3;
                z4 = z12;
                str4 = str18;
                z5 = z11;
                lcu lcuVar3 = (lcu) obj2;
                if (!z5) {
                    str3 = null;
                }
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0 = pex0Var2;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$1 = priceUpdate$PriceLoadingState2;
                pex0 pex0Var5 = pex0Var2;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$2 = null;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$3 = null;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4 = iduVar2;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$5 = null;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$6 = null;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$7 = null;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$8 = null;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9 = charSequence;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10 = charSequence2;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11 = sb;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12 = str2;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13 = str4;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$14 = lcuVar3;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$0 = z4;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1 = z6;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$2 = z5;
                tariffOptionsCardHeaderFactory$getHeaderInfo$12.label = 2;
                c = this.g.c(pex0Var5, priceUpdate$PriceLoadingState2, num2, str3, tariffOptionsCardHeaderFactory$getHeaderInfo$12);
                if (c != obj) {
                    obj2 = c;
                    z7 = z6;
                    iduVar3 = iduVar2;
                    charSequence3 = charSequence;
                    str5 = sb;
                    str6 = str4;
                    lcuVar = lcuVar3;
                    CharSequence charSequence9 = charSequence2;
                    str7 = str2;
                    pex0Var3 = pex0Var5;
                    charSequence4 = charSequence9;
                    ibu ibuVar32 = (ibu) obj2;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$0 = pex0Var3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$1 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$2 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$3 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$4 = iduVar3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$5 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$6 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$7 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$8 = null;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$9 = charSequence3;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$10 = charSequence4;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$11 = str5;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$12 = str7;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$13 = str6;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$14 = lcuVar;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.L$15 = ibuVar32;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$0 = z4;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$1 = z7;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.Z$2 = z5;
                    tariffOptionsCardHeaderFactory$getHeaderInfo$12.label = 3;
                    d = this.g.d(pex0Var3, priceUpdate$PriceLoadingState2, z4, tariffOptionsCardHeaderFactory$getHeaderInfo$12);
                    obj = obj;
                    if (d != obj) {
                    }
                }
                return obj;
            }
        }
        tariffOptionsCardHeaderFactory$getHeaderInfo$1 = new TariffOptionsCardHeaderFactory$getHeaderInfo$1(this, continuationImpl);
        TariffOptionsCardHeaderFactory$getHeaderInfo$1 tariffOptionsCardHeaderFactory$getHeaderInfo$122 = tariffOptionsCardHeaderFactory$getHeaderInfo$1;
        Object obj22 = tariffOptionsCardHeaderFactory$getHeaderInfo$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$getHeaderInfo$122.label;
        if (i != 0) {
        }
        lcu lcuVar32 = (lcu) obj22;
        if (!z5) {
        }
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$0 = pex0Var2;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$1 = priceUpdate$PriceLoadingState2;
        pex0 pex0Var52 = pex0Var2;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$2 = null;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$3 = null;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$4 = iduVar2;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$5 = null;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$6 = null;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$7 = null;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$8 = null;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$9 = charSequence;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$10 = charSequence2;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$11 = sb;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$12 = str2;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$13 = str4;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.L$14 = lcuVar32;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.Z$0 = z4;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.Z$1 = z6;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.Z$2 = z5;
        tariffOptionsCardHeaderFactory$getHeaderInfo$122.label = 2;
        c = this.g.c(pex0Var52, priceUpdate$PriceLoadingState2, num2, str3, tariffOptionsCardHeaderFactory$getHeaderInfo$122);
        if (c != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(mi31 mi31Var, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$getPinDrawable$1 tariffOptionsCardHeaderFactory$getPinDrawable$1;
        int i;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$getPinDrawable$1) {
            tariffOptionsCardHeaderFactory$getPinDrawable$1 = (TariffOptionsCardHeaderFactory$getPinDrawable$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$getPinDrawable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$getPinDrawable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardHeaderFactory$getPinDrawable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$getPinDrawable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sq00 sq00Var = new sq00(((ru.yandex.taxi.styling.f) this.n).e(jl40.l(mi31Var.f, "multiclass_ultima") ? "ultima" : mi31Var.b), null, true, null, null, null, null, false, false, null, null, 0.0f, 8186);
                    tariffOptionsCardHeaderFactory$getPinDrawable$1.L$0 = null;
                    tariffOptionsCardHeaderFactory$getPinDrawable$1.L$1 = null;
                    tariffOptionsCardHeaderFactory$getPinDrawable$1.label = 1;
                    obj = this.m.h(sq00Var, tariffOptionsCardHeaderFactory$getPinDrawable$1);
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
                return pkf.g(new BitmapDrawable(this.a.getResources(), ((bl00) obj).a.get$image()), "fast_map_pin", this.p.getThemeType());
            }
        }
        tariffOptionsCardHeaderFactory$getPinDrawable$1 = new TariffOptionsCardHeaderFactory$getPinDrawable$1(this, continuationImpl);
        Object obj2 = tariffOptionsCardHeaderFactory$getPinDrawable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$getPinDrawable$1.label;
        if (i != 0) {
        }
        return pkf.g(new BitmapDrawable(this.a.getResources(), ((bl00) obj2).a.get$image()), "fast_map_pin", this.p.getThemeType());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, String str, idu iduVar, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$getTariffDescription$1 tariffOptionsCardHeaderFactory$getTariffDescription$1;
        int i;
        String e;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$getTariffDescription$1) {
            tariffOptionsCardHeaderFactory$getTariffDescription$1 = (TariffOptionsCardHeaderFactory$getTariffDescription$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$getTariffDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$getTariffDescription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardHeaderFactory$getTariffDescription$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$getTariffDescription$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(pex0Var.b, "child_tariff")) {
                        return new kcu("", "");
                    }
                    if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING && ((e = pex0Var.e()) == null || evu0.J(e))) {
                        return icu.a;
                    }
                    tariffOptionsCardHeaderFactory$getTariffDescription$1.L$0 = pex0Var;
                    tariffOptionsCardHeaderFactory$getTariffDescription$1.L$1 = priceUpdate$PriceLoadingState;
                    tariffOptionsCardHeaderFactory$getTariffDescription$1.L$2 = null;
                    tariffOptionsCardHeaderFactory$getTariffDescription$1.L$3 = iduVar;
                    tariffOptionsCardHeaderFactory$getTariffDescription$1.label = 1;
                    obj = i(pex0Var, str, tariffOptionsCardHeaderFactory$getTariffDescription$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iduVar = (idu) tariffOptionsCardHeaderFactory$getTariffDescription$1.L$3;
                    priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderFactory$getTariffDescription$1.L$1;
                    pex0Var = (pex0) tariffOptionsCardHeaderFactory$getTariffDescription$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                AttributedDescription attributedDescription = pex0Var.G0;
                String str2 = attributedDescription == null ? attributedDescription.a : null;
                String str3 = str2 != null ? str2 : "";
                if (!iduVar.g) {
                    return new kcu(charSequence, str3);
                }
                int i3 = vhx0.a[priceUpdate$PriceLoadingState.ordinal()];
                if (i3 == 1) {
                    return new jcu(charSequence, str3);
                }
                if (i3 == 2 || i3 == 3 || i3 == 4) {
                    return new kcu(charSequence, str3);
                }
                w511.b();
                return null;
            }
        }
        tariffOptionsCardHeaderFactory$getTariffDescription$1 = new TariffOptionsCardHeaderFactory$getTariffDescription$1(this, continuationImpl);
        Object obj3 = tariffOptionsCardHeaderFactory$getTariffDescription$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$getTariffDescription$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj3;
        AttributedDescription attributedDescription2 = pex0Var.G0;
        if (attributedDescription2 == null) {
        }
        if (str2 != null) {
        }
        if (!iduVar.g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(pex0 pex0Var, String str, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderFactory$getTariffDescriptionText$1 tariffOptionsCardHeaderFactory$getTariffDescriptionText$1;
        int i;
        FormattedText formattedText;
        if (continuationImpl instanceof TariffOptionsCardHeaderFactory$getTariffDescriptionText$1) {
            tariffOptionsCardHeaderFactory$getTariffDescriptionText$1 = (TariffOptionsCardHeaderFactory$getTariffDescriptionText$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.label;
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
                    tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.L$0 = null;
                    tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.L$1 = null;
                    tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.L$2 = null;
                    tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.L$3 = null;
                    tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.label = 1;
                    obj = this.c.x(formattedText, tariffOptionsCardHeaderFactory$getTariffDescriptionText$1);
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
        tariffOptionsCardHeaderFactory$getTariffDescriptionText$1 = new TariffOptionsCardHeaderFactory$getTariffDescriptionText$1(this, continuationImpl);
        Object obj2 = tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderFactory$getTariffDescriptionText$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }
}
