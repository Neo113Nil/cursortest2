package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public class b50 extends x40 {
    public final int a;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b50() {
        this(r0);
        int pickImagesMaxLimit;
        int extensionVersion;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = Integer.MAX_VALUE;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
    }

    @Override // defpackage.x40
    public final /* bridge */ /* synthetic */ w40 b(Context context, Object obj) {
        return null;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return EmptyList.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0 >= 2) goto L9;
     */
    @Override // defpackage.x40
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context, zlb0 zlb0Var) {
        int pickImagesMaxLimit;
        int extensionVersion;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.a;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), ImageMetadata.STATISTICS_FACE_DETECT_MODE) == null) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(ffx.S(zlb0Var.a));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
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
            intent2.setType(ffx.S(zlb0Var.a));
            int min = Math.min(i2, zlb0Var.b);
            if (min <= 1) {
                ny61.g("Max items must be greater than 1");
                return null;
            }
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min);
            zlb0Var.c.getClass();
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
            return intent2;
        }
        Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
        intent3.setType(ffx.S(zlb0Var.a));
        int min2 = Math.min(i2, zlb0Var.b);
        if (min2 > 1) {
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            if (min2 <= pickImagesMaxLimit) {
                intent3.putExtra("android.provider.extra.PICK_IMAGES_MAX", min2);
                zlb0Var.c.getClass();
                intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                intent3.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                return intent3;
            }
        }
        ny61.g("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
        return null;
    }

    public b50(int i) {
        this.a = i;
        if (i > 1) {
            return;
        }
        ny61.g("Max items must be higher than 1");
        throw null;
    }
}
