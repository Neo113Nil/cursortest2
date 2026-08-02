package com.yandex.go.pickup_from_photo.domain;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import defpackage.bjb0;
import defpackage.g8e;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sgb0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class t {
    public final sgb0 a;
    public final com.yandex.go.pickup_from_photo.data.c b;
    public final bjb0 c;

    public t(sgb0 sgb0Var, com.yandex.go.pickup_from_photo.data.c cVar, bjb0 bjb0Var) {
        this.a = sgb0Var;
        this.b = cVar;
        this.c = bjb0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:20:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UploadPhotosInteractor$uploadSavedPhotos$1 uploadPhotosInteractor$uploadSavedPhotos$1;
        int i;
        int size;
        List list;
        int i2;
        if (continuationImpl instanceof UploadPhotosInteractor$uploadSavedPhotos$1) {
            uploadPhotosInteractor$uploadSavedPhotos$1 = (UploadPhotosInteractor$uploadSavedPhotos$1) continuationImpl;
            int i3 = uploadPhotosInteractor$uploadSavedPhotos$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uploadPhotosInteractor$uploadSavedPhotos$1.label = i3 - Integer.MIN_VALUE;
                Object obj = uploadPhotosInteractor$uploadSavedPhotos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uploadPhotosInteractor$uploadSavedPhotos$1.label;
                bjb0 bjb0Var = this.c;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    size = bjb0Var.b.size();
                    list = t;
                    i2 = 0;
                    if (i2 >= size) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    List list2 = (List) obj;
                    LinkedHashSet linkedHashSet = bjb0Var.b;
                    int size2 = linkedHashSet.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        bjb0Var.a(i4).delete();
                    }
                    linkedHashSet.clear();
                    return list2;
                }
                size = uploadPhotosInteractor$uploadSavedPhotos$1.I$1;
                i2 = uploadPhotosInteractor$uploadSavedPhotos$1.I$0;
                list = (List) uploadPhotosInteractor$uploadSavedPhotos$1.L$0;
                kotlin.b.b(obj);
                list.add((byte[]) obj);
                i2++;
                if (i2 >= size) {
                    Context context = bjb0Var.a;
                    Uri uriForFile = FileProvider.getUriForFile(context, g8e.o("ru.yandex.taxi.utils.fileprovider.", context.getPackageName()), bjb0Var.a(i2));
                    uploadPhotosInteractor$uploadSavedPhotos$1.L$0 = list;
                    uploadPhotosInteractor$uploadSavedPhotos$1.I$0 = i2;
                    uploadPhotosInteractor$uploadSavedPhotos$1.I$1 = size;
                    uploadPhotosInteractor$uploadSavedPhotos$1.label = 1;
                    sgb0 sgb0Var = this.a;
                    sgb0Var.b.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new PhotoCompressionInteractor$compressPhoto$2(sgb0Var, uriForFile, null), uploadPhotosInteractor$uploadSavedPhotos$1);
                } else {
                    uploadPhotosInteractor$uploadSavedPhotos$1.L$0 = null;
                    uploadPhotosInteractor$uploadSavedPhotos$1.label = 2;
                    obj = this.b.b(list, uploadPhotosInteractor$uploadSavedPhotos$1);
                }
                return coroutineSingletons;
            }
        }
        uploadPhotosInteractor$uploadSavedPhotos$1 = new UploadPhotosInteractor$uploadSavedPhotos$1(this, continuationImpl);
        Object obj2 = uploadPhotosInteractor$uploadSavedPhotos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uploadPhotosInteractor$uploadSavedPhotos$1.label;
        bjb0 bjb0Var2 = this.c;
        if (i != 0) {
        }
    }
}
