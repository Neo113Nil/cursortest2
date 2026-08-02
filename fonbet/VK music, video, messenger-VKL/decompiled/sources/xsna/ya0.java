package xsna;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ab0;
import xsna.va0;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes11.dex */
public final class ya0 extends va0<nha0, List<Uri>> {
    public final int a;

    public ya0(int i) {
        this.a = i;
        if (i <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0 >= 2) goto L9;
     */
    @Override // xsna.va0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context, nha0 nha0Var) {
        int pickImagesMaxLimit;
        int extensionVersion;
        nha0 nha0Var2 = nha0Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.a;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(ab0.a.a(nha0Var2.a));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent.getType() == null) {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent;
            }
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            if (resolveActivity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(ab0.a.a(nha0Var2.a));
            int min = Math.min(i2, nha0Var2.b);
            if (min <= 1) {
                throw new IllegalArgumentException("Max items must be greater than 1");
            }
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min);
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", nha0Var2.c.a());
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
            return intent2;
        }
        Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
        intent3.setType(ab0.a.a(nha0Var2.a));
        int min2 = Math.min(i2, nha0Var2.b);
        if (min2 > 1) {
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            if (min2 <= pickImagesMaxLimit) {
                intent3.putExtra("android.provider.extra.PICK_IMAGES_MAX", min2);
                intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", nha0Var2.c.a());
                intent3.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                return intent3;
            }
        }
        throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
    }

    @Override // xsna.va0
    public final /* bridge */ /* synthetic */ va0.a<List<Uri>> b(Context context, nha0 nha0Var) {
        return null;
    }

    @Override // xsna.va0
    public final List<Uri> c(int i, Intent intent) {
        List<Uri> arrayList;
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
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = EmptyList.b;
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return EmptyList.b;
    }
}
