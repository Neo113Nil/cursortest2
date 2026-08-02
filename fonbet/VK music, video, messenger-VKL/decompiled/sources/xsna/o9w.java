package xsna;

import com.vk.core.preference.Preference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class o9w implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ o9w() {
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                Preference.I("notifications_prefs", "enable_only_messenger_notifications", false);
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.x(new ya80(null));
                break;
            default:
                s3q0 s3q0Var = s3q0.a;
                break;
        }
    }

    public /* synthetic */ o9w(d230 d230Var) {
    }
}
