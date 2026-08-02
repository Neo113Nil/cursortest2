package xsna;

import android.text.Editable;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hsg0 implements b680, amo0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hsg0(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.amo0
    public void a(Editable editable, imo0 imo0Var) {
        StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.b;
        xlo0 xlo0Var = (xlo0) this.c;
        t9l0 t9l0Var = (t9l0) this.d;
        if (editable == null || editable.length() == 0) {
            stickersDrawingViewGroup.t(xlo0Var);
        } else {
            xlo0Var.q(imo0Var, editable);
            t9l0Var.a.setLastTextStickerInfo(imo0Var);
            t9l0Var.b.o5().k();
        }
        i0q0.d(100L, new u69(6, xlo0Var, stickersDrawingViewGroup));
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        lsg0 lsg0Var = (lsg0) this.b;
        wrw wrwVar = (wrw) this.c;
        io.reactivex.rxjava3.core.b bVar = (io.reactivex.rxjava3.core.b) this.d;
        lsg0Var.d.l("fail to update from gms:" + wrwVar);
        bVar.onError(th);
    }
}
