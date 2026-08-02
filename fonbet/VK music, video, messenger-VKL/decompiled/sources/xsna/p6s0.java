package xsna;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VideoBottomSheetCallback.kt */
/* loaded from: classes2.dex */
public class p6s0 extends k6s0 {
    public final ArrayList a;

    public p6s0(l6s0... l6s0VarArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j5g.V(rl3.u0(l6s0VarArr)));
        this.a = arrayList;
    }

    @Override // xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public void a(View view, float f) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k6s0 Y4 = ((l6s0) it.next()).Y4();
            if (Y4 != null) {
                Y4.a(view, f);
            }
        }
    }

    @Override // xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public void b(int i, View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k6s0 Y4 = ((l6s0) it.next()).Y4();
            if (Y4 != null) {
                Y4.b(i, view);
            }
        }
    }

    @Override // xsna.k6s0
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k6s0 Y4 = ((l6s0) it.next()).Y4();
            if (Y4 != null) {
                Y4.d();
            }
        }
    }

    @Override // xsna.k6s0
    public final void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k6s0 Y4 = ((l6s0) it.next()).Y4();
            if (Y4 != null) {
                Y4.e();
            }
        }
    }
}
