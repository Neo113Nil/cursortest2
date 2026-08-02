package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yvd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ yvd(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.clips.editor.state.model.a aVar = (com.vk.clips.editor.state.model.a) obj;
                return aVar.i(aVar.c.get(this.c).j);
            case 1:
                VKList vKList = (VKList) obj;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new o2t0((VideoFile) it.next()));
                }
                return new wia0(arrayList, vKList.i(), this.c == 0);
            default:
                qgi0.v((tgi0) obj, 12 + this.c);
                return s3q0.a;
        }
    }
}
