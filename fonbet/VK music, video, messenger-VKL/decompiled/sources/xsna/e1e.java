package xsna;

import com.vk.clips.editor.voiceover.impl.ClipsEditorVoiceOverAudioRecorder;
import com.vk.im.reactions.impl.assets.a;
import com.vk.media.MediaUtils;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeAddFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e1e implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        irk0 irk0Var;
        switch (this.b) {
            case 0:
                com.vk.clips.editor.voiceover.impl.a aVar = (com.vk.clips.editor.voiceover.impl.a) this.c;
                ClipsEditorVoiceOverAudioRecorder b = aVar.b();
                b.b(b.b);
                aVar.b().b.release();
                if (aVar.b().e == ClipsEditorVoiceOverAudioRecorder.State.ERROR) {
                    Exception exc = aVar.b().f;
                    if (exc != null) {
                        throw exc;
                    }
                    StringBuilder sb = new StringBuilder("recorder finished with some error state=");
                    a1e a1eVar = aVar.l;
                    sb.append(a1eVar != null ? a1eVar : null);
                    throw new IllegalStateException(sb.toString());
                }
                qzd qzdVar = q0e.this.h;
                if (qzdVar != null && (irk0Var = qzdVar.b) != null) {
                    MobileOfficialAppsClipsStat$TypeAddFragment mobileOfficialAppsClipsStat$TypeAddFragment = new MobileOfficialAppsClipsStat$TypeAddFragment(MobileOfficialAppsClipsStat$TypeAddFragment.EventType.VOICEOVER);
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_VOICEOVER_EDITOR;
                    int i = qzdVar.a;
                    MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = qzdVar.c;
                    if (creationEntryPoint == null) {
                        creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
                    }
                    new xxd(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsClipsStat$ClipsCreateContext(i, creationEntryPoint), mobileOfficialAppsClipsStat$TypeAddFragment, irk0Var).q();
                }
                a1e a1eVar2 = aVar.l;
                String absolutePath = (a1eVar2 != null ? a1eVar2 : null).c.getAbsolutePath();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                p490.z(new ga3(absolutePath, 1), new jb5(ref$ObjectRef, 8));
                return Long.valueOf(((MediaUtils.AudioConfig) ref$ObjectRef.element).d);
            case 1:
                return ((qi40) this.c).c;
            default:
                return new a.C1134a(null, (RLottieDrawable) this.c, null);
        }
    }
}
