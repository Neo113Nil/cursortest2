package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackAnswerDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackTypeDto;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.feedback.StarsFeedback;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NewsfeedItemWallpostFeedbackDtoToFeedbackMapper.kt */
/* loaded from: classes3.dex */
public final class nn60 {

    /* compiled from: NewsfeedItemWallpostFeedbackDtoToFeedbackMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedItemWallpostFeedbackTypeDto.values().length];
            try {
                iArr[NewsfeedItemWallpostFeedbackTypeDto.STARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewsfeedItemWallpostFeedbackTypeDto.BUTTONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Feedback a(NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
        int i = a.$EnumSwitchMapping$0[newsfeedItemWallpostFeedbackDto.j().ordinal()];
        ArrayList arrayList = null;
        if (i == 1) {
            String g = newsfeedItemWallpostFeedbackDto.g();
            String f = newsfeedItemWallpostFeedbackDto.f();
            Integer i2 = newsfeedItemWallpostFeedbackDto.i();
            int intValue = i2 != null ? i2.intValue() : 0;
            List<String> e = newsfeedItemWallpostFeedbackDto.e();
            return new StarsFeedback(g, f, intValue, e != null ? (String[]) e.toArray(new String[0]) : null, newsfeedItemWallpostFeedbackDto.r());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String g2 = newsfeedItemWallpostFeedbackDto.g();
        String f2 = newsfeedItemWallpostFeedbackDto.f();
        List<NewsfeedItemWallpostFeedbackAnswerDto> d = newsfeedItemWallpostFeedbackDto.d();
        if (d != null) {
            List<NewsfeedItemWallpostFeedbackAnswerDto> list = d;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (NewsfeedItemWallpostFeedbackAnswerDto newsfeedItemWallpostFeedbackAnswerDto : list) {
                arrayList.add(new ButtonsFeedback.Answer(newsfeedItemWallpostFeedbackAnswerDto.getId(), newsfeedItemWallpostFeedbackAnswerDto.getTitle()));
            }
        }
        return new ButtonsFeedback(g2, f2, arrayList, newsfeedItemWallpostFeedbackDto.r());
    }
}
