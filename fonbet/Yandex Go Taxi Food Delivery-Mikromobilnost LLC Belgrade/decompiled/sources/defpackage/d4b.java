package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.messaging.base.view.EmojiDrawable;
import com.yandex.messaging.domain.statuses.StatusIconType;
import com.yandex.messaging.internal.MessageStatus;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.ui.badges.MarkedBadgeImageView;
import com.yandex.messaging.views.CounterTextView;
import java.util.Date;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class d4b {
    public final arg a;
    public final boolean b;
    public final AvatarImageView c;
    public final TextView d;
    public final TextView e;
    public final MarkedBadgeImageView f;
    public final MarkedBadgeImageView g;
    public final AppCompatImageView h;
    public final TextView i;
    public final ImageView j;
    public final CounterTextView k;
    public final TextView l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final Context p;
    public String q;
    public StatusIconType r;

    public d4b(View view, d820 d820Var, arg argVar, boolean z) {
        this.a = argVar;
        this.b = z;
        View findViewById = view.findViewById(e9h0.chat_list_item_avatar_view);
        ((AvatarImageView) findViewById).setTypeface(d820Var.b());
        this.c = (AvatarImageView) findViewById;
        this.d = (TextView) view.findViewById(e9h0.chat_list_item_title_text_view);
        this.e = (TextView) view.findViewById(e9h0.chat_list_item_content_text_view);
        this.f = (MarkedBadgeImageView) view.findViewById(e9h0.chat_list_item_badge);
        this.g = (MarkedBadgeImageView) view.findViewById(e9h0.chat_list_item_badge_2);
        this.h = (AppCompatImageView) view.findViewById(e9h0.chat_list_item_content_text_icon);
        this.i = (TextView) view.findViewById(e9h0.typing_text);
        this.j = (ImageView) view.findViewById(e9h0.typing_indicator);
        this.k = (CounterTextView) view.findViewById(e9h0.chat_list_item_counter_text_view);
        this.l = (TextView) view.findViewById(e9h0.chat_list_item_time_text_view);
        this.m = (ImageView) view.findViewById(e9h0.chat_list_message_status);
        this.n = (ImageView) view.findViewById(e9h0.chat_list_item_error_indicator);
        this.o = (ImageView) view.findViewById(e9h0.chat_list_item_mentions_indicator);
        this.p = view.getContext();
    }

    public final void a(List list) {
        cn4 cn4Var = (cn4) a.R(list);
        cn4 cn4Var2 = (cn4) a.S(1, list);
        this.f.setBadge(cn4Var);
        this.g.setBadge(cn4Var2);
        TextView textView = this.e;
        if (cn4Var == null && cn4Var2 == null) {
            if (textView != null) {
                textView.setMaxLines(2);
            }
        } else if (textView != null) {
            textView.setMaxLines(1);
        }
    }

    public final void b(Integer num) {
        AppCompatImageView appCompatImageView = this.h;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(num == null ? 8 : 0);
            if (num != null) {
                appCompatImageView.setImageResource(num.intValue());
            } else {
                appCompatImageView.setImageDrawable(null);
            }
        }
    }

    public final void c(MessageStatus messageStatus) {
        int i = messageStatus == null ? -1 : c4b.a[messageStatus.ordinal()];
        if (i == 1) {
            g(wwg0.msg_ic_message_status_in_progress);
            return;
        }
        if (i == 2) {
            g(wwg0.msg_ic_message_status_delivereed);
            return;
        }
        if (i == 3) {
            g(wwg0.msg_ic_message_status_read);
            return;
        }
        ImageView imageView = this.n;
        ImageView imageView2 = this.m;
        if (i == 4) {
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
            }
            ai91.f(imageView, false);
        } else {
            if (i != 5) {
                kbs.g("Incorrect message status");
                return;
            }
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
            }
            ai91.c(imageView, false);
        }
    }

    public final void d(Date date) {
        TextView textView = this.l;
        if (date != null) {
            if (textView != null) {
                textView.setText(this.a.a(date));
            }
            if (textView != null) {
                ai91.f(textView, false);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText("");
        }
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    public final void e(String str) {
        AnimatedVectorDrawableCompat create;
        int length = str.length();
        TextView textView = this.i;
        ImageView imageView = this.j;
        TextView textView2 = this.e;
        if (length == 0) {
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(4);
            }
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof AnimatedVectorDrawableCompat) {
                ((AnimatedVectorDrawableCompat) drawable).stop();
                if (imageView != null) {
                    imageView.setImageDrawable(null);
                    return;
                }
                return;
            }
            return;
        }
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(str);
        }
        if (((imageView != null ? imageView.getDrawable() : null) instanceof AnimatedVectorDrawableCompat) || imageView == null || (create = AnimatedVectorDrawableCompat.create(imageView.getContext(), wwg0.msg_anim_typing)) == null) {
            return;
        }
        create.start();
        if (imageView != null) {
            imageView.setImageDrawable(create);
        }
    }

    public final void f(r0k r0kVar) {
        this.c.updateDisplayUserStatus(r0kVar);
        gu21 gu21Var = r0kVar.a;
        du21 du21Var = gu21Var instanceof du21 ? (du21) gu21Var : null;
        String str = du21Var != null ? du21Var.d : null;
        StatusIconType statusIconType = du21Var != null ? du21Var.f : null;
        if (jl40.l(this.q, str) && this.r == statusIconType) {
            return;
        }
        this.r = statusIconType;
        this.q = str;
        TextView textView = this.d;
        if (statusIconType != null) {
            bob1.c(textView, statusIconType.getIconRes(), statusIconType.getColor(), 20);
        } else {
            if (str != null) {
                bob1.d(textView, new EmojiDrawable(str, textView.getTextSize() - kjs0.b(2)), false);
                return;
            }
            this.q = null;
            this.r = null;
            bob1.d(textView, null, false);
        }
    }

    public final void g(int i) {
        if (this.b) {
            return;
        }
        int i2 = jng0.messagingCommonIconsSecondaryColor;
        ImageView imageView = this.m;
        Drawable f = y3b1.f(imageView.getContext(), i, fxa1.c(i2, imageView.getContext()).data);
        if (f != null) {
            imageView.setImageDrawable(f);
        }
        ai91.c(this.n, false);
    }
}
