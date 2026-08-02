package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.b;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public abstract class bg70 {
    public static final Feature[] a = new Feature[0];
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final zzai f;
    public static final zzai g;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        c = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        d = feature5;
        new Feature("mlkit.ocr.chinese", 1L);
        new Feature("mlkit.ocr.common", 1L);
        new Feature("mlkit.ocr.devanagari", 1L);
        new Feature("mlkit.ocr.japanese", 1L);
        new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        new Feature("mlkit.image.caption", 1L);
        new Feature("mlkit.docscan.detect", 1L);
        new Feature("mlkit.docscan.crop", 1L);
        new Feature("mlkit.docscan.enhance", 1L);
        new Feature("mlkit.docscan.ui", 1L);
        new Feature("mlkit.docscan.stain", 1L);
        new Feature("mlkit.docscan.shadow", 1L);
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        e = new Feature("mlkit.segmentation.subject", 1L);
        a aVar = new a();
        aVar.a("barcode", feature);
        aVar.a("custom_ica", feature2);
        aVar.a("face", feature3);
        aVar.a("ica", feature4);
        aVar.a("ocr", feature5);
        aVar.a("langid", feature6);
        aVar.a("nlclassifier", feature7);
        aVar.a("tflite_dynamite", feature8);
        aVar.a("barcode_ui", feature9);
        aVar.a("smart_reply", feature10);
        f = aVar.b();
        a aVar2 = new a();
        aVar2.a("com.google.android.gms.vision.barcode", feature);
        aVar2.a("com.google.android.gms.vision.custom.ica", feature2);
        aVar2.a("com.google.android.gms.vision.face", feature3);
        aVar2.a("com.google.android.gms.vision.ica", feature4);
        aVar2.a("com.google.android.gms.vision.ocr", feature5);
        aVar2.a("com.google.android.gms.mlkit.langid", feature6);
        aVar2.a("com.google.android.gms.mlkit.nlclassifier", feature7);
        aVar2.a("com.google.android.gms.tflite_dynamite", feature8);
        aVar2.a("com.google.android.gms.mlkit_smartreply", feature10);
        g = aVar2.b();
    }

    public static boolean a(Context context, Feature[] featureArr) {
        try {
            zzw e2 = aob1.a(context).e(new b8b1(featureArr, 1));
            iy60 iy60Var = new iy60() { // from class: qjb1
                @Override // defpackage.iy60
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            };
            e2.getClass();
            e2.e(dtx0.a, iy60Var);
            return ((ModuleAvailabilityResponse) udq0.f(e2)).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e3) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
            return false;
        }
    }

    public static void b(Context context, String str) {
        o491 o491Var = zzaf.b;
        Object[] objArr = {str};
        qje.g0(1, objArr);
        c(context, zzaf.i(1, objArr));
    }

    public static void c(Context context, List list) {
        b.b.getClass();
        if (b.a(context) >= 221500000) {
            d(context, e(list, f));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void d(Context context, Feature[] featureArr) {
        q530 q530Var = new q530();
        b8b1 b8b1Var = new b8b1(featureArr, 0);
        ArrayList arrayList = q530Var.a;
        arrayList.add(b8b1Var);
        aob1.a(context).f(new r530(arrayList, q530Var.b)).d(new iy60() { // from class: qbb1
            @Override // defpackage.iy60
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    public static Feature[] e(List list, Map map) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Feature feature = (Feature) map.get(list.get(i));
            cvw.l(feature);
            featureArr[i] = feature;
        }
        return featureArr;
    }
}
