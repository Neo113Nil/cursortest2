package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class CustomGoal implements Serializable {
    private String goal;
    private String type;

    public CustomGoal(String str, String str2) {
        this.type = str;
        this.goal = str2;
    }

    public String getGoal() {
        return this.goal;
    }

    public String getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = archive.add(this.type, true);
        this.goal = archive.add(this.goal, true);
    }

    public CustomGoal() {
    }
}
