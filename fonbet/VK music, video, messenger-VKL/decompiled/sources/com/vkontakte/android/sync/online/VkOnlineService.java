package com.vkontakte.android.sync.online;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.CoreFeatures;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.ao00;
import xsna.ao00.a;
import xsna.asu0;
import xsna.bek0;
import xsna.bpn0;
import xsna.bzz;
import xsna.bzz.a;
import xsna.eqy;
import xsna.k840;
import xsna.kv2;
import xsna.m0r0;
import xsna.pox;
import xsna.tgw;
import xsna.w5k0;
import xsna.wyk0;
import xsna.y8p0;
import xsna.yh9;

/* compiled from: VkOnlineService.kt */
/* loaded from: classes7.dex */
public final class VkOnlineService extends Service {
    public static final bpn0 f = new bpn0(new y8p0(5));
    public static final bpn0 g = new bpn0(new w5k0(11));
    public static wyk0 h;
    public boolean b;
    public ao00 c;
    public wyk0 d;
    public bzz e;

    /* compiled from: VkOnlineService.kt */
    public static final class a {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = false;
        this.c = null;
        this.e = null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.b) {
            ao00 ao00Var = this.c;
            if (ao00Var != null && ao00Var.a) {
                L.e("MarkUserAsOnlineDaemon", "stop");
                ao00Var.b.interrupt();
                if (ao00Var.c) {
                    m0r0.a();
                }
                ao00Var.a = false;
                ao00Var.b = null;
                ao00Var.c = false;
            }
            this.c = null;
            if (!k840.c) {
                asu0.a.getClass();
                asu0.n().execute(new kv2(this, 16));
            }
            bzz bzzVar = this.e;
            if (bzzVar != null && bzzVar.e) {
                bzzVar.f.interrupt();
                bzzVar.e = false;
                bzzVar.f = null;
            }
            this.e = null;
            this.b = false;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Integer b;
        if (this.b) {
            return 2;
        }
        ao00 ao00Var = new ao00();
        ao00Var.a = false;
        ao00Var.b = null;
        ao00Var.c = false;
        this.c = ao00Var;
        eqy<bek0> eqyVar = d.a;
        b.d i3 = b.A.i(CoreFeatures.ONLINE_DELAY);
        int intValue = ((i3 == null || (b = i3.b()) == null) ? 1 : b.intValue()) * 1000;
        if (!ao00Var.a) {
            L.e("MarkUserAsOnlineDaemon", tgw.b(intValue, "start in ", UcumUtils.UCUM_MILLISECODS));
            ao00Var.a = true;
            pox poxVar = new pox(ao00Var.new a());
            ao00Var.b = poxVar;
            poxVar.setName("vk-markUserAsOnlineDaemon");
            ao00Var.b.d = intValue;
            ao00Var.b.a();
            ao00Var.b.start();
            ao00Var.c = false;
        }
        asu0.a.getClass();
        asu0.n().execute(new yh9(this, 15));
        bzz bzzVar = new bzz();
        this.e = bzzVar;
        if (!bzzVar.e) {
            bzzVar.e = true;
            pox poxVar2 = new pox(bzzVar.new a());
            bzzVar.f = poxVar2;
            poxVar2.setName(bzzVar.d);
            bzzVar.f.d = 5000;
            bzzVar.f.a();
            bzzVar.f.start();
        }
        this.b = true;
        return 2;
    }
}
