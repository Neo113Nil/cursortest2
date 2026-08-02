package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.Html5Entry;
import java.lang.ref.WeakReference;

/* compiled from: NewsfeedHtml5BlockLoader.kt */
/* loaded from: classes4.dex */
public final class rl60 implements zjf0<ol60> {
    public final k7z b;

    public rl60(k7z k7zVar) {
        this.b = k7zVar;
    }

    @Override // xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        ehv ehvVar;
        ol60 ol60Var2 = ol60Var;
        if ((e0Var instanceof chv) && (ol60Var2 instanceof z1c0)) {
            u1c0 u1c0Var = ((z1c0) ol60Var2).h;
            if (!(u1c0Var.a instanceof Html5Entry) || (ehvVar = (ehv) this.b.invoke()) == null) {
                return;
            }
            ehvVar.l((chv) e0Var, (Html5Entry) u1c0Var.a);
        }
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
        ehv ehvVar;
        if (!(e0Var instanceof chv) || (ehvVar = (ehv) this.b.invoke()) == null) {
            return;
        }
        ehvVar.h.add(new WeakReference<>(e0Var));
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
    }
}
