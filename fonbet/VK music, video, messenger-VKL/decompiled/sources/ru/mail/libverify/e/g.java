package ru.mail.libverify.e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.VerifyRoute;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public class g implements Gsonable {

    @NonNull
    final b authMethod;

    @NonNull
    final VerifyApiRequest.a authType;

    @Nullable
    final VerifyRoute verifyRoute;

    private g() {
        this.authMethod = b.DEFAULT;
        this.authType = VerifyApiRequest.a.EMPTY;
        this.verifyRoute = null;
    }

    @NonNull
    public static g a() {
        return new g(b.DEFAULT, VerifyApiRequest.a.EMPTY, null);
    }

    @NonNull
    public static g b() {
        return new g(b.VKLOGIN, VerifyApiRequest.a.VKCONNECT, VerifyRoute.VKCLogin);
    }

    @NonNull
    public static g c() {
        return new g(b.RESEND, VerifyApiRequest.a.EMPTY, null);
    }

    @NonNull
    public static g d() {
        return new g(b.VKCONNECT, VerifyApiRequest.a.VKCONNECT, null);
    }

    @NonNull
    public final b e() {
        return this.authMethod;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.authMethod == gVar.authMethod && this.authType == gVar.authType && this.verifyRoute == gVar.verifyRoute) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public final VerifyApiRequest.a f() {
        return this.authType;
    }

    @Nullable
    public final VerifyRoute g() {
        return this.verifyRoute;
    }

    public final int hashCode() {
        int hashCode = (this.authType.hashCode() + (this.authMethod.hashCode() * 31)) * 31;
        VerifyRoute verifyRoute = this.verifyRoute;
        return hashCode + (verifyRoute != null ? verifyRoute.hashCode() : 0);
    }

    @NonNull
    public static g a(@NonNull VerifyRoute verifyRoute) {
        return new g(b.MANUAL, VerifyApiRequest.a.EMPTY, verifyRoute);
    }

    private g(@NonNull b bVar, @NonNull VerifyApiRequest.a aVar, @Nullable VerifyRoute verifyRoute) {
        this.authMethod = bVar;
        this.authType = aVar;
        this.verifyRoute = verifyRoute;
    }
}
