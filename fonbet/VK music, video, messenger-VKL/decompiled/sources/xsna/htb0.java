package xsna;

import com.vk.poll.fragments.PollVotersFragment;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.mlx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class htb0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ htb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                PollVotersFragment pollVotersFragment = (PollVotersFragment) obj5;
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                int i2 = PollVotersFragment.a0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(439680289, intValue2, -1, "com.vk.poll.fragments.PollVotersFragment.PollVotersContent.<anonymous>.<anonymous>.<anonymous> (PollVotersFragment.kt:162)");
                }
                if (intValue != 0) {
                    if (intValue != 1) {
                        aVar.K(-1141325279);
                    } else {
                        aVar.K(1625967612);
                        pollVotersFragment.ko(true, aVar, 6);
                    }
                    aVar.j();
                } else {
                    aVar.K(1625965405);
                    pollVotersFragment.ko(false, aVar, 6);
                    aVar.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            default:
                ((plx0) obj5).k.b(new mlx0.b((MediaOptionState) obj, (MediaOptionState) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
