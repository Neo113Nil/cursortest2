package com.yandex.runtime.view;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class FpsRenderCounts implements Serializable {
    private List<RenderCounts> counts;
    private boolean counts__is_initialized;
    private int maxFps;
    private boolean maxFps__is_initialized;
    private NativeObject nativeObject;

    public FpsRenderCounts(int i, List<RenderCounts> list) {
        this.maxFps__is_initialized = false;
        this.counts__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"counts\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, list);
        this.maxFps = i;
        this.maxFps__is_initialized = true;
        this.counts = list;
        this.counts__is_initialized = true;
    }

    private native List<RenderCounts> getCounts__Native();

    private native int getMaxFps__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::view::FpsRenderCounts";
    }

    private native NativeObject init(int i, List<RenderCounts> list);

    public synchronized List<RenderCounts> getCounts() {
        try {
            if (!this.counts__is_initialized) {
                this.counts = getCounts__Native();
                this.counts__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.counts;
    }

    public synchronized int getMaxFps() {
        try {
            if (!this.maxFps__is_initialized) {
                this.maxFps = getMaxFps__Native();
                this.maxFps__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.maxFps;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getMaxFps());
            nzs.m(RenderCounts.class, archive, getCounts(), false);
            return;
        }
        this.maxFps = archive.add(this.maxFps);
        this.maxFps__is_initialized = true;
        List<RenderCounts> e = nzs.e(RenderCounts.class, archive, this.counts, false);
        this.counts = e;
        this.counts__is_initialized = true;
        this.nativeObject = init(this.maxFps, e);
    }

    public FpsRenderCounts() {
        this.maxFps__is_initialized = false;
        this.counts__is_initialized = false;
    }

    private FpsRenderCounts(NativeObject nativeObject) {
        this.maxFps__is_initialized = false;
        this.counts__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
