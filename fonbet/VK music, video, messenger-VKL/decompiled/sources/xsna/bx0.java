package xsna;

import com.vk.music.player.PlayState;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tzp0;

/* compiled from: AdsItemFeature.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class bx0 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((yw0) this.receiver).a());
            case 1:
                rt40 rt40Var = (rt40) this.receiver;
                tzp0.c.a aVar = rt40.s1;
                u2b0 u2b0Var = rt40Var.getFeature().h.d;
                return new Pair(u2b0Var.b(), Boolean.valueOf(u2b0Var.m0() == PlayState.PLAYING));
            default:
                ((h7p0) this.receiver).a();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(Object obj) {
        super(0, obj, h7p0.class, "drawerIconClick", "drawerIconClick()V", 0);
        this.b = 2;
    }
}
