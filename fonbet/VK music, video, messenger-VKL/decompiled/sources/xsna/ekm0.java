package xsna;

import com.vk.api.generated.stories.dto.StoriesSaveResponseDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StoryUploadMapper.kt */
/* loaded from: classes3.dex */
public final class ekm0 {
    public static StoryEntry a(StoriesSaveResponseDto storiesSaveResponseDto) {
        LinkedHashMap b = i2r0.b(storiesSaveResponseDto.f());
        new dqu();
        LinkedHashMap b2 = dqu.b(storiesSaveResponseDto.d());
        LinkedHashMap a = b590.a(new b590(), storiesSaveResponseDto.f(), null, storiesSaveResponseDto.d(), 6);
        List<StoriesStoryDto> e = storiesSaveResponseDto.e();
        if (e == null) {
            e = EmptyList.b;
        }
        List<StoriesStoryDto> list = e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ivl0.a((StoriesStoryDto) it.next(), a, b, b2));
        }
        return (StoryEntry) j5g.a0(arrayList);
    }
}
