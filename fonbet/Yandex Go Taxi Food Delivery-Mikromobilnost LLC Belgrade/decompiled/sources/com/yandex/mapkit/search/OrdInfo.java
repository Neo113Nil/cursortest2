package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class OrdInfo implements Serializable {
    private String clientId;
    private boolean clientId__is_initialized;
    private String clientName;
    private boolean clientName__is_initialized;
    private String clientTin;
    private boolean clientTin__is_initialized;
    private Type clientType;
    private boolean clientType__is_initialized;
    private NativeObject nativeObject;

    public enum Type {
        UNKNOWN,
        LEGAL,
        PHYSICAL,
        INDIVIDUAL,
        FOREIGN_LEGAL,
        FOREIGN_PHYSICAL
    }

    public OrdInfo(String str, String str2, Type type, String str3) {
        this.clientId__is_initialized = false;
        this.clientTin__is_initialized = false;
        this.clientType__is_initialized = false;
        this.clientName__is_initialized = false;
        this.nativeObject = init(str, str2, type, str3);
        this.clientId = str;
        this.clientId__is_initialized = true;
        this.clientTin = str2;
        this.clientTin__is_initialized = true;
        this.clientType = type;
        this.clientType__is_initialized = true;
        this.clientName = str3;
        this.clientName__is_initialized = true;
    }

    private native String getClientId__Native();

    private native String getClientName__Native();

    private native String getClientTin__Native();

    private native Type getClientType__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::OrdInfo";
    }

    private native NativeObject init(String str, String str2, Type type, String str3);

    public synchronized String getClientId() {
        try {
            if (!this.clientId__is_initialized) {
                this.clientId = getClientId__Native();
                this.clientId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.clientId;
    }

    public synchronized String getClientName() {
        try {
            if (!this.clientName__is_initialized) {
                this.clientName = getClientName__Native();
                this.clientName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.clientName;
    }

    public synchronized String getClientTin() {
        try {
            if (!this.clientTin__is_initialized) {
                this.clientTin = getClientTin__Native();
                this.clientTin__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.clientTin;
    }

    public synchronized Type getClientType() {
        try {
            if (!this.clientType__is_initialized) {
                this.clientType = getClientType__Native();
                this.clientType__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.clientType;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getClientId(), true);
            archive.add(getClientTin(), true);
            archive.add((Archive) getClientType(), true, (Class<Archive>) Type.class);
            archive.add(getClientName(), true);
            return;
        }
        this.clientId = archive.add(this.clientId, true);
        this.clientId__is_initialized = true;
        this.clientTin = archive.add(this.clientTin, true);
        this.clientTin__is_initialized = true;
        this.clientType = (Type) archive.add((Archive) this.clientType, true, (Class<Archive>) Type.class);
        this.clientType__is_initialized = true;
        String add = archive.add(this.clientName, true);
        this.clientName = add;
        this.clientName__is_initialized = true;
        this.nativeObject = init(this.clientId, this.clientTin, this.clientType, add);
    }

    public OrdInfo() {
        this.clientId__is_initialized = false;
        this.clientTin__is_initialized = false;
        this.clientType__is_initialized = false;
        this.clientName__is_initialized = false;
    }

    private OrdInfo(NativeObject nativeObject) {
        this.clientId__is_initialized = false;
        this.clientTin__is_initialized = false;
        this.clientType__is_initialized = false;
        this.clientName__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
