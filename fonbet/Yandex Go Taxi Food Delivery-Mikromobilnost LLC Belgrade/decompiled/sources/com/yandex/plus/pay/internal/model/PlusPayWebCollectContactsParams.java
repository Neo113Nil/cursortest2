package com.yandex.plus.pay.internal.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsParams;", "", "pageTheme", "Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsParams$PageTheme;", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsParams$PageTheme;)V", "getPageTheme", "()Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsParams$PageTheme;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PageTheme", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayWebCollectContactsParams {
    private final PageTheme pageTheme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsParams$PageTheme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PageTheme {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PageTheme[] $VALUES;
        public static final PageTheme LIGHT = new PageTheme("LIGHT", 0);
        public static final PageTheme DARK = new PageTheme("DARK", 1);

        private static final /* synthetic */ PageTheme[] $values() {
            return new PageTheme[]{LIGHT, DARK};
        }

        static {
            PageTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PageTheme(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PageTheme valueOf(String str) {
            return (PageTheme) Enum.valueOf(PageTheme.class, str);
        }

        public static PageTheme[] values() {
            return (PageTheme[]) $VALUES.clone();
        }
    }

    public PlusPayWebCollectContactsParams(PageTheme pageTheme) {
        this.pageTheme = pageTheme;
    }

    public static /* synthetic */ PlusPayWebCollectContactsParams copy$default(PlusPayWebCollectContactsParams plusPayWebCollectContactsParams, PageTheme pageTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            pageTheme = plusPayWebCollectContactsParams.pageTheme;
        }
        return plusPayWebCollectContactsParams.copy(pageTheme);
    }

    /* renamed from: component1, reason: from getter */
    public final PageTheme getPageTheme() {
        return this.pageTheme;
    }

    public final PlusPayWebCollectContactsParams copy(PageTheme pageTheme) {
        return new PlusPayWebCollectContactsParams(pageTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlusPayWebCollectContactsParams) && this.pageTheme == ((PlusPayWebCollectContactsParams) other).pageTheme;
    }

    public final PageTheme getPageTheme() {
        return this.pageTheme;
    }

    public int hashCode() {
        return this.pageTheme.hashCode();
    }

    public String toString() {
        return "PlusPayWebCollectContactsParams(pageTheme=" + this.pageTheme + ')';
    }
}
