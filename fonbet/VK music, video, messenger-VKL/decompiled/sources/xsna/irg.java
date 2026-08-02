package xsna;

import android.net.Uri;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.ImageScreenSize;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.toggle.features.ComFeatures;
import java.util.Collections;
import java.util.List;
import xsna.xqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class irg implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ irg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        String str;
        int i = this.b;
        int i2 = 0;
        int i3 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) obj;
                int i4 = CommunityAddressesFragment.E0;
                if (str2 != null && str2.length() != 0) {
                    return mcr0.j(Uri.parse(str2), ImageScreenSize.SIZE_28DP);
                }
                ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
                comFeatures.getClass();
                if (!com.vk.toggle.b.A.a(comFeatures)) {
                    return rsg0.y0(new rpu(communityAddressesFragment.i0, new String[]{"photo_base"}), null, null, 3).L(new h8(new g8(13), 10), false);
                }
                List singletonList = Collections.singletonList(fkq0.a(communityAddressesFragment.i0));
                List singletonList2 = Collections.singletonList(GroupsFieldsDto.PHOTO_BASE);
                if ((2 & 4) != 0) {
                    singletonList2 = null;
                }
                fz2 y = yfb.y(xqu.a.a(null, singletonList, singletonList2), new d37(8));
                ahn.D(y);
                return rsg0.y0(y, null, null, 3).L(new e8(new oc0(14), 14), false);
            default:
                final fql0 fql0Var = (fql0) obj2;
                final StoryEntry storyEntry = (StoryEntry) obj;
                if (((Boolean) fql0Var.g.getValue()).booleanValue() && storyEntry.Tb() && (str = storyEntry.B0) != null && str.length() != 0) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"preload skip " + storyEntry.Kb() + " - thumbhash is available for video story"});
                    }
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                final String Bb = storyEntry.Bb(iah0.v());
                if (Bb == null) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                if (mcr0.n(Bb)) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"preload skip " + storyEntry.Kb() + " - already cached"});
                    }
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                fql0Var.i.put(Bb, Bb);
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{"preload start entry " + storyEntry.Kb() + " photo caching=" + Bb});
                }
                Uri parse = Uri.parse(Bb);
                return (parse == null ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.maybe.m(new io.reactivex.rxjava3.internal.operators.maybe.l(new io.reactivex.rxjava3.internal.operators.single.v(new she(parse, i3)), new kf3(new xsq(12), 24)), new iw3(new y5z(parse, i2), 17))).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.eql0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        L l4 = L.a;
                        l4.getClass();
                        boolean m = L.m(LoggerOutputTarget.NONE);
                        String str3 = Bb;
                        if (!m) {
                            L.u(l4, L.LogType.d, new Object[]{"preload done entry " + storyEntry.Kb() + " photo url=" + str3});
                        }
                        fql0.this.i.remove(str3);
                    }
                });
        }
    }
}
