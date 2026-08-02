package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ContactInfo implements Serializable {
    private String address;
    private boolean address__is_initialized;
    private String companyName;
    private boolean companyName__is_initialized;
    private String email;
    private boolean email__is_initialized;
    private String hours;
    private boolean hours__is_initialized;
    private NativeObject nativeObject;
    private String phone;
    private boolean phone__is_initialized;

    public ContactInfo(String str, String str2, String str3, String str4, String str5) {
        this.companyName__is_initialized = false;
        this.address__is_initialized = false;
        this.phone__is_initialized = false;
        this.email__is_initialized = false;
        this.hours__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"companyName\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, str4, str5);
        this.companyName = str;
        this.companyName__is_initialized = true;
        this.address = str2;
        this.address__is_initialized = true;
        this.phone = str3;
        this.phone__is_initialized = true;
        this.email = str4;
        this.email__is_initialized = true;
        this.hours = str5;
        this.hours__is_initialized = true;
    }

    private native String getAddress__Native();

    private native String getCompanyName__Native();

    private native String getEmail__Native();

    private native String getHours__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ContactInfo";
    }

    private native String getPhone__Native();

    private native NativeObject init(String str, String str2, String str3, String str4, String str5);

    public synchronized String getAddress() {
        try {
            if (!this.address__is_initialized) {
                this.address = getAddress__Native();
                this.address__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.address;
    }

    public synchronized String getCompanyName() {
        try {
            if (!this.companyName__is_initialized) {
                this.companyName = getCompanyName__Native();
                this.companyName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.companyName;
    }

    public synchronized String getEmail() {
        try {
            if (!this.email__is_initialized) {
                this.email = getEmail__Native();
                this.email__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.email;
    }

    public synchronized String getHours() {
        try {
            if (!this.hours__is_initialized) {
                this.hours = getHours__Native();
                this.hours__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hours;
    }

    public synchronized String getPhone() {
        try {
            if (!this.phone__is_initialized) {
                this.phone = getPhone__Native();
                this.phone__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.phone;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCompanyName(), false);
            archive.add(getAddress(), true);
            archive.add(getPhone(), true);
            archive.add(getEmail(), true);
            archive.add(getHours(), true);
            return;
        }
        this.companyName = archive.add(this.companyName, false);
        this.companyName__is_initialized = true;
        this.address = archive.add(this.address, true);
        this.address__is_initialized = true;
        this.phone = archive.add(this.phone, true);
        this.phone__is_initialized = true;
        this.email = archive.add(this.email, true);
        this.email__is_initialized = true;
        String add = archive.add(this.hours, true);
        this.hours = add;
        this.hours__is_initialized = true;
        this.nativeObject = init(this.companyName, this.address, this.phone, this.email, add);
    }

    public ContactInfo() {
        this.companyName__is_initialized = false;
        this.address__is_initialized = false;
        this.phone__is_initialized = false;
        this.email__is_initialized = false;
        this.hours__is_initialized = false;
    }

    private ContactInfo(NativeObject nativeObject) {
        this.companyName__is_initialized = false;
        this.address__is_initialized = false;
        this.phone__is_initialized = false;
        this.email__is_initialized = false;
        this.hours__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
