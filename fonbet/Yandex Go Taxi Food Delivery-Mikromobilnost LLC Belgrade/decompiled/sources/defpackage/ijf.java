package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class ijf extends mao {
    public final /* synthetic */ int a = 1;
    public final txl b;
    public Object c;

    public ijf(txl txlVar, jir jirVar) {
        this.b = txlVar;
        this.c = jirVar;
    }

    private final void a(View view) {
    }

    private final void b(azl azlVar) {
    }

    private final void c(azl azlVar) {
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                jir jirVar = (jir) this.c;
                jirVar.a().setOnClickListener(new ci8(17, this));
                return jirVar.getRoot();
            default:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(pmh0.urbanads_default_error_view, viewGroup, false);
                int i = iah0.urbanads_errorActionButton;
                Button button = (Button) cma1.O(i, inflate);
                if (button != null) {
                    i = iah0.urbanads_errorSubtitle;
                    if (((TextView) cma1.O(i, inflate)) != null) {
                        i = iah0.urbanads_errorTitle;
                        if (((TextView) cma1.O(i, inflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            zah zahVar = new zah(constraintLayout, button, 1);
                            button.setOnClickListener(new y7z0(12, zahVar, this));
                            this.c = zahVar;
                            return constraintLayout;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return null;
        }
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.c = null;
                break;
        }
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
        int i = this.a;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        switch (this.a) {
            case 0:
                ((jir) this.c).a().setEnabled(true);
                break;
            default:
                zah zahVar = (zah) this.c;
                if (zahVar != null) {
                    zahVar.c.setEnabled(true);
                    break;
                }
                break;
        }
    }

    public ijf(txl txlVar) {
        this.b = txlVar;
    }
}
