package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import xsna.g1e0;
import xsna.pdg0;

/* compiled from: ProfilesLoader.kt */
/* loaded from: classes2.dex */
public final class ell {
    public final a1w a;
    public ProfilesInfo b = new ProfilesInfo();
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();

    public ell(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final void a(ProfilesInfo profilesInfo) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.c;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ProfilesInfo b = b();
            b.Hb(profilesInfo);
            this.b = b;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final ProfilesInfo b() {
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            ProfilesInfo profilesInfo = this.b;
            profilesInfo.getClass();
            return new ProfilesInfo(profilesInfo);
        } finally {
            readLock.unlock();
        }
    }

    public final ProfilesInfo c(f1e0 f1e0Var, Source source) {
        Object obj;
        if (f1e0Var.f()) {
            return new ProfilesInfo();
        }
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(f1e0Var);
        aVar.b = source;
        aVar.d = this;
        aVar.c = true;
        pdg0 n = this.a.n(this, new d1e0(new g1e0(aVar)));
        if (n instanceof pdg0.a) {
            obj = new ProfilesInfo();
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        return (ProfilesInfo) obj;
    }
}
