package com.yandex.div.core.view2.errors;

import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: VariableMonitorView.kt */
/* loaded from: classes7.dex */
final class VariableModel {
    private final String name;
    private final String path;
    private final String type;
    private final String value;

    public VariableModel(String str, String str2, String str3, String str4) {
        this.name = str;
        this.path = str2;
        this.type = str3;
        this.value = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableModel)) {
            return false;
        }
        VariableModel variableModel = (VariableModel) obj;
        return epx.f(this.name, variableModel.name) && epx.f(this.path, variableModel.path) && epx.f(this.type, variableModel.type) && epx.f(this.value, variableModel.value);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.path), 31, this.type);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VariableModel(name=");
        sb.append(this.name);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }
}
