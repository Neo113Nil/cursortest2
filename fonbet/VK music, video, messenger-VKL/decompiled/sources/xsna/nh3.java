package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.datasource.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.catalog.mvi.block.video.impl.movies.detail.description.a;
import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenArguments;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.catalog2.feature.music.holders.view.a;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.design.demo.presentation.nav.ScreenKey;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.qrcode.QRStatsTracker;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.d;
import xsna.dt70;
import xsna.e0f;
import xsna.ig3;
import xsna.o0r0;
import xsna.sst0;
import xsna.sx40;
import xsna.us70;
import xsna.ux70;
import xsna.vfg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nh3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nh3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0261, code lost:
    
        if (r0.f() != false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ProfilesInfo profilesInfo;
        RecyclerView.Adapter adapter;
        sos0 Z7;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((rh3) this.c).C(new ig3.k.f((Photo) this.d));
                return s3q0.a;
            case 1:
                ew8.G((List) ((Ref$ObjectRef) this.c).element, (io.reactivex.rxjava3.core.y) this.d);
                return s3q0.a;
            case 2:
                com.vk.catalog2.feature.music.holders.view.a aVar = (com.vk.catalog2.feature.music.holders.view.a) this.c;
                CatalogErrorViewWithImage catalogErrorViewWithImage = (CatalogErrorViewWithImage) this.d;
                int i = CatalogErrorViewWithImage.j;
                izs<Context, s3q0> izsVar = ((a.C0522a) aVar).a;
                if (izsVar != null) {
                    izsVar.invoke(catalogErrorViewWithImage.c.getContext());
                }
                return s3q0.a;
            case 3:
                gzs gzsVar = (gzs) this.c;
                CatalogSectionScreenArguments catalogSectionScreenArguments = (CatalogSectionScreenArguments) this.d;
                CatalogSectionScreenState catalogSectionScreenState = (CatalogSectionScreenState) gzsVar.invoke();
                return catalogSectionScreenState == null ? new CatalogSectionScreenState(null, catalogSectionScreenArguments.b, null, null, null, 29, null) : catalogSectionScreenState;
            case 4:
                x4b x4bVar = (x4b) this.c;
                w2w w2wVar = (w2w) this.d;
                long j = x4bVar.b.b;
                xgl0 I0 = w2wVar.I0();
                return Integer.valueOf(ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j());
            case 5:
                ymb ymbVar = (ymb) this.c;
                ProfilesInfo profilesInfo2 = (ProfilesInfo) this.d;
                DialogExt dialogExt = ymbVar.i;
                if (dialogExt != null && (profilesInfo = dialogExt.b) != null) {
                    profilesInfo.Hb(profilesInfo2);
                }
                return s3q0.a;
            case 6:
                ((u7e) this.c).b.c.a((RecyclerView.e0) this.d);
                return s3q0.a;
            case 7:
                e0f.a.J7((ImageView) ((e0f.a) this.c).s0.getValue(), ((VideoAttachment) this.d).k);
                return s3q0.a;
            case 8:
                mdg mdgVar = (mdg) this.c;
                iag iagVar = (iag) this.d;
                io.reactivex.rxjava3.core.q<VKList<UserProfile>> a = new com.vk.newsfeed.impl.helpers.a().a(fkq0.e(mdgVar.i), iagVar.getUid(), true);
                ?? r2 = mdgVar.e;
                int i2 = 8;
                r2.a(hg1.m(a, r2.getContext(), 0L, false, 62).subscribe(new om1(new m9(i2, mdgVar, iagVar), i2), new pm1(new o9(12, mdgVar, iagVar), 10)));
                return s3q0.a;
            case 9:
                ((avh) this.c).t6((sst0.b) this.d);
                return s3q0.a;
            case 10:
                ((com.vk.clips.sdk.shared.item.common.description.b) this.c).c.g((com.vk.clips.sdk.shared.item.common.description.c) this.d);
                return s3q0.a;
            case 11:
                y9n y9nVar = (y9n) this.c;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) this.d;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = y9nVar.H;
                if (nonBouncedAppBarLayout != null) {
                    if (!y9nVar.T0()) {
                        RecyclerView recyclerView = vkRecyclerPaginatedView.getRecyclerView();
                        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                int itemCount = adapter.getItemCount();
                                int childCount = linearLayoutManager.getChildCount();
                                if (itemCount == childCount) {
                                    Object[] objArr = linearLayoutManager.s() == 0;
                                    View childAt = linearLayoutManager.getChildAt(childCount - 1);
                                    if (childAt != null) {
                                        Rect rect = new Rect();
                                        childAt.getGlobalVisibleRect(rect);
                                        Object[] objArr2 = rect.height() == childAt.getHeight();
                                        if (objArr != false) {
                                            if (objArr2 != false) {
                                                NonBouncedAppBarLayout nonBouncedAppBarLayout2 = y9nVar.H;
                                                if (nonBouncedAppBarLayout2 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        nonBouncedAppBarLayout.setExpandingBlocked(z);
                    }
                    z = true;
                    nonBouncedAppBarLayout.setExpandingBlocked(z);
                }
                return s3q0.a;
            case 12:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50Var.setValue(Boolean.FALSE);
                wh50Var2.setValue(Boolean.TRUE);
                return s3q0.a;
            case 13:
                ((qmu) this.c).q6((Group) this.d, true);
                return s3q0.a;
            case 14:
                d.a aVar2 = (d.a) this.c;
                mjp0 mjp0Var = (mjp0) this.d;
                ux70.a aVar3 = new ux70.a(aVar2);
                o260 o260Var = d260.a;
                aVar3.c = (o260Var != null ? o260Var : null).l.a();
                aVar3.d = mjp0Var;
                return new g.a(aVar3, new y9v());
            case 15:
                h5x h5xVar = (h5x) this.c;
                atm0 atm0Var = (atm0) this.d;
                h5xVar.setCurrentStyleConfig(atm0Var);
                izs<atm0, s3q0> onChangeStyleConfig = h5xVar.getOnChangeStyleConfig();
                if (onChangeStyleConfig != null) {
                    onChangeStyleConfig.invoke(atm0Var);
                }
                return s3q0.a;
            case 16:
                ((izs) this.c).invoke((ScreenKey) this.d);
                return s3q0.a;
            case 17:
                ((wk20) this.c).a.invoke(((MethodSelectorCodeState.MaxOtpCode) this.d).f);
                return s3q0.a;
            case 18:
                ((izs) this.c).invoke(new a.C0460a(((md30) this.d).b));
                return s3q0.a;
            case 19:
                yn40 yn40Var = (yn40) this.c;
                fo40 fo40Var = (fo40) this.d;
                utk0 utk0Var = yn40Var.p;
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                utk0Var.getClass();
                utk0Var.i(null, valueOf);
                yn40Var.x = false;
                yn40Var.z = SystemClock.uptimeMillis();
                utk0 utk0Var2 = yn40Var.r;
                bo40 bo40Var = fo40Var.c;
                oo40 oo40Var = new oo40(bo40Var, bo40Var, ao40.e, fo40Var.d, do40.d, fo40Var.e, 500L, (izs) null, 384);
                utk0Var2.getClass();
                utk0Var2.i(null, oo40Var);
                return s3q0.a;
            case 20:
                ((izs) this.c).invoke(new us70.d(((dt70.a) this.d).a));
                return s3q0.a;
            case 21:
                PaginatedGridListVh paginatedGridListVh = (PaginatedGridListVh) this.c;
                CatalogConfiguration catalogConfiguration = (CatalogConfiguration) this.d;
                VideoGrowthComponent videoGrowthComponent = paginatedGridListVh.w;
                if (videoGrowthComponent != null && (Z7 = videoGrowthComponent.Z7()) != null) {
                    Z7.e(CommunityGrowthTrapScreen.VIDEO_GROUP_MAIN, CommunityGrowthTrapEvent.BOTTOM_BANNER);
                }
                VideoPipStateHolder videoPipStateHolder = VideoPipStateHolder.a;
                VideoGrowthComponent videoGrowthComponent2 = paginatedGridListVh.w;
                long j2 = catalogConfiguration.q().b;
                RecyclerPaginatedView recyclerPaginatedView = paginatedGridListVh.n;
                q3t0.a(videoPipStateHolder, videoGrowthComponent2, j2, (recyclerPaginatedView != null ? recyclerPaginatedView : null).getContext(), VideoGrowthCommunitySource.SUPERAPP_BUTTON);
                return s3q0.a;
            case 22:
                izs izsVar2 = (izs) this.c;
                xia0 xia0Var = (xia0) this.d;
                if (izsVar2 != null) {
                    izsVar2.invoke(xia0Var.k);
                }
                return s3q0.a;
            case 23:
                ((b8b0) this.c).p.invoke((Playlist) this.d);
                return s3q0.a;
            case 24:
                ((bob0) this.c).b(!((yrb0) this.d).e);
                return s3q0.a;
            case 25:
                xwk.e().m((Activity) this.c, ((Post) this.d).o.b, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK_FROM_AVATAR);
                return s3q0.a;
            case 26:
                View view = (View) this.c;
                izs izsVar3 = (izs) this.d;
                cl40.a(view, MusicHapticEvent.LIGHT);
                izsVar3.invoke(new sx40.t(PlayerContext.FULL, null));
                return s3q0.a;
            case 27:
                ogs0 ogs0Var = (ogs0) this.c;
                vfg0 vfg0Var = (vfg0) this.d;
                ogs0Var.invoke(vfg0.a.C3887a.a);
                if (vfg0Var.d.k.b()) {
                    vfg0Var.c.t();
                }
                return s3q0.a;
            case 28:
                znj0 znj0Var = (znj0) this.c;
                gzs<s3q0> gzsVar2 = (gzs) this.d;
                HorizontalRecyclerPaginationView a2 = znj0Var.h().a();
                if (a2 != null) {
                    a2.setOnLoadNextRetryClickListener(gzsVar2);
                }
                return s3q0.a;
            default:
                StoryEditorComponentImpl storyEditorComponentImpl = (StoryEditorComponentImpl) this.c;
                StoryEditorExtDepsComponent storyEditorExtDepsComponent = (StoryEditorExtDepsComponent) this.d;
                qcy<Object>[] qcyVarArr = StoryEditorComponentImpl.h;
                nwy nwyVar = storyEditorComponentImpl.a;
                qcy<Object>[] qcyVarArr2 = StoryEditorComponentImpl.h;
                qcy<Object> qcyVar = qcyVarArr2[0];
                bam0 bam0Var = new bam0(((gpj0) nwyVar.c()).getUid());
                qcy<Object> qcyVar2 = qcyVarArr2[0];
                return new l9m0(bam0Var, (gpj0) nwyVar.c(), storyEditorExtDepsComponent.K2());
        }
    }

    public /* synthetic */ nh3(ew8 ew8Var, Ref$ObjectRef ref$ObjectRef, io.reactivex.rxjava3.core.y yVar) {
        this.b = 1;
        this.c = ref$ObjectRef;
        this.d = yVar;
    }
}
