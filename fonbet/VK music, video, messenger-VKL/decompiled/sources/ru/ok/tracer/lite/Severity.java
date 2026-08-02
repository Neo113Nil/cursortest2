package ru.ok.tracer.lite;

import xsna.zcl;

/* compiled from: Severity.kt */
/* loaded from: classes9.dex */
public final class Severity {
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Severity FATAL = new Severity("FATAL");
    public static final Severity ERROR = new Severity("ERROR");
    public static final Severity WARNING = new Severity("WARNING");
    public static final Severity NOTICE = new Severity("NOTICE");
    public static final Severity INFO = new Severity("INFO");
    public static final Severity DEBUG = new Severity("DEBUG");

    /* compiled from: Severity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private Severity(String str) {
        this.name = str;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
