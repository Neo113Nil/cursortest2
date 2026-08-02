package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: HlsPlaylist.java */
/* loaded from: classes.dex */
public abstract class o9v implements uer<o9v> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    public o9v(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
