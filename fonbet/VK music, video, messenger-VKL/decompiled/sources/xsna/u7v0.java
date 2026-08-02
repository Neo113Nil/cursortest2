package xsna;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u7v0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u7v0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        gzs gzsVar;
        Void s;
        switch (this.b) {
            case 0:
                return VkOnboardingHighlighter.b((VkOnboardingHighlighter) this.c);
            case 1:
                ((pvv0) this.c).e.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 21);
                return s3q0.a;
            case 2:
                return ((e41) this.c).e();
            case 3:
                mjw0 mjw0Var = (mjw0) this.c;
                mjw0Var.x(mjw0Var.u.z, mjw0Var.d.isHorizontal());
                return s3q0.a;
            case 4:
                xyt xytVar = (xyt) this.c;
                if (xytVar != null && (gzsVar = (gzs) xytVar.a) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 5:
                ((grw0) this.c).b.a0();
                return s3q0.a;
            case 6:
                enj.q(R.string.vkim_share_waiting_for_network, 0, (Activity) this.c);
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((com.vk.writebar.c) this.c).n);
            default:
                s = ((ru.mail.libverify.api.s) this.c).s();
                return s;
        }
    }
}
