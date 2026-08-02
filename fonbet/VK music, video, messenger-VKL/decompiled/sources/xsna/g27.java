package xsna;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.tool.view.SimpleRatioFrameLayout;
import com.vk.core.view.AdsButton;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Price;
import com.vk.dto.photo.Photo;
import com.vk.toggle.data.AdsBtnStyle;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.qi6;

/* compiled from: BigSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class g27 extends ybk0 implements t0n, a1n, AdsButton.b {
    public static final /* synthetic */ int i0 = 0;
    public final wvn T;
    public final h170 U;
    public final p20 V;
    public final FrameLayout W;
    public final View X;
    public final SimpleRatioFrameLayout Y;
    public final View Z;
    public final AdsButton a0;
    public final View b0;
    public final View c0;
    public final LinearLayout d0;
    public final ysm0 e0;
    public boolean f0;
    public final Object g0;
    public final Object h0;

    public g27(ViewGroup viewGroup, p20 p20Var, wvn wvnVar, h170 h170Var) {
        super(R.layout.attach_snippet_big, viewGroup);
        this.T = wvnVar;
        this.U = h170Var;
        this.V = p20Var;
        this.W = (FrameLayout) this.itemView.findViewById(R.id.dynamic_button_container);
        View findViewById = this.itemView.findViewById(R.id.snippet_big_container);
        this.X = findViewById;
        this.Y = (SimpleRatioFrameLayout) this.itemView.findViewById(R.id.attachment_snippet_image_container);
        View findViewById2 = this.itemView.findViewById(R.id.attachment_snippet_foreground_clickable);
        this.Z = findViewById2;
        AdsButton adsButton = (AdsButton) this.itemView.findViewById(R.id.ads_button);
        this.a0 = adsButton;
        View findViewById3 = this.itemView.findViewById(R.id.shine_anim);
        this.b0 = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.background_info);
        this.c0 = findViewById4;
        this.d0 = (LinearLayout) this.itemView.findViewById(R.id.attach_url_wrapper);
        ysm0 ysm0Var = new ysm0(adsButton, h170Var, findViewById3, 8);
        this.e0 = ysm0Var;
        int b = cn70.b(8);
        com.vk.movika.sdk.base.ui.t tVar = new com.vk.movika.sdk.base.ui.t(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g0 = msy.a(lazyThreadSafetyMode, tVar);
        this.h0 = msy.a(lazyThreadSafetyMode, new sx0(this, 8));
        this.D.l(gbg0.a(this.itemView.getResources(), 0.5f), ybk0.S);
        this.D.m(gbg0.a(this.itemView.getResources(), 2.0f), gbg0.a(this.itemView.getResources(), 2.0f), 0, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.highlight_radius_2, findViewById2);
        dhr0.h0(R.drawable.attach_fb_bottom, findViewById4);
        findViewById.setPadding(0, b, 0, 0);
        awt0.v(adsButton, h170Var.a() != null);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.containerShine);
        awt0.v(frameLayout, h170Var.a() != null);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(hav0.c);
        if (h170Var.a() != null) {
            adsButton.setAnimationDelegate(ysm0Var);
            adsButton.setStyleChangeListener(new np1(this, 2));
            adsButton.setCompoundDrawableTintList(adsButton.getTextColors());
            adsButton.setCompoundDrawablePadding(iah0.a(6));
            View.OnClickListener onClickListener = this.P;
            adsButton.setOnClickListener(onClickListener == null ? this : onClickListener);
        }
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.itemView;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
        final n0n n0nVar = new n0n();
        this.D.setOnHoverListener(new View.OnHoverListener(n0nVar, this) { // from class: xsna.c27
            public final /* synthetic */ g27 a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                g27 g27Var = this.a;
                boolean b = n0n.b(g27Var.itemView, motionEvent);
                if (b) {
                    awt0.q(g27Var.itemView);
                }
                return b;
            }
        });
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        if (q6() != null) {
            this.T.remove();
        }
    }

    @Override // com.vk.core.view.AdsButton.b
    public final void O2(int i) {
        u1c0 J0 = J0();
        if (J0 != null) {
            J0.g = Integer.valueOf(i);
        }
        this.e0.g();
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e9, code lost:
    
        if (r2.b != 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3  */
    @Override // xsna.m56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T6(SnippetAttachment snippetAttachment) {
        Float f;
        float max;
        boolean isEmpty;
        Integer num;
        String str;
        ArrayList arrayList;
        Image image;
        SnippetAttachment snippetAttachment2 = snippetAttachment;
        String str2 = snippetAttachment2.k;
        int a = qi6.a.a(this.itemView.getContext());
        SimpleRatioFrameLayout simpleRatioFrameLayout = this.Y;
        simpleRatioFrameLayout.setMaxWidth(a);
        ImageSize imageSize = snippetAttachment2.G;
        if (imageSize == null) {
            Photo photo = snippetAttachment2.p;
            imageSize = photo != null ? photo.Eb(SnippetAttachment.H) : ImageSize.f;
        }
        boolean Eb = snippetAttachment2.Eb();
        Photo photo2 = snippetAttachment2.p;
        if (Eb) {
            int a2 = qi6.a.a(this.itemView.getContext());
            if (photo2 == null || (image = photo2.y) == null || (arrayList = image.b) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                        arrayList2.add(next);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            ImageSize y = nr2.y(a2, arrayList);
            if (y != null) {
                f = Float.valueOf(y.E0());
                if (f == null) {
                    max = f.floatValue();
                } else {
                    com.vk.dto.common.im.Image image2 = imageSize.d;
                    max = Math.max(image2.b / image2.c, 2.2375f);
                }
                simpleRatioFrameLayout.setRatio(max);
                int i = (this.U.a() != null || TextUtils.isEmpty(str2)) ? 2 : 1;
                TextView textView = this.G;
                textView.setMaxLines(i);
                int i2 = 8;
                if (!snippetAttachment2.Gb() || ((str = snippetAttachment2.h) != null && str.length() != 0)) {
                    if (snippetAttachment2.Gb()) {
                        Product product = snippetAttachment2.r;
                        if ((product != null ? product.b : null) != null) {
                            if (product != null) {
                                Price price = product.b;
                                if (price != null) {
                                }
                            }
                        }
                    }
                    i2 = 0;
                }
                this.H.setVisibility(i2);
                isEmpty = TextUtils.isEmpty(str2);
                AdsButton adsButton = this.a0;
                if (isEmpty) {
                    int c = dhr0.t.c(R.attr.vk_ui_background_accent_themed);
                    u1c0 J0 = J0();
                    Object obj = J0 != null ? J0.g : null;
                    Integer num2 = obj instanceof Integer ? (Integer) obj : null;
                    com.vk.toggle.data.a a3 = this.e0.b.a();
                    int intValue = (a3 != null ? a3.b : null) == null ? 1 : num2 != null ? num2.intValue() : 0;
                    ConstraintLayout.b bVar = (ConstraintLayout.b) adsButton.getLayoutParams();
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) textView.getLayoutParams();
                    if (snippetAttachment2.Gb()) {
                        bVar.F = 1.0f;
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(12);
                        bVar2.v = 0;
                    } else {
                        bVar.F = 0.5f;
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(0);
                        bVar2.v = R.id.barrier;
                    }
                    textView.setLayoutParams(bVar2);
                    adsButton.setVisibility(0);
                    adsButton.setLayoutParams(bVar);
                    adsButton.setCalculatedColor(c);
                    adsButton.setText(str2);
                    String str3 = snippetAttachment2.m;
                    if (str3 != null) {
                        int hashCode = str3.hashCode();
                        if (hashCode != 3443508) {
                            if (hashCode != 106642798) {
                                if (hashCode == 1379209310 && str3.equals("services")) {
                                    num = Integer.valueOf(R.drawable.vk_icon_services_16);
                                    adsButton.setCompoundDrawablesRelativeWithIntrinsicBounds(num == null ? m33.a(num.intValue(), e43.a) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                                    adsButton.b(intValue, true);
                                }
                            } else if (str3.equals("phone")) {
                                num = Integer.valueOf(R.drawable.vk_icon_phone_16);
                                adsButton.setCompoundDrawablesRelativeWithIntrinsicBounds(num == null ? m33.a(num.intValue(), e43.a) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                                adsButton.b(intValue, true);
                            }
                        } else if (str3.equals("play")) {
                            num = Integer.valueOf(R.drawable.vk_icon_play_16);
                            adsButton.setCompoundDrawablesRelativeWithIntrinsicBounds(num == null ? m33.a(num.intValue(), e43.a) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                            adsButton.b(intValue, true);
                        }
                    }
                    num = null;
                    adsButton.setCompoundDrawablesRelativeWithIntrinsicBounds(num == null ? m33.a(num.intValue(), e43.a) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                    adsButton.b(intValue, true);
                } else {
                    f4m.j(adsButton);
                }
                super.b7(snippetAttachment2);
                e27 e27Var = new e27(0, new f27(this, g27.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 0);
                FrescoImageView frescoImageView = this.D;
                frescoImageView.setIgnoreTrafficSaverPredicate(e27Var);
                frescoImageView.setLocalImage((fxj0) null);
                frescoImageView.setRemoteImage((List<? extends fxj0>) X6(snippetAttachment2));
                frescoImageView.setContentDescription(null);
            }
        }
        f = null;
        if (f == null) {
        }
        simpleRatioFrameLayout.setRatio(max);
        if (this.U.a() != null) {
        }
        TextView textView2 = this.G;
        textView2.setMaxLines(i);
        int i22 = 8;
        if (!snippetAttachment2.Gb()) {
        }
        if (snippetAttachment2.Gb()) {
        }
        i22 = 0;
        this.H.setVisibility(i22);
        isEmpty = TextUtils.isEmpty(str2);
        AdsButton adsButton2 = this.a0;
        if (isEmpty) {
        }
        super.b7(snippetAttachment2);
        e27 e27Var2 = new e27(0, new f27(this, g27.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 0);
        FrescoImageView frescoImageView2 = this.D;
        frescoImageView2.setIgnoreTrafficSaverPredicate(e27Var2);
        frescoImageView2.setLocalImage((fxj0) null);
        frescoImageView2.setRemoteImage((List<? extends fxj0>) X6(snippetAttachment2));
        frescoImageView2.setContentDescription(null);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56, xsna.qi6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a6(u1c0 u1c0Var) {
        com.vk.toggle.data.a a;
        super.a6(u1c0Var);
        h170 h170Var = this.U;
        com.vk.toggle.data.a a2 = h170Var.a();
        yoo yooVar = a2 != null ? a2.c : null;
        boolean z = u1c0Var instanceof lsi;
        View view = this.c0;
        FrescoImageView frescoImageView = this.D;
        FrameLayout frameLayout = this.W;
        if (z && yooVar != null) {
            u1c0 u1c0Var2 = ((lsi) u1c0Var).s;
            ol60 ol60Var = u1c0Var2.h;
            if ((ol60Var instanceof uf0 ? (uf0) ol60Var : null) != null) {
                bwt0.p0(view, false);
                boolean r = s101.r(frameLayout);
                ?? r3 = this.g0;
                ?? r5 = this.h0;
                if (!r) {
                    frameLayout.addView(h170Var.c() ? ((rf0) r5.getValue()).itemView : ((jf0) r3.getValue()).itemView);
                }
                zmk zmkVar = new zmk();
                hg1.b(this.itemView, zmkVar.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new el6(new op1(this, 5), 1), new ga(new com.vk.channels.impl.channel_screen.send_msg.e(com.vk.metrics.eventtracking.b.a, 1), 10)));
                frescoImageView.setPostprocessor(zmkVar);
                if (h170Var.c()) {
                    ((rf0) r5.getValue()).a6(u1c0Var2);
                } else {
                    ((jf0) r3.getValue()).a6(u1c0Var2);
                }
                a = h170Var.a();
                if ((a == null ? a.a : null) == AdsBtnStyle.LONG) {
                    f4m.j(this.d0);
                }
                this.f0 = false;
                this.itemView.setContentDescription(null);
                frescoImageView.setOnHoverListener(null);
            }
        }
        frescoImageView.setPostprocessor(null);
        frameLayout.removeAllViews();
        bwt0.p0(view, true);
        a = h170Var.a();
        if ((a == null ? a.a : null) == AdsBtnStyle.LONG) {
        }
        this.f0 = false;
        this.itemView.setContentDescription(null);
        frescoImageView.setOnHoverListener(null);
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.f0;
    }

    @Override // xsna.ybk0, xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (epx.f(view, this.a0)) {
            U6(view);
        } else {
            super.onClick(view);
        }
    }
}
