package xsna;

import com.vk.log.L;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerInvalidateMessage;
import com.vk.music.player.PlayerTrack;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.s2b0;

/* compiled from: PlayerMessageHandler.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2b0 extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2b0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                s2b0 s2b0Var = (s2b0) this.receiver;
                r2b0 r2b0Var = s2b0Var.a;
                r2b0 r2b0Var2 = s2b0Var.a;
                gj80 gj80Var = r2b0Var.g;
                switch (s2b0.a.$EnumSwitchMapping$0[((PlayerInvalidateMessage) obj).ordinal()]) {
                    case 1:
                        PlayState playState = (PlayState) r2b0Var.e.invoke();
                        if (playState != s2b0Var.d) {
                            s2b0Var.d = playState;
                            bn40.f("PlayerStateChanged: " + playState.name());
                        }
                        Iterator it = ((e2b0) gj80Var.c).d.iterator();
                        while (it.hasNext()) {
                            ((com.vk.music.player.e) it.next()).N3(playState, ((e2b0) r2b0Var2.c.c).e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        break;
                    case 2:
                        wt30 wt30Var = r2b0Var.d;
                        e2b0 e2b0Var = (e2b0) r2b0Var.b.c;
                        List<PlayerTrack> list = (List) wt30Var.invoke();
                        e2b0Var.y.getClass();
                        try {
                            Iterator it2 = ((e2b0) gj80Var.c).d.iterator();
                            while (it2.hasNext()) {
                                ((com.vk.music.player.e) it2.next()).y4(list);
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            break;
                        } finally {
                            e2b0Var.y.getClass();
                        }
                    case 3:
                        Iterator it3 = ((e2b0) gj80Var.c).d.iterator();
                        while (it3.hasNext()) {
                            ((com.vk.music.player.e) it3.next()).W3((com.vk.music.player.f) r2b0Var2.c.invoke());
                            s3q0 s3q0Var3 = s3q0.a;
                        }
                        break;
                    case 4:
                        Iterator it4 = ((e2b0) gj80Var.c).d.iterator();
                        while (it4.hasNext()) {
                            ((com.vk.music.player.e) it4.next()).o2((com.vk.music.player.f) r2b0Var2.c.invoke());
                            s3q0 s3q0Var4 = s3q0.a;
                        }
                        break;
                    case 5:
                        Iterator it5 = ((e2b0) gj80Var.c).d.iterator();
                        while (it5.hasNext()) {
                            ((com.vk.music.player.e) it5.next()).z3();
                            s3q0 s3q0Var5 = s3q0.a;
                        }
                        break;
                    case 6:
                        Iterator it6 = ((e2b0) gj80Var.c).d.iterator();
                        while (it6.hasNext()) {
                            ((com.vk.music.player.e) it6.next()).K1();
                            s3q0 s3q0Var6 = s3q0.a;
                        }
                        break;
                    case 7:
                        Iterator it7 = ((e2b0) gj80Var.c).d.iterator();
                        while (it7.hasNext()) {
                            ((com.vk.music.player.e) it7.next()).n3();
                            s3q0 s3q0Var7 = s3q0.a;
                        }
                        break;
                    case 8:
                        Iterator it8 = ((e2b0) gj80Var.c).d.iterator();
                        while (it8.hasNext()) {
                            ((com.vk.music.player.e) it8.next()).B1();
                            s3q0 s3q0Var8 = s3q0.a;
                        }
                        break;
                    case 9:
                        Iterator it9 = ((e2b0) gj80Var.c).d.iterator();
                        while (it9.hasNext()) {
                            com.vk.music.player.e eVar = (com.vk.music.player.e) it9.next();
                            r2b0Var2.a.invoke();
                            eVar.onError(null);
                            s3q0 s3q0Var9 = s3q0.a;
                        }
                        break;
                    case 10:
                        Iterator it10 = ((e2b0) gj80Var.c).d.iterator();
                        while (it10.hasNext()) {
                            com.vk.music.player.e eVar2 = (com.vk.music.player.e) it10.next();
                            ((Number) r2b0Var2.f.invoke()).floatValue();
                            eVar2.x0();
                            s3q0 s3q0Var10 = s3q0.a;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            default:
                L.E((Throwable) obj, new Object[0]);
                return s3q0.a;
        }
    }
}
