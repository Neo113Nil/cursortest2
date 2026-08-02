package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Thread implements BaseMetadata, Serializable {
    private List<ThreadCategory> category;
    private boolean category__is_initialized;
    private String comfortClass;
    private boolean comfortClass__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private List<EssentialStop> essentialStops;
    private boolean essentialStops__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;

    public Thread(String str, List<EssentialStop> list, String str2, List<ThreadCategory> list2, String str3) {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.category__is_initialized = false;
        this.comfortClass__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"essentialStops\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"category\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, str2, list2, str3);
        this.id = str;
        this.id__is_initialized = true;
        this.essentialStops = list;
        this.essentialStops__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.category = list2;
        this.category__is_initialized = true;
        this.comfortClass = str3;
        this.comfortClass__is_initialized = true;
    }

    private native List<ThreadCategory> getCategory__Native();

    private native String getComfortClass__Native();

    private native String getDescription__Native();

    private native List<EssentialStop> getEssentialStops__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Thread";
    }

    private native NativeObject init(String str, List<EssentialStop> list, String str2, List<ThreadCategory> list2, String str3);

    public synchronized List<ThreadCategory> getCategory() {
        try {
            if (!this.category__is_initialized) {
                this.category = getCategory__Native();
                this.category__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.category;
    }

    public synchronized String getComfortClass() {
        try {
            if (!this.comfortClass__is_initialized) {
                this.comfortClass = getComfortClass__Native();
                this.comfortClass__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.comfortClass;
    }

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

    public synchronized List<EssentialStop> getEssentialStops() {
        try {
            if (!this.essentialStops__is_initialized) {
                this.essentialStops = getEssentialStops__Native();
                this.essentialStops__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.essentialStops;
    }

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((List) getEssentialStops(), false, (ArchivingHandler) new ClassHandler(EssentialStop.class));
            archive.add(getDescription(), true);
            archive.add((List) getCategory(), false, (ArchivingHandler) new EnumHandler(ThreadCategory.class));
            archive.add(getComfortClass(), true);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.essentialStops = nzs.e(EssentialStop.class, archive, this.essentialStops, false);
        this.essentialStops__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.category = archive.add((List) this.category, false, (ArchivingHandler) new EnumHandler(ThreadCategory.class));
        this.category__is_initialized = true;
        String add = archive.add(this.comfortClass, true);
        this.comfortClass = add;
        this.comfortClass__is_initialized = true;
        this.nativeObject = init(this.id, this.essentialStops, this.description, this.category, add);
    }

    public Thread() {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.category__is_initialized = false;
        this.comfortClass__is_initialized = false;
    }

    private Thread(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.category__is_initialized = false;
        this.comfortClass__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
