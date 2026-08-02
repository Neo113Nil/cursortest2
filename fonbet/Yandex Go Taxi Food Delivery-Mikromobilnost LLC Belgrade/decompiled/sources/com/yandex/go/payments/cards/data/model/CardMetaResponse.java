package com.yandex.go.payments.cards.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/CardMetaResponse;", "", "Companion", "CardMetaResult", "$serializer", "com/yandex/go/payments/cards/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardMetaResponse {
    public static final g Companion = new g();
    public final String a;
    public final CardMetaResult b;

    public /* synthetic */ CardMetaResponse(int i, String str, CardMetaResult cardMetaResult) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cardMetaResult;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardMetaResponse)) {
            return false;
        }
        CardMetaResponse cardMetaResponse = (CardMetaResponse) obj;
        return jl40.l(this.a, cardMetaResponse.a) && jl40.l(this.b, cardMetaResponse.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CardMetaResult cardMetaResult = this.b;
        return hashCode + (cardMetaResult != null ? cardMetaResult.hashCode() : 0);
    }

    public final String toString() {
        return "CardMetaResponse(id=" + this.a + ", result=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/CardMetaResponse$CardMetaResult;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CardMetaResult {
        public static final f Companion = new f();
        public final String a;
        public final Boolean b;

        public /* synthetic */ CardMetaResult(int i, String str, Boolean bool) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardMetaResult)) {
                return false;
            }
            CardMetaResult cardMetaResult = (CardMetaResult) obj;
            return jl40.l(this.a, cardMetaResult.a) && jl40.l(this.b, cardMetaResult.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.b;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "CardMetaResult(paymentSystem=" + this.a + ", withoutCvn=" + this.b + Extension.C_BRAKE;
        }

        public CardMetaResult() {
            this.a = null;
            this.b = null;
        }
    }

    public CardMetaResponse() {
        this.a = null;
        this.b = null;
    }
}
