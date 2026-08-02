package xsna;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.a;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.media.qrcode.core.ui.SvgDrawable;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReactionPickerView.kt */
/* loaded from: classes2.dex */
public final class z1f0 extends rpo0 implements q1f0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;

    /* compiled from: ReactionPickerView.kt */
    public static final class a {
        public final zaw a;
        public final Msg b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final u1f0 f;
        public final gzs<s3q0> g;
        public final izs<Integer, s3q0> h;
        public final b i;

        public a() {
            throw null;
        }

        public a(zaw zawVar, Msg msg, boolean z, boolean z2, u1f0 u1f0Var, gzs gzsVar, izs izsVar, b bVar, int i) {
            gzsVar = (i & 64) != 0 ? new xs6(25) : gzsVar;
            izsVar = (i & 128) != 0 ? new ept(24) : izsVar;
            bVar = (i & 256) != 0 ? b.c.a : bVar;
            this.a = zawVar;
            this.b = msg;
            this.c = z;
            this.d = z2;
            this.e = false;
            this.f = u1f0Var;
            this.g = gzsVar;
            this.h = izsVar;
            this.i = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + dq.c(sf3.a((this.f.hashCode() + qoy.b(qoy.b(qoy.b(pn.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            return "Config(assetsRepo=" + this.a + ", msg=" + this.b + ", isIncognito=" + this.c + ", animated=" + this.d + ", singleReaction=" + this.e + ", onReactionSelected=" + this.f + ", onMoreClicked=" + this.g + ", onPickerHeightChanged=" + this.h + ", layout=" + this.i + ')';
        }
    }

    /* compiled from: ReactionPickerView.kt */
    public static abstract class b {

        /* compiled from: ReactionPickerView.kt */
        public static final class a extends b {
            public final int a;
            public final int b;
            public final int c;
            public final int d;

            public a(int i, int i2, int i3, int i4) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AlwaysCollapsed(containerHeight=");
                sb.append(this.a);
                sb.append(", itemSize=");
                sb.append(this.b);
                sb.append(", itemPadding=");
                sb.append(this.c);
                sb.append(", containerPadding=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: ReactionPickerView.kt */
        /* renamed from: xsna.z1f0$b$b, reason: collision with other inner class name */
        public static final class C4151b extends b {
            public static final C4151b a = new C4151b();
        }

        /* compiled from: ReactionPickerView.kt */
        public static final class c extends b {
            public static final c a = new c();
        }
    }

    /* compiled from: ReactionPickerView.kt */
    public static final class c extends ViewOutlineProvider {
        public c() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), e3m.a(R.dimen.vkim_reactions_items_list_radius, z1f0.this.getContext()));
            view.setClipToOutline(true);
        }
    }

    public z1f0(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.r = androidx.compose.runtime.k.b(b.c.a);
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        this.u = androidx.compose.runtime.k.b(Boolean.FALSE);
    }

    public static s3q0 B(z1f0 z1f0Var, yaw yawVar, a aVar) {
        u1f0 u1f0Var = aVar.f;
        Integer boundSelectedId = z1f0Var.getBoundSelectedId();
        Integer boundSelectedId2 = z1f0Var.getBoundSelectedId();
        int i = yawVar.a;
        if (boundSelectedId2 != null && boundSelectedId2.intValue() == i) {
            z1f0Var.setBoundSelectedId(null);
            u1f0Var.invoke(boundSelectedId, null);
        } else {
            z1f0Var.setBoundSelectedId(Integer.valueOf(i));
            u1f0Var.invoke(boundSelectedId, Integer.valueOf(i));
        }
        return s3q0.a;
    }

    public static s3q0 C(z1f0 z1f0Var, a aVar, gzs gzsVar) {
        if (aVar.i instanceof b.a) {
            gzsVar.invoke();
        } else {
            z1f0Var.setBoundIsTrimmed(false);
            gzsVar.invoke();
        }
        return s3q0.a;
    }

    private final boolean getBoundAnimated() {
        return ((Boolean) ((zak0) this.u).getValue()).booleanValue();
    }

    private final a getBoundConfig() {
        return (a) ((zak0) this.m).getValue();
    }

    private final boolean getBoundIsTrimmed() {
        return ((Boolean) ((zak0) this.q).getValue()).booleanValue();
    }

    /* renamed from: getBoundItems-d3eaAQk, reason: not valid java name */
    private final List m430getBoundItemsd3eaAQk() {
        wow wowVar = (wow) ((zak0) this.o).getValue();
        if (wowVar != null) {
            return wowVar.b;
        }
        return null;
    }

    private final b getBoundLayout() {
        return (b) ((zak0) this.r).getValue();
    }

    private final com.vk.im.reactions.impl.assets.a getBoundLoader() {
        return (com.vk.im.reactions.impl.assets.a) ((zak0) this.s).getValue();
    }

    private final Integer getBoundSelectedId() {
        return (Integer) ((zak0) this.p).getValue();
    }

    private final zjo getBoundShowMorePainter() {
        return (zjo) ((zak0) this.t).getValue();
    }

    private final gzs<s3q0> getOnMoreClickedOverride() {
        return (gzs) ((zak0) this.n).getValue();
    }

    private final void setBoundAnimated(boolean z) {
        ((zak0) this.u).setValue(Boolean.valueOf(z));
    }

    private final void setBoundConfig(a aVar) {
        ((zak0) this.m).setValue(aVar);
    }

    private final void setBoundIsTrimmed(boolean z) {
        ((zak0) this.q).setValue(Boolean.valueOf(z));
    }

    /* renamed from: setBoundItems-_gitS4A, reason: not valid java name */
    private final void m431setBoundItems_gitS4A(List list) {
        ((zak0) this.o).setValue(list != null ? new wow(list) : null);
    }

    private final void setBoundLayout(b bVar) {
        ((zak0) this.r).setValue(bVar);
    }

    private final void setBoundLoader(com.vk.im.reactions.impl.assets.a aVar) {
        ((zak0) this.s).setValue(aVar);
    }

    private final void setBoundSelectedId(Integer num) {
        ((zak0) this.p).setValue(num);
    }

    private final void setBoundShowMorePainter(zjo zjoVar) {
        ((zak0) this.t).setValue(zjoVar);
    }

    private final void setOnMoreClickedOverride(gzs<s3q0> gzsVar) {
        ((zak0) this.n).setValue(gzsVar);
    }

    @Override // xsna.rpo0
    public final void A(final int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1539519879);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(this) : M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1539519879, i2, -1, "com.vk.im.design.view.ReactionPickerView.ThemedContent (ReactionPickerView.kt:121)");
            }
            int i4 = i2;
            List m430getBoundItemsd3eaAQk = m430getBoundItemsd3eaAQk();
            if (m430getBoundItemsd3eaAQk == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s == null) {
                    return;
                } else {
                    wzsVar = new qq3(this, i, 3);
                }
            } else {
                com.vk.im.reactions.impl.assets.a boundLoader = getBoundLoader();
                if (boundLoader == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s == null) {
                        return;
                    } else {
                        wzsVar = new w1f0(this, i);
                    }
                } else {
                    zjo boundShowMorePainter = getBoundShowMorePainter();
                    if (boundShowMorePainter == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        s = M.s();
                        if (s == null) {
                            return;
                        } else {
                            wzsVar = new j95(this, i, 3);
                        }
                    } else {
                        a boundConfig = getBoundConfig();
                        if (boundConfig == null) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            s = M.s();
                            if (s == null) {
                                return;
                            } else {
                                wzsVar = new x1f0(this, i);
                            }
                        } else {
                            gzs<s3q0> onMoreClickedOverride = getOnMoreClickedOverride();
                            if (onMoreClickedOverride == null) {
                                onMoreClickedOverride = boundConfig.g;
                            }
                            b boundLayout = getBoundLayout();
                            Integer boundSelectedId = getBoundSelectedId();
                            boolean boundIsTrimmed = getBoundIsTrimmed();
                            boolean boundAnimated = getBoundAnimated();
                            int i5 = i4 & 14;
                            boolean y = (i5 == 4 || ((i4 & 8) != 0 && M.y(this))) | M.y(boundConfig);
                            Object x = M.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (y || x == c0012a) {
                                i3 = i4;
                                x = new fo6(22, this, boundConfig);
                                M.R(x);
                            } else {
                                i3 = i4;
                            }
                            izs izsVar = (izs) x;
                            boolean y2 = (i5 == 4 || ((i3 & 8) != 0 && M.y(this))) | M.y(boundConfig) | M.J(onMoreClickedOverride);
                            Object x2 = M.x();
                            if (y2 || x2 == c0012a) {
                                x2 = new f56(this, boundConfig, onMoreClickedOverride, 4);
                                M.R(x2);
                            }
                            p1f0.a(m430getBoundItemsd3eaAQk, boundLayout, boundSelectedId, boundIsTrimmed, boundLoader, boundShowMorePainter, boundAnimated, izsVar, (gzs) x2, boundConfig.h, null, M, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                    }
                }
            }
            s.d = wzsVar;
        }
        M.h();
        s = M.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.y1f0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    z1f0.this.A(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public final void D(int[] iArr, float[] fArr) {
        setBackground(xus.a(e3m.a(R.dimen.vkim_reactions_items_list_radius, getContext()), e3m.f(R.attr.vk_ui_background_modal, getContext()), 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE));
        setOutlineProvider(new c());
        if (Build.VERSION.SDK_INT >= 29 && iArr != null && fArr != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(iArr, fArr);
            setForeground(gradientDrawable);
        }
        setVisibility(0);
    }

    public final void E(a aVar) {
        List<yaw> f;
        b bVar = aVar.i;
        setBoundConfig(aVar);
        gtx0 gtx0Var = aVar.b;
        zaw zawVar = aVar.a;
        boolean z = gtx0Var instanceof MsgFromUser;
        if (z) {
            f = zawVar.i();
        } else {
            if (!(gtx0Var instanceof MsgFromChannel)) {
                throw new IllegalArgumentException("Msg type " + gtx0Var.getClass() + " is not supported");
            }
            f = zawVar.f();
        }
        boolean z2 = gtx0Var instanceof aux0;
        aux0 aux0Var = z2 ? (aux0) gtx0Var : null;
        List<MsgReaction> K = aux0Var != null ? aux0Var.K() : null;
        if (K != null && K.size() >= 16 && z) {
            List<MsgReaction> list = K;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((MsgReaction) it.next()).getId()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : f) {
                if (arrayList.contains(Integer.valueOf(((yaw) obj).a))) {
                    arrayList2.add(obj);
                }
            }
            f = arrayList2.size() <= 16 ? arrayList2 : j5g.H0(arrayList2, 16);
        }
        boolean z3 = bVar instanceof b.a;
        SvgDrawable h = zawVar.h(dhr0.a.c(getContext()) ? R.raw.msg_reaction_show_more_dark : R.raw.msg_reaction_show_more, (z3 ? ((b.a) bVar).b : getContext().getResources().getDimensionPixelSize(R.dimen.vkim_reactions_item_size)) - ((z3 ? 0 : getContext().getResources().getDimensionPixelSize(R.dimen.vkim_reactions_item_internal_padding)) * 2), getContext());
        setBoundLayout(bVar);
        aux0 aux0Var2 = z2 ? (aux0) gtx0Var : null;
        setBoundSelectedId(aux0Var2 != null ? aux0Var2.R5() : null);
        setBoundIsTrimmed(!(bVar instanceof b.C4151b));
        setBoundLoader(new com.vk.im.reactions.impl.assets.a(zawVar));
        setBoundShowMorePainter(new zjo(h));
        setBoundAnimated(aVar.d);
        m431setBoundItems_gitS4A(f);
    }

    @Override // xsna.q1f0
    public final void e() {
        setBoundIsTrimmed(true);
    }

    @Override // xsna.q1f0
    public final void k(boolean z) {
        setBoundIsTrimmed(!z);
    }

    public final void setOnMoreClicked(gzs<s3q0> gzsVar) {
        setOnMoreClickedOverride(gzsVar);
    }

    @Override // xsna.q1f0
    public final void i() {
    }
}
