package defpackage;

import android.net.Uri;
import com.yandex.go.beginners.safety.photo.main.c;
import com.yandex.go.beginners.safety.photo.upload.b;
import com.yandex.mobile.drive.sdk.DriveSdkView;

/* loaded from: classes12.dex */
public final /* synthetic */ class cr7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ cr7(int i, Uri uri) {
        this.a = i;
        this.b = uri;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 openDeeplink$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Uri uri = this.b;
        switch (i) {
            case 0:
                rwl0 rwl0Var = (rwl0) obj;
                switch (rwl0Var.a) {
                    case 0:
                        ((c) rwl0Var.b).r(new cr7(2, uri));
                        return zy11Var;
                    default:
                        b bVar = (b) rwl0Var.b;
                        bVar.J.a(bVar.o(), new ohb0(uri, false), bVar.M, bVar.L);
                        return zy11Var;
                }
            case 1:
                openDeeplink$lambda$3 = DriveSdkView.openDeeplink$lambda$3(uri, (efm) obj);
                return openDeeplink$lambda$3;
            default:
                ((hxl0) obj).n1(new ohb0(uri, false));
                return zy11Var;
        }
    }
}
