package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.vk.core.util.RecreateActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import one.video.controls.view.buttons.CastButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class jz9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ jz9(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r8.resolveActivity(r7) == null) goto L10;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        Intent intent = null;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = CastButton.g;
                return m33.a(R.drawable.one_video_icon_cast_enabled_filled_24, context);
            case 1:
                cxn.e(context, "Goals");
                return s3q0.a;
            case 2:
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    return null;
                }
                return t2i0.a(context, 0, launchIntentForPackage, 335544320);
            default:
                int i3 = RecreateActivity.b;
                Intent intent2 = new Intent(context, (Class<?>) RecreateActivity.class);
                intent2.addFlags(268435456);
                String packageName = context.getPackageName();
                String packageName2 = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.setPackage(packageName2);
                intent3.addCategory("android.intent.category.LAUNCHER");
                ResolveInfo resolveInfo = (ResolveInfo) j5g.a0(packageManager.queryIntentActivities(intent3, 0));
                if (resolveInfo == null) {
                    intent3 = new Intent("android.intent.action.MAIN");
                    intent3.setPackage(packageName2);
                    intent3.addCategory("android.intent.category.DEFAULT");
                    intent3.addCategory("android.intent.category.MULTIWINDOW_LAUNCHER");
                    break;
                } else {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    intent3.setClassName(activityInfo.packageName, activityInfo.name);
                }
                intent = intent3;
                if (intent == null) {
                    throw new IllegalStateException(zr.a("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
                }
                intent.addFlags(268468224);
                intent2.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Collections.singletonList(intent)));
                context.startActivity(intent2);
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
                Runtime.getRuntime().exit(0);
                return s3q0.a;
        }
    }

    public /* synthetic */ jz9(cxn cxnVar, Context context) {
        this.b = 1;
        this.c = context;
    }
}
