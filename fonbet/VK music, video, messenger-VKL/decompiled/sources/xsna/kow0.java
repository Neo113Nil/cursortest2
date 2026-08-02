package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;

/* compiled from: VoipGlobalUserDelegate.kt */
/* loaded from: classes7.dex */
public final class kow0 extends p1u0<low0> {
    public final VoipCallServiceFragment.b a;

    /* compiled from: VoipGlobalUserDelegate.kt */
    public interface a {
        void a(UserId userId);

        void c(UserId userId);

        void d(UserId userId);
    }

    /* compiled from: VoipGlobalUserDelegate.kt */
    public static final class b extends vfz<low0> {
        public final a l;
        public final VkRichCell m;

        /* compiled from: VoipGlobalUserDelegate.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SocialButtonType.values().length];
                try {
                    iArr[SocialButtonType.FOLLOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SocialButtonType.ADD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(VkRichCell vkRichCell, VoipCallServiceFragment.b bVar) {
            super(vkRichCell);
            this.l = bVar;
            this.m = vkRichCell;
            vkRichCell.setLeftMainAvatarController(new vr5());
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(low0 low0Var) {
            tgv0.a aVar;
            int i;
            low0 low0Var2 = low0Var;
            ozk0 ozk0Var = new ozk0(8, this, low0Var2);
            VkRichCell vkRichCell = this.m;
            jjc.g(vkRichCell, ozk0Var);
            VkCell.Left.a aVar2 = VkCell.Left.Companion;
            kr5 kr5Var = low0Var2.c;
            vkRichCell.setLeft(VkCell.Left.a.a(aVar2, new VkCell.Left.Main.a(new xr5(new kr5(kr5Var.a, kr5Var.b, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), low0Var2.d, 2), new vcw0(kr5Var, 3)), low0Var2.f, null), VkCell.Left.Main.Size.Medium)));
            tlo0.h d = oq.d(tlo0.Companion, low0Var2.e);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 1, 6);
            String str = low0Var2.g;
            qgv0 qgv0Var = str != null ? new qgv0(new tlo0.h(str), (ngv0.a) null, (ngv0.a) null, 1, 6) : null;
            List<String> list = low0Var2.h;
            if (list != null) {
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    itj0.d((String) it.next(), arrayList);
                }
                String str2 = low0Var2.i;
                aVar = new tgv0.a(arrayList, null, str2 != null ? oq.d(tlo0.Companion, str2) : null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            } else {
                aVar = null;
            }
            vkRichCell.setMiddle(ahn.v(vgv0Var, null, qgv0Var, null, aVar, null, null, 490));
            VkCell.Right.c cVar = VkCell.Right.Companion;
            if (low0Var2.j) {
                i = R.drawable.vk_icon_done_outline_24;
            } else {
                SocialButtonType socialButtonType = low0Var2.k;
                if (socialButtonType == null) {
                    return;
                }
                int i2 = a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                if (i2 == 1) {
                    i = R.drawable.vk_icon_add_square_outline_24;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.vk_icon_user_add_outline_24;
                }
            }
            vkRichCell.setRight(VkCell.Right.c.a(cVar, null, new VkCell.Right.e.b((dko) new gko(i), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) new oe5(27, low0Var2, this), 30), null, null, 29));
        }
    }

    public kow0(VoipCallServiceFragment.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends low0> b(ViewGroup viewGroup) {
        VkRichCell vkRichCell = new VkRichCell(viewGroup.getContext(), null, 6, 0);
        vkRichCell.setId(R.id.voip_vkapp_calls_global_user);
        vkRichCell.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return new b(vkRichCell, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof low0;
    }
}
