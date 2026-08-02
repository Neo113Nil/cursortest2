package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.pt2;
import xsna.x89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rt2 implements izs {
    public final /* synthetic */ st2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rt2(st2 st2Var, String str, boolean z) {
        this.b = st2Var;
        this.c = str;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        st2 st2Var = this.b;
        if (booleanValue) {
            pt2.a aVar = st2Var.A;
            if (aVar != null) {
                pt2 pt2Var = pt2.this;
                x89 x89Var = pt2Var.o;
                if (x89Var instanceof x89.a) {
                    pt2Var.Y0(this.c, ((x89.a) x89Var).a, this.d);
                }
            }
        } else {
            Context context = st2Var.a;
            enj.r(context, context.getString(R.string.error_invalid_name), 0);
        }
        return s3q0.a;
    }
}
