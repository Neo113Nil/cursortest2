package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.user.ImageStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.im.ui.views.avatars.a;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.tlo0;
import xsna.yyb;
import xsna.yyb.a;

/* compiled from: VhBaseMembersItemV2.kt */
/* loaded from: classes2.dex */
public abstract class mqr0<T extends yyb.a> extends kqr0<T> {
    public static final int p = iah0.a(4);
    public static final int q = iah0.a(20);
    public final jj0 l;
    public final DisplayNameFormatter m;
    public final VkCell n;
    public T o;

    /* compiled from: VhBaseMembersItemV2.kt */
    public static final class a implements VkCell.d {
        public final Context a;
        public final VkImAvatar b;

        public a(Context context) {
            this.a = context;
            VkImAvatar vkImAvatar = new VkImAvatar(context, null, 6, 0);
            vkImAvatar.S0();
            this.b = vkImAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                boolean z = cVar.c;
                VkImAvatar vkImAvatar = this.b;
                if (z) {
                    String str = cVar.b;
                    vkImAvatar.getClass();
                    VkImAvatar.p1(vkImAvatar, null, new com.vk.im.ui.views.avatars.a(vkImAvatar.getContext(), new a.b.C1179b(str), 2), false, 12);
                } else {
                    VkImAvatar.c1(vkImAvatar, cVar.a);
                }
                vkImAvatar.S0();
                if (cVar.d) {
                    vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkImAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
                }
                if (cVar.e) {
                    gko.b bVar = gko.Companion;
                    vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.a(gko.b(R.drawable.vk_icon_cake_circle_fill_purple_20, this.a), true, VkAvatarBadge.Alignment.TopRight, "birthday", 8));
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: VhBaseMembersItemV2.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: VhBaseMembersItemV2.kt */
    public static final class c implements VkCell.f {
        public final qtd0 a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public c(qtd0 qtd0Var, String str, boolean z, boolean z2, boolean z3) {
            this.a = qtd0Var;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            qtd0 qtd0Var = this.a;
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(urd0.a((qtd0Var == null ? 0 : qtd0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarViewParams(profile=");
            sb.append(this.a);
            sb.append(", incognitoName=");
            sb.append(this.b);
            sb.append(", isIncognitoForYou=");
            sb.append(this.c);
            sb.append(", isOnline=");
            sb.append(this.d);
            sb.append(", isBirthdayToday=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: VhBaseMembersItemV2.kt */
    public static final class d implements VkCell.d {
        public final Context a;
        public final LinearLayout b;
        public final VkEnhancedImageView c;
        public final VkEnhancedImageView d;
        public final VkEnhancedImageView e;

        public d(Context context) {
            this.a = context;
            LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
            VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(a.getContext(), null, 6, 0);
            vkEnhancedImageView.setId(R.id.cellStatusImage);
            int i = mqr0.q;
            vkEnhancedImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            a.setGravity(17);
            a.addView(vkEnhancedImageView);
            VkEnhancedImageView vkEnhancedImageView2 = new VkEnhancedImageView(a.getContext(), null, 6, 0);
            vkEnhancedImageView2.setId(R.id.cellMutedStatus);
            vkEnhancedImageView2.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            a.setGravity(17);
            a.addView(vkEnhancedImageView2);
            VkEnhancedImageView vkEnhancedImageView3 = new VkEnhancedImageView(a.getContext(), null, 6, 0);
            vkEnhancedImageView3.setId(R.id.cellAdminStatusImage);
            float f = 12;
            vkEnhancedImageView3.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
            a.setGravity(17);
            a.addView(vkEnhancedImageView3);
            this.b = a;
            this.c = (VkEnhancedImageView) a.findViewById(R.id.cellStatusImage);
            this.d = (VkEnhancedImageView) a.findViewById(R.id.cellMutedStatus);
            this.e = (VkEnhancedImageView) a.findViewById(R.id.cellAdminStatusImage);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            f fVar2 = fVar instanceof f ? (f) fVar : null;
            if (fVar2 != null) {
                boolean z = fVar2.a;
                String str = fVar2.d;
                VkEnhancedImageView vkEnhancedImageView = this.c;
                if (str != null) {
                    vkEnhancedImageView.setVisibility(0);
                    vkEnhancedImageView.o0(str, null);
                } else {
                    f4m.j(vkEnhancedImageView);
                }
                boolean z2 = fVar2.c;
                Context context = this.a;
                VkEnhancedImageView vkEnhancedImageView2 = this.d;
                if (z2) {
                    vkEnhancedImageView2.setVisibility(0);
                    vkEnhancedImageView2.setImageDrawable(enj.e(R.drawable.vk_icon_message_cross_16, R.attr.vk_ui_icon_secondary, context));
                    if (bwt0.K(vkEnhancedImageView)) {
                        awt0.b(mqr0.p, vkEnhancedImageView2);
                    }
                } else {
                    f4m.j(vkEnhancedImageView2);
                }
                boolean z3 = fVar2.b;
                VkEnhancedImageView vkEnhancedImageView3 = this.e;
                if (!z3 && !z) {
                    f4m.j(vkEnhancedImageView3);
                    return;
                }
                vkEnhancedImageView3.setVisibility(0);
                vkEnhancedImageView3.setImageDrawable(enj.e(R.drawable.vk_icon_favorite_12, z ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_tertiary, context));
                if (bwt0.K(vkEnhancedImageView) || bwt0.K(vkEnhancedImageView2)) {
                    awt0.b(mqr0.p, vkEnhancedImageView3);
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: VhBaseMembersItemV2.kt */
    public static final class e implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new d(context);
        }
    }

    /* compiled from: VhBaseMembersItemV2.kt */
    public static final class f implements VkCell.f {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final String d;

        public f(String str, boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && epx.f(this.d, fVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TitleAfterViewParams(isOwner=");
            sb.append(this.a);
            sb.append(", isAdmin=");
            sb.append(this.b);
            sb.append(", isRestrictedToWrite=");
            sb.append(this.c);
            sb.append(", statusImageUrl=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public mqr0(jj0 jj0Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.l = jj0Var;
        this.m = new DisplayNameFormatter(null, 3, null);
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.memberCell);
        this.n = vkCell;
        bwt0.i0(this.itemView, new mdm0(this, 11));
        vkCell.setLeftMainAvatarController(new b());
        vkCell.setTitleAfterController(new e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kqr0
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void W5(T t) {
        ImageStatus E5;
        ImageSize Ab;
        this.o = t;
        DialogMember c2 = t.c();
        ProfilesInfo e2 = t.e();
        Peer peer = c2.b;
        String str = c2.g;
        boolean k = qv20.k(e2.Bb(peer));
        Peer peer2 = c2.b;
        qtd0 Bb = e2.Bb(peer2);
        boolean z = (!peer2.Ab(Peer.Type.USER) || Bb == null || Bb.mb().Ab() || Bb.mb().zb() == null) ? false : true;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(e2.Bb(peer2), str == null ? "" : str, c2.zb(), z, k), 48));
        VkCell vkCell = this.n;
        vkCell.setLeft(a2);
        if (!c2.zb()) {
            ImFeatures imFeatures = ImFeatures.FEATURE_CHAT_MEMBER_NAME_ORDER;
            imFeatures.getClass();
            boolean a3 = com.vk.toggle.b.A.a(imFeatures);
            DisplayNameFormatter displayNameFormatter = this.m;
            if (a3 && o25.b(o25.a())) {
                str = displayNameFormatter.a(peer2, e2, DisplayNameFormatter.NameOrder.START_WITH_LASTNAME);
            } else {
                qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
                str = displayNameFormatter.a(peer2, e2, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME);
            }
        }
        int i = q;
        Object[] objArr = 0;
        String str2 = (Bb == null || (E5 = Bb.E5()) == null || (Ab = E5.d.Ab(i, false)) == null) ? null : Ab.d.d;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        VkCell.Middle.e eVar = str != null ? new VkCell.Middle.e(oq.d(tlo0.Companion, str), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, new VkCell.Middle.e.b.d(new f(str2, t.g(), t.f(), c2.j), new Size(i, i)), 18) : null;
        String j6 = j6(t);
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, j6 != null ? new VkCell.Middle.d(oq.d(tlo0.Companion, j6), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, null, 12));
        vkCell.setRight(t.a() ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d((gzs) new ikk0(this, 8), (tlo0.f) (objArr == true ? 1 : 0), 6), null, 27) : null);
    }

    public abstract String j6(T t);
}
