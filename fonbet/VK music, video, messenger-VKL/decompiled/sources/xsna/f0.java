package xsna;

import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import one.video.calls.sdk_private.aF;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import xsna.n5f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Aa.e((LevelPlayAdInfo) this.c, (Aa) this.d);
                break;
            case 1:
                mi0 mi0Var = (mi0) this.c;
                List<? extends AdStatPixel> list = (List) this.d;
                mi0Var.o(list);
                HashMap<AdStatPixel, Runnable> hashMap = mi0Var.c;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    hashMap.remove((AdStatPixel) it.next());
                }
                break;
            case 2:
                CallOpenGLContext.a((izs) this.c, (CallOpenGLContext) this.d);
                break;
            case 3:
                ju90 ju90Var = (ju90) this.c;
                ual ualVar = (ual) this.d;
                if (ju90Var instanceof PendingPhotoAttachment) {
                    PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) ju90Var;
                    pendingPhotoAttachment.k = ualVar.e;
                    pendingPhotoAttachment.j = ualVar.f;
                }
                com.vk.upload.impl.a.i(ju90Var.y6());
                break;
            case 4:
                ((qor) this.c).setWidthScreenView(((ViewGroup) this.d).getWidth());
                break;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                n5f0 n5f0Var = (n5f0) this.d;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    n5f0.b bVar = (n5f0.b) it2.next();
                    RecyclerView.e0 e0Var = bVar.a;
                    int i = bVar.b;
                    int i2 = bVar.c;
                    int i3 = bVar.d;
                    int i4 = bVar.e;
                    View view = e0Var.itemView;
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    n5f0Var.p.add(e0Var);
                    animate.setDuration(n5f0Var.e).setListener(new p5f0(n5f0Var, e0Var, i5, view, i6, animate)).start();
                }
                arrayList.clear();
                n5f0Var.m.remove(arrayList);
                break;
            case 6:
                xlo0 xlo0Var = (xlo0) this.c;
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.d;
                xlo0Var.setInEditMode(false);
                stickersDrawingViewGroup.invalidate();
                break;
            case 7:
                kxl0 kxl0Var = (kxl0) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                VKImageView vKImageView = kxl0Var.p;
                vKImageView.load(storyEntry.Jb(vKImageView.getWidth(), ImageQuality.FIT, false));
                break;
            case 8:
                rhq0 rhq0Var = (rhq0) this.c;
                rhq0Var.e.d((FragmentActivity) this.d);
                break;
            case 9:
                ((ru.mail.libverify.p0.b) this.c).a((Message) this.d);
                break;
            default:
                cny0 cny0Var = (cny0) this.c;
                cny0Var.f.a((List) this.d, aF.c);
                break;
        }
    }
}
