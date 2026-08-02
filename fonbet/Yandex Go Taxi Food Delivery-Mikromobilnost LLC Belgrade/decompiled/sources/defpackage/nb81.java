package defpackage;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import yads.p90;

/* loaded from: classes7.dex */
public final class nb81 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntegrationInspectorActivity b;

    public /* synthetic */ nb81(IntegrationInspectorActivity integrationInspectorActivity, int i) {
        this.a = i;
        this.b = integrationInspectorActivity;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        IntegrationInspectorActivity integrationInspectorActivity = this.b;
        switch (i) {
            case 0:
                ay71 ay71Var = (ay71) obj;
                z481 b = IntegrationInspectorActivity.b(integrationInspectorActivity);
                IntegrationInspectorActivity integrationInspectorActivity2 = b.a;
                if (!(ay71Var instanceof vo71)) {
                    if (!(ay71Var instanceof bv71)) {
                        if (!(ay71Var instanceof yr71)) {
                            if (!(ay71Var instanceof dm71)) {
                                if (ay71Var instanceof oi71) {
                                    integrationInspectorActivity2.finishAfterTransition();
                                    break;
                                }
                            } else {
                                String string = integrationInspectorActivity2.getString(R$string.debug_panel_logging_is_disabled);
                                new AlertDialog.Builder(integrationInspectorActivity2).setTitle(string).setMessage(integrationInspectorActivity2.getString(R$string.debug_panel_do_you_want_to_enable_logging)).setPositiveButton(integrationInspectorActivity2.getString(R$string.debug_panel_yes), new p97(10, new p90(b))).setNegativeButton(integrationInspectorActivity2.getString(R$string.debug_panel_no), new dz2(9)).show();
                                break;
                            }
                        } else {
                            Uri uri = ((yr71) ay71Var).a;
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.STREAM", uri);
                            intent.setType("text/plain");
                            integrationInspectorActivity2.startActivity(intent);
                            break;
                        }
                    } else {
                        new AlertDialog.Builder(integrationInspectorActivity2).setMessage(((bv71) ay71Var).a).setPositiveButton(integrationInspectorActivity2.getString(R$string.debug_panel_ok), new dz2(9)).show();
                        break;
                    }
                } else {
                    Toast.makeText(integrationInspectorActivity2, ((vo71) ay71Var).a, 0).show();
                    break;
                }
                break;
            default:
                e881 e881Var = (e881) obj;
                mb81 c = IntegrationInspectorActivity.c(integrationInspectorActivity);
                c.getClass();
                ProgressBar progressBar = c.c;
                z6c z6cVar = c.a;
                if (e881Var.c) {
                    z6cVar.submitList(EmptyList.a);
                    progressBar.setVisibility(0);
                } else {
                    z6cVar.submitList(e881Var.d);
                    progressBar.setVisibility(8);
                }
                c.b.setText(e881Var.b.a);
                break;
        }
        return zy11Var;
    }
}
