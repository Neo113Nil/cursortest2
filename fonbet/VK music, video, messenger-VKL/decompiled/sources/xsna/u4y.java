package xsna;

import com.vk.auth.main.LibverifyListener;
import xsna.s3z;

/* compiled from: JsLibverifyInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class u4y implements LibverifyListener {
    public final /* synthetic */ v4y a;

    public u4y(v4y v4yVar) {
        this.a = v4yVar;
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void a(Integer num, String str) {
        if (num != null) {
            this.a.c(new s3z.a(num.intValue()));
        }
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void b(String str, String str2) {
        this.a.c(new s3z.b(str, str2));
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void c(LibverifyListener.State state) {
        xgx0.a.getClass();
        xgx0.f("[JsLibverifyDelegateImpl] onStateChanged");
        v4y v4yVar = this.a;
        s3z s3zVar = v4yVar.d;
        boolean z = (s3zVar instanceof s3z.d) || (s3zVar instanceof s3z.c);
        if (state == LibverifyListener.State.ENTER_SMS_CODE && z) {
            v4yVar.c(s3z.f.a);
        }
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void d(boolean z) {
        this.a.c(z ? s3z.e.a : s3z.f.a);
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void g(LibverifyListener.a aVar) {
        this.a.c(new s3z.c(aVar instanceof LibverifyListener.a.h ? 2 : aVar instanceof LibverifyListener.a.b ? 3 : aVar instanceof LibverifyListener.a.c ? 5 : aVar instanceof LibverifyListener.a.g ? 6 : aVar instanceof LibverifyListener.a.d ? 7 : aVar instanceof LibverifyListener.a.f ? 8 : aVar instanceof LibverifyListener.a.e ? 9 : 1));
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void onCompleted(String str, String str2, String str3) {
        this.a.c(new s3z.b(str2, str3));
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void onNotification(String str) {
        d3z d3zVar = this.a.a;
        if (d3zVar == null) {
            throw new IllegalStateException("OnStart should be called before calling other methods!");
        }
        d3zVar.b(str);
    }

    @Override // com.vk.auth.main.LibverifyListener
    public final void onProgress(boolean z) {
        this.a.b(z);
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
}
