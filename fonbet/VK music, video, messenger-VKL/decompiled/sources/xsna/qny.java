package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.ui.components.viewcontrollers.msg_list.stb.ScrollToBottomAnimator;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qny implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qny(ScrollToBottomAnimator scrollToBottomAnimator, View view, izs izsVar) {
        this.b = 1;
        this.d = scrollToBottomAnimator;
        this.c = view;
        this.e = izsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                View view = (View) this.c;
                rny rnyVar = (rny) this.d;
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.e;
                view.setAlpha(1.0f);
                rnyVar.h(e0Var);
                rny.H(e0Var, true);
                break;
            case 1:
                ScrollToBottomAnimator scrollToBottomAnimator = (ScrollToBottomAnimator) this.d;
                View view2 = (View) this.c;
                izs izsVar = (izs) this.e;
                scrollToBottomAnimator.d(view2);
                izsVar.invoke(view2);
                break;
            case 2:
                ((Signaling) this.c).b((Signaling.Listener) this.d, (JSONObject) this.e);
                break;
            default:
                srl0 srl0Var = (srl0) this.c;
                UserId userId = (UserId) this.d;
                io.reactivex.rxjava3.core.a n = srl0Var.b.n(userId, (StoriesContainer) this.e, null);
                Context context = srl0Var.a;
                ver0.c(context, hg1.l(n, context, 62).subscribe(new ki00(1, userId, srl0Var), new o7y(new ut30(srl0Var, 21), 18)));
                break;
        }
    }

    public /* synthetic */ qny(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
