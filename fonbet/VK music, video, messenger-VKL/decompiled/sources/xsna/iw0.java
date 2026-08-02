package xsna;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdsItemClipStateProducer.kt */
/* loaded from: classes17.dex */
public final class iw0 {
    public final Context a;
    public final e0a b;
    public final pw0 c;
    public final Object d;
    public final Object e;

    public iw0(Context context, e0a e0aVar, pw0 pw0Var) {
        this.a = context;
        this.b = e0aVar;
        this.c = pw0Var;
        defpackage.r rVar = new defpackage.r(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, rVar);
        this.e = msy.a(lazyThreadSafetyMode, new pr0(1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final hw0 a(SdkClipVideoFile sdkClipVideoFile) {
        CharSequence a = this.c.a(sdkClipVideoFile.j1());
        return new hw0(sdkClipVideoFile, sdkClipVideoFile.r1(), a, ((p2m) this.e.getValue()).a((AppCompatTextView) this.d.getValue(), pw0.b(this.a, a)), this.b.W(sdkClipVideoFile));
    }
}
