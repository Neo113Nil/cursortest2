package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.ui.VKSnippetImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import org.chromium.base.TimeUtils;
import xsna.dek0;

/* compiled from: InfoCardHolder.kt */
/* loaded from: classes4.dex */
public final class xvw extends vif0<ProfilesRecommendations.InfoCard> implements View.OnClickListener {
    public final VKSnippetImageView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public String s;

    public xvw(ViewGroup viewGroup) {
        super(viewGroup, R.layout.profiles_recomm_info_card_item, 0);
        VKSnippetImageView vKSnippetImageView = (VKSnippetImageView) this.itemView.findViewById(R.id.photo);
        this.n = vKSnippetImageView;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(android.R.id.text1);
        this.q = (TextView) this.itemView.findViewById(android.R.id.text2);
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.r = textView;
        this.itemView.setOnClickListener(this);
        textView.setOnClickListener(this);
        int i = dek0.a;
        dek0.b(vKSnippetImageView, null, new dek0.a(cn70.a() * 4.0f, false), 2);
        vKSnippetImageView.setType(7);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(ProfilesRecommendations.InfoCard infoCard) {
        TextView textView;
        String str;
        ProfilesRecommendations.InfoCard infoCard2 = infoCard;
        String str2 = infoCard2.l;
        String str3 = infoCard2.g;
        Image image = infoCard2.h;
        VKSnippetImageView vKSnippetImageView = this.n;
        if (image != null) {
            ImageSize y = nr2.y(gbg0.a(b6(), 138.0f), image.b);
            vKSnippetImageView.o0(y != null ? y.d.d : null, null);
        } else {
            vKSnippetImageView.clear();
        }
        this.o.setText(infoCard2.d);
        String[] strArr = infoCard2.f;
        TextView textView2 = this.q;
        TextView textView3 = this.p;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                if (strArr.length == 1) {
                    bwt0.p0(textView3, true);
                    bwt0.p0(textView2, false);
                    textView3.setSingleLine(false);
                    textView3.setMaxLines(2);
                    textView3.setText((CharSequence) rl3.L(strArr));
                } else {
                    bwt0.p0(textView3, true);
                    bwt0.p0(textView2, true);
                    textView3.setSingleLine(true);
                    textView3.setMaxLines(1);
                    textView3.setText(strArr[0]);
                    textView2.setText(strArr[1]);
                }
                textView = this.r;
                if (str3 != null || str3.length() == 0) {
                    bwt0.p0(textView, false);
                } else {
                    textView.setText(str3);
                    bwt0.p0(textView, true);
                }
                String str4 = this.s;
                int a = pvo0.a();
                UserId b = t11.b();
                str = "info_card_view:" + b + ':' + str4 + ':' + str2;
                if (com.vkontakte.android.data.b.i(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('|');
                    sb.append(a);
                    sb.append("||");
                    sb.append(str4);
                    String a2 = i5s.a(sb, "||", str2);
                    b.d dVar = new b.d("show_user_rec");
                    dVar.b = true;
                    dVar.c = true;
                    dVar.b(a2, "user_ids");
                    dVar.e();
                    com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, str);
                    return;
                }
                return;
            }
        }
        bwt0.p0(textView3, false);
        bwt0.p0(textView2, false);
        textView = this.r;
        if (str3 != null) {
        }
        bwt0.p0(textView, false);
        String str42 = this.s;
        int a3 = pvo0.a();
        UserId b2 = t11.b();
        str = "info_card_view:" + b2 + ':' + str42 + ':' + str2;
        if (com.vkontakte.android.data.b.i(str)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Action action;
        ProfilesRecommendations.InfoCard infoCard = (ProfilesRecommendations.InfoCard) this.m;
        if (infoCard != null && (action = infoCard.k) != null) {
            hd60.a().v(action, this.l.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        }
        ProfilesRecommendations.InfoCard infoCard2 = (ProfilesRecommendations.InfoCard) this.m;
        String str = this.s;
        int a = pvo0.a();
        String str2 = t11.b() + '|' + a + '|' + str + '|' + infoCard2.l;
        b.d dVar = new b.d("open_user");
        dVar.b = true;
        dVar.c = true;
        dVar.b(str2, "user_ids");
        dVar.e();
    }
}
