package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import ru.CryptoPro.JCSP.tools.common.window.CSPMessage;
import ru.CryptoPro.JCSP.tools.common.window.CSPPin;
import ru.CryptoPro.JCSP.tools.common.window.CSPSelectReader;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.wait_task.AsyncTaskManager;

/* loaded from: classes4.dex */
public final /* synthetic */ class eb3 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        boolean lambda$new$0;
        boolean lambda$onCreateDialog$2;
        boolean lambda$getKeyListener$3;
        boolean lambda$onCreateDialog$3;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                lambda$new$0 = ((AsyncTaskManager) obj).lambda$new$0(dialogInterface, i, keyEvent);
                return lambda$new$0;
            case 1:
                lambda$onCreateDialog$2 = ((CSPMessage) obj).lambda$onCreateDialog$2(dialogInterface, i, keyEvent);
                return lambda$onCreateDialog$2;
            case 2:
                lambda$getKeyListener$3 = ((CSPPin) obj).lambda$getKeyListener$3(dialogInterface, i, keyEvent);
                return lambda$getKeyListener$3;
            case 3:
                lambda$onCreateDialog$3 = ((CSPSelectReader) obj).lambda$onCreateDialog$3(dialogInterface, i, keyEvent);
                return lambda$onCreateDialog$3;
            default:
                ph20 ph20Var = (ph20) obj;
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return false;
                }
                ph20Var.b.c("csat_cancel", CRLReasonCodeExtension.REASON, "system back");
                return false;
        }
    }
}
