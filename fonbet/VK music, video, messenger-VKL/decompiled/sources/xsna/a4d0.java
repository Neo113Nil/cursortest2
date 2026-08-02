package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.posting.preview.image.attach.PostingPreviewImage;
import com.vk.feed.design.view.posting.preview.image.crop.model.PreviewCropType;
import com.vk.feed.tool.view.posting.preview.crop.PreviewCropLayout;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.lhk;
import xsna.pcc0;
import xsna.qor;

/* compiled from: PreviewHolder.kt */
/* loaded from: classes4.dex */
public final class a4d0 extends eh implements qor.a {
    public static final float S = cn70.a() * 4.0f;
    public final List<Attachment> C;
    public final pq10 D;
    public final izs<PostingAction, s3q0> E;
    public final cpc0 F;
    public final pbq G;
    public final int H;
    public final int I;
    public final qor J;
    public final View K;
    public final FrameLayout L;
    public final VkButton M;
    public final t9k0 N;
    public final xo9 O;
    public final d4d0 P;
    public vdc0 Q;
    public boolean R;

    /* compiled from: PreviewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* compiled from: PreviewHolder.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            a4d0 a4d0Var = (a4d0) this.receiver;
            float f = a4d0.S;
            return Boolean.valueOf(a4d0Var.t);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            a4d0 a4d0Var = (a4d0) this.receiver;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            float f = a4d0.S;
            a4d0Var.t = booleanValue;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a4d0(ViewGroup viewGroup, x64 x64Var, pcc0.a aVar, ArrayList arrayList, mdc0 mdc0Var, gzs gzsVar, jg8 jg8Var, ihk ihkVar, g6b g6bVar, pq10 pq10Var, izs izsVar, cpc0 cpc0Var, a1u0 a1u0Var) {
        super(r2);
        VkButton vkButton;
        boolean z = mdc0Var.a;
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        yfc0 yfc0Var = new yfc0(context);
        yfc0Var.setId(R.id.scrollView);
        qor qorVar = new qor(context);
        qorVar.setId(R.id.container);
        yfc0Var.addView(qorVar);
        yfc0Var.setClipChildren(false);
        yfc0Var.setClipToPadding(false);
        linearLayout.addView(yfc0Var);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(R.id.carousel_and_ratio_switchers_container);
        linearLayout2.setPadding(cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(4));
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(R.id.carousel_switcher_container);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        bwt0.f0(frameLayout, cn70.b(8), 0, cn70.b(8), 0, 10);
        VkButton vkButton2 = new VkButton(linearLayout.getContext(), null, 6, 0);
        vkButton2.setId(R.id.carousel_switcher);
        vkButton2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vkButton2.setMode(VkButton.Mode.Link);
        vkButton2.setAppearance(VkButton.Appearance.Neutral);
        vkButton2.setSize(VkButton.Size.Small);
        frameLayout.addView(vkButton2);
        linearLayout2.addView(frameLayout);
        linearLayout.addView(linearLayout2);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        this.C = arrayList;
        this.D = pq10Var;
        this.E = izsVar;
        this.F = cpc0Var;
        pbq pbqVar = new pbq(x64Var, arrayList, new m130(this, 27), g6bVar, pq10Var, ihkVar, izsVar, cpc0Var, a1u0Var);
        this.G = pbqVar;
        this.H = cn70.b(4) + cn70.b(36);
        this.I = cn70.b(PsExtractor.AUDIO_STREAM);
        yfc0 yfc0Var2 = (yfc0) this.itemView.findViewById(R.id.scrollView);
        ViewGroup.LayoutParams layoutParams = yfc0Var2.getLayoutParams();
        layoutParams = layoutParams == null ? new FrameLayout.LayoutParams(-1, -2) : layoutParams;
        layoutParams.width = -1;
        layoutParams.height = -2;
        yfc0Var2.setLayoutParams(layoutParams);
        yfc0Var2.setHorizontalScrollBarEnabled(false);
        yfc0Var2.setOverScrollMode(2);
        yfc0Var2.setClipChildren(false);
        yfc0Var2.setClipToPadding(false);
        yfc0Var2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.z3d0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                v0u0 v0u0Var;
                PostingPreviewImage postingPreviewImage;
                a4d0 a4d0Var = a4d0.this;
                d4d0 d4d0Var = a4d0Var.P;
                if (!d4d0Var.h) {
                    d4d0Var.c(i);
                    return;
                }
                qor qorVar2 = a4d0Var.J;
                if (a4d0Var.R) {
                    return;
                }
                if ((qorVar2.h() || !qorVar2.g) && a4d0Var.D.e && a4d0Var.F.j()) {
                    Object parent = qorVar2.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    int measuredWidth = (view2 != null ? view2.getMeasuredWidth() : 0) + i;
                    View childAt = qorVar2.getChildAt(0);
                    if (childAt == null || (v0u0Var = (v0u0) j5g.b0(0, qorVar2.j.c)) == null || i > v0u0Var.b || v0u0Var.d > measuredWidth || (postingPreviewImage = (PostingPreviewImage) childAt.findViewById(R.id.posting_preview_image)) == null) {
                        return;
                    }
                    postingPreviewImage.requestLayout();
                    a4d0Var.R = true;
                }
            }
        });
        float f = S;
        s5t s5tVar = new s5t(f);
        s5t s5tVar2 = new s5t(f);
        g6o0 g6o0Var = new g6o0(pbqVar);
        qor qorVar2 = (qor) this.itemView.findViewById(R.id.container);
        qorVar2.setConfigRatioCarousel(new hj60(jg8Var, 14));
        ViewGroup.LayoutParams layoutParams2 = qorVar2.getLayoutParams();
        layoutParams2 = layoutParams2 == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams2;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        qorVar2.setLayoutParams(layoutParams2);
        qorVar2.setPreferredHeight(e3m.a(R.dimen.post_attach_thumbs_height, qorVar2.getContext()));
        qorVar2.setSpacing(cn70.b(2));
        qorVar2.setMoveCallback(aVar);
        qorVar2.setChildViewProvider(g6o0Var);
        pbqVar.n = qorVar2;
        qorVar2.setConfig(new cpr(pq10Var.a, pq10Var.b));
        qorVar2.setClipChildren(false);
        qorVar2.setClipToPadding(false);
        qorVar2.setMeasureChildListener(this);
        qorVar2.setDecoration(hg10.l(mdc0Var) ? s5tVar : s5tVar2);
        qorVar2.setScrollToPosition(new lh(23, qorVar2, this));
        qorVar2.post(new f0(4, qorVar2, viewGroup));
        this.J = qorVar2;
        View findViewById = this.itemView.findViewById(R.id.carousel_and_ratio_switchers_container);
        bwt0.p0(findViewById, false);
        this.K = findViewById;
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.carousel_switcher_container);
        if (frameLayout2 != null) {
            bwt0.p0(frameLayout2, z);
            bwt0.i0(frameLayout2, new cnf(1, gzsVar));
        } else {
            frameLayout2 = null;
        }
        this.L = frameLayout2;
        VkButton vkButton3 = (VkButton) this.itemView.findViewById(R.id.carousel_switcher);
        if (vkButton3 != null) {
            bwt0.p0(vkButton3, z);
            U6(hg10.l(mdc0Var));
            vkButton = vkButton3;
        } else {
            vkButton = null;
        }
        this.M = vkButton;
        t9k0 t9k0Var = new t9k0(yfc0Var2, qorVar2);
        this.N = t9k0Var;
        this.O = new xo9();
        this.P = new d4d0(qorVar2, cpc0Var, pbqVar, pq10Var);
        t9k0Var.c = !hg10.l(mdc0Var);
    }

    public final void R6(Attachment attachment) {
        pbq pbqVar = this.G;
        int indexOf = pbqVar.h.indexOf(attachment);
        if (indexOf < 0) {
            return;
        }
        if (attachment instanceof VideoAttachment) {
            pbqVar.p.remove(((VideoAttachment) attachment).getId().intValue());
        }
        g5g.D(pbqVar.o, true, new vfk(attachment, 8));
        qor qorVar = pbqVar.n;
        if (qorVar != null) {
            qorVar.j(indexOf);
        }
    }

    @Override // xsna.qor.a
    public final void T0(View view, v0u0 v0u0Var) {
        iba0 imageSize;
        ImageCropArea imageCropArea;
        List<ImageCropArea> list;
        Object obj;
        khk khkVar;
        PreviewCropLayout previewCropLayout = (PreviewCropLayout) view.findViewById(R.id.preview_crop_layout);
        if (previewCropLayout == null) {
            return;
        }
        w3d0 imageLayer = previewCropLayout.getImageLayer();
        qor qorVar = this.J;
        boolean z = false;
        imageLayer.n = qorVar.h() || !qorVar.g;
        lhk imageState = imageLayer.getImageState();
        if (imageState == null || (imageSize = imageState.getImageSize()) == null) {
            return;
        }
        imageLayer.setCropType(qorVar.g ? PreviewCropType.SCALE : PreviewCropType.FIT);
        e4d0 e4d0Var = null;
        if (qorVar.h() || !qorVar.g) {
            vdc0 vdc0Var = this.Q;
            if (vdc0Var == null || (list = vdc0Var.b) == null) {
                imageCropArea = null;
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    ImageCropArea imageCropArea2 = (ImageCropArea) obj;
                    if (imageState instanceof lhk.a) {
                        lhk.a aVar = (lhk.a) imageState;
                        Uri uri = imageCropArea2.c;
                        if (uri != null && uri.equals(aVar.a)) {
                            break;
                        }
                    } else {
                        if (!(imageState instanceof lhk.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lhk.b bVar = (lhk.b) imageState;
                        String str = imageCropArea2.b;
                        if (!agc0.e(str) && str.equals(bVar.a)) {
                            break;
                        }
                    }
                }
                imageCropArea = (ImageCropArea) obj;
            }
            if (imageCropArea != null) {
                this.O.getClass();
                e4d0Var = new e4d0(imageCropArea.b, imageCropArea.c, imageCropArea.d, imageCropArea.e, imageCropArea.f, imageCropArea.g, imageCropArea.i.a);
            }
        }
        int i = imageSize.a;
        int i2 = imageSize.b;
        if (!qorVar.h()) {
            boolean z2 = qorVar.g;
        }
        jhk jhkVar = imageLayer.m;
        jhkVar.c = i;
        jhkVar.d = i2;
        if (!epx.f(jhkVar.b, e4d0Var)) {
            jhkVar.b = e4d0Var;
            if (e4d0Var == null) {
                jhkVar.c();
            } else {
                jhkVar.b(e4d0Var, i, i2);
            }
        }
        d4d0 d4d0Var = this.P;
        cpc0 cpc0Var = d4d0Var.b;
        qor qorVar2 = d4d0Var.a;
        if (d4d0Var.g) {
            return;
        }
        if (d4d0Var.a()) {
            ViewParent parent = qorVar2.getParent();
            if (parent instanceof HorizontalScrollView) {
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) parent;
                int scrollX = horizontalScrollView.getScrollX();
                int measuredWidth = horizontalScrollView.getMeasuredWidth() + scrollX;
                if (scrollX > v0u0Var.b || v0u0Var.d > measuredWidth) {
                    return;
                }
                w3d0 imageLayer2 = previewCropLayout.getImageLayer();
                if (d4d0Var.h || ((khkVar = imageLayer2.s) != null && khkVar.c())) {
                    z = true;
                }
                d4d0Var.h = z;
                return;
            }
            return;
        }
        if (cpc0Var.j()) {
            if ((qorVar2.h() || !qorVar2.g) && d4d0Var.d.e) {
                ViewParent parent2 = qorVar2.getParent();
                if (parent2 instanceof HorizontalScrollView) {
                    List<Attachment> list2 = d4d0Var.c.h;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!(((Attachment) it2.next()) instanceof PhotoAttachment)) {
                                d4d0Var.g = true;
                                return;
                            }
                        }
                    }
                    HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) parent2;
                    int scrollX2 = horizontalScrollView2.getScrollX();
                    int measuredWidth2 = horizontalScrollView2.getMeasuredWidth() + scrollX2;
                    if (scrollX2 > v0u0Var.b || v0u0Var.d > measuredWidth2) {
                        return;
                    }
                    w3d0 imageLayer3 = previewCropLayout.getImageLayer();
                    if (cpc0Var.j() && pla.e().b().a(d4d0Var.e)) {
                        zzo zzoVar = imageLayer3.r;
                        if (zzoVar != null) {
                            zzoVar.g();
                        }
                        d4d0Var.g = true;
                    } else {
                        d4d0Var.g = false;
                    }
                    if (d4d0Var.f) {
                        d4d0Var.b(scrollX2);
                    }
                }
            }
        }
    }

    public final void T6(int i) {
        if (this.G.q() > 0) {
            this.N.b(i);
        }
    }

    public final void U6(boolean z) {
        int i = z ? R.string.newsfeed_newpost_grid : R.string.newsfeed_newpost_carousel;
        int i2 = z ? R.drawable.vk_icon_square_split_4_outline_20 : R.drawable.vk_icon_carousel_outline_20;
        int i3 = z ? R.string.newsfeed_newpost_grid_content_description : R.string.newsfeed_newpost_carousel_content_description;
        int i4 = z ? R.string.newsfeed_newpost_grid_accessibility : R.string.newsfeed_newpost_carousel_accessibility;
        VkButton vkButton = this.M;
        if (vkButton != null) {
            Integer valueOf = Integer.valueOf(i2);
            int[] iArr = VkButton.W;
            vkButton.a5(true, valueOf);
        }
        if (vkButton != null) {
            vkButton.setIconSize(Integer.valueOf(cn70.b(20)));
        }
        if (vkButton != null) {
            vkButton.setText(i);
        }
        if (vkButton != null) {
            vkButton.setContentDescription(this.itemView.getContext().getString(i3));
        }
        if (vkButton != null) {
            awt0.o(vkButton, new h7a(this, i4, 2));
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        new a(0, new b(this, a4d0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0);
        this.G.getClass();
    }

    @Override // xsna.co10
    public final void j3(int i) {
        int i2 = i - this.H;
        int i3 = this.I;
        if (i2 < i3) {
            i2 = i3;
        }
        this.J.setContainerMaxHeight(i2);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
    }
}
