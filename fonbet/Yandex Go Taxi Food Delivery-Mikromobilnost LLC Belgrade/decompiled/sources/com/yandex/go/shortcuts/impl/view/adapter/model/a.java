package com.yandex.go.shortcuts.impl.view.adapter.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.gcm.Task;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Background;
import com.yandex.go.shortcuts.dto.response.BackgroundAnimation$PulseCirclesAnimation;
import com.yandex.go.shortcuts.dto.response.BackgroundFraming;
import com.yandex.go.shortcuts.dto.response.ButtonStackItem;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.Overlay;
import com.yandex.go.shortcuts.dto.response.OverlayType;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$OfferItem;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$Section;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import com.yandex.go.shortcuts.dto.response.Screen;
import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import com.yandex.go.shortcuts.dto.response.Shape;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.ShowPolicy;
import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.go.shortcuts.dto.response.Title;
import com.yandex.go.shortcuts.dto.response.TurboButton;
import com.yandex.go.shortcuts.dto.response.VerticalStack;
import com.yandex.go.shortcuts.dto.response.e3;
import com.yandex.go.shortcuts.dto.response.l;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButton;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButtonTypes;
import com.yandex.go.shortcuts.dto.response.r2;
import com.yandex.go.shortcuts.impl.experiments.SuperappCurrentModeSettingsExperiment;
import com.yandex.go.shortcuts.impl.experiments.TurboButtonExperiment;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$Type;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.shortcuts.view.adapter.model.HeaderService$Type;
import com.yandex.go.shortcuts.view.adapter.model.model.SectionTypedHeaderModel$AppearanceType;
import defpackage.at3;
import defpackage.ba5;
import defpackage.bdc;
import defpackage.bl4;
import defpackage.bnt0;
import defpackage.bv;
import defpackage.ca5;
import defpackage.cdc;
import defpackage.cei0;
import defpackage.cv;
import defpackage.d1q0;
import defpackage.d2s0;
import defpackage.d6z;
import defpackage.d9s;
import defpackage.da5;
import defpackage.dl4;
import defpackage.e6g;
import defpackage.e6v;
import defpackage.ea5;
import defpackage.ebu;
import defpackage.ekh0;
import defpackage.el4;
import defpackage.ent0;
import defpackage.evu0;
import defpackage.ex00;
import defpackage.fa5;
import defpackage.fef;
import defpackage.fl4;
import defpackage.g8e;
import defpackage.g8v;
import defpackage.g9s;
import defpackage.ga5;
import defpackage.gwk0;
import defpackage.hl4;
import defpackage.hst;
import defpackage.ief;
import defpackage.il4;
import defpackage.j73;
import defpackage.jl4;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jst;
import defpackage.kdc;
import defpackage.kf10;
import defpackage.kgx;
import defpackage.kl3;
import defpackage.kl4;
import defpackage.kx00;
import defpackage.l4q0;
import defpackage.lg31;
import defpackage.lki;
import defpackage.ll4;
import defpackage.lsy;
import defpackage.lx00;
import defpackage.lxt0;
import defpackage.n3q0;
import defpackage.nl4;
import defpackage.nxk0;
import defpackage.ny61;
import defpackage.ol4;
import defpackage.pcu;
import defpackage.pdc;
import defpackage.qeb1;
import defpackage.qoi0;
import defpackage.qux0;
import defpackage.r27;
import defpackage.r3h;
import defpackage.rl4;
import defpackage.s8o;
import defpackage.sbu;
import defpackage.scc;
import defpackage.sl4;
import defpackage.t3s0;
import defpackage.tbu;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ufu;
import defpackage.ur60;
import defpackage.v45;
import defpackage.vfm;
import defpackage.w511;
import defpackage.w5b0;
import defpackage.wa90;
import defpackage.wih;
import defpackage.x45;
import defpackage.x5b0;
import defpackage.xby;
import defpackage.xdf;
import defpackage.xih;
import defpackage.xj11;
import defpackage.xl4;
import defpackage.xng0;
import defpackage.yj11;
import defpackage.za90;
import defpackage.zj11;
import defpackage.zp01;
import defpackage.zyr0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes13.dex */
public final class a {
    public final xih a;
    public final d2s0 b;
    public final pdc c;
    public final lg31 d;
    public final xj11 e;
    public final Context f;
    public final xdf g;
    public final wa90 h;
    public final HashMap i = new HashMap();
    public final Random j = new Random();
    public final Set k = j73.f0(new ProductMode$Taxi.SectionType[]{ProductMode$Taxi.SectionType.BUTTONS_CONTAINER, ProductMode$Taxi.SectionType.HEADER_LINEAR_GRID});

    public a(xih xihVar, d2s0 d2s0Var, pdc pdcVar, lg31 lg31Var, xj11 xj11Var, Context context, xdf xdfVar, wa90 wa90Var) {
        this.a = xihVar;
        this.b = d2s0Var;
        this.c = pdcVar;
        this.d = lg31Var;
        this.e = xj11Var;
        this.f = context;
        this.g = xdfVar;
        this.h = wa90Var;
    }

    public static ea5 d(ba5 ba5Var, ief iefVar, a aVar, ur60 ur60Var, int i, int i2, String str, BaseShortcutModel$Source baseShortcutModel$Source, fa5 fa5Var, int i3, q1 q1Var, ba5 ba5Var2, int i4) {
        q1 q1Var2;
        xdf xdfVar = aVar.g;
        boolean z = (i4 & 1024) == 0;
        q1 q1Var3 = (i4 & 2048) != 0 ? null : q1Var;
        ba5 ba5Var3 = (i4 & 4096) != 0 ? ba5Var : ba5Var2;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        String a = xdfVar.a(h, ur60Var.b, false, true);
        FormattedText c = d9s.c(ur60Var.d, xdfVar, h, true);
        CharSequence charSequence = a;
        if (z) {
            charSequence = qeb1.c(a);
        }
        da5 da5Var = new da5(charSequence, c);
        String a2 = xdfVar.a(h, ur60Var.c, false, true);
        FormattedText c2 = d9s.c(ur60Var.e, xdfVar, h, true);
        CharSequence charSequence2 = a2;
        if (z) {
            charSequence2 = qeb1.c(a2);
        }
        da5 da5Var2 = new da5(charSequence2, c2);
        OfferType offerType = ur60Var.n;
        String str2 = ur60Var.a;
        if (q1Var3 == null) {
            q1 q1Var4 = ur60Var.o;
            q1Var2 = q1Var4 != null ? q1Var4 : null;
        } else {
            q1Var2 = q1Var3;
        }
        List list = ur60Var.h;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xl4 n = aVar.n((Overlay) it.next(), i3, ur60Var.n);
            if (n != null) {
                arrayList.add(n);
            }
        }
        return new ea5(i, i2, ba5Var3, str, baseShortcutModel$Source, offerType, da5Var, da5Var2, fa5Var, str2, q1Var2, arrayList, ur60Var.m, ur60Var.l, ur60Var.s, 16384);
    }

    public static final g8v e(BackgroundFraming backgroundFraming, int i, int i2) {
        Object obj;
        Iterator it = backgroundFraming.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            BackgroundFraming.Frame frame = (BackgroundFraming.Frame) obj;
            int i3 = frame.a;
            int i4 = frame.b;
            List list = frame.c;
            if (i == i3 && i2 == i4 && list.size() == 2) {
                break;
            }
        }
        BackgroundFraming.Frame frame2 = (BackgroundFraming.Frame) obj;
        if (frame2 == null) {
            return new g8v(0.5f, 0.5f);
        }
        List list2 = frame2.c;
        return new g8v(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ebu f(ur60 ur60Var, String str, int i, a aVar, ba5 ba5Var, ief iefVar, int i2, String str2, BaseShortcutModel$Source baseShortcutModel$Source, fa5 fa5Var, int i3, tbu tbuVar, q1 q1Var, String str3, Layout layout) {
        tbu tbuVar2;
        boolean z;
        Iterator it;
        pcu pcuVar;
        Object obj;
        NestedButton nestedButton;
        ea5 d = d(ba5Var, iefVar, aVar, ur60Var, i, i2, str2, baseShortcutModel$Source, fa5Var, i3, q1Var, null, 5120);
        String str4 = ur60Var.q;
        if (i == 2) {
            tbuVar2 = tbuVar;
            if (tbuVar2 != HeaderService$Type.TAXI) {
                z = true;
                List list = ur60Var.s;
                double d2 = ur60Var.g;
                it = list.iterator();
                while (true) {
                    pcuVar = null;
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((NestedButton) obj).d == NestedButtonTypes.TRAIL_BUTTON) {
                        break;
                    }
                }
                nestedButton = (NestedButton) obj;
                if (nestedButton != null) {
                    double d3 = ur60Var.f;
                    if (d3 < 2.0d || d2 > 1.0d) {
                        xby.l(jst.e, "SHORTCUTS:NESTED_BUTTONS:UNSUPPORTED_SHORTCUT_SIZE", null, null, "Nested button could not be added to shortcut " + ur60Var.a + " with size " + d3 + RemoteBioParameters.X + d2, 6);
                    } else {
                        pcuVar = new pcu(ur60Var.a, d.d, nestedButton.a, nestedButton.b, nestedButton.c, nestedButton.e);
                    }
                }
                return new ebu(str, d, str4, z, tbuVar2, pcuVar, str3, layout.b == i, 6496);
            }
        } else {
            tbuVar2 = tbuVar;
        }
        z = false;
        List list2 = ur60Var.s;
        double d22 = ur60Var.g;
        it = list2.iterator();
        while (true) {
            pcuVar = null;
            if (it.hasNext()) {
            }
        }
        nestedButton = (NestedButton) obj;
        if (nestedButton != null) {
        }
        return new ebu(str, d, str4, z, tbuVar2, pcuVar, str3, layout.b == i, 6496);
    }

    public static ebu g(ur60 ur60Var, String str, int i, a aVar, ba5 ba5Var, ief iefVar, int i2, String str2, BaseShortcutModel$Source baseShortcutModel$Source, fa5 fa5Var, int i3, q1 q1Var, Layout layout, int i4) {
        Object obj;
        String str3 = ur60Var.p;
        Iterator<E> it = HeaderService$Type.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((HeaderService$Type) obj).getServiceName(), str3)) {
                break;
            }
        }
        tbu tbuVar = (HeaderService$Type) obj;
        if (tbuVar == null) {
            tbuVar = new sbu(str3);
        }
        return f(ur60Var, str, i, aVar, ba5Var, iefVar, i2, str2, baseShortcutModel$Source, fa5Var, i3, tbuVar, (i4 & 4096) != 0 ? null : q1Var, null, layout);
    }

    public static ArrayList h(Map map, ProductsCommon$Section productsCommon$Section) {
        List list = productsCommon$Section.d;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e6v e6vVar = (e6v) map.get((String) it.next());
            if (e6vVar != null) {
                arrayList.add(e6vVar);
            }
        }
        return arrayList;
    }

    public static ArrayList i(Map map, ProductsCommon$Section productsCommon$Section) {
        List list = productsCommon$Section.b;
        ProductMode$Taxi.SectionType sectionType = productsCommon$Section.a;
        ArrayList arrayList = new ArrayList(list.size());
        boolean contains = productsCommon$Section.g.contains(ProductMode$Taxi.SectionTag.NAV_SECTION_WIDTH);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = (e6v) map.get((String) it.next());
            if (obj != null) {
                if (obj instanceof ebu) {
                    obj = ((ebu) obj).r(contains, sectionType);
                } else if (obj instanceof qux0) {
                    obj = ((qux0) obj).r(contains, sectionType);
                } else if (obj instanceof ga5) {
                    obj = ((ga5) obj).r(contains, sectionType);
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static n3q0 o(Map map, ProductsCommon$Section productsCommon$Section) {
        ArrayList i = i(map, productsCommon$Section);
        ArrayList i2 = i(map, productsCommon$Section);
        ArrayList arrayList = new ArrayList();
        Iterator it = i2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ga5) {
                arrayList.add(next);
            }
        }
        if (i.size() != arrayList.size()) {
            jst.e.k(new IllegalArgumentException(), "Section has not only shortcuts!");
        }
        if (arrayList.isEmpty()) {
            return n3q0.d;
        }
        String concat = "ITEMS_HORIZONTAL_SCROLLABLE_GRID:".concat(kotlin.collections.a.X(productsCommon$Section.b, null, null, null, new zp01(13), 31));
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            ny61.p();
            return null;
        }
        int i3 = ((ga5) it2.next()).getBase().b;
        while (it2.hasNext()) {
            int i4 = ((ga5) it2.next()).getBase().b;
            if (i3 < i4) {
                i3 = i4;
            }
        }
        return new n3q0(concat, i3, arrayList);
    }

    public static l4q0 r(SectionTypedHeader sectionTypedHeader, String str) {
        SectionTypedHeaderModel$AppearanceType sectionTypedHeaderModel$AppearanceType;
        SectionTypedHeader.Lead lead = sectionTypedHeader.b;
        FormattedText formattedText = lead.b.b;
        boolean z = formattedText == null;
        if (formattedText == null) {
            formattedText = new FormattedText(Collections.singletonList(new FormattedText.h(lead.b.a, null, FormattedText.FontWeight.MEDIUM, 20, null, null, 2034)));
        }
        String o = g8e.o("SectionTypedHeaderModel:", lead.b.a);
        g9s g9sVar = new g9s(lead.b.a, formattedText, z);
        SectionTypedHeader.SectionTitle sectionTitle = sectionTypedHeader.c.b;
        String str2 = sectionTitle.a;
        FormattedText formattedText2 = sectionTitle.b;
        if (formattedText2 == null) {
            formattedText2 = FormattedText.c;
        }
        da5 da5Var = new da5(str2, formattedText2);
        String str3 = lead.c;
        int i = x45.a[lead.d.ordinal()];
        if (i == 1) {
            sectionTypedHeaderModel$AppearanceType = SectionTypedHeaderModel$AppearanceType.ICON_ONLY;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            sectionTypedHeaderModel$AppearanceType = SectionTypedHeaderModel$AppearanceType.DEFAULT;
        }
        return new l4q0(o, g9sVar, da5Var, str3, sectionTypedHeaderModel$AppearanceType, null, str, 352);
    }

    public static final ArrayList t(a aVar, VerticalStack verticalStack, Layout layout, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!(((r2) obj2) instanceof e3)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r2 r2Var = (r2) it.next();
            if (r2Var instanceof ButtonStackItem) {
                ButtonStackItem buttonStackItem = (ButtonStackItem) r2Var;
                String o = g8e.o("BUTTON:", verticalStack.a);
                String a = buttonStackItem.getA();
                Title b = buttonStackItem.getB();
                q1 c = buttonStackItem.getC();
                String str = verticalStack.g;
                Iterator<E> it2 = HeaderService$Type.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (jl40.l(((HeaderService$Type) obj).getServiceName(), str)) {
                        break;
                    }
                }
                tbu tbuVar = (HeaderService$Type) obj;
                if (tbuVar == null) {
                    tbuVar = new sbu(str);
                }
                r2Var = new r27(o, a, b, c, tbuVar, verticalStack.a, layout.c, BaseShortcutModel$Source.HORIZONTAL_STACK_ITEM, verticalStack.f);
            }
            arrayList2.add(r2Var);
        }
        return arrayList2;
    }

    public final ba5 a(BaseShortcutModel$Source baseShortcutModel$Source, Background background) {
        ca5 ca5Var;
        Integer num;
        Float f;
        Float f2;
        kdc bdcVar = baseShortcutModel$Source == BaseShortcutModel$Source.HEADER ? new bdc(this.a.k) : ba5.h;
        String str = background.c;
        ufu ufuVar = (ufu) this.c;
        int m = s8o.m(ufuVar.a(bdcVar, str), this.f);
        String str2 = background.a;
        String str3 = background.b;
        String str4 = background.d;
        l lVar = background.g;
        if (lVar instanceof BackgroundAnimation$PulseCirclesAnimation) {
            BackgroundAnimation$PulseCirclesAnimation backgroundAnimation$PulseCirclesAnimation = (BackgroundAnimation$PulseCirclesAnimation) lVar;
            BackgroundAnimation$PulseCirclesAnimation.Source source = backgroundAnimation$PulseCirclesAnimation.d;
            String str5 = backgroundAnimation$PulseCirclesAnimation.a;
            if (str5 != null && (num = backgroundAnimation$PulseCirclesAnimation.b) != null) {
                int intValue = num.intValue();
                kdc a = ufuVar.a(ca5.k, source != null ? source.a : null);
                Number number = backgroundAnimation$PulseCirclesAnimation.c;
                if (number != null) {
                    long longValue = number.longValue();
                    if (source != null) {
                        BackgroundAnimation$PulseCirclesAnimation.SourceAnchor sourceAnchor = source.e;
                        Number number2 = source.b;
                        if (number2 != null) {
                            long longValue2 = number2.longValue();
                            if (sourceAnchor != null) {
                                BackgroundAnimation$PulseCirclesAnimation.SourceAnchorPoint sourceAnchorPoint = sourceAnchor.b;
                                Shape shape = sourceAnchor.a;
                                if (shape != null && sourceAnchorPoint != null && (f = sourceAnchorPoint.a) != null) {
                                    float floatValue = f.floatValue();
                                    if (sourceAnchorPoint != null && (f2 = sourceAnchorPoint.b) != null) {
                                        float floatValue2 = f2.floatValue();
                                        Number number3 = source.c;
                                        if (number3 != null) {
                                            long longValue3 = number3.longValue();
                                            Integer num2 = source.d;
                                            if (num2 != null) {
                                                ca5Var = new ca5(str5, intValue, a, longValue, longValue2, shape, floatValue, floatValue2, longValue3, num2.intValue());
                                                return new ba5(m, str2, str3, str4, ca5Var, this.h.b(background.c));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ca5Var = null;
        return new ba5(m, str2, str3, str4, ca5Var, this.h.b(background.c));
    }

    public final xl4 b(Overlay overlay, tls tlsVar) {
        OverlayType overlayType = overlay.b;
        FormattedText formattedText = overlay.h;
        Background background = overlay.f;
        if (overlayType == OverlayType.STATIC_TEXT && evu0.J(overlay.c) && !formattedText.e()) {
            return null;
        }
        String str = overlay.d;
        if (evu0.J(str)) {
            str = null;
        }
        if (str == null) {
            str = formattedText.b();
        }
        boolean J = evu0.J(str);
        kdc kdcVar = xl4.b;
        if (!J) {
            kdcVar = ((ufu) this.c).h(kdcVar, str);
        }
        kdc kdcVar2 = kdcVar;
        kdc v = !evu0.J(background.c) ? v(overlay) : ba5.h;
        String str2 = overlay.c;
        Float f = background.e;
        float floatValue = f != null ? f.floatValue() : 1.0f;
        String str3 = background.f;
        FormattedText formattedText2 = overlay.h;
        ShowPolicy showPolicy = overlay.a;
        ShowPolicy.Companion.getClass();
        ol4 ol4Var = jl40.l(showPolicy, ShowPolicy.d) ? null : new ol4(showPolicy.a, showPolicy.b, showPolicy.c * 3600 * 1000, 8);
        if (x45.e[overlay.b.ordinal()] != 1) {
            w511.b();
            return null;
        }
        BadgeModel$Type badgeModel$Type = BadgeModel$Type.STATIC_TEXT;
        cei0 cei0Var = overlay.j;
        return (xl4) tlsVar.invoke(new bl4(str2, kdcVar2, v, floatValue, str3, formattedText2, ol4Var, badgeModel$Type, cei0Var != null ? new zyr0(cei0Var.a, cei0Var.b) : null));
    }

    public final ga5 c(Layout layout, ur60 ur60Var, BackgroundFraming backgroundFraming, int i, ief iefVar, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        q1 q1Var;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        String str = layout.c;
        OfferType offerType = ur60Var.n;
        q1 q1Var2 = ur60Var.o;
        String str2 = ur60Var.p;
        BaseShortcutModel$Source source = offerType.getSource();
        fa5 w = w(source, ur60Var.i);
        ba5 a = a(source, ur60Var.j);
        int i2 = (int) ur60Var.f;
        int i3 = (int) ur60Var.g;
        OfferType offerType2 = ur60Var.n;
        String str3 = offerType2 + ":" + ur60Var.b + ur60Var.q;
        int i4 = 56;
        int i5 = 0;
        switch (x45.c[offerType2.ordinal()]) {
            case 1:
            case 2:
                jst.e.s(new IllegalArgumentException("Unsupported offer type: " + offerType2));
                return null;
            case 3:
                ea5 d = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                g8v e = e(backgroundFraming, i2, i3);
                Iterator<E> it = HeaderService$Type.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((HeaderService$Type) obj).getServiceName(), str2)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                tbu tbuVar = (HeaderService$Type) obj;
                if (tbuVar == null) {
                    tbuVar = new sbu(str2);
                }
                return new r3h(str3, d, e, tbuVar, false, null);
            case 4:
                return new qux0(str3, d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168), ((SuperappCurrentModeSettingsExperiment) this.b.a.c()).b, "", "", false, null);
            case 5:
                return new kf10(str3, d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 6144), e(backgroundFraming, i2, i3), i4);
            case 6:
                return new vfm(str3, d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168), false, null);
            case 7:
                ea5 d2 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                Iterator<E> it2 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (jl40.l(((HeaderService$Type) obj2).getServiceName(), str2)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                tbu tbuVar2 = (HeaderService$Type) obj2;
                if (tbuVar2 == null) {
                    tbuVar2 = new sbu(str2);
                }
                return new bv(str3, d2, tbuVar2, false, null);
            case 8:
                ea5 d3 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, a(source, ur60Var.k), HProv.ALG_TYPE_SECURECHANNEL);
                Iterator<E> it3 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (jl40.l(((HeaderService$Type) obj3).getServiceName(), str2)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                tbu tbuVar3 = (HeaderService$Type) obj3;
                if (tbuVar3 == null) {
                    tbuVar3 = new sbu(str2);
                }
                return new cv(str3, d3, tbuVar3, false, null);
            case 9:
                HeaderService$Type headerService$Type = HeaderService$Type.TAXI;
                if (jl40.l(q1Var2 != null ? q1Var2 : null, e0.INSTANCE)) {
                    q1Var2 = new Action$RouteInput((String) null, (String) null, (Action$RouteInput.AdditionalAction) null, 15);
                } else if (q1Var2 == null) {
                    q1Var = null;
                    return f(ur60Var, str3, i2, this, a, iefVar, i3, str, source, w, i, headerService$Type, q1Var, "fullscreen_suggests_transition_name", layout);
                }
                q1Var = q1Var2;
                return f(ur60Var, str3, i2, this, a, iefVar, i3, str, source, w, i, headerService$Type, q1Var, "fullscreen_suggests_transition_name", layout);
            case 10:
            case 11:
            case 12:
            case 13:
                return g(ur60Var, str3, i2, this, a, iefVar, i3, str, source, w, i, q1Var2 != null ? q1Var2 : null, layout, Task.EXTRAS_LIMIT_BYTES);
            case 14:
                ea5 d4 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                Iterator<E> it4 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (jl40.l(((HeaderService$Type) obj4).getServiceName(), str2)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                tbu tbuVar4 = (HeaderService$Type) obj4;
                if (tbuVar4 == null) {
                    tbuVar4 = new sbu(str2);
                }
                return new w5b0(str3, d4, tbuVar4, 56);
            case 15:
                ea5 d5 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                Iterator<E> it5 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj5 = it5.next();
                        if (jl40.l(((HeaderService$Type) obj5).getServiceName(), str2)) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                tbu tbuVar5 = (HeaderService$Type) obj5;
                if (tbuVar5 == null) {
                    tbuVar5 = new sbu(str2);
                }
                List<String> list2 = ur60Var.v;
                ArrayList arrayList = new ArrayList();
                for (String str4 : list2) {
                    Iterator it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj6 = it6.next();
                            if (jl40.l(((ur60) obj6).a, str4)) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    ur60 ur60Var2 = (ur60) obj6;
                    if (ur60Var2 != null) {
                        arrayList.add(ur60Var2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    Object next = it7.next();
                    if (((ur60) next).n == OfferType.PERSONAL) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = arrayList2.iterator();
                while (true) {
                    int i6 = i5;
                    if (!it8.hasNext()) {
                        if (arrayList3.isEmpty()) {
                            return null;
                        }
                        return new x5b0(str3, d5, tbuVar5, arrayList3, false, null);
                    }
                    Object next2 = it8.next();
                    i5 = i6 + 1;
                    if (i6 < 0) {
                        scc.m();
                        throw null;
                    }
                    ga5 c = c(layout, (ur60) next2, backgroundFraming, i6, iefVar, list);
                    if (c != null) {
                        arrayList3.add(c);
                    }
                }
            case 16:
                return g(ur60Var, str3, i2, this, a, iefVar, i3, str, source, w, i, null, layout, 14336);
            case 17:
                ea5 d6 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                Iterator<E> it9 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it9.hasNext()) {
                        obj7 = it9.next();
                        if (jl40.l(((HeaderService$Type) obj7).getServiceName(), str2)) {
                        }
                    } else {
                        obj7 = null;
                    }
                }
                tbu tbuVar6 = (HeaderService$Type) obj7;
                if (tbuVar6 == null) {
                    tbuVar6 = new sbu(str2);
                }
                return new lsy(str3, d6, tbuVar6, ur60Var.q, ur60Var.r, null, true, false, null);
            case 18:
                return g(ur60Var, str3, i2, this, a, iefVar, i3, str, source, w, i, null, layout, 14336);
            case 19:
                ea5 d7 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                Iterator<E> it10 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj8 = it10.next();
                        if (jl40.l(((HeaderService$Type) obj8).getServiceName(), str2)) {
                        }
                    } else {
                        obj8 = null;
                    }
                }
                tbu tbuVar7 = (HeaderService$Type) obj8;
                if (tbuVar7 == null) {
                    tbuVar7 = new sbu(str2);
                }
                return new nxk0(str3, d7, tbuVar7, ur60Var.q, 0, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            case 20:
                ea5 d8 = d(a, iefVar, this, ur60Var, i2, i3, str, source, w, i, null, null, 7168);
                Iterator<E> it11 = HeaderService$Type.a().iterator();
                while (true) {
                    if (it11.hasNext()) {
                        obj9 = it11.next();
                        if (jl40.l(((HeaderService$Type) obj9).getServiceName(), str2)) {
                        }
                    } else {
                        obj9 = null;
                    }
                }
                tbu tbuVar8 = (HeaderService$Type) obj9;
                if (tbuVar8 == null) {
                    tbuVar8 = new sbu(str2);
                }
                return new lxt0(str3, d8, tbuVar8, ur60Var.q, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            default:
                w511.b();
                return null;
        }
    }

    public final kx00 j(Map map, ProductsCommon$Section productsCommon$Section) {
        List list = productsCommon$Section.d;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e6v e6vVar = (e6v) map.get((String) it.next());
            if (e6vVar != null) {
                arrayList.add(e6vVar);
            }
        }
        String concat = "HORIZONTAL_STACK_SECTION:".concat(kotlin.collections.a.X(arrayList, null, null, null, new at3(25), 31));
        lg31 lg31Var = this.d;
        Context context = lg31Var.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof ex00) {
                arrayList2.add(next);
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        kl3 kl3Var = ent0.b;
        if (isEmpty) {
            hst hstVar = jst.e;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (!(((e6v) next2) instanceof ex00)) {
                    hstVar.r(String.format("Can not measure item of type %s", Arrays.copyOf(new Object[]{qoi0.a(next2.getClass()).d()}, 1)), illegalArgumentException);
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return null;
        }
        com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.a aVar = new com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.a(LayoutInflater.from(context).inflate(ekh0.market_recommendation_item, (ViewGroup) null), lg31Var.c, new lx00(), new e6g(context.getResources()), lg31Var.b, lg31Var.d, ProductMode$Taxi.SectionType.HORIZONTAL_STACK_SECTION, new lki(14));
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            aVar.c((ex00) it4.next());
            View view = aVar.a;
            view.measure(0, 0);
            arrayList3.add(Integer.valueOf(view.getMeasuredHeight()));
        }
        Integer num = (Integer) kotlin.collections.a.c0(arrayList3);
        bnt0 bnt0Var = num != null ? new bnt0(num.intValue(), false, 6) : null;
        if (bnt0Var != null) {
            kl3Var = bnt0Var;
        }
        return new kx00(concat, arrayList, kl3Var);
    }

    public final Map k(ProductMode$Taxi productMode$Taxi, ProductsResponse productsResponse, BaseShortcutModel$Source baseShortcutModel$Source) {
        List list;
        ProductsCommon$OfferItem productsCommon$OfferItem = productMode$Taxi.b;
        BackgroundFraming backgroundFraming = productsResponse.c;
        ief iefVar = productsResponse.e;
        int i = x45.b[baseShortcutModel$Source.ordinal()];
        if (i == 1) {
            list = productsCommon$OfferItem.b;
        } else {
            if (i != 2) {
                return b.f();
            }
            list = productsCommon$OfferItem.a;
        }
        return m(productMode$Taxi.a, list, backgroundFraming, iefVar);
    }

    public final Map l(ProductsScreenResponse productsScreenResponse, BaseShortcutModel$Source baseShortcutModel$Source) {
        List list;
        Screen screen = productsScreenResponse.e;
        int i = x45.b[baseShortcutModel$Source.ordinal()];
        if (i == 1) {
            list = screen.b.b;
        } else {
            if (i != 2) {
                return b.f();
            }
            list = screen.b.a;
        }
        return m(screen.a, list, productsScreenResponse.c, null);
    }

    public final Map m(Layout layout, List list, BackgroundFraming backgroundFraming, ief iefVar) {
        List list2;
        List list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (((ur60) obj).n == OfferType.PERSONAL_SLIDER) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            list2 = list;
        } else {
            list2 = new ArrayList();
            for (Object obj2 : list3) {
                ur60 ur60Var = (ur60) obj2;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        List list4 = ((ur60) it.next()).v;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                if (jl40.l((String) it2.next(), ur60Var.a)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                list2.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj3 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ur60 ur60Var2 = (ur60) obj3;
            ga5 c = c(layout, ur60Var2, backgroundFraming, i, iefVar, list);
            Pair pair = c != null ? new Pair(ur60Var2.a, c) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
            i = i2;
        }
        return b.s(arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final xl4 n(final Overlay overlay, int i, OfferType offerType) {
        int i2;
        Shape shape = overlay.g;
        String str = overlay.e;
        final int i3 = 0;
        switch (x45.d[shape.ordinal()]) {
            case 1:
                return new nl4(v(overlay), str);
            case 2:
                return new il4(str);
            case 3:
                return new dl4(str, null);
            case 4:
                return b(overlay, new v45(this, overlay, i, i3));
            case 5:
                i2 = offerType != null ? x45.c[offerType.ordinal()] : -1;
                el4 el4Var = fl4.e;
                return i2 == 8 ? b(overlay, new BaseModelMapper$bubbleByOffer$1(1, el4Var, el4.class, "topLeftBubble", "topLeftBubble(Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Base;)Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Bubble;", 0)) : b(overlay, new BaseModelMapper$bubbleByOffer$2(1, el4Var, el4.class, "bottomLeftBubble", "bottomLeftBubble(Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Base;)Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Bubble;", 0));
            case 6:
                return new sl4(str);
            case 7:
                if (str.length() != 0) {
                    return new jl4(new bl4("", new cdc(0), v(overlay), 1.0f, null, new FormattedText(Collections.singletonList(new FormattedText.d(overlay.e, FormattedText.VerticalAlignment.CENTER, null, ((Number) this.a.l.getValue()).intValue(), 12))), null, BadgeModel$Type.STATIC_TEXT, null));
                }
                return null;
            case 8:
                i2 = offerType != null ? x45.c[offerType.ordinal()] : -1;
                kl4 kl4Var = ll4.e;
                return i2 == 8 ? b(overlay, new BaseModelMapper$cornerTextByOffer$1(1, kl4Var, kl4.class, "bottomRightCornerText", "bottomRightCornerText(Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Base;)Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$CornerText;", 0)) : b(overlay, new BaseModelMapper$cornerTextByOffer$2(1, kl4Var, kl4.class, "bottomLeftCornerText", "bottomLeftCornerText(Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Base;)Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$CornerText;", 0));
            case 9:
                return b(overlay, BaseModelMapper$mapOverlay$2.b);
            case 10:
                return b(overlay, BaseModelMapper$mapOverlay$3.b);
            case 11:
                return b(overlay, BaseModelMapper$mapOverlay$4.b);
            case 12:
                return b(overlay, new tls() { // from class: w45
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        bl4 bl4Var = (bl4) obj;
                        switch (i3) {
                            case 0:
                                return new zk4(bl4Var, new jzr0(overlay.i));
                            default:
                                return new gl4(bl4Var, overlay.e);
                        }
                    }
                });
            case 13:
                return new rl4(str);
            case 14:
                final int i4 = 1;
                return b(overlay, new tls() { // from class: w45
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        bl4 bl4Var = (bl4) obj;
                        switch (i4) {
                            case 0:
                                return new zk4(bl4Var, new jzr0(overlay.i));
                            default:
                                return new gl4(bl4Var, overlay.e);
                        }
                    }
                });
            case 15:
                return new hl4(v(overlay), overlay.h);
            case 16:
                return b(overlay, new at3(26));
            case 17:
                return null;
            default:
                w511.b();
                return null;
        }
    }

    public final d1q0 p(ProductMode$Taxi.SectionHeader sectionHeader, String str) {
        Integer num;
        Object obj;
        String str2;
        kdc i;
        String str3 = "SectionHeaderModel:" + sectionHeader.a;
        FormattedText formattedText = sectionHeader.a;
        Iterator it = formattedText.a.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o) obj) instanceof FormattedText.h) {
                break;
            }
        }
        FormattedText.h hVar = obj instanceof FormattedText.h ? (FormattedText.h) obj : null;
        if (hVar != null && (str2 = hVar.g) != null && (i = ((ufu) this.c).i(str2)) != null) {
            num = Integer.valueOf(s8o.m(i, this.f));
        }
        return new d1q0(str3, formattedText, str, num);
    }

    public final t3s0 q(ProductsCommon$Section productsCommon$Section, ProductsCommon$Section productsCommon$Section2) {
        int i;
        ProductMode$Taxi.SectionType sectionType = productsCommon$Section.a;
        ProductMode$Taxi.SectionType sectionType2 = productsCommon$Section2.a;
        jsq0 jsq0Var = productsCommon$Section.g;
        ProductMode$Taxi.SectionTag sectionTag = ProductMode$Taxi.SectionTag.GRAY_SEPARATOR;
        int i2 = 0;
        boolean z = jsq0Var.contains(sectionTag) || jsq0Var.contains(ProductMode$Taxi.SectionTag.TRANSPARENT_SEPARATOR) || jsq0Var.contains(ProductMode$Taxi.SectionTag.BLACK_SEPARATOR);
        boolean contains = jsq0Var.contains(ProductMode$Taxi.SectionTag.TRANSPARENT_SEPARATOR);
        boolean contains2 = jsq0Var.contains(sectionTag);
        Context context = this.f;
        int m = contains2 ? s8o.m(new bdc(xng0.cardDivider), context) : jsq0Var.contains(ProductMode$Taxi.SectionTag.BLACK_SEPARATOR) ? s8o.m(new bdc(xng0.everBack), context) : 0;
        boolean z2 = productsCommon$Section2.e != null;
        wih wihVar = (wih) this.a.p.getValue();
        boolean z3 = sectionType2 == ProductMode$Taxi.SectionType.ITEMS_LINEAR_GRID;
        boolean z4 = sectionType2 == ProductMode$Taxi.SectionType.ITEMS_HORIZONTAL_SCROLLABLE_GRID;
        boolean z5 = sectionType == ProductMode$Taxi.SectionType.HEADER_LINEAR_GRID;
        boolean z6 = productsCommon$Section.f != null;
        boolean z7 = productsCommon$Section.a == ProductMode$Taxi.SectionType.WHERE_TO_SECTION;
        int i3 = wihVar.a;
        int i4 = wihVar.b;
        if (z && z2) {
            i = wihVar.c;
        } else {
            if (!z || z2) {
                if (!z5 || !z3) {
                    if (z5 && z4) {
                        i2 = (-i3) / 2;
                    } else if ((!z7 && !z6) || sectionType == sectionType2) {
                        Set set = this.k;
                        if (!set.contains(sectionType) || !set.contains(sectionType2)) {
                            i2 = z2 ? wihVar.e : wihVar.f;
                        }
                    }
                    return new t3s0(i3 + i2, m, z, contains);
                }
                i2 = -i3;
                return new t3s0(i3 + i2, m, z, contains);
            }
            i = wihVar.d;
        }
        i2 = i4 + i;
        return new t3s0(i3 + i2, m, z, contains);
    }

    public final ex00 s(VerticalStack verticalStack, Layout layout) {
        Object obj;
        String str = verticalStack.a;
        String str2 = layout.c;
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.VERTICAL_STACK_ITEM;
        q1 q1Var = verticalStack.c;
        String str3 = verticalStack.g;
        Iterator<E> it = HeaderService$Type.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((HeaderService$Type) obj).getServiceName(), str3)) {
                break;
            }
        }
        tbu tbuVar = (HeaderService$Type) obj;
        if (tbuVar == null) {
            tbuVar = new sbu(str3);
        }
        tbu tbuVar2 = tbuVar;
        return new ex00(str, str, str2, baseShortcutModel$Source, q1Var, verticalStack.f, tbuVar2, ((ufu) this.c).b(verticalStack.b), t(this, verticalStack, layout, verticalStack.d), t(this, verticalStack, layout, verticalStack.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zj11 u(Layout layout, List list, List list2) {
        xih xihVar;
        Object obj;
        Object obj2;
        FormattedText formattedText;
        TurboButtonExperiment turboButtonExperiment;
        int i;
        int i2;
        Iterator it;
        Iterator it2;
        yj11 yj11Var;
        Object obj3;
        TurboButtonExperiment turboButtonExperiment2 = (TurboButtonExperiment) this.e.a.c();
        List A0 = kotlin.collections.a.A0(list2, 5);
        ArrayList arrayList = new ArrayList();
        Iterator it3 = A0.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            xihVar = this.a;
            if (!hasNext) {
                break;
            }
            String str = (String) it3.next();
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (jl40.l(((TurboButton) obj).a, str)) {
                    break;
                }
            }
            TurboButton turboButton = (TurboButton) obj;
            if (turboButton == null) {
                turboButtonExperiment = turboButtonExperiment2;
                it2 = it3;
                yj11Var = null;
            } else {
                String str2 = turboButton.k;
                Iterator<E> it5 = HeaderService$Type.a().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it5.next();
                    if (jl40.l(((HeaderService$Type) obj2).getServiceName(), str2)) {
                        break;
                    }
                }
                tbu tbuVar = (HeaderService$Type) obj2;
                if (tbuVar == null) {
                    tbuVar = new sbu(str2);
                }
                List list3 = turboButtonExperiment2.d;
                if (!turboButtonExperiment2.h()) {
                    list3 = null;
                }
                if (list3 != null) {
                    Iterator it6 = list3.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it6.next();
                        if (jl40.l(((TurboButtonExperiment.ServiceConfig) obj3).a, str2)) {
                            break;
                        }
                    }
                    TurboButtonExperiment.ServiceConfig serviceConfig = (TurboButtonExperiment.ServiceConfig) obj3;
                    if (serviceConfig != null) {
                        String Y = d6z.Y(turboButtonExperiment2, serviceConfig.b);
                        if (Y.length() == 0) {
                            Y = null;
                        }
                        if (Y != null) {
                            formattedText = FormattedText.Companion.c(Y);
                            String p = g8e.p(turboButton.b, ":", turboButton.i);
                            String str3 = turboButton.a;
                            String str4 = turboButton.b;
                            if (formattedText == null) {
                                formattedText = turboButton.c;
                            }
                            FormattedText formattedText2 = formattedText;
                            BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.TURBO_BUTTONS;
                            fa5 w = w(baseShortcutModel$Source, turboButton.e);
                            ba5 a = a(baseShortcutModel$Source, turboButton.f);
                            q1 q1Var = turboButton.h;
                            String str5 = turboButton.i;
                            Counters counters = turboButton.g;
                            xihVar.getClass();
                            turboButtonExperiment = turboButtonExperiment2;
                            if (tbuVar != HeaderService$Type.GROCERY) {
                                i = xihVar.d;
                            } else if (tbuVar == HeaderService$Type.PHARMACY) {
                                i = xihVar.e;
                            } else if (tbuVar == HeaderService$Type.EATS) {
                                i = xihVar.c;
                            } else if (tbuVar == HeaderService$Type.DELIVERY) {
                                i = xihVar.f;
                            } else if (tbuVar == HeaderService$Type.DRIVE) {
                                i = xihVar.g;
                            } else if (tbuVar == HeaderService$Type.MASSTRANSIT) {
                                i = xihVar.h;
                            } else if (tbuVar == HeaderService$Type.SHOP) {
                                i = xihVar.i;
                            } else if (tbuVar == HeaderService$Type.MARKET_VIEWER || tbuVar == HeaderService$Type.MARKET) {
                                i = xihVar.j;
                            } else {
                                i2 = 0;
                                ShortcutIconSize shortcutIconSize = turboButton.j;
                                List list4 = turboButton.d;
                                ArrayList arrayList2 = new ArrayList();
                                it = list4.iterator();
                                while (it.hasNext()) {
                                    Iterator it7 = it3;
                                    q1 q1Var2 = q1Var;
                                    ShortcutIconSize shortcutIconSize2 = shortcutIconSize;
                                    xl4 n = n((Overlay) it.next(), 0, null);
                                    if (n != null) {
                                        arrayList2.add(n);
                                    }
                                    q1Var = q1Var2;
                                    shortcutIconSize = shortcutIconSize2;
                                    it3 = it7;
                                }
                                it2 = it3;
                                yj11Var = new yj11(p, str3, str4, formattedText2, w, a, q1Var, str5, i2, shortcutIconSize, counters, arrayList2, tbuVar, turboButtonExperiment.h(), layout.c, turboButton.l);
                            }
                            i2 = i;
                            ShortcutIconSize shortcutIconSize3 = turboButton.j;
                            List list42 = turboButton.d;
                            ArrayList arrayList22 = new ArrayList();
                            it = list42.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = it3;
                            yj11Var = new yj11(p, str3, str4, formattedText2, w, a, q1Var, str5, i2, shortcutIconSize3, counters, arrayList22, tbuVar, turboButtonExperiment.h(), layout.c, turboButton.l);
                        }
                    }
                }
                formattedText = null;
                String p2 = g8e.p(turboButton.b, ":", turboButton.i);
                String str32 = turboButton.a;
                String str42 = turboButton.b;
                if (formattedText == null) {
                }
                FormattedText formattedText22 = formattedText;
                BaseShortcutModel$Source baseShortcutModel$Source2 = BaseShortcutModel$Source.TURBO_BUTTONS;
                fa5 w2 = w(baseShortcutModel$Source2, turboButton.e);
                ba5 a2 = a(baseShortcutModel$Source2, turboButton.f);
                q1 q1Var3 = turboButton.h;
                String str52 = turboButton.i;
                Counters counters2 = turboButton.g;
                xihVar.getClass();
                turboButtonExperiment = turboButtonExperiment2;
                if (tbuVar != HeaderService$Type.GROCERY) {
                }
                i2 = i;
                ShortcutIconSize shortcutIconSize32 = turboButton.j;
                List list422 = turboButton.d;
                ArrayList arrayList222 = new ArrayList();
                it = list422.iterator();
                while (it.hasNext()) {
                }
                it2 = it3;
                yj11Var = new yj11(p2, str32, str42, formattedText22, w2, a2, q1Var3, str52, i2, shortcutIconSize32, counters2, arrayList222, tbuVar, turboButtonExperiment.h(), layout.c, turboButton.l);
            }
            if (yj11Var != null) {
                arrayList.add(yj11Var);
            }
            turboButtonExperiment2 = turboButtonExperiment;
            it3 = it2;
        }
        return new zj11((turboButtonExperiment2.h() ? ((Number) xihVar.o.getValue()).intValue() : ((Number) xihVar.n.getValue()).intValue()) - ((Number) xihVar.m.getValue()).intValue(), arrayList);
    }

    public final kdc v(Overlay overlay) {
        String str = overlay.f.c;
        return ((ufu) this.c).a(ba5.h, str);
    }

    public final fa5 w(BaseShortcutModel$Source baseShortcutModel$Source, TextStyleDto textStyleDto) {
        cdc cdcVar;
        int i = x45.b[baseShortcutModel$Source.ordinal()];
        xih xihVar = this.a;
        switch (i) {
            case 1:
                cdcVar = new cdc(xihVar.b.a());
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                cdcVar = fa5.e;
                break;
            case 3:
                za90 za90Var = xihVar.b;
                int i2 = za90Var.k;
                kgx kgxVar = za90.z[10];
                cdcVar = new cdc(za90Var.b(i2));
                break;
            default:
                w511.b();
                return null;
        }
        int m = s8o.m(((ufu) this.c).h(cdcVar, textStyleDto.a), this.f);
        TextStyleDto.HorizontalAlignment horizontalAlignment = textStyleDto.b;
        if (horizontalAlignment == null) {
            horizontalAlignment = TextStyleDto.HorizontalAlignment.LEADING;
        }
        return new fa5(m, horizontalAlignment, this.h.b(textStyleDto.a));
    }
}
