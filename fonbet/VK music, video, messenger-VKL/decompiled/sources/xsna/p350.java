package xsna;

import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.dto.PosterConfigCategory;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.exd0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p350 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p350(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ef  */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xsna.r9m0] */
    @Override // io.reactivex.rxjava3.functions.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        ArrayList arrayList;
        xac0 xac0Var;
        PosterSettings posterSettings;
        List<PosterBackground> list;
        Integer num;
        Object obj2;
        sbc0 sbc0Var;
        Poster.Constants constants;
        Object obj3;
        ArrayList<PrivacySetting> arrayList2;
        PrivacySetting privacySetting;
        List<PrivacySetting.PrivacyRule> list2;
        PrivacySetting.PrivacyRule privacyRule;
        int i = this.b;
        String str = null;
        ?? r5 = this.c;
        switch (i) {
            case 0:
                ((l6u) r5).invoke(obj);
                return;
            case 1:
                ((bv60) r5).invoke(obj);
                return;
            case 2:
                ((l6u) r5).invoke(obj);
                return;
            case 3:
                ((uxu) r5).invoke(obj);
                return;
            case 4:
                ((r97) r5).invoke(obj);
                return;
            case 5:
                ((l2e) r5).invoke(obj);
                return;
            case 6:
                ((l6u) r5).invoke(obj);
                return;
            case 7:
                ((q7a0) r5).invoke(obj);
                return;
            case 8:
                ikc0 ikc0Var = (ikc0) r5;
                PosterSettings posterSettings2 = (PosterSettings) obj;
                if (posterSettings2.b.isEmpty()) {
                    return;
                }
                ikc0Var.E0 = posterSettings2;
                tac0 tac0Var = ikc0Var.A;
                if (tac0Var == null) {
                    tac0Var = null;
                }
                qdc0 qdc0Var = tac0Var.b;
                rac0 rac0Var = tac0Var.c;
                List<PosterConfigCategory> list3 = posterSettings2.b;
                boolean z = tac0Var.f != null;
                tac0Var.f = posterSettings2;
                List<PosterConfigCategory> list4 = list3;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((PosterConfigCategory) it.next()).d);
                }
                ArrayList arrayList4 = new ArrayList(c5g.v(arrayList3));
                if (!arrayList4.isEmpty()) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        PosterBackground posterBackground = (PosterBackground) it2.next();
                        PosterBackground posterBackground2 = tac0Var.m;
                        if (posterBackground2 != null && posterBackground.b == posterBackground2.b && epx.f(posterBackground.c, posterBackground2.c)) {
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            tac0Var.h = arrayList5;
                            List<xac0> B = rli0.B(new ulp0(new i5g(arrayList5), new oqu(24)));
                            arrayList = (ArrayList) B;
                            if (!arrayList.isEmpty()) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    xac0 xac0Var2 = (xac0) it3.next();
                                    xac0 xac0Var3 = tac0Var.k;
                                    if (xac0Var3 != null && xac0Var2.a == xac0Var3.a && epx.f(xac0Var2.b, xac0Var3.b)) {
                                        tac0Var.g = B;
                                        posterSettings = tac0Var.f;
                                        if (posterSettings != null && (constants = posterSettings.c) != null) {
                                            rac0Var.Hd(constants);
                                        }
                                        list = tac0Var.h;
                                        if (list == null) {
                                            list = EmptyList.b;
                                        }
                                        rac0Var.di(list);
                                        num = tac0Var.i;
                                        if (num == null) {
                                            qdc0Var.nl(tac0Var.g, z);
                                            if (!z) {
                                                tac0Var.z((PosterConfigCategory) j5g.b0(0, list3));
                                            }
                                        } else {
                                            UserId userId = tac0Var.j;
                                            if (userId == null) {
                                                userId = UserId.d;
                                            }
                                            tac0Var.e0(userId, num);
                                            qdc0Var.nl(tac0Var.g, z);
                                        }
                                        ikc0Var.N7();
                                        obj2 = ikc0Var.D;
                                        ?? r2 = obj2;
                                        if (obj2 == null) {
                                            r2 = 0;
                                        }
                                        r2.f4(posterSettings2.e);
                                        sbc0Var = ikc0Var.x;
                                        if ((sbc0Var == null ? null : sbc0Var).H) {
                                            ikc0Var.T7(true);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            xac0Var = tac0Var.k;
                            if (xac0Var != null) {
                                arrayList.add(0, xac0Var);
                            }
                            tac0Var.g = B;
                            posterSettings = tac0Var.f;
                            if (posterSettings != null) {
                                rac0Var.Hd(constants);
                            }
                            list = tac0Var.h;
                            if (list == null) {
                            }
                            rac0Var.di(list);
                            num = tac0Var.i;
                            if (num == null) {
                            }
                            ikc0Var.N7();
                            obj2 = ikc0Var.D;
                            ?? r22 = obj2;
                            if (obj2 == null) {
                            }
                            r22.f4(posterSettings2.e);
                            sbc0Var = ikc0Var.x;
                            if ((sbc0Var == null ? null : sbc0Var).H) {
                            }
                        }
                    }
                }
                PosterBackground posterBackground3 = tac0Var.m;
                if (posterBackground3 != null) {
                    arrayList4.add(0, posterBackground3);
                }
                ArrayList arrayList52 = new ArrayList(arrayList4);
                tac0Var.h = arrayList52;
                List<xac0> B2 = rli0.B(new ulp0(new i5g(arrayList52), new oqu(24)));
                arrayList = (ArrayList) B2;
                if (!arrayList.isEmpty()) {
                }
                xac0Var = tac0Var.k;
                if (xac0Var != null) {
                }
                tac0Var.g = B2;
                posterSettings = tac0Var.f;
                if (posterSettings != null) {
                }
                list = tac0Var.h;
                if (list == null) {
                }
                rac0Var.di(list);
                num = tac0Var.i;
                if (num == null) {
                }
                ikc0Var.N7();
                obj2 = ikc0Var.D;
                ?? r222 = obj2;
                if (obj2 == null) {
                }
                r222.f4(posterSettings2.e);
                sbc0Var = ikc0Var.x;
                if ((sbc0Var == null ? null : sbc0Var).H) {
                }
                break;
            case 9:
                ((pvc0) r5).e(new qvc0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return;
            case 10:
                ((exd0.b) r5).invoke(obj);
                return;
            case 11:
                ((y510) r5).invoke(obj);
                return;
            case 12:
                ((y510) r5).invoke(obj);
                return;
            case 13:
                ((y510) r5).invoke(obj);
                return;
            case 14:
                ((y510) r5).invoke(obj);
                return;
            case 15:
                ((pre) r5).invoke(obj);
                return;
            case 16:
                int i2 = StickersRecyclerView.w;
                ((y510) r5).invoke(obj);
                return;
            case 17:
                ((oh3) r5).invoke(obj);
                return;
            case 18:
                ((j5b0) r5).invoke(obj);
                throw null;
            case 19:
                ((j5b0) r5).invoke(obj);
                return;
            case 20:
                ((y510) r5).invoke(obj);
                return;
            case 21:
                Iterator it4 = ((ArrayList) obj).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if ("stories".equals(((ked0) obj3).a)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                ked0 ked0Var = (ked0) obj3;
                if (ked0Var != null && (arrayList2 = ked0Var.b) != null) {
                    Iterator<PrivacySetting> it5 = arrayList2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            privacySetting = it5.next();
                            if ("stories".equals(privacySetting.b)) {
                            }
                        } else {
                            privacySetting = null;
                        }
                    }
                    PrivacySetting privacySetting2 = privacySetting;
                    if (privacySetting2 != null && (list2 = privacySetting2.e) != null && (privacyRule = (PrivacySetting.PrivacyRule) j5g.b0(0, list2)) != null) {
                        str = (String) j5g.b0(0, privacyRule.zb());
                    }
                }
                if (epx.f(str, "all")) {
                    return;
                }
                r5.g();
                return;
            case 22:
                ((r4n0) r5).e(new s4n0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return;
            case 23:
                int i3 = UnreadCounterSettingsFragment.n0;
                ((j5b0) r5).invoke(obj);
                return;
            case 24:
                ((j5b0) r5).invoke(obj);
                return;
            case 25:
                ((j5b0) r5).invoke(obj);
                return;
            case 26:
                ((j5b0) r5).invoke(obj);
                return;
            case 27:
                ((j5b0) r5).invoke(obj);
                return;
            case 28:
                int i4 = VkFriendsPickerActivity.p;
                ((yaq0) r5).invoke(obj);
                return;
            default:
                ((egt0) r5).invoke(obj);
                return;
        }
    }
}
