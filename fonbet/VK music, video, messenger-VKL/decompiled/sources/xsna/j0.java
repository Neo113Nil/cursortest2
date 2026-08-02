package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.ironsource.O9;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.ironsourceads.InitListener;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.imageloader.fresco.CallerContext;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.rlottie.RLottieDrawable;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import java.util.Iterator;
import org.chromium.net.AndroidNetworkLibrary;
import org.webrtc.EglRenderer;
import ru.ok.media.ConnectionBenchmark;
import xsna.i1s;
import xsna.i360;
import xsna.iy70;
import xsna.l2f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
    
        if (r8 != (-1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0202, code lost:
    
        r2 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0206, code lost:
    
        if (r2 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0208, code lost:
    
        r2 = r2.intValue();
        r5.l(r2, false);
        r1.d.invoke();
        r13 = r5.f(r2).a;
        r5 = xsna.m8v0.M;
        r14 = r1.f.getString(r12.b);
        r5 = r12.f;
        r6 = r12.c;
        r7 = r12.d;
        r8 = r12.e;
        r30 = r4.getLifecycle();
        r9 = xsna.dhr0.C().b;
        r10 = r1.j;
        r11 = com.vk.onboarding.api.stat.VkOnboardingStat$Type.Tooltip;
        r15 = r12.a.b;
        r16 = com.vk.onboarding.api.di.VkOnboardingComponent.Companion;
        xsna.m8v0.a.a(r13, r14, null, r5, r6, null, r7, r8, new xsna.ri0(15, r1, r12), new xsna.oh3(17, r1, r12), new xsna.f1s(r3), new xsna.rd1(20), new defpackage.m(17, r1, r12), new xsna.g1s(r1, r12, r2), r10.ac(r11, r15), 0, true, r30, r4, false, null, r9, 7372836);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0293, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MotionEvent motionEvent;
        final i1s.c cVar;
        Object obj;
        VkOnboardingCampaign e;
        gd6 h;
        Integer num = null;
        int i = 0;
        switch (this.b) {
            case 0:
                Aa.c((Aa) this.c);
                return;
            case 1:
                AndroidNetworkLibrary.NetworkSecurityPolicyProxy.sInstance = (AndroidNetworkLibrary.NetworkSecurityPolicyProxy) this.c;
                return;
            case 2:
                yj3 yj3Var = (yj3) this.c;
                RecyclerView.e0 e0Var = yj3Var.s;
                if (e0Var == null || (motionEvent = yj3Var.t) == null) {
                    return;
                }
                e0Var.itemView.setPressed(true);
                e0Var.itemView.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return;
            case 3:
                ((com.vk.attachpicker.screen.a) this.c).q();
                return;
            case 4:
                l2f.a aVar = (l2f.a) this.c;
                l2f l2fVar = aVar.f;
                if (l2fVar != null) {
                    l2fVar.o(true);
                }
                l2f l2fVar2 = aVar.f;
                if (l2fVar2 != null) {
                    SpinnerState spinnerState = SpinnerState.Done;
                    o2f o2fVar = l2fVar2.h;
                    if (o2fVar != null) {
                        o2fVar.setSpinnerState(spinnerState);
                    }
                }
                l2f l2fVar3 = aVar.f;
                if (l2fVar3 != null) {
                    String str = aVar.b;
                    o2f o2fVar2 = l2fVar3.h;
                    if (o2fVar2 != null) {
                        o2fVar2.setSubtitle(str);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
                int i2 = ClipsTemplateEditorFragment.h0;
                clipsTemplateEditorFragment.eo().t();
                return;
            case 6:
                ((ConnectionBenchmark) this.c).benchIteration();
                return;
            case 7:
                ((EglRenderer) this.c).renderFrameOnRenderThread();
                return;
            case 8:
                ((dw20) this.c).hide();
                return;
            case 9:
                final i1s i1sVar = (i1s) this.c;
                i1sVar.h = true;
                if (i1sVar.l != null) {
                    Iterator<i1s.b> it = i1sVar.n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i1s.b next = it.next();
                            i1s i1sVar2 = i1s.this;
                            Object[] objArr = (next.h() == null || (h = next.h()) == null || h.h()) ? false : true;
                            j1s j1sVar = i1sVar2.c;
                            q7v0 q7v0Var = i1sVar2.k;
                            Iterator<T> it2 = j1sVar.C.f.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj = it2.next();
                                    if (next.a((xyr) obj)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            xyr xyrVar = (xyr) obj;
                            cVar = (objArr == true || xyrVar == null || !i1sVar2.i || (e = q7v0Var.e(next.d())) == null || !q7v0Var.d(e) || !q7v0Var.b(e, false)) ? null : new i1s.c(e, next.c(), next.b(), next.e(), next.g(), next.f(), xyrVar);
                            if (cVar != null) {
                            }
                        } else {
                            cVar = null;
                        }
                    }
                    if (cVar != null) {
                        nbs nbsVar = i1sVar.m;
                        VkTabs vkTabs = i1sVar.a;
                        int id = cVar.g.getId();
                        Iterator<T> it3 = i1sVar.c.C.f.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i3 = -1;
                                break;
                            } else {
                                Object next2 = it3.next();
                                if (i3 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((xyr) next2).getId() == id) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 10:
                LiveView liveView = (LiveView) this.c;
                if (liveView.a0) {
                    return;
                }
                liveView.W.setVisibility(8);
                return;
            case 11:
                O9.a((InitListener) this.c);
                return;
            case 12:
                iy70.c cVar2 = (iy70.c) this.c;
                cVar2.g = true;
                Object m = cVar2.b.m();
                CallerContext callerContext = m instanceof CallerContext ? (CallerContext) m : null;
                if (callerContext == null) {
                    callerContext = CallerContext.Background;
                }
                if (callerContext == CallerContext.Frontend) {
                    L l = L.a;
                    l.getClass();
                    if (L.m(LoggerOutputTarget.NONE)) {
                        return;
                    }
                    L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Image fetching is requeued: " + cVar2.b()});
                    return;
                }
                i360.a aVar2 = cVar2.f;
                if (aVar2 != null) {
                    aVar2.a();
                }
                cVar2.d = true;
                L l2 = L.a;
                l2.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l2, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Image fetching will be skipped after cancellation: " + cVar2.b()});
                return;
            case 13:
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.c;
                if (rLottieDrawable.k.j.get()) {
                    rLottieDrawable.k();
                    return;
                }
                return;
            case 14:
                ((dii0) this.c).b();
                return;
            case 15:
                ((a4t0) this.c).c.b();
                return;
            case 16:
                VideoProfileCatalogContentVh videoProfileCatalogContentVh = (VideoProfileCatalogContentVh) this.c;
                g3a.a(videoProfileCatalogContentVh.s, videoProfileCatalogContentVh);
                return;
            case 17:
                j9a0 j9a0Var = (j9a0) this.c;
                ProgressWheel progressWheel = j9a0Var.i;
                if (progressWheel == null) {
                    progressWheel = null;
                }
                progressWheel.setVisibility(0);
                RecyclerView recyclerView = j9a0Var.h;
                (recyclerView != null ? recyclerView : null).setVisibility(4);
                return;
            case 18:
                com.vk.attachpicker.screen.p pVar = com.vk.attachpicker.screen.p.this;
                pVar.j.a(pVar.d());
                pVar.I(true);
                pVar.S.B(new ic3(pVar, 12));
                return;
            case 19:
                ((VoipSelectVideoPlaylistsFragment.b) this.c).a.scrollToPosition(0);
                return;
            case 20:
                r1.setUpPosition(((f3y0) this.c).J);
                return;
            case 21:
                ((com.ironsource.lifecycle.b) this.c).f();
                return;
            case 22:
                ((com.monetization.ads.exo.source.dash.i) this.c).f();
                return;
            default:
                ((ru.mail.libverify.api.s) this.c).C();
                return;
        }
    }
}
