package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.dto.response.ActionType;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.ShortcutTitleSize;
import com.yandex.go.shortcuts.models.OfferType;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.kd7;
import defpackage.ksq0;
import defpackage.nzs;
import defpackage.pf10;
import defpackage.qje;
import defpackage.qv10;
import defpackage.rpe0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsParam;", "", "Companion", "com/yandex/go/shortcuts/dto/request/g", "Shortcuts", "SupportedGrid", "SupportedAction", "SupportedSection", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProductsParam {
    public static final g Companion;
    public static final i3y[] h;
    public static final ArrayList i;
    public static final ArrayList j;
    public static final ArrayList k;
    public static final List l;
    public static final ArrayList m;
    public final zzs a;
    public final ProductsParamsState b;
    public final Shortcuts c;
    public final pf10 d;
    public final jsq0 e;
    public final Counters f;
    public final kd7 g;

    static {
        g gVar = new g();
        Companion = gVar;
        int i2 = 6;
        h = new i3y[]{null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(8)), null, null};
        OfferSupportedFeature offerSupportedFeature = new OfferSupportedFeature(OfferType.TAXI_EXPECTED_DESTINATION, Collections.singletonList(Action$TaxiExpectedDestination.Prefetch.ROUTE_ETA), 4);
        OfferSupportedFeature offerSupportedFeature2 = new OfferSupportedFeature(OfferType.DEEPLINK, null, 6);
        OfferType offerType = OfferType.MEDIA;
        OfferSupportedFeature offerSupportedFeature3 = new OfferSupportedFeature(offerType, j73.d0(Action$MediaStory.Prefetch.values()), 4);
        OfferType offerType2 = OfferType.TAXI_ROUTE_INPUT;
        OfferSupportedFeature offerSupportedFeature4 = new OfferSupportedFeature(offerType2, null, 6);
        OfferType offerType3 = OfferType.HEADER_DEEP_LINK;
        OfferSupportedFeature offerSupportedFeature5 = new OfferSupportedFeature(offerType3, null, 6);
        OfferType offerType4 = OfferType.EATS_BASED_SUPER_APP;
        OfferSupportedFeature offerSupportedFeature6 = new OfferSupportedFeature(offerType4, null, 2);
        OfferType offerType5 = OfferType.HEADER_SUMMARY_REDIRECT;
        OfferSupportedFeature offerSupportedFeature7 = new OfferSupportedFeature(offerType5, null, 6);
        OfferType offerType6 = OfferType.HEADER_ACTION_DRIVEN;
        ArrayList m0 = kotlin.collections.a.m0(g.a(gVar), scc.g(offerSupportedFeature, offerSupportedFeature2, offerSupportedFeature3, offerSupportedFeature4, offerSupportedFeature5, offerSupportedFeature6, offerSupportedFeature7, new OfferSupportedFeature(offerType6, null, 6), new OfferSupportedFeature(OfferType.ACTION_DRIVEN, null, 6)));
        i = m0;
        j = kotlin.collections.a.m0(g.a(gVar), scc.g(new OfferSupportedFeature(offerType2, null, 6), new OfferSupportedFeature(offerType3, null, 6), new OfferSupportedFeature(offerType, j73.d0(Action$MediaStory.Prefetch.values()), 4), new OfferSupportedFeature(offerType4, null, 2), new OfferSupportedFeature(offerType6, null, 6), new OfferSupportedFeature(offerType5, null, 6)));
        k = kotlin.collections.a.o0(m0, new OfferSupportedFeature(OfferType.DRIVE, null, 6));
        l = scc.g(new SupportedAction(ActionType.ROUTE_INPUT, i2), new SupportedAction(ActionType.DEEPLINK, i2), new SupportedAction(ActionType.TAXI_SUMMARY_REDIRECT, 2), new SupportedAction(ActionType.SDC_ROUTE_SELECTION, i2), new SupportedAction(ActionType.SCROLL_UP, i2));
        k4o b = ProductMode$Taxi.SectionType.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((ProductMode$Taxi.SectionType) obj) != ProductMode$Taxi.SectionType.UNSUPPORTED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new SupportedSection((ProductMode$Taxi.SectionType) it.next()));
        }
        m = arrayList2;
    }

    public /* synthetic */ ProductsParam(int i2, zzs zzsVar, ProductsParamsState productsParamsState, Shortcuts shortcuts, pf10 pf10Var, jsq0 jsq0Var, Counters counters, kd7 kd7Var) {
        if ((i2 & 1) == 0) {
            this.a = new zzs(0.0d, 0.0d, 0, null, null, 24);
        } else {
            this.a = zzsVar;
        }
        int i3 = 0;
        if ((i2 & 2) == 0) {
            this.b = new ProductsParamsState(i3);
        } else {
            this.b = productsParamsState;
        }
        if ((i2 & 4) == 0) {
            this.c = new Shortcuts(null, 511);
        } else {
            this.c = shortcuts;
        }
        if ((i2 & 8) == 0) {
            this.d = new pf10(i3);
        } else {
            this.d = pf10Var;
        }
        this.e = (i2 & 16) == 0 ? ksq0.a : jsq0Var;
        this.f = (i2 & 32) == 0 ? new Counters(i3) : counters;
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = kd7Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsParam)) {
            return false;
        }
        ProductsParam productsParam = (ProductsParam) obj;
        return jl40.l(this.a, productsParam.a) && jl40.l(this.b, productsParam.b) && jl40.l(this.c, productsParam.c) && jl40.l(this.d, productsParam.d) && jl40.l(this.e, productsParam.e) && jl40.l(this.f, productsParam.f) && jl40.l(this.g, productsParam.g);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e.a), 31, this.f.a);
        kd7 kd7Var = this.g;
        return c + (kd7Var == null ? 0 : kd7Var.a.hashCode());
    }

    public final String toString() {
        return "ProductsParam(position=" + this.a + ", state=" + this.b + ", shortcuts=" + this.c + ", mediaSizeInfo=" + this.d + ", verticalTypes=" + this.e + ", counters=" + this.f + ", typedExperiments=" + this.g + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsParam$SupportedGrid;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SupportedGrid {
        public static final j Companion = new j();
        public final int a;
        public final float b;

        public /* synthetic */ SupportedGrid(int i, int i2, float f) {
            this.a = (i & 1) == 0 ? 6 : i2;
            if ((i & 2) == 0) {
                this.b = 100.0f;
            } else {
                this.b = f;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupportedGrid)) {
                return false;
            }
            SupportedGrid supportedGrid = (SupportedGrid) obj;
            return this.a == supportedGrid.a && Float.compare(this.b, supportedGrid.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "SupportedGrid(width=" + this.a + ", unitWidth=" + this.b + Extension.C_BRAKE;
        }

        public SupportedGrid(float f) {
            this.a = 6;
            this.b = f;
        }

        public SupportedGrid() {
            this(0);
        }

        public /* synthetic */ SupportedGrid(int i) {
            this(100.0f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsParam$SupportedSection;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SupportedSection {
        public static final k Companion = new k();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(17))};
        public final ProductMode$Taxi.SectionType a;

        public /* synthetic */ SupportedSection(int i, ProductMode$Taxi.SectionType sectionType) {
            if (1 == (i & 1)) {
                this.a = sectionType;
            } else {
                qje.Z(i, 1, ProductsParam$SupportedSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SupportedSection) && this.a == ((SupportedSection) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SupportedSection(type=" + this.a + Extension.C_BRAKE;
        }

        public SupportedSection(ProductMode$Taxi.SectionType sectionType) {
            this.a = sectionType;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsParam$SupportedAction;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/i", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SupportedAction {
        public static final i Companion = new i();
        public static final i3y[] d;
        public final ActionType a;
        public final List b;
        public final Boolean c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new rpe0(15)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(16)), null};
        }

        public /* synthetic */ SupportedAction(int i, ActionType actionType, List list, Boolean bool) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, ProductsParam$SupportedAction$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = actionType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupportedAction)) {
                return false;
            }
            SupportedAction supportedAction = (SupportedAction) obj;
            return this.a == supportedAction.a && jl40.l(this.b, supportedAction.b) && jl40.l(this.c, supportedAction.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.c;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SupportedAction(type=");
            sb.append(this.a);
            sb.append(", modes=");
            sb.append(this.b);
            sb.append(", destinationSupport=");
            return nzs.d(sb, this.c, Extension.C_BRAKE);
        }

        public SupportedAction(ActionType actionType, ListBuilder listBuilder, Boolean bool) {
            this.a = actionType;
            this.b = listBuilder;
            this.c = bool;
        }

        public /* synthetic */ SupportedAction(ActionType actionType, int i) {
            this(actionType, null, (i & 4) != 0 ? null : Boolean.TRUE);
        }
    }

    public ProductsParam() {
        this((zzs) null, (ProductsParamsState) null, (Shortcuts) null, (pf10) null, (jsq0) null, (Counters) null, HProv.PP_VERSION_TIMESTAMP);
    }

    public ProductsParam(zzs zzsVar, ProductsParamsState productsParamsState, Shortcuts shortcuts, pf10 pf10Var, jsq0 jsq0Var, Counters counters, kd7 kd7Var) {
        this.a = zzsVar;
        this.b = productsParamsState;
        this.c = shortcuts;
        this.d = pf10Var;
        this.e = jsq0Var;
        this.f = counters;
        this.g = kd7Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProductsParam(zzs zzsVar, ProductsParamsState productsParamsState, Shortcuts shortcuts, pf10 pf10Var, jsq0 jsq0Var, Counters counters, int i2) {
        this((i2 & 1) != 0 ? new zzs(0.0d, 0.0d, 0, null, null, 24) : zzsVar, (i2 & 2) != 0 ? new ProductsParamsState(r0) : productsParamsState, (i2 & 4) != 0 ? new Shortcuts(null, 511) : shortcuts, (i2 & 8) != 0 ? new pf10(r0) : pf10Var, (i2 & 16) != 0 ? ksq0.a : jsq0Var, (i2 & 32) != 0 ? new Counters(r0) : counters, (kd7) null);
        int i3 = 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsParam$Shortcuts;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/h", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Shortcuts {
        public static final h Companion = new h();
        public static final i3y[] j;
        public final List a;
        public final List b;
        public final List c;
        public final float d;
        public final float e;
        public final List f;
        public final boolean g;
        public final jsq0 h;
        public final jsq0 i;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            j = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new rpe0(9)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(10)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(11)), null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(12)), null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(13)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(14))};
        }

        public Shortcuts(int i, List list, List list2, List list3, float f, float f2, List list4, boolean z, jsq0 jsq0Var, jsq0 jsq0Var2) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = ProductsParam.l;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = ProductsParam.m;
            } else {
                this.c = list3;
            }
            if ((i & 8) == 0) {
                this.d = 0.0f;
            } else {
                this.d = f;
            }
            if ((i & 16) == 0) {
                this.e = 0.0f;
            } else {
                this.e = f2;
            }
            if ((i & 32) == 0) {
                this.f = Collections.singletonList(new SupportedGrid(0));
            } else {
                this.f = list4;
            }
            if ((i & 64) == 0) {
                this.g = true;
            } else {
                this.g = z;
            }
            if ((i & 128) == 0) {
                List singletonList = Collections.singletonList(ShortcutIconSize.MEDIUM);
                jsq0 jsq0Var3 = ksq0.a;
                this.h = new jsq0(singletonList);
            } else {
                this.h = jsq0Var;
            }
            if ((i & 256) != 0) {
                this.i = jsq0Var2;
                return;
            }
            List singletonList2 = Collections.singletonList(ShortcutTitleSize.REGULAR);
            jsq0 jsq0Var4 = ksq0.a;
            this.i = new jsq0(singletonList2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shortcuts)) {
                return false;
            }
            Shortcuts shortcuts = (Shortcuts) obj;
            return jl40.l(this.a, shortcuts.a) && jl40.l(this.b, shortcuts.b) && jl40.l(this.c, shortcuts.c) && Float.compare(this.d, shortcuts.d) == 0 && Float.compare(this.e, shortcuts.e) == 0 && jl40.l(this.f, shortcuts.f) && this.g == shortcuts.g && jl40.l(this.h, shortcuts.h) && jl40.l(this.i, shortcuts.i);
        }

        public final int hashCode() {
            return this.i.a.hashCode() + unr0.c(unr0.e(unr0.c(g8e.c(this.e, g8e.c(this.d, unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h.a);
        }

        public final String toString() {
            StringBuilder v = qv10.v("Shortcuts(supportedFeatures=", this.a, ", supportedActions=", this.b, ", supportedSections=");
            v.append(this.c);
            v.append(", mdashWidth=");
            v.append(this.d);
            v.append(", ndashWidth=");
            v.append(this.e);
            v.append(", gridsSupport=");
            v.append(this.f);
            v.append(", multiColorIconsSupported=");
            v.append(this.g);
            v.append(", supportedIconSizes=");
            v.append(this.h);
            v.append(", supportedTitleSizes=");
            v.append(this.i);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Shortcuts() {
            this(null, 511);
        }

        public Shortcuts(List list, List list2, List list3, float f, float f2, List list4, jsq0 jsq0Var, jsq0 jsq0Var2) {
            this.a = list;
            this.b = list2;
            this.c = list3;
            this.d = f;
            this.e = f2;
            this.f = list4;
            this.g = true;
            this.h = jsq0Var;
            this.i = jsq0Var2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Shortcuts(List list, int i) {
            this(r1, r2, r3, 0.0f, 0.0f, r6, new jsq0(r10), new jsq0(Collections.singletonList(ShortcutTitleSize.REGULAR)));
            List list2 = (i & 1) != 0 ? EmptyList.a : list;
            List list3 = ProductsParam.l;
            ArrayList arrayList = ProductsParam.m;
            List singletonList = Collections.singletonList(new SupportedGrid(0));
            List singletonList2 = Collections.singletonList(ShortcutIconSize.MEDIUM);
            jsq0 jsq0Var = ksq0.a;
        }
    }
}
