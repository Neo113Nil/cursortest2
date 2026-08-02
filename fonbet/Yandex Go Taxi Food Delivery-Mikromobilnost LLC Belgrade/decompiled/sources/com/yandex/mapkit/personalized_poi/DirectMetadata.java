package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class DirectMetadata implements BaseMetadata, Serializable {
    private List<String> blockShowUrls;
    private boolean blockShowUrls__is_initialized;
    private NativeObject nativeObject;
    private String orgClickUrl;
    private boolean orgClickUrl__is_initialized;
    private String orgShowUrl;
    private boolean orgShowUrl__is_initialized;
    private String orgYclid;
    private boolean orgYclid__is_initialized;

    public DirectMetadata(List<String> list, String str, String str2, String str3) {
        this.blockShowUrls__is_initialized = false;
        this.orgShowUrl__is_initialized = false;
        this.orgClickUrl__is_initialized = false;
        this.orgYclid__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"blockShowUrls\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, str, str2, str3);
        this.blockShowUrls = list;
        this.blockShowUrls__is_initialized = true;
        this.orgShowUrl = str;
        this.orgShowUrl__is_initialized = true;
        this.orgClickUrl = str2;
        this.orgClickUrl__is_initialized = true;
        this.orgYclid = str3;
        this.orgYclid__is_initialized = true;
    }

    private native List<String> getBlockShowUrls__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::DirectMetadata";
    }

    private native String getOrgClickUrl__Native();

    private native String getOrgShowUrl__Native();

    private native String getOrgYclid__Native();

    private native NativeObject init(List<String> list, String str, String str2, String str3);

    public synchronized List<String> getBlockShowUrls() {
        try {
            if (!this.blockShowUrls__is_initialized) {
                this.blockShowUrls = getBlockShowUrls__Native();
                this.blockShowUrls__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.blockShowUrls;
    }

    public synchronized String getOrgClickUrl() {
        try {
            if (!this.orgClickUrl__is_initialized) {
                this.orgClickUrl = getOrgClickUrl__Native();
                this.orgClickUrl__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.orgClickUrl;
    }

    public synchronized String getOrgShowUrl() {
        try {
            if (!this.orgShowUrl__is_initialized) {
                this.orgShowUrl = getOrgShowUrl__Native();
                this.orgShowUrl__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.orgShowUrl;
    }

    public synchronized String getOrgYclid() {
        try {
            if (!this.orgYclid__is_initialized) {
                this.orgYclid = getOrgYclid__Native();
                this.orgYclid__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.orgYclid;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getBlockShowUrls(), false, (ArchivingHandler) new StringHandler());
            archive.add(getOrgShowUrl(), true);
            archive.add(getOrgClickUrl(), true);
            archive.add(getOrgYclid(), true);
            return;
        }
        this.blockShowUrls = nnm.o(archive, this.blockShowUrls, false);
        this.blockShowUrls__is_initialized = true;
        this.orgShowUrl = archive.add(this.orgShowUrl, true);
        this.orgShowUrl__is_initialized = true;
        this.orgClickUrl = archive.add(this.orgClickUrl, true);
        this.orgClickUrl__is_initialized = true;
        String add = archive.add(this.orgYclid, true);
        this.orgYclid = add;
        this.orgYclid__is_initialized = true;
        this.nativeObject = init(this.blockShowUrls, this.orgShowUrl, this.orgClickUrl, add);
    }

    public DirectMetadata() {
        this.blockShowUrls__is_initialized = false;
        this.orgShowUrl__is_initialized = false;
        this.orgClickUrl__is_initialized = false;
        this.orgYclid__is_initialized = false;
    }

    private DirectMetadata(NativeObject nativeObject) {
        this.blockShowUrls__is_initialized = false;
        this.orgShowUrl__is_initialized = false;
        this.orgClickUrl__is_initialized = false;
        this.orgYclid__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
