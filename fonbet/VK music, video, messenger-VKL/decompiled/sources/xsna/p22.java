package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p22 implements izs {
    public final /* synthetic */ boolean b;

    public /* synthetic */ p22(boolean z) {
        this.b = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (!this.b) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!jnj.b(((MusicTrack) obj2).V)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
