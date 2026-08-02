package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.g8d;

/* compiled from: ClipsMoreMenuBottomSheetDelegateImpl.kt */
/* loaded from: classes17.dex */
public final class kle implements jle {
    public final e25 a;
    public final pi0 b;
    public final pih0 c;
    public final com.vk.movika.sdk.base.logic.processor.actions.i d;
    public final f5z e;

    public kle(e25 e25Var, pi0 pi0Var, pih0 pih0Var, com.vk.movika.sdk.base.logic.processor.actions.i iVar, com.vk.clips.sdk.shared.item.ads.c cVar) {
        this.a = e25Var;
        this.b = pi0Var;
        this.c = pih0Var;
        this.d = iVar;
        this.e = gqo.e(cVar);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [T, xsna.bkd] */
    @Override // xsna.jle
    public final void a(SdkClipVideoFile sdkClipVideoFile, lyc lycVar, Activity activity) {
        rvc rvcVar = new rvc(this.b);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new hkd(new ikd((SdkVideoFile) sdkClipVideoFile, lycVar.b, sdkClipVideoFile.I0(), (dz20) rdi.p(activity, new sx0(ref$ObjectRef, 17)), (g8d.a) new g8d.a.C2925a(lycVar.a), !this.a.a.b(), this.c.l8(sdkClipVideoFile), false, 256), rvcVar, null, ((com.vk.clips.sdk.shared.item.ads.c) this.d.c).y, 4).a(activity, this.e, true);
    }
}
