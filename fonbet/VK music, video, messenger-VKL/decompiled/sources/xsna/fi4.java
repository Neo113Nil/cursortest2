package xsna;

import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ei4;
import xsna.oi4;
import xsna.uh4;

/* compiled from: AudioBookPersonFeature.kt */
/* loaded from: classes3.dex */
public final class fi4 extends wk50<ui4, ri4, uh4, oi4> {
    public final f4z f;

    public fi4(pi4 pi4Var) {
        super(uh4.c.b, pi4Var);
        this.f = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(ri4 ri4Var, uh4 uh4Var) {
        xl50 aVar;
        ri4 ri4Var2 = ri4Var;
        uh4 uh4Var2 = uh4Var;
        List<AudioBookPersonModel> list = ri4Var2.b;
        if (uh4Var2.equals(uh4.c.b)) {
            if (list != null) {
                aVar = new oi4.b(list);
            } else {
                List<vh4> list2 = ri4Var2.c;
                if (list2 == null) {
                    throw new IllegalStateException("AudioBookPersonPatch cannot be empty");
                }
                aVar = new oi4.a(list2);
            }
            T(aVar);
            return;
        }
        boolean equals = uh4Var2.equals(uh4.b.b);
        f4z f4zVar = this.f;
        if (equals) {
            f4zVar.b(ei4.a.a);
            return;
        }
        if (uh4Var2.equals(uh4.d.b)) {
            f4zVar.b(ei4.c.a);
            return;
        }
        if (!(uh4Var2 instanceof uh4.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AudioBookPersonModel audioBookPersonModel = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AudioBookPersonModel) next).b == ((uh4.a) uh4Var2).b) {
                    audioBookPersonModel = next;
                    break;
                }
            }
            audioBookPersonModel = audioBookPersonModel;
        }
        if (audioBookPersonModel == null || !audioBookPersonModel.e) {
            f4zVar.b(new ei4.b(((uh4.a) uh4Var2).b));
        } else {
            f4zVar.b(ei4.d.a);
        }
    }
}
