package com.yandex.mapkit.atom;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class AtomFeed implements Serializable {
    private List<Link> links;
    private boolean links__is_initialized;
    private NativeObject nativeObject;
    private String nextpage;
    private boolean nextpage__is_initialized;

    public AtomFeed(String str, List<Link> list) {
        this.nextpage__is_initialized = false;
        this.links__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"links\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.nextpage = str;
        this.nextpage__is_initialized = true;
        this.links = list;
        this.links__is_initialized = true;
    }

    private native List<Link> getLinks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::atom::Feed";
    }

    private native String getNextpage__Native();

    private native NativeObject init(String str, List<Link> list);

    public synchronized List<Link> getLinks() {
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

    public synchronized String getNextpage() {
        try {
            if (!this.nextpage__is_initialized) {
                this.nextpage = getNextpage__Native();
                this.nextpage__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.nextpage;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getNextpage(), true);
            nzs.m(Link.class, archive, getLinks(), false);
            return;
        }
        this.nextpage = archive.add(this.nextpage, true);
        this.nextpage__is_initialized = true;
        List<Link> e = nzs.e(Link.class, archive, this.links, false);
        this.links = e;
        this.links__is_initialized = true;
        this.nativeObject = init(this.nextpage, e);
    }

    public AtomFeed() {
        this.nextpage__is_initialized = false;
        this.links__is_initialized = false;
    }

    private AtomFeed(NativeObject nativeObject) {
        this.nextpage__is_initialized = false;
        this.links__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
