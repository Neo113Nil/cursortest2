package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.a;
import com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.feature.uxpolls.modalpoll.BaseModalFragment;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.event.publisher.di.ImEventPublisherScopedComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.newsfeed.impl.fragments.ClipsCommentThreadFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.configure.ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.h7u0;
import xsna.j9d0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ClipsDuetInfo clipsDuetInfo;
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        int i = this.b;
        int i2 = 2;
        Object obj = this.c;
        switch (i) {
            case 0:
                return AbstractClipsGridListFragment.io((AbstractClipsGridListFragment) obj);
            case 1:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj;
                int i3 = AlbumDetailsFragment.p0;
                PhotoAlbum photoAlbum = (PhotoAlbum) albumDetailsFragment.S.getValue();
                return Integer.valueOf(photoAlbum != null ? photoAlbum.b : albumDetailsFragment.requireArguments().getInt("album_id"));
            case 2:
                int i4 = AppChannelFragment.l1;
                return Boolean.valueOf(((AppChannelFragment) obj).requireArguments().getBoolean("postponed_posts"));
            case 3:
                int i5 = ArchiveFragment.e0;
                return ((ArchiveFragment) obj).fo().L9();
            case 4:
                return (BridgeComponent) ((e7m) obj).a(fpf0.a(BridgeComponent.class));
            case 5:
                j96 j96Var = (j96) obj;
                return new p6m0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), (w3l0) j96Var.j.getValue());
            case 6:
                Object obj2 = ((wa6) obj).o;
                ((p0c) (obj2 != null ? obj2 : null)).A();
                return s3q0.a;
            case 7:
                int i6 = BaseModalFragment.V;
                return new BaseModalFragment.b(((BaseModalFragment) obj).getResources().getDimensionPixelSize(R.dimen.ux_polls_modal_radius));
            case 8:
                izs<? super FeedbackResult, s3q0> izsVar = ((zn6) obj).g;
                if (izsVar != null) {
                    izsVar.invoke(FeedbackResult.STAR_3);
                }
                return s3q0.a;
            case 9:
                x17 x17Var = (x17) obj;
                int a = x17Var.a() - ((Number) ((zak0) x17Var.e).getValue()).intValue();
                r4 = a > 0 ? a : 0;
                int a2 = x17Var.a();
                if (r4 > a2) {
                    r4 = a2;
                }
                return String.format(Locale.getDefault(), "-%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(r4 / 60), Integer.valueOf(r4 % 60)}, 2));
            case 10:
                ((izs) obj).invoke(a.k.b);
                return s3q0.a;
            case 11:
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
                return s3q0.a;
            case 12:
                return ((ContentPrivacyComponent) ((k7m) m7m.f((dg8) obj)).a(fpf0.a(ContentPrivacyComponent.class))).Z8();
            case 13:
                ((z89) obj).e(j9d0.b.a);
                return s3q0.a;
            case 14:
                ((CatalogVh) obj).ya();
                return s3q0.a;
            case 15:
                return LifecycleHandler.c(((CatalogRootViewHolder) obj).b);
            case 16:
                return ((LinksBridgeComponent) ((k7m) m7m.c((bha) obj)).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 17:
                int i7 = ChannelFragment.a1;
                return new bzb0(((ChannelFragment) obj).requireContext());
            case 18:
                ((a8b) obj).e = null;
                return s3q0.a;
            case 19:
                int i8 = ChannelsListFragment.f0;
                return new bzb0(((ChannelsListFragment) obj).requireContext());
            case 20:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                l7m d = m7m.d(chatFragment);
                return ((ImEventPublisherScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), chatFragment.no(), d).a(fpf0.a(ImEventPublisherScopedComponent.class))).G();
            case 21:
                ebd ebdVar = (ebd) obj;
                fxe fxeVar = ebdVar.z;
                Context context = ebdVar.h;
                f3b f3bVar = new f3b(ebdVar, 2);
                fxeVar.getClass();
                int i9 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.g0(R.string.clip_grid_author_tell_about_yourself_cancel_are_you_sure);
                c.U(R.string.clip_grid_author_tell_about_yourself_cancel_desc);
                c.c0(R.string.clip_grid_author_tell_about_yourself_exit, new bxe(f3bVar, 0));
                c.W(R.string.clip_grid_author_tell_about_yourself_cancel, null);
                c.m();
                return s3q0.a;
            case 22:
                return (ClipsFavoritesComponent) ((k7m) m7m.f((ekd) obj)).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 23:
                int i10 = ClipsCommentThreadFragment.A0;
                return ((BridgeComponent) m7m.d((ClipsCommentThreadFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 24:
                jpd jpdVar = (jpd) obj;
                an9 an9Var = jpdVar.b.i;
                an9Var.g = false;
                an9Var.i = false;
                StoryCameraParams storyCameraParams = jpdVar.x;
                String str = storyCameraParams.M;
                if (str != null) {
                    ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                    eaa eaaVar = new eaa(i2, str, (Object) jpdVar);
                    clipsDraftPersistentStore.getClass();
                    ClipsDraftPersistentStore.o(eaaVar);
                } else {
                    ClipsEditorMusicInfo clipsEditorMusicInfo2 = jpdVar.z.c;
                    ClipsEditorInputAudioItem clipsEditorInputAudioItem = clipsEditorMusicInfo2 != null ? new ClipsEditorInputAudioItem(clipsEditorMusicInfo2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null) : null;
                    if (clipsEditorInputAudioItem != null && (clipsEditorMusicInfo = clipsEditorInputAudioItem.b) != null && !clipsEditorMusicInfo.j) {
                        r4 = 1;
                    }
                    ClipsEditorInputData clipsEditorInputData = new ClipsEditorInputData(EmptyList.b, null, null, false, false, null, 0, storyCameraParams.t, jpdVar.c.getIsFullHdCamera(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, null);
                    ArrayList arrayList = jpdVar.q;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(w0e.c((ClipVideoItem) it.next()));
                    }
                    int i11 = jpdVar.i.b;
                    ClipVideoFile clipVideoFile = storyCameraParams.N;
                    if (clipVideoFile != null) {
                        UserId userId = clipVideoFile.b;
                        int i12 = clipVideoFile.c;
                        String str2 = clipVideoFile.p0;
                        if (str2 == null) {
                            str2 = "";
                        }
                        clipsDuetInfo = new ClipsDuetInfo(userId, i12, str2);
                    } else {
                        clipsDuetInfo = null;
                    }
                    jpdVar.d.g(ClipsEditorInputData.a(clipsEditorInputData, arrayList2, r4 != 0 ? clipsEditorInputAudioItem : null, r4 == 0 ? Collections.singletonList(e43.m(clipsEditorInputAudioItem)) : EmptyList.b, true, false, clipsDuetInfo, i11, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 896));
                }
                return s3q0.a;
            case 25:
                ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1 clipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1 = (ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1) ((ClipsDraftComponentBase) obj);
                return new qxn0(((tud) clipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1.g.c).a(), (xke) clipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1.f.a);
            case 26:
                return ((ClipsEntryPointsComponentImpl) obj).b.getExperiments();
            case 27:
                int i13 = ClipsFavoriteFoldersListFragment.U;
                return Integer.valueOf(((ClipsFavoriteFoldersListFragment) obj).requireArguments().getInt("folders_span_count", 3));
            case 28:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return ((ClipsConfigViewersComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            default:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj;
                int i14 = ClipsPlaylistPickerFragment.V;
                clipsPlaylistPickerFragment.getClass();
                xn50.a.c(clipsPlaylistPickerFragment, a.d.b);
                return s3q0.a;
        }
    }
}
