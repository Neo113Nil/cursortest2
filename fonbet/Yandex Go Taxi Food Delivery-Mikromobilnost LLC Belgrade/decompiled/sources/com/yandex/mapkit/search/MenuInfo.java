package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class MenuInfo implements Serializable {
    private List<MenuItem> menuItems;
    private boolean menuItems__is_initialized;
    private NativeObject nativeObject;

    public MenuInfo(List<MenuItem> list) {
        this.menuItems__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"menuItems\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.menuItems = list;
        this.menuItems__is_initialized = true;
    }

    private native List<MenuItem> getMenuItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::MenuInfo";
    }

    private native NativeObject init(List<MenuItem> list);

    public synchronized List<MenuItem> getMenuItems() {
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
            nzs.m(MenuItem.class, archive, getMenuItems(), false);
            return;
        }
        List<MenuItem> e = nzs.e(MenuItem.class, archive, this.menuItems, false);
        this.menuItems = e;
        this.menuItems__is_initialized = true;
        this.nativeObject = init(e);
    }

    public MenuInfo() {
        this.menuItems__is_initialized = false;
    }

    private MenuInfo(NativeObject nativeObject) {
        this.menuItems__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
