package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.stories.ImStoryState;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hmm implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hmm(RecyclerView.e0 e0Var, Object obj, int i) {
        this.b = i;
        this.c = e0Var;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                jmm jmmVar = (jmm) this.c;
                jmmVar.l.K(jmmVar.t, (ImStoryState) this.d, new WeakReference<>(view));
                break;
            default:
                yads.ns1.b((yads.ns1) this.c, (yads.y90) this.d, view);
                break;
        }
    }
}
