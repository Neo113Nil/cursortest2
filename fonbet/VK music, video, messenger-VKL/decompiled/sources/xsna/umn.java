package xsna;

import com.yandex.div.core.dagger.DivKitHistogramsModule;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class umn implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1$lambda$0(runnable);
    }
}
