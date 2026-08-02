package xsna;

import android.app.Dialog;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.R;
import xsna.ecq0;

/* compiled from: ReplyBarPresenter.kt */
/* loaded from: classes4.dex */
public final class l3g0 implements ecq0.a {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ m3g0 b;

    public l3g0(Dialog dialog, m3g0 m3g0Var) {
        this.a = dialog;
        this.b = m3g0Var;
    }

    @Override // xsna.ecq0.a
    public final void a(Attachment attachment) {
        Dialog dialog = this.a;
        dialog.setOnCancelListener(null);
        u1u0.b(dialog);
        if (attachment != null) {
            this.b.D0(attachment, false);
        } else {
            cvk.u(R.string.error, false);
        }
    }

    @Override // xsna.ecq0.a
    public final void b() {
        Dialog dialog = this.a;
        dialog.setOnCancelListener(null);
        u1u0.b(dialog);
        cvk.u(R.string.error, false);
    }
}
