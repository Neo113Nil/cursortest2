package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.ProductsScreenEvents$ProductsScreenProductNfcShownNfcState;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.main.internal.domain.entities.ProductType;
import com.ybsdk.feature.main.internal.widgets.ProductCardView$State$SubtitleType;
import com.ybsdk.feature.nfc.api.models.NfcPaymentMethod;
import com.ybsdk.feature.nfc.api.models.NfcProductType;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.ProductsV4GradientConfig;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class mcf0 implements ev31 {
    public static final y760 A;
    public static final int x = l1i0.Widget_YB_Text_Numbers7;
    public static final int y = l1i0.Widget_YB_Text_Title2;
    public static final y760 z;
    public final AppAnalyticsReporter a;
    public final rb00 b;
    public final Context c;
    public kcf0 w;

    static {
        v4b1.f(nyg0.ybsdk_ic_nfc_disable_card_badge);
        b bVar = Text.Companion;
        int i = dzh0.ybsdk_nfc_payments_card_badge_state_not_working;
        bVar.getClass();
        new Text.Resource(i);
        z = new y760(nyg0.ybsdk_background_nfc_enable_card_badge, new nbv(nyg0.ybsdk_ic_nfc_enable_card_badge, null), new Text.Resource(dzh0.ybsdk_nfc_payments_card_badge_state_ready_for_payment), ung0.ybColor_textIcon_primaryStatic);
        A = new y760(nyg0.ybsdk_background_nfc_enable_card_badge, new nbv(nyg0.ybsdk_ic_nfc_enable_card_badge, null), new Text.Resource(dzh0.ybsdk_nfc_payments_card_badge_state_need_enable), ung0.ybColor_textIcon_primaryStatic);
    }

    public mcf0(AppAnalyticsReporter appAnalyticsReporter, rb00 rb00Var, Context context) {
        this.a = appAnalyticsReporter;
        this.b = rb00Var;
        this.c = context;
    }

    public static ArrayList b(List list) {
        m7f0 m7f0Var;
        List K = a.K(list);
        n7f0 n7f0Var = (n7f0) a.Z(list);
        m7f0 m7f0Var2 = n7f0Var.p;
        if (m7f0Var2 != null) {
            m7f0Var = new m7f0(m7f0Var2.a, m7f0Var2.b, x, m7f0Var2.d, m7f0Var2.e, m7f0Var2.f, m7f0Var2.g, m7f0Var2.h);
        } else {
            m7f0Var = null;
        }
        return a.m0(Collections.singletonList(n7f0.a(n7f0Var, null, m7f0Var, 2064383)), K);
    }

    public static NfcProductType d(ProductType productType) {
        switch (lcf0.a[productType.ordinal()]) {
            case 1:
            case 2:
                return NfcProductType.UNKNOWN;
            case 3:
                return NfcProductType.WALLET;
            case 4:
                return NfcProductType.CREDIT_LIMIT;
            case 5:
                return NfcProductType.PRO;
            case 6:
                return NfcProductType.CORP_CARD;
            default:
                w511.b();
                return null;
        }
    }

    public static rbf0 f(kbf0 kbf0Var) {
        ImageView.ScaleType scaleType;
        float f = kbf0Var.a;
        float f2 = kbf0Var.b;
        qbf0 g = g(kbf0Var.c);
        ArrayList arrayList = kbf0Var.d;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(g((lbf0) it.next()));
        }
        Long l = kbf0Var.e;
        jbf0 jbf0Var = kbf0Var.f;
        rbv rbvVar = jbf0Var.a;
        int i = lcf0.c[jbf0Var.b.ordinal()];
        if (i == 1) {
            scaleType = ImageView.ScaleType.FIT_START;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            scaleType = ImageView.ScaleType.FIT_END;
        }
        return new rbf0(f, f2, g, arrayList2, l, new pbf0(rbvVar, scaleType));
    }

    public static final qbf0 g(lbf0 lbf0Var) {
        ArrayList arrayList;
        ArrayList<ibf0> arrayList2 = lbf0Var.a;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        for (ibf0 ibf0Var : arrayList2) {
            arrayList3.add(new obf0(ibf0Var.b, ibf0Var.a));
        }
        float f = lbf0Var.b;
        float f2 = lbf0Var.c;
        float f3 = lbf0Var.d;
        List list = lbf0Var.e;
        if (list != null) {
            List<hbf0> list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            for (hbf0 hbf0Var : list2) {
                arrayList.add(new nbf0(hbf0Var.a, hbf0Var.b, hbf0Var.c, hbf0Var.d));
            }
        } else {
            arrayList = null;
        }
        return new qbf0(arrayList3, f, f2, f3, arrayList);
    }

    public final void a(n7f0 n7f0Var, ProductsScreenEvents$ProductsScreenProductNfcShownNfcState productsScreenEvents$ProductsScreenProductNfcShownNfcState) {
        String obj = n7f0Var.c.toString();
        kcf0 kcf0Var = new kcf0(obj, productsScreenEvents$ProductsScreenProductNfcShownNfcState);
        if (kcf0Var.equals(this.w)) {
            return;
        }
        l0p l0pVar = this.a.T;
        LinkedHashMap w = g8e.w(3, "product_type", obj);
        w.put("nfc_state", productsScreenEvents$ProductsScreenProductNfcShownNfcState.getOriginalValue());
        l0pVar.a.a("products_screen.product.nfc.shown", w);
        this.w = kcf0Var;
    }

    public final n7f0 c(n7f0 n7f0Var, e960 e960Var, boolean z2) {
        if (n7f0Var.r != null) {
            return n7f0.a(n7f0Var, null, null, 2093055);
        }
        if (z2 && jl40.l(e960Var, c960.a)) {
            n7f0 a = n7f0.a(n7f0Var, z, null, 2093055);
            a(n7f0Var, ProductsScreenEvents$ProductsScreenProductNfcShownNfcState.READY_TO_PAY);
            return a;
        }
        if (e960Var instanceof c960) {
            n7f0 a2 = n7f0.a(n7f0Var, A, null, 2093055);
            a(n7f0Var, ProductsScreenEvents$ProductsScreenProductNfcShownNfcState.NEED_TO_ENABLE);
            return a2;
        }
        if ((e960Var instanceof d960) || e960Var == null) {
            return n7f0Var;
        }
        w511.b();
        return null;
    }

    public final m7f0 e(d2v0 d2v0Var, boolean z2, ColorModel colorModel, int i) {
        m7f0 m7f0Var;
        y5i0 y5i0Var;
        ProductCardView$State$SubtitleType productCardView$State$SubtitleType;
        Text.Constant constant = d2v0Var.a;
        m7f0 m7f0Var2 = null;
        Text.Constant constant2 = d.b(constant) ? constant : null;
        if (constant2 == null) {
            return null;
        }
        ColorModel colorModel2 = d2v0Var.c;
        boolean z3 = z2 && jl40.l(d2v0Var.b, Boolean.TRUE);
        ColorModel colorModel3 = d2v0Var.d;
        ColorModel colorModel4 = colorModel3 == null ? colorModel : colorModel3;
        rbv rbvVar = d2v0Var.e;
        v5i0 v5i0Var = d2v0Var.f;
        if (v5i0Var != null) {
            float f = v5i0Var.a;
            float f2 = v5i0Var.b;
            float f3 = v5i0Var.c;
            ArrayList<m5i0> arrayList = v5i0Var.d;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (m5i0 m5i0Var : arrayList) {
                arrayList2.add(new x5i0(m5i0Var.a, m5i0Var.b.get(this.c)));
                m7f0Var2 = m7f0Var2;
            }
            m7f0Var = m7f0Var2;
            y5i0Var = new y5i0(f, f2, f3, arrayList2);
        } else {
            m7f0Var = null;
            y5i0Var = null;
        }
        int i2 = lcf0.b[d2v0Var.g.ordinal()];
        if (i2 == 1) {
            productCardView$State$SubtitleType = ProductCardView$State$SubtitleType.ULTRA;
        } else {
            if (i2 != 2) {
                w511.b();
                return m7f0Var;
            }
            productCardView$State$SubtitleType = ProductCardView$State$SubtitleType.DEFAULT;
        }
        return new m7f0(constant2, colorModel2, i, z3, colorModel4, rbvVar, y5i0Var, productCardView$State$SubtitleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, java.util.ArrayList] */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        boolean z2;
        List list;
        jj11 jj11Var;
        u8j0 u8j0Var;
        kao kaoVar;
        boolean z3;
        rb00 rb00Var;
        rbf0 rbf0Var;
        boolean z4;
        boolean z5;
        jj11 jj11Var2;
        kao kaoVar2;
        l7f0 l7f0Var;
        jbv jbvVar;
        String str;
        Pair pair;
        r8j0 r8j0Var;
        lj11 lj11Var;
        yon yonVar;
        laf0 laf0Var;
        List list2;
        kpn kpnVar;
        YbButtonView.a aVar;
        dlg0 dlg0Var;
        List list3;
        dbf0 dbf0Var = (dbf0) obj;
        jj11 jj11Var3 = dbf0Var.g;
        u8j0 u8j0Var2 = dbf0Var.a;
        kao a = u8j0Var2 instanceof s8j0 ? r501.a(((s8j0) u8j0Var2).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : null;
        boolean z6 = (u8j0Var2 instanceof t8j0) || dbf0Var.b;
        laf0 laf0Var2 = (laf0) u8j0Var2.a();
        List list4 = EmptyList.a;
        if (laf0Var2 == null || (list3 = laf0Var2.b) == null) {
            z2 = true;
            list = list4;
        } else {
            List<z8f0> list5 = list3;
            ArrayList arrayList = new ArrayList(tcc.n(list5, 10));
            for (z8f0 z8f0Var : list5) {
                arrayList.add(new jpl(new ctu0(z8f0Var.b), z8f0Var.a, null, null, 20));
            }
            z2 = true;
            list = arrayList;
        }
        e960 e960Var = dbf0Var.d;
        laf0 laf0Var3 = (laf0) u8j0Var2.a();
        rb00 rb00Var2 = this.b;
        if (laf0Var3 == null) {
            jj11Var = jj11Var3;
            u8j0Var = u8j0Var2;
            kaoVar = a;
            z3 = z6;
            rb00Var = rb00Var2;
            rbf0Var = null;
        } else {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            List list6 = laf0Var3.a;
            ?? arrayList2 = new ArrayList(tcc.n(list6, 10));
            Iterator it = list6.iterator();
            while (it.hasNext()) {
                d7f0 d7f0Var = (d7f0) it.next();
                boolean z7 = (dbf0Var.k || !dbf0Var.l) ? false : z2;
                eh4 eh4Var = d7f0Var.h;
                boolean z8 = z6;
                fxy0 fxy0Var = eh4Var.a;
                Iterator it2 = it;
                lrp0 lrp0Var = lrp0.v;
                ColorModel b = gxy0.b(fxy0Var, lrp0Var);
                rb00 rb00Var3 = rb00Var2;
                String str2 = d7f0Var.a;
                String str3 = d7f0Var.b;
                ProductType productType = d7f0Var.c;
                Text text = d7f0Var.f;
                if (text == null) {
                    text = Text.Empty.INSTANCE;
                }
                Text text2 = text;
                ColorModel colorModel = d7f0Var.g;
                d2v0 d2v0Var = d7f0Var.j;
                u8j0 u8j0Var3 = u8j0Var2;
                m7f0 e = d2v0Var != null ? e(d2v0Var, z7, b, l1i0.Widget_YB_Text_Title2) : null;
                d2v0 d2v0Var2 = d7f0Var.k;
                m7f0 e2 = d2v0Var2 != null ? e(d2v0Var2, z7, b, y) : null;
                rr51 rr51Var = d7f0Var.n;
                if (rr51Var != null) {
                    if (jl40.l(e960Var, c960.a)) {
                        str = "nfc_on";
                    } else {
                        if (!jl40.l(e960Var, d960.a) && e960Var != null) {
                            w511.b();
                            return null;
                        }
                        str = "nfc_off";
                    }
                    ListBuilder a2 = rcc.a();
                    jj11Var2 = jj11Var3;
                    kaoVar2 = a;
                    a2.add(new c5z("nfc_state", str));
                    l7f0Var = new l7f0(rr51Var, a2.j());
                } else {
                    jj11Var2 = jj11Var3;
                    kaoVar2 = a;
                    l7f0Var = null;
                }
                Text text3 = d7f0Var.f;
                List list7 = d7f0Var.e;
                ColorModel b2 = gxy0.b(eh4Var.a, lrp0Var);
                fxy0 fxy0Var2 = eh4Var.b;
                Context context = this.c;
                if (fxy0Var2 != null) {
                    String str4 = (String) fxy0Var2.a;
                    String str5 = (String) fxy0Var2.b;
                    rev revVar = rev.f;
                    jbv a3 = fob1.a(new pbv(str5, (ccv) null, revVar, (dcv) null, (vfv) null, 58), new pbv(str4, (ccv) null, revVar, (dcv) null, (vfv) null, 58));
                    v4b1.g(a3, context);
                    jbvVar = a3;
                } else {
                    jbvVar = null;
                }
                dyt dytVar = eh4Var.c;
                qzt c = dytVar != null ? pha1.c(dytVar, context, lrp0Var) : null;
                String str6 = d7f0Var.d;
                rvt0 rvt0Var = d7f0Var.i;
                k7f0 k7f0Var = new k7f0(rvt0Var.a, rvt0Var.c, rvt0Var.b);
                rbv rbvVar = d7f0Var.l;
                z6f0 z6f0Var = d7f0Var.m;
                j7f0 j7f0Var = z6f0Var != null ? new j7f0(z6f0Var.a) : null;
                a9f0 a9f0Var = d7f0Var.o;
                arrayList2.add(new n7f0(str2, str3, productType, text2, colorModel, text3, list7, b2, jbvVar, c, str6, k7f0Var, null, rbvVar, j7f0Var, e, e2, l7f0Var, a9f0Var != null ? a9f0Var.a : null, d7f0Var.p));
                z6 = z8;
                it = it2;
                rb00Var2 = rb00Var3;
                u8j0Var2 = u8j0Var3;
                jj11Var3 = jj11Var2;
                a = kaoVar2;
            }
            jj11Var = jj11Var3;
            u8j0Var = u8j0Var2;
            kaoVar = a;
            z3 = z6;
            rb00Var = rb00Var2;
            rbf0Var = null;
            ref$ObjectRef.element = arrayList2;
            if (arrayList2.isEmpty()) {
                list4 = (List) ref$ObjectRef.element;
            } else {
                boolean z9 = laf0Var3.f;
                T t = ref$ObjectRef.element;
                if (z9) {
                    n7f0 n7f0Var = (n7f0) a.Z((List) t);
                    switch (lcf0.a[n7f0Var.c.ordinal()]) {
                        case 1:
                        case 2:
                            z4 = false;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            z4 = z2;
                            break;
                        case 6:
                            z4 = ((CommonFeatureFlag) ((t400) rb00Var).a.d(wlp.l0).getData()).isEnabled();
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    if (z4) {
                        List<NfcPaymentMethod> list8 = dbf0Var.h;
                        if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                            for (NfcPaymentMethod nfcPaymentMethod : list8) {
                                if (nfcPaymentMethod instanceof NfcPaymentMethod.Product) {
                                    if (((NfcPaymentMethod.Product) nfcPaymentMethod).getNfcProductType() == d(n7f0Var.c)) {
                                        z5 = z2;
                                        ref$ObjectRef.element = b(a.o0(a.K((List) ref$ObjectRef.element), c(n7f0Var, e960Var, z5)));
                                    }
                                } else if (!(nfcPaymentMethod instanceof NfcPaymentMethod.External) && !(nfcPaymentMethod instanceof NfcPaymentMethod.Yellow)) {
                                    w511.b();
                                    return null;
                                }
                            }
                        }
                        z5 = false;
                        ref$ObjectRef.element = b(a.o0(a.K((List) ref$ObjectRef.element), c(n7f0Var, e960Var, z5)));
                    }
                } else {
                    if (d(((n7f0) a.Z((List) ref$ObjectRef.element)).c) == NfcProductType.WALLET) {
                        int size = ((List) ref$ObjectRef.element).size() - 1;
                        n7f0 c2 = c((n7f0) ((List) ref$ObjectRef.element).get(size), e960Var, false);
                        List list9 = (List) ref$ObjectRef.element;
                        ref$ObjectRef.element = a.m0(Collections.singletonList(c2), a.m0(list9.subList(size + 1, list9.size()), list9.subList(0, size)));
                    }
                    ref$ObjectRef.element = b((List) ref$ObjectRef.element);
                }
                list4 = (List) ref$ObjectRef.element;
            }
        }
        h7f0 h7f0Var = new h7f0(list4);
        rb6 c3 = fab1.c(dbf0Var.f, BottomBarItemId.HOME);
        t400 t400Var = (t400) rb00Var;
        boolean d = t400Var.d();
        com.ybsdk.rconfig.b bVar = t400Var.a;
        if (d) {
            dfr dfrVar = ebf0.a;
            rbf0 f = f(((ProductsV4GradientConfig) bVar.d(dfrVar).getData()).toEntity().a);
            kbf0 kbf0Var = ((ProductsV4GradientConfig) bVar.d(dfrVar).getData()).toEntity().b;
            pair = new Pair(f, kbf0Var != null ? f(kbf0Var) : rbf0Var);
        } else {
            rbf0 rbf0Var2 = rbf0Var;
            pair = new Pair(rbf0Var2, rbf0Var2);
        }
        rbf0 rbf0Var3 = (rbf0) pair.getFirst();
        rbf0 rbf0Var4 = (rbf0) pair.getSecond();
        if (kaoVar != null) {
            return new fcf0(kaoVar, t400Var.c(), t400Var.d());
        }
        if (z3) {
            return new gcf0(t400Var.c(), t400Var.d(), c3, rbf0Var3, (bVar.r().isEnabled() && jl40.l(bVar.r().isEnabledOnProductsScreen(), Boolean.TRUE)) ? new hcf0(t400Var.d() ? dls0.b : t400Var.c() ? cls0.b : bls0.b) : vvb1.M);
        }
        laf0 laf0Var4 = (laf0) u8j0Var.a();
        rr51 rr51Var2 = (laf0Var4 == null || (dlg0Var = laf0Var4.d) == null) ? null : dlg0Var.a;
        e960 e960Var2 = dbf0Var.d;
        laf0 laf0Var5 = (laf0) u8j0Var.a();
        rr51 rr51Var3 = laf0Var5 != null ? laf0Var5.e : null;
        boolean z10 = dbf0Var.e;
        if (jj11Var != null) {
            jj11 jj11Var4 = jj11Var;
            if (jj11Var4 instanceof hj11) {
                aVar = new YbButtonView.a(((hj11) jj11Var4).a.a, null, new nbv(txg0.ybsdk_ic_payments, null), null, new ColorModel.Attr(ung0.ybColor_textIcon_primaryInverted), null, new ColorModel.Attr(ung0.ybColor_textIcon_primaryInverted), false, false, null, 3946);
            } else {
                if (!(jj11Var4 instanceof ij11)) {
                    w511.b();
                    return null;
                }
                aj11 aj11Var = ((ij11) jj11Var4).a;
                Text text4 = aj11Var.a;
                ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_textIcon_primaryInverted);
                rbv rbvVar2 = aj11Var.c;
                ThemedParameter themedParameter = aj11Var.e;
                aVar = new YbButtonView.a(text4, null, rbvVar2, themedParameter != null ? qxy0.b(themedParameter) : null, attr, null, null, false, false, null, 4066);
            }
            boolean z11 = jj11Var4 instanceof ij11;
            lj11Var = new lj11(aVar, z11, z11 ? ((ij11) jj11Var4).a.d : null);
            r8j0Var = null;
        } else {
            r8j0Var = null;
            lj11Var = null;
        }
        u8j0 u8j0Var4 = u8j0Var;
        r8j0 r8j0Var2 = u8j0Var4 instanceof r8j0 ? (r8j0) u8j0Var4 : r8j0Var;
        if (r8j0Var2 != null) {
            if (!dbf0Var.i) {
                r8j0Var2 = r8j0Var;
            }
            if (r8j0Var2 != null && (laf0Var = (laf0) r8j0Var2.a) != null && (list2 = laf0Var.g) != null && (kpnVar = (kpn) a.R(list2)) != null) {
                yonVar = new yon(nfp0.b, kpnVar, dbf0Var.j, 16);
                return new ecf0(h7f0Var, list, rr51Var3, rr51Var2, c3, null, e960Var2, z10, lj11Var, yonVar, t400Var.c(), t400Var.d(), rbf0Var3, rbf0Var4);
            }
        }
        yonVar = r8j0Var;
        return new ecf0(h7f0Var, list, rr51Var3, rr51Var2, c3, null, e960Var2, z10, lj11Var, yonVar, t400Var.c(), t400Var.d(), rbf0Var3, rbf0Var4);
    }
}
