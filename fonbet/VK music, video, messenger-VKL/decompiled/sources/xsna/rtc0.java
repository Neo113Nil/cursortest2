package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.pdv0;

/* compiled from: PostsBridge.kt */
/* loaded from: classes15.dex */
public interface rtc0 {
    pdv0.a a(VideoFile videoFile);

    pdv0.a b(Photo photo);

    pdv0.a c(NewsEntry newsEntry);

    pdv0.a d(VideoFile videoFile);

    default boolean g(FragmentActivity fragmentActivity) {
        return false;
    }

    default void f(bss0 bss0Var, Context context, String str, String str2, l1k0 l1k0Var, udl udlVar) {
    }

    default void e(c6z c6zVar, ReactionMeta reactionMeta, FragmentActivity fragmentActivity, String str) {
    }
}
