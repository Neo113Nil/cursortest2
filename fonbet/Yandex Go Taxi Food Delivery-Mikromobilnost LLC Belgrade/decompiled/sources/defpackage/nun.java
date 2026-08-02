package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.viewsintegration.c;

/* loaded from: classes.dex */
public final class nun extends dai0 {
    public final c d;

    public nun(TextView textView) {
        this.d = new c(textView);
    }

    @Override // defpackage.dai0
    public final void G(boolean z) {
        if (ftn.e()) {
            this.d.G(z);
        }
    }

    @Override // defpackage.dai0
    public final void H(boolean z) {
        boolean e = ftn.e();
        c cVar = this.d;
        if (e) {
            cVar.H(z);
        } else {
            cVar.f = z;
        }
    }

    @Override // defpackage.dai0
    public final void P() {
        if (ftn.e()) {
            this.d.P();
        }
    }

    @Override // defpackage.dai0
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return !ftn.e() ? transformationMethod : this.d.Q(transformationMethod);
    }

    @Override // defpackage.dai0
    public final InputFilter[] q(InputFilter[] inputFilterArr) {
        return !ftn.e() ? inputFilterArr : this.d.q(inputFilterArr);
    }

    @Override // defpackage.dai0
    public final boolean x() {
        return this.d.f;
    }
}
