package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ToponymPhrase implements Serializable {
    private Integer actionProximity;
    private boolean actionProximity__is_initialized;
    private NativeObject nativeObject;
    private String text;
    private boolean text__is_initialized;

    public ToponymPhrase(String str, Integer num) {
        this.text__is_initialized = false;
        this.actionProximity__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, num);
        this.text = str;
        this.text__is_initialized = true;
        this.actionProximity = num;
        this.actionProximity__is_initialized = true;
    }

    private native Integer getActionProximity__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::ToponymPhrase";
    }

    private native String getText__Native();

    private native NativeObject init(String str, Integer num);

    public synchronized Integer getActionProximity() {
        try {
            if (!this.actionProximity__is_initialized) {
                this.actionProximity = getActionProximity__Native();
                this.actionProximity__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.actionProximity;
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
            archive.add(getText(), false);
            archive.add(getActionProximity(), true);
            return;
        }
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        Integer add = archive.add(this.actionProximity, true);
        this.actionProximity = add;
        this.actionProximity__is_initialized = true;
        this.nativeObject = init(this.text, add);
    }

    public ToponymPhrase() {
        this.text__is_initialized = false;
        this.actionProximity__is_initialized = false;
    }

    private ToponymPhrase(NativeObject nativeObject) {
        this.text__is_initialized = false;
        this.actionProximity__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
