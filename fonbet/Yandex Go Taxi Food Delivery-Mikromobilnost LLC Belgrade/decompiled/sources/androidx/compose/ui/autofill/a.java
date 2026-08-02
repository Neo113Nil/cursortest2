package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.bms;
import defpackage.cnq0;
import defpackage.cur;
import defpackage.hz40;
import defpackage.knq0;
import defpackage.lvr;
import defpackage.o94;
import defpackage.qc20;
import defpackage.qje;
import defpackage.x4e;
import defpackage.xx40;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class a extends o94 implements cur {
    public final xx40 A;
    public boolean B;
    public final qc20 a;
    public final knq0 b;
    public final AndroidComposeView c;
    public final androidx.compose.ui.spatial.a w;
    public final String x;
    public final Rect y = new Rect();
    public final AutofillId z;

    public a(qc20 qc20Var, knq0 knq0Var, AndroidComposeView androidComposeView, androidx.compose.ui.spatial.a aVar, String str) {
        this.a = qc20Var;
        this.b = knq0Var;
        this.c = androidComposeView;
        this.w = aVar;
        this.x = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw x4e.v("Required value was null.");
        }
        this.z = autofillId;
        this.A = new xx40((Object) null);
    }

    public final void a(final LayoutNode layoutNode) {
        this.w.b.e(layoutNode.b, new bms() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // defpackage.bms
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a.this.y.set(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                a aVar = a.this;
                qc20 qc20Var = aVar.a;
                ((AutofillManager) qc20Var.a).requestAutofill(aVar.c, ((LayoutNode) layoutNode).b, aVar.y);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.cur
    public final void onFocusChanged(lvr lvrVar, lvr lvrVar2) {
        LayoutNode P;
        cnq0 u;
        LayoutNode P2;
        cnq0 u2;
        if (lvrVar != null && (P2 = qje.P(lvrVar)) != null && (u2 = P2.u()) != null) {
            hz40 hz40Var = u2.a;
            if (hz40Var.a(androidx.compose.ui.semantics.a.g) || hz40Var.a(androidx.compose.ui.semantics.a.h)) {
                ((AutofillManager) this.a.a).notifyViewExited(this.c, P2.b);
            }
        }
        if (lvrVar2 == null || (P = qje.P(lvrVar2)) == null || (u = P.u()) == null) {
            return;
        }
        hz40 hz40Var2 = u.a;
        if (hz40Var2.a(androidx.compose.ui.semantics.a.g) || hz40Var2.a(androidx.compose.ui.semantics.a.h)) {
            final int i = P.b;
            this.w.b.e(i, new bms() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Number) obj).intValue();
                    int intValue2 = ((Number) obj2).intValue();
                    int intValue3 = ((Number) obj3).intValue();
                    int intValue4 = ((Number) obj4).intValue();
                    a aVar = a.this;
                    qc20 qc20Var = aVar.a;
                    ((AutofillManager) qc20Var.a).notifyViewEntered(aVar.c, i, new Rect(intValue, intValue2, intValue3, intValue4));
                    return zy11.a;
                }
            });
        }
    }
}
