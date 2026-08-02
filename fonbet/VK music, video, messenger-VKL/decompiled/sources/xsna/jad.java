package xsna;

import com.vk.attachpicker.screen.i;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.music.player.StartPlaySimilarTracksSource;
import com.vk.music.player.StartPlaySource;
import com.vk.photo.editor.PhotoEditorView;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.k840;
import xsna.ljk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jad implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jad(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        utk0 utk0Var;
        switch (this.b) {
            case 0:
                nad nadVar = (nad) this.c;
                if (fkq0.d(nadVar.f.I0())) {
                    VkCell vkCell = nadVar.i;
                    if (vkCell == null) {
                        vkCell = null;
                    }
                    bwt0.p0(vkCell, true);
                }
                VkCell vkCell2 = nadVar.j;
                if (vkCell2 == null) {
                    vkCell2 = null;
                }
                bwt0.p0(vkCell2, true);
                VkCell vkCell3 = nadVar.k;
                if (vkCell3 == null) {
                    vkCell3 = null;
                }
                bwt0.p0(vkCell3, true);
                CircularProgressView circularProgressView = nadVar.l;
                bwt0.p0(circularProgressView != null ? circularProgressView : null, false);
                break;
            case 1:
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) this.c;
                PhotoEditorView photoEditorView = hVar.x;
                hVar.y = new i.a((photoEditorView == null || (utk0Var = photoEditorView.L) == null) ? false : ((Boolean) utk0Var.getValue()).booleanValue());
                qv20.b(hVar.B);
                hVar.B = null;
                break;
            case 2:
                ((io.reactivex.rxjava3.subjects.f) this.c).onNext(Boolean.FALSE);
                break;
            case 3:
                ((zrz) this.c).c();
                break;
            case 4:
                StartPlaySource startPlaySource = (StartPlaySource) this.c;
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                r5v0Var.b(new igp0(((StartPlaySimilarTracksSource) startPlaySource).c.c, false));
                break;
            case 5:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ((Ref$ObjectRef) this.c).element;
                if (cVar != null) {
                    cVar.dispose();
                    break;
                }
                break;
            default:
                pjk0 pjk0Var = (pjk0) this.c;
                a2e0 a2e0Var = pjk0Var.d;
                if (a2e0Var != null) {
                    a2e0Var.a();
                }
                pjk0Var.d = null;
                pjk0Var.c = null;
                if (pjk0Var.g) {
                    pjk0Var.e = false;
                }
                pjk0Var.i = ljk0.b.a;
                break;
        }
    }
}
