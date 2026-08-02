package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.image_zhukov.ZhukovLayout;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.ror;

/* compiled from: PreviewHolder.kt */
/* loaded from: classes4.dex */
public final class b4d0 extends qi6<NewsEntry> {
    public static final float R = cn70.a() * 2.0f;
    public static final float S = cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public static final float T = cn70.a() * 8.0f;
    public static final float U = cn70.a() * 2.0f;
    public static final float V = cn70.a() * 10.0f;
    public final boolean C;
    public final boolean D;
    public final qbq E;
    public final float F;
    public final float G;
    public final ror.b H;
    public final float I;
    public final float J;
    public final q5t K;
    public final int L;
    public final int M;
    public final ror N;
    public final pv9 O;
    public final eye0 P;
    public final u9k0 Q;

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
            b4d0 b4d0Var = (b4d0) this.receiver;
            float f = b4d0.R;
            return Boolean.valueOf(b4d0Var.t);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            b4d0 b4d0Var = (b4d0) this.receiver;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            float f = b4d0.R;
            b4d0Var.t = booleanValue;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b4d0(ViewGroup viewGroup, vou vouVar, ror.d dVar, occ0 occ0Var, List list, ldc0 ldc0Var, defpackage.e eVar, defpackage.f fVar, l5d0 l5d0Var, c94 c94Var, wb7 wb7Var, boolean z, ndc0 ndc0Var) {
        super(r6);
        eye0 eye0Var;
        boolean z2 = ldc0Var.b;
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        zfc0 zfc0Var = new zfc0(context, null, 0);
        zfc0Var.setId(R.id.scrollView);
        ror rorVar = new ror(context, ndc0Var);
        rorVar.setId(R.id.container);
        zfc0Var.addView(rorVar);
        zfc0Var.setClipChildren(false);
        zfc0Var.setClipToPadding(false);
        linearLayout.addView(zfc0Var);
        boolean z3 = ndc0Var.a;
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        if (z3) {
            eye0 eye0Var2 = new eye0(linearLayout.getContext());
            eye0Var2.setId(R.id.ratio_switcher);
            frameLayout.addView(eye0Var2);
        }
        linearLayout.addView(frameLayout);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        this.C = z;
        boolean z4 = ndc0Var.a;
        this.D = z4;
        qbq qbqVar = new qbq(vouVar, list, new lbc0(this, 3), c94Var, wb7Var, z4);
        this.E = qbqVar;
        float f = R;
        this.F = f;
        float f2 = z ? T : S;
        this.G = f2;
        this.H = z ? new q5t(f2, f) : new r5t(f2, f);
        float f3 = V;
        this.I = f3;
        float f4 = z3 ? f3 : U;
        this.J = f4;
        this.K = new q5t(f3, f4);
        int b2 = cn70.b(4);
        this.L = b2;
        int b3 = z ? cn70.b(8) : 0;
        this.M = b3;
        ror rorVar2 = (ror) this.itemView.findViewById(R.id.container);
        rorVar2.setConfigRatioCarousel(new p5y(l5d0Var, 29));
        ViewGroup.LayoutParams layoutParams = rorVar2.getLayoutParams();
        layoutParams = layoutParams == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams;
        layoutParams.width = -1;
        layoutParams.height = -2;
        rorVar2.setLayoutParams(layoutParams);
        rorVar2.setPreferredHeight(e3m.a(R.dimen.post_attach_thumbs_height, rorVar2.getContext()));
        rorVar2.setSpacing(rorVar2.h ? cn70.b(2) : cn70.b(4));
        rorVar2.setMoveCallback(occ0Var);
        rorVar2.setImagesAdapter(qbqVar);
        rorVar2.setMoveAllowedProvider(dVar);
        U6(rorVar2, z2);
        b2 = z2 ? b3 : b2;
        rorVar2.setPadding(b2, 0, b2, 0);
        rorVar2.setScrollToPosition(new k82(21, rorVar2, this));
        rorVar2.post(new c0(5, rorVar2, viewGroup));
        this.N = rorVar2;
        zfc0 zfc0Var2 = (zfc0) this.itemView.findViewById(R.id.scrollView);
        ViewGroup.LayoutParams layoutParams2 = zfc0Var2.getLayoutParams();
        layoutParams2 = layoutParams2 == null ? new FrameLayout.LayoutParams(-1, -2) : layoutParams2;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        zfc0Var2.setLayoutParams(layoutParams2);
        zfc0Var2.setHorizontalScrollBarEnabled(false);
        zfc0Var2.setOverScrollMode(2);
        pv9 pv9Var = (pv9) this.itemView.findViewById(R.id.carousel_switcher);
        if (pv9Var != null) {
            ViewGroup.LayoutParams layoutParams3 = pv9Var.getLayoutParams();
            layoutParams3 = layoutParams3 == null ? new FrameLayout.LayoutParams(-2, -2) : layoutParams3;
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            pv9Var.setLayoutParams(layoutParams3);
            bwt0.p0(pv9Var, ldc0Var.a);
            pv9Var.a(z2);
            pv9Var.setOnClickSwitcher(eVar);
        } else {
            pv9Var = null;
        }
        this.O = pv9Var;
        eye0 eye0Var3 = (eye0) this.itemView.findViewById(R.id.ratio_switcher);
        if (eye0Var3 != null) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 8388613;
            layoutParams4.width = -2;
            layoutParams4.height = -2;
            bwt0.p0(eye0Var3, false);
            eye0Var3.setLayoutParams(layoutParams4);
            eye0Var3.setOnClickSwitcher(fVar);
            eye0Var = eye0Var3;
        } else {
            eye0Var = null;
        }
        this.P = eye0Var;
        u9k0 u9k0Var = new u9k0(zfc0Var2, rorVar2);
        this.Q = u9k0Var;
        u9k0Var.c = !z2;
    }

    public final void R6(Attachment attachment) {
        qbq qbqVar = this.E;
        int indexOf = qbqVar.p.indexOf(attachment);
        if (indexOf < 0) {
            return;
        }
        if (attachment instanceof VideoAttachment) {
            qbqVar.w.remove(((VideoAttachment) attachment).getId().intValue());
        }
        g5g.D(qbqVar.v, true, new dxh(attachment, 12));
        ror rorVar = qbqVar.u;
        if (rorVar != null) {
            rorVar.g(indexOf);
        }
    }

    public final void T6(Attachment attachment, Attachment attachment2) {
        Object obj;
        qbq qbqVar = this.E;
        Iterator it = qbqVar.v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((de6) obj).d, attachment)) {
                    break;
                }
            }
        }
        de6 de6Var = (de6) obj;
        if (de6Var == null) {
            return;
        }
        if (attachment instanceof VideoAttachment) {
            qbqVar.w.remove(((VideoAttachment) attachment).getId().intValue());
        }
        m680 m680Var = qbqVar.f;
        de6Var.d = attachment2;
        de6Var.e = null;
        de6Var.f = m680Var;
        de6Var.b(attachment2);
    }

    public final void U6(ror rorVar, boolean z) {
        rorVar.setDecoration(z ? this.H : this.K);
        rorVar.setChildInnerRadius(z ? this.F : this.J);
        rorVar.setChildOuterRadius(z ? this.G : this.I);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        boolean z = this.C;
        qbq qbqVar = this.E;
        if (!z) {
            ror rorVar = qbqVar.u;
            if (rorVar != null) {
                rorVar.removeAllViews();
                ArrayList arrayList = new ArrayList();
                qbq qbqVar2 = rorVar.p;
                if (qbqVar2 != null) {
                    int a2 = qbqVar2.a();
                    for (int i = 0; i < a2; i++) {
                        de6 f = qbqVar2.f(qbqVar2.c(i), rorVar);
                        if (f != null) {
                            qbqVar2.e(f, i);
                            arrayList.add(new Pair(f.b, Integer.valueOf(i)));
                        }
                    }
                }
                rorVar.c(arrayList);
            } else {
                ZhukovLayout zhukovLayout = qbqVar.a;
                if (zhukovLayout != null) {
                    zhukovLayout.c();
                }
            }
        }
        super.a6(u1c0Var);
        qbqVar.i = new a(0, new b(this, b4d0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
    }
}
