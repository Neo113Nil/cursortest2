package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;

/* compiled from: DataFrame.java */
/* loaded from: classes8.dex */
public final class lry0 extends wn4 {
    public ByteBuffer a = ByteBuffer.allocate(0);

    public final String toString() {
        return tgw.b(this.a.limit() - this.a.position(), "DataFrame[", X3.j.e);
    }
}
