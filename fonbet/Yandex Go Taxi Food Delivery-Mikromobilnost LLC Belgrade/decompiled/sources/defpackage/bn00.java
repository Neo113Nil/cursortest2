package defpackage;

import com.yandex.mapkit.map.CameraPosition;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;

/* loaded from: classes9.dex */
public final class bn00 implements muw {
    public CameraPosition a;
    public List b;

    public bn00(int i) {
        this.a = new CameraPosition();
        this.b = EmptyList.a;
    }

    @Override // defpackage.muw
    public final ro00 a() {
        return ro00.d;
    }

    @Override // defpackage.muw
    public final List b() {
        return b.t(new yw01(new h73(1, this.b), new weu(6, this)));
    }

    public bn00() {
        this(0);
    }
}
