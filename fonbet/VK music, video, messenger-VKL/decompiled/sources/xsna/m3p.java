package xsna;

import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.ToolButton;
import java.util.Map;
import xsna.d5p;
import xsna.g5p;

/* compiled from: EditorBaseTool.kt */
/* loaded from: classes4.dex */
public abstract class m3p<Params extends g5p> implements d5p<Params> {
    public Params b;

    @Override // xsna.d5p
    public Map<f5p, d5p.a<?>> E() {
        return jgp.b;
    }

    public abstract void G(Params params);

    @Override // xsna.d5p
    public boolean a0() {
        return false;
    }

    @Override // xsna.d5p
    public boolean f(ToolButton toolButton, Map map) {
        return false;
    }

    @Override // xsna.d5p
    public e5p i() {
        return null;
    }

    @Override // xsna.d5p
    public rij m() {
        return rij.e;
    }

    @Override // xsna.d5p
    public boolean n() {
        return false;
    }

    @Override // xsna.d5p
    public boolean o() {
        return false;
    }

    @Override // xsna.d5p
    public final void y(Params params) {
        if (params.equals(this.b)) {
            return;
        }
        this.b = params;
        G(params);
    }

    @Override // xsna.d5p
    public void C() {
    }

    @Override // xsna.d5p
    public void onPause() {
    }

    @Override // xsna.d5p
    public void onResume() {
    }

    @Override // xsna.d5p
    public void q() {
    }

    @Override // xsna.d5p
    public void B(i4p i4pVar) {
    }

    @Override // xsna.d5p
    public void D(EditorState editorState) {
    }

    @Override // xsna.d5p
    public p4p j(p4p p4pVar) {
        return p4pVar;
    }
}
