package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Copyright;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: CopyrightBottomSheetController.kt */
/* loaded from: classes4.dex */
public final class mtj {
    public static final int a;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        a = e3m.a(R.dimen.newsfeed_copyright_image_size, context);
    }

    public final void a(final Context context, final Post post) {
        final Copyright copyright;
        Activity h = e3m.h(context);
        if (h == null || (copyright = post.O) == null) {
            return;
        }
        final Owner owner = copyright.e;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(h).inflate(R.layout.dialog_copyright_newsfeed, (ViewGroup) null);
        if (owner != null) {
            ((VkImage) viewGroup.findViewById(R.id.dialog_copyright_author_avatar_image)).o0(owner.f(a), null);
            ((TextView) viewGroup.findViewById(R.id.dialog_copyright_author_name_text)).setText(owner.c);
        }
        final TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_copyright_source_text);
        final VkImage vkImage = (VkImage) viewGroup.findViewById(R.id.dialog_copyright_author_avatar_image);
        final TextView textView2 = (TextView) viewGroup.findViewById(R.id.dialog_copyright_author_name_text);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new otj(post.o.b, copyright.c, copyright.f), null, null, 3);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.jtj
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                yqt yqtVar = (yqt) obj;
                Owner owner2 = Owner.this;
                TextView textView3 = textView2;
                VkImage vkImage2 = vkImage;
                int i = 0;
                if (owner2 == null) {
                    ApiApplication apiApplication = yqtVar.d;
                    vkImage2.o0(apiApplication != null ? apiApplication.d.Fb(mtj.a, false).d.d : null, null);
                    String str = yqtVar.c;
                    if (str == null) {
                        str = "";
                    }
                    textView3.setText(str);
                }
                Copyright copyright2 = copyright;
                Copyright.Type type = copyright2.f;
                String str2 = copyright2.g;
                Copyright.Type type2 = Copyright.Type.EXTERNAL_LINK;
                if (type == type2) {
                    abg0 abg0Var = dhr0.t;
                    vkImage2.setBackgroundTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_image_placeholder)));
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    vkImage2.setBackgroundTintMode(mode);
                    vkImage2.setBackgroundResource(R.drawable.bg_white_circle);
                    vkImage2.setImageTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary)));
                    vkImage2.setImageTintMode(mode);
                    vkImage2.setScaleType(ImageView.ScaleType.CENTER);
                    vkImage2.setImageResource(R.drawable.vk_icon_link_outline_36);
                    textView3.setText(str2);
                    yqtVar.c = str2;
                }
                UserId userId = post.m;
                UserId userId2 = copyright2.c;
                Copyright.Type type3 = copyright2.f;
                this.getClass();
                int i2 = yqtVar.b;
                Context context2 = context;
                String string = i2 != 1 ? i2 != 2 ? context2.getString(R.string.newsfeed_copyright_subtitle_used_neu) : context2.getString(R.string.newsfeed_copyright_subtitle_used_mas) : context2.getString(R.string.newsfeed_copyright_subtitle_used_fem);
                if (fkq0.d(userId)) {
                    Copyright.Type type4 = Copyright.Type.OWNER;
                    if (type3 == type4 && fkq0.d(userId2)) {
                        i = R.string.newsfeed_copyright_user_user_description;
                    } else if (type3 == type4 && fkq0.b(userId2)) {
                        i = R.string.newsfeed_copyright_user_group_description;
                    } else if (type3 == Copyright.Type.APP) {
                        i = R.string.newsfeed_copyright_user_app_description;
                    } else if (type3 == Copyright.Type.VK_APP) {
                        i = R.string.newsfeed_copyright_user_service_description;
                    } else if (type3 == type2) {
                        i = R.string.newsfeed_copyright_user_link_description;
                    }
                } else {
                    Copyright.Type type5 = Copyright.Type.OWNER;
                    if (type3 == type5 && fkq0.d(userId2)) {
                        i = R.string.newsfeed_copyright_group_user_description;
                    } else if (type3 == type5 && fkq0.b(userId2)) {
                        i = R.string.newsfeed_copyright_group_group_description;
                    } else if (type3 == Copyright.Type.APP) {
                        i = R.string.newsfeed_copyright_group_app_description;
                    } else if (type3 == Copyright.Type.VK_APP) {
                        i = R.string.newsfeed_copyright_group_service_description;
                    } else if (type3 == type2) {
                        i = R.string.newsfeed_copyright_group_link_description;
                    }
                }
                textView.setText(context2.getString(i, yqtVar.a, string, yqtVar.c));
            }
        };
        int i = kwg0.a;
        final dw20 I0 = new dw20.b(h, null).D0(viewGroup, false).Z(new ktj(y0.subscribe(fVar, new iwg0()), 0)).I0(null);
        View findViewById = viewGroup.findViewById(R.id.dialog_copyright_button);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: xsna.ltj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    Copyright copyright2 = Post.this.O;
                    if (copyright2 != null && (str = copyright2.b) != null) {
                        xwk.d().e().a(context, str);
                    }
                    I0.hide();
                }
            });
        }
    }
}
