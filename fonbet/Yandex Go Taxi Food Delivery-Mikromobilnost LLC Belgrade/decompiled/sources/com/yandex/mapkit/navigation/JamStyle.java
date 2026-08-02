package com.yandex.mapkit.navigation;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class JamStyle implements Serializable {
    private List<JamTypeColor> colors;
    private boolean colors__is_initialized;
    private NativeObject nativeObject;

    public JamStyle(List<JamTypeColor> list) {
        this.colors__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"colors\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.colors = list;
        this.colors__is_initialized = true;
    }

    private native List<JamTypeColor> getColors__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::JamStyle";
    }

    private native NativeObject init(List<JamTypeColor> list);

    public synchronized List<JamTypeColor> getColors() {
        try {
            if (!this.colors__is_initialized) {
                this.colors = getColors__Native();
                this.colors__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.colors;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(JamTypeColor.class, archive, getColors(), false);
            return;
        }
        List<JamTypeColor> e = nzs.e(JamTypeColor.class, archive, this.colors, false);
        this.colors = e;
        this.colors__is_initialized = true;
        this.nativeObject = init(e);
    }

    public JamStyle() {
        this.colors__is_initialized = false;
    }

    private JamStyle(NativeObject nativeObject) {
        this.colors__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
