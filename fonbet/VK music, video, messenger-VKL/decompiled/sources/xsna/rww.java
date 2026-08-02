package xsna;

import com.vk.dialogslist.view.ViewPager2NestedRecyclerView;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rww implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rww(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Iterator it = ((sww) this.d).a.iterator();
                while (it.hasNext()) {
                    ((uww) it.next()).a(this.c);
                }
                return s3q0.a;
            default:
                return ViewPager2NestedRecyclerView.a((ViewPager2NestedRecyclerView) this.d, this.c);
        }
    }
}
