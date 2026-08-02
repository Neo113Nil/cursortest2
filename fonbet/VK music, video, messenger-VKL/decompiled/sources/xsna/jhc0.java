package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.menu.PostingMoreMenuMainButtonView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.ihc0;

/* compiled from: PostingMoreMenuView.kt */
/* loaded from: classes4.dex */
public final class jhc0 extends ConstraintLayout implements View.OnClickListener {
    public final PostingMoreMenuMainButtonView A;
    public final PostingMoreMenuMainButtonView B;
    public final PostingMoreMenuMainButtonView C;
    public final PostingMoreMenuMainButtonView D;
    public final PostingMoreMenuMainButtonView E;
    public final PostingMoreMenuMainButtonView F;
    public qdc0 t;
    public gzs<s3q0> u;
    public final PostingMoreMenuMainButtonView v;
    public final PostingMoreMenuMainButtonView w;
    public final PostingMoreMenuMainButtonView x;
    public final PostingMoreMenuMainButtonView y;
    public final PostingMoreMenuMainButtonView z;

    public jhc0(ihc0 ihc0Var, Context context) {
        super(context);
        int i;
        List l = e43.l(ihc0Var.a, ihc0Var.b, ihc0Var.c, ihc0Var.d, ihc0Var.e, ihc0Var.f, ihc0Var.g, ihc0Var.h, ihc0Var.i, ihc0Var.j, ihc0Var.k);
        if ((l instanceof Collection) && l.isEmpty()) {
            i = 0;
        } else {
            Iterator it = l.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((ihc0.a) it.next()).a && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        boolean z = i <= 4;
        LayoutInflater.from(context).inflate(z ? R.layout.view_posting_more_menu_compact : R.layout.view_posting_more_menu, (ViewGroup) this, true);
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView = (PostingMoreMenuMainButtonView) findViewById(R.id.photo_vk);
        boolean z2 = !z;
        postingMoreMenuMainButtonView.P4(R.drawable.vk_icon_picture_outline_28, R.string.posting_menu_photo_vk, Integer.valueOf(R.string.posting_menu_photo_vk_accessibility), z2);
        bwt0.h0(this, postingMoreMenuMainButtonView);
        this.v = postingMoreMenuMainButtonView;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView2 = (PostingMoreMenuMainButtonView) findViewById(R.id.album_vk);
        postingMoreMenuMainButtonView2.P4(R.drawable.vk_icon_picture_stack_outline_28, R.string.posting_menu_album_vk, Integer.valueOf(R.string.posting_menu_album_vk_accessibility), z2);
        bwt0.h0(this, postingMoreMenuMainButtonView2);
        this.w = postingMoreMenuMainButtonView2;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView3 = (PostingMoreMenuMainButtonView) findViewById(R.id.video_vk);
        postingMoreMenuMainButtonView3.P4(R.drawable.vk_icon_logo_vk_video_outline_28, R.string.posting_menu_video_vk, Integer.valueOf(R.string.posting_menu_video_vk_accessibility), z2);
        bwt0.h0(this, postingMoreMenuMainButtonView3);
        this.x = postingMoreMenuMainButtonView3;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView4 = (PostingMoreMenuMainButtonView) findViewById(R.id.place);
        postingMoreMenuMainButtonView4.P4(R.drawable.vk_icon_place_outline_28, R.string.posting_menu_place, null, false);
        bwt0.h0(this, postingMoreMenuMainButtonView4);
        this.y = postingMoreMenuMainButtonView4;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView5 = (PostingMoreMenuMainButtonView) findViewById(R.id.poll);
        postingMoreMenuMainButtonView5.P4(R.drawable.vk_icon_poll_square_outline_28, R.string.posting_menu_poll, null, false);
        bwt0.h0(this, postingMoreMenuMainButtonView5);
        this.z = postingMoreMenuMainButtonView5;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView6 = (PostingMoreMenuMainButtonView) findViewById(R.id.article);
        postingMoreMenuMainButtonView6.P4(R.drawable.vk_icon_article_outline_28, R.string.posting_menu_article, null, false);
        bwt0.h0(this, postingMoreMenuMainButtonView6);
        this.A = postingMoreMenuMainButtonView6;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView7 = (PostingMoreMenuMainButtonView) findViewById(R.id.document);
        postingMoreMenuMainButtonView7.P4(R.drawable.vk_icon_document_outline_28, R.string.posting_menu_document, null, false);
        bwt0.h0(this, postingMoreMenuMainButtonView7);
        this.B = postingMoreMenuMainButtonView7;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView8 = (PostingMoreMenuMainButtonView) findViewById(R.id.service);
        postingMoreMenuMainButtonView8.P4(R.drawable.vk_icon_notebook_check_outline_28, R.string.posting_menu_service, null, false);
        bwt0.h0(this, postingMoreMenuMainButtonView8);
        this.C = postingMoreMenuMainButtonView8;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView9 = (PostingMoreMenuMainButtonView) findViewById(R.id.product);
        postingMoreMenuMainButtonView9.P4(R.drawable.vk_icon_market_outline_28, R.string.posting_menu_product, null, false);
        bwt0.h0(this, postingMoreMenuMainButtonView9);
        this.D = postingMoreMenuMainButtonView9;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView10 = (PostingMoreMenuMainButtonView) findViewById(R.id.booking);
        postingMoreMenuMainButtonView10.P4(R.drawable.vk_icon_calendar_outline_28, R.string.posting_menu_booking, null, false);
        bwt0.i0(postingMoreMenuMainButtonView10, new s53(29, postingMoreMenuMainButtonView10, this));
        this.E = postingMoreMenuMainButtonView10;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView11 = (PostingMoreMenuMainButtonView) findViewById(R.id.market_involvement_button);
        postingMoreMenuMainButtonView11.P4(R.drawable.vk_icon_rectrangle_hand_point_up_28, R.string.posting_menu_market_involvement_button, null, false);
        bwt0.i0(postingMoreMenuMainButtonView11, new defpackage.y(22, postingMoreMenuMainButtonView11, this));
        this.F = postingMoreMenuMainButtonView11;
    }

    public static AttachType P4(PostingMoreMenuMainButtonView postingMoreMenuMainButtonView, AttachType attachType, int i) {
        if (postingMoreMenuMainButtonView.v) {
            attachType = null;
        }
        if (attachType == null) {
            cvk.u(i, false);
        }
        return attachType;
    }

    public static void Q4(PostingMoreMenuMainButtonView postingMoreMenuMainButtonView, ihc0.a aVar) {
        bwt0.p0(postingMoreMenuMainButtonView, aVar.a);
        postingMoreMenuMainButtonView.setDisable(!aVar.b);
    }

    public final gzs<s3q0> getDismissCallback() {
        return this.u;
    }

    public final qdc0 getPresenter() {
        return this.t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView = this.y;
        if (!epx.f(view, postingMoreMenuMainButtonView)) {
            qdc0 qdc0Var = this.t;
            if (!(qdc0Var != null ? qdc0Var.cg() : false)) {
                return;
            }
        }
        AttachType attachType = null;
        PostingMoreMenuMainButtonView postingMoreMenuMainButtonView2 = view instanceof PostingMoreMenuMainButtonView ? (PostingMoreMenuMainButtonView) view : null;
        if (epx.f(postingMoreMenuMainButtonView2, this.v)) {
            attachType = AttachType.PHOTO_VK;
        } else if (epx.f(postingMoreMenuMainButtonView2, this.x)) {
            attachType = AttachType.VIDEO;
        } else if (epx.f(postingMoreMenuMainButtonView2, postingMoreMenuMainButtonView)) {
            if (!postingMoreMenuMainButtonView.v) {
                attachType = AttachType.PLACE;
            }
        } else if (epx.f(postingMoreMenuMainButtonView2, this.z)) {
            attachType = P4((PostingMoreMenuMainButtonView) view, AttachType.POLL, R.string.attachments_limit_poll);
        } else if (epx.f(postingMoreMenuMainButtonView2, this.B)) {
            attachType = AttachType.DOCUMENT;
        } else if (epx.f(postingMoreMenuMainButtonView2, this.C)) {
            attachType = P4((PostingMoreMenuMainButtonView) view, AttachType.SERVICE, R.string.attachments_limit_service);
        } else if (epx.f(postingMoreMenuMainButtonView2, this.D)) {
            attachType = P4((PostingMoreMenuMainButtonView) view, AttachType.GOOD, R.string.attachments_limit_service);
        } else if (epx.f(postingMoreMenuMainButtonView2, this.A)) {
            attachType = P4((PostingMoreMenuMainButtonView) view, AttachType.ARTICLE, R.string.attachments_limit_article);
        } else if (epx.f(postingMoreMenuMainButtonView2, this.w)) {
            attachType = P4((PostingMoreMenuMainButtonView) view, AttachType.ALBUM, R.string.attachments_limit_album);
        }
        if (attachType != null) {
            qdc0 qdc0Var2 = this.t;
            if (qdc0Var2 != null) {
                qdc0Var2.hb(attachType);
            }
            gzs<s3q0> gzsVar = this.u;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public final void setDismissCallback(gzs<s3q0> gzsVar) {
        this.u = gzsVar;
    }

    public final void setPresenter(qdc0 qdc0Var) {
        this.t = qdc0Var;
    }
}
