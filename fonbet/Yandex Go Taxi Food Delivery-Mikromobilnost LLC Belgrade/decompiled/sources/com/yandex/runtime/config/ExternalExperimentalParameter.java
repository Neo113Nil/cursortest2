package com.yandex.runtime.config;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes8.dex */
public class ExternalExperimentalParameter implements Serializable {
    private NativeObject nativeObject;
    private String parameter;
    private boolean parameter__is_initialized;
    private String serviceId;
    private boolean serviceId__is_initialized;
    private String value;
    private boolean value__is_initialized;

    public ExternalExperimentalParameter(String str, String str2, String str3) {
        this.serviceId__is_initialized = false;
        this.parameter__is_initialized = false;
        this.value__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"serviceId\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"parameter\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3);
        this.serviceId = str;
        this.serviceId__is_initialized = true;
        this.parameter = str2;
        this.parameter__is_initialized = true;
        this.value = str3;
        this.value__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::runtime::config::ExternalExperimentalParameter";
    }

    private native String getParameter__Native();

    private native String getServiceId__Native();

    private native String getValue__Native();

    private native NativeObject init(String str, String str2, String str3);

    public synchronized String getParameter() {
        try {
            if (!this.parameter__is_initialized) {
                this.parameter = getParameter__Native();
                this.parameter__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.parameter;
    }

    public synchronized String getServiceId() {
        try {
            if (!this.serviceId__is_initialized) {
                this.serviceId = getServiceId__Native();
                this.serviceId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.serviceId;
    }

    public synchronized String getValue() {
        try {
            if (!this.value__is_initialized) {
                this.value = getValue__Native();
                this.value__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getServiceId(), false);
            archive.add(getParameter(), false);
            archive.add(getValue(), true);
            return;
        }
        this.serviceId = archive.add(this.serviceId, false);
        this.serviceId__is_initialized = true;
        this.parameter = archive.add(this.parameter, false);
        this.parameter__is_initialized = true;
        String add = archive.add(this.value, true);
        this.value = add;
        this.value__is_initialized = true;
        this.nativeObject = init(this.serviceId, this.parameter, add);
    }

    public ExternalExperimentalParameter() {
        this.serviceId__is_initialized = false;
        this.parameter__is_initialized = false;
        this.value__is_initialized = false;
    }

    private ExternalExperimentalParameter(NativeObject nativeObject) {
        this.serviceId__is_initialized = false;
        this.parameter__is_initialized = false;
        this.value__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
