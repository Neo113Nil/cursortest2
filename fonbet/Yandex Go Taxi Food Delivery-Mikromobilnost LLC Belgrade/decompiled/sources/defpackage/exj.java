package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes10.dex */
public abstract class exj {
    public static final dxj a;
    public static final dxj b;
    public static final dxj c;

    static {
        new dxj(0);
        a = new dxj(1);
        b = new dxj(2);
        new dxj(3);
        c = new dxj(4);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
