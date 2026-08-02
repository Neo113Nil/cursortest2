package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import defpackage.avu0;
import defpackage.b64;
import defpackage.cvu0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nhz0;
import defpackage.scc;
import defpackage.sls;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TipsVariant;", "", "Companion", "TipsChoice", "Match", "CustomizedOptions", "com/yandex/go/taxi/order/models/api/response/r8", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsVariant {
    public static final r8 Companion = new r8();
    public static final i3y[] e;
    public static final TipsVariant f;
    public final List a;
    public final CustomizedOptions b;
    public final Match c;
    public final i3y d;

    static {
        int i = 2;
        e = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(i)), null, null};
        TipsType tipsType = TipsType.PERCENT;
        f = new TipsVariant(scc.g(new TipsChoice(tipsType, 0.0f, "0", i), new TipsChoice(tipsType, 5.0f, "5", i), new TipsChoice(tipsType, 10.0f, "10", i), new TipsChoice(tipsType, 15.0f, "15", i)), 6);
    }

    public /* synthetic */ TipsVariant(int i, List list, CustomizedOptions customizedOptions, Match match) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = customizedOptions;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = match;
        }
        final int i2 = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: eiz0
            public final /* synthetic */ TipsVariant b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                TipsVariant tipsVariant = this.b;
                switch (i3) {
                }
                return TipsVariant.c(tipsVariant.a);
            }
        });
    }

    public static List c(List list) {
        Float j;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TipsChoice tipsChoice = (TipsChoice) it.next();
            String a = tipsChoice.a();
            if (a == null || (j = avu0.j(a)) == null) {
                return EmptyList.a;
            }
            arrayList.add(new TipsChoice(tipsChoice.a, tipsChoice.b, j.floatValue(), tipsChoice.d));
        }
        return arrayList;
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final TipsType b() {
        TipsType tipsType;
        TipsChoice tipsChoice = (TipsChoice) kotlin.collections.a.R(a());
        return (tipsChoice == null || (tipsType = tipsChoice.a) == null) ? TipsType.PERCENT : tipsType;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TipsVariant$Match;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/t8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Match {
        public static final t8 Companion = new t8();
        public final int a;
        public final int b;

        public /* synthetic */ Match(int i, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Match)) {
                return false;
            }
            Match match = (Match) obj;
            return this.a == match.a && this.b == match.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return b64.d(this.a, this.b, "Match(maxRating=", ", minRating=", Extension.C_BRAKE);
        }

        public Match() {
            this.a = 0;
            this.b = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TipsVariant$TipsChoice;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/u8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TipsChoice {
        public static final u8 Companion = new u8();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(3)), null, null};
        public final TipsType a;
        public final String b;
        public final float c;
        public final String d;

        public /* synthetic */ TipsChoice(int i, TipsType tipsType, String str, float f) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = tipsType;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = 0.0f;
            } else {
                this.c = f;
            }
            this.d = null;
        }

        public final String a() {
            String str = this.d;
            if (str == null) {
                str = null;
                String str2 = this.b;
                if (str2 == null || str2.length() == 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    return cvu0.v(str2, ",", Extension.DOT_CHAR, false);
                }
            }
            return str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!TipsChoice.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            TipsChoice tipsChoice = (TipsChoice) obj;
            return this.a == tipsChoice.a && jl40.l(this.b, tipsChoice.b);
        }

        public final int hashCode() {
            TipsType tipsType = this.a;
            int hashCode = (tipsType != null ? tipsType.hashCode() : 0) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TipsChoice() {
            this((TipsType) null, 0.0f, (String) (0 == true ? 1 : 0), 15);
        }

        public TipsChoice(TipsType tipsType, String str, float f, String str2) {
            this.a = tipsType;
            this.b = str;
            this.c = f;
            this.d = str2;
        }

        public /* synthetic */ TipsChoice(TipsType tipsType, float f, String str, int i) {
            this((i & 1) != 0 ? null : tipsType, (String) null, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TipsVariant$CustomizedOptions;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/s8", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CustomizedOptions {
        public static final s8 Companion = new s8();
        public static final CustomizedOptions e = new CustomizedOptions(0);
        public final int a;
        public final boolean b;
        public final String c;
        public final String d;

        public /* synthetic */ CustomizedOptions(int i, int i2, boolean z, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomizedOptions)) {
                return false;
            }
            CustomizedOptions customizedOptions = (CustomizedOptions) obj;
            return this.a == customizedOptions.a && this.b == customizedOptions.b && jl40.l(this.c, customizedOptions.c) && jl40.l(this.d, customizedOptions.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomizedOptions(decimalDigitsCount=");
            sb.append(this.a);
            sb.append(", manualEntryAllowed=");
            sb.append(this.b);
            sb.append(", rawMinValue=");
            return g8e.r(sb, this.c, ", rawMaxValue=", this.d, Extension.C_BRAKE);
        }

        public CustomizedOptions(int i) {
            this.a = 0;
            this.b = false;
            this.c = "";
            this.d = "";
        }

        public CustomizedOptions() {
            this(0);
        }
    }

    public TipsVariant() {
        this(null, 7);
    }

    public TipsVariant(List list, int i) {
        this.a = (i & 1) != 0 ? EmptyList.a : list;
        this.b = null;
        this.c = null;
        final int i2 = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: eiz0
            public final /* synthetic */ TipsVariant b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                TipsVariant tipsVariant = this.b;
                switch (i3) {
                }
                return TipsVariant.c(tipsVariant.a);
            }
        });
    }
}
