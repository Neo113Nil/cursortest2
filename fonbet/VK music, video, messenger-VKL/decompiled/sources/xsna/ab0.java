package xsna;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.va0;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes11.dex */
public final class ab0 extends va0<nha0, Uri> {

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        public static String a(g gVar) {
            if (gVar instanceof d) {
                return "image/*";
            }
            if (gVar instanceof f) {
                return "video/*";
            }
            if ((gVar instanceof e) || (gVar instanceof c)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    public static abstract class b {

        /* compiled from: ActivityResultContracts.kt */
        public static final class a extends b {
            public static final a a = new a();
            public static final int b = 1;

            @Override // xsna.ab0.b
            public final int a() {
                return b;
            }
        }

        public abstract int a();
    }

    /* compiled from: ActivityResultContracts.kt */
    public static final class c implements g {
        public static final c a = new c();
    }

    /* compiled from: ActivityResultContracts.kt */
    public static final class d implements g {
        public static final d a = new d();
    }

    /* compiled from: ActivityResultContracts.kt */
    public static final class e implements g {
    }

    /* compiled from: ActivityResultContracts.kt */
    public static final class f implements g {
        public static final f a = new f();
    }

    /* compiled from: ActivityResultContracts.kt */
    public interface g {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 >= 2) goto L9;
     */
    @Override // xsna.va0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context, nha0 nha0Var) {
        int extensionVersion;
        nha0 nha0Var2 = nha0Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(a.a(nha0Var2.a));
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
            intent2.setType(a.a(nha0Var2.a));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", nha0Var2.c.a());
            return intent2;
        }
        Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
        intent3.setType(a.a(nha0Var2.a));
        intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", nha0Var2.c.a());
        return intent3;
    }

    @Override // xsna.va0
    public final /* bridge */ /* synthetic */ va0.a<Uri> b(Context context, nha0 nha0Var) {
        return null;
    }

    @Override // xsna.va0
    public final Uri c(int i, Intent intent) {
        List arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
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
        return (Uri) j5g.a0(arrayList);
    }
}
