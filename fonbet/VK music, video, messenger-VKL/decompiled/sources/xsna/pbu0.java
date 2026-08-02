package xsna;

import com.vk.api.generated.auth.dto.AuthOnSuccessValidationResponseDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;

/* compiled from: SignUpStrategy.kt */
/* loaded from: classes.dex */
public interface pbu0 {
    void a(io.reactivex.rxjava3.core.q<AuthOnSuccessValidationResponseDto> qVar, String str, String str2, String str3);

    void b(io.reactivex.rxjava3.core.q<AuthResult> qVar);

    void c(String str, SignUpData signUpData, io.reactivex.rxjava3.core.q<AuthResult> qVar);

    /* compiled from: SignUpStrategy.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public static final C3503a a = new C3503a();

        /* compiled from: SignUpStrategy.kt */
        /* renamed from: xsna.pbu0$a$a, reason: collision with other inner class name */
        public static final class C3503a implements pbu0 {
            @Override // xsna.pbu0
            public final void b(io.reactivex.rxjava3.core.q<AuthResult> qVar) {
            }

            @Override // xsna.pbu0
            public final void c(String str, SignUpData signUpData, io.reactivex.rxjava3.core.q<AuthResult> qVar) {
            }

            @Override // xsna.pbu0
            public final void a(io.reactivex.rxjava3.core.q<AuthOnSuccessValidationResponseDto> qVar, String str, String str2, String str3) {
            }
        }
    }
}
