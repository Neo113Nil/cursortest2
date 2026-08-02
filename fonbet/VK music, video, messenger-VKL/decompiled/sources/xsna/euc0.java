package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class euc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ euc0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                iuc0 iuc0Var = iuc0.b;
                if (!((o2i) iuc0.h.getValue()).d(th, true)) {
                    j03.j(context, th);
                }
                break;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "template_picker_close_button");
                qgi0.h(tgi0Var, context.getString(R.string.picker_accessibility_close));
                break;
        }
        return s3q0.a;
    }
}
