package defpackage;

import com.yandex.xplat.common.JSONItemKind;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class iho {
    public final String a;
    public final LinkedHashMap b;

    public iho(String str, lhn lhnVar) {
        this.a = str;
        lhnVar.c("event_name", str);
        this.b = lhnVar.a;
    }

    public static /* synthetic */ iho b(iho ihoVar, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        return ihoVar.a(str, null);
    }

    public final iho a(String str, lhn lhnVar) {
        String j = b64.j(this.a, "_failure");
        LinkedHashMap linkedHashMap = this.b;
        y3x y3xVar = (y3x) linkedHashMap.get("eventus_id");
        String str2 = null;
        Long valueOf = (y3xVar != null && y3xVar.a == JSONItemKind.integer) ? Long.valueOf(((t6w) y3xVar).b) : null;
        y3x y3xVar2 = (y3x) linkedHashMap.get(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        if (y3xVar2 != null) {
            ktu0 ktu0Var = y3xVar2.a == JSONItemKind.string ? (ktu0) y3xVar2 : null;
            if (ktu0Var != null) {
                str2 = ktu0Var.b;
            }
        }
        if (valueOf == null) {
            return gly0.m(j);
        }
        lhn lhnVar2 = new lhn((Map) linkedHashMap);
        lhnVar2.b(valueOf.longValue(), "origin_eventus_id");
        lhnVar2.a.put("error", new u96(true));
        if (str != null) {
            lhnVar2.c(CRLReasonCodeExtension.REASON, str);
        }
        if (lhnVar != null) {
            lhnVar2 = lhnVar2.a(lhnVar);
        }
        if (str2 != null) {
            lhnVar2.c(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Неуспешно: ".concat(str2));
        }
        return gly0.o(j, lhnVar2);
    }

    public final void c() {
        o450 o450Var = jho.a;
        jho.c.getClass();
        new avn();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            Serializable b = mbb1.b((y3x) value);
            if (b != null) {
                linkedHashMap.put(str, b);
            }
        }
        jho.a.getClass();
        linkedHashMap.put(ClidProvider.TIMESTAMP, Long.valueOf(o450.a()));
        linkedHashMap.put("version", 1);
    }

    public final iho d(lhn lhnVar) {
        String j = b64.j(this.a, "_success");
        LinkedHashMap linkedHashMap = this.b;
        y3x y3xVar = (y3x) linkedHashMap.get("eventus_id");
        String str = null;
        Long valueOf = (y3xVar != null && y3xVar.a == JSONItemKind.integer) ? Long.valueOf(((t6w) y3xVar).b) : null;
        y3x y3xVar2 = (y3x) linkedHashMap.get(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        if (y3xVar2 != null) {
            ktu0 ktu0Var = y3xVar2.a == JSONItemKind.string ? (ktu0) y3xVar2 : null;
            if (ktu0Var != null) {
                str = ktu0Var.b;
            }
        }
        if (valueOf == null) {
            return gly0.m(j);
        }
        lhn lhnVar2 = new lhn((Map) linkedHashMap);
        lhnVar2.b(valueOf.longValue(), "origin_eventus_id");
        if (lhnVar != null) {
            lhnVar2 = lhnVar2.a(lhnVar);
        }
        if (str != null) {
            lhnVar2.c(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешно: ".concat(str));
        }
        return gly0.o(j, lhnVar2);
    }
}
