package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.design.view.listitem.infobar.FriendsBirthdayInfoBarView;
import com.vk.im.engine.models.InfoBar;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.features.ImFeatures;
import com.vk.vas.design.view.FriendsBirthdayBannerVerticalUserStack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.f5h0;

/* compiled from: FriendsBirthdayInfoBarViewHolder.kt */
/* loaded from: classes18.dex */
public final class wls extends vfz<xls> {
    public final a l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;

    /* compiled from: FriendsBirthdayInfoBarViewHolder.kt */
    public interface a {
        void a(InfoBar infoBar);

        void f(InfoBar infoBar);
    }

    /* compiled from: FriendsBirthdayInfoBarViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoBar.ButtonIcon.values().length];
            try {
                iArr[InfoBar.ButtonIcon.GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.ButtonIcon.GIFT_OUTLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wls(ViewGroup viewGroup, a aVar) {
        super(com.vk.toggle.b.A.a(r0) ? R.layout.friends_birthdray_banner_redesign : R.layout.friends_birthdray_banner_vertical_user_stack, viewGroup);
        ImFeatures imFeatures = ImFeatures.BIRTHDAYS_BANNER_REDESIGN;
        imFeatures.getClass();
        this.l = aVar;
        this.m = new bpn0(new krh(this, 16));
        this.n = new bpn0(new ldl(this, 13));
        this.o = new bpn0(new xrj(this, 7));
        this.p = new bpn0(new i5f(this, 26));
        this.q = new bpn0(new pff(this, 25));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(xls xlsVar) {
        Integer num;
        Collection collection;
        VkButton vkButton;
        int i;
        Integer valueOf;
        InfoBar.Image image;
        InfoBar.Image image2;
        String str;
        String str2;
        int i2;
        Integer valueOf2;
        InfoBar.Image image3;
        String str3;
        InfoBar.Image image4;
        String str4;
        xls xlsVar2 = xlsVar;
        InfoBar infoBar = xlsVar2.b;
        InfoBar.Payload payload = infoBar.m;
        List<InfoBar.Button> list = infoBar.j;
        InfoBar.Background background = infoBar.l;
        InfoBar.Payload.GiftsBirthdays giftsBirthdays = payload instanceof InfoBar.Payload.GiftsBirthdays ? (InfoBar.Payload.GiftsBirthdays) payload : null;
        if (giftsBirthdays == null) {
            return;
        }
        List<UserId> list2 = giftsBirthdays.f;
        List<InfoBar.Payload.GiftsBirthdays.User> list3 = giftsBirthdays.c;
        ImFeatures imFeatures = ImFeatures.BIRTHDAYS_BANNER_REDESIGN;
        imFeatures.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures)) {
            boolean M = dhr0.M();
            if (background != null && (image2 = background.d) != null) {
                ImageList imageList = M ? image2.c : image2.b;
                if (imageList != null) {
                    Context context = this.itemView.getContext();
                    HashSet hashSet = iah0.a;
                    Image Cb = imageList.Cb(context.getResources().getDisplayMetrics().widthPixels, true);
                    if (Cb != null) {
                        ((VKImageView) this.m.getValue()).load(Cb.d);
                    }
                }
            }
            InfoBar.Payload.GiftsBirthdays giftsBirthdays2 = payload instanceof InfoBar.Payload.GiftsBirthdays ? (InfoBar.Payload.GiftsBirthdays) payload : null;
            if (giftsBirthdays2 != null && (image = giftsBirthdays2.h) != null) {
                ImageList imageList2 = M ? image.c : image.b;
                if (imageList2 != null) {
                    Context context2 = this.itemView.getContext();
                    HashSet hashSet2 = iah0.a;
                    Image Cb2 = imageList2.Cb(context2.getResources().getDisplayMetrics().widthPixels, true);
                    if (Cb2 != null) {
                        bpn0 bpn0Var = this.n;
                        ((VKImageView) bpn0Var.getValue()).setActualScaleType(f5h0.j.a);
                        ((VKImageView) bpn0Var.getValue()).load(Cb2.d);
                    }
                }
            }
            InfoBar.Button button = (InfoBar.Button) j5g.a0(list);
            if (button != null && (vkButton = (VkButton) this.itemView.findViewById(R.id.actionButton)) != null) {
                vkButton.setText(button.b);
                int i3 = b.$EnumSwitchMapping$0[button.j.ordinal()];
                if (i3 == 1) {
                    i = R.drawable.vk_icon_gift_16;
                } else if (i3 != 2) {
                    valueOf = null;
                    vkButton.a5(true, valueOf);
                    vkButton.setVisibility(0);
                    jjc.g(vkButton, new defpackage.s(15, xlsVar2, this));
                } else {
                    i = R.drawable.vk_icon_gift_outline_16;
                }
                valueOf = Integer.valueOf(i);
                vkButton.a5(true, valueOf);
                vkButton.setVisibility(0);
                jjc.g(vkButton, new defpackage.s(15, xlsVar2, this));
            }
            FriendsBirthdayBannerVerticalUserStack friendsBirthdayBannerVerticalUserStack = (FriendsBirthdayBannerVerticalUserStack) this.itemView.findViewById(R.id.vertical_user_stack);
            if (friendsBirthdayBannerVerticalUserStack != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    String str5 = ((InfoBar.Payload.GiftsBirthdays.User) it.next()).e;
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                }
                int size = list2.size() + arrayList.size();
                if (size <= 3 || arrayList.size() <= 1) {
                    num = null;
                    collection = arrayList;
                } else {
                    num = Integer.valueOf(size - 2);
                    collection = arrayList.subList(0, 2);
                }
                friendsBirthdayBannerVerticalUserStack.b(num, j5g.y0(collection));
            }
            ((TextView) this.o.getValue()).setText(infoBar.c);
            bpn0 bpn0Var2 = this.p;
            ((VkButton) bpn0Var2.getValue()).setTrailingIconTint(dhr0.M() ? R.attr.vk_ui_icon_contrast : R.attr.vk_ui_icon_secondary);
            jjc.g((VkButton) bpn0Var2.getValue(), new tn0(14, xlsVar2, this));
            jjc.g(this.itemView, new sh3(17, xlsVar2, this));
            return;
        }
        bpn0 bpn0Var3 = this.q;
        FriendsBirthdayInfoBarView friendsBirthdayInfoBarView = (FriendsBirthdayInfoBarView) bpn0Var3.getValue();
        String str6 = infoBar.c;
        if (background == null || (image4 = background.d) == null) {
            str = null;
        } else {
            ImageList imageList3 = dhr0.M() ? image4.c : image4.b;
            if (imageList3 != null) {
                Context context3 = this.itemView.getContext();
                HashSet hashSet3 = iah0.a;
                Image Cb3 = imageList3.Cb(context3.getResources().getDisplayMetrics().widthPixels, true);
                if (Cb3 != null) {
                    str4 = Cb3.d;
                    str = str4;
                }
            }
            str4 = null;
            str = str4;
        }
        InfoBar.Payload.GiftsBirthdays giftsBirthdays3 = payload instanceof InfoBar.Payload.GiftsBirthdays ? (InfoBar.Payload.GiftsBirthdays) payload : null;
        if (giftsBirthdays3 == null || (image3 = giftsBirthdays3.h) == null) {
            str2 = null;
        } else {
            ImageList imageList4 = dhr0.M() ? image3.c : image3.b;
            if (imageList4 != null) {
                Context context4 = this.itemView.getContext();
                HashSet hashSet4 = iah0.a;
                Image Cb4 = imageList4.Cb(context4.getResources().getDisplayMetrics().widthPixels, true);
                if (Cb4 != null) {
                    str3 = Cb4.d;
                    str2 = str3;
                }
            }
            str3 = null;
            str2 = str3;
        }
        List<InfoBar.Payload.GiftsBirthdays.User> list4 = list3;
        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            String a2 = js5.a(cn70.b(32), ((InfoBar.Payload.GiftsBirthdays.User) it2.next()).e);
            if (a2 == null) {
                a2 = "";
            }
            arrayList2.add(a2);
        }
        List<UserId> list5 = list2;
        ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(((UserId) it3.next()).b));
        }
        List<InfoBar.Button> list6 = list;
        ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
        for (InfoBar.Button button2 : list6) {
            String str7 = button2.b;
            int i4 = b.$EnumSwitchMapping$0[button2.j.ordinal()];
            if (i4 == 1) {
                i2 = R.drawable.vk_icon_gift_16;
            } else if (i4 != 2) {
                valueOf2 = null;
                arrayList4.add(new FriendsBirthdayInfoBarView.a(str7, valueOf2));
            } else {
                i2 = R.drawable.vk_icon_gift_outline_16;
            }
            valueOf2 = Integer.valueOf(i2);
            arrayList4.add(new FriendsBirthdayInfoBarView.a(str7, valueOf2));
        }
        friendsBirthdayInfoBarView.P4(str6, str, str2, arrayList2, arrayList3, arrayList4);
        FriendsBirthdayInfoBarView friendsBirthdayInfoBarView2 = (FriendsBirthdayInfoBarView) bpn0Var3.getValue();
        int i5 = 16;
        com.vk.newsfeed.common.recycler.holders.attachments.a aVar = new com.vk.newsfeed.common.recycler.holders.attachments.a(i5, xlsVar2, this);
        defpackage.u uVar = new defpackage.u(i5, xlsVar2, this);
        friendsBirthdayInfoBarView2.getClass();
        bwt0.i0(friendsBirthdayInfoBarView2, new sop(aVar, 7));
        bwt0.i0(friendsBirthdayInfoBarView2.y, new u4e(aVar, 21));
        bwt0.i0(friendsBirthdayInfoBarView2.w, new yad(uVar, 26));
    }
}
