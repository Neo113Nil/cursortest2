package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: VkClientMultiAccountExperimentsImpl.kt */
/* loaded from: classes.dex */
public final class ilu0 implements hlu0 {
    @Override // xsna.hlu0
    public final boolean a() {
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        Preference.a.getClass();
        ReentrantReadWriteLock.ReadLock readLock = Preference.o.readLock();
        readLock.lock();
        try {
            if (Preference.j().getBoolean("multi_account_migration_completed", false)) {
                return BuildInfo.s();
            }
            return false;
        } finally {
            readLock.unlock();
        }
    }
}
