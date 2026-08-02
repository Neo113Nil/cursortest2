package com.yandex.messaging.ui.banners;

import android.content.Context;
import androidx.core.app.s0;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.auth.AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1;
import com.yandex.messaging.internal.authorized.sync.d;
import com.yandex.messaging.internal.v;
import defpackage.aey0;
import defpackage.b00;
import defpackage.bey0;
import defpackage.bvf0;
import defpackage.cey0;
import defpackage.dey0;
import defpackage.ds31;
import defpackage.eey0;
import defpackage.ffx;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.jn3;
import defpackage.jqr;
import defpackage.lqo;
import defpackage.n2v0;
import defpackage.o0k;
import defpackage.o150;
import defpackage.q0k;
import defpackage.qke;
import defpackage.r96;
import defpackage.rcy0;
import defpackage.sc5;
import defpackage.tje;
import defpackage.tz10;
import defpackage.w4b0;
import defpackage.w5t;
import defpackage.x4b0;
import defpackage.zdy0;
import defpackage.zy11;
import defpackage.zyj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public final h3y A;
    public final s0 B;
    public final r0 C = bvf0.c(Y());
    public final r0 D;
    public final zyj E;
    public o0k F;
    public long G;
    public x4b0 H;
    public boolean I;
    public final Context w;
    public final jn3 x;
    public final o150 y;
    public final lqo z;

    public a(Context context, b00 b00Var, w5t w5tVar, v vVar, q0k q0kVar, jn3 jn3Var, o150 o150Var, MessengerEnvironment messengerEnvironment, lqo lqoVar, h3y h3yVar, d dVar) {
        this.w = context;
        this.x = jn3Var;
        this.y = o150Var;
        this.z = lqoVar;
        this.A = h3yVar;
        this.B = new s0(context);
        ffx.c(0, 0, null, 7);
        this.D = bvf0.c(0);
        this.G = 0L;
        this.E = q0kVar.b("me", gvg0.avatar_size_48, new n2v0(15, this));
        e.H(ds31.a(this), new jqr(e.i(new AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1(null, jn3Var)), new TelemostBannerListViewModel$2(this, null), 3));
        zy11 zy11Var = zy11.a;
        e.H(ds31.a(this), new jqr(w5tVar.a(zy11Var), new TelemostBannerListViewModel$3(this, null), 3));
        e.H(ds31.a(this), new jqr(vVar.a(zy11Var), new TelemostBannerListViewModel$4(this, null), 3));
        e.H(ds31.a(this), new jqr(dVar.m, new TelemostBannerListViewModel$5(this, null), 3));
    }

    @Override // defpackage.yr31
    public final void V() {
        zyj zyjVar = this.E;
        if (zyjVar != null) {
            zyjVar.close();
        }
    }

    public final ArrayList Y() {
        w4b0 b;
        ArrayList arrayList = new ArrayList();
        if (this.I && ((rcy0) this.A.get()).w) {
            r96 r96Var = tz10.k;
            lqo lqoVar = this.z;
            if (lqoVar.a(r96Var) && lqoVar.a(tz10.A) && this.G == 0) {
                arrayList.add(cey0.a);
            }
        }
        Context context = this.w;
        if (qke.h(context, "android.permission.RECORD_AUDIO") != 0) {
            arrayList.add(zdy0.a);
        }
        if (qke.h(context, "android.permission.CAMERA") != 0) {
            arrayList.add(bey0.a);
        }
        if (!this.x.c()) {
            arrayList.add(aey0.a);
        }
        if (!this.B.b.areNotificationsEnabled()) {
            arrayList.add(eey0.a);
        }
        long j = this.G;
        x4b0 x4b0Var = this.H;
        o150 o150Var = this.y;
        if (!o150Var.e) {
            LinkedHashMap linkedHashMap = o150Var.f;
            boolean z = (x4b0Var == null || (b = x4b0Var.b(Long.valueOf(o150Var.b.c()))) == null) ? false : b.f;
            if (z || (j == 0 && o150Var.a.a(tz10.j))) {
                Boolean bool = (Boolean) linkedHashMap.get(Long.valueOf(j));
                boolean z2 = (bool != null ? bool.booleanValue() : false) || (x4b0Var != null && x4b0Var.h) || z;
                linkedHashMap.put(Long.valueOf(j), Boolean.valueOf(z2));
                if (!o150Var.d && z2) {
                    arrayList.add(new dey0(this.F));
                }
            }
        }
        return arrayList;
    }

    public final void Z() {
        tje.N(ds31.a(this), null, null, new TelemostBannerListViewModel$invalidateBanners$1(this, null), 3);
    }
}
