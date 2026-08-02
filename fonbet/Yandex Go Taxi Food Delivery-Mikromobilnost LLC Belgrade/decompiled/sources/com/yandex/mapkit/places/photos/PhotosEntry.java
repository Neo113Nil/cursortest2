package com.yandex.mapkit.places.photos;

import com.yandex.mapkit.atom.AtomEntry;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class PhotosEntry implements Serializable {
    private AtomEntry atomEntry;
    private boolean atomEntry__is_initialized;
    private List<Image> images;
    private boolean images__is_initialized;
    private NativeObject nativeObject;
    private Boolean pending;
    private boolean pending__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;

    public PhotosEntry(AtomEntry atomEntry, List<Image> list, List<String> list2, Boolean bool) {
        this.atomEntry__is_initialized = false;
        this.images__is_initialized = false;
        this.tags__is_initialized = false;
        this.pending__is_initialized = false;
        if (atomEntry == null) {
            ny61.g("Required field \"atomEntry\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"images\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(atomEntry, list, list2, bool);
        this.atomEntry = atomEntry;
        this.atomEntry__is_initialized = true;
        this.images = list;
        this.images__is_initialized = true;
        this.tags = list2;
        this.tags__is_initialized = true;
        this.pending = bool;
        this.pending__is_initialized = true;
    }

    private native AtomEntry getAtomEntry__Native();

    private native List<Image> getImages__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::photos::Entry";
    }

    private native Boolean getPending__Native();

    private native List<String> getTags__Native();

    private native NativeObject init(AtomEntry atomEntry, List<Image> list, List<String> list2, Boolean bool);

    public synchronized AtomEntry getAtomEntry() {
        try {
            if (!this.atomEntry__is_initialized) {
                this.atomEntry = getAtomEntry__Native();
                this.atomEntry__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.atomEntry;
    }

    public synchronized List<Image> getImages() {
        try {
            if (!this.images__is_initialized) {
                this.images = getImages__Native();
                this.images__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.images;
    }

    public synchronized Boolean getPending() {
        try {
            if (!this.pending__is_initialized) {
                this.pending = getPending__Native();
                this.pending__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.pending;
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
            archive.add((Archive) getAtomEntry(), false, (Class<Archive>) AtomEntry.class);
            archive.add((List) getImages(), false, (ArchivingHandler) new ClassHandler(Image.class));
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            archive.add(getPending(), true);
            return;
        }
        this.atomEntry = (AtomEntry) archive.add((Archive) this.atomEntry, false, (Class<Archive>) AtomEntry.class);
        this.atomEntry__is_initialized = true;
        this.images = nzs.e(Image.class, archive, this.images, false);
        this.images__is_initialized = true;
        this.tags = nnm.o(archive, this.tags, false);
        this.tags__is_initialized = true;
        Boolean add = archive.add(this.pending, true);
        this.pending = add;
        this.pending__is_initialized = true;
        this.nativeObject = init(this.atomEntry, this.images, this.tags, add);
    }

    public PhotosEntry() {
        this.atomEntry__is_initialized = false;
        this.images__is_initialized = false;
        this.tags__is_initialized = false;
        this.pending__is_initialized = false;
    }

    private PhotosEntry(NativeObject nativeObject) {
        this.atomEntry__is_initialized = false;
        this.images__is_initialized = false;
        this.tags__is_initialized = false;
        this.pending__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
