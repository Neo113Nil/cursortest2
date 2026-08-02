package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.qv10;
import defpackage.unr0;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class UserScript {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<String> allowedOriginRules;
    private ContentWorld contentWorld;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;

    public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, Set<String> set) {
        this.allowedOriginRules = new HashSet();
        this.groupName = str;
        this.source = str2;
        this.injectionTime = userScriptInjectionTime;
        this.contentWorld = contentWorld == null ? ContentWorld.PAGE : contentWorld;
        this.allowedOriginRules = set == null ? new HashSet<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserScript.1
            {
                add("*");
            }
        } : set;
    }

    public static UserScript fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String) map.get("groupName"), (String) map.get("source"), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")), new HashSet((List) map.get("allowedOriginRules")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserScript userScript = (UserScript) obj;
        String str = this.groupName;
        String str2 = userScript.groupName;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        if (this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld)) {
            return this.allowedOriginRules.equals(userScript.allowedOriginRules);
        }
        return false;
    }

    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }

    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.groupName;
        return this.allowedOriginRules.hashCode() + ((this.contentWorld.hashCode() + ((this.injectionTime.hashCode() + unr0.b((str != null ? str.hashCode() : 0) * 31, 31, this.source)) * 31)) * 31);
    }

    public void setAllowedOriginRules(Set<String> set) {
        this.allowedOriginRules = set;
    }

    public void setContentWorld(ContentWorld contentWorld) {
        if (contentWorld == null) {
            contentWorld = ContentWorld.PAGE;
        }
        this.contentWorld = contentWorld;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
        this.injectionTime = userScriptInjectionTime;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserScript{groupName='");
        sb.append(this.groupName);
        sb.append("', source='");
        sb.append(this.source);
        sb.append("', injectionTime=");
        sb.append(this.injectionTime);
        sb.append(", contentWorld=");
        sb.append(this.contentWorld);
        sb.append(", allowedOriginRules=");
        return qv10.s(sb, this.allowedOriginRules, '}');
    }
}
