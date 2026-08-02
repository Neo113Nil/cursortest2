package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.Poll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.data.PostInteract;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;

/* compiled from: PollV3ModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class msb0 extends tl50<lsb0, atb0, dsb0> implements w8i {
    public static final /* synthetic */ int n1 = 0;
    public zsb0 i1;
    public int j1;
    public com.vk.core.view.components.spinner.c k1;
    public final Object l1;
    public final Object m1;

    /* compiled from: PollV3ModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final int e;
        public final UserId f;
        public final PollAttachment g;
        public final u1c0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, PollAttachment pollAttachment, u1c0 u1c0Var) {
            super(context, null);
            Poll poll = pollAttachment.f;
            int i = poll.b;
            UserId userId = poll.c;
            this.e = i;
            this.f = userId;
            this.g = pollAttachment;
            this.h = u1c0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            String str;
            Post post;
            NewsEntry newsEntry;
            PostInteract postInteract;
            c(new cpo(false, 0, 7));
            F0(true);
            u(0);
            x(0);
            I(true);
            msb0 msb0Var = new msb0();
            Pair pair = new Pair("poll_attachment", this.g);
            u1c0 u1c0Var = this.h;
            if (u1c0Var == null || (postInteract = u1c0Var.m) == null) {
                str = null;
                post = null;
            } else {
                str = postInteract.b;
                post = null;
            }
            Pair pair2 = new Pair("ref", str);
            NewsEntry newsEntry2 = u1c0Var != null ? u1c0Var.a : post;
            Post post2 = newsEntry2 instanceof Post ? (Post) newsEntry2 : post;
            msb0Var.setArguments(yfb.b(pair, pair2, new Pair("track_code", post2 != null ? post2.L.b : post), new Pair("vote_context", (u1c0Var == null || (newsEntry = u1c0Var.a) == null) ? post : newsEntry.Ab()), new Pair("poll_id", Integer.valueOf(this.e)), new Pair("owner_id", this.f)));
            return msb0Var;
        }
    }

    /* compiled from: PollV3ModalBottomSheet.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<dsb0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(dsb0 dsb0Var) {
            ((lsb0) this.receiver).C(dsb0Var);
            return s3q0.a;
        }
    }

    public msb0() {
        fr20 fr20Var = new fr20(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l1 = msy.a(lazyThreadSafetyMode, fr20Var);
        this.m1 = msy.a(lazyThreadSafetyMode, new z260(this, 14));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        zsb0 zsb0Var = new zsb0(requireContext(), this, new b(1, getFeature(), lsb0.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.i1 = zsb0Var;
        return new mk50.c(zsb0Var.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        atb0 atb0Var = (atb0) ao50Var;
        gm50.a.b(this, atb0Var.a, new aj50(this, 8));
        gm50.a.b(this, atb0Var.b, new arb0(this, 1));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((lsb0) vk50Var).g.a(new bl30(this, 10), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        int i = bundle.getInt("poll_id");
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        return new lsb0((PollAttachment) bundle.getParcelable("poll_attachment"), Integer.valueOf(i), userId, bundle.getString("ref"), bundle.getString("track_code"), bundle.getString("vote_context"));
    }
}
