package xsna;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.esia.dto.EsiaEsiaUserInfoDto;
import com.vk.api.generated.esia.dto.EsiaGetEsiaUserInfoResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.ui.vkvideopromo.VkVideoPromoFragment;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.verification.account.b;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.b6l0;
import xsna.u850;
import xsna.wyv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s1f0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s1f0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
    
        if (r1.intValue() != r2) goto L37;
     */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                int intValue = ((Integer) obj).intValue();
                if (frameLayout.getY() > (viewGroup.getHeight() - intValue) - cn70.b(3)) {
                    frameLayout.setY((viewGroup.getHeight() - intValue) - cn70.b(3));
                }
                break;
            case 1:
                b6l0 b6l0Var = (b6l0) this.c;
                String str = (String) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) obj;
                b6l0Var.getClass();
                pro0.b();
                System.currentTimeMillis();
                String[] strArr = a6l0.a;
                if (str == null || str.length() <= 0 || str.length() > 40) {
                    break;
                } else {
                    String a = a6l0.a(str);
                    s6n0 o = b6l0Var.a.o();
                    o.getClass();
                    ArrayList arrayList = new ArrayList();
                    Set entrySet = o.g.entrySet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : entrySet) {
                        if (brm0.B((String) ((Map.Entry) obj2).getKey(), a, false)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(((StickersDictionaryItemLight) ((Map.Entry) it.next()).getValue()).zb());
                    }
                    StickersDictionaryItem c = o.c(new StickersDictionaryItemLight(Collections.singletonList(a), arrayList, false, 4, null));
                    if (c.isEmpty()) {
                        b6l0Var.a.h();
                    }
                    if (b6l0Var.e == null) {
                        b6l0Var.e = new c6l0(sparseIntArray);
                    }
                    b6l0.a aVar = new b6l0.a(str, b6l0Var.a(c.c), b6l0Var.a(c.d));
                    System.currentTimeMillis();
                    break;
                }
            case 2:
                p1m0 p1m0Var = (p1m0) this.c;
                com.vk.movika.sdk.base.hooks.k kVar = (com.vk.movika.sdk.base.hooks.k) this.d;
                u850 u850Var = (u850) obj;
                if (u850Var instanceof u850.g) {
                    int i = p1m0Var.e;
                    if (i >= 0) {
                        q850 q850Var = p1m0Var.a;
                        new PlaybackActionMeta(17, 0L, 2, null);
                        if (q850Var.d.f(i)) {
                            p1m0Var.e = -1;
                        }
                    }
                } else if (epx.f(u850Var, u850.f.a)) {
                    ((u440) kVar.c).x7();
                }
                break;
            case 3:
                ((rem0) ((zgm0) this.c).b.e.b).a(new uem0((UserId) this.d, (Set) obj)).subscribe();
                break;
            case 4:
                FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                rhq0 rhq0Var = (rhq0) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ArrayList arrayList3 = new ArrayList();
                if (extendedUserProfile.S0 > 0) {
                    String[] stringArray = fragmentActivity.getResources().getStringArray(R.array.personal_politics_options);
                    int i2 = extendedUserProfile.S0 - 1;
                    if (i2 < stringArray.length) {
                        arrayList3.add(new x4m(R.string.personal_politics, stringArray[i2]));
                    }
                }
                String str2 = extendedUserProfile.Q0;
                if (str2 != null && myc0.f(str2)) {
                    arrayList3.add(new x4m(R.string.personal_religion, rhq0Var.e(extendedUserProfile.Q0)));
                }
                if (extendedUserProfile.T0 > 0) {
                    String[] stringArray2 = fragmentActivity.getResources().getStringArray(R.array.personal_life_options);
                    int i3 = extendedUserProfile.T0 - 1;
                    if (i3 < stringArray2.length) {
                        arrayList3.add(new x4m(R.string.personal_life, stringArray2[i3]));
                    }
                }
                if (extendedUserProfile.U0 > 0) {
                    String[] stringArray3 = fragmentActivity.getResources().getStringArray(R.array.personal_people_options);
                    int i4 = extendedUserProfile.U0 - 1;
                    if (i4 < stringArray3.length) {
                        arrayList3.add(new x4m(R.string.personal_people, stringArray3[i4]));
                    }
                }
                if (extendedUserProfile.V0 > 0) {
                    String[] stringArray4 = fragmentActivity.getResources().getStringArray(R.array.personal_views_options);
                    int i5 = extendedUserProfile.V0 - 1;
                    if (i5 < stringArray4.length) {
                        arrayList3.add(new x4m(R.string.personal_smoking, stringArray4[i5]));
                    }
                }
                if (extendedUserProfile.W0 > 0) {
                    String[] stringArray5 = fragmentActivity.getResources().getStringArray(R.array.personal_views_options);
                    int i6 = extendedUserProfile.W0 - 1;
                    if (i6 < stringArray5.length) {
                        arrayList3.add(new x4m(R.string.personal_alcohol, stringArray5[i6]));
                    }
                }
                String str3 = extendedUserProfile.R0;
                if (str3 != null && myc0.f(str3)) {
                    arrayList3.add(new x4m(R.string.personal_inspiration, rhq0Var.e(extendedUserProfile.R0)));
                }
                String str4 = extendedUserProfile.G0;
                if (str4 != null) {
                    arrayList3.add(new x4m(R.string.profile_occupation, rhq0Var.e(str4)));
                }
                String str5 = extendedUserProfile.H0;
                if (str5 != null) {
                    arrayList3.add(new x4m(R.string.profile_interests, rhq0Var.e(str5)));
                }
                String str6 = extendedUserProfile.I0;
                if (str6 != null) {
                    arrayList3.add(new x4m(R.string.profile_music, rhq0Var.e(str6)));
                }
                String str7 = extendedUserProfile.J0;
                if (str7 != null) {
                    arrayList3.add(new x4m(R.string.profile_movies, rhq0Var.e(str7)));
                }
                String str8 = extendedUserProfile.K0;
                if (str8 != null) {
                    arrayList3.add(new x4m(R.string.profile_tv, rhq0Var.e(str8)));
                }
                String str9 = extendedUserProfile.L0;
                if (str9 != null) {
                    arrayList3.add(new x4m(R.string.profile_books, rhq0Var.e(str9)));
                }
                String str10 = extendedUserProfile.M0;
                if (str10 != null) {
                    arrayList3.add(new x4m(R.string.profile_games, rhq0Var.e(str10)));
                }
                String str11 = extendedUserProfile.N0;
                if (str11 != null) {
                    arrayList3.add(new x4m(R.string.profile_quotations, rhq0Var.e(str11)));
                }
                String str12 = extendedUserProfile.O0;
                if (str12 != null) {
                    arrayList3.add(new x4m(R.string.profile_about, rhq0Var.e(str12)));
                }
                if (!arrayList3.isEmpty()) {
                    arrayList3.add(0, new o4m(R.string.profile_info_personal, 14, null));
                    break;
                }
                break;
            case 5:
                ((uqr0) this.c).l.v0(((p7k) this.d).b);
                break;
            case 6:
                jgp jgpVar = jgp.b;
                yg5 yg5Var = (yg5) this.c;
                s740 s740Var = (s740) this.d;
                Map map = (Map) obj;
                if (yg5Var.P0()) {
                    break;
                } else if (yg5Var.v()) {
                    s740Var.getClass();
                    break;
                } else {
                    s740Var.getClass();
                    break;
                }
            case 7:
                UIBlockList uIBlockList = (UIBlockList) this.c;
                cit0 cit0Var = (cit0) this.d;
                UIBlockList uIBlockList2 = (UIBlockList) obj;
                if (epx.f(uIBlockList.b, uIBlockList2.b)) {
                    Integer num = cit0Var.c;
                    int hashCode = uIBlockList2.hashCode();
                    if (num != null) {
                        break;
                    }
                    break;
                }
                z = false;
            case 8:
                String str13 = (String) this.c;
                wyv0 wyv0Var = (wyv0) this.d;
                com.vk.superapp.verification.account.c cVar = wyv0Var.d;
                EsiaGetEsiaUserInfoResponseDto esiaGetEsiaUserInfoResponseDto = (EsiaGetEsiaUserInfoResponseDto) obj;
                boolean z2 = esiaGetEsiaUserInfoResponseDto.e() == EsiaGetEsiaUserInfoResponseDto.UserTypeDto.EDU;
                EsiaEsiaUserInfoDto d = esiaGetEsiaUserInfoResponseDto.d();
                cVar.getClass();
                String g0 = j5g.g0(rl3.I(new String[]{d.e(), d.f()}), " ", null, null, 0, null, 62);
                wdx0 wdx0Var = e370.f;
                String f = (wdx0Var != null ? wdx0Var : null).f();
                String str14 = f != null ? f : "";
                wyv0Var.h = new wyv0.a(str13, g0, str14, cVar.d(esiaGetEsiaUserInfoResponseDto.d(), esiaGetEsiaUserInfoResponseDto.f()), true, z2);
                if (wyv0Var.b) {
                    com.vk.superapp.verification.account.e eVar = wyv0Var.a;
                    com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.NOWHERE, SchemeStatSak$EventScreen.OTHER, null, 36);
                    wyv0Var.h();
                } else {
                    wyv0Var.n(new b.a(str14, g0));
                }
                break;
            case 9:
                VkVideoPromoFragment vkVideoPromoFragment = (VkVideoPromoFragment) this.c;
                VkButton vkButton = (VkButton) this.d;
                int i7 = VkVideoPromoFragment.Q;
                hit0 N8 = ((VideoGrowthComponent) vkVideoPromoFragment.O.getValue()).N8();
                Context context = vkButton.getContext();
                String str15 = vkVideoPromoFragment.eo().d().f;
                VideoGrowthAppStore videoGrowthAppStore = vkVideoPromoFragment.eo().d().g;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                N8.b(context, str15, videoGrowthAppStore, s490.f(b.C1208b.a()), null);
                gzs<s3q0> gzsVar = vkVideoPromoFragment.P;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                gvw0 gvw0Var = (gvw0) this.c;
                k7y k7yVar = (k7y) this.d;
                gvw0Var.e = false;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                k7yVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
