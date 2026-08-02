package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Source;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.story.impl.domain.interactor.cache.StoriesCacheManager;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.text.Regex;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cwk implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cwk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        StoriesCacheManager.StoriesCache storiesCache;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                fwk fwkVar = (fwk) obj;
                fl3.k(fwkVar.getWritableDatabase(), new g54(fwkVar, 19));
                return s3q0.a;
            case 1:
                tzp0.c.a aVar = PollEditorModalBottomSheet.o1;
                xn50.a.c((PollEditorModalBottomSheet) obj, new qnb0(SystemClock.elapsedRealtime()));
                return s3q0.a;
            case 2:
                fil0 fil0Var = (fil0) obj;
                return (xpp) fil0Var.a.J0(fil0Var, new vo(Source.CACHE, false)).await();
            case 3:
                StoriesCacheManager storiesCacheManager = (StoriesCacheManager) obj;
                storiesCacheManager.getClass();
                try {
                    storiesCacheManager.c.await();
                    z = true;
                } catch (InterruptedException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                File file = storiesCacheManager.b;
                if (z) {
                    Regex regex = com.vk.core.files.a.a;
                    if (vhk0.g(file)) {
                        storiesCacheManager.a.readLock().lock();
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                byte[] h = i7o0.h(fileInputStream);
                                byte[] l0 = rl3.l0(h, swe0.q(8, h.length));
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                storiesCache = (StoriesCacheManager.StoriesCache) Serializer.b.a(l0, StoriesCacheManager.StoriesCache.class.getClassLoader());
                                fileInputStream.close();
                            } finally {
                            }
                        } finally {
                            try {
                                if (storiesCache != null) {
                                }
                            } finally {
                            }
                        }
                        return storiesCache != null ? new StoriesCacheManager.StoriesCache(null, null, 3, null) : storiesCache;
                    }
                }
                return new StoriesCacheManager.StoriesCache(null, null, 3, null);
            default:
                return Uri.parse((String) obj);
        }
    }
}
