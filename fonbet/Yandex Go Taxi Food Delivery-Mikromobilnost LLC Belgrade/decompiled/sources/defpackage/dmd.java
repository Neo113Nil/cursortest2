package defpackage;

import android.graphics.Color;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.UPSALE_STEP_VIEW;
import com.yandex.plus.pay.repository.api.model.offers.CompositeOfferDetails$PaymentMethod$Type;
import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import com.yandex.plus.pay.repository.api.model.offers.Price;
import com.yandex.plus.pay.repository.api.model.offers.RichText;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleType;
import com.yandex.plus.pay.repository.api.model.widget.WebPaymentWidgetTimeoutParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class dmd {
    public final gby a;
    public final ji4 b;
    public final j3k0 c;
    public final aku0 d;

    public dmd(gby gbyVar, ji4 ji4Var, j3k0 j3k0Var, aku0 aku0Var) {
        this.a = gbyVar;
        this.b = ji4Var;
        this.c = j3k0Var;
        this.d = aku0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public static em0 a(emd emdVar) {
        List list;
        ht60 ht60Var;
        UpsaleType upsaleType;
        String str = emdVar.a;
        String str2 = emdVar.d;
        ArrayList arrayList = emdVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            am0 am0Var = ((jmd) it.next()).b;
            String str3 = am0Var.g;
            String str4 = am0Var.h;
            String str5 = am0Var.j;
            String str6 = am0Var.l;
            String str7 = am0Var.k;
            String str8 = am0Var.a;
            ArrayList<xl0> arrayList3 = am0Var.b;
            ArrayList arrayList4 = new ArrayList();
            for (xl0 xl0Var : arrayList3) {
                String str9 = xl0Var != null ? xl0Var.a : null;
                if (str9 != null) {
                    arrayList4.add(str9);
                }
            }
            String str10 = am0Var.c;
            Map map = am0Var.d;
            boolean z = am0Var.e;
            String str11 = str;
            boolean z2 = am0Var.f;
            ArrayList arrayList5 = am0Var.i;
            UpsaleStep h = yma1.h(am0Var.m);
            int i = hm0.b[am0Var.n.ordinal()];
            String str12 = str2;
            if (i == 1) {
                ht60Var = null;
                upsaleType = UpsaleType.ADDITION;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new GraphQLParseException("Unexpected UPSALE_TYPE_VIEW value", null);
                    }
                    w511.b();
                    return null;
                }
                ht60Var = null;
                upsaleType = UpsaleType.REPLACE;
            }
            UpsaleType upsaleType2 = upsaleType;
            yl0 yl0Var = am0Var.o;
            if (yl0Var != null) {
                ht60Var = new ht60(yl0Var.a, yl0Var.b);
            }
            arrayList2.add(new zl0(str3, str4, str5, str6, str7, str8, arrayList4, str10, map, z, z2, arrayList5, h, upsaleType2, ht60Var));
            str = str11;
            str2 = str12;
        }
        String str13 = str;
        String str14 = str2;
        List list2 = emdVar.c;
        if (list2 != null) {
            List list3 = list2;
            list = new ArrayList(tcc.n(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                list.add(yma1.h((UPSALE_STEP_VIEW) it2.next()));
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = EmptyList.a;
        }
        kmd kmdVar = emdVar.e;
        return new em0(str13, str14, arrayList2, list, kmdVar != null ? new ht60(kmdVar.a, kmdVar.b) : null);
    }

    public static /* synthetic */ eld g(dmd dmdVar, c4a0 c4a0Var, CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type, PlusThemedUrl plusThemedUrl, WebPaymentWidgetTimeoutParams webPaymentWidgetTimeoutParams, int i) {
        if ((i & 4) != 0) {
            plusThemedUrl = null;
        }
        return dmdVar.c(c4a0Var, compositeOfferDetails$PaymentMethod$Type, null, plusThemedUrl, (i & 8) != 0 ? null : webPaymentWidgetTimeoutParams);
    }

    public static int i(String str) {
        Object failure;
        try {
            failure = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return ((Number) failure).intValue();
        }
        throw new GraphQLParseException("Couldn't parse color: ".concat(str), a);
    }

    public final eld b(qmd qmdVar) {
        dmd dmdVar;
        eld eldVar;
        dmd dmdVar2;
        eld eldVar2;
        mmd mmdVar = qmdVar.b;
        lmd lmdVar = qmdVar.d;
        omd omdVar = qmdVar.f;
        if (mmdVar != null) {
            return g(this, mmdVar.b, CompositeOfferDetails$PaymentMethod$Type.NEW_CARD, null, null, 14);
        }
        nmd nmdVar = qmdVar.c;
        if (nmdVar != null) {
            return g(this, nmdVar.b, CompositeOfferDetails$PaymentMethod$Type.NEW_SBP, null, null, 14);
        }
        if (omdVar != null) {
            umd umdVar = omdVar.b;
            c4a0 c4a0Var = omdVar.c;
            CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type = CompositeOfferDetails$PaymentMethod$Type.NEW_YB_CARD;
            PlusThemedUrl plusThemedUrl = new PlusThemedUrl(umdVar.a, umdVar.b);
            vmd vmdVar = umdVar.c;
            dmdVar = this;
            eldVar = g(dmdVar, c4a0Var, compositeOfferDetails$PaymentMethod$Type, plusThemedUrl, new WebPaymentWidgetTimeoutParams(vmdVar != null ? Long.valueOf(vmdVar.b) : null, vmdVar != null ? Long.valueOf(vmdVar.a) : null), 2);
        } else {
            dmdVar = this;
            eldVar = null;
        }
        if (eldVar != null) {
            return eldVar;
        }
        if (lmdVar != null) {
            xmd xmdVar = lmdVar.c;
            c4a0 c4a0Var2 = lmdVar.d;
            dmdVar2 = dmdVar;
            CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type2 = CompositeOfferDetails$PaymentMethod$Type.CARD;
            String str = lmdVar.b;
            PlusThemedUrl plusThemedUrl2 = new PlusThemedUrl(xmdVar != null ? xmdVar.a : null, xmdVar != null ? xmdVar.b : null);
            wmd wmdVar = xmdVar != null ? xmdVar.c : null;
            eldVar2 = dmdVar2.c(c4a0Var2, compositeOfferDetails$PaymentMethod$Type2, str, plusThemedUrl2, new WebPaymentWidgetTimeoutParams(wmdVar != null ? Long.valueOf(wmdVar.b) : null, wmdVar != null ? Long.valueOf(wmdVar.a) : null));
        } else {
            dmdVar2 = dmdVar;
            eldVar2 = null;
        }
        if (eldVar2 != null) {
            return eldVar2;
        }
        pmd pmdVar = qmdVar.e;
        if (pmdVar != null) {
            return g(dmdVar2, pmdVar.b, CompositeOfferDetails$PaymentMethod$Type.SBP, null, null, 14);
        }
        return null;
    }

    public final eld c(c4a0 c4a0Var, CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type, String str, PlusThemedUrl plusThemedUrl, WebPaymentWidgetTimeoutParams webPaymentWidgetTimeoutParams) {
        dld dldVar;
        String str2 = c4a0Var.a;
        String str3 = c4a0Var.b;
        a4a0 a4a0Var = c4a0Var.c;
        String str4 = a4a0Var.b;
        z3a0 z3a0Var = c4a0Var.d;
        PlusThemedImage plusThemedImage = new PlusThemedImage(str4, z3a0Var.b);
        PlusThemedColor plusThemedColor = new PlusThemedColor(new PlusColor.Color(i(a4a0Var.c)), new PlusColor.Color(i(z3a0Var.c)));
        PlusThemedColor plusThemedColor2 = new PlusThemedColor(new PlusColor.Color(i(a4a0Var.a)), new PlusColor.Color(i(z3a0Var.a)));
        v3a0 v3a0Var = c4a0Var.e;
        if (v3a0Var != null) {
            rw90 rw90Var = v3a0Var.b;
            pw90 pw90Var = rw90Var.a;
            RichText h = pw90Var != null ? h(pw90Var.b) : null;
            qw90 qw90Var = rw90Var.b;
            dldVar = new dld(h, qw90Var != null ? h(qw90Var.b) : null);
        } else {
            dldVar = null;
        }
        return new eld(str2, compositeOfferDetails$PaymentMethod$Type, str, str3, plusThemedImage, plusThemedColor, plusThemedColor2, dldVar, plusThemedUrl, webPaymentWidgetTimeoutParams);
    }

    public final lld d(xgx0 xgx0Var) {
        PlusColor plusColor;
        String str = xgx0Var.a;
        String str2 = xgx0Var.b;
        String str3 = xgx0Var.c;
        String str4 = xgx0Var.d;
        Map map = xgx0Var.e;
        Map map2 = xgx0Var.f;
        String str5 = xgx0Var.g;
        String str6 = xgx0Var.h.a;
        ugx0 ugx0Var = xgx0Var.i;
        InAppReplacementParams inAppReplacementParams = null;
        if (ugx0Var != null) {
            hi4 hi4Var = ugx0Var.b;
            String str7 = hi4Var.a;
            List list = hi4Var.b;
            this.b.getClass();
            plusColor = ji4.a(str7, list);
        } else {
            plusColor = null;
        }
        vgx0 vgx0Var = xgx0Var.j;
        if (vgx0Var != null) {
            wju0 wju0Var = vgx0Var.b;
            this.d.getClass();
            inAppReplacementParams = aku0.a(wju0Var);
        }
        return new lld(str, str2, str3, str4, map, map2, str5, str6, plusColor, inAppReplacementParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public final old e(gmd gmdVar) {
        ArrayList arrayList;
        ArrayList<ykd> arrayList2;
        ArrayList arrayList3;
        lld d;
        Object failure;
        emd emdVar;
        lld lldVar;
        hld hldVar;
        xkd xkdVar;
        Price price;
        List list;
        Iterator it;
        ArrayList arrayList4;
        gld gldVar;
        PlusThemedImage plusThemedImage;
        fmd fmdVar = gmdVar.a;
        rmd rmdVar = fmdVar.c;
        pld pldVar = fmdVar.d;
        mld mldVar = pldVar.a;
        xgx0 xgx0Var = mldVar != null ? mldVar.b : null;
        List list2 = pldVar.b;
        zkd zkdVar = pldVar.c;
        yay yayVar = zkdVar != null ? zkdVar.b : null;
        tmd tmdVar = rmdVar != null ? rmdVar.g : null;
        ild ildVar = pldVar.d;
        jld jldVar = pldVar.e;
        ArrayList arrayList5 = pldVar.f;
        ArrayList arrayList6 = rmdVar != null ? rmdVar.e : null;
        ?? r13 = EmptyList.a;
        if (arrayList6 == null) {
            arrayList6 = r13;
        }
        String str = rmdVar != null ? rmdVar.b : null;
        String str2 = rmdVar != null ? rmdVar.c : null;
        String str3 = rmdVar != null ? rmdVar.d : null;
        if (rmdVar != null) {
            ArrayList arrayList7 = rmdVar.a;
            arrayList = new ArrayList();
            for (Object obj : arrayList7) {
                yay yayVar2 = yayVar;
                if (!((hmd) obj).b.isEmpty()) {
                    arrayList.add(obj);
                }
                yayVar = yayVar2;
            }
        } else {
            arrayList = null;
        }
        yay yayVar3 = yayVar;
        if (arrayList == null) {
            arrayList = r13;
        }
        if (rmdVar == null || (list = rmdVar.f) == null) {
            arrayList2 = arrayList5;
            arrayList3 = null;
        } else {
            arrayList3 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                smd smdVar = (smd) it2.next();
                if (smdVar != null) {
                    hha0 hha0Var = smdVar.b;
                    RichText h = h(hha0Var.a.b);
                    zga0 zga0Var = hha0Var.b;
                    RichText h2 = zga0Var != null ? h(zga0Var.b) : null;
                    eha0 eha0Var = hha0Var.c;
                    it = it2;
                    if (eha0Var != null) {
                        arrayList4 = arrayList5;
                        plusThemedImage = new PlusThemedImage(eha0Var.a.a, eha0Var.b.a);
                    } else {
                        arrayList4 = arrayList5;
                        plusThemedImage = null;
                    }
                    aha0 aha0Var = hha0Var.d;
                    this.c.getClass();
                    gldVar = new gld(h, h2, plusThemedImage, new PlusThemedColor(j3k0.b(aha0Var.a.b), j3k0.b(aha0Var.b.b)), hha0Var.e);
                } else {
                    it = it2;
                    arrayList4 = arrayList5;
                    gldVar = null;
                }
                if (gldVar != null) {
                    arrayList3.add(gldVar);
                }
                it2 = it;
                arrayList5 = arrayList4;
            }
            arrayList2 = arrayList5;
        }
        if (arrayList3 != null) {
            r13 = arrayList3;
        }
        emd emdVar2 = fmdVar.b;
        if (xgx0Var != null) {
            try {
                d = d(xgx0Var);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        } else {
            d = null;
        }
        List f = f(list2);
        this.a.getClass();
        LegalInfo a = gby.a(yayVar3);
        RichText h3 = tmdVar != null ? h(tmdVar.a.b) : null;
        hld hldVar2 = new hld(ildVar.a, ildVar.b);
        kld kldVar = new kld(jldVar.a, jldVar.b);
        ArrayList arrayList8 = new ArrayList();
        for (ykd ykdVar : arrayList2) {
            if (ykdVar != null) {
                long j = ykdVar.b;
                ct60 ct60Var = ykdVar.a.b;
                emdVar = emdVar2;
                lldVar = d;
                hldVar = hldVar2;
                Price price2 = new Price(new BigDecimal(ct60Var.b.toString()), ct60Var.a.getRawValue());
                ald aldVar = ykdVar.c;
                if (aldVar != null) {
                    ct60 ct60Var2 = aldVar.b;
                    price = new Price(new BigDecimal(ct60Var2.b.toString()), ct60Var2.a.getRawValue());
                } else {
                    price = null;
                }
                xkdVar = new xkd(j, price2, price);
            } else {
                emdVar = emdVar2;
                lldVar = d;
                hldVar = hldVar2;
                xkdVar = null;
            }
            if (xkdVar != null) {
                arrayList8.add(xkdVar);
            }
            emdVar2 = emdVar;
            d = lldVar;
            hldVar2 = hldVar;
        }
        emd emdVar3 = emdVar2;
        lld lldVar2 = d;
        hld hldVar3 = hldVar2;
        Boolean bool = pldVar.g;
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            eld b = b((qmd) it3.next());
            if (b != null) {
                arrayList9.add(b);
            }
        }
        ArrayList<hmd> arrayList10 = arrayList;
        ArrayList arrayList11 = new ArrayList(tcc.n(arrayList10, 10));
        for (hmd hmdVar : arrayList10) {
            arrayList11.add(new fld(hmdVar.a, a.M(hmdVar.b), r13));
        }
        failure = new old(lldVar2, f, a, h3, hldVar3, kldVar, arrayList8, bool, arrayList9, str, str2, str3, arrayList11, a(emdVar3));
        Throwable a2 = Result.a(failure);
        if (a2 == null) {
            return (old) failure;
        }
        throw new GraphQLParseException(null, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [bld] */
    public final List f(List list) {
        if (list == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cld cldVar = (cld) it.next();
            PlusColor plusColor = null;
            if (cldVar != null) {
                se70 se70Var = cldVar.b;
                String str = se70Var.a;
                String str2 = se70Var.b;
                String str3 = se70Var.c;
                String str4 = se70Var.d;
                Map map = se70Var.e;
                Map map2 = se70Var.f;
                String str5 = se70Var.g;
                String str6 = se70Var.h.a;
                qe70 qe70Var = se70Var.i;
                if (qe70Var != null) {
                    hi4 hi4Var = qe70Var.b;
                    String str7 = hi4Var.a;
                    List list2 = hi4Var.b;
                    this.b.getClass();
                    plusColor = ji4.a(str7, list2);
                }
                plusColor = new bld(str, str2, str3, str4, map, map2, str5, str6, plusColor);
            }
            if (plusColor != null) {
                arrayList.add(plusColor);
            }
        }
        return arrayList;
    }

    public final RichText h(i3k0 i3k0Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        String str = i3k0Var.a;
        ArrayList arrayList = i3k0Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j4k0 j4k0Var = ((h3k0) it.next()).b;
            String str2 = j4k0Var.b;
            String str3 = j4k0Var.c;
            h4k0 h4k0Var = j4k0Var.g;
            if (h4k0Var != null) {
                parcelable2 = new RichText.Item.Link(str2, str3, h4k0Var.a, h4k0Var.b);
            } else {
                i4k0 i4k0Var = j4k0Var.h;
                if (i4k0Var != null) {
                    parcelable2 = new RichText.Item.StrikeThrough(str2, str3, i4k0Var.a);
                } else {
                    f4k0 f4k0Var = j4k0Var.e;
                    Parcelable highlight = f4k0Var != null ? new RichText.Item.Highlight(str2, str3, f4k0Var.a) : null;
                    if (highlight != null) {
                        parcelable2 = highlight;
                    } else {
                        g4k0 g4k0Var = j4k0Var.f;
                        if (g4k0Var != null) {
                            b4k0 b4k0Var = g4k0Var.a;
                            parcelable = new RichText.Item.Icon(str2, str3, (String) null, new PlusThemedImage(b4k0Var.a.a, b4k0Var.b.a), 4, (DefaultConstructorMarker) null);
                        } else {
                            parcelable = null;
                        }
                        if (parcelable == null) {
                            e4k0 e4k0Var = j4k0Var.d;
                            if (e4k0Var != null) {
                                String str4 = e4k0Var.a;
                                y3k0 y3k0Var = e4k0Var.b;
                                this.c.getClass();
                                parcelable = new RichText.Item.TextColor(str2, str3, str4, new PlusThemedColor(j3k0.b(y3k0Var.a.b), j3k0.b(y3k0Var.b.b)));
                            } else {
                                parcelable2 = null;
                            }
                        }
                        parcelable2 = parcelable;
                    }
                }
            }
            if (parcelable2 != null) {
                arrayList2.add(parcelable2);
            }
        }
        return new RichText(str, arrayList2);
    }
}
