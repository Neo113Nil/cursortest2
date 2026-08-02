package xsna;

import android.view.ViewGroup;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.views.ReplyView;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: WriteBarReplyHolder.kt */
/* loaded from: classes7.dex */
public final class q1y0 {
    public final WriteBar a;
    public final WriteBar b;
    public final b2y0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new p1y0(this, 0));
    public ReplyView e;
    public int f;
    public MsgFromUser g;
    public ProfilesSimpleInfo h;

    public q1y0(WriteBar writeBar, WriteBar writeBar2, b2y0 b2y0Var) {
        this.a = writeBar;
        this.b = writeBar2;
        this.c = b2y0Var;
    }

    public final void a() {
        b();
        this.g = null;
        this.h = null;
        WriteBar writeBar = this.b;
        writeBar.p0();
        y1y0 y1y0Var = writeBar.E;
        y1y0Var.a().e(QuickStickerSuggestState.DISABLED);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        ?? r0 = this.d;
        if (r0.isInitialized()) {
            ((ViewGroup) r0.getValue()).setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        ?? r0 = this.d;
        if (!r0.isInitialized()) {
            this.e = (ReplyView) ((ViewGroup) r0.getValue()).findViewById(R.id.write_bar_reply_content);
            bwt0.i0(((ViewGroup) r0.getValue()).findViewById(R.id.write_bar_reply_close), new s1x0(this, 1));
            ReplyView replyView = this.e;
            if (replyView == null) {
                replyView = null;
            }
            replyView.setLineColor(this.f);
            ReplyView replyView2 = this.e;
            (replyView2 != null ? replyView2 : null).setTitleTextColor(this.f);
        }
        ((ViewGroup) r0.getValue()).setVisibility(0);
    }
}
