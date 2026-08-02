package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg00;", "Lr73;", "Companion", "e00", "f00", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class g00 implements r73 {
    public static final f00 Companion = new f00();
    public static final i3y[] e;
    public final String a;
    public final List b;
    public final List c;
    public final i3y d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new du(15)), a.b(lazyThreadSafetyMode, new du(16))};
    }

    public /* synthetic */ g00(int i, String str, List list, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        final int i3 = 0;
        this.d = a.a(new sls(this) { // from class: d00
            public final /* synthetic */ g00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                g00 g00Var = this.b;
                switch (i4) {
                    case 0:
                        f00 f00Var = g00.Companion;
                        break;
                    default:
                        f00 f00Var2 = g00.Companion;
                        break;
                }
                return new FormattedText(g00Var.b);
            }
        });
    }

    @Override // defpackage.r73
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return jl40.l(this.a, g00Var.a) && jl40.l(this.b, g00Var.b) && jl40.l(this.c, g00Var.c);
    }

    @Override // defpackage.r73
    /* renamed from: getItems, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(xvz.r("ActionsArrowButton(color=", this.a, ", items=", this.b, ", actions="), this.c, Extension.C_BRAKE);
    }

    public g00() {
        this(null, 7);
    }

    public g00(List list, int i) {
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        list = i2 != 0 ? emptyList : list;
        this.a = "";
        this.b = emptyList;
        this.c = list;
        final int i3 = 1;
        this.d = a.a(new sls(this) { // from class: d00
            public final /* synthetic */ g00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                g00 g00Var = this.b;
                switch (i4) {
                    case 0:
                        f00 f00Var = g00.Companion;
                        break;
                    default:
                        f00 f00Var2 = g00.Companion;
                        break;
                }
                return new FormattedText(g00Var.b);
            }
        });
    }
}
