package xsna;

import android.app.Activity;
import com.ironsource.C4572u;
import com.vk.superapp.advertisement.api.dto.FullscreenAdFormat;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.eq50;

/* compiled from: MyTargetFullscreenAdTypeDelegate.kt */
/* loaded from: classes6.dex */
public final class hq50 implements bxs {
    public final bpn0 a = new bpn0(new d1(28));

    /* compiled from: MyTargetFullscreenAdTypeDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FullscreenAdFormat.values().length];
            try {
                iArr[FullscreenAdFormat.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FullscreenAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FullscreenAdFormat.MULTI_INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bxs
    public final cxs a(Activity activity, di0 di0Var, df0 df0Var) {
        hox hoxVar;
        eq50 eq50Var;
        if (!b(di0Var)) {
            return null;
        }
        boolean z = df0Var.f;
        boolean z2 = df0Var.e;
        String str = df0Var.d;
        int i = df0Var.c;
        boolean z3 = df0Var.b;
        String str2 = df0Var.a;
        int i2 = di0Var.a;
        FullscreenAdFormat fullscreenAdFormat = di0Var.b;
        if (!b(di0Var)) {
            return null;
        }
        if (((Boolean) this.a.getValue()).booleanValue()) {
            int i3 = a.$EnumSwitchMapping$0[fullscreenAdFormat.ordinal()];
            if (i3 == 1) {
                ss50 ss50Var = new ss50();
                ijg0 ijg0Var = new ijg0(i2, activity);
                ijg0Var.j = new qs50(ss50Var);
                ijg0Var.h = new rs50(ss50Var);
                qnk qnkVar = ijg0Var.a.a;
                qnkVar.i(str2);
                qnkVar.h(z3 ? 2 : 1);
                if (i > 0) {
                    qnkVar.f(i);
                }
                qnkVar.g("content_id", str);
                qnkVar.g("ad_format", C4572u.j);
                gnl gnlVar = e370.m;
                (gnlVar != null ? gnlVar : null).c.getClass();
                if (z2) {
                    qnkVar.g("test_mode", "1");
                }
                if (z) {
                    qnkVar.g("is_whitelist_internet", "1");
                }
                ss50Var.b = ijg0Var;
                eq50Var = ss50Var;
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vr50 vr50Var = new vr50();
                hox hoxVar2 = new hox(i2, activity);
                hoxVar2.k = new tr50(vr50Var);
                hoxVar2.l = new sr50(vr50Var);
                hoxVar2.m = new ur50(vr50Var);
                qnk qnkVar2 = hoxVar2.a.a;
                qnkVar2.i(str2);
                qnkVar2.h(z3 ? 2 : 1);
                if (i > 0) {
                    qnkVar2.f(i);
                }
                qnkVar2.g("content_id", str);
                qnkVar2.g("ad_format", "interstitial");
                gnl gnlVar2 = e370.m;
                (gnlVar2 != null ? gnlVar2 : null).c.getClass();
                if (z2) {
                    qnkVar2.g("test_mode", "1");
                }
                if (z) {
                    qnkVar2.g("is_whitelist_internet", "1");
                }
                vr50Var.b = hoxVar2;
                eq50Var = vr50Var;
            }
        } else {
            eq50 eq50Var2 = new eq50();
            int i4 = eq50.a.$EnumSwitchMapping$0[fullscreenAdFormat.ordinal()];
            if (i4 == 1 || i4 == 2) {
                hox hoxVar3 = new hox(i2, activity);
                hoxVar3.j = new fq50(eq50Var2);
                hoxVar = hoxVar3;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ijg0 ijg0Var2 = new ijg0(i2, activity);
                ijg0Var2.j = new fq50(eq50Var2);
                hoxVar = ijg0Var2;
            }
            hoxVar.h = new gq50(eq50Var2);
            qnk qnkVar3 = hoxVar.a.a;
            qnkVar3.i(str2);
            qnkVar3.h(z3 ? 2 : 1);
            if (i > 0) {
                qnkVar3.f(i);
            }
            qnkVar3.g("content_id", str);
            qnkVar3.g("ad_format", fullscreenAdFormat.name().toLowerCase(Locale.ROOT));
            gnl gnlVar3 = e370.m;
            (gnlVar3 != null ? gnlVar3 : null).c.getClass();
            if (z2) {
                qnkVar3.g("test_mode", "1");
            }
            if (z) {
                qnkVar3.g("is_whitelist_internet", "1");
            }
            eq50Var2.b = hoxVar;
            eq50Var = eq50Var2;
        }
        return eq50Var;
    }

    @Override // xsna.bxs
    public final boolean b(di0 di0Var) {
        return di0Var.c == null && e43.l(FullscreenAdFormat.REWARD, FullscreenAdFormat.INTERSTITIAL, FullscreenAdFormat.MULTI_INTERSTITIAL).contains(di0Var.b);
    }
}
