package com.vk.webapp.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.vk.contacts.ContactsManager;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.SchemeStat$TypeMarketScreenItem;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vkontakte.android.R;
import defpackage.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0a;
import xsna.asp;
import xsna.bpn0;
import xsna.brm0;
import xsna.cvs;
import xsna.dli0;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.ece0;
import xsna.g8n0;
import xsna.gvv0;
import xsna.gzs;
import xsna.hzg0;
import xsna.i1v0;
import xsna.izs;
import xsna.l1w0;
import xsna.lvv0;
import xsna.mfu0;
import xsna.o25;
import xsna.oz50;
import xsna.p4y;
import xsna.pjp;
import xsna.q7j0;
import xsna.qk;
import xsna.rli0;
import xsna.s3q0;
import xsna.srq0;
import xsna.tb0;
import xsna.tvv0;
import xsna.txv0;
import xsna.vu80;
import xsna.w7y;
import xsna.wwv0;
import xsna.xuv0;
import xsna.xwk;
import xsna.y3l0;
import xsna.ybv0;
import xsna.zcl;
import xsna.zhx0;
import xsna.zr;
import xsna.zrp;

/* compiled from: VkPayFragment.kt */
/* loaded from: classes7.dex */
public final class VkPayFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int g0 = 0;
    public PaymentResult a0;
    public boolean b0;
    public CommonMarketStat$TypeMarketOrdersItem.Source c0;
    public final bpn0 d0 = new bpn0(new g8n0(this, 17));
    public final bpn0 e0 = new bpn0(new y3l0(this, 27));
    public int f0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPayFragment.kt */
    public static final class PaymentResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PaymentResult[] $VALUES;
        public static final PaymentResult CANCELLED;
        public static final PaymentResult FAILED;
        public static final PaymentResult SUCCESS;

        static {
            PaymentResult paymentResult = new PaymentResult("SUCCESS", 0);
            SUCCESS = paymentResult;
            PaymentResult paymentResult2 = new PaymentResult(SignalingProtocol.HUNGUP_REASON_FAILED, 1);
            FAILED = paymentResult2;
            PaymentResult paymentResult3 = new PaymentResult("CANCELLED", 2);
            CANCELLED = paymentResult3;
            PaymentResult[] paymentResultArr = {paymentResult, paymentResult2, paymentResult3};
            $VALUES = paymentResultArr;
            $ENTRIES = new asp(paymentResultArr);
        }

        public PaymentResult() {
            throw null;
        }

        public static PaymentResult valueOf(String str) {
            return (PaymentResult) Enum.valueOf(PaymentResult.class, str);
        }

        public static PaymentResult[] values() {
            return (PaymentResult[]) $VALUES.clone();
        }
    }

    /* compiled from: VkPayFragment.kt */
    public static final class a extends c {
    }

    /* compiled from: VkPayFragment.kt */
    public static final class b {
        public static a a(String str, String str2, JSONObject jSONObject) {
            return b("vkpay&hash=" + Uri.encode("aid=" + str + "&action=" + str2 + (jSONObject == null ? "" : rli0.r(rli0.t(dli0.c(jSONObject.keys()), new ece0(jSONObject, 29)), "&", null, 60))));
        }

        public static a b(String str) {
            Object failure;
            Set<String> queryParameterNames;
            a aVar = new a(VkPayFragment.class, null, null);
            long n = o25.a().n();
            int i = VkPayFragment.g0;
            String j = o25.a().j();
            if (str != null && !drm0.N(str)) {
                if (brm0.B(str, "vkpay", false)) {
                    j = Uri.parse(brm0.A(str, "vkpay", j)).buildUpon().toString();
                } else {
                    ArrayList a = e43.a("vk.com", "vk.ru");
                    if (!a.contains(a0a.d)) {
                        a.add(a0a.d);
                    }
                    if (!a.isEmpty()) {
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            String a2 = zr.a("https://", str2, "/vkpay");
                            String a3 = zr.a("vk://", str2, "/vkpay");
                            if (brm0.B(str, a2, true) || brm0.B(str, a3, true)) {
                                StringBuilder sb = new StringBuilder();
                                try {
                                    failure = Uri.parse(str);
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                Uri uri = (Uri) (failure instanceof Result.Failure ? null : failure);
                                Uri.Builder buildUpon = Uri.parse(j).buildUpon();
                                if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
                                    for (String str3 : queryParameterNames) {
                                        buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                                    }
                                }
                                sb.append(buildUpon.build().toString());
                                int L = drm0.L(str, '#', 0, 6);
                                if (L != -1) {
                                    String substring = str.substring(L);
                                    if (!drm0.N(substring)) {
                                        sb.append(substring);
                                    }
                                }
                                j = sb.toString();
                            }
                        }
                    }
                    j = Uri.parse(j).buildUpon().path(str).toString();
                }
            }
            if (n != 0) {
                aVar.j.putLong("key_application_id", n);
                aVar.j.putString("key_url", j);
            } else {
                aVar.j.putString("key_url", j);
                Bundle bundle = aVar.j;
                InternalMiniApps.Companion.getClass();
                bundle.putLong("key_application_id", InternalMiniApps.VK_PAY_OLD.h().a);
            }
            return aVar;
        }

        public static PaymentResult c(Intent intent) {
            String stringExtra;
            return (intent == null || (stringExtra = intent.getStringExtra("vk_pay_result")) == null) ? PaymentResult.CANCELLED : new JSONObject(stringExtra).optBoolean("status", false) ? PaymentResult.SUCCESS : PaymentResult.FAILED;
        }
    }

    /* compiled from: VkPayFragment.kt */
    public static abstract class c extends oz50 {
    }

    /* compiled from: VkPayFragment.kt */
    public static final class d implements txv0, gvv0 {
        public final /* synthetic */ gvv0 b;
        public final VkPayFragment c;
        public final xuv0 d;

        public d(VkPayFragment vkPayFragment, xuv0 xuv0Var, gvv0 gvv0Var) {
            this.b = gvv0Var;
            this.c = vkPayFragment;
            this.d = xuv0Var;
        }

        @Override // xsna.txv0
        public final void A() {
            this.d.getClass();
            this.c.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 21);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Af() {
            this.b.Af();
        }

        @Override // xsna.txv0
        public final void Am(srq0 srq0Var) {
            ContactsManager.R0(com.vk.contacts.d.a, this.c.kn(), true, null, null, srq0Var, 28);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final Activity B0() {
            return this.b.B0();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void C4(PersonalDiscountDialogType personalDiscountDialogType) {
            this.b.C4(personalDiscountDialogType);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void D1(tb0 tb0Var) {
            this.b.D1(tb0Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final io.reactivex.rxjava3.disposables.b D6() {
            return this.b.D6();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Ei() {
            this.b.Ei();
        }

        @Override // xsna.mxv0
        public final void Ek(long j, vu80 vu80Var) {
            this.b.Ek(j, vu80Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final boolean Hb(zhx0 zhx0Var) {
            return this.b.Hb(zhx0Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Hc(String str) {
            this.b.Hc(str);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Ii() {
            this.b.Ii();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void J3(Intent intent, int... iArr) {
            this.b.J3(intent, iArr);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Jb(String str) {
            this.b.Jb(str);
        }

        @Override // xsna.txv0
        public final void Mf(int i, Intent intent) {
            this.c.Mf(-1, intent);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Og(String str) {
            this.b.Og(str);
        }

        @Override // xsna.mxv0
        public final void P3() {
            this.b.P3();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Qb() {
            this.b.Qb();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Qm() {
            this.b.Qm();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final boolean R7(boolean z) {
            return this.b.R7(z);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Rl() {
            this.b.Rl();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final String T0() {
            return this.b.T0();
        }

        @Override // xsna.mxv0
        public final void Ti(Bundle bundle) {
            this.b.Ti(bundle);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void U3(ArrayList arrayList, WebIdentityCardData webIdentityCardData, WebApiApplication webApiApplication) {
            this.b.U3(arrayList, webIdentityCardData, webApiApplication);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Va(OnboardingModalArguments onboardingModalArguments, n0 n0Var) {
            this.b.Va(onboardingModalArguments, n0Var);
        }

        @Override // xsna.mxv0
        public final void Vf(WebApiApplication webApiApplication, vu80 vu80Var) {
            this.b.Vf(webApiApplication, vu80Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void W7(boolean z, boolean z2) {
            this.b.W7(z, z2);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void Wl() {
            this.b.Wl();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final boolean Ze(String str, boolean z) {
            return this.b.Ze(str, z);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void ac() {
            this.b.ac();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void am(List<String> list) {
            this.b.am(list);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final boolean bh() {
            return this.b.bh();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final boolean cl(boolean z) {
            return this.b.cl(z);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void e3(tb0 tb0Var) {
            this.b.e3(tb0Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void e8(boolean z, cvs cvsVar) {
            this.b.e8(z, cvsVar);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void f7(long j, long j2, String str) {
            this.b.f7(j, j2, str);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void h2() {
            this.b.h2();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void i4(String str, String str2, String str3) {
            this.b.i4(str, str2, str3);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final boolean i6() {
            return this.b.i6();
        }

        @Override // xsna.mxv0
        public final void i7(WebApiApplication webApiApplication, vu80 vu80Var) {
            this.b.i7(webApiApplication, vu80Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void ic() {
            this.b.ic();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final VkUiView.BannerAd j0() {
            return this.b.j0();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void jk() {
            this.b.jk();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final izs<lvv0, s3q0> ke() {
            return this.b.ke();
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void kk(String str, q7j0 q7j0Var) {
            this.b.kk(str, q7j0Var);
        }

        @Override // xsna.mxv0
        public final void l9(WebApiApplication webApiApplication, int i) {
            this.b.l9(webApiApplication, i);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void lj(boolean z) {
            this.b.lj(z);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void n9() {
            this.b.n9();
        }

        @Override // xsna.mxv0
        public final void nn(WebApiApplication webApiApplication, int i, boolean z) {
            this.b.nn(webApiApplication, i, z);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void oc(String str) {
            this.b.oc(str);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void oh(WebGroupShortInfo webGroupShortInfo, w7y w7yVar) {
            this.b.oh(webGroupShortInfo, w7yVar);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void pl(Integer num) {
            this.b.pl(num);
        }

        @Override // xsna.mxv0
        public final void te(Bundle bundle) {
            this.b.te(bundle);
        }

        @Override // xsna.mxv0
        public final void xk(WebApiApplication webApiApplication, String str, boolean z) {
            this.b.xk(webApiApplication, str, z);
        }

        @Override // xsna.txv0
        public final void y1(String str) {
            hzg0 hzg0Var = pjp.a;
            pjp.c("vk_pay_token", str);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void y4(List<String> list, Long l, WebApiApplication webApiApplication, l1w0 l1w0Var) {
            this.b.y4(list, l, webApiApplication, l1w0Var);
        }

        @Override // com.vk.superapp.base.js.bridge.VkUiView
        public final void yc(long j, boolean z, gzs gzsVar, izs izsVar, boolean z2) {
            this.b.yc(j, z, gzsVar, izsVar, z2);
        }

        @Override // xsna.mxv0
        public final void z7(long j, vu80 vu80Var) {
            this.b.z7(j, vu80Var);
        }
    }

    /* compiled from: VkPayFragment.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentResult.values().length];
            try {
                iArr[PaymentResult.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentResult.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkPayFragment() {
        Context context = e43.a;
        context = context == null ? null : context;
        e3m.a aVar = e3m.a;
        this.f0 = context.getColor(R.color.vk_azure_A400);
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final boolean Ma(String str) {
        String host;
        Uri parse = Uri.parse(str);
        String host2 = parse.getHost();
        if (host2 != null && drm0.D(host2, "vkpay", false) && (host = parse.getHost()) != null && !drm0.D(host, "vkpay.com", false)) {
            return false;
        }
        xwk.d().e().a(requireContext(), str);
        return true;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (super.a0()) {
            return true;
        }
        this.a0 = PaymentResult.CANCELLED;
        return false;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.nds, xsna.xoo0
    public final int l2() {
        return this.f0;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final wwv0 m5(tvv0 tvv0Var) {
        xuv0 xuv0Var = (xuv0) this.d0.getValue();
        if (this.R == null) {
            oo();
            this.U = true;
        }
        return new ybv0(new d(this, xuv0Var, this.R), tvv0Var, (com.vk.superapp.navigation.api.di.c) this.e0.getValue());
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment
    public final void no(int i) {
        this.f0 = i;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 21 && i2 == -1 && intent != null) {
            ContactsManager.R0(com.vk.contacts.d.a, kn(), true, null, null, new qk(24, this, intent), 28);
        } else if (i == 21) {
            ((xuv0) this.d0.getValue()).b("Cancelled");
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("KEY_FILL_MARKET_STAT", false) : false;
        this.b0 = z;
        if (z) {
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString("track_code") : null;
            this.c0 = string != null ? CommonMarketStat$TypeMarketOrdersItem.Source.valueOf(string) : null;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mfu0 jo = jo();
        if (jo != null) {
            jo.r(JsApiEvent.UPDATE_INFO, new JSONObject());
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void setResult(int i, Intent intent) {
        super.setResult(i, intent);
        this.a0 = b.c(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(UiTrackingScreen uiTrackingScreen) {
        CommonMarketStat$TypeMarketOrdersItem.EventName eventName;
        CommonMarketStat$TypeMarketOrdersItem.EventName eventName2;
        super.y(uiTrackingScreen);
        if (!this.b0 || this.c0 == null) {
            return;
        }
        PaymentResult paymentResult = this.a0;
        int i = paymentResult == null ? -1 : e.$EnumSwitchMapping$0[paymentResult.ordinal()];
        zcl zclVar = null;
        if (i == -1) {
            eventName = CommonMarketStat$TypeMarketOrdersItem.EventName.OPEN_PAYMENT;
        } else {
            if (i != 1 && i != 2) {
                eventName2 = null;
                if (eventName2 == null) {
                    uiTrackingScreen.a(new SchemeStat$TypeMarketScreenItem(SchemeStat$TypeMarketScreenItem.Type.TYPE_MARKET_ORDERS_ITEM, new CommonMarketStat$TypeMarketOrdersItem(eventName2, this.c0, null, null, 12, null), zclVar));
                    return;
                }
                return;
            }
            eventName = CommonMarketStat$TypeMarketOrdersItem.EventName.CANCEL_PAYMENT;
        }
        eventName2 = eventName;
        if (eventName2 == null) {
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        return new p4y((ybv0) wwv0Var);
    }
}
