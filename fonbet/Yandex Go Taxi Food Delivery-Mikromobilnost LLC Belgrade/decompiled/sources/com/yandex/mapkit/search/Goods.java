package com.yandex.mapkit.search;

import com.yandex.mapkit.Money;
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
public class Goods implements Serializable {
    private String description;
    private boolean description__is_initialized;
    private List<PhotoLink> links;
    private boolean links__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private Money price;
    private boolean price__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String unit;
    private boolean unit__is_initialized;

    public Goods(String str, String str2, Money money, String str3, List<PhotoLink> list, List<String> list2) {
        this.name__is_initialized = false;
        this.description__is_initialized = false;
        this.price__is_initialized = false;
        this.unit__is_initialized = false;
        this.links__is_initialized = false;
        this.tags__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"links\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, money, str3, list, list2);
        this.name = str;
        this.name__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.price = money;
        this.price__is_initialized = true;
        this.unit = str3;
        this.unit__is_initialized = true;
        this.links = list;
        this.links__is_initialized = true;
        this.tags = list2;
        this.tags__is_initialized = true;
    }

    private native String getDescription__Native();

    private native List<PhotoLink> getLinks__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Goods";
    }

    private native Money getPrice__Native();

    private native List<String> getTags__Native();

    private native String getUnit__Native();

    private native NativeObject init(String str, String str2, Money money, String str3, List<PhotoLink> list, List<String> list2);

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
    }

    public synchronized List<PhotoLink> getLinks() {
        try {
            if (!this.links__is_initialized) {
                this.links = getLinks__Native();
                this.links__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.links;
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

    public synchronized Money getPrice() {
        try {
            if (!this.price__is_initialized) {
                this.price = getPrice__Native();
                this.price__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.price;
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

    public synchronized String getUnit() {
        try {
            if (!this.unit__is_initialized) {
                this.unit = getUnit__Native();
                this.unit__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.unit;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), false);
            archive.add(getDescription(), true);
            archive.add((Archive) getPrice(), true, (Class<Archive>) Money.class);
            archive.add(getUnit(), true);
            archive.add((List) getLinks(), false, (ArchivingHandler) new ClassHandler(PhotoLink.class));
            nzs.l(archive, getTags(), false);
            return;
        }
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.price = (Money) archive.add((Archive) this.price, true, (Class<Archive>) Money.class);
        this.price__is_initialized = true;
        this.unit = archive.add(this.unit, true);
        this.unit__is_initialized = true;
        this.links = nzs.e(PhotoLink.class, archive, this.links, false);
        this.links__is_initialized = true;
        List<String> o = nnm.o(archive, this.tags, false);
        this.tags = o;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.name, this.description, this.price, this.unit, this.links, o);
    }

    public Goods() {
        this.name__is_initialized = false;
        this.description__is_initialized = false;
        this.price__is_initialized = false;
        this.unit__is_initialized = false;
        this.links__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private Goods(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.description__is_initialized = false;
        this.price__is_initialized = false;
        this.unit__is_initialized = false;
        this.links__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
