package xsna;

import android.app.RemoteAction;
import android.content.Context;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PlatformSelectionBehaviors.android.kt */
/* loaded from: classes11.dex */
public final class gua0 {
    public static final iyk0 a = new iyk0(new ek(23));
    public static final vai b = new vai(2);

    public static final void a(tco0 tco0Var, Context context, boolean z, CharSequence charSequence, qko0 qko0Var, aua0 aua0Var, izs<? super tco0, s3q0> izsVar) {
        if (charSequence == null || qko0Var == null || aua0Var == null || !(aua0Var instanceof fua0)) {
            izsVar.invoke(tco0Var);
            if (charSequence == null || qko0Var == null) {
                return;
            }
            zgd0.a(tco0Var, context, z, charSequence, qko0Var.a);
            return;
        }
        fua0 fua0Var = (fua0) aua0Var;
        long j = qko0Var.a;
        Object obj = fua0Var.h;
        wi50 wi50Var = fua0Var.e;
        TextClassification textClassification = null;
        if (wi50Var.f()) {
            hco0 hco0Var = (hco0) ((zak0) fua0Var.g).getValue();
            TextClassification textClassification2 = (hco0Var != null && qko0.b(j, hco0Var.b) && epx.f(charSequence, hco0Var.a)) ? hco0Var.c : null;
            wi50Var.c(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            izsVar.invoke(tco0Var);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                tco0Var.a.j(new kdo0(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                tco0Var.a.j(new kdo0(obj, textClassification, -1));
            }
            izsVar.invoke(tco0Var);
            List<RemoteAction> actions = textClassification.getActions();
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                actions.get(i);
                if (i > 0) {
                    tco0Var.a.j(new kdo0(obj, textClassification, i));
                }
            }
        }
        zgd0.a(tco0Var, context, z, charSequence, qko0Var.a);
    }

    public static final aua0 b(SelectedTextType selectedTextType, lwz lwzVar, androidx.compose.runtime.a aVar, int i) {
        aVar.K(430530635);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(430530635, i, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:95)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) aVar.r(a);
        boolean J = ((((i & 112) ^ 48) > 32 && aVar.J(lwzVar)) || (i & 48) == 32) | aVar.J(dVar) | aVar.J(context);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            b.getClass();
            x = new fua0(dVar, context, selectedTextType, lwzVar);
            aVar.R(x);
        }
        aua0 aua0Var = (aua0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return aua0Var;
    }
}
