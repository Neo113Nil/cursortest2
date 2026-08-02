package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.account.AccountInfo;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountInfoGetCmd.kt */
/* loaded from: classes2.dex */
public final class vo extends xl6<xpp<AccountInfo>> {
    public final Source b;
    public final boolean c;

    /* compiled from: AccountInfoGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ vo(Source source) {
        this(source, false);
    }

    public static xpp f(w2w w2wVar) {
        long f1 = w2wVar.f1() - w2wVar.getConfig().x;
        AccountInfo info = w2wVar.I0().r().getInfo();
        return new xpp(info, info == null || info.A < f1);
    }

    @Override // xsna.m2w
    public final String a() {
        if (this.b != Source.CACHE) {
            return "im-account-info";
        }
        return null;
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i == 2) {
            xpp f = f(w2wVar);
            return (f.c() || f.a) ? g(w2wVar) : f;
        }
        if (i == 3) {
            return g(w2wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.b == voVar.b && this.c == voVar.c;
    }

    public final xpp<AccountInfo> g(w2w w2wVar) {
        uo uoVar = new uo(w2wVar.H0().d);
        uoVar.n = this.c;
        AccountInfo zb = AccountInfo.zb((AccountInfo) bz2.c(uoVar, "AccountInfoGetApiCmd"), w2wVar.f1(), null, -33554433, 63);
        w2wVar.I0().u(new d7(zb, 1));
        return new xpp<>(zb, false);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoGetCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public vo(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }
}
