package xsna;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: AppCompatActivityPermissionsHelper.java */
/* loaded from: classes9.dex */
public final class d23 extends wx90<AppCompatActivity> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wx90
    public final void a(int i, @NonNull String... strArr) {
        h90.i((Activity) this.a, strArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wx90
    public final boolean c(@NonNull String str) {
        return h90.l((Activity) this.a, str);
    }
}
