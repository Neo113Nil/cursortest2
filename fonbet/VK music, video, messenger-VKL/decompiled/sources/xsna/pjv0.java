package xsna;

import android.app.backup.BackupDataInputStream;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.util.Xml;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.preference.Preference;
import com.vk.ecosystem.backup.domain.VkBackupAgent;
import com.vk.log.L;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.CRC32;
import kotlin.Result;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: VkSharedPreferencesBackupHelper.kt */
/* loaded from: classes18.dex */
public final class pjv0 implements BackupHelper {
    public final VkBackupAgent a;
    public final String[] b;

    public pjv0(VkBackupAgent vkBackupAgent, String... strArr) {
        this.a = vkBackupAgent;
        this.b = strArr;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(String str, SharedPreferences.Editor editor) {
        String attributeValue;
        Integer m;
        Long n;
        Float l;
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(new StringReader(str));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2 && (attributeValue = newPullParser.getAttributeValue(null, "name")) != null) {
                String attributeValue2 = newPullParser.getAttributeValue(null, "value");
                String name = newPullParser.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -891985903:
                            if (name.equals("string")) {
                                editor.putString(attributeValue, newPullParser.nextText());
                                break;
                            } else {
                                break;
                            }
                        case 104431:
                            if (name.equals("int") && attributeValue2 != null && (m = arm0.m(10, attributeValue2)) != null) {
                                editor.putInt(attributeValue, m.intValue());
                                break;
                            }
                            break;
                        case 113762:
                            if (!name.equals("set")) {
                                break;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                int next = newPullParser.next();
                                while (true) {
                                    if (next == 3 && epx.f(newPullParser.getName(), "set")) {
                                        editor.putStringSet(attributeValue, linkedHashSet);
                                        break;
                                    } else {
                                        if (next == 2 && epx.f(newPullParser.getName(), "string")) {
                                            linkedHashSet.add(newPullParser.nextText());
                                        }
                                        next = newPullParser.next();
                                    }
                                }
                            }
                            break;
                        case 3327612:
                            if (name.equals("long") && attributeValue2 != null && (n = arm0.n(attributeValue2)) != null) {
                                editor.putLong(attributeValue, n.longValue());
                                break;
                            }
                            break;
                        case 64711720:
                            if (name.equals("boolean")) {
                                editor.putBoolean(attributeValue, epx.f(attributeValue2, "true"));
                                break;
                            } else {
                                break;
                            }
                        case 97526364:
                            if (name.equals("float") && attributeValue2 != null && (l = arm0.l(attributeValue2)) != null) {
                                editor.putFloat(attributeValue, l.floatValue());
                                break;
                            }
                            break;
                    }
                }
            }
        }
    }

    public static byte[] b(Map map) {
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(C.UTF8_NAME, Boolean.TRUE);
        newSerializer.startTag(null, "map");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                newSerializer.startTag(null, "string");
                newSerializer.attribute(null, "name", str);
                newSerializer.text((String) value);
                newSerializer.endTag(null, "string");
            } else if (value instanceof Boolean) {
                d(newSerializer, "boolean", str, String.valueOf(((Boolean) value).booleanValue()));
            } else if (value instanceof Integer) {
                d(newSerializer, "int", str, String.valueOf(((Number) value).intValue()));
            } else if (value instanceof Long) {
                d(newSerializer, "long", str, String.valueOf(((Number) value).longValue()));
            } else if (value instanceof Float) {
                d(newSerializer, "float", str, String.valueOf(((Number) value).floatValue()));
            } else if (value instanceof Set) {
                Set set = (Set) value;
                Set<String> set2 = set instanceof Set ? set : null;
                if (set2 != null) {
                    newSerializer.startTag(null, "set");
                    newSerializer.attribute(null, "name", str);
                    for (String str2 : set2) {
                        newSerializer.startTag(null, "string");
                        newSerializer.text(str2);
                        newSerializer.endTag(null, "string");
                    }
                    newSerializer.endTag(null, "set");
                } else {
                    set.getClass().toString();
                }
            } else if (value != null) {
                value.getClass().toString();
            }
        }
        newSerializer.endTag(null, "map");
        newSerializer.endDocument();
        return stringWriter.toString().getBytes(emb.b);
    }

    public static void c(ParcelFileDescriptor parcelFileDescriptor, LinkedHashMap linkedHashMap) {
        if (parcelFileDescriptor == null) {
            return;
        }
        String g0 = j5g.g0(linkedHashMap.entrySet(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, new yml0(12), 30);
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            fileOutputStream.write(g0.getBytes(emb.b));
            s3q0 s3q0Var = s3q0.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void d(XmlSerializer xmlSerializer, String str, String str2, String str3) {
        xmlSerializer.startTag(null, str);
        xmlSerializer.attribute(null, "name", str2);
        xmlSerializer.attribute(null, "value", str3);
        xmlSerializer.endTag(null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // android.app.backup.BackupHelper
    public final void performBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Object obj;
        Object obj2;
        if (backupDataOutput == null) {
            return;
        }
        String[] strArr = this.b;
        Objects.toString(rl3.u0(strArr));
        ?? r2 = jgp.b;
        if (parcelFileDescriptor != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    hfr t = rli0.t(new i5g(drm0.b0(new String(i7o0.h(fileInputStream), emb.b), new char[]{'|'}, 0, 6)), new tdk0(9));
                    ?? linkedHashMap = new LinkedHashMap();
                    pn00.q(linkedHashMap, t);
                    int size = linkedHashMap.size();
                    if (size == 0) {
                        obj2 = r2;
                    } else if (size != 1) {
                        obj2 = linkedHashMap;
                    } else {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        obj2 = Collections.singletonMap(entry.getKey(), entry.getValue());
                    }
                    fileInputStream.close();
                    obj = obj2;
                } finally {
                }
            } catch (Throwable th) {
                obj = new Result.Failure(th);
            }
            if (Result.a(obj) == null) {
                r2 = obj;
            }
            r2 = (Map) r2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(strArr.length);
        for (String str : strArr) {
            SharedPreferences h = Preference.h(this.a, 0, str);
            byte[] b = b(h.getAll());
            CRC32 crc32 = new CRC32();
            crc32.update(b);
            long value = crc32.getValue();
            linkedHashMap2.put(str, Long.valueOf(value));
            Long l = (Long) r2.get(str);
            if (l == null || l.longValue() != value) {
                h.getAll().size();
                backupDataOutput.writeEntityHeader(str, b.length);
                backupDataOutput.writeEntityData(b, b.length);
            }
        }
        c(parcelFileDescriptor2, linkedHashMap2);
    }

    @Override // android.app.backup.BackupHelper
    public final void restoreEntity(BackupDataInputStream backupDataInputStream) {
        Object failure;
        if (backupDataInputStream == null) {
            return;
        }
        String key = backupDataInputStream.getKey();
        byte[] bArr = new byte[backupDataInputStream.size()];
        backupDataInputStream.read(bArr);
        String str = new String(bArr, emb.b);
        SharedPreferences h = Preference.h(this.a, 0, key);
        try {
            SharedPreferences.Editor edit = h.edit();
            edit.clear();
            a(str, edit);
            edit.apply();
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.f("VkPrefsBackupHelper", "restoreEntity: failed for key=" + key, a);
        }
        if (failure instanceof Result.Failure) {
            return;
        }
        h.getAll().size();
        Objects.toString(h.getAll().keySet());
    }

    @Override // android.app.backup.BackupHelper
    public final void writeNewStateDescription(ParcelFileDescriptor parcelFileDescriptor) {
        String[] strArr = this.b;
        int e = on00.e(strArr.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (String str : strArr) {
            byte[] b = b(Preference.h(this.a, 0, str).getAll());
            CRC32 crc32 = new CRC32();
            crc32.update(b);
            linkedHashMap.put(str, Long.valueOf(crc32.getValue()));
        }
        linkedHashMap.toString();
        c(parcelFileDescriptor, linkedHashMap);
    }
}
