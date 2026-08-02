package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4405kb;
import com.unity3d.ads.InitializationListener;
import com.vk.auth.validation.b;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesListBehavior;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.media.video.H264Encoder;
import xsna.dw20;
import xsna.u7z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t12 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t12(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.concurrent.Future<?>] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                w12 w12Var = (w12) this.c;
                try {
                    try {
                        w12Var.g();
                    } catch (Exception e) {
                        L.LogType logType = L.LogType.e;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        L.s(logType, "VkContactManager", message, e);
                    }
                    return;
                } finally {
                    w12Var.g = null;
                }
            case 1:
                qu4 qu4Var = (qu4) this.c;
                d3m.e(qu4Var.l, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                d3m.e(qu4Var.j, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                d3m.e(qu4Var.i, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                d3m.e(qu4Var.f, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                d3m.c(qu4Var.m, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 25L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : 0.5f);
                d3m.c(qu4Var.h, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 25L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : 0.75f);
                return;
            case 2:
                ((gzs) this.c).invoke();
                return;
            case 3:
                ps8 ps8Var = (ps8) this.c;
                ps8Var.smoothScrollTo(ps8Var.getInitialScrollOffset(), 0);
                return;
            case 4:
                CameraUIView.B((CameraUIView) this.c);
                return;
            case 5:
                t020 t020Var = (t020) ((r2g) this.c).h.h();
                if (t020Var != null) {
                    t020Var.f();
                    return;
                }
                return;
            case 6:
                CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = ((CommunityAddressesFragment) this.c).u0;
                (communityAddressesListBehavior != null ? communityAddressesListBehavior : 0).I(-1, true);
                return;
            case 7:
                H264Encoder.stop$lambda$7((H264Encoder) this.c);
                return;
            case 8:
                p9w p9wVar = (p9w) this.c;
                if (BuildInfo.s()) {
                    final boolean d = Preference.d("notifications_prefs", "all_push_value", false);
                    boolean f = p9wVar.c.f();
                    boolean d2 = Preference.d("notifications_prefs", "enable_only_messenger_notifications", false);
                    Preference.I("notifications_prefs", "all_push_value", f);
                    if (d2 && !f) {
                        Preference.I("notifications_prefs", "enable_only_messenger_notifications", false);
                        return;
                    }
                    if (!d && f && d2) {
                        a1w a1wVar = q1w.a;
                        (a1wVar != null ? a1wVar : null).E(p9wVar, new rz30()).subscribe(new o9w(), new io.reactivex.rxjava3.functions.f() { // from class: xsna.m9w
                            @Override // io.reactivex.rxjava3.functions.f
                            public final void accept(Object obj) {
                                Throwable th = (Throwable) obj;
                                Preference.I("notifications_prefs", "all_push_value", d);
                                a1w a1wVar2 = q1w.a;
                                if (a1wVar2 == null) {
                                    a1wVar2 = null;
                                }
                                a1wVar2.x(new ya80(th));
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            case 9:
                dw20 dw20Var = (dw20) this.c;
                String str = dw20.d1;
                dw20Var.tn();
                return;
            case 10:
                vau vauVar = ((com.vk.media.recorder.d) this.c).N;
                FrameBuffer frameBuffer = vauVar.a;
                if (frameBuffer != null) {
                    frameBuffer.unbind();
                }
                FrameBuffer frameBuffer2 = vauVar.a;
                if (frameBuffer2 != null) {
                    frameBuffer2.release();
                }
                vauVar.a = null;
                GLSSBO glssbo = vauVar.g;
                if (glssbo != null) {
                    glssbo.release();
                }
                vauVar.g = null;
                GLComputerProgram gLComputerProgram = vauVar.f;
                if (gLComputerProgram != null) {
                    gLComputerProgram.release();
                }
                vauVar.f = null;
                FrameBuffer frameBuffer3 = vauVar.b;
                if (frameBuffer3 != null) {
                    frameBuffer3.unbind();
                }
                FrameBuffer frameBuffer4 = vauVar.b;
                if (frameBuffer4 != null) {
                    frameBuffer4.release();
                }
                vauVar.b = null;
                vauVar.h = null;
                return;
            case 11:
                ((InitializationListener) this.c).onInitializationComplete(null);
                return;
            case 12:
                ((v2s0) this.c).b();
                return;
            case 13:
                ((h4t0) this.c).a();
                return;
            case 14:
                b.a aVar = (b.a) this.c;
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                bVar.getClass();
                com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_PHONE_SUCCESS_VERIFICATION, null, null, null, 30);
                Activity activity = aVar.b.get();
                if (activity != null) {
                    Context a = hnj.a(activity);
                    Drawable e2 = enj.e(R.drawable.vk_icon_check_shield_outline_56, R.attr.vk_ui_accent_green, a);
                    Drawable e3 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_medium, a);
                    dw20.b bVar2 = new dw20.b(activity, null);
                    cbq.a(bVar2);
                    aVar.d(((dw20.b) dw20.a.Q(((dw20.b) bVar2.M0().N(e2).w().F(e3, null)).b0(new mdm0(aVar, 23)).v0(R.string.vk_service_validation_confirmation_confirm_result), R.string.vk_service_validation_confirmation_confirm_explanation)).h0(R.string.vk_service_validation_confirmation_approve_excellent, new gbt0(aVar, 6)), "successConfirmation");
                    return;
                }
                return;
            case 15:
                C4405kb.b((C4405kb) this.c);
                return;
            case 16:
                w4z0 w4z0Var = (w4z0) this.c;
                u7z0.a aVar2 = w4z0Var.n;
                if (aVar2 != null) {
                    aVar2.a(w4z0Var.q / 1000.0d);
                }
                long j = w4z0Var.q;
                if (j > 0) {
                    w4z0Var.q = j - 200;
                    return;
                }
                w4z0Var.d.setCloseVisible(true);
                u7z0.a aVar3 = w4z0Var.n;
                if (aVar3 != null) {
                    aVar3.a(true);
                    w4z0Var.b.h(w4z0Var.c);
                    return;
                }
                return;
            case 17:
                yads.s72.a((yads.u72) this.c);
                return;
            default:
                ((fjz0) this.c).b();
                return;
        }
    }
}
