package xsna;

import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.vk.attachpicker.impl.a;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.storycamera.utils.CatalogModalBottomSheetFragment;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import java.util.regex.Pattern;
import one.video.calls.sdk_private.bF;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.media.StreamerBase;
import xsna.o27;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class r44 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r44(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup Wj;
        FrameLayout frameLayout;
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                a.m mVar = (a.m) obj;
                com.vk.attachpicker.impl.a aVar = mVar.o;
                androidx.lifecycle.f fVar = mVar.n;
                if ((fVar instanceof iin0) && (Wj = ((iin0) fVar).Wj(aVar.d0.kn())) != null && mVar.m != Wj) {
                    if (Wj.getParent() != null) {
                        ((ViewGroup) Wj.getParent()).removeView(Wj);
                    }
                    aVar.i.removeAllViews();
                    Wj.setVisibility(0);
                    aVar.i.addView(Wj);
                    mVar.m = Wj;
                    aVar.r0 = null;
                    break;
                }
                break;
            case 1:
                ((com.vk.libvideo.autoplay.b) obj).j();
                break;
            case 2:
                o27.d.g(new o27.c.a((o27.c) obj));
                break;
            case 3:
                Pattern pattern = BoardTopicViewFragment.H0;
                mhy.j((EditText) obj);
                break;
            case 4:
                ((CallsBluetoothManager) obj).updateAudioDeviceState();
                break;
            case 5:
                ((CameraUIView) obj).z0();
                break;
            case 6:
                Dialog dialog = ((CatalogModalBottomSheetFragment) obj).s;
                ppk ppkVar = dialog instanceof ppk ? (ppk) dialog : null;
                if (ppkVar != null && (frameLayout = ppkVar.j) != null && (customisableBottomSheetBehavior = ppkVar.h) != null) {
                    customisableBottomSheetBehavior.G(frameLayout);
                    break;
                }
                break;
            case 7:
                ((syc) obj).d();
                break;
            case 8:
                ((q850) ((qyd) obj).a.b).d.g(true);
                break;
            case 9:
                ((j3k) obj).a.setBackground(null);
                break;
            case 10:
                String[] strArr = DebugDevSettingsFragment.t0;
                ((DebugDevSettingsFragment) obj).ko();
                break;
            case 11:
                ((io.reactivex.rxjava3.core.m) obj).onComplete();
                break;
            case 12:
                ((eza0) obj).c();
                break;
            case 13:
                ((IdMappingWrapper) obj).writeCacheToDisk();
                break;
            case 14:
                ((VideoFrame.I420Buffer) obj).release();
                break;
            case 15:
                com.vk.media.ok.a aVar2 = ((com.vk.media.ok.b) obj).h;
                if (aVar2 != null) {
                    aVar2.u(true);
                    break;
                }
                break;
            case 16:
                RecordManagerImpl.onRecordStarted$lambda$1((RecordManagerImpl) obj);
                break;
            case 17:
                hwl0 hwl0Var = (hwl0) obj;
                Reef m = hwl0Var.m();
                if (m != null) {
                    m.a(new ReefEvent.r());
                }
                hwl0Var.b = -1L;
                break;
            case 18:
                int i2 = StoryBottomViewGroup.P;
                ((kzl0) obj).invoke();
                break;
            case 19:
                StreamerBase.startLinkTracker$lambda$15$lambda$14((StreamerBase) obj);
                break;
            case 20:
                ((gzs) obj).invoke();
                break;
            case 21:
                ((VoipVideoListFragment.b) obj).a.scrollToPosition(0);
                break;
            default:
                ((bF) obj).q();
                break;
        }
    }
}
