package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public abstract class chb1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(tn9 tn9Var, f530 f530Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        bts btsVar;
        f530 f530Var3;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1912722883);
        int i3 = i | (btsVar2.e(tn9Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            if (btsVar2.V(i3 & 1, (i3 & 19) == 18)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                f530 f530Var4 = i4 != 0 ? c530.a : f530Var2;
                btsVar = btsVar2;
                qgy.b(tn9Var.a, null, an91.n(bzk0.c(ymb1.l(f530Var4, cyk0.c(100.0f)), new up2(rzo.d(tn9Var.b)), qke.q), 6.0f, 3.0f, 6.0f, 4.0f), null, uh6.E(13), 0L, null, 0L, 0, 0, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 16362);
                f530Var3 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new q12(i, i2, 2, tn9Var, f530Var3);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if (btsVar2.V(i3 & 1, (i3 & 19) == 18)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(nuz nuzVar, final Consumer consumer, final Consumer consumer2) {
        euz euzVar = nuzVar.d;
        if (euzVar != null) {
            nsz nszVar = euzVar.a;
            if (nszVar != null) {
                consumer.accept(nszVar);
                return;
            }
            Throwable th = euzVar.b;
            if (th != null) {
                if (consumer2 != null) {
                    consumer2.accept(th);
                    return;
                }
                return;
            }
        }
        if (consumer2 != null) {
            final int i = 0;
            nuzVar.a(new xtz() { // from class: gsz
                @Override // defpackage.xtz
                public final void onResult(Object obj) {
                    int i2 = i;
                    Consumer consumer3 = consumer2;
                    switch (i2) {
                        case 0:
                            consumer3.accept((Throwable) obj);
                            break;
                        default:
                            consumer3.accept(obj);
                            break;
                    }
                }
            });
        }
        final int i2 = 1;
        nuzVar.b(new xtz() { // from class: gsz
            @Override // defpackage.xtz
            public final void onResult(Object obj) {
                int i22 = i2;
                Consumer consumer3 = consumer;
                switch (i22) {
                    case 0:
                        consumer3.accept((Throwable) obj);
                        break;
                    default:
                        consumer3.accept(obj);
                        break;
                }
            }
        });
    }

    public static final Object c(nuz nuzVar, ContinuationImpl continuationImpl) {
        euz euzVar = nuzVar.d;
        if (euzVar != null) {
            nsz nszVar = euzVar.a;
            if (nszVar != null) {
                return nszVar;
            }
            Throwable th = euzVar.b;
            if (th != null) {
                throw th;
            }
        }
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        isz iszVar = new isz(atomicBoolean, j18Var, 1);
        isz iszVar2 = new isz(atomicBoolean, j18Var, 0);
        nuzVar.b(iszVar);
        nuzVar.a(iszVar2);
        j18Var.w(new hsz(atomicBoolean, nuzVar, iszVar, iszVar2, 0));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static Object d(Context context, String str, Continuation continuation) {
        return c(ssz.f(context, context.getResources().getIdentifier(str, "raw", context.getPackageName()), null), (ContinuationImpl) continuation);
    }

    public static void e(Context context, String str, Consumer consumer, c90 c90Var, int i) {
        if ((i & 8) != 0) {
            c90Var = null;
        }
        b(ssz.f(context, context.getResources().getIdentifier(str, "raw", context.getPackageName()), null), consumer, c90Var);
    }

    public static final void f(LottieAnimationView lottieAnimationView, nsz nszVar, you0 you0Var) {
        if (lottieAnimationView.getWidth() == 0 || lottieAnimationView.getHeight() == 0) {
            c.e(lottieAnimationView, new p7h(26, lottieAnimationView, nszVar, you0Var));
            return;
        }
        lottieAnimationView.setComposition(nszVar);
        if (you0Var != null) {
            you0Var.run();
        }
    }

    public static final void g(LottieAnimationView lottieAnimationView) {
        if (lottieAnimationView.getFrame() < lottieAnimationView.getMaxFrame() || lottieAnimationView.getRepeatCount() != 0) {
            lottieAnimationView.resumeAnimation();
        }
    }

    public static Writer h(StringBuilder sb) {
        return new yru0(sb);
    }
}
