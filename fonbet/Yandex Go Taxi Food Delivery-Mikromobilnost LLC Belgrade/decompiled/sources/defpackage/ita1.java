package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public abstract class ita1 {
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [f530, qor] */
    public static final void a(d5l0 d5l0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1665169680);
        int i2 = (btsVar.k(d5l0Var) ? 4 : 2) | i;
        final int i3 = 0;
        final ?? r14 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ArrayList arrayList = d5l0Var.a;
            if (arrayList.isEmpty()) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new lbb0(d5l0Var, i, 14);
                    return;
                }
                return;
            }
            c530 c530Var = c530.a;
            float f = 1.0f;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            Throwable th = null;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1860112628);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    Throwable th2 = th;
                    scc.m();
                    throw th2;
                }
                final c5l0 c5l0Var = (c5l0) obj;
                c530 c530Var2 = c530Var;
                ?? r8 = th;
                int i6 = i4;
                float f2 = f;
                ArrayList arrayList2 = arrayList;
                ydb1.a(ljs0.c(c530Var2, f), wwg.S(-1564768819, r14, new zls() { // from class: b5l0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = i3;
                        zy11 zy11Var = zy11.a;
                        c5l0 c5l0Var2 = c5l0Var;
                        switch (i7) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj2;
                                fid fidVar2 = (fid) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    String str = c5l0Var2.c;
                                    if (str != null && str.length() != 0) {
                                        btsVar2.e0(1547198052);
                                        tdb1.d(ibp0Var, mja1.a(c5l0Var2.c, null, 6), null, null, null, null, 0.0f, 0, wwg.S(1305251202, true, new o990(27, ibp0Var, c5l0Var2), btsVar2), btsVar2, (intValue & 14) | 805306368, 254);
                                        btsVar2.t(false);
                                        break;
                                    } else {
                                        btsVar2.e0(1547406744);
                                        udb1.c(ibp0Var, c5l0Var2.d, null, null, btsVar2, intValue & 14, 14);
                                        btsVar2.t(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ebp0 ebp0Var = (ebp0) obj2;
                                fid fidVar3 = (fid) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    int i8 = intValue2;
                                    String str2 = c5l0Var2.a;
                                    ety0 ety0Var = xya1.e(btsVar3).h.a;
                                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                                    String str3 = c5l0Var2.b;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    p9b1.c(ebp0Var, str2, c530.a, appColor$Palette, ety0Var, 0, 0, str3, AppColor$Palette.Text, xya1.e(btsVar3).g.a, 0, 0, null, btsVar3, (i8 & 14) | 100666752, 0, 7728);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(550355378, r14, new zls() { // from class: b5l0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = r14;
                        zy11 zy11Var = zy11.a;
                        c5l0 c5l0Var2 = c5l0Var;
                        switch (i7) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj2;
                                fid fidVar2 = (fid) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    String str = c5l0Var2.c;
                                    if (str != null && str.length() != 0) {
                                        btsVar2.e0(1547198052);
                                        tdb1.d(ibp0Var, mja1.a(c5l0Var2.c, null, 6), null, null, null, null, 0.0f, 0, wwg.S(1305251202, true, new o990(27, ibp0Var, c5l0Var2), btsVar2), btsVar2, (intValue & 14) | 805306368, 254);
                                        btsVar2.t(false);
                                        break;
                                    } else {
                                        btsVar2.e0(1547406744);
                                        udb1.c(ibp0Var, c5l0Var2.d, null, null, btsVar2, intValue & 14, 14);
                                        btsVar2.t(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ebp0 ebp0Var = (ebp0) obj2;
                                fid fidVar3 = (fid) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    int i8 = intValue2;
                                    String str2 = c5l0Var2.a;
                                    ety0 ety0Var = xya1.e(btsVar3).h.a;
                                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                                    String str3 = c5l0Var2.b;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    p9b1.c(ebp0Var, str2, c530.a, appColor$Palette, ety0Var, 0, 0, str3, AppColor$Palette.Text, xya1.e(btsVar3).g.a, 0, 0, null, btsVar3, (i8 & 14) | 100666752, 0, 7728);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar, 438, 248);
                if (i6 != scc.f(arrayList2)) {
                    btsVar.e0(-1105158731);
                    yrl.e(r8, r8, btsVar, 0, 7);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1105118369);
                    btsVar.t(false);
                }
                th = r8;
                i4 = i5;
                c530Var = c530Var2;
                f = f2;
                arrayList = arrayList2;
                r14 = 1;
            }
            btsVar.t(false);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new o990(d5l0Var, f530Var2, i, 26);
        }
    }

    public static final String b(Context context, long j) {
        long j2 = j / 3600;
        long j3 = (j - (3600 * j2)) / 60;
        if (j2 < 1) {
            return d(kyh0.scooters_remain_time_on_item_minutes_template, j3, context);
        }
        int i = kyh0.scooters_remain_time_on_item_hours_template;
        if (j3 >= 40) {
            j2++;
        }
        return d(i, j2, context);
    }

    public static final String c(zuj0 zuj0Var, double d, int i, int i2) {
        if (d < 995.0d) {
            return ((avj0) zuj0Var).i(i2, Integer.valueOf(m810.a(m810.a(d) / 10.0d) * 10));
        }
        double pow = Math.pow(10.0d, 1.0d);
        float rint = (float) (Math.rint((((float) d) / 1000.0f) * pow) / pow);
        return ((avj0) zuj0Var).i(i, qpa1.d(((double) rint) % 1.0d) ? Integer.valueOf((int) rint) : Float.valueOf(rint));
    }

    public static final String d(int i, long j, Context context) {
        return String.format(Locale.getDefault(), context.getString(i), Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final Map e(qv0 qv0Var) {
        a0t a0tVar;
        a0t a0tVar2;
        oo0 oo0Var = qv0Var.a;
        return kotlin.collections.b.i(new Pair("lat", String.valueOf((oo0Var == null || (a0tVar2 = oo0Var.f) == null) ? null : Double.valueOf(a0tVar2.a))), new Pair("lon", String.valueOf((oo0Var == null || (a0tVar = oo0Var.f) == null) ? null : Double.valueOf(a0tVar.b))), new Pair(LaunchBrowserActivity.KEY_URI, String.valueOf(oo0Var != null ? oo0Var.c : null)), new Pair("full_name", String.valueOf(oo0Var != null ? oo0Var.e : null)), new Pair("porch", qv0Var.b), new Pair("floor", qv0Var.d), new Pair("door_phone", qv0Var.f), new Pair("apartment", qv0Var.c), new Pair("comment", qv0Var.e), new Pair("photocomments_count", Integer.valueOf(qv0Var.h.size())));
    }

    public static Object f(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
