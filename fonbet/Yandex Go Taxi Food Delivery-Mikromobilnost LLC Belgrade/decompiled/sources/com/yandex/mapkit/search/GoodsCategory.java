package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class GoodsCategory implements Serializable {
    private List<Goods> goods;
    private boolean goods__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;

    public GoodsCategory(String str, List<Goods> list) {
        this.name__is_initialized = false;
        this.goods__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"goods\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.name = str;
        this.name__is_initialized = true;
        this.goods = list;
        this.goods__is_initialized = true;
    }

    private native List<Goods> getGoods__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::GoodsCategory";
    }

    private native NativeObject init(String str, List<Goods> list);

    public synchronized List<Goods> getGoods() {
        try {
            if (!this.goods__is_initialized) {
                this.goods = getGoods__Native();
                this.goods__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.goods;
    }

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), true);
            nzs.m(Goods.class, archive, getGoods(), false);
            return;
        }
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        List<Goods> e = nzs.e(Goods.class, archive, this.goods, false);
        this.goods = e;
        this.goods__is_initialized = true;
        this.nativeObject = init(this.name, e);
    }

    public GoodsCategory() {
        this.name__is_initialized = false;
        this.goods__is_initialized = false;
    }

    private GoodsCategory(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.goods__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
