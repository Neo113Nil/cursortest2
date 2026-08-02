package xsna;

import android.view.ViewGroup;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.add;
import xsna.iuf;
import xsna.uuf;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class hrf extends FunctionReferenceImpl implements izs<uuf.k, s3q0> {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(uuf.k kVar) {
        ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
        int i = ClipsWrapperFragment.Q0;
        clipsWrapperFragment.getClass();
        iuf a = kVar.a();
        if (a != null) {
            vfd vfdVar = (vfd) clipsWrapperFragment.s0.getValue();
            ViewGroup viewGroup = (ViewGroup) clipsWrapperFragment.getView();
            vfdVar.getClass();
            if (!(a instanceof iuf.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((iuf.a) a).a;
            czc czcVar = vfdVar.a;
            add.a aVar = new add.a(str);
            Map<add, Runnable> map = czcVar.a;
            azc azcVar = new azc(aVar, czcVar, viewGroup, 0);
            if (czcVar.b.get()) {
                map.remove(aVar);
                map.put(aVar, azcVar);
            } else {
                azcVar.run();
            }
        }
        return s3q0.a;
    }
}
