package xsna;

import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import xsna.ult;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h9h implements xa80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h9h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.xa80
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i9h) obj).j.invoke();
                break;
            default:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                dlt dltVar = (dlt) ((GeoPostsFragment) obj).U.getValue();
                ult.c cVar = new ult.c(xn60.d.a.b);
                hmt hmtVar = (hmt) dltVar.a.invoke();
                if (hmtVar != null) {
                    hmtVar.b(cVar);
                    break;
                }
                break;
        }
    }
}
