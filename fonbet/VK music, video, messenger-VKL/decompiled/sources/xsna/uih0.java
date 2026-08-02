package xsna;

import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivitiesTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: SdkClipsActivitiesRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class uih0 implements tih0 {
    public final bgd a;
    public final cgd b;

    public uih0(rdi rdiVar, bgd bgdVar, cgd cgdVar) {
        this.a = bgdVar;
        this.b = cgdVar;
    }

    @Override // xsna.tih0
    public final io.reactivex.rxjava3.internal.operators.single.t a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SdkClipActivitiesTarget sdkClipActivitiesTarget = (SdkClipActivitiesTarget) it.next();
            arrayList2.add("clip_" + sdkClipActivitiesTarget.b.b + '_' + sdkClipActivitiesTarget.c);
        }
        final bgd bgdVar = this.a;
        return new io.reactivex.rxjava3.internal.operators.single.t(new io.reactivex.rxjava3.internal.operators.maybe.e0(new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.agd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (String) bgd.this.a;
            }
        }), new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.k("https://" + a0a.d + "/reaction/3-test_reactions-0?c_uniq_tag=d3d9c371f1f91e2362b13ddbeffadc9feed7f16744ba585ff8f347ed23bb057d)"), new lf1(new kf1(bgdVar, 17), 10))), new o860(new fh1(20, this, arrayList2), 3));
    }
}
