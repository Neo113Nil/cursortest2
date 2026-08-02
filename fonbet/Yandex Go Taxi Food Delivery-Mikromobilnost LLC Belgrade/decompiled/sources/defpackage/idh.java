package defpackage;

import android.widget.ImageView;
import com.yandex.messaging.internal.view.input.edit.a;

/* loaded from: classes10.dex */
public final class idh extends btn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ idh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.btn
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((jdh) obj).a = he91.a;
                break;
            default:
                ((a) obj).z.reportError("tech_emoji_initializaition_failed", th);
                break;
        }
    }

    @Override // defpackage.btn
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((oz40) obj).setValue(Boolean.TRUE);
                ((jdh) this.c).a = new miv(true);
                break;
            default:
                ((ImageView) obj).setVisibility(0);
                break;
        }
    }
}
