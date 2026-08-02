package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CommunityProfileAvatarAlbumLoader.kt */
/* loaded from: classes5.dex */
public final class neh {
    public final UserId a;
    public final ney<aj1, VKList<Photo>> b;
    public final io.reactivex.rxjava3.disposables.g c = new io.reactivex.rxjava3.disposables.g();
    public VKList<Photo> d;

    public neh(UserId userId, ney<aj1, VKList<Photo>> neyVar) {
        this.a = userId;
        this.b = neyVar;
    }

    public static ListBuilder c(List list) {
        ImageSize Fb;
        String str;
        int i = iah0.f().widthPixels;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ListBuilder e = e43.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Photo photo = (Photo) it.next();
            if (linkedHashSet.add(photo.Cb()) && (Fb = photo.Fb(i, false)) != null && (str = Fb.d.d) != null) {
                if (drm0.N(str)) {
                    str = null;
                }
                if (str != null) {
                    e.add(str);
                }
            }
        }
        return e.g();
    }

    public final io.reactivex.rxjava3.core.q<VKList<Photo>> a(ExtendedUserProfile extendedUserProfile) {
        VKList<Photo> vKList = this.d;
        if (vKList != null) {
            return io.reactivex.rxjava3.core.q.T(vKList);
        }
        aj1 aj1Var = new aj1(this.a);
        VKList<Photo> vKList2 = this.b.get(aj1Var);
        if (vKList2 != null) {
            VKList<Photo> vKList3 = new VKList<>(vKList2.i(), vKList2);
            this.d = vKList3;
            return io.reactivex.rxjava3.core.q.T(vKList3);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new vea0(this.a, -6, 0, 10, true), null, null, 3);
        ho1 ho1Var = new ho1(new ync(this, aj1Var, extendedUserProfile, 1), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(ho1Var, lVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.core.q<VKList<Photo>> b(ExtendedUserProfile extendedUserProfile, final boolean z) {
        if (z && hg1.d(this.c.a())) {
            return io.reactivex.rxjava3.core.q.H(new IllegalStateException("Avatar album pagination is already in progress"));
        }
        VKList<Photo> vKList = this.d;
        if (vKList == null) {
            return io.reactivex.rxjava3.core.q.H(new IllegalStateException("Avatar album is not loaded"));
        }
        int size = vKList.size();
        int i = vKList.i();
        if (size >= i) {
            return io.reactivex.rxjava3.core.q.T(vKList);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new vea0(this.a, -6, size, Math.min(20, i - size), true), null, null, 3), new bn3(new meh(z, this, 0), 17), io.reactivex.rxjava3.internal.functions.a.c), new io.reactivex.rxjava3.functions.a() { // from class: xsna.keh
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                if (z) {
                    this.c.b(null);
                }
            }
        }).U(new aa6(new x4c(vKList, this, extendedUserProfile, 2), 10));
    }
}
