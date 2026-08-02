package xsna;

import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.newsfeed.posting.poll_editor.presentation.model.BackStack;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;

/* compiled from: PollEditorViewState.kt */
/* loaded from: classes4.dex */
public interface xpb0<T extends PollEditorState> extends fm50<T> {

    /* compiled from: PollEditorViewState.kt */
    public static final class a implements xpb0<PollEditorState> {
        public final yzt0<BackStack> a;
        public final yzt0<Boolean> b;
        public final yzt0<PostingPollDto> c;
        public final PostingPollDto d;
        public final PollEditorUiConfig e;
        public final PollEditorMode f;
        public final boolean g;
        public final boolean h;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, PostingPollDto postingPollDto, PollEditorUiConfig pollEditorUiConfig, PollEditorMode pollEditorMode, boolean z, boolean z2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = postingPollDto;
            this.e = pollEditorUiConfig;
            this.f = pollEditorMode;
            this.g = z;
            this.h = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            int a = sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
            PostingPollDto postingPollDto = this.d;
            return Boolean.hashCode(this.h) + qoy.b((this.f.hashCode() + ((this.e.hashCode() + ((a + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31)) * 31)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Editing(backStack=");
            sb.append(this.a);
            sb.append(", shouldShowSpinner=");
            sb.append(this.b);
            sb.append(", poll=");
            sb.append(this.c);
            sb.append(", lastSavedPollState=");
            sb.append(this.d);
            sb.append(", config=");
            sb.append(this.e);
            sb.append(", mode=");
            sb.append(this.f);
            sb.append(", isAvailableSettings=");
            sb.append(this.g);
            sb.append(", isDeleteAvailable=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: PollEditorViewState.kt */
    public static final class b implements xpb0<PollEditorState> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -559587599;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
