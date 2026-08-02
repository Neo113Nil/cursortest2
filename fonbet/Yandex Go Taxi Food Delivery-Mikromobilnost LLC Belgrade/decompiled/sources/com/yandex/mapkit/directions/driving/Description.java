package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class Description implements Serializable {
    private String explanation;
    private boolean explanation__is_initialized;
    private List<Label> labels;
    private boolean labels__is_initialized;
    private NativeObject nativeObject;
    private String via;
    private boolean via__is_initialized;

    public Description(String str, String str2, List<Label> list) {
        this.via__is_initialized = false;
        this.explanation__is_initialized = false;
        this.labels__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"labels\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, list);
        this.via = str;
        this.via__is_initialized = true;
        this.explanation = str2;
        this.explanation__is_initialized = true;
        this.labels = list;
        this.labels__is_initialized = true;
    }

    private native String getExplanation__Native();

    private native List<Label> getLabels__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Description";
    }

    private native String getVia__Native();

    private native NativeObject init(String str, String str2, List<Label> list);

    public synchronized String getExplanation() {
        try {
            if (!this.explanation__is_initialized) {
                this.explanation = getExplanation__Native();
                this.explanation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.explanation;
    }

    public synchronized List<Label> getLabels() {
        try {
            if (!this.labels__is_initialized) {
                this.labels = getLabels__Native();
                this.labels__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.labels;
    }

    public synchronized String getVia() {
        try {
            if (!this.via__is_initialized) {
                this.via = getVia__Native();
                this.via__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.via;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getVia(), true);
            archive.add(getExplanation(), true);
            archive.add((List) getLabels(), false, (ArchivingHandler) new EnumHandler(Label.class));
            return;
        }
        this.via = archive.add(this.via, true);
        this.via__is_initialized = true;
        this.explanation = archive.add(this.explanation, true);
        this.explanation__is_initialized = true;
        List<Label> add = archive.add((List) this.labels, false, (ArchivingHandler) new EnumHandler(Label.class));
        this.labels = add;
        this.labels__is_initialized = true;
        this.nativeObject = init(this.via, this.explanation, add);
    }

    public Description() {
        this.via__is_initialized = false;
        this.explanation__is_initialized = false;
        this.labels__is_initialized = false;
    }

    private Description(NativeObject nativeObject) {
        this.via__is_initialized = false;
        this.explanation__is_initialized = false;
        this.labels__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
