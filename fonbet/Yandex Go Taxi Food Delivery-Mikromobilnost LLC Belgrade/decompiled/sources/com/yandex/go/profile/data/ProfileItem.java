package com.yandex.go.profile.data;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rpe0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/profile/data/ProfileItem;", "", "Companion", "Id", "$serializer", "com/yandex/go/profile/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProfileItem {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(25))};
    public final Id a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b$\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/yandex/go/profile/data/ProfileItem$Id;", "", "Companion", "com/yandex/go/profile/data/b", "ADDRESS_SELECTION", "PLUS", "LINK_ACCOUNT", "SAFETY_CENTER", "HIRE_DRIVER", "CHARITY", "UGC", "B2B", "ENABLE_NOTIFICATIONS", "MAAS", "BUG_REPORT", "BUSINESS_ACCOUNT", "BUSINESS_ACCOUNT_CREATION", "FAMILY_ACCOUNT", "FAMILY_ACCOUNT_CREATION", "SPECIAL_NEEDS", Card.CARD_TYPE_CREDIT_DEBIT, "ADD_PAYMENT_METHODS", "LOGOUT", "UPGRADE_ACCOUNT", "PERSONAL_GOALS", "YANGO_BUSINESS", "FORCE_PHONISH_UPGRADE", "ULTIMA_MODE", "LOTTERY", "ORDER_HISTORY", "FAVORITES", "PROMOCODES", "SETTINGS", "INFO", "SUPPORT", "YANDEX_BANK", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Id {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Id[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Id ADDRESS_SELECTION;
        public static final Id ADD_PAYMENT_METHODS;
        public static final Id B2B;
        public static final Id BUG_REPORT;
        public static final Id BUSINESS_ACCOUNT;
        public static final Id BUSINESS_ACCOUNT_CREATION;
        public static final Id CHARITY;
        public static final b Companion;
        public static final Id ENABLE_NOTIFICATIONS;
        public static final Id FAMILY_ACCOUNT;
        public static final Id FAMILY_ACCOUNT_CREATION;
        public static final Id FAVORITES;
        public static final Id FORCE_PHONISH_UPGRADE;
        public static final Id HIRE_DRIVER;
        public static final Id INFO;
        public static final Id LINK_ACCOUNT;
        public static final Id LOGOUT;
        public static final Id LOTTERY;
        public static final Id MAAS;
        public static final Id ORDER_HISTORY;
        public static final Id PAYMENT;
        public static final Id PERSONAL_GOALS;
        public static final Id PLUS;
        public static final Id PROMOCODES;
        public static final Id SAFETY_CENTER;
        public static final Id SETTINGS;
        public static final Id SPECIAL_NEEDS;
        public static final Id SUPPORT;
        public static final Id UGC;
        public static final Id ULTIMA_MODE;
        public static final Id UNKNOWN;
        public static final Id UPGRADE_ACCOUNT;
        public static final Id YANDEX_BANK;
        public static final Id YANGO_BUSINESS;

        static {
            Id id = new Id("ADDRESS_SELECTION", 0);
            ADDRESS_SELECTION = id;
            Id id2 = new Id("PLUS", 1);
            PLUS = id2;
            Id id3 = new Id("LINK_ACCOUNT", 2);
            LINK_ACCOUNT = id3;
            Id id4 = new Id("SAFETY_CENTER", 3);
            SAFETY_CENTER = id4;
            Id id5 = new Id("HIRE_DRIVER", 4);
            HIRE_DRIVER = id5;
            Id id6 = new Id("CHARITY", 5);
            CHARITY = id6;
            Id id7 = new Id("UGC", 6);
            UGC = id7;
            Id id8 = new Id("B2B", 7);
            B2B = id8;
            Id id9 = new Id("ENABLE_NOTIFICATIONS", 8);
            ENABLE_NOTIFICATIONS = id9;
            Id id10 = new Id("MAAS", 9);
            MAAS = id10;
            Id id11 = new Id("BUG_REPORT", 10);
            BUG_REPORT = id11;
            Id id12 = new Id("BUSINESS_ACCOUNT", 11);
            BUSINESS_ACCOUNT = id12;
            Id id13 = new Id("BUSINESS_ACCOUNT_CREATION", 12);
            BUSINESS_ACCOUNT_CREATION = id13;
            Id id14 = new Id("FAMILY_ACCOUNT", 13);
            FAMILY_ACCOUNT = id14;
            Id id15 = new Id("FAMILY_ACCOUNT_CREATION", 14);
            FAMILY_ACCOUNT_CREATION = id15;
            Id id16 = new Id("SPECIAL_NEEDS", 15);
            SPECIAL_NEEDS = id16;
            Id id17 = new Id(Card.CARD_TYPE_CREDIT_DEBIT, 16);
            PAYMENT = id17;
            Id id18 = new Id("ADD_PAYMENT_METHODS", 17);
            ADD_PAYMENT_METHODS = id18;
            Id id19 = new Id("LOGOUT", 18);
            LOGOUT = id19;
            Id id20 = new Id("UPGRADE_ACCOUNT", 19);
            UPGRADE_ACCOUNT = id20;
            Id id21 = new Id("PERSONAL_GOALS", 20);
            PERSONAL_GOALS = id21;
            Id id22 = new Id("YANGO_BUSINESS", 21);
            YANGO_BUSINESS = id22;
            Id id23 = new Id("FORCE_PHONISH_UPGRADE", 22);
            FORCE_PHONISH_UPGRADE = id23;
            Id id24 = new Id("ULTIMA_MODE", 23);
            ULTIMA_MODE = id24;
            Id id25 = new Id("LOTTERY", 24);
            LOTTERY = id25;
            Id id26 = new Id("ORDER_HISTORY", 25);
            ORDER_HISTORY = id26;
            Id id27 = new Id("FAVORITES", 26);
            FAVORITES = id27;
            Id id28 = new Id("PROMOCODES", 27);
            PROMOCODES = id28;
            Id id29 = new Id("SETTINGS", 28);
            SETTINGS = id29;
            Id id30 = new Id("INFO", 29);
            INFO = id30;
            Id id31 = new Id("SUPPORT", 30);
            SUPPORT = id31;
            Id id32 = new Id("YANDEX_BANK", 31);
            YANDEX_BANK = id32;
            Id id33 = new Id("UNKNOWN", 32);
            UNKNOWN = id33;
            Id[] idArr = {id, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15, id16, id17, id18, id19, id20, id21, id22, id23, id24, id25, id26, id27, id28, id29, id30, id31, id32, id33};
            $VALUES = idArr;
            $ENTRIES = kotlin.enums.a.a(idArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(26));
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ProfileItem(int i, Id id) {
        if ((i & 1) == 0) {
            this.a = Id.UNKNOWN;
        } else {
            this.a = id;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileItem) && this.a == ((ProfileItem) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProfileItem(id=" + this.a + Extension.C_BRAKE;
    }

    public ProfileItem(Id id) {
        this.a = id;
    }

    public ProfileItem() {
        this(Id.UNKNOWN);
    }
}
