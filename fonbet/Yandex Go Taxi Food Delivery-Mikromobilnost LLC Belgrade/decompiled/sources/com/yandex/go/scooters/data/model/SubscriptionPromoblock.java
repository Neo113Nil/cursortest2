package com.yandex.go.scooters.data.model;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock;", "", "Companion", "Badge", "Toggle", "$serializer", "com/yandex/go/scooters/data/model/m0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscriptionPromoblock {
    public static final m0 Companion = new m0();
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final Badge e;
    public final Toggle f;

    public /* synthetic */ SubscriptionPromoblock(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, Badge badge, Toggle toggle) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = badge;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = toggle;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock$Badge;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/l0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Badge {
        public static final l0 Companion = new l0();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ Badge(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        public Badge() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock$Toggle;", "", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "LegalInfo", "$serializer", "com/yandex/go/scooters/data/model/o0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Toggle {
        public static final o0 Companion = new o0();
        public final Button a;
        public final LegalInfo b;

        public /* synthetic */ Toggle(int i, Button button, LegalInfo legalInfo) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = button;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = legalInfo;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock$Toggle$Button;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/n0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Button {
            public static final n0 Companion = new n0();
            public final FormattedText a;
            public final FormattedText b;

            public /* synthetic */ Button(int i, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
            }

            public Button() {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock$Toggle$LegalInfo;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/p0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class LegalInfo {
            public static final p0 Companion = new p0();
            public final FormattedText a;
            public final String b;

            public /* synthetic */ LegalInfo(int i, String str, FormattedText formattedText) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str;
                }
            }

            public LegalInfo() {
                this.a = FormattedText.c;
                this.b = "";
            }
        }

        public Toggle() {
            this.a = null;
            this.b = null;
        }
    }

    public SubscriptionPromoblock() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = "";
        this.c = formattedText;
        this.d = formattedText;
        this.e = null;
        this.f = null;
    }
}
