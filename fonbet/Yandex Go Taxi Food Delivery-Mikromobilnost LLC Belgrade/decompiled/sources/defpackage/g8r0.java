package defpackage;

import android.net.Uri;
import androidx.compose.ui.semantics.f;
import com.yandex.go.agreement.router.d;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.l;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import java.util.ArrayList;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes12.dex */
public final /* synthetic */ class g8r0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ g8r0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [gcu0] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 4;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        String str = this.b;
        switch (i) {
            case 0:
                f.s((mnq0) obj, str);
                return zy11Var;
            case 1:
                ljp ljpVar = ((kjp) obj).a;
                ljpVar.A((m950) ljpVar.Q.get(), str, sy60.Q2);
                return zy11Var;
            case 2:
                kjp kjpVar = (kjp) obj;
                kjpVar.getClass();
                kjpVar.a.H.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
                return zy11Var;
            case 3:
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("DELETE FROM objects_to_share WHERE user_id = ?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 4:
                oll0 oll0Var2 = (oll0) obj;
                ull0 T02 = oll0Var2.T0("DELETE FROM objects_to_share WHERE chat_id = ?");
                try {
                    T02.g1(1, str);
                    T02.q();
                    int x2 = jx81.x(oll0Var2);
                    T02.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 5:
                d.P(((cl1) obj).a, str);
                return zy11Var;
            case 6:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, str);
                return zy11Var;
            case 7:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.p(mnq0Var2, 0);
                f.l(mnq0Var2, str);
                return zy11Var;
            case 8:
                ull0 T03 = ((oll0) obj).T0("SELECT internal_id FROM stable_chat_internal_id WHERE id = ? UNION SELECT 0 ORDER BY 1 DESC LIMIT 1");
                try {
                    T03.g1(1, str);
                    long j = T03.q() ? T03.getLong(0) : 0L;
                    T03.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 9:
                ull0 T04 = ((oll0) obj).T0("SELECT COUNT(*) FROM user_sticker_packs WHERE user_sticker_pack_id = ?");
                try {
                    T04.g1(1, str);
                    if (T04.q()) {
                        z = ((int) T04.getLong(0)) != 0;
                    }
                    T04.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 10:
                ull0 T05 = ((oll0) obj).T0("SELECT * FROM sticker_pack_list WHERE sticker_pack_id = ?");
                try {
                    T05.g1(1, str);
                    int r = eja1.r(T05, "row_id");
                    int r2 = eja1.r(T05, "sticker_pack_id");
                    int r3 = eja1.r(T05, "sticker_pack_cover_id");
                    int r4 = eja1.r(T05, "sticker_pack_title");
                    int r5 = eja1.r(T05, "sticker_pack_description");
                    int r6 = eja1.r(T05, "is_local_pack");
                    if (T05.q()) {
                        r4 = new gcu0(T05.isNull(r) ? null : Long.valueOf(T05.getLong(r)), T05.Y1(r2), T05.isNull(r3) ? null : T05.Y1(r3), T05.Y1(r4), T05.isNull(r5) ? null : T05.Y1(r5), ((int) T05.getLong(r6)) != 0);
                    }
                    return r4;
                } finally {
                }
            case 11:
                ull0 T06 = ((oll0) obj).T0("SELECT * FROM sticker_list WHERE sticker_pack_id = ?");
                try {
                    if (str == null) {
                        T06.p(1);
                    } else {
                        T06.g1(1, str);
                    }
                    int r7 = eja1.r(T06, "sticker_id");
                    int r8 = eja1.r(T06, "sticker_pack_id");
                    int r9 = eja1.r(T06, "sticker_original_pack_id");
                    int r10 = eja1.r(T06, "sticker_text");
                    int r11 = eja1.r(T06, "sticker_position");
                    int r12 = eja1.r(T06, "sticker_added_timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (T06.q()) {
                        arrayList.add(new ubu0((int) T06.getLong(r11), T06.isNull(r12) ? null : Long.valueOf(T06.getLong(r12)), T06.Y1(r7), T06.Y1(r8), T06.Y1(r9), T06.isNull(r10) ? null : T06.Y1(r10)));
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 12:
                ull0 T07 = ((oll0) obj).T0("DELETE FROM sticker_pack_list WHERE sticker_pack_id=?");
                try {
                    T07.g1(1, str);
                    T07.q();
                    return zy11Var;
                } finally {
                }
            case 13:
                ull0 T08 = ((oll0) obj).T0("DELETE FROM sticker_list WHERE sticker_pack_id=?");
                try {
                    T08.g1(1, str);
                    T08.q();
                    return zy11Var;
                } finally {
                }
            case 14:
                ull0 T09 = ((oll0) obj).T0("SELECT COUNT(*) FROM sticker_list WHERE sticker_pack_id=?");
                try {
                    T09.g1(1, str);
                    int i3 = T09.q() ? (int) T09.getLong(0) : 0;
                    T09.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 15:
                return Boolean.valueOf(jl40.l(((CompositeSubscriptionInfo.Stories) ((h27) obj).b()).getStoryId(), str));
            case 16:
                String str2 = (String) obj;
                return evu0.J(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
            case 17:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 18:
                e eVar = (e) obj;
                l lVar = TaxiOrderPendingChanges.Companion;
                return Boolean.valueOf(jl40.l(eVar != null ? eVar.getA() : null, str));
            case 19:
                kgx[] kgxVarArr = f.a;
                ((mnq0) obj).a(androidx.compose.ui.semantics.d.M, str);
                return zy11Var;
            case 20:
                ((k2f) obj).a.r(new wwb(str, i2));
                return zy11Var;
            case 21:
                ((k2f) obj).a.r(new wwb(str, i2));
                return zy11Var;
            case 22:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.l(mnq0Var3, str);
                f.p(mnq0Var3, 0);
                return zy11Var;
            case 23:
                mnq0 mnq0Var4 = (mnq0) obj;
                f.l(mnq0Var4, str);
                f.p(mnq0Var4, 0);
                return zy11Var;
            case 24:
                mnq0 mnq0Var5 = (mnq0) obj;
                f.l(mnq0Var5, str);
                f.p(mnq0Var5, 0);
                return zy11Var;
            case 25:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 26:
                ((ygz0) obj).n(str);
                return zy11Var;
            case 27:
                ((ygz0) obj).n(str);
                return zy11Var;
            case 28:
                return wk01.b((wk01) obj, null, null, this.b, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -17, 15);
            default:
                wk01 wk01Var = (wk01) obj;
                if (str == null) {
                    str = "";
                }
                return wk01.b(wk01Var, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, str, false, null, null, null, null, null, null, null, -16777217, 15);
        }
    }
}
