package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
@Deprecated
/* loaded from: classes12.dex */
public final class t2z {
    public static final f3u b = new f3u("LibraryVersion", "");
    public static final t2z c = new t2z();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    @NonNull
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(@NonNull String str) {
        IOException e;
        String str2;
        InputStream inputStream;
        String str3;
        String str4;
        f3u f3uVar = b;
        exc0.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r7 = null;
        String str5 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = t2z.class.getResourceAsStream(DomExceptionUtils.SEPARATOR + str + ".properties");
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str5 = properties.getProperty("version", null);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str5).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str5);
                String sb2 = sb.toString();
                if (Log.isLoggable(f3uVar.a, 2) && (str4 = f3uVar.b) != null) {
                    str4.concat(sb2);
                }
            } else {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                f3uVar.a(sb3.toString());
            }
        } catch (IOException e3) {
            e = e3;
            String str6 = str5;
            inputStream2 = inputStream;
            str2 = str6;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
            sb4.append("Failed to get app version for libraryName: ");
            sb4.append(str);
            String sb5 = sb4.toString();
            if (Log.isLoggable(f3uVar.a, 6)) {
                String str7 = f3uVar.b;
                if (str7 != null) {
                    sb5 = str7.concat(sb5);
                }
                Log.e("LibraryVersion", sb5, e);
            }
            InputStream inputStream3 = inputStream2;
            str5 = str2;
            inputStream = inputStream3;
            if (inputStream != null) {
            }
            if (str5 == null) {
            }
            concurrentHashMap.put(str, str5);
            return str5;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                unv.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            unv.a(inputStream);
        }
        if (str5 == null) {
            if (Log.isLoggable(f3uVar.a, 3) && (str3 = f3uVar.b) != null) {
                str3.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str5 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        concurrentHashMap.put(str, str5);
        return str5;
    }
}
