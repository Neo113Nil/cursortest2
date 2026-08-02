package xsna;

import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Stack;

/* compiled from: ClipsTemplatesFlowNavigatorImpl.kt */
/* loaded from: classes.dex */
public final class e9f implements d9f {
    public boolean b;
    public boolean c;
    public final io.reactivex.rxjava3.subjects.d<TemplatesFlowScreen> a = io.reactivex.rxjava3.subjects.d.O0(TemplatesFlowScreen.UNDEFINED);
    public boolean d = true;
    public final Stack<TemplatesFlowScreen> e = new Stack<>();

    @Override // xsna.d9f
    public final void a(TemplatesFlowScreen templatesFlowScreen) {
        if (this.d) {
            StringBuilder sb = new StringBuilder("begin screen = ");
            sb.append(templatesFlowScreen);
            sb.append(" path = ");
            Stack<TemplatesFlowScreen> stack = this.e;
            sb.append(stack);
            sb.append(" flowSuccess = ");
            sb.append(this.c);
            sb.append(" flowRunning = ");
            sb.append(this.b);
            sb.append(" removeOnDestroy = ");
            sb.append(this.d);
            L.e("TemplateFlow", sb.toString());
            boolean z = this.c;
            io.reactivex.rxjava3.subjects.d<TemplatesFlowScreen> dVar = this.a;
            if (z && this.b) {
                if (stack.isEmpty()) {
                    this.b = false;
                    dVar.onNext(TemplatesFlowScreen.UNDEFINED);
                } else {
                    dVar.onNext(stack.pop());
                    if (stack.isEmpty()) {
                        this.b = false;
                        dVar.onNext(TemplatesFlowScreen.UNDEFINED);
                    }
                }
            } else if (stack.isEmpty()) {
                this.b = false;
                dVar.onNext(TemplatesFlowScreen.UNDEFINED);
            } else {
                TemplatesFlowScreen pop = stack.pop();
                TemplatesFlowScreen peek = !stack.isEmpty() ? stack.peek() : null;
                if ((pop == TemplatesFlowScreen.EDITOR && peek == TemplatesFlowScreen.CLIP_FEED) || ((pop == TemplatesFlowScreen.CATALOG && peek == TemplatesFlowScreen.CAMERA) || (pop == TemplatesFlowScreen.PREVIEW && peek == TemplatesFlowScreen.MUSIC_GRID))) {
                    stack.clear();
                    this.b = false;
                }
            }
            L.e("TemplateFlow", "end screen = " + templatesFlowScreen + " path = " + stack + " flowSuccess = " + this.c + " flowRunning = " + this.b + " removeOnDestroy = " + this.d);
        }
    }

    @Override // xsna.d9f
    public final void b(boolean z) {
        this.d = z;
    }

    @Override // xsna.d9f
    public final boolean c(TemplatesFlowScreen templatesFlowScreen) {
        return this.e.contains(templatesFlowScreen);
    }

    @Override // xsna.d9f
    public final io.reactivex.rxjava3.core.q<Boolean> d(TemplatesFlowScreen templatesFlowScreen) {
        boolean z = this.b;
        Stack<TemplatesFlowScreen> stack = this.e;
        if (!z) {
            L.e("TemplateFlow", "removeOnDestroy = " + this.d + " flowRunning = false screen = " + templatesFlowScreen + " path = " + stack);
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        if (!stack.contains(templatesFlowScreen)) {
            stack.push(templatesFlowScreen);
        }
        L.e("TemplateFlow", "removeOnDestroy = " + this.d + " flowRunning = true after screen = " + templatesFlowScreen + " path = " + stack);
        q40 q40Var = new q40(new pe1(12), 8);
        io.reactivex.rxjava3.subjects.d<TemplatesFlowScreen> dVar = this.a;
        dVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, q40Var), new com.vk.movika.sdk.base.hooks.k(new yve(templatesFlowScreen, 1), 12));
        i22 i22Var = new i22(new oj(10), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return i0Var.E(i22Var, lVar, kVar, kVar).U(new tr(new f57(7), 8));
    }

    @Override // xsna.d9f
    public final void e(String str) {
        this.e.clear();
        L.e("TemplateFlow", "start = ".concat(str));
        this.b = true;
        this.c = false;
    }

    @Override // xsna.d9f
    public final void f() {
        this.c = true;
        StringBuilder sb = new StringBuilder("removeOnDestroy = ");
        sb.append(this.d);
        sb.append(" path = ");
        Stack<TemplatesFlowScreen> stack = this.e;
        sb.append(stack);
        L.e("TemplateFlow", sb.toString());
        if (stack.isEmpty()) {
            L.l("TemplateFlow", "flow it empty but success signal flowRunning = " + this.b);
        } else {
            TemplatesFlowScreen pop = stack.pop();
            L.e("TemplateFlow", "screen = " + pop);
            this.a.onNext(pop);
        }
    }
}
