package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SuggestResponse implements Serializable {
    private List<SuggestGroup> groups;
    private boolean groups__is_initialized;
    private List<SuggestItem> items;
    private boolean items__is_initialized;
    private NativeObject nativeObject;
    private String reqid;
    private boolean reqid__is_initialized;

    public SuggestResponse(List<SuggestItem> list, String str, List<SuggestGroup> list2) {
        this.items__is_initialized = false;
        this.reqid__is_initialized = false;
        this.groups__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"items\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"groups\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, str, list2);
        this.items = list;
        this.items__is_initialized = true;
        this.reqid = str;
        this.reqid__is_initialized = true;
        this.groups = list2;
        this.groups__is_initialized = true;
    }

    private native List<SuggestGroup> getGroups__Native();

    private native List<SuggestItem> getItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SuggestResponse";
    }

    private native String getReqid__Native();

    private native NativeObject init(List<SuggestItem> list, String str, List<SuggestGroup> list2);

    private native NativeObject initPublic(List<SuggestItem> list);

    public synchronized List<SuggestGroup> getGroups() {
        try {
            if (!this.groups__is_initialized) {
                this.groups = getGroups__Native();
                this.groups__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.groups;
    }

    public synchronized List<SuggestItem> getItems() {
        try {
            if (!this.items__is_initialized) {
                this.items = getItems__Native();
                this.items__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.items;
    }

    public synchronized String getReqid() {
        try {
            if (!this.reqid__is_initialized) {
                this.reqid = getReqid__Native();
                this.reqid__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.reqid;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getItems(), false, (ArchivingHandler) new ClassHandler(SuggestItem.class));
            archive.add(getReqid(), true);
            nzs.m(SuggestGroup.class, archive, getGroups(), false);
            return;
        }
        this.items = nzs.e(SuggestItem.class, archive, this.items, false);
        this.items__is_initialized = true;
        this.reqid = archive.add(this.reqid, true);
        this.reqid__is_initialized = true;
        List<SuggestGroup> e = nzs.e(SuggestGroup.class, archive, this.groups, false);
        this.groups = e;
        this.groups__is_initialized = true;
        this.nativeObject = init(this.items, this.reqid, e);
    }

    public SuggestResponse() {
        this.items__is_initialized = false;
        this.reqid__is_initialized = false;
        this.groups__is_initialized = false;
    }

    private SuggestResponse(NativeObject nativeObject) {
        this.items__is_initialized = false;
        this.reqid__is_initialized = false;
        this.groups__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public SuggestResponse(List<SuggestItem> list) {
        this.items__is_initialized = false;
        this.reqid__is_initialized = false;
        this.groups__is_initialized = false;
        if (list != null) {
            this.nativeObject = initPublic(list);
            this.items = list;
            this.items__is_initialized = true;
            return;
        }
        ny61.g("Required field \"items\" cannot be null");
        throw null;
    }
}
