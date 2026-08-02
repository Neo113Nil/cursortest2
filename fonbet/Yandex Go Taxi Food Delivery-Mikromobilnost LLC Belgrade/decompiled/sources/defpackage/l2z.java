package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.LocationListener;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey$KeyScheme;
import com.yandex.go.flex.main_screen.data.DocumentSourceVariableFactory$Companion$DocumentSource;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.plus.pay.inapp.google.internal.a;
import com.ybsdk.feature.persistence.api.StorageType;
import defpackage.ike;
import defpackage.j400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zse;
import gom.yandex.go.web.statics.data.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.address.d;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.logistics.sdk.management.i;
import ru.yandex.taxi.preorder.source.userposition.repository.c;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes8.dex */
public final /* synthetic */ class l2z implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l2z(b bVar, File file, Long l) {
        this.a = 29;
        this.b = file;
        this.c = l;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [com.yandex.plus.home.PlusHomeSdkImpl$exportMetricaSessionListener$1] */
    @Override // defpackage.sls
    public final Object invoke() {
        Object value;
        ldt0 trailButtonsBinding_delegate$lambda$0;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cxq0 cxq0Var = (cxq0) obj2;
                cop0 cop0Var = (cop0) cxq0Var.b;
                Context context = cop0Var.a;
                String concat = "com.yandex.plus.home.".concat((String) obj);
                zcx zcxVar = (zcx) cxq0Var.x;
                ((wyj) cop0Var.z).getClass();
                return new ome0(context, concat, zcxVar, wyj.e);
            case 1:
                jst.e.getClass();
                ((c) obj2).b.removeUpdates((LocationListener) obj);
                return zy11Var;
            case 2:
                i3y i3yVar = (i3y) obj2;
                i3y i3yVar2 = (i3y) obj;
                if (i3yVar != null) {
                    return i3yVar2 == null ? (Map) i3yVar.getValue() : kotlin.collections.b.n((Map) i3yVar2.getValue(), (Map) i3yVar.getValue());
                }
                Map map = i3yVar2 != null ? (Map) i3yVar2.getValue() : null;
                return map == null ? kotlin.collections.b.f() : map;
            case 3:
                a900 a900Var = (a900) obj2;
                u1m u1mVar = (u1m) obj;
                r0 r0Var = a900Var.b.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new pcw0(mcw0.a, gcw0.a)));
                yzv0 yzv0Var = a900Var.a;
                String a = a900.a(u1mVar);
                fva0.b(yzv0Var.a, "LayoutSuperappRequested", null, null, 6);
                yzv0Var.l("RequestLoaded", a);
                r0 r0Var2 = a900Var.c.a.a;
                r0Var2.getClass();
                r0Var2.m(null, "loadingSnippet");
                r0 r0Var3 = a900Var.g.a.a;
                r0Var3.getClass();
                r0Var3.m(null, "loaded");
                a900Var.d.a.l(DocumentSourceVariableFactory$Companion$DocumentSource.NETWORK);
                return zy11Var;
            case 4:
                i iVar = (i) obj2;
                return e.O(e.F(new ha2(9, iVar.h, iVar), ((st2) obj).b), iVar.e, wsr0.a(xsr0.a, 3), 1);
            case 5:
                return ((jbh) ((rqo) obj2)).e((NewbiesRedesignPointsABExperiment) ((d) obj).d.getValue());
            case 6:
                cii0 cii0Var = (cii0) obj;
                if (((AtomicInt) ((am2) obj2).a).get() == 0) {
                    cii0Var.invoke();
                }
                return zy11Var;
            case 7:
                return "Only found " + ((Ref$IntRef) obj2).element + " digits in a row, but need to parse " + ((gn60) obj).b();
            case 8:
                String str = (String) obj;
                o4o o4oVar = (o4o) obj2;
                ovu0 ovu0Var = ovu0.j;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (evu0.J(str)) {
                    ny61.g("Blank serial names are prohibited");
                    return null;
                }
                if (ovu0Var == ovu0.g) {
                    ny61.g("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                h0c h0cVar = new h0c(str);
                h0cVar.b = (List) o4oVar.d;
                return new asq0(str, ovu0Var, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
            case 9:
                ImageView imageView = (ImageView) obj2;
                imageView.setImageDrawable((Drawable) ((Function) obj).apply(imageView.getContext()));
                return zy11Var;
            case 10:
                ((k) obj2).Ng(new z5a0(((a6a0) ((c6a0) obj)).b()));
                return zy11Var;
            case 11:
                ((com.yandex.go.payments.paymentlist.ui.c) obj2).V.Q2(((egh) obj).o);
                return zy11Var;
            case 12:
                ((com.yandex.go.payments.paymentlist.ui.c) obj2).V.Q2((c6a0) obj);
                return zy11Var;
            case 13:
                ((aea0) obj2).T.Q2(((gt51) obj).k);
                return zy11Var;
            case 14:
                StorageType storageType = (StorageType) obj2;
                int i3 = b1b0.a[storageType.ordinal()];
                Context context2 = ((c1b0) obj).a;
                if (i3 != 1) {
                    return context2.getSharedPreferences(storageType.getPrefsName(), 0);
                }
                try {
                    String prefsName = StorageType.AUTH_ENCRYPTED.getPrefsName();
                    nfh nfhVar = new nfh(context2);
                    nfhVar.C(MasterKey$KeyScheme.AES256_GCM);
                    return EncryptedSharedPreferences.create(context2, prefsName, nfhVar.i(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                } catch (Throwable th) {
                    x4c.g("Failed to init encrypted prefs", th, null, null, 12);
                    return context2.getSharedPreferences(mju0.a(), 0);
                }
            case 15:
                t9a0 t9a0Var = new t9a0(21, (h4j0) obj);
                zjd0 zjd0Var = new zjd0();
                ((wyj) ((cop0) obj2).z).getClass();
                return new uvf0(t9a0Var, zjd0Var, wyj.e);
            case 16:
                return new dit((String) obj, (String) obj2, false);
            case 17:
                dbd0 dbd0Var = (dbd0) obj;
                return ((s400) obj2) != null ? new a(dbd0Var.a.g, dbd0Var.b.e) : new awu0();
            case 18:
                com.yandex.plus.pay.internal.di.b bVar = ((dbd0) obj2).a;
                return new kkb(bVar.g, bVar.b(), bVar.p, (p5h) obj, bVar.e);
            case 19:
                fad0 fad0Var = ((dbd0) obj2).b;
                return new ded0(fad0Var.e, (sr50) ((icj) fad0Var.j.getValue()).d.getValue(), (qc20) obj);
            case 20:
                com.yandex.plus.pay.internal.b bVar2 = (com.yandex.plus.pay.internal.b) obj2;
                com.yandex.plus.pay.internal.di.d dVar = bVar2.b;
                return new com.yandex.plus.pay.internal.feature.offers.i((nqd) dVar.e.p.getValue(), (mzs0) dVar.e.q.getValue(), bVar2.b(), (com.yandex.plus.core.benchmark.a) obj);
            case 21:
                au50 au50Var = (au50) obj2;
                vog vogVar = (vog) obj;
                z3d0 z3d0Var = (z3d0) au50Var.b;
                final com.yandex.plus.home.c cVar = (com.yandex.plus.home.c) ((p4d0) z3d0Var);
                ?? r8 = new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.PlusHomeSdkImpl$exportMetricaSessionListener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        c.this.j.a();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                        c.this.j.b();
                    }
                };
                lqc0 lqc0Var = (lqc0) vogVar.c.getValue();
                com.yandex.plus.home.c cVar2 = (com.yandex.plus.home.c) ((p4d0) z3d0Var);
                yo40 yo40Var = new yo40(cVar2.d.a());
                o370 o370Var = new o370((t2h) cVar2.g.b.getValue());
                r0 r0Var4 = cVar2.h.h;
                cop0 cop0Var2 = cVar2.b;
                n4u0 n4u0Var = cop0Var2.e;
                g92 g92Var = new g92(5, new mth(((t821) cVar2.f.r.getValue()).b, 10));
                t9a0 t9a0Var2 = new t9a0(24, au50Var);
                pgz b = vogVar.b();
                fse fseVar = cVar2.i.a;
                xyj xyjVar = cop0Var2.z;
                ((wyj) xyjVar).getClass();
                return new com.yandex.plus.home.plaque.feature.internal.b(r8, lqc0Var, new rkc0(), yo40Var, o370Var, r0Var4, n4u0Var, g92Var, t9a0Var2, b, bvf0.a(fseVar.plus(wyj.d)), xyjVar);
            case 22:
                return sb2.n((Context) obj2, ((rle0) obj).a.concat(".preferences_pb"));
            case 23:
                return ((dne0) obj2).a.getSharedPreferences((String) obj, 0);
            case 24:
                iz40 iz40Var = (iz40) obj2;
                bud budVar = (bud) obj;
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    budVar.z(objArr[(i4 << 3) + i6]);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return zy11Var;
            case 25:
                return d6z.h((String) obj, r5e0.g, new SerialDescriptor[0], new rsp0((ssp0) obj2, i2));
            case 26:
                final flex.engine.section.c cVar3 = (flex.engine.section.c) obj;
                ((ou) obj2).invoke();
                ArrayList arrayList = cVar3.V;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((sls) it.next()).invoke();
                }
                arrayList.clear();
                Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: flex.engine.section.b
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j2) {
                        c cVar4 = c.this;
                        ike ikeVar = cVar4.a0;
                        sjh sjhVar = uyj.a;
                        tje.N(ikeVar, (j400) zse.a.b, null, new SectionsContentController$onRenderingFinished$1$2$1(cVar4, null), 2);
                    }
                });
                return zy11Var;
            case 27:
                return tje.a(vmx.a.a(), new kn2(28, (nd90) obj2, (nn11) obj));
            case 28:
                trailButtonsBinding_delegate$lambda$0 = SourceOnMapControl.trailButtonsBinding_delegate$lambda$0((Context) obj2, (SourceOnMapControl) obj);
                return trailButtonsBinding_delegate$lambda$0;
            default:
                File file = (File) obj2;
                Long l = (Long) obj;
                if (file == null || l.longValue() <= 0) {
                    return null;
                }
                return new sa7(file, l.longValue());
        }
    }

    public /* synthetic */ l2z(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ l2z(String str, String str2, fad0 fad0Var) {
        this.a = 16;
        this.c = str;
        this.b = str2;
    }

    public /* synthetic */ l2z(String str, KSerializer kSerializer, int i) {
        this.a = i;
        this.c = str;
        this.b = kSerializer;
    }
}
