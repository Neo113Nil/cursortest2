package xsna;

import android.media.AudioTrack;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.B;
import com.ironsource.P2;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.dto.Push;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.h;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.push.rustore.impl.RuStorePushService;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.webrtc.Call;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.d5h;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class rc4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rc4(RuStorePushService ruStorePushService, nvf0 nvf0Var) {
        this.b = 16;
        this.c = nvf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                tc4 tc4Var = (tc4) this.c;
                tc4Var.a.unregisterReceiver(tc4Var.b);
                return;
            case 1:
                B.c((B) this.c);
                return;
            case 2:
                ((Call) this.c).m();
                return;
            case 3:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                int i = CommunityAddressesFragment.E0;
                FragmentActivity activity = communityAddressesFragment.getActivity();
                if (activity == null || !communityAddressesFragment.isAdded() || communityAddressesFragment.isRemoving() || communityAddressesFragment.isDetached() || communityAddressesFragment.isStateSaved() || p90.e(activity)) {
                    return;
                }
                ol00 ol00Var = (ol00) communityAddressesFragment.getChildFragmentManager().G(R.id.map_frame);
                ol00 ol00Var2 = ol00Var;
                if (ol00Var == null) {
                    vj00 vj00Var = ofx.a;
                    if (vj00Var == null) {
                        vj00Var = null;
                    }
                    vj00Var.getClass();
                    vgr0 vgr0Var = new vgr0();
                    FragmentManager childFragmentManager = communityAddressesFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.g(R.id.map_frame, vgr0Var, null);
                    aVar.k(false);
                    ol00Var2 = vgr0Var;
                }
                ol00Var2.Nk(communityAddressesFragment.new h(activity));
                return;
            case 4:
                d5h.c cVar = (d5h.c) this.c;
                cVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.LONG_CLICK, (z4h.a) cVar.m, Integer.valueOf(((wak0) cVar.o).getIntValue())));
                return;
            case 5:
                jse0 jse0Var = ((x5n) this.c).c;
                if (jse0Var != null) {
                    jse0Var.a();
                    return;
                }
                return;
            case 6:
                ((EffectNativeSink) this.c).lambda$clearSavedStorage$3();
                return;
            case 7:
                f4m.j(((FastScrollerView) this.c).b);
                return;
            case 8:
                crx0.E((EditText) this.c, true);
                return;
            case 9:
                vky vkyVar = (vky) this.c;
                synchronized (vkyVar) {
                    AudioTrack audioTrack = vkyVar.d;
                    if (audioTrack != null && audioTrack.getPlayState() == 3) {
                        vkyVar.d.pause();
                        synchronized (vkyVar.c) {
                            vkyVar.c.notify();
                        }
                    }
                }
                return;
            case 10:
                Iterator<T> it = ((yr20) this.c).d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).requestLayout();
                }
                return;
            case 11:
                ViewPager2 viewPager2 = (ViewPager2) this.c;
                int i2 = MoneyTransferPagerFragment.w0;
                viewPager2.setCurrentItem(1);
                return;
            case 12:
                ((RecyclerView) this.c).invalidateItemDecorations();
                return;
            case 13:
                P2.d((P2) this.c);
                return;
            case 14:
                ((bzb0) this.c).a();
                return;
            case 15:
                jng0 jng0Var = (jng0) this.c;
                jng0Var.a.play(jng0Var.c[4], 1.0f, 1.0f, 0, 0, 1.0f);
                return;
            case 16:
                nvf0 nvf0Var = (nvf0) this.c;
                int i3 = RuStorePushService.n;
                xhe0 e = dm10.e();
                Map<String, String> map = nvf0Var.b;
                Push.Priority.a aVar2 = Push.Priority.Companion;
                int i4 = nvf0Var.a;
                aVar2.getClass();
                e.c(new Push(map, Push.Priority.a.a(i4), 4));
                return;
            case 17:
                ((xhj0) this.c).b(false);
                return;
            case 18:
                jck0 jck0Var = (jck0) this.c;
                ((u2b0) jck0Var.d.getValue()).P0((com.vk.music.player.e) jck0Var.e.getValue(), true);
                return;
            case 19:
                b96 b96Var = ((z5m0) this.c).c;
                b96Var.d();
                b96Var.f();
                return;
            case 20:
                ?? r0 = ((l4o0) this.c).h;
                if (r0 != 0) {
                    r0.c0();
                    return;
                }
                return;
            default:
                yads.jm.d((yads.jm) this.c);
                return;
        }
    }

    public /* synthetic */ rc4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
