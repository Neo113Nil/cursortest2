package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigSource;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import com.adjust.sdk.Constants;
import defpackage.am7;
import defpackage.amp0;
import defpackage.anw0;
import defpackage.bow0;
import defpackage.bza1;
import defpackage.ceb1;
import defpackage.cj21;
import defpackage.d6z;
import defpackage.dyq0;
import defpackage.eav;
import defpackage.ep7;
import defpackage.gbs;
import defpackage.gvc;
import defpackage.gw00;
import defpackage.gym;
import defpackage.gzj;
import defpackage.hkp;
import defpackage.hyq0;
import defpackage.i34;
import defpackage.ikp;
import defpackage.j4n;
import defpackage.jru0;
import defpackage.jyq0;
import defpackage.kax0;
import defpackage.kr7;
import defpackage.lju;
import defpackage.lru0;
import defpackage.max0;
import defpackage.ny61;
import defpackage.oru0;
import defpackage.oyr;
import defpackage.p84;
import defpackage.q84;
import defpackage.q8n;
import defpackage.qir;
import defpackage.r38;
import defpackage.rh;
import defpackage.s38;
import defpackage.sgb1;
import defpackage.smw0;
import defpackage.szd;
import defpackage.tcc;
import defpackage.tis0;
import defpackage.tse0;
import defpackage.u8n;
import defpackage.unr0;
import defpackage.vjs0;
import defpackage.wn7;
import defpackage.wor0;
import defpackage.wrj0;
import defpackage.x34;
import defpackage.x83;
import defpackage.x84;
import defpackage.x8v;
import defpackage.xbj;
import defpackage.xi21;
import defpackage.xib1;
import defpackage.ydb1;
import defpackage.ymw0;
import defpackage.yy40;
import defpackage.z4p;
import defpackage.zmw0;
import defpackage.zoi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.UnsafeLazyImpl;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class y {
    public final tis0 B;
    public final lju C;
    public final ikp D;
    public final String k;
    public final am7 l;
    public final ep7 m;
    public final z4p n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public x84 w;
    public final gzj y;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap g = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final kax0 z = new kax0();
    public final wrj0 A = new wrj0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x053e  */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(Context context, String str, kr7 kr7Var, am7 am7Var, ikp ikpVar) {
        ArrayList arrayList;
        CameraCharacteristics.Key key;
        boolean z;
        int[] iArr;
        boolean z2;
        this.p = false;
        this.q = false;
        this.t = false;
        this.u = false;
        str.getClass();
        this.k = str;
        am7Var.getClass();
        this.l = am7Var;
        this.n = new z4p();
        this.y = gzj.b(context);
        try {
            ep7 a = kr7Var.a(str);
            this.m = a;
            Integer num = (Integer) a.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.o = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.p = true;
                    } else if (i == 6) {
                        this.q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.t = true;
                    } else if (i == 1) {
                        this.u = true;
                    }
                }
            }
            tis0 tis0Var = new tis0(this.m);
            this.B = tis0Var;
            this.C = new lju(this.m);
            ArrayList arrayList2 = this.a;
            int i2 = this.o;
            boolean z3 = this.p;
            boolean z4 = this.q;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ymw0 ymw0Var = new ymw0();
            SurfaceConfig$ConfigType surfaceConfig$ConfigType = SurfaceConfig$ConfigType.PRIV;
            SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.MAXIMUM;
            ymw0 h = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize, ymw0Var, arrayList4, ymw0Var);
            SurfaceConfig$ConfigType surfaceConfig$ConfigType2 = SurfaceConfig$ConfigType.JPEG;
            ymw0 h2 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, h, arrayList4, h);
            SurfaceConfig$ConfigType surfaceConfig$ConfigType3 = SurfaceConfig$ConfigType.YUV;
            ymw0 h3 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, h2, arrayList4, h2);
            SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2 = SurfaceConfig$ConfigSize.PREVIEW;
            smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h3, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize);
            ymw0 i3 = tse0.i(arrayList4, h3);
            smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, i3, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize);
            ymw0 i4 = tse0.i(arrayList4, i3);
            smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i4, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
            ymw0 i5 = tse0.i(arrayList4, i4);
            smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i5, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2);
            ymw0 i6 = tse0.i(arrayList4, i5);
            smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i6, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2);
            i6.a(anw0.a(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize));
            arrayList4.add(i6);
            arrayList3.addAll(arrayList4);
            if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 3) {
                ArrayList arrayList5 = new ArrayList();
                ymw0 ymw0Var2 = new ymw0();
                ymw0Var2.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2));
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize3 = SurfaceConfig$ConfigSize.RECORD;
                ymw0 h4 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize3, ymw0Var2, arrayList5, ymw0Var2);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h4, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize3);
                ymw0 i7 = tse0.i(arrayList5, h4);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, i7, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize3);
                ymw0 i8 = tse0.i(arrayList5, i7);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i8, surfaceConfig$ConfigType, surfaceConfig$ConfigSize3);
                ymw0 h5 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize3, i8, arrayList5, i8);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h5, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize3);
                ymw0 h6 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize3, h5, arrayList5, h5);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, h6, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2);
                h6.a(anw0.a(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize));
                arrayList5.add(h6);
                arrayList3.addAll(arrayList5);
            }
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList6 = new ArrayList();
                ymw0 ymw0Var3 = new ymw0();
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, ymw0Var3, surfaceConfig$ConfigType, surfaceConfig$ConfigSize);
                ymw0 i9 = tse0.i(arrayList6, ymw0Var3);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i9, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                ymw0 i10 = tse0.i(arrayList6, i9);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, i10, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                ymw0 i11 = tse0.i(arrayList6, i10);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i11, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h7 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, i11, arrayList6, i11);
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize4 = SurfaceConfig$ConfigSize.VGA;
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize4, h7, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h8 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, h7, arrayList6, h7);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize4, h8, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2);
                h8.a(anw0.a(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize));
                arrayList6.add(h8);
                arrayList3.addAll(arrayList6);
            }
            if (z3) {
                ArrayList arrayList7 = new ArrayList();
                ymw0 ymw0Var4 = new ymw0();
                SurfaceConfig$ConfigType surfaceConfig$ConfigType4 = SurfaceConfig$ConfigType.RAW;
                ymw0 h9 = tse0.h(surfaceConfig$ConfigType4, surfaceConfig$ConfigSize, ymw0Var4, arrayList7, ymw0Var4);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h9, surfaceConfig$ConfigType4, surfaceConfig$ConfigSize);
                ymw0 i12 = tse0.i(arrayList7, h9);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, i12, surfaceConfig$ConfigType4, surfaceConfig$ConfigSize);
                ymw0 i13 = tse0.i(arrayList7, i12);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i13, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h10 = tse0.h(surfaceConfig$ConfigType4, surfaceConfig$ConfigSize, i13, arrayList7, i13);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h10, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2);
                ymw0 h11 = tse0.h(surfaceConfig$ConfigType4, surfaceConfig$ConfigSize, h10, arrayList7, h10);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, h11, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2);
                ymw0 h12 = tse0.h(surfaceConfig$ConfigType4, surfaceConfig$ConfigSize, h11, arrayList7, h11);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h12, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize);
                ymw0 h13 = tse0.h(surfaceConfig$ConfigType4, surfaceConfig$ConfigSize, h12, arrayList7, h12);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, h13, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize);
                h13.a(anw0.a(surfaceConfig$ConfigType4, surfaceConfig$ConfigSize));
                arrayList7.add(h13);
                arrayList3.addAll(arrayList7);
            }
            if (z4 && i2 == 0) {
                ArrayList arrayList8 = new ArrayList();
                ymw0 ymw0Var5 = new ymw0();
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, ymw0Var5, surfaceConfig$ConfigType, surfaceConfig$ConfigSize);
                ymw0 i14 = tse0.i(arrayList8, ymw0Var5);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i14, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                ymw0 i15 = tse0.i(arrayList8, i14);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, i15, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                arrayList8.add(i15);
                arrayList3.addAll(arrayList8);
            }
            if (i2 == 3) {
                ArrayList arrayList9 = new ArrayList();
                ymw0 ymw0Var6 = new ymw0();
                ymw0Var6.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2));
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize5 = SurfaceConfig$ConfigSize.VGA;
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize5, ymw0Var6, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                SurfaceConfig$ConfigType surfaceConfig$ConfigType5 = SurfaceConfig$ConfigType.RAW;
                ymw0 h14 = tse0.h(surfaceConfig$ConfigType5, surfaceConfig$ConfigSize, ymw0Var6, arrayList9, ymw0Var6);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h14, surfaceConfig$ConfigType, surfaceConfig$ConfigSize5);
                smw0.w(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, h14, surfaceConfig$ConfigType5, surfaceConfig$ConfigSize);
                arrayList9.add(h14);
                arrayList3.addAll(arrayList9);
            }
            arrayList2.addAll(arrayList3);
            z4p z4pVar = this.n;
            String str2 = this.k;
            if (z4pVar.a == null) {
                arrayList = new ArrayList();
            } else {
                ymw0 ymw0Var7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList = arrayList10;
                    if (str2.equals("1")) {
                        arrayList10.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                        arrayList = arrayList10;
                    }
                } else {
                    arrayList = ((!Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.e()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
                }
            }
            arrayList2.addAll(arrayList);
            if (this.t) {
                ArrayList arrayList11 = this.b;
                ArrayList arrayList12 = new ArrayList();
                ymw0 ymw0Var8 = new ymw0();
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize6 = SurfaceConfig$ConfigSize.ULTRA_MAXIMUM;
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize6, ymw0Var8, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize7 = SurfaceConfig$ConfigSize.RECORD;
                ymw0 h15 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize7, ymw0Var8, arrayList12, ymw0Var8);
                smw0.w(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize6, h15, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h16 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize7, h15, arrayList12, h15);
                SurfaceConfig$ConfigType surfaceConfig$ConfigType6 = SurfaceConfig$ConfigType.RAW;
                smw0.w(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize6, h16, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h17 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize7, h16, arrayList12, h16);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize6, h17, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h18 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, h17, arrayList12, h17);
                smw0.w(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize6, h18, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h19 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, h18, arrayList12, h18);
                smw0.w(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize6, h19, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h20 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, h19, arrayList12, h19);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize6, h20, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h21 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, h20, arrayList12, h20);
                smw0.w(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize6, h21, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h22 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, h21, arrayList12, h21);
                smw0.w(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize6, h22, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h23 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, h22, arrayList12, h22);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize6, h23, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h24 = tse0.h(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize, h23, arrayList12, h23);
                smw0.w(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize6, h24, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                ymw0 h25 = tse0.h(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize, h24, arrayList12, h24);
                smw0.w(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize6, h25, surfaceConfig$ConfigType, surfaceConfig$ConfigSize2);
                h25.a(anw0.a(surfaceConfig$ConfigType6, surfaceConfig$ConfigSize));
                arrayList12.add(h25);
                arrayList11.addAll(arrayList12);
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.r = hasSystemFeature;
            if (hasSystemFeature) {
                ArrayList arrayList13 = this.c;
                ArrayList arrayList14 = new ArrayList();
                ymw0 ymw0Var9 = new ymw0();
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize8 = SurfaceConfig$ConfigSize.S1440P_4_3;
                ymw0 h26 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize8, ymw0Var9, arrayList14, ymw0Var9);
                ymw0 h27 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize8, h26, arrayList14, h26);
                ymw0 h28 = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize8, h27, arrayList14, h27);
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize9 = SurfaceConfig$ConfigSize.S720P_16_9;
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize9, h28, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize8);
                ymw0 i16 = tse0.i(arrayList14, h28);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize9, i16, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize8);
                ymw0 i17 = tse0.i(arrayList14, i16);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize9, i17, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize8);
                ymw0 i18 = tse0.i(arrayList14, i17);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize9, i18, surfaceConfig$ConfigType, surfaceConfig$ConfigSize8);
                ymw0 i19 = tse0.i(arrayList14, i18);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize9, i19, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize8);
                ymw0 i20 = tse0.i(arrayList14, i19);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize9, i20, surfaceConfig$ConfigType, surfaceConfig$ConfigSize8);
                arrayList14.add(i20);
                arrayList13.addAll(arrayList14);
            }
            if (tis0Var.b) {
                ArrayList arrayList15 = this.h;
                ArrayList arrayList16 = new ArrayList();
                ymw0 ymw0Var10 = new ymw0();
                ymw0 h29 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize, ymw0Var10, arrayList16, ymw0Var10);
                ymw0 h30 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, h29, arrayList16, h29);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h30, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize);
                ymw0 i21 = tse0.i(arrayList16, h30);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, i21, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                ymw0 i22 = tse0.i(arrayList16, i21);
                smw0.w(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, i22, surfaceConfig$ConfigType3, surfaceConfig$ConfigSize);
                ymw0 i23 = tse0.i(arrayList16, i22);
                i23.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2));
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize10 = SurfaceConfig$ConfigSize.RECORD;
                ymw0 h31 = tse0.h(surfaceConfig$ConfigType, surfaceConfig$ConfigSize10, i23, arrayList16, i23);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h31, surfaceConfig$ConfigType, surfaceConfig$ConfigSize10);
                ymw0 h32 = tse0.h(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize10, h31, arrayList16, h31);
                smw0.w(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, h32, surfaceConfig$ConfigType, surfaceConfig$ConfigSize10);
                h32.a(anw0.a(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize10));
                arrayList16.add(h32);
                arrayList15.addAll(arrayList16);
            }
            ep7 ep7Var = this.m;
            x34 x34Var = oru0.a;
            int i24 = Build.VERSION.SDK_INT;
            if (i24 >= 33) {
                key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                long[] jArr = (long[]) ep7Var.a(key);
                if (jArr != null && jArr.length != 0) {
                    z = true;
                    this.s = z;
                    if (z && i24 >= 33) {
                        ArrayList arrayList17 = this.j;
                        ArrayList arrayList18 = new ArrayList();
                        ymw0 ymw0Var11 = new ymw0();
                        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize11 = SurfaceConfig$ConfigSize.S1440P_4_3;
                        StreamUseCase streamUseCase = StreamUseCase.PREVIEW_VIDEO_STILL;
                        ymw0Var11.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize11, streamUseCase));
                        ymw0 i25 = tse0.i(arrayList18, ymw0Var11);
                        i25.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize11, streamUseCase));
                        ymw0 i26 = tse0.i(arrayList18, i25);
                        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize12 = SurfaceConfig$ConfigSize.RECORD;
                        StreamUseCase streamUseCase2 = StreamUseCase.VIDEO_RECORD;
                        i26.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize12, streamUseCase2));
                        ymw0 i27 = tse0.i(arrayList18, i26);
                        i27.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize12, streamUseCase2));
                        ymw0 i28 = tse0.i(arrayList18, i27);
                        StreamUseCase streamUseCase3 = StreamUseCase.STILL_CAPTURE;
                        i28.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, streamUseCase3));
                        ymw0 i29 = tse0.i(arrayList18, i28);
                        i29.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, streamUseCase3));
                        ymw0 i30 = tse0.i(arrayList18, i29);
                        StreamUseCase streamUseCase4 = StreamUseCase.PREVIEW;
                        i30.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i30.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, streamUseCase3));
                        ymw0 i31 = tse0.i(arrayList18, i30);
                        i31.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i31.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, streamUseCase3));
                        ymw0 i32 = tse0.i(arrayList18, i31);
                        i32.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i32.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize12, streamUseCase2));
                        ymw0 i33 = tse0.i(arrayList18, i32);
                        i33.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i33.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize12, streamUseCase2));
                        ymw0 i34 = tse0.i(arrayList18, i33);
                        i34.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i34.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, streamUseCase4));
                        ymw0 i35 = tse0.i(arrayList18, i34);
                        i35.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i35.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize12, streamUseCase2));
                        i35.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize12, streamUseCase3));
                        ymw0 i36 = tse0.i(arrayList18, i35);
                        i36.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i36.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize12, streamUseCase2));
                        i36.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize12, streamUseCase3));
                        ymw0 i37 = tse0.i(arrayList18, i36);
                        i37.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase4));
                        i37.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, streamUseCase4));
                        i37.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, streamUseCase3));
                        arrayList18.add(i37);
                        arrayList17.addAll(arrayList18);
                    }
                    ep7 ep7Var2 = this.m;
                    if (i24 >= 33 && (iArr = (int[]) ep7Var2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
                        for (int i38 : iArr) {
                            if (i38 == 2) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    this.v = z2;
                    if (z2 && Build.VERSION.SDK_INT >= 33) {
                        ArrayList arrayList19 = this.d;
                        ArrayList arrayList20 = new ArrayList();
                        ymw0 ymw0Var12 = new ymw0();
                        SurfaceConfig$ConfigType surfaceConfig$ConfigType7 = SurfaceConfig$ConfigType.PRIV;
                        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize13 = SurfaceConfig$ConfigSize.S1440P_4_3;
                        ymw0 h33 = tse0.h(surfaceConfig$ConfigType7, surfaceConfig$ConfigSize13, ymw0Var12, arrayList20, ymw0Var12);
                        SurfaceConfig$ConfigType surfaceConfig$ConfigType8 = SurfaceConfig$ConfigType.YUV;
                        ymw0 h34 = tse0.h(surfaceConfig$ConfigType8, surfaceConfig$ConfigSize13, h33, arrayList20, h33);
                        h34.a(anw0.a(surfaceConfig$ConfigType7, surfaceConfig$ConfigSize13));
                        SurfaceConfig$ConfigType surfaceConfig$ConfigType9 = SurfaceConfig$ConfigType.JPEG;
                        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize14 = SurfaceConfig$ConfigSize.MAXIMUM;
                        ymw0 h35 = tse0.h(surfaceConfig$ConfigType9, surfaceConfig$ConfigSize14, h34, arrayList20, h34);
                        smw0.w(surfaceConfig$ConfigType8, surfaceConfig$ConfigSize13, h35, surfaceConfig$ConfigType9, surfaceConfig$ConfigSize14);
                        ymw0 i39 = tse0.i(arrayList20, h35);
                        smw0.w(surfaceConfig$ConfigType7, surfaceConfig$ConfigSize13, i39, surfaceConfig$ConfigType8, surfaceConfig$ConfigSize14);
                        ymw0 i40 = tse0.i(arrayList20, i39);
                        smw0.w(surfaceConfig$ConfigType8, surfaceConfig$ConfigSize13, i40, surfaceConfig$ConfigType8, surfaceConfig$ConfigSize14);
                        ymw0 i41 = tse0.i(arrayList20, i40);
                        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize15 = SurfaceConfig$ConfigSize.PREVIEW;
                        smw0.w(surfaceConfig$ConfigType7, surfaceConfig$ConfigSize15, i41, surfaceConfig$ConfigType7, surfaceConfig$ConfigSize13);
                        ymw0 i42 = tse0.i(arrayList20, i41);
                        smw0.w(surfaceConfig$ConfigType8, surfaceConfig$ConfigSize15, i42, surfaceConfig$ConfigType7, surfaceConfig$ConfigSize13);
                        ymw0 i43 = tse0.i(arrayList20, i42);
                        smw0.w(surfaceConfig$ConfigType7, surfaceConfig$ConfigSize15, i43, surfaceConfig$ConfigType8, surfaceConfig$ConfigSize13);
                        ymw0 i44 = tse0.i(arrayList20, i43);
                        smw0.w(surfaceConfig$ConfigType8, surfaceConfig$ConfigSize15, i44, surfaceConfig$ConfigType8, surfaceConfig$ConfigSize13);
                        arrayList20.add(i44);
                        arrayList19.addAll(arrayList20);
                    }
                    c();
                    this.D = ikpVar;
                }
            }
            z = false;
            this.s = z;
            if (z) {
                ArrayList arrayList172 = this.j;
                ArrayList arrayList182 = new ArrayList();
                ymw0 ymw0Var112 = new ymw0();
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize112 = SurfaceConfig$ConfigSize.S1440P_4_3;
                StreamUseCase streamUseCase5 = StreamUseCase.PREVIEW_VIDEO_STILL;
                ymw0Var112.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize112, streamUseCase5));
                ymw0 i252 = tse0.i(arrayList182, ymw0Var112);
                i252.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize112, streamUseCase5));
                ymw0 i262 = tse0.i(arrayList182, i252);
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize122 = SurfaceConfig$ConfigSize.RECORD;
                StreamUseCase streamUseCase22 = StreamUseCase.VIDEO_RECORD;
                i262.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize122, streamUseCase22));
                ymw0 i272 = tse0.i(arrayList182, i262);
                i272.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize122, streamUseCase22));
                ymw0 i282 = tse0.i(arrayList182, i272);
                StreamUseCase streamUseCase32 = StreamUseCase.STILL_CAPTURE;
                i282.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, streamUseCase32));
                ymw0 i292 = tse0.i(arrayList182, i282);
                i292.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, streamUseCase32));
                ymw0 i302 = tse0.i(arrayList182, i292);
                StreamUseCase streamUseCase42 = StreamUseCase.PREVIEW;
                i302.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i302.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, streamUseCase32));
                ymw0 i312 = tse0.i(arrayList182, i302);
                i312.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i312.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize, streamUseCase32));
                ymw0 i322 = tse0.i(arrayList182, i312);
                i322.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i322.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize122, streamUseCase22));
                ymw0 i332 = tse0.i(arrayList182, i322);
                i332.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i332.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize122, streamUseCase22));
                ymw0 i342 = tse0.i(arrayList182, i332);
                i342.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i342.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, streamUseCase42));
                ymw0 i352 = tse0.i(arrayList182, i342);
                i352.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i352.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize122, streamUseCase22));
                i352.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize122, streamUseCase32));
                ymw0 i362 = tse0.i(arrayList182, i352);
                i362.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i362.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize122, streamUseCase22));
                i362.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize122, streamUseCase32));
                ymw0 i372 = tse0.i(arrayList182, i362);
                i372.a(new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2, streamUseCase42));
                i372.a(new anw0(surfaceConfig$ConfigType3, surfaceConfig$ConfigSize2, streamUseCase42));
                i372.a(new anw0(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize, streamUseCase32));
                arrayList182.add(i372);
                arrayList172.addAll(arrayList182);
            }
            ep7 ep7Var22 = this.m;
            if (i24 >= 33) {
                while (r3 < r2) {
                }
            }
            z2 = false;
            this.v = z2;
            if (z2) {
                ArrayList arrayList192 = this.d;
                ArrayList arrayList202 = new ArrayList();
                ymw0 ymw0Var122 = new ymw0();
                SurfaceConfig$ConfigType surfaceConfig$ConfigType72 = SurfaceConfig$ConfigType.PRIV;
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize132 = SurfaceConfig$ConfigSize.S1440P_4_3;
                ymw0 h332 = tse0.h(surfaceConfig$ConfigType72, surfaceConfig$ConfigSize132, ymw0Var122, arrayList202, ymw0Var122);
                SurfaceConfig$ConfigType surfaceConfig$ConfigType82 = SurfaceConfig$ConfigType.YUV;
                ymw0 h342 = tse0.h(surfaceConfig$ConfigType82, surfaceConfig$ConfigSize132, h332, arrayList202, h332);
                h342.a(anw0.a(surfaceConfig$ConfigType72, surfaceConfig$ConfigSize132));
                SurfaceConfig$ConfigType surfaceConfig$ConfigType92 = SurfaceConfig$ConfigType.JPEG;
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize142 = SurfaceConfig$ConfigSize.MAXIMUM;
                ymw0 h352 = tse0.h(surfaceConfig$ConfigType92, surfaceConfig$ConfigSize142, h342, arrayList202, h342);
                smw0.w(surfaceConfig$ConfigType82, surfaceConfig$ConfigSize132, h352, surfaceConfig$ConfigType92, surfaceConfig$ConfigSize142);
                ymw0 i392 = tse0.i(arrayList202, h352);
                smw0.w(surfaceConfig$ConfigType72, surfaceConfig$ConfigSize132, i392, surfaceConfig$ConfigType82, surfaceConfig$ConfigSize142);
                ymw0 i402 = tse0.i(arrayList202, i392);
                smw0.w(surfaceConfig$ConfigType82, surfaceConfig$ConfigSize132, i402, surfaceConfig$ConfigType82, surfaceConfig$ConfigSize142);
                ymw0 i412 = tse0.i(arrayList202, i402);
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize152 = SurfaceConfig$ConfigSize.PREVIEW;
                smw0.w(surfaceConfig$ConfigType72, surfaceConfig$ConfigSize152, i412, surfaceConfig$ConfigType72, surfaceConfig$ConfigSize132);
                ymw0 i422 = tse0.i(arrayList202, i412);
                smw0.w(surfaceConfig$ConfigType82, surfaceConfig$ConfigSize152, i422, surfaceConfig$ConfigType72, surfaceConfig$ConfigSize132);
                ymw0 i432 = tse0.i(arrayList202, i422);
                smw0.w(surfaceConfig$ConfigType72, surfaceConfig$ConfigSize152, i432, surfaceConfig$ConfigType82, surfaceConfig$ConfigSize132);
                ymw0 i442 = tse0.i(arrayList202, i432);
                smw0.w(surfaceConfig$ConfigType82, surfaceConfig$ConfigSize152, i442, surfaceConfig$ConfigType82, surfaceConfig$ConfigSize132);
                arrayList202.add(i442);
                arrayList192.addAll(arrayList202);
            }
            c();
            this.D = ikpVar;
        } catch (CameraAccessExceptionCompat e) {
            throw ceb1.b(e);
        }
    }

    public static Range d(Range range, int i, Range[] rangeArr) {
        Range range2 = lru0.a;
        if (range2.equals(range) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i)));
        int length = rangeArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Range range4 = rangeArr[i3];
            Objects.requireNonNull(range4);
            if (i >= ((Integer) range4.getLower()).intValue()) {
                if (range2.equals(lru0.a)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int i4 = i(range4.intersect(range3));
                    if (i2 == 0) {
                        i2 = i4;
                    } else {
                        if (i4 >= i2) {
                            double i5 = i(range2.intersect(range3));
                            double i6 = i(range4.intersect(range3));
                            double i7 = i6 / i(range4);
                            double i8 = i5 / i(range2);
                            i2 = i6 <= i5 ? i(range3.intersect(range2)) : i(range3.intersect(range2));
                        }
                        range4 = range2;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i2 == 0) {
                        if (h(range4, range3) >= h(range2, range3)) {
                            if (h(range4, range3) == h(range2, range3)) {
                                if (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && i(range4) >= i(range2)) {
                                }
                            }
                        }
                    }
                }
                range2 = range4;
            }
        }
        return range2;
    }

    public static Size f(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Size[] sizeArr;
        Size[] highResolutionOutputSizes;
        try {
            sizeArr = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        } catch (Throwable unused) {
            sizeArr = null;
        }
        if (sizeArr != null && sizeArr.length != 0) {
            if (rational != null) {
                ArrayList arrayList = new ArrayList();
                for (Size size : sizeArr) {
                    Rational rational2 = x83.a;
                    if (x83.a(size, rational, vjs0.c)) {
                        arrayList.add(size);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sizeArr = (Size[]) arrayList.toArray(new Size[0]);
                }
            }
            if (sizeArr != null || sizeArr.length == 0) {
                return null;
            }
            gvc gvcVar = new gvc();
            Size size2 = (Size) Collections.max(Arrays.asList(sizeArr), gvcVar);
            Size size3 = vjs0.a;
            if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
                size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), gvcVar);
            }
            return (Size) Collections.max(Arrays.asList(size2, size3), gvcVar);
        }
        sizeArr = null;
        if (sizeArr != null) {
        }
        return null;
    }

    public static int h(Range range, Range range2) {
        d6z.y("Ranges must not intersect", (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int i(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z) {
        Range range3 = lru0.a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z) {
            d6z.y("All targetFrameRate should be the same if strict fps is required", range == range2);
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean a(q84 q84Var, List list, Map map, List list2, List list3) {
        List list4;
        Size size;
        boolean z = q84Var.d;
        boolean z2 = q84Var.h;
        int i = q84Var.a;
        HashMap hashMap = this.g;
        if (hashMap.containsKey(q84Var)) {
            list4 = (List) hashMap.get(q84Var);
        } else {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ArrayList arrayList2 = this.f;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    SurfaceConfig$ConfigType surfaceConfig$ConfigType = SurfaceConfig$ConfigType.PRIV;
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.S1080P_16_9;
                    arrayList3.add(new ymw0(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize)));
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2 = SurfaceConfig$ConfigSize.S720P_16_9;
                    arrayList3.add(new ymw0(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize2)));
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize3 = SurfaceConfig$ConfigSize.MAXIMUM_16_9;
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize, surfaceConfig$ConfigSize3));
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize4 = SurfaceConfig$ConfigSize.UHD;
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize, surfaceConfig$ConfigSize4));
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize, SurfaceConfig$ConfigSize.S1440P_16_9));
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize, surfaceConfig$ConfigSize));
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize2, surfaceConfig$ConfigSize3));
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize2, surfaceConfig$ConfigSize4));
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize2, surfaceConfig$ConfigSize));
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize5 = SurfaceConfig$ConfigSize.X_VGA;
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize6 = SurfaceConfig$ConfigSize.MAXIMUM_4_3;
                    arrayList3.addAll(bza1.a(surfaceConfig$ConfigSize5, surfaceConfig$ConfigSize6));
                    arrayList3.addAll(bza1.a(SurfaceConfig$ConfigSize.S1080P_4_3, surfaceConfig$ConfigSize6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            } else if (q84Var.e) {
                ArrayList arrayList4 = this.i;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    ymw0 ymw0Var = new ymw0();
                    SurfaceConfig$ConfigType surfaceConfig$ConfigType2 = SurfaceConfig$ConfigType.JPEG_R;
                    SurfaceConfig$ConfigSize surfaceConfig$ConfigSize7 = SurfaceConfig$ConfigSize.MAXIMUM;
                    ymw0 h = tse0.h(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize7, ymw0Var, arrayList5, ymw0Var);
                    smw0.w(SurfaceConfig$ConfigType.PRIV, SurfaceConfig$ConfigSize.PREVIEW, h, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize7);
                    arrayList5.add(h);
                    arrayList4.addAll(arrayList5);
                }
                if (i == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else if (q84Var.f) {
                ArrayList arrayList6 = this.e;
                if (arrayList6.isEmpty()) {
                    lju ljuVar = this.C;
                    if (((Boolean) ljuVar.b.getValue()).booleanValue()) {
                        arrayList6.clear();
                        Size size2 = (Size) ljuVar.c.getValue();
                        if (size2 != null) {
                            x84 l = l(34);
                            ArrayList arrayList7 = new ArrayList();
                            StreamUseCase streamUseCase = anw0.e;
                            anw0 d = xib1.d(34, size2, l, 0, SurfaceConfig$ConfigSource.CAPTURE_SESSION_TABLES, anw0.e);
                            ymw0 ymw0Var2 = new ymw0();
                            ymw0Var2.a(d);
                            arrayList7.add(ymw0Var2);
                            ymw0 ymw0Var3 = new ymw0();
                            ymw0Var3.a(d);
                            ymw0Var3.a(d);
                            arrayList7.add(ymw0Var3);
                            arrayList6.addAll(arrayList7);
                        }
                    }
                }
                arrayList.addAll(arrayList6);
            } else {
                int i2 = q84Var.c;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList8 = this.a;
                        if (i != 2) {
                            if (z) {
                                arrayList8 = this.d;
                            }
                            arrayList.addAll(arrayList8);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList8);
                        }
                    } else {
                        list4 = this.c;
                        hashMap.put(q84Var, list4);
                    }
                } else if (i2 == 10 && i == 0) {
                    arrayList.addAll(this.h);
                }
            }
            list4 = arrayList;
            hashMap.put(q84Var, list4);
        }
        Iterator it = list4.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            z4 = ((ymw0) it.next()).c(list) != null;
            if (z4) {
                break;
            }
        }
        if (!z4 || !z2) {
            return z4;
        }
        Range range = q84Var.i;
        hyq0 hyq0Var = new hyq0();
        int i3 = 0;
        while (i3 < list.size()) {
            anw0 anw0Var = (anw0) list.get(i3);
            x84 l2 = l(anw0Var.d);
            int i4 = anw0Var.d;
            HashMap hashMap2 = l2.f;
            SurfaceConfig$ConfigSize surfaceConfig$ConfigSize8 = anw0Var.b;
            switch (zmw0.a[surfaceConfig$ConfigSize8.ordinal()]) {
                case 1:
                    size = l2.c;
                    break;
                case 2:
                    size = l2.e;
                    break;
                case 3:
                    size = (Size) hashMap2.get(Integer.valueOf(i4));
                    break;
                case 4:
                    size = (Size) hashMap2.get(Integer.valueOf(i4));
                    break;
                case 5:
                    size = (Size) hashMap2.get(Integer.valueOf(i4));
                    break;
                case 6:
                    size = (Size) l2.i.get(Integer.valueOf(i4));
                    break;
                case 7:
                    ny61.r("Not supported config size");
                    return z3;
                default:
                    size = surfaceConfig$ConfigSize8.getRelatedFixedSize();
                    break;
            }
            xi21 xi21Var = (xi21) list2.get(((Integer) list3.get(i3)).intValue());
            q8n q8nVar = (q8n) map.get(anw0Var);
            Objects.requireNonNull(q8nVar);
            hkp hkpVar = new hkp(xi21Var.getInputFormat(), size);
            UseCaseType.Companion.getClass();
            int i5 = cj21.a[xi21Var.y().ordinal()];
            boolean z5 = z;
            Class surfaceClass = (i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? UseCaseType.UNDEFINED : UseCaseType.STREAM_SHARING : UseCaseType.VIDEO_CAPTURE : UseCaseType.PREVIEW : UseCaseType.IMAGE_CAPTURE).getSurfaceClass();
            if (surfaceClass != null) {
                hkpVar.j = surfaceClass;
            }
            dyq0 e = dyq0.e(xi21Var, size);
            r38 r38Var = e.b;
            e.c(hkpVar, q8nVar, -1);
            Range range2 = lru0.a.equals(range) ? gbs.d : range;
            r38Var.getClass();
            r38Var.b.w(s38.k, range2);
            if (z5) {
                r38Var.getClass();
                r38Var.b.w(xi21.u4, 2);
            }
            hyq0Var.a(e.d());
            boolean c = hyq0Var.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(xi21Var);
            sb.append(" with ");
            sb.append(anw0Var);
            sb.append(" due to [");
            tse0.x(!hyq0Var.m ? "Template is not set" : hyq0Var.l.toString(), "]; surfaceConfigList = ", ", featureSettings = ", sb, list);
            sb.append(q84Var);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list2);
            d6z.y(sb.toString(), c);
            i3++;
            z = z5;
            z3 = false;
        }
        jyq0 b = hyq0Var.b();
        boolean f = this.D.f(b);
        Iterator it2 = b.b().iterator();
        while (it2.hasNext()) {
            ((DeferrableSurface) it2.next()).a();
        }
        return f;
    }

    public final q84 b(int i, boolean z, HashMap hashMap, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Range range, boolean z7) {
        int i2;
        Range range2;
        Range range3;
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 8;
                break;
            }
            if (((q8n) it.next()).b == 10) {
                i2 = 10;
                break;
            }
        }
        String str = this.k;
        if (i != 0 && z3) {
            throw new IllegalArgumentException(unr0.p("Camera device id is ", str, ". Ultra HDR is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i != 0 && i2 == 10) {
            throw new IllegalArgumentException(unr0.p("Camera device id is ", str, ". 10 bit dynamic range is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i != 0 && z5) {
            throw new IllegalArgumentException(unr0.p("Camera device id is ", str, ". Feature combination query is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (z4 && z5) {
            ny61.g("High-speed session is not supported with feature combination");
            return null;
        }
        if (z4 && !((Boolean) this.C.b.getValue()).booleanValue()) {
            ny61.g("High-speed session is not supported on this device.");
            return null;
        }
        if (z5) {
            range2 = range;
            if (range2 == lru0.a && z6) {
                range3 = gbs.d;
                return new q84(i, z, i2, z2, z3, z4, z5, z6, range3, z7);
            }
        } else {
            range2 = range;
        }
        range3 = range2;
        return new q84(i, z, i2, z2, z3, z4, z5, z6, range3, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r2 = new android.util.Size(r8.videoFrameWidth, r8.videoFrameHeight);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Size[] sizeArr;
        Size size;
        Size size2;
        Size e = this.y.e();
        Size size3 = null;
        int i = 0;
        try {
            int parseInt = Integer.parseInt(this.k);
            am7 am7Var = this.l;
            int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
            int i2 = 0;
            while (true) {
                if (i2 >= 8) {
                    size = null;
                    break;
                }
                int i3 = iArr[i2];
                if (am7Var.j(parseInt, i3) && (r8 = am7Var.g(parseInt, i3)) != null) {
                    break;
                } else {
                    i2++;
                }
            }
        } catch (NumberFormatException unused) {
        }
        if (sizeArr != null) {
            Arrays.sort(sizeArr, new gvc(true));
            int length = sizeArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = sizeArr[i];
                int width = size4.getWidth();
                Size size5 = vjs0.f;
                if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                    size3 = size4;
                    break;
                }
                i++;
            }
        }
        if (size3 == null) {
            size2 = size3;
            this.w = new x84(vjs0.c, new HashMap(), e, new HashMap(), size2, new HashMap(), new HashMap(), new HashMap(), new HashMap());
            return;
        } else {
            size = vjs0.d;
            size2 = size;
            this.w = new x84(vjs0.c, new HashMap(), e, new HashMap(), size2, new HashMap(), new HashMap(), new HashMap(), new HashMap());
            return;
        }
        try {
            sizeArr = ((StreamConfigurationMap) ((wor0) this.m.c().a).a).getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused2) {
            sizeArr = null;
        }
        if (sizeArr != null) {
        }
        if (size3 == null) {
        }
    }

    public final int e(int i, Size size, boolean z) {
        long j;
        d6z.y(null, !z || i == 34);
        if (!z) {
            amp0 c = this.m.c();
            Objects.requireNonNull(c);
            try {
                j = ((StreamConfigurationMap) ((wor0) c.a).a).getOutputMinFrameDuration(i, size);
            } catch (RuntimeException unused) {
                Objects.toString(size);
                sgb1.g(5, "StreamConfigurationMapCompat");
                j = 0;
            }
            if (j > 0) {
                return (int) (1.0E9d / j);
            }
            if (!this.u) {
                return Integer.MAX_VALUE;
            }
            Objects.toString(size);
            sgb1.g(5, "SupportedSurfaceCombination");
            return 0;
        }
        List c2 = this.C.c(size);
        List list = c2.isEmpty() ? null : c2;
        if (list == null) {
            size.toString();
            sgb1.g(5, "HighSpeedResolver");
            return 0;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return 0;
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        return num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        r2 = new kotlin.UnsafeLazyImpl(new defpackage.gyt0(22, r11, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (r3 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (((java.lang.Boolean) r2.getValue()).booleanValue() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g(q84 q84Var, List list, HashMap hashMap, HashMap hashMap2) {
        x34 x34Var = oru0.a;
        if (q84Var.a == 0 && q84Var.c == 8 && !q84Var.f) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                List c = ((ymw0) it.next()).c(list);
                if (c != null) {
                    x34 x34Var2 = oru0.a;
                    int size = c.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long value = ((anw0) c.get(i)).c.getValue();
                        if (hashMap.containsKey(Integer.valueOf(i))) {
                            List list2 = ((i34) hashMap.get(Integer.valueOf(i))).e;
                            if (!oru0.b(list2.size() == 1 ? (UseCaseConfigFactory$CaptureType) list2.get(0) : UseCaseConfigFactory$CaptureType.STREAM_SHARING, value, list2)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!hashMap2.containsKey(Integer.valueOf(i))) {
                                ny61.f("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            xi21 xi21Var = (xi21) hashMap2.get(Integer.valueOf(i));
                            if (!oru0.b(xi21Var.y(), value, xi21Var.y() == UseCaseConfigFactory$CaptureType.STREAM_SHARING ? (List) ((jru0) xi21Var).f(jru0.b) : EmptyList.a)) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0306, code lost:
    
        if (r4 != false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bow0 j(int i, ArrayList arrayList, HashMap hashMap, boolean z, boolean z2, boolean z3) {
        boolean z4;
        Map map;
        boolean z5;
        int i2;
        SupportedSurfaceCombination$CheckingMethod supportedSurfaceCombination$CheckingMethod;
        Iterator it;
        Map map2;
        q8n q8nVar;
        q8n f;
        q8n q8nVar2 = q8n.e;
        gzj gzjVar = this.y;
        gzjVar.b = gzjVar.a();
        if (this.w == null) {
            c();
        } else {
            Size e = this.y.e();
            x84 x84Var = this.w;
            this.w = new x84(x84Var.a, x84Var.b, e, x84Var.d, x84Var.e, x84Var.f, x84Var.g, x84Var.h, x84Var.i);
        }
        Set keySet = hashMap.keySet();
        Range range = lju.e;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((i34) it2.next()).g));
        }
        Set set = keySet;
        ArrayList arrayList3 = new ArrayList(tcc.n(set, 10));
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) ((xi21) it3.next()).g(xi21.o4, 0);
            num.intValue();
            arrayList3.add(num);
        }
        ArrayList m0 = kotlin.collections.a.m0(arrayList3, arrayList2);
        if (!m0.isEmpty()) {
            Iterator it4 = m0.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() == 1) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        bow0 bow0Var = null;
        if (z4 && !m0.isEmpty()) {
            Iterator it5 = m0.iterator();
            while (it5.hasNext()) {
                if (((Number) it5.next()).intValue() != 1) {
                    ny61.g("All sessionTypes should be high-speed when any of them is high-speed");
                    return null;
                }
            }
        }
        if (z4) {
            lju ljuVar = this.C;
            ljuVar.getClass();
            List a = lju.a(kotlin.collections.a.J0(hashMap.values()));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : a) {
                if (((List) ljuVar.d.getValue()).contains((Size) obj)) {
                    arrayList4.add(obj);
                }
            }
            Map linkedHashMap = new LinkedHashMap(gw00.d(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list) {
                    if (arrayList4.contains((Size) obj2)) {
                        arrayList5.add(obj2);
                    }
                }
                linkedHashMap.put(key, arrayList5);
            }
            map = linkedHashMap;
        } else {
            map = hashMap;
        }
        ArrayList arrayList6 = new ArrayList(map.keySet());
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            Integer num2 = (Integer) ((xi21) it6.next()).g(xi21.n4, 0);
            num2.intValue();
            if (!arrayList8.contains(num2)) {
                arrayList8.add(num2);
            }
        }
        Collections.sort(arrayList8);
        Collections.reverse(arrayList8);
        Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            int intValue = ((Integer) it7.next()).intValue();
            Iterator it8 = arrayList6.iterator();
            while (it8.hasNext()) {
                xi21 xi21Var = (xi21) it8.next();
                if (intValue == ((Integer) xi21Var.g(xi21.n4, 0)).intValue()) {
                    arrayList7.add(Integer.valueOf(arrayList6.indexOf(xi21Var)));
                }
            }
        }
        tis0 tis0Var = this.B;
        gym gymVar = (gym) tis0Var.w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(((i34) it9.next()).d);
        }
        Set b = ((u8n) gymVar.a).b();
        HashSet hashSet = new HashSet(b);
        Iterator it10 = linkedHashSet.iterator();
        while (it10.hasNext()) {
            tis0.a0(hashSet, (q8n) it10.next(), gymVar);
            bow0Var = bow0Var;
        }
        bow0 bow0Var2 = bow0Var;
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it11 = arrayList7.iterator();
        while (it11.hasNext()) {
            xi21 xi21Var2 = (xi21) arrayList6.get(((Integer) it11.next()).intValue());
            ArrayList arrayList12 = arrayList7;
            q8n o = xi21Var2.o();
            boolean z6 = z4;
            if (o.equals(q8n.c)) {
                arrayList11.add(xi21Var2);
            } else {
                int i3 = o.a;
                int i4 = o.b;
                if (i3 == 2 || ((i3 != 0 && i4 == 0) || (i3 == 0 && i4 != 0))) {
                    arrayList10.add(xi21Var2);
                } else {
                    arrayList9.add(xi21Var2);
                }
            }
            arrayList7 = arrayList12;
            z4 = z6;
        }
        ArrayList arrayList13 = arrayList7;
        boolean z7 = z4;
        HashMap hashMap2 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList14 = new ArrayList();
        arrayList14.addAll(arrayList9);
        arrayList14.addAll(arrayList10);
        arrayList14.addAll(arrayList11);
        Iterator it12 = arrayList14.iterator();
        while (it12.hasNext()) {
            xi21 xi21Var3 = (xi21) it12.next();
            q8n o2 = xi21Var3.o();
            q8n q8nVar3 = q8n.d;
            if (!o2.b()) {
                it = it12;
                int i5 = o2.a;
                int i6 = o2.b;
                map2 = map;
                if (i5 == 1 && i6 == 0) {
                    boolean contains = hashSet.contains(q8nVar3);
                    q8nVar = q8nVar3;
                } else {
                    q8n I = tis0.I(o2, linkedHashSet, hashSet);
                    if (I != null) {
                        o2.toString();
                        I.toString();
                        sgb1.g(3, "DynamicRangeResolver");
                        q8nVar = I;
                    } else {
                        q8n I2 = tis0.I(o2, linkedHashSet2, hashSet);
                        if (I2 != null) {
                            o2.toString();
                            I2.toString();
                            sgb1.g(3, "DynamicRangeResolver");
                            q8nVar = I2;
                        } else if (tis0.E(o2, q8nVar3, hashSet)) {
                            o2.toString();
                            q8nVar3.toString();
                            sgb1.g(3, "DynamicRangeResolver");
                            q8nVar = q8nVar3;
                        } else {
                            if (i5 == 2 && (i6 == 10 || i6 == 0)) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (Build.VERSION.SDK_INT >= 33 && (f = rh.f((ep7) tis0Var.c)) != null) {
                                    linkedHashSet3.add(f);
                                }
                                linkedHashSet3.add(q8nVar2);
                                q8n I3 = tis0.I(o2, linkedHashSet3, hashSet);
                                if (I3 != null) {
                                    o2.toString();
                                    I3.toString();
                                    sgb1.g(3, "DynamicRangeResolver");
                                    q8nVar = I3;
                                }
                            }
                            Iterator it13 = hashSet.iterator();
                            while (it13.hasNext()) {
                                q8n q8nVar4 = (q8n) it13.next();
                                Iterator it14 = it13;
                                d6z.y("Candidate dynamic range must be fully specified.", q8nVar4.b());
                                if (!q8nVar4.equals(q8nVar3) && tis0.D(o2, q8nVar4)) {
                                    o2.toString();
                                    q8nVar4.toString();
                                    sgb1.g(3, "DynamicRangeResolver");
                                    q8nVar = q8nVar4;
                                    break;
                                }
                                it13 = it14;
                            }
                            q8nVar = bow0Var2;
                        }
                    }
                }
            } else if (hashSet.contains(o2)) {
                it = it12;
                q8nVar = o2;
                map2 = map;
            } else {
                it = it12;
                map2 = map;
                q8nVar = bow0Var2;
            }
            if (q8nVar == 0) {
                String str = (String) xi21Var3.f(max0.e4);
                String join = TextUtils.join("\n  ", b);
                String join2 = TextUtils.join("\n  ", hashSet);
                StringBuilder sb = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb.append(str);
                sb.append("\nRequested dynamic range:\n  ");
                sb.append(o2);
                sb.append("\nSupported dynamic ranges:\n  ");
                ny61.g(unr0.r(sb, join, "\nConstrained set of concurrent dynamic ranges:\n  ", join2));
                return bow0Var2;
            }
            tis0.a0(hashSet, q8nVar, gymVar);
            hashMap2.put(xi21Var3, q8nVar);
            if (!linkedHashSet.contains(q8nVar)) {
                linkedHashSet2.add(q8nVar);
            }
            it12 = it;
            map = map2;
        }
        Map map3 = map;
        hashMap2.toString();
        sgb1.g(3, "SupportedSurfaceCombination");
        Iterator it15 = arrayList.iterator();
        while (true) {
            if (it15.hasNext()) {
                if (((i34) it15.next()).b == 4101) {
                    break;
                }
            } else {
                Iterator it16 = map3.keySet().iterator();
                while (it16.hasNext()) {
                    if (((xi21) it16.next()).getInputFormat() == 4101) {
                    }
                }
                z5 = false;
            }
        }
        z5 = true;
        Iterator it17 = arrayList.iterator();
        Boolean bool = bow0Var2;
        while (it17.hasNext()) {
            boolean z8 = ((i34) it17.next()).i;
            if (bool != 0 && bool.booleanValue() != z8) {
                ny61.r("All isStrictFpsRequired should be the same");
                return bow0Var2;
            }
            bool = Boolean.valueOf(z8);
        }
        Iterator it18 = arrayList6.iterator();
        Boolean bool2 = bool;
        while (it18.hasNext()) {
            Boolean bool3 = (Boolean) ((xi21) it18.next()).g(xi21.q4, Boolean.FALSE);
            Objects.requireNonNull(bool3);
            boolean booleanValue = bool3.booleanValue();
            if (bool2 != null && bool2.booleanValue() != booleanValue) {
                ny61.r("All isStrictFpsRequired should be the same");
                return bow0Var2;
            }
            bool2 = bool3;
        }
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Range range2 = lru0.a;
        Iterator it19 = arrayList.iterator();
        while (it19.hasNext()) {
            range2 = m(((i34) it19.next()).h, range2, booleanValue2);
        }
        Iterator it20 = arrayList13.iterator();
        Range range3 = range2;
        while (it20.hasNext()) {
            Range range4 = (Range) ((xi21) arrayList6.get(((Integer) it20.next()).intValue())).g(xi21.p4, lru0.a);
            Objects.requireNonNull(range4);
            range3 = m(range4, range3, booleanValue2);
        }
        sgb1.g(3, "SupportedSurfaceCombination");
        if (z && !this.v && z3) {
            ny61.g("Preview stabilization is not supported by the camera.");
            return bow0Var2;
        }
        q84 b2 = b(i, z2, hashMap2, z, z5, z7, z3, false, range3, booleanValue2);
        Collection values = hashMap2.values();
        if (z3) {
            ?? contains2 = values.contains(q8nVar2);
            int i7 = contains2;
            if (range3 != null) {
                i7 = contains2;
                if (((Integer) range3.getUpper()).intValue() == 60) {
                    i7 = contains2 + 1;
                }
            }
            if (z) {
                i7++;
            }
            if (z5) {
                i7++;
            }
            i2 = 1;
            supportedSurfaceCombination$CheckingMethod = i7 > 1 ? SupportedSurfaceCombination$CheckingMethod.WITH_FEATURE_COMBO : i7 == 1 ? SupportedSurfaceCombination$CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : SupportedSurfaceCombination$CheckingMethod.WITHOUT_FEATURE_COMBO;
        } else {
            supportedSurfaceCombination$CheckingMethod = SupportedSurfaceCombination$CheckingMethod.WITHOUT_FEATURE_COMBO;
            i2 = 1;
        }
        Objects.toString(supportedSurfaceCombination$CheckingMethod);
        sgb1.g(3, "SupportedSurfaceCombination");
        int ordinal = supportedSurfaceCombination$CheckingMethod.ordinal();
        if (ordinal == i2) {
            return n(b(b2.a, b2.b, hashMap2, b2.d, b2.e, b2.f, b2.g, true, b2.i, b2.j), arrayList, map3, arrayList6, arrayList13, hashMap2);
        }
        if (ordinal != 2) {
            return n(b2, arrayList, map3, arrayList6, arrayList13, hashMap2);
        }
        try {
            return n(b2, arrayList, map3, arrayList6, arrayList13, hashMap2);
        } catch (IllegalArgumentException unused) {
            sgb1.g(3, "SupportedSurfaceCombination");
            return n(b(b2.a, b2.b, hashMap2, b2.d, b2.e, b2.f, b2.g, true, b2.i, b2.j), arrayList, map3, arrayList6, arrayList13, hashMap2);
        }
    }

    public final Pair k(q84 q84Var, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i, HashMap hashMap, HashMap hashMap2) {
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i34 i34Var = (i34) it.next();
            arrayList4.add(i34Var.a);
            hashMap.put(Integer.valueOf(arrayList4.size() - 1), i34Var);
        }
        int i2 = i;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            xi21 xi21Var = (xi21) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int inputFormat = xi21Var.getInputFormat();
            StreamUseCase x = xi21Var.x();
            SurfaceConfig$ConfigSource surfaceConfig$ConfigSource = q84Var.h ? SurfaceConfig$ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig$ConfigSource.CAPTURE_SESSION_TABLES;
            x84 l = l(inputFormat);
            int i4 = q84Var.a;
            StreamUseCase streamUseCase = anw0.e;
            arrayList4.add(xib1.d(inputFormat, size, l, i4, surfaceConfig$ConfigSource, x));
            hashMap2.put(Integer.valueOf(arrayList4.size() - 1), xi21Var);
            i2 = Math.min(i2, e(xi21Var.getInputFormat(), size, q84Var.f));
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final x84 l(int i) {
        CameraCharacteristics.Key key;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.x;
        if (!arrayList.contains(valueOf)) {
            p(this.w.b, vjs0.e, i);
            p(this.w.d, vjs0.g, i);
            o(this.w.f, i, null);
            o(this.w.g, i, x83.a);
            o(this.w.h, i, x83.c);
            HashMap hashMap = this.w.i;
            if (Build.VERSION.SDK_INT >= 31 && this.t) {
                ep7 ep7Var = this.m;
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ep7Var.a(key);
                if (streamConfigurationMap != null) {
                    hashMap.put(Integer.valueOf(i), f(streamConfigurationMap, i, true, null));
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0289  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [bow0] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bow0 n(q84 q84Var, ArrayList arrayList, Map map, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap) {
        ?? r16;
        int i;
        ?? arrayList4;
        int i2;
        q84 q84Var2;
        HashMap hashMap2;
        HashMap hashMap3;
        List list;
        HashMap hashMap4;
        HashMap hashMap5;
        String str;
        HashMap hashMap6;
        HashMap hashMap7;
        List list2;
        ArrayList arrayList5;
        Range range;
        q84 q84Var3;
        int i3;
        List list3;
        List list4;
        y yVar;
        HashMap hashMap8;
        CameraCharacteristics.Key key;
        int i4;
        int i5;
        Iterator it;
        HashMap hashMap9;
        Rational rational;
        wrj0 wrj0Var;
        SurfaceConfig$ConfigType surfaceConfig$ConfigType;
        Size e;
        Iterator it2;
        int e2;
        y yVar2 = this;
        q84 q84Var4 = q84Var;
        Map map2 = map;
        HashMap hashMap10 = hashMap;
        Objects.toString(q84Var4);
        sgb1.g(3, "SupportedSurfaceCombination");
        if (q84Var4.h) {
            r16 = null;
            i = 1;
        } else {
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((i34) it3.next()).a);
            }
            gvc gvcVar = new gvc();
            for (xi21 xi21Var : map2.keySet()) {
                List list5 = (List) map2.get(xi21Var);
                d6z.m("No available output size is found for " + xi21Var + Extension.DOT_CHAR, (list5 == null || list5.isEmpty()) ? false : true);
                Size size = (Size) Collections.min(list5, gvcVar);
                int inputFormat = xi21Var.getInputFormat();
                x84 l = yVar2.l(inputFormat);
                int i6 = q84Var4.a;
                SurfaceConfig$ConfigSource surfaceConfig$ConfigSource = SurfaceConfig$ConfigSource.CAPTURE_SESSION_TABLES;
                StreamUseCase x = xi21Var.x();
                StreamUseCase streamUseCase = anw0.e;
                arrayList6.add(xib1.d(inputFormat, size, l, i6, surfaceConfig$ConfigSource, x));
            }
            r16 = null;
            i = 1;
            Map map3 = Collections.EMPTY_MAP;
            List list6 = Collections.EMPTY_LIST;
            if (!yVar2.a(q84Var4, arrayList6, map3, list6, list6)) {
                qir.r("No supported surface combination is found for camera device - Id : ", yVar2.k, ".  May be attempting to bind too many use cases. Existing surfaces: ", arrayList, ". New configs: ", arrayList2, ". GroupableFeature settings: ", q84Var);
                return null;
            }
            q84Var4 = q84Var;
        }
        ArrayList arrayList7 = arrayList2;
        String str2 = "No supported surface combination is found for camera device - Id : ";
        HashMap hashMap11 = new HashMap();
        Iterator it4 = map2.keySet().iterator();
        Map map4 = map2;
        while (it4.hasNext()) {
            xi21 xi21Var2 = (xi21) it4.next();
            ArrayList arrayList8 = new ArrayList();
            HashMap hashMap12 = new HashMap();
            List list7 = (List) map4.get(xi21Var2);
            Objects.requireNonNull(list7);
            Iterator it5 = list7.iterator();
            while (it5.hasNext()) {
                Size size2 = (Size) it5.next();
                int inputFormat2 = xi21Var2.getInputFormat();
                StreamUseCase x2 = xi21Var2.x();
                Range range2 = q84Var4.i;
                x84 l2 = yVar2.l(inputFormat2);
                int i7 = q84Var4.a;
                Iterator it6 = it4;
                SurfaceConfig$ConfigSource surfaceConfig$ConfigSource2 = q84Var4.h ? SurfaceConfig$ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig$ConfigSource.CAPTURE_SESSION_TABLES;
                StreamUseCase streamUseCase2 = anw0.e;
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = xib1.d(inputFormat2, size2, l2, i7, surfaceConfig$ConfigSource2, x2).b;
                Range range3 = lru0.a;
                if (range3.equals(range2)) {
                    it2 = it5;
                    e2 = Integer.MAX_VALUE;
                } else {
                    it2 = it5;
                    e2 = yVar2.e(inputFormat2, size2, q84Var4.f);
                }
                if (!q84Var4.g || (surfaceConfig$ConfigSize != SurfaceConfig$ConfigSize.NOT_SUPPORT && (range3.equals(range2) || e2 >= ((Integer) range2.getUpper()).intValue()))) {
                    Set set = (Set) hashMap12.get(surfaceConfig$ConfigSize);
                    if (set == null) {
                        set = new HashSet();
                        hashMap12.put(surfaceConfig$ConfigSize, set);
                    }
                    if (!set.contains(Integer.valueOf(e2))) {
                        arrayList8.add(size2);
                        set.add(Integer.valueOf(e2));
                    }
                }
                it5 = it2;
                it4 = it6;
            }
            hashMap11.put(xi21Var2, arrayList8);
            map4 = map;
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            xi21 xi21Var3 = (xi21) arrayList7.get(((Integer) it7.next()).intValue());
            List<Size> list8 = (List) hashMap11.get(xi21Var3);
            if (list8 == null) {
                list8 = Collections.EMPTY_LIST;
            }
            int inputFormat3 = xi21Var3.getInputFormat();
            kax0 kax0Var = yVar2.z;
            ep7 ep7Var = yVar2.m;
            kax0Var.getClass();
            int i8 = (((Nexus4AndroidLTargetAspectRatioQuirk) xbj.a.b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) ydb1.b(ep7Var).b(AspectRatioLegacyApi21Quirk.class)) == null) ? 3 : 2;
            if (i8 == 2) {
                Size size3 = (Size) yVar2.l(256).f.get(256);
                if (size3 != null) {
                    rational = new Rational(size3.getWidth(), size3.getHeight());
                    if (rational != null) {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        for (Size size4 : list8) {
                            Rational rational2 = x83.a;
                            if (x83.a(size4, rational, vjs0.c)) {
                                arrayList10.add(size4);
                            } else {
                                arrayList11.add(size4);
                            }
                        }
                        arrayList11.addAll(0, arrayList10);
                        list8 = arrayList11;
                    }
                    wrj0Var = yVar2.A;
                    surfaceConfig$ConfigType = (SurfaceConfig$ConfigType) anw0.h.get(Integer.valueOf(inputFormat3));
                    if (surfaceConfig$ConfigType == null) {
                        surfaceConfig$ConfigType = SurfaceConfig$ConfigType.PRIV;
                    }
                    if (wrj0Var.a != null && (e = ExtraCroppingQuirk.e(surfaceConfig$ConfigType)) != null) {
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(e);
                        for (Size size5 : list8) {
                            if (!size5.equals(e)) {
                                arrayList12.add(size5);
                            }
                        }
                        list8 = arrayList12;
                    }
                    arrayList9.add(list8);
                }
            } else if (i8 != 3) {
                ny61.f(oyr.i(i8, "Undefined targetAspectRatio: "));
                return r16;
            }
            rational = r16;
            if (rational != null) {
            }
            wrj0Var = yVar2.A;
            surfaceConfig$ConfigType = (SurfaceConfig$ConfigType) anw0.h.get(Integer.valueOf(inputFormat3));
            if (surfaceConfig$ConfigType == null) {
            }
            if (wrj0Var.a != null) {
                ArrayList arrayList122 = new ArrayList();
                arrayList122.add(e);
                while (r7.hasNext()) {
                }
                list8 = arrayList122;
            }
            arrayList9.add(list8);
        }
        if (q84Var4.f) {
            yVar2.C.getClass();
            if (arrayList9.isEmpty()) {
                arrayList4 = EmptyList.a;
            } else {
                List<Size> a = lju.a(arrayList9);
                ArrayList arrayList13 = new ArrayList(tcc.n(a, 10));
                for (Size size6 : a) {
                    int size7 = arrayList9.size();
                    ArrayList arrayList14 = new ArrayList(size7);
                    for (int i9 = 0; i9 < size7; i9++) {
                        arrayList14.add(size6);
                    }
                    arrayList13.add(arrayList14);
                }
                arrayList4 = arrayList13;
            }
        } else {
            Iterator it8 = arrayList9.iterator();
            int i10 = i;
            while (it8.hasNext()) {
                i10 *= ((List) it8.next()).size();
            }
            if (i10 == 0) {
                ny61.g("Failed to find supported resolutions.");
                return r16;
            }
            arrayList4 = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList4.add(new ArrayList());
            }
            int size8 = i10 / ((List) arrayList9.get(0)).size();
            int i12 = i10;
            for (int i13 = 0; i13 < arrayList9.size(); i13++) {
                List list9 = (List) arrayList9.get(i13);
                for (int i14 = 0; i14 < i10; i14++) {
                    ((List) arrayList4.get(i14)).add((Size) list9.get((i14 % i12) / size8));
                }
                if (i13 < arrayList9.size() - 1) {
                    i12 = size8;
                    size8 /= ((List) arrayList9.get(i13 + 1)).size();
                }
            }
        }
        List list10 = arrayList4;
        HashMap hashMap13 = new HashMap();
        HashMap hashMap14 = new HashMap();
        HashMap hashMap15 = new HashMap();
        HashMap hashMap16 = new HashMap();
        x34 x34Var = oru0.a;
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (it9.hasNext()) {
                i34 i34Var = (i34) it9.next();
                if (oru0.c(i34Var.f, (UseCaseConfigFactory$CaptureType) i34Var.e.get(0))) {
                    break;
                }
            } else {
                Iterator it10 = arrayList7.iterator();
                while (it10.hasNext()) {
                    xi21 xi21Var4 = (xi21) it10.next();
                    if (oru0.c(xi21Var4, xi21Var4.y())) {
                    }
                }
                i2 = 0;
            }
        }
        i2 = i;
        boolean z = q84Var4.f;
        Iterator it11 = arrayList.iterator();
        int i15 = Integer.MAX_VALUE;
        while (it11.hasNext()) {
            i34 i34Var2 = (i34) it11.next();
            i15 = Math.min(i15, yVar2.e(i34Var2.b, i34Var2.c, z));
        }
        if (yVar2.s && i2 == 0) {
            Iterator it12 = list10.iterator();
            List list11 = r16;
            while (true) {
                if (!it12.hasNext()) {
                    q84Var2 = q84Var;
                    hashMap2 = hashMap15;
                    hashMap3 = hashMap16;
                    break;
                }
                Pair k = yVar2.k(q84Var, arrayList, (List) it12.next(), arrayList7, arrayList3, i15, hashMap15, hashMap16);
                q84Var2 = q84Var;
                hashMap2 = hashMap15;
                hashMap3 = hashMap16;
                list11 = yVar2.g(q84Var2, (List) k.first, hashMap2, hashMap3);
                if (list11 != null) {
                    break;
                }
                hashMap2.clear();
                hashMap3.clear();
                hashMap15 = hashMap2;
                hashMap16 = hashMap3;
                arrayList7 = arrayList2;
                list11 = list11;
            }
            Objects.toString(list11);
            sgb1.g(3, "SupportedSurfaceCombination");
            list = list11;
        } else {
            q84Var2 = q84Var;
            hashMap2 = hashMap15;
            hashMap3 = hashMap16;
            list = r16;
        }
        Range range4 = q84Var2.i;
        Iterator it13 = list10.iterator();
        List list12 = r16;
        List list13 = list12;
        int i16 = Integer.MAX_VALUE;
        int i17 = Integer.MAX_VALUE;
        int i18 = 0;
        int i19 = 0;
        y yVar3 = yVar2;
        while (true) {
            if (!it13.hasNext()) {
                hashMap4 = hashMap2;
                hashMap5 = hashMap3;
                str = str2;
                hashMap6 = hashMap13;
                hashMap7 = hashMap14;
                list2 = list;
                arrayList5 = arrayList2;
                range = range4;
                q84Var3 = q84Var2;
                i3 = i17;
                list3 = list12;
                list4 = list13;
                yVar = yVar3;
                break;
            }
            List list14 = (List) it13.next();
            int i20 = i17;
            HashMap hashMap17 = new HashMap();
            HashMap hashMap18 = new HashMap();
            str = str2;
            hashMap4 = hashMap2;
            hashMap5 = hashMap3;
            Iterator it14 = it13;
            hashMap6 = hashMap13;
            int i21 = i16;
            list2 = list;
            range = range4;
            Pair k2 = yVar3.k(q84Var2, arrayList, list14, arrayList2, arrayList3, i15, hashMap17, hashMap18);
            int i22 = i15;
            List list15 = (List) k2.first;
            int intValue = ((Integer) k2.second).intValue();
            int i23 = (lru0.a.equals(range) || intValue >= i22 || intValue >= ((Integer) range.getUpper()).intValue()) ? i : 0;
            HashMap hashMap19 = new HashMap();
            for (int i24 = 0; i24 < list15.size(); i24++) {
                anw0 anw0Var = (anw0) list15.get(i24);
                q8n q8nVar = q8n.c;
                if (hashMap17.containsKey(Integer.valueOf(i24))) {
                    i34 i34Var3 = (i34) hashMap17.get(Integer.valueOf(i24));
                    Objects.requireNonNull(i34Var3);
                    q8nVar = i34Var3.d;
                } else if (hashMap18.containsKey(Integer.valueOf(i24))) {
                    xi21 xi21Var5 = (xi21) hashMap18.get(Integer.valueOf(i24));
                    Objects.requireNonNull(xi21Var5);
                    q8nVar = (q8n) hashMap10.get(xi21Var5);
                }
                hashMap19.put(anw0Var, q8nVar);
            }
            hashMap7 = hashMap14;
            zoi zoiVar = new zoi(this, q84Var, list15, hashMap19, arrayList2, arrayList3, 7);
            y yVar4 = this;
            q84Var3 = q84Var;
            arrayList5 = arrayList2;
            UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl(zoiVar);
            if (i18 == 0 && ((Boolean) unsafeLazyImpl.getValue()).booleanValue()) {
                if (i21 == Integer.MAX_VALUE || i21 < intValue) {
                    i21 = intValue;
                    list12 = list14;
                }
                if (i23 != 0) {
                    if (i19 != 0) {
                        i3 = i20;
                        i16 = intValue;
                        list4 = list13;
                        list3 = list14;
                        yVar = yVar4;
                        break;
                    }
                    i21 = intValue;
                    i18 = i;
                    list12 = list14;
                }
            }
            if (list2 == null || i19 != 0 || yVar4.g(q84Var3, list15, hashMap17, hashMap18) == null) {
                i17 = i20;
            } else {
                if (i20 != Integer.MAX_VALUE && i20 >= intValue) {
                    i17 = i20;
                } else {
                    i17 = intValue;
                    list13 = list14;
                }
                if (i23 == 0) {
                    continue;
                } else {
                    if (i18 != 0) {
                        i16 = i21;
                        i3 = intValue;
                        list3 = list12;
                        list4 = list14;
                        yVar = yVar4;
                        break;
                    }
                    i17 = intValue;
                    i19 = i;
                    list13 = list14;
                }
            }
            hashMap10 = hashMap;
            q84Var2 = q84Var3;
            i16 = i21;
            range4 = range;
            str2 = str;
            list = list2;
            hashMap13 = hashMap6;
            hashMap2 = hashMap4;
            hashMap3 = hashMap5;
            i15 = i22;
            hashMap14 = hashMap7;
            it13 = it14;
            yVar3 = yVar4;
        }
        p84 p84Var = (!q84Var3.g || lru0.a.equals(range) || (i16 != Integer.MAX_VALUE && i16 >= ((Integer) range.getUpper()).intValue())) ? new p84(i16, i3, Integer.MAX_VALUE, list3, list4) : new p84(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, null, null);
        p84Var.toString();
        sgb1.g(3, "SupportedSurfaceCombination");
        List list16 = p84Var.a;
        int i25 = p84Var.c;
        List list17 = p84Var.b;
        int i26 = p84Var.d;
        int i27 = p84Var.e;
        if (list16 == null) {
            throw new IllegalArgumentException(str + yVar.k + " and Hardware level: " + yVar.o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + " New configs: " + arrayList5);
        }
        Range range5 = lru0.a;
        boolean equals = range5.equals(q84Var3.i);
        boolean z2 = q84Var3.f;
        if (!equals) {
            Range[] b = z2 ? yVar.C.b(list16) : (Range[]) yVar.m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range d = d(q84Var3.i, i25, b);
            if (q84Var3.g || q84Var3.j) {
                d6z.m("Target FPS range " + q84Var3.i + " is not supported. Max FPS supported by the calculated best combination: " + i25 + ". Calculated best FPS range for device: " + d + ". Device supported FPS ranges: " + Arrays.toString(b), d.equals(q84Var3.i));
            }
            range5 = d;
        } else if (z2) {
            range5 = d(lju.e, i25, yVar.C.b(list16));
        }
        Iterator it15 = arrayList5.iterator();
        while (it15.hasNext()) {
            xi21 xi21Var6 = (xi21) it15.next();
            j4n a2 = lru0.a((Size) list16.get(arrayList3.indexOf(Integer.valueOf(arrayList5.indexOf(xi21Var6)))));
            a2.x = Integer.valueOf(q84Var3.f ? 1 : 0);
            q8n q8nVar2 = (q8n) hashMap.get(xi21Var6);
            q8nVar2.getClass();
            a2.c = q8nVar2;
            yy40 b2 = yy40.b();
            x34 x34Var2 = wn7.c;
            Iterator it16 = it15;
            if (xi21Var6.d(x34Var2)) {
                b2.w(x34Var2, xi21Var6.f(x34Var2));
            }
            x34 x34Var3 = xi21.r4;
            if (xi21Var6.d(x34Var3)) {
                b2.w(x34Var3, xi21Var6.f(x34Var3));
            }
            x34 x34Var4 = x8v.b;
            if (xi21Var6.d(x34Var4)) {
                b2.w(x34Var4, xi21Var6.f(x34Var4));
            }
            x34 x34Var5 = eav.j2;
            if (xi21Var6.d(x34Var5)) {
                b2.w(x34Var5, xi21Var6.f(x34Var5));
            }
            a2.z = new wn7(b2);
            a2.w = Boolean.valueOf(q84Var3.b);
            if (!lru0.a.equals(range5)) {
                a2.y = range5;
            }
            hashMap7.put(xi21Var6, a2.k());
            it15 = it16;
        }
        HashMap hashMap20 = hashMap7;
        if (list2 != null && i25 == i26 && list16.size() == list17.size()) {
            for (int i28 = 0; i28 < list16.size(); i28++) {
                if (((Size) list16.get(i28)).equals(list17.get(i28))) {
                }
            }
            ep7 ep7Var2 = yVar.m;
            x34 x34Var6 = oru0.a;
            if (Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList15 = new ArrayList(hashMap20.keySet());
                Iterator it17 = arrayList.iterator();
                while (it17.hasNext()) {
                    ((i34) it17.next()).f.getClass();
                }
                Iterator it18 = arrayList15.iterator();
                while (it18.hasNext()) {
                    Object obj = hashMap20.get((xi21) it18.next());
                    obj.getClass();
                    ((lru0) obj).d().getClass();
                }
                key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                long[] jArr = (long[]) ep7Var2.a(key);
                if (jArr != null && jArr.length != 0) {
                    HashSet hashSet = new HashSet();
                    for (long j : jArr) {
                        hashSet.add(Long.valueOf(j));
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it19 = arrayList.iterator();
                    if (it19.hasNext()) {
                        i34 i34Var4 = (i34) it19.next();
                        szd szdVar = i34Var4.f;
                        x34 x34Var7 = wn7.c;
                        if (szdVar.d(x34Var7) && ((Number) i34Var4.f.f(x34Var7)).longValue() != 0) {
                            i5 = i;
                            i4 = 0;
                            it = arrayList15.iterator();
                            while (it.hasNext()) {
                                xi21 xi21Var7 = (xi21) it.next();
                                x34 x34Var8 = wn7.c;
                                if (xi21Var7.d(x34Var8)) {
                                    long longValue = ((Number) xi21Var7.f(x34Var8)).longValue();
                                    if (longValue != 0) {
                                        if (i4 != 0) {
                                            ny61.g("Either all use cases must have non-default stream use case assigned or none should have it");
                                            return r16;
                                        }
                                        linkedHashSet.add(Long.valueOf(longValue));
                                        i5 = i;
                                    } else if (i5 != 0) {
                                        ny61.g("Either all use cases must have non-default stream use case assigned or none should have it");
                                        return r16;
                                    }
                                } else if (i5 != 0) {
                                    ny61.g("Either all use cases must have non-default stream use case assigned or none should have it");
                                    return r16;
                                }
                                i4 = i;
                            }
                            if (i4 == 0) {
                                Iterator it20 = linkedHashSet.iterator();
                                while (it20.hasNext()) {
                                    if (!hashSet.contains(Long.valueOf(((Number) it20.next()).longValue()))) {
                                    }
                                }
                                Iterator it21 = arrayList.iterator();
                                while (it21.hasNext()) {
                                    i34 i34Var5 = (i34) it21.next();
                                    szd szdVar2 = i34Var5.f;
                                    wn7 a3 = oru0.a(szdVar2, (Long) szdVar2.f(wn7.c));
                                    if (a3 != null) {
                                        j4n a4 = lru0.a(i34Var5.c);
                                        a4.x = Integer.valueOf(i34Var5.g);
                                        Range range6 = i34Var5.h;
                                        if (range6 == null) {
                                            ny61.t("Null expectedFrameRateRange");
                                            return r16;
                                        }
                                        a4.y = range6;
                                        q8n q8nVar3 = i34Var5.d;
                                        if (q8nVar3 == null) {
                                            ny61.t("Null dynamicRange");
                                            return r16;
                                        }
                                        a4.c = q8nVar3;
                                        a4.z = a3;
                                        hashMap6.put(i34Var5, a4.k());
                                    }
                                }
                                hashMap8 = hashMap6;
                                Iterator it22 = arrayList15.iterator();
                                while (it22.hasNext()) {
                                    xi21 xi21Var8 = (xi21) it22.next();
                                    lru0 lru0Var = (lru0) hashMap20.get(xi21Var8);
                                    szd d2 = lru0Var.d();
                                    wn7 a5 = oru0.a(d2, (Long) d2.f(wn7.c));
                                    if (a5 != null) {
                                        j4n i29 = lru0Var.i();
                                        i29.z = a5;
                                        hashMap20.put(xi21Var8, i29.k());
                                    }
                                }
                                return new bow0(hashMap20, hashMap8, i27);
                            }
                        } else {
                            i4 = i;
                        }
                    } else {
                        i4 = 0;
                    }
                    i5 = 0;
                    it = arrayList15.iterator();
                    while (it.hasNext()) {
                    }
                    if (i4 == 0) {
                    }
                }
            }
            hashMap8 = hashMap6;
            x34 x34Var9 = oru0.a;
            int size9 = list2.size();
            int i30 = 0;
            while (i30 < size9) {
                List list18 = list2;
                long value = ((anw0) list18.get(i30)).c.getValue();
                HashMap hashMap21 = hashMap4;
                if (hashMap21.containsKey(Integer.valueOf(i30))) {
                    i34 i34Var6 = (i34) hashMap21.get(Integer.valueOf(i30));
                    wn7 a6 = oru0.a(i34Var6.f, Long.valueOf(value));
                    if (a6 != null) {
                        j4n a7 = lru0.a(i34Var6.c);
                        a7.x = Integer.valueOf(i34Var6.g);
                        Range range7 = i34Var6.h;
                        if (range7 == null) {
                            ny61.t("Null expectedFrameRateRange");
                            return r16;
                        }
                        a7.y = range7;
                        q8n q8nVar4 = i34Var6.d;
                        if (q8nVar4 == null) {
                            ny61.t("Null dynamicRange");
                            return r16;
                        }
                        a7.c = q8nVar4;
                        a7.z = a6;
                        hashMap8.put(i34Var6, a7.k());
                    }
                    hashMap9 = hashMap5;
                } else {
                    hashMap9 = hashMap5;
                    if (!hashMap9.containsKey(Integer.valueOf(i30))) {
                        ny61.f("SurfaceConfig does not map to any use case");
                        return r16;
                    }
                    xi21 xi21Var9 = (xi21) hashMap9.get(Integer.valueOf(i30));
                    lru0 lru0Var2 = (lru0) hashMap20.get(xi21Var9);
                    wn7 a8 = oru0.a(lru0Var2.d(), Long.valueOf(value));
                    if (a8 != null) {
                        j4n i31 = lru0Var2.i();
                        i31.z = a8;
                        hashMap20.put(xi21Var9, i31.k());
                    }
                }
                i30++;
                list2 = list18;
                hashMap4 = hashMap21;
                hashMap5 = hashMap9;
            }
            return new bow0(hashMap20, hashMap8, i27);
        }
        hashMap8 = hashMap6;
        return new bow0(hashMap20, hashMap8, i27);
    }

    public final void o(HashMap hashMap, int i, Rational rational) {
        Size f = f((StreamConfigurationMap) ((wor0) this.m.c().a).a, i, true, rational);
        if (f != null) {
            hashMap.put(Integer.valueOf(i), f);
        }
    }

    public final void p(HashMap hashMap, Size size, int i) {
        if (this.r) {
            Size f = f((StreamConfigurationMap) ((wor0) this.m.c().a).a, i, false, null);
            Integer valueOf = Integer.valueOf(i);
            if (f != null) {
                size = (Size) Collections.min(Arrays.asList(size, f), new gvc());
            }
            hashMap.put(valueOf, size);
        }
    }
}
