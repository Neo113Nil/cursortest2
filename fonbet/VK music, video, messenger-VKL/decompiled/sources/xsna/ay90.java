package xsna;

import android.content.Context;
import android.webkit.PermissionRequest;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: PermissionRequestChromeClient.kt */
/* loaded from: classes6.dex */
public class ay90 extends bir0 {
    public final yc80 e;
    public final Object f = pn00.k(new Pair("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA"), new Pair("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO"));

    public ay90(yc80 yc80Var) {
        this.e = yc80Var;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        Context context;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onPermissionRequest");
        }
        if (permissionRequest != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] resources = permissionRequest.getResources();
            int i = 0;
            while (i < resources.length) {
                int i2 = i + 1;
                try {
                    String str = resources[i];
                    String str2 = (String) this.f.get(str);
                    if (str2 != null) {
                        FrameLayout frameLayout = this.b;
                        if (frameLayout == null || (context = frameLayout.getContext()) == null || anj.a(context, str2) != 0) {
                            arrayList2.add(str2);
                        } else {
                            arrayList.add(str);
                        }
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
            } else {
                this.e.c(arrayList2, new zx90(this, arrayList, permissionRequest, arrayList2), new gwg(this, arrayList, permissionRequest, arrayList2, 3));
            }
        }
    }
}
