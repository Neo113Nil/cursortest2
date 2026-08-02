package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.SpannableStringBuilder;
import com.yandex.messaging.input.bricks.writing.d;

/* loaded from: classes15.dex */
public final /* synthetic */ class d1w implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ d1w(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ClipData.Item itemAt;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return dVar.j0;
            case 1:
                dVar.w.f();
                return zy11Var;
            case 2:
                ClipData primaryClip = ((ClipboardManager) dVar.c.getSystemService("clipboard")).getPrimaryClip();
                String htmlText = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getHtmlText();
                if (htmlText == null) {
                    return null;
                }
                String a = dVar.Z.a(htmlText);
                if (!dVar.Q.a(tz10.D)) {
                    return new SpannableStringBuilder(a);
                }
                SpannableStringBuilder b = ((v3k0) dVar.a0).b(2, a);
                dVar.V.setLinkStyles(b);
                return b;
            case 3:
                return Boolean.valueOf(dVar.Q.a(tz10.D));
            default:
                dVar.d0.f();
                return zy11Var;
        }
    }
}
