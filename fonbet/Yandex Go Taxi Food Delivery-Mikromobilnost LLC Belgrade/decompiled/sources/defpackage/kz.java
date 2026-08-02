package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.core.view.f;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.android.gms.internal.mlkit_vision_face.n;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.k;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzav;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgh;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzoo;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div2.DivTransform;
import com.yandex.go.shortcuts.dto.response.Anchor;
import com.yandex.go.shortcuts.dto.response.AnchoredPosition;
import com.yandex.go.shortcuts.dto.response.PointOnParent;
import com.yandex.go.shortcuts.dto.response.j0;
import com.yandex.go.shortcuts.dto.response.w2;
import com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$ThumbStackView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import com.yandex.messaging.ChatRequest;
import defpackage.cw5;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final class kz implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object w;
    public final Object x;

    public kz(j jVar, AtomicReference atomicReference, String str, String str2) {
        this.a = 11;
        this.b = atomicReference;
        this.x = str;
        this.c = str2;
        Objects.requireNonNull(jVar);
        this.w = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        zzav zzavVar;
        k kVar = (k) this.b;
        o3 o3Var = (o3) this.c;
        zzob zzobVar = (zzob) this.w;
        String str2 = (String) this.x;
        l8b1 l8b1Var = (l8b1) o3Var.w;
        l8b1Var.b = zzobVar;
        onb1 onb1Var = l8b1Var.a;
        if (onb1Var != null) {
            str = onb1Var.d;
            int i = m3a1.a;
            if (str != null) {
            }
        }
        str = "NA";
        inb1 inb1Var = new inb1();
        inb1Var.a = kVar.a;
        inb1Var.b = kVar.b;
        synchronized (k.class) {
            try {
                zzavVar = k.k;
                if (zzavVar == null) {
                    m5z q = y5e.q(Resources.getSystem().getConfiguration());
                    c791 c791Var = new c791();
                    for (int i2 = 0; i2 < q.d(); i2++) {
                        Locale b = q.b(i2);
                        ga0 ga0Var = xqc.a;
                        c791Var.a(b.toLanguageTag());
                    }
                    c791Var.c = true;
                    zzavVar = zzav.i(c791Var.b, c791Var.a);
                    k.k = zzavVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        inb1Var.e = zzavVar;
        inb1Var.h = Boolean.TRUE;
        inb1Var.d = str;
        inb1Var.c = str2;
        inb1Var.f = kVar.f.o() ? (String) kVar.f.k() : kVar.d.a();
        inb1Var.j = 10;
        inb1Var.k = Integer.valueOf(kVar.h);
        o3Var.c = inb1Var;
        kVar.c.a(o3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        zzbk zzbkVar;
        o oVar = (o) this.b;
        o3 o3Var = (o3) this.c;
        zzov zzovVar = (zzov) this.w;
        String str2 = (String) this.x;
        ebb1 ebb1Var = (ebb1) o3Var.w;
        ebb1Var.b = zzovVar;
        opb1 opb1Var = ebb1Var.a;
        if (opb1Var != null) {
            str = opb1Var.d;
            if (!hza1.f(str)) {
                cvw.l(str);
                jpb1 jpb1Var = new jpb1();
                jpb1Var.a = oVar.a;
                jpb1Var.b = oVar.b;
                synchronized (o.class) {
                    try {
                        zzbkVar = o.k;
                        if (zzbkVar == null) {
                            m5z q = y5e.q(Resources.getSystem().getConfiguration());
                            j991 j991Var = new j991();
                            for (int i = 0; i < q.d(); i++) {
                                Locale b = q.b(i);
                                ga0 ga0Var = xqc.a;
                                j991Var.a(b.toLanguageTag());
                            }
                            j991Var.c = true;
                            zzbkVar = zzbk.i(j991Var.b, j991Var.a);
                            o.k = zzbkVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jpb1Var.e = zzbkVar;
                jpb1Var.h = Boolean.TRUE;
                jpb1Var.d = str;
                jpb1Var.c = str2;
                jpb1Var.f = oVar.f.o() ? (String) oVar.f.k() : oVar.d.a();
                jpb1Var.j = 10;
                jpb1Var.k = Integer.valueOf(oVar.h);
                o3Var.c = jpb1Var;
                oVar.c.a(o3Var);
                return;
            }
        }
        str = "NA";
        jpb1 jpb1Var2 = new jpb1();
        jpb1Var2.a = oVar.a;
        jpb1Var2.b = oVar.b;
        synchronized (o.class) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r5.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022e, code lost:
    
        if (r5.isEmpty() == false) goto L93;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean applyPatchInternal;
        String str;
        zzp zzpVar;
        zzgb zzgbVar;
        String str2;
        zzbn zzbnVar;
        String str3;
        zzcs zzcsVar;
        byte[] bArr = null;
        int i = 0;
        switch (this.a) {
            case 0:
                b00.a((b00) this.b).a(new eb6((ChatRequest) this.c, this.w, (String) this.x));
                return;
            case 1:
                ((i00) ((b00) this.b).j.getValue()).a(new tw00((ChatRequest) this.c, (WeakReference) this.w, null, (g720) this.x));
                return;
            case 2:
                View view = (View) this.c;
                int width = view.getWidth();
                DivTransform divTransform = (DivTransform) this.w;
                z3l z3lVar = divTransform.a;
                rvo rvoVar = (rvo) this.x;
                view.setPivotX(a.w(view, width, z3lVar, rvoVar));
                view.setPivotY(a.w(view, view.getHeight(), divTransform.b, rvoVar));
                return;
            case 3:
                ((RobotoTextView) this.b).setText(q5b1.j((Context) this.c, (f611) this.w, (auy0) this.x));
                return;
            case 4:
                final com.yandex.div.core.util.binding.a aVar = (com.yandex.div.core.util.binding.a) this.b;
                final bw5 a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList = aVar.e;
                        applyPatchInternal = ((Div2View) this.w).applyPatchInternal((y2l) this.x);
                        Boolean valueOf = Boolean.valueOf(applyPatchInternal);
                        List J0 = kotlin.collections.a.J0(arrayList);
                        arrayList.clear();
                        Pair pair = new Pair(valueOf, J0);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list = (List) pair.getSecond();
                        if (list.isEmpty() && ((tls) this.c) == null) {
                            cw5.b(a);
                            return;
                        }
                        ngd0 ngd0Var = ngd0.G;
                        final tls tlsVar = (tls) this.c;
                        ngd0Var.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$applyPatchAsync$$inlined$runOnBindingThread$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                com.yandex.div.core.util.binding.a.this.b.d();
                                try {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ((sls) it.next()).invoke();
                                    }
                                    tls tlsVar2 = tlsVar;
                                    if (tlsVar2 != null) {
                                        tlsVar2.invoke(first);
                                    }
                                    cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                                    cw5.b(a);
                                    return zy11.a;
                                } catch (Throwable th) {
                                    cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                    cw5.b(a);
                                    throw th;
                                }
                            }
                        });
                        return;
                    } finally {
                        cw5.b(a);
                    }
                } catch (Throwable th) {
                    aVar.d = false;
                    throw th;
                }
            case 5:
                ((OrderStackViewsController) this.b).b((View) this.c, (OrderStackMvpView.AnimationType) this.w, (OrderStackViewsController.TranslationDirection) this.x);
                return;
            case 6:
                n190 n190Var = (n190) this.b;
                StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView = (StackItemViewFactory$ThumbStackView) this.c;
                RobotoTextView robotoTextView = (RobotoTextView) this.w;
                w2 w2Var = (w2) this.x;
                j0 b = w2Var.getB();
                float a2 = w2Var.getA();
                n190Var.getClass();
                if (b instanceof AnchoredPosition) {
                    AnchoredPosition anchoredPosition = (AnchoredPosition) b;
                    PointOnParent pointOnParent = anchoredPosition.a;
                    robotoTextView.setRotation(a2);
                    float width2 = stackItemViewFactory$ThumbStackView.getWidth() * pointOnParent.b;
                    float width3 = robotoTextView.getWidth();
                    Anchor anchor = anchoredPosition.b;
                    robotoTextView.setTranslationX(width2 - (width3 * anchor.b));
                    robotoTextView.setTranslationY((stackItemViewFactory$ThumbStackView.getHeight() * pointOnParent.a) - (robotoTextView.getHeight() * anchor.a));
                    return;
                }
                return;
            case 7:
                synchronized (ywt0.y) {
                    hqg hqgVar = (hqg) this.b;
                    if (hqgVar != null) {
                        ywt0.a((ywt0) this.w, hqgVar);
                    }
                    try {
                        SQLiteDatabase.deleteDatabase(new File((String) this.x));
                    } catch (Exception e) {
                        Log.e("Sqflite", "error " + e + " while closing database " + ywt0.D);
                    }
                }
                ((ba20) this.c).success(null);
                return;
            case 8:
                f.i((View) this.b, (u651) this.c, (q651) this.w);
                ((ValueAnimator) this.x).start();
                return;
            case 9:
                sv81 sv81Var = (sv81) this.w;
                Bitmap bitmap = (Bitmap) this.b;
                sv81Var.getClass();
                try {
                    bitmap = sv81.a(bitmap, 0.1d);
                } catch (Throwable unused) {
                }
                ((Handler) this.x).post(new fe71(8, this, bitmap));
                return;
            case 10:
                ((zzjd) this.b).zzI((String) this.x, (zzoo) this.c, (zzgh) this.w);
                return;
            case 11:
                String str4 = (String) this.x;
                String str5 = (String) this.c;
                j5b1 j = ((g) ((j) this.w).b).j();
                AtomicReference atomicReference = (AtomicReference) this.b;
                j.Gg();
                j.Hg();
                j.Ug(new vz(6, j, atomicReference, str4, str5, j.Wg(false), false));
                return;
            case 12:
                com.google.android.gms.internal.mlkit_vision_common.a aVar2 = (com.google.android.gms.internal.mlkit_vision_common.a) this.b;
                wl91 wl91Var = (wl91) this.c;
                zziv zzivVar = (zziv) this.w;
                String str6 = (String) this.x;
                ffa1 ffa1Var = (ffa1) wl91Var.a;
                ffa1Var.b = zzivVar;
                isa1 isa1Var = ffa1Var.a;
                if (isa1Var != null) {
                    str = isa1Var.d;
                    int i2 = dm91.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                nra1 nra1Var = new nra1();
                nra1Var.a = aVar2.a;
                nra1Var.b = aVar2.b;
                synchronized (com.google.android.gms.internal.mlkit_vision_common.a.class) {
                    try {
                        zzpVar = com.google.android.gms.internal.mlkit_vision_common.a.j;
                        if (zzpVar == null) {
                            m5z q = y5e.q(Resources.getSystem().getConfiguration());
                            vxa1 vxa1Var = new vxa1();
                            while (i < q.d()) {
                                Locale b2 = q.b(i);
                                ga0 ga0Var = xqc.a;
                                vxa1Var.a(b2.toLanguageTag());
                                i++;
                            }
                            vxa1Var.c = true;
                            zzpVar = zzp.i(vxa1Var.b, vxa1Var.a);
                            com.google.android.gms.internal.mlkit_vision_common.a.j = zzpVar;
                        }
                    } finally {
                    }
                }
                nra1Var.e = zzpVar;
                nra1Var.h = Boolean.TRUE;
                nra1Var.d = str;
                nra1Var.c = str6;
                nra1Var.f = aVar2.f.o() ? (String) aVar2.f.k() : aVar2.d.a();
                nra1Var.j = 10;
                nra1Var.k = Integer.valueOf(aVar2.h);
                wl91Var.b = nra1Var;
                aVar2.c.a(wl91Var);
                return;
            case 13:
                zzcu zzcuVar = (zzcu) this.c;
                j5b1 j5b1Var = (j5b1) this.w;
                try {
                    try {
                        zzgbVar = j5b1Var.x;
                    } catch (RemoteException e2) {
                        y1a1 y1a1Var = ((g) j5b1Var.b).y;
                        g.g(y1a1Var);
                        y1a1Var.z.b(e2, "Failed to send event to the service to bundle");
                    }
                    if (zzgbVar != null) {
                        bArr = zzgbVar.zzk((zzbg) this.b, (String) this.x);
                        j5b1Var.Tg();
                        ieb1 ieb1Var = ((g) j5b1Var.b).B;
                        g.e(ieb1Var);
                        ieb1Var.qh(zzcuVar, bArr);
                        return;
                    }
                    g gVar = (g) j5b1Var.b;
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.a("Discarding data. Failed to send event to service to bundle");
                    ieb1 ieb1Var2 = gVar.B;
                    g.e(ieb1Var2);
                    ieb1Var2.qh(zzcuVar, null);
                    return;
                } catch (Throwable th2) {
                    ieb1 ieb1Var3 = ((g) j5b1Var.b).B;
                    g.e(ieb1Var3);
                    ieb1Var3.qh(zzcuVar, null);
                    throw th2;
                }
            case 14:
                n nVar = (n) this.b;
                o3 o3Var = (o3) this.c;
                zzkt zzktVar = (zzkt) this.w;
                String str7 = (String) this.x;
                rqa1 rqa1Var = (rqa1) o3Var.w;
                rqa1Var.b = zzktVar;
                c2b1 c2b1Var = rqa1Var.a;
                if (c2b1Var != null) {
                    str2 = c2b1Var.d;
                    int i3 = z391.a;
                    if (str2 != null) {
                        break;
                    }
                }
                str2 = "NA";
                u1b1 u1b1Var = new u1b1();
                u1b1Var.a = nVar.a;
                u1b1Var.b = nVar.b;
                synchronized (n.class) {
                    try {
                        zzbnVar = n.k;
                        if (zzbnVar == null) {
                            m5z q2 = y5e.q(Resources.getSystem().getConfiguration());
                            v991 v991Var = new v991();
                            while (i < q2.d()) {
                                Locale b3 = q2.b(i);
                                ga0 ga0Var2 = xqc.a;
                                v991Var.a(b3.toLanguageTag());
                                i++;
                            }
                            v991Var.c = true;
                            zzbnVar = zzbn.i(v991Var.b, v991Var.a);
                            n.k = zzbnVar;
                        }
                    } finally {
                    }
                }
                u1b1Var.e = zzbnVar;
                u1b1Var.h = Boolean.TRUE;
                u1b1Var.d = str2;
                u1b1Var.c = str7;
                u1b1Var.f = nVar.f.o() ? (String) nVar.f.k() : nVar.d.a();
                u1b1Var.j = 10;
                u1b1Var.k = Integer.valueOf(nVar.h);
                o3Var.c = u1b1Var;
                nVar.c.a(o3Var);
                return;
            case 15:
                com.google.android.gms.measurement.internal.n nVar2 = (com.google.android.gms.measurement.internal.n) ((dcb1) this.w).a;
                ieb1 e0 = nVar2.e0();
                ((kl40) nVar2.q4()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                String str8 = (String) this.x;
                zzbg hh = e0.hh((String) this.b, (Bundle) this.c, "auto", currentTimeMillis, false);
                cvw.l(hh);
                nVar2.c(hh, str8);
                return;
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            default:
                com.google.android.gms.internal.mlkit_vision_barcode.n nVar3 = (com.google.android.gms.internal.mlkit_vision_barcode.n) this.b;
                o3 o3Var2 = (o3) this.c;
                zzrc zzrcVar = (zzrc) this.w;
                String str9 = (String) this.x;
                ekb1 ekb1Var = (ekb1) o3Var2.w;
                ekb1Var.b = zzrcVar;
                fub1 fub1Var = ekb1Var.a;
                if (fub1Var == null || (str3 = fub1Var.d) == null || str3.isEmpty()) {
                    str3 = "NA";
                } else {
                    cvw.l(str3);
                }
                eub1 eub1Var = new eub1();
                eub1Var.a = nVar3.a;
                eub1Var.b = nVar3.b;
                synchronized (com.google.android.gms.internal.mlkit_vision_barcode.n.class) {
                    try {
                        zzcsVar = com.google.android.gms.internal.mlkit_vision_barcode.n.k;
                        if (zzcsVar == null) {
                            m5z q3 = y5e.q(Resources.getSystem().getConfiguration());
                            com.google.android.gms.internal.mlkit_vision_barcode.k kVar = new com.google.android.gms.internal.mlkit_vision_barcode.k();
                            while (i < q3.d()) {
                                Locale b4 = q3.b(i);
                                ga0 ga0Var3 = xqc.a;
                                kVar.a(b4.toLanguageTag());
                                i++;
                            }
                            zzcsVar = kVar.c();
                            com.google.android.gms.internal.mlkit_vision_barcode.n.k = zzcsVar;
                        }
                    } finally {
                    }
                }
                eub1Var.e = zzcsVar;
                eub1Var.h = Boolean.TRUE;
                eub1Var.d = str3;
                eub1Var.c = str9;
                eub1Var.f = nVar3.f.o() ? (String) nVar3.f.k() : nVar3.d.a();
                eub1Var.j = 10;
                eub1Var.k = Integer.valueOf(nVar3.h);
                o3Var2.c = eub1Var;
                nVar3.c.a(o3Var2);
                return;
        }
    }

    public /* synthetic */ kz(zzjd zzjdVar, String str, zzoo zzooVar, zzgh zzghVar) {
        this.a = 10;
        this.b = zzjdVar;
        this.x = str;
        this.c = zzooVar;
        this.w = zzghVar;
    }

    public /* synthetic */ kz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public /* synthetic */ kz(int i, Object obj, Object obj2, Object obj3, String str) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.x = str;
        this.c = obj3;
    }

    public kz(dcb1 dcb1Var, String str, String str2, Bundle bundle) {
        this.a = 15;
        this.x = str;
        this.b = str2;
        this.c = bundle;
        this.w = dcb1Var;
    }
}
