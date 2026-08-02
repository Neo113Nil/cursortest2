package com.yandex.go.transfer_requirement.experiment;

import defpackage.auu0;
import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k801;
import defpackage.n96;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment;", "Ln96;", "Lc6z;", "Companion", "RequirementItemDto", "TransferKind", "Card", "com/yandex/go/transfer_requirement/experiment/q", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferRequirementExperiment extends n96 implements c6z {
    public static final q Companion = new q();
    public static final i3y[] j;
    public static final TransferRequirementExperiment k;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final TransferKind f;
    public final RequirementItemDto g;
    public final String h;
    public final Card i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$TransferKind;", "", "Companion", "com/yandex/go/transfer_requirement/experiment/s", "AVIA", "TRAIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TransferKind {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransferKind[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TransferKind AVIA;
        public static final s Companion;
        public static final TransferKind TRAIN;

        static {
            TransferKind transferKind = new TransferKind("AVIA", 0);
            AVIA = transferKind;
            TransferKind transferKind2 = new TransferKind("TRAIN", 1);
            TRAIN = transferKind2;
            TransferKind[] transferKindArr = {transferKind, transferKind2};
            $VALUES = transferKindArr;
            $ENTRIES = kotlin.enums.a.a(transferKindArr);
            Companion = new s();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(11));
        }

        public static TransferKind valueOf(String str) {
            return (TransferKind) Enum.valueOf(TransferKind.class, str);
        }

        public static TransferKind[] values() {
            return (TransferKind[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new k801(4)), null, null, kotlin.a.b(lazyThreadSafetyMode, new k801(5)), null, null, null};
        k = new TransferRequirementExperiment(0);
    }

    public /* synthetic */ TransferRequirementExperiment(int i, boolean z, Map map, String str, String str2, TransferKind transferKind, RequirementItemDto requirementItemDto, String str3, Card card) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = transferKind;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = requirementItemDto;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = card;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card;", "", "Companion", "DatePicker", "FirstSelectableDate", "ServiceSectionDto", "MeetingSectionDto", "RulesSectionDto", "ActionButtonDto", "$serializer", "com/yandex/go/transfer_requirement/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Card {
        public static final b Companion = new b();
        public final String a;
        public final DatePicker b;
        public final ServiceSectionDto c;
        public final MeetingSectionDto d;
        public final RulesSectionDto e;
        public final ActionButtonDto f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$FirstSelectableDate;", "", "Companion", "com/yandex/go/transfer_requirement/experiment/d", "TODAY", "YESTERDAY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class FirstSelectableDate {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ FirstSelectableDate[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final d Companion;
            public static final FirstSelectableDate TODAY;
            public static final FirstSelectableDate YESTERDAY;

            static {
                FirstSelectableDate firstSelectableDate = new FirstSelectableDate("TODAY", 0);
                TODAY = firstSelectableDate;
                FirstSelectableDate firstSelectableDate2 = new FirstSelectableDate("YESTERDAY", 1);
                YESTERDAY = firstSelectableDate2;
                FirstSelectableDate[] firstSelectableDateArr = {firstSelectableDate, firstSelectableDate2};
                $VALUES = firstSelectableDateArr;
                $ENTRIES = kotlin.enums.a.a(firstSelectableDateArr);
                Companion = new d();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(7));
            }

            public static FirstSelectableDate valueOf(String str) {
                return (FirstSelectableDate) Enum.valueOf(FirstSelectableDate.class, str);
            }

            public static FirstSelectableDate[] values() {
                return (FirstSelectableDate[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Card(int i, String str, DatePicker datePicker, ServiceSectionDto serviceSectionDto, MeetingSectionDto meetingSectionDto, RulesSectionDto rulesSectionDto, ActionButtonDto actionButtonDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = datePicker;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = serviceSectionDto;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = meetingSectionDto;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = rulesSectionDto;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = actionButtonDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return jl40.l(this.a, card.a) && jl40.l(this.b, card.b) && jl40.l(this.c, card.c) && jl40.l(this.d, card.d) && jl40.l(this.e, card.e) && jl40.l(this.f, card.f);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            DatePicker datePicker = this.b;
            int hashCode2 = (hashCode + (datePicker == null ? 0 : datePicker.hashCode())) * 31;
            ServiceSectionDto serviceSectionDto = this.c;
            int hashCode3 = (hashCode2 + (serviceSectionDto == null ? 0 : serviceSectionDto.hashCode())) * 31;
            MeetingSectionDto meetingSectionDto = this.d;
            int hashCode4 = (hashCode3 + (meetingSectionDto == null ? 0 : meetingSectionDto.hashCode())) * 31;
            RulesSectionDto rulesSectionDto = this.e;
            int hashCode5 = (hashCode4 + (rulesSectionDto == null ? 0 : rulesSectionDto.hashCode())) * 31;
            ActionButtonDto actionButtonDto = this.f;
            return hashCode5 + (actionButtonDto != null ? actionButtonDto.hashCode() : 0);
        }

        public final String toString() {
            return "Card(title=" + this.a + ", datePicker=" + this.b + ", serviceSection=" + this.c + ", meetingSection=" + this.d + ", rulesSection=" + this.e + ", actionButton=" + this.f + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto;", "", "Companion", "LabeledIconInfoDto", "CarriageNumberInfoDto", "LuggageInfoDto", "LuggageUiType", "BubbleModalDto", "BubbleModalButtonDto", "$serializer", "com/yandex/go/transfer_requirement/experiment/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ServiceSectionDto {
            public static final m Companion = new m();
            public final LabeledIconInfoDto a;
            public final LabeledIconInfoDto b;
            public final CarriageNumberInfoDto c;
            public final LuggageInfoDto d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class LuggageInfoDto {
                public static final o Companion = new o();
                public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(9)), null, null, null, null, null, null};
                public final LuggageUiType a;
                public final FormattedText b;
                public final FormattedText c;
                public final String d;
                public final Boolean e;
                public final Integer f;
                public final BubbleModalDto g;

                public /* synthetic */ LuggageInfoDto(int i, LuggageUiType luggageUiType, FormattedText formattedText, FormattedText formattedText2, String str, Boolean bool, Integer num, BubbleModalDto bubbleModalDto) {
                    if (1 != (i & 1)) {
                        qje.Z(i, 1, TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.a = luggageUiType;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = formattedText;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = formattedText2;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = str;
                    }
                    if ((i & 16) == 0) {
                        this.e = null;
                    } else {
                        this.e = bool;
                    }
                    if ((i & 32) == 0) {
                        this.f = null;
                    } else {
                        this.f = num;
                    }
                    if ((i & 64) == 0) {
                        this.g = null;
                    } else {
                        this.g = bubbleModalDto;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LuggageInfoDto)) {
                        return false;
                    }
                    LuggageInfoDto luggageInfoDto = (LuggageInfoDto) obj;
                    return this.a == luggageInfoDto.a && jl40.l(this.b, luggageInfoDto.b) && jl40.l(this.c, luggageInfoDto.c) && jl40.l(this.d, luggageInfoDto.d) && jl40.l(this.e, luggageInfoDto.e) && jl40.l(this.f, luggageInfoDto.f) && jl40.l(this.g, luggageInfoDto.g);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    FormattedText formattedText = this.b;
                    int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
                    FormattedText formattedText2 = this.c;
                    int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
                    String str = this.d;
                    int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.e;
                    int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Integer num = this.f;
                    int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                    BubbleModalDto bubbleModalDto = this.g;
                    return hashCode6 + (bubbleModalDto != null ? bubbleModalDto.hashCode() : 0);
                }

                public final String toString() {
                    return "LuggageInfoDto(type=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", leadIconTag=" + this.d + ", defaultValue=" + this.e + ", countLimit=" + this.f + ", bubbleModal=" + this.g + Extension.C_BRAKE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$LuggageUiType;", "", "Companion", "com/yandex/go/transfer_requirement/experiment/p", "COUNT", "SWITCHER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class LuggageUiType {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ LuggageUiType[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final LuggageUiType COUNT;
                public static final p Companion;
                public static final LuggageUiType SWITCHER;

                static {
                    LuggageUiType luggageUiType = new LuggageUiType("COUNT", 0);
                    COUNT = luggageUiType;
                    LuggageUiType luggageUiType2 = new LuggageUiType("SWITCHER", 1);
                    SWITCHER = luggageUiType2;
                    LuggageUiType[] luggageUiTypeArr = {luggageUiType, luggageUiType2};
                    $VALUES = luggageUiTypeArr;
                    $ENTRIES = kotlin.enums.a.a(luggageUiTypeArr);
                    Companion = new p();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(10));
                }

                public static LuggageUiType valueOf(String str) {
                    return (LuggageUiType) Enum.valueOf(LuggageUiType.class, str);
                }

                public static LuggageUiType[] values() {
                    return (LuggageUiType[]) $VALUES.clone();
                }
            }

            public /* synthetic */ ServiceSectionDto(int i, LabeledIconInfoDto labeledIconInfoDto, LabeledIconInfoDto labeledIconInfoDto2, CarriageNumberInfoDto carriageNumberInfoDto, LuggageInfoDto luggageInfoDto) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = labeledIconInfoDto;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = labeledIconInfoDto2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = carriageNumberInfoDto;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = luggageInfoDto;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServiceSectionDto)) {
                    return false;
                }
                ServiceSectionDto serviceSectionDto = (ServiceSectionDto) obj;
                return jl40.l(this.a, serviceSectionDto.a) && jl40.l(this.b, serviceSectionDto.b) && jl40.l(this.c, serviceSectionDto.c) && jl40.l(this.d, serviceSectionDto.d);
            }

            public final int hashCode() {
                LabeledIconInfoDto labeledIconInfoDto = this.a;
                int hashCode = (labeledIconInfoDto == null ? 0 : labeledIconInfoDto.hashCode()) * 31;
                LabeledIconInfoDto labeledIconInfoDto2 = this.b;
                int hashCode2 = (hashCode + (labeledIconInfoDto2 == null ? 0 : labeledIconInfoDto2.hashCode())) * 31;
                CarriageNumberInfoDto carriageNumberInfoDto = this.c;
                int hashCode3 = (hashCode2 + (carriageNumberInfoDto == null ? 0 : carriageNumberInfoDto.hashCode())) * 31;
                LuggageInfoDto luggageInfoDto = this.d;
                return hashCode3 + (luggageInfoDto != null ? luggageInfoDto.hashCode() : 0);
            }

            public final String toString() {
                return "ServiceSectionDto(numberInfo=" + this.a + ", timeInfo=" + this.b + ", carriageNumberInfo=" + this.c + ", luggageInfo=" + this.d + Extension.C_BRAKE;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$CarriageNumberInfoDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes14.dex */
            public static final /* data */ class CarriageNumberInfoDto {
                public static final l Companion = new l();
                public final String a;

                public /* synthetic */ CarriageNumberInfoDto(int i, String str) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = str;
                    }
                }

                public static final /* synthetic */ void a(CarriageNumberInfoDto carriageNumberInfoDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
                    if (!yjdVar.F() && carriageNumberInfoDto.a == null) {
                        return;
                    }
                    yjdVar.g(serialDescriptor, 0, auu0.a, carriageNumberInfoDto.a);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CarriageNumberInfoDto) && jl40.l(this.a, ((CarriageNumberInfoDto) obj).a);
                }

                public final int hashCode() {
                    String str = this.a;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return oyr.p("CarriageNumberInfoDto(title=", this.a, Extension.C_BRAKE);
                }

                public CarriageNumberInfoDto() {
                    this.a = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$BubbleModalButtonDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes14.dex */
            public static final /* data */ class BubbleModalButtonDto {
                public static final j Companion = new j();
                public final FormattedText a;
                public final String b;

                public /* synthetic */ BubbleModalButtonDto(int i, String str, FormattedText formattedText) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = formattedText;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BubbleModalButtonDto)) {
                        return false;
                    }
                    BubbleModalButtonDto bubbleModalButtonDto = (BubbleModalButtonDto) obj;
                    return jl40.l(this.a, bubbleModalButtonDto.a) && jl40.l(this.b, bubbleModalButtonDto.b);
                }

                public final int hashCode() {
                    FormattedText formattedText = this.a;
                    int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
                    String str = this.b;
                    return hashCode + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    return "BubbleModalButtonDto(text=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
                }

                public BubbleModalButtonDto() {
                    this.a = null;
                    this.b = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class LabeledIconInfoDto {
                public static final n Companion = new n();
                public final String a;
                public final String b;

                public /* synthetic */ LabeledIconInfoDto(int i, String str, String str2) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = str;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LabeledIconInfoDto)) {
                        return false;
                    }
                    LabeledIconInfoDto labeledIconInfoDto = (LabeledIconInfoDto) obj;
                    return jl40.l(this.a, labeledIconInfoDto.a) && jl40.l(this.b, labeledIconInfoDto.b);
                }

                public final int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return unr0.p("LabeledIconInfoDto(title=", this.a, ", leadIconTag=", this.b, Extension.C_BRAKE);
                }

                public LabeledIconInfoDto() {
                    this.a = null;
                    this.b = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$BubbleModalDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes14.dex */
            public static final /* data */ class BubbleModalDto {
                public static final k Companion = new k();
                public final FormattedText a;
                public final FormattedText b;
                public final BubbleModalButtonDto c;

                public /* synthetic */ BubbleModalDto(int i, FormattedText formattedText, FormattedText formattedText2, BubbleModalButtonDto bubbleModalButtonDto) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = formattedText;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = formattedText2;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = bubbleModalButtonDto;
                    }
                }

                public static final /* synthetic */ void a(BubbleModalDto bubbleModalDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
                    if (yjdVar.F() || bubbleModalDto.a != null) {
                        yjdVar.g(serialDescriptor, 0, w7s.a, bubbleModalDto.a);
                    }
                    if (yjdVar.F() || bubbleModalDto.b != null) {
                        yjdVar.g(serialDescriptor, 1, w7s.a, bubbleModalDto.b);
                    }
                    if (!yjdVar.F() && bubbleModalDto.c == null) {
                        return;
                    }
                    yjdVar.g(serialDescriptor, 2, TransferRequirementExperiment$Card$ServiceSectionDto$BubbleModalButtonDto$$serializer.INSTANCE, bubbleModalDto.c);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BubbleModalDto)) {
                        return false;
                    }
                    BubbleModalDto bubbleModalDto = (BubbleModalDto) obj;
                    return jl40.l(this.a, bubbleModalDto.a) && jl40.l(this.b, bubbleModalDto.b) && jl40.l(this.c, bubbleModalDto.c);
                }

                public final int hashCode() {
                    FormattedText formattedText = this.a;
                    int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
                    FormattedText formattedText2 = this.b;
                    int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
                    BubbleModalButtonDto bubbleModalButtonDto = this.c;
                    return hashCode2 + (bubbleModalButtonDto != null ? bubbleModalButtonDto.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder r = defpackage.n.r("BubbleModalDto(title=", this.a, ", text=", this.b, ", button=");
                    r.append(this.c);
                    r.append(Extension.C_BRAKE);
                    return r.toString();
                }

                public BubbleModalDto() {
                    this.a = null;
                    this.b = null;
                    this.c = null;
                }
            }

            public ServiceSectionDto() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$DatePicker;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class DatePicker {
            public static final c Companion = new c();
            public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(6))};
            public final String a;
            public final FirstSelectableDate b;

            public /* synthetic */ DatePicker(int i, String str, FirstSelectableDate firstSelectableDate) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = firstSelectableDate;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DatePicker)) {
                    return false;
                }
                DatePicker datePicker = (DatePicker) obj;
                return jl40.l(this.a, datePicker.a) && this.b == datePicker.b;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                FirstSelectableDate firstSelectableDate = this.b;
                return hashCode + (firstSelectableDate == null ? 0 : firstSelectableDate.hashCode());
            }

            public final String toString() {
                return "DatePicker(todayString=" + this.a + ", firstDate=" + this.b + Extension.C_BRAKE;
            }

            public DatePicker() {
                this.a = "";
                this.b = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$RulesSectionDto;", "", "Companion", "RulesItem", "$serializer", "com/yandex/go/transfer_requirement/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class RulesSectionDto {
            public static final h Companion = new h();
            public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(8))};
            public final String a;
            public final List b;

            public /* synthetic */ RulesSectionDto(int i, String str, List list) {
                this.a = (i & 1) == 0 ? null : str;
                if ((i & 2) == 0) {
                    this.b = EmptyList.a;
                } else {
                    this.b = list;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RulesSectionDto)) {
                    return false;
                }
                RulesSectionDto rulesSectionDto = (RulesSectionDto) obj;
                return jl40.l(this.a, rulesSectionDto.a) && jl40.l(this.b, rulesSectionDto.b);
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return nnm.h("RulesSectionDto(title=", this.a, ", items=", Extension.C_BRAKE, this.b);
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$RulesSectionDto$RulesItem;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class RulesItem {
                public static final i Companion = new i();
                public final FormattedText a;
                public final String b;

                public /* synthetic */ RulesItem(int i, String str, FormattedText formattedText) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = formattedText;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RulesItem)) {
                        return false;
                    }
                    RulesItem rulesItem = (RulesItem) obj;
                    return jl40.l(this.a, rulesItem.a) && jl40.l(this.b, rulesItem.b);
                }

                public final int hashCode() {
                    FormattedText formattedText = this.a;
                    int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
                    String str = this.b;
                    return hashCode + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    return "RulesItem(text=" + this.a + ", leadIconTag=" + this.b + Extension.C_BRAKE;
                }

                public RulesItem() {
                    this.a = null;
                    this.b = null;
                }
            }

            public RulesSectionDto() {
                this.a = null;
                this.b = EmptyList.a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$MeetingSectionDto;", "", "Companion", "PersonItemDto", "SignItemDto", "$serializer", "com/yandex/go/transfer_requirement/experiment/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class MeetingSectionDto {
            public static final e Companion = new e();
            public final String a;
            public final PersonItemDto b;
            public final SignItemDto c;

            public /* synthetic */ MeetingSectionDto(int i, String str, PersonItemDto personItemDto, SignItemDto signItemDto) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = personItemDto;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = signItemDto;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MeetingSectionDto)) {
                    return false;
                }
                MeetingSectionDto meetingSectionDto = (MeetingSectionDto) obj;
                return jl40.l(this.a, meetingSectionDto.a) && jl40.l(this.b, meetingSectionDto.b) && jl40.l(this.c, meetingSectionDto.c);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                PersonItemDto personItemDto = this.b;
                int hashCode2 = (hashCode + (personItemDto == null ? 0 : personItemDto.hashCode())) * 31;
                SignItemDto signItemDto = this.c;
                return hashCode2 + (signItemDto != null ? signItemDto.hashCode() : 0);
            }

            public final String toString() {
                return "MeetingSectionDto(title=" + this.a + ", personItem=" + this.b + ", signItem=" + this.c + Extension.C_BRAKE;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$MeetingSectionDto$PersonItemDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class PersonItemDto {
                public static final f Companion = new f();
                public final FormattedText a;
                public final String b;
                public final String c;

                public /* synthetic */ PersonItemDto(int i, String str, String str2, FormattedText formattedText) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = formattedText;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = str2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PersonItemDto)) {
                        return false;
                    }
                    PersonItemDto personItemDto = (PersonItemDto) obj;
                    return jl40.l(this.a, personItemDto.a) && jl40.l(this.b, personItemDto.b) && jl40.l(this.c, personItemDto.c);
                }

                public final int hashCode() {
                    FormattedText formattedText = this.a;
                    int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.c;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("PersonItemDto(title=");
                    sb.append(this.a);
                    sb.append(", leadIconTag=");
                    sb.append(this.b);
                    sb.append(", defaultText=");
                    return oyr.t(sb, this.c, Extension.C_BRAKE);
                }

                public PersonItemDto() {
                    this.a = null;
                    this.b = null;
                    this.c = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$MeetingSectionDto$SignItemDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class SignItemDto {
                public static final g Companion = new g();
                public final FormattedText a;
                public final String b;
                public final String c;

                public /* synthetic */ SignItemDto(int i, String str, String str2, FormattedText formattedText) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = formattedText;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = str2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SignItemDto)) {
                        return false;
                    }
                    SignItemDto signItemDto = (SignItemDto) obj;
                    return jl40.l(this.a, signItemDto.a) && jl40.l(this.b, signItemDto.b) && jl40.l(this.c, signItemDto.c);
                }

                public final int hashCode() {
                    FormattedText formattedText = this.a;
                    int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.c;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SignItemDto(title=");
                    sb.append(this.a);
                    sb.append(", leadIconTag=");
                    sb.append(this.b);
                    sb.append(", bubbleText=");
                    return oyr.t(sb, this.c, Extension.C_BRAKE);
                }

                public SignItemDto() {
                    this.a = null;
                    this.b = null;
                    this.c = null;
                }
            }

            public MeetingSectionDto() {
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ActionButtonDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ActionButtonDto {
            public static final a Companion = new a();
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;

            public /* synthetic */ ActionButtonDto(int i, String str, String str2, String str3, String str4, String str5, String str6) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = str4;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = str5;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = str6;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButtonDto)) {
                    return false;
                }
                ActionButtonDto actionButtonDto = (ActionButtonDto) obj;
                return jl40.l(this.a, actionButtonDto.a) && jl40.l(this.b, actionButtonDto.b) && jl40.l(this.c, actionButtonDto.c) && jl40.l(this.d, actionButtonDto.d) && jl40.l(this.e, actionButtonDto.e) && jl40.l(this.f, actionButtonDto.f);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.e;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f;
                return hashCode5 + (str6 != null ? str6.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder v = b64.v("ActionButtonDto(retryText=", this.a, ", validateText=", this.b, ", validateTimeText=");
                g8e.D(v, this.c, ", validateCarriageNumberText=", this.d, ", notRetryableText=");
                return g8e.r(v, this.e, ", confirmText=", this.f, Extension.C_BRAKE);
            }

            public ActionButtonDto() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
            }
        }

        public Card() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$RequirementItemDto;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/experiment/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class RequirementItemDto {
        public static final r Companion = new r();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ RequirementItemDto(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequirementItemDto)) {
                return false;
            }
            RequirementItemDto requirementItemDto = (RequirementItemDto) obj;
            return jl40.l(this.a, requirementItemDto.a) && jl40.l(this.b, requirementItemDto.b) && jl40.l(this.c, requirementItemDto.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(b64.v("RequirementItemDto(title=", this.a, ", subtitle=", this.b, ", leadIconTag="), this.c, Extension.C_BRAKE);
        }

        public RequirementItemDto() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public TransferRequirementExperiment() {
        this(0);
    }

    public TransferRequirementExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
