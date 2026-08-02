package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class imc0 implements fmc0.j {
    public final UserId a;
    public final PostingPollDto b;
    public final PostingPollDto c;
    public final PollEditorMode d;
    public final PollEditorUiConfig e;

    public imc0(UserId userId, PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PollEditorMode pollEditorMode, PollEditorUiConfig pollEditorUiConfig) {
        this.a = userId;
        this.b = postingPollDto;
        this.c = postingPollDto2;
        this.d = pollEditorMode;
        this.e = pollEditorUiConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imc0)) {
            return false;
        }
        imc0 imc0Var = (imc0) obj;
        return epx.f(this.a, imc0Var.a) && epx.f(this.b, imc0Var.b) && epx.f(this.c, imc0Var.c) && epx.f(this.d, imc0Var.d) && epx.f(this.e, imc0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
        PostingPollDto postingPollDto = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "OpenPoll(ownerId=" + this.a + ", poll=" + this.b + ", lastSavedPoll=" + this.c + ", mode=" + this.d + ", config=" + this.e + ')';
    }
}
