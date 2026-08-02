package xsna;

import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.f;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: Camera2UseCaseConfigFactory.java */
/* loaded from: classes11.dex */
public final class kf9 implements UseCaseConfigFactory {
    public static final Size b = new Size(1920, 1080);
    public final WindowManager a;

    /* compiled from: Camera2UseCaseConfigFactory.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            a = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public kf9(@NonNull Context context) {
        this.a = (WindowManager) context.getSystemService("window");
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    @Nullable
    public final Config a(@NonNull UseCaseConfigFactory.CaptureType captureType) {
        int i;
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        HashSet hashSet = new HashSet();
        f.a aVar = new f.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i2 = 1;
        aVar.c = 1;
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (captureType == captureType2 && ((y4d0) n6m.a.a(y4d0.class)) != null) {
            androidx.camera.core.impl.n z2 = androidx.camera.core.impl.n.z();
            CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
            androidx.camera.core.impl.a aVar2 = if9.t;
            z2.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key.getName(), Object.class, key), 2);
            aVar.c(new if9(androidx.camera.core.impl.o.y(z2)));
        }
        z.C(androidx.camera.core.impl.u.h, new androidx.camera.core.impl.r(new ArrayList(hashSet), arrayList, arrayList2, arrayList4, arrayList3, aVar.d()));
        z.C(androidx.camera.core.impl.u.j, jf9.a);
        HashSet hashSet2 = new HashSet();
        androidx.camera.core.impl.n z3 = androidx.camera.core.impl.n.z();
        ArrayList arrayList5 = new ArrayList();
        ai50 b2 = ai50.b();
        int i3 = a.a[captureType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                i2 = -1;
            }
            i = i2;
        } else {
            i = 2;
        }
        androidx.camera.core.impl.a aVar3 = androidx.camera.core.impl.u.i;
        ArrayList arrayList6 = new ArrayList(hashSet2);
        androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(z3);
        d0o0 d0o0Var = d0o0.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : b2.a.keySet()) {
            arrayMap.put(str, b2.a(str));
        }
        z.C(aVar3, new androidx.camera.core.impl.f(arrayList6, y, i, arrayList5, false, new d0o0(arrayMap)));
        z.C(androidx.camera.core.impl.u.k, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? zgw.b : cf9.a);
        WindowManager windowManager = this.a;
        if (captureType == captureType2) {
            androidx.camera.core.impl.a aVar4 = androidx.camera.core.impl.l.f;
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
            int height = size.getHeight() * size.getWidth();
            Size size2 = b;
            if (height > size2.getHeight() * size2.getWidth()) {
                size = size2;
            }
            z.C(aVar4, size);
        }
        z.C(androidx.camera.core.impl.l.c, Integer.valueOf(windowManager.getDefaultDisplay().getRotation()));
        return androidx.camera.core.impl.o.y(z);
    }
}
