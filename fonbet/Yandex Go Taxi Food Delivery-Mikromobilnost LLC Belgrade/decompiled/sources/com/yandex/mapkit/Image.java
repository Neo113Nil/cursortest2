package com.yandex.mapkit;

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
public class Image implements Serializable {
    private NativeObject nativeObject;
    private List<ImageSize> sizes;
    private boolean sizes__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String urlTemplate;
    private boolean urlTemplate__is_initialized;

    public Image(String str, List<ImageSize> list, List<String> list2) {
        this.urlTemplate__is_initialized = false;
        this.sizes__is_initialized = false;
        this.tags__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"urlTemplate\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"sizes\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, list2);
        this.urlTemplate = str;
        this.urlTemplate__is_initialized = true;
        this.sizes = list;
        this.sizes__is_initialized = true;
        this.tags = list2;
        this.tags__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::Image";
    }

    private native List<ImageSize> getSizes__Native();

    private native List<String> getTags__Native();

    private native String getUrlTemplate__Native();

    private native NativeObject init(String str, List<ImageSize> list, List<String> list2);

    public synchronized List<ImageSize> getSizes() {
        try {
            if (!this.sizes__is_initialized) {
                this.sizes = getSizes__Native();
                this.sizes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sizes;
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

    public synchronized String getUrlTemplate() {
        try {
            if (!this.urlTemplate__is_initialized) {
                this.urlTemplate = getUrlTemplate__Native();
                this.urlTemplate__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.urlTemplate;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getUrlTemplate(), false);
            archive.add((List) getSizes(), false, (ArchivingHandler) new ClassHandler(ImageSize.class));
            nzs.l(archive, getTags(), false);
            return;
        }
        this.urlTemplate = archive.add(this.urlTemplate, false);
        this.urlTemplate__is_initialized = true;
        this.sizes = nzs.e(ImageSize.class, archive, this.sizes, false);
        this.sizes__is_initialized = true;
        List<String> o = nnm.o(archive, this.tags, false);
        this.tags = o;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.urlTemplate, this.sizes, o);
    }

    public static class ImageSize implements Serializable {
        private Integer height;
        private String size;
        private Integer width;

        public ImageSize(String str, Integer num, Integer num2) {
            if (str == null) {
                ny61.g("Required field \"size\" cannot be null");
                throw null;
            }
            this.size = str;
            this.width = num;
            this.height = num2;
        }

        public Integer getHeight() {
            return this.height;
        }

        public String getSize() {
            return this.size;
        }

        public Integer getWidth() {
            return this.width;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.size = archive.add(this.size, false);
            this.width = archive.add(this.width, true);
            this.height = archive.add(this.height, true);
        }

        public ImageSize() {
        }
    }

    public Image() {
        this.urlTemplate__is_initialized = false;
        this.sizes__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private Image(NativeObject nativeObject) {
        this.urlTemplate__is_initialized = false;
        this.sizes__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
