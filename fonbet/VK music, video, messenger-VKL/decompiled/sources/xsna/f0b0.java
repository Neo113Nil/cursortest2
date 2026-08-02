package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.video.ui.discovery.minimizable.announce.a;
import com.vkontakte.android.R;
import xsna.tts0;

/* compiled from: PlayerContainerViewBinding.kt */
/* loaded from: classes7.dex */
public final class f0b0 {
    public final tts0.b a;
    public final a.C1971a b;
    public final ComposeView c;

    public f0b0(ConstraintLayout constraintLayout) {
        this.a = new tts0.b(constraintLayout);
        this.b = new a.C1971a((ViewGroup) constraintLayout.findViewById(R.id.videoAnnounceBackground));
        this.c = (ComposeView) constraintLayout.findViewById(R.id.subscriptionProposal);
    }
}
