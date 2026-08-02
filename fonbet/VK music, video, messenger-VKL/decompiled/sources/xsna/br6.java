package xsna;

import one.video.player.BaseVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class br6 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ br6(float f, Float f2) {
        this.c = f;
        this.d = f2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        float f = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                vw3 vw3Var = BaseVideoPlayer.H;
                return "Volume adjusted " + f + " -> " + ((Float) obj);
            default:
                return Float.valueOf(((azl) obj).I0(f));
        }
    }

    public /* synthetic */ br6(float f, azl azlVar) {
        this.d = azlVar;
        this.c = f;
    }
}
