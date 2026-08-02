package com.yandex.messaging.internal.net.file;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.FileUploadResponseData;
import defpackage.gk51;
import defpackage.gl;
import defpackage.ho3;
import defpackage.izq;
import defpackage.kgx;
import defpackage.pzt0;
import defpackage.rp3;
import defpackage.tje;
import defpackage.tz10;
import defpackage.x22;
import defpackage.yj51;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class a implements ho3 {
    public final /* synthetic */ gk51 a;

    public a(gk51 gk51Var) {
        this.a = gk51Var;
    }

    @Override // defpackage.go3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void D(FileUploadResponseData fileUploadResponseData) {
        Long l;
        gk51 gk51Var = this.a;
        gl glVar = gk51Var.A;
        int i = gk51Var.C;
        glVar.a = true;
        HashMap hashMap = (HashMap) glVar.x;
        String str = (String) glVar.b;
        Long l2 = (Long) hashMap.get(str);
        x22 x22Var = (x22) glVar.c;
        Pair pair = new Pair("uploadId", str);
        Pair pair2 = new Pair("attemptNo", Integer.valueOf(i));
        Pair pair3 = new Pair("size", Long.valueOf(((izq) glVar.w).b.b));
        if (l2 != null) {
            l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
        } else {
            l = null;
        }
        x22Var.reportEvent("yadisk_upload_file_succeed", b.i(pair, pair2, pair3, new Pair(RemoteBioParameters.TIME, l)));
        gk51Var.b.D(fileUploadResponseData);
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        Long l;
        gk51 gk51Var = this.a;
        gl glVar = gk51Var.A;
        int i2 = gk51Var.C;
        HashMap hashMap = (HashMap) glVar.x;
        String str = (String) glVar.b;
        Long l2 = (Long) hashMap.get(str);
        x22 x22Var = (x22) glVar.c;
        Pair pair = new Pair("uploadId", str);
        Pair pair2 = new Pair("httpCode", Integer.valueOf(i));
        Pair pair3 = new Pair("attemptNo", Integer.valueOf(i2));
        if (l2 != null) {
            l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
        } else {
            l = null;
        }
        x22Var.reportEvent("yadisk_upload_file_error", b.i(pair, pair2, pair3, new Pair(RemoteBioParameters.TIME, l)));
        gk51Var.b();
        gk51Var.D++;
        if (!gk51Var.B.a(tz10.n) || gk51Var.D > 5 || (!yj51.e.contains(Integer.valueOf(i)) && (i / 100 != 5 || yj51.d.contains(Integer.valueOf(i))))) {
            gk51Var.b.mo103c(i);
            return true;
        }
        pzt0 N = tje.N(gk51Var.I, null, null, new YaDiskUploadFileCancellable$proxyCallback$1$error$1(gk51Var, null), 3);
        rp3 rp3Var = gk51Var.H;
        kgx kgxVar = gk51.K[1];
        rp3Var.a(N);
        return true;
    }
}
