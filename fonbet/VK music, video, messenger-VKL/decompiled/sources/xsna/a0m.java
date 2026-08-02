package xsna;

import androidx.media3.transformer.MuxerWrapper;
import androidx.media3.transformer.b0;
import androidx.media3.transformer.f;
import androidx.media3.transformer.m;
import androidx.media3.transformer.n;
import androidx.media3.transformer.t;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.vk.instantjobs.InstantJob;
import java.util.ArrayList;
import ru.ok.media.NativeAACCaptureAndEncode;
import ru.ok.media.api.AACAudioProvider;
import xsna.kr10;
import xsna.u6x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a0m implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0m(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u6x.b d;
        int i = 0;
        int i2 = 6;
        switch (this.b) {
            case 0:
                try {
                    com.vkontakte.android.data.b.n(com.vkontakte.android.data.b.g(), (String) this.c, (String) this.d);
                    return;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return;
                }
            case 1:
                u6x u6xVar = (u6x) this.c;
                w6x w6xVar = (w6x) this.d;
                synchronized (u6xVar) {
                    d = u6xVar.d(w6xVar, new io3(23), new tcu(i2));
                }
                if (d == null || d.a != u6x.c.RUNNING) {
                    return;
                }
                try {
                    u6xVar.a(w6xVar);
                } catch (InterruptedException unused) {
                    u6xVar.i(w6xVar, u6x.c.REJECTED);
                    return;
                } catch (Throwable th) {
                    u6xVar.c.d("unexpected error during await before execution", th);
                }
                try {
                    try {
                        u6xVar.e.a(w6xVar, InstantJob.a.f.a);
                    } catch (Throwable th2) {
                        u6xVar.c.d("unexpected error during invoke of Listener#onStart", th2);
                    }
                    u6xVar.k(w6xVar, "onExecute", new defpackage.f0(15, w6xVar, u6xVar));
                    u6xVar.l(w6xVar);
                    u6xVar.i(w6xVar, u6x.c.SUCCESS);
                    u6xVar.j(w6xVar, InstantJob.a.b.a);
                    return;
                } catch (InterruptedException unused2) {
                    u6xVar.i(w6xVar, u6x.c.REJECTED);
                    return;
                } catch (Throwable th3) {
                    u6xVar.i(w6xVar, u6x.c.REJECTED);
                    synchronized (u6xVar) {
                        u6xVar.d(w6xVar, new zsw(1), new w95(th3, u6xVar, w6xVar, i2));
                        u6xVar.c(w6xVar, false);
                        return;
                    }
                }
            case 2:
                NativeAACCaptureAndEncode.start$lambda$0((NativeAACCaptureAndEncode) this.c, (AACAudioProvider.Params) this.d);
                return;
            default:
                androidx.media3.transformer.b0 b0Var = (androidx.media3.transformer.b0) this.c;
                ImmutableList.a aVar = (ImmutableList.a) this.d;
                b0.b bVar = b0Var.e;
                com.google.common.collect.g g = aVar.g();
                androidx.media3.transformer.d dVar = b0Var.d;
                String str = dVar.b;
                String str2 = dVar.c;
                androidx.media3.transformer.a0 a0Var = androidx.media3.transformer.a0.this;
                t.a aVar2 = a0Var.s;
                aVar2.a.e(g);
                if (str != null) {
                    aVar2.g = str;
                }
                if (str2 != null) {
                    aVar2.n = str2;
                }
                Throwable th4 = null;
                a0Var.u = null;
                int i3 = a0Var.z;
                if (i3 != 1) {
                    if (i3 == 2) {
                        a0Var.v = null;
                        a0Var.z = 3;
                        throw null;
                    }
                    if (i3 == 3) {
                        a0Var.z = 4;
                        throw null;
                    }
                    if (i3 == 5) {
                        a0Var.z = 6;
                        androidx.media3.transformer.f fVar = a0Var.w;
                        fVar.getClass();
                        throw null;
                    }
                    if (i3 != 6) {
                        androidx.media3.transformer.a0.a(a0Var);
                        return;
                    } else {
                        aVar2.p = 1;
                        androidx.media3.transformer.a0.a(a0Var);
                        return;
                    }
                }
                a0Var.z = 2;
                androidx.media3.transformer.f fVar2 = a0Var.w;
                fVar2.getClass();
                int i4 = ImmutableSet.d;
                owj0 owj0Var = new owj0(2);
                f.a a = fVar2.a();
                ImmutableList<androidx.media3.transformer.n> immutableList = fVar2.a;
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (i5 < immutableList.size()) {
                    com.google.common.collect.g gVar = immutableList.get(i5).a;
                    ArrayList arrayList2 = new ArrayList();
                    int i6 = i;
                    while (i6 < gVar.e) {
                        androidx.media3.transformer.m mVar = (androidx.media3.transformer.m) gVar.get(i6);
                        m.a a2 = mVar.a();
                        kr10 kr10Var = mVar.a;
                        Throwable th5 = th4;
                        if (i6 == 0) {
                            kr10.b.a a3 = kr10Var.f.a();
                            long S = y2r0.S(y2r0.j0(0L) + kr10Var.f.a);
                            fxc0.p(S >= 0);
                            a3.a = S;
                            kr10.b bVar2 = new kr10.b(a3);
                            kr10.a a4 = kr10Var.a();
                            a4.d = bVar2.a();
                            a2.a = a4.a();
                        }
                        arrayList2.add(new androidx.media3.transformer.m(a2));
                        i6++;
                        th4 = th5;
                    }
                    Throwable th6 = th4;
                    n.a aVar3 = new n.a(owj0Var);
                    aVar3.a.e(arrayList2);
                    arrayList.add(new androidx.media3.transformer.n(aVar3));
                    i5++;
                    th4 = th6;
                    i = 0;
                }
                Throwable th7 = th4;
                a.b(arrayList);
                a.a();
                a0Var.v.getClass();
                MuxerWrapper muxerWrapper = a0Var.v;
                fxc0.z(muxerWrapper.m == 1);
                muxerWrapper.m = 2;
                throw th7;
        }
    }
}
