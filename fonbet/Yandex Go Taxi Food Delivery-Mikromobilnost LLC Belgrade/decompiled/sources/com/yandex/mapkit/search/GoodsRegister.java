package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class GoodsRegister implements Serializable {
    private List<GoodsCategory> categories;
    private boolean categories__is_initialized;
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;

    public GoodsRegister(List<GoodsCategory> list, List<String> list2) {
        this.categories__is_initialized = false;
        this.tags__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"categories\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.categories = list;
        this.categories__is_initialized = true;
        this.tags = list2;
        this.tags__is_initialized = true;
    }

    private native List<GoodsCategory> getCategories__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::GoodsRegister";
    }

    private native List<String> getTags__Native();

    private native NativeObject init(List<GoodsCategory> list, List<String> list2);

    public synchronized List<GoodsCategory> getCategories() {
        try {
            if (!this.categories__is_initialized) {
                this.categories = getCategories__Native();
                this.categories__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.categories;
    }

    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tags;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getCategories(), false, (ArchivingHandler) new ClassHandler(GoodsCategory.class));
            nzs.l(archive, getTags(), false);
            return;
        }
        this.categories = nzs.e(GoodsCategory.class, archive, this.categories, false);
        this.categories__is_initialized = true;
        List<String> o = nnm.o(archive, this.tags, false);
        this.tags = o;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.categories, o);
    }

    public GoodsRegister() {
        this.categories__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private GoodsRegister(NativeObject nativeObject) {
        this.categories__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
