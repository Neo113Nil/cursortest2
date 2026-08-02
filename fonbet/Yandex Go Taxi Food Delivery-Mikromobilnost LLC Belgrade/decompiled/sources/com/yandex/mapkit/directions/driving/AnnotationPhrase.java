package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class AnnotationPhrase implements Serializable {
    private NativeObject nativeObject;
    private List<PhraseTemplate> phraseTemplates;
    private boolean phraseTemplates__is_initialized;

    public AnnotationPhrase(List<PhraseTemplate> list) {
        this.phraseTemplates__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"phraseTemplates\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.phraseTemplates = list;
        this.phraseTemplates__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::AnnotationPhrase";
    }

    private native List<PhraseTemplate> getPhraseTemplates__Native();

    private native NativeObject init(List<PhraseTemplate> list);

    public synchronized List<PhraseTemplate> getPhraseTemplates() {
        try {
            if (!this.phraseTemplates__is_initialized) {
                this.phraseTemplates = getPhraseTemplates__Native();
                this.phraseTemplates__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.phraseTemplates;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(PhraseTemplate.class, archive, getPhraseTemplates(), false);
            return;
        }
        List<PhraseTemplate> e = nzs.e(PhraseTemplate.class, archive, this.phraseTemplates, false);
        this.phraseTemplates = e;
        this.phraseTemplates__is_initialized = true;
        this.nativeObject = init(e);
    }

    public AnnotationPhrase() {
        this.phraseTemplates__is_initialized = false;
    }

    private AnnotationPhrase(NativeObject nativeObject) {
        this.phraseTemplates__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
