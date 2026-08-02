package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.media.MediaBrowserServiceCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryOtherVh;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.log.L;
import com.vk.medianative.MediaImageEncoder;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.voip.dto.profiles.VoipSex;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.d2t0;
import xsna.mp90;
import xsna.op90;
import xsna.us2;
import xsna.w3s0;
import xsna.xll0;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class evh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ evh0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MarketBridgeCategory marketBridgeCategory;
        MarketBridgeCategory marketBridgeCategory2;
        tjo0 b;
        tjo0 b2;
        tjo0 b3;
        String string;
        int i = this.b;
        int i2 = 6;
        boolean z = false;
        r6 = null;
        hik0 hik0Var = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AudioBook audioBook = (AudioBook) obj3;
                SearchHistoryOtherVh searchHistoryOtherVh = (SearchHistoryOtherVh) obj2;
                break;
            case 1:
                dwj dwjVar = (dwj) obj;
                break;
            case 2:
                ill0 ill0Var = (ill0) obj3;
                xll0.a.k kVar = (xll0.a.k) obj2;
                MarketCatalogFilterVM marketCatalogFilterVM = (MarketCatalogFilterVM) obj;
                MarketCatalogFilterVM.d dVar = marketCatalogFilterVM.c;
                Integer valueOf = (dVar == null || (marketBridgeCategory2 = dVar.b) == null) ? null : Integer.valueOf(marketBridgeCategory2.b);
                dhc dhcVar = (dhc) ill0Var.d.k.getValue();
                Context requireContext = ill0Var.a.requireContext();
                String str = (dVar == null || (marketBridgeCategory = dVar.b) == null) ? null : marketBridgeCategory.c;
                UserId userId = ill0Var.c;
                Long l = marketCatalogFilterVM.f;
                Long l2 = marketCatalogFilterVM.g;
                CatalogMarketStatusOption catalogMarketStatusOption = marketCatalogFilterVM.i;
                dhcVar.d(requireContext, new ngc(valueOf, "category", userId, l, l2, catalogMarketStatusOption != null ? catalogMarketStatusOption.c : null, marketCatalogFilterVM.l, marketCatalogFilterVM.n, marketCatalogFilterVM.o, null, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_SEARCH, CommonMarketStat$TypeRefSource.COMMUNITY_GOODS, null, null, null, kVar.b, false, null, true, true, null, false, 6457, null), null, false, str, 3575330));
                break;
            case 3:
                tvl0 tvl0Var = (tvl0) obj3;
                bnc0 bnc0Var = (bnc0) obj2;
                List list = (List) obj;
                List list2 = list;
                tvl0Var.a.addAll(list2);
                tvl0Var.b.addAll(list2);
                if (!list2.isEmpty()) {
                    bnc0Var.invoke(((IPersistingStoryUpload) j5g.Y(list)).V7());
                }
                break;
            case 4:
                us2.d dVar2 = (us2.d) obj3;
                rg50 rg50Var = ((zaz) obj2).b;
                tbo0 tbo0Var = (tbo0) obj;
                q8z q8zVar = (q8z) dVar2.a;
                tjo0 b4 = q8zVar.b();
                hik0 hik0Var2 = b4 != null ? b4.a : null;
                hik0 hik0Var3 = ((1 & ((wak0) rg50Var).getIntValue()) == 0 || (b3 = q8zVar.b()) == null) ? null : b3.b;
                if (hik0Var2 != null) {
                    hik0Var3 = hik0Var2.d(hik0Var3);
                }
                hik0 hik0Var4 = ((((wak0) rg50Var).getIntValue() & 2) == 0 || (b2 = q8zVar.b()) == null) ? null : b2.c;
                if (hik0Var3 != null) {
                    hik0Var4 = hik0Var3.d(hik0Var4);
                }
                if ((((wak0) rg50Var).getIntValue() & 4) != 0 && (b = q8zVar.b()) != null) {
                    hik0Var = b.d;
                }
                if (hik0Var4 != null) {
                    hik0Var = hik0Var4.d(hik0Var);
                }
                tbo0Var.getClass();
                tbo0Var.b = tbo0Var.a.d(new rw(new Ref$BooleanRef(), dVar2, hik0Var, 13));
                break;
            case 5:
                x6r0 x6r0Var = (x6r0) obj3;
                bn40.c((Throwable) obj, new Object[0]);
                ((MediaBrowserServiceCompat.g) obj2).f(null);
                com.vk.catalog2.common.ui.mvp.auto.a aVar = x6r0Var.g;
                if (aVar != null) {
                    aVar.c(x6r0Var.a.getApplicationContext(), "net_error");
                }
                break;
            case 6:
                w3s0 w3s0Var = (w3s0) obj3;
                w3s0.b bVar = (w3s0.b) obj2;
                CharSequence charSequence = (CharSequence) obj;
                w3s0Var.z0 = null;
                TextView textView = w3s0Var.w0;
                textView.setText(charSequence);
                textView.setSingleLine(bVar.b);
                textView.setVisibility(0);
                w3s0Var.t0.getVideoAutoPlayHolderView().setContentDescription(w3s0Var.itemView.getContext().getString(R.string.accessibility_video_title, charSequence));
                VideoFile videoFile = bVar.c;
                MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
                if (musicVideoFile == null || !musicVideoFile.A1) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView.getContext()), (Drawable) null);
                    textView.setCompoundDrawablePadding(iah0.a(4));
                }
                break;
            case 7:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                try {
                    File file = new File(zys0.a(str2), str3 + ".jpg");
                    com.vk.core.files.a.c(file);
                    MediaImageEncoder.INSTANCE.encodeJpegWithoutCompression(bitmap, file);
                } catch (Exception e) {
                    L.i(e);
                }
                try {
                    File file2 = new File(zys0.a(str2), str3 + ".jpg");
                    try {
                        z = file2.exists();
                    } catch (SecurityException unused) {
                    }
                    if (z) {
                        break;
                    }
                } catch (Exception e2) {
                    L.i(e2);
                    return null;
                }
                break;
            case 8:
                f2t0 f2t0Var = (f2t0) obj2;
                VideoFile videoFile2 = ((d2t0.b) obj3).t;
                if (videoFile2 != null) {
                    f2t0Var.a(videoFile2);
                }
                break;
            case 9:
                VideoUploadVh videoUploadVh = (VideoUploadVh) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                qcy<Object>[] qcyVarArr = VideoUploadVh.w;
                if (((brj0) obj).a == 0) {
                    fxc0.B().E().c(videoUploadVh.v);
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 10:
                q5j q5jVar = (q5j) obj;
                jor0.a(q5jVar.d, q5jVar.c.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.e, (y5j.a) obj3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, (y5j.b) obj2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                break;
            case 11:
                com.vk.voip.ui.hint.a aVar2 = (com.vk.voip.ui.hint.a) obj3;
                uj8 uj8Var = (uj8) obj2;
                whr0 whr0Var = (whr0) ((it80) obj).a;
                aVar2.getClass();
                boolean z2 = uj8Var.a;
                qvw0 qvw0Var = uj8Var.b;
                VoipHintView voipHintView = aVar2.a;
                Context context = voipHintView.getContext();
                String obj4 = f370.s(qvw0Var).toString();
                boolean z3 = qvw0Var.b() == VoipSex.FEMALE;
                String r = rte0.r(whr0Var != null ? whr0Var.q : null);
                if (z2) {
                    if (r != null) {
                        obj4 = r;
                    }
                    string = context.getString(z3 ? R.string.voip_smb_started_broadcast_record_f : R.string.voip_smb_started_broadcast_record, obj4);
                } else {
                    if (r != null) {
                        obj4 = r;
                    }
                    string = context.getString(z3 ? R.string.voip_smb_started_broadcast_f : R.string.voip_smb_started_broadcast, obj4);
                }
                voipHintView.a(new VoipHintView.a(string, Integer.valueOf(z2 ? R.drawable.vk_icon_recorder_tape_outline_28 : R.drawable.vk_icon_live_outline_28), null, null, false, 28));
                voipHintView.setVisibility(0);
                aVar2.i = a.EnumC2056a.BroadcastStarted;
                aVar2.j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new yyo(aVar2, i2)));
                break;
            default:
                ((kuw0) obj3).m.a(new mp90.a.c(((op90.a) obj2).c()));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ evh0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
