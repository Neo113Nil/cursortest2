package xsna;

import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import java.util.ArrayList;

/* compiled from: StoryViewCallback.java */
/* loaded from: classes6.dex */
public interface elm0 {
    void R2(Object obj);

    boolean a();

    void b();

    int c(StoriesContainer storiesContainer);

    void d(boolean z);

    void e(SourceTransitionStory sourceTransitionStory);

    boolean f();

    void finish();

    boolean g();

    int getCurrentIdlePagerPosition();

    String getRef();

    @Nullable
    Parcelable getTransferableState();

    void h();

    void i(ArrayList<StoriesContainer> arrayList);

    void j();

    void k(Intent intent);

    void l();

    void m();

    @Nullable
    StoriesContainer n(boolean z);

    void o();

    void p(boolean z);

    void q(StoriesContainer storiesContainer);

    String r(int i);

    void s(int i, String str);
}
