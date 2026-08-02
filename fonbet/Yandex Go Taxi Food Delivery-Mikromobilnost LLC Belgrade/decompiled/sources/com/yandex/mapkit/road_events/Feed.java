package com.yandex.mapkit.road_events;

import com.yandex.mapkit.atom.AtomFeed;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Feed implements Serializable {
    private AtomFeed atomFeed;
    private boolean atomFeed__is_initialized;
    private List<Entry> entries;
    private boolean entries__is_initialized;
    private NativeObject nativeObject;

    public Feed(AtomFeed atomFeed, List<Entry> list) {
        this.atomFeed__is_initialized = false;
        this.entries__is_initialized = false;
        if (atomFeed == null) {
            ny61.g("Required field \"atomFeed\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"entries\" cannot be null");
            throw null;
        }
        this.nativeObject = init(atomFeed, list);
        this.atomFeed = atomFeed;
        this.atomFeed__is_initialized = true;
        this.entries = list;
        this.entries__is_initialized = true;
    }

    private native AtomFeed getAtomFeed__Native();

    private native List<Entry> getEntries__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::road_events::Feed";
    }

    private native NativeObject init(AtomFeed atomFeed, List<Entry> list);

    public synchronized AtomFeed getAtomFeed() {
        try {
            if (!this.atomFeed__is_initialized) {
                this.atomFeed = getAtomFeed__Native();
                this.atomFeed__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.atomFeed;
    }

    public synchronized List<Entry> getEntries() {
        try {
            if (!this.entries__is_initialized) {
                this.entries = getEntries__Native();
                this.entries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.entries;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAtomFeed(), false, (Class<Archive>) AtomFeed.class);
            nzs.m(Entry.class, archive, getEntries(), false);
            return;
        }
        this.atomFeed = (AtomFeed) archive.add((Archive) this.atomFeed, false, (Class<Archive>) AtomFeed.class);
        this.atomFeed__is_initialized = true;
        List<Entry> e = nzs.e(Entry.class, archive, this.entries, false);
        this.entries = e;
        this.entries__is_initialized = true;
        this.nativeObject = init(this.atomFeed, e);
    }

    public Feed() {
        this.atomFeed__is_initialized = false;
        this.entries__is_initialized = false;
    }

    private Feed(NativeObject nativeObject) {
        this.atomFeed__is_initialized = false;
        this.entries__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
