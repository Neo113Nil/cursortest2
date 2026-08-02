package com.yandex.go.chargers.offer.passes.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xlf0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.XAdES.cl_63;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/model/PurchaseInfo;", "", "Companion", cl_63.t, "$serializer", "com/yandex/go/chargers/offer/passes/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PurchaseInfo {
    public static final h Companion = new h();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(16))};
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final List d;

    public /* synthetic */ PurchaseInfo(int i, List list, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
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
            this.d = list;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/model/PurchaseInfo$Description;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/passes/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Description {
        public static final i Companion = new i();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ Description(int i, String str, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public Description() {
            this.a = null;
            this.b = null;
        }
    }

    public PurchaseInfo() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
