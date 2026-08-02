package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class p0g0 {
    public final pho a;

    public p0g0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, String str3, List list) {
        HashMap hashMap = new HashMap();
        hashMap.put("tags_list", list);
        if (str != null) {
            hashMap.put("push_id", str);
        }
        if (str2 != null) {
            hashMap.put("type", str2);
        }
        if (str3 != null) {
            hashMap.put("transit_id", str3);
        }
        this.a.a("Push.AllTagsDisabled.Info", hashMap, 1, new HashMap());
    }

    public final void b(String str, String str2, String str3, List list) {
        HashMap hashMap = new HashMap();
        hashMap.put("tags_list", list);
        if (str != null) {
            hashMap.put("push_id", str);
        }
        if (str2 != null) {
            hashMap.put("type", str2);
        }
        if (str3 != null) {
            hashMap.put("transit_id", str3);
        }
        this.a.a("Push.ChannelUnknownTags.Error", hashMap, 1, new HashMap());
    }
}
