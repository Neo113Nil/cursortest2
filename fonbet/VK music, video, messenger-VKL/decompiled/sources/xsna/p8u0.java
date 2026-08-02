package xsna;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.vkontakte.android.R;

/* compiled from: VkAndroidDialog.kt */
/* loaded from: classes6.dex */
public final class p8u0 implements bqu0 {
    public final ProgressDialog a;

    /* compiled from: VkAndroidDialog.kt */
    public static final class a {
    }

    public p8u0(Context context, boolean z, int i) {
        int i2 = (i & 2) != 0 ? R.string.vk_apps_loading : R.string.vk_loading;
        z = (i & 4) != 0 ? true : z;
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(i2));
        progressDialog.setCancelable(z);
        progressDialog.setCanceledOnTouchOutside(false);
        this.a = progressDialog;
    }

    @Override // xsna.bqu0
    public final void a(final izs<? super bqu0, s3q0> izsVar) {
        this.a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.n8u0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                izs.this.invoke(this);
            }
        });
    }

    @Override // xsna.bqu0
    public final void dismiss() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog == null) {
            return;
        }
        qro0.c(new iml0(progressDialog, 22));
    }

    @Override // xsna.bqu0
    public final void show() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog == null) {
            return;
        }
        qro0.c(new o8u0(progressDialog, 0));
    }
}
