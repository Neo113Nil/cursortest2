package yads;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import xsna.fta;
import xsna.gzs;
import xsna.jzy;
import xsna.kzy;

/* loaded from: classes10.dex */
public final class o90 {
    public final IntegrationInspectorActivity a;

    public o90(IntegrationInspectorActivity integrationInspectorActivity) {
        this.a = integrationInspectorActivity;
    }

    public static final void a(DialogInterface dialogInterface, int i) {
    }

    public final void a(m90 m90Var) {
        if (m90Var instanceof j90) {
            Toast.makeText(this.a, ((j90) m90Var).a, 0).show();
            return;
        }
        if (m90Var instanceof l90) {
            a(((l90) m90Var).a);
            return;
        }
        if (m90Var instanceof k90) {
            Uri uri = ((k90) m90Var).a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("text/plain");
            this.a.startActivity(intent);
            return;
        }
        if (m90Var instanceof i90) {
            a(this.a.getString(R$string.debug_panel_logging_is_disabled), this.a.getString(R$string.debug_panel_do_you_want_to_enable_logging), new n90(this));
        } else if (m90Var instanceof h90) {
            this.a.finishAfterTransition();
        }
    }

    public static final void a(gzs gzsVar, DialogInterface dialogInterface, int i) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public final void a(String str) {
        new AlertDialog.Builder(this.a).setMessage(str).setPositiveButton(this.a.getString(R$string.debug_panel_ok), new fta(2)).show();
    }

    public final void a(String str, String str2, n90 n90Var) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setPositiveButton(this.a.getString(R$string.debug_panel_yes), new jzy(1, n90Var)).setNegativeButton(this.a.getString(R$string.debug_panel_no), new kzy(2)).show();
    }

    public static final void b(DialogInterface dialogInterface, int i) {
    }
}
