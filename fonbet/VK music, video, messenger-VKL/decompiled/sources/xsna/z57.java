package xsna;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z57 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ z57(Activity activity, int i) {
        this.b = i;
        this.c = activity;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.c;
                appCompatActivity.getIntent().putExtra("app_content_hidden", false);
                appCompatActivity.getWindow().clearFlags(8192);
                break;
            default:
                tmq.a().i(this.c);
                break;
        }
        return s3q0.a;
    }
}
