package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vfh;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/DefaultOfferBodyDtoV2$IconBodyAlignment", "", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/DefaultOfferBodyDtoV2$IconBodyAlignment;", "Companion", "vfh", "BOTTOM_START", "CENTER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDtoV2$IconBodyAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultOfferBodyDtoV2$IconBodyAlignment[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final DefaultOfferBodyDtoV2$IconBodyAlignment BOTTOM_START;
    public static final DefaultOfferBodyDtoV2$IconBodyAlignment CENTER;
    public static final vfh Companion;

    static {
        DefaultOfferBodyDtoV2$IconBodyAlignment defaultOfferBodyDtoV2$IconBodyAlignment = new DefaultOfferBodyDtoV2$IconBodyAlignment("BOTTOM_START", 0);
        BOTTOM_START = defaultOfferBodyDtoV2$IconBodyAlignment;
        DefaultOfferBodyDtoV2$IconBodyAlignment defaultOfferBodyDtoV2$IconBodyAlignment2 = new DefaultOfferBodyDtoV2$IconBodyAlignment("CENTER", 1);
        CENTER = defaultOfferBodyDtoV2$IconBodyAlignment2;
        DefaultOfferBodyDtoV2$IconBodyAlignment[] defaultOfferBodyDtoV2$IconBodyAlignmentArr = {defaultOfferBodyDtoV2$IconBodyAlignment, defaultOfferBodyDtoV2$IconBodyAlignment2};
        $VALUES = defaultOfferBodyDtoV2$IconBodyAlignmentArr;
        $ENTRIES = kotlin.enums.a.a(defaultOfferBodyDtoV2$IconBodyAlignmentArr);
        Companion = new vfh();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(3));
    }

    public static DefaultOfferBodyDtoV2$IconBodyAlignment valueOf(String str) {
        return (DefaultOfferBodyDtoV2$IconBodyAlignment) Enum.valueOf(DefaultOfferBodyDtoV2$IconBodyAlignment.class, str);
    }

    public static DefaultOfferBodyDtoV2$IconBodyAlignment[] values() {
        return (DefaultOfferBodyDtoV2$IconBodyAlignment[]) $VALUES.clone();
    }
}
