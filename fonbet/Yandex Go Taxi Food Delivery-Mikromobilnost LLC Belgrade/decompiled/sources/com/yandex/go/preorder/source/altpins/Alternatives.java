package com.yandex.go.preorder.source.altpins;

import com.yandex.go.address.models.Address;
import com.yandex.go.multitariff.OrderButton;
import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ia1;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly1;
import defpackage.ly3;
import defpackage.n7v;
import defpackage.nnm;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.rf00;
import defpackage.ro1;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.Orientation;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:.\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives;", "", "Companion", "com/yandex/go/preorder/source/altpins/b", "TariffSelectorOptionDto", "CreateYandexCardOptionDto", "MarketplaceOptionDto", "AltPaymentMethodOptionDto", "AlternativePaymentMethod", "DeeplinkOptionDto", "ComboOptionDto", "AltpinAOptionDto", "AltpinBOptionDto", "MultimodalOptionDto", "MultimodalPointsDto", "PlusPromoOptionDto", "MulticlassOptionDto", "RequirementOptionDto", "PlusSubscriptionOptionDto", "PlusDummySubscriptionOptionDto", "CommonOptionLegacyDto", "RouteStatsMulticlassDetails", "ListItem", "DeliveryIntervalListItem", "Badge", "Redirect", "TariffBubbleOption", "Walk", "MassTransit", "Preorder", "MassTransitCard", "MassTransitOrderButton", "PinCard", "ConfirmationScreen", "MulticlassRequirementSupportedDto", "OptionTypeLegacy", "com/yandex/go/preorder/source/altpins/f1", "my1", "PinStateDto", "com/yandex/go/preorder/source/altpins/q0", "jy1", "com/yandex/go/preorder/source/altpins/l0", "PinIconAnnotationTypes", "PinIconActionDto", "PinIconActionKindDto", "PointDto", "com/yandex/go/preorder/source/altpins/c", "$serializer", "com/yandex/go/preorder/source/altpins/k", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Alternatives {
    public static final k Companion = new k();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(3)), null};
    public final List a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$OptionTypeLegacy;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/go/preorder/source/altpins/f0", "UNKNOWN", "MULTICLASS", "ALTPIN_B", "ANTISURGE", "PLUS_PROMO", "MULTIMODAL", "COMBO_INNER", "COMBO_OUTER", "PERFECT_CHAIN", "REQUIREMENT_OPTION", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class OptionTypeLegacy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OptionTypeLegacy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final OptionTypeLegacy ALTPIN_B;
        public static final OptionTypeLegacy ANTISURGE;
        public static final OptionTypeLegacy COMBO_INNER;
        public static final OptionTypeLegacy COMBO_OUTER;
        public static final f0 Companion;
        public static final OptionTypeLegacy MULTICLASS;
        public static final OptionTypeLegacy MULTIMODAL;
        public static final OptionTypeLegacy PERFECT_CHAIN;
        public static final OptionTypeLegacy PLUS_PROMO;
        public static final OptionTypeLegacy REQUIREMENT_OPTION;
        public static final OptionTypeLegacy UNKNOWN;
        private final String value;

        static {
            OptionTypeLegacy optionTypeLegacy = new OptionTypeLegacy("UNKNOWN", 0, "");
            UNKNOWN = optionTypeLegacy;
            OptionTypeLegacy optionTypeLegacy2 = new OptionTypeLegacy("MULTICLASS", 1, "multiclass");
            MULTICLASS = optionTypeLegacy2;
            OptionTypeLegacy optionTypeLegacy3 = new OptionTypeLegacy("ALTPIN_B", 2, "altpin_b");
            ALTPIN_B = optionTypeLegacy3;
            OptionTypeLegacy optionTypeLegacy4 = new OptionTypeLegacy("ANTISURGE", 3, "explicit_antisurge");
            ANTISURGE = optionTypeLegacy4;
            OptionTypeLegacy optionTypeLegacy5 = new OptionTypeLegacy("PLUS_PROMO", 4, "plus_promo");
            PLUS_PROMO = optionTypeLegacy5;
            OptionTypeLegacy optionTypeLegacy6 = new OptionTypeLegacy("MULTIMODAL", 5, "multimodal");
            MULTIMODAL = optionTypeLegacy6;
            OptionTypeLegacy optionTypeLegacy7 = new OptionTypeLegacy("COMBO_INNER", 6, "combo_inner");
            COMBO_INNER = optionTypeLegacy7;
            OptionTypeLegacy optionTypeLegacy8 = new OptionTypeLegacy("COMBO_OUTER", 7, "combo_outer");
            COMBO_OUTER = optionTypeLegacy8;
            OptionTypeLegacy optionTypeLegacy9 = new OptionTypeLegacy("PERFECT_CHAIN", 8, "perfect_chain");
            PERFECT_CHAIN = optionTypeLegacy9;
            OptionTypeLegacy optionTypeLegacy10 = new OptionTypeLegacy("REQUIREMENT_OPTION", 9, "requirement_option");
            REQUIREMENT_OPTION = optionTypeLegacy10;
            OptionTypeLegacy[] optionTypeLegacyArr = {optionTypeLegacy, optionTypeLegacy2, optionTypeLegacy3, optionTypeLegacy4, optionTypeLegacy5, optionTypeLegacy6, optionTypeLegacy7, optionTypeLegacy8, optionTypeLegacy9, optionTypeLegacy10};
            $VALUES = optionTypeLegacyArr;
            $ENTRIES = kotlin.enums.a.a(optionTypeLegacyArr);
            Companion = new f0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(18));
        }

        public OptionTypeLegacy(String str, int i, String str2) {
            this.value = str2;
        }

        public static OptionTypeLegacy valueOf(String str) {
            return (OptionTypeLegacy) Enum.valueOf(OptionTypeLegacy.class, str);
        }

        public static OptionTypeLegacy[] values() {
            return (OptionTypeLegacy[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PinCard;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/g0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class PinCard {
        public static final g0 Companion = new g0();
        public String a = null;
        public String b = null;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinCard)) {
                return false;
            }
            PinCard pinCard = (PinCard) obj;
            return jl40.l(this.a, pinCard.a) && jl40.l(this.b, pinCard.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("PinCard(priceDelta=", this.a, ", description=", this.b, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PinIconActionKindDto;", "", "Companion", "com/yandex/go/preorder/source/altpins/i0", "ADDRESS_CHANGE", "OPEN_SCOOTERS", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class PinIconActionKindDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PinIconActionKindDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PinIconActionKindDto ADDRESS_CHANGE;
        public static final i0 Companion;
        public static final PinIconActionKindDto OPEN_SCOOTERS;

        static {
            PinIconActionKindDto pinIconActionKindDto = new PinIconActionKindDto("ADDRESS_CHANGE", 0);
            ADDRESS_CHANGE = pinIconActionKindDto;
            PinIconActionKindDto pinIconActionKindDto2 = new PinIconActionKindDto("OPEN_SCOOTERS", 1);
            OPEN_SCOOTERS = pinIconActionKindDto2;
            PinIconActionKindDto[] pinIconActionKindDtoArr = {pinIconActionKindDto, pinIconActionKindDto2};
            $VALUES = pinIconActionKindDtoArr;
            $ENTRIES = kotlin.enums.a.a(pinIconActionKindDtoArr);
            Companion = new i0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(20));
        }

        public static PinIconActionKindDto valueOf(String str) {
            return (PinIconActionKindDto) Enum.valueOf(PinIconActionKindDto.class, str);
        }

        public static PinIconActionKindDto[] values() {
            return (PinIconActionKindDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PinIconAnnotationTypes;", "", "Companion", "com/yandex/go/preorder/source/altpins/m0", "TOP_LEADING", "UNKNOWN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class PinIconAnnotationTypes {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PinIconAnnotationTypes[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final m0 Companion;
        public static final PinIconAnnotationTypes TOP_LEADING;
        public static final PinIconAnnotationTypes UNKNOWN;

        static {
            PinIconAnnotationTypes pinIconAnnotationTypes = new PinIconAnnotationTypes("TOP_LEADING", 0);
            TOP_LEADING = pinIconAnnotationTypes;
            PinIconAnnotationTypes pinIconAnnotationTypes2 = new PinIconAnnotationTypes("UNKNOWN", 1);
            UNKNOWN = pinIconAnnotationTypes2;
            PinIconAnnotationTypes[] pinIconAnnotationTypesArr = {pinIconAnnotationTypes, pinIconAnnotationTypes2};
            $VALUES = pinIconAnnotationTypesArr;
            $ENTRIES = kotlin.enums.a.a(pinIconAnnotationTypesArr);
            Companion = new m0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(25));
        }

        public static PinIconAnnotationTypes valueOf(String str) {
            return (PinIconAnnotationTypes) Enum.valueOf(PinIconAnnotationTypes.class, str);
        }

        public static PinIconAnnotationTypes[] values() {
            return (PinIconAnnotationTypes[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Alternatives(int i, List list, String str) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final MulticlassOptionDto a() {
        Object obj;
        Object obj2;
        List list = this.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b) obj) instanceof MulticlassOptionDto) {
                break;
            }
        }
        MulticlassOptionDto multiclassOptionDto = obj instanceof MulticlassOptionDto ? (MulticlassOptionDto) obj : null;
        if (multiclassOptionDto != null) {
            return multiclassOptionDto;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof CommonOptionLegacyDto) {
                arrayList.add(obj3);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((CommonOptionLegacyDto) obj2).a == OptionTypeLegacy.MULTICLASS) {
                break;
            }
        }
        CommonOptionLegacyDto commonOptionLegacyDto = (CommonOptionLegacyDto) obj2;
        if (commonOptionLegacyDto != null) {
            return a.c(commonOptionLegacyDto);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alternatives)) {
            return false;
        }
        Alternatives alternatives = (Alternatives) obj;
        return jl40.l(this.a, alternatives.a) && jl40.l(this.b, alternatives.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.i("Alternatives(options=", ", originalDescription=", this.b, Extension.C_BRAKE, this.a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen;", "", "Companion", "Modal", "ComparisonBlock", "Buttons", PlusPayUiKitInflaterFactory.NAME_BUTTON, "Action", "ActionType", "Accessibility", "$serializer", "com/yandex/go/preorder/source/altpins/q", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ConfirmationScreen {
        public static final q Companion = new q();
        public final String a;
        public final rf00 b;
        public final rf00 c;
        public final Modal d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$ActionType;", "", "Companion", "com/yandex/go/preorder/source/altpins/n", "UNKNOWN", "CONFIRM", "CLOSE", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes12.dex */
        public static final class ActionType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ActionType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final ActionType CLOSE;
            public static final ActionType CONFIRM;
            public static final n Companion;
            public static final ActionType UNKNOWN;

            static {
                ActionType actionType = new ActionType("UNKNOWN", 0);
                UNKNOWN = actionType;
                ActionType actionType2 = new ActionType("CONFIRM", 1);
                CONFIRM = actionType2;
                ActionType actionType3 = new ActionType("CLOSE", 2);
                CLOSE = actionType3;
                ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
                $VALUES = actionTypeArr;
                $ENTRIES = kotlin.enums.a.a(actionTypeArr);
                Companion = new n();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(15));
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ ConfirmationScreen(int i, String str, rf00 rf00Var, rf00 rf00Var2, Modal modal) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = new rf00(0);
            } else {
                this.b = rf00Var;
            }
            if ((i & 4) == 0) {
                this.c = new rf00(0);
            } else {
                this.c = rf00Var2;
            }
            if ((i & 8) == 0) {
                this.d = new Modal(0);
            } else {
                this.d = modal;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$Action;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/m", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Action {
            public static final m Companion = new m();
            public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(14))};
            public final ActionType a;

            public /* synthetic */ Action(int i, ActionType actionType) {
                if ((i & 1) == 0) {
                    this.a = ActionType.UNKNOWN;
                } else {
                    this.a = actionType;
                }
            }

            public Action() {
                this(0);
            }

            public Action(int i) {
                this.a = ActionType.UNKNOWN;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$Buttons;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/p", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Buttons {
            public static final p Companion = new p();
            public static final i3y[] c;
            public final Orientation a;
            public final List b;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ro1(16)), kotlin.a.b(lazyThreadSafetyMode, new ro1(17))};
            }

            public /* synthetic */ Buttons(int i, Orientation orientation, List list) {
                this.a = (i & 1) == 0 ? Orientation.VERTICAL : orientation;
                if ((i & 2) == 0) {
                    this.b = EmptyList.a;
                } else {
                    this.b = list;
                }
            }

            public Buttons() {
                this(0);
            }

            public Buttons(int i) {
                this.a = Orientation.VERTICAL;
                this.b = EmptyList.a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$Accessibility;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/l", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Accessibility {
            public static final l Companion = new l();
            public final String a;
            public final String b;

            public /* synthetic */ Accessibility(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
            }

            public Accessibility(int i) {
                this.a = "";
                this.b = "";
            }

            public Accessibility() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$Modal;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/s", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Modal {
            public static final s Companion = new s();
            public final Buttons a;
            public final ComparisonBlock b;

            public /* synthetic */ Modal(int i, Buttons buttons, ComparisonBlock comparisonBlock) {
                this.a = (i & 1) == 0 ? new Buttons(0) : buttons;
                if ((i & 2) == 0) {
                    this.b = new ComparisonBlock(0);
                } else {
                    this.b = comparisonBlock;
                }
            }

            public Modal() {
                this(0);
            }

            public Modal(int i) {
                Buttons buttons = new Buttons(0);
                ComparisonBlock comparisonBlock = new ComparisonBlock(0);
                this.a = buttons;
                this.b = comparisonBlock;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$Button;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/o", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Button {
            public static final o Companion = new o();
            public final String a;
            public final String b;
            public final String c;
            public final Action d;

            public /* synthetic */ Button(int i, String str, String str2, String str3, Action action) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = "";
                } else {
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    this.d = new Action(0);
                } else {
                    this.d = action;
                }
            }

            public Button() {
                Action action = new Action(0);
                this.a = "";
                this.b = "";
                this.c = "";
                this.d = action;
            }
        }

        public ConfirmationScreen() {
            rf00 rf00Var = new rf00(0);
            rf00 rf00Var2 = new rf00(0);
            Modal modal = new Modal(0);
            this.a = null;
            this.b = rf00Var;
            this.c = rf00Var2;
            this.d = modal;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ConfirmationScreen$ComparisonBlock;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/r", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ComparisonBlock {
            public static final r Companion = new r();
            public final String a;
            public final String b;
            public final FormattedText c;
            public final String d;
            public final FormattedText e;
            public final Accessibility f;

            public /* synthetic */ ComparisonBlock(int i, String str, String str2, FormattedText formattedText, String str3, FormattedText formattedText2, Accessibility accessibility) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
                int i2 = 0;
                if ((i & 4) == 0) {
                    this.c = new FormattedText(i2);
                } else {
                    this.c = formattedText;
                }
                if ((i & 8) == 0) {
                    this.d = "";
                } else {
                    this.d = str3;
                }
                if ((i & 16) == 0) {
                    this.e = new FormattedText(i2);
                } else {
                    this.e = formattedText2;
                }
                if ((i & 32) == 0) {
                    this.f = new Accessibility(0);
                } else {
                    this.f = accessibility;
                }
            }

            public ComparisonBlock() {
                this(0);
            }

            public ComparisonBlock(int i) {
                int i2 = 0;
                FormattedText formattedText = new FormattedText(i2);
                FormattedText formattedText2 = new FormattedText(i2);
                Accessibility accessibility = new Accessibility(0);
                this.a = "";
                this.b = "";
                this.c = formattedText;
                this.d = "";
                this.e = formattedText2;
                this.f = accessibility;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MulticlassRequirementSupportedDto;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/c0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MulticlassRequirementSupportedDto {
        public static final c0 Companion = new c0();
        public final Boolean a;

        public /* synthetic */ MulticlassRequirementSupportedDto(Boolean bool, int i) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
        }

        public MulticlassRequirementSupportedDto() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PinIconActionDto;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/h0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class PinIconActionDto {
        public static final h0 Companion = new h0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(19))};
        public final PinIconActionKindDto a;

        public /* synthetic */ PinIconActionDto(int i, PinIconActionKindDto pinIconActionKindDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = pinIconActionKindDto;
            }
        }

        public PinIconActionDto() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$AlternativePaymentMethod;", "", "Companion", "com/yandex/go/preorder/source/altpins/e", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class AlternativePaymentMethod {
        public static final e Companion = new e();
        public static final AlternativePaymentMethod c = new AlternativePaymentMethod(0);
        public final String a;
        public final String b;

        public /* synthetic */ AlternativePaymentMethod(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlternativePaymentMethod)) {
                return false;
            }
            AlternativePaymentMethod alternativePaymentMethod = (AlternativePaymentMethod) obj;
            return jl40.l(this.a, alternativePaymentMethod.a) && jl40.l(this.b, alternativePaymentMethod.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return unr0.p("AlternativePaymentMethod(type=", this.a, ", paymentMethodId=", this.b, Extension.C_BRAKE);
        }

        public AlternativePaymentMethod(int i) {
            this.a = "";
            this.b = null;
        }

        public AlternativePaymentMethod() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$Preorder;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/w0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Preorder {
        public static final w0 Companion = new w0();
        public final Calendar a;
        public final String b;

        public /* synthetic */ Preorder(int i, Calendar calendar, String str) {
            this.a = (i & 1) == 0 ? null : calendar;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Preorder)) {
                return false;
            }
            Preorder preorder = (Preorder) obj;
            return jl40.l(this.a, preorder.a) && jl40.l(this.b, preorder.b);
        }

        public final int hashCode() {
            Calendar calendar = this.a;
            return this.b.hashCode() + ((calendar == null ? 0 : calendar.hashCode()) * 31);
        }

        public final String toString() {
            return "Preorder(due=" + this.a + ", id=" + this.b + Extension.C_BRAKE;
        }

        public Preorder() {
            this.a = null;
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$TariffBubbleOption;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/h1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class TariffBubbleOption {
        public static final h1 Companion = new h1();
        public final n7v a;
        public final String b;

        public /* synthetic */ TariffBubbleOption(int i, n7v n7vVar, String str) {
            this.a = (i & 1) == 0 ? null : n7vVar;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final n7v getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffBubbleOption)) {
                return false;
            }
            TariffBubbleOption tariffBubbleOption = (TariffBubbleOption) obj;
            return jl40.l(this.a, tariffBubbleOption.a) && jl40.l(this.b, tariffBubbleOption.b);
        }

        public final int hashCode() {
            n7v n7vVar = this.a;
            return this.b.hashCode() + ((n7vVar == null ? 0 : n7vVar.hashCode()) * 31);
        }

        public final String toString() {
            return "TariffBubbleOption(icon=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
        }

        public TariffBubbleOption() {
            this.a = null;
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MultimodalPointsDto;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/e0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class MultimodalPointsDto {
        public static final e0 Companion = new e0();
        public final zzs a;
        public final zzs b;

        public /* synthetic */ MultimodalPointsDto(int i, zzs zzsVar, zzs zzsVar2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = zzsVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = zzsVar2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final zzs getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final zzs getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultimodalPointsDto)) {
                return false;
            }
            MultimodalPointsDto multimodalPointsDto = (MultimodalPointsDto) obj;
            return jl40.l(this.a, multimodalPointsDto.a) && jl40.l(this.b, multimodalPointsDto.b);
        }

        public final int hashCode() {
            zzs zzsVar = this.a;
            int hashCode = (zzsVar == null ? 0 : zzsVar.hashCode()) * 31;
            zzs zzsVar2 = this.b;
            return hashCode + (zzsVar2 != null ? zzsVar2.hashCode() : 0);
        }

        public final String toString() {
            return "MultimodalPointsDto(pickupPoint=" + this.a + ", dropoffPoint=" + this.b + Extension.C_BRAKE;
        }

        public MultimodalPointsDto() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$Walk;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/j1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Walk {
        public static final j1 Companion = new j1();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(4)), null};
        public final List a;
        public final String b;

        public /* synthetic */ Walk(int i, List list, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final List getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Walk)) {
                return false;
            }
            Walk walk = (Walk) obj;
            return jl40.l(this.a, walk.a) && jl40.l(this.b, walk.b);
        }

        public final int hashCode() {
            List list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return xvz.i("Walk(route=", ", walkTime=", this.b, Extension.C_BRAKE, this.a);
        }

        public Walk() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MassTransitCard;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/z", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class MassTransitCard {
        public static final z Companion = new z();
        public final String a;
        public final String b;

        public /* synthetic */ MassTransitCard(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MassTransitCard)) {
                return false;
            }
            MassTransitCard massTransitCard = (MassTransitCard) obj;
            return jl40.l(this.a, massTransitCard.a) && jl40.l(this.b, massTransitCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("MassTransitCard(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
        }

        public MassTransitCard() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PointDto;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/v0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class PointDto {
        public static final v0 Companion = new v0();
        public final double a;
        public final double b;

        public /* synthetic */ PointDto(double d, double d2, int i) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointDto)) {
                return false;
            }
            PointDto pointDto = (PointDto) obj;
            return Double.compare(this.a, pointDto.a) == 0 && Double.compare(this.b, pointDto.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            return nzs.c(oyr.u(this.a, "PointDto(lat=", ", lon="), this.b, Extension.C_BRAKE);
        }

        public PointDto() {
            this.a = 0.0d;
            this.b = 0.0d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$Redirect;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/x0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Redirect {
        public static final x0 Companion = new x0();
        public final String a;
        public final String b;

        public /* synthetic */ Redirect(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return jl40.l(this.a, redirect.a) && jl40.l(this.b, redirect.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Redirect(tariffClass=", this.a, ", optionSelectionKey=", this.b, Extension.C_BRAKE);
        }

        public Redirect() {
            this.a = "";
            this.b = "";
        }
    }

    public Alternatives(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public Alternatives() {
        this(EmptyList.a, "");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MassTransitOrderButton;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/a0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class MassTransitOrderButton {
        public static final a0 Companion = new a0();
        public final Calendar a;
        public final String b;
        public final String c;

        public /* synthetic */ MassTransitOrderButton(int i, Calendar calendar, String str, String str2) {
            this.a = (i & 1) == 0 ? null : calendar;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MassTransitOrderButton)) {
                return false;
            }
            MassTransitOrderButton massTransitOrderButton = (MassTransitOrderButton) obj;
            return jl40.l(this.a, massTransitOrderButton.a) && jl40.l(this.b, massTransitOrderButton.b) && jl40.l(this.c, massTransitOrderButton.c);
        }

        public final int hashCode() {
            Calendar calendar = this.a;
            return this.c.hashCode() + unr0.b((calendar == null ? 0 : calendar.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MassTransitOrderButton(due=");
            sb.append(this.a);
            sb.append(", untilDueButtonText=");
            sb.append(this.b);
            sb.append(", onDueButtonText=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public MassTransitOrderButton() {
            this.a = null;
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$Badge;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/h", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Badge {
        public static final h Companion = new h();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ Badge(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return jl40.l(this.a, badge.a) && jl40.l(this.b, badge.b) && jl40.l(this.c, badge.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("Badge(backgroundColor=", this.a, ", textColor=", this.b, ", text="), this.c, Extension.C_BRAKE);
        }

        public Badge() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$DeeplinkOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/u", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DeeplinkOptionDto extends b {
        public static final u Companion = new u();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(12)), null};
        public final String a;
        public final List b;
        public final String c;

        public DeeplinkOptionDto(int i, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
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
            if (!(obj instanceof DeeplinkOptionDto)) {
                return false;
            }
            DeeplinkOptionDto deeplinkOptionDto = (DeeplinkOptionDto) obj;
            return jl40.l(this.a, deeplinkOptionDto.a) && jl40.l(this.b, deeplinkOptionDto.b) && jl40.l(this.c, deeplinkOptionDto.c);
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return c + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return oyr.t(xvz.r("DeeplinkOptionDto(type=", this.a, ", serviceLevels=", this.b, ", deeplink="), this.c, Extension.C_BRAKE);
        }

        public DeeplinkOptionDto() {
            this.a = "";
            this.b = EmptyList.a;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MarketplaceOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/x", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MarketplaceOptionDto extends b {
        public static final x Companion = new x();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(13))};
        public final String a;
        public final Selector b;
        public final List c;

        public MarketplaceOptionDto(int i, String str, Selector selector, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = selector;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceOptionDto)) {
                return false;
            }
            MarketplaceOptionDto marketplaceOptionDto = (MarketplaceOptionDto) obj;
            return jl40.l(this.a, marketplaceOptionDto.a) && jl40.l(this.b, marketplaceOptionDto.b) && jl40.l(this.c, marketplaceOptionDto.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Selector selector = this.b;
            return this.c.hashCode() + ((hashCode + (selector == null ? 0 : selector.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketplaceOptionDto(type=");
            sb.append(this.a);
            sb.append(", selector=");
            sb.append(this.b);
            sb.append(", serviceLevels=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        public MarketplaceOptionDto() {
            this.a = "";
            this.b = null;
            this.c = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PlusDummySubscriptionOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/s0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PlusDummySubscriptionOptionDto extends b {
        public static final s0 Companion = new s0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(18))};
        public final String a;
        public final String b;
        public final List c;

        public PlusDummySubscriptionOptionDto(int i, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlusDummySubscriptionOptionDto)) {
                return false;
            }
            PlusDummySubscriptionOptionDto plusDummySubscriptionOptionDto = (PlusDummySubscriptionOptionDto) obj;
            return jl40.l(this.a, plusDummySubscriptionOptionDto.a) && jl40.l(this.b, plusDummySubscriptionOptionDto.b) && jl40.l(this.c, plusDummySubscriptionOptionDto.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return ly3.s(b64.v("PlusDummySubscriptionOptionDto(type=", this.a, ", offer=", this.b, ", serviceLevels="), this.c, Extension.C_BRAKE);
        }

        public PlusDummySubscriptionOptionDto() {
            this.a = "";
            this.b = null;
            this.c = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PlusSubscriptionOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/u0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PlusSubscriptionOptionDto extends b {
        public static final u0 Companion = new u0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(20))};
        public final String a;
        public final String b;
        public final List c;

        public PlusSubscriptionOptionDto(int i, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlusSubscriptionOptionDto)) {
                return false;
            }
            PlusSubscriptionOptionDto plusSubscriptionOptionDto = (PlusSubscriptionOptionDto) obj;
            return jl40.l(this.a, plusSubscriptionOptionDto.a) && jl40.l(this.b, plusSubscriptionOptionDto.b) && jl40.l(this.c, plusSubscriptionOptionDto.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return ly3.s(b64.v("PlusSubscriptionOptionDto(type=", this.a, ", offer=", this.b, ", serviceLevels="), this.c, Extension.C_BRAKE);
        }

        public PlusSubscriptionOptionDto() {
            this.a = "";
            this.b = null;
            this.c = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$CreateYandexCardOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/t", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CreateYandexCardOptionDto extends b {
        public static final t Companion = new t();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(11)), null, null};
        public final String a;
        public final List b;
        public final String c;
        public final int d;

        public CreateYandexCardOptionDto(int i, int i2, String str, String str2, List list) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateYandexCardOptionDto)) {
                return false;
            }
            CreateYandexCardOptionDto createYandexCardOptionDto = (CreateYandexCardOptionDto) obj;
            return jl40.l(this.a, createYandexCardOptionDto.a) && jl40.l(this.b, createYandexCardOptionDto.b) && jl40.l(this.c, createYandexCardOptionDto.c) && this.d == createYandexCardOptionDto.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder r = xvz.r("CreateYandexCardOptionDto(type=", this.a, ", serviceLevels=", this.b, ", time=");
            r.append(this.c);
            r.append(", timeInSeconds=");
            r.append(this.d);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public CreateYandexCardOptionDto() {
            this.a = "";
            this.b = EmptyList.a;
            this.c = "";
            this.d = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MassTransit;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/y", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class MassTransit {
        public static final y Companion = new y();
        public final String a;
        public final String b;
        public final String c;
        public final Preorder d;
        public final MassTransitOrderButton e;

        public /* synthetic */ MassTransit(int i, String str, String str2, String str3, Preorder preorder, MassTransitOrderButton massTransitOrderButton) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = preorder;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = massTransitOrderButton;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MassTransit)) {
                return false;
            }
            MassTransit massTransit = (MassTransit) obj;
            return jl40.l(this.a, massTransit.a) && jl40.l(this.b, massTransit.b) && jl40.l(this.c, massTransit.c) && jl40.l(this.d, massTransit.d) && jl40.l(this.e, massTransit.e);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            Preorder preorder = this.d;
            int hashCode = (b + (preorder == null ? 0 : preorder.hashCode())) * 31;
            MassTransitOrderButton massTransitOrderButton = this.e;
            return hashCode + (massTransitOrderButton != null ? massTransitOrderButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("MassTransit(stopName=", this.a, ", exitName=", this.b, ", uri=");
            v.append(this.c);
            v.append(", preorder=");
            v.append(this.d);
            v.append(", massTransitOrderButton=");
            v.append(this.e);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public MassTransit() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$AltpinAOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/f", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AltpinAOptionDto extends b {
        public static final f Companion = new f();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(5)), null, null, null};
        public final String a;
        public final List b;
        public final Address c;
        public final String d;
        public final int e;

        public AltpinAOptionDto(int i, String str, List list, Address address, String str2, int i2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = address;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltpinAOptionDto)) {
                return false;
            }
            AltpinAOptionDto altpinAOptionDto = (AltpinAOptionDto) obj;
            return jl40.l(this.a, altpinAOptionDto.a) && jl40.l(this.b, altpinAOptionDto.b) && jl40.l(this.c, altpinAOptionDto.c) && jl40.l(this.d, altpinAOptionDto.d) && this.e == altpinAOptionDto.e;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            Address address = this.c;
            return Integer.hashCode(this.e) + unr0.b((c + (address == null ? 0 : address.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder r = xvz.r("AltpinAOptionDto(type=", this.a, ", serviceLevels=", this.b, ", address=");
            r.append(this.c);
            r.append(", time=");
            r.append(this.d);
            r.append(", timeInSeconds=");
            return oyr.m(this.e, Extension.C_BRAKE, r);
        }

        public AltpinAOptionDto() {
            this.a = "";
            this.b = EmptyList.a;
            this.c = null;
            this.d = "";
            this.e = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ComboOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/i", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ComboOptionDto extends b {
        public static final i Companion = new i();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(7)), null, null, null};
        public final String a;
        public final List b;
        public final Selector c;
        public final String d;
        public final int e;

        public ComboOptionDto(int i, String str, List list, Selector selector, String str2, int i2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = selector;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComboOptionDto)) {
                return false;
            }
            ComboOptionDto comboOptionDto = (ComboOptionDto) obj;
            return jl40.l(this.a, comboOptionDto.a) && jl40.l(this.b, comboOptionDto.b) && jl40.l(this.c, comboOptionDto.c) && jl40.l(this.d, comboOptionDto.d) && this.e == comboOptionDto.e;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            Selector selector = this.c;
            return Integer.hashCode(this.e) + unr0.b((c + (selector == null ? 0 : selector.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder r = xvz.r("ComboOptionDto(type=", this.a, ", serviceLevels=", this.b, ", selector=");
            r.append(this.c);
            r.append(", time=");
            r.append(this.d);
            r.append(", timeInSeconds=");
            return oyr.m(this.e, Extension.C_BRAKE, r);
        }

        public ComboOptionDto(String str, List list, Selector selector, String str2, int i) {
            this.a = str;
            this.b = list;
            this.c = selector;
            this.d = str2;
            this.e = i;
        }

        public ComboOptionDto() {
            this("", EmptyList.a, null, "", 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PlusPromoOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/t0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PlusPromoOptionDto extends b {
        public static final t0 Companion = new t0();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(19)), null, null, null};
        public final String a;
        public final List b;
        public final String c;
        public final String d;
        public final int e;

        public PlusPromoOptionDto(int i, int i2, String str, String str2, String str3, List list) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlusPromoOptionDto)) {
                return false;
            }
            PlusPromoOptionDto plusPromoOptionDto = (PlusPromoOptionDto) obj;
            return jl40.l(this.a, plusPromoOptionDto.a) && jl40.l(this.b, plusPromoOptionDto.b) && jl40.l(this.c, plusPromoOptionDto.c) && jl40.l(this.d, plusPromoOptionDto.d) && this.e == plusPromoOptionDto.e;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Integer.hashCode(this.e) + unr0.b((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder r = xvz.r("PlusPromoOptionDto(type=", this.a, ", serviceLevels=", this.b, ", plusPromoWithdrawAmount=");
            g8e.D(r, this.c, ", time=", this.d, ", timeInSeconds=");
            return oyr.m(this.e, Extension.C_BRAKE, r);
        }

        public PlusPromoOptionDto(String str, int i, String str2, String str3, List list) {
            this.a = str;
            this.b = list;
            this.c = str2;
            this.d = str3;
            this.e = i;
        }

        public PlusPromoOptionDto() {
            this("", 0, null, "", EmptyList.a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$TariffSelectorOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/i1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TariffSelectorOptionDto extends b {
        public static final i1 Companion = new i1();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(22)), null, null, null};
        public final String a;
        public final List b;
        public final Selector c;
        public final String d;
        public final int e;

        public TariffSelectorOptionDto(int i, String str, List list, Selector selector, String str2, int i2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = selector;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffSelectorOptionDto)) {
                return false;
            }
            TariffSelectorOptionDto tariffSelectorOptionDto = (TariffSelectorOptionDto) obj;
            return jl40.l(this.a, tariffSelectorOptionDto.a) && jl40.l(this.b, tariffSelectorOptionDto.b) && jl40.l(this.c, tariffSelectorOptionDto.c) && jl40.l(this.d, tariffSelectorOptionDto.d) && this.e == tariffSelectorOptionDto.e;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            Selector selector = this.c;
            return Integer.hashCode(this.e) + unr0.b((c + (selector == null ? 0 : selector.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder r = xvz.r("TariffSelectorOptionDto(type=", this.a, ", serviceLevels=", this.b, ", selector=");
            r.append(this.c);
            r.append(", time=");
            r.append(this.d);
            r.append(", timeInSeconds=");
            return oyr.m(this.e, Extension.C_BRAKE, r);
        }

        public TariffSelectorOptionDto(String str, List list, Selector selector, String str2, int i) {
            this.a = str;
            this.b = list;
            this.c = selector;
            this.d = str2;
            this.e = i;
        }

        public TariffSelectorOptionDto() {
            this("", EmptyList.a, null, "", 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$RouteStatsMulticlassDetails;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/g1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class RouteStatsMulticlassDetails {
        public static final g1 Companion = new g1();
        public final String a;
        public final PriceMeta b;
        public final com.yandex.go.zone.dto.response.c c;
        public final SearchScreen d;
        public final String e;
        public final OrderButton f;

        public /* synthetic */ RouteStatsMulticlassDetails(int i, String str, PriceMeta priceMeta, com.yandex.go.zone.dto.response.c cVar, SearchScreen searchScreen, String str2, OrderButton orderButton) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = priceMeta;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = cVar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = searchScreen;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = OrderButton.c;
            } else {
                this.f = orderButton;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteStatsMulticlassDetails)) {
                return false;
            }
            RouteStatsMulticlassDetails routeStatsMulticlassDetails = (RouteStatsMulticlassDetails) obj;
            return jl40.l(this.a, routeStatsMulticlassDetails.a) && jl40.l(this.b, routeStatsMulticlassDetails.b) && jl40.l(this.c, routeStatsMulticlassDetails.c) && jl40.l(this.d, routeStatsMulticlassDetails.d) && jl40.l(this.e, routeStatsMulticlassDetails.e) && jl40.l(this.f, routeStatsMulticlassDetails.f);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            PriceMeta priceMeta = this.b;
            int hashCode2 = (hashCode + (priceMeta == null ? 0 : priceMeta.hashCode())) * 31;
            com.yandex.go.zone.dto.response.c cVar = this.c;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            SearchScreen searchScreen = this.d;
            return this.f.hashCode() + unr0.b((hashCode3 + (searchScreen != null ? searchScreen.hashCode() : 0)) * 31, 31, this.e);
        }

        public final String toString() {
            return "RouteStatsMulticlassDetails(price=" + this.a + ", priceMeta=" + this.b + ", estimatedWaitingDto=" + this.c + ", searchScreen=" + this.d + ", description=" + this.e + ", orderButton=" + this.f + Extension.C_BRAKE;
        }

        public RouteStatsMulticlassDetails() {
            this(0);
        }

        public RouteStatsMulticlassDetails(String str, PriceMeta priceMeta, com.yandex.go.zone.dto.response.c cVar, SearchScreen searchScreen, String str2, OrderButton orderButton) {
            this.a = str;
            this.b = priceMeta;
            this.c = cVar;
            this.d = searchScreen;
            this.e = str2;
            this.f = orderButton;
        }

        public /* synthetic */ RouteStatsMulticlassDetails(int i) {
            this("", null, null, null, "", OrderButton.c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$AltPaymentMethodOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/d", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AltPaymentMethodOptionDto extends b {
        public static final d Companion = new d();
        public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(4)), null, null, null, null};
        public final String a;
        public final List b;
        public final AlternativePaymentMethod c;
        public final String d;
        public final String e;
        public final int f;

        public AltPaymentMethodOptionDto(int i, String str, List list, AlternativePaymentMethod alternativePaymentMethod, String str2, String str3, int i2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                AlternativePaymentMethod.Companion.getClass();
                this.c = AlternativePaymentMethod.c;
            } else {
                this.c = alternativePaymentMethod;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = 0;
            } else {
                this.f = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltPaymentMethodOptionDto)) {
                return false;
            }
            AltPaymentMethodOptionDto altPaymentMethodOptionDto = (AltPaymentMethodOptionDto) obj;
            return jl40.l(this.a, altPaymentMethodOptionDto.a) && jl40.l(this.b, altPaymentMethodOptionDto.b) && jl40.l(this.c, altPaymentMethodOptionDto.c) && jl40.l(this.d, altPaymentMethodOptionDto.d) && jl40.l(this.e, altPaymentMethodOptionDto.e) && this.f == altPaymentMethodOptionDto.f;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            return Integer.hashCode(this.f) + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder r = xvz.r("AltPaymentMethodOptionDto(type=", this.a, ", serviceLevels=", this.b, ", alternativePaymentMethod=");
            r.append(this.c);
            r.append(", changePaymentContentDescription=");
            r.append(this.d);
            r.append(", time=");
            r.append(this.e);
            r.append(", timeInSeconds=");
            r.append(this.f);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public AltPaymentMethodOptionDto() {
            AlternativePaymentMethod.Companion.getClass();
            this.a = "";
            this.b = EmptyList.a;
            this.c = AlternativePaymentMethod.c;
            this.d = null;
            this.e = "";
            this.f = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$DeliveryIntervalListItem;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/v", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class DeliveryIntervalListItem {
        public static final v Companion = new v();
        public final int a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final String e;
        public final String f;
        public final boolean g;

        public /* synthetic */ DeliveryIntervalListItem(int i, int i2, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str, String str2, boolean z) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i & 64) == 0) {
                this.g = true;
            } else {
                this.g = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final FormattedText getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getG() {
            return this.g;
        }

        /* renamed from: c, reason: from getter */
        public final int getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final FormattedText getB() {
            return this.b;
        }

        /* renamed from: e, reason: from getter */
        public final FormattedText getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryIntervalListItem)) {
                return false;
            }
            DeliveryIntervalListItem deliveryIntervalListItem = (DeliveryIntervalListItem) obj;
            return this.a == deliveryIntervalListItem.a && jl40.l(this.b, deliveryIntervalListItem.b) && jl40.l(this.c, deliveryIntervalListItem.c) && jl40.l(this.d, deliveryIntervalListItem.d) && jl40.l(this.e, deliveryIntervalListItem.e) && jl40.l(this.f, deliveryIntervalListItem.f) && this.g == deliveryIntervalListItem.g;
        }

        /* renamed from: f, reason: from getter */
        public final String getF() {
            return this.f;
        }

        /* renamed from: g, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int c = unr0.c(unr0.c(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b.a), 31, this.c.a), 31, this.d.a);
            String str = this.e;
            int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return Boolean.hashCode(this.g) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeliveryIntervalListItem(orderPriority=");
            sb.append(this.a);
            sb.append(", pickupText=");
            sb.append(this.b);
            sb.append(", deliveryText=");
            defpackage.n.C(sb, this.c, ", priceText=", this.d, ", selectedSummaryTrailTitle=");
            g8e.D(sb, this.e, ", selectedSummarySubtitle=", this.f, ", hasChevron=");
            return x4e.i(sb, this.g, Extension.C_BRAKE);
        }

        public DeliveryIntervalListItem() {
            FormattedText formattedText = FormattedText.c;
            this.a = 0;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
            this.e = null;
            this.f = null;
            this.g = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$AltpinBOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/g", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AltpinBOptionDto extends b {
        public static final g Companion = new g();
        public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(6)), null, null, null, null, null, null};
        public final String a;
        public final List b;
        public final ConfirmationScreen c;
        public final Address d;
        public final Selector e;
        public final Walk f;
        public final String g;
        public final int h;

        public AltpinBOptionDto(int i2, String str, List list, ConfirmationScreen confirmationScreen, Address address, Selector selector, Walk walk, String str2, int i3) {
            if ((i2 & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i2 & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i2 & 4) == 0) {
                this.c = null;
            } else {
                this.c = confirmationScreen;
            }
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = address;
            }
            if ((i2 & 16) == 0) {
                this.e = null;
            } else {
                this.e = selector;
            }
            if ((i2 & 32) == 0) {
                this.f = null;
            } else {
                this.f = walk;
            }
            if ((i2 & 64) == 0) {
                this.g = "";
            } else {
                this.g = str2;
            }
            if ((i2 & 128) == 0) {
                this.h = 0;
            } else {
                this.h = i3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltpinBOptionDto)) {
                return false;
            }
            AltpinBOptionDto altpinBOptionDto = (AltpinBOptionDto) obj;
            return jl40.l(this.a, altpinBOptionDto.a) && jl40.l(this.b, altpinBOptionDto.b) && jl40.l(this.c, altpinBOptionDto.c) && jl40.l(this.d, altpinBOptionDto.d) && jl40.l(this.e, altpinBOptionDto.e) && jl40.l(this.f, altpinBOptionDto.f) && jl40.l(this.g, altpinBOptionDto.g) && this.h == altpinBOptionDto.h;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            ConfirmationScreen confirmationScreen = this.c;
            int hashCode = (c + (confirmationScreen == null ? 0 : confirmationScreen.hashCode())) * 31;
            Address address = this.d;
            int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
            Selector selector = this.e;
            int hashCode3 = (hashCode2 + (selector == null ? 0 : selector.hashCode())) * 31;
            Walk walk = this.f;
            return Integer.hashCode(this.h) + unr0.b((hashCode3 + (walk != null ? walk.hashCode() : 0)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder r = xvz.r("AltpinBOptionDto(type=", this.a, ", serviceLevels=", this.b, ", confirmationScreen=");
            r.append(this.c);
            r.append(", address=");
            r.append(this.d);
            r.append(", selector=");
            r.append(this.e);
            r.append(", walk=");
            r.append(this.f);
            r.append(", time=");
            r.append(this.g);
            r.append(", timeInSeconds=");
            r.append(this.h);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public AltpinBOptionDto(String str, List list, ConfirmationScreen confirmationScreen, Address address, Selector selector, Walk walk, String str2, int i2) {
            this.a = str;
            this.b = list;
            this.c = confirmationScreen;
            this.d = address;
            this.e = selector;
            this.f = walk;
            this.g = str2;
            this.h = i2;
        }

        public AltpinBOptionDto() {
            this("", EmptyList.a, null, null, null, null, "", 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MultimodalOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/d0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MultimodalOptionDto extends b {
        public static final d0 Companion = new d0();
        public static final i3y[] i;
        public final String a;
        public final List b;
        public final String c;
        public final List d;
        public final String e;
        public final int f;
        public final FormattedText g;
        public final MultimodalPointsDto h;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ia1(16)), null, kotlin.a.b(lazyThreadSafetyMode, new ia1(17)), null, null, null, null};
        }

        public MultimodalOptionDto(int i2, String str, List list, String str2, List list2, String str3, int i3, FormattedText formattedText, MultimodalPointsDto multimodalPointsDto) {
            if ((i2 & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i2 & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i2 & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = list2;
            }
            if ((i2 & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i2 & 32) == 0) {
                this.f = 0;
            } else {
                this.f = i3;
            }
            if ((i2 & 64) == 0) {
                this.g = FormattedText.c;
            } else {
                this.g = formattedText;
            }
            if ((i2 & 128) == 0) {
                this.h = null;
            } else {
                this.h = multimodalPointsDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultimodalOptionDto)) {
                return false;
            }
            MultimodalOptionDto multimodalOptionDto = (MultimodalOptionDto) obj;
            return jl40.l(this.a, multimodalOptionDto.a) && jl40.l(this.b, multimodalOptionDto.b) && jl40.l(this.c, multimodalOptionDto.c) && jl40.l(this.d, multimodalOptionDto.d) && jl40.l(this.e, multimodalOptionDto.e) && this.f == multimodalOptionDto.f && jl40.l(this.g, multimodalOptionDto.g) && jl40.l(this.h, multimodalOptionDto.h);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            List list = this.d;
            int c = unr0.c(oyr.b(this.f, unr0.b((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31), 31, this.g.a);
            MultimodalPointsDto multimodalPointsDto = this.h;
            return c + (multimodalPointsDto != null ? multimodalPointsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder r = xvz.r("MultimodalOptionDto(type=", this.a, ", serviceLevels=", this.b, ", multimodalOrderId=");
            tse0.x(this.c, ", routeParts=", ", time=", r, this.d);
            b64.A(this.f, this.e, ", timeInSeconds=", ", buttonText=", r);
            r.append(this.g);
            r.append(", multimodalPoints=");
            r.append(this.h);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public MultimodalOptionDto() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = EmptyList.a;
            this.c = "";
            this.d = null;
            this.e = "";
            this.f = 0;
            this.g = formattedText;
            this.h = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$ListItem;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/w", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class ListItem {
        public static final w Companion = new w();
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final FormattedText f;
        public final Badge g;
        public final n7v h;
        public final n7v i;

        public /* synthetic */ ListItem(int i, int i2, String str, String str2, String str3, String str4, FormattedText formattedText, Badge badge, n7v n7vVar, n7v n7vVar2) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = formattedText;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = badge;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = n7vVar;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = n7vVar2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final Badge getG() {
            return this.g;
        }

        /* renamed from: b, reason: from getter */
        public final n7v getH() {
            return this.h;
        }

        /* renamed from: c, reason: from getter */
        public final int getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: e, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) obj;
            return this.a == listItem.a && jl40.l(this.b, listItem.b) && jl40.l(this.c, listItem.c) && jl40.l(this.d, listItem.d) && jl40.l(this.e, listItem.e) && jl40.l(this.f, listItem.f) && jl40.l(this.g, listItem.g) && jl40.l(this.h, listItem.h) && jl40.l(this.i, listItem.i);
        }

        /* renamed from: f, reason: from getter */
        public final n7v getI() {
            return this.i;
        }

        /* renamed from: g, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* renamed from: h, reason: from getter */
        public final FormattedText getF() {
            return this.f;
        }

        public final int hashCode() {
            int b = unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            FormattedText formattedText = this.f;
            int hashCode4 = (hashCode3 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
            Badge badge = this.g;
            int hashCode5 = (hashCode4 + (badge == null ? 0 : badge.hashCode())) * 31;
            n7v n7vVar = this.h;
            int hashCode6 = (hashCode5 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
            n7v n7vVar2 = this.i;
            return hashCode6 + (n7vVar2 != null ? n7vVar2.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final String toString() {
            StringBuilder v = unr0.v(this.a, "ListItem(orderPriority=", ", title=", this.b, ", subtitle=");
            g8e.D(v, this.c, ", trailTitle=", this.d, ", trailSubtitle=");
            v.append(this.e);
            v.append(", trailSubtitleFormatted=");
            v.append(this.f);
            v.append(", badge=");
            v.append(this.g);
            v.append(", image=");
            v.append(this.h);
            v.append(", trailImage=");
            v.append(this.i);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public ListItem(int i) {
            this.a = 0;
            this.b = "";
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
        }

        public ListItem() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$PinStateDto;", "", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/r0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class PinStateDto {
        public static final r0 Companion = new r0();
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final q0 g;
        public final float h;
        public final PointDto i;
        public final Integer j;

        public /* synthetic */ PinStateDto(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, q0 q0Var, float f, PointDto pointDto, Integer num) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z3;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z4;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = q0Var;
            }
            if ((i & 128) == 0) {
                this.h = 1.0f;
            } else {
                this.h = f;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = pointDto;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = num;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinStateDto)) {
                return false;
            }
            PinStateDto pinStateDto = (PinStateDto) obj;
            return jl40.l(this.a, pinStateDto.a) && this.b == pinStateDto.b && this.c == pinStateDto.c && this.d == pinStateDto.d && this.e == pinStateDto.e && jl40.l(this.f, pinStateDto.f) && jl40.l(this.g, pinStateDto.g) && Float.compare(this.h, pinStateDto.h) == 0 && jl40.l(this.i, pinStateDto.i) && jl40.l(this.j, pinStateDto.j);
        }

        public final int hashCode() {
            String str = this.a;
            int e = unr0.e(unr0.e(unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            String str2 = this.f;
            int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
            q0 q0Var = this.g;
            int c = g8e.c(this.h, (hashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31, 31);
            PointDto pointDto = this.i;
            int hashCode2 = (c + (pointDto == null ? 0 : pointDto.hashCode())) * 31;
            Integer num = this.j;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder l = oo31.l("PinStateDto(title=", this.a, ", textWithChevron=", ", shouldSwapTexts=", this.b);
            nnm.v(", anchored=", ", drawBullet=", l, this.c, this.d);
            unr0.A(", hint=", this.f, ", iconState=", l, this.e);
            l.append(this.g);
            l.append(", scale=");
            l.append(this.h);
            l.append(", point=");
            l.append(this.i);
            l.append(", amount=");
            l.append(this.j);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public PinStateDto() {
            this.a = null;
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = 1.0f;
            this.i = null;
            this.j = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$RequirementOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/y0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class RequirementOptionDto extends b {
        public static final y0 Companion = new y0();
        public static final i3y[] m = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ia1(21)), null, null, null, null, null, null, null, null, null, null};
        public final String a;
        public final List b;
        public final ListItem c;
        public final Redirect d;
        public final String e;
        public final String f;
        public final Boolean g;
        public final Boolean h;
        public final TariffBubbleOption i;
        public final DeliveryIntervalListItem j;
        public final String k;
        public final int l;

        public RequirementOptionDto(int i, String str, List list, ListItem listItem, Redirect redirect, String str2, String str3, Boolean bool, Boolean bool2, TariffBubbleOption tariffBubbleOption, DeliveryIntervalListItem deliveryIntervalListItem, String str4, int i2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = listItem;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = redirect;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = bool;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = bool2;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = tariffBubbleOption;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = deliveryIntervalListItem;
            }
            if ((i & 1024) == 0) {
                this.k = "";
            } else {
                this.k = str4;
            }
            if ((i & 2048) == 0) {
                this.l = 0;
            } else {
                this.l = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequirementOptionDto)) {
                return false;
            }
            RequirementOptionDto requirementOptionDto = (RequirementOptionDto) obj;
            return jl40.l(this.a, requirementOptionDto.a) && jl40.l(this.b, requirementOptionDto.b) && jl40.l(this.c, requirementOptionDto.c) && jl40.l(this.d, requirementOptionDto.d) && jl40.l(this.e, requirementOptionDto.e) && jl40.l(this.f, requirementOptionDto.f) && jl40.l(this.g, requirementOptionDto.g) && jl40.l(this.h, requirementOptionDto.h) && jl40.l(this.i, requirementOptionDto.i) && jl40.l(this.j, requirementOptionDto.j) && jl40.l(this.k, requirementOptionDto.k) && this.l == requirementOptionDto.l;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            ListItem listItem = this.c;
            int hashCode = (c + (listItem == null ? 0 : listItem.hashCode())) * 31;
            Redirect redirect = this.d;
            int hashCode2 = (hashCode + (redirect == null ? 0 : redirect.hashCode())) * 31;
            String str = this.e;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.g;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.h;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            TariffBubbleOption tariffBubbleOption = this.i;
            int hashCode7 = (hashCode6 + (tariffBubbleOption == null ? 0 : tariffBubbleOption.hashCode())) * 31;
            DeliveryIntervalListItem deliveryIntervalListItem = this.j;
            return Integer.hashCode(this.l) + unr0.b((hashCode7 + (deliveryIntervalListItem != null ? deliveryIntervalListItem.hashCode() : 0)) * 31, 31, this.k);
        }

        public final String toString() {
            StringBuilder r = xvz.r("RequirementOptionDto(type=", this.a, ", serviceLevels=", this.b, ", listItem=");
            r.append(this.c);
            r.append(", redirect=");
            r.append(this.d);
            r.append(", deeplink=");
            g8e.D(r, this.e, ", selectionKey=", this.f, ", isPreselected=");
            r.append(this.g);
            r.append(", isAvailable=");
            r.append(this.h);
            r.append(", tariffBubbleOption=");
            r.append(this.i);
            r.append(", deliveryIntervalListItem=");
            r.append(this.j);
            r.append(", time=");
            r.append(this.k);
            r.append(", timeInSeconds=");
            r.append(this.l);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public RequirementOptionDto(String str, List list, ListItem listItem, Redirect redirect, String str2, String str3, Boolean bool, Boolean bool2, TariffBubbleOption tariffBubbleOption, DeliveryIntervalListItem deliveryIntervalListItem, String str4, int i) {
            this.a = str;
            this.b = list;
            this.c = listItem;
            this.d = redirect;
            this.e = str2;
            this.f = str3;
            this.g = bool;
            this.h = bool2;
            this.i = tariffBubbleOption;
            this.j = deliveryIntervalListItem;
            this.k = str4;
            this.l = i;
        }

        public RequirementOptionDto() {
            this("", EmptyList.a, null, null, null, null, null, null, null, null, "", 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$MulticlassOptionDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/b0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MulticlassOptionDto extends b {
        public static final b0 Companion = new b0();
        public static final i3y[] n;
        public final String a;
        public final List b;
        public final String c;
        public final RouteStatsMulticlassDetails d;
        public final f5 e;
        public final TariffUnavailable f;
        public final Selector g;
        public final MulticlassRequirementSupportedDto h;
        public final String i;
        public final SelectionRules j;
        public final List k;
        public final String l;
        public final int m;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            n = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ia1(14)), null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ia1(15)), null, null};
        }

        public MulticlassOptionDto(int i, String str, List list, String str2, RouteStatsMulticlassDetails routeStatsMulticlassDetails, f5 f5Var, TariffUnavailable tariffUnavailable, Selector selector, MulticlassRequirementSupportedDto multiclassRequirementSupportedDto, String str3, SelectionRules selectionRules, List list2, String str4, int i2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = routeStatsMulticlassDetails;
            }
            if ((i & 16) == 0) {
                this.e = e5.INSTANCE;
            } else {
                this.e = f5Var;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = tariffUnavailable;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = selector;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = multiclassRequirementSupportedDto;
            }
            if ((i & 256) == 0) {
                this.i = "";
            } else {
                this.i = str3;
            }
            if ((i & 512) == 0) {
                this.j = SelectionRules.b;
            } else {
                this.j = selectionRules;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = list2;
            }
            if ((i & 2048) == 0) {
                this.l = "";
            } else {
                this.l = str4;
            }
            this.m = (i & 4096) == 0 ? 0 : i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MulticlassOptionDto)) {
                return false;
            }
            MulticlassOptionDto multiclassOptionDto = (MulticlassOptionDto) obj;
            return jl40.l(this.a, multiclassOptionDto.a) && jl40.l(this.b, multiclassOptionDto.b) && jl40.l(this.c, multiclassOptionDto.c) && jl40.l(this.d, multiclassOptionDto.d) && jl40.l(this.e, multiclassOptionDto.e) && jl40.l(this.f, multiclassOptionDto.f) && jl40.l(this.g, multiclassOptionDto.g) && jl40.l(this.h, multiclassOptionDto.h) && jl40.l(this.i, multiclassOptionDto.i) && jl40.l(this.j, multiclassOptionDto.j) && jl40.l(this.k, multiclassOptionDto.k) && jl40.l(this.l, multiclassOptionDto.l) && this.m == multiclassOptionDto.m;
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
            RouteStatsMulticlassDetails routeStatsMulticlassDetails = this.d;
            int hashCode2 = (this.e.hashCode() + ((hashCode + (routeStatsMulticlassDetails == null ? 0 : routeStatsMulticlassDetails.hashCode())) * 31)) * 31;
            TariffUnavailable tariffUnavailable = this.f;
            int hashCode3 = (hashCode2 + (tariffUnavailable == null ? 0 : tariffUnavailable.hashCode())) * 31;
            Selector selector = this.g;
            int hashCode4 = (hashCode3 + (selector == null ? 0 : selector.hashCode())) * 31;
            MulticlassRequirementSupportedDto multiclassRequirementSupportedDto = this.h;
            int hashCode5 = (this.j.a.hashCode() + unr0.b((hashCode4 + (multiclassRequirementSupportedDto == null ? 0 : multiclassRequirementSupportedDto.hashCode())) * 31, 31, this.i)) * 31;
            List list = this.k;
            return Integer.hashCode(this.m) + unr0.b((hashCode5 + (list != null ? list.hashCode() : 0)) * 31, 31, this.l);
        }

        public final String toString() {
            StringBuilder r = xvz.r("MulticlassOptionDto(type=", this.a, ", serviceLevels=", this.b, ", offer=");
            r.append(this.c);
            r.append(", details=");
            r.append(this.d);
            r.append(", widget=");
            r.append(this.e);
            r.append(", tariffUnavailable=");
            r.append(this.f);
            r.append(", selector=");
            r.append(this.g);
            r.append(", multiclass=");
            r.append(this.h);
            r.append(", name=");
            r.append(this.i);
            r.append(", selectionRules=");
            r.append(this.j);
            r.append(", unsupportedRequirements=");
            oyr.D(", time=", this.l, ", timeInSeconds=", r, this.k);
            return oyr.m(this.m, Extension.C_BRAKE, r);
        }

        public MulticlassOptionDto(String str, List list, String str2, RouteStatsMulticlassDetails routeStatsMulticlassDetails, f5 f5Var, TariffUnavailable tariffUnavailable, Selector selector, MulticlassRequirementSupportedDto multiclassRequirementSupportedDto, String str3, SelectionRules selectionRules, List list2, String str4, int i) {
            this.a = str;
            this.b = list;
            this.c = str2;
            this.d = routeStatsMulticlassDetails;
            this.e = f5Var;
            this.f = tariffUnavailable;
            this.g = selector;
            this.h = multiclassRequirementSupportedDto;
            this.i = str3;
            this.j = selectionRules;
            this.k = list2;
            this.l = str4;
            this.m = i;
        }

        public MulticlassOptionDto() {
            this("", EmptyList.a, null, null, e5.INSTANCE, null, null, null, "", SelectionRules.b, null, "", 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/source/altpins/Alternatives$CommonOptionLegacyDto;", "Lcom/yandex/go/preorder/source/altpins/b;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/j", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CommonOptionLegacyDto extends b {
        public static final j Companion = new j();
        public static final i3y[] F;
        public final Redirect A;
        public final String B;
        public final TariffBubbleOption C;
        public final MulticlassRequirementSupportedDto D;
        public final Boolean E;
        public final OptionTypeLegacy a;
        public final List b;
        public final String c;
        public final Address d;
        public final Walk e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final PinCard j;
        public final RouteStatsMulticlassDetails k;
        public final f5 l;
        public final Selector m;
        public final SelectionRules n;
        public final TariffUnavailable o;
        public final List p;
        public final MassTransit q;
        public final MassTransitCard r;
        public final String s;
        public final String t;
        public final int u;
        public final ConfirmationScreen v;
        public final String w;
        public final Boolean x;
        public final ListItem y;
        public final DeliveryIntervalListItem z;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            F = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ia1(8)), kotlin.a.b(lazyThreadSafetyMode, new ia1(9)), null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ia1(10)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        }

        public CommonOptionLegacyDto(int i, OptionTypeLegacy optionTypeLegacy, List list, String str, Address address, Walk walk, String str2, String str3, String str4, String str5, PinCard pinCard, RouteStatsMulticlassDetails routeStatsMulticlassDetails, f5 f5Var, Selector selector, SelectionRules selectionRules, TariffUnavailable tariffUnavailable, List list2, MassTransit massTransit, MassTransitCard massTransitCard, String str6, String str7, int i2, ConfirmationScreen confirmationScreen, String str8, Boolean bool, ListItem listItem, DeliveryIntervalListItem deliveryIntervalListItem, Redirect redirect, String str9, TariffBubbleOption tariffBubbleOption, MulticlassRequirementSupportedDto multiclassRequirementSupportedDto, Boolean bool2) {
            this.a = (i & 1) == 0 ? OptionTypeLegacy.UNKNOWN : optionTypeLegacy;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = address;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = walk;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str3;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str4;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str5;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = pinCard;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = routeStatsMulticlassDetails;
            }
            if ((i & 2048) == 0) {
                this.l = e5.INSTANCE;
            } else {
                this.l = f5Var;
            }
            if ((i & 4096) == 0) {
                this.m = null;
            } else {
                this.m = selector;
            }
            this.n = (i & 8192) == 0 ? SelectionRules.b : selectionRules;
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = tariffUnavailable;
            }
            if ((32768 & i) == 0) {
                this.p = null;
            } else {
                this.p = list2;
            }
            if ((65536 & i) == 0) {
                this.q = null;
            } else {
                this.q = massTransit;
            }
            if ((131072 & i) == 0) {
                this.r = null;
            } else {
                this.r = massTransitCard;
            }
            if ((262144 & i) == 0) {
                this.s = null;
            } else {
                this.s = str6;
            }
            if ((524288 & i) == 0) {
                this.t = "";
            } else {
                this.t = str7;
            }
            this.u = (1048576 & i) == 0 ? 0 : i2;
            if ((2097152 & i) == 0) {
                this.v = null;
            } else {
                this.v = confirmationScreen;
            }
            if ((4194304 & i) == 0) {
                this.w = null;
            } else {
                this.w = str8;
            }
            if ((8388608 & i) == 0) {
                this.x = null;
            } else {
                this.x = bool;
            }
            if ((16777216 & i) == 0) {
                this.y = null;
            } else {
                this.y = listItem;
            }
            if ((33554432 & i) == 0) {
                this.z = null;
            } else {
                this.z = deliveryIntervalListItem;
            }
            if ((67108864 & i) == 0) {
                this.A = null;
            } else {
                this.A = redirect;
            }
            if ((134217728 & i) == 0) {
                this.B = null;
            } else {
                this.B = str9;
            }
            if ((268435456 & i) == 0) {
                this.C = null;
            } else {
                this.C = tariffBubbleOption;
            }
            if ((536870912 & i) == 0) {
                this.D = null;
            } else {
                this.D = multiclassRequirementSupportedDto;
            }
            if ((i & 1073741824) == 0) {
                this.E = null;
            } else {
                this.E = bool2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonOptionLegacyDto)) {
                return false;
            }
            CommonOptionLegacyDto commonOptionLegacyDto = (CommonOptionLegacyDto) obj;
            return this.a == commonOptionLegacyDto.a && jl40.l(this.b, commonOptionLegacyDto.b) && jl40.l(this.c, commonOptionLegacyDto.c) && jl40.l(this.d, commonOptionLegacyDto.d) && jl40.l(this.e, commonOptionLegacyDto.e) && jl40.l(this.f, commonOptionLegacyDto.f) && jl40.l(this.g, commonOptionLegacyDto.g) && jl40.l(this.h, commonOptionLegacyDto.h) && jl40.l(this.i, commonOptionLegacyDto.i) && jl40.l(this.j, commonOptionLegacyDto.j) && jl40.l(this.k, commonOptionLegacyDto.k) && jl40.l(this.l, commonOptionLegacyDto.l) && jl40.l(this.m, commonOptionLegacyDto.m) && jl40.l(this.n, commonOptionLegacyDto.n) && jl40.l(this.o, commonOptionLegacyDto.o) && jl40.l(this.p, commonOptionLegacyDto.p) && jl40.l(this.q, commonOptionLegacyDto.q) && jl40.l(this.r, commonOptionLegacyDto.r) && jl40.l(this.s, commonOptionLegacyDto.s) && jl40.l(this.t, commonOptionLegacyDto.t) && this.u == commonOptionLegacyDto.u && jl40.l(this.v, commonOptionLegacyDto.v) && jl40.l(this.w, commonOptionLegacyDto.w) && jl40.l(this.x, commonOptionLegacyDto.x) && jl40.l(this.y, commonOptionLegacyDto.y) && jl40.l(this.z, commonOptionLegacyDto.z) && jl40.l(this.A, commonOptionLegacyDto.A) && jl40.l(this.B, commonOptionLegacyDto.B) && jl40.l(this.C, commonOptionLegacyDto.C) && jl40.l(this.D, commonOptionLegacyDto.D) && jl40.l(this.E, commonOptionLegacyDto.E);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            Address address = this.d;
            int hashCode = (b + (address == null ? 0 : address.hashCode())) * 31;
            Walk walk = this.e;
            int hashCode2 = (hashCode + (walk == null ? 0 : walk.hashCode())) * 31;
            String str = this.f;
            int b2 = unr0.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
            String str2 = this.h;
            int hashCode3 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PinCard pinCard = this.j;
            int hashCode5 = (hashCode4 + (pinCard == null ? 0 : pinCard.hashCode())) * 31;
            RouteStatsMulticlassDetails routeStatsMulticlassDetails = this.k;
            int hashCode6 = (this.l.hashCode() + ((hashCode5 + (routeStatsMulticlassDetails == null ? 0 : routeStatsMulticlassDetails.hashCode())) * 31)) * 31;
            Selector selector = this.m;
            int hashCode7 = (this.n.a.hashCode() + ((hashCode6 + (selector == null ? 0 : selector.hashCode())) * 31)) * 31;
            TariffUnavailable tariffUnavailable = this.o;
            int hashCode8 = (hashCode7 + (tariffUnavailable == null ? 0 : tariffUnavailable.hashCode())) * 31;
            List list = this.p;
            int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            MassTransit massTransit = this.q;
            int hashCode10 = (hashCode9 + (massTransit == null ? 0 : massTransit.hashCode())) * 31;
            MassTransitCard massTransitCard = this.r;
            int hashCode11 = (hashCode10 + (massTransitCard == null ? 0 : massTransitCard.hashCode())) * 31;
            String str4 = this.s;
            int b3 = oyr.b(this.u, unr0.b((hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.t), 31);
            ConfirmationScreen confirmationScreen = this.v;
            int hashCode12 = (b3 + (confirmationScreen == null ? 0 : confirmationScreen.hashCode())) * 31;
            String str5 = this.w;
            int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.x;
            int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
            ListItem listItem = this.y;
            int hashCode15 = (hashCode14 + (listItem == null ? 0 : listItem.hashCode())) * 31;
            DeliveryIntervalListItem deliveryIntervalListItem = this.z;
            int hashCode16 = (hashCode15 + (deliveryIntervalListItem == null ? 0 : deliveryIntervalListItem.hashCode())) * 31;
            Redirect redirect = this.A;
            int hashCode17 = (hashCode16 + (redirect == null ? 0 : redirect.hashCode())) * 31;
            String str6 = this.B;
            int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
            TariffBubbleOption tariffBubbleOption = this.C;
            int hashCode19 = (hashCode18 + (tariffBubbleOption == null ? 0 : tariffBubbleOption.hashCode())) * 31;
            MulticlassRequirementSupportedDto multiclassRequirementSupportedDto = this.D;
            int hashCode20 = (hashCode19 + (multiclassRequirementSupportedDto == null ? 0 : multiclassRequirementSupportedDto.hashCode())) * 31;
            Boolean bool2 = this.E;
            return hashCode20 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonOptionLegacyDto(type=");
            sb.append(this.a);
            sb.append(", serviceLevels=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", address=");
            sb.append(this.d);
            sb.append(", walk=");
            sb.append(this.e);
            sb.append(", bubbleText=");
            sb.append(this.f);
            sb.append(", bubbleFlag=");
            g8e.D(sb, this.g, ", description=", this.h, ", offer=");
            sb.append(this.i);
            sb.append(", pinCard=");
            sb.append(this.j);
            sb.append(", details=");
            sb.append(this.k);
            sb.append(", widget=");
            sb.append(this.l);
            sb.append(", selector=");
            sb.append(this.m);
            sb.append(", selectionRules=");
            sb.append(this.n);
            sb.append(", tariffUnavailable=");
            sb.append(this.o);
            sb.append(", unsupportedRequirements=");
            sb.append(this.p);
            sb.append(", massTransit=");
            sb.append(this.q);
            sb.append(", massTransitCard=");
            sb.append(this.r);
            sb.append(", plusPromoWithdrawAmount=");
            g8e.D(sb, this.s, ", time=", this.t, ", timeInSeconds=");
            sb.append(this.u);
            sb.append(", confirmationScreen=");
            sb.append(this.v);
            sb.append(", selectionKey=");
            tse0.A(sb, this.w, ", isPreselected=", this.x, ", listItem=");
            sb.append(this.y);
            sb.append(", deliveryIntervalListItem=");
            sb.append(this.z);
            sb.append(", redirect=");
            sb.append(this.A);
            sb.append(", deeplink=");
            sb.append(this.B);
            sb.append(", tariffBubbleOption=");
            sb.append(this.C);
            sb.append(", multiclass=");
            sb.append(this.D);
            sb.append(", isAvailable=");
            return nzs.d(sb, this.E, Extension.C_BRAKE);
        }

        public CommonOptionLegacyDto() {
            OptionTypeLegacy optionTypeLegacy = OptionTypeLegacy.UNKNOWN;
            e5 e5Var = e5.INSTANCE;
            SelectionRules selectionRules = SelectionRules.b;
            this.a = optionTypeLegacy;
            this.b = EmptyList.a;
            this.c = "";
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = "";
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = e5Var;
            this.m = null;
            this.n = selectionRules;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = "";
            this.u = 0;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
        }
    }
}
