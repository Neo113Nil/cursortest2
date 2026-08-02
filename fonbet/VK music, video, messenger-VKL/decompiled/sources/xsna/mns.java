package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.ProfileDescription;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ayv0;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;

/* compiled from: FriendsCleanupProfileHolder.kt */
/* loaded from: classes15.dex */
public final class mns extends nfz<ens> {
    public final iw3 m;
    public final VkRichCell n;
    public final b o;

    /* compiled from: FriendsCleanupProfileHolder.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            int k = VkCell.Left.Main.Size.Large.k(context);
            vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(k, k));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                kr5 kr5Var = cVar.a;
                VkAvatar vkAvatar = this.a;
                vkAvatar.o0(kr5Var.b(vkAvatar.getWidth()), null);
                vkAvatar.S0();
                if (((c) fVar).b.Bb()) {
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FriendsCleanupProfileHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: FriendsCleanupProfileHolder.kt */
    public static final class c implements VkCell.f {
        public final kr5 a;
        public final OnlineInfo b;

        public c(kr5 kr5Var, OnlineInfo onlineInfo) {
            this.a = kr5Var;
            this.b = onlineInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AvatarViewParams(avatarImageConfig=" + this.a + ", onlineInfo=" + this.b + ')';
        }
    }

    public mns(ViewGroup viewGroup, iw3 iw3Var) {
        super(R.layout.friends_cleanup_profile_item, viewGroup);
        this.m = iw3Var;
        this.n = (VkRichCell) this.itemView;
        this.o = new b();
    }

    public static tgv0.a h6(List list, tlo0 tlo0Var) {
        List H0 = j5g.H0(list, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            String a2 = js5.a(50, (String) it.next());
            ayv0.c cVar = a2 != null ? new ayv0.c(a2) : null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return new tgv0.a(arrayList, null, tlo0Var, VkUserStack.Size.Small, null, 66);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v25, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        tgv0.a aVar;
        ?? r4;
        String str;
        List<Image> list;
        String str2;
        ens ensVar = (ens) hfzVar;
        this.l = ensVar;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        VkRichCell vkRichCell = this.n;
        vkRichCell.setLayoutParams(layoutParams);
        vkRichCell.setOnClickListener(new sch(2, this, ensVar));
        vkRichCell.setLeftMainAvatarController(this.o);
        vkRichCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(ensVar.c, ensVar.g), VkCell.Left.Main.Size.Medium)));
        VerifyInfo verifyInfo = ensVar.h;
        String str3 = ensVar.e;
        tgv0.a aVar2 = null;
        aVar2 = null;
        aVar2 = null;
        Drawable h = verifyInfo.Cb() ? VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, vkRichCell.getContext(), null, 28) : null;
        ngv0.a aVar3 = h != null ? new ngv0.a(new eko(h), null, null, null, 12) : null;
        tlo0.h d = oq.d(tlo0.Companion, ensVar.d);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, aVar3, 1, 2);
        ugv0 ugv0Var = myc0.f(str3) ? new ugv0(new tlo0.h(cqm0.c(e3m.f(R.attr.vk_ui_text_secondary, vkRichCell.getContext()), str3)), (ngv0.a) null, (ngv0.a) null, 1, (fy0) null, 38) : null;
        ProfileDescription profileDescription = ensVar.f;
        qgv0 qgv0Var = ((profileDescription != null ? profileDescription.b : null) != ProfileDescription.Type.TEXT || (str2 = profileDescription.e) == null) ? null : new qgv0(new tlo0.h(str2), (ngv0.a) null, (ngv0.a) null, 1, 6);
        if (qgv0Var == null) {
            Object obj = this.l;
            ProfileDescription profileDescription2 = ((ens) (obj != null ? obj : null)).f;
            Object obj2 = obj;
            if ((profileDescription2 != null ? profileDescription2.b : null) == ProfileDescription.Type.IMAGES) {
                if (obj == null) {
                    obj2 = null;
                }
                ProfileDescription profileDescription3 = ((ens) obj2).f;
                if (profileDescription3 == null || (list = profileDescription3.d) == null) {
                    r4 = EmptyList.b;
                } else {
                    r4 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ImageSize Cb = ((Image) it.next()).Cb(iah0.a(16), true, false);
                        String str4 = Cb != null ? Cb.d.d : null;
                        if (str4 != null) {
                            r4.add(str4);
                        }
                    }
                }
                Object obj3 = this.l;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                ProfileDescription profileDescription4 = ((ens) obj4).f;
                aVar = h6(r4, (profileDescription4 == null || (str = profileDescription4.e) == null) ? null : oq.d(tlo0.Companion, str));
            } else {
                aVar = null;
            }
            if (aVar == null) {
                Object obj5 = this.l;
                Object obj6 = obj5 != null ? obj5 : null;
                Object obj7 = obj5;
                if (((ens) obj6).i.a > 0) {
                    if (obj5 == null) {
                        obj7 = null;
                    }
                    List<Image> list2 = ((ens) obj7).i.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ImageSize Cb2 = ((Image) it2.next()).Cb(iah0.a(16), true, false);
                        arrayList.add(Cb2 != null ? Cb2.d.d : null);
                    }
                    tlo0.a aVar4 = tlo0.Companion;
                    Object obj8 = this.l;
                    int i = ((ens) (obj8 != null ? obj8 : null)).i.a;
                    Object[] objArr = {Integer.valueOf(((ens) (obj8 != null ? obj8 : null)).i.a)};
                    aVar4.getClass();
                    aVar2 = h6(arrayList, tlo0.a.a(R.plurals.friends_cleanup_cell_mutual_friends, i, objArr));
                }
            }
            if (aVar != null) {
                aVar2 = aVar;
            }
        }
        vkRichCell.setMiddle(new pgv0(vgv0Var, ugv0Var, qgv0Var, aVar2, null, null, 488));
        vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(tq.h(tlo0.Companion, ensVar.j), new com.vk.newsfeed.common.recycler.holders.attachments.a(17, this, ensVar), VkButton.Appearance.Accent, VkButton.Mode.Secondary, VkButton.Size.Medium, null, null, null, 2016), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        u1u0.g(vkRichCell);
    }
}
