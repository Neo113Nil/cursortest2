package xsna;

import android.content.Context;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.Collection;
import java.util.List;

/* compiled from: StoriesRepo.kt */
/* loaded from: classes6.dex */
public interface iul0 {
    boolean a();

    boolean b(int i, StickerItem stickerItem, String str, y6m0 y6m0Var);

    boolean c(WebStickerType webStickerType);

    io.reactivex.rxjava3.subjects.f d();

    boolean f(String str, y6m0 y6m0Var);

    boolean g();

    io.reactivex.rxjava3.internal.operators.single.o h(UserId userId, String str, boolean z);

    boolean i(AttachAudioMsg attachAudioMsg, y6m0 y6m0Var);

    void j(Object obj, UserId userId, String str, Collection<? extends Attachment> collection);

    void k(Context context, String str, StoryEntry storyEntry, List<StoryQuestionEntry> list, xkm0 xkm0Var);

    boolean l();

    boolean n();

    default void e() {
    }

    default void m() {
    }
}
