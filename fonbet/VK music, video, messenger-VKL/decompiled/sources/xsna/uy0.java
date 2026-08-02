package xsna;

import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.tf00;
import xsna.tlo0;
import xsna.vkp;

/* compiled from: AdsItemOverlayDefaultRenderer.kt */
/* loaded from: classes17.dex */
public final class uy0 implements dz0 {
    public final Object a;
    public final hlh0 b;
    public boolean c;
    public boolean d;
    public k390 e;
    public Float f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    /* compiled from: AdsItemOverlayDefaultRenderer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ErrorOverlayRenderDelegate.ErrorOverlayAction.values().length];
            try {
                iArr[ErrorOverlayRenderDelegate.ErrorOverlayAction.ButtonClick.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RestrictionOverlayRenderDelegate.RestrictionOverlayAction.values().length];
            try {
                iArr2[RestrictionOverlayRenderDelegate.RestrictionOverlayAction.ButtonClick.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public uy0(ux0 ux0Var, Lazy lazy, cjh0 cjh0Var, yux yuxVar, boolean z, qw0 qw0Var, kaf kafVar) {
        this.a = lazy;
        this.b = kafVar;
        this.d = z;
        ry0 ry0Var = new ry0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, ry0Var);
        this.h = msy.a(lazyThreadSafetyMode, new sy0(this, cjh0Var, ux0Var, 0));
        this.i = msy.a(lazyThreadSafetyMode, new y4(1, this, ux0Var));
        this.j = msy.a(lazyThreadSafetyMode, new ty0(this, yuxVar, qw0Var, 0));
        this.k = msy.a(lazyThreadSafetyMode, new gd0(1, this, ux0Var));
        this.l = msy.a(lazyThreadSafetyMode, new defpackage.e(this, 1));
    }

    @Override // xsna.dz0
    public final void a() {
        this.d = false;
        if (this.c) {
            return;
        }
        k390 k390Var = this.e;
        if (k390Var != null) {
            e(k390Var);
        }
        Float f = this.f;
        if (f != null) {
            f(f.floatValue());
        }
    }

    @Override // xsna.dz0
    public final void b(boolean z) {
        this.c = z;
        if (z || this.d) {
            return;
        }
        k390 k390Var = this.e;
        if (k390Var != null) {
            e(k390Var);
        }
        Float f = this.f;
        if (f != null) {
            f(f.floatValue());
        }
    }

    @Override // xsna.dz0
    public final void c(ez0 ez0Var) {
        k390 k390Var = ez0Var instanceof k390 ? (k390) ez0Var : null;
        if (k390Var == null) {
            this.b.b(new IllegalStateException("viewState in renderer should match viewState produced by renderFactory"));
        } else if (this.c || this.d) {
            this.e = k390Var;
        } else {
            this.e = null;
            e(k390Var);
        }
    }

    @Override // xsna.dz0
    public final void d(float f) {
        if (this.c || this.d) {
            this.f = Float.valueOf(f);
        } else {
            this.f = null;
            f(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k390 k390Var) {
        ImageUrl b;
        String str;
        String str2;
        SdkVerifyInfo sdkVerifyInfo;
        tlo0.a aVar;
        ConstraintLayout constraintLayout;
        String str3;
        String str4;
        tlo0.a aVar2;
        dqa dqaVar;
        CharSequence a2;
        ImageUrl b2;
        ((gz0) this.g.getValue()).a(k390Var.a);
        tx0 tx0Var = (tx0) this.h.getValue();
        tf00 tf00Var = k390Var.b;
        hx0 hx0Var = tx0Var.a;
        jf00 jf00Var = tx0Var.d;
        if (tf00Var instanceof tf00.d) {
            tf00.d dVar = (tf00.d) tf00Var;
            tf00.a aVar3 = dVar.e;
            String str5 = dVar.a;
            lw lwVar = aVar3.a;
            DescriptionViewState descriptionViewState = dVar.c;
            tf00.c cVar = dVar.d;
            tf00 tf00Var2 = tx0Var.c;
            jf00Var.getClass();
            hx0 hx0Var2 = jf00Var.a;
            boolean z = tf00Var2 instanceof tf00.d;
            if (!epx.f(str5, tf00Var2 != null ? tf00Var2.F() : null) || !z) {
                zmp0.b(hx0Var2.b);
            } else if (z) {
                tf00.d dVar2 = (tf00.d) tf00Var2;
                if (cVar.equals(dVar2.d)) {
                    boolean f = epx.f(descriptionViewState, dVar2.c);
                    boolean f2 = epx.f(lwVar, dVar2.e.a);
                    if (!f || !f2) {
                        zmp0.b(hx0Var2.b);
                        zmp0.a(hx0Var2.b, jf00Var.b);
                    }
                } else {
                    zmp0.b(hx0Var2.b);
                }
            }
            tf00 tf00Var3 = tx0Var.c;
            boolean z2 = epx.f(str5, tf00Var3 != null ? tf00Var3.F() : null) && (tf00Var3 instanceof tf00.d);
            tx0Var.e.a(descriptionViewState);
            tx0Var.f.a(cVar.a);
            hx0Var.h.setVisibility(cVar.b ? 0 : 8);
            tx0Var.g.b(lwVar, z2);
            ImageView imageView = hx0Var.n;
            if (imageView != null) {
                imageView.setVisibility(aVar3.b ? 0 : 8);
            }
            tx0Var.k.a(dVar.f);
            tx0Var.i.a(dVar.g, null);
            tx0Var.j.a(dVar.h, z2);
            tx0Var.h.b(dVar.i);
            tx0Var.c = tf00Var;
        } else {
            tx0Var.c = tf00Var;
        }
        ((ErrorOverlayRenderDelegate) this.i.getValue()).a(k390Var.c);
        ww0 ww0Var = (ww0) this.j.getValue();
        vkp vkpVar = k390Var.d;
        qw0 qw0Var = ww0Var.c;
        yux yuxVar = ww0Var.b;
        rw0 rw0Var = ww0Var.a;
        vkp vkpVar2 = ww0Var.d;
        boolean f3 = epx.f(vkpVar2 != null ? vkpVar2.F() : null, vkpVar.F());
        vkp vkpVar3 = ww0Var.d;
        boolean z3 = vkpVar3 instanceof vkp.b;
        boolean z4 = vkpVar instanceof vkp.b;
        boolean z5 = !z3 && z4;
        boolean z6 = z3 && !z4;
        if (!f3) {
            if (vkpVar3 != null) {
                yuxVar.d(vkpVar3.F());
            }
            if (z4) {
                yuxVar.b(((vkp.b) vkpVar).a);
            }
        } else if (z6) {
            if (vkpVar3 != null) {
                yuxVar.d(vkpVar3.F());
            }
        } else if (z5) {
            yuxVar.b(vkpVar.F());
        }
        if (z4) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) rw0Var.a;
            VkPlaceholder vkPlaceholder = (VkPlaceholder) rw0Var.c;
            constraintLayout2.setOnClickListener(new vw0(ww0Var, 0));
            vkp.b bVar = (vkp.b) vkpVar;
            boolean z7 = bVar.c;
            tgg tggVar = bVar.d;
            SdkOwner sdkOwner = bVar.e;
            SdkImages sdkImages = bVar.f;
            int a3 = e3m.a(R.dimen.clip_overlay_owner_avatar_height, vkPlaceholder.getContext());
            if (z7) {
                SdkImages sdkImages2 = tggVar.f;
                if (sdkImages2 != null && (b2 = sdkImages2.b(a3)) != null) {
                    str = b2.b;
                    vkPlaceholder.setTop(str != null ? null : new VkPlaceholder.c.a(new c.d(str, null), a3, (bb) qw0Var.b, 8));
                    str2 = bVar.g;
                    sdkVerifyInfo = bVar.b;
                    SpannableStringBuilder spannableStringBuilder = bVar.h;
                    aVar = tlo0.Companion;
                    if (str2 != null) {
                        constraintLayout = constraintLayout2;
                        str3 = "";
                    } else {
                        constraintLayout = constraintLayout2;
                        str3 = str2;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str3);
                    if (sdkVerifyInfo == null && sdkVerifyInfo.b) {
                        str4 = str2;
                        aVar2 = aVar;
                        dqaVar = new dqa(new baf0(m33.a(R.drawable.vk_icon_verified_16, constraintLayout.getContext()), constraintLayout.getContext().getColor(R.color.vk_white)));
                    } else {
                        str4 = str2;
                        aVar2 = aVar;
                        dqaVar = null;
                    }
                    if (dqaVar != null) {
                        if (str4 != null && str4.length() != 0) {
                            spannableStringBuilder2.append((char) 160);
                            spannableStringBuilder2.append((char) 160);
                        }
                        spannableStringBuilder2.setSpan(dqaVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 0);
                    }
                    aVar2.getClass();
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c((bb) qw0Var.c, new tlo0.h(spannableStringBuilder2)), new VkPlaceholder.b.C0859b(new tlo0.h(spannableStringBuilder), Float.valueOf(iah0.y(4.0f)), true, 7)));
                    tlo0 tlo0Var = bVar.i;
                    VkPlaceholder.a.C0857a c0857a = (tlo0Var != null || (a2 = tlo0Var.a(constraintLayout.getContext())) == null) ? null : new VkPlaceholder.a.C0857a((tlo0) new tlo0.h(a2), (gzs) qw0Var.d, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Primary, VkButton.Appearance.Overlay, true, 60);
                    VkPlaceholder.a.C0857a c0857a2 = new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clip_feed_end_repeat), (gzs) qw0Var.e, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Secondary, VkButton.Appearance.Overlay, true, 60);
                    vkPlaceholder.setBottom(c0857a == null ? new VkPlaceholder.a.b(c0857a, c0857a2, null, null, 8) : new VkPlaceholder.a.b(c0857a2, null, null, null, 8));
                    ((VkText) rw0Var.b).setText(bVar.j);
                    ww0Var.d = vkpVar;
                }
                str = null;
                vkPlaceholder.setTop(str != null ? null : new VkPlaceholder.c.a(new c.d(str, null), a3, (bb) qw0Var.b, 8));
                str2 = bVar.g;
                sdkVerifyInfo = bVar.b;
                SpannableStringBuilder spannableStringBuilder3 = bVar.h;
                aVar = tlo0.Companion;
                if (str2 != null) {
                }
                SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(str3);
                if (sdkVerifyInfo == null) {
                }
                str4 = str2;
                aVar2 = aVar;
                dqaVar = null;
                if (dqaVar != null) {
                }
                aVar2.getClass();
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c((bb) qw0Var.c, new tlo0.h(spannableStringBuilder22)), new VkPlaceholder.b.C0859b(new tlo0.h(spannableStringBuilder3), Float.valueOf(iah0.y(4.0f)), true, 7)));
                tlo0 tlo0Var2 = bVar.i;
                if (tlo0Var2 != null) {
                }
                VkPlaceholder.a.C0857a c0857a22 = new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clip_feed_end_repeat), (gzs) qw0Var.e, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Secondary, VkButton.Appearance.Overlay, true, 60);
                vkPlaceholder.setBottom(c0857a == null ? new VkPlaceholder.a.b(c0857a, c0857a22, null, null, 8) : new VkPlaceholder.a.b(c0857a22, null, null, null, 8));
                ((VkText) rw0Var.b).setText(bVar.j);
                ww0Var.d = vkpVar;
            } else {
                if (sdkOwner != null && !sdkOwner.n && sdkImages != null && (b = sdkImages.b(a3)) != null) {
                    str = b.b;
                    vkPlaceholder.setTop(str != null ? null : new VkPlaceholder.c.a(new c.d(str, null), a3, (bb) qw0Var.b, 8));
                    str2 = bVar.g;
                    sdkVerifyInfo = bVar.b;
                    SpannableStringBuilder spannableStringBuilder32 = bVar.h;
                    aVar = tlo0.Companion;
                    if (str2 != null) {
                    }
                    SpannableStringBuilder spannableStringBuilder222 = new SpannableStringBuilder(str3);
                    if (sdkVerifyInfo == null) {
                    }
                    str4 = str2;
                    aVar2 = aVar;
                    dqaVar = null;
                    if (dqaVar != null) {
                    }
                    aVar2.getClass();
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c((bb) qw0Var.c, new tlo0.h(spannableStringBuilder222)), new VkPlaceholder.b.C0859b(new tlo0.h(spannableStringBuilder32), Float.valueOf(iah0.y(4.0f)), true, 7)));
                    tlo0 tlo0Var22 = bVar.i;
                    if (tlo0Var22 != null) {
                    }
                    VkPlaceholder.a.C0857a c0857a222 = new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clip_feed_end_repeat), (gzs) qw0Var.e, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Secondary, VkButton.Appearance.Overlay, true, 60);
                    vkPlaceholder.setBottom(c0857a == null ? new VkPlaceholder.a.b(c0857a, c0857a222, null, null, 8) : new VkPlaceholder.a.b(c0857a222, null, null, null, 8));
                    ((VkText) rw0Var.b).setText(bVar.j);
                    ww0Var.d = vkpVar;
                }
                str = null;
                vkPlaceholder.setTop(str != null ? null : new VkPlaceholder.c.a(new c.d(str, null), a3, (bb) qw0Var.b, 8));
                str2 = bVar.g;
                sdkVerifyInfo = bVar.b;
                SpannableStringBuilder spannableStringBuilder322 = bVar.h;
                aVar = tlo0.Companion;
                if (str2 != null) {
                }
                SpannableStringBuilder spannableStringBuilder2222 = new SpannableStringBuilder(str3);
                if (sdkVerifyInfo == null) {
                }
                str4 = str2;
                aVar2 = aVar;
                dqaVar = null;
                if (dqaVar != null) {
                }
                aVar2.getClass();
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c((bb) qw0Var.c, new tlo0.h(spannableStringBuilder2222)), new VkPlaceholder.b.C0859b(new tlo0.h(spannableStringBuilder322), Float.valueOf(iah0.y(4.0f)), true, 7)));
                tlo0 tlo0Var222 = bVar.i;
                if (tlo0Var222 != null) {
                }
                VkPlaceholder.a.C0857a c0857a2222 = new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clip_feed_end_repeat), (gzs) qw0Var.e, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Secondary, VkButton.Appearance.Overlay, true, 60);
                vkPlaceholder.setBottom(c0857a == null ? new VkPlaceholder.a.b(c0857a, c0857a2222, null, null, 8) : new VkPlaceholder.a.b(c0857a2222, null, null, null, 8));
                ((VkText) rw0Var.b).setText(bVar.j);
                ww0Var.d = vkpVar;
            }
        } else {
            ww0Var.d = vkpVar;
        }
        ((RestrictionOverlayRenderDelegate) this.k.getValue()).a(k390Var.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(float f) {
        ImageView imageView = ((w01) ((mu) this.l.getValue()).a.getValue()).d.n;
        if (imageView == null) {
            return;
        }
        float f2 = (f * 0.5f) + 1;
        imageView.setPivotY(imageView.getMeasuredHeight());
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
    }
}
