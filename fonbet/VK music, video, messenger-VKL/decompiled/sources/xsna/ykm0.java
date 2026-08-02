package xsna;

import com.vk.media.pipeline.model.transform.TransformFormat;
import java.io.File;

/* compiled from: StoryViewAskQuestionDataProvider.kt */
/* loaded from: classes6.dex */
public final class ykm0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public ykm0(File file, TransformFormat transformFormat, jkp0 jkp0Var) {
        this.a = file;
        this.b = transformFormat;
        this.c = jkp0Var;
    }

    public ykm0(uov uovVar) {
        this.a = uovVar;
        this.b = new io.reactivex.rxjava3.disposables.b();
        this.c = new bpn0(new vv20(this, 29));
    }
}
