package xsna;

import com.vk.auth.api.models.AuthResult;

/* compiled from: AuthCallbackAsync.kt */
/* loaded from: classes.dex */
public interface t25 extends s25 {

    /* compiled from: AuthCallbackAsync.kt */
    /* loaded from: classes15.dex */
    public interface a {
        void onComplete();
    }

    void c(AuthResult authResult, a aVar);
}
