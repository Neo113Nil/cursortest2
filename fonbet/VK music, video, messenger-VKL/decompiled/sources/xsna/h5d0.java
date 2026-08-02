package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vk.dto.common.OccupationType;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PreviewProfileVc.kt */
/* loaded from: classes2.dex */
public final class h5d0 {
    public e5d0 a;
    public View b;
    public AvatarView c;
    public TextView d;
    public View e;
    public StackAvatarView f;
    public TextView g;
    public Group h;
    public ImageView i;
    public TextView j;
    public Group k;
    public TextView l;
    public Group m;
    public TextView n;
    public Group o;
    public TextView p;
    public ProgressWheel q;
    public TextView r;
    public ProgressWheel s;
    public ConstraintLayout t;
    public final io.reactivex.rxjava3.subjects.d<f5d0> u = io.reactivex.rxjava3.subjects.d.N0();
    public SimpleDateFormat v;

    /* compiled from: PreviewProfileVc.kt */
    public static abstract class a {

        /* compiled from: PreviewProfileVc.kt */
        /* renamed from: xsna.h5d0$a$a, reason: collision with other inner class name */
        public static final class C2974a extends a {
            public final UserSex a;
            public final String b;

            public C2974a(UserSex userSex, String str) {
                this.a = userSex;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2974a)) {
                    return false;
                }
                C2974a c2974a = (C2974a) obj;
                return this.a == c2974a.a && epx.f(this.b, c2974a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Banned(userSex=");
                sb.append(this.a);
                sb.append(", userName=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: PreviewProfileVc.kt */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Enabled(friendStatus="), this.a, ')');
            }
        }

        /* compiled from: PreviewProfileVc.kt */
        public static final class c extends a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Loading(friendStatus="), this.a, ')');
            }
        }
    }

    /* compiled from: PreviewProfileVc.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OccupationType.values().length];
            try {
                iArr[OccupationType.WORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OccupationType.SCHOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OccupationType.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(f5d0 f5d0Var) {
        int i;
        int i2;
        int i3;
        Group group;
        TextView textView;
        SimpleDateFormat simpleDateFormat;
        Integer valueOf = Integer.valueOf(R.attr.vk_legacy_accent);
        ConstraintLayout constraintLayout = this.t;
        String str = null;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        if (constraintLayout.getVisibility() != 0) {
            View view = this.b;
            if (view == null) {
                view = null;
            }
            zmp0.a((ViewGroup) view, null);
            ProgressWheel progressWheel = this.s;
            if (progressWheel == null) {
                progressWheel = null;
            }
            progressWheel.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.t;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            constraintLayout2.setVisibility(0);
        }
        User user = f5d0Var.a;
        AvatarView avatarView = this.c;
        if (avatarView == null) {
            avatarView = null;
        }
        avatarView.Y0(user);
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        String Db = user.Db();
        Integer num = user.M;
        Integer num2 = user.L;
        OccupationType occupationType = user.J;
        String str2 = user.I;
        int i4 = user.z;
        textView2.setText(Db);
        View view2 = this.e;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(i4 == 3 ? 0 : 8);
        ArrayList arrayList = f5d0Var.b;
        int i5 = f5d0Var.c;
        Group group2 = this.h;
        if (group2 == null) {
            group2 = null;
        }
        group2.setVisibility(arrayList.isEmpty() ? 8 : 0);
        StackAvatarView stackAvatarView = this.f;
        if (stackAvatarView == null) {
            stackAvatarView = null;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qtd0) it.next()).C8());
        }
        int i6 = StackAvatarView.n;
        stackAvatarView.getClass();
        stackAvatarView.d(new i5g(arrayList2), i5, null);
        TextView textView3 = this.g;
        if (textView3 == null) {
            textView3 = null;
        }
        View view3 = this.b;
        if (view3 == null) {
            view3 = null;
        }
        textView3.setText(view3.getContext().getResources().getQuantityString(R.plurals.vkim_msg_list_empty_common_friends_count, i5, Integer.valueOf(i5)));
        Group group3 = this.m;
        if (group3 == null) {
            group3 = null;
        }
        group3.setVisibility(!drm0.N(str2) ? 0 : 8);
        TextView textView4 = this.l;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setText(str2);
        Group group4 = this.k;
        if (group4 == null) {
            group4 = null;
        }
        group4.setVisibility(occupationType != OccupationType.UNKNOWN ? 0 : 8);
        int i7 = b.$EnumSwitchMapping$0[occupationType.ordinal()];
        int i8 = i7 != 1 ? (i7 == 2 || i7 == 3) ? R.drawable.vk_icon_education_outline_20 : 0 : R.drawable.vk_icon_work_outline_20;
        ImageView imageView = this.i;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(i8);
        TextView textView5 = this.j;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(user.K);
        Object cVar = f5d0Var.d ? new a.c(i4) : (!user.i || user.j) ? new a.b(i4) : new a.C2974a(user.g, user.o);
        boolean z = cVar instanceof a.c;
        int i9 = R.drawable.vkui_bg_button_secondary;
        if (z) {
            ProgressWheel progressWheel2 = this.q;
            if (progressWheel2 == null) {
                progressWheel2 = null;
            }
            progressWheel2.setVisibility(0);
            TextView textView6 = this.p;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setVisibility(0);
            TextView textView7 = this.r;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setVisibility(8);
            TextView textView8 = this.p;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setClickable(false);
            TextView textView9 = this.p;
            if (textView9 == null) {
                textView9 = null;
            }
            textView9.setEnabled(false);
            TextView textView10 = this.p;
            if (textView10 == null) {
                textView10 = null;
            }
            textView10.setText("");
            TextView textView11 = this.p;
            if (textView11 == null) {
                textView11 = null;
            }
            int i10 = ((a.c) cVar).a;
            if (i10 != 1 && i10 != 3) {
                i9 = R.drawable.vkui_bg_button_primary;
            }
            textView11.setBackgroundResource(i9);
            if (i10 == 1 || i10 == 3) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                TextView textView12 = this.p;
                if (textView12 == null) {
                    textView12 = null;
                }
                Drawable background = textView12.getBackground();
                if (background != null) {
                    background.setTintList(ColorStateList.valueOf(dhr0.t.c(intValue)));
                }
            }
        } else {
            if (!(cVar instanceof a.C2974a)) {
                if (!(cVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProgressWheel progressWheel3 = this.q;
                if (progressWheel3 == null) {
                    progressWheel3 = null;
                }
                i = 8;
                progressWheel3.setVisibility(8);
                TextView textView13 = this.p;
                if (textView13 == null) {
                    textView13 = null;
                }
                i2 = 0;
                textView13.setVisibility(0);
                TextView textView14 = this.r;
                if (textView14 == null) {
                    textView14 = null;
                }
                textView14.setVisibility(8);
                TextView textView15 = this.p;
                if (textView15 == null) {
                    textView15 = null;
                }
                textView15.setClickable(true);
                TextView textView16 = this.p;
                if (textView16 == null) {
                    textView16 = null;
                }
                textView16.setEnabled(true);
                TextView textView17 = this.p;
                if (textView17 == null) {
                    textView17 = null;
                }
                int i11 = ((a.b) cVar).a;
                if (i11 == 0) {
                    i3 = R.string.vkim_msg_list_empty_friends_status_add;
                } else if (i11 == 1) {
                    i3 = R.string.vkim_msg_list_empty_friends_status_sent;
                } else if (i11 == 2) {
                    i3 = R.string.vkim_msg_list_empty_friends_status_accept;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("Friend status is not valid!");
                    }
                    i3 = R.string.vkim_chat_profile_action_preview_profile_full;
                }
                textView17.setText(i3);
                TextView textView18 = this.p;
                if (textView18 == null) {
                    textView18 = null;
                }
                if (i11 != 1 && i11 != 3) {
                    i9 = R.drawable.vkui_bg_button_primary;
                }
                textView18.setBackgroundResource(i9);
                TextView textView19 = this.p;
                if (textView19 == null) {
                    textView19 = null;
                }
                int i12 = (i11 == 1 || i11 == 3) ? R.style.VkLegacyButton_Secondary : R.style.VkLegacyButton_Primary;
                qcy<Object>[] qcyVarArr = bwt0.a;
                textView19.setTextAppearance(i12);
                Integer num3 = (i11 == 1 || i11 == 3) ? valueOf : null;
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    TextView textView20 = this.p;
                    if (textView20 == null) {
                        textView20 = null;
                    }
                    textView20.setTextColor(dhr0.t.c(intValue2));
                }
                if (i11 == 1 || i11 == 3) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue3 = valueOf.intValue();
                    TextView textView21 = this.p;
                    if (textView21 == null) {
                        textView21 = null;
                    }
                    Drawable background2 = textView21.getBackground();
                    if (background2 != null) {
                        background2.setTintList(ColorStateList.valueOf(dhr0.t.c(intValue3)));
                    }
                }
                group = this.o;
                if (group == null) {
                    group = null;
                }
                group.setVisibility((this.v != null || num2 == null || num == null) ? i : i2);
                textView = this.n;
                if (textView == null) {
                    textView = null;
                }
                simpleDateFormat = this.v;
                if (simpleDateFormat != null && num != null && num2 != null) {
                    str = simpleDateFormat.format(new Date(1900, num.intValue() - 1, num2.intValue()));
                }
                textView.setText(str);
            }
            ProgressWheel progressWheel4 = this.q;
            if (progressWheel4 == null) {
                progressWheel4 = null;
            }
            progressWheel4.setVisibility(8);
            TextView textView22 = this.p;
            if (textView22 == null) {
                textView22 = null;
            }
            textView22.setVisibility(4);
            TextView textView23 = this.r;
            if (textView23 == null) {
                textView23 = null;
            }
            textView23.setVisibility(0);
            a.C2974a c2974a = (a.C2974a) cVar;
            int i13 = c2974a.a == UserSex.FEMALE ? R.string.vkim_blacklisted_f : R.string.vkim_blacklisted_m;
            TextView textView24 = this.r;
            TextView textView25 = textView24 == null ? null : textView24;
            if (textView24 == null) {
                textView24 = null;
            }
            textView25.setText(textView24.getContext().getString(i13, c2974a.b));
        }
        i = 8;
        i2 = 0;
        group = this.o;
        if (group == null) {
        }
        group.setVisibility((this.v != null || num2 == null || num == null) ? i : i2);
        textView = this.n;
        if (textView == null) {
        }
        simpleDateFormat = this.v;
        if (simpleDateFormat != null) {
            str = simpleDateFormat.format(new Date(1900, num.intValue() - 1, num2.intValue()));
        }
        textView.setText(str);
    }
}
