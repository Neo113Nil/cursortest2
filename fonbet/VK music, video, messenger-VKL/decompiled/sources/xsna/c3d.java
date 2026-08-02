package xsna;

import android.content.Context;
import com.vk.dto.common.clips.ClipVideoItem;
import io.appmetrica.analytics.impl.C5307y0;
import java.util.concurrent.Callable;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c3d implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((ClipVideoItem) obj).b;
                Regex regex = com.vk.core.files.a.a;
                return Boolean.valueOf(vhk0.c(str));
            case 1:
                return kzz.f((Context) obj);
            default:
                return ((C5307y0) obj).p();
        }
    }
}
