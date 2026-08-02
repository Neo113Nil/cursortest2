package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.vjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f9p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f9p(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context mo2getContext;
        switch (this.b) {
            case 0:
                ((EffectHolder) this.c).lambda$pushImage$21((EffectNativeSink) this.d, (Bitmap) this.e);
                break;
            case 1:
                enc0 enc0Var = (enc0) this.c;
                xai0 xai0Var = (xai0) this.d;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.e;
                PostingFragment postingFragment = enc0Var.b;
                if (postingFragment.isAdded() && (mo2getContext = postingFragment.mo2getContext()) != null) {
                    joc0 joc0Var = new joc0(mo2getContext);
                    int itemCount = xai0Var.getItemCount() - 1;
                    if (itemCount < 0) {
                        itemCount = 0;
                    }
                    joc0Var.setTargetPosition(itemCount);
                    linearLayoutManager.startSmoothScroll(joc0Var);
                    break;
                }
                break;
            default:
                siz0 siz0Var = (siz0) this.c;
                String str = (String) this.d;
                if (!siz0Var.b(str, (vjz0.a) this.e)) {
                    siz0Var.a(str, (String) new hhz0().d(str, null, null).c);
                    break;
                } else {
                    gu8.c(null, "VideoLoader: can't load. Video already loading");
                    break;
                }
        }
    }
}
