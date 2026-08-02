package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.app.d1;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import java.io.File;

/* loaded from: classes15.dex */
public final /* synthetic */ class fhv implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jhv b;

    public /* synthetic */ fhv(jhv jhvVar, int i) {
        this.a = i;
        this.b = jhvVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jhv jhvVar = this.b;
        switch (i) {
            case 0:
                FragmentActivity fragmentActivity = jhvVar.a;
                d1 d1Var = new d1(fragmentActivity);
                ((Intent) d1Var.c).setType("image/*");
                d1Var.a(new Uri.Builder().scheme("content").authority(fragmentActivity.getPackageName() + fragmentActivity.getString(nyh0.file_provider_authority_suffix)).encodedPath("share_photo".concat(((File) obj).getPath())).build());
                d1Var.w = fragmentActivity.getText(oyh0.messaging_image_viewer_share_dialog_title);
                fragmentActivity.startActivity(d1Var.b());
                break;
            case 1:
                FragmentActivity fragmentActivity2 = jhvVar.a;
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent.setData(Uri.fromFile((File) obj));
                fragmentActivity2.sendBroadcast(intent);
                Toast.makeText(fragmentActivity2, oyh0.messaging_image_viewer_save_toast, 0).show();
                break;
            case 2:
                jhvVar.q("ACTION_FORWARD", (ServerMessageRef) obj);
                break;
            case 3:
                jhvVar.q("ACTION_REPLY", (ServerMessageRef) obj);
                break;
            case 4:
                jhvVar.q("ACTION_PIN", (ServerMessageRef) obj);
                break;
            case 5:
                FragmentActivity fragmentActivity3 = jhvVar.a;
                Intent intent2 = new Intent("ACTION_SHOW_MESSAGE");
                intent2.putExtra("local_ref", (LocalMessageRef) obj);
                fragmentActivity3.setResult(-1, intent2);
                fragmentActivity3.finish();
                break;
            case 6:
                jhvVar.x.a(1, new tqs(10, jhvVar, (ServerMessageRef) obj), new ihv());
                break;
            default:
                FragmentActivity fragmentActivity4 = jhvVar.a;
                Intent intent3 = new Intent("ACTION_RESEND");
                intent3.putExtra("image_info", (ImageViewerInfo) obj);
                fragmentActivity4.setResult(-1, intent3);
                fragmentActivity4.finish();
                break;
        }
        return zy11Var;
    }
}
