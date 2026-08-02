package xsna;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GdprRationaleDialogFragment.kt */
/* loaded from: classes4.dex */
public final class oht implements DialogInterface.OnClickListener {
    public final xx90 b;
    public final com.vk.permission.b c;
    public final gzs<s3q0> d;

    public oht(xx90 xx90Var, com.vk.permission.b bVar, gzs<s3q0> gzsVar) {
        this.b = xx90Var;
        this.c = bVar;
        this.d = gzsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.vk.permission.b bVar = this.c;
        String[] strArr = bVar.e;
        int i2 = bVar.d;
        xx90 xx90Var = this.b;
        if (i == -1) {
            if (xx90Var instanceof q90) {
                wx90.b(((q90) xx90Var).a).a(i2, (String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            } else {
                if (!(xx90Var instanceof ebs)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ebs) xx90Var).a.requestPermissions((String[]) Arrays.copyOf(strArr, strArr.length), i2);
                return;
            }
        }
        if (xx90Var instanceof q90) {
            ComponentCallbacks2 componentCallbacks2 = ((q90) xx90Var).a;
            if (componentCallbacks2 instanceof nht) {
                ((nht) componentCallbacks2).K0(i2, strArr);
                this.d.invoke();
            }
        }
        if (xx90Var instanceof ebs) {
            z1h0 z1h0Var = ((ebs) xx90Var).a;
            if (z1h0Var instanceof nht) {
                ((nht) z1h0Var).K0(i2, strArr);
            }
        }
        this.d.invoke();
    }
}
