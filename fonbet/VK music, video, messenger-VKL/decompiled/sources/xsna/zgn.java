package xsna;

import com.vk.core.fragments.FragmentImpl;
import java.lang.ref.WeakReference;
import xsna.ui90;

/* compiled from: DisposeOnFragmentChange.kt */
/* loaded from: classes17.dex */
public final class zgn implements mut0 {
    public final vbs a;

    /* compiled from: DisposeOnFragmentChange.kt */
    public final class a implements ui90.a {
        public final int a;
        public boolean b;
        public final WeakReference<td> c;

        public a(td tdVar) {
            this.a = zgn.this.a.p();
            this.c = new WeakReference<>(tdVar);
        }

        @Override // xsna.ui90.a
        public final void b(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2) {
            vbs vbsVar = zgn.this.a;
            int p = vbsVar.p();
            int i = this.a;
            if (p < i) {
                vbsVar.l(this);
                return;
            }
            if (p <= i || this.b) {
                if (p == i) {
                    this.b = false;
                }
            } else {
                td tdVar = this.c.get();
                if (tdVar != null) {
                    tdVar.s();
                } else {
                    vbsVar.l(this);
                }
                this.b = true;
            }
        }
    }

    public zgn(vbs vbsVar) {
        this.a = vbsVar;
    }

    @Override // xsna.mut0
    public final gzs<s3q0> a(td tdVar) {
        a aVar = new a(tdVar);
        this.a.e.add(aVar);
        ui90.j();
        return new com.vk.movika.sdk.base.ui.l(9, this, aVar);
    }
}
