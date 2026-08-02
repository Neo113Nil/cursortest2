package xsna;

import com.vk.core.preference.Preference;
import com.vk.masks.MasksController;
import com.vk.stories.StorySettingsActivity;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ha20 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ia20 ia20Var = (ia20) obj;
                ReentrantReadWriteLock.ReadLock readLock = ia20Var.f.readLock();
                readLock.lock();
                try {
                    return ia20Var.d.P0().Ab();
                } finally {
                    readLock.unlock();
                }
            case 1:
                com.vk.newsfeed.impl.posting.a aVar = (com.vk.newsfeed.impl.posting.a) obj;
                if (aVar.d == null) {
                    aVar.d = Boolean.valueOf(Preference.l().getBoolean((String) aVar.a.getValue(), false));
                }
                Boolean bool = aVar.d;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 2:
                int i2 = StorySettingsActivity.P;
                ((MasksController) obj).j();
                return s3q0.a;
            default:
                return Boolean.valueOf(((o4x0) obj).f != null);
        }
    }
}
