package xsna;

import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.HashMap;
import kotlin.Pair;

/* compiled from: StoryBoxChecker.kt */
/* loaded from: classes6.dex */
public final class ozl0 {
    public static final void a(HashMap hashMap, String str, boolean z, int i) {
        WebStickerType.Companion.getClass();
        WebStickerType a = WebStickerType.a.a(str);
        if (a != null) {
            Pair pair = new Pair(a, Boolean.valueOf(z));
            Integer num = (Integer) hashMap.get(pair);
            hashMap.put(pair, Integer.valueOf(i + (num != null ? num.intValue() : 0)));
        }
    }
}
