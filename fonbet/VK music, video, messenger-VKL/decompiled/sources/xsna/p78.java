package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionScrollWidget;
import com.vk.writebar.WriteBar;
import java.util.Collections;
import java.util.List;
import xsna.nzl;
import xsna.sdo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class p78 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p78(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerPaginatedView recyclerPaginatedView;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ModalBottomSheetBehavior modalBottomSheetBehavior = (ModalBottomSheetBehavior) obj3;
                BottomSheetCommentsFragment bottomSheetCommentsFragment = (BottomSheetCommentsFragment) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj;
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                if (modalBottomSheetBehavior.k == 5 && (recyclerPaginatedView = bottomSheetCommentsFragment.W) != null) {
                    ModalBottomSheetBehavior.H(recyclerPaginatedView).O(4);
                }
                u3g0 u3g0Var = bottomSheetCommentsFragment.X;
                if (u3g0Var != null) {
                    ModalBottomSheetBehavior<View> modalBottomSheetBehavior2 = bottomSheetCommentsFragment.Y0;
                    jzb0 jzb0Var = new jzb0(modalBottomSheetBehavior2 != null ? Integer.valueOf(modalBottomSheetBehavior2.L()) : null, Integer.valueOf(iah0.f().widthPixels), Integer.valueOf(iah0.f().widthPixels), Integer.valueOf(iah0.a(360)));
                    WriteBar writeBar = u3g0Var.e;
                    if (writeBar != null) {
                        writeBar.setLongtapStickerPopupWindowSize(jzb0Var);
                    }
                }
                s78 s78Var = new s78(bottomSheetCommentsFragment, modalBottomSheetBehavior, linearLayoutManager);
                bottomSheetCommentsFragment.W0 = s78Var;
                modalBottomSheetBehavior.u = s78Var;
                return s3q0.a;
            case 1:
                ((wh50) obj).setValue(Boolean.FALSE);
                ((izs) obj3).invoke(new sdo.d(((qdo) obj2).a));
                return s3q0.a;
            case 2:
                rgt rgtVar = (rgt) obj3;
                y2k0 y2k0Var = (y2k0) obj2;
                vs80 vs80Var = (vs80) obj;
                if (rgtVar != null) {
                    y2k0Var.a(y2k0Var.c(rgtVar) - y2k0Var.t);
                }
                List a = tqi.a(y2k0Var, null, y2k0Var.t, null);
                vqi vqiVar = (vqi) j5g.k0(a);
                Integer num = vqiVar != null ? vqiVar.c : null;
                List<vqi> d = vs80Var.d(num);
                if (num != null && !d.isEmpty()) {
                    vqi vqiVar2 = (vqi) j5g.Y(d);
                    List S = j5g.S(d, 1);
                    int i2 = vqiVar2.a;
                    pgk0 pgk0Var = vqiVar2.b;
                    vqiVar2.getClass();
                    d = j5g.u0(S, Collections.singletonList(new vqi(i2, pgk0Var, num)));
                }
                return new qqi(j5g.u0(d, a), vs80Var.a());
            default:
                zdn0 zdn0Var = (zdn0) obj2;
                VkGroupHeader vkGroupHeader = (VkGroupHeader) obj;
                WebAction webAction = ((SuperAppShowcaseSectionScrollWidget.Payload) obj3).d;
                if (webAction != null) {
                    u7n0 u7n0Var = zdn0Var.p;
                    Context context = vkGroupHeader.getContext();
                    Object obj4 = zdn0Var.l;
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    u7n0Var.b(context, webAction, (f9n0) obj4, null);
                }
                return s3q0.a;
        }
    }
}
