package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dvk0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dvk0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                wih0.d.a aVar = (wih0.d.a) this.d;
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                String str = aVar.j;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                Toast.makeText(context, context.getString(R.string.link_copied), 0).show();
                return s3q0.a;
            case 1:
                ((acn0) this.c).h6((ien0) this.d, false);
                return s3q0.a;
            case 2:
                msp0 msp0Var = (msp0) this.d;
                Object obj = (Context) this.c;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(msp0Var);
                }
                return s3q0.a;
            case 3:
                rqq0 rqq0Var = (rqq0) this.c;
                sqq0 sqq0Var = ((uqq0) this.d).c;
                int i = vqq0.$EnumSwitchMapping$0[rqq0Var.ordinal()];
                if (i == 1) {
                    sqq0Var.a.invoke();
                } else if (i == 2) {
                    sqq0Var.b.invoke();
                } else if (i == 3) {
                    sqq0Var.c.invoke();
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sqq0Var.d.invoke();
                }
                return s3q0.a;
            default:
                gvw0 gvw0Var = (gvw0) this.c;
                qah0 qah0Var = (qah0) this.d;
                gvw0Var.h = false;
                qah0Var.invoke();
                return s3q0.a;
        }
    }

    public /* synthetic */ dvk0(msp0 msp0Var, Context context) {
        this.b = 2;
        this.d = msp0Var;
        this.c = context;
    }
}
