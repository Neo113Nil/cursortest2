package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RouteSettings implements Serializable {
    private List<String> acceptTypes;
    private boolean acceptTypes__is_initialized;
    private List<String> avoidTypes;
    private boolean avoidTypes__is_initialized;
    private NativeObject nativeObject;

    public RouteSettings(List<String> list, List<String> list2) {
        this.avoidTypes__is_initialized = false;
        this.acceptTypes__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"avoidTypes\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"acceptTypes\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.avoidTypes = list;
        this.avoidTypes__is_initialized = true;
        this.acceptTypes = list2;
        this.acceptTypes__is_initialized = true;
    }

    private native List<String> getAcceptTypes__Native();

    private native List<String> getAvoidTypes__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RouteSettings";
    }

    private native NativeObject init(List<String> list, List<String> list2);

    public synchronized List<String> getAcceptTypes() {
        try {
            if (!this.acceptTypes__is_initialized) {
                this.acceptTypes = getAcceptTypes__Native();
                this.acceptTypes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.acceptTypes;
    }

    public synchronized List<String> getAvoidTypes() {
        try {
            if (!this.avoidTypes__is_initialized) {
                this.avoidTypes = getAvoidTypes__Native();
                this.avoidTypes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.avoidTypes;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getAvoidTypes(), false, (ArchivingHandler) new StringHandler());
            nzs.l(archive, getAcceptTypes(), false);
            return;
        }
        this.avoidTypes = nnm.o(archive, this.avoidTypes, false);
        this.avoidTypes__is_initialized = true;
        List<String> o = nnm.o(archive, this.acceptTypes, false);
        this.acceptTypes = o;
        this.acceptTypes__is_initialized = true;
        this.nativeObject = init(this.avoidTypes, o);
    }

    public RouteSettings() {
        this.avoidTypes__is_initialized = false;
        this.acceptTypes__is_initialized = false;
    }

    private RouteSettings(NativeObject nativeObject) {
        this.avoidTypes__is_initialized = false;
        this.acceptTypes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
