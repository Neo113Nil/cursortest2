package com.yandex.runtime.view;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RenderCounts implements Serializable {
    private NativeObject nativeObject;
    private int renderCount;
    private boolean renderCount__is_initialized;
    private int renderStateCount;
    private boolean renderStateCount__is_initialized;

    public RenderCounts(int i, int i2) {
        this.renderCount__is_initialized = false;
        this.renderStateCount__is_initialized = false;
        this.nativeObject = init(i, i2);
        this.renderCount = i;
        this.renderCount__is_initialized = true;
        this.renderStateCount = i2;
        this.renderStateCount__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::runtime::view::RenderCounts";
    }

    private native int getRenderCount__Native();

    private native int getRenderStateCount__Native();

    private native NativeObject init(int i, int i2);

    public synchronized int getRenderCount() {
        try {
            if (!this.renderCount__is_initialized) {
                this.renderCount = getRenderCount__Native();
                this.renderCount__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.renderCount;
    }

    public synchronized int getRenderStateCount() {
        try {
            if (!this.renderStateCount__is_initialized) {
                this.renderStateCount = getRenderStateCount__Native();
                this.renderStateCount__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.renderStateCount;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getRenderCount());
            archive.add(getRenderStateCount());
            return;
        }
        this.renderCount = archive.add(this.renderCount);
        this.renderCount__is_initialized = true;
        int add = archive.add(this.renderStateCount);
        this.renderStateCount = add;
        this.renderStateCount__is_initialized = true;
        this.nativeObject = init(this.renderCount, add);
    }

    public RenderCounts() {
        this.renderCount__is_initialized = false;
        this.renderStateCount__is_initialized = false;
    }

    private RenderCounts(NativeObject nativeObject) {
        this.renderCount__is_initialized = false;
        this.renderStateCount__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
