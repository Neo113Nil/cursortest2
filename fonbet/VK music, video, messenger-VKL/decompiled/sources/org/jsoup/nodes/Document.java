package org.jsoup.nodes;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.j;
import xsna.ad0;
import xsna.c0o0;
import xsna.kir0;
import xsna.od50;
import xsna.q7o;
import xsna.sqm0;
import xsna.zvk;

/* loaded from: classes8.dex */
public final class Document extends g {
    public OutputSettings k;
    public od50 l;
    public QuirksMode m;

    public static class OutputSettings implements Cloneable {
        public Entities.b e;
        public Entities.EscapeMode b = Entities.EscapeMode.base;
        public Charset c = zvk.a;
        public final ThreadLocal<CharsetEncoder> d = new ThreadLocal<>();
        public boolean f = true;
        public final int g = 1;
        public final int h = 30;
        public final Syntax i = Syntax.html;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Syntax {
            private static final /* synthetic */ Syntax[] $VALUES;
            public static final Syntax html;
            public static final Syntax xml;

            static {
                Syntax syntax = new Syntax("html", 0);
                html = syntax;
                Syntax syntax2 = new Syntax("xml", 1);
                xml = syntax2;
                $VALUES = new Syntax[]{syntax, syntax2};
            }

            public Syntax() {
                throw null;
            }

            public static Syntax valueOf(String str) {
                return (Syntax) Enum.valueOf(Syntax.class, str);
            }

            public static Syntax[] values() {
                return (Syntax[]) $VALUES.clone();
            }
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                String name = this.c.name();
                outputSettings.getClass();
                outputSettings.c = Charset.forName(name);
                outputSettings.b = Entities.EscapeMode.valueOf(this.b.name());
                return outputSettings;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public final CharsetEncoder e() {
            CharsetEncoder newEncoder = this.c.newEncoder();
            this.d.set(newEncoder);
            String name = newEncoder.charset().name();
            this.e = name.equals(C.ASCII_NAME) ? Entities.b.ascii : name.startsWith("UTF-") ? Entities.b.utf : Entities.b.fallback;
            return newEncoder;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QuirksMode {
        private static final /* synthetic */ QuirksMode[] $VALUES;
        public static final QuirksMode limitedQuirks;
        public static final QuirksMode noQuirks;
        public static final QuirksMode quirks;

        static {
            QuirksMode quirksMode = new QuirksMode("noQuirks", 0);
            noQuirks = quirksMode;
            QuirksMode quirksMode2 = new QuirksMode("quirks", 1);
            quirks = quirksMode2;
            QuirksMode quirksMode3 = new QuirksMode("limitedQuirks", 2);
            limitedQuirks = quirksMode3;
            $VALUES = new QuirksMode[]{quirksMode, quirksMode2, quirksMode3};
        }

        public QuirksMode() {
            throw null;
        }

        public static QuirksMode valueOf(String str) {
            return (QuirksMode) Enum.valueOf(QuirksMode.class, str);
        }

        public static QuirksMode[] values() {
            return (QuirksMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Document(String str) {
        super(r2, str, null);
        HashMap hashMap = c0o0.k;
        c0o0 c0o0Var = (c0o0) hashMap.get("#root");
        if (c0o0Var == null) {
            String C = ad0.C("#root");
            kir0.b(C);
            c0o0Var = (c0o0) hashMap.get(ad0.C(C));
            if (c0o0Var == null) {
                c0o0Var = new c0o0(C);
                c0o0Var.d = false;
            }
        }
        this.k = new OutputSettings();
        this.m = QuirksMode.noQuirks;
        this.l = new od50(new org.jsoup.parser.a());
    }

    @Override // org.jsoup.nodes.g
    /* renamed from: F */
    public final g clone() {
        Document document = (Document) super.clone();
        document.k = this.k.clone();
        return document;
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.j
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        document.k = this.k.clone();
        return document;
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.j
    public final j k() {
        Document document = (Document) super.clone();
        document.k = this.k.clone();
        return document;
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.j
    public final String s() {
        return "#document";
    }

    @Override // org.jsoup.nodes.j
    public final String u() {
        StringBuilder a = sqm0.a();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            j jVar = this.g.get(i);
            Document x = jVar.x();
            if (x == null) {
                x = new Document("");
            }
            q7o.j(new j.a(a, x.k), jVar);
        }
        String d = sqm0.d(a);
        Document x2 = x();
        if (x2 == null) {
            x2 = new Document("");
        }
        return x2.k.f ? d.trim() : d;
    }
}
