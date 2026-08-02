package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.Iterator;
import xsna.kck0;

/* compiled from: MusicSnippetsFeature.kt */
/* loaded from: classes3.dex */
public final class m650 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m650(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                eck0 eck0Var = ((l650) this.c).h;
                jck0 jck0Var = ((l650) this.d).j;
                ry40 state = eck0Var.c.getState();
                jck0Var.getClass();
                if (!state.j()) {
                    Iterator it = jck0Var.b.iterator();
                    while (it.hasNext()) {
                        ((kck0.a) it.next()).s1(true);
                    }
                }
                break;
            default:
                ((izs) this.c).invoke((MusicDto) this.d);
                break;
        }
        return s3q0.a;
    }
}
