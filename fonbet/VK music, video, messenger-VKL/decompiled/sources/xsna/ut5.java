package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.dto.common.id.UserId;
import xsna.rt5;

/* compiled from: AvitoIntegrationDelegateImpl.kt */
/* loaded from: classes18.dex */
public final class ut5 implements com.vk.ecomm.avito.api.a, fcn {
    public dw20 b;

    /* compiled from: AvitoIntegrationDelegateImpl.kt */
    public static final class a implements iz20 {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            Object obj = this.c;
            if (obj instanceof ey50) {
                ((ey50) obj).Y().S(ut5.this);
            }
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // com.vk.ecomm.avito.api.a
    public final void a(final Context context, UserId userId, Integer num, final gzs<s3q0> gzsVar) {
        this.b = new rt5.a(context, userId, num).Z(new DialogInterface.OnDismissListener() { // from class: xsna.tt5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object obj = context;
                boolean z = obj instanceof ey50;
                ut5 ut5Var = ut5.this;
                if (z) {
                    ((ey50) obj).Y().H(ut5Var);
                }
                gzsVar.invoke();
                ut5Var.b = null;
            }
        }).e0(new a(context)).I0(null);
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
