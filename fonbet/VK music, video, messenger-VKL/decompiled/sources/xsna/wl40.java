package xsna;

import android.view.KeyEvent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.music.view.MusicKidsCoverStackedView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl40 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Serializer.StreamParcelableAdapter d;
    public final /* synthetic */ Serializer.StreamParcelableAdapter e;

    public /* synthetic */ wl40(KeyEvent.Callback callback, Serializer.StreamParcelableAdapter streamParcelableAdapter, Serializer.StreamParcelableAdapter streamParcelableAdapter2, int i) {
        this.b = i;
        this.c = callback;
        this.d = streamParcelableAdapter;
        this.e = streamParcelableAdapter2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                MusicKidsCoverStackedView musicKidsCoverStackedView = (MusicKidsCoverStackedView) this.c;
                Thumb thumb = (Thumb) this.d;
                Thumb thumb2 = (Thumb) this.e;
                musicKidsCoverStackedView.t.setThumb(thumb);
                musicKidsCoverStackedView.u.setThumb(thumb2);
                break;
            default:
                com.vk.story.viewer.impl.presentation.stories.c cVar = (com.vk.story.viewer.impl.presentation.stories.c) this.c;
                StoriesContainer storiesContainer = (StoriesContainer) this.d;
                StoryEntry storyEntry = (StoryEntry) this.e;
                qlm0 qlm0Var = cVar.S;
                if (!fsk.z(storiesContainer)) {
                    qlm0Var.a().d(storiesContainer, storyEntry);
                    break;
                } else {
                    qlm0Var.a().f(fsk.O(storiesContainer));
                    break;
                }
        }
    }
}
