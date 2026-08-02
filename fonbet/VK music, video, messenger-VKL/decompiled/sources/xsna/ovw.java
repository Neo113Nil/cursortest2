package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.interop.model.ContentScale;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.InfoBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.qhv0;
import xsna.snx;
import xsna.tlo0;

/* compiled from: InfoBarViewHolder.kt */
/* loaded from: classes18.dex */
public final class ovw extends vfz<kvw> {
    public final pvw l;
    public final VkBanner m;
    public final gdp n;
    public final bpn0 o;
    public InfoBar.Payload.GiftsBirthdays.User p;
    public final com.vk.core.compose.component.semantics.a q;
    public final com.vk.core.compose.component.semantics.a r;
    public final com.vk.core.compose.component.semantics.a s;
    public final tlo0.f t;

    /* compiled from: InfoBarViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[InfoBar.ButtonLayout.values().length];
            try {
                iArr[InfoBar.ButtonLayout.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.ButtonLayout.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoBar.ButtonLayout.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoBar.ButtonStyle.values().length];
            try {
                iArr2[InfoBar.ButtonStyle.DESTRUCTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InfoBar.ButtonStyle.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InfoBar.ButtonIcon.values().length];
            try {
                iArr3[InfoBar.ButtonIcon.GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InfoBar.ButtonIcon.GIFT_OUTLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public ovw(ViewGroup viewGroup, pvw pvwVar) {
        super(R.layout.vkim_dialogs_list_item_info_bar, viewGroup);
        this.l = pvwVar;
        getContext();
        this.m = (VkBanner) this.itemView;
        this.n = new gdp();
        this.o = new bpn0(new ncg(this, 26));
        this.q = com.vk.core.compose.component.semantics.b.a(null, new y8m(6), 3);
        this.r = com.vk.core.compose.component.semantics.b.a(null, new vsq(9), 3);
        this.s = com.vk.core.compose.component.semantics.b.a(null, new py(29), 3);
        this.t = tq.h(tlo0.Companion, R.string.accessibility_hide);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(kvw kvwVar) {
        dko ekoVar;
        VkBanner.b.C0806b c0806b;
        tlo0.h hVar;
        tlo0.h hVar2;
        InfoBar.Image image;
        InfoBar.Image image2;
        InfoBar.Image image3;
        List<InfoBar.Background.FillColors> list;
        Object obj;
        String str;
        Object obj2;
        VkBanner.b.a aVar;
        List<InfoBar.Payload.GiftsBirthdays.User> list2;
        InfoBar infoBar = kvwVar.b;
        InfoBar.Payload payload = infoBar.m;
        String str2 = infoBar.b;
        InfoBar.Payload.GiftsBirthdays giftsBirthdays = payload instanceof InfoBar.Payload.GiftsBirthdays ? (InfoBar.Payload.GiftsBirthdays) payload : null;
        this.p = (giftsBirthdays == null || (list2 = giftsBirthdays.c) == null) ? null : (InfoBar.Payload.GiftsBirthdays.User) j5g.a0(list2);
        com.vk.core.compose.component.semantics.a aVar2 = this.q;
        VkBanner vkBanner = this.m;
        vkBanner.m85setSemanticsConfigurationlkKuBUQ(aVar2);
        bwt0.i0(vkBanner, new nv2(22, infoBar, this));
        InfoBar.Background background = infoBar.l;
        List<InfoBar.Button> list3 = infoBar.j;
        InfoBar.Payload payload2 = infoBar.m;
        if (epx.f(str2, "gifts_birthdays")) {
            InfoBar.Payload.GiftsBirthdays.User user = this.p;
            if (user != null) {
                String a2 = js5.a(cn70.b(48), user.e);
                if (a2 == null) {
                    a2 = "";
                }
                aVar = new VkBanner.b.a(new snx(new snx.b.c(new vlw(a2, null), ContentScale.Crop, null, 10)), new i4(7, user, this));
            } else {
                aVar = null;
            }
            vkBanner.setBefore(aVar);
        } else {
            getContext();
            getContext();
            String str3 = infoBar.e;
            Integer num = infoBar.g;
            if (brm0.B(str3, "http://", false) || brm0.B(str3, "https://", false)) {
                ccr0 ccr0Var = new ccr0(this.itemView.getContext());
                ccr0Var.r(str3);
                Drawable drawable = ccr0Var.b;
                if (drawable == null) {
                    drawable = null;
                }
                if (drawable != null) {
                    ekoVar = new eko(drawable);
                    if (ekoVar == null) {
                        bpn0 bpn0Var = this.o;
                        Size size = new Size(num != null ? num.intValue() : ((Number) bpn0Var.getValue()).intValue(), num != null ? num.intValue() : ((Number) bpn0Var.getValue()).intValue());
                        Integer num2 = infoBar.h;
                        c0806b = new VkBanner.b.C0806b(ekoVar, num2 != null ? new b8g(num2.intValue()) : null, size, 8);
                    } else {
                        c0806b = null;
                    }
                    vkBanner.setBefore(c0806b);
                }
                ekoVar = null;
                if (ekoVar == null) {
                }
                vkBanner.setBefore(c0806b);
            } else {
                if (brm0.B(str3, "res:/", false)) {
                    ekoVar = new gko(Integer.parseInt(drm0.j0(str3, "res:/", str3)));
                    if (ekoVar == null) {
                    }
                    vkBanner.setBefore(c0806b);
                }
                ekoVar = null;
                if (ekoVar == null) {
                }
                vkBanner.setBefore(c0806b);
            }
        }
        String str4 = infoBar.d;
        InfoBar.Button button = (InfoBar.Button) j5g.b0(0, list3);
        InfoBar.Button button2 = (InfoBar.Button) j5g.b0(1, list3);
        InfoBar.Button button3 = (InfoBar.Button) j5g.b0(2, list3);
        String str5 = infoBar.c;
        boolean N = drm0.N(str5);
        gdp gdpVar = this.n;
        if (N) {
            hVar = null;
        } else {
            tlo0.a aVar3 = tlo0.Companion;
            gdpVar.getClass();
            CharSequence a3 = gdp.a(str5);
            aVar3.getClass();
            hVar = new tlo0.h(a3);
        }
        if (drm0.N(str4)) {
            hVar2 = null;
        } else {
            tlo0.a aVar4 = tlo0.Companion;
            gdpVar.getClass();
            CharSequence a4 = gdp.a(str4);
            aVar4.getClass();
            hVar2 = new tlo0.h(a4);
        }
        vkBanner.setMiddle(new VkBanner.e(hVar, hVar2, null, button != null ? h6(button, infoBar, this.s) : null, button2 != null ? h6(button2, infoBar, null) : null, button3 != null ? h6(button3, infoBar, null) : null, epx.f(str2, "max_ad") ? new jai(195052654, new fd1(4, this, (InfoBar.Payload.MaxAd) payload2), true) : null, null));
        vkBanner.setAfter(infoBar.k ? new VkBanner.a.b(new j4(14, this, infoBar), this.t, this.r, null, 8) : null);
        vkBanner.setBackgroundColor((ipi) null);
        vkBanner.setBackgroundImage(null);
        boolean M = dhr0.M();
        if (background != null && (list = background.e) != null) {
            if (M) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((InfoBar.Background.FillColors) obj2).c == InfoBar.Theme.DARK) {
                            break;
                        }
                    }
                }
                InfoBar.Background.FillColors fillColors = (InfoBar.Background.FillColors) obj2;
                if (fillColors != null) {
                    str = fillColors.b;
                    if (str != null) {
                        vkBanner.setBackgroundColor(new b8g(Color.parseColor(str)));
                    }
                }
                str = null;
                if (str != null) {
                }
            } else {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((InfoBar.Background.FillColors) obj).c == InfoBar.Theme.LIGHT) {
                            break;
                        }
                    }
                }
                InfoBar.Background.FillColors fillColors2 = (InfoBar.Background.FillColors) obj;
                if (fillColors2 != null) {
                    str = fillColors2.b;
                    if (str != null) {
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        }
        if (background != null && (image3 = background.d) != null) {
            ImageList imageList = M ? image3.c : image3.b;
            if (imageList != null) {
                Context context = this.itemView.getContext();
                HashSet hashSet = iah0.a;
                Image Cb = imageList.Cb(context.getResources().getDisplayMetrics().widthPixels, true);
                if (Cb != null) {
                    vkBanner.setBackgroundImage(new vlw(Cb.d, null));
                }
            }
        }
        vkBanner.setTrailingImage(null);
        boolean M2 = dhr0.M();
        InfoBar.Payload.GiftsHolidays giftsHolidays = payload2 instanceof InfoBar.Payload.GiftsHolidays ? (InfoBar.Payload.GiftsHolidays) payload2 : null;
        if (giftsHolidays != null && (image2 = giftsHolidays.c) != null) {
            ImageList imageList2 = M2 ? image2.c : image2.b;
            if (imageList2 != null) {
                Context context2 = this.itemView.getContext();
                HashSet hashSet2 = iah0.a;
                Image Cb2 = imageList2.Cb(context2.getResources().getDisplayMetrics().widthPixels, true);
                if (Cb2 != null) {
                    vkBanner.setTrailingImage(new vlw(Cb2.d, qhv0.f.a));
                }
            }
        }
        InfoBar.Payload.GiftsBirthdays giftsBirthdays2 = payload2 instanceof InfoBar.Payload.GiftsBirthdays ? (InfoBar.Payload.GiftsBirthdays) payload2 : null;
        if (giftsBirthdays2 == null || (image = giftsBirthdays2.h) == null) {
            return;
        }
        ImageList imageList3 = M2 ? image.c : image.b;
        if (imageList3 != null) {
            Context context3 = this.itemView.getContext();
            HashSet hashSet3 = iah0.a;
            Image Cb3 = imageList3.Cb(context3.getResources().getDisplayMetrics().widthPixels, true);
            if (Cb3 != null) {
                vkBanner.setTrailingImage(new vlw(Cb3.d, qhv0.f.a));
            }
        }
    }

    public final VkBanner.c h6(InfoBar.Button button, InfoBar infoBar, com.vk.core.compose.component.semantics.a aVar) {
        VkButton.Mode mode;
        VkButton.Appearance appearance;
        int i;
        VkBanner.c.a aVar2;
        tlo0.h d = oq.d(tlo0.Companion, button.b);
        int i2 = a.$EnumSwitchMapping$0[button.c.ordinal()];
        if (i2 == 1) {
            mode = VkButton.Mode.Primary;
        } else if (i2 == 2) {
            mode = VkButton.Mode.Secondary;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mode = VkButton.Mode.Tertiary;
        }
        VkButton.Mode mode2 = mode;
        int i3 = a.$EnumSwitchMapping$1[button.e.ordinal()];
        if (i3 == 1) {
            appearance = VkButton.Appearance.Negative;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            appearance = VkButton.Appearance.Accent;
        }
        VkButton.Appearance appearance2 = appearance;
        int i4 = a.$EnumSwitchMapping$2[button.j.ordinal()];
        if (i4 == 1) {
            i = R.drawable.vk_icon_gift_16;
        } else {
            if (i4 != 2) {
                aVar2 = null;
                return new VkBanner.c(d, new ry3(this, infoBar, button, 3), mode2, appearance2, VkButton.Size.Small, aVar2, aVar, 448);
            }
            i = R.drawable.vk_icon_gift_outline_16;
        }
        aVar2 = new VkBanner.c.a(new gko(i));
        return new VkBanner.c(d, new ry3(this, infoBar, button, 3), mode2, appearance2, VkButton.Size.Small, aVar2, aVar, 448);
    }
}
