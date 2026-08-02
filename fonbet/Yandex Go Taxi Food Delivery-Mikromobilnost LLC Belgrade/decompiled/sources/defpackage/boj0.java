package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.ComposeView;
import com.google.gson.Strictness;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.order.bundle.map.impl.data.repository.g;
import com.yandex.go.payments.domain.m0;
import com.yandex.messaging.data.e;
import flex.logger.view.LoggerOverlayView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.c;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verification.adapter.di.IAdapterComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.PointType;
import ru.yandex.taxi.linked_order.interactor.f0;
import ru.yandex.taxi.linked_order.provider.i;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;
import ru.yandex.taxi.summary.requirements.list.models.RequirementType;

/* loaded from: classes6.dex */
public final class boj0 implements IAdapterComponent, wni, z0x, IComponent {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public boj0(LinkedHashMap linkedHashMap, v0x v0xVar) {
        this.a = 11;
        this.b = v0xVar;
        Object obj = new fg1(5).get();
        if (obj == null) {
            ny61.g("Should always be not-null because ThreadLocal has initialValue() and set() method never called");
            throw null;
        }
        this.c = (Map) obj;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            j2x j2xVar = (j2x) entry.getKey();
            v0x v0xVar2 = (v0x) entry.getValue();
            arrayList.add(j2xVar);
            int i = v0xVar2.a;
            linkedHashMap2.put(j2xVar, Integer.valueOf(i));
            if (!linkedHashMap3.containsKey(Integer.valueOf(i))) {
                linkedHashMap3.put(Integer.valueOf(i), v0xVar2);
            }
        }
        this.w = (j2x[]) arrayList.toArray(new j2x[0]);
        this.x = b.t(linkedHashMap);
        this.y = linkedHashMap2;
        this.z = linkedHashMap3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.json.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.serialization.json.b] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlinx.serialization.json.b] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.serialization.json.b] */
    public static String d(String str, c cVar) {
        if (cVar == 0) {
            return null;
        }
        try {
            List Y = evu0.Y(str, new char[]{'.', '[', ']'}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : Y) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (bvu0.l(10, str2) != null) {
                    cVar = (kotlinx.serialization.json.b) a.S(Integer.parseInt(str2), qcx.l(cVar));
                    if (cVar == 0) {
                        return null;
                    }
                } else {
                    cVar = (kotlinx.serialization.json.b) qcx.m(cVar).get(str2);
                    if (cVar == 0) {
                        return null;
                    }
                }
            }
            return qcx.g(qcx.n(cVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void i(boj0 boj0Var, boolean z, int i, sls slsVar, vu0 vu0Var, int i2) {
        kud0 kud0Var;
        if ((i2 & 4) != 0) {
            slsVar = new bgc(12);
        }
        if ((i2 & 8) != 0) {
            vu0Var = null;
        }
        boj0Var.getClass();
        if (vu0Var instanceof su0) {
            boj0Var.p(i, null, new is8(boj0Var, i, 1), true);
            return;
        }
        if (!z) {
            slsVar.invoke();
            return;
        }
        gs0 a = ((is0) boj0Var.c).a();
        if (i == 0) {
            if (a != null) {
                kud0Var = a.a;
            }
            kud0Var = null;
        } else {
            if (a != null) {
                kud0Var = a.b;
            }
            kud0Var = null;
        }
        boolean z2 = kud0Var != null ? kud0Var.g : false;
        boolean z3 = kud0Var != null ? kud0Var.j : false;
        s9e s9eVar = (s9e) ((xe00) boj0Var.x).a.get(Integer.valueOf(i));
        if (z3 && s9eVar != null) {
            ((f4l0) boj0Var.b).e(i, s9eVar);
            slsVar.invoke();
        } else if (z2) {
            slsVar.invoke();
        } else {
            boj0Var.p(i, null, new v45(boj0Var, i, slsVar, 2), false);
        }
    }

    public static void k(boj0 boj0Var, c0k0 c0k0Var, s9e s9eVar, lzu0 lzu0Var, int i) {
        xfb0 xfb0Var;
        s9e s9eVar2 = (i & 2) != 0 ? null : s9eVar;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        Object focVar = (i & 8) != 0 ? new foc(13) : lzu0Var;
        boj0Var.getClass();
        if (!(c0k0Var instanceof yzj0) ? !(c0k0Var instanceof a0k0) || ((a0k0) c0k0Var).b == PointType.SOURCE : ((yzj0) c0k0Var).a == 0) {
            z = true;
        }
        gs0 a = ((is0) boj0Var.c).a();
        if (z) {
            if (a != null) {
                xfb0Var = a.a.i;
            }
            xfb0Var = null;
        } else {
            if (a != null) {
                xfb0Var = a.b.i;
            }
            xfb0Var = null;
        }
        ((bbe) boj0Var.z).a(new nde(z, xfb0Var != null ? xfb0Var.b : null, xfb0Var != null ? xfb0Var.c : null, xfb0Var != null ? xfb0Var.d : null, xfb0Var != null ? xfb0Var.e : null, xfb0Var != null ? xfb0Var.f : null, s9eVar2, new f89(11, boj0Var, c0k0Var, focVar), z2));
    }

    @Override // defpackage.z0x
    public v0x a(int i) {
        v0x v0xVar = (v0x) ((LinkedHashMap) this.z).get(Integer.valueOf(i));
        return v0xVar == null ? (v0x) this.b : v0xVar;
    }

    public void b(ir9 ir9Var, boolean z) {
        Object value;
        ((rpa) this.w).Ig(ir9Var);
        r0 r0Var = ((opa) this.z).a;
        do {
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.valueOf(z)));
    }

    @Override // defpackage.z0x
    public v0x c(u0x u0xVar) {
        Map map = (Map) this.x;
        j2x e = e(u0xVar);
        if (e != null) {
            Object obj = map.get(e);
            if (obj != null) {
                return (v0x) obj;
            }
            ny61.g("Each matcher should be associated with some item adapter");
            return null;
        }
        for (j2x j2xVar : (j2x[]) this.w) {
            LoggerOverlayView.b bVar = (LoggerOverlayView.b) j2xVar;
            bVar.getClass();
            if (u0xVar.getClass() == l0x.class) {
                Map map2 = (Map) this.c;
                Class<?> cls = u0xVar.getClass();
                Object obj2 = map2.get(cls);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    map2.put(cls, obj2);
                }
                ((Set) obj2).add(bVar);
                Object obj3 = map.get(bVar);
                if (obj3 != null) {
                    return (v0x) obj3;
                }
                ny61.g("Each matcher should be associated with some item adapter");
                return null;
            }
        }
        return (v0x) this.b;
    }

    public j2x e(u0x u0xVar) {
        Set set = (Set) ((Map) this.c).get(u0xVar.getClass());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ((LoggerOverlayView.b) ((j2x) next)).getClass();
            if (u0xVar.getClass() == l0x.class) {
                obj = next;
                break;
            }
        }
        return (j2x) obj;
    }

    public bu0 f() {
        an8 an8Var = (an8) this.w;
        bu0 bu0Var = (bu0) this.z;
        if (bu0Var != null) {
            return bu0Var;
        }
        gx50 gx50Var = (gx50) this.b;
        IEbsCryptoSdkConfig iEbsCryptoSdkConfig = ((mpe) this.x).b;
        v3u v3uVar = new v3u();
        Strictness strictness = Strictness.LENIENT;
        Objects.requireNonNull(strictness);
        v3uVar.k = strictness;
        u3u u3uVar = new u3u(v3uVar);
        ITLSFactory tLSFactory = ((a7q0) ((hwo0) this.c).getSecurityController()).getTLSFactory();
        ICommonController commonController = an8Var.getCommonController();
        ISdkDispatchers sdkDispatchers = an8Var.getSdkDispatchers();
        ej40 ej40Var = new ej40(27);
        vwu vwuVar = new vwu();
        i3y i3yVar = gx50Var.a;
        hio hioVar = new hio(vwuVar, new uwu(tLSFactory, (twu) i3yVar.getValue()));
        twu twuVar = (twu) i3yVar.getValue();
        bu0 bu0Var2 = new bu0();
        bu0Var2.a = iEbsCryptoSdkConfig;
        bu0Var2.b = ej40Var;
        bu0Var2.c = u3uVar;
        bu0Var2.d = hioVar;
        bu0Var2.e = twuVar;
        bu0Var2.f = commonController;
        bu0Var2.g = sdkDispatchers;
        bu0Var2.h = new HashMap();
        bu0Var2.i = new HashMap();
        this.z = bu0Var2;
        return bu0Var2;
    }

    @Override // defpackage.z0x
    public int g(u0x u0xVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.y;
        j2x e = e(u0xVar);
        if (e != null) {
            Object obj = linkedHashMap.get(e);
            if (obj != null) {
                return ((Number) obj).intValue();
            }
            ny61.g("Each matcher should be associated with some view type");
            return 0;
        }
        for (j2x j2xVar : (j2x[]) this.w) {
            LoggerOverlayView.b bVar = (LoggerOverlayView.b) j2xVar;
            bVar.getClass();
            if (u0xVar.getClass() == l0x.class) {
                Map map = (Map) this.c;
                Class<?> cls = u0xVar.getClass();
                Object obj2 = map.get(cls);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    map.put(cls, obj2);
                }
                ((Set) obj2).add(bVar);
                Object obj3 = linkedHashMap.get(bVar);
                if (obj3 != null) {
                    return ((Number) obj3).intValue();
                }
                ny61.g("Each matcher should be associated with some view type");
                return 0;
            }
        }
        return ((v0x) this.b).a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.di.IAdapterComponent
    public IAdapterController getAdapterController() {
        mpe mpeVar = (mpe) this.y;
        k70 k70Var = (k70) this.z;
        if (k70Var != null) {
            return k70Var;
        }
        qwu j = ((boj0) this.c).j(d70.a);
        IKeyStorage memoryKeyStorage = ((hwo0) this.b).memoryKeyStorage(mpeVar.k);
        IVerificationSessionController verificationSessionController = ((s421) this.w).getVerificationSessionController();
        y831 y831Var = (y831) verificationSessionController;
        k70 k70Var2 = new k70(new z70(new c70(j, y831Var.getVerificationRequestScheme().getAdapterApiUri(), y831Var.getVerificationRequestScheme().getIsAppendAdapterPort()), memoryKeyStorage, mpeVar.b.getAllowedRedirectHosts()), verificationSessionController, ((an8) this.x).getSdkDispatchers());
        this.z = k70Var2;
        return k70Var2;
    }

    public wga0 h() {
        return (wga0) ((xvf0) this.z).get();
    }

    public qwu j(xn2 xn2Var) {
        qwu qwuVar;
        bu0 f = f();
        HashMap hashMap = (HashMap) f.h;
        HashMap hashMap2 = (HashMap) f.i;
        if (hashMap2.isEmpty()) {
            for (Map.Entry entry : ((Map) ((ej40) f.b).invoke((IEbsCryptoSdkConfig) f.a)).entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                hashMap2.put((xn2) entry2.getKey(), kotlin.a.a(new swu(f, (String) entry2.getValue(), ((ICommonController) f.f).isUseGost(), !(entry2.getKey() instanceof d70))));
            }
        }
        i3y i3yVar = (i3y) hashMap2.get(xn2Var);
        if (i3yVar != null && (qwuVar = (qwu) i3yVar.getValue()) != null) {
            return qwuVar;
        }
        kbs.f(xn2Var, "No HttpsClient for label ");
        return null;
    }

    public void l(kij0 kij0Var) {
        h0 h0Var = (h0) this.y;
        if (kij0Var instanceof iij0) {
            h0Var.d(RequirementType.TRANSFER);
            return;
        }
        if (kij0Var instanceof aij0) {
            h0Var.d(RequirementType.ORDER_DUE);
            return;
        }
        if (kij0Var instanceof zhj0) {
            h0Var.d(RequirementType.INTERCITY_CONTACT);
            return;
        }
        if (kij0Var instanceof xhj0) {
            h0Var.d(RequirementType.EXTRA_PHONE_NUMBER);
            return;
        }
        if (kij0Var instanceof bij0) {
            h0Var.d(RequirementType.ORDER_FOR_OTHER);
            return;
        }
        if ((kij0Var instanceof uhj0) || (kij0Var instanceof vhj0) || (kij0Var instanceof whj0) || (kij0Var instanceof yhj0) || (kij0Var instanceof dij0) || (kij0Var instanceof eij0) || (kij0Var instanceof fij0) || (kij0Var instanceof hij0) || (kij0Var instanceof jij0)) {
            return;
        }
        w511.b();
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.b, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(-759936011, new orb(this, 1), true));
        return composeView;
    }

    @Override // defpackage.z0x
    public void n() {
    }

    public ru.yandex.taxi.linked_order.map.b o() {
        eoy eoyVar = (eoy) this.b;
        ah00 ah00Var = eoyVar.b;
        q5z.h(ah00Var);
        xm00 xm00Var = eoyVar.c;
        q5z.h(xm00Var);
        ru.yandex.taxi.linked_order.map.utils.a aVar = (ru.yandex.taxi.linked_order.map.utils.a) this.c;
        q5z.h(ah00Var);
        r1s r1sVar = new r1s(ah00Var);
        ft00 ft00Var = eoyVar.i;
        q5z.h(ft00Var);
        reu reuVar = new reu(20, ft00Var);
        kly klyVar = (kly) this.w;
        ij00 ij00Var = eoyVar.f;
        q5z.h(ij00Var);
        ru.yandex.taxi.map.a aVar2 = eoyVar.g;
        q5z.h(aVar2);
        qoy qoyVar = eoyVar.h;
        q5z.h(qoyVar);
        ul00 ul00Var = (ul00) this.x;
        tt2 tt2Var = eoyVar.n;
        q5z.h(tt2Var);
        j58 j58Var = new j58();
        ul00 ul00Var2 = (ul00) this.x;
        i iVar = eoyVar.l;
        q5z.h(iVar);
        ru.yandex.taxi.linked_order.map.movement.b bVar = new ru.yandex.taxi.linked_order.map.movement.b(ul00Var2, iVar);
        jtq0 jtq0Var = eoyVar.k;
        q5z.h(jtq0Var);
        o2g o2gVar = (o2g) this.y;
        pho phoVar = eoyVar.r;
        q5z.h(phoVar);
        ru.yandex.taxi.linked_order.map.movement.a aVar3 = new ru.yandex.taxi.linked_order.map.movement.a(bVar, jtq0Var, o2gVar, new oel0(phoVar), i5m.a(sel0.a), i5m.a(gel0.a), tt2Var, null);
        h3y a = i5m.a((wvq) this.z);
        a3v a3vVar = eoyVar.j;
        q5z.h(a3vVar);
        hoy hoyVar = new hoy(aVar, r1sVar, reuVar, klyVar, new f0(ij00Var, aVar2, qoyVar, ul00Var, tt2Var, j58Var, aVar3, a, a3vVar), i5m.a((wvq) this.z));
        ney neyVar = eoyVar.d;
        q5z.h(neyVar);
        b2l0 b2l0Var = eoyVar.e;
        q5z.h(b2l0Var);
        return new ru.yandex.taxi.linked_order.map.b(ah00Var, xm00Var, hoyVar, neyVar, b2l0Var);
    }

    public void p(int i, s9e s9eVar, tls tlsVar, boolean z) {
        xfb0 xfb0Var;
        gs0 a = ((is0) this.c).a();
        if (i == 0) {
            if (a != null) {
                xfb0Var = a.a.i;
            }
            xfb0Var = null;
        } else {
            if (a != null) {
                xfb0Var = a.b.i;
            }
            xfb0Var = null;
        }
        ((bbe) this.z).a(new nde(i == 0, xfb0Var != null ? xfb0Var.b : null, xfb0Var != null ? xfb0Var.c : null, xfb0Var != null ? xfb0Var.d : null, xfb0Var != null ? xfb0Var.e : null, xfb0Var != null ? xfb0Var.f : null, s9eVar, tlsVar, z));
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        switch (this.a) {
            case 1:
                ((hwo0) this.b).removeStorage(((mpe) this.y).k);
                this.z = null;
                break;
            default:
                this.y = null;
                this.z = null;
                break;
        }
    }

    public /* synthetic */ boj0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
    }

    public boj0(x70 x70Var, hwo0 hwo0Var, boj0 boj0Var, s421 s421Var, an8 an8Var, mpe mpeVar) {
        this.a = 1;
        this.b = hwo0Var;
        this.c = boj0Var;
        this.w = s421Var;
        this.x = an8Var;
        this.y = mpeVar;
    }

    public boj0(gx50 gx50Var, hwo0 hwo0Var, an8 an8Var, mpe mpeVar) {
        this.a = 23;
        this.b = gx50Var;
        this.c = hwo0Var;
        this.w = an8Var;
        this.x = mpeVar;
    }

    public boj0(Context context, rs2 rs2Var, String str, List list) {
        this.a = 3;
        this.b = str;
        this.c = list;
        this.w = context.getString(bzh0.go_platform_user_agent);
        rs2Var.getClass();
        this.x = "128354";
        this.y = "release";
        this.z = "5.89.0";
    }

    public boj0(String str, String str2, String str3, String str4, String str5, Integer num, m501 m501Var) {
        this.a = 15;
        this.b = str;
        this.c = str2;
        this.w = str3;
        this.x = str4;
        this.y = str5;
        this.z = num;
    }

    public boj0(sr4 sr4Var, yu6 yu6Var, g gVar, m180 m180Var, fv6 fv6Var, yvf0 yvf0Var) {
        this.a = 5;
        this.b = sr4Var;
        this.w = yu6Var;
        this.x = gVar;
        this.y = m180Var;
        this.z = fv6Var;
        this.c = yvf0Var;
    }

    public boj0(m0 m0Var, z0a0 z0a0Var, yvf0 yvf0Var, pdc pdcVar, com.yandex.div.core.expression.variables.a aVar, oep0 oep0Var) {
        this.a = 20;
        this.w = m0Var;
        this.x = z0a0Var;
        this.c = yvf0Var;
        this.y = pdcVar;
        this.z = aVar;
        this.b = oep0Var;
    }

    public /* synthetic */ boj0() {
        this.a = 13;
    }

    public boj0(klk klkVar, z22 z22Var, zh5 zh5Var, FlexAdapter flexAdapter) {
        this.a = 26;
        this.b = klkVar;
        this.c = z22Var;
        this.w = zh5Var;
        this.x = flexAdapter;
        this.y = new LinkedHashMap();
        this.z = tje.a(sbx.d, new vld0(13));
    }

    public boj0(Context context, qcp0 qcp0Var, hwy0 hwy0Var, hjz hjzVar, dci dciVar, qdc qdcVar, q8s q8sVar) {
        this.a = 17;
        this.b = context;
        this.c = hwy0Var;
        this.w = hjzVar;
        this.x = dciVar;
        this.y = qdcVar;
        this.z = q8sVar;
    }

    public boj0(k3c k3cVar, tj60 tj60Var, fjz fjzVar, jj10 jj10Var, Context context, ru.yandex.taxi.design.utils.a aVar) {
        this.a = 21;
        this.b = k3cVar;
        this.c = tj60Var;
        this.w = fjzVar;
        this.x = jj10Var;
        this.y = context;
        this.z = kotlin.a.b(LazyThreadSafetyMode.NONE, new mqu(23, this, aVar));
    }

    public boj0(Looper looper, nk21 nk21Var, k020 k020Var, sb7 sb7Var, e eVar) {
        this.a = 28;
        this.b = looper;
        this.c = nk21Var;
        this.w = k020Var;
        this.x = sb7Var;
        this.y = eVar;
        this.z = new Handler(looper);
    }

    public boj0(eoy eoyVar, kly klyVar, ru.yandex.taxi.linked_order.map.utils.a aVar, ul00 ul00Var) {
        this.a = 14;
        this.b = eoyVar;
        this.c = aVar;
        this.w = klyVar;
        this.x = ul00Var;
        this.y = new o2g(eoyVar, 6);
        this.z = new wvq((xvf0) new o2g(eoyVar, 2), (xvf0) new o2g(eoyVar, 0), (xvf0) new o2g(eoyVar, 3), (xvf0) new o2g(eoyVar, 5), (xvf0) new o2g(eoyVar, 1), (xvf0) new hbn(17, new o2g(eoyVar, 4)), 14, false);
    }
}
