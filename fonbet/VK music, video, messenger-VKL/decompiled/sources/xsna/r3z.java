package xsna;

import com.vk.auth.main.LibverifyListener;
import java.util.concurrent.CountDownLatch;

/* compiled from: LibverifySessionVerificationRequester.kt */
/* loaded from: classes15.dex */
public final class r3z implements LibverifyListener {
    public final /* synthetic */ dlv a;

    public r3z(dlv dlvVar) {
        this.a = dlvVar;
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void g(LibverifyListener.a aVar) {
        par0 par0Var = par0.a;
        String str = "[LibverifySession] session was not verified due to error: " + aVar.a();
        par0Var.getClass();
        par0.f(str);
        ((CountDownLatch) this.a.b).countDown();
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void c(LibverifyListener.State state) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void d(boolean z) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void onNotification(String str) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void onProgress(boolean z) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void a(Integer num, String str) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void b(String str, String str2) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void e(String str, String str2) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void h(Integer num, String str) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void f(Integer num, String str, String str2) {
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void onCompleted(String str, String str2, String str3) {
    }
}
