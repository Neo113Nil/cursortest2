package com.yandex.plus.pay.data.mb.dto;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iod;
import defpackage.juc;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/pay/data/mb/dto/CompositeOfferDto$LegalInfo$Item$Type", "", "Lcom/yandex/plus/pay/data/mb/dto/CompositeOfferDto$LegalInfo$Item$Type;", "Companion", "iod", "LINK", BaseDatabaseHelper.TYPE_TEXT, "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeOfferDto$LegalInfo$Item$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompositeOfferDto$LegalInfo$Item$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final iod Companion;
    public static final CompositeOfferDto$LegalInfo$Item$Type LINK;
    public static final CompositeOfferDto$LegalInfo$Item$Type TEXT;

    static {
        CompositeOfferDto$LegalInfo$Item$Type compositeOfferDto$LegalInfo$Item$Type = new CompositeOfferDto$LegalInfo$Item$Type("LINK", 0);
        LINK = compositeOfferDto$LegalInfo$Item$Type;
        CompositeOfferDto$LegalInfo$Item$Type compositeOfferDto$LegalInfo$Item$Type2 = new CompositeOfferDto$LegalInfo$Item$Type(BaseDatabaseHelper.TYPE_TEXT, 1);
        TEXT = compositeOfferDto$LegalInfo$Item$Type2;
        CompositeOfferDto$LegalInfo$Item$Type[] compositeOfferDto$LegalInfo$Item$TypeArr = {compositeOfferDto$LegalInfo$Item$Type, compositeOfferDto$LegalInfo$Item$Type2};
        $VALUES = compositeOfferDto$LegalInfo$Item$TypeArr;
        $ENTRIES = kotlin.enums.a.a(compositeOfferDto$LegalInfo$Item$TypeArr);
        Companion = new iod();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(23));
    }

    public static CompositeOfferDto$LegalInfo$Item$Type valueOf(String str) {
        return (CompositeOfferDto$LegalInfo$Item$Type) Enum.valueOf(CompositeOfferDto$LegalInfo$Item$Type.class, str);
    }

    public static CompositeOfferDto$LegalInfo$Item$Type[] values() {
        return (CompositeOfferDto$LegalInfo$Item$Type[]) $VALUES.clone();
    }
}
