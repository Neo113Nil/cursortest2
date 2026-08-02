package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import androidx.credentials.b;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.data.ContactPickerSecurityException;

/* loaded from: classes2.dex */
public final class abe implements dtn, ouj0, kp31, bit, b7u, np71 {
    public static final String[] b = {"display_name", "data1", "contact_id"};
    public final Context a;

    public abe(Context context, int i) {
        switch (i) {
            case 5:
                this.a = context.getApplicationContext();
                break;
            case 22:
                this.a = context.getApplicationContext();
                break;
            case 23:
                Context applicationContext = context.getApplicationContext();
                this.a = applicationContext != null ? applicationContext : context;
                break;
            case 24:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static String c(String str, String[] strArr) {
        String str2;
        List W;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            str2 = strArr[i];
            if (evu0.y(str2, str, false)) {
                break;
            }
            i++;
        }
        if (str2 == null) {
            return null;
        }
        W = evu0.W(str2, new String[]{":"}, (r2 & 4) != 0 ? 0 : 2);
        return (String) a.b0(W);
    }

    public static f9f e(abe abeVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return abeVar.l();
        }
        if (obj instanceof q5t) {
            for (e9f e9fVar : ((q5t) obj).a) {
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b bVar = new b(abeVar.a);
            b bVar2 = bVar.isAvailableOnDevice() ? bVar : null;
            return bVar2 == null ? abeVar.l() : bVar2;
        }
        if (i <= 33) {
            return abeVar.l();
        }
        return null;
    }

    @Override // defpackage.np71
    public void C(List list, aj31 aj31Var) {
        AppMetrica.requestStartupParams(this.a, new ds71(list, aj31Var), list);
    }

    @Override // defpackage.dtn
    public void a(etn etnVar) {
        ywd ywdVar = new ywd("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), ywdVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new p7h(10, this, etnVar, threadPoolExecutor));
    }

    @Override // defpackage.b7u
    public void b(qk31 qk31Var) {
        i5z0.a.a("Vibration called", new Object[0]);
        Context context = this.a;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null || audioManager.getRingerMode() != 0) {
            Object systemService2 = context.getSystemService("vibrator");
            Vibrator vibrator = systemService2 instanceof Vibrator ? (Vibrator) systemService2 : null;
            if (vibrator != null && vibrator.hasVibrator()) {
                boolean hasAmplitudeControl = vibrator.hasAmplitudeControl();
                long[] jArr = qk31Var.a;
                vibrator.vibrate(hasAmplitudeControl ? VibrationEffect.createWaveform(jArr, qk31Var.b, -1) : VibrationEffect.createWaveform(jArr, -1));
            }
        }
    }

    public String d() {
        Context context = this.a;
        StringBuilder sb = new StringBuilder("FintechSDK/1.16.9");
        try {
            String packageName = context.getPackageName();
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            sb.append(" ");
            sb.append(packageName + "/" + str);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public s9e f(Intent intent) {
        try {
            Uri data = intent.getData();
            if (data != null) {
                return h(data);
            }
            return null;
        } catch (SecurityException e) {
            jgz jgzVar = jgz.a;
            jgz.d(e, "Security exception while read picked contact with temporary permission", new Object[0]);
            throw new ContactPickerSecurityException();
        } catch (Exception e2) {
            jgz jgzVar2 = jgz.a;
            jgz.d(e2, "Error while map contact from cursor", new Object[0]);
            return null;
        }
    }

    public String g(int i, Object[] objArr) {
        return this.a.getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.bit
    public Object get() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }

    @Override // defpackage.kp31
    public Context getCtx() {
        return this.a;
    }

    @Override // defpackage.np71
    public String getDeviceId() {
        return AppMetrica.getDeviceId(this.a);
    }

    @Override // defpackage.np71
    public String getUuid() {
        return AppMetrica.getUuid(this.a);
    }

    public s9e h(Uri uri) {
        s9e s9eVar;
        ContentResolver contentResolver = this.a.getContentResolver();
        String[] strArr = b;
        Cursor query = contentResolver.query(uri, strArr, null, null, null);
        try {
            Cursor cursor = query;
            if (cursor == null || !cursor.moveToFirst()) {
                s9eVar = null;
            } else {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[0]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                if (string == null) {
                    string = "";
                }
                if (string2 == null) {
                    string2 = "";
                }
                s9eVar = new s9e(string, string2);
            }
            ooc.g(query, null);
            return s9eVar;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8 A[Catch: IOException -> 0x0123, TRY_LEAVE, TryCatch #1 {IOException -> 0x0123, blocks: (B:10:0x0036, B:16:0x0050, B:18:0x0061, B:20:0x0076, B:24:0x0083, B:31:0x00b2, B:36:0x00df, B:40:0x00e8, B:43:0x011e, B:48:0x010b, B:49:0x00cc, B:50:0x00d2, B:52:0x00d6, B:54:0x00da, B:58:0x0099, B:60:0x00a1, B:61:0x00ac, B:42:0x00fc), top: B:9:0x0036, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6 A[Catch: IOException -> 0x0123, TryCatch #1 {IOException -> 0x0123, blocks: (B:10:0x0036, B:16:0x0050, B:18:0x0061, B:20:0x0076, B:24:0x0083, B:31:0x00b2, B:36:0x00df, B:40:0x00e8, B:43:0x011e, B:48:0x010b, B:49:0x00cc, B:50:0x00d2, B:52:0x00d6, B:54:0x00da, B:58:0x0099, B:60:0x00a1, B:61:0x00ac, B:42:0x00fc), top: B:9:0x0036, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String i(String str, Double d, Double d2, int i) {
        int i2;
        double d3;
        double d4;
        double d5;
        double d6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Bitmap decodeFile;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        float f = options.outWidth;
        float f2 = options.outHeight;
        d6z.o(f, "width");
        d6z.o(f2, "height");
        if (f == -1.0f || f2 == -1.0f) {
            return str;
        }
        if (d == null && d2 == null) {
            i2 = i;
            if (i2 >= 100) {
                return str;
            }
        } else {
            i2 = i;
        }
        try {
            String[] split = str.split("/");
            String str2 = split[split.length - 1];
            double d7 = f;
            double d8 = f2;
            double d9 = d7 / d8;
            boolean z = d != null;
            boolean z2 = d2 != null;
            double min = z ? Math.min(d7, Math.round(d.doubleValue())) : d7;
            if (z2) {
                d3 = min;
                d4 = Math.min(d8, Math.round(d2.doubleValue()));
            } else {
                d3 = min;
                d4 = d8;
            }
            boolean z3 = z && d.doubleValue() < d7;
            boolean z4 = z2 && d2.doubleValue() < d8;
            if (!z3) {
                if (z4) {
                }
                d5 = d4;
                d6 = d3;
                float f3 = (float) d6;
                float f4 = (float) d5;
                d6z.o(f3, "width");
                d6z.o(f4, "height");
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                int i8 = (int) f3;
                i3 = (int) f4;
                i4 = options2.outHeight;
                int i9 = options2.outWidth;
                if (i4 <= i3 && i9 <= i8) {
                    i7 = 1;
                    options2.inSampleSize = i7;
                    decodeFile = BitmapFactory.decodeFile(str, options2);
                    if (decodeFile == null) {
                        return str;
                    }
                    File j = j(decodeFile, Double.valueOf(f3), Double.valueOf(f4), i2, str2);
                    try {
                        omy0.p(new androidx.exifinterface.media.a(str), new androidx.exifinterface.media.a(j.getPath()));
                    } catch (Exception e) {
                        Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e);
                    }
                    return j.getPath();
                }
                i5 = i4 / 2;
                int i10 = i9 / 2;
                i6 = 1;
                while (i5 / i6 >= i3 && i10 / i6 >= i8) {
                    i6 *= 2;
                }
                i7 = i6;
                options2.inSampleSize = i7;
                decodeFile = BitmapFactory.decodeFile(str, options2);
                if (decodeFile == null) {
                }
            }
            double d10 = d4 * d9;
            double d11 = d3 / d9;
            if (d11 > d4) {
                double round = Math.round(d10);
                d5 = d4;
                d6 = round;
                float f32 = (float) d6;
                float f42 = (float) d5;
                d6z.o(f32, "width");
                d6z.o(f42, "height");
                BitmapFactory.Options options22 = new BitmapFactory.Options();
                int i82 = (int) f32;
                i3 = (int) f42;
                i4 = options22.outHeight;
                int i92 = options22.outWidth;
                if (i4 <= i3) {
                    i7 = 1;
                    options22.inSampleSize = i7;
                    decodeFile = BitmapFactory.decodeFile(str, options22);
                    if (decodeFile == null) {
                    }
                }
                i5 = i4 / 2;
                int i102 = i92 / 2;
                i6 = 1;
                while (i5 / i6 >= i3) {
                    i6 *= 2;
                }
                i7 = i6;
                options22.inSampleSize = i7;
                decodeFile = BitmapFactory.decodeFile(str, options22);
                if (decodeFile == null) {
                }
            } else {
                d4 = Math.round(d11);
                d5 = d4;
                d6 = d3;
                float f322 = (float) d6;
                float f422 = (float) d5;
                d6z.o(f322, "width");
                d6z.o(f422, "height");
                BitmapFactory.Options options222 = new BitmapFactory.Options();
                int i822 = (int) f322;
                i3 = (int) f422;
                i4 = options222.outHeight;
                int i922 = options222.outWidth;
                if (i4 <= i3) {
                }
                i5 = i4 / 2;
                int i1022 = i922 / 2;
                i6 = 1;
                while (i5 / i6 >= i3) {
                }
                i7 = i6;
                options222.inSampleSize = i7;
                decodeFile = BitmapFactory.decodeFile(str, options222);
                if (decodeFile == null) {
                }
            }
        } catch (IOException e2) {
            ny61.j(e2);
            return null;
        }
    }

    public File j(Bitmap bitmap, Double d, Double d2, int i, String str) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, d.intValue(), d2.intValue(), false);
        String o = g8e.o("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createScaledBitmap.compress(createScaledBitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        File file = new File(this.a.getCacheDir(), o);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    public sgs k(u1w u1wVar, Deeplink$WebViewFormat deeplink$WebViewFormat, boolean z) {
        int i = u1wVar.a;
        Context context = this.a;
        int i2 = (int) (i / context.getResources().getDisplayMetrics().density);
        int i3 = tgs.a[deeplink$WebViewFormat.ordinal()];
        int i4 = 0;
        if (i3 != 1) {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            if (!z) {
                i4 = Float.valueOf(vez0.R(Integer.valueOf(u1wVar.b).floatValue(), context.getResources().getDisplayMetrics())).intValue();
            }
        }
        return new sgs(i2, i4, (int) (u1wVar.c / context.getResources().getDisplayMetrics().density), (int) (u1wVar.d / context.getResources().getDisplayMetrics().density));
    }

    public f9f l() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), HProv.PP_CONTAINER_EXTENSION);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List J0 = a.J0(arrayList);
        if (J0.isEmpty()) {
            return null;
        }
        Iterator it = J0.iterator();
        f9f f9fVar = null;
        while (it.hasNext()) {
            try {
                f9f f9fVar2 = (f9f) Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                if (!f9fVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (f9fVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    f9fVar = f9fVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return f9fVar;
    }

    @Override // defpackage.np71
    public String q() {
        return AppMetrica.getLibraryVersion();
    }

    @Override // defpackage.np71
    public hk71 r(String str) {
        return new hk71(1, AppMetrica.getReporter(this.a, str));
    }

    @Override // defpackage.np71
    public void w(String str) {
        AppMetrica.activateReporter(this.a, ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // defpackage.np71
    public void a() {
        AppMetrica.setDataSendingEnabled(false);
    }

    public abe(Activity activity, omy0 omy0Var) {
        this.a = activity;
    }

    public /* synthetic */ abe(Context context, boolean z, boolean z2) {
        this.a = context;
    }
}
