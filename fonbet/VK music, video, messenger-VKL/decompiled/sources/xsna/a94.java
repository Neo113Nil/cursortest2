package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.avatarpicker.AuthAvatarPickerActivity;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.network.eventhub.api.Message;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.Result;
import xsna.nri;
import xsna.q9u0;
import xsna.r2c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a94 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a94(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        eye0 eye0Var;
        xy2 o;
        Object failure;
        f5z e;
        xyt0 h;
        z1h0 f;
        eyx initialize$lambda$220$lambda$14;
        int i = this.b;
        int i2 = 15;
        int i3 = 1;
        int i4 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                PreviewRatio previewRatio = (PreviewRatio) obj;
                qcc0 qcc0Var = ((b94) obj2).m;
                b4d0 t2 = qcc0Var.C.t2();
                if (t2 != null && (eye0Var = t2.P) != null) {
                    awt0.i(eye0Var, new h24(qcc0Var, eye0Var, previewRatio, i3));
                }
                break;
            case 1:
                int i5 = AuthAvatarPickerActivity.i;
                ((AuthAvatarPickerActivity) obj2).startActivityForResult((Intent) obj, 3);
                break;
            case 2:
                break;
            case 3:
                Message message = (Message) obj2;
                break;
            case 4:
                ChatFragment chatFragment = (ChatFragment) obj2;
                Msg msg = (Msg) obj;
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.W0();
                imv imvVar = chatFragment.J0;
                (imvVar != null ? imvVar : null).onPause();
                chatFragment.G0 = msg;
                break;
            case 5:
                ((izs) obj2).invoke(new r2c.c(((s2c) obj).b));
                break;
            case 6:
                ((izs) obj2).invoke(new r2c.k(((q7c) obj).b));
                break;
            case 7:
                dme dmeVar = (dme) obj2;
                wh50 wh50Var = (wh50) obj;
                String str = dmeVar.j1;
                if (str == null) {
                    str = null;
                }
                if (epx.f(str, ((tho0) wh50Var.getValue()).a.c) || ((tho0) wh50Var.getValue()).a.c.length() <= 0) {
                    dmeVar.dismiss();
                } else {
                    jd jdVar = dmeVar.k1;
                    (jdVar != null ? jdVar : null).invoke();
                }
                break;
            case 8:
                com.vk.profile.community.details.impl.contacts.c cVar = (com.vk.profile.community.details.impl.contacts.c) obj2;
                CommunityAddContactsState communityAddContactsState = (CommunityAddContactsState) obj;
                zqu zquVar = new zqu();
                UserId a = fkq0.a(communityAddContactsState.b);
                List<CommunityAddContactsState.ContactField> list = communityAddContactsState.h;
                String str2 = list.get(CommunityAddContactsState.ContactField.ContactViewType.ADDRESS.ordinal()).a.a;
                String obj3 = str2 != null ? drm0.p0(str2).toString() : null;
                CommunityAddContactsState.a aVar2 = communityAddContactsState.c;
                int i6 = aVar2 != null ? aVar2.b : 0;
                String str3 = list.get(CommunityAddContactsState.ContactField.ContactViewType.PHONE.ordinal()).a.a;
                String obj4 = str3 != null ? drm0.p0(str3).toString() : null;
                String str4 = list.get(CommunityAddContactsState.ContactField.ContactViewType.WEBSITE.ordinal()).a.a;
                o = zquVar.o(a, (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : str4 != null ? drm0.p0(str4).toString() : null, (r30 & 256) != 0 ? null : obj4, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : Integer.valueOf(i6), (r32 & 512) != 0 ? null : obj3, (4194304 & r32) != 0 ? null : cVar.f, (r32 & 8388608) != 0 ? null : "community_page");
                cVar.e.b(rsg0.W(yfb.x(o), 7).subscribe(new hz(new ire(cVar, 4), 21), new jz(new wpg(cVar, i4), i2)));
                break;
            case 9:
                nri nriVar = (nri) obj2;
                Activity activity = (Activity) obj;
                try {
                    e = gqo.e(activity.getWindow().getDecorView());
                    h = ro.h(activity.getWindow().getDecorView());
                    f = lyd.f(activity.getWindow().getDecorView());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (e != null && h != null && f != null) {
                    spo0 spo0Var = new spo0(activity, null, 0);
                    f4m.j(spo0Var);
                    spo0Var.addOnAttachStateChangeListener(new ori(spo0Var, nriVar));
                    bwt0.g(spo0Var, new tj2(nriVar));
                    gqo.f(spo0Var, e);
                    ro.o(spo0Var, h);
                    lyd.h(spo0Var, f);
                    WindowManager windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = 0;
                    layoutParams.width = 0;
                    if (!activity.isFinishing()) {
                        windowManager.addView(spo0Var, layoutParams);
                        windowManager.removeView(spo0Var);
                    }
                    failure = s3q0.a;
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        bVar.a(a2);
                    }
                    break;
                }
                if (!androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.a = new nri.a(nri.c.a, new nri.b(false));
                }
                break;
            case 10:
                dsy dsyVar = (dsy) obj;
                wqy wqyVar = (wqy) ((f1m) obj2).getValue();
                break;
            case 11:
                ((z520) obj2).l((AttachmentWithMedia) obj);
                break;
            case 12:
                Context context = (Context) obj;
                Throwable th2 = ((vgg) obj2).a;
                if (th2 instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    if (vKApiExecutionException.s() == 15 && vKApiExecutionException.C() == 1174) {
                        com.vk.registration.funnels.b.a.getClass();
                        com.vk.registration.funnels.b.r();
                        if (BuildInfo.s()) {
                            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vk://camera?section=qr")).setFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
                            s3q0 s3q0Var = s3q0.a;
                        } else {
                            List<String> list2 = ModalAuthHostActivity.h;
                            Intent intent = new Intent(context, (Class<?>) ModalAuthHostActivity.class);
                            intent.setFlags(603979776);
                            intent.putExtra("open_camera", true);
                            context.startActivity(intent);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } else {
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                } else {
                    s3q0 s3q0Var4 = s3q0.a;
                }
                break;
            case 13:
                ((h7f0) obj2).K((lj50) obj);
                break;
            case 14:
                ViewGroup viewGroup = (ViewGroup) obj2;
                pbc0 pbc0Var = (pbc0) obj;
                float height = viewGroup.getHeight();
                viewGroup.setTranslationY(height);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.addUpdateListener(new ds6(viewGroup, 1));
                ofFloat.setDuration(pbc0Var.c);
                ofFloat.setInterpolator(pbc0Var.b);
                ofFloat.start();
                break;
            case 15:
                break;
            case 16:
                initialize$lambda$220$lambda$14 = ServiceProvider.initialize$lambda$220$lambda$14((UnityAdsModule) obj2, (ServicesRegistry) obj);
                break;
            case 17:
                TextView textView = (TextView) ((ixi0) obj2).a.findViewById(R.id.join_room_button);
                jjc.g(textView, new mga0((po5) obj, 13));
                textView.setAlpha(0.4f);
                break;
            case 18:
                ((izs) obj2).invoke(((yc0) obj).d);
                break;
            case 19:
                jss0 jss0Var = (jss0) obj2;
                jss0Var.d.Qc("video_link_stats_bottom_sheet");
                io.reactivex.rxjava3.disposables.c cVar2 = ((o20) obj).b;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                jss0Var.b = null;
                break;
            default:
                ((q9u0) obj2).O(((q9u0.a) obj).b);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a94(sv20 sv20Var, vgg vggVar, Context context) {
        this.b = 12;
        this.c = vggVar;
        this.d = context;
    }
}
