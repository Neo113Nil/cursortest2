package xsna;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PickerPhotoResultLauncherImpl.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class eia0 implements ua0, g0t {
    public final /* synthetic */ dia0 b;

    public eia0(dia0 dia0Var) {
        this.b = dia0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ua0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, dia0.class, "handleResult", "handleResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        Intent intent;
        Uri data;
        ActivityResult activityResult = (ActivityResult) obj;
        if (activityResult.b != -1 || (intent = activityResult.c) == null || (data = intent.getData()) == null) {
            return;
        }
        this.b.b.invoke(data);
    }
}
