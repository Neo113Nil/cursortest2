package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import java.util.Iterator;
import org.json.JSONObject;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.participant.CallParticipant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class i09 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i09(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.vk.clips.interests.impl.ui.ClipsInterestsViewState$d, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((Call) this.c).a((CallParticipant.ParticipantId) this.d, (JSONObject) this.e);
                break;
            case 1:
                mqj mqjVar = (mqj) this.c;
                op1 op1Var = (op1) this.d;
                ?? r2 = (ClipsInterestsViewState.d) this.e;
                Iterator<T> it = mqjVar.b.iterator();
                while (it.hasNext()) {
                    wtt0 wtt0Var = (wtt0) it.next();
                    T t = wtt0Var.c;
                    if (t == 0 || wtt0Var.b(t, r2)) {
                        wtt0Var.a(t, r2);
                    }
                    wtt0Var.c = r2;
                }
                op1Var.invoke(r2);
                break;
            case 2:
                wx20 wx20Var = (wx20) this.c;
                View view = (View) this.d;
                e520 e520Var = (e520) this.e;
                wx20Var.d();
                if (wx20Var.e()) {
                    wx20Var.f(view.getContext(), e520Var);
                    break;
                }
                break;
            default:
                ((q290) this.c).a((Context) this.d, (n0) this.e);
                break;
        }
    }
}
