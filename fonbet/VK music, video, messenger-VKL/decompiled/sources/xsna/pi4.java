package xsna;

import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.oi4;

/* compiled from: AudioBookPersonReducer.kt */
/* loaded from: classes3.dex */
public final class pi4 extends dm50<ui4, oi4, ri4> {
    @Override // xsna.dm50
    public final ri4 c(ri4 ri4Var, oi4 oi4Var) {
        ri4 ri4Var2 = ri4Var;
        oi4 oi4Var2 = oi4Var;
        if (oi4Var2 instanceof oi4.b) {
            List<AudioBookPersonModel> list = ((oi4.b) oi4Var2).b;
            List<vh4> list2 = ri4Var2.c;
            ri4Var2.getClass();
            return new ri4(list, list2);
        }
        if (!(oi4Var2 instanceof oi4.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<vh4> list3 = ((oi4.a) oi4Var2).b;
        List<AudioBookPersonModel> list4 = ri4Var2.b;
        ri4Var2.getClass();
        return new ri4(list4, list3);
    }

    @Override // xsna.dm50
    public final ui4 d() {
        return new ui4(e(new pt(7)), e(new qt(5)));
    }

    @Override // xsna.dm50
    public final void h(ri4 ri4Var, ui4 ui4Var) {
        ri4 ri4Var2 = ri4Var;
        ui4 ui4Var2 = ui4Var;
        if (ri4Var2.b != null) {
            f(ui4Var2.a, ri4Var2);
        } else if (ri4Var2.c != null) {
            f(ui4Var2.b, ri4Var2);
        }
    }
}
