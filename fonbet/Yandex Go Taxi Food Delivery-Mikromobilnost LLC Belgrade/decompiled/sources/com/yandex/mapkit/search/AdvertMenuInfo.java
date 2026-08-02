package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class AdvertMenuInfo implements Serializable {
    private List<AdvertMenuItem> menuItems;
    private boolean menuItems__is_initialized;
    private NativeObject nativeObject;

    public AdvertMenuInfo(List<AdvertMenuItem> list) {
        this.menuItems__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"menuItems\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.menuItems = list;
        this.menuItems__is_initialized = true;
    }

    private native List<AdvertMenuItem> getMenuItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::AdvertMenuInfo";
    }

    private native NativeObject init(List<AdvertMenuItem> list);

    public synchronized List<AdvertMenuItem> getMenuItems() {
        try {
            if (!this.menuItems__is_initialized) {
                this.menuItems = getMenuItems__Native();
                this.menuItems__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.menuItems;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(AdvertMenuItem.class, archive, getMenuItems(), false);
            return;
        }
        List<AdvertMenuItem> e = nzs.e(AdvertMenuItem.class, archive, this.menuItems, false);
        this.menuItems = e;
        this.menuItems__is_initialized = true;
        this.nativeObject = init(e);
    }

    public AdvertMenuInfo() {
        this.menuItems__is_initialized = false;
    }

    private AdvertMenuInfo(NativeObject nativeObject) {
        this.menuItems__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
