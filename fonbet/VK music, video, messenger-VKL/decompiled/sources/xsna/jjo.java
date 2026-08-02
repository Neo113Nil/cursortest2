package xsna;

import com.vk.photo.editor.ivm.EditorState;
import java.util.Collections;
import java.util.Map;

/* compiled from: DrawViewModel.kt */
/* loaded from: classes4.dex */
public final class jjo extends vy1 {
    public iio c;
    public boolean d;

    public final void i(int i, com.vk.photo.editor.ivm.d dVar, boolean z) {
        vlo vloVar;
        this.b = dVar;
        this.d = z;
        bo00 j = j(dVar);
        if (j == null || (vloVar = j.a()) == null) {
            vloVar = new vlo((kif0) null, 3);
        }
        this.c = new iio(new gio(new hio(new x5g(i, false), Collections.singletonList(vloVar), 109)));
    }

    public final bo00 j(com.vk.photo.editor.ivm.d dVar) {
        Map<f5p, g5p> map = ((EditorState) dVar.b.b.getValue()).b;
        if (this.d) {
            g5p g5pVar = map.get(uf10.a);
            if (g5pVar instanceof bo00) {
                return (bo00) g5pVar;
            }
            return null;
        }
        g5p g5pVar2 = map.get(hjo.a);
        if (g5pVar2 instanceof bo00) {
            return (bo00) g5pVar2;
        }
        return null;
    }
}
