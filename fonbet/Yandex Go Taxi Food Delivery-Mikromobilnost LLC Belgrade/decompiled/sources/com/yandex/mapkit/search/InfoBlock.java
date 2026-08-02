package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class InfoBlock implements Serializable {
    private NativeObject nativeObject;
    private SubtitleHint subtitleHint;
    private boolean subtitleHint__is_initialized;
    private InfoBlockType type;
    private boolean type__is_initialized;

    public enum InfoBlockType {
        SUBTITLE,
        NEUROSUMMARY,
        GOODS,
        MEDICINE
    }

    public InfoBlock(InfoBlockType infoBlockType, SubtitleHint subtitleHint) {
        this.type__is_initialized = false;
        this.subtitleHint__is_initialized = false;
        this.nativeObject = init(infoBlockType, subtitleHint);
        this.type = infoBlockType;
        this.type__is_initialized = true;
        this.subtitleHint = subtitleHint;
        this.subtitleHint__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::InfoBlock";
    }

    private native SubtitleHint getSubtitleHint__Native();

    private native InfoBlockType getType__Native();

    private native NativeObject init(InfoBlockType infoBlockType, SubtitleHint subtitleHint);

    public synchronized SubtitleHint getSubtitleHint() {
        try {
            if (!this.subtitleHint__is_initialized) {
                this.subtitleHint = getSubtitleHint__Native();
                this.subtitleHint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.subtitleHint;
    }

    public synchronized InfoBlockType getType() {
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getType(), true, (Class<Archive>) InfoBlockType.class);
            archive.add((Archive) getSubtitleHint(), true, (Class<Archive>) SubtitleHint.class);
            return;
        }
        this.type = (InfoBlockType) archive.add((Archive) this.type, true, (Class<Archive>) InfoBlockType.class);
        this.type__is_initialized = true;
        SubtitleHint subtitleHint = (SubtitleHint) archive.add((Archive) this.subtitleHint, true, (Class<Archive>) SubtitleHint.class);
        this.subtitleHint = subtitleHint;
        this.subtitleHint__is_initialized = true;
        this.nativeObject = init(this.type, subtitleHint);
    }

    public InfoBlock() {
        this.type__is_initialized = false;
        this.subtitleHint__is_initialized = false;
    }

    private InfoBlock(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.subtitleHint__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
