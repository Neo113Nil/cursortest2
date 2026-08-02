package xsna;

import com.vk.media.pipeline.model.timeline.AudioFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BoundFragment.kt */
/* loaded from: classes3.dex */
public final class el4 implements o98<AudioFragment> {
    public final ArrayList a;
    public final AudioFragment b;

    public el4(ArrayList arrayList, AudioFragment audioFragment) {
        this.a = arrayList;
        this.b = audioFragment;
    }

    @Override // xsna.o98
    public final AudioFragment getLayout() {
        return this.b;
    }

    @Override // xsna.o98
    public final void release() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k0h0) it.next()).release();
        }
    }
}
