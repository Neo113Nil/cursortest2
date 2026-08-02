package xsna;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.text.Layout;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import com.google.android.gms.internal.measurement.zznn;
import com.google.common.collect.ImmutableList;
import com.ironsource.B5;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.modal.base.ModalAuthInvalidAccountException;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.entries.post.DonutBadgeInfo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.users.User;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.RuStore;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import one.video.exo.model.text.SubtitleRenderItemExo;
import ru.rustore.sdk.core.config.a;
import ru.rustore.sdk.pushclient.a.h;
import xsna.p4p;

/* compiled from: ModalAuthErrorHandler.kt */
/* loaded from: classes15.dex */
public final class qv20 implements q701, gn60, h5p, ksn0 {
    public static volatile boolean b;
    public static final qv20 c = new qv20();
    public static final /* synthetic */ qv20 d = new qv20();
    public static String[] e;

    public static final y400 a(xgl0 xgl0Var) {
        return new y400(xgl0Var);
    }

    public static void b(Dialog dialog) {
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        try {
            dialog.dismiss();
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final int c(Artist artist) {
        return artist.m;
    }

    public static com.vk.core.view.components.spinner.c e(Context context, Integer num) {
        com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(context);
        if (num != null) {
            cVar.n(context.getString(num.intValue()));
        }
        cVar.setCancelable(true);
        return cVar;
    }

    public static void i(final Context context, Throwable th, String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, String str2, vgg vggVar, vv20 vv20Var, gzs gzsVar, boolean z, int i) {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = (i & 8) != 0 ? null : schemeStatSak$EventScreen;
        String str3 = (i & 16) != 0 ? null : str2;
        vgg xjqVar = (i & 32) != 0 ? new xjq(th) : vggVar;
        final gzs vg0Var = (i & 64) != 0 ? new vg0(22) : vv20Var;
        final gzs cu1Var = (i & 128) != 0 ? new cu1(21) : gzsVar;
        final int i2 = (i & 256) != 0 ? R.string.vk_ok : R.string.close;
        int i3 = 0;
        boolean z2 = (i & 512) != 0 ? false : z;
        String str4 = str == null ? "" : str;
        if (!(th instanceof VKApiExecutionException)) {
            if (!(th instanceof ModalAuthInvalidAccountException)) {
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                bVar.getClass();
                com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_AUTH_UNKNOWN_ERROR, com.vk.registration.funnels.b.b(str4, schemeStatSak$EventScreen2, null, z2), schemeStatSak$EventScreen2, null, 24);
                xjqVar.d(new gzs() { // from class: xsna.pv20
                    @Override // xsna.gzs
                    public final Object invoke() {
                        Context context2 = context;
                        VkAlertData.b bVar2 = new VkAlertData.b(context2.getString(R.string.vk_auth_error), context2.getString(R.string.vk_modal_auth_error_retry), (VkAlertData.DialogType) null, new VkAlertData.a(context2.getString(i2), null), (VkAlertData.a) null, 52);
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        (superappUiRouterBridge != null ? superappUiRouterBridge : null).O(e3m.h(context2), bVar2, new qr1(cu1Var, vg0Var));
                        return s3q0.a;
                    }
                });
                return;
            }
            pr1 pr1Var = new pr1(i3);
            i9 i9Var = new i9(2);
            VkAlertData.b bVar2 = new VkAlertData.b(context.getString(R.string.vk_multiqr_invalid_account_title), context.getString(R.string.vk_multiqr_invalid_account_subtitle), (VkAlertData.DialogType) null, new VkAlertData.a(context.getString(R.string.vk_auth_accessibility_close), null), (VkAlertData.a) null, 52);
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            (superappUiRouterBridge != null ? superappUiRouterBridge : null).O(e3m.h(context), bVar2, new qr1(i9Var, pr1Var));
            return;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int s = vKApiExecutionException.s();
        if (s == -1) {
            SchemeStatSak$EventScreen schemeStatSak$EventScreen3 = schemeStatSak$EventScreen2;
            com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
            bVar3.getClass();
            com.vk.registration.funnels.b.z(bVar3, SchemeStatSak$EventScreen.ALERT_AUTH_NETWORK_ERROR, com.vk.registration.funnels.b.b(str4, schemeStatSak$EventScreen3, str3, z2), schemeStatSak$EventScreen3, null, 24);
            xjqVar.d(new ov20(i2, context, vg0Var, cu1Var));
            return;
        }
        if (s == 9) {
            SchemeStatSak$EventScreen schemeStatSak$EventScreen4 = schemeStatSak$EventScreen2;
            com.vk.registration.funnels.b bVar4 = com.vk.registration.funnels.b.a;
            bVar4.getClass();
            com.vk.registration.funnels.b.z(bVar4, SchemeStatSak$EventScreen.ALERT_AUTH_FLOOD_CONTROL_ERROR, com.vk.registration.funnels.b.b(str4, schemeStatSak$EventScreen4, str3, z2), schemeStatSak$EventScreen4, null, 24);
            xjqVar.d(new gzs() { // from class: xsna.mv20
                @Override // xsna.gzs
                public final Object invoke() {
                    Context context2 = context;
                    VkAlertData.b bVar5 = new VkAlertData.b(context2.getString(R.string.vk_auth_error), context2.getString(R.string.vk_qr_auth_to_many_request), (VkAlertData.DialogType) null, new VkAlertData.a(context2.getString(i2), null), (VkAlertData.a) null, 52);
                    SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                    (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).O(e3m.h(context2), bVar5, new qr1(cu1Var, vg0Var));
                    return s3q0.a;
                }
            });
            return;
        }
        if (s != 15) {
            if (s != 104) {
                com.vk.registration.funnels.b bVar5 = com.vk.registration.funnels.b.a;
                bVar5.getClass();
                com.vk.registration.funnels.b.z(bVar5, SchemeStatSak$EventScreen.ALERT_AUTH_UNKNOWN_ERROR, com.vk.registration.funnels.b.b(str4, schemeStatSak$EventScreen2, str3, z2), schemeStatSak$EventScreen2, null, 24);
                xjqVar.d(new gzs() { // from class: xsna.pv20
                    @Override // xsna.gzs
                    public final Object invoke() {
                        Context context2 = context;
                        VkAlertData.b bVar22 = new VkAlertData.b(context2.getString(R.string.vk_auth_error), context2.getString(R.string.vk_modal_auth_error_retry), (VkAlertData.DialogType) null, new VkAlertData.a(context2.getString(i2), null), (VkAlertData.a) null, 52);
                        SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                        (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).O(e3m.h(context2), bVar22, new qr1(cu1Var, vg0Var));
                        return s3q0.a;
                    }
                });
                return;
            }
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_REFRESH_ERROR, com.vk.registration.funnels.b.b(str4, schemeStatSak$EventScreen2, str3, z2), null, null, null, null, null, 252);
            xjqVar.d(new gzs() { // from class: xsna.lv20
                @Override // xsna.gzs
                public final Object invoke() {
                    Context context2 = context;
                    VkAlertData.b bVar6 = new VkAlertData.b(context2.getString(R.string.vk_auth_error), context2.getString(R.string.vk_modal_auth_not_valid_description), (VkAlertData.DialogType) null, new VkAlertData.a(context2.getString(i2), null), (VkAlertData.a) null, 52);
                    SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                    (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).O(e3m.h(context2), bVar6, new qr1(cu1Var, vg0Var));
                    return s3q0.a;
                }
            });
            return;
        }
        SchemeStatSak$EventScreen schemeStatSak$EventScreen5 = schemeStatSak$EventScreen2;
        if (vKApiExecutionException.C() == 1174) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_QR_CODE_OPEN_SCANNER, null, null, null, null, null, null, 254);
            xjqVar.d(new jtb(context, cu1Var, vg0Var, 4));
            return;
        }
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack3 = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_UNSAFE_AUTH_ERROR, com.vk.registration.funnels.b.b(str4, schemeStatSak$EventScreen5, str3, z2), null, null, null, null, null, 252);
        xjqVar.d(new gzs() { // from class: xsna.nv20
            @Override // xsna.gzs
            public final Object invoke() {
                Context context2 = context;
                VkAlertData.b bVar6 = new VkAlertData.b(context2.getString(R.string.vk_mvk_security_error_header), context2.getString(R.string.vk_mvk_security_error_message), (VkAlertData.DialogType) null, new VkAlertData.a(context2.getString(i2), null), (VkAlertData.a) null, 52);
                SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).O(e3m.h(context2), bVar6, new qr1(cu1Var, vg0Var));
                return s3q0.a;
            }
        });
    }

    public static void j(Application application, String str, k100 k100Var) {
        if (b) {
            Logger.DefaultImpls.warn$default(k100Var, "RuStorePushClient already initialized", null, 2, null);
            return;
        }
        if (drm0.N(str)) {
            throw new IllegalStateException("projectId can't be empty");
        }
        String h = a.C2396a.a().a.h();
        EmptyList emptyList = EmptyList.b;
        aaz0 aaz0Var = new aaz0(application, str, k100Var, emptyList, emptyList, null, null, RuStore.INSTANCE.getAppInfo(), emptyList, h);
        epx.f(null, B5.t);
        synchronized (ru.rustore.sdk.pushclient.a.h.t) {
            try {
                if (ru.rustore.sdk.pushclient.a.h.u != null) {
                    Logger.DefaultImpls.warn$default(k100Var, "Client SDK has been already initialized", null, 2, null);
                } else {
                    if (ru.rustore.sdk.pushclient.a.h.u != null) {
                        ru.rustore.sdk.pushclient.a.h a = h.b.a();
                        zvj.c(a.r, null);
                        iyx.d(a.r.b);
                        iyx.d(ru.rustore.sdk.pushclient.a.h.v.b);
                    }
                    ru.rustore.sdk.pushclient.a.h.u = new ru.rustore.sdk.pushclient.a.h(aaz0Var);
                    ru.rustore.sdk.pushclient.a.h.w.signalInitialized();
                    ru.rustore.sdk.pushclient.a.h a2 = h.b.a();
                    Logger logger = a2.c;
                    jn4 jn4Var = ((u1z0) a2.i.getValue()).a;
                    Logger.DefaultImpls.info$default(logger, "Client SDK is initialized. Version: 7.4.0-rc01", null, 2, null);
                    k1z0 k1z0Var = (k1z0) a2.f.getValue();
                    ((Application) k1z0Var.a.a.b).registerActivityLifecycleCallbacks(new u8y0(new ru.rustore.sdk.pushclient.s.g(2, k1z0Var, k1z0.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V", 0)));
                    a2.s = myc0.h(a2.r, null, null, new ru.rustore.sdk.pushclient.a.l(a2, null), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b = true;
    }

    public static final boolean k(qtd0 qtd0Var) {
        Integer num;
        User user = qtd0Var instanceof User ? (User) qtd0Var : null;
        if (user != null && (num = user.L) != null) {
            int intValue = num.intValue();
            Integer num2 = user.M;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Calendar d2 = pvo0.d();
                if (intValue == d2.get(5) && intValue2 == d2.get(2) + 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean l(VkText vkText) {
        Layout layout = vkText.getLayout();
        if (layout == null) {
            return false;
        }
        for (int lineCount = layout.getLineCount() - 1; -1 < lineCount; lineCount--) {
            if (layout.getEllipsisCount(lineCount) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final DialogExt m(qtd0 qtd0Var) {
        long G3 = qtd0Var.G3();
        ProfilesInfo profilesInfo = new ProfilesInfo();
        profilesInfo.Jb(qtd0Var);
        return new DialogExt(G3, profilesInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList n(ukk ukkVar) {
        com.google.common.collect.g gVar = ukkVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(gVar, 10));
        ImmutableList.b listIterator = gVar.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(new SubtitleRenderItemExo((rkk) listIterator.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r0.isEmpty() == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean p(Throwable th, gzs gzsVar) {
        DiagnosticComposeException diagnosticComposeException;
        qqi qqiVar;
        List<Throwable> b2 = qta0.a.b(th);
        int size = b2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (b2.get(i) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            qqiVar = (qqi) gzsVar.invoke();
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (qqiVar != null) {
            List<vqi> list = qqiVar.a;
            if (qqiVar.b) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (list.get(i2).b != null) {
                        z = true;
                        break;
                    }
                }
            }
            diagnosticComposeException = th2;
            if (diagnosticComposeException != null) {
                mnh0.d(th, diagnosticComposeException);
            }
            return z;
        }
        diagnosticComposeException = z ? new DiagnosticComposeException(qqiVar) : null;
        if (diagnosticComposeException != null) {
        }
        return z;
    }

    @Override // xsna.ksn0
    public Integer d() {
        return Integer.valueOf(R.string.video_playlist_tab_filter);
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        nio nioVar = (nio) g5pVar;
        if (ota0Var == null) {
            return null;
        }
        if (nioVar.I()) {
            return ota0Var;
        }
        lyk0 lyk0Var = alg.a;
        return alg.a(ota0Var, nioVar.a);
    }

    @Override // xsna.ksn0
    public Integer g() {
        return null;
    }

    @Override // xsna.ksn0
    public Integer h() {
        return Integer.valueOf(R.drawable.vk_icon_list_play_outline_20);
    }

    public List o(DonutBadgeInfo donutBadgeInfo) {
        return Collections.singletonList(new a4o(donutBadgeInfo.d, donutBadgeInfo.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return o((DonutBadgeInfo) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzm());
    }
}
