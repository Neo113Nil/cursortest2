package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.ClickArea;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.tps0;

/* compiled from: VideoAutoPlayHolderWithFooter.kt */
/* loaded from: classes4.dex */
public class w3s0 extends BaseVideoAutoPlayHolder<f4s0, VideoAttachment> implements a1n, t0n {
    public io.reactivex.rxjava3.disposables.c A0;
    public a B0;
    public io.reactivex.rxjava3.disposables.c C0;
    public boolean D0;
    public final tps0 s0;
    public final x3s0 t0;
    public final ViewGroup u0;
    public final Space v0;
    public final TextView w0;
    public final TextView x0;
    public final LinkedTextView y0;
    public b z0;

    /* compiled from: VideoAutoPlayHolderWithFooter.kt */
    public static final class a {
        public final CharSequence a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: VideoAutoPlayHolderWithFooter.kt */
    public static final class b {
        public final CharSequence a;
        public final boolean b;
        public final VideoFile c;

        public b(CharSequence charSequence, boolean z, VideoFile videoFile) {
            this.a = charSequence;
            this.b = z;
            this.c = videoFile;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w3s0(int i, ViewGroup viewGroup, tps0.b bVar) {
        super(r0, viewGroup, r3, r4, null);
        tps0.b bVar2 = (i & 2) != 0 ? new tps0.b(0) : bVar;
        sps0 sps0Var = new sps0(null, new jcr(), false, 239);
        x3s0 x3s0Var = new x3s0(viewGroup.getContext());
        x3s0Var.setId(R.id.video_footer_container);
        x3s0Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        x3s0Var.setOrientation(1);
        Context context = x3s0Var.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        VideoAutoPlayHolderView videoAutoPlayHolderView = new VideoAutoPlayHolderView(context, null, 6, 0);
        x3s0Var.setVideoAutoPlayHolderView(videoAutoPlayHolderView);
        frameLayout.addView(videoAutoPlayHolderView);
        x3s0Var.addView(frameLayout);
        Space space = new Space(x3s0Var.getContext());
        space.setId(R.id.video_footer_space);
        space.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(5)));
        x3s0Var.setVideoFooterSpace(space);
        x3s0Var.addView(space);
        Context context2 = x3s0Var.getContext();
        TextView textView = new TextView(context2);
        textView.setId(R.id.video_footer_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = 16;
        int a2 = iah0.a(f);
        int a3 = iah0.a(f);
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        layoutParams.setMarginStart(a2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
        layoutParams.setMarginEnd(a3);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i3;
        textView.setLayoutParams(layoutParams);
        textView.setPaddingRelative(e3m.d(R.attr.attach_left_right_padding, context2), textView.getPaddingTop(), e3m.d(R.attr.attach_left_right_padding, context2), iah0.a(3));
        FontFamily fontFamily = FontFamily.MEDIUM;
        Float valueOf = Float.valueOf(15.0f);
        com.vk.typography.b.k(textView, fontFamily, valueOf, 4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        float f2 = 4;
        textView.setLineSpacing((int) iah0.y(f2), 1.0f);
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.m0(textView, R.attr.vk_ui_text_muted);
        x3s0Var.setVideoFooterTitle(textView);
        x3s0Var.addView(textView);
        Context context3 = x3s0Var.getContext();
        TextView textView2 = new TextView(context3);
        textView2.setId(R.id.video_footer_subtitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int a4 = e3m.a(R.dimen.post_side_padding, context3);
        int a5 = e3m.a(R.dimen.post_side_padding, context3);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        layoutParams2.setMarginStart(a4);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i4;
        layoutParams2.setMarginEnd(a5);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i5;
        textView2.setLayoutParams(layoutParams2);
        float f3 = 10;
        textView2.setPaddingRelative(e3m.d(R.attr.attach_left_right_padding, context3), textView2.getPaddingTop(), e3m.d(R.attr.attach_left_right_padding, context3), iah0.a(f3));
        FontFamily fontFamily2 = FontFamily.REGULAR;
        com.vk.typography.b.k(textView2, fontFamily2, Float.valueOf(13.0f), 4);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        dhr0Var.m0(textView2, R.attr.newsfeed_attach_subtitle_color);
        x3s0Var.setVideoFooterSubtitle(textView2);
        x3s0Var.addView(textView2);
        Context context4 = x3s0Var.getContext();
        LinkedTextView linkedTextView = new LinkedTextView(context4, null, 6, 0);
        linkedTextView.setId(R.id.video_footer_description);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int a6 = e3m.a(R.dimen.post_side_padding, context4);
        int a7 = e3m.a(R.dimen.post_side_padding, context4);
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        layoutParams3.setMarginStart(a6);
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i6;
        layoutParams3.setMarginEnd(a7);
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i7;
        linkedTextView.setLayoutParams(layoutParams3);
        linkedTextView.setPaddingRelative(e3m.d(R.attr.attach_left_right_padding, context4), linkedTextView.getPaddingTop(), e3m.d(R.attr.attach_left_right_padding, context4), iah0.a(f3));
        com.vk.typography.b.k(linkedTextView, fontFamily2, valueOf, 4);
        linkedTextView.setEllipsize(truncateAt);
        linkedTextView.setMaxLines(1);
        linkedTextView.setLineSpacing((int) iah0.y(f2), 1.0f);
        dhr0Var.m0(linkedTextView, R.attr.vk_ui_text_primary);
        x3s0Var.setVideoFooterDescription(linkedTextView);
        x3s0Var.addView(linkedTextView);
        this.s0 = bVar2;
        x3s0 x3s0Var2 = (x3s0) this.itemView.findViewById(R.id.video_footer_container);
        this.t0 = x3s0Var2;
        this.u0 = (ViewGroup) this.itemView.findViewById(R.id.video_duration_holder);
        this.v0 = x3s0Var2.getVideoFooterSpace();
        TextView videoFooterTitle = x3s0Var2.getVideoFooterTitle();
        this.w0 = videoFooterTitle;
        TextView videoFooterSubtitle = x3s0Var2.getVideoFooterSubtitle();
        this.x0 = videoFooterSubtitle;
        this.y0 = x3s0Var2.getVideoFooterDescription();
        Long l = this.p0;
        if (l == null) {
            l = Long.valueOf(ViewConfiguration.getDoubleTapTimeout() + 300);
            this.p0 = l;
        }
        View.OnClickListener p7 = p7(l);
        videoFooterTitle.setOnClickListener(p7);
        videoFooterSubtitle.setOnClickListener(p7);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        this.u0.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        RatioFrameLayout ratioFrameLayout = this.W;
        sb.append(ratioFrameLayout.getContentDescription());
        sb.append(".");
        sb.append(di60.m(disclaimerData, this.itemView.getContext()));
        ratioFrameLayout.setContentDescription(sb.toString());
    }

    public final void J7(a aVar) {
        this.B0 = aVar;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new lmk(aVar, 2));
        asu0 asu0Var = asu0.a;
        this.C0 = io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).subscribe(new wmz(new zyl0(this, 15), 29));
    }

    public final void K7(b bVar) {
        this.z0 = bVar;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new oh80(bVar));
        asu0 asu0Var = asu0.a;
        this.A0 = io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).subscribe(new lkz(new evh0(6, this, bVar), 25));
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        Long l = this.p0;
        if (l == null) {
            l = Long.valueOf(ViewConfiguration.getDoubleTapTimeout() + 300);
            this.p0 = l;
        }
        View.OnClickListener p7 = p7(l);
        this.w0.setOnClickListener(p7);
        this.x0.setOnClickListener(p7);
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.t0.getVideoAutoPlayHolderView();
    }

    @Override // xsna.a1n
    public final void U5() {
        this.D0 = true;
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.D0;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        VideoAttachment videoAttachment = (VideoAttachment) this.E;
        ClickArea clickArea = null;
        ShitAttachment shitAttachment = videoAttachment != null ? videoAttachment.h : null;
        if (shitAttachment != null && (num = shitAttachment.h0) != null) {
            clickArea = new ClickArea(num.intValue());
        }
        if (clickArea != null) {
            AdClickContext adClickContext = AdClickContext.VIDEO;
            if (clickArea.a(adClickContext)) {
                u1c0 J0 = J0();
                hd60.a().r0(this.itemView.getContext(), shitAttachment, J0 != null ? J0.k : -1, adClickContext);
                return;
            }
        }
        super.onClick(view);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        b bVar = this.z0;
        if (bVar != null) {
            K7(bVar);
        }
        a aVar = this.B0;
        if (aVar != null) {
            J7(aVar);
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        io.reactivex.rxjava3.disposables.c cVar = this.A0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.A0 = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.C0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.C0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f4  */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c7(VideoAttachment videoAttachment) {
        boolean z;
        VideoFile videoFile;
        io.reactivex.rxjava3.disposables.c cVar;
        NewsEntry newsEntry;
        boolean c;
        CharSequence title;
        boolean z2;
        int i;
        boolean z3;
        CharSequence charSequence;
        io.reactivex.rxjava3.disposables.c cVar2;
        super.c7(videoAttachment);
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        f4s0 f4s0Var = ol60Var instanceof f4s0 ? (f4s0) ol60Var : null;
        CharSequence charSequence2 = "";
        tps0 tps0Var = this.s0;
        Space space = this.v0;
        LinkedTextView linkedTextView = this.y0;
        TextView textView = this.w0;
        TextView textView2 = this.x0;
        if (f4s0Var != null) {
            String str = f4s0Var.o;
            byte b2 = f4s0Var.k;
            VideoFile videoFile2 = f4s0Var.l;
            if (((b2 >> 4) & 1) != 0) {
                z2 = true;
                i = 0;
            } else {
                z2 = true;
                i = 8;
            }
            space.setVisibility(i);
            io.reactivex.rxjava3.disposables.c cVar3 = this.A0;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            this.A0 = null;
            this.z0 = null;
            if (((b2 >> 1) & 1) == 0) {
                if ((tps0Var instanceof tps0.a ? (tps0.a) tps0Var : null) == null) {
                    z3 = false;
                    if (((b2 >> 2) & 1) == 0) {
                        f4m.j(textView);
                    } else {
                        if (videoFile2 instanceof MusicVideoFile) {
                            MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile2;
                            charSequence = s490.d(this.itemView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
                        } else {
                            charSequence = f4s0Var.m;
                        }
                        if (charSequence == null || drm0.N(charSequence)) {
                            f4m.j(textView);
                        } else {
                            K7(new b(charSequence, z3, videoFile2));
                        }
                    }
                    if ((b2 & 1) == 0) {
                        f4m.j(textView2);
                    } else {
                        if (videoFile2 instanceof MusicVideoFile) {
                            MusicVideoFile musicVideoFile2 = (MusicVideoFile) videoFile2;
                            charSequence2 = s490.d(this.itemView.getContext(), s490.i(musicVideoFile2.B1), s490.c(musicVideoFile2.C1), R.attr.vk_ui_text_secondary);
                        } else {
                            int i2 = f4s0Var.p;
                            if (i2 > 0) {
                                charSequence2 = s6(R.plurals.video_views, i2, Integer.valueOf(i2));
                            }
                        }
                        textView2.setVisibility(!drm0.N(charSequence2) ? 0 : 8);
                        textView2.setText(charSequence2);
                    }
                    cVar2 = this.C0;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    this.C0 = null;
                    this.B0 = null;
                    if (((b2 >> 3) & 1) != 0 || str == null || drm0.N(str)) {
                        f4m.j(linkedTextView);
                    } else {
                        linkedTextView.setSingleLine(false);
                        J7(new a(str));
                    }
                }
            }
            z3 = z2;
            if (((b2 >> 2) & 1) == 0) {
            }
            if ((b2 & 1) == 0) {
            }
            cVar2 = this.C0;
            if (cVar2 != null) {
            }
            this.C0 = null;
            this.B0 = null;
            if (((b2 >> 3) & 1) != 0) {
                linkedTextView.setSingleLine(false);
                J7(new a(str));
            }
            f4m.j(linkedTextView);
        } else {
            boolean d = g620.f().d(videoAttachment.k);
            boolean p0 = videoAttachment.k.p0();
            if (d || p0) {
                f4m.j(space);
            } else {
                space.setVisibility(0);
            }
            io.reactivex.rxjava3.disposables.c cVar4 = this.A0;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            this.A0 = null;
            this.z0 = null;
            VideoFile videoFile3 = videoAttachment.k;
            boolean c2 = g620.f().c(videoFile3);
            boolean z4 = videoAttachment.h != null;
            s1c0 s1c0Var = this.x;
            if (s1c0Var != null && s1c0Var.k) {
                if ((tps0Var instanceof tps0.a ? (tps0.a) tps0Var : null) == null) {
                    z = false;
                    if (!c2 || z4) {
                        f4m.j(textView);
                    } else {
                        if (videoFile3 instanceof MusicVideoFile) {
                            MusicVideoFile musicVideoFile3 = (MusicVideoFile) videoFile3;
                            title = s490.d(this.itemView.getContext(), musicVideoFile3.l, musicVideoFile3.D1, R.attr.vk_ui_text_secondary);
                        } else {
                            title = videoFile3.getTitle();
                        }
                        if (drm0.N(title)) {
                            f4m.j(textView);
                        } else {
                            K7(new b(title, z, videoFile3));
                        }
                    }
                    videoFile = videoAttachment.k;
                    if (g620.f().c(videoFile)) {
                        if (videoFile instanceof MusicVideoFile) {
                            MusicVideoFile musicVideoFile4 = (MusicVideoFile) videoFile;
                            charSequence2 = s490.d(this.itemView.getContext(), s490.i(musicVideoFile4.B1), s490.c(musicVideoFile4.C1), R.attr.vk_ui_text_secondary);
                        } else if (videoFile.L8() > 0) {
                            charSequence2 = s6(R.plurals.video_views, videoFile.L8(), Integer.valueOf(videoFile.L8()));
                        }
                        textView2.setVisibility(!drm0.N(charSequence2) ? 0 : 8);
                        textView2.setText(charSequence2);
                    } else {
                        f4m.j(textView2);
                    }
                    cVar = this.C0;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.C0 = null;
                    this.B0 = null;
                    u1c0 j6 = j6();
                    NewsEntry newsEntry2 = j6 == null ? j6.a : null;
                    newsEntry = newsEntry2 != null ? newsEntry2 : null;
                    if (newsEntry == null) {
                        newsEntry = this.p;
                    }
                    VideoFile videoFile4 = videoAttachment.k;
                    c = g620.f().c(videoFile4);
                    boolean z5 = newsEntry instanceof Videos;
                    s1c0 s1c0Var2 = this.x;
                    boolean z6 = (s1c0Var2 == null && s1c0Var2.k) ? false : true;
                    String j1 = videoFile4.j1();
                    if (!c || !z5 || z6 || j1 == null || drm0.N(j1)) {
                        f4m.j(linkedTextView);
                    } else {
                        s1c0 s1c0Var3 = this.x;
                        linkedTextView.setSingleLine(s1c0Var3 == null || !s1c0Var3.k);
                        J7(new a(j1));
                    }
                }
            }
            z = true;
            if (c2) {
            }
            f4m.j(textView);
            videoFile = videoAttachment.k;
            if (g620.f().c(videoFile)) {
            }
            cVar = this.C0;
            if (cVar != null) {
            }
            this.C0 = null;
            this.B0 = null;
            u1c0 j62 = j6();
            if (j62 == null) {
            }
            if (newsEntry2 != null) {
            }
            if (newsEntry == null) {
            }
            VideoFile videoFile42 = videoAttachment.k;
            c = g620.f().c(videoFile42);
            boolean z52 = newsEntry instanceof Videos;
            s1c0 s1c0Var22 = this.x;
            if (s1c0Var22 == null) {
            }
            String j12 = videoFile42.j1();
            if (c) {
            }
            f4m.j(linkedTextView);
        }
        this.D0 = false;
    }
}
