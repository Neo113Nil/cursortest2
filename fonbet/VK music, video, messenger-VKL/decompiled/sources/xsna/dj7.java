package xsna;

import com.vk.dto.common.Attachment;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.regex.Pattern;
import xsna.ecq0;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class dj7 implements ecq0.a {
    public final /* synthetic */ ner0 a;
    public final /* synthetic */ BoardTopicViewFragment b;

    public dj7(ner0 ner0Var, BoardTopicViewFragment boardTopicViewFragment) {
        this.a = ner0Var;
        this.b = boardTopicViewFragment;
    }

    @Override // xsna.ecq0.a
    public final void a(Attachment attachment) {
        ner0 ner0Var = this.a;
        ner0Var.setOnCancelListener(null);
        u1u0.b(ner0Var);
        Pattern pattern = BoardTopicViewFragment.H0;
        this.b.Co("", Collections.singletonList(attachment), false, false);
    }

    @Override // xsna.ecq0.a
    public final void b() {
        ner0 ner0Var = this.a;
        ner0Var.setOnCancelListener(null);
        u1u0.b(ner0Var);
        cvk.u(R.string.error, false);
    }
}
