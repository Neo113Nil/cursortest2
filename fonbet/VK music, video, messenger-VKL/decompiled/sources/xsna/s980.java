package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: OnNewsEntryClickListener.kt */
/* loaded from: classes3.dex */
public interface s980 extends hi60 {
    @ozl
    default boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return true;
    }

    @ozl
    default boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return false;
    }

    @ozl
    default void r8(NewsEntry newsEntry) {
    }

    @ozl
    default void U5(NewsEntry newsEntry, boolean z, int i) {
    }

    @ozl
    default void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
    }

    @ozl
    default void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
    }

    @ozl
    default void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
    }
}
