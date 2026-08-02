package xsna;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChatMessageRequestVc.kt */
/* loaded from: classes2.dex */
public final class ttb extends eyy {
    public final a e;
    public AvatarView f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public StackAvatarView j;
    public TextView k;
    public AvatarView l;
    public TextView m;
    public View n;
    public View o;
    public final bpn0 p;

    /* compiled from: ChatMessageRequestVc.kt */
    public interface a {
        void a(Peer peer);

        void b();

        void onAccept();

        void onClose();
    }

    /* compiled from: ChatMessageRequestVc.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserSex.values().length];
            try {
                iArr[UserSex.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ttb(a aVar, ViewGroup viewGroup) {
        super(R.id.dialogs_chat_message_request_stub, viewGroup);
        this.e = aVar;
        this.p = new bpn0(new l1(this, 18));
    }

    @Override // xsna.eyy
    public final void b(View view) {
        this.f = (AvatarView) view.findViewById(R.id.chat_avatar);
        this.g = (ImageView) view.findViewById(R.id.chat_avatar_casper);
        this.h = (TextView) view.findViewById(R.id.chat_name);
        this.i = (TextView) view.findViewById(R.id.members_count);
        this.j = (StackAvatarView) view.findViewById(R.id.members_avatars);
        this.k = (TextView) view.findViewById(R.id.info_text);
        this.l = (AvatarView) view.findViewById(R.id.inviter_avatar);
        this.m = (TextView) view.findViewById(R.id.inviter_info);
        this.n = view.findViewById(R.id.msg_request_accept);
        this.o = view.findViewById(R.id.msg_request_reject);
        ((Toolbar) view.findViewById(R.id.toolbar)).setNavigationOnClickListener(new ko3(this, 1));
    }

    public final void c() {
        if (this.c) {
            View view = this.d;
            if (view == null) {
                view = null;
            }
            d3m.e(view, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            ((bzb0) this.p.getValue()).a();
        }
    }

    public final void d(stb stbVar) {
        String str;
        String string;
        a();
        View view = this.d;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new xr0(9));
        Dialog dialog = stbVar.a;
        ProfilesInfo profilesInfo = stbVar.d;
        qtd0 Bb = profilesInfo.Bb(stbVar.f);
        ImageList C8 = Bb != null ? Bb.C8() : null;
        ChatSettings Hb = dialog.Hb();
        AvatarView avatarView = this.f;
        if (avatarView == null) {
            avatarView = null;
        }
        avatarView.getClass();
        avatarView.X0(dialog, profilesInfo.Ob());
        boolean z = Hb.g;
        if (z) {
            int i = cz9.b;
            AvatarView avatarView2 = this.f;
            if (avatarView2 == null) {
                avatarView2 = null;
            }
            cz9 cz9Var = new cz9(avatarView2.getContext(), R.drawable.ic_ghost_18, iah0.a(2.0f), iah0.a(4.0f));
            cz9Var.getDrawable(1).setTint(c4g0.t(dialog.hc()));
            ImageView imageView = this.g;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageDrawable(cz9Var);
            ImageView imageView2 = this.g;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setVisibility(0);
        } else {
            ImageView imageView3 = this.g;
            if (imageView3 == null) {
                imageView3 = null;
            }
            f4m.j(imageView3);
        }
        StackAvatarView stackAvatarView = this.j;
        if (stackAvatarView == null) {
            stackAvatarView = null;
        }
        stackAvatarView.e(stbVar.b, stbVar.c, profilesInfo.Ob());
        AvatarView avatarView3 = this.l;
        if (avatarView3 == null) {
            avatarView3 = null;
        }
        avatarView3.T0(C8, null);
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(Hb.b);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        View view2 = this.b;
        textView2.setText(enj.f(R.plurals.vkim_chat_settings_members_count, dialog.Hb().f, view2.getContext()));
        TextView textView3 = this.m;
        if (textView3 == null) {
            textView3 = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (Bb == null || (str = Bb.name()) == null) {
            str = "...";
        }
        spannableStringBuilder.append((CharSequence) str);
        Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, view2.getContext());
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        nik0.a(spannableStringBuilder, a2, 0, spannableStringBuilder.length());
        UserSex B2 = Bb != null ? Bb.B2() : null;
        int i2 = (B2 == null ? -1 : b.$EnumSwitchMapping$0[B2.ordinal()]) == 1 ? z ? R.string.vkim_chat_inviter_text_female_casper : R.string.vkim_chat_inviter_text_female_default : z ? R.string.vkim_chat_inviter_text_male_casper : R.string.vkim_chat_inviter_text_male_default;
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) view2.getContext().getString(i2));
        textView3.setText(spannableStringBuilder);
        TextView textView4 = this.k;
        if (textView4 == null) {
            textView4 = null;
        }
        if (z) {
            string = view2.getContext().getString(R.string.vkim_chat_message_request_info_casper);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            string = view2.getContext().getString(R.string.vkim_chat_message_request_info_default);
        }
        textView4.setText(string);
        AvatarView avatarView4 = this.l;
        if (avatarView4 == null) {
            avatarView4 = null;
        }
        int i3 = 5;
        bwt0.i0(avatarView4, new nk0(i3, stbVar, this));
        TextView textView5 = this.m;
        if (textView5 == null) {
            textView5 = null;
        }
        bwt0.i0(textView5, new m9(i3, stbVar, this));
        View view3 = this.n;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.i0(view3, new k00(this, 21));
        View view4 = this.o;
        bwt0.i0(view4 != null ? view4 : null, new o9(8, this, Bb));
    }
}
