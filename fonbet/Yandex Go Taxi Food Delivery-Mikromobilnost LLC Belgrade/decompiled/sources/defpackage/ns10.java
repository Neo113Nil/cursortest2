package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final /* synthetic */ class ns10 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public /* synthetic */ ns10(ps10 ps10Var, String str, String str2, int i) {
        this.a = i;
        this.b = ps10Var;
        this.c = str;
        this.w = str2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.w;
        String str2 = this.c;
        ps10 ps10Var = this.b;
        switch (i) {
            case 0:
                final q0r q0rVar = ps10Var.p;
                q0rVar.getClass();
                final int i2 = 1;
                q0rVar.a(str2, str, new yls() { // from class: p0r
                    @Override // defpackage.yls
                    public final Object apply(Object obj) {
                        int i3 = i2;
                        q0r q0rVar2 = q0rVar;
                        Uri uri = (Uri) obj;
                        switch (i3) {
                            case 0:
                                return u8b1.d(q0rVar2.a, uri);
                            default:
                                Context context = q0rVar2.a;
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(uri, "audio/opus");
                                intent.addFlags(268435457);
                                if (intent.resolveActivity(context.getPackageManager()) != null && Objects.equals("audio/opus", "audio/opus")) {
                                    return intent;
                                }
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("audio/opus");
                                intent.putExtra("android.intent.extra.STREAM", uri);
                                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "Sharing File...");
                                intent.putExtra("android.intent.extra.TEXT", "Sharing File...");
                                Intent createChooser = Intent.createChooser(intent, "Share File");
                                createChooser.addFlags(SelfTester_JCP.IMITA);
                                return createChooser;
                        }
                    }
                });
                break;
            default:
                final q0r q0rVar2 = ps10Var.p;
                q0rVar2.getClass();
                final int i3 = 0;
                q0rVar2.a(str2, str, new yls() { // from class: p0r
                    @Override // defpackage.yls
                    public final Object apply(Object obj) {
                        int i32 = i3;
                        q0r q0rVar22 = q0rVar2;
                        Uri uri = (Uri) obj;
                        switch (i32) {
                            case 0:
                                return u8b1.d(q0rVar22.a, uri);
                            default:
                                Context context = q0rVar22.a;
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(uri, "audio/opus");
                                intent.addFlags(268435457);
                                if (intent.resolveActivity(context.getPackageManager()) != null && Objects.equals("audio/opus", "audio/opus")) {
                                    return intent;
                                }
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("audio/opus");
                                intent.putExtra("android.intent.extra.STREAM", uri);
                                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "Sharing File...");
                                intent.putExtra("android.intent.extra.TEXT", "Sharing File...");
                                Intent createChooser = Intent.createChooser(intent, "Share File");
                                createChooser.addFlags(SelfTester_JCP.IMITA);
                                return createChooser;
                        }
                    }
                });
                break;
        }
        return zy11Var;
    }
}
