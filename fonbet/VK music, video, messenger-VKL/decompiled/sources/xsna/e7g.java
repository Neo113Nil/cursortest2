package xsna;

import android.content.Context;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.VkPictureOverlay;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ala0;
import xsna.e3m;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class e7g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7g(int i, izs izsVar) {
        this.b = 0;
        this.c = i;
        this.d = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.core.view.components.picture.c aVar;
        VkPicture.CornerRadius cornerRadius;
        VkPictureOverlay vkPictureOverlay;
        ycv0 ycv0Var;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                final izs izsVar = (izs) obj2;
                j7g j7gVar = (j7g) obj;
                j7gVar.m.add(new c380() { // from class: xsna.f7g
                    @Override // xsna.c380
                    public final void a(int i3) {
                        izs.this.invoke(Integer.valueOf(i3 | (-16777216)));
                    }
                });
                j7gVar.setRenderer(new jur());
                j7gVar.setInitialColor(i2);
                return s3q0.a;
            case 1:
                ala0 ala0Var = (ala0) obj2;
                VkPicture vkPicture = (VkPicture) obj;
                int i3 = ala0.e.$EnumSwitchMapping$1[((ala0.b) ((zak0) ala0Var.n).getValue()).ordinal()];
                if (i3 == 1) {
                    vkPicture.getContext();
                    aVar = new c.a(R.drawable.vk_icon_users_12, R.attr.vk_ui_icon_tertiary);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new c.d("https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg", null);
                }
                vkPicture.setContent(aVar);
                int i4 = ala0.e.$EnumSwitchMapping$2[((PictureRadius) ((zak0) ala0Var.j).getValue()).ordinal()];
                if (i4 == 1) {
                    cornerRadius = VkPicture.CornerRadius.Small;
                } else if (i4 == 2) {
                    cornerRadius = VkPicture.CornerRadius.Medium;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cornerRadius = VkPicture.CornerRadius.Large;
                }
                vkPicture.setCornerRadius(cornerRadius);
                int i5 = ala0.e.$EnumSwitchMapping$3[((ala0.d) ((zak0) ala0Var.l).getValue()).ordinal()];
                if (i5 == 1) {
                    vkPictureOverlay = null;
                } else if (i5 == 2) {
                    vkPictureOverlay = new VkPictureOverlay(R.drawable.vk_icon_add_outline_24, null, VkPictureOverlay.Tint.Dark);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkPictureOverlay = new VkPictureOverlay(R.drawable.vk_icon_add_outline_24, null, VkPictureOverlay.Tint.Light);
                }
                vkPicture.setOverlay(vkPictureOverlay);
                int i6 = ala0.e.$EnumSwitchMapping$4[((ala0.a) ((zak0) ala0Var.i).getValue()).ordinal()];
                if (i6 == 1) {
                    ycv0Var = null;
                } else if (i6 == 2) {
                    Context context = vkPicture.getContext();
                    e3m.a aVar2 = e3m.a;
                    ycv0Var = new ycv0(m33.a(R.drawable.vk_icon_donut_color_12, context), false);
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = vkPicture.getContext();
                    e3m.a aVar3 = e3m.a;
                    ycv0Var = new ycv0(m33.a(R.drawable.vk_icon_donut_color_12, context2), true);
                }
                vkPicture.setTopLeftBadge(ala0Var.g() == BadgeAlignment.TopLeft ? ycv0Var : null);
                vkPicture.setBottomLeftBadge(ala0Var.g() == BadgeAlignment.BottomLeft ? ycv0Var : null);
                vkPicture.setTopRightBadge(ala0Var.g() == BadgeAlignment.TopRight ? ycv0Var : null);
                vkPicture.setBottomRightBadge(ala0Var.g() == BadgeAlignment.BottomRight ? ycv0Var : null);
                float f = i2;
                bwt0.m0(iah0.a(f), iah0.a(f), vkPicture);
                return s3q0.a;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                tra0.a aVar4 = (tra0.a) obj;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    tra0 tra0Var = (tra0) arrayList.get(i7);
                    tra0.a.x(aVar4, tra0Var, 0, (i2 - tra0Var.c) / 2);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ e7g(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
