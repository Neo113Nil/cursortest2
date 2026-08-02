package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.w0q0;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader;", "", "Companion", "HeaderType", "SectionTitle", "Lead", "Trail", "$serializer", "com/yandex/go/shortcuts/dto/response/g2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SectionTypedHeader {
    public static final g2 Companion = new g2();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(6)), null, null};
    public final HeaderType a;
    public final Lead b;
    public final Trail c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$HeaderType;", "", "Companion", "com/yandex/go/shortcuts/dto/response/h2", "LIST_ITEM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class HeaderType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ HeaderType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final h2 Companion;
        public static final HeaderType LIST_ITEM;

        static {
            HeaderType headerType = new HeaderType("LIST_ITEM", 0);
            LIST_ITEM = headerType;
            HeaderType[] headerTypeArr = {headerType};
            $VALUES = headerTypeArr;
            $ENTRIES = kotlin.enums.a.a(headerTypeArr);
            Companion = new h2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(7));
        }

        public static HeaderType valueOf(String str) {
            return (HeaderType) Enum.valueOf(HeaderType.class, str);
        }

        public static HeaderType[] values() {
            return (HeaderType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SectionTypedHeader(int i, HeaderType headerType, Lead lead, Trail trail) {
        this.a = (i & 1) == 0 ? HeaderType.LIST_ITEM : headerType;
        if ((i & 2) == 0) {
            this.b = new Lead(0);
        } else {
            this.b = lead;
        }
        if ((i & 4) == 0) {
            this.c = new Trail(0);
        } else {
            this.c = trail;
        }
    }

    public static final /* synthetic */ void b(SectionTypedHeader sectionTypedHeader, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || sectionTypedHeader.a != HeaderType.LIST_ITEM) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) d[0].getValue(), sectionTypedHeader.a);
        }
        if (yjdVar.F() || !jl40.l(sectionTypedHeader.b, new Lead(0))) {
            yjdVar.e(serialDescriptor, 1, SectionTypedHeader$Lead$$serializer.INSTANCE, sectionTypedHeader.b);
        }
        if (!yjdVar.F() && jl40.l(sectionTypedHeader.c, new Trail(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, SectionTypedHeader$Trail$$serializer.INSTANCE, sectionTypedHeader.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionTypedHeader)) {
            return false;
        }
        SectionTypedHeader sectionTypedHeader = (SectionTypedHeader) obj;
        return this.a == sectionTypedHeader.a && jl40.l(this.b, sectionTypedHeader.b) && jl40.l(this.c, sectionTypedHeader.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SectionTypedHeader(type=" + this.a + ", lead=" + this.b + ", trail=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$SectionTitle;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/l2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SectionTitle {
        public static final l2 Companion = new l2();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ SectionTitle(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
            }
        }

        public static final /* synthetic */ void a(SectionTitle sectionTitle, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(sectionTitle.a, "")) {
                yjdVar.o(serialDescriptor, 0, sectionTitle.a);
            }
            if (!yjdVar.F() && sectionTitle.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, w7s.a, sectionTitle.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionTitle)) {
                return false;
            }
            SectionTitle sectionTitle = (SectionTitle) obj;
            return jl40.l(this.a, sectionTitle.a) && jl40.l(this.b, sectionTitle.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            FormattedText formattedText = this.b;
            return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
        }

        public final String toString() {
            return "SectionTitle(text=" + this.a + ", attributedText=" + this.b + Extension.C_BRAKE;
        }

        public SectionTitle(int i) {
            this.a = "";
            this.b = null;
        }

        public SectionTitle() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Trail;", "", "Companion", "TrailType", "$serializer", "com/yandex/go/shortcuts/dto/response/m2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Trail {
        public static final m2 Companion = new m2();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(12)), null};
        public final TrailType a;
        public final SectionTitle b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Trail$TrailType;", "", "Companion", "com/yandex/go/shortcuts/dto/response/n2", "SUBTITLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes5.dex */
        public static final class TrailType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TrailType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final n2 Companion;
            public static final TrailType SUBTITLE;

            static {
                TrailType trailType = new TrailType("SUBTITLE", 0);
                SUBTITLE = trailType;
                TrailType[] trailTypeArr = {trailType};
                $VALUES = trailTypeArr;
                $ENTRIES = kotlin.enums.a.a(trailTypeArr);
                Companion = new n2();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(13));
            }

            public static TrailType valueOf(String str) {
                return (TrailType) Enum.valueOf(TrailType.class, str);
            }

            public static TrailType[] values() {
                return (TrailType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Trail(int i, TrailType trailType, SectionTitle sectionTitle) {
            this.a = (i & 1) == 0 ? TrailType.SUBTITLE : trailType;
            if ((i & 2) == 0) {
                this.b = new SectionTitle(0);
            } else {
                this.b = sectionTitle;
            }
        }

        public static final /* synthetic */ void b(Trail trail, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || trail.a != TrailType.SUBTITLE) {
                yjdVar.e(serialDescriptor, 0, (KSerializer) c[0].getValue(), trail.a);
            }
            if (!yjdVar.F() && jl40.l(trail.b, new SectionTitle(0))) {
                return;
            }
            yjdVar.e(serialDescriptor, 1, SectionTypedHeader$SectionTitle$$serializer.INSTANCE, trail.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Trail)) {
                return false;
            }
            Trail trail = (Trail) obj;
            return this.a == trail.a && jl40.l(this.b, trail.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Trail(type=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
        }

        public Trail() {
            this(0);
        }

        public Trail(int i) {
            TrailType trailType = TrailType.SUBTITLE;
            SectionTitle sectionTitle = new SectionTitle(0);
            this.a = trailType;
            this.b = sectionTitle;
        }
    }

    public SectionTypedHeader() {
        HeaderType headerType = HeaderType.LIST_ITEM;
        Lead lead = new Lead(0);
        Trail trail = new Trail(0);
        this.a = headerType;
        this.b = lead;
        this.c = trail;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Lead;", "", "Companion", "LeadType", "AppearanceType", "$serializer", "com/yandex/go/shortcuts/dto/response/j2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Lead {
        public static final j2 Companion = new j2();
        public static final i3y[] e;
        public final LeadType a;
        public final SectionTitle b;
        public final String c;
        public final AppearanceType d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Lead$AppearanceType;", "", "Companion", "com/yandex/go/shortcuts/dto/response/i2", "NORMAL", "ICON_ONLY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AppearanceType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ AppearanceType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final i2 Companion;
            public static final AppearanceType ICON_ONLY;
            public static final AppearanceType NORMAL;

            static {
                AppearanceType appearanceType = new AppearanceType("NORMAL", 0);
                NORMAL = appearanceType;
                AppearanceType appearanceType2 = new AppearanceType("ICON_ONLY", 1);
                ICON_ONLY = appearanceType2;
                AppearanceType[] appearanceTypeArr = {appearanceType, appearanceType2};
                $VALUES = appearanceTypeArr;
                $ENTRIES = kotlin.enums.a.a(appearanceTypeArr);
                Companion = new i2();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(10));
            }

            public static AppearanceType valueOf(String str) {
                return (AppearanceType) Enum.valueOf(AppearanceType.class, str);
            }

            public static AppearanceType[] values() {
                return (AppearanceType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Lead$LeadType;", "", "Companion", "com/yandex/go/shortcuts/dto/response/k2", "APP_TITLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes5.dex */
        public static final class LeadType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ LeadType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final LeadType APP_TITLE;
            public static final k2 Companion;

            static {
                LeadType leadType = new LeadType("APP_TITLE", 0);
                APP_TITLE = leadType;
                LeadType[] leadTypeArr = {leadType};
                $VALUES = leadTypeArr;
                $ENTRIES = kotlin.enums.a.a(leadTypeArr);
                Companion = new k2();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(11));
            }

            public static LeadType valueOf(String str) {
                return (LeadType) Enum.valueOf(LeadType.class, str);
            }

            public static LeadType[] values() {
                return (LeadType[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new w0q0(8)), null, null, kotlin.a.b(lazyThreadSafetyMode, new w0q0(9))};
        }

        public /* synthetic */ Lead(int i, LeadType leadType, SectionTitle sectionTitle, String str, AppearanceType appearanceType) {
            this.a = (i & 1) == 0 ? LeadType.APP_TITLE : leadType;
            if ((i & 2) == 0) {
                this.b = new SectionTitle(0);
            } else {
                this.b = sectionTitle;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = AppearanceType.NORMAL;
            } else {
                this.d = appearanceType;
            }
        }

        public static final /* synthetic */ void b(Lead lead, yjd yjdVar, SerialDescriptor serialDescriptor) {
            boolean F = yjdVar.F();
            i3y[] i3yVarArr = e;
            if (F || lead.a != LeadType.APP_TITLE) {
                yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), lead.a);
            }
            if (yjdVar.F() || !jl40.l(lead.b, new SectionTitle(0))) {
                yjdVar.e(serialDescriptor, 1, SectionTypedHeader$SectionTitle$$serializer.INSTANCE, lead.b);
            }
            if (yjdVar.F() || !jl40.l(lead.c, "")) {
                yjdVar.o(serialDescriptor, 2, lead.c);
            }
            if (!yjdVar.F() && lead.d == AppearanceType.NORMAL) {
                return;
            }
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), lead.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Lead)) {
                return false;
            }
            Lead lead = (Lead) obj;
            return this.a == lead.a && jl40.l(this.b, lead.b) && jl40.l(this.c, lead.c) && this.d == lead.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "Lead(type=" + this.a + ", title=" + this.b + ", iconTag=" + this.c + ", appearanceType=" + this.d + Extension.C_BRAKE;
        }

        public Lead() {
            this(0);
        }

        public Lead(int i) {
            LeadType leadType = LeadType.APP_TITLE;
            SectionTitle sectionTitle = new SectionTitle(0);
            AppearanceType appearanceType = AppearanceType.NORMAL;
            this.a = leadType;
            this.b = sectionTitle;
            this.c = "";
            this.d = appearanceType;
        }
    }
}
