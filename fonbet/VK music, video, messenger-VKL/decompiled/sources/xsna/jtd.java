package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.core.preference.Preference;
import com.vk.stories.design.view.archive.StoryArchiveFastScrollView;
import ru.ok.gleffects.impl.EffectNativeSink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class jtd implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jtd(ClipsDraftVk clipsDraftVk, boolean z) {
        this.b = 0;
        this.c = z;
        this.d = clipsDraftVk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
                if (z) {
                    ClipsDraftPersistentStore.b.getClass();
                    ClipsDraftPersistentStore.f(clipsDraftVk, true);
                }
                nsd nsdVar = fvr.c;
                if (nsdVar == null) {
                    ClipsDraftPersistentStore.b.getClass();
                    Preference.F(swe0.i(Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref") - 1, 0L, ClipsDraftPersistentStore.m().size()), "clips_draft_prefs", "unseen_drafts_pref");
                    break;
                } else {
                    nsdVar.c(-1);
                    break;
                }
            case 1:
                ((EffectNativeSink) obj).lambda$onChangeReadyToStartRecording$5(z);
                break;
            case 2:
                int i2 = StoryArchiveFastScrollView.h;
                ((StoryArchiveFastScrollView) obj).b(z);
                break;
            default:
                ((ru.mail.libverify.api.q) obj).b(z);
                break;
        }
    }

    public /* synthetic */ jtd(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }
}
