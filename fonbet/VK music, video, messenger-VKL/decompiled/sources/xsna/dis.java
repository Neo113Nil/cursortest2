package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Peer;
import com.vk.im.ui.views.online.OnlineMode;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: FriendDelegate.kt */
/* loaded from: classes7.dex */
public final class dis extends p1u0<FriendItem> {
    public final VoipCallServiceFragment.b a;

    /* compiled from: FriendDelegate.kt */
    public interface a {
        void b(Peer.Member member);

        void f(Peer.Member member);

        void g(Peer.Member member);

        void i(Peer.Member member);
    }

    /* compiled from: FriendDelegate.kt */
    public static final class b extends vfz<FriendItem> {
        public final a l;
        public final VkCell m;

        /* compiled from: FriendDelegate.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FriendItem.CallStatus.values().length];
                try {
                    iArr[FriendItem.CallStatus.Expired.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FriendItem.CallStatus.Restricted.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FriendItem.CallStatus.Enabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(VkCell vkCell, VoipCallServiceFragment.b bVar) {
            super(vkCell);
            this.l = bVar;
            this.m = vkCell;
            vkCell.setLeftMainAvatarController(new vr5());
            int i = r930.b;
            vkCell.setRightExtraActionPictureController(new q930());
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(FriendItem friendItem) {
            OnlineMode onlineMode;
            tlo0 fVar;
            int i;
            FriendItem friendItem2 = friendItem;
            FriendItem.a aVar = friendItem2.g;
            FriendItem.CallStatus callStatus = friendItem2.e;
            VoipFeatures voipFeatures = VoipFeatures.VOIP_FRIENDS_NAVIGATE_TO_CHAT;
            voipFeatures.getClass();
            boolean a2 = com.vk.toggle.b.A.a(voipFeatures);
            VkCell vkCell = this.m;
            if (a2) {
                jjc.g(vkCell, new ng3(19, this, friendItem2));
            }
            boolean z = callStatus == FriendItem.CallStatus.Enabled;
            VkCell.Left.a aVar2 = VkCell.Left.Companion;
            kr5 kr5Var = friendItem2.f;
            boolean z2 = z;
            kr5 kr5Var2 = new kr5(kr5Var.a, kr5Var.b, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), friendItem2.h, 2), new n6f(kr5Var, 27));
            boolean z3 = aVar instanceof FriendItem.a.C2039a;
            if (z3) {
                onlineMode = OnlineMode.OFFLINE;
            } else if (aVar instanceof FriendItem.a.b.C2040a) {
                onlineMode = OnlineMode.ONLINE_VK_APP;
            } else {
                if (!(aVar instanceof FriendItem.a.b.C2041b)) {
                    throw new NoWhenBranchMatchedException();
                }
                onlineMode = OnlineMode.ONLINE_WEB;
            }
            FriendItem.CallStatus callStatus2 = FriendItem.CallStatus.Restricted;
            vkCell.setLeft(VkCell.Left.a.a(aVar2, new VkCell.Left.Main.a(new xr5(kr5Var2, onlineMode, callStatus == callStatus2 ? vkCell.getContext().getDrawable(R.drawable.vk_icon_unavailable_call_circle_fill_red_16) : null), VkCell.Left.Main.Size.Medium)));
            VkCell.Middle.a aVar3 = VkCell.Middle.Companion;
            VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, friendItem2.c), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            if (callStatus == callStatus2) {
                fVar = new tlo0.h(cqm0.c(e3m.f(R.attr.vk_ui_text_negative, this.itemView.getContext()), this.itemView.getContext().getString(friendItem2.d ? R.string.voip_vkapp_services_call_restricted_female : R.string.voip_vkapp_services_call_restricted_male)));
            } else if (z3) {
                fVar = ((FriendItem.a.C2039a) aVar).a;
            } else {
                if (!(aVar instanceof FriendItem.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = new tlo0.f(R.string.online);
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar3, eVar, new VkCell.Middle.d(fVar, (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
            VkCell.Right.c cVar = VkCell.Right.Companion;
            int i2 = a.$EnumSwitchMapping$0[callStatus.ordinal()];
            if (i2 == 1 || i2 == 2) {
                i = R.string.voip_vkapp_services_call_send_link;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.voip_vkapp_services_call_button;
            }
            tlo0.f fVar2 = new tlo0.f(i);
            VkButton.Size size = VkButton.Size.Small;
            vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.b(fVar2, new sk(14, friendItem2, this), VkButton.Appearance.Accent, VkButton.Mode.Secondary, size, null, null, null, 2016), null, z2 ? new VkCell.Right.ExtraAction.e(new p930(new tx(14, this, friendItem2)), Integer.valueOf(p930.b)) : null, null, 26));
        }
    }

    public dis(VoipCallServiceFragment.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends FriendItem> b(ViewGroup viewGroup) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setId(R.id.voip_vkapp_calls_friend);
        vkCell.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return new b(vkCell, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof FriendItem;
    }
}
