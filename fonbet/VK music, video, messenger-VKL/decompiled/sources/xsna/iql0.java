package xsna;

import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import java.util.List;
import java.util.Map;

/* compiled from: StoriesBackgroundRepository.kt */
/* loaded from: classes18.dex */
public interface iql0 {
    void a();

    io.reactivex.rxjava3.core.q<StoryBackground> b();

    io.reactivex.rxjava3.core.q<Map<StoryBackgroundType, List<StoryBackground>>> c();
}
