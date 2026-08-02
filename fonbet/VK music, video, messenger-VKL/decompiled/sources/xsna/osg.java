package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityBannedItem.kt */
/* loaded from: classes5.dex */
public final class osg extends we6 {
    public final psg g;
    public final int h = -216;

    /* compiled from: CommunityBannedItem.kt */
    public static final class a extends vif0<osg> {
        public final TextView n;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.item_community_banned, 0);
            this.n = (TextView) this.itemView.findViewById(R.id.community_banned_text);
        }

        @Override // xsna.vif0
        public final void i6(osg osgVar) {
            TextView textView = this.n;
            Context context = textView.getContext();
            ExtendedUserProfile.e eVar = osgVar.g.b;
            StringBuilder sb = new StringBuilder(context.getString(R.string.blacklisted_group));
            if (!TextUtils.isEmpty(eVar.a) || eVar.b != 0 || eVar.c != 0) {
                sb.append("\n\n");
                String str = null;
                String str2 = eVar.c != 0 ? (String) rl3.S(eVar.c, context.getResources().getStringArray(R.array.group_ban_reasons)) : null;
                if (str2 != null) {
                    sb.append("/m");
                    sb.append(context.getString(R.string.group_ban_reason));
                    sb.append(":/e ");
                    sb.append(str2);
                }
                int i = eVar.b;
                String i2 = i != 0 ? pvo0.i(false, i, false, false) : null;
                if (i2 != null) {
                    if (sb.charAt(sb.length() - 1) != '\n') {
                        sb.append('\n');
                    }
                    sb.append("/m");
                    sb.append(context.getString(R.string.group_ban_end));
                    sb.append(":/e ");
                    sb.append(i2);
                }
                String str3 = eVar.a;
                if (str3 != null && !drm0.N(str3)) {
                    str = str3;
                }
                if (str != null) {
                    if (sb.charAt(sb.length() - 1) != '\n') {
                        sb.append('\n');
                    }
                    sb.append("/m");
                    sb.append(context.getString(R.string.group_ban_comment));
                    sb.append(":/e ");
                    sb.append(str.replace(DomExceptionUtils.SEPARATOR, "//"));
                }
            }
            textView.setText(his0.q(sb.toString()));
        }
    }

    public osg(psg psgVar) {
        this.g = psgVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.h;
    }
}
