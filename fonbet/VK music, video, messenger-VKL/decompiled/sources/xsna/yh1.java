package xsna;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.preference.Preference;
import com.vk.common.links.AwayLink;
import com.vk.components.ComponentsFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.data.VKList;
import com.vk.dto.narratives.Narrative;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.p;
import com.vk.im.ui.components.contacts.b;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.bfz;
import xsna.bzp0;
import xsna.dt1;
import xsna.ihz;
import xsna.jza0;
import xsna.ngl;
import xsna.ru50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yh1 implements io.reactivex.rxjava3.functions.l, a.k, io.reactivex.rxjava3.functions.m, Preference.c, saz, ngl.a, ihz.a, io.reactivex.rxjava3.core.d, ptk0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yh1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.saz
    public void I(AwayLink awayLink) {
        String str;
        l2m l2mVar = (l2m) this.c;
        if (awayLink == null || (str = awayLink.b) == null) {
            return;
        }
        l2mVar.c.invoke(str);
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        com.vk.ecomm.reviews.impl.marketitem.replies.presentation.p pVar = (com.vk.ecomm.reviews.impl.marketitem.replies.presentation.p) lm50Var;
        com.vk.ecomm.reviews.impl.marketitem.replies.presentation.c cVar = ((MarketItemReviewRepliesFragment) this.c).O;
        s3q0 s3q0Var = s3q0.a;
        if (pVar instanceof p.c) {
            cVar.d.r(s3q0Var, pVar);
            return;
        }
        if (pVar instanceof p.b) {
            cVar.c.r(s3q0Var, pVar);
        } else if (pVar instanceof p.a) {
            cVar.b.r(s3q0Var, pVar);
        } else {
            cVar.getClass();
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (VKList) ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
            case 1:
            case 3:
            case 6:
            case 13:
            case 14:
            case 16:
            case 17:
            case 20:
            case 25:
            default:
                return (Narrative) ((ru50.b) obj2).invoke(obj);
            case 2:
                return (Drawable) ((m58) obj2).invoke(obj);
            case 4:
                return (ClipVideoItem) ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
            case 5:
                return (s3q0) ((u8) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((pxd) obj2).invoke(obj);
            case 8:
                return (qih0) ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((u8) obj2).invoke(obj);
            case 10:
                return (Integer) ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
            case 11:
                int i2 = CommunityAddressesFragment.E0;
                return (Boolean) ((lf3) obj2).invoke(obj);
            case 12:
                return (b.a) ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
            case 15:
                return (hda) ((k7f) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((ri0) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((pcg) obj2).invoke(obj);
            case 21:
                ((dfz) obj2).d();
                return bfz.a.b.a;
            case 22:
                return (io.reactivex.rxjava3.core.t) ((g500) obj2).invoke(obj);
            case 23:
                return (c.m) ((ri0) obj2).invoke(obj);
            case 24:
                return (hda) ((hv7) obj2).invoke(obj);
            case 26:
                return (Boolean) ((bws) obj2).invoke(obj);
        }
    }

    @Override // androidx.compose.foundation.layout.a.k
    public int b(int i, LayoutDirection layoutDirection) {
        return ((dt1.b) this.c).a(0, i, layoutDirection);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.v4();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        new ComponentsFragment.a(ComponentsFragment.class, null, null).k(debugDevSettingsFragment.mo2getContext());
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).I(((fwa0) this.c).f);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        zuk zukVar = (zuk) ((gzs) this.c).invoke();
        zukVar.d(new z5z(bVar), ac9.b);
        bVar.a(new dw8(zukVar, 1));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.s) this.c).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.s) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ch40) this.c).invoke(obj)).booleanValue();
        }
    }
}
