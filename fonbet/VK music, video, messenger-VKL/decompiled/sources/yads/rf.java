package yads;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class rf extends Lambda implements gzs {
    public static final rf b = new rf();

    public rf() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new Regex("^\"(.*)\"\\s+(.+?)?\\s*prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)$");
    }
}
