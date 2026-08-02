package ru.ok.tracer.base.deviceid;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import ru.ok.tracer.base.io.FileUtils;
import xsna.drm0;
import xsna.emb;
import xsna.nbr;
import xsna.s3q0;

/* compiled from: DeviceIdUtils.kt */
/* loaded from: classes11.dex */
public final class DeviceIdUtils {
    private static final String FILE_DEVICE_ID = "device_id.txt";
    private static final String KEY_DEVICE_ID = "device_id";
    public static final String NULL_UUID = "00000000-0000-0000-0000-000000000000";
    private static volatile String cachedDeviceId;
    private static final Object deviceIdLock = new Object();

    public static final String getDeviceId(Context context) {
        String str = cachedDeviceId;
        if (str != null) {
            return str;
        }
        synchronized (deviceIdLock) {
            String str2 = cachedDeviceId;
            if (str2 != null) {
                return str2;
            }
            String loadDeviceId = loadDeviceId(context.getApplicationContext());
            cachedDeviceId = loadDeviceId;
            return loadDeviceId;
        }
    }

    private static final String loadDeviceId(Context context) {
        SharedPreferences h = Preference.h(context, 0, "tracer");
        String str = null;
        String string = h.getString("device_id", null);
        String str2 = string == null ? NULL_UUID : string;
        try {
            File t = nbr.t(FileUtils.mkdirsChecked(nbr.t(context.getFilesDir(), "tracer")), "device_id.txt");
            if (t.exists()) {
                try {
                    String obj = drm0.p0(nbr.r(t, emb.b)).toString();
                    if (obj.length() > 0) {
                        str = obj;
                    }
                } catch (IOException unused) {
                }
            }
            if (str != null) {
                return str;
            }
            String uuid = string == null ? UUID.randomUUID().toString() : string;
            FileOutputStream fileOutputStream = new FileOutputStream(t);
            try {
                fileOutputStream.write(uuid.getBytes(emb.b));
                fileOutputStream.getFD().sync();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
                if (string != null) {
                    h.edit().remove("device_id").apply();
                }
                return uuid;
            } finally {
            }
        } catch (IOException unused2) {
            return str2;
        }
    }
}
