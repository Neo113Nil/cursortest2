package defpackage;

import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import com.bumptech.glide.load.engine.c;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.transform.exception.JasonPathNotFoundException;
import com.yandex.go.payments.shared.data.model.SaveMemberDetails;
import com.yandex.go.payments.shared.data.model.m;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.tips.ui.TipItemUiState$ItemType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.a;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;
import ru.yandex.taxi.order.view.FeedbackView;

/* loaded from: classes12.dex */
public final class mum implements w7p, p851, vwo, zs10, jkz0, ims, vjs, el7, lss {
    public final Object a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mum(byte[] bArr) {
        boolean z;
        yzh yzhVar;
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        int b = tnb1.b(28, bArr2) & Integer.MAX_VALUE;
        int[] iArr = bkn.a;
        int i = iArr[7] ^ b;
        int[] iArr2 = bkn.b;
        int i2 = iArr2[7] ^ b;
        int[] iArr3 = bkn.c;
        int i3 = iArr3[7] ^ b;
        for (int i4 = 6; i4 > 0; i4--) {
            int b2 = tnb1.b(i4 * 4, bArr2);
            b |= b2;
            i |= iArr[i4] ^ b2;
            i2 |= iArr2[i4] ^ b2;
            i3 |= b2 ^ iArr3[i4];
        }
        int b3 = tnb1.b(0, bArr2);
        if ((b != 0 || b3 - 2147483648 > -2147483647) && (i != 0 || Integer.MIN_VALUE + b3 < iArr[0] - (-2147483647))) {
            z = (((iArr2[0] ^ b3) | i2) != 0) & (((iArr3[0] ^ b3) | i3) != 0);
        } else {
            z = false;
        }
        if (z) {
            zjn zjnVar = new zjn();
            if (bkn.a(bArr2, false, zjnVar)) {
                int[] iArr4 = new int[20];
                w9a1.d(0, 0, zjnVar.a, iArr4);
                w9a1.d(0, 10, zjnVar.b, iArr4);
                yzhVar = new yzh(iArr4);
                if (yzhVar == null) {
                    this.a = yzhVar;
                    return;
                } else {
                    ny61.g("invalid public key");
                    throw null;
                }
            }
        }
        yzhVar = null;
        if (yzhVar == null) {
        }
    }

    public static SaveMemberDetails i(bmn bmnVar, kh10 kh10Var) {
        String obj = evu0.k0(bmnVar.b.toString()).toString();
        String obj2 = evu0.k0(bmnVar.d.toString()).toString();
        Long l = null;
        if (!bmnVar.f) {
            SaveMemberDetails.Companion.getClass();
            return new SaveMemberDetails(new SaveMemberDetails.Details(obj, obj2), null);
        }
        m mVar = SaveMemberDetails.Companion;
        boolean z = bmnVar.m;
        if (z) {
            String obj3 = bmnVar.g.toString();
            if (obj3.length() != 0 && (l = bvu0.m(10, obj3)) == null) {
                jst.e.k(new NumberFormatException(), String.format("Cannot parse limit=%s", Arrays.copyOf(new Object[]{obj3}, 1)));
                throw new ValidationException(Collections.singletonList(new jz21("limit", kh10Var.i)));
            }
        }
        mVar.getClass();
        return new SaveMemberDetails(new SaveMemberDetails.Details(obj, obj2), new SaveMemberDetails.Limits(l, z));
    }

    public int a(int i, String str) {
        Iterator it = evu0.M(str).iterator();
        if (!it.hasNext()) {
            ny61.p();
            return 0;
        }
        int e = e(i, (String) it.next());
        while (it.hasNext()) {
            int e2 = e(i, (String) it.next());
            if (e < e2) {
                e = e2;
            }
        }
        return e;
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        return (t50) this.a;
    }

    @Override // defpackage.vjs
    public void b() {
        ((eks) this.a).T();
    }

    public Object c(sum sumVar) {
        if (sumVar instanceof num) {
            ArrayList arrayList = ((num) sumVar).a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(c((sum) it.next()));
            }
            return arrayList2;
        }
        if (sumVar instanceof qum) {
            Serializable b = ((wjm) this.a).b(((qum) sumVar).a);
            b.b(b);
            return b;
        }
        if (sumVar instanceof rum) {
            return bia1.i(((rum) sumVar).a);
        }
        if (sumVar instanceof p131) {
            return d((p131) sumVar);
        }
        if (sumVar.equals(pum.a)) {
            return null;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.w7p
    public Object create() {
        j4n j4nVar = (j4n) this.a;
        return new x1o((yht) j4nVar.a, (yht) j4nVar.b, (yht) j4nVar.c, (yht) j4nVar.x, (c) j4nVar.y, (c) j4nVar.z, (jdj) j4nVar.w);
    }

    public Object d(p131 p131Var) {
        sh5 stateManager;
        Object value;
        String a;
        wjm wjmVar = (wjm) this.a;
        if (!(p131Var instanceof jfy0)) {
            if (!(p131Var instanceof n231)) {
                w511.b();
                return null;
            }
            FlexAdapter flexAdapter = (FlexAdapter) wjmVar.w;
            if (flexAdapter == null || (stateManager = flexAdapter.getStateManager()) == null || (value = stateManager.getValue(((n231) p131Var).a)) == null) {
                throw new JasonPathNotFoundException(a.X(((n231) p131Var).a, Extension.DOT_CHAR, null, null, null, 62));
            }
            return value;
        }
        jfy0 jfy0Var = (jfy0) p131Var;
        if (jfy0Var instanceof ffy0) {
            a = UUID.randomUUID().toString();
        } else {
            if (!(jfy0Var instanceof ify0)) {
                w511.b();
                return null;
            }
            a = ((sl3) wjmVar.b).a();
        }
        if (a == null) {
            return null;
        }
        return cvu0.v(jfy0Var.b(), jfy0Var.a(), a, false);
    }

    public int e(int i, String str) {
        int i2;
        boolean y = evu0.y(str, "$START_TIME$", false);
        boolean y2 = evu0.y(str, "$END_TIME$", false);
        int o = ((yzh) this.a).o(cvu0.w(cvu0.w(str, "$START_TIME$", ""), "$END_TIME$", ""));
        if (y) {
            o += i;
            i2 = i;
        } else {
            i2 = -1;
        }
        if (!y2) {
            return o;
        }
        if (i2 >= 0) {
            i = i2;
        }
        return o + i;
    }

    @Override // defpackage.vjs
    public void f() {
        ((eks) this.a).r(new xvq(27));
    }

    @Override // defpackage.vwo
    public ViewGroup.LayoutParams g() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // defpackage.vwo
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.a).getMeasuredHeight();
    }

    @Override // defpackage.vwo
    public int getPaddingEnd() {
        int i;
        i = ((ExtendedFloatingActionButton) this.a).extendedPaddingEnd;
        return i;
    }

    @Override // defpackage.vwo
    public int getPaddingStart() {
        int i;
        i = ((ExtendedFloatingActionButton) this.a).extendedPaddingStart;
        return i;
    }

    @Override // defpackage.vwo
    public int getWidth() {
        int i;
        int i2;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.a;
        int measuredWidth = (extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd();
        i = extendedFloatingActionButton.extendedPaddingStart;
        i2 = extendedFloatingActionButton.extendedPaddingEnd;
        return i2 + i + measuredWidth;
    }

    public FormStateRoutePointDto h(j6s j6sVar, String str) {
        Object obj = j6sVar.a.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof FormStateRoutePointDto) {
            return (FormStateRoutePointDto) obj;
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return (FormStateRoutePointDto) ((Moshi) ((u1n) this.a).b).adapter(FormStateRoutePointDto.class).fromJsonValue((Map) obj);
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        jqs jqsVar = (jqs) this.a;
        d6z.y("The result can only set once!", jqsVar.b == null);
        jqsVar.b = bVar;
        return "FutureChain[" + jqsVar + "]";
    }

    @Override // defpackage.jkz0
    public void m(pkz0 pkz0Var) {
        TipItemUiState$ItemType tipItemUiState$ItemType;
        jfz0 jfz0Var = (jfz0) pkz0Var;
        bgz0 bgz0Var = ((FeedbackView) this.a).getPresenter().D;
        dm21 dm21Var = bgz0Var.b;
        o2y0 o2y0Var = bgz0Var.c;
        ksq b = ((com.yandex.go.taxi.order.feedback.domain.b) dm21Var).b(o2y0Var.b().a);
        String str = jfz0Var.f;
        TipItemUiState$ItemType tipItemUiState$ItemType2 = jfz0Var.g;
        TipsType tipsType = jfz0Var.e;
        if ((jl40.l(str, b.f) && tipItemUiState$ItemType2 == TipItemUiState$ItemType.VALUE && !o2y0Var.b().F()) || (tipItemUiState$ItemType2 == (tipItemUiState$ItemType = TipItemUiState$ItemType.INPUT) && o2y0Var.b().F())) {
            o2y0Var.b().U("0", tipsType);
            bgz0Var.b("0", tipsType);
        } else if (tipItemUiState$ItemType2 == tipItemUiState$ItemType) {
            bgz0Var.n.g(str);
        } else {
            orq orqVar = bgz0Var.f;
            String str2 = o2y0Var.b().a;
            List b2 = o2y0Var.b().l.getW().getG().getB();
            yh70 yh70Var = orqVar.d;
            String b3 = ((ci70) orqVar.c).b(str2);
            String lowerCase = tipsType.name().toLowerCase(Locale.US);
            String obj = b2.toString();
            yh70Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, b3);
            hashMap.put("tips", str);
            HashMap q = x4e.q(hashMap, "type", lowerCase, "tips_list", obj);
            Regex regex = sho.a;
            yh70Var.a.a(sb2.q("${screen}.DidChangeTips", hashMap), hashMap, 1, q);
            TaxiOrder b4 = o2y0Var.b();
            synchronized (b4) {
                b4.l = b4.l.V();
            }
            o2y0Var.b().U(str, tipsType);
            bgz0Var.b(str, tipsType);
        }
        Float j = avu0.j(jfz0Var.f);
        if (tipItemUiState$ItemType2 == TipItemUiState$ItemType.INPUT || j == null || jl40.j(j, 0.0f)) {
            return;
        }
        bgz0Var.a();
    }

    @Override // defpackage.vjs
    public void onBack() {
        ((eks) this.a).r(new qu(9));
    }

    @Override // defpackage.zs10
    public Object u(String str) {
        Object failure;
        zrm zrmVar = ((jap) this.a).a;
        try {
            failure = (gcp) ((sbx) zrmVar.b).b((KSerializer) ((i3y) zrmVar.c).getValue(), str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        gcp gcpVar = (gcp) failure;
        return gcpVar == null ? new fcp(str) : gcpVar;
    }

    public /* synthetic */ mum(Object obj) {
        this.a = obj;
    }

    public mum(a73 a73Var) {
        this.a = (CaptureSessionOnClosedNotCalledQuirk) a73Var.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public mum(oho ohoVar) {
        PayUIEvgenAnalyticsPlatform payUIEvgenAnalyticsPlatform;
        int i = nho.a[ohoVar.b.ordinal()];
        if (i == 1) {
            payUIEvgenAnalyticsPlatform = PayUIEvgenAnalyticsPlatform.Android;
        } else if (i == 2) {
            payUIEvgenAnalyticsPlatform = PayUIEvgenAnalyticsPlatform.AndroidTv;
        } else {
            w511.b();
            throw null;
        }
        this.a = new hio(payUIEvgenAnalyticsPlatform);
    }

    public mum(yho yhoVar) {
        PayUIEvgenDiagnosticPlatform payUIEvgenDiagnosticPlatform;
        int i = xho.a[yhoVar.b.ordinal()];
        if (i == 1) {
            payUIEvgenDiagnosticPlatform = PayUIEvgenDiagnosticPlatform.Android;
        } else if (i == 2) {
            payUIEvgenDiagnosticPlatform = PayUIEvgenDiagnosticPlatform.AndroidTv;
        } else {
            w511.b();
            throw null;
        }
        this.a = new uxd(payUIEvgenDiagnosticPlatform);
    }
}
