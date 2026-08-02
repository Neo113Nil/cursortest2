package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class VisualHintsObjectMetadata implements BaseMetadata, Serializable {
    private CardHints cardHints;
    private boolean cardHints__is_initialized;
    private NativeObject nativeObject;
    private PinHints pinHints;
    private boolean pinHints__is_initialized;
    private SerpHints serpHints;
    private boolean serpHints__is_initialized;

    public VisualHintsObjectMetadata(SerpHints serpHints, CardHints cardHints, PinHints pinHints) {
        this.serpHints__is_initialized = false;
        this.cardHints__is_initialized = false;
        this.pinHints__is_initialized = false;
        this.nativeObject = init(serpHints, cardHints, pinHints);
        this.serpHints = serpHints;
        this.serpHints__is_initialized = true;
        this.cardHints = cardHints;
        this.cardHints__is_initialized = true;
        this.pinHints = pinHints;
        this.pinHints__is_initialized = true;
    }

    private native CardHints getCardHints__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::VisualHintsObjectMetadata";
    }

    private native PinHints getPinHints__Native();

    private native SerpHints getSerpHints__Native();

    private native NativeObject init(SerpHints serpHints, CardHints cardHints, PinHints pinHints);

    public synchronized CardHints getCardHints() {
        try {
            if (!this.cardHints__is_initialized) {
                this.cardHints = getCardHints__Native();
                this.cardHints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cardHints;
    }

    public synchronized PinHints getPinHints() {
        try {
            if (!this.pinHints__is_initialized) {
                this.pinHints = getPinHints__Native();
                this.pinHints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.pinHints;
    }

    public synchronized SerpHints getSerpHints() {
        try {
            if (!this.serpHints__is_initialized) {
                this.serpHints = getSerpHints__Native();
                this.serpHints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.serpHints;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getSerpHints(), true, (Class<Archive>) SerpHints.class);
            archive.add((Archive) getCardHints(), true, (Class<Archive>) CardHints.class);
            archive.add((Archive) getPinHints(), true, (Class<Archive>) PinHints.class);
            return;
        }
        this.serpHints = (SerpHints) archive.add((Archive) this.serpHints, true, (Class<Archive>) SerpHints.class);
        this.serpHints__is_initialized = true;
        this.cardHints = (CardHints) archive.add((Archive) this.cardHints, true, (Class<Archive>) CardHints.class);
        this.cardHints__is_initialized = true;
        PinHints pinHints = (PinHints) archive.add((Archive) this.pinHints, true, (Class<Archive>) PinHints.class);
        this.pinHints = pinHints;
        this.pinHints__is_initialized = true;
        this.nativeObject = init(this.serpHints, this.cardHints, pinHints);
    }

    public VisualHintsObjectMetadata() {
        this.serpHints__is_initialized = false;
        this.cardHints__is_initialized = false;
        this.pinHints__is_initialized = false;
    }

    private VisualHintsObjectMetadata(NativeObject nativeObject) {
        this.serpHints__is_initialized = false;
        this.cardHints__is_initialized = false;
        this.pinHints__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
