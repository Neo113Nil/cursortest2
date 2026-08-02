package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Disclaimer implements Serializable {
    private NativeObject nativeObject;
    private String secondary;
    private boolean secondary__is_initialized;
    private String text;
    private boolean text__is_initialized;

    public Disclaimer(String str, String str2) {
        this.text__is_initialized = false;
        this.secondary__is_initialized = false;
        this.nativeObject = init(str, str2);
        this.text = str;
        this.text__is_initialized = true;
        this.secondary = str2;
        this.secondary__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Disclaimer";
    }

    private native String getSecondary__Native();

    private native String getText__Native();

    private native NativeObject init(String str, String str2);

    public synchronized String getSecondary() {
        try {
            if (!this.secondary__is_initialized) {
                this.secondary = getSecondary__Native();
                this.secondary__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.secondary;
    }

    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getText(), true);
            archive.add(getSecondary(), true);
            return;
        }
        this.text = archive.add(this.text, true);
        this.text__is_initialized = true;
        String add = archive.add(this.secondary, true);
        this.secondary = add;
        this.secondary__is_initialized = true;
        this.nativeObject = init(this.text, add);
    }

    public Disclaimer() {
        this.text__is_initialized = false;
        this.secondary__is_initialized = false;
    }

    private Disclaimer(NativeObject nativeObject) {
        this.text__is_initialized = false;
        this.secondary__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
