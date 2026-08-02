package xsna;

import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LiveLongPollController.java */
/* loaded from: classes3.dex */
public final class wjz {
    public static volatile wjz c;
    public final i000 a;

    @Nullable
    public final AtomicInteger b;

    public wjz() {
        i000 i000Var = new i000();
        this.a = i000Var;
        this.b = i000Var.a ? new AtomicInteger(0) : null;
    }

    public static wjz a() {
        if (c == null) {
            synchronized (wjz.class) {
                try {
                    if (c == null) {
                        c = new wjz();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.z2 b(final int i, final UserId userId) {
        io.reactivex.rxjava3.internal.operators.observable.t tVar = new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.ujz
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                wjz.this.a.a("getting new LongPoll server...");
                mm4 mm4Var = new mm4("video.getLongPollServer");
                mm4Var.F(userId, "owner_id");
                mm4Var.C(i, "video_id");
                mm4Var.C(1, "extended");
                mm4Var.K("fields", "thumb_256");
                ahn.D(mm4Var);
                return rsg0.y0(mm4Var, null, null, 3);
            }
        });
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.core.q<R> L = xa4.G(tVar.r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F0(asu0Var.c()), 2700L, 60000L, Integer.MAX_VALUE, new kpr(22), new wni(5), new kz0(27), io.reactivex.rxjava3.schedulers.a.a()).L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.tjz
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                String str = (String) obj;
                wjz wjzVar = wjz.this;
                i000 i000Var = wjzVar.a;
                StringBuilder sb = new StringBuilder("new LongPoll server: ");
                sb.append(str);
                sb.append(" (for ");
                UserId userId2 = userId;
                sb.append(userId2);
                sb.append(BundleUtil.UNDERLINE_TAG);
                int i2 = i;
                i000Var.a(h5s.c(i2, ")", sb));
                io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.c2(new io.reactivex.rxjava3.internal.operators.observable.z1(new io.reactivex.rxjava3.internal.operators.observable.q(new vjz(wjzVar, str, i2, userId2)), new n0g0(300)), new fo50()).U(new com.vk.movika.sdk.android.defaultplayer.view.a(wjzVar, 19));
                asu0 asu0Var2 = asu0.a;
                return U.r0(asu0Var2.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F0(asu0Var2.c());
            }
        }, false);
        ffg0 ffg0Var = new ffg0();
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c2(L, ffg0Var).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F0(asu0Var.c());
    }
}
