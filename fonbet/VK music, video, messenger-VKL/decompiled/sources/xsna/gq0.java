package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.Good;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.music.player.PlayerTrack;
import com.vk.profile.core.content.profilelist.UserMessagesLauncher;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.TensorflowModel;
import xsna.l3e0;
import xsna.m8v0;
import xsna.nvh;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gq0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        int i = this.b;
        int i2 = 0;
        int i3 = 3;
        Owner owner = null;
        String str = null;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((aad) obj4).invoke((Throwable) obj, (TensorflowModel[]) obj3);
                io.reactivex.rxjava3.disposables.c cVar = ((hq0) obj2).b;
                if (cVar != null) {
                    cVar.dispose();
                }
                break;
            case 1:
                a.InterfaceC0987a.C0988a c0988a = (a.InterfaceC0987a.C0988a) obj4;
                BookingServiceType bookingServiceType = (BookingServiceType) obj3;
                izs izsVar = (izs) obj2;
                nvy nvyVar = (nvy) obj;
                Iterator<T> it = c0988a.d.iterator();
                while (it.hasNext()) {
                    List l = BookingServicesScreenKt.l(((ow7) it.next()).a, c0988a.e, c0988a.c);
                    nvyVar.e(l.size(), new my7(new oc0(7), l), new ny7(new la2(i3), l), new jai(802480018, new oy7(l, bookingServiceType, c0988a, izsVar), true));
                }
                break;
            case 2:
                Context context = (Context) obj4;
                i8f i8fVar = (i8f) obj3;
                l3e0.a aVar = (l3e0.a) obj2;
                List list = (List) obj;
                cmf cmfVar = new cmf();
                Integer num = null;
                cxd cxdVar = new cxd(new bpn0(new e4(i8fVar, 20)), new bpn0(new il1(i8fVar, 27)));
                b = e8r.a.b(r11, PrivateSubdir.CLIPS_VIDEO.h(), true);
                File file = b.a;
                fsk0 fsk0Var = qsk0.a;
                kbk context2 = i8fVar.h.a().getContext();
                if (context2 != null) {
                    num = Integer.valueOf(context2.b);
                }
                break;
            case 3:
                View view = (View) obj4;
                int i4 = m8v0.M;
                m8v0.a.a(view, (String) obj3, new tvh(view, i2), null, null, null, null, null, new nt(26), new v7(21), null, null, null, null, null, 0, false, null, null, false, null, false, 16776440);
                dmh dmhVar = ((vvh) obj2).q;
                if (dmhVar != null) {
                    dmhVar.t6(nvh.a.c.a);
                }
                break;
            case 4:
                bho bhoVar = (bho) obj3;
                tra0 tra0Var = (tra0) obj2;
                tra0.a aVar2 = (tra0.a) obj;
                float c = ((ep10) obj4).z1() ? bhoVar.p.e().c(bhoVar.p.h.getValue()) : bhoVar.p.g();
                Orientation orientation = bhoVar.r;
                float f = orientation == Orientation.Horizontal ? c : 0.0f;
                if (orientation != Orientation.Vertical) {
                    c = 0.0f;
                }
                aVar2.b = true;
                aVar2.q(tra0Var, an10.b(f), an10.b(c), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                s3q0 s3q0Var = s3q0.a;
                aVar2.b = false;
                break;
            case 5:
                bi20 bi20Var = (bi20) obj3;
                CatalogBlock catalogBlock = (CatalogBlock) obj2;
                Good good = (Good) obj;
                rba Gb = ((CatalogExtendedData) obj4).Gb(good.c);
                UserProfile userProfile = Gb.a;
                Group group = Gb.b;
                if (userProfile != null) {
                    owner = userProfile.l0();
                } else if (group != null) {
                    owner = tsj.a(group);
                }
                good.M = owner;
                com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
                String str2 = catalogBlock.k;
                if (str2 == null) {
                    str2 = "";
                }
                UIBlockMarketItemStyle.a aVar3 = UIBlockMarketItemStyle.Companion;
                String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
                aVar3.getClass();
                break;
            case 6:
                ((x7y) obj4).X0().b((String) obj3, (String) obj2);
                break;
            case 7:
                y1b0 y1b0Var = (y1b0) obj4;
                String str3 = (String) obj3;
                com.vk.music.player.playback.c cVar2 = (com.vk.music.player.playback.c) obj2;
                if (str3 == null) {
                    PlayerTrack b3 = cVar2.q.b();
                    if (b3 != null) {
                        str = b3.f;
                    }
                } else {
                    str = str3;
                }
                y1b0Var.invoke(str);
                break;
            default:
                cgq0 cgq0Var = (cgq0) obj4;
                UserProfile userProfile2 = (UserProfile) obj3;
                View view2 = (View) obj2;
                Throwable th = (Throwable) obj;
                UserMessagesLauncher userMessagesLauncher = cgq0Var.y;
                view2.setEnabled(true);
                boolean z = th instanceof VKApiExecutionException;
                if (z && ((VKApiExecutionException) th).s() == 176) {
                    userMessagesLauncher.a(userProfile2, UserMessagesLauncher.DialogType.YOU_BLOCKED_USER, new y68(cgq0Var, userProfile2, view2, 2));
                } else if (z && ((VKApiExecutionException) th).s() == 175) {
                    userMessagesLauncher.a(userProfile2, UserMessagesLauncher.DialogType.YOU_HAVE_BEEN_BLOCKED, new a8j0(9));
                } else {
                    i0q0.d(500L, new z1r(cgq0Var, view2, th, i3));
                }
                break;
        }
        return s3q0.a;
    }
}
