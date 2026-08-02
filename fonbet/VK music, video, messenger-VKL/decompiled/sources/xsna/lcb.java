package xsna;

import android.widget.ProgressBar;
import com.vk.catalog2.common.ui.holders.video.VideoOnboardingVh;
import com.vk.dto.newsfeed.entries.Post;
import xsna.h8n;
import xsna.zvn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lcb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lcb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((mcb) this.c).e = null;
                break;
            case 1:
                ((k5n) this.c).i0 = null;
                break;
            case 2:
                ((h8n.a) this.c).a();
                break;
            case 3:
                ((nvn0) this.c).n.b(zvn0.a.a);
                break;
            case 4:
                ((jn2) this.c).invoke();
                break;
            case 5:
                VideoOnboardingVh videoOnboardingVh = (VideoOnboardingVh) this.c;
                ProgressBar progressBar = videoOnboardingVh.l;
                if (progressBar == null) {
                    progressBar = null;
                }
                bwt0.p0(progressBar, false);
                videoOnboardingVh.q = null;
                break;
            default:
                eax0.w((Post) this.c);
                break;
        }
    }

    public /* synthetic */ lcb(eax0 eax0Var, Post post) {
        this.b = 6;
        this.c = post;
    }
}
