package xsna;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.user.stack.VkUserStackOld;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.bottomsheet.about.delegate.f0;
import com.vk.profile.user.impl.ui.f;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSnackBarManager;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bhg0;
import xsna.jto0;
import xsna.k1u0;
import xsna.q0j0;
import xsna.t0d;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class whg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ whg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkTile.TextSize textSize;
        VkTile.TextAlignment textAlignment;
        VkTile.d dVar;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                etv0 etv0Var = (etv0) obj;
                eig0<bhg0> eig0Var = ((ReviewHeaderView) obj2).j;
                if (eig0Var != null) {
                    eig0Var.a(bhg0.d.a);
                }
                etv0Var.b(false);
                return s3q0.a;
            case 1:
                ((zak0) ((sjg0) obj2).s).setValue((String) obj);
                return s3q0.a;
            case 2:
                return new i6h0(new yu60((u6h0) obj2, 17), (ViewGroup) obj);
            case 3:
                c1h c1hVar = (c1h) obj2;
                tdu tduVar = (tdu) obj;
                tduVar.n(((Number) c1hVar.p.getValue()).floatValue());
                tduVar.b(c1h.v(c1hVar, 0.98f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = SettingsFragment.Q;
                ((SettingsFragment) obj2).fo().b(new q0j0.f.b((OrdData) obj));
                return s3q0.a;
            case 5:
                g1k0 g1k0Var = (g1k0) obj2;
                q9x q9xVar = (q9x) obj;
                ((wak0) g1k0Var.j).C((int) (q9xVar.a >> 32));
                ((wak0) g1k0Var.k).C((int) (q9xVar.a & 4294967295L));
                return s3q0.a;
            case 6:
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 7:
                ((l0l0) obj2).e.invoke((wpc0) obj);
                return s3q0.a;
            case 8:
                vpl0 vpl0Var = (vpl0) obj2;
                for (StoryEntry storyEntry : ((ppt) obj).a) {
                    vpl0Var.c.put(storyEntry.Gb(), storyEntry);
                }
                return s3q0.a;
            case 9:
                gyl0 presenter = ((myl0) obj2).getPresenter();
                if (presenter != null) {
                    presenter.apply();
                }
                return s3q0.a;
            case 10:
                int i3 = StorySettingsActivity.P;
                ((StorySettingsActivity) obj2).X1();
                return s3q0.a;
            case 11:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).T(new e.d.C1828d((List) obj));
                return s3q0.a;
            case 12:
                JSONObject d = yq.d("type", "situational_template");
                d.put("id_value", ((ClickableSituationalTemplate) obj2).e);
                s3q0 s3q0Var = s3q0.a;
                ((b.d) obj).b(d, "clickable_sticker");
                return s3q0.a;
            case 13:
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj;
                izs<SdkClipVideoFile, s3q0> izsVar = ((t0d.q.b) ((t0d.q) obj2)).b;
                if (izsVar != null) {
                    izsVar.invoke(sdkClipVideoFile);
                }
                return s3q0.a;
            case 14:
                VkTile vkTile = (VkTile) obj;
                jto0.b bVar = (jto0.b) ((zak0) ((jto0) obj2).c).getValue();
                int i4 = jto0.d.$EnumSwitchMapping$1[bVar.b.ordinal()];
                if (i4 == 1) {
                    textSize = VkTile.TextSize.Small;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textSize = VkTile.TextSize.Medium;
                }
                vkTile.setTextSize(textSize);
                int i5 = jto0.d.$EnumSwitchMapping$0[bVar.a.ordinal()];
                if (i5 == 1) {
                    textAlignment = VkTile.TextAlignment.Start;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textAlignment = VkTile.TextAlignment.Center;
                }
                vkTile.setTextAlignment(textAlignment);
                String str = bVar.d.a.c;
                if (!bVar.e) {
                    str = null;
                }
                vkTile.setOvertitle(str != null ? new VkTile.c(oq.d(tlo0.Companion, str)) : null);
                tlo0.h d2 = oq.d(tlo0.Companion, bVar.c.a.c);
                String str2 = bVar.f.a.c;
                if (!bVar.g) {
                    str2 = null;
                }
                tlo0.h hVar = str2 != null ? new tlo0.h(str2) : null;
                gko gkoVar = bVar.h ? new gko(R.drawable.vk_icon_services_12) : null;
                vkTile.getContext();
                vkTile.setTitle(new VkTile.e(d2, 0, hVar, gkoVar, bVar.i ? new gko(R.drawable.vk_icon_verified_16) : null, null, bVar.j ? new gko(R.drawable.vk_icon_explicit_12) : null, 338));
                String str3 = bVar.k.a.c;
                if (!bVar.l) {
                    str3 = null;
                }
                if (str3 != null) {
                    tlo0.h hVar2 = new tlo0.h(str3);
                    gko gkoVar2 = bVar.m ? new gko(R.drawable.vk_icon_tag_12) : null;
                    vkTile.getContext();
                    dVar = new VkTile.d(hVar2, 0, gkoVar2, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), bVar.n ? new gko(R.drawable.vk_icon_explicit_12) : null, null, 34);
                } else {
                    dVar = null;
                }
                vkTile.setSubtitle(dVar);
                String str4 = bVar.o.a.c;
                if (!bVar.p) {
                    str4 = null;
                }
                vkTile.setExtraSubtitle(str4 != null ? new VkTile.b(new tlo0.h(str4)) : null);
                return s3q0.a;
            case 15:
                ((k7q0) obj2).P4(((View) obj).getId());
                return s3q0.a;
            case 16:
                ((f.e.b.C1722b) ((f.e.b) obj2)).getClass();
                ((Intent) obj).putExtra(X3.i.b, (String) null);
                return s3q0.a;
            case 17:
                ((u8r0) obj2).a.k();
                return s3q0.a;
            case 18:
                return ahn.p(((Integer) obj).intValue(), ((f0.a) obj2).itemView.getContext());
            case 19:
                dgs0 dgs0Var = (dgs0) obj2;
                dgs0Var.b = null;
                dgs0Var.c = null;
                return s3q0.a;
            case 20:
                VideoDiscoveryRelatedVideosSnackBarManager videoDiscoveryRelatedVideosSnackBarManager = (VideoDiscoveryRelatedVideosSnackBarManager) obj2;
                videoDiscoveryRelatedVideosSnackBarManager.b = null;
                videoDiscoveryRelatedVideosSnackBarManager.c = null;
                return s3q0.a;
            case 21:
                return ((Boolean) obj).booleanValue() ? ((com.vk.video.ui.discovery.minimizable.g) obj2).b0.i.a.e(VideoAdvertisementsRepository.AdType.SPORT_BANNER, null).U(new mh40(new mcl0(12), 19)).p0(EmptyList.b) : io.reactivex.rxjava3.core.q.T(EmptyList.b);
            case 22:
                ((Boolean) obj).getClass();
                int i6 = VideoNewProfileHeaderViewV2.y;
                ((tsk0) obj2).invoke();
                return s3q0.a;
            case 23:
                VideoPlaylistRootVh videoPlaylistRootVh = (VideoPlaylistRootVh) obj2;
                String str5 = videoPlaylistRootVh.H;
                g3a g3aVar = videoPlaylistRootVh.w;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof wxr0) {
                    wxr0 wxr0Var = (wxr0) bwr0Var;
                    String str6 = wxr0Var.c;
                    CatalogConfiguration catalogConfiguration = videoPlaylistRootVh.m.b.s;
                    n4t0 n4t0Var = catalogConfiguration instanceof n4t0 ? (n4t0) catalogConfiguration : null;
                    if (str6 != null && n4t0Var != null && (epx.f(String.valueOf(videoPlaylistRootVh.F), str6) || epx.f(str5, str6))) {
                        Iterator<? extends VideoFile> it = n4t0Var.I.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                            } else if (!epx.f(it.next().a1(), wxr0Var.a.a1())) {
                                i2++;
                            }
                        }
                        if (i2 > -1) {
                            ArrayList arrayList = new ArrayList(n4t0Var.I);
                            arrayList.remove(i2);
                            n4t0Var.I = arrayList;
                            if (arrayList.isEmpty()) {
                                g3aVar.d();
                            }
                        }
                    }
                } else if (bwr0Var instanceof cwr0) {
                    cwr0 cwr0Var = (cwr0) bwr0Var;
                    String str7 = cwr0Var.b;
                    CatalogConfiguration catalogConfiguration2 = videoPlaylistRootVh.m.b.s;
                    n4t0 n4t0Var2 = catalogConfiguration2 instanceof n4t0 ? (n4t0) catalogConfiguration2 : null;
                    VideoFile videoFile = cwr0Var.a;
                    if (str7 != null && n4t0Var2 != null && videoFile != null && epx.f(str5, str7)) {
                        ArrayList arrayList2 = new ArrayList(n4t0Var2.I);
                        arrayList2.add(0, videoFile);
                        n4t0Var2.I = arrayList2;
                    }
                } else if (bwr0Var instanceof fwr0) {
                    fwr0 fwr0Var = (fwr0) bwr0Var;
                    if (fwr0Var.a == videoPlaylistRootVh.F && fwr0Var.b == videoPlaylistRootVh.G.b) {
                        g3aVar.d();
                    }
                } else if (bwr0Var instanceof jwr0) {
                    VideoAlbum videoAlbum = ((jwr0) bwr0Var).a;
                    if (videoAlbum.b == videoPlaylistRootVh.F && videoAlbum.c.b == videoPlaylistRootVh.G.b) {
                        g3aVar.d();
                    }
                } else if (bwr0Var instanceof hwr0) {
                    VideoAlbum videoAlbum2 = ((hwr0) bwr0Var).a;
                    if (videoAlbum2.b == videoPlaylistRootVh.F && epx.f(videoAlbum2.c, videoPlaylistRootVh.G)) {
                        videoPlaylistRootVh.m.b.b.c(false);
                    }
                }
                return s3q0.a;
            case 24:
                dw20 dw20Var = ((vlt0) obj2).b;
                if (dw20Var != null) {
                    String str8 = dw20.d1;
                    dw20Var.Sn(null);
                }
                return s3q0.a;
            case 25:
                VkCardForm vkCardForm = (VkCardForm) obj2;
                VkTextFieldView vkTextFieldView = vkCardForm.c;
                (vkTextFieldView != null ? vkTextFieldView : null).c.setBackgroundResource(R.drawable.vkui_bg_edittext);
                izs<? super VkCardForm.b, s3q0> izsVar2 = vkCardForm.f;
                if (izsVar2 != null) {
                    izsVar2.invoke(vkCardForm.getCardData());
                }
                return s3q0.a;
            case 26:
                c4v0 c4v0Var = (c4v0) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(c4v0Var.b, "event_type");
                w9yVar.e(c4v0Var.c, "event_subtype");
                w9yVar.d(Long.valueOf(c4v0Var.d), "owner_id");
                w9yVar.c(Integer.valueOf(c4v0Var.e), "audio_id");
                w9yVar.e(c4v0Var.i, "block_id");
                w9yVar.c(Integer.valueOf(c4v0Var.f), "playback_duration");
                w9yVar.d(Long.valueOf(c4v0Var.g), "event_timestamp_ms");
                w9yVar.e(c4v0Var.h, "track_code");
                return s3q0.a;
            case 27:
                return lcv0.d((lcv0) obj2);
            case 28:
                VkUserStackOld vkUserStackOld = (VkUserStackOld) obj2;
                rzq0 rzq0Var = (rzq0) obj;
                int i7 = VkUserStackOld.t;
                rzq0Var.b(vkUserStackOld.getAvatars(), VkUserStackOld.c.b);
                Integer counter = vkUserStackOld.getCounter();
                if (counter != null) {
                    rzq0Var.a(new VkUserStackOld.d(counter.intValue()));
                }
                return s3q0.a;
            default:
                ((f6w0) obj2).b.a();
                return s3q0.a;
        }
    }
}
