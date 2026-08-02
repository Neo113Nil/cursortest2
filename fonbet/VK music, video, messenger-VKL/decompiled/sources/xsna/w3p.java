package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.views.ToolButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.c5p;

/* compiled from: EditorContainerImpl.kt */
/* loaded from: classes4.dex */
public final class w3p implements v3p {
    public final PhotoEditorView a;
    public d5p<g5p> b;
    public kkw m;
    public final nrk0 r;
    public ba00 s;
    public xdl t;
    public n4p u;
    public t6y0 v;
    public boolean w;
    public final h18 x;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();
    public final HashMap<f5p, String> f = new HashMap<>();
    public final LinkedHashSet g = new LinkedHashSet();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final LinkedHashMap<f5p, ToolButton> j = new LinkedHashMap<>();
    public final LinkedHashMap k = new LinkedHashMap();
    public final ArrayList l = new ArrayList();
    public final int n = 4032;
    public final com.vk.photo.editor.ivm.d o = new com.vk.photo.editor.ivm.d(new dnh(this, 15), new p5h(this, 13));
    public final zdl p = new zdl(new t2l(this, 6), new yce(this, 17), new kbe(this, 17), new t98(new q5f(this, 15), new enh(this, 11)));
    public final ov10 q = new ov10();

    public w3p(PhotoEditorView photoEditorView) {
        this.a = photoEditorView;
        c5p.a.getClass();
        c5p.a.C2642a c2642a = c5p.a.b;
        nrk0 nrk0Var = new nrk0();
        nrk0Var.b = c2642a;
        this.r = nrk0Var;
        h18 h18Var = new h18();
        h18Var.b = null;
        h18Var.c = null;
        this.x = h18Var;
    }

    @Override // xsna.v3p
    public final void a() {
        this.a.t();
    }

    @Override // xsna.v3p
    public final nrk0 b() {
        return this.r;
    }

    @Override // xsna.v3p
    public final boolean c(boolean z) {
        return this.a.p(z);
    }

    @Override // xsna.v3p
    public final com.vk.photo.editor.ivm.d d() {
        return this.o;
    }

    @Override // xsna.v3p
    public final h18 e() {
        return this.x;
    }

    @Override // xsna.v3p
    public final h4x f() {
        return this.a.getInsets();
    }

    @Override // xsna.v3p
    public final c0a g(f5p f5pVar) {
        return new c0a(this, f5pVar);
    }

    @Override // xsna.v3p
    public final FrameLayout getBottom() {
        return this.a.getBottomPanelLayout$android_release();
    }

    @Override // xsna.v3p
    public final n4p getLogger() {
        return this.u;
    }

    @Override // xsna.v3p
    public final FrameLayout getTop() {
        return this.a.getTopPanelLayout$android_release();
    }

    @Override // xsna.v3p
    public final PhotoEditorView getView() {
        return this.a;
    }

    @Override // xsna.v3p
    public final wyt0 getViewModelStore() {
        wyt0 viewModelStore$android_release = this.a.getViewModelStore$android_release();
        if (viewModelStore$android_release != null) {
            return viewModelStore$android_release;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.v3p
    public final h4x h() {
        return this.a.getWorkspaceInsets$android_release();
    }

    @Override // xsna.v3p
    public final zdl i() {
        return this.p;
    }

    @Override // xsna.v3p
    public final View j() {
        return this.m.getView();
    }

    @Override // xsna.v3p
    public final void k() {
        myc0.i(EmptyCoroutineContext.b, new i7a0(this.a, null));
    }

    @Override // xsna.v3p
    public final FrameLayout l() {
        return this.a.getWorkspaceOverlayLayout$android_release();
    }

    @Override // xsna.v3p
    public final f5p m() {
        f5p id;
        d5p<g5p> d5pVar = this.b;
        return (d5pVar == null || (id = d5pVar.getId()) == null) ? i470.a : id;
    }

    @Override // xsna.v3p
    public final void n(String str) {
        this.a.s(str);
    }

    @Override // xsna.v3p
    public final void o(long j, String str) {
        this.a.L(str, j, null);
    }

    @Override // xsna.v3p
    public final void p(boolean z) {
        PhotoEditorView photoEditorView = this.a;
        FrameLayout frameLayout = photoEditorView.d;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (z) {
            layoutParams.height = -2;
            frameLayout.setMinimumHeight(photoEditorView.s);
        } else {
            layoutParams.height = (int) Math.floor(8 * Resources.getSystem().getDisplayMetrics().density);
            frameLayout.setMinimumHeight(0);
        }
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // xsna.v3p
    public final ba00 q() {
        ba00 ba00Var = this.s;
        if (ba00Var == null) {
            return null;
        }
        return ba00Var;
    }

    @Override // xsna.v3p
    public final ov10 r() {
        return this.q;
    }

    @Override // xsna.v3p
    public final void s(g5p g5pVar) {
        j7a0 j7a0Var = this.a.E;
        if (j7a0Var == null) {
            j7a0Var = null;
        }
        com.vk.photo.editor.ivm.d dVar = j7a0Var.c;
        (dVar != null ? dVar : null).a(new EditorMessage.i(g5pVar, EditorMessage.Source.UserInput, 4));
    }

    @Override // xsna.v3p
    public final t6y0 t() {
        t6y0 t6y0Var = this.v;
        if (t6y0Var == null) {
            return null;
        }
        return t6y0Var;
    }

    @Override // xsna.v3p
    public final b4p u() {
        xdl xdlVar = this.t;
        if (xdlVar == null) {
            return null;
        }
        return xdlVar;
    }

    @Override // xsna.v3p
    public final FrameLayout v() {
        return this.a.getOverBottomPanelLayout$android_release();
    }

    @Override // xsna.v3p
    public final PhotoEditorView w() {
        return this.a;
    }

    @Override // xsna.v3p
    public final Context x() {
        return this.a.getContext();
    }
}
