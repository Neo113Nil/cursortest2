package xsna;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.preference.Preference;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.material.bottomsheet.PagerViewBottomSheetBehavior;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.settings.MaterialSwitchSettingsView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.story.viewer.api.models.Gesture;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.cwb0;
import xsna.fit;
import xsna.jms0;
import xsna.kcb;
import xsna.kms0;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h7 implements io.reactivex.rxjava3.functions.l, b03, t680, io.reactivex.rxjava3.functions.c, ub9.c, r1y0, MaterialSwitchSettingsView.a, io.reactivex.rxjava3.functions.m, Preference.c, jms0.a, OnFyberMarketplaceInitializedListener, h9l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.jms0.a
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ((kms0.c) this.c).a(videoFrameProcessingException);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((rc9) this.c).invoke(obj, obj2);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        vo9 vo9Var = (vo9) this.c;
        synchronized (vo9.m) {
            vo9.p.addListener(new cy3(3, vo9Var, aVar), xo9.g());
        }
        return "CameraX shutdown";
    }

    @Override // com.vk.im.ui.views.settings.MaterialSwitchSettingsView.a
    public void b(boolean z) {
        kcb.a.InterfaceC3174a interfaceC3174a;
        kcb.a aVar = (kcb.a) this.c;
        if (!aVar.s || (interfaceC3174a = aVar.m) == null) {
            return;
        }
        interfaceC3174a.R(z);
    }

    @Override // xsna.r1y0
    public void c() {
        ((com.vk.channels.impl.channel_screen.send_msg.a) this.c).H();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return ((k7r0) this.c).a(new JSONObject().put("response", wwxVar.b));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 15:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                new bzb0(debugDevSettingsFragment.kn()).b(new cwb0.n(VkBuildAppStore.values()), new com.vk.movika.sdk.base.logic.processor.d(9, debugDevSettingsFragment, preference), null);
                break;
            default:
                int i2 = DebugUserSettingsFragment.l0;
                ArrayList<String> arrayList = hti0.a;
                hti0.b(((DebugUserSettingsFragment) obj).requireContext());
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    @Override // xsna.t680
    public void f(int i) {
        com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) this.c;
        int i2 = aVar.J;
        PagerViewBottomSheetBehavior<?> pagerViewBottomSheetBehavior = aVar.j;
        if (pagerViewBottomSheetBehavior == null || pagerViewBottomSheetBehavior.M != 4) {
            return;
        }
        if (i == i2) {
            StoryFragment d = aVar.d();
            if (d == null) {
                aVar.m.setCurrentItem(i2, false);
                d = aVar.d();
            }
            if (d != null) {
                d.R = Gesture.TAP;
                d.eo();
            }
        } else {
            int i3 = aVar.L;
            if (i == i3 && i3 >= 0) {
                g2v.d().a().d(aVar.d0.kn(), aVar.V, false, "attach", null);
            }
        }
        if (i2 == i || aVar.L == i) {
            return;
        }
        aVar.m.setCurrentItem(i, Math.abs(aVar.m.getCurrentItem() - i) <= 1);
        aVar.p();
    }

    @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
    public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        FyberAdapter.init$lambda$2$lambda$1((FyberAdapter) this.c, fyberInitStatus);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new i5r((NewsfeedRouter) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 12:
                return ((Boolean) ((gv3) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((s6k) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((q8) this.c).invoke(obj);
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 21:
            case 22:
            case 24:
            default:
                return (io.reactivex.rxjava3.core.t) ((mp3) this.c).invoke(obj);
            case 2:
                return (VKList) ((gv3) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((mp3) this.c).invoke(obj);
            case 10:
                return (y8b) ((qi3) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.e) ((z63) this.c).invoke(obj);
            case 13:
                return (NewsEntry) ((z63) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((z63) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((s6k) this.c).invoke(obj);
            case 19:
                return (b0l0) ((gv3) this.c).invoke(obj);
            case 20:
                return (NewsEntry) ((s6k) this.c).invoke(obj);
            case 23:
                return ((fit.m) this.c).invoke(obj);
            case 25:
                return (Boolean) ((gv3) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((qi00) this.c).invoke(obj);
            case 27:
                return (pst) ((t810) this.c).invoke(obj);
            case 28:
                ((com) this.c).invoke(obj);
                return 1;
        }
    }
}
