package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.g;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.vkpay.checkout.feature.success.states.Action;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.video.ui.discovery.minimizable.announce.author.VideoAnnounceAuthorView;
import java.util.Calendar;
import java.util.TimeZone;
import xsna.tts0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nn9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nn9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v27, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bm9 presenter;
        bm9 presenter2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (presenter = cameraUIView.getPresenter()) != null && presenter.U3() && (presenter2 = cameraUIView.getPresenter()) != null) {
                    presenter2.B();
                    break;
                }
                break;
            case 1:
                ((ButtonAction) ((Action) obj)).d().invoke();
                break;
            case 2:
                uxj uxjVar = (uxj) obj;
                fxj fxjVar = uxjVar.n;
                if (fxjVar != null) {
                    uxjVar.l.e(fxjVar.c, !fxjVar.d);
                    break;
                }
                break;
            case 3:
                q1o q1oVar = (q1o) obj;
                g1o g1oVar = (g1o) q1oVar.C;
                if (g1oVar != null) {
                    j1o.a(q1oVar, q1oVar.itemView.getContext(), g1oVar.i, (p4r) q1oVar.F.getValue(), DonutPostClickSource.Background);
                    break;
                }
                break;
            case 4:
                opp oppVar = (opp) obj;
                kpp kppVar = opp.T;
                FragmentManager supportFragmentManager = oppVar.kn().getSupportFragmentManager();
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.setTimeInMillis(com.google.android.material.datepicker.g.Hn());
                calendar.set(1, calendar.get(1) - 14);
                long timeInMillis = calendar.getTimeInMillis();
                g.d<Long> b = g.d.b();
                b.d = Long.valueOf(timeInMillis);
                com.google.android.material.datepicker.g<Long> a = b.a();
                a.Td(supportFragmentManager, com.google.android.material.datepicker.g.class.getName());
                final ugm ugmVar = new ugm(oppVar, 3);
                a.x.add(new lm10() { // from class: xsna.mpp
                    @Override // xsna.lm10
                    public final void a(Object obj2) {
                        kpp kppVar2 = opp.T;
                        ugm.this.invoke(obj2);
                    }
                });
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.BIRTHDAY_CALENDAR_ICON_TAP, null, null, null, null, null, null, 254);
                break;
            case 5:
                int i2 = gm90.v;
                bpn0 bpn0Var = t65.a;
                mhy.b(view.getContext());
                FragmentManager parentFragmentManager = ((gm90) obj).getParentFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putBoolean("dismiss", false);
                s3q0 s3q0Var = s3q0.a;
                parentFragmentManager.k0(bundle, "key_check_access_result");
                break;
            case 6:
                cba0 cba0Var = (cba0) obj;
                x64 x64Var = cba0Var.k;
                if (x64Var != null) {
                    x64Var.c(cba0Var.d);
                    break;
                }
                break;
            case 7:
                ((x6i0) obj).f.finish();
                break;
            case 8:
                ((ffo0) obj).b.invoke(keo0.a);
                break;
            case 9:
                VideoAnnounceAuthorView videoAnnounceAuthorView = (VideoAnnounceAuthorView) obj;
                int i3 = VideoAnnounceAuthorView.A;
                videoAnnounceAuthorView.setSubscribeState(VideoAnnounceAuthorView.SubscribeState.Unsubscribed);
                n9m0 n9m0Var = videoAnnounceAuthorView.y;
                if (n9m0Var != null) {
                    n9m0Var.invoke(Boolean.FALSE);
                    break;
                }
                break;
            case 10:
                tts0 tts0Var = (tts0) obj;
                int i4 = tts0.c.$EnumSwitchMapping$0[tts0Var.h.d.ordinal()];
                if (i4 == 1) {
                    tts0Var.c.invoke();
                    break;
                } else if (i4 == 2) {
                    tts0Var.e.invoke();
                    break;
                } else {
                    tts0Var.b.invoke();
                    break;
                }
            default:
                ((px0) obj).invoke();
                break;
        }
    }
}
