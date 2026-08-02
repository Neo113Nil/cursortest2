package xsna;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.ProgressButton;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;
import xsna.cq5;
import xsna.kr5;
import xsna.ozv;

/* compiled from: FriendRequestHolder.java */
/* loaded from: classes16.dex */
public final class qis extends vif0<RequestUserProfile> implements View.OnClickListener {
    public final View A;
    public final View B;
    public final com.vk.im.ui.views.avatars.b C;
    public final String D;

    @Nullable
    public vfk E;

    @Nullable
    public com.vk.friends.requests.impl.allrequests.presentation.a F;

    @Nullable
    public dv4 G;
    public final pxo0 H;
    public final TextView n;
    public final View o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final VKAvatarView t;
    public final VKImageView u;
    public final PhotoStackView v;
    public final ProgressButton w;
    public final ProgressButton x;
    public final TextView y;
    public final TextView z;

    /* compiled from: FriendRequestHolder.java */
    public enum a {
        REASON_SPAM(0),
        REASON_CHILD_PORNO(1),
        REASON_EXTREMISM(2),
        REASON_VIOLENCE(3),
        REASON_DRUG_PROPAGANDA(4),
        REASON_ADULT_CONTENT(5),
        REASON_INSULT(6),
        REASON_CALL_TO_SUICIDE(8);

        private final int value;

        a(int i) {
            this.value = i;
        }
    }

    public qis(@NonNull ViewGroup viewGroup, String str) {
        super(viewGroup, R.layout.vk_friend_request_item, 0);
        this.H = new pxo0(400L);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = this.itemView.findViewById(R.id.icon);
        this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.q = (TextView) this.itemView.findViewById(R.id.subtitle2);
        this.r = (TextView) this.itemView.findViewById(R.id.user_message);
        this.s = (TextView) this.itemView.findViewById(R.id.info);
        VKAvatarView vKAvatarView = (VKAvatarView) this.itemView.findViewById(R.id.photo);
        this.t = vKAvatarView;
        this.u = (VKImageView) this.itemView.findViewById(R.id.online);
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.users);
        this.v = photoStackView;
        photoStackView.setOverlapOffset(0.9f);
        photoStackView.setDrawBorder(true);
        ProgressButton progressButton = (ProgressButton) this.itemView.findViewById(R.id.positive);
        this.w = progressButton;
        ProgressButton progressButton2 = (ProgressButton) this.itemView.findViewById(R.id.negative);
        this.x = progressButton2;
        this.y = (TextView) this.itemView.findViewById(R.id.message);
        this.A = this.itemView.findViewById(R.id.divider_message_secondary_action);
        TextView textView = (TextView) this.itemView.findViewById(R.id.secondary_action);
        this.z = textView;
        this.B = this.itemView.findViewById(R.id.request_check_icon);
        progressButton.setOnClickListener(this);
        progressButton2.setOnClickListener(this);
        this.itemView.setOnClickListener(this);
        textView.setOnClickListener(this);
        vKAvatarView.setOnClickListener(this);
        this.D = str;
        this.C = new com.vk.im.ui.views.avatars.b(this.itemView.getContext(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(RequestUserProfile requestUserProfile) {
        Peer.Type type;
        Integer num;
        RequestUserProfile requestUserProfile2 = requestUserProfile;
        ozv.a.getClass();
        boolean z = requestUserProfile2.p0;
        if (z) {
            type = Peer.Type.CONTACT;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            type = Peer.Type.USER;
        }
        ozv.b bVar = new ozv.b(requestUserProfile2, type);
        com.vk.im.ui.views.avatars.b bVar2 = this.C;
        bVar2.getClass();
        Drawable e = bVar2.e(bVar.name(), bVar.t8());
        kr5.a aVar = new kr5.a(new dqz0(requestUserProfile2));
        aVar.c = requestUserProfile2.T ? cq5.h.a : cq5.b.a;
        aVar.d = e;
        s3q0 s3q0Var = s3q0.a;
        this.t.Y0(aVar.a());
        Integer a2 = zts.a(requestUserProfile2.n);
        VKImageView vKImageView = this.u;
        if (a2 != null) {
            vKImageView.setVisibility(0);
            vKImageView.setImageResource(a2.intValue());
        } else {
            f4m.j(vKImageView);
        }
        this.n.setText(requestUserProfile2.e);
        VerifyInfo verifyInfo = requestUserProfile2.B;
        boolean z2 = verifyInfo != null && verifyInfo.b;
        boolean z3 = verifyInfo != null && verifyInfo.c;
        View view = this.o;
        if (z2 || z3) {
            view.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28));
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        List<ProfileDescription> list = requestUserProfile2.E;
        int i = 2;
        TextView textView = this.q;
        TextView textView2 = this.p;
        if (list == null || list.isEmpty()) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            String str = list.get(0).e;
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str);
                textView2.setVisibility(0);
            }
            if (list.size() == 1) {
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                textView.setVisibility(8);
            } else {
                textView2.setSingleLine(true);
                textView2.setMaxLines(1);
                String str2 = list.get(1).e;
                if (TextUtils.isEmpty(str2)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str2);
                    textView.setVisibility(0);
                }
            }
        }
        int i2 = requestUserProfile2.l0 ? R.string.request_cancel : (requestUserProfile2.m0 || requestUserProfile2.n0) ? R.string.suggest_hide : R.string.request_declined;
        ProgressButton progressButton = this.x;
        progressButton.setText(i2);
        int i3 = TextUtils.isEmpty(requestUserProfile2.h0) ? 8 : 0;
        TextView textView3 = this.r;
        textView3.setVisibility(i3);
        textView3.setText(requestUserProfile2.h0);
        int i4 = requestUserProfile2.k0;
        TextView textView4 = this.s;
        PhotoStackView photoStackView = this.v;
        if (i4 > 0) {
            textView4.setVisibility(0);
            photoStackView.setVisibility(0);
            String str3 = (String) requestUserProfile2.b;
            MutualInfo mutualInfo = requestUserProfile2.d0;
            int intValue = (mutualInfo == null || (num = mutualInfo.b) == null) ? requestUserProfile2.k0 : num.intValue();
            if (str3 == null) {
                str3 = b6().getQuantityString(R.plurals.num_mutual_friends, intValue, Integer.valueOf(intValue));
                requestUserProfile2.b = str3;
            }
            textView4.setText(str3);
            UserProfile[] userProfileArr = requestUserProfile2.j0;
            if (userProfileArr != null) {
                photoStackView.setCount(userProfileArr.length);
                int i5 = 0;
                while (true) {
                    UserProfile[] userProfileArr2 = requestUserProfile2.j0;
                    if (i5 >= userProfileArr2.length) {
                        break;
                    }
                    photoStackView.h(i5, userProfileArr2[i5].h);
                    i5++;
                }
            } else {
                photoStackView.setVisibility(8);
                photoStackView.k();
            }
        } else {
            textView4.setVisibility(8);
            photoStackView.setVisibility(8);
            photoStackView.k();
        }
        boolean z4 = requestUserProfile2.j;
        TextView textView5 = this.z;
        View view2 = this.B;
        View view3 = this.A;
        TextView textView6 = this.y;
        ProgressButton progressButton2 = this.w;
        if (z4) {
            progressButton2.setVisibility(8);
            progressButton.setVisibility(8);
            textView6.setVisibility(0);
            textView6.setText(R.string.profile_btn_is_friend);
            view3.setVisibility(8);
            view2.setVisibility(8);
            textView5.setVisibility(8);
        } else if (requestUserProfile2.p0) {
            progressButton2.setText(R.string.recommendations_invite);
            progressButton2.setVisibility(0);
            progressButton.setVisibility(8);
            textView6.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(8);
            textView5.setVisibility(8);
        } else if (requestUserProfile2.i0 != null) {
            progressButton2.setVisibility(8);
            progressButton.setVisibility(8);
            textView6.setVisibility(0);
            RequestUserProfile requestUserProfile3 = (RequestUserProfile) this.m;
            textView6.setText(requestUserProfile3.l0 ? R.string.request_canceled : (requestUserProfile3.m0 || requestUserProfile3.n0) ? Boolean.TRUE.equals(requestUserProfile3.i0) ? R.string.request_sent : R.string.suggest_declined : Boolean.TRUE.equals(requestUserProfile3.i0) ? R.string.request_accepted : R.string.request_decline);
            if (((RequestUserProfile) this.m).d()) {
                RequestUserProfile requestUserProfile4 = (RequestUserProfile) this.m;
                if (!requestUserProfile4.m0 && !requestUserProfile4.l0 && requestUserProfile4.c.b != 0) {
                    view3.setVisibility(0);
                    RequestUserProfile requestUserProfile5 = (RequestUserProfile) this.m;
                    if (!(requestUserProfile5.l0 ^ Boolean.FALSE.equals(requestUserProfile5.i0))) {
                        UserId userId = requestUserProfile5.c;
                        textView5.setText(g6(R.string.request_new_message));
                        textView5.setVisibility(0);
                        textView5.setOnClickListener(new brg(i, this, userId));
                    } else if (requestUserProfile5.q0) {
                        f4m.j(textView5);
                        f4m.j(view3);
                        textView6.setText(R.string.report_sent);
                    } else {
                        textView5.setText(g6(R.string.report_send));
                        textView5.setVisibility(0);
                        textView5.setOnClickListener(new wnb(3, this, requestUserProfile5));
                    }
                }
            }
            RequestUserProfile requestUserProfile6 = (RequestUserProfile) this.m;
            if (!requestUserProfile6.l0 && Boolean.TRUE.equals(requestUserProfile6.i0)) {
                view2.setVisibility(0);
            }
        } else {
            progressButton.setVisibility(0);
            progressButton2.setText(R.string.friends_add);
            progressButton2.setVisibility(((RequestUserProfile) this.m).l0 ? 8 : 0);
            textView6.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(8);
            textView5.setVisibility(8);
        }
        if (xo9.s(requestUserProfile2)) {
            progressButton2.S(true);
            progressButton2.setEnabled(true);
            progressButton.S(false);
            progressButton.setEnabled(false);
        } else if (xo9.r(requestUserProfile2)) {
            progressButton2.S(false);
            progressButton2.setEnabled(false);
            progressButton.S(true);
            progressButton.setEnabled(true);
        } else {
            progressButton2.S(false);
            progressButton2.setEnabled(true);
            progressButton.S(false);
            progressButton.setEnabled(true);
        }
        int a3 = pvo0.a();
        StringBuilder sb = new StringBuilder("friend_recomm_view:");
        sb.append(requestUserProfile2.c);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        String str4 = this.D;
        sb.append(str4);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(requestUserProfile2.J);
        String sb2 = sb.toString();
        if (com.vkontakte.android.data.b.i(sb2)) {
            return;
        }
        String str5 = requestUserProfile2.c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a3 + "||" + str4 + "||" + requestUserProfile2.J;
        b.d dVar = new b.d("show_user_rec");
        dVar.b = true;
        dVar.c = true;
        dVar.b(str5, "user_ids");
        dVar.e();
        com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, sb2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.vk.friends.requests.impl.allrequests.presentation.a aVar;
        com.vk.friends.requests.impl.allrequests.presentation.a aVar2;
        RequestUserProfile requestUserProfile = (RequestUserProfile) this.m;
        if (requestUserProfile == null || this.H.a()) {
            return;
        }
        if (view == this.itemView) {
            vfk vfkVar = this.E;
            if (vfkVar == null || requestUserProfile.p0) {
                return;
            }
            vfkVar.invoke(requestUserProfile);
            return;
        }
        if (view == this.w) {
            if (xo9.s(requestUserProfile) || (aVar2 = this.F) == null) {
                return;
            }
            aVar2.invoke(requestUserProfile, Boolean.TRUE, Integer.valueOf(getAbsoluteAdapterPosition()));
            return;
        }
        if (view == this.x) {
            if (xo9.r(requestUserProfile) || (aVar = this.F) == null) {
                return;
            }
            aVar.invoke(requestUserProfile, Boolean.valueOf(requestUserProfile.l0), Integer.valueOf(getAbsoluteAdapterPosition()));
            return;
        }
        if (view == this.t) {
            dv4 dv4Var = this.G;
            if (dv4Var != null && requestUserProfile.T) {
                dv4Var.invoke(requestUserProfile, view);
                return;
            }
            vfk vfkVar2 = this.E;
            if (vfkVar2 == null || requestUserProfile.p0) {
                return;
            }
            vfkVar2.invoke(requestUserProfile);
        }
    }
}
