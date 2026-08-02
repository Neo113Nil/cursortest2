package xsna;

import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.SurfaceConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: SupportedSurfaceCombination.java */
/* loaded from: classes11.dex */
public final class gjn0 {
    public static final Size m = new Size(1920, 1080);
    public static final Size n = new Size(640, 480);
    public static final Size o = new Size(0, 0);
    public static final Size p = new Size(1920, 1080);
    public static final Size q = new Size(PublisherConfiguration.DEFAULT_MAX_RES, 480);
    public static final Rational r = new Rational(4, 3);
    public static final Rational s = new Rational(3, 4);
    public static final Rational t = new Rational(16, 9);
    public static final Rational u = new Rational(9, 16);
    public final ArrayList a;
    public final HashMap b;
    public final String c;
    public final rq d;
    public final tg9 e;
    public final u2q f;
    public final boolean g;
    public final HashMap h;
    public final boolean i;
    public final boolean j;
    public final co5 k;
    public final HashMap l;

    /* compiled from: SupportedSurfaceCombination.java */
    public static final class a implements Comparator<Rational> {
        public Rational b;

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            Rational rational5 = this.b;
            if (rational3.equals(rational4)) {
                return 0;
            }
            return (int) Math.signum(Math.abs(rational3.floatValue() - rational5.floatValue()) - Math.abs(rational4.floatValue() - rational5.floatValue()));
        }
    }

    public gjn0(@NonNull Context context, @NonNull String str, @NonNull bj9 bj9Var, @NonNull rq rqVar) throws CameraUnavailableException {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new HashMap();
        this.h = new HashMap();
        this.i = false;
        this.j = false;
        this.l = new HashMap();
        str.getClass();
        this.c = str;
        rqVar.getClass();
        this.d = rqVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f = new u2q(str);
        try {
            tg9 a2 = bj9Var.a(str);
            this.e = a2;
            Integer num = (Integer) a2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            int intValue = num != null ? num.intValue() : 2;
            Size size = (Size) a2.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
            this.g = size == null || size.getWidth() >= size.getHeight();
            ArrayList arrayList2 = new ArrayList();
            androidx.camera.core.impl.s sVar = new androidx.camera.core.impl.s();
            SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
            SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
            sVar.a(new androidx.camera.core.impl.b(configType, configSize));
            arrayList2.add(sVar);
            androidx.camera.core.impl.s sVar2 = new androidx.camera.core.impl.s();
            SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
            sVar2.a(new androidx.camera.core.impl.b(configType2, configSize));
            arrayList2.add(sVar2);
            androidx.camera.core.impl.s sVar3 = new androidx.camera.core.impl.s();
            SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
            sVar3.a(new androidx.camera.core.impl.b(configType3, configSize));
            arrayList2.add(sVar3);
            androidx.camera.core.impl.s sVar4 = new androidx.camera.core.impl.s();
            SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
            sVar4.a(new androidx.camera.core.impl.b(configType, configSize2));
            sVar4.a(new androidx.camera.core.impl.b(configType2, configSize));
            arrayList2.add(sVar4);
            androidx.camera.core.impl.s sVar5 = new androidx.camera.core.impl.s();
            sVar5.a(new androidx.camera.core.impl.b(configType3, configSize2));
            sVar5.a(new androidx.camera.core.impl.b(configType2, configSize));
            arrayList2.add(sVar5);
            androidx.camera.core.impl.s sVar6 = new androidx.camera.core.impl.s();
            sVar6.a(new androidx.camera.core.impl.b(configType, configSize2));
            sVar6.a(new androidx.camera.core.impl.b(configType, configSize2));
            arrayList2.add(sVar6);
            androidx.camera.core.impl.s sVar7 = new androidx.camera.core.impl.s();
            sVar7.a(new androidx.camera.core.impl.b(configType, configSize2));
            sVar7.a(new androidx.camera.core.impl.b(configType3, configSize2));
            arrayList2.add(sVar7);
            androidx.camera.core.impl.s sVar8 = new androidx.camera.core.impl.s();
            sVar8.a(new androidx.camera.core.impl.b(configType, configSize2));
            sVar8.a(new androidx.camera.core.impl.b(configType3, configSize2));
            sVar8.a(new androidx.camera.core.impl.b(configType2, configSize));
            arrayList2.add(sVar8);
            arrayList.addAll(arrayList2);
            if (intValue == 0 || intValue == 1 || intValue == 3) {
                ArrayList arrayList3 = new ArrayList();
                androidx.camera.core.impl.s sVar9 = new androidx.camera.core.impl.s();
                sVar9.a(new androidx.camera.core.impl.b(configType, configSize2));
                SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
                sVar9.a(new androidx.camera.core.impl.b(configType, configSize3));
                arrayList3.add(sVar9);
                androidx.camera.core.impl.s sVar10 = new androidx.camera.core.impl.s();
                sVar10.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar10.a(new androidx.camera.core.impl.b(configType3, configSize3));
                arrayList3.add(sVar10);
                androidx.camera.core.impl.s sVar11 = new androidx.camera.core.impl.s();
                sVar11.a(new androidx.camera.core.impl.b(configType3, configSize2));
                sVar11.a(new androidx.camera.core.impl.b(configType3, configSize3));
                arrayList3.add(sVar11);
                androidx.camera.core.impl.s sVar12 = new androidx.camera.core.impl.s();
                sVar12.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar12.a(new androidx.camera.core.impl.b(configType, configSize3));
                sVar12.a(new androidx.camera.core.impl.b(configType2, configSize3));
                arrayList3.add(sVar12);
                androidx.camera.core.impl.s sVar13 = new androidx.camera.core.impl.s();
                sVar13.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar13.a(new androidx.camera.core.impl.b(configType3, configSize3));
                sVar13.a(new androidx.camera.core.impl.b(configType2, configSize3));
                arrayList3.add(sVar13);
                androidx.camera.core.impl.s sVar14 = new androidx.camera.core.impl.s();
                sVar14.a(new androidx.camera.core.impl.b(configType3, configSize2));
                sVar14.a(new androidx.camera.core.impl.b(configType3, configSize2));
                sVar14.a(new androidx.camera.core.impl.b(configType2, configSize));
                arrayList3.add(sVar14);
                arrayList.addAll(arrayList3);
            }
            if (intValue == 1 || intValue == 3) {
                ArrayList arrayList4 = new ArrayList();
                androidx.camera.core.impl.s sVar15 = new androidx.camera.core.impl.s();
                sVar15.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar15.a(new androidx.camera.core.impl.b(configType, configSize));
                arrayList4.add(sVar15);
                androidx.camera.core.impl.s sVar16 = new androidx.camera.core.impl.s();
                sVar16.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar16.a(new androidx.camera.core.impl.b(configType3, configSize));
                arrayList4.add(sVar16);
                androidx.camera.core.impl.s sVar17 = new androidx.camera.core.impl.s();
                sVar17.a(new androidx.camera.core.impl.b(configType3, configSize2));
                sVar17.a(new androidx.camera.core.impl.b(configType3, configSize));
                arrayList4.add(sVar17);
                androidx.camera.core.impl.s sVar18 = new androidx.camera.core.impl.s();
                sVar18.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar18.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar18.a(new androidx.camera.core.impl.b(configType2, configSize));
                arrayList4.add(sVar18);
                androidx.camera.core.impl.s sVar19 = new androidx.camera.core.impl.s();
                SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.ANALYSIS;
                sVar19.a(new androidx.camera.core.impl.b(configType3, configSize4));
                sVar19.a(new androidx.camera.core.impl.b(configType, configSize2));
                sVar19.a(new androidx.camera.core.impl.b(configType3, configSize));
                arrayList4.add(sVar19);
                androidx.camera.core.impl.s sVar20 = new androidx.camera.core.impl.s();
                sVar20.a(new androidx.camera.core.impl.b(configType3, configSize4));
                sVar20.a(new androidx.camera.core.impl.b(configType3, configSize2));
                sVar20.a(new androidx.camera.core.impl.b(configType3, configSize));
                arrayList4.add(sVar20);
                arrayList.addAll(arrayList4);
            }
            int[] iArr = (int[]) a2.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 3) {
                        this.i = true;
                    } else if (i == 6) {
                        this.j = true;
                    }
                }
            }
            if (this.i) {
                ArrayList arrayList5 = new ArrayList();
                androidx.camera.core.impl.s sVar21 = new androidx.camera.core.impl.s();
                SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
                SurfaceConfig.ConfigSize configSize5 = SurfaceConfig.ConfigSize.MAXIMUM;
                sVar21.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar21);
                androidx.camera.core.impl.s sVar22 = new androidx.camera.core.impl.s();
                SurfaceConfig.ConfigType configType5 = SurfaceConfig.ConfigType.PRIV;
                SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.PREVIEW;
                sVar22.a(new androidx.camera.core.impl.b(configType5, configSize6));
                sVar22.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar22);
                androidx.camera.core.impl.s sVar23 = new androidx.camera.core.impl.s();
                SurfaceConfig.ConfigType configType6 = SurfaceConfig.ConfigType.YUV;
                sVar23.a(new androidx.camera.core.impl.b(configType6, configSize6));
                sVar23.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar23);
                androidx.camera.core.impl.s sVar24 = new androidx.camera.core.impl.s();
                sVar24.a(new androidx.camera.core.impl.b(configType5, configSize6));
                sVar24.a(new androidx.camera.core.impl.b(configType5, configSize6));
                sVar24.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar24);
                androidx.camera.core.impl.s sVar25 = new androidx.camera.core.impl.s();
                sVar25.a(new androidx.camera.core.impl.b(configType5, configSize6));
                sVar25.a(new androidx.camera.core.impl.b(configType6, configSize6));
                sVar25.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar25);
                androidx.camera.core.impl.s sVar26 = new androidx.camera.core.impl.s();
                sVar26.a(new androidx.camera.core.impl.b(configType6, configSize6));
                sVar26.a(new androidx.camera.core.impl.b(configType6, configSize6));
                sVar26.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar26);
                androidx.camera.core.impl.s sVar27 = new androidx.camera.core.impl.s();
                sVar27.a(new androidx.camera.core.impl.b(configType5, configSize6));
                SurfaceConfig.ConfigType configType7 = SurfaceConfig.ConfigType.JPEG;
                sVar27.a(new androidx.camera.core.impl.b(configType7, configSize5));
                sVar27.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar27);
                androidx.camera.core.impl.s sVar28 = new androidx.camera.core.impl.s();
                sVar28.a(new androidx.camera.core.impl.b(configType6, configSize6));
                sVar28.a(new androidx.camera.core.impl.b(configType7, configSize5));
                sVar28.a(new androidx.camera.core.impl.b(configType4, configSize5));
                arrayList5.add(sVar28);
                arrayList.addAll(arrayList5);
            }
            if (this.j && intValue == 0) {
                ArrayList arrayList6 = new ArrayList();
                androidx.camera.core.impl.s sVar29 = new androidx.camera.core.impl.s();
                SurfaceConfig.ConfigType configType8 = SurfaceConfig.ConfigType.PRIV;
                SurfaceConfig.ConfigSize configSize7 = SurfaceConfig.ConfigSize.PREVIEW;
                sVar29.a(new androidx.camera.core.impl.b(configType8, configSize7));
                SurfaceConfig.ConfigSize configSize8 = SurfaceConfig.ConfigSize.MAXIMUM;
                sVar29.a(new androidx.camera.core.impl.b(configType8, configSize8));
                arrayList6.add(sVar29);
                androidx.camera.core.impl.s sVar30 = new androidx.camera.core.impl.s();
                sVar30.a(new androidx.camera.core.impl.b(configType8, configSize7));
                SurfaceConfig.ConfigType configType9 = SurfaceConfig.ConfigType.YUV;
                sVar30.a(new androidx.camera.core.impl.b(configType9, configSize8));
                arrayList6.add(sVar30);
                androidx.camera.core.impl.s sVar31 = new androidx.camera.core.impl.s();
                sVar31.a(new androidx.camera.core.impl.b(configType9, configSize7));
                sVar31.a(new androidx.camera.core.impl.b(configType9, configSize8));
                arrayList6.add(sVar31);
                arrayList.addAll(arrayList6);
            }
            if (intValue == 3) {
                ArrayList arrayList7 = new ArrayList();
                androidx.camera.core.impl.s sVar32 = new androidx.camera.core.impl.s();
                SurfaceConfig.ConfigType configType10 = SurfaceConfig.ConfigType.PRIV;
                SurfaceConfig.ConfigSize configSize9 = SurfaceConfig.ConfigSize.PREVIEW;
                sVar32.a(new androidx.camera.core.impl.b(configType10, configSize9));
                SurfaceConfig.ConfigSize configSize10 = SurfaceConfig.ConfigSize.ANALYSIS;
                sVar32.a(new androidx.camera.core.impl.b(configType10, configSize10));
                SurfaceConfig.ConfigType configType11 = SurfaceConfig.ConfigType.YUV;
                SurfaceConfig.ConfigSize configSize11 = SurfaceConfig.ConfigSize.MAXIMUM;
                sVar32.a(new androidx.camera.core.impl.b(configType11, configSize11));
                SurfaceConfig.ConfigType configType12 = SurfaceConfig.ConfigType.RAW;
                sVar32.a(new androidx.camera.core.impl.b(configType12, configSize11));
                arrayList7.add(sVar32);
                androidx.camera.core.impl.s sVar33 = new androidx.camera.core.impl.s();
                sVar33.a(new androidx.camera.core.impl.b(configType10, configSize9));
                sVar33.a(new androidx.camera.core.impl.b(configType10, configSize10));
                sVar33.a(new androidx.camera.core.impl.b(SurfaceConfig.ConfigType.JPEG, configSize11));
                sVar33.a(new androidx.camera.core.impl.b(configType12, configSize11));
                arrayList7.add(sVar33);
                arrayList.addAll(arrayList7);
            }
            Size size2 = new Size(640, 480);
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            Size size3 = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
            Size size4 = (Size) Collections.min(Arrays.asList(new Size(size3.getWidth(), size3.getHeight()), m), new b());
            Size size5 = q;
            try {
                int parseInt = Integer.parseInt(this.c);
                this.d.getClass();
                CamcorderProfile camcorderProfile = CamcorderProfile.get(parseInt, 1);
                if (camcorderProfile != null) {
                    size5 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                }
            } catch (NumberFormatException unused) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
                }
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                if (outputSizes != null) {
                    int i2 = 0;
                    Arrays.sort(outputSizes, new b(0));
                    int length = outputSizes.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Size size6 = outputSizes[i2];
                        int width = size6.getWidth();
                        Size size7 = p;
                        if (width <= size7.getWidth() && size6.getHeight() <= size7.getHeight()) {
                            size5 = size6;
                            break;
                        }
                        i2++;
                    }
                }
            }
            this.k = new co5(size2, size4, size5);
        } catch (CameraAccessExceptionCompat e) {
            throw we7.f(e);
        }
    }

    public static int c(Size size) {
        return size.getHeight() * size.getWidth();
    }

    public static boolean e(int i, int i2, Rational rational) {
        obr.b(i2 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    public static void f(List list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i >= list.size()) {
                break;
            }
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i4 >= 0) {
                arrayList.add((Size) list.get(i4));
            }
            i2 = i + 1;
        }
        list.removeAll(arrayList);
    }

    @NonNull
    public final Size[] a(@NonNull Size[] sizeArr, int i) {
        ArrayList arrayList;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.h;
        List list = (List) hashMap.get(valueOf);
        if (list == null) {
            u2q u2qVar = this.f;
            u2qVar.getClass();
            if (((v2q) n6m.a.a(v2q.class)) == null) {
                list = new ArrayList();
            } else {
                String str = u2qVar.a;
                String str2 = Build.BRAND;
                if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
                    }
                } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
                    }
                } else {
                    list = Collections.EMPTY_LIST;
                }
                list = arrayList;
            }
            hashMap.put(Integer.valueOf(i), list);
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        arrayList2.removeAll(list);
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    @NonNull
    public final Size[] b(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.l;
        Size[] sizeArr = (Size[]) hashMap.get(valueOf);
        if (sizeArr != null) {
            return sizeArr;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null) {
            throw new IllegalArgumentException(lhg.a(i, "Can not get supported output size for the format: "));
        }
        Size[] a2 = a(outputSizes, i);
        Arrays.sort(a2, new b(0));
        hashMap.put(Integer.valueOf(i), a2);
        return a2;
    }

    @Nullable
    public final Size d(@NonNull androidx.camera.core.impl.l lVar) {
        int p2 = lVar.p(0);
        Size j = lVar.j();
        if (j != null) {
            CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
            tg9 tg9Var = this.e;
            Integer num = (Integer) tg9Var.a(key);
            obr.e(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
            int K = cdi.K(p2);
            Integer num2 = (Integer) tg9Var.a(CameraCharacteristics.LENS_FACING);
            obr.e(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
            int D = cdi.D(K, num.intValue(), 1 == num2.intValue());
            if (D == 90 || D == 270) {
                return new Size(j.getHeight(), j.getWidth());
            }
        }
        return j;
    }

    public final androidx.camera.core.impl.b g(int i, Size size) {
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        SurfaceConfig.ConfigType configType = i == 35 ? SurfaceConfig.ConfigType.YUV : i == 256 ? SurfaceConfig.ConfigType.JPEG : i == 32 ? SurfaceConfig.ConfigType.RAW : SurfaceConfig.ConfigType.PRIV;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        Size size2 = (Size) hashMap.get(valueOf);
        if (size2 == null) {
            size2 = (Size) Collections.max(Arrays.asList(b(i)), new b());
            hashMap.put(Integer.valueOf(i), size2);
        }
        if (size.getHeight() * size.getWidth() <= this.k.a.getHeight() * this.k.a.getWidth()) {
            configSize = SurfaceConfig.ConfigSize.ANALYSIS;
        } else {
            if (size.getHeight() * size.getWidth() <= this.k.b.getHeight() * this.k.b.getWidth()) {
                configSize = SurfaceConfig.ConfigSize.PREVIEW;
            } else {
                if (size.getHeight() * size.getWidth() <= this.k.c.getHeight() * this.k.c.getWidth()) {
                    configSize = SurfaceConfig.ConfigSize.RECORD;
                } else {
                    if (size.getHeight() * size.getWidth() <= size2.getHeight() * size2.getWidth()) {
                        configSize = SurfaceConfig.ConfigSize.MAXIMUM;
                    }
                }
            }
        }
        return new androidx.camera.core.impl.b(configType, configSize);
    }

    /* compiled from: SupportedSurfaceCombination.java */
    public static final class b implements Comparator<Size> {
        public final boolean b = false;

        public b() {
        }

        @Override // java.util.Comparator
        public final int compare(Size size, Size size2) {
            Size size3 = size;
            Size size4 = size2;
            int signum = Long.signum((size3.getWidth() * size3.getHeight()) - (size4.getWidth() * size4.getHeight()));
            return this.b ? signum * (-1) : signum;
        }

        public b(int i) {
        }
    }
}
