package defpackage;

import android.content.Context;
import com.google.android.gms.internal.mlkit_common.b;
import com.google.android.gms.internal.mlkit_vision_common.a;
import com.google.android.gms.internal.mlkit_vision_face.n;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.k;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class j1b1 extends t4y {
    public final /* synthetic */ int b;

    public /* synthetic */ j1b1(int i) {
        this.b = i;
    }

    @Override // defpackage.t4y
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                vya1 vya1Var = (vya1) obj;
                qk20 c = qk20.c();
                return new a(c.b(), (kpr0) c.a(kpr0.class), new aza1(qk20.c().b(), vya1Var), vya1Var.b());
            case 1:
                q6b1 q6b1Var = (q6b1) obj;
                qk20 c2 = qk20.c();
                return new n(c2.b(), (kpr0) c2.a(kpr0.class), new w6b1(qk20.c().b(), q6b1Var), q6b1Var.b());
            case 2:
                mnb1 mnb1Var = (mnb1) obj;
                qk20 c3 = qk20.c();
                Context b = qk20.c().b();
                r100 r100Var = new r100();
                ArrayList arrayList = new ArrayList();
                if (mnb1Var.c()) {
                    arrayList.add(new r400(b, mnb1Var));
                }
                return new b(c3.b(), (kpr0) c3.a(kpr0.class), r100Var, mnb1Var.b());
            case 3:
                wqb1 wqb1Var = (wqb1) obj;
                qk20 c4 = qk20.c();
                return new k(c4.b(), (kpr0) c4.a(kpr0.class), new zqb1(qk20.c().b(), wqb1Var), wqb1Var.b());
            case 4:
                gsb1 gsb1Var = (gsb1) obj;
                qk20 c5 = qk20.c();
                return new o(c5.b(), (kpr0) c5.a(kpr0.class), new isb1(qk20.c().b(), gsb1Var), gsb1Var.b());
            default:
                lvb1 lvb1Var = (lvb1) obj;
                qk20 c6 = qk20.c();
                return new com.google.android.gms.internal.mlkit_vision_barcode.n(c6.b(), (kpr0) c6.a(kpr0.class), new mvb1(qk20.c().b(), lvb1Var), lvb1Var.b());
        }
    }
}
