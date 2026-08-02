package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9c0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;

    public /* synthetic */ t9c0(int i, xzs xzsVar) {
        this.b = i;
        this.c = xzsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        xzs xzsVar = this.c;
        switch (i) {
            case 0:
                return (List) ((t3v) xzsVar).invoke(obj);
            case 1:
                return (List) ((t3v) xzsVar).invoke(obj);
            case 2:
                return (VKList) ((isb0) xzsVar).invoke(obj);
            case 3:
                return (List) ((t3v) xzsVar).invoke(obj);
            case 4:
            case 7:
            case 8:
            case 10:
            default:
                return (nex0) ((r8) xzsVar).invoke(obj);
            case 5:
                return (VideoAutoPlay.e) ((f6m0) xzsVar).c;
            case 6:
                return (io.reactivex.rxjava3.core.t) ((f6m0) xzsVar).invoke(obj);
            case 9:
                int i2 = VideoOfflineFragment.f1;
                return (List) ((f6m0) xzsVar).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((kbu0) xzsVar).invoke(obj);
            case 12:
                return (CallsAudioDeviceInfo) ((k4x0) xzsVar).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (c.s0.d) ((er0) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                break;
            case 8:
                break;
        }
        return ((Boolean) ((t3v) this.c).invoke(obj)).booleanValue();
    }
}
