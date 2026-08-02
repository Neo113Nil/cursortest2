package ru.ok.android.webrtc.sharedprefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.vk.core.preference.Preference;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public abstract class PersistentDataSourceImpl implements PersistentDataSource {

    @Deprecated
    public static final String LOG_TAG = "PersistentDataSourceImpl";
    public final gzs a;
    public final SharedPreferences b;

    public PersistentDataSourceImpl(gzs<? extends RTCLog> gzsVar, Context context, String str) {
        this.a = gzsVar;
        this.b = Preference.h(context, 0, str);
    }

    public final String a(Serializable serializable) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    s3q0 s3q0Var = s3q0.a;
                    objectOutputStream.close();
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    byteArrayOutputStream.close();
                    return encodeToString;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            ((RTCLog) this.a.invoke()).logException(LOG_TAG, "Error during serializing object " + serializable, e);
            return null;
        }
    }

    @Override // ru.ok.android.webrtc.sharedprefs.PersistentDataSource
    public void delete(String str) {
        this.b.edit().remove(str).apply();
    }

    @Override // ru.ok.android.webrtc.sharedprefs.PersistentDataSource
    public <T extends Serializable> T get(String str, Class<T> cls) {
        String string = this.b.getString(str, null);
        if (string != null) {
            return (T) a(string);
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.sharedprefs.PersistentDataSource
    public <T extends Serializable> void put(String str, T t) {
        this.b.edit().putString(str, a(t)).apply();
    }

    @Override // ru.ok.android.webrtc.sharedprefs.PersistentDataSource
    public <T extends Serializable> T get(String str, T t) {
        T t2 = (T) get(str, (Class) t.getClass());
        return t2 == null ? t : t2;
    }

    public final Serializable a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Serializable serializable = (Serializable) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return serializable;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            ((RTCLog) this.a.invoke()).logException(LOG_TAG, "Error during deserializing string " + str, e);
            return null;
        }
    }
}
