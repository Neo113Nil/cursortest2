package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vkontakte.android.R;
import xsna.gd60;

/* compiled from: BoardTopicPreviewHolder.kt */
/* loaded from: classes4.dex */
public final class ni7 extends qi6<Post> implements View.OnClickListener {
    public final h170 C;
    public final TextView D;

    public ni7(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.post_attach_common, viewGroup);
        this.C = h170Var;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.attach_icon);
        this.D = (TextView) this.itemView.findViewById(R.id.attach_title);
        TextView textView = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, imageView);
        omw.d(imageView, R.drawable.vk_icon_comment_24, R.attr.vk_ui_icon_medium);
        textView.setText(v6(R.string.topic_in_post_list));
        this.itemView.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(Post post) {
        CharSequence charSequence;
        Post post2 = post;
        J0();
        if (((Boolean) this.C.E.getValue()).booleanValue()) {
            Serializer.c<DigestItem> cVar = DigestItem.CREATOR;
            String str = post2.s;
            Bundle bundle = post2.K;
            float f = post2.N.d;
            cn70.b(6);
            LinksParserData linksParserData = new LinksParserData(43787, bundle, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Posts, (saz) null, 0, (taz) null, o25.a().i().U == ObsceneTextFilter.ENABLED, 1788);
            vdz vdzVar = new vdz(0);
            ucp ucpVar = ucp.a;
            charSequence = ucp.i(xwk.d().a().o(str, linksParserData, vdzVar));
            post2.l.Ab(68719476736L, vdzVar.a);
        } else {
            ej90 ej90Var = post2.P;
            charSequence = ej90Var != null ? ej90Var.a : null;
        }
        this.D.setText(charSequence);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6 = q6();
        if (q6 == null) {
            return;
        }
        gd60 a = hd60.a();
        Context context = this.itemView.getContext();
        UserId a2 = fkq0.a(q6.m);
        int i = q6.n;
        gd60.a aVar = gd60.a;
        a.r(context, a2, i, 0);
    }
}
