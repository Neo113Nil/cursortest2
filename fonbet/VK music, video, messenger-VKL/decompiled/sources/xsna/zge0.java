package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.xge0;

/* compiled from: PushAnalyticsEventManager.kt */
/* loaded from: classes5.dex */
public final class zge0 {
    public static final zge0 a = new zge0();

    public static void a(File file, LinkedHashMap linkedHashMap) {
        Iterator it = nbr.q(file).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!drm0.N(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("source", "");
                    yge0 yge0Var = null;
                    if (optString.length() <= 0) {
                        optString = null;
                    }
                    if (optString != null) {
                        String optString2 = jSONObject.optString("instance_id", "");
                        if (optString2.length() <= 0) {
                            optString2 = null;
                        }
                        if (optString2 != null) {
                            String optString3 = jSONObject.optString("step", "");
                            if (optString3.length() <= 0) {
                                optString3 = null;
                            }
                            if (optString3 != null) {
                                yge0Var = new yge0(optString, optString2, optString3);
                            }
                        }
                    }
                    if (yge0Var != null) {
                        String str2 = yge0Var.a;
                        Object obj = linkedHashMap.get(str2);
                        if (obj == null) {
                            obj = new xge0();
                            linkedHashMap.put(str2, obj);
                        }
                        ((xge0) obj).a(yge0Var.b, yge0Var.c);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static void b(String str, xge0 xge0Var) {
        LinkedHashMap linkedHashMap = xge0Var.a;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (xge0.a aVar : linkedHashMap.values()) {
            int i12 = aVar.b;
            int i13 = aVar.c;
            int i14 = i12 - i13;
            i += i13;
            i2 += i14;
            if (i12 > i13) {
                i3++;
            }
            if (aVar.a) {
                boolean z = i12 > 0;
                if (i14 == 0 || aVar.d || aVar.e) {
                    i5++;
                    if (aVar.d) {
                        i6++;
                    }
                    if (aVar.e) {
                        i7++;
                    }
                } else if (!z) {
                    i4++;
                }
            } else if (i12 > 0) {
                i8++;
            } else if (aVar.d) {
                i9++;
            } else if (aVar.e) {
                i10++;
            } else {
                i11++;
            }
        }
        int size = linkedHashMap.size();
        if (size > 0) {
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.PUSH_RECEIVING.h(), null, str, Integer.valueOf(size), null, Integer.valueOf(i5), null, Integer.valueOf(size - i5), null, Integer.valueOf(i), null, Integer.valueOf(i2), null, Integer.valueOf(i8), null, Integer.valueOf(i11), null, Integer.valueOf(i4), null, Integer.valueOf(i3), null, Integer.valueOf(i6), null, Integer.valueOf(i9), null, Integer.valueOf(i7), null, Integer.valueOf(i10), null, null, null, null, null, null, -178956974, 3, null);
            l5mVar.q();
        }
    }

    public final synchronized void c(Context context, String str, String str2, String str3) {
        String str4 = "Failed to write event: " + str3 + ", instanceId=" + str2;
        try {
            File file = new File(context.getFilesDir(), "push-analytics");
            file.mkdirs();
            File file2 = new File(file, "events.jsonl");
            StringBuilder sb = new StringBuilder();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", DevNullEventKey.PUSH_RECEIVING.h());
            jSONObject.put("source", str);
            jSONObject.put("instance_id", str2);
            jSONObject.put("step", str3);
            sb.append(jSONObject);
            sb.append('\n');
            nbr.j(file2, sb.toString());
        } catch (IOException e) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"[push]", str4 + " — " + e.getMessage()});
            }
        } catch (SecurityException e2) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.e, new Object[]{"[push]", str4 + " — " + e2.getMessage()});
            }
        }
    }
}
