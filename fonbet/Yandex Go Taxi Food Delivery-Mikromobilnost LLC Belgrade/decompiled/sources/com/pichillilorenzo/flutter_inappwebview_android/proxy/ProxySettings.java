package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import defpackage.swf0;
import defpackage.twf0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class ProxySettings implements ISettings<twf0> {
    List<String> bypassRules = new ArrayList();
    List<String> directs = new ArrayList();
    List<ProxyRuleExt> proxyRules = new ArrayList();
    Boolean bypassSimpleHostnames = null;
    Boolean removeImplicitRules = null;
    Boolean reverseBypassEnabled = Boolean.FALSE;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(twf0 twf0Var) {
        Map<String, Object> map = toMap();
        ArrayList arrayList = new ArrayList();
        for (swf0 swf0Var : Collections.unmodifiableList(twf0Var.a)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", swf0Var.b);
            hashMap.put("schemeFilter", swf0Var.a);
            arrayList.add(hashMap);
        }
        map.put("bypassRules", Collections.unmodifiableList(twf0Var.b));
        map.put("proxyRules", arrayList);
        map.put("reverseBypassEnabled", Boolean.valueOf(twf0Var.c));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<twf0> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                switch (key) {
                    case "bypassSimpleHostnames":
                        this.bypassSimpleHostnames = (Boolean) value;
                        break;
                    case "proxyRules":
                        this.proxyRules = new ArrayList();
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            ProxyRuleExt fromMap = ProxyRuleExt.fromMap((Map) it.next());
                            if (fromMap != null) {
                                this.proxyRules.add(fromMap);
                            }
                        }
                        break;
                    case "reverseBypassEnabled":
                        this.reverseBypassEnabled = (Boolean) value;
                        break;
                    case "removeImplicitRules":
                        this.removeImplicitRules = (Boolean) value;
                        break;
                    case "bypassRules":
                        this.bypassRules = (List) value;
                        break;
                    case "directs":
                        this.directs = (List) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        ArrayList arrayList = new ArrayList();
        Iterator<ProxyRuleExt> it = this.proxyRules.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toMap());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bypassRules", this.bypassRules);
        hashMap.put("directs", this.directs);
        hashMap.put("proxyRules", arrayList);
        hashMap.put("bypassSimpleHostnames", this.bypassSimpleHostnames);
        hashMap.put("removeImplicitRules", this.removeImplicitRules);
        hashMap.put("reverseBypassEnabled", this.reverseBypassEnabled);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<twf0> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }
}
