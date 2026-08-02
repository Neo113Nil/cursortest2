package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawTollPosts implements Serializable {
    private NativeObject nativeObject;
    private List<RawTollPost> tollPost;
    private boolean tollPost__is_initialized;

    public RawTollPosts(List<RawTollPost> list) {
        this.tollPost__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tollPost\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.tollPost = list;
        this.tollPost__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawTollPosts";
    }

    private native List<RawTollPost> getTollPost__Native();

    private native NativeObject init(List<RawTollPost> list);

    public synchronized List<RawTollPost> getTollPost() {
        try {
            if (!this.tollPost__is_initialized) {
                this.tollPost = getTollPost__Native();
                this.tollPost__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tollPost;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawTollPost.class, archive, getTollPost(), false);
            return;
        }
        List<RawTollPost> e = nzs.e(RawTollPost.class, archive, this.tollPost, false);
        this.tollPost = e;
        this.tollPost__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawTollPosts() {
        this.tollPost__is_initialized = false;
    }

    private RawTollPosts(NativeObject nativeObject) {
        this.tollPost__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
