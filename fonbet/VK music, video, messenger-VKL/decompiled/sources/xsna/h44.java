package xsna;

import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class h44 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h44(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ((com.vk.attachpicker.impl.a) obj2).q();
                break;
            default:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj2;
                ?? r6 = basePhotoListFragment.T;
                io.reactivex.rxjava3.disposables.b bVar = basePhotoListFragment.e0;
                Photo photo = (Photo) obj;
                if (i == 130) {
                    kdg0 kdg0Var = (kdg0) r6.getValue();
                    List<ucv0> y0 = basePhotoListFragment.lo().y0();
                    ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
                    Iterator it = ((ArrayList) y0).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ucv0) it.next()).a);
                    }
                    hg1.e(bVar, kdg0Var.b(arrayList, photo, new v9(basePhotoListFragment, 7)));
                    break;
                } else if (i == 131) {
                    kdg0 kdg0Var2 = (kdg0) r6.getValue();
                    List<ucv0> y02 = basePhotoListFragment.lo().y0();
                    ArrayList arrayList2 = new ArrayList(c5g.u(y02, 10));
                    Iterator it2 = ((ArrayList) y02).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ucv0) it2.next()).a);
                    }
                    hg1.e(bVar, kdg0Var2.e(arrayList2, photo, new t40(basePhotoListFragment, 4)));
                    break;
                } else {
                    int i4 = BasePhotoListFragment.l0;
                    break;
                }
        }
    }
}
