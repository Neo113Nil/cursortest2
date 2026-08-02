package defpackage;

import com.yandex.go.safety.center.car.crash.status.SafetyCenterCarCrashStatusAnswerPresenter$openCarCrashInstruction$$inlined$safeCollectIn$1;
import com.yandex.go.safety.center.car.crash.status.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class gql0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ gql0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                tje.N(aVar.Jg(), null, null, new SafetyCenterCarCrashStatusAnswerPresenter$openCarCrashInstruction$$inlined$safeCollectIn$1(aVar.C.o, null, aVar), 3);
                break;
            case 1:
                tje.N(aVar.Jg(), null, null, new SafetyCenterCarCrashStatusAnswerPresenter$openCarCrashInstruction$$inlined$safeCollectIn$1(aVar.C.o, null, aVar), 3);
                break;
            default:
                aVar.onBackPressed();
                break;
        }
    }
}
