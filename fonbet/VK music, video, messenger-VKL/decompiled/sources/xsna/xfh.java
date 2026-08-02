package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.g8d;
import xsna.gko;

/* compiled from: CommunityProfileContentClipsAdapter.kt */
/* loaded from: classes5.dex */
public final class xfh extends zoj0<VideoFile, a> {
    public static final int h = iah0.a(98);
    public final f8d e;
    public final UserId f;
    public final jd4 g;

    /* compiled from: CommunityProfileContentClipsAdapter.kt */
    public static final class a extends vif0<VideoFile> {
        public static final /* synthetic */ int x = 0;
        public final View n;
        public final UserId o;
        public final f8d p;
        public final wzs<VideoFile, View, s3q0> q;
        public final ClipRectanglePreview r;
        public final VideoOverlayView s;
        public final Object t;
        public final Object u;
        public final Object v;
        public final yfh w;

        /* compiled from: CommunityProfileContentClipsAdapter.kt */
        @vby
        /* renamed from: xsna.xfh$a$a, reason: collision with other inner class name */
        public static final class C4000a implements rzt0 {
            public final String a;

            public /* synthetic */ C4000a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C4000a) {
                    return epx.f(this.a, ((C4000a) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return air.b(')', "ClipPreviewParams(imageUrl=", this.a);
            }
        }

        public a(View view, UserId userId, f8d f8dVar, jd4 jd4Var) {
            super(view);
            this.n = view;
            this.o = userId;
            this.p = f8dVar;
            this.q = jd4Var;
            ClipRectanglePreview clipRectanglePreview = (ClipRectanglePreview) view.findViewById(R.id.community_profile_clip_rectangle_preview);
            this.r = clipRectanglePreview;
            this.s = (VideoOverlayView) view.findViewById(R.id.community_profile_item_clip_overlay_restriction);
            com.vk.movika.sdk.base.ui.g0 g0Var = new com.vk.movika.sdk.base.ui.g0(18);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.t = msy.a(lazyThreadSafetyMode, g0Var);
            this.u = msy.a(lazyThreadSafetyMode, new iy2(14));
            this.v = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.g(10));
            this.w = new yfh(this);
            clipRectanglePreview.setBackgroundContentControllerFactory(new ai3(this, 15));
        }

        public static ClipRectanglePreview.PreviewItem.Icon q6() {
            return new ClipRectanglePreview.PreviewItem.Icon(new gko(R.drawable.vk_icon_lock_12), new x7g(R.attr.vk_ui_icon_contrast), null, 58);
        }

        /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vif0
        public final void i6(VideoFile videoFile) {
            int intValue;
            String h6;
            ClipRectanglePreview.PreviewItem.Icon q6;
            String a;
            VideoFile videoFile2 = videoFile;
            Image image = videoFile2.getImage();
            int width = this.itemView.getWidth();
            Integer valueOf = Integer.valueOf(width);
            if (width <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else {
                Object parent = this.itemView.getParent();
                Integer valueOf2 = (parent instanceof View ? (View) parent : null) != null ? Integer.valueOf((int) (r4.getHeight() * 0.56d)) : null;
                intValue = valueOf2 != null ? valueOf2.intValue() : xfh.h;
            }
            ImageSize Cb = image.Cb(intValue, true, false);
            ClipRectanglePreview.PreviewItem.a aVar = new ClipRectanglePreview.PreviewItem.a(new C4000a(Cb != null ? Cb.d.d : null));
            ClipRectanglePreview clipRectanglePreview = this.r;
            clipRectanglePreview.setBackgroundContent(aVar);
            String type = videoFile2.getType();
            boolean f = epx.f(type, "tab_collection_scheduled_dummy");
            yfh yfhVar = this.w;
            String str = "";
            if (f || epx.f(type, "tab_collection_draft_dummy")) {
                clipRectanglePreview.setEnableDimmingOverlay(true);
                String type2 = videoFile2.getType();
                Integer valueOf3 = epx.f(type2, "tab_collection_draft_dummy") ? Integer.valueOf(R.drawable.vk_icon_pen_stack_outline_28) : epx.f(type2, "tab_collection_scheduled_dummy") ? Integer.valueOf(R.drawable.vk_icon_clock_outline_28) : null;
                String type3 = videoFile2.getType();
                Integer valueOf4 = epx.f(type3, "tab_collection_draft_dummy") ? Integer.valueOf(R.string.community_profile_drafts_clips_entry_point_title) : epx.f(type3, "tab_collection_scheduled_dummy") ? Integer.valueOf(R.string.community_profile_scheduled_clips_entry_point_title) : null;
                if (valueOf4 != null && (h6 = h6(valueOf4.intValue(), videoFile2.getTitle())) != null) {
                    str = h6;
                }
                clipRectanglePreview.setEndTopIcon(null);
                clipRectanglePreview.setPrimaryLabel(new ClipRectanglePreview.PreviewItem.b(oq.d(tlo0.Companion, str), 1, new x7g(R.attr.vk_ui_text_contrast), null, null, 248));
                clipRectanglePreview.setSecondaryLabel(null);
                if (valueOf3 != null) {
                    gko gkoVar = new gko(valueOf3.intValue());
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                    clipRectanglePreview.setMainIcon(new ClipRectanglePreview.PreviewItem.Icon(gkoVar, new x7g(R.attr.vk_ui_icon_contrast), ClipRectanglePreview.PreviewItem.Icon.Mode.ICON_BIG, 40));
                    yfhVar.b.setContentDescription(str);
                    return;
                }
                return;
            }
            clipRectanglePreview.setEnableDimmingOverlay(false);
            clipRectanglePreview.setPrimaryLabel(null);
            clipRectanglePreview.setMainIcon(null);
            boolean z = o25.a().a(videoFile2.I0()) && g620.f().getPrivacy().d(videoFile2);
            f8d f8dVar = this.p;
            k930 a2 = f8dVar != null ? f8dVar.a(new g8d(new g8d.a.b(this.o), "", qxm0.b, null)) : null;
            if (a2 != null) {
                gko.b bVar = gko.Companion;
                q6 = new ClipRectanglePreview.PreviewItem.Icon(new gko(R.drawable.vk_icon_more_horizontal_20), ImageView.ScaleType.CENTER, new x7g(R.attr.vk_ui_icon_contrast), tq.h(tlo0.Companion, R.string.menu), ClipRectanglePreview.PreviewItem.Icon.Mode.ICON_BUTTON, new k14(a2, videoFile2, this, 4));
            } else {
                q6 = z ? q6() : null;
            }
            clipRectanglePreview.setEndTopIcon(q6);
            clipRectanglePreview.setStartTopIcon((!z || a2 == null) ? null : q6());
            int L8 = videoFile2.L8();
            clipRectanglePreview.setSecondaryLabel(new ClipRectanglePreview.PreviewItem.b(oq.d(tlo0.Companion, uqm0.l(L8)), 1, new x7g(R.attr.vk_ui_text_contrast), new gko(R.drawable.vk_icon_view_12), new x7g(R.attr.vk_ui_icon_contrast), 224));
            String f2 = enj.f(R.plurals.accessibility_clip_views, L8, this.itemView.getContext());
            String string = this.itemView.getContext().getString(R.string.accessibility_clip_label);
            if (z) {
                StringBuilder b = v1v.b(string, ' ');
                b.append(this.itemView.getContext().getString(R.string.accessibility_clip_privacy));
                b.append(' ');
                b.append(f2);
                a = b.toString();
            } else {
                a = v1v.a(' ', string, f2);
            }
            yfhVar.b.setContentDescription(a);
            boolean z2 = videoFile2.O() != null;
            VideoOverlayView videoOverlayView = this.s;
            awt0.v(videoOverlayView, z2);
            if (videoFile2.O() != null) {
                videoOverlayView.Y4(new xx0(18));
                VideoRestriction O = videoFile2.O();
                if (O != null) {
                    videoOverlayView.Z4((i1t0) this.t.getValue(), new VideoOverlayView.c.f(((a390) this.u.getValue()).a(O), ((s290) this.v.getValue()).a(videoFile2.w2()), null));
                }
                videoOverlayView.setVisibility(0);
            }
        }
    }

    /* compiled from: CommunityProfileContentClipsAdapter.kt */
    public static final class b extends m.e<VideoFile> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(VideoFile videoFile, VideoFile videoFile2) {
            return videoFile.equals(videoFile2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(VideoFile videoFile, VideoFile videoFile2) {
            return videoFile.o0() == videoFile2.o0();
        }
    }

    public xfh(f8d f8dVar, UserId userId, jd4 jd4Var) {
        super(new com.vk.lists.a(new b()));
        this.e = f8dVar;
        this.f = userId;
        this.g = jd4Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(tf3.b(viewGroup, R.layout.community_item_content_clip_item, viewGroup, false), this.f, this.e, this.g);
    }
}
