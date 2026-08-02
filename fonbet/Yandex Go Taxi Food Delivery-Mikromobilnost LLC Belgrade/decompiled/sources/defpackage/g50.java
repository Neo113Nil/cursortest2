package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.ar.core.ImageMetadata;
import kotlin.collections.a;

/* loaded from: classes.dex */
public class g50 extends x40 {
    @Override // defpackage.x40
    public final /* bridge */ /* synthetic */ w40 b(Context context, Object obj) {
        return null;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) a.R(ela1.e(intent)) : data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4 >= 2) goto L9;
     */
    @Override // defpackage.x40
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context, zlb0 zlb0Var) {
        int extensionVersion;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), ImageMetadata.STATISTICS_FACE_DETECT_MODE) == null) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(ffx.S(zlb0Var.b()));
                if (intent.getType() == null) {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent;
            }
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), ImageMetadata.STATISTICS_FACE_DETECT_MODE);
            if (resolveActivity == null) {
                ny61.r("Required value was null.");
                return null;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(ffx.S(zlb0Var.b()));
            zlb0Var.a().getClass();
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent2;
        }
        Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
        intent3.setType(ffx.S(zlb0Var.b()));
        zlb0Var.a().getClass();
        intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }
}
