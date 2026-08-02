package defpackage;

import android.app.Activity;
import android.net.Uri;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.utils.FeedbackConstantsDelegate$FeedbackIdentifierType;

/* loaded from: classes10.dex */
public final class h15 {
    public final zuj0 a;
    public final as21 b;
    public final h c;
    public final lsq d;

    public h15(zuj0 zuj0Var, as21 as21Var, h hVar, lsq lsqVar) {
        this.a = zuj0Var;
        this.b = as21Var;
        this.c = hVar;
        this.d = lsqVar;
    }

    public final void a(Activity activity) {
        String c = this.b.c("LAST_KNOWN_SUPPORT_MAILTO");
        lsq lsqVar = this.d;
        if (c == null || evu0.J(c)) {
            jst.e.getClass();
            lsqVar.getClass();
            c = "support@go.yandex.com";
        }
        Uri fromParts = Uri.fromParts("mailto", c, null);
        int i = kyh0.support_mail_subject;
        avj0 avj0Var = (avj0) this.a;
        String h = avj0Var.h(i);
        lsqVar.getClass();
        int i2 = g15.a[FeedbackConstantsDelegate$FeedbackIdentifierType.PHONE.ordinal()];
        String str = "";
        h hVar = this.c;
        if (i2 == 1) {
            String Ig = hVar.Ig();
            if (Ig != null && !evu0.J(Ig)) {
                str = avj0Var.i(kyh0.feedback_mail_template, Ig);
            }
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            String Hg = hVar.Hg();
            if (Hg != null && !evu0.J(Hg)) {
                str = cvu0.v(avj0Var.h(wzh0.feedback_mail_template_with_id), "$USER_ID$", Hg, false);
            }
        }
        q5z.e0(activity, fromParts, h, str);
    }
}
