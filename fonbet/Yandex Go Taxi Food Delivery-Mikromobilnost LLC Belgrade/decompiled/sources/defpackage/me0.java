package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Process;
import android.util.TypedValue;
import androidx.credentials.a;
import com.yandex.runtime.DataProviderWithId;
import com.ybsdk.widgets.common.MoneyInputEditView;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes4.dex */
public final class me0 implements a, IFileManager, DataProviderWithId, u3v, zwx0, os71 {
    public Context a;

    public me0(Context context, int i) {
        switch (i) {
            case 18:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static String c(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005e, code lost:
    
        if (r5.equals("mhtml") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f(String str) {
        String str2 = null;
        if (str != null) {
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (guessContentTypeFromName == null) {
                char c = '.';
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            if (lowerCase.equals("gz")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3401:
                            if (lowerCase.equals("js")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 97669:
                            if (lowerCase.equals("bmp")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 98819:
                            if (lowerCase.equals("css")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102340:
                            if (lowerCase.equals("gif")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 103649:
                            if (lowerCase.equals("htm")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104085:
                            if (lowerCase.equals("ico")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105441:
                            if (lowerCase.equals("jpg")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106458:
                            if (lowerCase.equals("m4a")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 106479:
                            if (lowerCase.equals("m4v")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108089:
                            if (lowerCase.equals("mht")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108150:
                            if (lowerCase.equals("mjs")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108272:
                            if (lowerCase.equals("mp3")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108273:
                            if (lowerCase.equals("mp4")) {
                                c = HexString.LF;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108324:
                            if (lowerCase.equals("mpg")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109961:
                            if (lowerCase.equals("oga")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109967:
                            if (lowerCase.equals("ogg")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109973:
                            if (lowerCase.equals("ogm")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109982:
                            if (lowerCase.equals("ogv")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110834:
                            if (lowerCase.equals("pdf")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 111030:
                            if (lowerCase.equals("pjp")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 111145:
                            if (lowerCase.equals("png")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114276:
                            if (lowerCase.equals("svg")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114791:
                            if (lowerCase.equals("tgz")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114833:
                            if (lowerCase.equals("tif")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 117484:
                            if (lowerCase.equals("wav")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 118660:
                            if (lowerCase.equals("xht")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 118807:
                            if (lowerCase.equals("xml")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 120609:
                            if (lowerCase.equals("zip")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3000872:
                            if (lowerCase.equals("apng")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3145576:
                            if (lowerCase.equals("flac")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3213227:
                            if (lowerCase.equals("html")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3259225:
                            if (lowerCase.equals("jfif")) {
                                c = HexString.CHAR_SPACE;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3268712:
                            if (lowerCase.equals("jpeg")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3271912:
                            if (lowerCase.equals("json")) {
                                c = OpenList.CHAR_QUOTE;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3358085:
                            if (lowerCase.equals("mpeg")) {
                                c = '#';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3418175:
                            if (lowerCase.equals("opus")) {
                                c = '$';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3529614:
                            if (lowerCase.equals("shtm")) {
                                c = '%';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3542678:
                            if (lowerCase.equals("svgz")) {
                                c = '&';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3559925:
                            if (lowerCase.equals("tiff")) {
                                c = '\'';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3642020:
                            if (lowerCase.equals("wasm")) {
                                c = '(';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3645337:
                            if (lowerCase.equals("webm")) {
                                c = ')';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3645340:
                            if (lowerCase.equals("webp")) {
                                c = '*';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3655064:
                            if (lowerCase.equals("woff")) {
                                c = '+';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3678569:
                            if (lowerCase.equals("xhtm")) {
                                c = HexString.CHAR_COMMA;
                                break;
                            }
                            c = 65535;
                            break;
                        case 96488848:
                            if (lowerCase.equals("ehtml")) {
                                c = LicenseUtility.SEPARATOR;
                                break;
                            }
                            c = 65535;
                            break;
                        case 103877016:
                            break;
                        case 106703064:
                            if (lowerCase.equals("pjpeg")) {
                                c = '/';
                                break;
                            }
                            c = 65535;
                            break;
                        case 109418142:
                            if (lowerCase.equals("shtml")) {
                                c = MoneyInputEditView.DEFAULT_VALUE;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114035747:
                            if (lowerCase.equals("xhtml")) {
                                c = '1';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 23:
                            str2 = "application/gzip";
                            break;
                        case 1:
                        case 11:
                            str2 = "text/javascript";
                            break;
                        case 2:
                            str2 = "image/bmp";
                            break;
                        case 3:
                            str2 = "text/css";
                            break;
                        case 4:
                            str2 = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case '%':
                        case '-':
                        case '0':
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case ' ':
                        case '!':
                        case '/':
                            str2 = "image/jpeg";
                            break;
                        case '\b':
                            str2 = "audio/x-m4a";
                            break;
                        case '\t':
                        case '\r':
                            str2 = "video/mp4";
                            break;
                        case '\n':
                        case '.':
                            str2 = "multipart/related";
                            break;
                        case '\f':
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case '#':
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case '$':
                            str2 = "audio/ogg";
                            break;
                        case 17:
                        case 18:
                            str2 = "video/ogg";
                            break;
                        case 19:
                            str2 = "application/pdf";
                            break;
                        case 21:
                            str2 = "image/png";
                            break;
                        case 22:
                        case '&':
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case '\'':
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case 26:
                        case ',':
                        case '1':
                            str2 = "application/xhtml+xml";
                            break;
                        case 27:
                            str2 = "text/xml";
                            break;
                        case 28:
                            str2 = "application/zip";
                            break;
                        case 29:
                            str2 = "image/apng";
                            break;
                        case 30:
                            str2 = "audio/flac";
                            break;
                        case '\"':
                            str2 = "application/json";
                            break;
                        case '(':
                            str2 = "application/wasm";
                            break;
                        case ')':
                            str2 = "video/webm";
                            break;
                        case '*':
                            str2 = GlideBitmapDownloader.ACCEPT_WEBP;
                            break;
                        case '+':
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = guessContentTypeFromName;
            }
        }
        return str2 == null ? "text/plain" : str2;
    }

    @Override // defpackage.os71
    public void A(w7o w7oVar) {
        AppMetricaLibraryAdapter.setAdvIdentifiersTracking(w7oVar.a);
    }

    @Override // defpackage.os71
    public void F(w7o w7oVar) {
        AppMetricaLibraryAdapter.activate(this.a, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(w7oVar.a).build());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1.isProviderEnabled("network") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j7z d() {
        Context context = this.a;
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null && (qke.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || qke.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
            try {
                if (!locationManager.isProviderEnabled("gps")) {
                }
                Iterator it = scc.g("gps", "network").iterator();
                Location location = null;
                while (it.hasNext()) {
                    try {
                        Location lastKnownLocation = locationManager.getLastKnownLocation((String) it.next());
                        if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                            location = lastKnownLocation;
                        }
                    } catch (SecurityException | Exception unused) {
                    }
                }
                if (location != null) {
                    return new j7z(location.getLatitude(), location.getLongitude());
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.file.IFileManager
    public boolean deleteFile(String str, String str2) {
        try {
            File file = new File(getDirectory(str2, false), str);
            if (file.exists()) {
                return file.delete();
            }
            return false;
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            return false;
        }
    }

    public String e() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public InputStream g(String str) {
        Context context = this.a;
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] split = str.split("/", -1);
        if (split.length != 2) {
            ny61.g("Incorrect resource path: ".concat(str));
            return null;
        }
        String str2 = split[0];
        String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        int identifier = context.getResources().getIdentifier(str3, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i = typedValue.type;
        if (i != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i)));
        }
        InputStream openRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(openRawResource) : openRawResource;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.file.IFileManager
    public File getDirectory(String str, boolean z) {
        Context context = this.a;
        File cacheDir = evu0.J(str) ? context.getCacheDir() : new File(context.getFilesDir(), str);
        if (!cacheDir.exists() && z) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.file.IFileManager
    public File getFile(String str, String str2, boolean z) {
        File file = new File(getDirectory(str2, true), str);
        if (z) {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
        }
        return file;
    }

    @Override // com.yandex.runtime.DataProviderWithId
    public byte[] load() {
        InputStream open = this.a.getAssets().open("scooters_nav_arrow_model.glb");
        try {
            byte[] R = rzo.R(open);
            ooc.g(open, null);
            return R;
        } finally {
        }
    }

    @Override // com.yandex.runtime.DataProviderWithId
    public String providerId() {
        return "scooters/gltf:scooters_nav_arrow_model.glb";
    }

    @Override // defpackage.os71
    public void reportEvent(String str, String str2) {
        AppMetricaLibraryAdapter.reportEvent("ads_sdk", str, str2);
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.file.IFileManager
    public boolean rewriteFile(String str, String str2) {
        try {
            return g1r.a(new File(getDirectory(str2, false), str));
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            return false;
        }
    }

    public /* synthetic */ me0(Context context, byte b) {
        this.a = context;
    }
}
