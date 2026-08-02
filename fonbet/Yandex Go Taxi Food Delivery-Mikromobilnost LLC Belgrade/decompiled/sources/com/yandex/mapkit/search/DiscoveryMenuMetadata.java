package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class DiscoveryMenuMetadata implements BaseMetadata, Serializable {
    private MenuInfo menu;
    private boolean menu__is_initialized;
    private NativeObject nativeObject;

    public DiscoveryMenuMetadata(MenuInfo menuInfo) {
        this.menu__is_initialized = false;
        if (menuInfo == null) {
            ny61.g("Required field \"menu\" cannot be null");
            throw null;
        }
        this.nativeObject = init(menuInfo);
        this.menu = menuInfo;
        this.menu__is_initialized = true;
    }

    private native MenuInfo getMenu__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::DiscoveryMenuMetadata";
    }

    private native NativeObject init(MenuInfo menuInfo);

    public synchronized MenuInfo getMenu() {
        try {
            if (!this.menu__is_initialized) {
                this.menu = getMenu__Native();
                this.menu__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.menu;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMenu(), false, (Class<Archive>) MenuInfo.class);
            return;
        }
        MenuInfo menuInfo = (MenuInfo) archive.add((Archive) this.menu, false, (Class<Archive>) MenuInfo.class);
        this.menu = menuInfo;
        this.menu__is_initialized = true;
        this.nativeObject = init(menuInfo);
    }

    public DiscoveryMenuMetadata() {
        this.menu__is_initialized = false;
    }

    private DiscoveryMenuMetadata(NativeObject nativeObject) {
        this.menu__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
