package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.wih0;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y37 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y37(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, xsna.lm50] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ?? r5 = (lm50) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                BinderLifecycleMode binderLifecycleMode = (BinderLifecycleMode) obj2;
                ptk0 ptk0Var = (ptk0) obj;
                if (!epx.f(ref$ObjectRef.element, r5)) {
                    ref$ObjectRef.element = r5;
                    binderLifecycleMode.a(new com.vk.newsfeed.common.recycler.holders.attachments.a(4, ptk0Var, (Object) r5));
                    s3q0 s3q0Var = s3q0.a;
                    break;
                } else {
                    break;
                }
            case 1:
                evk0 evk0Var = (evk0) obj4;
                evk0Var.d.invoke(new yt0.h.d(new zt0((String) obj3, ((wih0.d.a) obj2).i)));
                evk0Var.c.invoke((String) obj, null);
                break;
            default:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj4;
                com.vk.video.ui.discovery.minimizable.q qVar = (com.vk.video.ui.discovery.minimizable.q) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                Boolean bool = (Boolean) obj;
                MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
                VideoFile videoFile2 = videoInfo != null ? videoInfo.b : null;
                gVar.b0.a(videoFile.a1());
                gVar.P0(qVar, videoFile2, videoFile, false, bool);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y37(rd1 rd1Var, lm50 lm50Var, Ref$ObjectRef ref$ObjectRef, BinderLifecycleMode binderLifecycleMode, ptk0 ptk0Var) {
        this.b = 0;
        this.c = lm50Var;
        this.d = ref$ObjectRef;
        this.e = binderLifecycleMode;
        this.f = ptk0Var;
    }
}
