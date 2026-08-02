package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class SearchObjectMetadata implements BaseMetadata, Serializable {
    private String logId;
    private boolean logId__is_initialized;
    private NativeObject nativeObject;
    private String reqId;
    private boolean reqId__is_initialized;

    public SearchObjectMetadata(String str, String str2) {
        this.logId__is_initialized = false;
        this.reqId__is_initialized = false;
        this.nativeObject = init(str, str2);
        this.logId = str;
        this.logId__is_initialized = true;
        this.reqId = str2;
        this.reqId__is_initialized = true;
    }

    private native String getLogId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SearchObjectMetadata";
    }

    private native String getReqId__Native();

    private native NativeObject init(String str, String str2);

    public synchronized String getLogId() {
        try {
            if (!this.logId__is_initialized) {
                this.logId = getLogId__Native();
                this.logId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.logId;
    }

    public synchronized String getReqId() {
        try {
            if (!this.reqId__is_initialized) {
                this.reqId = getReqId__Native();
                this.reqId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.reqId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLogId(), true);
            archive.add(getReqId(), true);
            return;
        }
        this.logId = archive.add(this.logId, true);
        this.logId__is_initialized = true;
        String add = archive.add(this.reqId, true);
        this.reqId = add;
        this.reqId__is_initialized = true;
        this.nativeObject = init(this.logId, add);
    }

    public SearchObjectMetadata() {
        this.logId__is_initialized = false;
        this.reqId__is_initialized = false;
    }

    private SearchObjectMetadata(NativeObject nativeObject) {
        this.logId__is_initialized = false;
        this.reqId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
