package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.libvideo.autoplay.b;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2d0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z2d0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        View view;
        boolean z;
        int i = this.b;
        xt0.a aVar = null;
        r1 = null;
        View view2 = null;
        aVar = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                a3d0 a3d0Var = (a3d0) obj;
                PostInteract postInteract = ((c3d0) obj3).d.l;
                if (postInteract != null && (str = postInteract.c) != null) {
                    AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_IMPRESSION_PRETTY_CARD;
                    int layoutPosition = a3d0Var.getLayoutPosition();
                    aVar = new xt0.a(adsintEventTypeDto, str2, str, layoutPosition < 0 ? xt0.c.b.a : new xt0.c.a(layoutPosition));
                }
                return aVar;
            case 1:
                Activity activity = (Activity) obj3;
                j0i j0iVar = (j0i) obj2;
                com.vk.profile.core.scheduled_clips.a aVar2 = (com.vk.profile.core.scheduled_clips.a) obj;
                ClipVideoFile clipVideoFile = j0iVar.a;
                if (clipVideoFile.c == 0) {
                    aVar2.a(CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER);
                } else {
                    fxc0.B().g0(activity, clipVideoFile, clipVideoFile.b, new lva0(aVar2, j0iVar), new fo20(aVar2, j0iVar));
                }
                return s3q0.a;
            case 2:
                ((SearchQueryValueHelper) obj3).c((String) obj2, (VkSearchView) obj);
                return s3q0.a;
            case 3:
                arl0 arl0Var = (arl0) obj3;
                RecyclerView recyclerView = (RecyclerView) obj2;
                UserId userId = (UserId) ((Ref$ObjectRef) obj).element;
                opl0 opl0Var = arl0Var.x;
                hmp0 hmp0Var = arl0Var.E;
                Set y0 = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP, MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT});
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                if (j5g.P(y0, uiTrackingScreen != null ? uiTrackingScreen.a : null)) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null) {
                        hmp0Var.a();
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        int v = linearLayoutManager.v();
                        int x = linearLayoutManager.x();
                        if (v == -1 || x == -1) {
                            hmp0Var.a();
                        } else {
                            arl0Var.D = null;
                            if (v <= x) {
                                while (true) {
                                    StoriesContainer storiesContainer = (StoriesContainer) opl0Var.c.c(x);
                                    if (storiesContainer != null) {
                                        if (Math.abs(storiesContainer.Ab().b) == Math.abs(userId.b) && !fsk.x(storiesContainer)) {
                                            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(x + (opl0Var.t ? 1 : 0));
                                            if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                                                view2 = view.findViewById(R.id.iv_story_image);
                                            }
                                            arl0Var.D = view2;
                                            hmp0Var.b();
                                        } else if (x != v) {
                                            x--;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return s3q0.a;
                }
                hmp0Var.a();
                return s3q0.a;
            case 4:
                lsq0 lsq0Var = (lsq0) obj3;
                String str3 = (String) obj;
                ?? r0 = lsq0Var.r0;
                if (((q7v0) r0.getValue()).e((String) obj2) == null) {
                    VkOnboardingCampaign e = ((q7v0) r0.getValue()).e(str3);
                    if (e == null) {
                        return s3q0.a;
                    }
                    if (((q7v0) r0.getValue()).d(e)) {
                        lsq0Var.d0.x6(e);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 5:
                VideoItemListSmallVh videoItemListSmallVh = (VideoItemListSmallVh) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                UIBlockVideo uIBlockVideo = (UIBlockVideo) obj;
                Object obj4 = VideoItemListSmallVh.c0;
                StringBuilder sb = new StringBuilder();
                if (!videoItemListSmallVh.k(videoFile)) {
                    gpt0 gpt0Var = gpt0.a;
                    sb.append((CharSequence) z8s.e(videoFile.L8(), videoItemListSmallVh.e()));
                }
                gpt0 gpt0Var2 = gpt0.a;
                if (gpt0.j(videoFile) == 0) {
                    if ((videoItemListSmallVh.x ? videoItemListSmallVh.h(videoFile) : videoFile.k1()) <= 0) {
                        z = true;
                        if (!z) {
                            if (!drm0.N(sb)) {
                                sb.append(" · ");
                            }
                            sb.append(videoItemListSmallVh.g(uIBlockVideo));
                        }
                        return sb.toString();
                    }
                }
                z = false;
                if (!z) {
                }
                return sb.toString();
            default:
                kzv0 kzv0Var = (kzv0) obj3;
                Context context = (Context) obj2;
                VideoFile videoFile2 = (VideoFile) obj;
                ezs0 ezs0Var = kzv0Var.j;
                if (!ezs0Var.y()) {
                    return s3q0.a;
                }
                dhr0.a.getClass();
                Context E = dhr0.E();
                io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
                ikv0.d dVar = new ikv0.d(context.getString(R.string.video_download_description_redesign), (String) null, (ikv0.d.a) null, 6);
                mzv0 mzv0Var = new mzv0(dVar, context, bVar, kzv0Var);
                ezs0Var.t(mzv0Var);
                ikv0.a aVar3 = new ikv0.a(E);
                aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_download_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar3.u = dVar;
                aVar3.e = -1L;
                pkv0.e(aVar3);
                aVar3.g = new fqd(18, kzv0Var, context);
                aVar3.h = new ue40(12, kzv0Var, mzv0Var);
                ikv0 f = pkv0.f(aVar3);
                if (f != null) {
                    pkv0.a(f, bVar);
                }
                mzv0Var.kg(ezs0Var.u());
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e2 = b.C1208b.a().e(videoFile2, null);
                if (e2.m0() == null) {
                    yg5.o0(e2, null, null, null, false, 15);
                }
                rlt0 m0 = e2.m0();
                if (m0 != null) {
                    m0.i("download", null);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ z2d0(swf0 swf0Var, Activity activity, j0i j0iVar, com.vk.profile.core.scheduled_clips.a aVar) {
        this.b = 1;
        this.c = activity;
        this.d = j0iVar;
        this.e = aVar;
    }
}
