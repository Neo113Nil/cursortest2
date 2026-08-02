package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class cwc0 {
    public static final a7u0 a = new a7u0(new sfc0(26));
    public static final eed b = new eed(13);

    public static final void a(xky0 xky0Var, Context context, boolean z, CharSequence charSequence, asy0 asy0Var, bwc0 bwc0Var, tls tlsVar) {
        if (charSequence == null || asy0Var == null || bwc0Var == null || !(bwc0Var instanceof a)) {
            tlsVar.invoke(xky0Var);
            if (charSequence == null || asy0Var == null) {
                return;
            }
            c6a1.k(xky0Var, context, z, charSequence, asy0Var.a);
            return;
        }
        a aVar = (a) bwc0Var;
        long j = asy0Var.a;
        Object obj = aVar.h;
        kotlinx.coroutines.sync.a aVar2 = aVar.e;
        TextClassification textClassification = null;
        if (aVar2.h()) {
            uky0 uky0Var = (uky0) aVar.g.getValue();
            TextClassification textClassification2 = (uky0Var != null && asy0.b(j, uky0Var.b) && jl40.l(charSequence, uky0Var.a)) ? uky0Var.c : null;
            aVar2.d(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            tlsVar.invoke(xky0Var);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                xky0Var.a.g(new mly0(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                xky0Var.a.g(new mly0(obj, textClassification, -1));
            }
            tlsVar.invoke(xky0Var);
            List<RemoteAction> actions = textClassification.getActions();
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                actions.get(i);
                if (i > 0) {
                    xky0Var.a.g(new mly0(obj, textClassification, i));
                }
            }
        }
        c6a1.k(xky0Var, context, z, charSequence, asy0Var.a);
    }

    public static final bwc0 b(SelectedTextType selectedTextType, k5z k5zVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(430530635);
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        fse fseVar = (fse) btsVar.m(a);
        boolean k = ((((i & 112) ^ 48) > 32 && btsVar.k(k5zVar)) || (i & 48) == 32) | btsVar.k(fseVar) | btsVar.k(context);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            b.getClass();
            Q = new a(fseVar, context, selectedTextType, k5zVar);
            btsVar.o0(Q);
        }
        bwc0 bwc0Var = (bwc0) Q;
        btsVar.t(false);
        return bwc0Var;
    }
}
