package com.yandex.go.shortcuts.dto.response;

import com.adjust.sdk.Constants;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.fof0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pmf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/PromoMode;", "", "", BackendConfig.Restrictions.ENABLED, "Z", "b", "()Z", "", "value", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Companion", "fof0", "UNKNOWN", "NORMAL", "RESTRICTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PromoMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoMode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final fof0 Companion;
    public static final PromoMode NORMAL;
    public static final PromoMode RESTRICTED;
    public static final PromoMode UNKNOWN;
    private final boolean enabled;
    private final String value;

    static {
        PromoMode promoMode = new PromoMode("UNKNOWN", 0, "", false);
        UNKNOWN = promoMode;
        PromoMode promoMode2 = new PromoMode("NORMAL", 1, Constants.NORMAL, true);
        NORMAL = promoMode2;
        PromoMode promoMode3 = new PromoMode("RESTRICTED", 2, "restricted", true);
        RESTRICTED = promoMode3;
        PromoMode[] promoModeArr = {promoMode, promoMode2, promoMode3};
        $VALUES = promoModeArr;
        $ENTRIES = kotlin.enums.a.a(promoModeArr);
        Companion = new fof0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(3));
    }

    public PromoMode(String str, int i, String str2, boolean z) {
        this.enabled = z;
        this.value = str2;
    }

    public static k4o c() {
        return $ENTRIES;
    }

    public static PromoMode valueOf(String str) {
        return (PromoMode) Enum.valueOf(PromoMode.class, str);
    }

    public static PromoMode[] values() {
        return (PromoMode[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
