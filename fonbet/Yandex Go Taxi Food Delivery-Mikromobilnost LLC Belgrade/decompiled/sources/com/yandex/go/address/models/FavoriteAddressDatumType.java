package com.yandex.go.address.models;

import defpackage.d6p;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wcp;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "", "", "eatsKitWireName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "wcp", "REGULAR", "GEO_POINT", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteAddressDatumType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoriteAddressDatumType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final wcp Companion;
    public static final FavoriteAddressDatumType GEO_POINT;
    public static final FavoriteAddressDatumType REGULAR;
    private final String eatsKitWireName;

    static {
        FavoriteAddressDatumType favoriteAddressDatumType = new FavoriteAddressDatumType("REGULAR", 0, "REGULAR");
        REGULAR = favoriteAddressDatumType;
        FavoriteAddressDatumType favoriteAddressDatumType2 = new FavoriteAddressDatumType("GEO_POINT", 1, "GEO_POINT");
        GEO_POINT = favoriteAddressDatumType2;
        FavoriteAddressDatumType[] favoriteAddressDatumTypeArr = {favoriteAddressDatumType, favoriteAddressDatumType2};
        $VALUES = favoriteAddressDatumTypeArr;
        $ENTRIES = kotlin.enums.a.a(favoriteAddressDatumTypeArr);
        Companion = new wcp();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d6p(27));
    }

    public FavoriteAddressDatumType(String str, int i, String str2) {
        this.eatsKitWireName = str2;
    }

    public static FavoriteAddressDatumType valueOf(String str) {
        return (FavoriteAddressDatumType) Enum.valueOf(FavoriteAddressDatumType.class, str);
    }

    public static FavoriteAddressDatumType[] values() {
        return (FavoriteAddressDatumType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEatsKitWireName() {
        return this.eatsKitWireName;
    }
}
