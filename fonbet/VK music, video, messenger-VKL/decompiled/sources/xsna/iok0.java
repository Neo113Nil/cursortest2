package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.confirmaccount.api.di.ConfirmAccountComponent;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.permission.PermissionHelper;
import com.vk.permission.dialog.VkSeparatePermissionDialog;
import com.vk.superapp.api.dto.app.WebLeaderboardData;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.changeemail.VkChangeEmailActivity;
import com.vk.superapp.browser.internal.ui.changephone.a;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.verification.account.VerificationFlow;
import com.vk.superapp.verification.account.di.VerificationAccountComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aex0;
import xsna.av20;
import xsna.b2v0;
import xsna.bqu0;
import xsna.dw20;
import xsna.eeu0;
import xsna.mcv0;
import xsna.nnv0;
import xsna.p53;
import xsna.smu0;

/* compiled from: StackSuperrappUiRouter.kt */
/* loaded from: classes11.dex */
public abstract class iok0<T extends Fragment> implements SuperappUiRouterBridge {
    public final gt70 b;
    public final c c;

    /* compiled from: StackSuperrappUiRouter.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuperappUiRouterBridge.Permission.values().length];
            try {
                iArr[SuperappUiRouterBridge.Permission.CAMERA_AND_DISK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperappUiRouterBridge.Permission.DISK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperappUiRouterBridge.Permission.CAMERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperappUiRouterBridge.Permission.CAMERA_QR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SuperappUiRouterBridge.Permission.CAMERA_VMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StackSuperrappUiRouter.kt */
    public static final class c implements w8i {
    }

    /* compiled from: StackSuperrappUiRouter.kt */
    /* loaded from: classes6.dex */
    public static final class d implements smu0.a {
        public final /* synthetic */ aex0.d a;

        public d(aex0.d dVar) {
            this.a = dVar;
        }

        @Override // xsna.smu0.a
        public final void a() {
            this.a.a();
        }

        @Override // xsna.smu0.a
        public final void b() {
            this.a.b();
        }

        @Override // xsna.smu0.a
        public final void onCancel() {
            this.a.onCancel();
        }
    }

    /* compiled from: StackSuperrappUiRouter.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        public e(SuperappUiRouterBridge.e eVar) {
            super(0, eVar, SuperappUiRouterBridge.e.class, "onPermissionGranted", "onPermissionGranted()V", 0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((SuperappUiRouterBridge.e) this.receiver).b();
            return s3q0.a;
        }
    }

    /* compiled from: StackSuperrappUiRouter.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<List<? extends String>, s3q0> {
        public f(SuperappUiRouterBridge.e eVar) {
            super(1, eVar, SuperappUiRouterBridge.e.class, "onPermissionDenied", "onPermissionDenied(Ljava/util/List;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(List<? extends String> list) {
            ((SuperappUiRouterBridge.e) this.receiver).a();
            return s3q0.a;
        }
    }

    /* compiled from: StackSuperrappUiRouter.kt */
    /* loaded from: classes6.dex */
    public static final class g implements gz20 {
        public final /* synthetic */ aex0 b;

        public g(aex0 aex0Var) {
            this.b = aex0Var;
        }

        @Override // xsna.gz20
        public final void onCancel() {
            aex0.c cVar = this.b.j;
            if (cVar != null) {
                cVar.onCancel();
            }
        }
    }

    /* compiled from: StackSuperrappUiRouter.kt */
    /* loaded from: classes6.dex */
    public static final class h implements hz20 {
        public final /* synthetic */ aex0 b;

        public h(aex0 aex0Var) {
            this.b = aex0Var;
        }

        @Override // xsna.hz20
        public final void a(int i) {
            aex0.e eVar;
            aex0 aex0Var = this.b;
            if (i == -3) {
                aex0.e eVar2 = aex0Var.i;
                if (eVar2 != null) {
                    eVar2.b.a();
                    return;
                }
                return;
            }
            if (i != -2) {
                if (i == -1 && (eVar = aex0Var.g) != null) {
                    eVar.b.a();
                    return;
                }
                return;
            }
            aex0.e eVar3 = aex0Var.h;
            if (eVar3 != null) {
                eVar3.b.a();
            }
        }
    }

    public iok0() {
        gt70 gt70Var = new gt70();
        gt70Var.a = new ArrayList();
        this.b = gt70Var;
        this.c = new c();
    }

    public static void y0(iok0 iok0Var, izs izsVar) {
        hyd0 hyd0Var = new hyd0(2);
        iok0Var.getClass();
        qro0.c(new crf(iok0Var, izsVar, hyd0Var, 4));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public boolean B(WebView webView) {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void C(Context context, String str, List<String> list) {
        T w0 = w0();
        if (w0 == null) {
            w0 = null;
        }
        if (w0 != null) {
            w0.startActivityForResult(((ConfirmAccountComponent) ((k7m) m7m.f(this.c)).mo408a(fpf0.a(ConfirmAccountComponent.class))).m9(context, str, list), 130);
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void E(Context context, String str) {
        qro0.c(new com.vk.movika.sdk.base.ui.r0(25, context, str));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void G(String str, VerificationFlow verificationFlow) {
        T w0 = w0();
        if (w0 == null) {
            w0 = null;
        }
        if (w0 != null) {
            lyv0 a2 = ((VerificationAccountComponent) ((k7m) m7m.f(this.c)).mo408a(fpf0.a(VerificationAccountComponent.class))).Cc().a(str, verificationFlow);
            a2.setTargetFragment(w0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            a2.Td(w0.getParentFragmentManager(), "vkVerificationAccount");
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void J(WebGroup webGroup, LinkedHashMap linkedHashMap, zu1 zu1Var, com.vk.newsfeed.common.recycler.holders.attachments.a aVar) {
        FragmentActivity activity;
        VkSeparatePermissionDialog.PermissionItem permissionItem;
        T w0 = w0();
        if (w0 == null || (activity = w0.getActivity()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            p53 p53Var = (p53) entry.getKey();
            if (epx.f(p53Var, p53.d.b)) {
                permissionItem = new VkSeparatePermissionDialog.PermissionItem(((p53) entry.getKey()).a(), activity.getString(R.string.vk_apps_intent_promo_newsletter_title), activity.getString(R.string.vk_apps_intent_promo_newsletter_subtitle), true, ((Boolean) entry.getValue()).booleanValue());
            } else if (epx.f(p53Var, p53.c.b)) {
                permissionItem = new VkSeparatePermissionDialog.PermissionItem(((p53) entry.getKey()).a(), activity.getString(R.string.vk_apps_intent_non_promo_newsletter_title), activity.getString(R.string.vk_apps_intent_non_promo_newsletter_subtitle), true, ((Boolean) entry.getValue()).booleanValue());
            } else {
                if (!(p53Var instanceof p53.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                permissionItem = new VkSeparatePermissionDialog.PermissionItem(((p53) entry.getKey()).a(), activity.getString(R.string.vk_apps_intent_confirmed_notification_title), activity.getString(R.string.vk_apps_intent_confirmed_notification_subtitle), true, ((Boolean) entry.getValue()).booleanValue());
            }
            arrayList.add(permissionItem);
        }
        if (arrayList.isEmpty()) {
            g0(new SuperappUiRouterBridge.a.d(webGroup), new jok0(zu1Var, aVar));
            return;
        }
        arrayList.add(0, new VkSeparatePermissionDialog.PermissionItem("", activity.getString(R.string.vk_apps_intent_in_app_events), "", false, true));
        int i = VkSeparatePermissionDialog.h1;
        VkSeparatePermissionDialog a2 = VkSeparatePermissionDialog.a.a(webGroup.e(), webGroup.d(), activity.getString(R.string.vk_apps_intent_description, webGroup.d()), arrayList);
        a2.Yn(new qas(linkedHashMap, zu1Var, aVar));
        qro0.c(new com.vk.movika.sdk.base.ui.m(22, a2, activity));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void O(Activity activity, VkAlertData vkAlertData, SuperappUiRouterBridge.d dVar) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        qro0.c(new okc(vkAlertData, this, activity, dVar, 2));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void R(Activity activity, VkAlertData.b bVar, final rr1 rr1Var) {
        d.a d2 = v0(hnj.a(activity), null).setTitle(bVar.d()).d(bVar.a());
        VkAlertData.a c2 = bVar.c();
        d.a j = d2.j(c2 != null ? c2.a() : null, new z0c(rr1Var, 1));
        VkAlertData.a b2 = bVar.b();
        d.a i = j.f(b2 != null ? b2.a() : null, new kp3(rr1Var, 3)).i(new wsd(rr1Var, 1));
        i.h(new DialogInterface.OnCancelListener() { // from class: xsna.hok0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rr1.this.a();
            }
        });
        i.m();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void X(Context context, String str, izs<? super String, s3q0> izsVar, gzs<s3q0> gzsVar, Map<String, String> map) {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (!wdx0Var.k() && str == null) {
            gzsVar.invoke();
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = eju0.a().a.K().subscribe(new n1r(new yl0(25, izsVar, gzsVar), 21), new uu60(new vx3(1, gzsVar), 16));
        try {
            int i = VkBrowserActivity.l;
            context.startActivity(VkBrowserActivity.a.a(context, a.C1870a.a(str, map)));
        } catch (Throwable unused) {
            subscribe.dispose();
            gzsVar.invoke();
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void Z(String str, WebUserShortInfo webUserShortInfo, WebApiApplication webApiApplication, final wbr0 wbr0Var) {
        Context mo2getContext;
        T w0 = w0();
        if (w0 == null || (mo2getContext = w0.mo2getContext()) == null) {
            return;
        }
        String string = mo2getContext.getString(R.string.vk_htmlgame_somebody_will_receive_notification);
        SpannableString spannableString = new SpannableString(mo2getContext.getString(R.string.vk_htmlgame_somebody_will_receive_notification, webUserShortInfo.d()));
        spannableString.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, mo2getContext)), drm0.K(0, 6, string, "%s", false), ((spannableString.length() + drm0.K(0, 6, string, "%s", false)) - string.length()) + 2, 0);
        View inflate = LayoutInflater.from(mo2getContext).inflate(R.layout.vk_htmlgame_request, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.tv_game_to)).setText(spannableString);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_game_from);
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        textView.setText(wdx0Var.f());
        ((TextView) inflate.findViewById(R.id.tv_game_comment)).setText(str);
        VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.photo_box);
        VKReplacerView vKReplacerView2 = (VKReplacerView) inflate.findViewById(R.id.iv_game_photo_box);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(mo2getContext);
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        wdx0 wdx0Var2 = e370.f;
        if (wdx0Var2 == null) {
            wdx0Var2 = null;
        }
        create.f(wdx0Var2.e(), new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, R.drawable.vk_circle_placeholder, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65515));
        Button button = (Button) inflate.findViewById(R.id.positive);
        Button button2 = (Button) inflate.findViewById(R.id.negative);
        String url = webApiApplication.d().a(iah0.a(36)).getUrl();
        if (!drm0.N(url)) {
            ifx0 ifx0Var2 = e370.c;
            if (ifx0Var2 == null) {
                ifx0Var2 = null;
            }
            VKImageController<View> create2 = ifx0Var2.b().create(mo2getContext);
            vKReplacerView2.a(((com.vk.core.ui.image.c) create2).getView());
            VKImageController.a.a(create2, url);
        }
        androidx.appcompat.app.d m = v0(hnj.a(mo2getContext), null).setView(inflate).i(new DialogInterface.OnDismissListener() { // from class: xsna.dok0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wbr0 wbr0Var2 = wbr0.this;
                if (wbr0Var2.a) {
                    return;
                }
                wbr0Var2.b.c.m(JsApiMethodType.SHOW_REQUEST_BOX, VkAppsErrors.Client.USER_DENIED, null, null);
            }
        }).m();
        button.setOnClickListener(new ba(6, wbr0Var, m));
        button2.setOnClickListener(new hkc(4, wbr0Var, m));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void c(VkAlertData vkAlertData, SuperappUiRouterBridge.d dVar) {
        FragmentActivity activity;
        T w0 = w0();
        if (w0 == null || (activity = w0.getActivity()) == null) {
            return;
        }
        O(activity, vkAlertData, dVar);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void c0(long j, WebApiApplication webApiApplication, SuperappUiRouterBridge.f fVar, Integer num, nex0 nex0Var) {
        if (!webApiApplication.g() && !webApiApplication.f()) {
            fVar.b();
        } else {
            qro0.c(new crf(this, new rqb(webApiApplication, nex0Var, num, fVar, 2), new mok0(fVar), 4));
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void e0(aex0 aex0Var) {
        FragmentActivity activity;
        T w0 = w0();
        if (w0 == null || (activity = w0.getActivity()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        h hVar = new h(aex0Var);
        dw20.b bVar = new dw20.b(activity);
        cbq.a(bVar);
        if (aex0Var.b() != null) {
            bVar.M(aex0Var.b().intValue(), Integer.valueOf(R.attr.vk_ui_text_accent));
        } else if (aex0Var.c() != null) {
            String c2 = aex0Var.c();
            ifx0 ifx0Var = e370.c;
            if (ifx0Var == null) {
                ifx0Var = null;
            }
            klw klwVar = new klw(ifx0Var.b().create(bVar.e()), c2);
            Boolean i = aex0Var.i();
            dw20.a.g0(bVar, klwVar, i != null ? i.booleanValue() : false, 4);
        }
        bVar.w0(aex0Var.h());
        dw20.a.R(bVar, aex0Var.d(), 0, 0, 6);
        aex0.e f2 = aex0Var.f();
        if (f2 != null) {
        }
        aex0.e e2 = aex0Var.e();
        if (e2 != null) {
            bVar.W(e2.a(), hVar);
        }
        aex0.e a2 = aex0Var.a();
        if (a2 != null) {
            bVar.h(a2.a(), hVar);
        }
        bVar.Y(new g(aex0Var));
        bVar.I0(aex0Var.g());
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public Object f0(long j) {
        return SuperappUiRouterBridge.b.a();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void g0(SuperappUiRouterBridge.a aVar, aex0.d dVar) {
        FragmentActivity activity;
        smu0 smu0Var;
        T w0 = w0();
        if (w0 == null || (activity = w0.getActivity()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (aVar instanceof SuperappUiRouterBridge.a.d) {
            int i = mcv0.o1;
            SuperappUiRouterBridge.a.d dVar2 = (SuperappUiRouterBridge.a.d) aVar;
            smu0Var = mcv0.a.b(24, dVar2.a().e(), activity.getString(R.string.vk_apps_permissions_allow_messages_from_group_title), activity.getString(R.string.vk_apps_permissions_allow_messages_from_group_subtitle, dVar2.a().d()));
        } else if (aVar instanceof SuperappUiRouterBridge.a.c) {
            int i2 = nnv0.j1;
            smu0Var = nnv0.a.a(activity, ((SuperappUiRouterBridge.a.c) aVar).a());
        } else if (aVar instanceof SuperappUiRouterBridge.a.g) {
            int i3 = mcv0.o1;
            smu0Var = mcv0.a.a(R.drawable.vk_icon_notification_outline_56, activity.getString(R.string.vk_apps_permissions_allow_notifications_title), activity.getString(R.string.vk_apps_permissions_allow_notifications_subtitle));
        } else if (aVar instanceof SuperappUiRouterBridge.a.b) {
            int i4 = mcv0.o1;
            mcv0 a2 = mcv0.a.a(R.drawable.vk_icon_notification_outline_56, activity.getString(R.string.vk_apps_permissions_allow_global_notifications_title), activity.getString(R.string.vk_apps_permissions_allow_global_notifications_subtitle));
            a2.io(R.string.vk_apps_permissions_allow_global_notifications_action_text);
            smu0Var = a2;
        } else if (aVar instanceof SuperappUiRouterBridge.a.C1869a) {
            int i5 = mcv0.o1;
            smu0Var = mcv0.a.a(R.drawable.vk_icon_mail_outline_56, activity.getString(R.string.vk_apps_permissions_email_title), activity.getString(R.string.vk_apps_permissions_email_subtitle));
        } else if (aVar instanceof SuperappUiRouterBridge.a.f) {
            int i6 = mcv0.o1;
            smu0Var = mcv0.a.a(R.drawable.vk_icon_place_outline_56, activity.getString(R.string.vk_apps_permissions_geo_title), activity.getString(R.string.vk_apps_permissions_geo_subtitle));
        } else if (aVar instanceof SuperappUiRouterBridge.a.e) {
            int i7 = mcv0.o1;
            SuperappUiRouterBridge.a.e eVar = (SuperappUiRouterBridge.a.e) aVar;
            mcv0 b2 = mcv0.a.b(8, eVar.a(), eVar.c(), eVar.b());
            b2.io(R.string.vk_apps_add);
            b2.jo(R.string.vk_apps_cancel);
            smu0Var = b2;
        } else {
            if (!(aVar instanceof SuperappUiRouterBridge.a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = mcv0.o1;
            SuperappUiRouterBridge.a.h hVar = (SuperappUiRouterBridge.a.h) aVar;
            mcv0 a3 = mcv0.a.a(R.drawable.vk_icon_thumbs_up_outline_56, hVar.b(), hVar.a());
            a3.io(R.string.vk_recommend);
            a3.jo(R.string.vk_apps_cancel_request);
            a3.ko();
            smu0Var = a3;
        }
        smu0Var.go(new d(dVar));
        qro0.c(new fk(19, smu0Var, w0));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void h0(Context context, String str, Map<String, String> map) {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (wdx0Var.k() || str != null) {
            try {
                int i = VkChangeEmailActivity.m;
                context.startActivity(VkChangeEmailActivity.a.a(context, str, map));
            } catch (Throwable th) {
                xgx0.a.getClass();
                xgx0.d(th);
            }
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void i(WebLeaderboardData webLeaderboardData, kld0 kld0Var, i6m0 i6m0Var) {
        T w0 = w0();
        if (w0 != null) {
            b2v0 a2 = b2v0.a.a(webLeaderboardData);
            a2.Fn(kld0Var);
            a2.Gn(i6m0Var);
            a2.Td(w0.kn().getSupportFragmentManager(), "LeaderboardBox");
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void j(String str) {
        Context mo2getContext;
        T w0 = w0();
        if (w0 == null || (mo2getContext = w0.mo2getContext()) == null) {
            return;
        }
        E(mo2getContext, str);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void j0(String str, String str2, vbr0 vbr0Var) {
        Context mo2getContext;
        T w0 = w0();
        if (w0 == null || (mo2getContext = w0.mo2getContext()) == null) {
            return;
        }
        dw20.b L0 = new dw20.b(mo2getContext).L0();
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        ((dw20.b) dw20.a.g0(L0, new klw(ifx0Var.b().create(mo2getContext), str2), true, 4)).w0(str).h0(R.string.vk_send, new uq50(vbr0Var, 27)).T(R.string.vk_apps_cancel, new x850(vbr0Var, 27)).X(new odc0(vbr0Var, 15)).I0(null);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void k(Context context, WebApiApplication webApiApplication, nex0 nex0Var, String str, String str2, Integer num, String str3, boolean z) {
        int i = VkBrowserActivity.l;
        context.startActivity(VkBrowserActivity.a.b(context, webApiApplication, nex0Var.a()));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void k0(SuperappUiRouterBridge.Permission permission, SuperappUiRouterBridge.e eVar) {
        FragmentActivity activity;
        String[] strArr;
        int i;
        int i2;
        int i3;
        int i4;
        String[] strArr2;
        T w0 = w0();
        if (w0 == null || (activity = w0.getActivity()) == null) {
            EmptyList emptyList = EmptyList.b;
            eVar.a();
            return;
        }
        int i5 = a.$EnumSwitchMapping$0[permission.ordinal()];
        if (i5 == 1) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.t;
            i = R.string.vk_permissions_vkui_disk_camera;
            i2 = R.string.vk_permissions_vkui_disk_camera_settings;
        } else {
            if (i5 == 2) {
                PermissionHelper.a.getClass();
                strArr2 = PermissionHelper.e;
                i4 = R.string.vk_permissions_storage;
                i3 = i4;
                PermissionHelper.h(PermissionHelper.a, activity, strArr2, i4, i3, new e(eVar), new f(eVar), 64);
            }
            if (i5 == 3) {
                PermissionHelper.a.getClass();
                strArr = PermissionHelper.l;
                i = R.string.vk_permissions_intent_photo;
                i2 = R.string.vk_permissions_intent_photo_settings;
            } else if (i5 == 4) {
                PermissionHelper.a.getClass();
                strArr = PermissionHelper.z;
                i = R.string.vk_permissions_camera_qr;
                i2 = R.string.vk_permissions_camera_qr_settings;
            } else {
                if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionHelper.a.getClass();
                strArr = PermissionHelper.l;
                i = R.string.vk_permissions_camera_vmoji;
                i2 = R.string.vk_permissions_camera_vmoji_settings;
            }
        }
        strArr2 = strArr;
        i4 = i;
        i3 = i2;
        PermissionHelper.h(PermissionHelper.a, activity, strArr2, i4, i3, new e(eVar), new f(eVar), 64);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void o0(List list, ArrayList arrayList, SuperappUiRouterBridge.g gVar) {
        FragmentActivity activity;
        dw20.a c2;
        T w0 = w0();
        if (w0 == null || (activity = w0.getActivity()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        av20.a aVar = new av20.a();
        aVar.e();
        aVar.d(R.layout.vk_item_web_app_scope, activity.getLayoutInflater());
        aVar.a(new w9h0());
        av20 b2 = aVar.b();
        b2.setItems(list);
        ytw W0 = j5g.W0(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = W0.iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.hasNext()) {
                break;
            }
            Object next = ztwVar.next();
            if (arrayList.contains(((xtw) next).b)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b2.y0(((xtw) it2.next()).a);
            arrayList3.add(s3q0.a);
        }
        dw20.b bVar = new dw20.b(activity);
        cbq.a(bVar);
        c2 = ((dw20.b) dw20.a.k(bVar.w0(activity.getString(R.string.vk_apps_edit_scopes_title)), b2, 6)).i0(R.string.vk_apps_access_allow, new kok0(gVar, b2)).Y(new lok0(gVar, list, b2)).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        ((dw20.b) c2).I0("scopesEdit");
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final p8u0 u(Context context, boolean z) {
        return new p8u0(hnj.a(context), z, 8);
    }

    public final void u0(T t) {
        Object obj;
        Bundle arguments = t.getArguments();
        boolean z = arguments != null ? arguments.getBoolean("clear_top", false) : false;
        gt70 gt70Var = this.b;
        if (z) {
            Iterator it = ((ArrayList) gt70Var.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = ((WeakReference) it.next()).get();
                if (obj != null) {
                    break;
                } else {
                    it.remove();
                }
            }
            Fragment fragment = (Fragment) obj;
            if (fragment != t && (fragment instanceof ivf)) {
                Lifecycle lifecycle = t.getLifecycle();
                lifecycle.addObserver(new b(lifecycle, fragment));
            }
        }
        ArrayList arrayList = (ArrayList) gt70Var.a;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object obj2 = ((WeakReference) it2.next()).get();
            if (obj2 != null) {
                if (t.equals(obj2)) {
                    it2.remove();
                    break;
                }
            } else {
                it2.remove();
            }
        }
        arrayList.add(0, new WeakReference(t));
    }

    public d.a v0(Context context, VkAlertData.DialogType dialogType) {
        return new eeu0.a(context);
    }

    public final T w0() {
        Object obj;
        Iterator it = ((ArrayList) this.b.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = ((WeakReference) it.next()).get();
            if (obj != null) {
                break;
            }
            it.remove();
        }
        T t = (T) obj;
        if (t == null) {
            xgx0.a.getClass();
            xgx0.g("Fragment in SuperappUiRouter isn't attached");
        }
        return t;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final bqu0 x(boolean z) {
        FragmentActivity activity;
        T w0 = w0();
        return (w0 == null || (activity = w0.getActivity()) == null) ? bqu0.a.a.getSTUB() : u(activity, z);
    }

    public final void x0(T t) {
        Iterator it = ((ArrayList) this.b.a).iterator();
        while (it.hasNext()) {
            Object obj = ((WeakReference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else if (epx.f(t, obj)) {
                it.remove();
                return;
            }
        }
    }

    /* compiled from: LifecycleExt.kt */
    /* loaded from: classes6.dex */
    public static final class b implements nhl {
        public final /* synthetic */ Lifecycle b;
        public final /* synthetic */ Fragment c;

        public b(Lifecycle lifecycle, Fragment fragment) {
            this.b = lifecycle;
            this.c = fragment;
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
            ((ivf) this.c).close();
            this.b.removeObserver(this);
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void b0(Context context) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void o(Context context) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void r(Context context) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void r0(Context context) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void V(Context context, Map map) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void l0(l5g0 l5g0Var, defpackage.l lVar) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void M(Context context, UserId userId, Map<String, String> map) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public void w(String str, String str2, String str3) {
    }
}
