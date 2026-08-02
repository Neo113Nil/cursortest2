package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SubtitleHint implements Serializable {
    private NativeObject nativeObject;
    private SubtitleProperties properties;
    private boolean properties__is_initialized;
    private String text;
    private boolean text__is_initialized;
    private SubtitleType type;
    private boolean type__is_initialized;

    public enum SubtitleType {
        SIMPLE_TEXT,
        RATING,
        QUARANTINE,
        PROMO,
        WORKING_HOURS,
        NEXT_MOVIE,
        TRAVEL_TIME,
        PRICE,
        SOCIAL
    }

    public SubtitleHint(SubtitleType subtitleType, String str, SubtitleProperties subtitleProperties) {
        this.type__is_initialized = false;
        this.text__is_initialized = false;
        this.properties__is_initialized = false;
        if (subtitleType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.nativeObject = init(subtitleType, str, subtitleProperties);
        this.type = subtitleType;
        this.type__is_initialized = true;
        this.text = str;
        this.text__is_initialized = true;
        this.properties = subtitleProperties;
        this.properties__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SubtitleHint";
    }

    private native SubtitleProperties getProperties__Native();

    private native String getText__Native();

    private native SubtitleType getType__Native();

    private native NativeObject init(SubtitleType subtitleType, String str, SubtitleProperties subtitleProperties);

    public synchronized SubtitleProperties getProperties() {
        try {
            if (!this.properties__is_initialized) {
                this.properties = getProperties__Native();
                this.properties__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.properties;
    }

    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.text;
    }

    public synchronized SubtitleType getType() {
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
            archive.add((Archive) getType(), false, (Class<Archive>) SubtitleType.class);
            archive.add(getText(), true);
            archive.add((Archive) getProperties(), true, (Class<Archive>) SubtitleProperties.class);
            return;
        }
        this.type = (SubtitleType) archive.add((Archive) this.type, false, (Class<Archive>) SubtitleType.class);
        this.type__is_initialized = true;
        this.text = archive.add(this.text, true);
        this.text__is_initialized = true;
        SubtitleProperties subtitleProperties = (SubtitleProperties) archive.add((Archive) this.properties, true, (Class<Archive>) SubtitleProperties.class);
        this.properties = subtitleProperties;
        this.properties__is_initialized = true;
        this.nativeObject = init(this.type, this.text, subtitleProperties);
    }

    public SubtitleHint() {
        this.type__is_initialized = false;
        this.text__is_initialized = false;
        this.properties__is_initialized = false;
    }

    private SubtitleHint(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.text__is_initialized = false;
        this.properties__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
