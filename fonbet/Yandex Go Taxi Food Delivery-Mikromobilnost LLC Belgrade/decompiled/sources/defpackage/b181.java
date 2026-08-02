package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.gm2;
import yads.hm2;
import yads.o3;

/* loaded from: classes7.dex */
public final class b181 {
    public final v981 a;
    public final d881 b;
    public final fe81 c;
    public final st81 d;
    public final jh81 e;
    public final iz71 f;
    public final hlx0 g;
    public final hn71 h;
    public final rz61 i;
    public final ke71 j;

    public b181(Context context, v981 v981Var, d881 d881Var, fe81 fe81Var, st81 st81Var, jh81 jh81Var, iz71 iz71Var) {
        pb81 pb81Var = new pb81(context, fe81Var, v981Var);
        hlx0 hlx0Var = new hlx0(context, fe81Var, v981Var, d881Var);
        hn71 hn71Var = new hn71(pb81Var);
        rz61 rz61Var = new rz61(st81Var);
        ke71 ke71Var = new ke71();
        this.a = v981Var;
        this.b = d881Var;
        this.c = fe81Var;
        this.d = st81Var;
        this.e = jh81Var;
        this.f = iz71Var;
        this.g = hlx0Var;
        this.h = hn71Var;
        this.i = rz61Var;
        this.j = ke71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r8.length() > 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, fj71 fj71Var, na81 na81Var, vw81 vw81Var, mk81 mk81Var, ContinuationImpl continuationImpl) {
        o3 o3Var;
        int i;
        String str;
        bk61 bk61Var;
        xz4 xz4Var;
        gm2 gm2Var;
        String str2;
        b081 b081Var;
        ms71 ms71Var;
        xz4 xz4Var2;
        if (continuationImpl instanceof o3) {
            o3Var = (o3) continuationImpl;
            int i2 = o3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o3Var.h = i2 - Integer.MIN_VALUE;
                Object obj = o3Var.f;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o3Var.h;
                if (i != 0) {
                    b.b(obj);
                    ArrayList arrayList = fj71Var.a;
                    o3Var.b = view;
                    o3Var.c = fj71Var;
                    o3Var.d = vw81Var;
                    o3Var.e = mk81Var;
                    o3Var.h = 1;
                    obj = na81Var.a(view, arrayList, o3Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mk81Var = o3Var.e;
                    vw81Var = o3Var.d;
                    fj71Var = o3Var.c;
                    view = o3Var.b;
                    b.b(obj);
                }
                b391 b391Var = (b391) obj;
                Long l = this.f.a;
                LinkedHashMap a = this.j.a(view, new Long(l == null ? SystemClock.elapsedRealtime() - l.longValue() : 0L));
                str = fj71Var.d;
                bk61Var = b391Var.b;
                ms71 ms71Var2 = bk61Var == null ? bk61Var.a : null;
                List list = fj71Var.c;
                if (str != null) {
                    vw81Var.getClass();
                }
                str = null;
                if (str == null) {
                    gr81 gr81Var = vw81Var.a;
                    String a2 = ((jj71) gr81Var.c).a(str, kotlin.collections.b.f());
                    xz4Var = a2.length() > 0 ? ((vmn0) gr81Var.b).a(a2) : new r481(gm2.e);
                } else {
                    xz4Var = null;
                }
                vw81Var.b.l(list, un61.b(ms71Var2, xz4Var), a);
                un61 un61Var = mk81Var.b;
                boolean z = !((ArrayList) un61.a(xz4Var, bk61Var)).isEmpty();
                gm2Var = xz4Var == null ? (gm2) xz4Var.a : null;
                gm2 gm2Var2 = (bk61Var != null || (xz4Var2 = bk61Var.b) == null) ? null : (gm2) xz4Var2.a;
                gm2 gm2Var3 = gm2.d;
                if ((bk61Var == null ? bk61Var.a : null) == null) {
                    gm2Var3 = null;
                }
                if (gm2Var == null) {
                    gm2Var = gm2Var2 == null ? gm2Var3 == null ? gm2.e : gm2Var3 : gm2Var2;
                }
                q781 q781Var = !(xz4Var instanceof q781) ? (q781) xz4Var : null;
                str2 = q781Var == null ? q781Var.c : null;
                xz4 xz4Var3 = bk61Var == null ? bk61Var.b : null;
                q781 q781Var2 = !(xz4Var3 instanceof q781) ? (q781) xz4Var3 : null;
                String str3 = q781Var2 == null ? q781Var2.c : null;
                String str4 = (bk61Var != null || (ms71Var = bk61Var.a) == null) ? null : ms71Var.b;
                if (str2 == null) {
                    str2 = str3 == null ? str4 : str3;
                }
                String g = zla1.g(str2);
                if (((ArrayList) un61.a(xz4Var, bk61Var)).size() != 1) {
                    if (xz4Var == null) {
                        xz4Var = bk61Var != null ? bk61Var.b : null;
                    }
                    b081Var = un61.b(bk61Var != null ? bk61Var.a : null, xz4Var);
                } else {
                    b081Var = sq71.a;
                }
                Map i3 = kotlin.collections.b.i(new Pair("click_handled", Boolean.valueOf(z)), new Pair("click_type", gm2Var.b), new Pair("click_url", g), new Pair("click_destination", n381.a(b081Var)));
                vmn0 vmn0Var = mk81Var.a;
                hm2 hm2Var = hm2.r;
                zj71 b = vmn0Var.b(hm2Var, i3);
                ((ge71) vmn0Var.w).c(b);
                ((mj31) vmn0Var.y).t(hm2Var, b.b, g771.a, null);
                return b391Var;
            }
        }
        o3Var = new o3(this, continuationImpl);
        Object obj3 = o3Var.f;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o3Var.h;
        if (i != 0) {
        }
        b391 b391Var2 = (b391) obj3;
        Long l2 = this.f.a;
        LinkedHashMap a3 = this.j.a(view, new Long(l2 == null ? SystemClock.elapsedRealtime() - l2.longValue() : 0L));
        str = fj71Var.d;
        bk61Var = b391Var2.b;
        if (bk61Var == null) {
        }
        List list2 = fj71Var.c;
        if (str != null) {
        }
        str = null;
        if (str == null) {
        }
        vw81Var.b.l(list2, un61.b(ms71Var2, xz4Var), a3);
        un61 un61Var2 = mk81Var.b;
        boolean z2 = !((ArrayList) un61.a(xz4Var, bk61Var)).isEmpty();
        if (xz4Var == null) {
        }
        if (bk61Var != null) {
        }
        gm2 gm2Var32 = gm2.d;
        if ((bk61Var == null ? bk61Var.a : null) == null) {
        }
        if (gm2Var == null) {
        }
        if (!(xz4Var instanceof q781)) {
        }
        if (q781Var == null) {
        }
        if (bk61Var == null) {
        }
        if (!(xz4Var3 instanceof q781)) {
        }
        if (q781Var2 == null) {
        }
        if (bk61Var != null) {
        }
        if (str2 == null) {
        }
        String g2 = zla1.g(str2);
        if (((ArrayList) un61.a(xz4Var, bk61Var)).size() != 1) {
        }
        Map i32 = kotlin.collections.b.i(new Pair("click_handled", Boolean.valueOf(z2)), new Pair("click_type", gm2Var.b), new Pair("click_url", g2), new Pair("click_destination", n381.a(b081Var)));
        vmn0 vmn0Var2 = mk81Var.a;
        hm2 hm2Var2 = hm2.r;
        zj71 b2 = vmn0Var2.b(hm2Var2, i32);
        ((ge71) vmn0Var2.w).c(b2);
        ((mj31) vmn0Var2.y).t(hm2Var2, b2.b, g771.a, null);
        return b391Var2;
    }
}
