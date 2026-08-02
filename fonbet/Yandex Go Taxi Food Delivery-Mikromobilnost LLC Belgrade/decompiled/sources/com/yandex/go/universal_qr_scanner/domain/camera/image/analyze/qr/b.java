package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr;

import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.net.Uri;
import defpackage.a121;
import defpackage.a201;
import defpackage.aye0;
import defpackage.evu0;
import defpackage.f6p0;
import defpackage.fgg0;
import defpackage.ibw0;
import defpackage.jdv;
import defpackage.jst;
import defpackage.k421;
import defpackage.k530;
import defpackage.kcz0;
import defpackage.l530;
import defpackage.lz11;
import defpackage.mz11;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tst;
import defpackage.uyj;
import defpackage.z021;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b {
    public final tst a;
    public final k421 b;
    public final aye0 c;
    public final a d;
    public final lz11 e;
    public final kcz0 f;

    public b(tst tstVar, k421 k421Var, aye0 aye0Var, a aVar, lz11 lz11Var, kcz0 kcz0Var) {
        this.a = tstVar;
        this.b = k421Var;
        this.c = aye0Var;
        this.d = aVar;
        this.e = lz11Var;
        this.f = kcz0Var;
    }

    public final Object a(jdv jdvVar, Continuation continuation) {
        fgg0 fgg0Var;
        Image f = jdvVar.f();
        zy11 zy11Var = zy11.a;
        if (f != null) {
            int e = jdvVar.G0().e();
            if (!((ru.yandex.taxi.vendor_api.google.b) this.a).b()) {
                this.b.getClass();
                jst.e.c("QR recognition is failed because no vendors are available");
                return zy11Var;
            }
            ArrayList l = this.c.l(f, e);
            kotlinx.coroutines.a.k(continuation.get_context());
            if (!l.isEmpty()) {
                lz11 lz11Var = this.e;
                mz11 mz11Var = lz11Var.b;
                ArrayList arrayList = new ArrayList(tcc.n(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(lz11.a(((fgg0) it.next()).a));
                }
                List k0 = kotlin.collections.a.k0(arrayList, mz11Var.a);
                if (!k0.isEmpty()) {
                    ibw0 ibw0Var = lz11Var.a;
                    ibw0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("qr", k0);
                    ibw0Var.a.a("SuperappMain.UniversalQR.Scanning", hashMap, 1, new HashMap());
                    mz11Var.a.addAll(k0);
                }
                kcz0 kcz0Var = this.f;
                z021 z021Var = (z021) ((a121) kcz0Var.b).a.getValue();
                a201 a201Var = (a201) kcz0Var.a;
                Rect d = a201Var.d((z021) ((a121) a201Var.c).a.getValue());
                Iterator it2 = l.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        fgg0Var = null;
                        break;
                    }
                    fgg0Var = (fgg0) it2.next();
                    float f2 = z021Var.a / fgg0Var.c;
                    float f3 = z021Var.b / fgg0Var.d;
                    Rect rect = fgg0Var.b;
                    RectF rectF = new RectF(rect.left * f2, rect.top * f3, rect.right * f2, rect.bottom * f3);
                    Rect rect2 = new Rect();
                    rectF.roundOut(rect2);
                    if (d.contains(rect2)) {
                        break;
                    }
                }
                if (fgg0Var != null) {
                    Uri uri = fgg0Var.a;
                    a aVar = this.d;
                    aVar.getClass();
                    Uri parse = Uri.parse(evu0.k0(uri.toString()).toString());
                    Iterator it3 = aVar.g.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        l530 a = ((f6p0) it3.next()).a(parse);
                        if (a instanceof k530) {
                            parse = ((k530) a).a;
                            break;
                        }
                    }
                    aVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    Object k02 = tje.k0(o400.a, new UniversalQrScannerDeeplinkHandler$handleDeeplink$2(aVar, parse, uri, null), continuation);
                    if (k02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return k02;
                    }
                }
            }
        }
        return zy11Var;
    }
}
