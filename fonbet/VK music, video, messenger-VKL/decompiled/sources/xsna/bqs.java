package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.ArrayList;
import java.util.List;
import xsna.h2g0;
import xsna.ikv0;
import xsna.oml0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bqs implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bqs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        List<b5u> list;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((aqs) obj2).invoke(obj);
                break;
            case 1:
                ((c4r) obj2).invoke(obj);
                break;
            case 2:
                int i2 = GroupCallGridContainerView.i;
                ((wmc) obj2).invoke(obj);
                break;
            case 3:
                ((c4r) obj2).invoke(obj);
                break;
            case 4:
                ((com.vk.voip.ui.actions.menu.features.a) obj2).invoke(obj);
                break;
            case 5:
                ((wik) obj2).invoke(obj);
                break;
            case 6:
                com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o oVar = (com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o) obj2;
                oVar.e(new k.j(false));
                oVar.c(new h2g0.f(zwp.a((Throwable) obj)));
                break;
            case 7:
                ((lg10) obj2).invoke(obj);
                break;
            case 8:
                ((wik) obj2).invoke(obj);
                break;
            case 9:
                iy30 iy30Var = (iy30) obj2;
                pno0 pno0Var = (pno0) obj;
                ux30 a = iy30Var.a();
                ViewPager viewPager = iy30Var.n;
                iy30Var.a.o0(drm0.p0(pno0Var.d()), a.b.get((viewPager != null ? viewPager : null).getCurrentItem()).c);
                break;
            case 10:
                ((wik) obj2).invoke(obj);
                break;
            case 11:
                ((af50) obj2).invoke(obj);
                break;
            case 12:
                ((af50) obj2).invoke(obj);
                break;
            case 13:
                ((na7) obj2).invoke(obj);
                break;
            case 14:
                ((af50) obj2).invoke(obj);
                break;
            case 15:
                ((z5b) obj2).invoke(obj);
                break;
            case 16:
                ((com.vk.channels.impl.channel_screen.send_msg.e) obj2).invoke(obj);
                break;
            case 17:
                ((af50) obj2).invoke(obj);
                break;
            case 18:
                ((af50) obj2).invoke(obj);
                break;
            case 19:
                ((af50) obj2).invoke(obj);
                break;
            case 20:
                ((z5b) obj2).invoke(obj);
                break;
            case 21:
                ((c4r) obj2).invoke(obj);
                break;
            case 22:
                ((af50) obj2).invoke(obj);
                break;
            case 23:
                int i3 = SearchDocumentsListFragment.h0;
                ((af50) obj2).invoke(obj);
                break;
            case 24:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj2;
                int i4 = SettingsGeneralFragment.z0;
                ikv0.a aVar = new ikv0.a(settingsGeneralFragment.requireContext());
                aVar.u = new ikv0.d(settingsGeneralFragment.requireContext().getString(R.string.sync_contacts_reset_success), (String) null, (ikv0.d.a) null);
                aVar.n();
                settingsGeneralFragment.jo();
                settingsGeneralFragment.qo();
                break;
            case 25:
                ((af50) obj2).invoke(obj);
                break;
            case 26:
                ((gxj0) obj2).invoke(obj);
                break;
            case 27:
                ((na7) obj2).invoke(obj);
                break;
            case 28:
                fpl0 fpl0Var = (fpl0) obj2;
                List list2 = (List) obj;
                t8u t8uVar = ((apl0) fpl0Var.b.getCurrentState()).f;
                ArrayList arrayList = (t8uVar == null || (list = t8uVar.a) == null) ? new ArrayList() : new ArrayList(list);
                arrayList.addAll(list2);
                fpl0Var.e(new oml0.j(arrayList, arrayList.size()));
                break;
            default:
                ((skj0) obj2).invoke(obj);
                break;
        }
    }
}
