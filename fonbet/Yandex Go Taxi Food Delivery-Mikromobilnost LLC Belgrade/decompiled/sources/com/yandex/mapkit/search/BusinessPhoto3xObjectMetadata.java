package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class BusinessPhoto3xObjectMetadata implements BaseMetadata, Serializable {
    private List<Group> groups;
    private boolean groups__is_initialized;
    private NativeObject nativeObject;

    public BusinessPhoto3xObjectMetadata(List<Group> list) {
        this.groups__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"groups\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.groups = list;
        this.groups__is_initialized = true;
    }

    private native List<Group> getGroups__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessPhoto3xObjectMetadata";
    }

    private native NativeObject init(List<Group> list);

    public synchronized List<Group> getGroups() {
        try {
            if (!this.groups__is_initialized) {
                this.groups = getGroups__Native();
                this.groups__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.groups;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Group.class, archive, getGroups(), false);
            return;
        }
        List<Group> e = nzs.e(Group.class, archive, this.groups, false);
        this.groups = e;
        this.groups__is_initialized = true;
        this.nativeObject = init(e);
    }

    public BusinessPhoto3xObjectMetadata() {
        this.groups__is_initialized = false;
    }

    private BusinessPhoto3xObjectMetadata(NativeObject nativeObject) {
        this.groups__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public static class Photo implements Serializable {
        private Image image;
        private boolean image__is_initialized;
        private List<LinkInfo> links;
        private boolean links__is_initialized;
        private NativeObject nativeObject;

        public Photo(Image image, List<LinkInfo> list) {
            this.image__is_initialized = false;
            this.links__is_initialized = false;
            if (image == null) {
                ny61.g("Required field \"image\" cannot be null");
                throw null;
            }
            if (list == null) {
                ny61.g("Required field \"links\" cannot be null");
                throw null;
            }
            this.nativeObject = init(image, list);
            this.image = image;
            this.image__is_initialized = true;
            this.links = list;
            this.links__is_initialized = true;
        }

        private native Image getImage__Native();

        private native List<LinkInfo> getLinks__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::BusinessPhoto3xObjectMetadata::Photo";
        }

        private native NativeObject init(Image image, List<LinkInfo> list);

        public synchronized Image getImage() {
            try {
                if (!this.image__is_initialized) {
                    this.image = getImage__Native();
                    this.image__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.image;
        }

        public synchronized List<LinkInfo> getLinks() {
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
                archive.add((Archive) getImage(), false, (Class<Archive>) Image.class);
                nzs.m(LinkInfo.class, archive, getLinks(), false);
                return;
            }
            this.image = (Image) archive.add((Archive) this.image, false, (Class<Archive>) Image.class);
            this.image__is_initialized = true;
            List<LinkInfo> e = nzs.e(LinkInfo.class, archive, this.links, false);
            this.links = e;
            this.links__is_initialized = true;
            this.nativeObject = init(this.image, e);
        }

        public static class LinkInfo implements Serializable {
            private NativeObject nativeObject;
            private String type;
            private boolean type__is_initialized;
            private String uri;
            private boolean uri__is_initialized;

            public LinkInfo(String str, String str2) {
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
                return "yandex::maps::mapkit::search::BusinessPhoto3xObjectMetadata::Photo::LinkInfo";
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

            public LinkInfo() {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
            }

            private LinkInfo(NativeObject nativeObject) {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
                this.nativeObject = nativeObject;
            }
        }

        public Photo() {
            this.image__is_initialized = false;
            this.links__is_initialized = false;
        }

        private Photo(NativeObject nativeObject) {
            this.image__is_initialized = false;
            this.links__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public static class Group implements Serializable {
        private Integer count;
        private boolean count__is_initialized;
        private String id;
        private boolean id__is_initialized;
        private String name;
        private boolean name__is_initialized;
        private NativeObject nativeObject;
        private List<Photo> photos;
        private boolean photos__is_initialized;

        public Group(String str, Integer num, String str2, List<Photo> list) {
            this.id__is_initialized = false;
            this.count__is_initialized = false;
            this.name__is_initialized = false;
            this.photos__is_initialized = false;
            if (str == null) {
                ny61.g("Required field \"id\" cannot be null");
                throw null;
            }
            if (list == null) {
                ny61.g("Required field \"photos\" cannot be null");
                throw null;
            }
            this.nativeObject = init(str, num, str2, list);
            this.id = str;
            this.id__is_initialized = true;
            this.count = num;
            this.count__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.photos = list;
            this.photos__is_initialized = true;
        }

        private native Integer getCount__Native();

        private native String getId__Native();

        private native String getName__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::BusinessPhoto3xObjectMetadata::Group";
        }

        private native List<Photo> getPhotos__Native();

        private native NativeObject init(String str, Integer num, String str2, List<Photo> list);

        public synchronized Integer getCount() {
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
                archive.add(getId(), false);
                archive.add(getCount(), true);
                archive.add(getName(), true);
                nzs.m(Photo.class, archive, getPhotos(), false);
                return;
            }
            this.id = archive.add(this.id, false);
            this.id__is_initialized = true;
            this.count = archive.add(this.count, true);
            this.count__is_initialized = true;
            this.name = archive.add(this.name, true);
            this.name__is_initialized = true;
            List<Photo> e = nzs.e(Photo.class, archive, this.photos, false);
            this.photos = e;
            this.photos__is_initialized = true;
            this.nativeObject = init(this.id, this.count, this.name, e);
        }

        public Group() {
            this.id__is_initialized = false;
            this.count__is_initialized = false;
            this.name__is_initialized = false;
            this.photos__is_initialized = false;
        }

        private Group(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.count__is_initialized = false;
            this.name__is_initialized = false;
            this.photos__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }
}
