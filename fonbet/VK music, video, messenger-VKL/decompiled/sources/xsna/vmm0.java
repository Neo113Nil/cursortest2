package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.stories.design.view.StoryProgressView;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.o3e0;
import xsna.umm0;

/* compiled from: StoryViewProgressDelegate.kt */
/* loaded from: classes6.dex */
public final class vmm0 extends Handler {
    public final /* synthetic */ umm0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmm0(umm0 umm0Var, Looper looper) {
        super(looper);
        this.a = umm0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        float b;
        o3e0 o3e0Var;
        umm0 umm0Var = this.a;
        StoryProgressView storyProgressView = umm0Var.b;
        CopyOnWriteArrayList<m8m0> copyOnWriteArrayList = umm0Var.h;
        umm0.a aVar = umm0Var.a;
        if (!aVar.o()) {
            aVar.x();
            return;
        }
        try {
            o3e0 o3e0Var2 = umm0Var.c;
            b = o3e0Var2 != null ? o3e0Var2.b() : 0.0f;
            if (!umm0Var.e && b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                umm0Var.e = true;
                aVar.v();
            }
            if (!umm0Var.d && b > 0.1f && b <= 0.25f) {
                umm0Var.d = true;
                aVar.j();
            }
            if (b >= 0.99f) {
                int size = copyOnWriteArrayList.size();
                for (int i = 0; i < size; i++) {
                    copyOnWriteArrayList.get(i).c();
                }
            }
        } catch (Throwable th) {
            L.e(th);
        }
        if (b < 0.99f || (o3e0Var = umm0Var.c) == null || !(o3e0Var instanceof o3e0.a.C3439a)) {
            aVar.n0();
            if (storyProgressView != null) {
                storyProgressView.setProgress(b);
            }
            sendMessageDelayed(Message.obtain(this, 0), 16L);
            return;
        }
        umm0Var.d = false;
        if (storyProgressView != null) {
            storyProgressView.setProgress(1.0f);
        }
        aVar.g();
    }
}
