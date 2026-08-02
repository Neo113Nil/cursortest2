package com.yandex.go.chargers.partner_subscription.data;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/partner_subscription/data/ChargersPartnerSubscriptionInfoResponse;", "", "Companion", "Term", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/chargers/partner_subscription/data/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPartnerSubscriptionInfoResponse {
    public static final h Companion = new h();
    public static final i3y[] f;
    public final FormattedText a;
    public final List b;
    public final FormattedText c;
    public final List d;
    public final LoyaltyTermsLink e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new nba(4)), null, kotlin.a.b(lazyThreadSafetyMode, new nba(5)), null};
    }

    public /* synthetic */ ChargersPartnerSubscriptionInfoResponse(int i, FormattedText formattedText, List list, FormattedText formattedText2, List list2, LoyaltyTermsLink loyaltyTermsLink) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = loyaltyTermsLink;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/partner_subscription/data/ChargersPartnerSubscriptionInfoResponse$Term;", "", "Companion", "$serializer", "com/yandex/go/chargers/partner_subscription/data/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Term {
        public static final i Companion = new i();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ Term(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        public Term() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/partner_subscription/data/ChargersPartnerSubscriptionInfoResponse$Button;", "", "Companion", "com/yandex/go/chargers/partner_subscription/data/f", "$serializer", "com/yandex/go/chargers/partner_subscription/data/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Button {
        public static final g Companion = new g();
        public final FormattedText a;
        public final f b;

        public /* synthetic */ Button(int i, FormattedText formattedText, f fVar) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = e.INSTANCE;
            } else {
                this.b = fVar;
            }
        }

        public Button() {
            FormattedText formattedText = FormattedText.c;
            e eVar = e.INSTANCE;
            this.a = formattedText;
            this.b = eVar;
        }
    }

    public ChargersPartnerSubscriptionInfoResponse() {
        this.a = FormattedText.c;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = null;
        this.d = emptyList;
        this.e = null;
    }
}
