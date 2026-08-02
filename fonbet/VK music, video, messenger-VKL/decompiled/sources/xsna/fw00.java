package xsna;

import android.app.Activity;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fw00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fw00(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                gw00 gw00Var = (gw00) obj3;
                gw00Var.f.b.b.d.j(new uu00(gw00Var.c, (Good) obj2, (UIBlock) obj, gw00Var.j));
                return s3q0.a;
            case 1:
                mj80 mj80Var = (mj80) obj3;
                mj80Var.t = null;
                mj80Var.e.invoke().post(new xq8(2, mj80Var, new com.vk.movika.sdk.base.ui.z(11, new k14((com.vk.movika.sdk.base.ui.r) obj2, mj80Var, (com.vk.movika.sdk.player.base.model.a) obj, 7), mj80Var)));
                return s3q0.a;
            case 2:
                ArrayList<u1c0> arrayList = (ArrayList) obj3;
                PromoPost promoPost = (PromoPost) obj2;
                ?? r0 = ((com.vk.newsfeed.common.util.j) obj).C;
                if (!arrayList.isEmpty()) {
                    for (u1c0 u1c0Var : arrayList) {
                        if (epx.f(u1c0Var.b, promoPost)) {
                            Post R = di60.R(promoPost);
                            z = true;
                            if (R == null || !R.gc()) {
                                Set<Integer> set = v0n.k;
                                int i2 = u1c0Var.c;
                                DisclaimerContent disclaimerContent = promoPost.F;
                                if (((((disclaimerContent != DisclaimerContent.TEXT_WITH_CONTENT && disclaimerContent != DisclaimerContent.CARDS) || !v0n.k.contains(Integer.valueOf(i2))) && (!v0n.l.contains(Integer.valueOf(i2)) || disclaimerContent != DisclaimerContent.TEXT)) || ((Boolean) r0.getValue()).booleanValue()) && !((Boolean) r0.getValue()).booleanValue()) {
                                }
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                s6s0 s6s0Var = (s6s0) obj2;
                y6s0 y6s0Var = (y6s0) obj;
                fxc0.B().g0((Activity) obj3, s6s0Var.a, UserId.d, new fk(15, s6s0Var, y6s0Var), new v74(28, y6s0Var, s6s0Var));
                return s3q0.a;
            case 4:
                qgp0 qgp0Var = (qgp0) obj3;
                MusicTrack musicTrack = (MusicTrack) obj2;
                UserId userId = (UserId) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " query storage of mid=" + musicTrack.Fb()});
                }
                return qgp0Var.b.d(musicTrack.Fb());
            default:
                ((izs) obj3).invoke(new c.a(((vst0) obj2).b, p490.C((tny) ((bpf0) obj).a())));
                return s3q0.a;
        }
    }
}
