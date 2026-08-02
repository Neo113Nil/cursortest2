package yads;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class nf extends Lambda implements gzs {
    public static final nf b = new nf();

    public nf() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
