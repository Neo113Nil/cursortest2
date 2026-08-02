package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$cleanupOldScreenshots$2", f = "ReportViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class e6g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;

    public e6g0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e6g0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PrivateFiles.a b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        b = e8r.a.b(r0, PrivateSubdir.PHOTO_EDITOR.h(), false);
        File[] listFiles = b.a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (brm0.B(file.getName(), "overlay_menu_screenshot_", false)) {
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.b(file);
                }
            }
        }
        return s3q0.a;
    }
}
