package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;
import xsna.sqm0;

/* compiled from: DocumentType.java */
/* loaded from: classes8.dex */
public final class f extends i {
    public final boolean E(String str) {
        return !sqm0.c(c(str));
    }

    @Override // org.jsoup.nodes.j
    public final String s() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.j
    public final void v(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (this.c > 0 && outputSettings.f) {
            appendable.append('\n');
        }
        if (outputSettings.i != Document.OutputSettings.Syntax.html || E("publicId") || E("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (E("name")) {
            appendable.append(" ").append(c("name"));
        }
        if (E("pubSysKey")) {
            appendable.append(" ").append(c("pubSysKey"));
        }
        if (E("publicId")) {
            appendable.append(" \"").append(c("publicId")).append('\"');
        }
        if (E("systemId")) {
            appendable.append(" \"").append(c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // org.jsoup.nodes.j
    public final void w(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
