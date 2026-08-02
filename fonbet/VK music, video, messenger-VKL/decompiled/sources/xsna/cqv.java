package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.c;
import com.vk.rlottie.RLottieDrawable;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cf70;
import xsna.cuy;
import xsna.efc0;
import xsna.gm50;
import xsna.l110;
import xsna.qr60;
import xsna.ryy;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cqv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cqv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        cuy.b bVar;
        cuy.b bVar2;
        cuy.b bVar3;
        cuy.b bVar4;
        hvy hvyVar;
        AppCarousel appCarousel;
        zzab zzabVar;
        int i;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                float f = 24;
                Bitmap b = kd7.b((Bitmap) obj, iah0.a(f), iah0.a(f), false, false);
                Context context = ((eqv) obj2).c;
                return new BitmapDrawable(context.getResources(), kd7.h(context, b, hip0.c));
            case 1:
                z4w z4wVar = (z4w) obj2;
                z4wVar.dismiss();
                z4wVar.a();
                return s3q0.a;
            case 2:
                ((d66) obj2).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 3:
                vrw vrwVar = (vrw) obj;
                return new io.reactivex.rxjava3.internal.operators.single.d0(vrwVar.c(((com.vk.update.core.a) obj2).a), new vq(18), null).l(new iu4(new dwg(vrwVar, 22), 16));
            case 4:
                tex texVar = (tex) obj2;
                texVar.n.g(texVar.itemView.getContext());
                return s3q0.a;
            case 5:
                xvy xvyVar = (xvy) obj2;
                uvy uvyVar = xvyVar.r;
                lhl lhlVar = xvyVar.a;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || xvyVar.c()) && (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || xvyVar.e())) {
                    if (Math.abs(xvyVar.h) > 0.5f) {
                        xzw.c("entered drag with non-zero pending scroll");
                    }
                    xvyVar.d = true;
                    float f3 = xvyVar.h + f2;
                    xvyVar.h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = xvyVar.h;
                        int round = Math.round(f4);
                        hvy l = ((hvy) ((zak0) xvyVar.f).getValue()).l(round, !xvyVar.b);
                        if (l != null && (hvyVar = xvyVar.c) != null) {
                            hvy l2 = hvyVar.l(round, true);
                            if (l2 != null) {
                                xvyVar.c = l2;
                            } else {
                                l = null;
                            }
                        }
                        if (l != null) {
                            xvyVar.g(l, xvyVar.b, true);
                            zq70.A(xvyVar.w);
                            float f5 = f4 - xvyVar.h;
                            if (xvyVar.k) {
                                lhlVar.getClass();
                                if (!l.f().isEmpty()) {
                                    r2 = f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    int a = lhl.a(l, r2);
                                    if (a >= 0 && a < l.d()) {
                                        if (a != lhlVar.a) {
                                            if (lhlVar.c != r2) {
                                                lhlVar.a = -1;
                                                cuy.b bVar5 = lhlVar.b;
                                                if (bVar5 != null) {
                                                    bVar5.cancel();
                                                }
                                                lhlVar.b = null;
                                            }
                                            lhlVar.c = r2;
                                            lhlVar.a = a;
                                            lhlVar.b = uvyVar.a(a);
                                        }
                                        if (r2) {
                                            xuy xuyVar = (xuy) j5g.i0(l.f());
                                            if (((xuyVar.getSize() + xuyVar.getOffset()) + l.e()) - l.h() < (-f5) && (bVar4 = lhlVar.b) != null) {
                                                bVar4.d();
                                            }
                                        } else if (l.g() - ((xuy) j5g.Y(l.f())).getOffset() < f5 && (bVar3 = lhlVar.b) != null) {
                                            bVar3.d();
                                        }
                                    }
                                }
                                lhlVar.e = f5;
                            }
                        } else {
                            stf0 stf0Var = xvyVar.l;
                            if (stf0Var != null) {
                                stf0Var.k();
                            }
                            float f6 = f4 - xvyVar.h;
                            fvy j = xvyVar.j();
                            if (xvyVar.k) {
                                lhlVar.getClass();
                                if (!j.f().isEmpty()) {
                                    r2 = f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    int a2 = lhl.a(j, r2);
                                    if (a2 >= 0 && a2 < j.d()) {
                                        if (a2 != lhlVar.a) {
                                            if (lhlVar.c != r2) {
                                                lhlVar.a = -1;
                                                cuy.b bVar6 = lhlVar.b;
                                                if (bVar6 != null) {
                                                    bVar6.cancel();
                                                }
                                                lhlVar.b = null;
                                            }
                                            lhlVar.c = r2;
                                            lhlVar.a = a2;
                                            lhlVar.b = uvyVar.a(a2);
                                        }
                                        if (r2) {
                                            xuy xuyVar2 = (xuy) j5g.i0(j.f());
                                            if (((xuyVar2.getSize() + xuyVar2.getOffset()) + j.e()) - j.h() < (-f6) && (bVar2 = lhlVar.b) != null) {
                                                bVar2.d();
                                            }
                                        } else if (j.g() - ((xuy) j5g.Y(j.f())).getOffset() < f6 && (bVar = lhlVar.b) != null) {
                                            bVar.d();
                                        }
                                    }
                                }
                                lhlVar.e = f6;
                            }
                        }
                    }
                    if (Math.abs(xvyVar.h) > 0.5f) {
                        f2 -= xvyVar.h;
                        xvyVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(-f2);
            case 6:
                com.vk.newsfeed.common.recycler.holders.g gVar = (com.vk.newsfeed.common.recycler.holders.g) obj2;
                CharSequence charSequence = (CharSequence) obj;
                tyy tyyVar = gVar.o;
                ryy.a.c cVar = (ryy.a.c) gVar.m;
                tyyVar.f(cVar.a, cVar.c, String.valueOf(gVar.r.getText()));
                VkSimpleButton vkSimpleButton = gVar.q;
                if (((ryy.a.c) gVar.m).d && charSequence.length() <= 0) {
                    r2 = false;
                }
                bwt0.a0(vkSimpleButton, r2);
                return s3q0.a;
            case 7:
                cmz cmzVar = (cmz) obj2;
                bwt0.p0(cmzVar.d, false);
                bwt0.p0(cmzVar.e, false);
                cmzVar.i.setItems(EmptyList.b);
                bwt0.p0(cmzVar.f, true);
                bwt0.p0(cmzVar.g, false);
                return s3q0.a;
            case 8:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2).T((c.f) obj);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(epx.f(((lu00) obj).a(), ((com.vk.ecomm.catalog.impl.catalog.base.b) obj2).c));
            case 10:
                ((kg50) obj2).g(((Float) obj).floatValue());
                return s3q0.a;
            case 11:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj2;
                int i3 = MarketItemCommentsFragment.j0;
                marketItemCommentsFragment.fo(MarketItemCommentsFragment.b.EMPTY);
                gm50.a.a(marketItemCommentsFragment, ((l110.b) obj).a, new mre(marketItemCommentsFragment, 29));
                return s3q0.a;
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                TextView textView = ((MarketItemReviewsFragment) obj2).o0;
                bwt0.p0(textView != null ? textView : null, booleanValue);
                return s3q0.a;
            case 13:
                f910 f910Var = (f910) obj2;
                int intValue = ((Integer) obj).intValue();
                f910Var.q.setVisibility(intValue <= 0 ? 8 : 0);
                ((wak0) f910Var.s).C(intValue);
                return s3q0.a;
            case 14:
                n320 n320Var = (n320) obj2;
                List list = (List) ((Pair) obj).i();
                if (list.isEmpty()) {
                    n320Var.a.a(vjc0.b);
                } else {
                    efc0.a aVar = n320Var.a;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ao8.t((UserProfile) it.next()));
                    }
                    aVar.a(new xjc0(arrayList, true));
                }
                return s3q0.a;
            case 15:
                Integer num = (Integer) obj;
                num.getClass();
                vq20 vq20Var = (vq20) ((yq20) obj2).C;
                if (vq20Var == null || (appCarousel = vq20Var.i) == null) {
                    return null;
                }
                return Boolean.valueOf(appCarousel.q.contains(num));
            case 16:
                rx30 rx30Var = (rx30) obj2;
                int i4 = gvr0.m;
                return new gvr0(rx30Var.i.inflate(R.layout.vkim_search_search_in_msgs_vh, (ViewGroup) obj, false), rx30Var.h);
            case 17:
                j140 j140Var = (j140) obj2;
                DialogTheme dialogTheme = (DialogTheme) obj;
                tk30 tk30Var = j140Var.O;
                tk30Var.x(dialogTheme);
                tk30Var.C(dialogTheme.b.a() && c4g0.w(dialogTheme));
                vm30 vm30Var = j140Var.R;
                if (vm30Var != null) {
                    vm30Var.S(dialogTheme);
                }
                j140Var.g1();
                return s3q0.a;
            case 18:
                return w060.h0(bi20.a((bi20) obj2, CatalogDataType.DATA_TYPE_PODCASTS, null, null, null, null, null, 33554427), ((ExtendedPodcast) obj).f, null);
            case 19:
                ((o660) obj2).b.invoke(new zxd0.g((List) obj));
                return s3q0.a;
            case 20:
                ((awq) obj2).d();
                return s3q0.a;
            case 21:
                NewsEntriesContainer a3 = ((x960) obj).a();
                if (wn60.b(((sg60) obj2).i.get().a)) {
                    NewsEntriesContainer.Info info = a3.b;
                    if (!info.g) {
                        info.g = true;
                    }
                }
                return s3q0.a;
            case 22:
                return ((dv60) obj2).b.e(new kv60((qr60.a) obj));
            case 23:
                wjs0.a(new wxr0((VideoFile) obj2, null, null, 6));
                cvk.u(R.string.clip_not_interested_hidden, false);
                return s3q0.a;
            case 24:
                ((qe70) obj2).T(cf70.b.b);
                return s3q0.a;
            case 25:
                cp70 cp70Var = (cp70) obj2;
                CodeState codeState = (CodeState) obj;
                if ((codeState instanceof CodeState.SmsWait) && (zzabVar = cp70Var.M) != null) {
                    zzabVar.startSmsUserConsent(null);
                }
                cp70Var.z = codeState;
                cp70Var.M0();
                cp70Var.N0();
                return s3q0.a;
            case 26:
                ((com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj2).C = (RLottieDrawable) obj;
                return s3q0.a;
            case 27:
                xd80 xd80Var = (xd80) obj2;
                OnboardingStep onboardingStep = xd80Var.u;
                if (onboardingStep != null) {
                    xd80Var.V5(onboardingStep);
                }
                return s3q0.a;
            case 28:
                com.vk.photos.root.photoflow.presentation.b bVar7 = (com.vk.photos.root.photoflow.presentation.b) obj2;
                List list3 = (List) obj;
                c.d dVar = bVar7.f.d;
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = list4.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((qba0) it2.next()).d && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                dVar.b = i;
                dVar.a = list3.size() - dVar.b;
                bVar7.C(new a.r(list3));
                return s3q0.a;
            default:
                f9a0 f9a0Var = (f9a0) obj2;
                f9a0Var.o.d((y7a0) f9a0Var.m);
                return s3q0.a;
        }
    }

    public /* synthetic */ cqv(w060 w060Var, bi20 bi20Var) {
        this.b = 18;
        this.c = bi20Var;
    }
}
