package com.yandex.mapkit.annotations;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class LocalizedPhrase implements Serializable {
    private AnnotationLanguage language;
    private boolean language__is_initialized;
    private NativeObject nativeObject;
    private PhraseFlags phraseFlags;
    private boolean phraseFlags__is_initialized;
    private String text;
    private boolean text__is_initialized;
    private List<SpeakerPhraseToken> tokens;
    private boolean tokens__is_initialized;

    public LocalizedPhrase(List<SpeakerPhraseToken> list, String str, AnnotationLanguage annotationLanguage, PhraseFlags phraseFlags) {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
        this.phraseFlags__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tokens\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (annotationLanguage == null) {
            ny61.g("Required field \"language\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, str, annotationLanguage, phraseFlags);
        this.tokens = list;
        this.tokens__is_initialized = true;
        this.text = str;
        this.text__is_initialized = true;
        this.language = annotationLanguage;
        this.language__is_initialized = true;
        this.phraseFlags = phraseFlags;
        this.phraseFlags__is_initialized = true;
    }

    private native AnnotationLanguage getLanguage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::annotations::LocalizedPhrase";
    }

    private native PhraseFlags getPhraseFlags__Native();

    private native String getText__Native();

    private native List<SpeakerPhraseToken> getTokens__Native();

    private native NativeObject init(List<SpeakerPhraseToken> list, String str, AnnotationLanguage annotationLanguage, PhraseFlags phraseFlags);

    private native NativeObject initPublic(List<SpeakerPhraseToken> list, String str, AnnotationLanguage annotationLanguage);

    public synchronized AnnotationLanguage getLanguage() {
        try {
            if (!this.language__is_initialized) {
                this.language = getLanguage__Native();
                this.language__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.language;
    }

    public synchronized PhraseFlags getPhraseFlags() {
        try {
            if (!this.phraseFlags__is_initialized) {
                this.phraseFlags = getPhraseFlags__Native();
                this.phraseFlags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.phraseFlags;
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

    public synchronized List<SpeakerPhraseToken> getTokens() {
        try {
            if (!this.tokens__is_initialized) {
                this.tokens = getTokens__Native();
                this.tokens__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tokens;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getTokens(), false, (ArchivingHandler) new EnumHandler(SpeakerPhraseToken.class));
            archive.add(getText(), false);
            archive.add((Archive) getLanguage(), false, (Class<Archive>) AnnotationLanguage.class);
            archive.add((Archive) getPhraseFlags(), true, (Class<Archive>) PhraseFlags.class);
            return;
        }
        this.tokens = archive.add((List) this.tokens, false, (ArchivingHandler) new EnumHandler(SpeakerPhraseToken.class));
        this.tokens__is_initialized = true;
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        this.language = (AnnotationLanguage) archive.add((Archive) this.language, false, (Class<Archive>) AnnotationLanguage.class);
        this.language__is_initialized = true;
        PhraseFlags phraseFlags = (PhraseFlags) archive.add((Archive) this.phraseFlags, true, (Class<Archive>) PhraseFlags.class);
        this.phraseFlags = phraseFlags;
        this.phraseFlags__is_initialized = true;
        this.nativeObject = init(this.tokens, this.text, this.language, phraseFlags);
    }

    public LocalizedPhrase() {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
        this.phraseFlags__is_initialized = false;
    }

    private LocalizedPhrase(NativeObject nativeObject) {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
        this.phraseFlags__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public LocalizedPhrase(List<SpeakerPhraseToken> list, String str, AnnotationLanguage annotationLanguage) {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
        this.phraseFlags__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tokens\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (annotationLanguage != null) {
            this.nativeObject = initPublic(list, str, annotationLanguage);
            this.tokens = list;
            this.tokens__is_initialized = true;
            this.text = str;
            this.text__is_initialized = true;
            this.language = annotationLanguage;
            this.language__is_initialized = true;
            return;
        }
        ny61.g("Required field \"language\" cannot be null");
        throw null;
    }
}
