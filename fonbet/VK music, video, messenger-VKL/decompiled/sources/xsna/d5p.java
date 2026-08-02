package xsna;

import android.content.Context;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.ToolButton;
import java.util.Map;
import xsna.g5p;

/* compiled from: EditorTool.kt */
/* loaded from: classes4.dex */
public interface d5p<Params extends g5p> {

    /* compiled from: EditorTool.kt */
    public interface a<Params extends g5p> {
        d5p<Params> a(v3p v3pVar);
    }

    default Map<f5p, a<?>> E() {
        return jgp.b;
    }

    default boolean a0() {
        return false;
    }

    String e(g5p g5pVar, g5p g5pVar2);

    default boolean f(ToolButton toolButton, Map map) {
        return false;
    }

    f5p getId();

    h5p<Params> getRenderer();

    default e5p i() {
        return null;
    }

    void k();

    default rij m() {
        return rij.e;
    }

    default boolean n() {
        return false;
    }

    default boolean o() {
        return false;
    }

    void p();

    String r(g5p g5pVar, g5p g5pVar2);

    ToolButton s(Context context);

    Object u(i4p i4pVar, spj<? super Params> spjVar);

    void y(Params params);

    default void C() {
    }

    default void onPause() {
    }

    default void onResume() {
    }

    default void q() {
    }

    default void B(i4p i4pVar) {
    }

    default void D(EditorState editorState) {
    }

    default p4p j(p4p p4pVar) {
        return p4pVar;
    }
}
