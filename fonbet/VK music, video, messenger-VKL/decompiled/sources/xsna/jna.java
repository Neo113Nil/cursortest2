package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.MusicTrack;
import com.vk.music.design.view.download.DownloadingView;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;

/* compiled from: CellMusicRightViewControllerFactory.kt */
/* loaded from: classes3.dex */
public final class jna implements VkCell.d {
    public final VkCell a;
    public final izs<MusicTrack, s3q0> b;
    public final izs<MusicTrack, s3q0> c;
    public final izs<MusicTrack, s3q0> d;
    public final ImageView e;
    public final FrameLayout f;
    public final ImageView g;
    public final DownloadingView h;
    public final FrameLayout i;
    public final VkText j;
    public final LinearLayout k;

    /* compiled from: CellMusicRightViewControllerFactory.kt */
    @b6l(c = "com.vk.music.ui.track.holders.cell.CellMusicRightViewController$1$1", f = "CellMusicRightViewControllerFactory.kt", l = {170}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ b9f0<qna> $hint;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ jna this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b9f0<qna> b9f0Var, jna jnaVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$hint = b9f0Var;
            this.this$0 = jnaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$hint, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            zf40 zf40Var;
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    b9f0<qna> b9f0Var = this.$hint;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    obj = b9f0Var.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                qna qnaVar = (qna) obj;
                Rect rect = new Rect();
                if (this.this$0.g.getGlobalVisibleRect(rect) && (zf40Var = qnaVar.a) != null) {
                    zf40Var.a(rect, qnaVar.b);
                }
            } catch (ClosedReceiveChannelException unused) {
                zvj.c(yvjVar, null);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jna(VkCell vkCell, Context context, boolean z, izs<? super MusicTrack, s3q0> izsVar, izs<? super MusicTrack, s3q0> izsVar2, izs<? super MusicTrack, s3q0> izsVar3, b9f0<qna> b9f0Var) {
        this.a = vkCell;
        this.b = izsVar;
        this.c = izsVar2;
        this.d = izsVar3;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.cell_pre_action_image);
        float f = 16;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        abg0 abg0Var = dhr0.t;
        imageView.setImageTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_secondary)));
        this.e = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.cell_pre_action_container);
        float f2 = 24;
        float f3 = 48;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f3)));
        frameLayout.addView(imageView);
        frameLayout.setVisibility(8);
        this.f = frameLayout;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.magic_wand);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        bwt0.m0(iah0.a(f2), iah0.a(f2), imageView2);
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(context.getString(R.string.music_talkback_play_similar));
        imageView2.setImageDrawable(abg0Var.a(R.drawable.vk_icon_stars_outline_24));
        imageView2.setImageTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_accent)));
        imageView2.setVisibility(8);
        this.g = imageView2;
        DownloadingView downloadingView = new DownloadingView(context, null, 6);
        downloadingView.setId(R.id.downloaded_state);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams2.gravity = 17;
        downloadingView.setLayoutParams(layoutParams2);
        downloadingView.setTint(abg0Var.c(R.attr.vk_ui_track_buffer));
        downloadingView.setDownloadingTint(abg0Var.c(R.attr.vk_ui_track_buffer));
        downloadingView.setDownloadedIcon(R.drawable.vk_icon_arrow_down_circle_16);
        downloadingView.setNotLoadedIcon(R.drawable.vk_icon_download_outline_16);
        downloadingView.b = z;
        this.h = downloadingView;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f3)));
        frameLayout2.addView(downloadingView);
        frameLayout2.setVisibility(8);
        this.i = frameLayout2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.vk_ui_typography_footnote_normal});
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            VkText vkText = new VkText(new ContextThemeWrapper(context, resourceId), null, 6, 0);
            vkText.setId(R.id.audio_duration);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            vkText.setLayoutParams(layoutParams3);
            vkText.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
            vkText.setMaxLines(1);
            vkText.setEllipsize(TextUtils.TruncateAt.END);
            vkText.setVisibility(8);
            this.j = vkText;
            LinearLayout a2 = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
            ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-2, -2);
            a2.setGravity(8388629);
            a2.setLayoutParams(layoutParams4);
            a2.addView(frameLayout2);
            a2.addView(imageView2);
            a2.addView(frameLayout);
            a2.addView(vkText);
            this.k = a2;
            if (b9f0Var != null) {
                bdn bdnVar = bdn.a;
                myc0.h(zvj.a(ie00.a.U()), null, null, new a(b9f0Var, this, null), 3);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fc  */
    @Override // com.vk.core.view.components.cell.VkCell.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VkCell.f fVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int marginStart;
        VkCell.Right.d right;
        lna lnaVar = fVar instanceof lna ? (lna) fVar : null;
        if (lnaVar == null) {
            return;
        }
        CharSequence charSequence = lnaVar.h;
        boolean z = lnaVar.d;
        boolean z2 = lnaVar.c;
        int i5 = 0;
        View.OnClickListener inaVar = new ina(0, this, lnaVar);
        View view = this.g;
        view.setOnClickListener(inaVar);
        boolean z3 = true;
        View.OnClickListener wh4Var = new wh4(1, this, lnaVar);
        View view2 = this.i;
        view2.setOnClickListener(wh4Var);
        l22 l22Var = new l22(3, this, lnaVar);
        View view3 = this.f;
        bwt0.i0(view3, l22Var);
        VkText vkText = this.j;
        if (z2) {
            bi40 a2 = di40.a(lnaVar.b);
            int i6 = DownloadingView.m;
            this.h.a(a2, true);
            view2.setVisibility(0);
            f4m.j(view);
        } else {
            if (lnaVar.e) {
                f4m.j(view2);
                f4m.j(view);
                String str = lnaVar.g;
                ImageView imageView = this.e;
                imageView.setContentDescription(str);
                imageView.setImageResource(lnaVar.f);
                view3.setVisibility(0);
                f4m.j(vkText);
                if (view.getVisibility() != 0) {
                    view = view2.getVisibility() == 0 ? view2 : view3.getVisibility() == 0 ? view3 : null;
                }
                if (view == null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        int i7 = layoutParams.width;
                        Integer valueOf = Integer.valueOf(i7);
                        if (i7 <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            i = valueOf.intValue();
                        }
                    }
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i = view.getMeasuredWidth();
                } else {
                    i = 0;
                }
                if (view == null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i8 = layoutParams2.height;
                        Integer valueOf2 = Integer.valueOf(i8);
                        if (i8 <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            i2 = valueOf2.intValue();
                        }
                    }
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i2 = view.getMeasuredHeight();
                } else {
                    i2 = 0;
                }
                if (vkText.getVisibility() != 0) {
                    ViewGroup.LayoutParams layoutParams3 = vkText.getLayoutParams();
                    if (layoutParams3 != null) {
                        int i9 = layoutParams3.width;
                        Integer valueOf3 = Integer.valueOf(i9);
                        if (i9 <= 0) {
                            valueOf3 = null;
                        }
                        if (valueOf3 != null) {
                            i3 = valueOf3.intValue();
                        }
                    }
                    vkText.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i3 = vkText.getMeasuredWidth();
                } else {
                    i3 = 0;
                }
                if (vkText.getVisibility() != 0) {
                    ViewGroup.LayoutParams layoutParams4 = vkText.getLayoutParams();
                    if (layoutParams4 != null) {
                        int i10 = layoutParams4.height;
                        Integer valueOf4 = Integer.valueOf(i10);
                        if (i10 <= 0) {
                            valueOf4 = null;
                        }
                        if (valueOf4 != null) {
                            i4 = valueOf4.intValue();
                        }
                    }
                    vkText.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i4 = vkText.getMeasuredHeight();
                } else {
                    i4 = 0;
                }
                ViewGroup.LayoutParams layoutParams5 = vkText.getLayoutParams();
                LinearLayout.LayoutParams layoutParams6 = !(layoutParams5 instanceof LinearLayout.LayoutParams) ? (LinearLayout.LayoutParams) layoutParams5 : null;
                marginStart = layoutParams6 == null ? layoutParams6.getMarginStart() : 0;
                if (i > 0 && i3 > 0) {
                    i5 = marginStart;
                }
                Size size = new Size(i + i5 + i3, Math.max(i2, i4));
                VkCell vkCell = this.a;
                right = vkCell.getRight();
                if (right != null) {
                    return;
                }
                VkCell.Right.e eVar = right.b;
                VkCell.Right.e.d dVar = eVar instanceof VkCell.Right.e.d ? (VkCell.Right.e.d) eVar : null;
                if (dVar == null || epx.f(dVar.b, size)) {
                    return;
                }
                vkCell.setRight(VkCell.Right.d.a(right, null, new VkCell.Right.e.d(lnaVar, size), null, null, null, 29));
                return;
            }
            if (z) {
                f4m.j(view2);
                view.setVisibility(0);
            } else {
                f4m.j(view2);
                f4m.j(view);
            }
        }
        f4m.j(view3);
        if (charSequence != null) {
            if (!z && !z2) {
                z3 = false;
            }
            ViewGroup.LayoutParams layoutParams7 = vkText.getLayoutParams();
            LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.setMarginStart(z3 ? iah0.a(8) : 0);
            }
            vkText.setText(charSequence);
            vkText.setContentDescription(f870.p(vkText.getContext(), r2.f, lnaVar.a.s));
            vkText.setVisibility(0);
        } else {
            f4m.j(vkText);
        }
        if (view.getVisibility() != 0) {
        }
        if (view == null) {
        }
        if (view == null) {
        }
        if (vkText.getVisibility() != 0) {
        }
        if (vkText.getVisibility() != 0) {
        }
        ViewGroup.LayoutParams layoutParams52 = vkText.getLayoutParams();
        if (!(layoutParams52 instanceof LinearLayout.LayoutParams)) {
        }
        if (layoutParams6 == null) {
        }
        if (i > 0) {
            i5 = marginStart;
        }
        Size size2 = new Size(i + i5 + i3, Math.max(i2, i4));
        VkCell vkCell2 = this.a;
        right = vkCell2.getRight();
        if (right != null) {
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.k;
    }
}
