package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.view.VKViewPager;
import com.vk.dto.common.data.VKList;
import com.vk.fave.fragments.FavesFragment;
import com.vk.stickers.bridge.b;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.l0i0;
import xsna.u27;
import xsna.x89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w7 implements io.reactivex.rxjava3.functions.l, szs, l0i0.c, u27.d, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.u27.d
    public long a(long j) {
        return y2r0.k((j * r0.e) / 1000000, 0L, ((tnr) this.c).j - 1);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((v7) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((g60) this.c).invoke(obj);
            case 2:
                return (oz50) ((uf1) this.c).invoke(obj);
            case 3:
                return (Pair) ((jy) this.c).invoke(obj);
            case 4:
                return (AuthResult) ((g60) this.c).invoke(obj);
            case 5:
                return (VKList) ((jy) this.c).invoke(obj);
            case 6:
                return (Long) ((b37) this.c).invoke(obj);
            case 7:
                return (List) ((v7) this.c).invoke(obj);
            case 8:
                return (io8) ((v7) this.c).invoke(obj);
            case 9:
                return (Boolean) ((jy) this.c).invoke(obj);
            case 10:
                return (hda) ((uf1) this.c).invoke(obj);
            case 11:
                ioi0 ioi0Var = (ioi0) this.c;
                ioi0Var.e = ((Integer) obj).intValue();
                return Integer.valueOf(ioi0Var.e);
            case 12:
                return (iag) ((uf1) this.c).invoke(obj);
            case 13:
                return (b.a) ((dsc) this.c).invoke(obj);
            case 14:
                return (List) ((wv2) this.c).invoke(obj);
            case 15:
                return ((puh) this.c).invoke(obj);
            case 16:
                return (Pair) ((dsc) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((uf1) this.c).invoke(obj);
            case 18:
                return (Integer) ((dsc) this.c).invoke(obj);
            case 19:
                return (ExtendedUserProfile) ((dsc) this.c).invoke(obj);
            case 20:
            case 21:
            case 24:
            default:
                return (x960) ((i0r) this.c).invoke(obj);
            case 22:
                return (Boolean) ((i0r) this.c).invoke(obj);
            case 23:
                return (x89.a) ((h2s) this.c).invoke(obj);
            case 25:
                return (Map) ((h2s) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((w150) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((xd60) this.c).invoke(obj);
        }
    }

    @Override // xsna.l0i0.c
    public void sg(boolean z) {
        FavesFragment favesFragment = (FavesFragment) this.c;
        TabLayout tabLayout = favesFragment.S;
        if (tabLayout != null) {
            bwt0.p0(tabLayout, !z);
        }
        VKViewPager vKViewPager = favesFragment.T;
        if (vKViewPager != null) {
            vKViewPager.setSupportSwipe(!z);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((b37) this.c).invoke(obj)).booleanValue();
    }
}
