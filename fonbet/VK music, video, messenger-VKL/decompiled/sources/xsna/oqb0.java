package xsna;

import android.content.Context;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollModalController.kt */
/* loaded from: classes4.dex */
public final class oqb0 {
    public final Context a;
    public dw20 b;

    /* compiled from: PollModalController.kt */
    public final class a implements fcn {
        public a() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = oqb0.this.b;
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

    public oqb0(Context context, lad0 lad0Var, u1c0 u1c0Var, PollAttachment pollAttachment) {
        this.a = context;
    }
}
