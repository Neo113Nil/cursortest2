package xsna;

import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.data.b;
import java.util.Locale;

/* compiled from: StoryHashtagDialogPresenter.kt */
/* loaded from: classes16.dex */
public final class r4m0 implements wzs<String, Integer, s3q0> {
    public final /* synthetic */ s4m0 b;

    public r4m0(s4m0 s4m0Var) {
        this.b = s4m0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(String str, Integer num) {
        String str2 = str;
        final int intValue = num.intValue();
        s4m0 s4m0Var = this.b;
        StoryEditText storyEditText = s4m0Var.b.k;
        if (storyEditText == null) {
            storyEditText = null;
        }
        final int length = storyEditText.getText().toString().toLowerCase(Locale.ROOT).length() - 1;
        nf9 nf9Var = nf9.b;
        nf9.j(StoryPublishEvent.SELECT_HASHTAG_HINT, null, null, null, new izs() { // from class: xsna.mf9
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                b.d dVar = (b.d) obj;
                dVar.b(Integer.valueOf(intValue), "hashtag_search_position");
                dVar.b(Integer.valueOf(length), "hashtag_query_length");
                return s3q0.a;
            }
        }, 30);
        n4m0 n4m0Var = s4m0Var.b;
        if (brm0.B(str2, "#", false)) {
            str2 = str2.substring(1);
        }
        StoryEditText storyEditText2 = n4m0Var.k;
        if (storyEditText2 == null) {
            storyEditText2 = null;
        }
        storyEditText2.setText(str2);
        StoryEditText storyEditText3 = n4m0Var.k;
        (storyEditText3 != null ? storyEditText3 : null).setSelection((storyEditText3 != null ? storyEditText3 : null).getText().length());
        return s3q0.a;
    }
}
