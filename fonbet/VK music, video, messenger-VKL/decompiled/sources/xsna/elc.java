package xsna;

import android.os.Build;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.api.sdk.utils.clientagent.model.App;
import com.vk.api.sdk.utils.clientagent.model.ClientAgentKey;
import com.vk.api.sdk.utils.clientagent.model.From;
import com.vk.api.sdk.utils.clientagent.model.OS;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: ClientAgent.kt */
/* loaded from: classes.dex */
public final class elc {
    public final bpn0 a;

    /* compiled from: ClientAgent.kt */
    public static final class a {
        public final LinkedHashMap a;

        public a(App app2, String str, String str2, OS os, From from) {
            String str3 = Build.VERSION.RELEASE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.a = linkedHashMap;
            if (drm0.N(str)) {
                throw new IllegalArgumentException("ClientAgent: version should not be blank.");
            }
            if (drm0.N(str2)) {
                throw new IllegalArgumentException("ClientAgent: buildId should not be blank.");
            }
            if (drm0.N(str3)) {
                throw new IllegalArgumentException("ClientAgent: osVersion should not be blank.");
            }
            linkedHashMap.put(ClientAgentKey.CLIENT_AGENT_VERSION, 1);
            linkedHashMap.put(ClientAgentKey.APP, app2);
            linkedHashMap.put(ClientAgentKey.VERSION, str);
            linkedHashMap.put(ClientAgentKey.BUILD_ID, str2);
            linkedHashMap.put(ClientAgentKey.OS, os);
            linkedHashMap.put(ClientAgentKey.OS_VERSION, str3);
            linkedHashMap.put(ClientAgentKey.FROM, from);
        }

        public final elc a(String str) {
            List<Byte> list;
            ClientAgentKey clientAgentKey = ClientAgentKey.SIGN;
            ClientAgentKey clientAgentKey2 = ClientAgentKey.APP;
            LinkedHashMap linkedHashMap = this.a;
            String str2 = ((App) linkedHashMap.get(clientAgentKey2)).h() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ((String) linkedHashMap.get(ClientAgentKey.VERSION)) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ((String) linkedHashMap.get(ClientAgentKey.BUILD_ID));
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = emb.b;
            mac.init(new SecretKeySpec(str.getBytes(charset), "HmacSHA256"));
            byte[] doFinal = mac.doFinal(str2.getBytes(charset));
            if (4 >= doFinal.length) {
                list = rl3.r0(doFinal);
            } else {
                ArrayList arrayList = new ArrayList(4);
                int i = 0;
                for (byte b : doFinal) {
                    arrayList.add(Byte.valueOf(b));
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
                list = arrayList;
            }
            linkedHashMap.put(clientAgentKey, j5g.g0(list, "", null, null, 0, new s6b(1), 30));
            return new elc(linkedHashMap);
        }
    }

    public elc(LinkedHashMap linkedHashMap) {
        Object obj = linkedHashMap.get(ClientAgentKey.SIGN);
        if ((obj instanceof String ? (String) obj : null) == null) {
            throw new IllegalStateException("ClientAgent: s field is missing");
        }
        Object obj2 = linkedHashMap.get(ClientAgentKey.APP);
        if ((obj2 instanceof App ? (App) obj2 : null) == null) {
            throw new IllegalStateException("ClientAgent: app field is missing");
        }
        Object obj3 = linkedHashMap.get(ClientAgentKey.VERSION);
        if ((obj3 instanceof String ? (String) obj3 : null) == null) {
            throw new IllegalStateException("ClientAgent: v field is missing");
        }
        Object obj4 = linkedHashMap.get(ClientAgentKey.BUILD_ID);
        if ((obj4 instanceof String ? (String) obj4 : null) == null) {
            throw new IllegalStateException("ClientAgent: b field is missing");
        }
        Object obj5 = linkedHashMap.get(ClientAgentKey.OS);
        if ((obj5 instanceof OS ? (OS) obj5 : null) == null) {
            throw new IllegalStateException("ClientAgent: os field is missing");
        }
        Object obj6 = linkedHashMap.get(ClientAgentKey.OS_VERSION);
        if ((obj6 instanceof String ? (String) obj6 : null) == null) {
            throw new IllegalStateException("ClientAgent: os-v field is missing");
        }
        Object obj7 = linkedHashMap.get(ClientAgentKey.FROM);
        if ((obj7 instanceof From ? (From) obj7 : null) == null) {
            throw new IllegalStateException("ClientAgent: from is missing");
        }
        linkedHashMap.get(ClientAgentKey.DISTRIBUTOR);
        linkedHashMap.get(ClientAgentKey.MODEL);
        linkedHashMap.get(ClientAgentKey.SDK);
        linkedHashMap.get(ClientAgentKey.NET);
        linkedHashMap.get(ClientAgentKey.ARCH);
        this.a = new bpn0(new kb8(linkedHashMap, 2));
    }
}
