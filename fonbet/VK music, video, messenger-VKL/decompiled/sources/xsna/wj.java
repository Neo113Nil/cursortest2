package xsna;

import com.vk.api.sdk.exceptions.RefreshFailCause;
import com.vk.api.sdk.exceptions.UnableToRefreshAccessTokenException;
import com.vk.api.sdk.utils.log.Logger;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.locks.ReentrantLock;
import xsna.yj;

/* compiled from: AccessTokenRefreshActionInternal.kt */
/* loaded from: classes15.dex */
public final class wj {
    public final l7r0 a;
    public volatile boolean b;
    public final ReentrantLock c = new ReentrantLock(true);

    public wj(l7r0 l7r0Var) {
        this.a = l7r0Var;
    }

    public final void a() {
        this.b = true;
    }

    public final <T> T b(ara<? extends T> araVar, zqa zqaVar) {
        ReentrantLock reentrantLock;
        try {
            if (this.b) {
                reentrantLock = this.c;
                reentrantLock.lockInterruptibly();
                try {
                    if (this.b) {
                        c();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                } finally {
                }
            }
            boolean l = this.a.i().l();
            if (!this.a.i().k() && l) {
                reentrantLock = this.c;
                reentrantLock.lockInterruptibly();
                try {
                    if (!this.a.i().k()) {
                        c();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    reentrantLock.unlock();
                } finally {
                }
            }
            return araVar.a(zqaVar);
        } catch (UnableToRefreshAccessTokenException e) {
            this.a.a.i.a(Logger.LogLevel.ERROR, "An error occurred on token refresh, isCritical = " + e.g(), e);
            if (!e.g()) {
                throw e;
            }
            j7r0 j7r0Var = this.a.g;
            if (j7r0Var != null) {
                j7r0Var.a("refresh token", null, e.d(), e.getCause());
            }
            return null;
        } catch (Throwable th) {
            this.a.a.i.a(Logger.LogLevel.ERROR, "An error occurred on token refresh", th);
            throw th;
        }
    }

    public final void c() {
        if (this.a.i().l()) {
            yj yjVar = (yj) this.a.a.E.getValue();
            if (yjVar == null) {
                throw new IllegalStateException("You must set AccessTokenRefresher for ApiConfig");
            }
            yj.a refresh = yjVar.refresh();
            zx2 zx2Var = this.a.i;
            if (zx2Var != null) {
                zx2Var.a(refresh.a);
            }
            for (UserId userId : refresh.b) {
                j7r0 j7r0Var = this.a.g;
                if (j7r0Var != null) {
                    j7r0Var.a("refresh token", null, userId, new RefreshFailCause.InvalidToken());
                }
            }
            for (UserId userId2 : refresh.c) {
                j7r0 j7r0Var2 = this.a.g;
                if (j7r0Var2 != null) {
                    j7r0Var2.a("refresh token", null, userId2, new RefreshFailCause.EmptyTokenLoggedUser());
                }
            }
            this.b = false;
        }
    }
}
