package xsna;

import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4339gg;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.tensorflow.tflite.Model;
import xsna.acs0;
import xsna.q1d0;
import xsna.y7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class o63 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o63(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<n7f> list;
        View view;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.ui.r) obj).invoke();
                break;
            case 1:
                FrameLayout frameLayout = ((ynb) obj).p;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    break;
                }
                break;
            case 2:
                y7f.d dVar = y7f.o;
                z7f B = ((y7f) obj).B();
                if (B != null && (list = B.d) != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = ((n7f) it.next()).c;
                        String str = clipsTemplateEditorVideoItem != null ? clipsTemplateEditorVideoItem.b : null;
                        Regex regex = com.vk.core.files.a.a;
                        vhk0.c(str);
                    }
                    break;
                }
                break;
            case 3:
                View view2 = ((wej) obj).n;
                d3m.c(view2 != null ? view2 : null, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 4:
                c4u0 c4u0Var = ((evs) obj).E;
                awt0.v(c4u0Var.x, true);
                awt0.v(c4u0Var.c, false);
                break;
            case 5:
                ((RecyclerView) obj).smoothScrollBy(-1, 0);
                break;
            case 6:
                ((p0t) obj).cancel(true);
                break;
            case 7:
                ((s820) obj).g = true;
                break;
            case 8:
                ((Model) obj).lambda$initConvertShader$0();
                break;
            case 9:
                e840 e840Var = e840.this;
                e840Var.e.e(e840Var.t);
                break;
            case 10:
                ((ib80) obj).p();
                break;
            case 11:
                ((PeerConnectionClient) obj).j();
                break;
            case 12:
                q1d0 q1d0Var = (q1d0) obj;
                q1d0Var.t = false;
                q1d0Var.v = C.TIME_UNSET;
                q1d0Var.z = false;
                Pair<o1d0, q1d0.b> pair = q1d0Var.x;
                if (pair != null) {
                    q1d0Var.k.h(((o1d0) pair.first).b);
                    q1d0Var.x = null;
                }
                q1d0Var.t();
                q1d0Var.s.removeCallbacksAndMessages(null);
                break;
            case 13:
                acs0.c cVar = ((acs0) obj).p;
                if (cVar != null && (view = cVar.a) != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 14:
                C4339gg.a((gzs) obj);
                break;
            default:
                ((com.ironsource.sdk.controller.v) obj).C();
                break;
        }
    }
}
