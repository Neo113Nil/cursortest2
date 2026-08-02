package com.yandex.go.chargers.partner_subscription.data;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/partner_subscription/data/LoyaltyTermsLink;", "", "Companion", "com/yandex/go/chargers/partner_subscription/data/n", "$serializer", "com/yandex/go/chargers/partner_subscription/data/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyTermsLink {
    public static final k Companion = new k();
    public final FormattedText a;
    public final n b;

    public /* synthetic */ LoyaltyTermsLink(int i, FormattedText formattedText, n nVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = m.INSTANCE;
        } else {
            this.b = nVar;
        }
    }

    public LoyaltyTermsLink() {
        FormattedText formattedText = FormattedText.c;
        m mVar = m.INSTANCE;
        this.a = formattedText;
        this.b = mVar;
    }
}
