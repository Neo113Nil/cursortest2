package yads;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class qf extends Lambda implements gzs {
    public static final qf b = new qf();

    public qf() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new Regex("at\\s+([^\\(]+)\\(([^:]+):(\\d+)\\)");
    }
}
