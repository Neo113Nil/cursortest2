package com.yandex.go.taxi.order.cancel.v2.domain.models;

import com.yandex.go.taxi.order.cancel.v2.domain.models.OrderCancelUiState$HeaderImage$Content;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.rk70;
import defpackage.ut11;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class a implements rk70 {
    public final OrderCancelUiState$HeaderImage$Content.Alignment a;
    public final UiStateDrawableWrapper b;
    public final String c;
    public final String d;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public a(OrderCancelUiState$HeaderImage$Content.Alignment alignment, UiStateDrawableWrapper uiStateDrawableWrapper, String str, String str2) {
        this.a = alignment;
        this.b = uiStateDrawableWrapper;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(alignment=");
        sb.append(this.a);
        sb.append(", drawable=");
        sb.append(this.b);
        sb.append(", caption=");
        return g8e.r(sb, this.c, ", rating=", this.d, Extension.C_BRAKE);
    }
}
