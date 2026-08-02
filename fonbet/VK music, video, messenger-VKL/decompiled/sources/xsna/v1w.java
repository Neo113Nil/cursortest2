package xsna;

import com.vkontakte.android.VKApplication;
import java.util.concurrent.ForkJoinPool;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class v1w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ v1w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((p680) obj).c);
            case 1:
                if (!pk90.c.get()) {
                    asu0.a.getClass();
                    asu0.n().submit(new vt70());
                }
                new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
                return s3q0.a;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                return new ForkJoinPool((Runtime.getRuntime().availableProcessors() * 2) - 1, new kvu0("vk-parallel-startup-", booleanValue ? -15 : null), null, true);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                Regex regex = pev0.k;
                return Boolean.FALSE;
        }
    }
}
