package com.yandex.go.shortcuts.models;

import com.yandex.go.dto.response.Action$Deeplink;
import com.yandex.go.dto.response.Action$Drive;
import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.q1;
import com.yandex.go.dto.response.r;
import com.yandex.go.dto.response.s;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import defpackage.ap;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.k4o;
import defpackage.tt60;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/yandex/go/shortcuts/models/OfferType;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/go/dto/response/q1;", "serializer", "Lkotlinx/serialization/KSerializer;", "b", "()Lkotlinx/serialization/KSerializer;", "Lcom/yandex/go/shortcuts/view/adapter/model/BaseShortcutModel$Source;", "source", "Lcom/yandex/go/shortcuts/view/adapter/model/BaseShortcutModel$Source;", "c", "()Lcom/yandex/go/shortcuts/view/adapter/model/BaseShortcutModel$Source;", "Companion", "tt60", "UNSUPPORTED", "TAXI_MAP", "DEEPLINK", "TAXI_EXPECTED_DESTINATION", DefaultErrorCategoryProvider.MEDIA, "TAXI_ROUTE_INPUT", "HEADER_DEEP_LINK", "EATS_BASED_SUPER_APP", "DRIVE", "HEADER_SUMMARY_REDIRECT", "HEADER_ACTION_DRIVEN", "ACTION_DRIVEN", "ACTION_DRIVEN_THUMB", "PERSONAL", "PERSONAL_SLIDER", "DELIVERY_DASHBOARD", "MARKETPLACE", "LIST_ITEM", "ROUND_BUTTON", "SQUARE_BUTTON", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OfferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OfferType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OfferType ACTION_DRIVEN;
    public static final OfferType ACTION_DRIVEN_THUMB;
    public static final tt60 Companion;
    public static final OfferType DEEPLINK;
    public static final OfferType DELIVERY_DASHBOARD;
    public static final OfferType DRIVE;
    public static final OfferType EATS_BASED_SUPER_APP;
    public static final OfferType HEADER_ACTION_DRIVEN;
    public static final OfferType HEADER_DEEP_LINK;
    public static final OfferType HEADER_SUMMARY_REDIRECT;
    public static final OfferType LIST_ITEM;
    public static final OfferType MARKETPLACE;
    public static final OfferType MEDIA;
    public static final OfferType PERSONAL;
    public static final OfferType PERSONAL_SLIDER;
    public static final OfferType ROUND_BUTTON;
    public static final OfferType SQUARE_BUTTON;
    public static final OfferType TAXI_EXPECTED_DESTINATION;
    public static final OfferType TAXI_MAP;
    public static final OfferType TAXI_ROUTE_INPUT;
    public static final OfferType UNSUPPORTED;
    private final KSerializer serializer;
    private final BaseShortcutModel$Source source;

    static {
        e0 e0Var = e0.INSTANCE;
        KSerializer serializer = e0Var.serializer();
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        OfferType offerType = new OfferType("UNSUPPORTED", 0, serializer, baseShortcutModel$Source);
        UNSUPPORTED = offerType;
        OfferType offerType2 = new OfferType("TAXI_MAP", 1, e0Var.serializer(), baseShortcutModel$Source);
        TAXI_MAP = offerType2;
        r rVar = Action$Deeplink.Companion;
        KSerializer serializer2 = rVar.serializer();
        BaseShortcutModel$Source baseShortcutModel$Source2 = BaseShortcutModel$Source.ITEMS;
        OfferType offerType3 = new OfferType("DEEPLINK", 2, serializer2, baseShortcutModel$Source2);
        DEEPLINK = offerType3;
        OfferType offerType4 = new OfferType("TAXI_EXPECTED_DESTINATION", 3, Action$TaxiExpectedDestination.Companion.serializer(), baseShortcutModel$Source2);
        TAXI_EXPECTED_DESTINATION = offerType4;
        OfferType offerType5 = new OfferType(DefaultErrorCategoryProvider.MEDIA, 4, Action$MediaStory.Companion.serializer(), baseShortcutModel$Source2);
        MEDIA = offerType5;
        ap apVar = q1.Companion;
        KSerializer serializer3 = apVar.serializer();
        BaseShortcutModel$Source baseShortcutModel$Source3 = BaseShortcutModel$Source.HEADER;
        OfferType offerType6 = new OfferType("TAXI_ROUTE_INPUT", 5, serializer3, baseShortcutModel$Source3);
        TAXI_ROUTE_INPUT = offerType6;
        OfferType offerType7 = new OfferType("HEADER_DEEP_LINK", 6, rVar.serializer(), baseShortcutModel$Source3);
        HEADER_DEEP_LINK = offerType7;
        OfferType offerType8 = new OfferType("EATS_BASED_SUPER_APP", 7, rVar.serializer(), baseShortcutModel$Source3);
        EATS_BASED_SUPER_APP = offerType8;
        OfferType offerType9 = new OfferType("DRIVE", 8, Action$Drive.Companion.serializer(), baseShortcutModel$Source2);
        DRIVE = offerType9;
        OfferType offerType10 = new OfferType("HEADER_SUMMARY_REDIRECT", 9, Action$SummaryRedirect.Companion.serializer(), baseShortcutModel$Source3);
        HEADER_SUMMARY_REDIRECT = offerType10;
        OfferType offerType11 = new OfferType("HEADER_ACTION_DRIVEN", 10, apVar.serializer(), baseShortcutModel$Source3);
        HEADER_ACTION_DRIVEN = offerType11;
        OfferType offerType12 = new OfferType("ACTION_DRIVEN", 11, apVar.serializer(), baseShortcutModel$Source2);
        ACTION_DRIVEN = offerType12;
        OfferType offerType13 = new OfferType("ACTION_DRIVEN_THUMB", 12, apVar.serializer(), baseShortcutModel$Source2);
        ACTION_DRIVEN_THUMB = offerType13;
        OfferType offerType14 = new OfferType("PERSONAL", 13, apVar.serializer(), baseShortcutModel$Source2);
        PERSONAL = offerType14;
        OfferType offerType15 = new OfferType("PERSONAL_SLIDER", 14, apVar.serializer(), baseShortcutModel$Source2);
        PERSONAL_SLIDER = offerType15;
        OfferType offerType16 = new OfferType("DELIVERY_DASHBOARD", 15, s.INSTANCE.serializer(), baseShortcutModel$Source2);
        DELIVERY_DASHBOARD = offerType16;
        OfferType offerType17 = new OfferType("MARKETPLACE", 16, apVar.serializer(), baseShortcutModel$Source2);
        MARKETPLACE = offerType17;
        OfferType offerType18 = new OfferType("LIST_ITEM", 17, apVar.serializer(), baseShortcutModel$Source2);
        LIST_ITEM = offerType18;
        OfferType offerType19 = new OfferType("ROUND_BUTTON", 18, apVar.serializer(), baseShortcutModel$Source2);
        ROUND_BUTTON = offerType19;
        OfferType offerType20 = new OfferType("SQUARE_BUTTON", 19, apVar.serializer(), baseShortcutModel$Source2);
        SQUARE_BUTTON = offerType20;
        OfferType[] offerTypeArr = {offerType, offerType2, offerType3, offerType4, offerType5, offerType6, offerType7, offerType8, offerType9, offerType10, offerType11, offerType12, offerType13, offerType14, offerType15, offerType16, offerType17, offerType18, offerType19, offerType20};
        $VALUES = offerTypeArr;
        $ENTRIES = kotlin.enums.a.a(offerTypeArr);
        Companion = new tt60();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j660(28));
    }

    public OfferType(String str, int i, KSerializer kSerializer, BaseShortcutModel$Source baseShortcutModel$Source) {
        this.serializer = kSerializer;
        this.source = baseShortcutModel$Source;
    }

    public static OfferType valueOf(String str) {
        return (OfferType) Enum.valueOf(OfferType.class, str);
    }

    public static OfferType[] values() {
        return (OfferType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final KSerializer getSerializer() {
        return this.serializer;
    }

    /* renamed from: c, reason: from getter */
    public final BaseShortcutModel$Source getSource() {
        return this.source;
    }
}
