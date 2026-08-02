package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.exceptions.IllegalDateFormatException;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.feedlikes.fragments.FeedLikesFragment;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.design.view.subscription.MusicSubscriptionBannerView;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.network.eventhub.api.Message;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextFlag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.aiq0;
import xsna.e3m;
import xsna.egm;
import xsna.s1c0;
import xsna.uny;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h1j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h1j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        float f;
        String str;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                i1j i1jVar = (i1j) obj;
                bwt0.i0((View) i1jVar.j.getValue(), new r6(i1jVar, 29));
                return (Toolbar) i1jVar.c.findViewById(R.id.toolbar);
            case 1:
                ((zak0) ((rfj) obj).h).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 2:
                CropEditorFragment cropEditorFragment = (CropEditorFragment) obj;
                qcy<Object>[] qcyVarArr = CropEditorFragment.W;
                return new k6a0(new vfk(cropEditorFragment, i3), (g760) cropEditorFragment.S.getValue());
            case 3:
                com.vk.newsfeed.common.recycler.holders.zhukov.a aVar = (com.vk.newsfeed.common.recycler.holders.zhukov.a) obj;
                aVar.a.setImageMatrix(aVar.g);
                return s3q0.a;
            case 4:
                return ((View) ((tdm) obj).b).findViewById(R.id.action_forward);
            case 5:
                efm efmVar = ((cfm) obj).e;
                if (efmVar != null) {
                    efmVar.n();
                }
                return s3q0.a;
            case 6:
                egm egmVar = (egm) obj;
                Context context = egmVar.d;
                VkText vkText = new VkText(context, null, 6, 0);
                FontFamily fontFamily = FontFamily.REGULAR;
                egm.b bVar = egmVar.m;
                float f2 = (bVar != null ? bVar : null).c;
                TextSizeUnit textSizeUnit = TextSizeUnit.PX;
                int i4 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
                if (i4 == 1) {
                    f = f2;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = com.vk.typography.b.b(f2);
                }
                Font.Companion.getClass();
                Font a = Font.a.a(fontFamily, f);
                Typeface k = a.k(context);
                float j = a.j();
                vkText.setTypeface(k);
                vkText.setLetterSpacing(j);
                if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
                    int i5 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
                    if (i5 == 1) {
                        i2 = 0;
                    } else if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkText.setTextSize(i2, f2);
                }
                vkText.setTextColor(e3m.f(R.attr.vk_ui_text_link_themed, context));
                vkText.setSingleLine(true);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                vkText.setLayoutParams(egm.W(egmVar, 0, 0, 0, 0, 0, 0, 63));
                egmVar.b.addView(vkText);
                return vkText;
            case 7:
                gcn gcnVar = (gcn) obj;
                gcnVar.g = false;
                gcnVar.f = false;
                gcnVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                gcnVar.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return s3q0.a;
            case 8:
                ((wfo) obj).d();
                return s3q0.a;
            case 9:
                return (ViewGroup) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).c.findViewById(R.id.profile_error_container);
            case 10:
                hl60 hl60Var = hl60.a;
                hl60.j((ArrayList) mqp.S.getValue(), (RecyclerView) obj, null, null, 28);
                return s3q0.a;
            case 11:
                int i6 = FeedLikesFragment.t0;
                s1c0.a aVar2 = new s1c0.a();
                aVar2.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = ((FeedLikesFragment) obj).mo2getContext();
                aVar2.s = sf2Var.a();
                return aVar2.a();
            case 12:
                return z9r.a(((u7r) obj).a, "Can not delete file ");
            case 13:
                ((a4s) obj).b.e2(new aiq0.g.b(true, true));
                return s3q0.a;
            case 14:
                int i7 = FriendRequestsTabFragment.X0;
                return ((NotificationsComponent) j6i.b(m7m.f((FriendRequestsTabFragment) obj), NotificationsComponent.class)).b();
            case 15:
                ((FriendsCatalogRootVh) obj).x.d();
                return s3q0.a;
            case 16:
                mss mssVar = (mss) obj;
                return new iii0(mssVar.d, (r6g0) mssVar.l.getValue(), mssVar.h, mssVar.i);
            case 17:
                return ((nau) obj).e;
            case 18:
                skv skvVar = (skv) obj;
                String host = skvVar.a.getHost();
                if (host != null) {
                    return host;
                }
                throw new IllegalStateException("Uri " + skvVar.a + " doesn't have host!");
            case 19:
                return new q5y((r6y) obj);
            case 20:
                uny unyVar = (uny) obj;
                uny.a aVar3 = unyVar.d;
                if (aVar3 instanceof uny.a.b) {
                    return ((uny.a.b) aVar3).a.a.a();
                }
                if (!(aVar3 instanceof uny.a.C3814a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uny.a.C3814a c3814a = (uny.a.C3814a) aVar3;
                ArrayList<uoy> arrayList = unyVar.c;
                Pair<Float, pny<?>> pair = c3814a.b;
                Pair<Float, pny<?>> pair2 = c3814a.c;
                float floatValue = (c3814a.d - pair.i().floatValue()) / (pair2.i().floatValue() - pair.i().floatValue());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<uoy, upy> a2 = pair.j().a.a();
                Map<uoy, upy> a3 = pair2.j().a.a();
                for (uoy uoyVar : arrayList) {
                    upy upyVar = a2.get(uoyVar);
                    upy upyVar2 = a3.get(uoyVar);
                    if (upyVar != null || upyVar2 != null) {
                        if (upyVar == null) {
                            upyVar = upy.d;
                        }
                        if (upyVar2 == null) {
                            upyVar2 = upy.d;
                        }
                        lzb0 lzb0Var = upyVar.a;
                        lzb0 lzb0Var2 = upyVar2.a;
                        lzb0 lzb0Var3 = new lzb0(an10.b((lzb0Var2.a - r12) * floatValue) + lzb0Var.a, an10.b((lzb0Var2.b - r9) * floatValue) + lzb0Var.b);
                        kxj0 kxj0Var = upyVar.b;
                        kxj0 kxj0Var2 = upyVar2.b;
                        kxj0 kxj0Var3 = new kxj0(an10.b((kxj0Var2.a - r13) * floatValue) + kxj0Var.a, an10.b((kxj0Var2.b - r9) * floatValue) + kxj0Var.b);
                        float f3 = upyVar.c;
                        linkedHashMap.put(uoyVar, new upy(lzb0Var3, kxj0Var3, u11.b(upyVar2.c, f3, floatValue, f3)));
                    }
                }
                return linkedHashMap;
            case 21:
                MarketEditAlbumFinishedFragment marketEditAlbumFinishedFragment = (MarketEditAlbumFinishedFragment) obj;
                int i8 = MarketEditAlbumFinishedFragment.Q;
                marketEditAlbumFinishedFragment.finish();
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = marketEditAlbumFinishedFragment.N;
                if (goodAlbumEditFlowEntity != null && (str = goodAlbumEditFlowEntity.k) != null) {
                    ((urw) marketEditAlbumFinishedFragment.O.getValue()).a(marketEditAlbumFinishedFragment.requireContext(), str, false);
                }
                return s3q0.a;
            case 22:
                return new JSONObject(zq70.m(2, ((Message.b) obj).b));
            case 23:
                return emi.y(((qu20) obj).a);
            case 24:
                return ((ta30) obj).getTouchProcessor().e;
            case 25:
                Context context2 = ((zm30) obj).b;
                String string = context2.getString(R.string.vkim_msg_list_time_this_year);
                try {
                    DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
                    dateFormatSymbols.setMonths(context2.getResources().getStringArray(R.array.months_full_dep));
                    return new SimpleDateFormat(string, dateFormatSymbols);
                } catch (Throwable th) {
                    L l = L.a;
                    l.getClass();
                    if (L.m(LoggerOutputTarget.NONE)) {
                        return null;
                    }
                    L.u(l, L.LogType.e, new Object[]{new IllegalDateFormatException(string, th)});
                    return null;
                }
            case 26:
                Context t = ((xt30) obj).t();
                e3m.a aVar4 = e3m.a;
                return new PorterDuffColorFilter(t.getColor(R.color.vkim_msg_part_selection_mask), PorterDuff.Mode.DST_OVER);
            case 27:
                int i9 = MusicCatalogFragment.W;
                return ((MusicCatalogFragment) obj).getViewLifecycleOwner();
            case 28:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj;
                return new HidingToolbarVh(musicMyAudiosCatalogRootVh.m.b.e, Collections.singletonList(musicMyAudiosCatalogRootVh.o0()), musicMyAudiosCatalogRootVh.Q, new AppBarExpandableControllerBehaviour());
            default:
                int i10 = MusicSubscriptionBannerView.x;
                return (TextView) ((MusicSubscriptionBannerView) obj).findViewById(R.id.offer_subtitle);
        }
    }
}
