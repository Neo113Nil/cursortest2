package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.tam0;

/* compiled from: StoryGalleryUtils.kt */
/* loaded from: classes3.dex */
public final class f3m0 {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (xsna.drm0.D(r6.toString(), "com.android.providers.media.photopicker", false) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(Intent intent, boolean z, boolean z2) {
        Bundle bundleExtra;
        boolean z3;
        boolean z4;
        Collection singletonList;
        if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) {
            return EmptyList.b;
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty() || booleanArray == null || booleanArray.length == 0) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        int size = parcelableArrayList.size();
        int i = 0;
        while (i < size) {
            Uri uri = (Uri) parcelableArrayList.get(i);
            String path = uri.getPath();
            if (path != null) {
                File file = new File(path);
                if (!oeq0.e(uri)) {
                    Regex regex = com.vk.core.files.a.a;
                    if (!vhk0.g(file)) {
                    }
                }
                if (booleanArray[i]) {
                    String path2 = uri.getPath();
                    if (path2 == null) {
                        path2 = "";
                    }
                    if (brm0.B(uri.toString(), "content:", false)) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        path2 = tam0.a.e(context, uri);
                    }
                    singletonList = tam0.x.d(new File(path2), z2, true, false);
                    z3 = z;
                    z4 = z2;
                } else {
                    z3 = z;
                    z4 = z2;
                    singletonList = Collections.singletonList(tam0.a.c(uri, false, false, z3, z4, null, 38));
                }
                arrayList.addAll(singletonList);
                i++;
                z = z3;
                z2 = z4;
            }
            z3 = z;
            z4 = z2;
            i++;
            z = z3;
            z2 = z4;
        }
        return arrayList;
    }
}
