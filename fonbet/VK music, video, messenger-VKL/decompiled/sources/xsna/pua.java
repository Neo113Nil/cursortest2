package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.common.AvatarAction;

/* compiled from: ChannelAvatarHelper.kt */
/* loaded from: classes16.dex */
public final class pua {
    public final long a;
    public final bc6 b;
    public final ecb c;
    public final a1w d;
    public final mxv e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: ChannelAvatarHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.CHANGE_BY_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarAction.CHANGE_BY_GALLERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pua(long j, bc6 bc6Var, ecb ecbVar, a1w a1wVar, mxv mxvVar) {
        this.a = j;
        this.b = bc6Var;
        this.c = ecbVar;
        this.d = a1wVar;
        this.e = mxvVar;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void b(String str) {
        if (hg1.d(this.g)) {
            return;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        io.reactivex.rxjava3.internal.operators.single.c C = this.d.C("ecb", new bva(Peer.a.b(this.a), str));
        asu0 asu0Var = asu0.a;
        int i = 10;
        io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new js1(new t9(this, 15), i)), new oua(this, 0));
        int i2 = 16;
        io.reactivex.rxjava3.disposables.c subscribe = jVar.subscribe(new j22(new pd(this, i2), i), new gf0(new ns1(this, i2), 7));
        this.f.b(subscribe);
        this.g = subscribe;
    }
}
