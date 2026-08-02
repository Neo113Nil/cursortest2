package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.a;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.WaveFormView;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import kotlin.collections.builders.ListBuilder;
import xsna.l2f;
import xsna.ta7;
import xsna.tlo0;
import xsna.uzh;
import xsna.xcw0;
import xsna.xn50;
import xsna.y5c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ns1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ns1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0204  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        String str;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        RestrictionBadge restrictionBadge;
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        hzh hzhVar;
        int i4;
        tlo0.a aVar;
        int i5;
        boolean z2;
        int i6 = this.b;
        io.reactivex.rxjava3.functions.f fVar = io.reactivex.rxjava3.internal.functions.a.d;
        io.reactivex.rxjava3.functions.a aVar2 = io.reactivex.rxjava3.internal.functions.a.c;
        int i7 = 5;
        int i8 = 3;
        Object obj3 = this.c;
        switch (i6) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((us1) obj3).g).setValue(bool);
                break;
            case 1:
                com.vk.catalog2.common.ui.mvp.auto.a aVar3 = (com.vk.catalog2.common.ui.mvp.auto.a) obj3;
                bn40.d("Failed to load playlist tracks");
                aVar3.c(aVar3.a, "net_error");
                break;
            case 2:
                List list = (List) obj3;
                sl2.m.putAll((Map) obj);
                break;
            case 3:
                InstantJob instantJob = (InstantJob) obj;
                break;
            case 4:
                float floatValue = ((Float) obj).floatValue();
                WaveFormView waveFormView = ((pv4) obj3).k;
                (waveFormView == null ? null : waveFormView).setProgress(floatValue);
                break;
            case 5:
                AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = (AutoSuggestStickersPopupWindow) obj3;
                String str2 = (String) obj;
                dk5 dk5Var = autoSuggestStickersPopupWindow.u;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{go9.b("text = ", str2)});
                }
                if (str2.length() <= 40) {
                    lk5 lk5Var = autoSuggestStickersPopupWindow.v;
                    if (lk5Var == null || (str = lk5Var.b()) == null) {
                        str = str2;
                    }
                    if (rte0.c(str, autoSuggestStickersPopupWindow.D) || str.length() <= 1) {
                        i = 0;
                    } else {
                        i = 0;
                        if (brm0.v(str, " ", false)) {
                            str = qoy.c(1, 0, str);
                        }
                    }
                    if (autoSuggestStickersPopupWindow.l == QuickStickerSuggestState.DISABLED || str.length() != 0) {
                        StringBuilder sb = new StringBuilder();
                        char[] charArray = str.toCharArray();
                        int i9 = i;
                        while (i9 < charArray.length) {
                            char c3 = charArray[i9];
                            if ((c3 != 55356 || (i3 = i9 + 1) >= charArray.length || 57339 > (c2 = charArray[i3]) || c2 >= 57344) && !(c3 == 8205 && (i2 = i9 + 1) < charArray.length && ((c = charArray[i2]) == 9792 || c == 9794))) {
                                sb.append(c3);
                                i9++;
                            } else {
                                i9 += 2;
                            }
                        }
                        String sb2 = sb.toString();
                        k6n0 g = autoSuggestStickersPopupWindow.e.g();
                        dk5Var.getClass();
                        obj2 = new io.reactivex.rxjava3.internal.operators.observable.s0(new y94(dk5Var, sb2, g, 1)).a0(asu0.a.c()).t(new y34(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(dk5Var, i7), 2));
                    } else {
                        int i10 = AutoSuggestStickersPopupWindow.d.$EnumSwitchMapping$0[autoSuggestStickersPopupWindow.l.ordinal()];
                        if (i10 == 1) {
                            obj2 = io.reactivex.rxjava3.core.q.T(dk5Var.b(StickersDictionaryItem.QuickSuggestCollectionType.CLIPS));
                        } else if (i10 == 2) {
                            obj2 = io.reactivex.rxjava3.core.q.T(dk5Var.b(StickersDictionaryItem.QuickSuggestCollectionType.POSTS));
                        }
                    }
                    autoSuggestStickersPopupWindow.D = str2;
                    if (obj2 != null) {
                        break;
                    }
                }
                obj2 = null;
                autoSuggestStickersPopupWindow.D = str2;
                if (obj2 != null) {
                }
                break;
            case 6:
                is5 is5Var = (is5) obj3;
                ((zak0) is5Var.i).setValue((BadgeAlignment) is5Var.d.get((String) obj));
                break;
            case 7:
                ((f56) obj3).invoke();
                break;
            case 8:
                ((com.vk.auth.verification.base.b) obj3).N0();
                break;
            case 9:
                ((ma7) obj3).T(new ta7.b.C3733b((qa7) obj));
                break;
            case 10:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((zak0) ((o48) obj3).h).setValue(bool2);
                break;
            case 11:
                ((r79) obj3).q(xcw0.p.a);
                break;
            case 12:
                lba0 lba0Var = (lba0) obj3;
                T t = ((it80) obj).a;
                if (t != 0) {
                    UserProfile userProfile = (UserProfile) t;
                    lba0Var.f = kba0.a(lba0Var.f, userProfile.e, null, userProfile.D(), fco0.i(userProfile.B), 446);
                    lba0Var.p(nba0.a(lba0Var.getContext(), lba0Var.f));
                }
                break;
            case 13:
                com.vk.cameraui.impl.a aVar4 = (com.vk.cameraui.impl.a) obj3;
                aVar4.b.w();
                CameraUIView cameraUIView = aVar4.b;
                cameraUIView.u();
                aVar4.R0();
                aVar4.w0();
                cameraUIView.g0();
                aVar4.B = null;
                break;
            case 14:
                break;
            case 15:
                g3a g3aVar = (g3a) obj3;
                x2a x2aVar = (x2a) obj;
                z2a z2aVar = g3aVar.o;
                CatalogConfiguration catalogConfiguration = g3aVar.b;
                String t2 = catalogConfiguration.t();
                io.reactivex.rxjava3.core.q L = (g3aVar.h && g3aVar.i == null) ? g3aVar.g ? z2aVar.b(t2).L(new vx6(new d05(3, t2, (Object) g3aVar), 4), false) : z2aVar.b(t2) : io.reactivex.rxjava3.internal.operators.observable.g0.b;
                gda gdaVar = g3aVar.i;
                if (gdaVar == null || (r5 = gdaVar.d(null, null, null, false, null)) == null) {
                    io.reactivex.rxjava3.core.q x = catalogConfiguration.x(catalogConfiguration.q(), catalogConfiguration.getRef());
                }
                break;
            case 16:
                ecb.Y0(((pua) obj3).c, (Throwable) obj);
                break;
            case 17:
                afb afbVar = (afb) obj3;
                reb rebVar = afbVar.b;
                Integer num4 = (Integer) ((Optional) obj).orElse(null);
                if (num4 == null) {
                    rebVar.d();
                    break;
                } else {
                    break;
                }
            case 18:
                ChatFragment chatFragment = (ChatFragment) obj3;
                ChatFragment.d dVar = ChatFragment.w1;
                DialogExt a = ((ipm) obj).a(chatFragment.ho());
                if (chatFragment.mo().D()) {
                    DialogExt dialogExt = chatFragment.V;
                    DialogExt Ab = a.Ab((dialogExt == null ? null : dialogExt).b);
                    chatFragment.Do(Ab);
                    z6p z6pVar = chatFragment.N0;
                    if (z6pVar != null) {
                        z6pVar.X0(Ab.b);
                    }
                } else {
                    chatFragment.Do(a);
                    z6p z6pVar2 = chatFragment.N0;
                    if (z6pVar2 != null) {
                        z6pVar2.X0(a.b);
                    }
                }
                break;
            case 19:
                qrb qrbVar = (qrb) obj3;
                mrb mrbVar = qrbVar.w;
                if (mrbVar != null && (restrictionBadge = mrbVar.f) != null) {
                    qrbVar.a.a(restrictionBadge);
                }
                break;
            case 20:
                ((ftb) obj3).e.u0((Throwable) obj);
                break;
            case 21:
                y5c.a aVar5 = ((y5c) obj3).i;
                aau aauVar = new aau((ViewGroup) obj, aVar5);
                aauVar.itemView.setOnClickListener(new ckc(2, aauVar, aVar5));
                break;
            case 22:
                int i11 = ClipsInterestsFragment.Y;
                xn50.a.c((ClipsInterestsFragment) obj3, a.c.C0622a.b);
                break;
            case 23:
                ((eoe) obj3).g.onNext((List) obj);
                break;
            case 24:
                CommentsOutherFragment commentsOutherFragment = (CommentsOutherFragment) obj3;
                z3g0 z3g0Var = commentsOutherFragment.S;
                int i12 = CommentsOutherFragment.h0;
                MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_COMMENTS_MODAL;
                q030 q030Var = commentsOutherFragment.f0;
                if (q030Var != null) {
                    kw60 kw60Var = commentsOutherFragment.e0;
                    Long l2 = q030Var.a;
                    Long valueOf = Long.valueOf(q030Var.b);
                    String str3 = q030Var.c;
                    kw60Var.getClass();
                    kw60.a(l2, valueOf, str3, entryPoint);
                }
                u3g0 u3g0Var = z3g0Var.d;
                if (u3g0Var != null) {
                    z = true;
                    u3g0Var.Ic(true);
                } else {
                    z = true;
                }
                u3g0 u3g0Var2 = z3g0Var.d;
                if (u3g0Var2 != null) {
                    u3g0Var2.j(z);
                }
                u3g0 u3g0Var3 = z3g0Var.d;
                if (u3g0Var3 != null) {
                    mhy.d(u3g0Var3.e);
                }
                u3g0 u3g0Var4 = z3g0Var.d;
                if (u3g0Var4 != null) {
                    u3g0Var4.clearFocus();
                }
                z1h0 parentFragment = commentsOutherFragment.getParentFragment();
                pnv pnvVar = parentFragment instanceof pnv ? (pnv) parentFragment : null;
                if (pnvVar != null) {
                    pnvVar.q6();
                }
                break;
            case 25:
                tmb tmbVar = (tmb) obj;
                break;
            case 26:
                ((imh) obj3).c.invoke(new CommunityProfileAction.o(false));
                break;
            case 27:
                vzh vzhVar = (vzh) obj;
                zig0 zig0Var = vzhVar.A;
                uzh uzhVar = ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f) obj3).d;
                Map<Integer, txh> map = vzhVar.n;
                Float f = vzhVar.h;
                ReviewsSort reviewsSort = vzhVar.v;
                int i13 = vzhVar.i;
                List<dye0> list2 = vzhVar.j;
                int i14 = vzhVar.w;
                List<vd10> list3 = vzhVar.x;
                yig0 yig0Var = vzhVar.y;
                Integer num5 = yig0Var.a;
                if (num5 == null) {
                    if (zig0Var != null) {
                        num5 = Integer.valueOf(zig0Var.a);
                    } else {
                        num = null;
                        num2 = yig0Var.b;
                        if (num2 == null) {
                            if (zig0Var == null) {
                                num3 = null;
                                hzhVar = new hzh(map, f, reviewsSort, i13, list2, vzhVar.B, i14, list3, num, num3, vzhVar.n.isEmpty() && vzhVar.C != null, vzhVar.D, vzhVar.u, vzhVar.c, vzhVar.H, vzhVar.J);
                                uzhVar.getClass();
                                sdz sdzVar = uzhVar.a;
                                ListBuilder e = e43.e();
                                if (f != null) {
                                    tlo0.d b = hq.b(tlo0.Companion, R.plurals.community_reviews_statistic_count, i13);
                                    float floatValue2 = f.floatValue();
                                    String y = brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f}, 1)), ".", StringUtils.COMMA);
                                    List<dye0> list4 = list2;
                                    ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                                    for (dye0 dye0Var : list4) {
                                        int i15 = dye0Var.a;
                                        int i16 = dye0Var.b;
                                        int i17 = dye0Var.c;
                                        Context context = e43.a;
                                        if (context == null) {
                                            context = null;
                                        }
                                        arrayList.add(new x9h(i15, i16, i17, context.getResources().getQuantityString(R.plurals.community_review_marks_statistics_reviews_count, i16, Integer.valueOf(i15), Integer.valueOf(i16))));
                                    }
                                    e.add(new u9h(b, floatValue2, y, i13, arrayList, uzh.b(uzhVar, hzhVar, null, 6)));
                                }
                                if (!list3.isEmpty()) {
                                    List<vd10> list5 = list3;
                                    ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                                    Iterator<T> it = list5.iterator();
                                    while (it.hasNext()) {
                                        String str4 = ((vd10) it.next()).g;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        arrayList2.add(str4);
                                    }
                                    e.add(new nxh(arrayList2, hzhVar.g, uzh.b(uzhVar, hzhVar, null, 6)));
                                }
                                if (hzhVar.l) {
                                    e.add(j3j.b);
                                }
                                e.add(new fig0(uzh.b(uzhVar, hzhVar, null, 6)));
                                i4 = uzh.a.$EnumSwitchMapping$0[hzhVar.c.ordinal()];
                                if (i4 == 1) {
                                    aVar = tlo0.Companion;
                                    i5 = R.string.community_reviews_filter_item_newest;
                                } else if (i4 == 2) {
                                    aVar = tlo0.Companion;
                                    i5 = R.string.community_reviews_filter_item_with_photos;
                                } else if (i4 != 3) {
                                    aVar = tlo0.Companion;
                                    i5 = R.string.community_reviews_filter_item_lowest_mark;
                                } else {
                                    aVar = tlo0.Companion;
                                    i5 = R.string.community_reviews_filter_item_highest_mark;
                                }
                                e.add(new aye0(tq.h(aVar, i5), uzh.b(uzhVar, hzhVar, null, 6)));
                                boolean z3 = (hzhVar.p || hzhVar.o || !hzhVar.n) ? false : true;
                                boolean z4 = false;
                                for (txh txhVar : hzhVar.a.values()) {
                                    boolean z5 = txhVar.j;
                                    int i18 = txhVar.a;
                                    if (z5) {
                                        boolean b2 = uzh.b(uzhVar, hzhVar, Integer.valueOf(i18), 4);
                                        big0 big0Var = txhVar.d;
                                        e.add(new lxh(i18, big0Var.a, big0Var.b, b2));
                                    } else {
                                        if (z3 && txhVar.t && !z4) {
                                            z4 = true;
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        e.add(sxh.a(txhVar, uzh.b(uzhVar, hzhVar, Integer.valueOf(i18), 4), sdzVar, z2));
                                        List<k4g0> list6 = txhVar.q;
                                        List<k4g0> list7 = list6;
                                        if (!list7.isEmpty()) {
                                            for (k4g0 k4g0Var : list6) {
                                                boolean z6 = k4g0Var.h;
                                                int i19 = k4g0Var.a;
                                                if (z6) {
                                                    e.add(hpt0.n(k4g0Var, uzh.a(hzhVar, Integer.valueOf(i18), Integer.valueOf(i19)), null));
                                                } else {
                                                    e.add(gcd0.q(k4g0Var, uzh.a(hzhVar, Integer.valueOf(i18), Integer.valueOf(i19)), sdzVar, null));
                                                }
                                            }
                                            if (txhVar.p > list7.size()) {
                                                e.add(new sij0(i18, uzh.b(uzhVar, hzhVar, null, 6), null));
                                            }
                                        }
                                    }
                                }
                                if (hzhVar.f) {
                                    e.add(hig0.b);
                                }
                                if (hzhVar.k) {
                                    e.add(new he90());
                                }
                                break;
                            } else {
                                num2 = Integer.valueOf(zig0Var.b);
                            }
                        }
                        num3 = num2;
                        hzhVar = new hzh(map, f, reviewsSort, i13, list2, vzhVar.B, i14, list3, num, num3, vzhVar.n.isEmpty() && vzhVar.C != null, vzhVar.D, vzhVar.u, vzhVar.c, vzhVar.H, vzhVar.J);
                        uzhVar.getClass();
                        sdz sdzVar2 = uzhVar.a;
                        ListBuilder e2 = e43.e();
                        if (f != null) {
                        }
                        if (!list3.isEmpty()) {
                        }
                        if (hzhVar.l) {
                        }
                        e2.add(new fig0(uzh.b(uzhVar, hzhVar, null, 6)));
                        i4 = uzh.a.$EnumSwitchMapping$0[hzhVar.c.ordinal()];
                        if (i4 == 1) {
                        }
                        e2.add(new aye0(tq.h(aVar, i5), uzh.b(uzhVar, hzhVar, null, 6)));
                        if (hzhVar.p) {
                        }
                        boolean z42 = false;
                        while (r1.hasNext()) {
                        }
                        if (hzhVar.f) {
                        }
                        if (hzhVar.k) {
                        }
                    }
                }
                num = num5;
                num2 = yig0Var.b;
                if (num2 == null) {
                }
                num3 = num2;
                hzhVar = new hzh(map, f, reviewsSort, i13, list2, vzhVar.B, i14, list3, num, num3, vzhVar.n.isEmpty() && vzhVar.C != null, vzhVar.D, vzhVar.u, vzhVar.c, vzhVar.H, vzhVar.J);
                uzhVar.getClass();
                sdz sdzVar22 = uzhVar.a;
                ListBuilder e22 = e43.e();
                if (f != null) {
                }
                if (!list3.isEmpty()) {
                }
                if (hzhVar.l) {
                }
                e22.add(new fig0(uzh.b(uzhVar, hzhVar, null, 6)));
                i4 = uzh.a.$EnumSwitchMapping$0[hzhVar.c.ordinal()];
                if (i4 == 1) {
                }
                e22.add(new aye0(tq.h(aVar, i5), uzh.b(uzhVar, hzhVar, null, 6)));
                if (hzhVar.p) {
                }
                boolean z422 = false;
                while (r1.hasNext()) {
                }
                if (hzhVar.f) {
                }
                if (hzhVar.k) {
                }
                break;
            case 28:
                f3i f3iVar = (f3i) obj;
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.b) obj3).T(new d.a(f3iVar.b, f3iVar.a));
                break;
            default:
                l2f.a aVar6 = (l2f.a) obj3;
                aVar6.b((io.reactivex.rxjava3.disposables.c) obj);
                l2f.a.c(aVar6);
                aVar6.g.post(new yn2(aVar6, i8));
                break;
        }
        return s3q0.a;
    }
}
