package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.mdx;
import defpackage.nnm;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.rpe0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.v8f0;
import defpackage.vye0;
import defpackage.w7s;
import defpackage.xx;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0016\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductMode$Taxi", "Lcom/yandex/go/shortcuts/dto/response/t1;", "Companion", "SectionHeader", "SectionType", "SectionTag", "com/yandex/go/shortcuts/dto/response/m1", "com/yandex/go/shortcuts/dto/response/r1", "TopScreenIconButton", "TopScreenRoundButton", "com/yandex/go/shortcuts/dto/response/n1", "TopItemAlign", "com/yandex/go/shortcuts/dto/response/q1", "com/yandex/go/shortcuts/dto/response/d1", "BottomScreenRoundButton", "BottomScreenIconButton", "com/yandex/go/shortcuts/dto/response/e1", "BottomItemAlign", "com/yandex/go/shortcuts/dto/response/y0", "AttentionAboveCardObject", "com/yandex/go/shortcuts/dto/response/p1", "AboveCardObjectType", "com/yandex/go/shortcuts/dto/response/z0", "com/yandex/go/shortcuts/dto/response/g1", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductMode$Taxi extends t1 {
    public static final g1 Companion = new g1();
    public static final i3y[] h;
    public final Layout a;
    public final ProductsCommon$OfferItem b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$AboveCardObjectType;", "", "UNKNOWN", "ATTENTION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AboveCardObjectType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AboveCardObjectType[] $VALUES;
        public static final AboveCardObjectType ATTENTION;
        public static final AboveCardObjectType UNKNOWN;

        static {
            AboveCardObjectType aboveCardObjectType = new AboveCardObjectType("UNKNOWN", 0);
            UNKNOWN = aboveCardObjectType;
            AboveCardObjectType aboveCardObjectType2 = new AboveCardObjectType("ATTENTION", 1);
            ATTENTION = aboveCardObjectType2;
            AboveCardObjectType[] aboveCardObjectTypeArr = {aboveCardObjectType, aboveCardObjectType2};
            $VALUES = aboveCardObjectTypeArr;
            $ENTRIES = kotlin.enums.a.a(aboveCardObjectTypeArr);
        }

        public static AboveCardObjectType valueOf(String str) {
            return (AboveCardObjectType) Enum.valueOf(AboveCardObjectType.class, str);
        }

        public static AboveCardObjectType[] values() {
            return (AboveCardObjectType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$BottomItemAlign;", "", "Companion", "com/yandex/go/shortcuts/dto/response/b1", "LEFT", "RIGHT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class BottomItemAlign {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BottomItemAlign[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b1 Companion;
        public static final BottomItemAlign LEFT;
        public static final BottomItemAlign RIGHT;

        static {
            BottomItemAlign bottomItemAlign = new BottomItemAlign("LEFT", 0);
            LEFT = bottomItemAlign;
            BottomItemAlign bottomItemAlign2 = new BottomItemAlign("RIGHT", 1);
            RIGHT = bottomItemAlign2;
            BottomItemAlign[] bottomItemAlignArr = {bottomItemAlign, bottomItemAlign2};
            $VALUES = bottomItemAlignArr;
            $ENTRIES = kotlin.enums.a.a(bottomItemAlignArr);
            Companion = new b1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(27));
        }

        public static BottomItemAlign valueOf(String str) {
            return (BottomItemAlign) Enum.valueOf(BottomItemAlign.class, str);
        }

        public static BottomItemAlign[] values() {
            return (BottomItemAlign[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$SectionTag;", "", "Companion", "com/yandex/go/shortcuts/dto/response/i1", "UNSUPPORTED", "GRAY_SEPARATOR", "TRANSPARENT_SEPARATOR", "BLACK_SEPARATOR", "NAV_SECTION_WIDTH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SectionTag {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SectionTag[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final SectionTag BLACK_SEPARATOR;
        public static final i1 Companion;
        public static final SectionTag GRAY_SEPARATOR;
        public static final SectionTag NAV_SECTION_WIDTH;
        public static final SectionTag TRANSPARENT_SEPARATOR;
        public static final SectionTag UNSUPPORTED;

        static {
            SectionTag sectionTag = new SectionTag("UNSUPPORTED", 0);
            UNSUPPORTED = sectionTag;
            SectionTag sectionTag2 = new SectionTag("GRAY_SEPARATOR", 1);
            GRAY_SEPARATOR = sectionTag2;
            SectionTag sectionTag3 = new SectionTag("TRANSPARENT_SEPARATOR", 2);
            TRANSPARENT_SEPARATOR = sectionTag3;
            SectionTag sectionTag4 = new SectionTag("BLACK_SEPARATOR", 3);
            BLACK_SEPARATOR = sectionTag4;
            SectionTag sectionTag5 = new SectionTag("NAV_SECTION_WIDTH", 4);
            NAV_SECTION_WIDTH = sectionTag5;
            SectionTag[] sectionTagArr = {sectionTag, sectionTag2, sectionTag3, sectionTag4, sectionTag5};
            $VALUES = sectionTagArr;
            $ENTRIES = kotlin.enums.a.a(sectionTagArr);
            Companion = new i1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(1));
        }

        public static SectionTag valueOf(String str) {
            return (SectionTag) Enum.valueOf(SectionTag.class, str);
        }

        public static SectionTag[] values() {
            return (SectionTag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$SectionType;", "", "Companion", "com/yandex/go/shortcuts/dto/response/j1", "UNSUPPORTED", "HEADER_LINEAR_GRID", "ITEMS_LINEAR_GRID", "ITEMS_HORIZONTAL_SCROLLABLE_GRID", "BUTTONS_CONTAINER", "HORIZONTAL_STACK_SECTION", "VERTICAL_STACK_SECTION", "TAXI_SUGGESTS_SECTION", "WHERE_TO_SECTION", "LINEAR_VERTICAL_LIST", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes8.dex */
    public static final class SectionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SectionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final SectionType BUTTONS_CONTAINER;
        public static final j1 Companion;
        public static final SectionType HEADER_LINEAR_GRID;
        public static final SectionType HORIZONTAL_STACK_SECTION;
        public static final SectionType ITEMS_HORIZONTAL_SCROLLABLE_GRID;
        public static final SectionType ITEMS_LINEAR_GRID;
        public static final SectionType LINEAR_VERTICAL_LIST;
        public static final SectionType TAXI_SUGGESTS_SECTION;
        public static final SectionType UNSUPPORTED;
        public static final SectionType VERTICAL_STACK_SECTION;
        public static final SectionType WHERE_TO_SECTION;

        static {
            SectionType sectionType = new SectionType("UNSUPPORTED", 0);
            UNSUPPORTED = sectionType;
            SectionType sectionType2 = new SectionType("HEADER_LINEAR_GRID", 1);
            HEADER_LINEAR_GRID = sectionType2;
            SectionType sectionType3 = new SectionType("ITEMS_LINEAR_GRID", 2);
            ITEMS_LINEAR_GRID = sectionType3;
            SectionType sectionType4 = new SectionType("ITEMS_HORIZONTAL_SCROLLABLE_GRID", 3);
            ITEMS_HORIZONTAL_SCROLLABLE_GRID = sectionType4;
            SectionType sectionType5 = new SectionType("BUTTONS_CONTAINER", 4);
            BUTTONS_CONTAINER = sectionType5;
            SectionType sectionType6 = new SectionType("HORIZONTAL_STACK_SECTION", 5);
            HORIZONTAL_STACK_SECTION = sectionType6;
            SectionType sectionType7 = new SectionType("VERTICAL_STACK_SECTION", 6);
            VERTICAL_STACK_SECTION = sectionType7;
            SectionType sectionType8 = new SectionType("TAXI_SUGGESTS_SECTION", 7);
            TAXI_SUGGESTS_SECTION = sectionType8;
            SectionType sectionType9 = new SectionType("WHERE_TO_SECTION", 8);
            WHERE_TO_SECTION = sectionType9;
            SectionType sectionType10 = new SectionType("LINEAR_VERTICAL_LIST", 9);
            LINEAR_VERTICAL_LIST = sectionType10;
            SectionType[] sectionTypeArr = {sectionType, sectionType2, sectionType3, sectionType4, sectionType5, sectionType6, sectionType7, sectionType8, sectionType9, sectionType10};
            $VALUES = sectionTypeArr;
            $ENTRIES = kotlin.enums.a.a(sectionTypeArr);
            Companion = new j1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(7));
        }

        public static k4o b() {
            return $ENTRIES;
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$TopItemAlign;", "", "Companion", "com/yandex/go/shortcuts/dto/response/k1", "LEFT", "RIGHT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TopItemAlign {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TopItemAlign[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final k1 Companion;
        public static final TopItemAlign LEFT;
        public static final TopItemAlign RIGHT;

        static {
            TopItemAlign topItemAlign = new TopItemAlign("LEFT", 0);
            LEFT = topItemAlign;
            TopItemAlign topItemAlign2 = new TopItemAlign("RIGHT", 1);
            RIGHT = topItemAlign2;
            TopItemAlign[] topItemAlignArr = {topItemAlign, topItemAlign2};
            $VALUES = topItemAlignArr;
            $ENTRIES = kotlin.enums.a.a(topItemAlignArr);
            Companion = new k1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(2));
        }

        public static TopItemAlign valueOf(String str) {
            return (TopItemAlign) Enum.valueOf(TopItemAlign.class, str);
        }

        public static TopItemAlign[] values() {
            return (TopItemAlign[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new vye0(23)), kotlin.a.b(lazyThreadSafetyMode, new vye0(24)), kotlin.a.b(lazyThreadSafetyMode, new vye0(25)), kotlin.a.b(lazyThreadSafetyMode, new vye0(26)), null};
        new ProductMode$Taxi(0);
    }

    public ProductMode$Taxi(int i, Layout layout, ProductsCommon$OfferItem productsCommon$OfferItem, List list, List list2, List list3, List list4, String str) {
        this.a = (i & 1) == 0 ? new Layout(0) : layout;
        if ((i & 2) == 0) {
            this.b = new ProductsCommon$OfferItem(0);
        } else {
            this.b = productsCommon$OfferItem;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
    }

    public static final /* synthetic */ void c(ProductMode$Taxi productMode$Taxi, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(productMode$Taxi.a, new Layout(0))) {
            yjdVar.e(serialDescriptor, 0, Layout$$serializer.INSTANCE, productMode$Taxi.a);
        }
        if (yjdVar.F() || !jl40.l(productMode$Taxi.b, new ProductsCommon$OfferItem(0))) {
            yjdVar.e(serialDescriptor, 1, ProductsCommon$OfferItem$$serializer.INSTANCE, productMode$Taxi.b);
        }
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = h;
        if (F || !jl40.l(productMode$Taxi.c, emptyList)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), productMode$Taxi.c);
        }
        if (yjdVar.F() || !jl40.l(productMode$Taxi.d, emptyList)) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), productMode$Taxi.d);
        }
        if (yjdVar.F() || !jl40.l(productMode$Taxi.e, emptyList)) {
            yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), productMode$Taxi.e);
        }
        if (yjdVar.F() || !jl40.l(productMode$Taxi.f, emptyList)) {
            yjdVar.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), productMode$Taxi.f);
        }
        if (!yjdVar.F() && jl40.l(productMode$Taxi.g, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 6, productMode$Taxi.g);
    }

    @Override // com.yandex.go.shortcuts.dto.response.t1
    public final Mode a() {
        return Mode.TAXI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMode$Taxi)) {
            return false;
        }
        ProductMode$Taxi productMode$Taxi = (ProductMode$Taxi) obj;
        return jl40.l(this.a, productMode$Taxi.a) && jl40.l(this.b, productMode$Taxi.b) && jl40.l(this.c, productMode$Taxi.c) && jl40.l(this.d, productMode$Taxi.d) && jl40.l(this.e, productMode$Taxi.e) && jl40.l(this.f, productMode$Taxi.f) && jl40.l(this.g, productMode$Taxi.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.c(unr0.c(unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Taxi(layout=");
        sb.append(this.a);
        sb.append(", offers=");
        sb.append(this.b);
        sb.append(", sections=");
        nnm.w(sb, this.c, ", topScreenObjects=", this.d, ", bottomScreenObjects=");
        nnm.w(sb, this.e, ", objectsOverMap=", this.f, ", eventPayload=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$AttentionAboveCardObject;", "Lcom/yandex/go/shortcuts/dto/response/y0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/a1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AttentionAboveCardObject extends y0 {
        public static final a1 Companion = new a1();
        public final kotlinx.serialization.json.c a;

        public AttentionAboveCardObject(int i, kotlinx.serialization.json.c cVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = cVar;
            }
        }

        public static final /* synthetic */ void b(AttentionAboveCardObject attentionAboveCardObject, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (!yjdVar.F() && attentionAboveCardObject.a == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 0, mdx.a, attentionAboveCardObject.a);
        }

        @Override // com.yandex.go.shortcuts.dto.response.y0
        public final AboveCardObjectType a() {
            return AboveCardObjectType.ATTENTION;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AttentionAboveCardObject) && jl40.l(this.a, ((AttentionAboveCardObject) obj).a);
        }

        public final int hashCode() {
            kotlinx.serialization.json.c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "AttentionAboveCardObject(payload=" + this.a + Extension.C_BRAKE;
        }

        public AttentionAboveCardObject() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$SectionHeader;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/h1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SectionHeader {
        public static final h1 Companion = new h1();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(0))};
        public final FormattedText a;
        public final List b;

        public /* synthetic */ SectionHeader(int i, FormattedText formattedText, List list) {
            this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public static final /* synthetic */ void b(SectionHeader sectionHeader, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !nzs.t(0, sectionHeader.a)) {
                yjdVar.e(serialDescriptor, 0, w7s.a, sectionHeader.a);
            }
            if (!yjdVar.F() && jl40.l(sectionHeader.b, EmptyList.a)) {
                return;
            }
            yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), sectionHeader.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) obj;
            return jl40.l(this.a, sectionHeader.a) && jl40.l(this.b, sectionHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "SectionHeader(title=" + this.a + ", widgets=" + this.b + Extension.C_BRAKE;
        }

        public SectionHeader() {
            this.a = new FormattedText(0);
            this.b = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$TopScreenRoundButton;", "Lcom/yandex/go/shortcuts/dto/response/m1;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/o1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TopScreenRoundButton extends m1 {
        public static final o1 Companion = new o1();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(4)), null};
        public final String a;
        public final com.yandex.go.dto.response.q1 b;
        public final TopItemAlign c;
        public final FormattedText d;

        public TopScreenRoundButton(int i, String str, com.yandex.go.dto.response.q1 q1Var, TopItemAlign topItemAlign, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = com.yandex.go.dto.response.e0.INSTANCE;
            } else {
                this.b = q1Var;
            }
            if ((i & 4) == 0) {
                this.c = TopItemAlign.LEFT;
            } else {
                this.c = topItemAlign;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText;
            }
        }

        public static final /* synthetic */ void b(TopScreenRoundButton topScreenRoundButton, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(topScreenRoundButton.a, "")) {
                yjdVar.o(serialDescriptor, 0, topScreenRoundButton.a);
            }
            if (yjdVar.F() || !jl40.l(topScreenRoundButton.b, com.yandex.go.dto.response.e0.INSTANCE)) {
                yjdVar.e(serialDescriptor, 1, xx.f, topScreenRoundButton.b);
            }
            if (yjdVar.F() || topScreenRoundButton.c != TopItemAlign.LEFT) {
                yjdVar.e(serialDescriptor, 2, (KSerializer) e[2].getValue(), topScreenRoundButton.c);
            }
            if (!yjdVar.F() && jl40.l(topScreenRoundButton.d, FormattedText.c)) {
                return;
            }
            yjdVar.e(serialDescriptor, 3, w7s.a, topScreenRoundButton.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopScreenRoundButton)) {
                return false;
            }
            TopScreenRoundButton topScreenRoundButton = (TopScreenRoundButton) obj;
            return jl40.l(this.a, topScreenRoundButton.a) && jl40.l(this.b, topScreenRoundButton.b) && this.c == topScreenRoundButton.c && jl40.l(this.d, topScreenRoundButton.d);
        }

        public final int hashCode() {
            return this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "TopScreenRoundButton(id=" + this.a + ", action=" + this.b + ", align=" + this.c + ", title=" + this.d + Extension.C_BRAKE;
        }

        public TopScreenRoundButton() {
            com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
            TopItemAlign topItemAlign = TopItemAlign.LEFT;
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = e0Var;
            this.c = topItemAlign;
            this.d = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$TopScreenIconButton;", "Lcom/yandex/go/shortcuts/dto/response/m1;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/l1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TopScreenIconButton extends m1 {
        public static final l1 Companion = new l1();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(3)), null};
        public final String a;
        public final com.yandex.go.dto.response.q1 b;
        public final TopItemAlign c;
        public final String d;

        public TopScreenIconButton(int i, String str, com.yandex.go.dto.response.q1 q1Var, TopItemAlign topItemAlign, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = com.yandex.go.dto.response.e0.INSTANCE;
            } else {
                this.b = q1Var;
            }
            if ((i & 4) == 0) {
                this.c = TopItemAlign.LEFT;
            } else {
                this.c = topItemAlign;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
        }

        public static final /* synthetic */ void b(TopScreenIconButton topScreenIconButton, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(topScreenIconButton.a, "")) {
                yjdVar.o(serialDescriptor, 0, topScreenIconButton.a);
            }
            if (yjdVar.F() || !jl40.l(topScreenIconButton.b, com.yandex.go.dto.response.e0.INSTANCE)) {
                yjdVar.e(serialDescriptor, 1, xx.f, topScreenIconButton.b);
            }
            if (yjdVar.F() || topScreenIconButton.c != TopItemAlign.LEFT) {
                yjdVar.e(serialDescriptor, 2, (KSerializer) e[2].getValue(), topScreenIconButton.c);
            }
            if (!yjdVar.F() && jl40.l(topScreenIconButton.d, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 3, topScreenIconButton.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopScreenIconButton)) {
                return false;
            }
            TopScreenIconButton topScreenIconButton = (TopScreenIconButton) obj;
            return jl40.l(this.a, topScreenIconButton.a) && jl40.l(this.b, topScreenIconButton.b) && this.c == topScreenIconButton.c && jl40.l(this.d, topScreenIconButton.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "TopScreenIconButton(id=" + this.a + ", action=" + this.b + ", align=" + this.c + ", iconTag=" + this.d + Extension.C_BRAKE;
        }

        public TopScreenIconButton() {
            com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
            TopItemAlign topItemAlign = TopItemAlign.LEFT;
            this.a = "";
            this.b = e0Var;
            this.c = topItemAlign;
            this.d = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$BottomScreenIconButton;", "Lcom/yandex/go/shortcuts/dto/response/d1;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/c1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BottomScreenIconButton extends d1 {
        public static final c1 Companion = new c1();
        public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(28)), null, null};
        public final String a;
        public final com.yandex.go.dto.response.q1 b;
        public final BottomItemAlign c;
        public final String d;
        public final String e;

        public BottomScreenIconButton(int i, String str, com.yandex.go.dto.response.q1 q1Var, BottomItemAlign bottomItemAlign, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = com.yandex.go.dto.response.e0.INSTANCE;
            } else {
                this.b = q1Var;
            }
            if ((i & 4) == 0) {
                this.c = BottomItemAlign.LEFT;
            } else {
                this.c = bottomItemAlign;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
        }

        public static final /* synthetic */ void b(BottomScreenIconButton bottomScreenIconButton, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(bottomScreenIconButton.a, "")) {
                yjdVar.o(serialDescriptor, 0, bottomScreenIconButton.a);
            }
            if (yjdVar.F() || !jl40.l(bottomScreenIconButton.b, com.yandex.go.dto.response.e0.INSTANCE)) {
                yjdVar.e(serialDescriptor, 1, xx.f, bottomScreenIconButton.b);
            }
            if (yjdVar.F() || bottomScreenIconButton.c != BottomItemAlign.LEFT) {
                yjdVar.e(serialDescriptor, 2, (KSerializer) f[2].getValue(), bottomScreenIconButton.c);
            }
            if (yjdVar.F() || !jl40.l(bottomScreenIconButton.d, "")) {
                yjdVar.o(serialDescriptor, 3, bottomScreenIconButton.d);
            }
            if (!yjdVar.F() && jl40.l(bottomScreenIconButton.e, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 4, bottomScreenIconButton.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomScreenIconButton)) {
                return false;
            }
            BottomScreenIconButton bottomScreenIconButton = (BottomScreenIconButton) obj;
            return jl40.l(this.a, bottomScreenIconButton.a) && jl40.l(this.b, bottomScreenIconButton.b) && this.c == bottomScreenIconButton.c && jl40.l(this.d, bottomScreenIconButton.d) && jl40.l(this.e, bottomScreenIconButton.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BottomScreenIconButton(id=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", align=");
            sb.append(this.c);
            sb.append(", accessibilityText=");
            sb.append(this.d);
            sb.append(", iconTag=");
            return oyr.t(sb, this.e, Extension.C_BRAKE);
        }

        public BottomScreenIconButton() {
            com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
            BottomItemAlign bottomItemAlign = BottomItemAlign.LEFT;
            this.a = "";
            this.b = e0Var;
            this.c = bottomItemAlign;
            this.d = "";
            this.e = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Taxi$BottomScreenRoundButton;", "Lcom/yandex/go/shortcuts/dto/response/d1;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/f1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BottomScreenRoundButton extends d1 {
        public static final f1 Companion = new f1();
        public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(29)), null, null};
        public final String a;
        public final com.yandex.go.dto.response.q1 b;
        public final BottomItemAlign c;
        public final String d;
        public final FormattedText e;

        public BottomScreenRoundButton(int i, String str, com.yandex.go.dto.response.q1 q1Var, BottomItemAlign bottomItemAlign, String str2, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = com.yandex.go.dto.response.e0.INSTANCE;
            } else {
                this.b = q1Var;
            }
            if ((i & 4) == 0) {
                this.c = BottomItemAlign.LEFT;
            } else {
                this.c = bottomItemAlign;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = FormattedText.c;
            } else {
                this.e = formattedText;
            }
        }

        public static final /* synthetic */ void b(BottomScreenRoundButton bottomScreenRoundButton, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(bottomScreenRoundButton.a, "")) {
                yjdVar.o(serialDescriptor, 0, bottomScreenRoundButton.a);
            }
            if (yjdVar.F() || !jl40.l(bottomScreenRoundButton.b, com.yandex.go.dto.response.e0.INSTANCE)) {
                yjdVar.e(serialDescriptor, 1, xx.f, bottomScreenRoundButton.b);
            }
            if (yjdVar.F() || bottomScreenRoundButton.c != BottomItemAlign.LEFT) {
                yjdVar.e(serialDescriptor, 2, (KSerializer) f[2].getValue(), bottomScreenRoundButton.c);
            }
            if (yjdVar.F() || !jl40.l(bottomScreenRoundButton.d, "")) {
                yjdVar.o(serialDescriptor, 3, bottomScreenRoundButton.d);
            }
            if (!yjdVar.F() && jl40.l(bottomScreenRoundButton.e, FormattedText.c)) {
                return;
            }
            yjdVar.e(serialDescriptor, 4, w7s.a, bottomScreenRoundButton.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomScreenRoundButton)) {
                return false;
            }
            BottomScreenRoundButton bottomScreenRoundButton = (BottomScreenRoundButton) obj;
            return jl40.l(this.a, bottomScreenRoundButton.a) && jl40.l(this.b, bottomScreenRoundButton.b) && this.c == bottomScreenRoundButton.c && jl40.l(this.d, bottomScreenRoundButton.d) && jl40.l(this.e, bottomScreenRoundButton.e);
        }

        public final int hashCode() {
            return this.e.a.hashCode() + unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BottomScreenRoundButton(id=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", align=");
            sb.append(this.c);
            sb.append(", accessibilityText=");
            sb.append(this.d);
            sb.append(", title=");
            return tse0.m(sb, this.e, Extension.C_BRAKE);
        }

        public BottomScreenRoundButton() {
            com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
            BottomItemAlign bottomItemAlign = BottomItemAlign.LEFT;
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = e0Var;
            this.c = bottomItemAlign;
            this.d = "";
            this.e = formattedText;
        }
    }

    public ProductMode$Taxi() {
        this(0);
    }

    public ProductMode$Taxi(int i) {
        Layout layout = new Layout(0);
        ProductsCommon$OfferItem productsCommon$OfferItem = new ProductsCommon$OfferItem(0);
        this.a = layout;
        this.b = productsCommon$OfferItem;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
        this.g = "";
    }
}
