package xsna;

import android.view.View;
import com.ironsource.C4229ae;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.stat.NegotiationError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ch5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ch5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fh5 fh5Var = (fh5) this.c;
                fh5Var.h0((View) this.d);
                fh5Var.J0 = null;
                break;
            case 1:
                ((PeerConnectionClient) this.c).b((NegotiationError) this.d);
                break;
            case 2:
                c5d0 c5d0Var = (c5d0) this.c;
                PostingAttachment postingAttachment = (PostingAttachment) this.d;
                pcc0 pcc0Var = c5d0Var.d;
                if (pcc0Var != null) {
                    pcc0Var.O0(postingAttachment.nb(), false);
                    break;
                }
                break;
            default:
                C4229ae.a((RewardedAd) this.c, (C4229ae) this.d);
                break;
        }
    }
}
