package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.media3.transformer.a0;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.log.L;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.kr10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yhs0 implements io.reactivex.rxjava3.core.s {
    public final /* synthetic */ Uri b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ File d;

    public /* synthetic */ yhs0(Uri uri, Context context, File file) {
        this.b = uri;
        this.c = context;
        this.d = file;
    }

    @Override // io.reactivex.rxjava3.core.s
    public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
        Context context = this.c;
        File file = this.d;
        try {
            kr10.b.a aVar = new kr10.b.a();
            long S = y2r0.S(0L);
            fxc0.p(S >= 0);
            aVar.a = S;
            long S2 = y2r0.S(60000L);
            fxc0.p(S2 == Long.MIN_VALUE || S2 >= 0);
            aVar.b = S2;
            kr10.b bVar = new kr10.b(aVar);
            com.google.common.collect.h hVar = com.google.common.collect.h.h;
            ImmutableList.b bVar2 = ImmutableList.c;
            com.google.common.collect.g gVar = com.google.common.collect.g.f;
            List list = Collections.EMPTY_LIST;
            com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
            kr10.e.a aVar2 = new kr10.e.a();
            kr10.g gVar3 = kr10.g.a;
            kr10.b.a a = bVar.a();
            Uri uri = this.b;
            kr10 kr10Var = new kr10("", new kr10.c(a), uri != null ? new kr10.f(uri, null, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3);
            final androidx.media3.transformer.a0 a2 = new a0.a(context).a();
            ais0 ais0Var = new ais0(rVar);
            a2.i();
            a2.i.a(ais0Var);
            final io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.y(io.reactivex.rxjava3.core.q.R(200L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new mlh0(new wd3(28, a2, new i2e0()), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new kjs(new cim0(rVar, 8), 27), new lkz(new vs6(L.a, 9), 27));
            rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.zhs0
                @Override // io.reactivex.rxjava3.functions.e
                public final void cancel() {
                    io.reactivex.rxjava3.disposables.c.this.dispose();
                    androidx.media3.transformer.a0 a0Var = a2;
                    a0Var.i();
                    androidx.media3.transformer.b0 b0Var = a0Var.u;
                    if (b0Var == null) {
                        a0Var.f();
                        return;
                    }
                    try {
                        b0Var.a();
                        a0Var.f();
                    } finally {
                        i2e0 i2e0Var = new i2e0();
                        int d = a0Var.d(i2e0Var);
                        a0Var.u = null;
                        if (a0Var.b()) {
                            r2 = d == 2 ? i2e0Var.a : -1;
                            androidx.media3.transformer.o oVar = a0Var.A;
                            oVar.getClass();
                            oVar.e(r2);
                        }
                    }
                }
            });
            a2.g(kr10Var, file.getAbsolutePath());
        } catch (Throwable th) {
            rVar.b(th);
        }
    }
}
