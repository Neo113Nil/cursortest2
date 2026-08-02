package xsna;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.attachpicker.widget.VkSeekBar;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.tabs.d;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.profile.core.tabs.ui.view.ProfileFeedPaginatedView;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.superapp.widget_settings.p004new.WidgetSettingsTab;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.videotracks.RemoteVideoTracks;
import xsna.est0;
import xsna.h8z0;
import xsna.hox;
import xsna.spw0;
import xsna.trc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l960 implements c.b, io.reactivex.rxjava3.functions.l, RemoteVideoTracks.Listener, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.m, VkSeekBar.a, io.reactivex.rxjava3.functions.c, h8z0.b, yads.cq2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l960(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.cq2
    public boolean a(yads.qp2 qp2Var) {
        return yads.yp2.a(this.c, qp2Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (spw0.a.b) ((hkb) this.c).invoke(obj, obj2);
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                com.vk.superapp.widget_settings.p004new.a aVar = (com.vk.superapp.widget_settings.p004new.a) obj;
                int i3 = com.vk.superapp.widget_settings.p004new.a.n1;
                WidgetSettingsTab.Companion.getClass();
                WidgetSettingsTab a = WidgetSettingsTab.a.a(i);
                if (a != null) {
                    int h = a.h();
                    Context mo2getContext = aVar.mo2getContext();
                    gVar.q(mo2getContext != null ? mo2getContext.getString(h) : null);
                    break;
                }
                break;
            default:
                mfm0 mfm0Var = (mfm0) obj;
                int i4 = com.vk.core.view.components.tabs.d.G;
                Context context = mfm0Var.b;
                nxv0 a2 = d.a.a(context);
                StoryStatisticsTab.Companion.getClass();
                StoryStatisticsTab a3 = StoryStatisticsTab.a.a(i);
                if (a3 != null) {
                    com.vk.core.view.components.tabs.d.U4(a2, enj.e(a3.l(), i == mfm0Var.g.getCurrentItem() ? R.attr.vk_ui_icon_primary : R.attr.vk_ui_icon_medium, context), true, 4);
                    a2.setContentDescription(context.getString(a3.j()));
                    gVar.l(a2);
                    break;
                }
                break;
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 5:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                osc0 osc0Var = (osc0) ((crc0) ((PostponedPostsFragment) obj).U.getValue()).a.invoke();
                if (osc0Var != null) {
                    osc0Var.b(trc0.d.b.b);
                    break;
                }
                break;
            default:
                ProfileFeedPaginatedView profileFeedPaginatedView = (ProfileFeedPaginatedView) obj;
                gzs<s3q0> gzsVar = profileFeedPaginatedView.O;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                gzs<s3q0> gzsVar2 = profileFeedPaginatedView.F;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks.Listener
    public void onPeerConnectionRemoteVideoTrackAdded(String str) {
        ((PeerConnectionClient) this.c).b(str);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        b8e0 b8e0Var = (b8e0) this.c;
        int i = StickersRecyclerView.w;
        return ((Boolean) b8e0Var.invoke(obj)).booleanValue();
    }

    public /* synthetic */ l960(baz0 baz0Var, m6z0 m6z0Var) {
        this.b = 18;
        this.c = baz0Var;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hcy0 hcy0Var = ((baz0) this.c).l;
        pdz0.this.g.a.a.a(new hox.a());
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (vf60) ((mu1) obj2).invoke(obj);
            case 2:
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                int i2 = VkFriendsPickerActivity.p;
                return (String) ((jz30) obj2).invoke(obj);
            case 3:
                return (ucc0) ((bgy) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((mh4) obj2).invoke(obj);
            case 7:
                return (sa90) ((d630) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((b8e0) obj2).invoke(obj);
            case 11:
                return (List) ((jz30) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((b8e0) obj2).invoke(obj);
            case 13:
                return (Boolean) ((jz30) obj2).invoke(obj);
            case 14:
                return (hda) ((est0.c) obj2).invoke(obj);
        }
    }
}
