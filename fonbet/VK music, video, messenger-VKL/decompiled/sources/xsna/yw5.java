package xsna;

import android.content.Context;
import android.graphics.RuntimeShader;
import android.view.View;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.atq0;
import xsna.c5v0;
import xsna.pdv0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yw5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [T, xsna.dw20] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        mzt mztVar;
        ArrayList arrayList;
        List<CommunityProfileContentItem> list;
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                RuntimeShader runtimeShader = (RuntimeShader) obj4;
                List list2 = (List) obj3;
                oio oioVar = (oio) obj;
                runtimeShader.setFloatUniform(CommonCode.MapKey.HAS_RESOLUTION, Float.intBitsToFloat((int) (oioVar.d() >> 32)), Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)));
                List list3 = sfl0.b;
                runtimeShader.setColorUniform("bg_TopLeft", ((Number) list2.get(0)).intValue());
                runtimeShader.setColorUniform("bg_TopRight", ((Number) list2.get(1)).intValue());
                runtimeShader.setColorUniform("bg_BottomLeft", ((Number) list2.get(2)).intValue());
                runtimeShader.setColorUniform("bg_BottomRight", ((Number) list2.get(3)).intValue());
                oio.x1(oioVar, (n4j0) obj2, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                break;
            case 1:
                Context context = (Context) obj4;
                UserProfile userProfile = (UserProfile) obj;
                k14 k14Var = new k14((ynh) obj3, userProfile, (qg1) obj2, i3);
                String string = userProfile.s.getString("name_dat");
                if (string == null) {
                    string = userProfile.e;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_phone_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.community_call_dialog_title), tlo0.a.c(R.string.community_call_dialog_subtitle, string)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.cancel), new la9(ref$ObjectRef, 0), null, VkButton.Mode.Secondary, null, false, 444), new c5v0.a.C2643a(new tlo0.f(R.string.voip_call_user), k14Var, null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), false), 52), null, false, 28).b(context, "confirm_call_user_dialog");
                break;
            case 2:
                String str = (String) obj4;
                sfd sfdVar = (sfd) obj3;
                baf0 baf0Var = (baf0) obj2;
                int width = ((VkPicture) obj).getWidth();
                sfdVar.m.setContent(new c.d(str + (drm0.E(str, '?') ? (drm0.G(str, '?') || drm0.G(str, '&')) ? "" : "&" : "?") + "cs=" + width + "x0", new eko(baf0Var)));
                break;
            case 3:
                Set set = (Set) obj3;
                i18 i18Var = (i18) obj;
                i18Var.c = new b7(5, (gzs) obj4, set);
                i18Var.b = new ci3(13);
                i18Var.a = new com.vk.movika.tools.controls.seekbar.j(new ljf(i2, (oap) obj2, set), 1);
                break;
            case 4:
                yst ystVar = (yst) obj4;
                w2w w2wVar = (w2w) obj3;
                HashMap hashMap = (HashMap) obj2;
                Iterator<T> it = ystVar.c.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    d040 o = w2wVar.I0().o();
                    long j = ystVar.b;
                    List list4 = (List) hashMap.get(Integer.valueOf(intValue));
                    if (list4 == null) {
                        list4 = EmptyList.b;
                    }
                    o.c0(intValue, j, list4);
                }
                break;
            case 5:
                break;
            case 6:
                Set<String> set2 = MusicTrackCellVh.A;
                a630.d1(((MusicTrackCellVh) obj4).e(), ((View) obj3).getContext(), (MusicTrack) obj2, true);
                break;
            case 7:
                dv60 dv60Var = (dv60) obj4;
                iw60 iw60Var = (iw60) obj2;
                j170 j170Var = (j170) obj;
                if (!dv60Var.x((qz60) obj3, iw60Var.c)) {
                    ts60 ts60Var = dv60Var.f;
                    NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                    ts60Var.T();
                    LinkedHashSet c = dv60Var.h.g.c();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : c) {
                        if (obj5 instanceof NewsEntry) {
                            arrayList2.add(obj5);
                        }
                    }
                    dv60Var.w().b(iw60Var.c, j170Var.d, iw60Var.d, arrayList2);
                }
                break;
            case 8:
                Photo photo = (Photo) obj4;
                Pair pair = (Pair) obj;
                UserProfile userProfile2 = (UserProfile) pair.d();
                photo.B = (UserProfile) pair.g();
                pdv0.a b = vtk0.c().b(photo);
                b.I(userProfile2);
                b.z((PhotoTag) obj3);
                b.l(((dzd0) obj2).b);
                break;
            default:
                com.vk.profile.user.impl.ui.g gVar = (com.vk.profile.user.impl.ui.g) obj4;
                ynq0 ynq0Var = (ynq0) obj3;
                GiftItem giftItem = (GiftItem) obj2;
                if (((BaseBoolIntDto) obj) == BaseBoolIntDto.YES) {
                    CommunityProfileContent communityProfileContent = gVar.g;
                    if (communityProfileContent == null || (list = communityProfileContent.b) == null) {
                        mztVar = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj6 : list) {
                            if (obj6 instanceof mzt) {
                                arrayList3.add(obj6);
                            }
                        }
                        mztVar = (mzt) j5g.a0(arrayList3);
                    }
                    if (mztVar != null) {
                        List<GiftItem> list5 = mztVar.j;
                        if (list5 != null) {
                            arrayList = new ArrayList(list5);
                            arrayList.remove(giftItem);
                        } else {
                            arrayList = null;
                        }
                        int i4 = mztVar.l - 1;
                        int i5 = i4 < 0 ? 0 : i4;
                        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = ynq0Var.i;
                        if (izsVar == null) {
                            izsVar = null;
                        }
                        izsVar.invoke(new b.c(mzt.i(mztVar, arrayList, (arrayList != null ? arrayList.size() : 0) < i5, i5, null, null, Z3.l)));
                    }
                    fpq0 fpq0Var = ynq0Var.h;
                    if (fpq0Var == null) {
                        fpq0Var = null;
                    }
                    fpq0Var.B(new f.h(new atq0.f(Integer.valueOf(R.string.gift_deleted_successfully), null, null, 14)));
                }
                break;
        }
        return s3q0.a;
    }
}
