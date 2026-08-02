package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Properties implements Serializable {
    private List<Item> items;
    private boolean items__is_initialized;
    private NativeObject nativeObject;

    public Properties(List<Item> list) {
        this.items__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"items\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.items = list;
        this.items__is_initialized = true;
    }

    private native List<Item> getItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Properties";
    }

    private native NativeObject init(List<Item> list);

    public synchronized List<Item> getItems() {
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Item.class, archive, getItems(), false);
            return;
        }
        List<Item> e = nzs.e(Item.class, archive, this.items, false);
        this.items = e;
        this.items__is_initialized = true;
        this.nativeObject = init(e);
    }

    public static class Item implements Serializable {
        private String key;
        private String value;

        public Item(String str, String str2) {
            if (str == null) {
                ny61.g("Required field \"key\" cannot be null");
                throw null;
            }
            if (str2 == null) {
                ny61.g("Required field \"value\" cannot be null");
                throw null;
            }
            this.key = str;
            this.value = str2;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.key = archive.add(this.key, false);
            this.value = archive.add(this.value, false);
        }

        public Item() {
        }
    }

    public Properties() {
        this.items__is_initialized = false;
    }

    private Properties(NativeObject nativeObject) {
        this.items__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
