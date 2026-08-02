package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.Constants;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.feature.FeatureFlag;
import com.yandex.go.payments.shared.y;
import com.yandex.go.taxi.summary.shared.sourcedestination.e;
import com.yandex.go.taxi.summary.shared.sourcedestination.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.home.animation.ShimmeringView;
import defpackage.sls;
import io.flutter.plugins.sharedpreferences.StringListLookupResultType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.di.ICoreComponent;
import ru.yandex.taxi.communications.stories.data.StoriesState;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.logistics.ndd_flow.b;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListViewType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final class amp0 implements x3v, tn8, npr0, n5d0, g051, sqt0, vsz0, pnu0 {
    public Object a;
    public Object b;
    public Object c;

    public amp0(DialogueComponent dialogueComponent, ho4 ho4Var) {
        this.a = dialogueComponent;
        ListItemComponent listItemComponent = (ListItemComponent) ho4Var.b;
        this.b = listItemComponent;
        PlaceholderView placeholderView = (PlaceholderView) ho4Var.d;
        this.c = placeholderView;
        zf91.c(listItemComponent);
        int a = c.a(mqg0.component_gray_100, dialogueComponent);
        placeholderView.updateColors(lhc.f(a, Math.abs(76) & 255), lhc.f(a, Math.abs(0) & 255));
        placeholderView.updateGradientWidth((int) tje.x(dialogueComponent.getContext(), 100.0f));
        c.z(new bgc(12), (FrameLayout) ho4Var.c);
    }

    @Override // defpackage.vsz0
    public void A() {
        c().requestAccessibilityFocus();
    }

    @Override // defpackage.g051
    public void B(View view) {
        this.c = view;
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup.getHeight() == 0 || viewGroup.getWidth() == 0) {
            view.setMinimumWidth(view.getContext().getResources().getDimensionPixelSize(qsg0.single_wide_tariff_card_min_width_fallback));
        } else {
            view.setMinimumWidth(viewGroup.getWidth() - viewGroup.getPaddingStart());
        }
        View findViewById = view.findViewById(vfh0.wide_tariff_touch_area);
        if (findViewById instanceof ConstraintLayout) {
            this.b = (ConstraintLayout) findViewById;
        }
    }

    @Override // defpackage.tn8
    public void C() {
        y yVar = (y) this.a;
        yVar.c.a().d(new jzl0((il) this.b, new tor0(yVar, (ynr0) this.c)));
    }

    @Override // defpackage.sqt0
    public void D() {
        mua1.f((a) this.b, "error", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "splash"), 2);
    }

    @Override // defpackage.npr0
    public void E(String str, double d, spr0 spr0Var) {
        G(spr0Var).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d).apply();
    }

    public zbs0 F(she sheVar, X509CertificateHolder x509CertificateHolder) {
        xr1 b;
        xbs0 xbs0Var = new xbs0(new p0x(x509CertificateHolder.a));
        mjj mjjVar = (mjj) this.b;
        fah fahVar = (fah) this.a;
        xr1 algorithmIdentifier = sheVar.getAlgorithmIdentifier();
        fahVar.getClass();
        u2 u2Var = algorithmIdentifier.a;
        if (fah.c.contains(u2Var)) {
            b = !u2Var.q(ekn.b) ? new xr1(a150.a) : new xr1(a150.n, new l2(512L));
        } else {
            b = fah.b(u2Var.q(b490.c3) ? x4i0.m(algorithmIdentifier.b).a.a : u2Var.q(ekn.a) ? a150.c : u2Var.q(b490.F3) ? a150.a : (u2) fah.a.get(u2Var));
        }
        return new zbs0(xbs0Var, sheVar, mjjVar.get(b), (t87) this.c, new kkh());
    }

    public SharedPreferences G(spr0 spr0Var) {
        String str = spr0Var.a;
        Context context = (Context) this.b;
        return str == null ? fme0.a(context) : context.getSharedPreferences(str, 0);
    }

    public void H(d5p d5pVar, xi11 xi11Var) {
        g001[] g001VarArr = (g001[]) this.b;
        for (int i = 0; i < g001VarArr.length; i++) {
            xi11Var.c();
            xi11Var.d();
            g001 B = d5pVar.B(xi11Var.d, 3);
            androidx.media3.common.a aVar = (androidx.media3.common.a) ((List) this.a).get(i);
            String str = aVar.n;
            d6z.k("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = aVar.a;
            if (str2 == null) {
                xi11Var.d();
                str2 = xi11Var.e;
            }
            f7s f7sVar = new f7s();
            f7sVar.a = str2;
            f7sVar.l = eh20.q("video/mp2t");
            f7sVar.m = eh20.q(str);
            f7sVar.e = aVar.e;
            f7sVar.d = aVar.d;
            f7sVar.H = aVar.I;
            f7sVar.p = aVar.q;
            smw0.u(f7sVar, B);
            g001VarArr[i] = B;
        }
    }

    public Size[] I(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list;
        HashMap hashMap = (HashMap) this.c;
        Size[] sizeArr = null;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i))).clone();
        }
        int i2 = 5;
        try {
            sizeArr = ((StreamConfigurationMap) ((wor0) this.a).a).getOutputSizes(i);
        } catch (Throwable unused) {
            sgb1.g(5, "StreamConfigurationMapCompat");
        }
        if (sizeArr == null || sizeArr.length == 0) {
            sgb1.g(5, "StreamConfigurationMapCompat");
            return sizeArr;
        }
        oy80 oy80Var = (oy80) this.b;
        oy80Var.getClass();
        ArrayList arrayList4 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) oy80Var.b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList4.addAll(Arrays.asList(sizeArr2));
            }
        }
        bg1 bg1Var = (bg1) oy80Var.c;
        bg1Var.getClass();
        if (((ExcludedSupportedSizesQuirk) xbj.a.b(ExcludedSupportedSizesQuirk.class)) == null) {
            list = new ArrayList();
        } else {
            String str = bg1Var.b;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE));
                    }
                } else if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0")) {
                        if (i == 34) {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, HProv.ALG_TYPE_BLOCK));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, HProv.ALG_TYPE_BLOCK));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2448, 2448));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, HProv.ALG_TYPE_BLOCK));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0")) {
                        if (i == 34) {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, HProv.ALG_TYPE_BLOCK));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList.add(new Size(2048, HProv.ALG_TYPE_BLOCK));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(2576, 1932));
                        arrayList.add(new Size(HProv.ALG_TYPE_DH, 1440));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, HProv.ALG_TYPE_BLOCK));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(9280, 6944));
                    }
                } else {
                    if (ExcludedSupportedSizesQuirk.f()) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList2 = arrayList5;
                        if (i == 35) {
                            arrayList5.add(new Size(3840, 2160));
                            arrayList5.add(new Size(3264, 2448));
                            arrayList5.add(new Size(3200, 2400));
                            arrayList5.add(new Size(2688, 1512));
                            arrayList5.add(new Size(2592, 1944));
                            arrayList5.add(new Size(2592, 1940));
                            arrayList5.add(new Size(1920, 1440));
                            arrayList2 = arrayList5;
                        }
                    } else if (ExcludedSupportedSizesQuirk.e()) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList2 = arrayList6;
                        if (i == 35) {
                            arrayList6.add(new Size(4032, 3024));
                            arrayList6.add(new Size(4000, 3000));
                            arrayList6.add(new Size(3264, 2448));
                            arrayList6.add(new Size(3200, 2400));
                            arrayList6.add(new Size(3024, 3024));
                            arrayList6.add(new Size(2976, 2976));
                            arrayList6.add(new Size(2448, 2448));
                            arrayList2 = arrayList6;
                        }
                    } else {
                        i2 = 5;
                        sgb1.g(5, "ExcludedSupportedSizesQuirk");
                        list = Collections.EMPTY_LIST;
                    }
                    i2 = 5;
                    list = arrayList2;
                }
                arrayList2 = arrayList;
                i2 = 5;
                list = arrayList2;
            }
            arrayList2 = arrayList3;
            i2 = 5;
            list = arrayList2;
        }
        if (!list.isEmpty()) {
            arrayList4.removeAll(list);
        }
        if (arrayList4.isEmpty()) {
            sgb1.g(i2, "OutputSizesCorrector");
        }
        Size[] sizeArr3 = (Size[]) arrayList4.toArray(new Size[0]);
        hashMap.put(Integer.valueOf(i), sizeArr3);
        return (Size[]) sizeArr3.clone();
    }

    @Override // defpackage.vsz0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public ToolbarComponent c() {
        return (ToolbarComponent) ((i3y) this.c).getValue();
    }

    public void K(Activity activity, v751 v751Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.c;
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            if (v751Var.equals((v751) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((androidx.window.layout.adapter.sidecar.a) ((wor0) this.a).a).b.iterator();
            while (it.hasNext()) {
                ebs0 ebs0Var = (ebs0) it.next();
                if (ebs0Var.a.equals(activity)) {
                    ebs0Var.d = v751Var;
                    ebs0Var.b.execute(new epo0(23, ebs0Var, v751Var));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void L(fo foVar) {
        czh create = ((gzh) this.b).create();
        cjm0 cjm0Var = (cjm0) this.c;
        String str = (String) this.a;
        wor0 wor0Var = new wor0(new b6s0(str, foVar));
        kbg a = ((z501) cjm0Var.c).a(str);
        ik0 ik0Var = (ik0) cjm0Var.b;
        ik0Var.getClass();
        w9g w9gVar = new w9g(ik0Var, 13);
        int i = 5;
        w9g w9gVar2 = new w9g(ik0Var, i);
        ywf ywfVar = new ywf(15, wor0Var);
        w9g w9gVar3 = new w9g(ik0Var, 14);
        int i2 = 4;
        qcz0 qcz0Var = new qcz0(new w9g(ik0Var, i2), i2);
        w9g w9gVar4 = new w9g(ik0Var, 9);
        oti otiVar = new oti(w9gVar3, new gpx0((xvf0) w9gVar3, (xvf0) qcz0Var, (xvf0) w9gVar4, 11, (byte) 0), 17);
        gaq0 gaq0Var = new gaq0(ywfVar, 10);
        w9g w9gVar5 = new w9g(ik0Var, 7);
        mzf mzfVar = new mzf(a, 1);
        w9g w9gVar6 = new w9g(ik0Var, 2);
        w9g w9gVar7 = new w9g(ik0Var, 8);
        peb pebVar = new peb(w9gVar2, i);
        w9g w9gVar8 = new w9g(ik0Var, 0);
        mzf mzfVar2 = new mzf(a, 3);
        flx0 flx0Var = new flx0(w9gVar8, new uzu0(new flx0(mzfVar2, new c1(mzfVar2, 6), 11), 29), 12);
        w9g w9gVar9 = new w9g(ik0Var, 10);
        w9g w9gVar10 = new w9g(ik0Var, 3);
        w9g w9gVar11 = new w9g(ik0Var, 15);
        int i3 = 27;
        oti otiVar2 = new oti(w9gVar10, new hbn(10, new so4(w9gVar2, w9gVar, w9gVar11, new w9g(ik0Var, 11), w9gVar5, new w9g(ik0Var, 12), w9gVar8, new w9g(ik0Var, 1), w9gVar4, 6)), i3);
        int i4 = 2;
        xvf0 b = i5m.b(new zmm0(ywfVar, otiVar, e2q0.a, new k4((xvf0) gaq0Var, (xvf0) w9gVar5, (xvf0) mzfVar, (xvf0) w9gVar6, (xvf0) w9gVar7, (xvf0) pebVar, (xvf0) w9gVar2, (xvf0) flx0Var, (xvf0) w9gVar9, (xvf0) otiVar2, (xvf0) new mzf(a, i4), 18, false), flx0Var, 26));
        w9g w9gVar12 = new w9g(ik0Var, 6);
        int i5 = 28;
        xvf0 b2 = i5m.b(new k4(i5, new k0n(w9gVar12, b, 1), new k0n(w9gVar12, b, i4), new k0n(w9gVar12, b, 3), v5n.a, new faj(b, i3), new k0n(w9gVar12, b, 4), new faj(b, 28), o6n.a, new faj(b, 26), v6n.a, new c7n(b, 0)));
        n3w n3wVar = y2r0.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b2);
        c6s0 c6s0Var = (c6s0) i5m.b(new y2s0(w9gVar, i5m.b(new z8n0(w9gVar2, b, new p6f(new y2r0(list, arrayList), 9), w9gVar11, 27)), ywfVar, 1)).get();
        qcp0 qcp0Var = c6s0Var.a;
        f6s0 f6s0Var = c6s0Var.b;
        b6s0 b6s0Var = c6s0Var.c;
        mvn mvnVar = new mvn();
        qcp0Var.getClass();
        czh.a(create, new izh(new cxm(new aoi(f6s0Var, b6s0Var, mvnVar)), null, null, null, null, null, 8190));
    }

    public void M(xfj xfjVar) {
        PlaceholderView placeholderView = (PlaceholderView) this.c;
        DialogueComponent dialogueComponent = (DialogueComponent) this.a;
        ListItemComponent listItemComponent = (ListItemComponent) this.b;
        if (jl40.l(xfjVar, sfj.a)) {
            dialogueComponent.hide();
            return;
        }
        int i = 0;
        if (jl40.l(xfjVar, tfj.a)) {
            listItemComponent.setVisibility(4);
            placeholderView.setVisibility(0);
            return;
        }
        if (!(xfjVar instanceof ufj)) {
            w511.b();
            return;
        }
        listItemComponent.setVisibility(0);
        placeholderView.setVisibility(8);
        dialogueComponent.show();
        ufj ufjVar = (ufj) xfjVar;
        dialogueComponent.updateHeaderColor(ufjVar.a);
        listItemComponent.setLeadImage(ufjVar.b);
        wfj wfjVar = ufjVar.d;
        if (wfjVar instanceof vfj) {
            View trailViewAs = listItemComponent.getTrailViewAs(ListButtonComponent.class);
            if (trailViewAs == null) {
                ListButtonComponent listButtonComponent = new ListButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
                listItemComponent.setTrailView(listButtonComponent);
                trailViewAs = listButtonComponent;
            }
            ListButtonComponent listButtonComponent2 = (ListButtonComponent) trailViewAs;
            ArrayList arrayList = ((vfj) wfjVar).a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((zfj) it.next()).a);
            }
            listButtonComponent2.addButtons(arrayList2);
        } else {
            if (!wfjVar.equals(qtb1.B)) {
                w511.b();
                return;
            }
            listItemComponent.clearTrailView();
        }
        int i2 = dfv0.a[ufjVar.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = 1;
        }
        listItemComponent.setTitleAlignment(i);
        listItemComponent.setTitle(ufjVar.c);
    }

    public void N(khq0 khq0Var) {
        mi31 d;
        ((lhq0) this.a).b(khq0Var);
        String str = khq0Var.b;
        if (str == null || (d = b8r.d((b8r) this.b, str, null, 6)) == null) {
            return;
        }
        ((c4r0) this.c).a(new gnx0(new fnx0(d, SelectionOrigin.ACTION), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.go.taxi.summary.shared.sourcedestination.e] */
    public tpr O(ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.c cVar) {
        if (cVar == null) {
            cVar = new e(((k) ((wiq0) this.a)).j.b());
        }
        pei peiVar = (pei) this.c;
        peiVar.getClass();
        tpr t = kotlinx.coroutines.flow.e.t(new g(new b(cVar, peiVar)));
        ((tt2) this.b).getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    public void P(StoriesState storiesState) {
        ViewGroup viewGroup = (ViewGroup) this.a;
        StoriesPreviewsListView storiesPreviewsListView = (StoriesPreviewsListView) this.b;
        if (storiesState == ((StoriesState) this.c)) {
            return;
        }
        this.c = storiesState;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            viewGroup.removeView(storiesPreviewsListView);
        }
        if (storiesState == StoriesState.GONE) {
            return;
        }
        if (viewGroup != null) {
            viewGroup.addView(storiesPreviewsListView);
        }
        boolean isFocusable = storiesPreviewsListView.isFocusable();
        boolean isFocusableInTouchMode = storiesPreviewsListView.isFocusableInTouchMode();
        storiesPreviewsListView.setFocusableInTouchMode(false);
        storiesPreviewsListView.setFocusable(false);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        storiesPreviewsListView.setFocusable(isFocusable);
        storiesPreviewsListView.setFocusableInTouchMode(isFocusableInTouchMode);
        storiesPreviewsListView.setImportantForAccessibility(2);
    }

    @Override // defpackage.sqt0
    public void a() {
        ((a) this.b).a();
    }

    @Override // defpackage.sqt0
    public void b() {
        FeatureFlag featureFlag;
        a aVar = (a) this.b;
        b23 b23Var = (b23) ((com.yandex.fintechsdk.data.config.impl.internal.a) this.a).b.a.get();
        if (b23Var != null && !b23Var.c) {
            Set set = (Set) this.c;
            FeatureFlag.Companion.getClass();
            featureFlag = FeatureFlag.WEB;
            if (!set.contains(featureFlag)) {
                mua1.f(aVar, "bdui", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "splash"), 2);
                return;
            }
        }
        mua1.f(aVar, "webview-payment", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "splash"), 2);
    }

    @Override // defpackage.npr0
    public Boolean d(String str, spr0 spr0Var) {
        SharedPreferences G = G(spr0Var);
        if (G.contains(str)) {
            return Boolean.valueOf(G.getBoolean(str, true));
        }
        return null;
    }

    @Override // defpackage.npr0
    public List e(List list, spr0 spr0Var) {
        Map<String, ?> all = G(spr0Var).getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (tpr0.b(entry.getKey(), entry.getValue(), list != null ? kotlin.collections.a.N0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return kotlin.collections.a.J0(linkedHashMap.keySet());
    }

    @Override // defpackage.tn8
    public void exit() {
        ((y) this.a).d();
    }

    @Override // defpackage.npr0
    public void f(String str, boolean z, spr0 spr0Var) {
        G(spr0Var).edit().putBoolean(str, z).apply();
    }

    @Override // defpackage.npr0
    public ArrayList g(String str, spr0 spr0Var) {
        List list;
        SharedPreferences G = G(spr0Var);
        if (!G.contains(str)) {
            return null;
        }
        String string = G.getString(str, "");
        if (!cvu0.x(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || cvu0.x(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) || (list = (List) tpr0.c(G.getString(str, ""), (dry) this.c)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.vsz0
    public void h(boolean z) {
    }

    @Override // defpackage.npr0
    public void i(String str, long j, spr0 spr0Var) {
        G(spr0Var).edit().putLong(str, j).apply();
    }

    @Override // defpackage.vsz0
    public void j(Runnable runnable) {
        c().setOnNavigationClickListener(runnable);
    }

    @Override // defpackage.n5d0
    public void k(ViewGroup viewGroup) {
        viewGroup.removeView((View) ((LinkedHashMap) this.c).remove(viewGroup));
    }

    @Override // defpackage.vsz0
    public void l(final sls slsVar) {
        c().setTrailContainerClickListener(new Runnable() { // from class: com.yandex.go.payments.summary.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                ((PaymentMethodsListModalView$onAttachedToWindow$1) sls.this).invoke();
            }
        });
    }

    @Override // defpackage.npr0
    public Map m(List list, spr0 spr0Var) {
        Object value;
        Map<String, ?> all = G(spr0Var).getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (tpr0.b(entry.getKey(), entry.getValue(), list != null ? kotlin.collections.a.N0(list) : null) && (value = entry.getValue()) != null) {
                hashMap.put(entry.getKey(), tpr0.c(value, (dry) this.c));
            }
        }
        return hashMap;
    }

    @Override // defpackage.npr0
    public Double n(String str, spr0 spr0Var) {
        SharedPreferences G = G(spr0Var);
        if (G.contains(str)) {
            return (Double) tpr0.c(G.getString(str, ""), (dry) this.c);
        }
        return null;
    }

    @Override // defpackage.npr0
    public void o(String str, List list, spr0 spr0Var) {
        G(spr0Var).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((dry) this.c).a(list))).apply();
    }

    @Override // defpackage.npr0
    public String p(String str, spr0 spr0Var) {
        SharedPreferences G = G(spr0Var);
        if (G.contains(str)) {
            return G.getString(str, "");
        }
        return null;
    }

    @Override // defpackage.tn8
    public void q(ArrayList arrayList) {
        y.a((y) this.a, arrayList);
    }

    @Override // defpackage.npr0
    public Long r(String str, spr0 spr0Var) {
        long j;
        SharedPreferences G = G(spr0Var);
        if (!G.contains(str)) {
            return null;
        }
        try {
            j = G.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j = G.getInt(str, 0);
        }
        return Long.valueOf(j);
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        ((ICoreComponent) this.a).release();
        ((u650) this.b).release();
        ((wrr) this.c).y = null;
    }

    @Override // defpackage.tn8
    public void s(String str) {
        ((y) this.a).n(str, true);
    }

    @Override // defpackage.g051
    public void t(elx0 elx0Var) {
        View view;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
        if (constraintLayout == null || (view = (View) this.c) == null) {
            return;
        }
        constraintLayout.setMinWidth((view.getMinimumWidth() - view.getPaddingStart()) - view.getPaddingEnd());
    }

    @Override // defpackage.npr0
    public qtu0 u(String str, spr0 spr0Var) {
        SharedPreferences G = G(spr0Var);
        if (!G.contains(str)) {
            return null;
        }
        String string = G.getString(str, "");
        return cvu0.x(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new qtu0(string, StringListLookupResultType.JSON_ENCODED) : cvu0.x(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new qtu0(null, StringListLookupResultType.PLATFORM_ENCODED) : new qtu0(null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    @Override // defpackage.npr0
    public void v(List list, spr0 spr0Var) {
        SharedPreferences G = G(spr0Var);
        SharedPreferences.Editor edit = G.edit();
        Map<String, ?> all = G.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (tpr0.b(str, all.get(str), list != null ? kotlin.collections.a.N0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    @Override // defpackage.npr0
    public void w(String str, String str2, spr0 spr0Var) {
        G(spr0Var).edit().putString(str, str2).apply();
    }

    @Override // defpackage.vsz0
    public void x(String str, String str2) {
        c().setTitle(str);
        c().setTrailCompanionText(str2);
    }

    @Override // defpackage.npr0
    public void y(String str, String str2, spr0 spr0Var) {
        G(spr0Var).edit().putString(str, str2).apply();
    }

    @Override // defpackage.n5d0
    public void z(ViewGroup viewGroup) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        viewGroup.removeView((View) linkedHashMap.remove(viewGroup));
        ShimmeringView shimmeringView = new ShimmeringView(viewGroup.getContext(), (com.yandex.plus.home.feature.panel.internalapi.a) this.a, (jse) this.b);
        viewGroup.addView(shimmeringView);
        linkedHashMap.put(viewGroup, shimmeringView);
    }

    public /* synthetic */ amp0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public amp0(Context context, gu11 gu11Var) {
        this.a = context;
        this.b = gu11Var;
        this.c = kotlin.a.a(new gas0(26, this));
    }

    public amp0(SlideableModalView slideableModalView, tlu0 tlu0Var, int i, StoriesPreviewsListViewType storiesPreviewsListViewType) {
        ViewGroup viewGroup = (ViewGroup) slideableModalView.findViewById(yhh0.stories_container);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.a = viewGroup;
        this.b = new StoriesPreviewsListView(slideableModalView.getContext(), tlu0Var.m, i, null, null, tlu0Var.c, tlu0Var.n, storiesPreviewsListViewType);
        this.c = StoriesState.GONE;
    }

    public amp0(mjj mjjVar, t87 t87Var) {
        this.a = new fah();
        this.b = mjjVar;
        this.c = t87Var;
    }

    public amp0(List list) {
        this.a = list;
        this.b = new g001[list.size()];
        this.c = new zp1(new ykn0(6, this));
    }
}
