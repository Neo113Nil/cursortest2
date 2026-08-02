package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.upload.impl.UploadNotification;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VerticalizationServerTask.kt */
/* loaded from: classes16.dex */
public final class eqr0 {
    public final String a;
    public final UserId b;
    public final aha0 c = new aha0();
    public String d;
    public Integer e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public final Object h;
    public final Object i;

    /* compiled from: VerticalizationServerTask.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eqr0(String str, UserId userId) {
        this.a = str;
        this.b = userId;
        cy20 cy20Var = new cy20(19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, cy20Var);
        this.i = msy.a(lazyThreadSafetyMode, new e1m0(7));
    }

    public final void a(String str) {
        if (str == null) {
            return;
        }
        itg0.k(rsg0.W(yfb.x(zga0.p(this.c, this.b, null, Collections.singletonList(str), 2)), 7), null, new ha40(22), 1);
    }

    public final void b(String str, long j, e9i0 e9i0Var, u5p0 u5p0Var) {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = io.reactivex.rxjava3.core.q.C0(j, TimeUnit.MILLISECONDS, asu0.a.c()).L(new b630(new z43(this, str), 17), false).subscribe(new f2u(new ii80(this, u5p0Var, e9i0Var, str, 2), 25), new j990(new exi0(u5p0Var, 19), 15));
    }
}
