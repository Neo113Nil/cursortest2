package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class EssentialStop implements Serializable {
    private EssentialStopInfo info;
    private boolean info__is_initialized;
    private NativeObject nativeObject;
    private Stop stop;
    private boolean stop__is_initialized;

    public EssentialStop(Stop stop, EssentialStopInfo essentialStopInfo) {
        this.stop__is_initialized = false;
        this.info__is_initialized = false;
        if (stop == null) {
            ny61.g("Required field \"stop\" cannot be null");
            throw null;
        }
        if (essentialStopInfo == null) {
            ny61.g("Required field \"info\" cannot be null");
            throw null;
        }
        this.nativeObject = init(stop, essentialStopInfo);
        this.stop = stop;
        this.stop__is_initialized = true;
        this.info = essentialStopInfo;
        this.info__is_initialized = true;
    }

    private native EssentialStopInfo getInfo__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::EssentialStop";
    }

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, EssentialStopInfo essentialStopInfo);

    public synchronized EssentialStopInfo getInfo() {
        try {
            if (!this.info__is_initialized) {
                this.info = getInfo__Native();
                this.info__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.info;
    }

    public synchronized Stop getStop() {
        try {
            if (!this.stop__is_initialized) {
                this.stop = getStop__Native();
                this.stop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getStop(), false, (Class<Archive>) Stop.class);
            archive.add((Archive) getInfo(), false, (Class<Archive>) EssentialStopInfo.class);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        EssentialStopInfo essentialStopInfo = (EssentialStopInfo) archive.add((Archive) this.info, false, (Class<Archive>) EssentialStopInfo.class);
        this.info = essentialStopInfo;
        this.info__is_initialized = true;
        this.nativeObject = init(this.stop, essentialStopInfo);
    }

    public EssentialStop() {
        this.stop__is_initialized = false;
        this.info__is_initialized = false;
    }

    private EssentialStop(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.info__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
