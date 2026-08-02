package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class BusinessImagesObjectMetadata implements BaseMetadata, Serializable {
    private Logo logo;
    private boolean logo__is_initialized;
    private NativeObject nativeObject;

    public BusinessImagesObjectMetadata(Logo logo) {
        this.logo__is_initialized = false;
        this.nativeObject = init(logo);
        this.logo = logo;
        this.logo__is_initialized = true;
    }

    private native Logo getLogo__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessImagesObjectMetadata";
    }

    private native NativeObject init(Logo logo);

    public synchronized Logo getLogo() {
        try {
            if (!this.logo__is_initialized) {
                this.logo = getLogo__Native();
                this.logo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.logo;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLogo(), true, (Class<Archive>) Logo.class);
            return;
        }
        Logo logo = (Logo) archive.add((Archive) this.logo, true, (Class<Archive>) Logo.class);
        this.logo = logo;
        this.logo__is_initialized = true;
        this.nativeObject = init(logo);
    }

    public static class Logo implements Serializable {
        private String urlTemplate;

        public Logo(String str) {
            if (str != null) {
                this.urlTemplate = str;
            } else {
                ny61.g("Required field \"urlTemplate\" cannot be null");
                throw null;
            }
        }

        public String getUrlTemplate() {
            return this.urlTemplate;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.urlTemplate = archive.add(this.urlTemplate, false);
        }

        public Logo() {
        }
    }

    public BusinessImagesObjectMetadata() {
        this.logo__is_initialized = false;
    }

    private BusinessImagesObjectMetadata(NativeObject nativeObject) {
        this.logo__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
