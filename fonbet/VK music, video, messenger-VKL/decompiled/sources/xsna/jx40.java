package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicPlayerHelperImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx40 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx40(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ct4) this.receiver).a();
            case 1:
                return ((vuj0) this.receiver).c;
            case 2:
                ((fsk0) this.receiver).b();
                return s3q0.a;
            default:
                return Boolean.valueOf(((b25) this.receiver).b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx40(Object obj) {
        super(0, obj, ct4.class, "getPlayer", "getPlayer()Lcom/vk/music/player/api/helper/AudioPlayer;", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx40(fsk0 fsk0Var) {
        super(0, fsk0Var, fsk0.class, "clear", "clear()V", 0);
        this.b = 2;
    }
}
