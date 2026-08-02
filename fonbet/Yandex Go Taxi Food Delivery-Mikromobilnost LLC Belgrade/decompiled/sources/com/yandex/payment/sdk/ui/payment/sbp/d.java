package com.yandex.payment.sdk.ui.payment.sbp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.xplat.payment.sdk.BankListType;
import com.yandex.xplat.payment.sdk.NspkMembersSource;
import defpackage.asw;
import defpackage.cza1;
import defpackage.djm0;
import defpackage.dy40;
import defpackage.eez0;
import defpackage.ejm0;
import defpackage.fjm0;
import defpackage.g8e;
import defpackage.g8m0;
import defpackage.i3y;
import defpackage.ijm0;
import defpackage.j24;
import defpackage.jjm0;
import defpackage.jl40;
import defpackage.ljm0;
import defpackage.mp4;
import defpackage.n891;
import defpackage.nu5;
import defpackage.o3a0;
import defpackage.oy90;
import defpackage.pgk0;
import defpackage.pim0;
import defpackage.qv90;
import defpackage.rv90;
import defpackage.rwo;
import defpackage.s6k0;
import defpackage.sp4;
import defpackage.sv90;
import defpackage.t7l0;
import defpackage.tcc;
import defpackage.up4;
import defpackage.v4m0;
import defpackage.vfc;
import defpackage.vv90;
import defpackage.w04;
import defpackage.w511;
import defpackage.wj00;
import defpackage.xvf0;
import defpackage.y22;
import defpackage.y891;
import defpackage.yr31;
import defpackage.yv90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class d extends yr31 {
    public final rwo A;
    public final dy40 B = new dy40();
    public final dy40 C = new dy40();
    public List D = EmptyList.a;
    public final i3y E = kotlin.a.b(LazyThreadSafetyMode.NONE, new v4m0(9));
    public Integer F;
    public String G;
    public ejm0 H;
    public Pair I;
    public SbpViewModel$BankListState J;
    public final vv90 b;
    public final pim0 c;
    public final String w;
    public final SbpOperation x;
    public final SharedPreferences y;
    public final String z;

    public d(vv90 vv90Var, pim0 pim0Var, String str, SbpOperation sbpOperation, SharedPreferences sharedPreferences, String str2, rwo rwoVar) {
        this.b = vv90Var;
        this.c = pim0Var;
        this.w = str;
        this.x = sbpOperation;
        this.y = sharedPreferences;
        this.z = str2;
        this.A = rwoVar;
        if (sbpOperation.equals(SbpOperation.NewTokenPay.INSTANCE) || sbpOperation.equals(SbpOperation.Pay.INSTANCE)) {
            a0(jjm0.a);
            c cVar = new c(this, 1);
            up4 up4Var = (up4) ((xvf0) ((yv90) vv90Var).h.Q).get();
            up4Var.b.o(NspkMembersSource.qr).a(new w04(6, up4Var, cVar), new j24(3, cVar));
        } else {
            if (!(sbpOperation instanceof SbpOperation.BindSbpToken)) {
                w511.b();
                throw null;
            }
            b0();
        }
        this.J = SbpViewModel$BankListState.None;
    }

    public static final String W(d dVar) {
        mp4 mp4Var = (mp4) kotlin.collections.a.S(0, dVar.D);
        if (mp4Var != null) {
            return mp4Var.b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r5 >= 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void X(d dVar, List list, boolean z) {
        Integer num;
        String str = dVar.z;
        SbpOperation sbpOperation = dVar.x;
        boolean z2 = sbpOperation instanceof SbpOperation.BindSbpToken;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((mp4) obj).e) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        } else if (!jl40.l(sbpOperation, SbpOperation.Pay.INSTANCE) && !jl40.l(sbpOperation, SbpOperation.NewTokenPay.INSTANCE)) {
            w511.b();
            return;
        }
        dVar.D = list;
        List list2 = str != null ? list : null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((mp4) it.next()).b.equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            num = Integer.valueOf(i);
        }
        num = null;
        if (num != null) {
            dVar.Y(num.intValue());
            return;
        }
        vv90 vv90Var = dVar.b;
        asw aswVar = vv90Var instanceof asw ? (asw) vv90Var : null;
        boolean o = n891.o(aswVar != null ? Boolean.valueOf(((yv90) aswVar).d()) : null);
        if (jl40.l(sbpOperation, SbpOperation.NewTokenPay.INSTANCE) || z2) {
            o = true;
        } else if (!jl40.l(sbpOperation, SbpOperation.Pay.INSTANCE)) {
            w511.b();
            return;
        }
        dVar.a0(new fjm0(list, o, z));
    }

    public static ArrayList c0(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((mp4) it.next()).b);
        }
        return new ArrayList(arrayList);
    }

    @Override // defpackage.yr31
    public final void V() {
        ((eez0) this.E.getValue()).a();
    }

    public final void Y(int i) {
        BankListType bankListType;
        mp4 mp4Var = (mp4) this.D.get(i);
        o3a0.g.a(mp4Var.a);
        sv90 sv90Var = qv90.a;
        String str = mp4Var.a;
        String str2 = mp4Var.b;
        Integer num = this.F;
        boolean z = num != null && i == num.intValue();
        int i2 = b.a[this.J.ordinal()];
        if (i2 == 1) {
            bankListType = BankListType.UNKNOWN;
        } else if (i2 == 2) {
            bankListType = BankListType.INSTALLED;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            bankListType = BankListType.OTHER;
        }
        sv90Var.getClass();
        String concat = "Открытие приложения банка ".concat(str);
        if (z) {
            concat = concat.concat(", находящегося в избранном");
        }
        int i3 = rv90.i[bankListType.ordinal()];
        String p = g8e.p(g8e.p(concat, Extension.FIX_SPACE, i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : "из неизвестного списка" : "из полного списка" : "из списка установленных"), ", scheme = ", str2);
        wj00 i4 = vfc.i(0, "value", str, "scheme", str2);
        i4.i("is_favorite", z);
        i4.k("type_bank_list", bankListType.getValue());
        i4.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        ((y22) this.A).a(y891.c("sbp_start_bank_app", i4));
        a0(new ijm0(0));
        ((eez0) this.E.getValue()).c(3L, new djm0(this, 1));
        this.G = str2;
        Pair pair = this.I;
        if (pair != null) {
            Z(mp4Var, (Uri) pair.c(), (String) pair.f());
            return;
        }
        t7l0 t7l0Var = new t7l0(13, this, mp4Var);
        s6k0 s6k0Var = new s6k0(this, mp4Var, t7l0Var);
        SbpOperation sbpOperation = this.x;
        if (sbpOperation instanceof SbpOperation.BindSbpToken) {
            pgk0 pgk0Var = new pgk0(9, this);
            nu5 nu5Var = ((yv90) this.b).j;
            String redirectUrl = ((SbpOperation.BindSbpToken) sbpOperation).getRedirectUrl();
            nu5Var.b(redirectUrl != null ? redirectUrl : "", new g8m0(17, t7l0Var), pgk0Var);
            return;
        }
        boolean l = jl40.l(sbpOperation, SbpOperation.NewTokenPay.INSTANCE);
        String str3 = this.w;
        pim0 pim0Var = this.c;
        if (l) {
            ((oy90) pim0Var).b(str3, s6k0Var);
        } else if (jl40.l(sbpOperation, SbpOperation.Pay.INSTANCE)) {
            ((oy90) pim0Var).e(str3, s6k0Var);
        } else {
            w511.b();
        }
    }

    public final void Z(mp4 mp4Var, Uri uri, String str) {
        String str2 = mp4Var.f;
        if (str == null) {
            str = "";
        }
        ejm0 ejm0Var = new ejm0(new Intent("android.intent.action.VIEW", cza1.b(str2, str, uri.getQuery())), mp4Var.b, str2);
        this.H = ejm0Var;
        this.C.m(ejm0Var);
    }

    public final void a0(ljm0 ljm0Var) {
        ((eez0) this.E.getValue()).b("INFO_TIMER_TAG");
        this.B.m(ljm0Var);
    }

    public final void b0() {
        a0(jjm0.a);
        int i = 0;
        c cVar = new c(this, i);
        SbpOperation.NewTokenPay newTokenPay = SbpOperation.NewTokenPay.INSTANCE;
        SbpOperation sbpOperation = this.x;
        boolean l = jl40.l(sbpOperation, newTokenPay);
        vv90 vv90Var = this.b;
        if (l || jl40.l(sbpOperation, SbpOperation.Pay.INSTANCE)) {
            ((yv90) vv90Var).b(cVar);
            return;
        }
        if (!(sbpOperation instanceof SbpOperation.BindSbpToken)) {
            w511.b();
            return;
        }
        up4 up4Var = (up4) ((xvf0) ((yv90) vv90Var).h.Q).get();
        up4Var.getClass();
        up4Var.b.o(NspkMembersSource.sub).a(new sp4(cVar, i), new sp4(cVar, 1));
    }
}
