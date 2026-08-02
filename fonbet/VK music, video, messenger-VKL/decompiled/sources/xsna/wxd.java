package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wxd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ wxd(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
                ArrayList<List> arrayList = this.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (List<yco> list : arrayList) {
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    for (yco ycoVar : list) {
                        arrayList3.add(new ClipsDraftMusicInfo(ycoVar.a, ycoVar.b, ycoVar.c, ycoVar.d));
                    }
                    arrayList2.add(arrayList3);
                }
                clipsDraftVk.b.l = arrayList2;
                return s3q0.a;
            default:
                return Boolean.valueOf(!j5g.P(this.c, ((dk70) obj).a));
        }
    }
}
