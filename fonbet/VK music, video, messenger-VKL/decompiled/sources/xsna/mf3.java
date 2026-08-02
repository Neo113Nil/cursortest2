package xsna;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.offline.DownloadService;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ironsource.Ga;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.VKTabLayout;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.ui.impl.widget.FirstFixedTabsLayout;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import ru.ok.android.webrtc.participant.talking.VoiceAudioLevelListener;
import ru.ok.media.ConnectionBenchmark;
import ru.ok.tracer.profiler.sampling.SamplingProfiler;
import xsna.l2f;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mf3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mf3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TabLayout.i iVar;
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                FragmentActivity activity = ((AppsPickerFragment) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            case 1:
                com.vk.search.fragment.a aVar = (com.vk.search.fragment.a) obj;
                q7v0 q7v0Var = aVar.g;
                VkOnboardingCampaign e = q7v0Var.e("me:community_channel_global_search");
                if (e != null && q7v0Var.d(e) && q7v0Var.b(e, false)) {
                    FirstFixedTabsLayout firstFixedTabsLayout = aVar.b;
                    Iterator<T> it = DiscoverSearchTabs.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (i2 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!epx.f(((DiscoverSearchTabs.SearchTabName) next).i(), DiscoverSearchTabs.SearchTabName.SearchChannels.i())) {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        if (intValue < 1) {
                            VKTabLayout vKTabLayout = firstFixedTabsLayout.c;
                            if (vKTabLayout != null) {
                                vKTabLayout.v(intValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, true);
                            }
                        } else {
                            VKTabLayout vKTabLayout2 = firstFixedTabsLayout.b;
                            if (vKTabLayout2 != null) {
                                vKTabLayout2.v(intValue - 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, true);
                            }
                        }
                        TabLayout.g b = firstFixedTabsLayout.b(intValue);
                        if (b == null || (iVar = b.h) == null) {
                            return;
                        }
                        int i4 = m8v0.M;
                        String string = aVar.d.getResources().getString(R.string.discover_search_channels_onboarding_title);
                        VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style6;
                        VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size72;
                        VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.BottomLeft;
                        VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Right;
                        VkOnboardingComponent vkOnboardingComponent = aVar.f;
                        VkOnboardingStat$Type vkOnboardingStat$Type = VkOnboardingStat$Type.Tooltip;
                        String str = e.b;
                        VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                        VkOnboardingStat$Delegate ac = vkOnboardingComponent.ac(vkOnboardingStat$Type, str);
                        int i5 = 5;
                        m8v0.a.a(iVar, string, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, null, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, new mu1(6, aVar, e), new defpackage.m(i5, aVar, e), new g53(7), new qm(i5), new yu1(i3, aVar, e), new x28(aVar, e, intValue, i3), ac, 0, true, null, null, false, null, false, 16023588);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                com.vk.clips.design.view.author.b bVar = (com.vk.clips.design.view.author.b) obj;
                if (bVar.f) {
                    bVar.postDelayed(bVar.g, 1500L);
                    return;
                }
                return;
            case 3:
                l2f.a aVar2 = (l2f.a) obj;
                l2f l2fVar = aVar2.f;
                if (l2fVar != null) {
                    l2fVar.o(true);
                }
                l2f l2fVar2 = aVar2.f;
                if (l2fVar2 != null) {
                    SpinnerState spinnerState = SpinnerState.Error;
                    o2f o2fVar = l2fVar2.h;
                    if (o2fVar != null) {
                        o2fVar.setSpinnerState(spinnerState);
                    }
                }
                l2f l2fVar3 = aVar2.f;
                if (l2fVar3 != null) {
                    String str2 = aVar2.c;
                    o2f o2fVar2 = l2fVar3.h;
                    if (o2fVar2 != null) {
                        o2fVar2.setSubtitle(str2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConnectionBenchmark) obj).lambda$stop$1();
                return;
            case 5:
                ((DownloadService.b) obj).e();
                return;
            case 6:
                ((gzs) obj).invoke();
                return;
            case 7:
                ((cys) obj).d.invoke();
                return;
            case 8:
                Ga.c((Ga) obj);
                return;
            case 9:
                ((dad0) obj).b.e(0, true);
                return;
            case 10:
                SamplingProfiler.commit$lambda$1((String) obj);
                return;
            case 11:
                bwt0.p0((View) obj, false);
                return;
            case 12:
                ((TextInputLayout) obj).e.requestLayout();
                return;
            case 13:
                VideoCatalogSearchRootVh videoCatalogSearchRootVh = (VideoCatalogSearchRootVh) obj;
                g3a.a(videoCatalogSearchRootVh.w, videoCatalogSearchRootVh);
                return;
            case 14:
                VideoPlaylistRootVh videoPlaylistRootVh = (VideoPlaylistRootVh) obj;
                g3a.a(videoPlaylistRootVh.w, videoPlaylistRootVh);
                return;
            case 15:
                ((VoiceAudioLevelListener.Listener) obj).onVoiceDetected();
                return;
            default:
                ((ru.mail.libverify.api.s) obj).r();
                return;
        }
    }
}
