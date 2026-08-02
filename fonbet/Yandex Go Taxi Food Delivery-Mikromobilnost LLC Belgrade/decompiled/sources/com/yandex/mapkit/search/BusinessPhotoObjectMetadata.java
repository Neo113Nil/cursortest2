package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class BusinessPhotoObjectMetadata implements BaseMetadata, Serializable {
    private int count;
    private boolean count__is_initialized;
    private NativeObject nativeObject;
    private List<Photo> photos;
    private boolean photos__is_initialized;

    public BusinessPhotoObjectMetadata(int i, List<Photo> list) {
        this.count__is_initialized = false;
        this.photos__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"photos\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, list);
        this.count = i;
        this.count__is_initialized = true;
        this.photos = list;
        this.photos__is_initialized = true;
    }

    private native int getCount__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessPhotoObjectMetadata";
    }

    private native List<Photo> getPhotos__Native();

    private native NativeObject init(int i, List<Photo> list);

    public synchronized int getCount() {
        try {
            if (!this.count__is_initialized) {
                this.count = getCount__Native();
                this.count__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.count;
    }

    public synchronized List<Photo> getPhotos() {
        try {
            if (!this.photos__is_initialized) {
                this.photos = getPhotos__Native();
                this.photos__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.photos;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCount());
            nzs.m(Photo.class, archive, getPhotos(), false);
            return;
        }
        this.count = archive.add(this.count);
        this.count__is_initialized = true;
        List<Photo> e = nzs.e(Photo.class, archive, this.photos, false);
        this.photos = e;
        this.photos__is_initialized = true;
        this.nativeObject = init(this.count, e);
    }

    public static class Photo implements Serializable {
        private String id;
        private boolean id__is_initialized;
        private List<PhotoLink> links;
        private boolean links__is_initialized;
        private NativeObject nativeObject;

        public Photo(String str, List<PhotoLink> list) {
            this.id__is_initialized = false;
            this.links__is_initialized = false;
            if (str == null) {
                ny61.g("Required field \"id\" cannot be null");
                throw null;
            }
            if (list == null) {
                ny61.g("Required field \"links\" cannot be null");
                throw null;
            }
            this.nativeObject = init(str, list);
            this.id = str;
            this.id__is_initialized = true;
            this.links = list;
            this.links__is_initialized = true;
        }

        private native String getId__Native();

        private native List<PhotoLink> getLinks__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::BusinessPhotoObjectMetadata::Photo";
        }

        private native NativeObject init(String str, List<PhotoLink> list);

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

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), false);
                nzs.m(PhotoLink.class, archive, getLinks(), false);
                return;
            }
            this.id = archive.add(this.id, false);
            this.id__is_initialized = true;
            List<PhotoLink> e = nzs.e(PhotoLink.class, archive, this.links, false);
            this.links = e;
            this.links__is_initialized = true;
            this.nativeObject = init(this.id, e);
        }

        public static class PhotoLink implements Serializable {
            private NativeObject nativeObject;
            private String type;
            private boolean type__is_initialized;
            private String uri;
            private boolean uri__is_initialized;

            public PhotoLink(String str, String str2) {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
                if (str2 == null) {
                    ny61.g("Required field \"uri\" cannot be null");
                    throw null;
                }
                this.nativeObject = init(str, str2);
                this.type = str;
                this.type__is_initialized = true;
                this.uri = str2;
                this.uri__is_initialized = true;
            }

            public static String getNativeName() {
                return "yandex::maps::mapkit::search::BusinessPhotoObjectMetadata::Photo::PhotoLink";
            }

            private native String getType__Native();

            private native String getUri__Native();

            private native NativeObject init(String str, String str2);

            public synchronized String getType() {
                try {
                    if (!this.type__is_initialized) {
                        this.type = getType__Native();
                        this.type__is_initialized = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
                return this.type;
            }

            public synchronized String getUri() {
                try {
                    if (!this.uri__is_initialized) {
                        this.uri = getUri__Native();
                        this.uri__is_initialized = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
                return this.uri;
            }

            @Override // com.yandex.runtime.bindings.Serializable
            public void serialize(Archive archive) {
                if (!archive.isReader()) {
                    archive.add(getType(), true);
                    archive.add(getUri(), false);
                    return;
                }
                this.type = archive.add(this.type, true);
                this.type__is_initialized = true;
                String add = archive.add(this.uri, false);
                this.uri = add;
                this.uri__is_initialized = true;
                this.nativeObject = init(this.type, add);
            }

            public PhotoLink() {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
            }

            private PhotoLink(NativeObject nativeObject) {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
                this.nativeObject = nativeObject;
            }
        }

        public Photo() {
            this.id__is_initialized = false;
            this.links__is_initialized = false;
        }

        private Photo(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.links__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public BusinessPhotoObjectMetadata() {
        this.count__is_initialized = false;
        this.photos__is_initialized = false;
    }

    private BusinessPhotoObjectMetadata(NativeObject nativeObject) {
        this.count__is_initialized = false;
        this.photos__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
