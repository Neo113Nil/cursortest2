package xsna;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.internal.mlkit_common.zzau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.f5o0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class pt80 {

    @NonNull
    public static final Feature[] a = new Feature[0];

    @NonNull
    public static final Feature b;
    public static final zzau c;
    public static final zzau d;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
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
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        zzat zzatVar = new zzat();
        zzatVar.zza("barcode", feature);
        zzatVar.zza("custom_ica", feature2);
        zzatVar.zza("face", feature3);
        zzatVar.zza("ica", feature4);
        zzatVar.zza("ocr", feature5);
        zzatVar.zza("langid", feature6);
        zzatVar.zza("nlclassifier", feature7);
        zzatVar.zza("tflite_dynamite", feature8);
        zzatVar.zza("barcode_ui", feature9);
        zzatVar.zza("smart_reply", feature10);
        c = zzatVar.zzb();
        zzat zzatVar2 = new zzat();
        zzatVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzatVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzatVar2.zza("com.google.android.gms.vision.face", feature3);
        zzatVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzatVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzatVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzatVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzatVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzatVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        d = zzatVar2.zzb();
    }

    @Deprecated
    public static void a(@NonNull Context context, @NonNull List<String> list) {
        Task doRead;
        com.google.android.gms.common.a.b.getClass();
        if (com.google.android.gms.common.a.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(StringUtils.COMMA, list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        final Feature[] b2 = b(list, c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ot80() { // from class: xsna.yn01
            @Override // xsna.ot80
            public final Feature[] m() {
                Feature[] featureArr = pt80.a;
                return b2;
            }
        });
        exc0.a("APIs must not be empty.", !arrayList.isEmpty());
        fqz0 fqz0Var = new fqz0(context, fqz0.a, a.d.U6, b.a.c);
        ApiFeatureRequest b3 = ApiFeatureRequest.b(arrayList, true);
        if (b3.b.isEmpty()) {
            doRead = Tasks.forResult(new ModuleInstallResponse(0));
        } else {
            f5o0.a a2 = f5o0.a();
            a2.d = new Feature[]{com.google.android.gms.internal.base.zas.zaa};
            a2.c = true;
            a2.b = true;
            a2.e = 27304;
            a2.a = new vj20(fqz0Var, b3);
            doRead = fqz0Var.doRead(a2.a());
        }
        doRead.addOnFailureListener(po01.a);
    }

    public static Feature[] b(List list, Map map) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Feature feature = (Feature) map.get(list.get(i));
            exc0.i(feature);
            featureArr[i] = feature;
        }
        return featureArr;
    }
}
