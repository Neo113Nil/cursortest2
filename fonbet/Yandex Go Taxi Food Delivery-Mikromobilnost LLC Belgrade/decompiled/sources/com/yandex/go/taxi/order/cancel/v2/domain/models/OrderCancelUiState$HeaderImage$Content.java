package com.yandex.go.taxi.order.cancel.v2.domain.models;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tl70;
import defpackage.ut11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class OrderCancelUiState$HeaderImage$Content implements tl70 {
    public final Alignment a;
    public final UiStateDrawableWrapper b;
    public final String c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/v2/domain/models/OrderCancelUiState$HeaderImage$Content$Alignment;", "", "LEADING", "CENTER", "FULL_SIZE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment CENTER;
        public static final Alignment FULL_SIZE;
        public static final Alignment LEADING;

        static {
            Alignment alignment = new Alignment("LEADING", 0);
            LEADING = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            CENTER = alignment2;
            Alignment alignment3 = new Alignment("FULL_SIZE", 2);
            FULL_SIZE = alignment3;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3};
            $VALUES = alignmentArr;
            $ENTRIES = kotlin.enums.a.a(alignmentArr);
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
        new OrderCancelUiState$HeaderImage$Content(Alignment.LEADING, 4);
    }

    public OrderCancelUiState$HeaderImage$Content(Alignment alignment, UiStateDrawableWrapper uiStateDrawableWrapper, String str, String str2) {
        this.a = alignment;
        this.b = uiStateDrawableWrapper;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCancelUiState$HeaderImage$Content)) {
            return false;
        }
        OrderCancelUiState$HeaderImage$Content orderCancelUiState$HeaderImage$Content = (OrderCancelUiState$HeaderImage$Content) obj;
        return this.a == orderCancelUiState$HeaderImage$Content.a && jl40.l(this.b, orderCancelUiState$HeaderImage$Content.b) && jl40.l(this.c, orderCancelUiState$HeaderImage$Content.c) && jl40.l(this.d, orderCancelUiState$HeaderImage$Content.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.b;
        int hashCode2 = (hashCode + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(alignment=");
        sb.append(this.a);
        sb.append(", drawableWrapper=");
        sb.append(this.b);
        sb.append(", caption=");
        return g8e.r(sb, this.c, ", rating=", this.d, Extension.C_BRAKE);
    }

    public OrderCancelUiState$HeaderImage$Content() {
        this(null, 15);
    }

    public /* synthetic */ OrderCancelUiState$HeaderImage$Content(Alignment alignment, int i) {
        this((i & 1) != 0 ? Alignment.LEADING : alignment, null, null, null);
    }
}
