package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.picture.VkPictureOverlay;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.is5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fs5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fs5(int i, is5 is5Var, hdu0 hdu0Var) {
        this.b = 0;
        this.c = i;
        this.d = is5Var;
        this.e = hdu0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkAvatarBadge.Alignment alignment;
        VkAvatarBadge vkAvatarBadge;
        VkPictureOverlay vkPictureOverlay;
        com.vk.core.view.components.picture.c aVar;
        Dialog dialog;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                is5 is5Var = (is5) obj3;
                hdu0 hdu0Var = (hdu0) obj2;
                VkAvatar vkAvatar = (VkAvatar) obj;
                vkAvatar.setFixedSize(i2);
                vkAvatar.S0();
                Context context = vkAvatar.getContext();
                int i3 = is5.f.$EnumSwitchMapping$4[((BadgeAlignment) ((zak0) is5Var.i).getValue()).ordinal()];
                if (i3 == 1) {
                    alignment = VkAvatarBadge.Alignment.TopLeft;
                } else if (i3 == 2) {
                    alignment = VkAvatarBadge.Alignment.TopRight;
                } else if (i3 == 3) {
                    alignment = VkAvatarBadge.Alignment.BottomLeft;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    alignment = VkAvatarBadge.Alignment.BottomRight;
                }
                VkAvatarBadge.Alignment alignment2 = alignment;
                switch (is5.f.$EnumSwitchMapping$3[((is5.a) ((zak0) is5Var.h).getValue()).ordinal()]) {
                    case 1:
                        vkAvatarBadge = null;
                        break;
                    case 2:
                        vkAvatarBadge = new com.vk.core.view.components.avatar.badge.c(context, alignment2);
                        break;
                    case 3:
                        vkAvatarBadge = new com.vk.core.view.components.avatar.badge.e(context, alignment2, null);
                        break;
                    case 4:
                        vkAvatarBadge = new com.vk.core.view.components.avatar.badge.b(alignment2, false, null, null, 26);
                        break;
                    case 5:
                        e3m.a aVar2 = e3m.a;
                        vkAvatarBadge = new com.vk.core.view.components.avatar.badge.a(m33.a(R.drawable.vk_icon_donut_color_12, context), false, alignment2, (String) null, 24);
                        break;
                    case 6:
                        e3m.a aVar3 = e3m.a;
                        vkAvatarBadge = new com.vk.core.view.components.avatar.badge.a(m33.a(R.drawable.vk_icon_donut_color_12, context), true, alignment2, (String) null, 24);
                        break;
                    case 7:
                        vkAvatarBadge = new com.vk.core.view.components.avatar.badge.b(alignment2, true, null, null, 26);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (vkAvatarBadge != null) {
                    vkAvatar.Q0(vkAvatarBadge);
                }
                int i4 = is5.f.$EnumSwitchMapping$2[((is5.d) ((zak0) is5Var.j).getValue()).ordinal()];
                if (i4 == 1) {
                    vkPictureOverlay = null;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkPictureOverlay = new VkPictureOverlay(R.drawable.vk_icon_add_24, null, VkPictureOverlay.Tint.Dark);
                }
                vkAvatar.setOverlay(vkPictureOverlay);
                vkAvatar.setBorder(hdu0Var);
                int i5 = is5.f.$EnumSwitchMapping$1[((is5.b) ((zak0) is5Var.k).getValue()).ordinal()];
                if (i5 == 1) {
                    aVar = new c.a(R.drawable.vk_icon_user_28, R.attr.vk_ui_icon_tertiary);
                } else if (i5 == 2) {
                    cxu0.a.getClass();
                    aVar = new c.C0853c("ИБ", new eko(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[]{-8523270, -13912874})));
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new c.d("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", null);
                }
                vkAvatar.setContent(aVar);
                return s3q0.a;
            case 1:
                pgm pgmVar = (pgm) obj3;
                psm psmVar = (psm) obj2;
                oum oumVar = (oum) obj;
                List<pgm> list = oumVar.a;
                int indexOf = list.indexOf(pgmVar);
                int i6 = i2 - indexOf;
                zfm zfmVar = pgmVar instanceof zfm ? (zfm) pgmVar : null;
                Peer peer = zfmVar != null ? zfmVar.b : null;
                Iterator<Dialog> it = oumVar.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dialog = it.next();
                        if (epx.f(dialog.Zb(), peer)) {
                        }
                    } else {
                        dialog = null;
                    }
                }
                Dialog dialog2 = dialog;
                if (dialog2 == null) {
                    return oumVar;
                }
                int cc = dialog2.cc();
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(indexOf);
                arrayList.add(i2, pgmVar);
                tum tumVar = psmVar.i;
                di6.k(psmVar, new io.reactivex.rxjava3.internal.operators.completable.p(tumVar.a.C("DialogsListRepositoryImpl", new lim(cc - i6, peer))).q(tumVar.b), null, null, 3);
                return oum.a(oumVar, arrayList, null, null, null, null, null, null, null, null, null, null, null, 4094);
            case 2:
                h640 h640Var = (h640) obj3;
                u440 u440Var = (u440) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (h640Var != null) {
                    h640Var.a = bitmap;
                    ListDataSet listDataSet = u440Var.C0;
                    if (listDataSet != null) {
                        listDataSet.d(i2);
                    }
                }
                return s3q0.a;
            default:
                q3n0 q3n0Var = (q3n0) obj3;
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                q3n0Var.getClass();
                q3n0.f((Group) obj2, i2);
                q3n0Var.a.o6();
                j03.l(th);
                return s3q0.a;
        }
    }

    public /* synthetic */ fs5(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ fs5(pgm pgmVar, int i, psm psmVar) {
        this.b = 1;
        this.d = pgmVar;
        this.c = i;
        this.e = psmVar;
    }
}
