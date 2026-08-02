package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhpj0;", "", "Companion", "fpj0", "gpj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class hpj0 {
    public static final gpj0 Companion = new gpj0();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(28)), null, null, null};
    public final Map a;
    public final String b;
    public final String c;
    public final String d;
    public final i3y e;

    public /* synthetic */ hpj0(Map map, String str, String str2, String str3, int i) {
        this.a = (i & 1) == 0 ? b.f() : map;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = a.a(new csf0(10, this));
    }

    public hpj0() {
        this(0);
    }

    public hpj0(int i) {
        this.a = b.f();
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = a.a(new vyf0(20, this));
    }
}
