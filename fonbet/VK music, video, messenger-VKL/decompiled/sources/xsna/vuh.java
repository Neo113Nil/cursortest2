package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.community.design.view.donut.teaser.DonutTeaserView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.DonutAnalytics;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;
import xsna.sst0;
import xsna.tlh;

/* compiled from: CommunityProfileVideoItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class vuh extends vif0<sst0.b> {
    public final VkImageSimple A;
    public final VkImageSimple B;
    public final DonutTeaserView C;
    public final VkImageSimple D;
    public final Object E;
    public final Object F;
    public final io.reactivex.rxjava3.disposables.g G;
    public final qwe n;
    public final suh o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final VkImage u;
    public final VideoOverlayView v;
    public final VkText w;
    public final InteractiveDurationView x;
    public final VkText y;
    public final VkText z;

    public vuh(ViewGroup viewGroup, qwe qweVar, tlh.k kVar) {
        super(s3j0.b(viewGroup, R.layout.community_item_content_video_item, viewGroup, false));
        this.n = qweVar;
        this.o = kVar;
        yv2 yv2Var = new yv2(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = msy.a(lazyThreadSafetyMode, yv2Var);
        this.q = msy.a(lazyThreadSafetyMode, new bv0(10));
        this.r = msy.a(lazyThreadSafetyMode, new cj4(12));
        this.s = msy.a(lazyThreadSafetyMode, new tj2(8));
        this.t = msy.a(lazyThreadSafetyMode, new nd1(10));
        this.u = (VkImage) this.itemView.findViewById(R.id.community_profile_video_item_iv_preview);
        this.v = (VideoOverlayView) this.itemView.findViewById(R.id.community_profile_video_item_vov_overlay);
        this.w = (VkText) this.itemView.findViewById(R.id.community_profile_video_item_tv_length);
        this.x = (InteractiveDurationView) this.itemView.findViewById(R.id.community_profile_video_item_interactive_length);
        this.y = (VkText) this.itemView.findViewById(R.id.community_profile_video_item_tv_title);
        this.z = (VkText) this.itemView.findViewById(R.id.community_profile_video_item_tv_subtitle);
        this.A = (VkImageSimple) this.itemView.findViewById(R.id.community_profile_video_item_iv_menu);
        this.B = (VkImageSimple) this.itemView.findViewById(R.id.community_profile_video_item_iv_privacy);
        this.C = (DonutTeaserView) this.itemView.findViewById(R.id.community_profile_donut_teaser);
        VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.community_profile_video_item_footer_icon);
        this.D = vkImageSimple;
        int i = 9;
        this.E = msy.a(lazyThreadSafetyMode, new sje(this, i));
        this.F = msy.a(lazyThreadSafetyMode, new nh(i));
        bwt0.i0(this.itemView, new zt4(this, 23));
        bwt0.i0(vkImageSimple, new t1e(this, 9));
        this.G = new io.reactivex.rxjava3.disposables.g();
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(sst0.b bVar) {
        UserId userId;
        DonutTeaserView.a c0724a;
        ImageSize Cb;
        sst0.b bVar2 = bVar;
        ucp ucpVar = ucp.a;
        VideoFile videoFile = bVar2.a;
        this.y.setText(ucp.i(videoFile.getTitle()));
        boolean W9 = videoFile.W9();
        VkText vkText = this.w;
        awt0.v(vkText, !W9);
        InteractiveDurationView interactiveDurationView = this.x;
        awt0.v(interactiveDurationView, W9);
        if (W9) {
            interactiveDurationView.setDurationText(gpt0.m(this.itemView.getContext(), videoFile, true, false));
        } else {
            vkText.setText(gpt0.m(this.itemView.getContext(), videoFile, true, false));
        }
        StringBuilder sb = new StringBuilder();
        gpt0 gpt0Var = gpt0.a;
        sb.append((CharSequence) gpt0.k(this.itemView.getContext(), videoFile));
        sb.append((CharSequence) rik0.a);
        Context context = this.itemView.getContext();
        sb.append((CharSequence) (uqm0.g(videoFile.L8()) ? context.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()))));
        this.z.setText(sb.toString());
        VideoFile videoFile2 = bVar2.a;
        Owner s = videoFile2.s();
        if (s == null || (userId = s.b) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        UiTracker uiTracker = UiTracker.a;
        s6s0 s6s0Var = new s6s0(videoFile2, "videos_group", userId2, null, false, null, false, false, false, null, null, null, UiTracker.c().name(), false, null, false, null, false, null, null, null, false, 536608752);
        boolean z = !fxc0.B().c(videoFile) && fxc0.B().f0(s6s0Var);
        VkImageSimple vkImageSimple = this.A;
        bwt0.p0(vkImageSimple, z);
        bwt0.i0(vkImageSimple, new qb6(9, this, s6s0Var));
        sst0.b.c cVar = bVar2.b;
        DonutTeaserView donutTeaserView = this.C;
        VkImage vkImage = this.u;
        if (cVar != null) {
            f4m.j(vkImage);
            f4m.j(this.v);
            f4m.j(vkText);
            donutTeaserView.setVisibility(0);
            Image image = cVar.b;
            String str = cVar.a;
            donutTeaserView.setCover(new DonutTeaserView.b.a((image == null || (Cb = image.Cb(ImageScreenSize.SMALL.h(), true, false)) == null) ? null : Cb.d.d, (jtc0) this.F.getValue()));
            sst0.b.a aVar = cVar.c;
            if (aVar != null) {
                DonutPriceTemplate donutPriceTemplate = aVar.b;
                c0724a = new DonutTeaserView.a.b(str, donutPriceTemplate != null ? y1o.b(donutPriceTemplate, this.itemView.getContext()) : aVar.a, new ncg(this, 7));
            } else {
                c0724a = new DonutTeaserView.a.C0724a(str);
            }
            donutTeaserView.setContent(c0724a);
        } else {
            f4m.j(donutTeaserView);
            vkImage.setVisibility(0);
            vkText.setVisibility(0);
            iso0 s2 = com.vk.toggle.d.s();
            String F5 = videoFile.F5();
            CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
            coreFeatures.getClass();
            String b = s2.b(F5, com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d);
            if (b != null) {
                vkImage.setThumbHash(b);
            }
            bwt0.S(vkImage, new bi0(10, this, videoFile));
        }
        sst0.b.d dVar = bVar2.d;
        boolean z2 = dVar != null;
        VkImageSimple vkImageSimple2 = this.D;
        awt0.v(vkImageSimple2, z2);
        if (dVar != null) {
            Context context2 = this.itemView.getContext();
            e3m.a aVar2 = e3m.a;
            vkImageSimple2.setImageDrawable(m33.a(R.drawable.vk_icon_donut_color_16, context2));
            vkImageSimple2.setContentDescription(dVar.a);
        }
        awt0.v(this.B, this.n.m(videoFile));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        sst0.b.c cVar;
        sst0.b.a aVar;
        String str;
        UserId userId;
        sst0.b bVar = (sst0.b) this.m;
        if (bVar == null || (cVar = bVar.b) == null || (aVar = cVar.c) == null || (str = aVar.c) == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        String b = DonutAnalytics.b(str, UiTracker.d());
        Owner s = ((sst0.b) this.m).a.s();
        if (s == null || (userId = s.b) == null) {
            userId = UserId.d;
        }
        DonutAnalytics.d(userId, UiTracker.c(), ((sst0.b) this.m).a.o0());
        this.o.a(b);
    }
}
