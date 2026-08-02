package defpackage;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.route.interactor.c;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.input.g;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.location.autolocation.a;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.source.domain.t;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.systemrequeirements.location.l;

/* loaded from: classes6.dex */
public final class oet0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;

    public /* synthetic */ oet0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.g = v7pVar2;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = xvf0Var8;
        this.l = xvf0Var9;
        this.m = xvf0Var10;
        this.n = xvf0Var11;
        this.o = xvf0Var12;
        this.p = xvf0Var13;
        this.q = xvf0Var14;
        this.r = xvf0Var15;
        this.s = xvf0Var16;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.s;
        xvf0 xvf0Var2 = this.r;
        xvf0 xvf0Var3 = this.q;
        xvf0 xvf0Var4 = this.p;
        xvf0 xvf0Var5 = this.o;
        xvf0 xvf0Var6 = this.n;
        xvf0 xvf0Var7 = this.m;
        xvf0 xvf0Var8 = this.l;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.j;
        xvf0 xvf0Var11 = this.i;
        xvf0 xvf0Var12 = this.h;
        xvf0 xvf0Var13 = this.g;
        xvf0 xvf0Var14 = this.f;
        xvf0 xvf0Var15 = this.e;
        xvf0 xvf0Var16 = this.d;
        xvf0 xvf0Var17 = this.c;
        xvf0 xvf0Var18 = this.b;
        switch (i) {
            case 0:
                return new net0((grt0) xvf0Var18.get(), (ah00) xvf0Var17.get(), (qy41) xvf0Var16.get(), (pd61) xvf0Var15.get(), (agt0) xvf0Var14.get(), (yit0) xvf0Var13.get(), (c) xvf0Var12.get(), (tit0) xvf0Var11.get(), (com.yandex.go.navigation.screen.c) xvf0Var10.get(), (r) xvf0Var9.get(), (e) xvf0Var8.get(), (w330) xvf0Var7.get(), (fy01) xvf0Var6.get(), (biv0) xvf0Var5.get(), (j621) xvf0Var4.get(), (zit0) xvf0Var3.get(), (vvx0) xvf0Var2.get(), (ber) xvf0Var.get());
            case 1:
                return new s((dqe0) xvf0Var18.get(), (zuj0) xvf0Var17.get(), (nzb0) xvf0Var16.get(), (rjt0) xvf0Var15.get(), (e) xvf0Var14.get(), (a) xvf0Var13.get(), (c9l0) xvf0Var12.get(), (s8z) xvf0Var11.get(), (AddressResolveRepository) xvf0Var10.get(), (r) xvf0Var9.get(), (agt0) xvf0Var8.get(), (fy01) xvf0Var7.get(), (hp0) xvf0Var6.get(), (o050) xvf0Var5.get(), (tft0) xvf0Var4.get(), (lcz) xvf0Var3.get(), (cjt0) xvf0Var2.get(), (ber) xvf0Var.get());
            case 2:
                return new t((Lifecycle) xvf0Var18.get(), (ah00) xvf0Var17.get(), (dqe0) xvf0Var16.get(), (ky2) xvf0Var15.get(), (e) xvf0Var14.get(), (c) xvf0Var13.get(), (po21) xvf0Var12.get(), (s8z) xvf0Var11.get(), (r9p) xvf0Var10.get(), (urv0) xvf0Var9.get(), (jjt0) xvf0Var8.get(), (tft0) xvf0Var7.get(), (kr0) xvf0Var6.get(), (z6r) xvf0Var5.get(), (git0) xvf0Var4.get(), (lcz) xvf0Var3.get(), (hp0) xvf0Var2.get(), (l) xvf0Var.get());
            default:
                return new g((Activity) xvf0Var18.get(), (q6b) xvf0Var17.get(), (w7b) xvf0Var16.get(), (com.yandex.messaging.navigation.c) xvf0Var15.get(), (p4t) xvf0Var14.get(), (dct) xvf0Var13.get(), (x22) xvf0Var12.get(), (lqo) xvf0Var11.get(), (i720) xvf0Var10.get(), (Moshi) xvf0Var9.get(), (ik51) xvf0Var8.get(), (MessengerEnvironment) xvf0Var7.get(), (jn3) xvf0Var6.get(), (ck51) xvf0Var5.get(), (com.yandex.messaging.internal.view.input.c) xvf0Var4.get(), (xdf0) xvf0Var3.get(), i5m.a(xvf0Var2), (kse) xvf0Var.get());
        }
    }
}
