package xsna;

import android.content.Context;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.medianative.MediaNative;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import ru.ok.gleffects.ExternalLibraryLoaderHolder;
import xsna.t5t0;

/* compiled from: MediaInitTask.kt */
/* loaded from: classes11.dex */
public final class jr10 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "MediaInitTask";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        o2l.a.getClass();
        MediaNative.init(context, o2l.b("__dbg_log_native_exceptions", false));
        PhotoEditorEngine.h(this.b, new qoy());
        Context context2 = e43.a;
        io9.f(context2 != null ? context2 : null);
        bpn0 bpn0Var = t5t0.e;
        t5t0.a.a();
        ExternalLibraryLoaderHolder.externalLibraryLoader = new d0u();
        return s3q0.a;
    }
}
