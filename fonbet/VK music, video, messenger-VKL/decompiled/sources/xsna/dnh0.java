package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.debug.ui.DebugTabsFragment;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vk.stories.design.view.camera.StoryTabType;
import com.vk.storycamera.picker.feature.StoryMediaPickerState;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e6w0;
import xsna.m8v0;
import xsna.mov0;
import xsna.omt0;
import xsna.p7w0;
import xsna.sum0;
import xsna.w9m0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dnh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dnh0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        int i;
        String str;
        int i2 = this.b;
        int i3 = 8;
        int i4 = 2;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        int i5 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                SearchAuthorCellVh searchAuthorCellVh = (SearchAuthorCellVh) obj3;
                VkCell vkCell = (VkCell) obj2;
                UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorCellVh.h;
                if (uIBlockSearchAuthor != null) {
                    searchAuthorCellVh.k.d(vkCell.getContext(), uIBlockSearchAuthor, false);
                }
                return s3q0.a;
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                FragmentImpl u = ((ww50) obj3).u();
                if (u == null || !u.getClass().equals(DebugTabsFragment.class)) {
                    new oz50(DebugTabsFragment.class, null, null).k(mainActivity);
                }
                return s3q0.a;
            case 2:
                StoryEntry storyEntry = (StoryEntry) obj;
                storyEntry.c0 = ((StoryEntry) obj3).c0;
                storyEntry.g0 = (Integer) obj2;
                return s3q0.a;
            case 3:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj3;
                StoryMediaPickerFragment.b bVar = (StoryMediaPickerFragment.b) obj2;
                View view = bVar.d;
                ViewPager2 viewPager2 = bVar.a;
                StoryMediaPickerTabView storyMediaPickerTabView = bVar.b;
                StoryMediaPickerState.a aVar = (StoryMediaPickerState.a) obj;
                int i6 = StoryMediaPickerFragment.d0;
                List<MediaStoreEntry> list = aVar.c;
                p3t go = storyMediaPickerFragment.go();
                if (list.isEmpty()) {
                    storyMediaPickerTabView.setVisibility(0);
                    viewPager2.setUserInputEnabled(true);
                    view.setVisibility(8);
                    if (go != null) {
                        go.V8(iah0.a(90));
                        go.D3(StoryMediaPickerFragment.d0);
                        go.E7();
                    }
                    GalleryPickerPreview galleryPickerPreview = storyMediaPickerFragment.Z;
                    if (galleryPickerPreview != null) {
                        galleryPickerPreview.z4(EmptyList.b);
                    }
                } else {
                    storyMediaPickerTabView.setVisibility(8);
                    viewPager2.setUserInputEnabled(false);
                    view.setVisibility(0);
                    List<MediaStoreEntry> list2 = list;
                    storyMediaPickerFragment.c0.submitList(j5g.O0(list2));
                    Context mo2getContext = storyMediaPickerFragment.mo2getContext();
                    bVar.f.setText(mo2getContext != null ? enj.f(R.plurals.story_picker_create_stories, list.size(), mo2getContext) : null);
                    StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
                    storiesFeatures.getClass();
                    if (com.vk.toggle.b.A.a(storiesFeatures)) {
                        GalleryPickerPreview galleryPickerPreview2 = storyMediaPickerFragment.Z;
                        if (galleryPickerPreview2 != null) {
                            galleryPickerPreview2.z4(list);
                        }
                    } else {
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        if (!view.isLaidOut()) {
                            view.addOnLayoutChangeListener(new j6m0(go, bVar));
                        } else if (go != null) {
                            go.D3(view.getHeight());
                        }
                        VkButton vkButton = bVar.g;
                        if (vkButton != null) {
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((MediaStoreEntry) it.next()) instanceof MediaStoreVideoEntry) {
                                        z = false;
                                        vkButton.setEnabled(z);
                                    }
                                }
                            }
                            z = true;
                            vkButton.setEnabled(z);
                        }
                    }
                    if (go != null) {
                        go.V8(view.getHeight());
                    }
                }
                StoryMediaPickerState.ScreenMode screenMode = aVar.b;
                if (!storyMediaPickerFragment.W) {
                    storyMediaPickerFragment.W = true;
                    if (((Boolean) storyMediaPickerFragment.V.getValue()).booleanValue()) {
                        storyMediaPickerFragment.jo(bVar, true);
                        xn50.a.c(storyMediaPickerFragment, a.h.b);
                    } else {
                        storyMediaPickerFragment.io(bVar, true);
                        xn50.a.c(storyMediaPickerFragment, a.e.b);
                    }
                    viewPager2.b(new com.vk.storycamera.picker.ui.b(storyMediaPickerFragment, bVar));
                }
                int i7 = StoryMediaPickerFragment.c.$EnumSwitchMapping$0[screenMode.ordinal()];
                if (i7 == 1) {
                    storyMediaPickerTabView.a(StoryTabType.NONE);
                    storyMediaPickerTabView.a(StoryTabType.GALLERY);
                    if (viewPager2.getCurrentItem() != 0) {
                        storyMediaPickerFragment.X = true;
                        viewPager2.e(0, false);
                    }
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    storyMediaPickerTabView.a(StoryTabType.NONE);
                    storyMediaPickerTabView.a(StoryTabType.TEMPLATE);
                    if (viewPager2.getCurrentItem() != 1) {
                        storyMediaPickerFragment.X = true;
                        viewPager2.e(1, false);
                    }
                }
                storyMediaPickerTabView.setCountNewTemplate(aVar.d);
                return s3q0.a;
            case 4:
                ((v9m0) obj3).l.invoke(((w9m0.a) obj2).g);
                return s3q0.a;
            case 5:
                b.d dVar = (b.d) obj;
                dVar.b(((String) obj3) + "_sticker", "reaction_name");
                StoriesContainer storiesContainer = ((ebm0) obj2).c;
                if (storiesContainer instanceof HighlightStoriesContainer) {
                    dVar.b(Integer.valueOf(((HighlightStoriesContainer) storiesContainer).o.b), "narrative_id");
                }
                return s3q0.a;
            case 6:
                izs izsVar = (izs) obj2;
                Throwable th = (Throwable) obj;
                ((rnm0) obj3).e = null;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                return s3q0.a;
            case 7:
                ((izs) obj3).invoke(sum0.d.a((sum0.d) obj2, (SubnavigationButton.Size) obj, null, null, false, null, false, null, false, 0, null, false, false, 4094));
                return s3q0.a;
            case 8:
                rhq0 rhq0Var = (rhq0) obj3;
                jhq0 jhq0Var = rhq0Var.e;
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                if (!extendedUserProfile.a()) {
                    return e43.a(new l4m(extendedUserProfile, jhq0Var.c(), new h2h0(i3)));
                }
                if (extendedUserProfile.b("gifts") <= 0) {
                    return null;
                }
                o4m o4mVar = new o4m(R.string.profile_gifts, 8, Integer.valueOf(extendedUserProfile.b("gifts")));
                erh erhVar = new erh(rhq0Var, extendedUserProfile, fragmentActivity, 5);
                o4mVar.j = new wu6(rhq0Var, fragmentActivity, extendedUserProfile, 3);
                return e43.a(o4mVar, new l4m(extendedUserProfile, jhq0Var.c(), erhVar));
            case 9:
                k5e0 k5e0Var = (k5e0) obj2;
                lj0 lj0Var = ((xur0) obj3).m;
                if (lj0Var != null) {
                    lj0Var.u(k5e0Var.b);
                }
                return s3q0.a;
            case 10:
                VideoFile videoFile = (VideoFile) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ((wes0) obj3).getClass();
                if (intValue < 0 || intValue > videoFile.getDuration()) {
                    i = -1;
                } else {
                    List<VideoEpisode> Y3 = videoFile.Y3();
                    int size = Y3.size();
                    e43.q(Y3.size(), size);
                    int i8 = size - 1;
                    while (true) {
                        if (i5 <= i8) {
                            i = (i5 + i8) >>> 1;
                            int b = jw5.b(Integer.valueOf(Y3.get(i).b), num);
                            if (b < 0) {
                                i5 = i + 1;
                            } else if (b > 0) {
                                i8 = i - 1;
                            }
                        } else {
                            i = -(i5 + 1);
                        }
                    }
                    if (i < 0) {
                        i = (-i) - 2;
                    }
                }
                VideoEpisode videoEpisode = (VideoEpisode) j5g.b0(i, videoFile.Y3());
                return (videoEpisode == null || (str = videoEpisode.c) == null) ? "" : str;
            case 11:
                String str2 = (String) obj3;
                VideoFile videoFile2 = (VideoFile) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (uIBlockList.Mb().j()) {
                    List<String> Ib = uIBlockList.Ib();
                    if (!(Ib instanceof Collection) || !Ib.isEmpty()) {
                        Iterator<T> it2 = Ib.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (epx.f((String) it2.next(), str2)) {
                                    ArrayList<UIBlock> Sb = uIBlockList.Sb();
                                    if (Sb == null || !Sb.isEmpty()) {
                                        for (UIBlock uIBlock : Sb) {
                                            if (!(uIBlock instanceof UIBlockVideo) || !epx.f(((UIBlockVideo) uIBlock).A().a1(), videoFile2.a1())) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 12:
                View view2 = (View) obj;
                int i9 = VideoNewProfileHeaderViewV2.y;
                int i10 = m8v0.M;
                m8v0.a.a(view2, (String) obj3, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size96, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new i5p(view2, c == true ? 1 : 0), new yjs0(i4), null, null, null, new whg0((tsk0) obj2, 22), null, 0, false, null, null, false, null, false, 16768004);
                return s3q0.a;
            case 13:
                ((Boolean) obj).booleanValue();
                ((h7v) obj3).b(((HintId) obj2).getId());
                return s3q0.a;
            case 14:
                ((izs) obj3).invoke(new omt0.d.a((BlockId) obj2, ((Long) obj).longValue()));
                return s3q0.a;
            case 15:
                StartPlayVkMixSource startPlayVkMixSource = (StartPlayVkMixSource) obj3;
                n4v0 n4v0Var = (n4v0) obj2;
                MixSettingsEntity mixSettingsEntity = (MixSettingsEntity) obj;
                MixOptionEntity e = mixSettingsEntity.e();
                String str3 = e != null ? e.c : null;
                StartPlayVkMixSource startPlayVkMixSource2 = new StartPlayVkMixSource(startPlayVkMixSource.c, startPlayVkMixSource.d, startPlayVkMixSource.e, startPlayVkMixSource.f, str3 == null ? "" : str3, mixSettingsEntity, startPlayVkMixSource.i, startPlayVkMixSource.j, startPlayVkMixSource.k, startPlayVkMixSource.l);
                PlaybackLaunchMeta playbackLaunchMeta = n4v0Var.b.b;
                return new com.vk.music.player.playback.e(startPlayVkMixSource2, new PlaybackLaunchMeta(playbackLaunchMeta.b, playbackLaunchMeta.c, playbackLaunchMeta.d, startPlayVkMixSource2.b, playbackLaunchMeta.f));
            case 16:
                WebApiApplication webApiApplication = (WebApiApplication) obj3;
                String str4 = (String) obj2;
                Integer num2 = (Integer) obj;
                vdx0 vdx0Var = e370.e;
                return (vdx0Var != null ? vdx0Var : null).d().w(webApiApplication.b, str4, num2, webApiApplication.w).U(new fqf(mov0.b.b, c2 == true ? 1 : 0));
            case 17:
                ((m6w0) obj3).T(new p7w0.e.a(((e6w0.i) obj2).b, (Throwable) obj));
                return s3q0.a;
            case 18:
                return new oaw0((ViewGroup) obj, (b8w0) obj3, (VmojiCharacterFragment.c) obj2);
            default:
                ((o4x0) obj3).h = false;
                ((x7) obj2).invoke((Throwable) obj);
                return s3q0.a;
        }
    }
}
