package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.hm91;
import defpackage.ih41;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public class WebMessageCompatExt {
    private Object data;
    private List<WebMessagePortCompatExt> ports;
    private int type;

    public WebMessageCompatExt(Object obj, int i, List<WebMessagePortCompatExt> list) {
        this.data = obj;
        this.type = i;
        this.ports = list;
    }

    public static WebMessageCompatExt fromMap(Map<String, Object> map) {
        ArrayList arrayList = null;
        if (map == null) {
            return null;
        }
        Object obj = map.get(Constants.KEY_DATA);
        Integer num = (Integer) map.get("type");
        List list = (List) map.get("ports");
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(WebMessagePortCompatExt.fromMap((Map) it.next()));
            }
        }
        return new WebMessageCompatExt(obj, num.intValue(), arrayList);
    }

    public static WebMessageCompatExt fromMapWebMessageCompat(ih41 ih41Var) {
        Object obj;
        if (hm91.d("WEB_MESSAGE_ARRAY_BUFFER") && ih41Var.d == 1) {
            ih41Var.a(1);
            obj = ih41Var.c;
            Objects.requireNonNull(obj);
        } else {
            ih41Var.a(0);
            obj = ih41Var.b;
        }
        return new WebMessageCompatExt(obj, ih41Var.d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebMessageCompatExt webMessageCompatExt = (WebMessageCompatExt) obj;
        if (this.type == webMessageCompatExt.type && Objects.equals(this.data, webMessageCompatExt.data)) {
            return Objects.equals(this.ports, webMessageCompatExt.ports);
        }
        return false;
    }

    public Object getData() {
        return this.data;
    }

    public List<WebMessagePortCompatExt> getPorts() {
        return this.ports;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        Object obj = this.data;
        int hashCode = (((obj != null ? obj.hashCode() : 0) * 31) + this.type) * 31;
        List<WebMessagePortCompatExt> list = this.ports;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setPorts(List<WebMessagePortCompatExt> list) {
        this.ports = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_DATA, this.data);
        hashMap.put("type", Integer.valueOf(this.type));
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebMessageCompatExt{data=");
        sb.append(this.data);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", ports=");
        return unr0.t(sb, this.ports, '}');
    }
}
