package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.dek0;

/* compiled from: AudioPlayListView.kt */
/* loaded from: classes18.dex */
public final class gs4 extends ViewGroup {
    public static final int v = cn70.b(480);
    public static final int w = cn70.b(360);
    public static final float x = cn70.a() * 0.5f;
    public static final float y = cn70.a() * 6.0f;
    public final ThumbsImageView b;
    public final View c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final AppCompatImageView f;
    public final AppCompatTextView g;
    public final RecyclerView h;
    public final AppCompatTextView i;
    public final View j;
    public final VkButton k;
    public final VkButton l;
    public final AppCompatImageView m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final Paint u;

    public gs4(Context context) {
        super(context, null, 0);
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.snippet_image);
        thumbsImageView.setBackgroundImageAttr(R.attr.vk_ui_image_placeholder);
        thumbsImageView.h(R.drawable.vk_icon_playlist_outline_56);
        thumbsImageView.g(cn70.a() * 6.0f, cn70.a() * 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int a = iah0.a(1);
        thumbsImageView.setPadding(a, a, a, a);
        this.b = thumbsImageView;
        View view = new View(context);
        view.setId(R.id.attach_bg);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.music_scrim_bottom_16percent, view);
        this.c = view;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.attach_title);
        appCompatTextView.setCompoundDrawablePadding(an10.b(cn70.a() * 5.5f));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextAlignment(1);
        TypedValue typedValue = krv0.a;
        krv0.q(appCompatTextView, R.attr.vk_ui_text_primary);
        com.vk.typography.b.k(appCompatTextView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(21.0f), 4);
        this.d = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.attach_subtitle);
        appCompatTextView2.setBackgroundResource(R.drawable.music_selectable_bg);
        appCompatTextView2.setCompoundDrawablePadding(an10.b(cn70.a() * 6.6f));
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextAlignment(1);
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.k(appCompatTextView2, fontFamily, Float.valueOf(15.0f), 4);
        krv0.q(appCompatTextView2, R.attr.vk_ui_text_muted);
        this.e = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.attach_chevron);
        omw.d(appCompatImageView, R.drawable.vk_icon_chevron_16, R.attr.vk_ui_icon_secondary);
        this.f = appCompatImageView;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.attach_subsubtitle);
        appCompatTextView3.setCompoundDrawablePadding(cn70.b(4));
        appCompatTextView3.setEllipsize(truncateAt);
        appCompatTextView3.setMaxLines(1);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setTextAlignment(1);
        krv0.q(appCompatTextView3, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView3, fontFamily, Float.valueOf(14.0f), 4);
        this.g = appCompatTextView3;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.audio_attachment_playlist_tracks);
        this.h = recyclerView;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setId(R.id.audio_attachment_playlist_show_all);
        appCompatTextView4.setBackgroundResource(R.drawable.music_selectable_bg);
        appCompatTextView4.setEllipsize(truncateAt);
        appCompatTextView4.setMaxLines(1);
        appCompatTextView4.setGravity(16);
        appCompatTextView4.setTextAlignment(1);
        krv0.q(appCompatTextView4, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView4, FontFamily.MEDIUM, Float.valueOf(13.0f), 4);
        appCompatTextView4.setLetterSpacing(0.02f);
        appCompatTextView4.setIncludeFontPadding(false);
        this.i = appCompatTextView4;
        View view2 = new View(context);
        view2.setId(R.id.audio_attachment_artist_overlay);
        view2.setBackgroundResource(R.drawable.highlight_artist_post);
        this.j = view2;
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setId(R.id.audio_attachment_listen_btn);
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_play_24));
        vkButton.setText(R.string.music_artist_listen_all_btn);
        VkButton.Size size = VkButton.Size.Medium;
        vkButton.setSize(size);
        VkButton.Mode mode = VkButton.Mode.Primary;
        vkButton.setMode(mode);
        VkButton.Appearance appearance = VkButton.Appearance.Overlay;
        vkButton.setAppearance(appearance);
        vkButton.setElevation(context.getResources().getDimension(R.dimen.vk_ui_elevation_two));
        this.k = vkButton;
        VkButton vkButton2 = new VkButton(context, null, 6, 0);
        vkButton2.setId(R.id.audio_attachment_follow_toggle_btn);
        vkButton2.a5(true, Integer.valueOf(R.drawable.vk_icon_add_16));
        vkButton2.setIconSize(Integer.valueOf(cn70.b(16)));
        vkButton2.setText(R.string.music_attach_button_label);
        vkButton2.setSize(size);
        vkButton2.setMode(mode);
        vkButton2.setAppearance(appearance);
        vkButton2.setElevation(context.getResources().getDimension(R.dimen.vk_ui_elevation_two));
        this.l = vkButton2;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.audio_attachment_artist_remove_button);
        appCompatImageView2.setImageResource(R.drawable.vk_icon_deprecated_ic_close_attach_36);
        appCompatImageView2.setContentDescription(context.getString(R.string.delete));
        bwt0.p0(appCompatImageView2, false);
        this.m = appCompatImageView2;
        Paint paint = new Paint(1);
        paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(x);
        this.u = paint;
        setId(R.id.audio_attachment_container);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(thumbsImageView, new ViewGroup.MarginLayoutParams(-1, -1));
        addView(view, new ViewGroup.MarginLayoutParams(-1, cn70.b(82)));
        addView(appCompatTextView, new ViewGroup.MarginLayoutParams(-2, -2));
        f4m.s(cn70.b(16), appCompatTextView);
        f4m.t(cn70.b(36), appCompatTextView);
        f4m.r(cn70.b(16), appCompatTextView);
        addView(appCompatTextView2, new ViewGroup.MarginLayoutParams(-2, -2));
        f4m.s(cn70.b(16), appCompatTextView2);
        f4m.t(cn70.b(4), appCompatTextView2);
        f4m.r(cn70.b(16), appCompatTextView2);
        addView(appCompatImageView, new ViewGroup.MarginLayoutParams(-2, -2));
        f4m.s(cn70.b(4), appCompatImageView);
        addView(appCompatTextView3, new ViewGroup.MarginLayoutParams(-2, -2));
        f4m.s(cn70.b(16), appCompatTextView3);
        f4m.t(cn70.b(2), appCompatTextView3);
        f4m.r(cn70.b(16), appCompatTextView3);
        addView(recyclerView, new ViewGroup.MarginLayoutParams(-1, -2));
        f4m.t(an10.b(cn70.a() * 20.5f), recyclerView);
        addView(appCompatTextView4, new ViewGroup.MarginLayoutParams(-1, cn70.b(36)));
        addView(view2, new ViewGroup.MarginLayoutParams(-1, -1));
        addView(vkButton, new ViewGroup.MarginLayoutParams(-2, -2));
        addView(vkButton2, new ViewGroup.MarginLayoutParams(-2, -2));
        f4m.s(cn70.b(12), vkButton2);
        addView(appCompatImageView2, new ViewGroup.MarginLayoutParams(-2, -2));
        int i = dek0.a;
        dek0.b(thumbsImageView, null, new dek0.a(cn70.a() * 6.0f, false), 2);
    }

    public static int a(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight() + b(view);
    }

    public static int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static int c(VkButton vkButton) {
        if (vkButton.getVisibility() == 8) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = vkButton.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return vkButton.getMeasuredWidth() + (marginLayoutParams != null ? marginLayoutParams.leftMargin + marginLayoutParams.rightMargin : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth();
        int i = v;
        float f = (measuredWidth - i) / 2.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        float f2 = paddingLeft + f;
        int paddingTop = getPaddingTop();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingLeft2 = (i - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth2 > paddingLeft2) {
            measuredWidth2 = paddingLeft2;
        }
        float f3 = f2 + measuredWidth2;
        int b = b(this) + getPaddingTop();
        ThumbsImageView thumbsImageView = this.b;
        float a = a(this.i) + a(this.h) + a(this.g) + a(this.e) + a(this.d) + (thumbsImageView.getVisibility() != 8 ? thumbsImageView.getMeasuredWidth() : 0) + b;
        float f4 = y;
        Paint paint = this.u;
        canvas.drawRoundRect(f2, i2, f3, a, f4, f4, paint);
        float b2 = (cn70.b(12) + this.p) - (x / 2.0f);
        canvas.drawLine(dq.a(16.0f, f2), b2, f3 - cn70.b(16), b2, paint);
        super.dispatchDraw(canvas);
    }

    public final View getAttachBgView() {
        return this.c;
    }

    public final AppCompatImageView getAttachChevron() {
        return this.f;
    }

    public final AppCompatTextView getAttachSubsubtitle() {
        return this.g;
    }

    public final AppCompatTextView getAttachSubtitle() {
        return this.e;
    }

    public final AppCompatTextView getAttachTitle() {
        return this.d;
    }

    public final VkButton getFollowButton() {
        return this.l;
    }

    public final VkButton getListenButton() {
        return this.k;
    }

    public final View getOverlayView() {
        return this.j;
    }

    public final AppCompatImageView getRemoveButton() {
        return this.m;
    }

    public final AppCompatTextView getShowAllView() {
        return this.i;
    }

    public final ThumbsImageView getSnippetImageView() {
        return this.b;
    }

    public final RecyclerView getTracksView() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth();
        int i5 = v;
        int i6 = (measuredWidth - i5) / 2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = paddingLeft + i6;
        int paddingTop = getPaddingTop();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i8 = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingLeft2 = (i5 - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth2 > paddingLeft2) {
            measuredWidth2 = paddingLeft2;
        }
        int i9 = i7 + measuredWidth2;
        this.n = i8;
        this.o = i8;
        ThumbsImageView thumbsImageView = this.b;
        if (thumbsImageView.getVisibility() != 8) {
            int measuredWidth3 = thumbsImageView.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) thumbsImageView.getLayoutParams();
            int marginStart = marginLayoutParams2.getMarginStart() + i7;
            int i10 = this.n + marginLayoutParams2.topMargin;
            this.n = i10;
            int i11 = i10 + measuredWidth3;
            this.o = i11;
            int i12 = measuredWidth3 + marginStart;
            thumbsImageView.layout(marginStart, i10, i12, i11);
            int i13 = dek0.a;
            if (dek0.a(thumbsImageView)) {
                ((ViewGroup) thumbsImageView.getParent()).layout(marginStart, this.n, i12, this.o);
            }
            this.o += marginLayoutParams2.bottomMargin;
        }
        View view = this.c;
        if (view.getVisibility() != 8) {
            int measuredWidth4 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int marginStart2 = marginLayoutParams3.getMarginStart() + i7;
            int i14 = this.o + marginLayoutParams3.topMargin;
            view.layout(marginStart2, i14, measuredWidth4 + marginStart2, measuredHeight + i14);
        }
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView.getVisibility() != 8) {
            int measuredWidth5 = appCompatTextView.getMeasuredWidth();
            int measuredHeight2 = appCompatTextView.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams();
            int i15 = (measuredWidth2 - measuredWidth5) / 2;
            if (i15 < 0) {
                i15 = 0;
            }
            int i16 = i15 + i7;
            int i17 = this.o + marginLayoutParams4.topMargin;
            int i18 = measuredHeight2 + i17;
            this.r = i18;
            appCompatTextView.layout(i16, i17, measuredWidth5 + i16, i18);
        } else {
            this.r = this.o;
        }
        AppCompatTextView appCompatTextView2 = this.e;
        if (appCompatTextView2.getVisibility() != 8) {
            int measuredWidth6 = appCompatTextView2.getMeasuredWidth();
            int measuredHeight3 = appCompatTextView2.getMeasuredHeight();
            int i19 = (measuredWidth2 - measuredWidth6) / 2;
            if (i19 < 0) {
                i19 = 0;
            }
            int i20 = i19 + i7;
            int i21 = this.r;
            int i22 = measuredHeight3 + i21;
            this.t = i22;
            int i23 = measuredWidth6 + i20;
            this.s = i23;
            appCompatTextView2.layout(i20, i21, i23, i22);
            AppCompatImageView appCompatImageView = this.f;
            if (appCompatImageView.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) appCompatImageView.getLayoutParams();
                int marginStart3 = marginLayoutParams5.getMarginStart() + this.s;
                int i24 = this.t - marginLayoutParams5.bottomMargin;
                appCompatImageView.layout(marginStart3, i24 - appCompatImageView.getMeasuredHeight(), appCompatImageView.getMeasuredWidth() + marginStart3, i24);
            }
        } else {
            this.t = this.r;
        }
        this.p = this.t;
        AppCompatTextView appCompatTextView3 = this.g;
        if (appCompatTextView3.getVisibility() != 8) {
            int measuredWidth7 = appCompatTextView3.getMeasuredWidth();
            int measuredHeight4 = appCompatTextView3.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) appCompatTextView3.getLayoutParams();
            int i25 = (measuredWidth2 - measuredWidth7) / 2;
            int i26 = (i25 >= 0 ? i25 : 0) + i7;
            int i27 = this.t + marginLayoutParams6.topMargin;
            int i28 = measuredHeight4 + i27;
            this.p = i28;
            appCompatTextView3.layout(i26, i27, measuredWidth7 + i26, i28);
        }
        this.q = this.p;
        RecyclerView recyclerView = this.h;
        if (recyclerView.getVisibility() != 8) {
            int measuredWidth8 = recyclerView.getMeasuredWidth();
            int measuredHeight5 = recyclerView.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
            int marginStart4 = marginLayoutParams7.getMarginStart() + i7;
            int i29 = this.p + marginLayoutParams7.topMargin;
            int i30 = measuredHeight5 + i29;
            this.q = i30;
            recyclerView.layout(marginStart4, i29, measuredWidth8 + marginStart4, i30);
        }
        AppCompatTextView appCompatTextView4 = this.i;
        if (appCompatTextView4.getVisibility() != 8) {
            int measuredWidth9 = appCompatTextView4.getMeasuredWidth();
            int measuredHeight6 = appCompatTextView4.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) appCompatTextView4.getLayoutParams();
            int marginStart5 = marginLayoutParams8.getMarginStart() + i7;
            int i31 = this.q + marginLayoutParams8.topMargin;
            appCompatTextView4.layout(marginStart5, i31, measuredWidth9 + marginStart5, measuredHeight6 + i31);
        }
        View view2 = this.j;
        if (view2.getVisibility() != 8) {
            int measuredWidth10 = view2.getMeasuredWidth();
            int measuredHeight7 = view2.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int marginStart6 = marginLayoutParams9.getMarginStart() + i7;
            int i32 = marginLayoutParams9.topMargin + i8;
            view2.layout(marginStart6, i32, measuredWidth10 + marginStart6, measuredHeight7 + i32);
        }
        int measuredWidth11 = getMeasuredWidth();
        int i33 = w;
        VkButton vkButton = this.l;
        VkButton vkButton2 = this.k;
        if (measuredWidth11 >= i33) {
            int c = (measuredWidth2 - (c(vkButton) + c(vkButton2))) / 2;
            if (vkButton2.getVisibility() != 8) {
                int measuredWidth12 = vkButton2.getMeasuredWidth();
                int measuredHeight8 = vkButton2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) vkButton2.getLayoutParams();
                int marginStart7 = marginLayoutParams10.getMarginStart() + i7 + c;
                int b = this.o - cn70.b(11);
                int i34 = measuredWidth12 + marginStart7;
                vkButton2.layout(marginStart7, b, i34, measuredHeight8 + b);
                c = marginLayoutParams10.getMarginEnd() + i34;
            }
            if (vkButton.getVisibility() != 8) {
                int measuredWidth13 = vkButton.getMeasuredWidth();
                int measuredHeight9 = vkButton.getMeasuredHeight();
                int marginStart8 = ((ViewGroup.MarginLayoutParams) vkButton.getLayoutParams()).getMarginStart() + c;
                int b2 = this.o - cn70.b(11);
                vkButton.layout(marginStart8, b2, measuredWidth13 + marginStart8, measuredHeight9 + b2);
            }
        } else {
            int i35 = measuredWidth2 / 2;
            if (vkButton2.getVisibility() != 8) {
                int measuredHeight10 = vkButton2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) vkButton2.getLayoutParams();
                int marginEnd = (i7 + i35) - marginLayoutParams11.getMarginEnd();
                int b3 = this.o - cn70.b(11);
                vkButton2.layout(marginLayoutParams11.getMarginStart() + i7, b3, marginEnd, measuredHeight10 + b3);
            }
            if (vkButton.getVisibility() != 8) {
                int measuredHeight11 = vkButton.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) vkButton.getLayoutParams();
                int marginStart9 = marginLayoutParams12.getMarginStart() + i7 + i35;
                int b4 = this.o - cn70.b(11);
                vkButton.layout(marginStart9, b4, i9 - marginLayoutParams12.getMarginEnd(), measuredHeight11 + b4);
            }
        }
        AppCompatImageView appCompatImageView2 = this.m;
        if (appCompatImageView2.getVisibility() != 8) {
            int measuredWidth14 = appCompatImageView2.getMeasuredWidth();
            int measuredHeight12 = appCompatImageView2.getMeasuredHeight();
            int marginStart10 = i9 - ((ViewGroup.MarginLayoutParams) appCompatImageView2.getLayoutParams()).getMarginStart();
            appCompatImageView2.layout(marginStart10 - measuredWidth14, i8, marginStart10, measuredHeight12 + i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        gs4 gs4Var;
        VkButton vkButton;
        gs4 gs4Var2 = this;
        int size = View.MeasureSpec.getSize(i);
        int i8 = v;
        int i9 = size > i8 ? i8 : size;
        int c = gp10.c(i9, 1073741824);
        int c2 = gp10.c(0, 0);
        int c3 = gp10.c(i9, Integer.MIN_VALUE);
        ThumbsImageView thumbsImageView = gs4Var2.b;
        int i10 = 8;
        if (thumbsImageView.getVisibility() != 8) {
            gs4Var2.measureChildWithMargins(gs4Var2.b, c, 0, c, 0);
            int i11 = dek0.a;
            if (dek0.a(thumbsImageView)) {
                gs4Var2 = this;
                gs4Var2.measureChildWithMargins((ViewGroup) thumbsImageView.getParent(), c, 0, c, 0);
            } else {
                gs4Var2 = this;
            }
        }
        View view = gs4Var2.c;
        if (view.getVisibility() != 8) {
            i3 = c2;
            gs4Var2.measureChildWithMargins(view, c, 0, i3, 0);
        } else {
            i3 = c2;
        }
        AppCompatTextView appCompatTextView = gs4Var2.d;
        if (appCompatTextView.getVisibility() != 8) {
            i4 = c3;
            gs4Var2.measureChildWithMargins(appCompatTextView, i4, 0, i3, 0);
        } else {
            i4 = c3;
        }
        AppCompatTextView appCompatTextView2 = gs4Var2.e;
        if (appCompatTextView2.getVisibility() != 8) {
            gs4Var2.measureChildWithMargins(appCompatTextView2, i4, 0, i3, 0);
        }
        int i12 = i4;
        AppCompatImageView appCompatImageView = gs4Var2.f;
        if (appCompatImageView.getVisibility() != 8) {
            gs4Var2.measureChildWithMargins(appCompatImageView, i3, 0, i3, 0);
        }
        AppCompatTextView appCompatTextView3 = gs4Var2.g;
        if (appCompatTextView3.getVisibility() != 8) {
            gs4Var2.measureChildWithMargins(appCompatTextView3, i12, 0, i3, 0);
        }
        RecyclerView recyclerView = gs4Var2.h;
        if (recyclerView.getVisibility() != 8) {
            i5 = c;
            gs4Var2.measureChildWithMargins(recyclerView, i5, 0, i3, 0);
        } else {
            i5 = c;
        }
        AppCompatTextView appCompatTextView4 = gs4Var2.i;
        if (appCompatTextView4.getVisibility() != 8) {
            gs4Var2.measureChildWithMargins(appCompatTextView4, i5, 0, i3, 0);
        }
        int i13 = i5;
        int size2 = View.MeasureSpec.getSize(i);
        int i14 = w;
        VkButton vkButton2 = gs4Var2.l;
        VkButton vkButton3 = gs4Var2.k;
        if (size2 >= i14) {
            bwt0.r0(-2, vkButton3);
            if (vkButton3.getVisibility() != 8) {
                i6 = size2;
                vkButton = vkButton2;
                gs4Var2.measureChildWithMargins(vkButton3, i3, 0, i3, 0);
            } else {
                i6 = size2;
                vkButton = vkButton2;
            }
            bwt0.r0(-2, vkButton);
            if (vkButton.getVisibility() != 8) {
                gs4Var = this;
                gs4Var.measureChildWithMargins(vkButton, i3, 0, i3, 0);
            }
            gs4Var = this;
        } else {
            i6 = size2;
            int i15 = i9 / 2;
            bwt0.r0(-1, vkButton3);
            if (vkButton3.getVisibility() != 8) {
                i7 = -1;
                measureChildWithMargins(vkButton3, gp10.c(i15, 1073741824), 0, i3, 0);
            } else {
                i7 = -1;
            }
            bwt0.r0(i7, vkButton2);
            i10 = 8;
            if (vkButton2.getVisibility() != 8) {
                gs4Var = this;
                gs4Var.measureChildWithMargins(vkButton2, gp10.c(i15, 1073741824), 0, i3, 0);
            }
            gs4Var = this;
        }
        AppCompatImageView appCompatImageView2 = gs4Var.m;
        if (appCompatImageView2.getVisibility() != i10) {
            gs4Var.measureChildWithMargins(appCompatImageView2, i3, 0, i3, 0);
        }
        int a = a(appCompatTextView4) + a(recyclerView) + a(appCompatTextView3) + a(appCompatTextView2) + a(appCompatTextView) + (thumbsImageView.getVisibility() != 8 ? thumbsImageView.getMeasuredWidth() : 0) + b(gs4Var) + gs4Var.getPaddingBottom() + gs4Var.getPaddingTop();
        View view2 = gs4Var.j;
        if (view2.getVisibility() != 8) {
            gs4Var.measureChildWithMargins(view2, i13, 0, gp10.c(a, 1073741824), 0);
        }
        gs4Var.setMeasuredDimension(i6, a);
    }
}
