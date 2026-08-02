package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.o8s0;
import defpackage.sq20;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/ModalItemDto$StepsInstructionsItem", "Lcom/yandex/go/taxi/order/models/api/response/u0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/t0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ModalItemDto$StepsInstructionsItem extends u0 {
    public static final t0 Companion = new t0();
    public static final i3y[] g;
    public final String a;
    public final FormattedText b;
    public final jsq0 c;
    public final o8s0 d;
    public final TotwPromotionWidgets e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new sq20(19)), null, null, kotlin.a.b(lazyThreadSafetyMode, new sq20(20))};
    }

    public ModalItemDto$StepsInstructionsItem(int i, String str, FormattedText formattedText, jsq0 jsq0Var, o8s0 o8s0Var, TotwPromotionWidgets totwPromotionWidgets, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jsq0Var;
        }
        if ((i & 8) == 0) {
            this.d = new o8s0(15);
        } else {
            this.d = o8s0Var;
        }
        if ((i & 16) == 0) {
            this.e = new TotwPromotionWidgets(0);
        } else {
            this.e = totwPromotionWidgets;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.u0
    /* renamed from: a, reason: from getter */
    public final jsq0 getC() {
        return this.c;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.u0
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.u0
    /* renamed from: c, reason: from getter */
    public final o8s0 getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalItemDto$StepsInstructionsItem)) {
            return false;
        }
        ModalItemDto$StepsInstructionsItem modalItemDto$StepsInstructionsItem = (ModalItemDto$StepsInstructionsItem) obj;
        return jl40.l(this.a, modalItemDto$StepsInstructionsItem.a) && jl40.l(this.b, modalItemDto$StepsInstructionsItem.b) && jl40.l(this.c, modalItemDto$StepsInstructionsItem.c) && jl40.l(this.d, modalItemDto$StepsInstructionsItem.d) && jl40.l(this.e, modalItemDto$StepsInstructionsItem.e) && jl40.l(this.f, modalItemDto$StepsInstructionsItem.f);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        jsq0 jsq0Var = this.c;
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((c + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31)) * 31)) * 31;
        List list = this.f;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("StepsInstructionsItem(id=", this.a, ", title=", ", displayOnType=", this.b);
        q.append(this.c);
        q.append(", showPolicy=");
        q.append(this.d);
        q.append(", widgets=");
        q.append(this.e);
        q.append(", steps=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public ModalItemDto$StepsInstructionsItem() {
        FormattedText formattedText = FormattedText.c;
        o8s0 o8s0Var = new o8s0(15);
        TotwPromotionWidgets totwPromotionWidgets = new TotwPromotionWidgets(0);
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = o8s0Var;
        this.e = totwPromotionWidgets;
        this.f = null;
    }
}
