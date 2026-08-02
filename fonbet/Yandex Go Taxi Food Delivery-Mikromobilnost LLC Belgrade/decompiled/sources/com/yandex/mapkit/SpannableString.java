package com.yandex.mapkit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SpannableString implements Serializable {
    private NativeObject nativeObject;
    private List<Span> spans;
    private boolean spans__is_initialized;
    private String text;
    private boolean text__is_initialized;

    public SpannableString(String str, List<Span> list) {
        this.text__is_initialized = false;
        this.spans__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"spans\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.text = str;
        this.text__is_initialized = true;
        this.spans = list;
        this.spans__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::SpannableString";
    }

    private native List<Span> getSpans__Native();

    private native String getText__Native();

    private native NativeObject init(String str, List<Span> list);

    public synchronized List<Span> getSpans() {
        try {
            if (!this.spans__is_initialized) {
                this.spans = getSpans__Native();
                this.spans__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.spans;
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getText(), false);
            nzs.m(Span.class, archive, getSpans(), false);
            return;
        }
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        List<Span> e = nzs.e(Span.class, archive, this.spans, false);
        this.spans = e;
        this.spans__is_initialized = true;
        this.nativeObject = init(this.text, e);
    }

    public static class Span implements Serializable {
        private int begin;
        private int end;

        public Span(int i, int i2) {
            this.begin = i;
            this.end = i2;
        }

        public int getBegin() {
            return this.begin;
        }

        public int getEnd() {
            return this.end;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.begin = archive.add(this.begin);
            this.end = archive.add(this.end);
        }

        public Span() {
        }
    }

    public SpannableString() {
        this.text__is_initialized = false;
        this.spans__is_initialized = false;
    }

    private SpannableString(NativeObject nativeObject) {
        this.text__is_initialized = false;
        this.spans__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
