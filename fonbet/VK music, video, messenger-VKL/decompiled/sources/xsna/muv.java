package xsna;

import com.vk.dto.stories.model.web.StoryBoxPrepared;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: IdeasStoryUseCase.kt */
/* loaded from: classes6.dex */
public final class muv {
    public final fnm0 a;
    public final ConcurrentHashMap<String, StoryBoxPrepared> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap.KeySetView<String, Boolean> c = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView<String, Boolean> d = ConcurrentHashMap.newKeySet();

    public muv(fnm0 fnm0Var) {
        this.a = fnm0Var;
    }
}
