package xsna;

import java.util.concurrent.Callable;
import org.chromium.base.PathUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class yq90 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String[] privateDirectoryPathInternal;
        privateDirectoryPathInternal = PathUtils.setPrivateDirectoryPathInternal();
        return privateDirectoryPathInternal;
    }
}
