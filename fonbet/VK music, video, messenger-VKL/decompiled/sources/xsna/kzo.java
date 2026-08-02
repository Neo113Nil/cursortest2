package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vkontakte.android.R;

/* compiled from: EditAlbumView.kt */
/* loaded from: classes3.dex */
public final class kzo implements gm50 {
    public final pj1 b;
    public final Context c;
    public final f5z d;
    public final ViewGroup e;
    public final View f;
    public final VkInputSelect g;
    public final TextView h;
    public final VkInputSelect i;
    public final TextView j;
    public final ViewGroup k;
    public final View l;
    public final View m;
    public final PhotoFlowToolbarView n;
    public final TextView o;
    public final TextView p;
    public final View q;

    public kzo(View view, f5z f5zVar, pj1 pj1Var) {
        this.b = pj1Var;
        this.c = view.getContext();
        this.d = f5zVar;
        this.e = (ViewGroup) view.findViewById(R.id.linear_layout);
        this.f = view.findViewById(R.id.progress);
        VkInputSelect vkInputSelect = (VkInputSelect) view.findViewById(R.id.title);
        vkInputSelect.b(new ghn(new nfj(this, 15)));
        this.g = vkInputSelect;
        this.h = (TextView) view.findViewById(R.id.title_count);
        VkInputSelect vkInputSelect2 = (VkInputSelect) view.findViewById(R.id.description);
        vkInputSelect2.b(new ghn(new i4e(this, 26)));
        this.i = vkInputSelect2;
        this.j = (TextView) view.findViewById(R.id.description_count);
        this.k = (ViewGroup) view.findViewById(R.id.description_group);
        View findViewById = view.findViewById(R.id.album_privacy);
        bwt0.i0(findViewById, new i4h(this, 15));
        this.l = findViewById;
        View findViewById2 = view.findViewById(R.id.album_privacy_comment);
        bwt0.i0(findViewById2, new n3i(this, 12));
        this.m = findViewById2;
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) view.findViewById(R.id.toolbar);
        this.n = photoFlowToolbarView;
        this.o = (TextView) view.findViewById(R.id.album_privacy_text);
        this.p = (TextView) view.findViewById(R.id.album_privacy_comment_text);
        View findViewById3 = view.findViewById(R.id.remove_album);
        bwt0.i0(findViewById3, new k0j(this, 9));
        this.q = findViewById3;
        photoFlowToolbarView.P4(new p7(this, 25));
        String string = photoFlowToolbarView.getContext().getString(R.string.accessibility_done);
        ImageView imageView = photoFlowToolbarView.t;
        imageView.setImageDrawable(dhr0.t.a(R.drawable.vk_icon_done_outline_28));
        imageView.setContentDescription(string);
        m84 m84Var = new m84(11, photoFlowToolbarView, this);
        bwt0.p0(imageView, true);
        bwt0.i0(imageView, new qz40(m84Var, 8));
        photoFlowToolbarView.Q4(R.drawable.vk_icon_arrow_left_outline_28, R.string.accessibility_back);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
