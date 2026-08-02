package androidx.core.app;

import android.content.Intent;
import defpackage.a3y0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class c1 implements i {
    public final i a;

    public c1(i iVar) {
        this.a = iVar;
    }

    @Override // androidx.core.app.i
    public final void e() {
        a3y0 a3y0Var;
        try {
            this.a.e();
        } catch (Exception e) {
            a3y0Var = SafeJobIntentService.logger;
            a3y0Var.b("complete", e, new a1(1));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.a.equals(((c1) obj).a);
    }

    @Override // androidx.core.app.i
    public final Intent getIntent() {
        return this.a.getIntent();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TaxiGenericWorkItem(genericWorkItem=" + this.a + Extension.C_BRAKE;
    }
}
