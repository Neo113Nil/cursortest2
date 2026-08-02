package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.internal.view.timeline.k;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import ru.CryptoPro.JCSP.tools.common.window.CSPSelectReader;
import yads.p90;

/* loaded from: classes15.dex */
public final /* synthetic */ class p97 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p97(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((CSPSelectReader) obj).lambda$onCreateDialog$2(dialogInterface, i);
                break;
            case 1:
                ((d3b) obj).invoke();
                break;
            case 2:
                c cVar = (c) obj;
                b00 b00Var = cVar.a;
                ((Handler) b00Var.a.get()).post(new pz(b00Var, cVar.c, 3));
                break;
            case 3:
                ((zr01) obj).invoke();
                break;
            case 4:
                ((sls) obj).invoke();
                break;
            case 5:
                FragmentActivity fragmentActivity = (FragmentActivity) ((q4g) obj).b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:com.android.providers.downloads"));
                    fragmentActivity.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    fragmentActivity.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                    return;
                }
            case 6:
                FpsPayEnrollFragment.showErrorDialog$lambda$20((FpsPayEnrollFragment) obj, dialogInterface, i);
                break;
            case 7:
                k kVar = (k) obj;
                Long l = kVar.W;
                if (l != null) {
                    long longValue = l.longValue();
                    g0 g0Var = kVar.e0().e;
                    abz0 abz0Var = new abz0(longValue);
                    g0Var.getClass();
                    tje.e();
                    b00 b00Var2 = g0Var.a;
                    ((Handler) b00Var2.a.get()).post(new rz(b00Var2, g0Var.b, abz0Var, true, 1));
                    break;
                }
                break;
            case 8:
                blt0 blt0Var = (blt0) ((elt0) obj).a.get();
                b00 b00Var3 = blt0Var.w;
                ((Handler) b00Var3.a.get()).post(new xz(b00Var3, blt0Var.c, 0, 0));
                String str = blt0Var.z;
                if (str != null) {
                    Activity activity = blt0Var.a.c;
                    Toast.makeText(activity, activity.getResources().getString(oyh0.spam_report_complete, str), 0).show();
                }
                n2v0 n2v0Var = blt0Var.x;
                if (n2v0Var != null) {
                    ((sfl0) n2v0Var.b).getClass();
                    break;
                }
                break;
            case 9:
                ((iep0) obj).c = false;
                break;
            default:
                ((p90) obj).invoke();
                break;
        }
    }
}
