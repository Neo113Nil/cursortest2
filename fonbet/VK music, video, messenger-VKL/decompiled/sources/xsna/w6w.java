package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w6w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w6w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        sht0 sht0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                z5w z5wVar = ((d7w) obj).g;
                z5wVar.b.a(z5wVar.a.b);
                break;
            case 1:
                ((LeadFormHolder) obj).J = false;
                break;
            case 2:
                ((w920) obj).p.compareAndSet(true, false);
                break;
            case 3:
                yg5 yg5Var = (yg5) obj;
                if (fxc0.B().J().i0()) {
                    com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                    if (com.vk.libvideo.autoplay.e.a()) {
                    }
                }
                VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
                if (videoAutoPlay != null && (sht0Var = videoAutoPlay.l0) != null) {
                    o1b0.b(qu5.c(), sht0Var, 2);
                    break;
                }
                break;
            default:
                ((com.vk.superapp.widget_settings.p004new.b) obj).e.onNext(Boolean.FALSE);
                break;
        }
    }

    public /* synthetic */ w6w(yg5 yg5Var, com.vk.libvideo.autoplay.background.controller.h hVar) {
        this.b = 3;
        this.c = yg5Var;
    }
}
