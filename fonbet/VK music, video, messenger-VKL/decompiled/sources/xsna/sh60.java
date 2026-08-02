package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedDzenTextDto;
import com.vk.feed.core.models.dzen.DzenNews;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NewsfeedDzenTextDtoToDzenNewsItemHeaderMapper.kt */
/* loaded from: classes4.dex */
public final class sh60 {

    /* compiled from: NewsfeedDzenTextDtoToDzenNewsItemHeaderMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedDzenTextDto.TextSizeDto.values().length];
            try {
                iArr[NewsfeedDzenTextDto.TextSizeDto.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static DzenNews.ItemHeader a(NewsfeedDzenTextDto newsfeedDzenTextDto) {
        DzenNews.TextSize textSize;
        String e = newsfeedDzenTextDto.e();
        NewsfeedDzenTextDto.TextSizeDto f = newsfeedDzenTextDto.f();
        if (f == null) {
            textSize = null;
        } else {
            if (a.$EnumSwitchMapping$0[f.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            textSize = DzenNews.TextSize.LARGE;
        }
        return new DzenNews.ItemHeader(e, textSize, epx.f(newsfeedDzenTextDto.d(), Boolean.TRUE));
    }
}
