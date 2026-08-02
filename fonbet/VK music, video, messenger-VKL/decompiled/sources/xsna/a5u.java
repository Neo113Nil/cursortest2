package xsna;

import android.content.Context;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.kjf0;

/* compiled from: GoodFragmentUIDelegate.kt */
/* loaded from: classes18.dex */
public final class a5u {
    public static final bpn0 d;
    public static final List<Integer> e;
    public static final ListBuilder f;
    public static final List<Integer> g;
    public final qdz a;
    public final sld0 b;
    public final wyp0 c;

    /* compiled from: GoodFragmentUIDelegate.kt */
    public static final class a {
        public final VerifyInfo a;
        public final UserId b;
        public final CommonMarketStat$TypeRefSource c;
        public final UserId d;
        public final boolean e;
        public final Context f;

        public a(VerifyInfo verifyInfo, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, UserId userId2, boolean z, Context context) {
            this.a = verifyInfo;
            this.b = userId;
            this.c = commonMarketStat$TypeRefSource;
            this.d = userId2;
            this.e = z;
            this.f = context;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b(bh10.a((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b.b)) * 31, 31, this.d.b), 31, this.e);
        }

        public final String toString() {
            return "Params(verifyInfo=" + this.a + ", contactId=" + this.b + ", source=" + this.c + ", ownerId=" + this.d + ", isTablet=" + this.e + ", context=" + this.f + ')';
        }
    }

    static {
        bpn0 bpn0Var = new bpn0(new z34(14));
        d = bpn0Var;
        e = e43.l(11, 12);
        ListBuilder e2 = e43.e();
        e2.addAll(e43.l(17, 2, 5, 7, 16));
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            e2.remove((Object) 16);
        }
        f = e2.g();
        g = e43.l(21, 13, 4, 3);
    }

    public a5u(qdz qdzVar, sld0 sld0Var) {
        this.a = qdzVar;
        this.b = sld0Var;
        this.c = new wyp0(new vyp0(), sld0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(cxo cxoVar, kjf0.a aVar) {
        int i;
        jid0 jid0Var;
        Object obj;
        int i2 = aVar.a;
        ArrayList arrayList = cxoVar.n;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (i2 == ((kjf0.a) obj).a) {
                        break;
                    }
                }
            }
            kjf0.a aVar2 = (kjf0.a) obj;
            if (aVar2 != null) {
                i = aVar2.c;
                Object obj2 = aVar.b;
                kjf0.a a2 = i == 2 ? i != 4 ? i != 6 ? kjf0.a.a(i2, obj2) : kjf0.a.c(i2, obj2) : new kjf0.a(i2, obj2, 4) : kjf0.a.b(i2, obj2);
                jid0Var = cxoVar.G;
                if (jid0Var == null) {
                    jid0Var.A0(a2);
                    return;
                }
                return;
            }
        }
        i = aVar.c;
        Object obj22 = aVar.b;
        if (i == 2) {
        }
        jid0Var = cxoVar.G;
        if (jid0Var == null) {
        }
    }
}
