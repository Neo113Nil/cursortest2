package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;
import com.vk.newsfeed.common.views.poster.PosterEditText;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.reefton.Reef;
import com.vk.voip.ui.asr_online.AsrOnlineView;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.concurrent.Semaphore;
import org.webrtc.JniCommon;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.gl.tf.gestures.processor.Processor;
import ru.ok.media.StreamerBase;
import xsna.hs9;
import xsna.jw10;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kv3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r2 = null;
        Integer num = null;
        switch (this.b) {
            case 0:
                AsrOnlineView asrOnlineView = (AsrOnlineView) this.c;
                int i = AsrOnlineView.e;
                asrOnlineView.fullScroll(130);
                return;
            case 1:
                v68 v68Var = (v68) this.c;
                int i2 = v68.E;
                v68Var.c();
                return;
            case 2:
                ((re9) this.c).n();
                return;
            case 3:
                hs9.a aVar = (hs9.a) this.c;
                LinkedHashSet<von0> linkedHashSet = new LinkedHashSet();
                synchronized (aVar.a.b) {
                    linkedHashSet.addAll(new LinkedHashSet(aVar.a.e));
                    linkedHashSet.addAll(new LinkedHashSet(aVar.a.c));
                }
                for (von0 von0Var : linkedHashSet) {
                    von0Var.e().i(von0Var);
                }
                return;
            case 4:
                ((q850) ((qyd) this.c).a.b).d.g(false);
                return;
            case 5:
                mkh mkhVar = (mkh) this.c;
                View view = mkhVar.a;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    viewGroup.addView(mkhVar.b);
                    return;
                }
                return;
            case 6:
                z1i z1iVar = (z1i) this.c;
                dw20 dw20Var = z1iVar.d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                z1iVar.d = null;
                return;
            case 7:
                ((androidx.media3.exoplayer.video.a) this.c).h.e();
                return;
            case 8:
                ((FaceMorphingProcessor) this.c).lambda$initGPUResources$0();
                return;
            case 9:
                ((IdMappingWrapper) this.c).readCacheFromDisk();
                return;
            case 10:
                JniCommon.nativeFreeByteBuffer((ByteBuffer) this.c);
                return;
            case 11:
                k800 k800Var = (k800) this.c;
                Semaphore semaphore = k800Var.P;
                com.airbnb.lottie.model.layer.b bVar = k800Var.r;
                if (bVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    bVar.r(k800Var.c.i());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
            case 12:
                ((jw10.d) this.c).n = -1;
                return;
            case 13:
                com.vk.media.ok.a aVar2 = ((com.vk.media.ok.b) this.c).h;
                if (aVar2 != null) {
                    aVar2.u(true);
                    return;
                }
                return;
            case 14:
                ((y0a0) this.c).c();
                return;
            case 15:
                ((PosterEditText) this.c).requestLayout();
                return;
            case 16:
                ((Processor) this.c).handleFiguresUpdate();
                return;
            case 17:
                com.vk.profile.core.cover.a aVar3 = (com.vk.profile.core.cover.a) this.c;
                int height = aVar3.d.getHeight();
                RecyclerView recyclerView = aVar3.d;
                int computeVerticalScrollRange = height - recyclerView.computeVerticalScrollRange();
                if (computeVerticalScrollRange > aVar3.h) {
                    aVar3.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                Integer valueOf = Integer.valueOf(computeVerticalScrollRange);
                if (computeVerticalScrollRange >= 0 && computeVerticalScrollRange <= aVar3.h) {
                    num = valueOf;
                }
                f4m.v(num != null ? num.intValue() : 0, recyclerView);
                return;
            case 18:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) this.c;
                int i3 = ProfileMainPhotosFragment.F0;
                profileMainPhotosFragment.zo();
                return;
            case 19:
                mhy.j(((com.vk.posting.presentation.video.search.g) this.c).f);
                return;
            case 20:
                ((SharedPeerConnectionFactory) this.c).a();
                return;
            case 21:
                Reef m = ((hwl0) this.c).m();
                if (m != null) {
                    m.d();
                    return;
                }
                return;
            case 22:
                ((skm0.a) this.c).u();
                return;
            case 23:
                StreamerBase.updateState$lambda$3((StreamerBase) this.c);
                return;
            default:
                VkPayPinFragment vkPayPinFragment = (VkPayPinFragment) this.c;
                int i4 = VkPayPinFragment.c0;
                vkPayPinFragment.a0();
                return;
        }
    }
}
