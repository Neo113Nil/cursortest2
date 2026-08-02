package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.b;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.holder.LoadingState;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError;
import com.vk.stories.StoriesVideoEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import ru.ok.android.webrtc.PeerConnectionClient;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class at6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ at6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("detail", (JSONObject) obj);
                String str = "window.dispatchEvent(new CustomEvent('VKWebAppEvent', " + jSONObject + "));";
                WebView r = ((bt6) obj2).r();
                if (r != null) {
                    nr2.J(r, "javascript:" + str);
                    break;
                }
                break;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                Iterator it = ((b.g) obj2).c.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((b.h) it.next()).a;
                    View view = operation.c.getView();
                    if (view != null) {
                        operation.a.a(view, viewGroup);
                    }
                }
                break;
            case 2:
                ((crl) obj2).h.a(VideoFrameProcessingException.a(C.TIME_UNSET, (InterruptedException) obj));
                break;
            case 3:
                fum fumVar = (fum) obj2;
                Boolean bool = (Boolean) obj;
                fum.t = null;
                RecyclerView recyclerView = fumVar.i;
                uej.a((recyclerView != null ? recyclerView : null).getContext(), new wnh(fumVar, 9), bool.booleanValue());
                break;
            case 4:
                iwq iwqVar = (iwq) obj2;
                Throwable th = (Throwable) obj;
                LinkedHashSet linkedHashSet = iwqVar.u;
                if (!linkedHashSet.contains(th)) {
                    linkedHashSet.add(th);
                    iwqVar.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError(iwqVar.u(th))));
                    break;
                }
                break;
            case 5:
                int i2 = avr.j;
                ((avr) obj2).f((ImageView) obj);
                break;
            case 6:
                LoadingState loadingState = (LoadingState) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                jid0 jid0Var = ((GoodFragment) obj2).Po().G;
                if (jid0Var != null) {
                    jid0Var.z0(loadingState);
                    break;
                }
                break;
            case 7:
                ((PeerConnectionClient) obj2).b((IceCandidate[]) obj);
                break;
            case 8:
                StoriesVideoEncoder storiesVideoEncoder = (StoriesVideoEncoder) obj2;
                storiesVideoEncoder.k.set(null);
                storiesVideoEncoder.e.onError((Throwable) obj);
                break;
            case 9:
                ArrayList arrayList = (ArrayList) obj2;
                ftn0 ftn0Var = (ftn0) obj;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it2.next();
                    View view2 = e0Var.itemView;
                    ViewPropertyAnimator animate = view2.animate();
                    ftn0Var.A.add(e0Var);
                    animate.alpha(1.0f).setDuration(ftn0Var.c).setListener(new gtn0(view2, animate, e0Var, ftn0Var)).start();
                }
                arrayList.clear();
                ftn0Var.x.remove(arrayList);
                break;
            case 10:
                ((yads.ao0) obj2).a((yads.do0) obj);
                break;
            case 11:
                ((yads.cl) obj2).c((Exception) obj);
                break;
            default:
                ((yads.gk3) obj2).a((Exception) obj);
                break;
        }
    }
}
