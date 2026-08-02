package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.payload.VideoRelatedVideoItemChangePayload;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.e6s0;
import xsna.eqs0;
import xsna.w6s0;

/* compiled from: VideoRelatedVideoViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class pbt0 extends p1u0<mbt0> {
    public final b25 a;
    public final DonutVideoComponent b;
    public final b8j0 c;
    public final e9i0 d;
    public final exi0 e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* compiled from: VideoRelatedVideoViewTypeDelegate.kt */
    public final class a extends vfz<mbt0> {
        public final ImageView A;
        public final ift0 B;
        public io.reactivex.rxjava3.disposables.c C;
        public final boolean D;
        public final boolean E;
        public final ckc F;
        public yg5 l;
        public final wz4 m;
        public mbt0 n;
        public final TextView o;
        public final TextView p;
        public final TextView q;
        public final VKImageView r;
        public final VideoOverlayView s;
        public final DurationView t;
        public final InteractiveDurationView u;
        public final ImageView v;
        public final ImageView w;
        public final ImageView x;
        public final VKImageView y;
        public final ProgressBar z;

        /* compiled from: VideoRelatedVideoViewTypeDelegate.kt */
        /* renamed from: xsna.pbt0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3502a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoRelatedVideoItemChangePayload.values().length];
                try {
                    iArr[VideoRelatedVideoItemChangePayload.IsCurrent.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(ViewGroup viewGroup) {
            super(R.layout.video_related_video_item, viewGroup);
            wz4 wz4Var = new wz4(this.itemView.getContext());
            wz4Var.b.setColor(-1);
            this.m = wz4Var;
            this.o = (TextView) this.itemView.findViewById(R.id.title);
            this.p = (TextView) this.itemView.findViewById(R.id.subtitle_date);
            this.q = (TextView) this.itemView.findViewById(R.id.subtitle_views);
            this.r = (VKImageView) this.itemView.findViewById(R.id.preview);
            this.s = (VideoOverlayView) this.itemView.findViewById(R.id.overlay_view);
            this.t = (DurationView) this.itemView.findViewById(R.id.duration);
            this.u = (InteractiveDurationView) this.itemView.findViewById(R.id.interactive_duration);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.playback_visualization);
            this.v = imageView;
            this.w = (ImageView) hvt0.a(R.id.more_actions, this.itemView, new obt0(0, this, pbt0.this));
            this.x = (ImageView) this.itemView.findViewById(R.id.live_badge);
            this.y = (VKImageView) this.itemView.findViewById(R.id.privacy_icon);
            ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.progress);
            this.z = progressBar;
            this.A = (ImageView) this.itemView.findViewById(R.id.icon_verify);
            this.B = new ift0();
            this.D = fxc0.B().J().F1();
            this.E = bo.h();
            this.F = new ckc(6, this, pbt0.this);
            this.itemView.setOnClickListener(new dkc(2, this, pbt0.this));
            bwt0.d(progressBar, iah0.a(14.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            imageView.setImageDrawable(wz4Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x0344, code lost:
        
            if (xsna.gpt0.C(r6) != false) goto L130;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v21, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v32 */
        /* JADX WARN: Type inference failed for: r11v33, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v37 */
        /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r20v10 */
        /* JADX WARN: Type inference failed for: r20v2, types: [kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r20v8 */
        /* JADX WARN: Type inference failed for: r20v9 */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v56 */
        /* JADX WARN: Type inference failed for: r3v57, types: [android.widget.TextView, com.vk.libvideo.design.view.info.VideoInfoTextView] */
        /* JADX WARN: Type inference failed for: r3v62 */
        /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: h6, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(mbt0 mbt0Var) {
            ?? r20;
            VideoRestriction videoRestriction;
            boolean z;
            boolean z2;
            boolean a;
            VideoRestriction O;
            int i;
            CharSequence charSequence;
            fqs0 fqs0Var;
            Object obj;
            ListBuilder a2;
            azn a3;
            CharSequence P;
            VideoFile A;
            pbt0 pbt0Var = pbt0.this;
            Object obj2 = pbt0Var.k;
            this.n = mbt0Var;
            i6(mbt0Var);
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            com.vk.libvideo.autoplay.b a4 = b.C1208b.a();
            VideoFile videoFile = mbt0Var.b;
            yg5 e = a4.e(videoFile, null);
            this.l = e;
            int max = (e == null || e.getDuration() == 0) ? 0 : Math.max(an10.b(Math.min((com.vk.libvideo.autoplay.j.b(e.A()) / e.getDuration()) * 100, 100.0f)), 0);
            boolean z3 = max > 0 && videoFile.O() == null;
            ProgressBar progressBar = this.z;
            bwt0.p0(progressBar, z3);
            progressBar.setProgress(max);
            bpn0 bpn0Var2 = VideoOverlayView.I;
            boolean c = fxc0.B().c(videoFile);
            VideoRestriction O2 = videoFile.O();
            com.vk.libvideo.design.view.overlay.b a5 = O2 != null ? ((a390) pbt0Var.h.getValue()).a(O2) : null;
            boolean z4 = videoFile.d8() || videoFile.z0();
            VideoPipStateHolder.a.getClass();
            yg5 c2 = VideoPipStateHolder.c();
            VideoOverlayView.b.a(new VideoOverlayView.a(this.r, this.s, new com.vk.movika.sdk.base.flow.binding.l(26, this, mbt0Var), new cim0(this, 11), this.t, false, false, c, new wcs0(mbt0Var, 4), new com.vk.movika.sdk.base.ui.k(26, pbt0Var, mbt0Var), a5, z4, epx.f((c2 == null || (A = c2.A()) == null) ? null : A.a1(), videoFile.a1()), new qjo0(pbt0Var, 10), (i1t0) pbt0Var.l.getValue(), new hmj0(7, pbt0Var, mbt0Var), 224));
            String g = gpt0.g(this.itemView.getContext(), videoFile);
            VKImageView vKImageView = this.r;
            vKImageView.setContentDescription(g);
            boolean z5 = this.E;
            VKImageView vKImageView2 = this.y;
            if (z5) {
                PrivacySetting.PrivacyRule privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(videoFile.getPrivacy());
                List<String> zb = privacyRule != null ? privacyRule.zb() : null;
                Integer valueOf = (zb == null || zb.equals(Collections.singletonList(PrivacyRules.a.d))) ? null : (zb.equals(Collections.singletonList(PrivacyRules.b.d)) || zb.equals(Collections.singletonList(PrivacyRules.c.d))) ? Integer.valueOf(R.drawable.vk_icon_lock_16) : zb.equals(Collections.singletonList(PrivacyRules.e.d)) ? Integer.valueOf(R.drawable.vk_icon_linked_16) : zb.equals(Collections.singletonList(PrivacyRules.f.d)) ? Integer.valueOf(R.drawable.vk_icon_donut_outline_16) : zb.equals(Collections.singletonList(PrivacyRules.g.d)) ? Integer.valueOf(R.drawable.vk_icon_user_16) : Integer.valueOf(R.drawable.vk_icon_users_16);
                VideoRestriction O3 = videoFile.O();
                bwt0.p0(vKImageView2, valueOf != null && (O3 == null || O3.d));
                if (bwt0.K(vKImageView2)) {
                    vKImageView2.setContentDescription(((PrivacySetting.PrivacyRule) j5g.Y(videoFile.getPrivacy())).Ab());
                    if (valueOf == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    vKImageView2.setImageResource(valueOf.intValue());
                }
            } else {
                boolean z6 = videoFile.getPrivacy().isEmpty() || Collections.singletonList(PrivacyRules.a.d).equals(videoFile.getPrivacy().get(0).zb());
                vKImageView2.setImageResource(R.drawable.vk_icon_lock_16);
                bwt0.p0(vKImageView2, !z6);
            }
            boolean z7 = videoFile instanceof MusicVideoFile;
            TextView textView = this.o;
            if (z7) {
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                bu00.q(textView, s490.d(this.itemView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary));
            } else {
                bu00.q(textView, videoFile.getTitle());
            }
            boolean z8 = this.D;
            TextView textView2 = this.q;
            if (z8) {
                bwt0.p0(textView2, myc0.f(videoFile.P()));
                if (!bwt0.K(textView2) || z7) {
                    f4m.j(this.A);
                } else {
                    VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                    VerifyInfoHelper.k(this.A, false, videoFile.Y(), true, false, 48);
                }
                if (z7) {
                    MusicVideoFile musicVideoFile2 = (MusicVideoFile) videoFile;
                    P = s490.d(this.itemView.getContext(), s490.i(musicVideoFile2.B1), s490.c(musicVideoFile2.C1), R.attr.vk_ui_text_secondary);
                } else {
                    P = videoFile.P();
                }
                textView2.setText(P);
            } else if (z7) {
                bwt0.p0(textView2, true);
                MusicVideoFile musicVideoFile3 = (MusicVideoFile) videoFile;
                textView2.setText(s490.d(this.itemView.getContext(), s490.i(musicVideoFile3.B1), s490.c(musicVideoFile3.C1), R.attr.vk_ui_text_secondary));
            } else {
                bwt0.p0(textView2, true);
                textView2.setVisibility((fxc0.B().c(videoFile) && videoFile.L8() == 0) ? 8 : 0);
                textView2.setText(this.B.b(this.itemView.getContext(), videoFile).toString());
            }
            TextView textView3 = this.p;
            VideoInfoTextView videoInfoTextView = textView3 instanceof VideoInfoTextView ? (VideoInfoTextView) textView3 : null;
            if (videoInfoTextView != null) {
                videoInfoTextView.setEllipsizeEnabled(false);
            }
            if (z8) {
                StringBuilder sb = new StringBuilder();
                if (videoFile.k1() <= 0 && !videoFile.z0() && (!fxc0.B().c(videoFile) || videoFile.L8() != 0)) {
                    gpt0 gpt0Var = gpt0.a;
                    sb.append((CharSequence) z8s.e(videoFile.L8(), this.itemView.getContext()));
                }
                if (videoFile.b0() == 0 && videoFile.k1() <= 0) {
                    gpt0 gpt0Var2 = gpt0.a;
                }
                if (!drm0.N(sb)) {
                    sb.append(" · ");
                }
                gpt0 gpt0Var3 = gpt0.a;
                sb.append(gpt0.r(this.itemView.getContext(), videoFile));
                String sb2 = sb.toString();
                DonutVideoUiModel donutVideoUiModel = mbt0Var.c;
                if (donutVideoUiModel == null || (a3 = k5o.a(donutVideoUiModel)) == null) {
                    i = 1;
                    charSequence = null;
                } else {
                    i = 1;
                    charSequence = ((zyn) pbt0Var.j.getValue()).a(a3, this.itemView.getContext(), null);
                }
                bwt0.p0(textView3, (drm0.N(sb2) && charSequence == null) ? 0 : i);
                if (charSequence == null) {
                    obj = obj2;
                    fqs0Var = null;
                } else {
                    obj = obj2;
                    fqs0Var = new fqs0(Integer.valueOf(i), charSequence, null, 4);
                }
                ((cqs0) pbt0Var.i.getValue()).getClass();
                List singletonList = Collections.singletonList(new eqs0.c(sb2));
                if (fqs0Var != null && (a2 = cqs0.a(fqs0Var, singletonList)) != null) {
                    singletonList = a2;
                }
                zps0 zps0Var = new zps0(" · ", singletonList);
                ?? r3 = textView3 instanceof VideoInfoTextView ? (VideoInfoTextView) textView3 : 0;
                if (r3 != 0) {
                    r3.setMaxLines(charSequence != null ? 2 : i);
                }
                if (r3 != 0) {
                    r3.setEllipsizeEnabled(i);
                }
                if (r3 != 0) {
                    r3.setText(zps0Var);
                }
                bwt0.h0(this.F, textView3);
                r20 = obj;
            } else {
                Object obj3 = obj2;
                Context context = this.itemView.getContext();
                gpt0 gpt0Var4 = gpt0.a;
                boolean z9 = ((long) videoFile.b0()) * 1000 == 0;
                textView3.setVisibility(z9 ? 8 : 0);
                r20 = obj3;
                if (!z9) {
                    textView3.setText(z7 ? uqm0.g(videoFile.L8()) ? context.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8())) : gpt0.k(context, videoFile).toString());
                    r20 = obj3;
                }
            }
            MusicVideoFile musicVideoFile4 = z7 ? (MusicVideoFile) videoFile : null;
            if (musicVideoFile4 == null || !musicVideoFile4.A1) {
                videoRestriction = null;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                videoRestriction = null;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView.getContext()), (Drawable) null);
                textView.setCompoundDrawablePadding(iah0.a(4));
            }
            VideoRestriction O4 = videoFile.O();
            if (O4 != null && (!e5o.b(O4) || !((Boolean) r20.getValue()).booleanValue())) {
                videoRestriction = O4;
            }
            boolean z10 = ((videoRestriction != null && (!videoRestriction.d || !videoRestriction.f)) && z5) || ((videoFile.getDuration() == 0 && fxc0.B().c(videoFile)) && !z5);
            int i2 = (videoFile.x0() || videoFile.W9() || z10 || (!z5 && videoFile.q0())) ? 8 : 0;
            DurationView durationView = this.t;
            durationView.setVisibility(i2);
            int i3 = (videoFile.q0() || !videoFile.W9() || z10) ? 8 : 0;
            InteractiveDurationView interactiveDurationView = this.u;
            interactiveDurationView.setVisibility(i3);
            bwt0.p0(this.x, !z10 && (videoFile.x0() || (videoFile.q0() && !z5)));
            if (bwt0.K(interactiveDurationView)) {
                Context context2 = interactiveDurationView.getContext();
                HashSet hashSet = iah0.a;
                interactiveDurationView.setTextDescriptionVisible(fnj.b(context2));
                z = true;
                z2 = false;
                interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile, true, false));
            } else {
                z = true;
                z2 = false;
            }
            if (bwt0.K(durationView)) {
                durationView.setText(gpt0.m(durationView.getContext(), videoFile, z, z5));
            }
            vKImageView.setContentDescription(gpt0.g(vKImageView.getContext(), videoFile));
            boolean z11 = (!z5 || (O = videoFile.O()) == null || O.f || (e5o.a(videoFile) && ((Boolean) r20.getValue()).booleanValue())) ? z : z2;
            View view = this.itemView;
            view.setClickable(z11);
            view.setEnabled(z11);
            view.setFocusable(z11);
            boolean z12 = z2;
            boolean z13 = z;
            s6s0 s6s0Var = new s6s0(videoFile, mbt0Var.f, null, null, false, videoFile.r(), false, false, false, null, null, null, null, false, null, false, null, false, null, null, null, false, 536870396);
            if (((Boolean) pbt0Var.m.getValue()).booleanValue()) {
                float f = w6s0.d;
                a = w6s0.a.a(s6s0Var);
            } else {
                int i4 = e6s0.f;
                a = e6s0.a.a(s6s0Var);
            }
            bwt0.d0(this.w, (!fxc0.B().c(videoFile) || a) ? z12 : z13);
        }

        public final void i6(mbt0 mbt0Var) {
            boolean z = mbt0Var.d;
            VKImageView vKImageView = this.r;
            if (z) {
                View view = this.itemView;
                view.setBackgroundColor(e3m.f(R.attr.vk_ui_background_tertiary, view.getContext()));
                vKImageView.setOverlayImage(new ColorDrawable(e3m.f(R.attr.vk_ui_overlay_primary, this.itemView.getContext())));
            } else {
                this.itemView.setBackgroundColor(0);
                vKImageView.setOverlayImage(new ColorDrawable(0));
            }
            boolean z2 = mbt0Var.d;
            boolean z3 = z2 && !fxc0.B().c(mbt0Var.b);
            ImageView imageView = this.v;
            bwt0.p0(imageView, z3);
            imageView.setSelected(z2);
            wz4 wz4Var = this.m;
            if (z2 && mbt0Var.e) {
                wz4Var.j = false;
            } else {
                wz4Var.j = true;
            }
        }
    }

    public pbt0(b25 b25Var, DonutVideoComponent donutVideoComponent, b8j0 b8j0Var, e9i0 e9i0Var, exi0 exi0Var) {
        this.a = b25Var;
        this.b = donutVideoComponent;
        this.c = b8j0Var;
        this.d = e9i0Var;
        this.e = exi0Var;
        jo60 jo60Var = new jo60(21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, jo60Var);
        this.g = msy.a(lazyThreadSafetyMode, new uv80(15));
        this.h = msy.a(lazyThreadSafetyMode, new rcs0(3));
        this.i = msy.a(lazyThreadSafetyMode, new kud0(11));
        this.j = msy.a(lazyThreadSafetyMode, new nid0(this, 26));
        this.k = msy.a(lazyThreadSafetyMode, new nbt0(this, 0));
        this.l = msy.a(lazyThreadSafetyMode, new jql0(2));
        this.m = msy.a(lazyThreadSafetyMode, new yo80(13));
    }

    @Override // xsna.p1u0
    public final void a(vfz<mbt0> vfzVar, mbt0 mbt0Var, List list) {
        mbt0 mbt0Var2 = mbt0Var;
        if (vfzVar instanceof a) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                ((a) vfzVar).i6(mbt0Var2);
                return;
            }
            a aVar = (a) vfzVar;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof VideoRelatedVideoItemChangePayload) {
                    arrayList.add(obj);
                }
            }
            aVar.n = mbt0Var2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (a.C3502a.$EnumSwitchMapping$0[((VideoRelatedVideoItemChangePayload) it.next()).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.i6(mbt0Var2);
            }
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends mbt0> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof mbt0;
    }
}
