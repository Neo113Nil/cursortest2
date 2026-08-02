package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j0s;
import defpackage.k4o;
import defpackage.v5r;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/FooterTicketType;", "", "Companion", "j0s", "MASSTRANSIT", "AEROEXPRESS", "SUBURBAN", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FooterTicketType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FooterTicketType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final FooterTicketType AEROEXPRESS;
    public static final j0s Companion;
    public static final FooterTicketType MASSTRANSIT;
    public static final FooterTicketType SUBURBAN;
    public static final FooterTicketType UNKNOWN;

    static {
        FooterTicketType footerTicketType = new FooterTicketType("MASSTRANSIT", 0);
        MASSTRANSIT = footerTicketType;
        FooterTicketType footerTicketType2 = new FooterTicketType("AEROEXPRESS", 1);
        AEROEXPRESS = footerTicketType2;
        FooterTicketType footerTicketType3 = new FooterTicketType("SUBURBAN", 2);
        SUBURBAN = footerTicketType3;
        FooterTicketType footerTicketType4 = new FooterTicketType("UNKNOWN", 3);
        UNKNOWN = footerTicketType4;
        FooterTicketType[] footerTicketTypeArr = {footerTicketType, footerTicketType2, footerTicketType3, footerTicketType4};
        $VALUES = footerTicketTypeArr;
        $ENTRIES = kotlin.enums.a.a(footerTicketTypeArr);
        Companion = new j0s();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(13));
    }

    public static FooterTicketType valueOf(String str) {
        return (FooterTicketType) Enum.valueOf(FooterTicketType.class, str);
    }

    public static FooterTicketType[] values() {
        return (FooterTicketType[]) $VALUES.clone();
    }
}
