package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final /* synthetic */ class f0b0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ f0b0(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Activity activity = this.b;
        switch (i2) {
            case 0:
                activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", activity.getPackageName(), null)).addFlags(SelfTester_JCP.IMITA));
                break;
            default:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=" + activity.getPackageName()));
                intent.setFlags(SelfTester_JCP.IMITA);
                activity.startActivity(intent);
                break;
        }
    }
}
