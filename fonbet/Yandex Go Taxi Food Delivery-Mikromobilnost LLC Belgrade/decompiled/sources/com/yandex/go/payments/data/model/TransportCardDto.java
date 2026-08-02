package com.yandex.go.payments.data.model;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.k4o;
import defpackage.tc01;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/payments/data/model/TransportCardDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "CardStatus", "CardBalance", "StatusDescription", "TransportCardPaymentAction", "AdditionalSettings", "$serializer", "com/yandex/go/payments/data/model/q0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransportCardDto extends u {
    public static final q0 Companion = new q0();
    public static final i3y[] n;
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final CardStatus h;
    public final CardBalance i;
    public final StatusDescription j;
    public final List k;
    public final AdditionalSettings l;
    public final ief m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/TransportCardDto$CardStatus;", "", "Companion", "com/yandex/go/payments/data/model/p0", Card.ACTIVE, "BLOCKED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CardStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CardStatus[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final CardStatus ACTIVE;
        public static final CardStatus BLOCKED;
        public static final p0 Companion;

        static {
            CardStatus cardStatus = new CardStatus(Card.ACTIVE, 0);
            ACTIVE = cardStatus;
            CardStatus cardStatus2 = new CardStatus("BLOCKED", 1);
            BLOCKED = cardStatus2;
            CardStatus[] cardStatusArr = {cardStatus, cardStatus2};
            $VALUES = cardStatusArr;
            $ENTRIES = kotlin.enums.a.a(cardStatusArr);
            Companion = new p0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(26));
        }

        public static CardStatus valueOf(String str) {
            return (CardStatus) Enum.valueOf(CardStatus.class, str);
        }

        public static CardStatus[] values() {
            return (CardStatus[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tc01(24)), null, null, kotlin.a.b(lazyThreadSafetyMode, new tc01(25)), null, null};
    }

    public TransportCardDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, String str2, String str3, String str4, String str5, String str6, CardStatus cardStatus, CardBalance cardBalance, StatusDescription statusDescription, List list, AdditionalSettings additionalSettings, ief iefVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = listPaymentMethodDto$Availability;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = CardStatus.ACTIVE;
        } else {
            this.h = cardStatus;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = cardBalance;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = statusDescription;
        }
        if ((i & 1024) == 0) {
            this.k = EmptyList.a;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            AdditionalSettings.Companion.getClass();
            this.l = AdditionalSettings.b;
        } else {
            this.l = additionalSettings;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = iefVar;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/TransportCardDto$AdditionalSettings;", "", "Companion", "com/yandex/go/payments/data/model/n0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AdditionalSettings {
        public static final n0 Companion = new n0();
        public static final AdditionalSettings b = new AdditionalSettings(0);
        public final String a;

        public /* synthetic */ AdditionalSettings(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public AdditionalSettings(int i) {
            this.a = "";
        }

        public AdditionalSettings() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/TransportCardDto$StatusDescription;", "", "Companion", "com/yandex/go/payments/data/model/r0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class StatusDescription {
        public static final r0 Companion = new r0();
        public final String a;
        public final String b;

        public /* synthetic */ StatusDescription(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public StatusDescription() {
            this.a = "";
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/TransportCardDto$CardBalance;", "", "Companion", "com/yandex/go/payments/data/model/o0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CardBalance {
        public static final o0 Companion = new o0();
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public /* synthetic */ CardBalance(String str, boolean z, boolean z2, boolean z3, int i) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z3;
            }
        }

        public CardBalance() {
            this.a = "";
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/TransportCardDto$TransportCardPaymentAction;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TransportCardPaymentAction {
        public static final s0 Companion = new s0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ TransportCardPaymentAction(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public TransportCardPaymentAction() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
        }
    }

    public TransportCardDto() {
        CardStatus cardStatus = CardStatus.ACTIVE;
        AdditionalSettings.Companion.getClass();
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = cardStatus;
        this.i = null;
        this.j = null;
        this.k = EmptyList.a;
        this.l = AdditionalSettings.b;
        this.m = null;
    }
}
