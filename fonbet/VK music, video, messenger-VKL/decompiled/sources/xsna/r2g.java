package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.vk.photo.editor.features.collage.gl.GLCollageView;
import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.collage.CollageMessage;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.d5p;
import xsna.k3g;
import xsna.m2t;
import xsna.p4p;
import xsna.qbk;

/* compiled from: CollageTool.kt */
/* loaded from: classes4.dex */
public final class r2g extends m3p<w1g> implements p290, v0g {
    public final c5p A;
    public final n3g c;
    public final androidx.lifecycle.j d;
    public final v3p e;
    public final c0a f;
    public final p0u g;
    public final c0a h;
    public final gfp i = new gfp(null);
    public View j;
    public View k;
    public Button l;
    public Button m;
    public Button n;
    public ImageButton o;
    public vgu p;
    public b9s q;
    public e28 r;
    public final utk0 s;
    public final utk0 t;
    public final utk0 u;
    public k3g v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: CollageTool.kt */
    public static final class a implements d5p.a<w1g> {
        public final u3p a;

        public a(u3p u3pVar) {
            this.a = u3pVar;
        }

        @Override // xsna.d5p.a
        public final d5p<w1g> a(v3p v3pVar) {
            vyt0 vyt0Var = new vyt0(v3pVar.getViewModelStore(), new p3g(v3pVar.d(), this.a, new ng1(v3pVar, 27), v3pVar.b()), qbk.a.b);
            rfc a = fpf0.a(n3g.class);
            String h = a.h();
            if (h == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            n3g n3gVar = (n3g) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
            androidx.lifecycle.j a2 = g5z.a(v3pVar.w());
            p0u p0uVar = new p0u(v3pVar.x().getApplicationContext());
            return new r2g(this.a, n3gVar, a2, v3pVar, v3pVar.g(jik.a), p0uVar, v3pVar.g(u020.a));
        }
    }

    /* compiled from: CollageTool.kt */
    public static final class b implements l290 {
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // xsna.l290
        public final View a() {
            return null;
        }

        @Override // xsna.l290
        public final View b() {
            r2g r2gVar = r2g.this;
            k3g k3gVar = r2gVar.v;
            if (k3gVar != null) {
                return k3gVar;
            }
            k3g k3gVar2 = new k3g(this.b);
            k3gVar2.setAlpha(0.01f);
            k3gVar2.setFilterParamsProvider((k3g.c) r2gVar.x.getValue());
            k3gVar2.setAutoEnhanceParamsProvider((k3g.a) r2gVar.y.getValue());
            k3gVar2.setColorGradingParamsProvider((k3g.b) r2gVar.z.getValue());
            k3gVar2.setImageFactoryProvider(new qc(r2gVar, 23));
            int i = 3;
            k3gVar2.setShadersCodeRepositoryProvider(new i5f(r2gVar, i));
            k3gVar2.setCoroutineScopeProvider(new pff(r2gVar, i));
            k3gVar2.setOnLowMemoryError(new m2g(r2gVar, 0));
            k3gVar2.setLoggerProvider(new f1(r2gVar, 27));
            fyt0.l(k3gVar2, false);
            y1t y1tVar = new y1t(k3gVar2.l);
            k3gVar2.x = new l1t(k3gVar2.p, y1tVar, new h6(k3gVar2, 24), new we0(k3gVar2, 27), new f2b0(k3gVar2), new l3g(y1tVar, k3gVar2), k3gVar2.l, new ozf(k3gVar2, 1), new u40(k3gVar2, 24));
            GLCollageView gLCollageView = k3gVar2.p;
            gLCollageView.setRenderer(y1tVar);
            gLCollageView.b();
            r2gVar.v = k3gVar2;
            return k3gVar2;
        }

        @Override // xsna.l290
        public final View c() {
            return null;
        }
    }

    public r2g(u3p u3pVar, n3g n3gVar, androidx.lifecycle.j jVar, v3p v3pVar, c0a c0aVar, p0u p0uVar, c0a c0aVar2) {
        this.c = n3gVar;
        this.d = jVar;
        this.e = v3pVar;
        this.f = c0aVar;
        this.g = p0uVar;
        this.h = c0aVar2;
        utk0 a2 = vtk0.a(null);
        this.s = a2;
        utk0 a3 = vtk0.a(null);
        this.t = a3;
        utk0 a4 = vtk0.a(null);
        this.u = a4;
        vtk0.a(null);
        this.w = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 25));
        this.x = new bpn0(new ac(this, 21));
        this.y = new bpn0(new f5(this, 28));
        this.z = new bpn0(new h13(8));
        this.A = v3pVar.b();
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a2, new n2g(this, null)), jVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a3, new o2g(this, null)), jVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a4, new p2g(this, null)), jVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(n3gVar.j(), new q2g(this, null)), jVar);
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
        View view = this.k;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            fyt0.i(viewGroup);
        }
        k3g k3gVar = this.v;
        if (k3gVar != null) {
            k3gVar.f(null);
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final void D(EditorState editorState) {
        Map<f5p, g5p> map = editorState.b;
        g5p g5pVar = map.get(ler.a);
        this.s.setValue(g5pVar instanceof edr ? (edr) g5pVar : null);
        g5p g5pVar2 = map.get(hg5.a);
        this.t.setValue(g5pVar2 instanceof ag5 ? (ag5) g5pVar2 : null);
        g5p g5pVar3 = map.get(k6g.a);
        this.u.setValue(g5pVar3 instanceof com.vk.photo.editor.features.colorgrading.a ? (com.vk.photo.editor.features.colorgrading.a) g5pVar3 : null);
    }

    @Override // xsna.m3p
    public final void G(w1g w1gVar) {
        w1g w1gVar2 = w1gVar;
        boolean z = w1gVar2 instanceof bc0;
        n3g n3gVar = this.c;
        c0a c0aVar = this.f;
        v3p v3pVar = this.e;
        if (z) {
            k3g k3gVar = this.v;
            if (k3gVar != null) {
                k3gVar.d(w1gVar2);
            }
            H();
            iik iikVar = (iik) c0aVar.h();
            if (iikVar != null) {
                iikVar.d(false);
            }
            v3pVar.n(v3pVar.x().getString(R.string.editor_tool_disabled_by_collage));
            if (w1gVar2.c == CollageAspectRatioFormat.CollageOriginal) {
                n3gVar.k(0, true);
            }
            k3g k3gVar2 = this.v;
            if (k3gVar2 != null) {
                fyt0.l(k3gVar2, v3pVar.m().equals(y2g.a));
            }
            new Handler(Looper.getMainLooper()).post(new u12(this, 6));
            return;
        }
        if (!(w1gVar2 instanceof gfp)) {
            throw new NoWhenBranchMatchedException();
        }
        gfp gfpVar = (gfp) w1gVar2;
        k3g k3gVar3 = this.v;
        if (k3gVar3 != null) {
            k3gVar3.d(gfpVar);
        }
        H();
        iik iikVar2 = (iik) c0aVar.h();
        if (iikVar2 != null) {
            iikVar2.d(true);
        }
        com.vk.photo.editor.ivm.collage.d dVar = n3gVar.c;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(CollageMessage.a.a);
        v3pVar.a();
        k3g k3gVar4 = this.v;
        if (k3gVar4 != null) {
            fyt0.l(k3gVar4, false);
        }
    }

    public final void H() {
        k3g k3gVar;
        k3g k3gVar2 = this.v;
        if (epx.d(k3gVar2 != null ? Float.valueOf(k3gVar2.getAlpha()) : null, 1.0f) || (k3gVar = this.v) == null) {
            return;
        }
        dne dneVar = new dne(this, 2);
        if (k3gVar.z) {
            dneVar.invoke();
        } else {
            k3gVar.A = dneVar;
        }
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof w1g)) {
            return null;
        }
        if (g5pVar2 != null ? g5pVar2 instanceof w1g : true) {
            return this.e.x().getString(R.string.editor_history_collage_undo);
        }
        return null;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return y2g.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new kq01();
    }

    @Override // xsna.m3p, xsna.d5p
    public final e5p i() {
        return (t2g) this.w.getValue();
    }

    @Override // xsna.m3p, xsna.d5p
    public final p4p j(p4p p4pVar) {
        y2g y2gVar;
        p4p.a aVar;
        e4p e4pVar;
        ArrayList<q4p> arrayList = p4pVar.a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            y2gVar = y2g.a;
            if (!hasNext) {
                aVar = null;
                break;
            }
            q4p q4pVar = (q4p) it.next();
            if (q4pVar instanceof p4p.a) {
                aVar = (p4p.a) q4pVar;
                if (epx.f(aVar.a, y2gVar) && (aVar.c instanceof w1g)) {
                    break;
                }
            }
        }
        if (aVar != null) {
            Params params = aVar.c;
            i4p i4pVar = ((EditorState) this.e.d().b.b.getValue()).a;
            if (i4pVar == null || (e4pVar = i4pVar.b) == null) {
                e4pVar = null;
            }
            if (e4pVar != null) {
                p4p.a aVar2 = new p4p.a(y2gVar, new b2g(e4pVar, new h9(this, 24), new com.vk.movika.sdk.base.presenter.b(this, 19)), params);
                p4p.a aVar3 = new p4p.a(y2gVar, new y1g(), params);
                ArrayList o = e43.o(aVar2);
                ArrayList o2 = e43.o(new p4p("pipeline-collage", o));
                for (q4p q4pVar2 : arrayList) {
                    if ((q4pVar2 instanceof p4p.a ? (p4p.a) q4pVar2 : null) != null) {
                        f5p f5pVar = ((p4p.a) q4pVar2).a;
                        if (!epx.f(f5pVar, hg5.a) && !epx.f(f5pVar, ler.a) && !epx.f(f5pVar, y2gVar)) {
                            o2.add(q4pVar2);
                        }
                    }
                }
                o.add(aVar3);
                return new p4p(o2);
            }
        }
        return p4pVar;
    }

    @Override // xsna.d5p
    public final void k() {
        e4p e4pVar;
        v3p v3pVar = this.e;
        v3pVar.b().b(CollageStatEvent.n.a);
        Context context = v3pVar.getBottom().getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.feature_collage_top, (ViewGroup) v3pVar.getTop(), false);
        v3pVar.getTop().addView(inflate);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btnDelete);
        this.o = imageButton;
        if (imageButton != null) {
            imageButton.setVisibility(4);
        }
        ImageButton imageButton2 = this.o;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new v6d(this, 1));
        }
        this.j = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.feature_collage_bottom, (ViewGroup) v3pVar.getBottom(), false);
        v3pVar.getBottom().addView(inflate2);
        ToolBottomView toolBottomView = (ToolBottomView) inflate2.findViewById(R.id.tool_bottom_view);
        toolBottomView.setOnCancelClickListener(new i70(this, 27));
        toolBottomView.setOnDoneClickListener(new i5(7, this, toolBottomView));
        Button button = (Button) inflate2.findViewById(R.id.tabGrid);
        button.setSelected(true);
        button.setOnClickListener(new sa6(this, 2));
        this.l = button;
        Button button2 = (Button) inflate2.findViewById(R.id.tabFormat);
        button2.setOnClickListener(new sa6(this, 2));
        this.m = button2;
        Button button3 = (Button) inflate2.findViewById(R.id.tabBorder);
        button3.setOnClickListener(new sa6(this, 2));
        this.n = button3;
        ViewGroup viewGroup = (ViewGroup) inflate2.findViewById(R.id.controls);
        n3g n3gVar = this.c;
        androidx.lifecycle.j jVar = this.d;
        vgu vguVar = new vgu(n3gVar, jVar, viewGroup);
        viewGroup.addView(vguVar.a);
        this.p = vguVar;
        b9s b9sVar = new b9s(n3gVar, jVar, viewGroup);
        View view = b9sVar.a;
        view.setVisibility(8);
        viewGroup.addView(view);
        this.q = b9sVar;
        e28 e28Var = new e28(n3gVar, jVar, this.A, viewGroup);
        View view2 = e28Var.a;
        view2.setVisibility(8);
        viewGroup.addView(view2);
        this.r = e28Var;
        k3g k3gVar = this.v;
        if (k3gVar != null) {
            k3gVar.setOnSlotClick(new b95(n3gVar, 3));
        }
        k3g k3gVar2 = this.v;
        if (k3gVar2 != null) {
            k3gVar2.setOnSlotsTransform(new w2g(2, n3gVar, n3g.class, "handleUserSlotTransform", "handleUserSlotTransform(Ljava/util/Map;Z)V", 0));
        }
        k3g k3gVar3 = this.v;
        if (k3gVar3 != null) {
            k3gVar3.setOnSlotTransformEnd(new mf8(n3gVar, 3));
        }
        k3g k3gVar4 = this.v;
        if (k3gVar4 != null) {
            k3gVar4.setOnSlotsLoadingStatusChange(new pf8(n3gVar, 2));
        }
        this.k = inflate2;
        k3g k3gVar5 = this.v;
        if (k3gVar5 != null) {
            fyt0.l(k3gVar5, true);
        }
        com.vk.photo.editor.ivm.d dVar = n3gVar.b;
        if (dVar == null) {
            dVar = null;
        }
        i4p i4pVar = ((EditorState) dVar.b.b.getValue()).a;
        if (i4pVar == null || (e4pVar = i4pVar.b) == null) {
            return;
        }
        com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
        if (dVar2 == null) {
            dVar2 = null;
        }
        Map<f5p, g5p> map = ((EditorState) dVar2.b.b.getValue()).b;
        y2g y2gVar = y2g.a;
        g5p g5pVar = map.get(y2gVar);
        if ((g5pVar instanceof w1g ? (w1g) g5pVar : null) instanceof gfp) {
            com.vk.photo.editor.ivm.d dVar3 = n3gVar.b;
            if (dVar3 == null) {
                dVar3 = null;
            }
            g5p g5pVar2 = ((EditorState) dVar3.b.b.getValue()).b.get(y2gVar);
            w1g w1gVar = g5pVar2 instanceof w1g ? (w1g) g5pVar2 : null;
            l3p.a("resizing", new wh9(n3gVar, e4pVar, w1gVar != null ? w1gVar.a : null, 1));
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean n() {
        k3g k3gVar = this.v;
        if (k3gVar == null) {
            return false;
        }
        l1t l1tVar = k3gVar.x;
        if (l1tVar == null) {
            l1tVar = null;
        }
        return !l1tVar.p.e.isEmpty();
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.m3p, xsna.d5p
    public final void onPause() {
        m2t.i iVar;
        k3g k3gVar = this.v;
        if (k3gVar == null || (iVar = k3gVar.p.c) == null) {
            return;
        }
        m2t.j jVar = m2t.l;
        synchronized (jVar) {
            iVar.d = true;
            jVar.notifyAll();
            while (!iVar.c && !iVar.e) {
                try {
                    m2t.l.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final void onResume() {
        k3g k3gVar = this.v;
        if (k3gVar != null) {
            GLCollageView gLCollageView = k3gVar.p;
            m2t.i iVar = gLCollageView.c;
            if (iVar != null) {
                m2t.j jVar = m2t.l;
                synchronized (jVar) {
                    iVar.d = false;
                    iVar.p = true;
                    iVar.q = false;
                    jVar.notifyAll();
                    while (!iVar.c && iVar.e && !iVar.q) {
                        try {
                            m2t.l.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            gLCollageView.b();
        }
    }

    @Override // xsna.d5p
    public final void p() {
        View view = this.k;
        v3p v3pVar = this.e;
        if (view != null) {
            v3pVar.getBottom().removeView(view);
            this.k = null;
        }
        View view2 = this.j;
        if (view2 != null) {
            v3pVar.getTop().removeView(view2);
            this.j = null;
        }
        this.c.m(null);
        k3g k3gVar = this.v;
        if (k3gVar != null) {
            fyt0.l(k3gVar, false);
        }
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof w1g)) {
            return null;
        }
        if (g5pVar2 != null ? g5pVar2 instanceof w1g : true) {
            return this.e.x().getString(R.string.editor_history_collage_redo);
        }
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Collage, R.style.EditorToolButton_Collage, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_collage));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super w1g> spjVar) {
        gfp gfpVar = this.i;
        if (epx.f(gfpVar.a, i4pVar != null ? i4pVar.b : null)) {
            return gfpVar;
        }
        return new gfp(i4pVar != null ? i4pVar.b : null);
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        return new b(context);
    }
}
