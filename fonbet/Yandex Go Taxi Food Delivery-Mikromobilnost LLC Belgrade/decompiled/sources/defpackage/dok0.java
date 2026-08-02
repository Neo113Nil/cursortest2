package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.y;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final /* synthetic */ class dok0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ dok0(int i) {
        this.a = 23;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 8;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Boolean.valueOf(!jl40.l(((bok0) obj).i, ((bok0) obj2).i));
            case 1:
                ((y) obj).c0((bok0) obj2);
                return zy11Var;
            case 2:
                return Boolean.valueOf(!((bok0) obj).d.equals(((bok0) obj2).d));
            case 3:
                bok0 bok0Var = (bok0) obj2;
                ((y) obj).T.renderTitle(bok0Var.d, bok0Var.j);
                return zy11Var;
            case 4:
                return Boolean.valueOf(!jl40.l(((cpk0) obj).d, ((cpk0) obj2).d));
            case 5:
                List<bpk0> list = ((cpk0) obj2).d;
                int i3 = a0.U;
                ((a0) obj).R.updateTips(list);
                return zy11Var;
            case 6:
                return Boolean.valueOf(!jl40.l(((cpk0) obj).c, ((cpk0) obj2).c));
            case 7:
                a0 a0Var = (a0) obj;
                cpk0 cpk0Var = (cpk0) obj2;
                xss0 xss0Var = cpk0Var.c;
                akk0 akk0Var = cpk0Var.e;
                int i4 = a0.U;
                a0Var.R.updatePreferredTipsSubscription(xss0Var, new vxj0(i2, a0Var, akk0Var));
                return zy11Var;
            case 8:
                return Boolean.valueOf(!jl40.l(((lpk0) obj).d, ((lpk0) obj2).d));
            case 9:
                CharSequence charSequence = ((lpk0) obj2).d;
                int i5 = b0.U;
                ((b0) obj).R.updateSubtitle(charSequence);
                return zy11Var;
            case 10:
                return Boolean.valueOf(!jl40.l(((lpk0) obj).i, ((lpk0) obj2).i));
            case 11:
                List<bpk0> list2 = ((lpk0) obj2).i;
                int i6 = b0.U;
                ((b0) obj).R.updateTips(list2);
                return zy11Var;
            case 12:
                return Boolean.valueOf(!jl40.l(((lpk0) obj).e, ((lpk0) obj2).e));
            case 13:
                hg4 hg4Var = ((lpk0) obj2).e;
                int i7 = b0.U;
                ((b0) obj).R.updateTipsWishCardBackground(hg4Var);
                return zy11Var;
            case 14:
                return Boolean.valueOf(((lpk0) obj).f != ((lpk0) obj2).f);
            case 15:
                int i8 = ((lpk0) obj2).f;
                int i9 = b0.U;
                ((b0) obj).R.updateBackgroundCornerRadius(i8);
                return zy11Var;
            case 16:
                lpk0 lpk0Var = (lpk0) obj2;
                return Boolean.valueOf(!jl40.l(((lpk0) obj).g, lpk0Var.g) || (lpk0Var.g instanceof ipk0));
            case 17:
                kpk0 kpk0Var = ((lpk0) obj2).g;
                int i10 = b0.U;
                ((b0) obj).R.updateMediaContent(kpk0Var);
                return zy11Var;
            case 18:
                return Boolean.valueOf(!jl40.l(((lpk0) obj).h, ((lpk0) obj2).h));
            case 19:
                b0 b0Var = (b0) obj;
                lpk0 lpk0Var2 = (lpk0) obj2;
                xss0 xss0Var2 = lpk0Var2.h;
                akk0 akk0Var2 = lpk0Var2.j;
                int i11 = b0.U;
                b0Var.R.updatePreferredTipsSubscription(xss0Var2, new vxj0(9, b0Var, akk0Var2));
                return zy11Var;
            case 20:
                return Boolean.valueOf(!jl40.l(((lpk0) obj).c, ((lpk0) obj2).c));
            case 21:
                CharSequence charSequence2 = ((lpk0) obj2).c;
                int i12 = b0.U;
                ((b0) obj).R.updateTitle(charSequence2);
                return zy11Var;
            case 22:
                return u161.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 23:
                ((Integer) obj2).getClass();
                ut91.j((fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ik31 ik31Var = (ik31) obj;
                ik31 ik31Var2 = (ik31) obj2;
                pex0 pex0Var = ik31Var.b.a;
                pex0 pex0Var2 = ik31Var2.b.a;
                if (ik31Var.c == ik31Var2.c && pex0Var.h.a == pex0Var2.h.a && jl40.l(pex0Var.r, pex0Var2.r) && jl40.l(pex0Var.e(), pex0Var2.e())) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 25:
                ((Integer) obj).intValue();
                return ((afl0) obj2).h;
            case 26:
                ((Integer) obj).intValue();
                return (String) obj2;
            case 27:
                ((Integer) obj).getClass();
                return ((m9j) obj2).a;
            case 28:
                j1m0 j1m0Var = (j1m0) obj2;
                Map map = j1m0Var.a;
                hz40 hz40Var = j1m0Var.b;
                Object[] objArr = hz40Var.b;
                Object[] objArr2 = hz40Var.c;
                long[] jArr = hz40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr[i13];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    Object obj3 = objArr[i16];
                                    Map a = ((l1m0) objArr2[i16]).a();
                                    if (a.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, a);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i14 != 8) {
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            default:
                return Boolean.valueOf(!jl40.l(((s2x) obj).c.a, ((s2x) obj2).c.a));
        }
    }

    public /* synthetic */ dok0(byte b, int i) {
        this.a = i;
    }
}
