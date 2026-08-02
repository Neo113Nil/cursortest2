package defpackage;

import android.view.ViewGroup;
import android.widget.Toast;

/* loaded from: classes15.dex */
public final /* synthetic */ class ghv implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jhv b;

    public /* synthetic */ ghv(jhv jhvVar, int i) {
        this.a = i;
        this.b = jhvVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        jhv jhvVar = this.b;
        switch (i) {
            case 0:
                Toast.makeText(jhvVar.a, oyh0.messaging_image_viewer_save_failed_toast, 0).show();
                return zy11.a;
            default:
                return new ygv(jhvVar.A, (ViewGroup) jhvVar.D.e);
        }
    }
}
