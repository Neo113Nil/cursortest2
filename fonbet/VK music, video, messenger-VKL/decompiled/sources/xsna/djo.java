package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.stories.impl.base.StoryDrawingManager;
import com.vk.photo.editor.markup.path.calculator.ArrowPathCalculator;
import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.photo.editor.markup.view.tools.SizeCircleView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.w1m0;
import xsna.wpa0;
import xsna.y8g;

/* compiled from: DrawToolControlsDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class djo implements ajo, PipetteView.a, BrushesPanel.a, z860, SizeSeekBarView.a {
    public ViewGroup A;
    public final PipetteView B;
    public final SizeCircleView C;
    public final StoryDrawingManager D;
    public c230 E;
    public final HashMap<tam0, w1m0.a> F;
    public w1m0.a G;
    public a H;
    public boolean I;
    public final ViewGroup b;
    public final StickersDrawingViewGroup c;
    public final vd7 d;
    public final y3j e;
    public final vfe f;
    public final bpn0 g = new bpn0(new i5f(this, 17));
    public final bpn0 h = new bpn0(new pff(this, 18));
    public final bpn0 i = new bpn0(new m2g(this, 14));
    public final List<Integer> j;
    public final Context k;
    public final zrl0 l;
    public RecyclerView m;
    public final ArrayList n;
    public final jf10 o;
    public final of10 p;
    public final ConcatAdapter q;
    public ColorButton r;
    public PipetteButton s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public BrushesPanel y;
    public ViewGroup z;

    /* compiled from: DrawToolControlsDelegateImpl.kt */
    public static abstract class a {

        /* compiled from: DrawToolControlsDelegateImpl.kt */
        /* renamed from: xsna.djo$a$a, reason: collision with other inner class name */
        public static final class C2740a extends a {
            public final boolean a;

            public C2740a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2740a) && this.a == ((C2740a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Closing(withSave="), this.a, ')');
            }
        }

        /* compiled from: DrawToolControlsDelegateImpl.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public djo(ViewGroup viewGroup, StickersDrawingViewGroup stickersDrawingViewGroup, vd7 vd7Var, y3j y3jVar, vfe vfeVar) {
        this.b = viewGroup;
        this.c = stickersDrawingViewGroup;
        this.d = vd7Var;
        this.e = y3jVar;
        this.f = vfeVar;
        List<Integer> l = e43.l(-1, -65536, -16777216, -5266535, -12612896, -14500470, -342235, -43149, -6056971, -7185153, -368477, -32768, -5118184, -8727553, -10985625, -2436662, -1183756);
        this.j = l;
        Context context = viewGroup.getContext();
        this.k = context;
        zrl0 zrl0Var = new zrl0(context, 0);
        zrl0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        zrl0Var.setId(R.id.draw_view_auto_test);
        this.l = zrl0Var;
        List<Integer> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new y8g.c(((Number) it.next()).intValue()));
        }
        this.n = arrayList;
        jf10 jf10Var = new jf10();
        this.o = jf10Var;
        of10 of10Var = new of10();
        this.p = of10Var;
        this.q = new ConcatAdapter(of10Var, jf10Var);
        PipetteView pipetteView = new PipetteView(this.k, null, 0, 14, 0);
        pipetteView.setColorSelectionListener(this);
        pipetteView.setImportantForAccessibility(2);
        this.B = pipetteView;
        SizeCircleView sizeCircleView = new SizeCircleView(this.k, null, 0, 14, 0);
        int i = StoryDrawingManager.b;
        sizeCircleView.setRelativeSize(0.2f);
        sizeCircleView.setMaxSize(StoryDrawingManager.c);
        sizeCircleView.setMinSize(StoryDrawingManager.b);
        sizeCircleView.setImportantForAccessibility(2);
        fyt0.h(sizeCircleView);
        this.C = sizeCircleView;
        this.D = new StoryDrawingManager(this.l);
        this.F = new HashMap<>();
        this.G = new w1m0.a();
        this.H = a.b.a;
    }

    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void A(int i) {
        PipetteView pipetteView = this.B;
        int selectedColor = pipetteView.getSelectedColor();
        this.G.f = selectedColor;
        this.C.setColor(selectedColor);
        b96.e((b96) this.f.b);
        pipetteView.setSelecting(false);
        fyt0.h(pipetteView);
        t(new wpa0.a(new y8g.c(this.G.f), true));
        s(0);
        q();
    }

    @Override // xsna.ajo
    public final boolean C2() {
        return this.G.b == 0;
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void F() {
        fyt0.h(this.C);
    }

    @Override // xsna.ajo
    public final void X0(w1m0.a aVar) {
        this.G = aVar;
        this.l.b(aVar.d.get(aVar.c));
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void a() {
        this.C.setVisibility(0);
    }

    @Override // xsna.ajo
    public final void b() {
        zrl0 zrl0Var = this.l;
        zrl0Var.setDrawingSessionTouchListener(this);
        p();
        q();
        zrl0Var.setTouchesEnabled(true);
    }

    @Override // com.vk.photo.editor.markup.view.tools.BrushesPanel.a
    public final void c(BrushesPanel.BrushType brushType) {
        this.G.e = brushType;
        q();
    }

    @Override // xsna.z860
    public final void d(MotionEvent motionEvent) {
        y3j y3jVar = this.e;
        StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) y3jVar.b;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.I = false;
            b96 b96Var = (b96) y3jVar.a;
            float f = b96.b;
            b96Var.b(null);
            stickersDrawingViewGroup.setStickersAboveDrawingSemiTransparent(true);
            return;
        }
        if (action == 2) {
            stickersDrawingViewGroup.invalidate();
        } else {
            if (action != 3) {
                return;
            }
            this.I = true;
        }
    }

    @Override // xsna.ajo
    public final void e(tam0 tam0Var, c230 c230Var) {
        if (this.E == null) {
            this.E = c230Var;
        }
        HashMap<tam0, w1m0.a> hashMap = this.F;
        w1m0.a aVar = hashMap.get(tam0Var);
        if (aVar != null) {
            this.G = aVar;
        } else {
            int i = StoryDrawingManager.b;
            w1m0.a aVar2 = new w1m0.a();
            hashMap.put(tam0Var, aVar2);
            this.G = aVar2;
        }
        w1m0.a aVar3 = this.G;
        this.l.b(aVar3.d.get(aVar3.b));
    }

    @Override // xsna.ajo
    public final void f() {
        a aVar = this.H;
        if (!(aVar instanceof a.C2740a)) {
            n();
            return;
        }
        if (!((a.C2740a) aVar).a) {
            n();
            return;
        }
        zrl0 zrl0Var = this.l;
        zrl0Var.setDrawingSessionTouchListener(null);
        zrl0Var.setTouchesEnabled(false);
        zrl0Var.c(false);
        c230 c230Var = this.E;
        if (c230Var != null) {
            c230Var.invoke(zrl0Var.d());
        }
        w1m0.a aVar2 = this.G;
        aVar2.c = aVar2.b;
    }

    @Override // xsna.ajo
    public final int g() {
        return this.G.d.size();
    }

    @Override // xsna.ajo
    public final View getDrawingBottomPanel() {
        return (View) this.h.getValue();
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void h(float f) {
        this.G.a = f;
        this.C.setRelativeSize(f);
        q();
    }

    @Override // xsna.ajo
    public final View i() {
        return (View) this.g.getValue();
    }

    @Override // xsna.ajo
    public final SizeSeekBarView j() {
        return (SizeSeekBarView) this.i.getValue();
    }

    @Override // xsna.ajo
    public final w1m0.a k() {
        w1m0.a aVar = this.G;
        float f = aVar.a;
        int i = aVar.b;
        int i2 = aVar.c;
        List<vlo> list = aVar.d;
        BrushesPanel.BrushType brushType = aVar.e;
        int i3 = aVar.f;
        boolean z = aVar.g;
        aVar.getClass();
        return new w1m0.a(f, i, i2, list, brushType, i3, z);
    }

    @Override // xsna.ajo
    public final void l() {
        o();
    }

    public final void m(boolean z) {
        boolean z2 = this.G.g;
        final FrameLayout frameLayout = z2 ? this.s : this.r;
        if (frameLayout == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final BrushesPanel brushesPanel = this.y;
        if (brushesPanel == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final ViewGroup viewGroup2 = this.z;
        if (viewGroup2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final View view = this.t;
        if (view == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (z) {
            l3p.a("DrawEditorExpand", new izs() { // from class: xsna.bjo
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    BrushesPanel brushesPanel2 = brushesPanel;
                    brushesPanel2.a(false);
                    AnimatorSet a2 = lkf0.a(viewGroup2, brushesPanel2, fyt0.f(brushesPanel2), view, Anchor.End);
                    RecyclerView recyclerView2 = recyclerView;
                    animatorSet.playTogether(a2, lkf0.b(viewGroup, recyclerView2, fyt0.f(recyclerView2), frameLayout, Anchor.Start));
                    animatorSet.addListener(new fjo((gzs) obj));
                    animatorSet.start();
                    return s3q0.a;
                }
            });
            return;
        }
        PipetteButton pipetteButton = this.s;
        if (pipetteButton != null) {
            pipetteButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fyt0.n(pipetteButton, z2);
        }
        ColorButton colorButton = this.r;
        if (colorButton != null) {
            colorButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fyt0.n(colorButton, !z2);
        }
        l3p.a("DrawEditorCollapse", new izs() { // from class: xsna.cjo
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                AnimatorSet animatorSet = new AnimatorSet();
                BrushesPanel brushesPanel2 = brushesPanel;
                brushesPanel2.a(true);
                animatorSet.playTogether(lkf0.a(viewGroup, recyclerView, r3.getWidth(), frameLayout, Anchor.Start), lkf0.b(viewGroup2, brushesPanel2, brushesPanel2.getWidth(), view, Anchor.End));
                animatorSet.addListener(new gjo((gzs) obj));
                animatorSet.start();
                return s3q0.a;
            }
        });
    }

    public final void n() {
        zrl0 zrl0Var = this.l;
        zrl0Var.setDrawingSessionTouchListener(null);
        zrl0Var.setTouchesEnabled(false);
        zrl0Var.c(false);
        w1m0.a aVar = this.G;
        zrl0Var.b(aVar.d.get(aVar.c));
        c230 c230Var = this.E;
        if (c230Var != null) {
            c230Var.invoke(zrl0Var.d());
        }
        List B0 = j5g.B0(this.G.d, new k9x(0, this.G.c, 1));
        this.G.d.clear();
        this.G.d.addAll(B0);
        w1m0.a aVar2 = this.G;
        aVar2.b = aVar2.c;
        this.c.invalidate();
    }

    public final void o() {
        w1m0.a aVar = this.G;
        int i = aVar.b;
        if (i > 0) {
            int i2 = i - 1;
            aVar.b = i2;
            this.l.b(aVar.d.get(i2));
            this.c.invalidate();
        }
        u();
    }

    @Override // xsna.z860
    public final void onFinish() {
        if (!this.I) {
            List B0 = j5g.B0(this.G.d, new k9x(0, this.G.b, 1));
            this.G.d.clear();
            this.G.d.addAll(B0);
            w1m0.a aVar = this.G;
            aVar.b++;
            aVar.d.add(this.l.d());
            u();
        }
        y3j y3jVar = this.e;
        StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) y3jVar.b;
        stickersDrawingViewGroup.invalidate();
        b96.e((b96) y3jVar.a);
        stickersDrawingViewGroup.setStickersAboveDrawingSemiTransparent(false);
    }

    public final void p() {
        u();
        t(new wpa0.b(false));
        s(this.G.f);
        r(this.G.f);
        w1m0.a aVar = this.G;
        int i = aVar.f;
        BrushesPanel.BrushType brushType = aVar.e;
        BrushesPanel brushesPanel = this.y;
        if (brushesPanel != null) {
            brushesPanel.setCurrentBrush(brushType);
        }
        BrushesPanel brushesPanel2 = this.y;
        if (brushesPanel2 != null) {
            brushesPanel2.setCurrentColor(i);
        }
        SizeSeekBarView j = j();
        if (j != null) {
            j.setSize(this.G.a);
        }
        float f = this.G.a;
        SizeCircleView sizeCircleView = this.C;
        sizeCircleView.setRelativeSize(f);
        sizeCircleView.setColor(this.G.f);
    }

    public final void q() {
        w1m0.a aVar = this.G;
        float f = aVar.a;
        int i = aVar.f;
        BrushesPanel.BrushType brushType = aVar.e;
        StoryDrawingManager storyDrawingManager = this.D;
        storyDrawingManager.getClass();
        DrawingView drawingView = storyDrawingManager.a;
        int i2 = StoryDrawingManager.b.$EnumSwitchMapping$0[brushType.ordinal()];
        if (i2 == 1) {
            float a2 = StoryDrawingManager.a(f);
            y8g.c cVar = new y8g.c(i);
            Paint.Style style = Paint.Style.STROKE;
            jq90 jq90Var = new jq90(new lrm0(cVar, a2), g6k0.b, new StoryDrawingManager.a(StoryDrawingManager.BrushTypeMeta.PEN, (int) a2, i));
            an10.b(a2);
            new RectF();
            drawingView.e(jq90Var, null);
            return;
        }
        int i3 = 5;
        if (i2 == 2) {
            float a3 = StoryDrawingManager.a(f);
            y8g.c cVar2 = new y8g.c(i);
            Paint.Style style2 = Paint.Style.STROKE;
            jq90 jq90Var2 = new jq90(new lrm0(cVar2, a3), new ofy0(new eq90[]{g6k0.b, new ArrowPathCalculator(5 * a3)}, i3), new StoryDrawingManager.a(StoryDrawingManager.BrushTypeMeta.ARROW, (int) a3, i));
            an10.b(a3);
            new RectF();
            drawingView.e(jq90Var2, null);
            return;
        }
        if (i2 == 3) {
            int i4 = StoryDrawingManager.c;
            float f2 = ((i4 - r5) * f) + StoryDrawingManager.b;
            int i5 = StoryDrawingManager.e;
            float f3 = f2 / 1.0f;
            nmb0 nmb0Var = new nmb0(new gif0(new kif0(f3, ((f * (i5 - r6)) + StoryDrawingManager.d) / 1.0f), new y8g.c(i), 0.8f), new kx90(), new StoryDrawingManager.a(StoryDrawingManager.BrushTypeMeta.MARKER, (int) f3, i));
            an10.b(f3);
            new RectF();
            drawingView.e(nmb0Var, null);
            return;
        }
        if (i2 != 4) {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            float a4 = StoryDrawingManager.a(f);
            jq90 jq90Var3 = new jq90(new uup(a4), g6k0.b, new StoryDrawingManager.a(StoryDrawingManager.BrushTypeMeta.ERASER, (int) a4, 0));
            int i6 = DrawingView.h;
            drawingView.e(jq90Var3, null);
            return;
        }
        float a5 = StoryDrawingManager.a(f);
        y8g.c cVar3 = new y8g.c(i);
        Paint.Style style3 = Paint.Style.STROKE;
        jq90 jq90Var4 = new jq90(new t2u(StoryDrawingManager.f, cVar3, a5, a5 * 1.4f, a5 / 2.0f), g6k0.b, new StoryDrawingManager.a(StoryDrawingManager.BrushTypeMeta.NEON, (int) a5, i));
        an10.b(a5);
        new RectF();
        drawingView.e(jq90Var4, null);
    }

    public final void r(int i) {
        ColorButton colorButton = this.r;
        if (colorButton != null) {
            colorButton.setCurrentColor(this.G.g ? y8g.a.a : new y8g.c(i));
        }
        ColorButton colorButton2 = this.r;
        if (colorButton2 != null) {
            colorButton2.setClickable(!this.G.g);
            colorButton2.setFocusable(!this.G.g);
        }
    }

    public final void s(int i) {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y8g.c cVar = (y8g.c) it.next();
            arrayList2.add(new jzp0(cVar, cVar.a == i && !this.G.g));
        }
        this.o.submitList(arrayList2);
    }

    public final void t(wpa0 wpa0Var) {
        this.p.submitList(Collections.singletonList(new xzp0(wpa0Var)));
        PipetteButton pipetteButton = this.s;
        if (pipetteButton != null) {
            pipetteButton.setState(wpa0Var);
        }
        PipetteButton pipetteButton2 = this.s;
        if (pipetteButton2 != null) {
            pipetteButton2.setClickable(this.G.g);
            pipetteButton2.setFocusable(this.G.g);
        }
    }

    public final void u() {
        w1m0.a aVar = this.G;
        int i = aVar.b;
        boolean z = i != 0;
        boolean z2 = i != e43.h(aVar.d);
        View view = this.v;
        if (view != null) {
            view.setEnabled(z);
        }
        View view2 = this.w;
        if (view2 != null) {
            view2.setEnabled(z2);
        }
        View view3 = this.v;
        if (view3 != null) {
            view3.setAlpha(z ? 1.0f : 0.4f);
        }
        View view4 = this.w;
        if (view4 != null) {
            view4.setAlpha(z2 ? 1.0f : 0.4f);
        }
    }

    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void v(int i) {
        t(new wpa0.a(new y8g.c(this.B.getSelectedColor()), false));
    }
}
