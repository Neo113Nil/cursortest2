package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: StoriesArchiveInteractor.kt */
/* loaded from: classes15.dex */
public interface upl0 {
    io.reactivex.rxjava3.internal.operators.single.o a(int i, UserId userId);

    io.reactivex.rxjava3.internal.operators.single.o b(int i, UserId userId, int i2);

    ArrayList c(UserId userId, Collection collection);

    StoryEntry d(int i, UserId userId);
}
