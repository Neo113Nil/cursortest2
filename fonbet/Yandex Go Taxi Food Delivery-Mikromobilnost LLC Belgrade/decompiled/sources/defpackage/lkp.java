package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.impl.FeatureCombinationQueryImpl$Companion$NO_OP_CALLBACK$1;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class lkp implements ikp {
    public static final FeatureCombinationQueryImpl$Companion$NO_OP_CALLBACK$1 B = new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$Companion$NO_OP_CALLBACK$1
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession p0) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession p0) {
        }
    };
    public final i3y A;
    public final Context a;
    public final String b;
    public final kr7 c;
    public final i3y w;
    public final i3y x;
    public final i3y y;
    public final i3y z;

    public lkp(Context context, String str, kr7 kr7Var) {
        this.a = context;
        this.b = str;
        this.c = kr7Var;
        final int i = 2;
        this.w = a.a(new sls(this) { // from class: jkp
            public final /* synthetic */ lkp b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                int i2 = i;
                int i3 = 0;
                lkp lkpVar = this.b;
                Boolean bool = null;
                r4 = null;
                r4 = null;
                km7 km7Var = null;
                switch (i2) {
                    case 0:
                        gym l = gym.l((ep7) lkpVar.y.getValue());
                        d6z.y("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((u8n) l.a).c();
                    case 1:
                        Context context2 = lkpVar.a;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                while (true) {
                                    if (i3 < serviceInfoArr.length) {
                                        int i4 = i3 + 1;
                                        try {
                                            Bundle bundle = serviceInfoArr[i3].metaData;
                                            if (bundle == null || bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") == null) {
                                                i3 = i4;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            w511.i(e.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(jl40.l(bool, Boolean.FALSE));
                    case 2:
                        Context context3 = lkpVar.a;
                        km7 km7Var2 = Build.VERSION.SDK_INT >= 35 ? new km7(context3) : null;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr2 != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr2) {
                                    Bundle bundle2 = serviceInfo.metaData;
                                    if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 != null) {
                                            ny61.r("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                        str2 = string;
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        km7Var = (km7) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                                    } catch (Exception e2) {
                                        ny61.h("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                        return null;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        String str3 = lkpVar.b;
                        ArrayList arrayList = new ArrayList();
                        if (km7Var != null) {
                            arrayList.add(new jj1(km7Var.a, str3));
                        }
                        if (km7Var2 != null) {
                            try {
                                arrayList.add(new jj1(km7Var2.a, str3));
                            } catch (UnsupportedOperationException unused3) {
                            }
                        }
                        return new jj1(arrayList);
                    case 3:
                        kr7 kr7Var2 = lkpVar.c;
                        CameraManager cameraManager = (CameraManager) kr7Var2.a.b;
                        String str4 = lkpVar.b;
                        isCameraDeviceSetupSupported = cameraManager.isCameraDeviceSetupSupported(str4);
                        if (!isCameraDeviceSetupSupported) {
                            return null;
                        }
                        cameraDeviceSetup = ((CameraManager) kr7Var2.a.b).getCameraDeviceSetup(str4);
                        return cameraDeviceSetup;
                    default:
                        try {
                            return lkpVar.c.a(lkpVar.b);
                        } catch (CameraAccessExceptionCompat e3) {
                            throw ceb1.b(e3);
                        }
                }
            }
        });
        final int i2 = 3;
        this.x = a.a(new sls(this) { // from class: jkp
            public final /* synthetic */ lkp b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                int i22 = i2;
                int i3 = 0;
                lkp lkpVar = this.b;
                Boolean bool = null;
                km7Var = null;
                km7Var = null;
                km7 km7Var = null;
                switch (i22) {
                    case 0:
                        gym l = gym.l((ep7) lkpVar.y.getValue());
                        d6z.y("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((u8n) l.a).c();
                    case 1:
                        Context context2 = lkpVar.a;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                while (true) {
                                    if (i3 < serviceInfoArr.length) {
                                        int i4 = i3 + 1;
                                        try {
                                            Bundle bundle = serviceInfoArr[i3].metaData;
                                            if (bundle == null || bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") == null) {
                                                i3 = i4;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            w511.i(e.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(jl40.l(bool, Boolean.FALSE));
                    case 2:
                        Context context3 = lkpVar.a;
                        km7 km7Var2 = Build.VERSION.SDK_INT >= 35 ? new km7(context3) : null;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr2 != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr2) {
                                    Bundle bundle2 = serviceInfo.metaData;
                                    if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 != null) {
                                            ny61.r("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                        str2 = string;
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        km7Var = (km7) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                                    } catch (Exception e2) {
                                        ny61.h("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                        return null;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        String str3 = lkpVar.b;
                        ArrayList arrayList = new ArrayList();
                        if (km7Var != null) {
                            arrayList.add(new jj1(km7Var.a, str3));
                        }
                        if (km7Var2 != null) {
                            try {
                                arrayList.add(new jj1(km7Var2.a, str3));
                            } catch (UnsupportedOperationException unused3) {
                            }
                        }
                        return new jj1(arrayList);
                    case 3:
                        kr7 kr7Var2 = lkpVar.c;
                        CameraManager cameraManager = (CameraManager) kr7Var2.a.b;
                        String str4 = lkpVar.b;
                        isCameraDeviceSetupSupported = cameraManager.isCameraDeviceSetupSupported(str4);
                        if (!isCameraDeviceSetupSupported) {
                            return null;
                        }
                        cameraDeviceSetup = ((CameraManager) kr7Var2.a.b).getCameraDeviceSetup(str4);
                        return cameraDeviceSetup;
                    default:
                        try {
                            return lkpVar.c.a(lkpVar.b);
                        } catch (CameraAccessExceptionCompat e3) {
                            throw ceb1.b(e3);
                        }
                }
            }
        });
        final int i3 = 4;
        this.y = a.a(new sls(this) { // from class: jkp
            public final /* synthetic */ lkp b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                int i22 = i3;
                int i32 = 0;
                lkp lkpVar = this.b;
                Boolean bool = null;
                km7Var = null;
                km7Var = null;
                km7 km7Var = null;
                switch (i22) {
                    case 0:
                        gym l = gym.l((ep7) lkpVar.y.getValue());
                        d6z.y("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((u8n) l.a).c();
                    case 1:
                        Context context2 = lkpVar.a;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                while (true) {
                                    if (i32 < serviceInfoArr.length) {
                                        int i4 = i32 + 1;
                                        try {
                                            Bundle bundle = serviceInfoArr[i32].metaData;
                                            if (bundle == null || bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") == null) {
                                                i32 = i4;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            w511.i(e.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(jl40.l(bool, Boolean.FALSE));
                    case 2:
                        Context context3 = lkpVar.a;
                        km7 km7Var2 = Build.VERSION.SDK_INT >= 35 ? new km7(context3) : null;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr2 != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr2) {
                                    Bundle bundle2 = serviceInfo.metaData;
                                    if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 != null) {
                                            ny61.r("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                        str2 = string;
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        km7Var = (km7) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                                    } catch (Exception e2) {
                                        ny61.h("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                        return null;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        String str3 = lkpVar.b;
                        ArrayList arrayList = new ArrayList();
                        if (km7Var != null) {
                            arrayList.add(new jj1(km7Var.a, str3));
                        }
                        if (km7Var2 != null) {
                            try {
                                arrayList.add(new jj1(km7Var2.a, str3));
                            } catch (UnsupportedOperationException unused3) {
                            }
                        }
                        return new jj1(arrayList);
                    case 3:
                        kr7 kr7Var2 = lkpVar.c;
                        CameraManager cameraManager = (CameraManager) kr7Var2.a.b;
                        String str4 = lkpVar.b;
                        isCameraDeviceSetupSupported = cameraManager.isCameraDeviceSetupSupported(str4);
                        if (!isCameraDeviceSetupSupported) {
                            return null;
                        }
                        cameraDeviceSetup = ((CameraManager) kr7Var2.a.b).getCameraDeviceSetup(str4);
                        return cameraDeviceSetup;
                    default:
                        try {
                            return lkpVar.c.a(lkpVar.b);
                        } catch (CameraAccessExceptionCompat e3) {
                            throw ceb1.b(e3);
                        }
                }
            }
        });
        final int i4 = 0;
        this.z = a.a(new sls(this) { // from class: jkp
            public final /* synthetic */ lkp b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                int i22 = i4;
                int i32 = 0;
                lkp lkpVar = this.b;
                Boolean bool = null;
                km7Var = null;
                km7Var = null;
                km7 km7Var = null;
                switch (i22) {
                    case 0:
                        gym l = gym.l((ep7) lkpVar.y.getValue());
                        d6z.y("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((u8n) l.a).c();
                    case 1:
                        Context context2 = lkpVar.a;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                while (true) {
                                    if (i32 < serviceInfoArr.length) {
                                        int i42 = i32 + 1;
                                        try {
                                            Bundle bundle = serviceInfoArr[i32].metaData;
                                            if (bundle == null || bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") == null) {
                                                i32 = i42;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            w511.i(e.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(jl40.l(bool, Boolean.FALSE));
                    case 2:
                        Context context3 = lkpVar.a;
                        km7 km7Var2 = Build.VERSION.SDK_INT >= 35 ? new km7(context3) : null;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr2 != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr2) {
                                    Bundle bundle2 = serviceInfo.metaData;
                                    if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 != null) {
                                            ny61.r("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                        str2 = string;
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        km7Var = (km7) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                                    } catch (Exception e2) {
                                        ny61.h("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                        return null;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        String str3 = lkpVar.b;
                        ArrayList arrayList = new ArrayList();
                        if (km7Var != null) {
                            arrayList.add(new jj1(km7Var.a, str3));
                        }
                        if (km7Var2 != null) {
                            try {
                                arrayList.add(new jj1(km7Var2.a, str3));
                            } catch (UnsupportedOperationException unused3) {
                            }
                        }
                        return new jj1(arrayList);
                    case 3:
                        kr7 kr7Var2 = lkpVar.c;
                        CameraManager cameraManager = (CameraManager) kr7Var2.a.b;
                        String str4 = lkpVar.b;
                        isCameraDeviceSetupSupported = cameraManager.isCameraDeviceSetupSupported(str4);
                        if (!isCameraDeviceSetupSupported) {
                            return null;
                        }
                        cameraDeviceSetup = ((CameraManager) kr7Var2.a.b).getCameraDeviceSetup(str4);
                        return cameraDeviceSetup;
                    default:
                        try {
                            return lkpVar.c.a(lkpVar.b);
                        } catch (CameraAccessExceptionCompat e3) {
                            throw ceb1.b(e3);
                        }
                }
            }
        });
        final int i5 = 1;
        this.A = a.a(new sls(this) { // from class: jkp
            public final /* synthetic */ lkp b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                int i22 = i5;
                int i32 = 0;
                lkp lkpVar = this.b;
                Boolean bool = null;
                km7Var = null;
                km7Var = null;
                km7 km7Var = null;
                switch (i22) {
                    case 0:
                        gym l = gym.l((ep7) lkpVar.y.getValue());
                        d6z.y("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((u8n) l.a).c();
                    case 1:
                        Context context2 = lkpVar.a;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                while (true) {
                                    if (i32 < serviceInfoArr.length) {
                                        int i42 = i32 + 1;
                                        try {
                                            Bundle bundle = serviceInfoArr[i32].metaData;
                                            if (bundle == null || bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") == null) {
                                                i32 = i42;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            w511.i(e.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(jl40.l(bool, Boolean.FALSE));
                    case 2:
                        Context context3 = lkpVar.a;
                        km7 km7Var2 = Build.VERSION.SDK_INT >= 35 ? new km7(context3) : null;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), HProv.PP_CONTAINER_EXTENSION).services;
                            if (serviceInfoArr2 != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr2) {
                                    Bundle bundle2 = serviceInfo.metaData;
                                    if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 != null) {
                                            ny61.r("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                        str2 = string;
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        km7Var = (km7) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                                    } catch (Exception e2) {
                                        ny61.h("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                        return null;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        String str3 = lkpVar.b;
                        ArrayList arrayList = new ArrayList();
                        if (km7Var != null) {
                            arrayList.add(new jj1(km7Var.a, str3));
                        }
                        if (km7Var2 != null) {
                            try {
                                arrayList.add(new jj1(km7Var2.a, str3));
                            } catch (UnsupportedOperationException unused3) {
                            }
                        }
                        return new jj1(arrayList);
                    case 3:
                        kr7 kr7Var2 = lkpVar.c;
                        CameraManager cameraManager = (CameraManager) kr7Var2.a.b;
                        String str4 = lkpVar.b;
                        isCameraDeviceSetupSupported = cameraManager.isCameraDeviceSetupSupported(str4);
                        if (!isCameraDeviceSetupSupported) {
                            return null;
                        }
                        cameraDeviceSetup = ((CameraManager) kr7Var2.a.b).getCameraDeviceSetup(str4);
                        return cameraDeviceSetup;
                    default:
                        try {
                            return lkpVar.c.a(lkpVar.b);
                        } catch (CameraAccessExceptionCompat e3) {
                            throw ceb1.b(e3);
                        }
                }
            }
        });
    }

    @Override // defpackage.ikp
    public final boolean f(jyq0 jyq0Var) {
        CaptureRequest.Builder createCaptureRequest;
        boolean isTerminated;
        kkp kkpVar;
        DynamicRangeProfiles h;
        OutputConfiguration i;
        s38 s38Var = jyq0Var.g;
        ArrayList<gyq0> arrayList = jyq0Var.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (gyq0 gyq0Var : arrayList) {
            if (((Boolean) this.A.getValue()).booleanValue()) {
                Class cls = gyq0Var.f().j;
                Objects.toString(gyq0Var.f().j);
                sgb1.g(3, "FeatureCombinationQueryImpl");
                if (cls != null) {
                    Size size = gyq0Var.f().h;
                    if (size == null) {
                        ny61.g("Required value was null.");
                        return false;
                    }
                    i = new OutputConfiguration(size, cls);
                } else {
                    i = q82.i(gyq0Var.f().i, gyq0Var.f().h);
                }
                kkpVar = new kkp(i, null);
            } else {
                Class cls2 = gyq0Var.f().j;
                long j = jl40.l(cls2, MediaCodec.class) ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : jl40.l(cls2, SurfaceHolder.class) ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : jl40.l(cls2, SurfaceTexture.class) ? 256L : 0L;
                Objects.toString(gyq0Var.f().j);
                sgb1.g(3, "FeatureCombinationQueryImpl");
                ImageReader newInstance = ImageReader.newInstance(gyq0Var.f().h.getWidth(), gyq0Var.f().h.getHeight(), gyq0Var.f().i, 1, j);
                kkpVar = new kkp(new OutputConfiguration(newInstance.getSurface()), newInstance);
            }
            if (gyq0Var.f().j != null && (h = jif.h(this.z.getValue())) != null) {
                Long a = r8n.a(gyq0Var.b(), h);
                if (a == null) {
                    ny61.g("Required value was null.");
                    return false;
                }
                kkpVar.a.setDynamicRangeProfile(a.longValue());
            }
            arrayList2.add(kkpVar);
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((kkp) it.next()).a);
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList3, geb1.b(), B);
        CameraDevice.CameraDeviceSetup f = q82.f(this.x.getValue());
        if (f == null) {
            sessionConfiguration = null;
        } else {
            createCaptureRequest = f.createCaptureRequest(s38Var.c);
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, s38Var.a());
            if (s38Var.c() == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            sessionConfiguration.setSessionParameters(createCaptureRequest.build());
        }
        if (sessionConfiguration == null) {
            return false;
        }
        int i2 = ((jj1) this.w.getValue()).a(sessionConfiguration).b;
        new StringBuilder("fpsRange=").append(s38Var.a());
        new StringBuilder(", previewStabilizationMode=").append(s38Var.c());
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            gyq0 gyq0Var2 = (gyq0) obj;
            StringBuilder sb = new StringBuilder("{format=");
            sb.append(gyq0Var2.f().i);
            sb.append(", size=");
            sb.append(gyq0Var2.f().h);
            sb.append(", dynamicRange=");
            sb.append(gyq0Var2.b());
            sb.append(", class=");
            sb.append(gyq0Var2.f().j);
            sb.append('}');
            i3 = i4;
        }
        sgb1.g(3, "FeatureCombinationQueryImpl");
        boolean z = i2 == 1;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it2.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z2 = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z2) {
                                executorService.shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (!(autoCloseable instanceof TypedArray)) {
                    w511.q();
                    return false;
                }
                ((TypedArray) autoCloseable).recycle();
            }
        }
        return z;
    }
}
