package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PollDao_Impl.kt */
/* loaded from: classes6.dex */
public final class mnb0 implements lnb0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PollDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ypb0 ypb0Var = (ypb0) obj;
            qyg0Var.bindLong(1, ypb0Var.a);
            bpn0 bpn0Var = ssj.a;
            qyg0Var.D3(2, ((Gson) ssj.a.getValue()).toJson(ypb0Var.b));
            if (ypb0Var.c == null) {
                qyg0Var.bindNull(3);
            } else {
                qyg0Var.bindLong(3, r0.intValue());
            }
            String str = ypb0Var.d;
            if (str == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.D3(4, str);
            }
            String str2 = ypb0Var.e;
            if (str2 == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, str2);
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `polls` (`id`,`triggers`,`initialHeight`,`status`,`metadata`) VALUES (?,?,?,?,?)";
        }
    }

    /* compiled from: PollDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public mnb0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    @Override // xsna.lnb0
    public final Object a(String str, p5r0 p5r0Var) {
        return u370.g(this.a, p5r0Var, new rdh(str, 1), true, false);
    }

    @Override // xsna.lnb0
    public final Object b(s5r0 s5r0Var) {
        return u370.g(this.a, s5r0Var, new av70(2), true, false);
    }

    @Override // xsna.lnb0
    public final Object c(ContinuationImpl continuationImpl) {
        Object g = u370.g(this.a, continuationImpl, new d0k(21), false, true);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }

    @Override // xsna.lnb0
    public final Object d(List list, ContinuationImpl continuationImpl) {
        Object g = u370.g(this.a, continuationImpl, new ma(26, this, list), false, true);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }

    @Override // xsna.lnb0
    public final Object e(ArrayList arrayList, p5r0 p5r0Var) {
        StringBuilder e = fw3.e("DELETE FROM polls WHERE id in (");
        e370.c(arrayList.size(), e);
        e.append(")");
        Object g = u370.g(this.a, p5r0Var, new l22(27, e.toString(), (Object) arrayList), false, true);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }
}
