package com.yandex.go.chargers.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.k4o;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersDebt;", "", "Companion", "OrderStatus", "$serializer", "com/yandex/go/chargers/data/model/n", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDebt {
    public static final n Companion = new n();
    public static final i3y[] k = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(16)), null, null};
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final Calendar f;
    public final String g;
    public final OrderStatus h;
    public final ief i;
    public final String j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersDebt$OrderStatus;", "", "Companion", "com/yandex/go/chargers/data/model/o", "LEASING", TlsConstants.TLS_FINISHED, "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OrderStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OrderStatus[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final o Companion;
        public static final OrderStatus FINISHED;
        public static final OrderStatus LEASING;

        static {
            OrderStatus orderStatus = new OrderStatus("LEASING", 0);
            LEASING = orderStatus;
            OrderStatus orderStatus2 = new OrderStatus(TlsConstants.TLS_FINISHED, 1);
            FINISHED = orderStatus2;
            OrderStatus[] orderStatusArr = {orderStatus, orderStatus2};
            $VALUES = orderStatusArr;
            $ENTRIES = kotlin.enums.a.a(orderStatusArr);
            Companion = new o();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(17));
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChargersDebt(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5, Calendar calendar, String str, OrderStatus orderStatus, ief iefVar, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = calendar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = orderStatus;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = iefVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str2;
        }
    }

    public ChargersDebt() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}
