package xsna;

import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.collage.CollageMessage;
import java.util.Map;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: CollageViewModel.kt */
/* loaded from: classes4.dex */
public final class n3g extends vy1 {
    public com.vk.photo.editor.ivm.collage.d c;
    public u3p d;
    public gzs<? extends b4p> e;
    public c5p f;
    public boolean g;
    public Map<n2k0, Boolean> h = jgp.b;

    /* compiled from: CollageViewModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditorMessage.Source.values().length];
            try {
                iArr[EditorMessage.Source.UserInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static bc0 i(com.vk.photo.editor.ivm.d dVar) {
        g5p g5pVar = ((EditorState) dVar.b.b.getValue()).b.get(y2g.a);
        if (g5pVar instanceof bc0) {
            return (bc0) g5pVar;
        }
        return null;
    }

    public final ttk0<com.vk.photo.editor.ivm.collage.c> j() {
        com.vk.photo.editor.ivm.collage.d dVar = this.c;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.b;
    }

    public final void k(int i, boolean z) {
        m(null);
        CollageAspectRatioFormat collageAspectRatioFormat = a3g.a.get(i).c;
        if (!z) {
            c5p c5pVar = this.f;
            if (c5pVar == null) {
                c5pVar = null;
            }
            c5pVar.b(new CollageStatEvent.e(ehk.a(collageAspectRatioFormat)));
        }
        com.vk.photo.editor.ivm.d dVar = this.b;
        com.vk.photo.editor.ivm.d dVar2 = dVar != null ? dVar : null;
        if (dVar == null) {
            dVar = null;
        }
        i4p i4pVar = ((EditorState) dVar.b.b.getValue()).a;
        dVar2.a(new EditorMessage.h(i4pVar != null ? i4p.a(i4pVar, Float.valueOf(collageAspectRatioFormat.i())) : null));
        com.vk.photo.editor.ivm.d dVar3 = this.b;
        if (dVar3 == null) {
            dVar3 = null;
        }
        bc0 i2 = i(dVar3);
        if (i2 != null) {
            com.vk.photo.editor.ivm.d dVar4 = this.b;
            if (dVar4 == null) {
                dVar4 = null;
            }
            dVar4.a(new EditorMessage.i(w1g.a(i2, null, collageAspectRatioFormat, null, null, null, null, null, 251), null, 6));
        }
    }

    public final void l(com.vk.photo.editor.ivm.d dVar, u3p u3pVar, ng1 ng1Var, c5p c5pVar) {
        fai.t(this);
        this.c = new com.vk.photo.editor.ivm.collage.d(new com.vk.photo.editor.ivm.collage.b(new com.vk.photo.editor.ivm.collage.c(0)));
        this.b = dVar;
        this.d = u3pVar;
        this.e = ng1Var;
        this.f = c5pVar;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(dVar.b, new o3g(this, null));
        rvf t = fai.t(this);
        bdn bdnVar = bdn.a;
        rsr.s(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, zvj.g(t, wgl.c));
    }

    public final void m(n2k0 n2k0Var) {
        if (epx.f(((com.vk.photo.editor.ivm.collage.c) ((b8f0) j()).b.getValue()).h, n2k0Var)) {
            n2k0Var = null;
        }
        com.vk.photo.editor.ivm.collage.d dVar = this.c;
        (dVar != null ? dVar : null).a(new CollageMessage.b(n2k0Var));
    }
}
