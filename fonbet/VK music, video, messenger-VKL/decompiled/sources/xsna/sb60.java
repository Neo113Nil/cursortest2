package xsna;

import android.os.Bundle;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import java.util.Iterator;
import xsna.hg1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sb60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sb60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                NewsFeedComponentImpl newsFeedComponentImpl = (NewsFeedComponentImpl) this.c;
                bpn0 bpn0Var = (bpn0) this.d;
                eef Zb = ((ClipsUploadSdkUploaderComponent) newsFeedComponentImpl.b.getValue()).Zb();
                ce60.b.getClass();
                p870 f = p870.f();
                p870 w = ((StoriesComponent) bpn0Var.getValue()).w();
                io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
                hg1.s2 s2Var = new hg1.s2(n86.d);
                fVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, s2Var);
                io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0.b.a;
                hg1.s2 s2Var2 = new hg1.s2(wb60.c);
                fVar2.getClass();
                return new zaq0(Zb, w, f, i0Var, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, s2Var2));
            default:
                VkMainTracker vkMainTracker = (VkMainTracker) this.c;
                Bundle bundle = (Bundle) this.d;
                Iterator<T> it = vkMainTracker.p().iterator();
                while (it.hasNext()) {
                    ((ohp0) it.next()).f(bundle);
                }
                return s3q0.a;
        }
    }
}
