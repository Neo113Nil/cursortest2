package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.taxi.order.cost_center.b;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.logistics.sdk.dashboard.core.SectionStyle;
import ru.yandex.taxi.logistics.sdk.dashboard.model.widget.SpacerModel;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.SpacerState;

/* loaded from: classes5.dex */
public final class bc implements g3v0, hwe, rjk {
    public Object a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public bc(i6r i6rVar, pey peyVar) {
        this.a = peyVar;
        this.b = i6rVar;
        n3w a = n3w.a(peyVar);
        this.c = a;
        xvf0 b = i5m.b(new c4p((Object) a, (xvf0) new b3g(i6rVar, 1), 13));
        this.w = b;
        int i = 2;
        this.x = i5m.b(new kj7(new b3g(i6rVar, i), (n3w) this.c, b, i));
    }

    public cg1 a() {
        if (((Integer) this.a) == null) {
            kbs.v("AES key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            kbs.v("HMAC key size is not set");
            return null;
        }
        Integer num = (Integer) this.c;
        if (num == null) {
            kbs.v("tag size is not set");
            return null;
        }
        if (((ag1) this.w) == null) {
            kbs.v("hash type is not set");
            return null;
        }
        int intValue = num.intValue();
        ag1 ag1Var = (ag1) this.w;
        if (ag1Var == ag1.c) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (ag1Var == ag1.d) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (ag1Var == ag1.e) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (ag1Var == ag1.f) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (ag1Var != ag1.g) {
                kbs.v("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new cg1(((Integer) this.a).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (bg1) this.x, (ag1) this.w);
    }

    public m34 b() {
        if (!"".isEmpty()) {
            ny61.r("Missing required properties:".concat(""));
            return null;
        }
        int intValue = ((Integer) this.a).intValue();
        int intValue2 = ((Integer) this.b).intValue();
        int intValue3 = ((Integer) this.c).intValue();
        int intValue4 = ((Integer) this.w).intValue();
        int intValue5 = ((Integer) this.x).intValue();
        m34 m34Var = new m34(intValue, intValue2, intValue3, intValue4, intValue5);
        String str = intValue == -1 ? " audioSource" : "";
        if (intValue2 <= 0) {
            str = str.concat(" captureSampleRate");
        }
        if (intValue3 <= 0) {
            str = str.concat(" encodeSampleRate");
        }
        if (intValue4 <= 0) {
            str = str.concat(" channelCount");
        }
        if (intValue5 == -1) {
            str = str.concat(" audioFormat");
        }
        if (str.isEmpty()) {
            return m34Var;
        }
        ny61.g("Required settings missing or non-positive:".concat(str));
        return null;
    }

    public n34 c() {
        String str = ((Range) this.a) == null ? " bitrate" : "";
        if (((Range) this.w) == null) {
            str = str.concat(" sampleRate");
        }
        if (str.isEmpty()) {
            return new n34((Range) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (Range) this.w, ((Integer) this.x).intValue());
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }

    public CameraExtensionCharacteristics d(String str) {
        CameraExtensionCharacteristics h;
        synchronized (this.b) {
            h = hl1.h(((LinkedHashMap) this.c).get(str));
            if (h == null) {
                h = ((CameraManager) this.a).getCameraExtensionCharacteristics(str);
                ((LinkedHashMap) this.c).put(str, h);
            }
        }
        return h;
    }

    public List e(int i, int i2, String str) {
        List list;
        if (Build.VERSION.SDK_INT < 31) {
            return EmptyList.a;
        }
        String str2 = str + LicenseUtility.SEPARATOR + i + LicenseUtility.SEPARATOR + i2;
        synchronized (this.b) {
            list = (List) ((LinkedHashMap) this.w).get(str2);
        }
        if (list != null) {
            return list;
        }
        try {
            List extensionSupportedSizes = i2 == 34 ? d(str).getExtensionSupportedSizes(i, SurfaceTexture.class) : d(str).getExtensionSupportedSizes(i, i2);
            synchronized (this.b) {
                ((LinkedHashMap) this.w).put(str2, extensionSupportedSizes);
            }
            return extensionSupportedSizes;
        } catch (IllegalArgumentException e) {
            StringBuilder u = b64.u(i, "Failed to retrieve supported output sizes for camera ", str, ", mode ", ", format ");
            u.append(i2);
            sgb1.e("Camera2ExtensionsInfo", u.toString(), e);
            return EmptyList.a;
        }
    }

    public boolean f(int i, String str) {
        List list;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        synchronized (this.b) {
            list = (List) ((LinkedHashMap) this.x).get(str);
            if (list == null) {
                list = d(str).getSupportedExtensions();
                ((LinkedHashMap) this.x).put(str, list);
            }
        }
        return list.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [fmo] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ayi] */
    /* JADX WARN: Type inference failed for: r4v5, types: [zbu] */
    /* JADX WARN: Type inference failed for: r4v7, types: [u7f] */
    public qkg g(oig oigVar, String str, boolean z) {
        emo emoVar;
        Boolean bool;
        List<v0q0> list = oigVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (v0q0 v0q0Var : list) {
            String str2 = v0q0Var.d;
            boolean z2 = false;
            if (str2 != null && (bool = (Boolean) ((Map) ((flg) this.w).a.getValue()).get(str2)) != null) {
                z2 = bool.booleanValue();
            }
            boolean z3 = z2;
            List<s151> list2 = v0q0Var.a;
            ArrayList arrayList2 = new ArrayList();
            for (s151 s151Var : list2) {
                SpacerState spacerState = null;
                if (s151Var instanceof tdf0) {
                    q6c0 q6c0Var = (q6c0) this.a;
                    tdf0 tdf0Var = (tdf0) s151Var;
                    q6c0Var.getClass();
                    if (tdf0Var instanceof sdf0) {
                        sdf0 sdf0Var = (sdf0) tdf0Var;
                        String str3 = sdf0Var.a;
                        rdf0 rdf0Var = sdf0Var.b;
                        if (rdf0Var != null) {
                            String str4 = rdf0Var.a;
                            qfc qfcVar = rdf0Var.b;
                            emoVar = new emo(qfcVar != null ? ((yfa) q6c0Var.w).e(qfcVar, z) : null, str4);
                        } else {
                            emoVar = null;
                        }
                        w4v w4vVar = sdf0Var.c;
                        ra90 b = w4vVar != null ? oh4.b((oh4) q6c0Var.c, w4vVar, null, null, z, 6) : null;
                        String str5 = sdf0Var.d;
                        spacerState = new fmo(str3, emoVar, b, str5, sdf0Var.f, jl40.l(str, str5), sdf0Var.g, sdf0Var.e);
                    } else {
                        if (!(tdf0Var instanceof qdf0)) {
                            w511.b();
                            return null;
                        }
                        qdf0 qdf0Var = (qdf0) tdf0Var;
                        String str6 = qdf0Var.a;
                        f17 f17Var = (f17) q6c0Var.b;
                        k17 k17Var = qdf0Var.b;
                        f17Var.getClass();
                        spacerState = new u7f(str6, new a37(k17Var.a, k17Var.b), qdf0Var.d, qdf0Var.c);
                    }
                } else if (s151Var instanceof zau) {
                    spacerState = ((r1s) this.b).f((zau) s151Var, z, z3);
                } else if (s151Var instanceof xxi) {
                    xxi xxiVar = (xxi) s151Var;
                    ((uxi) this.c).getClass();
                    spacerState = new ayi(xxiVar.a, xxiVar.b);
                } else if (s151Var instanceof SpacerModel) {
                    SpacerModel spacerModel = (SpacerModel) s151Var;
                    ((mkt0) this.x).getClass();
                    spacerState = new SpacerState(SpacerState.Size.valueOf(spacerModel.a.name()), spacerModel.b, spacerModel.c, z3);
                }
                if (spacerState != null) {
                    arrayList2.add(spacerState);
                }
            }
            arrayList.add(new g2q0(arrayList2, v0q0Var.b, v0q0Var.c, v0q0Var.d, v0q0Var.e, v0q0Var.f, SectionStyle.valueOf(v0q0Var.g.name()), null, null, 896));
        }
        return new qkg(arrayList, null, oigVar.c, oigVar.d, 18);
    }

    public Object h(cud cudVar) {
        Object obj;
        ur31 processViewInfos$lambda$1;
        sus0 sus0Var;
        Integer e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.w;
        if (linkedHashMap.containsKey(cudVar)) {
            return linkedHashMap.get(cudVar);
        }
        cts ctsVar = (cts) cudVar;
        ctsVar.getClass();
        List list = (List) ((LinkedHashMap) this.c).get(cudVar);
        if (list == null) {
            list = EmptyList.a;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h((cud) it.next());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (linkedHashMap.containsKey((cud) obj2)) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            cud cudVar2 = (cud) it2.next();
            rtd rtdVar = ((cts) cudVar2).a;
            boolean z = rtdVar instanceof bud;
            bud budVar = z ? (bud) rtdVar : null;
            ttd ttdVar = budVar != null ? budVar.a : null;
            rtd i = ttdVar != null ? ttdVar.i() : null;
            if (i != null && (sus0Var = ((bud) i).y) != null) {
                sus0 f = uus0.f(sus0Var);
                bud budVar2 = z ? (bud) rtdVar : null;
                ttd ttdVar2 = budVar2 != null ? budVar2.a : null;
                if (ttdVar2 != null && (e = ipb1.e(f, ttdVar2)) != null) {
                    obj = new tus0(f, e.intValue(), f.A);
                }
            }
            Object obj3 = linkedHashMap2.get(obj);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap2.put(obj, obj3);
            }
            ((List) obj3).add(linkedHashMap.get(cudVar2));
        }
        ComposeViewAdapter.processViewInfos$lambda$0(cudVar);
        bms bmsVar = (bms) this.a;
        nje njeVar = (nje) this.b;
        f6w f6wVar = jws0.a;
        aud audVar = (aud) a.Q(ctsVar.d());
        if (audVar != null) {
            std stdVar = new std(bmsVar, njeVar.a, linkedHashMap2);
            ArrayList arrayList2 = new ArrayList();
            stdVar.a(audVar, 0, arrayList2);
            obj = a.R(arrayList2);
        }
        processViewInfos$lambda$1 = ComposeViewAdapter.processViewInfos$lambda$1(cudVar, (ur31) obj, list);
        linkedHashMap.put(cudVar, processViewInfos$lambda$1);
        return processViewInfos$lambda$1;
    }

    @Override // defpackage.g3v0
    public void i() {
        ((Handler) this.a).post(new dn2(this, 1));
    }

    public void j(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public void k(ag1 ag1Var) {
        this.w = ag1Var;
    }

    public void l(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void m(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.g3v0
    public void n() {
        ((Handler) this.a).post(new dn2(this, 0));
    }

    public void o(bg1 bg1Var) {
        this.x = bg1Var;
    }

    @Override // defpackage.hwe
    public void q0() {
        fxe fxeVar = (fxe) this.a;
        jve jveVar = (jve) this.b;
        List<CostCenterField> list = jveVar.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (CostCenterField costCenterField : list) {
            String str = costCenterField.a;
            arrayList.add(new CostCenterParam(str, costCenterField.b, fxeVar.b(str)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((CostCenterParam) next).c != null ? !evu0.J(r4) : false) {
                arrayList2.add(next);
            }
        }
        sk7 sk7Var = ((gxe) this.c).f;
        o2y0 o2y0Var = (o2y0) this.w;
        String str2 = (String) this.x;
        sk7Var.getClass();
        List h = o2y0Var.b().h();
        if (h == null) {
            h = EmptyList.a;
        }
        if (a.N0(arrayList2).equals(a.N0(h))) {
            return;
        }
        ((b) sk7Var.b).a(o2y0Var, arrayList2, new exe(sk7Var, str2, jveVar, o2y0Var));
    }

    @Override // defpackage.hwe
    public String r0() {
        return (String) this.x;
    }

    public bc(String str, tn8 tn8Var, il ilVar, SharedPaymentContext sharedPaymentContext) {
        this.a = str;
        this.b = tn8Var;
        this.c = ilVar;
        this.w = sharedPaymentContext;
        this.x = new ArrayList();
    }

    public bc(am2 am2Var, c0d0 c0d0Var) {
        this.a = am2Var;
        this.b = c0d0Var;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: w17
            public final /* synthetic */ bc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                bc bcVar = this.b;
                switch (i2) {
                    case 0:
                        return new y17((am2) bcVar.a, (c0d0) bcVar.b, (com.yandex.plus.acquisition.adapter.internal.processor.a) ((i3y) bcVar.w).getValue(), (v42) ((i3y) bcVar.x).getValue());
                    default:
                        return new com.yandex.plus.acquisition.adapter.internal.processor.a((c0d0) bcVar.b, (rzc0) ((i3y) ((am2) bcVar.a).c).getValue(), (v42) ((i3y) bcVar.x).getValue());
                }
            }
        });
        final int i2 = 1;
        this.w = kotlin.a.a(new sls(this) { // from class: w17
            public final /* synthetic */ bc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                bc bcVar = this.b;
                switch (i22) {
                    case 0:
                        return new y17((am2) bcVar.a, (c0d0) bcVar.b, (com.yandex.plus.acquisition.adapter.internal.processor.a) ((i3y) bcVar.w).getValue(), (v42) ((i3y) bcVar.x).getValue());
                    default:
                        return new com.yandex.plus.acquisition.adapter.internal.processor.a((c0d0) bcVar.b, (rzc0) ((i3y) ((am2) bcVar.a).c).getValue(), (v42) ((i3y) bcVar.x).getValue());
                }
            }
        });
        this.x = kotlin.a.a(new rm6(17));
    }

    public /* synthetic */ bc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
    }

    public bc() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.w = null;
        this.x = bg1.x;
    }
}
