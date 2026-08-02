package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesTopBarSearchState;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridOwnerClipsListFragment;
import com.vk.core.ui.bottomsheet.internal.BottomSheetBehaviourExt;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.design.view.DiscreteProgressBar;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.d98;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = 1;
        switch (this.b) {
            case 0:
                ((zak0) ((z40) this.c).f).setValue(Boolean.valueOf(!r0.d()));
                return s3q0.a;
            case 1:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.c;
                int i2 = AlbumDetailsFragment.p0;
                return albumDetailsFragment.ho().d3();
            case 2:
                AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) this.c;
                int i3 = AlbumsFragment.j0;
                return albumsRecyclerPaginatedView.getRecyclerView();
            case 3:
                return ((StoriesComponent) ((k7m) m7m.f((u440) this.c)).a(fpf0.a(StoriesComponent.class))).L6();
            case 4:
                return (u76) ((j96) this.c).e.invoke();
            case 5:
                View view = ((ae6) this.c).c;
                return new bzb0((view != null ? view : null).getContext());
            case 6:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                int i4 = BasePhotoListFragment.l0;
                gj6 io2 = basePhotoListFragment.io();
                if (io2 != null) {
                    io2.h();
                }
                return s3q0.a;
            case 7:
                BookingPreloaderFragment bookingPreloaderFragment = (BookingPreloaderFragment) this.c;
                qcy<Object>[] qcyVarArr = BookingPreloaderFragment.S;
                Bundle requireArguments = bookingPreloaderFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("initParams");
                    parcelable = (BookingScreenParams) (parcelable3 instanceof BookingScreenParams ? parcelable3 : null);
                }
                if (parcelable != null) {
                    return (BookingScreenParams) parcelable;
                }
                throw new IllegalStateException("Required value was null.");
            case 8:
                d98 d98Var = (d98) this.c;
                d98.b bVar = d98Var.a;
                int C0 = bVar.C0() + bVar.G0();
                FrameLayout frameLayout = d98Var.f;
                int paddingTop = frameLayout.getPaddingTop() + frameLayout.getPaddingBottom() + C0;
                if (d98Var.j != paddingTop) {
                    d98Var.j = paddingTop;
                    ValueAnimator valueAnimator = d98Var.i;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = d98Var.g;
                    if (bottomSheetBehaviourExt.M != 4) {
                        bottomSheetBehaviourExt.W(paddingTop, false);
                        return s3q0.a;
                    }
                    ValueAnimator duration = ValueAnimator.ofInt(bottomSheetBehaviourExt.g ? -1 : bottomSheetBehaviourExt.f, paddingTop).setDuration(100L);
                    duration.addUpdateListener(new ho6(d98Var, i));
                    duration.start();
                    d98Var.i = duration;
                }
                return s3q0.a;
            case 9:
                ((kea) this.c).x = true;
                return s3q0.a;
            case 10:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i5 = ChannelFragment.a1;
                a1w a1wVar = channelFragment.V;
                LongPollType longPollType = LongPollType.CHANNELS;
                ImSyncStateStatReporter.Target target = ImSyncStateStatReporter.Target.CHANNEL;
                fr frVar = new fr(12);
                return new com.vk.im.engine.reporters.syncstate.a(a1wVar, frVar, new com.vk.im.engine.reporters.syncstate.c(frVar), new j8(27), longPollType, target);
            case 11:
                r0c r0cVar = (r0c) this.c;
                MethodSelectorCodeState methodSelectorCodeState = r0cVar.B;
                if (methodSelectorCodeState == null) {
                    q0c q0cVar = (q0c) r0cVar.a;
                    if (q0cVar != null) {
                        q0cVar.e();
                    }
                } else {
                    r0cVar.L0(methodSelectorCodeState);
                    r0cVar.X0();
                }
                return s3q0.a;
            case 12:
                return jmc.b((jmc) this.c);
            case 13:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i6 = ClipFeedListFragment.a2;
                u7e u7eVar = (u7e) clipFeedListFragment.Y1.getValue();
                u7eVar.getClass();
                return new s7e(u7eVar.d, u7eVar.a, u7eVar.b, u7eVar.c, (r8e) u7eVar.h.getValue());
            case 14:
                Context context = ((n0d) this.c).a;
                ClipFeedSideControlsView clipFeedSideControlsView = new ClipFeedSideControlsView(context, null, 6);
                clipFeedSideControlsView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -1));
                qcy<Object>[] qcyVarArr2 = bwt0.a;
                int dimension = (int) clipFeedSideControlsView.getResources().getDimension(R.dimen.clips_controls_padding_horizontal);
                f4m.l(dimension, dimension, clipFeedSideControlsView);
                clipFeedSideControlsView.measure(clipFeedSideControlsView.getLayoutParams().width > 0 ? tr.a(clipFeedSideControlsView.getLayoutParams().width, 1073741823, 0, 1073741824) : tr.a(0, 1073741823, 0, 0), tr.a(0, 1073741823, 0, 0));
                int v0 = bwt0.v0(clipFeedSideControlsView);
                VkText vkText = new VkText(new lpj(context, R.style.VkUiTypography_Paragraph), null, 6, 0);
                vkText.setMaxLines(1);
                vkText.measure(View.MeasureSpec.makeMeasureSpec(((iah0.f().widthPixels - v0) - e3m.a(R.dimen.clip_description_end_margin, context)) - e3m.a(R.dimen.clip_description_start_margin, context), 1073741824), 0);
                return vkText;
            case 15:
                return ((ClipsConfigAuthorsComponent) ((jpd) this.c).e.h.getValue()).getExperiments();
            case 16:
                ((com.vk.clips.editor.voiceover.impl.a) this.c).a();
                return s3q0.a;
            case 17:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return (SearchStatsLoggingInfo) clipsGridFragment.requireArguments().getParcelable("search_stats_logging_info");
            case 18:
                ClipsGridOwnerClipsListFragment clipsGridOwnerClipsListFragment = (ClipsGridOwnerClipsListFragment) this.c;
                int i7 = ClipsGridOwnerClipsListFragment.o0;
                return new mzc(R.string.my_clips_empty_stub_subtitle, clipsGridOwnerClipsListFragment.requireArguments().getBoolean("ClipsGridListFragment.force_dark_theme_for_placeholder", false));
            case 19:
                ClipsInterestsFragment.b bVar2 = (ClipsInterestsFragment.b) this.c;
                int i8 = ClipsInterestsFragment.Y;
                return new PointF(bVar2.b().getX() + (bVar2.b().getWidth() / 2), bVar2.b().getY() + (bVar2.b().getHeight() / 2));
            case 20:
                sgd d = ((mhd) ((dle) this.c).b.getValue()).d();
                return new rm4(d.a, d.b);
            case 21:
                return Integer.valueOf(((mc90) this.c).k());
            case 22:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i9 = ClipsWrapperFragment.Q0;
                return ((ClipsExternalNpsComponent) m7m.d(clipsWrapperFragment).a(fpf0.a(ClipsExternalNpsComponent.class))).Q1();
            case 23:
                pzf pzfVar = (pzf) this.c;
                ListBuilder e = e43.e();
                if (pzfVar.b()) {
                    e.addAll((List) p8l.c.c.getValue());
                }
                if (pzfVar.a()) {
                    e.addAll((List) p8l.b.c.getValue());
                }
                e.addAll((List) p8l.a.c.getValue());
                return e.g();
            case 24:
                gzs<? extends n4p> gzsVar = ((k3g) this.c).m;
                if (gzsVar != null) {
                    return gzsVar.invoke();
                }
                return null;
            case 25:
                ((CommunitiesCatalogRootVh) this.c).I.invoke();
                return s3q0.a;
            case 26:
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = (CommunitiesSearchTopBarVh) this.c;
                ((zak0) communitiesSearchTopBarVh.m).setValue(CommunitiesTopBarSearchState.Expanded);
                ((zak0) communitiesSearchTopBarVh.j).setValue(Boolean.TRUE);
                return s3q0.a;
            case 27:
                return (VkText) ((uqg) this.c).findViewById(R.id.community_address_info_cell_distance);
            case 28:
                trg trgVar = (trg) this.c;
                trgVar.b.d(trgVar.e);
                return s3q0.a;
            default:
                return (DiscreteProgressBar) ((cxg) this.c).findViewById(R.id.progressBar);
        }
    }
}
