package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qqb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ qqb(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        yvv yvvVar;
        switch (this.b) {
            case 0:
                ChatFragment.d dVar = ChatFragment.w1;
                if (BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
                    return;
                }
                ChatFragment.d dVar2 = ChatFragment.w1;
                yvvVar.b();
                throw null;
            default:
                return;
        }
    }

    private final void a() {
    }
}
