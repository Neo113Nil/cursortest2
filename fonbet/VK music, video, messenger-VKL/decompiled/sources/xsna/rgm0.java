package xsna;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.List;
import xsna.oem0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rgm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rgm0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final zgm0 zgm0Var = (zgm0) this.d;
                pgm0 pgm0Var = (pgm0) zgm0Var.b.f.b;
                io.reactivex.rxjava3.internal.operators.single.f0 q = pgm0Var.b().q(asu0.a.c());
                final int i = this.c;
                new io.reactivex.rxjava3.internal.operators.single.s(q, new r2v(new ogm0((UserId) this.e, i, (List) obj, pgm0Var), 16)).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.sgm0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        zgm0.this.d.a(new oem0.a.c(i));
                    }
                }).subscribe();
                break;
            default:
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                int a = e3m.a(((ecp0) this.e).a ? R.dimen.video_topshelf_content_margin_bottom : R.dimen.video_topshelf_content_margin_bottom_without_dots, (Context) this.d);
                bVar.t = 0;
                bVar.v = 0;
                bVar.l = 0;
                int i2 = this.c;
                bVar.setMargins(i2, 0, i2, a);
                break;
        }
        return s3q0.a;
    }
}
