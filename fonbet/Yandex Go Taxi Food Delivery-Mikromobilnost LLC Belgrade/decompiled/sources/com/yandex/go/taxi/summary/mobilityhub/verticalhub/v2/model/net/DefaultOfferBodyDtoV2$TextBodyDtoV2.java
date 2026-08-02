package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/DefaultOfferBodyDtoV2$TextBodyDtoV2", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/f;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDtoV2$TextBodyDtoV2 extends f {
    public static final c Companion = new c();
    public final FormattedText a;
    public final q2 b;
    public final Integer c;

    public DefaultOfferBodyDtoV2$TextBodyDtoV2(int i, FormattedText formattedText, q2 q2Var, Integer num) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = q2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final q2 getB() {
        return this.b;
    }

    public DefaultOfferBodyDtoV2$TextBodyDtoV2() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = null;
    }
}
