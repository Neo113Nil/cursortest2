package com.ybsdk.feature.ui.stat.internal.domain;

import android.content.SharedPreferences;
import com.ybsdk.rconfig.configs.YbUiStatEventConfig;
import defpackage.a6w;
import defpackage.bwb0;
import defpackage.cy51;
import defpackage.el11;
import defpackage.gw00;
import defpackage.kgx;
import defpackage.mpb1;
import defpackage.nbp0;
import defpackage.pzt0;
import defpackage.rrp0;
import defpackage.st11;
import defpackage.tje;
import defpackage.x43;
import defpackage.x4c;
import defpackage.y1r0;
import java.util.Collections;
import kotlin.Pair;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes3.dex */
public final class a {
    public final nbp0 a;
    public final com.ybsdk.feature.ui.stat.internal.data.a b;
    public final bwb0 c;
    public final el11 d;
    public pzt0 f;
    public final x43 e = new x43();
    public final Object g = new Object();

    public a(nbp0 nbp0Var, com.ybsdk.feature.ui.stat.internal.data.a aVar, bwb0 bwb0Var, el11 el11Var) {
        this.a = nbp0Var;
        this.b = aVar;
        this.c = bwb0Var;
        this.d = el11Var;
    }

    public final void a(String str, UiStatPayloadType uiStatPayloadType, String str2) {
        String str3;
        y1r0 y1r0Var = (y1r0) this.d.b;
        synchronized (y1r0Var.f) {
            a6w a6wVar = y1r0Var.e;
            kgx kgxVar = y1r0.g[2];
            SharedPreferences sharedPreferences = a6wVar.b;
            str3 = a6wVar.c;
            String string = sharedPreferences.getString("prefs_session_id", str3);
            if (string != null) {
                str3 = string;
            }
        }
        st11 st11Var = new st11(str3, str, uiStatPayloadType, str2, mpb1.c(System.currentTimeMillis()));
        synchronized (this.g) {
            try {
                if (this.e.size() >= ((YbUiStatEventConfig) this.c.a.d(cy51.a).getData()).getMaxQueueSize()) {
                    x4c.g("Ui stat event queue overflow, event dropped", null, gw00.e(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, (st11) this.e.removeFirst())), Collections.singletonList(rrp0.b), 2);
                }
                this.e.addLast(st11Var);
                pzt0 pzt0Var = this.f;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.f = tje.N(this.a.b, null, null, new UiStatEventSender$sendEvent$1$1(this, null), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
