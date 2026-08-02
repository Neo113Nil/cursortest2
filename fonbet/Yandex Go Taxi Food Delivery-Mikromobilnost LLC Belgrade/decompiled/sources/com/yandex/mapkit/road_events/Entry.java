package com.yandex.mapkit.road_events;

import com.yandex.mapkit.atom.AtomEntry;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Entry implements Serializable {
    private AtomEntry atomEntry;
    private boolean atomEntry__is_initialized;
    private TextEntry content;
    private boolean content__is_initialized;
    private NativeObject nativeObject;

    public Entry(AtomEntry atomEntry, TextEntry textEntry) {
        this.atomEntry__is_initialized = false;
        this.content__is_initialized = false;
        if (atomEntry == null) {
            ny61.g("Required field \"atomEntry\" cannot be null");
            throw null;
        }
        if (textEntry == null) {
            ny61.g("Required field \"content\" cannot be null");
            throw null;
        }
        this.nativeObject = init(atomEntry, textEntry);
        this.atomEntry = atomEntry;
        this.atomEntry__is_initialized = true;
        this.content = textEntry;
        this.content__is_initialized = true;
    }

    private native AtomEntry getAtomEntry__Native();

    private native TextEntry getContent__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::road_events::Entry";
    }

    private native NativeObject init(AtomEntry atomEntry, TextEntry textEntry);

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

    public synchronized TextEntry getContent() {
        try {
            if (!this.content__is_initialized) {
                this.content = getContent__Native();
                this.content__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.content;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAtomEntry(), false, (Class<Archive>) AtomEntry.class);
            archive.add((Archive) getContent(), false, (Class<Archive>) TextEntry.class);
            return;
        }
        this.atomEntry = (AtomEntry) archive.add((Archive) this.atomEntry, false, (Class<Archive>) AtomEntry.class);
        this.atomEntry__is_initialized = true;
        TextEntry textEntry = (TextEntry) archive.add((Archive) this.content, false, (Class<Archive>) TextEntry.class);
        this.content = textEntry;
        this.content__is_initialized = true;
        this.nativeObject = init(this.atomEntry, textEntry);
    }

    public Entry() {
        this.atomEntry__is_initialized = false;
        this.content__is_initialized = false;
    }

    private Entry(NativeObject nativeObject) {
        this.atomEntry__is_initialized = false;
        this.content__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
