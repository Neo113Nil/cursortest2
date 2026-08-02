package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.stickers.dto.StickersSubscribePackAuthorResponseDto;
import com.vk.clips.sdk.shared.api.external.action.ClipExternalAction;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.reviews.api.communites.ReviewsDialogType;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.photos.root.albums.presentation.c;
import com.vk.pushes.receivers.c;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.a0d;
import xsna.c8p;
import xsna.d0o;
import xsna.dz40;
import xsna.gm50;
import xsna.i19;
import xsna.jte;
import xsna.kte;
import xsna.l1h;
import xsna.mp90;
import xsna.mze0;
import xsna.nwb;
import xsna.oem0;
import xsna.ohm0;
import xsna.oig0;
import xsna.r8k;
import xsna.sum0;
import xsna.t5e;
import xsna.vte;
import xsna.xo90;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nm1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nm1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ff  */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        String str;
        String str2;
        int i2 = 2;
        int i3 = 11;
        int i4 = 0;
        switch (this.b) {
            case 0:
                ((com.vk.photos.root.albums.presentation.b) this.c).T(new c.h(((PhotoAlbum) this.d).b, new k9((PhotoAlbum) obj, i2)));
                return s3q0.a;
            case 1:
                dlb dlbVar = (dlb) this.c;
                com.vk.music.player.a aVar = (com.vk.music.player.a) this.d;
                dlbVar.invoke((lqk0) obj);
                aVar.b();
                return s3q0.a;
            case 2:
                ((j9) this.c).invoke(bzl0.a(((nj9) this.d).e, (Bitmap) obj));
                return s3q0.a;
            case 3:
                cfd cfdVar = (cfd) this.c;
                xuu0 xuu0Var = cfdVar.N0;
                String str3 = (String) this.d;
                a0d a0dVar = (a0d) obj;
                if (a0dVar instanceof a0d.c) {
                    cfdVar.R0 = true;
                    xuu0Var.a1(((a0d.c) a0dVar).a, false);
                } else if (a0dVar instanceof a0d.b) {
                    ((y1e) cfdVar.C0.getValue()).b(new qvc(str3, new ClipExternalAction.a(xuu0Var.b4(), cfdVar.R0)));
                }
                return s3q0.a;
            case 4:
                ((azd) this.c).invoke((File) this.d);
                return s3q0.a;
            case 5:
                ((h5e) this.c).b.d(new t5e.i(((List) this.d).size()), null);
                return s3q0.a;
            case 6:
                ste steVar = (ste) this.c;
                jte.m mVar = (jte.m) this.d;
                L.i((Throwable) obj);
                steVar.T(new vte.d(new kte.d(mVar.c)));
                return s3q0.a;
            case 7:
                ((g1i) this.c).e.b(new l1h.c((UserId) this.d, "https://" + a0a.d + "/im/channels/" + ((UserId) obj).b));
                return s3q0.a;
            case 8:
                z8k z8kVar = (z8k) this.c;
                r8k.c cVar = (r8k.c) this.d;
                oig0 oig0Var = (oig0) obj;
                CreateMarketItemReviewFragment.c cVar2 = z8kVar.c;
                if (cVar.g == ReviewsDialogType.CONFIRM) {
                    if (oig0Var instanceof oig0.a) {
                        cVar2.invoke(z7k.a.C4161a.b);
                    } else if (oig0Var instanceof oig0.d) {
                        cVar2.invoke(z7k.a.c.b);
                    } else if (oig0Var instanceof oig0.c) {
                        cVar2.invoke(z7k.a.b.b);
                    } else {
                        if (!(oig0Var instanceof oig0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        maz.c(z8kVar.d, z8kVar.a.requireContext(), ((oig0.b) oig0Var).a, LaunchContext.A, null, null, 24);
                    }
                }
                return s3q0.a;
            case 9:
                d0o d0oVar = (d0o) this.c;
                b0o b0oVar = (b0o) this.d;
                VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) obj;
                ImageSize imageSize = (ImageSize) ixj0.c(((d0o.a.b) d0oVar.h).a.b, vkEnhancedImageView.getWidth(), vkEnhancedImageView.getHeight());
                b0oVar.F.o0(imageSize != null ? imageSize.d.d : null, null);
                return s3q0.a;
            case 10:
                c8p c8pVar = (c8p) this.c;
                k8p k8pVar = (k8p) this.d;
                d.b.a aVar2 = (d.b.a) obj;
                c8p.b bVar = c8p.n1;
                gm50.a.a(c8pVar, aVar2.a, new e8p(1, k8pVar, k8p.class, "setSelectedTab", "setSelectedTab(Lcom/vk/search/params/impl/presentation/modal/education/mvi/model/EducationState$InstitutionType;)V", 0));
                gm50.a.a(c8pVar, aVar2.b, new f8p(1, k8pVar, k8p.class, "setCity", "setCity(Lcom/vk/search/params/impl/presentation/modal/education/mvi/model/EducationViewState$FieldState;)V", 0));
                gm50.a.a(c8pVar, aVar2.c, new g8p(1, k8pVar, k8p.class, "setInstitution", "setInstitution(Lcom/vk/search/params/impl/presentation/modal/education/mvi/model/EducationViewState$FieldState;)V", 0));
                gm50.a.a(c8pVar, aVar2.d, new h8p(1, k8pVar, k8p.class, "setYear", "setYear(Lcom/vk/search/params/impl/presentation/modal/education/mvi/model/EducationViewState$FieldState;)V", 0));
                gm50.a.a(c8pVar, aVar2.e, new mf8(k8pVar, 5));
                gm50.a.a(c8pVar, aVar2.f, new pf8(k8pVar, 5));
                gm50.a.a(c8pVar, aVar2.g, new wcg(c8pVar, i3));
                return s3q0.a;
            case 11:
                FeedAnimatedView feedAnimatedView = (FeedAnimatedView) this.c;
                io.reactivex.rxjava3.internal.operators.observable.m1 m1Var = (io.reactivex.rxjava3.internal.operators.observable.m1) this.d;
                Throwable th = (Throwable) obj;
                if (feedAnimatedView.k.get() < 3) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                com.vk.core.utils.newtork.b.a.getClass();
                return com.vk.core.utils.newtork.b.f().t0(1L).L(new ed(new r3h(m1Var, i3), 16), false);
            case 12:
                ((Photo) this.c).x = (List) this.d;
                return s3q0.a;
            case 13:
                androidx.compose.foundation.layout.f fVar = (androidx.compose.foundation.layout.f) this.c;
                androidx.compose.foundation.layout.h hVar = (androidx.compose.foundation.layout.h) this.d;
                tra0 tra0Var = (tra0) obj;
                if (tra0Var != null) {
                    i4 = hVar.h(tra0Var);
                    i = hVar.d(tra0Var);
                } else {
                    i = 0;
                }
                fVar.g = new y8x(y8x.a(i4, i));
                fVar.e = tra0Var;
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((szv) this.c).b((Context) this.d));
            case 15:
                ((qvx) this.c).m.j(((nwb.h) this.d).b);
                return s3q0.a;
            case 16:
                p3y p3yVar = (p3y) this.c;
                String str4 = (String) this.d;
                i19 i19Var = (i19) obj;
                if (i19Var instanceof i19.c) {
                    y1n0 X0 = p3yVar.X0();
                    ((i19.c) i19Var).getClass();
                    X0.a(null, str4);
                } else if (i19Var instanceof i19.a) {
                    tvp L0 = p3yVar.L0();
                    ((i19.a) i19Var).getClass();
                    L0.a(fco0.g(null), str4);
                } else {
                    if (!(i19Var instanceof i19.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p3yVar.L0().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), str4, 1, null));
                }
                return s3q0.a;
            case 17:
                dz40.j jVar = (dz40.j) this.c;
                final izs izsVar = (izs) this.d;
                final ?? r0 = jVar.c;
                nvy.c((nvy) obj, r0.size(), null, new jai(1005512167, new zzs() { // from class: xsna.va00
                    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
                    @Override // xsna.zzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int intValue = ((Integer) obj3).intValue();
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar3.o(intValue) ? 32 : 16;
                        }
                        if (aVar3.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1005512167, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.LyricsContentList.<anonymous>.<anonymous>.<anonymous> (LyricsPage.kt:291)");
                            }
                            kb00.j(r0.get(intValue), izsVar, aVar3, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
                return s3q0.a;
            case 18:
                Image image = (Image) this.c;
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.d;
                VKImageView vKImageView = (VKImageView) obj;
                if (image != null) {
                    int i5 = MarketItemReviewsFragment.w0;
                    ImageSize Cb = image.Cb(vKImageView.getWidth(), true, false);
                    if (Cb != null) {
                        str = Cb.getUrl();
                        VKImageView vKImageView2 = marketItemReviewsFragment.k0;
                        (vKImageView2 != null ? vKImageView2 : null).s0(str);
                        return s3q0.a;
                    }
                }
                str = null;
                VKImageView vKImageView22 = marketItemReviewsFragment.k0;
                (vKImageView22 != null ? vKImageView22 : null).s0(str);
                return s3q0.a;
            case 19:
                c.a aVar3 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) this.c, (Intent) this.d, (Throwable) obj);
                return s3q0.a;
            case 20:
                ((bp90) this.c).t.a(new mp90.b.a.g(((xo90.a.g) ((xo90.a) this.d)).a));
                return s3q0.a;
            case 21:
                ((izs) this.c).invoke(((ucv0) ((vda0) this.d).m).a);
                return s3q0.a;
            case 22:
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM playlist WHERE uid = ? AND pid = ?");
                try {
                    V0.D3(1, str5);
                    V0.D3(2, str6);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 23:
                return new mze0.a(((mze0) this.c).h1.b.subscribe(new tmz(new lze0(0, (wh50) this.d), i3)));
            case 24:
                r0k0 r0k0Var = (r0k0) this.c;
                gzs gzsVar = (gzs) this.d;
                ((Float) obj).getClass();
                if (!((Boolean) ((zak0) r0k0Var.b).getValue()).booleanValue() && gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 25:
                s3l0 s3l0Var = (s3l0) this.c;
                StickerStockItem stickerStockItem = (StickerStockItem) this.d;
                if (((StickersSubscribePackAuthorResponseDto) obj).d().U()) {
                    s3l0Var.b.ko(true);
                    stickerStockItem.S = Boolean.TRUE;
                    d790 d790Var = s3l0Var.d;
                    s3l0Var.z(d790Var != null ? d790Var : null, false);
                    y9l0.a(new o690(true));
                }
                return s3q0.a;
            case 26:
                final v3u0 v3u0Var = (v3u0) this.c;
                final zgm0 zgm0Var = (zgm0) this.d;
                final tnm0 tnm0Var = (tnm0) obj;
                String str7 = v3u0Var.d;
                if (str7 == null || str7.length() == 0) {
                    zgm0Var.d.a(new oem0.b.a(v3u0Var.b, tnm0Var.a.i()));
                }
                if (tnm0Var.d == null) {
                    final ohm0 ohm0Var = zgm0Var.b.d;
                    ohm0Var.getClass();
                    final VKList<StoryUserProfile> vKList = tnm0Var.a;
                    int i6 = vKList.i();
                    int i7 = tnm0Var.b;
                    int i8 = tnm0Var.c;
                    int i9 = tnm0Var.f;
                    final UserId userId = v3u0Var.a;
                    final int i10 = v3u0Var.b;
                    new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.mhm0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
                        /* JADX WARN: Type inference failed for: r3v2 */
                        /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ?? r3;
                            String str8 = v3u0Var.d;
                            boolean z = str8 == null || str8.length() == 0;
                            ohm0 ohm0Var2 = ohm0.this;
                            phm0 phm0Var = ohm0Var2.a;
                            ConcurrentHashMap<ohm0.a, List<StoryUserProfile>> concurrentHashMap = ohm0Var2.c;
                            bpn0 bpn0Var = i0q0.a;
                            UserId userId2 = userId;
                            int i11 = i10;
                            ohm0.a aVar4 = new ohm0.a(userId2, i11);
                            if (z) {
                                concurrentHashMap.remove(aVar4);
                            }
                            List<StoryUserProfile> list = concurrentHashMap.get(aVar4);
                            if (list == null) {
                                list = EmptyList.b;
                            }
                            ArrayList u0 = j5g.u0(vKList, list);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = u0.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (hashSet.add(((StoryUserProfile) next).c)) {
                                    arrayList.add(next);
                                }
                            }
                            concurrentHashMap.put(aVar4, arrayList);
                            try {
                                List<shm0> c = phm0Var.c(i11, userId2);
                                r3 = new ArrayList(c5g.u(c, 10));
                                for (shm0 shm0Var : c) {
                                    znk0 znk0Var = ohm0Var2.d;
                                    rhm0 rhm0Var = shm0Var.e;
                                    znk0Var.getClass();
                                    r3.add(znk0.G(rhm0Var));
                                }
                            } catch (Throwable unused) {
                                phm0Var.e(i11, userId2);
                                r3 = EmptyList.b;
                            }
                            ArrayList u02 = j5g.u0((Iterable) r3, arrayList);
                            HashSet hashSet2 = new HashSet();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = u02.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (hashSet2.add(((StoryUserProfile) next2).c)) {
                                    arrayList2.add(next2);
                                }
                            }
                            return arrayList2;
                        }
                    }).q(asu0.a.c()), new xhb0(new nhm0(ohm0Var, userId, i10, v3u0Var, i6, i7, i8, i9), 8)).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.xgm0
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            if (tnm0.this.a.k() == 0) {
                                zgm0Var.d.a(new oem0.a.d(v3u0Var.b));
                            }
                        }
                    }).subscribe();
                }
                return s3q0.a;
            case 27:
                izs izsVar2 = (izs) this.c;
                sum0.d dVar = (sum0.d) this.d;
                ((Boolean) obj).getClass();
                izsVar2.invoke(sum0.d.a(dVar, null, null, null, false, null, false, null, false, 0, null, !dVar.k, false, 3071));
                return s3q0.a;
            case 28:
                return new Triple((MarketEventGoodCreated.Source) this.c, (String) this.d, (List) obj);
            default:
                rhq0 rhq0Var = (rhq0) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList<ExtendedUserProfile.g> arrayList2 = extendedUserProfile.J;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<ExtendedUserProfile.g> it = extendedUserProfile.J.iterator();
                    while (it.hasNext()) {
                        ExtendedUserProfile.g next = it.next();
                        String str8 = "";
                        if (TextUtils.isEmpty(next.b)) {
                            str2 = "";
                        } else {
                            str2 = next.b;
                            if (next.e > 0 || next.f > 0) {
                                str2 = str2.concat(", ");
                            }
                        }
                        int i11 = next.e;
                        if (i11 > 0 && next.f > 0) {
                            StringBuilder e = fw3.e(str2);
                            e.append(fragmentActivity.getString(R.string.profile_career_range, Integer.valueOf(next.e), Integer.valueOf(next.f)));
                            str2 = e.toString();
                        } else if (i11 > 0) {
                            StringBuilder e2 = fw3.e(str2);
                            e2.append(fragmentActivity.getString(R.string.profile_career_from, Integer.valueOf(next.e)));
                            str2 = e2.toString();
                        } else if (next.f > 0) {
                            StringBuilder e3 = fw3.e(str2);
                            e3.append(fragmentActivity.getString(R.string.profile_career_to, Integer.valueOf(next.f)));
                            str2 = e3.toString();
                        }
                        if (!TextUtils.isEmpty(next.d)) {
                            if (!TextUtils.isEmpty(str2)) {
                                str2 = str2 + '\n';
                            }
                            StringBuilder e4 = fw3.e(str2);
                            e4.append(next.d);
                            str2 = e4.toString();
                        }
                        Group group = next.a;
                        String str9 = group != null ? group.e : null;
                        mhq0 mhq0Var = group != null ? new mhq0(rhq0Var, fragmentActivity, next, i4) : null;
                        if (group != null) {
                            str8 = group.d;
                        } else {
                            String str10 = next.c;
                            if (str10 != null) {
                                str8 = str10;
                            }
                        }
                        arrayList.add(new g4m(str8, str2, str9, mhq0Var));
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.add(0, new o4m(R.string.career, 14, null));
                }
                return arrayList;
        }
    }
}
