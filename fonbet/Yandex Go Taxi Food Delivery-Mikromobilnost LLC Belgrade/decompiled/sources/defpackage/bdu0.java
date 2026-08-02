package defpackage;

import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class bdu0 {
    public final to3 a;
    public final pcu0 b;
    public final jdu0 c;
    public final kcu0 d;
    public final at2 e;
    public xo3 f;

    public bdu0(to3 to3Var, pcu0 pcu0Var, jdu0 jdu0Var, kcu0 kcu0Var, at2 at2Var) {
        this.a = to3Var;
        this.b = pcu0Var;
        this.c = jdu0Var;
        this.d = kcu0Var;
        this.e = at2Var;
        jdu0Var.a(at2Var.r().b());
    }

    public final void a(long j, String[] strArr) {
        adu0 adu0Var = new adu0(this);
        xo3 xo3Var = this.f;
        if (xo3Var != null) {
            xo3Var.cancel();
        }
        to3 to3Var = this.a;
        to3Var.getClass();
        StickerPacksBucket stickerPacksBucket = new StickerPacksBucket();
        stickerPacksBucket.version = j;
        StickerPacksBucket.Value value = new StickerPacksBucket.Value();
        stickerPacksBucket.value = value;
        value.packIds = strArr;
        this.f = to3Var.d(StickerPacksBucket.class, adu0Var, stickerPacksBucket);
    }

    public final void b(StickerPacksBucket stickerPacksBucket) {
        if (stickerPacksBucket == null) {
            return;
        }
        String[] strArr = stickerPacksBucket.value.packIds;
        at2 at2Var = this.e;
        if (Arrays.equals(strArr, at2Var.r().b())) {
            return;
        }
        at2Var.P(new scs0(18, strArr, stickerPacksBucket));
        this.c.a(strArr);
        this.d.a(strArr);
    }
}
