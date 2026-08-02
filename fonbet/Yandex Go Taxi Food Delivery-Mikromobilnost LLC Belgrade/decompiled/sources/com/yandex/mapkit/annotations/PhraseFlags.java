package com.yandex.mapkit.annotations;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class PhraseFlags implements Serializable {
    private boolean hasCustomAnnotations;
    private boolean hasToponyms;

    public PhraseFlags(boolean z, boolean z2) {
        this.hasToponyms = z;
        this.hasCustomAnnotations = z2;
    }

    public boolean getHasCustomAnnotations() {
        return this.hasCustomAnnotations;
    }

    public boolean getHasToponyms() {
        return this.hasToponyms;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.hasToponyms = archive.add(this.hasToponyms);
        this.hasCustomAnnotations = archive.add(this.hasCustomAnnotations);
    }

    public PhraseFlags() {
    }
}
