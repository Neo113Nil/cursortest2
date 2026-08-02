package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedImageLoading;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.cru0;
import xsna.e0r;

/* compiled from: GalvitaDtoHolder.kt */
/* loaded from: classes4.dex */
public final class p5t extends rp6<z5t, NewsEntry> implements i7o, a1n, o0n, t0n, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int I = 0;
    public final GalvitaLayout E;
    public final b6t F;
    public final m680 G;
    public boolean H;

    /* compiled from: GalvitaDtoHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* compiled from: GalvitaDtoHolder.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            p5t p5tVar = (p5t) this.receiver;
            int i = p5t.I;
            return Boolean.valueOf(p5tVar.t);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            p5t p5tVar = (p5t) this.receiver;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = p5t.I;
            p5tVar.t = booleanValue;
        }
    }

    /* compiled from: GalvitaDtoHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Integer, Integer> {
        @Override // xsna.izs
        public final Integer invoke(Integer num) {
            return Integer.valueOf(((b6t) this.receiver).c.c(num.intValue()));
        }
    }

    /* compiled from: GalvitaDtoHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Integer, float[]> {
        @Override // xsna.izs
        public final float[] invoke(Integer num) {
            a6t a6tVar;
            View childAt = ((p5t) this.receiver).E.getChildAt(num.intValue());
            ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
            GalvitaLayout.b bVar = layoutParams instanceof GalvitaLayout.b ? (GalvitaLayout.b) layoutParams : null;
            uzt0 uzt0Var = (bVar == null || (a6tVar = bVar.a) == null) ? null : a6tVar.a;
            if (uzt0Var == null) {
                return null;
            }
            float a = cn70.a() * 2.0f;
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = a;
            }
            if (uzt0Var.a) {
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
            }
            if (uzt0Var.b) {
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
            }
            if (uzt0Var.c) {
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
            }
            if (uzt0Var.d) {
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
            }
            return fArr;
        }
    }

    public p5t(ViewGroup viewGroup, c6t c6tVar, ng30 ng30Var, h170 h170Var) {
        super(R.layout.attach_grid_thumbs, viewGroup);
        viewGroup.getContext();
        GalvitaLayout galvitaLayout = (GalvitaLayout) this.itemView.findViewById(R.id.grid);
        this.E = galvitaLayout;
        b6t b6tVar = new b6t(h170Var);
        this.F = b6tVar;
        m680 m680Var = new m680(galvitaLayout, new c(1, b6tVar, b6t.class, "getItemViewType", "getItemViewType(I)I", 0), new d(1, this, p5t.class, "getGalvitaCornerRadii", "getGalvitaCornerRadii(I)[F", 0), ng30Var, new qcl(this, 13));
        this.G = m680Var;
        galvitaLayout.setGap(cn70.b(2));
        galvitaLayout.setMaximumWidth(iah0.w(viewGroup.getContext()));
        galvitaLayout.setViewPool(c6tVar);
        galvitaLayout.setAdapter(b6tVar);
        galvitaLayout.setDecoration(new w5t(this.itemView.getContext()));
        galvitaLayout.setPadding(0, 0, 0, 0);
        b6tVar.e = m680Var;
        s6o s6oVar = this.q;
        if (s6oVar != null) {
            b6tVar.g = s6oVar;
        }
        b6tVar.f = m680Var;
        galvitaLayout.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.itemView;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.F.g = s6oVar;
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.E;
    }

    @Override // xsna.rp6
    public final void R6(z5t z5tVar) {
        this.F.e(z5tVar.j);
        this.H = false;
        this.itemView.setContentDescription(null);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.H = true;
    }

    @Override // xsna.o0n
    public final void a5() {
        awt0.q(this.itemView);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        a aVar = new a(0, new b(this, p5t.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0);
        b6t b6tVar = this.F;
        b6tVar.getClass();
        b6tVar.c.e = aVar;
        NewsEntry newsEntry = u1c0Var.a;
        PostInteract postInteract = this.w;
        String str = this.u;
        s1c0 s1c0Var = this.x;
        m680 m680Var = this.G;
        m680Var.i = newsEntry;
        m680Var.j = postInteract;
        m680Var.k = str;
        m680Var.l = s1c0Var;
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.H;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object obj = cru0.j;
        if (cru0.a.c()) {
            MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode mode = MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode.GRID;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            GalvitaLayout galvitaLayout = this.E;
            int childCount = galvitaLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = galvitaLayout.getChildAt(i);
                ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                View childAt2 = viewGroup != null ? viewGroup.getChildAt(0) : null;
                if (childAt2 instanceof VKImageView) {
                    VKImageView vKImageView = (VKImageView) childAt2;
                    arrayList.add(new e0r.a(vKImageView.getBackend().l.c, i));
                    arrayList2.add(new e0r.a(vKImageView.getBackend().l.d, i));
                }
            }
            J0();
            ?? q6 = q6();
            if (q6 == 0) {
                return;
            }
            e0r.a(arrayList, arrayList2, q6, mode);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
