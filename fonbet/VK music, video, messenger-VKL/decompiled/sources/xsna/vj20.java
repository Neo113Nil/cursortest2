package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: MethodSelectorEditTextsController.kt */
/* loaded from: classes15.dex */
public final class vj20 implements ouf0 {
    public final Object b;
    public Parcelable c;

    public /* synthetic */ vj20(fqz0 fqz0Var, ApiFeatureRequest apiFeatureRequest) {
        this.b = fqz0Var;
        this.c = apiFeatureRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        apz0 apz0Var = new apz0((fqz0) this.b, (TaskCompletionSource) obj2);
        doz0 doz0Var = (doz0) ((iqz0) obj).getService();
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.c;
        Parcel zaa = doz0Var.zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, apz0Var);
        com.google.android.gms.internal.base.zac.zab(zaa, apiFeatureRequest);
        com.google.android.gms.internal.base.zac.zac(zaa, null);
        doz0Var.zac(2, zaa);
    }

    public vj20(fzf fzfVar) {
        this.b = fzfVar;
    }
}
