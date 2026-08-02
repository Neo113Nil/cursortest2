package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Goods1xObjectMetadata implements BaseMetadata, Serializable {
    private List<Goods> goods;
    private boolean goods__is_initialized;
    private NativeObject nativeObject;

    public Goods1xObjectMetadata(List<Goods> list) {
        this.goods__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"goods\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.goods = list;
        this.goods__is_initialized = true;
    }

    private native List<Goods> getGoods__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Goods1xObjectMetadata";
    }

    private native NativeObject init(List<Goods> list);

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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Goods.class, archive, getGoods(), false);
            return;
        }
        List<Goods> e = nzs.e(Goods.class, archive, this.goods, false);
        this.goods = e;
        this.goods__is_initialized = true;
        this.nativeObject = init(e);
    }

    public Goods1xObjectMetadata() {
        this.goods__is_initialized = false;
    }

    private Goods1xObjectMetadata(NativeObject nativeObject) {
        this.goods__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
