package com.yandex.go.address.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/address/models/FavoritesInputParams$Intention", "", "Lcom/yandex/go/address/models/FavoritesInputParams$Intention;", "CREATE_SUGGESTED_ADDRESS", "OBSERVE_ADDRESSES", "CREATE_ADDRESS", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesInputParams$Intention {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesInputParams$Intention[] $VALUES;
    public static final FavoritesInputParams$Intention CREATE_ADDRESS;
    public static final FavoritesInputParams$Intention CREATE_SUGGESTED_ADDRESS;
    public static final FavoritesInputParams$Intention OBSERVE_ADDRESSES;

    static {
        FavoritesInputParams$Intention favoritesInputParams$Intention = new FavoritesInputParams$Intention("CREATE_SUGGESTED_ADDRESS", 0);
        CREATE_SUGGESTED_ADDRESS = favoritesInputParams$Intention;
        FavoritesInputParams$Intention favoritesInputParams$Intention2 = new FavoritesInputParams$Intention("OBSERVE_ADDRESSES", 1);
        OBSERVE_ADDRESSES = favoritesInputParams$Intention2;
        FavoritesInputParams$Intention favoritesInputParams$Intention3 = new FavoritesInputParams$Intention("CREATE_ADDRESS", 2);
        CREATE_ADDRESS = favoritesInputParams$Intention3;
        FavoritesInputParams$Intention[] favoritesInputParams$IntentionArr = {favoritesInputParams$Intention, favoritesInputParams$Intention2, favoritesInputParams$Intention3};
        $VALUES = favoritesInputParams$IntentionArr;
        $ENTRIES = kotlin.enums.a.a(favoritesInputParams$IntentionArr);
    }

    public static FavoritesInputParams$Intention valueOf(String str) {
        return (FavoritesInputParams$Intention) Enum.valueOf(FavoritesInputParams$Intention.class, str);
    }

    public static FavoritesInputParams$Intention[] values() {
        return (FavoritesInputParams$Intention[]) $VALUES.clone();
    }
}
