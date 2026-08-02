package xsna;

import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketReferenceDto;
import com.vk.clips.editor.aspectratio.impl.FormatAspectRatio;
import com.vk.log.L;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: BroadcastLaunchView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ug8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                long longValue = ((Number) obj).longValue();
                xg8 xg8Var = (xg8) this.receiver;
                xg8Var.getClass();
                int b = an10.b(longValue / 1000.0f);
                TextView textView = xg8Var.b;
                textView.animate().cancel();
                textView.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                textView.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                textView.setAlpha(0.3f);
                textView.setText(String.valueOf(b));
                textView.animate().setInterpolator(new OvershootInterpolator(3.0f)).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(1000L).start();
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                ((fgj0) this.receiver).getClass();
                break;
            case 3:
                rwd rwdVar = (rwd) this.receiver;
                int i = rwdVar.k;
                FormatAspectRatio formatAspectRatio = ((qu3) obj).a;
                if (i != formatAspectRatio.ordinal()) {
                    rwdVar.e(formatAspectRatio.ordinal());
                    rwdVar.e.s(formatAspectRatio);
                }
                break;
            case 4:
                ((iqf) this.receiver).T((ttf) obj);
                break;
            case 5:
                ((com.vk.profile.community.details.impl.name_history.b) this.receiver).T((com.vk.profile.community.details.impl.name_history.c) obj);
                break;
            case 6:
                MarketReferenceDto marketReferenceDto = (MarketReferenceDto) obj;
                ((xfg0) this.receiver).getClass();
                String d = marketReferenceDto.d();
                Coordinate coordinate = new Coordinate(marketReferenceDto.f().e(), marketReferenceDto.f().f());
                String d2 = marketReferenceDto.f().d();
                break;
            case 7:
                kbx.a((kbx) this.receiver, (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.h) obj);
                break;
            case 8:
                break;
            case 9:
                int intValue = ((Number) obj).intValue();
                j650 j650Var = (j650) this.receiver;
                RecyclerView recyclerView = j650Var.e;
                hfz hfzVar = (hfz) j5g.b0(intValue, j650Var.g.h);
                if (hfzVar != null && !(hfzVar instanceof qck0)) {
                    mck0 mck0Var = j650Var.i;
                    if (mck0Var != null) {
                        mck0Var.f = true;
                    }
                    recyclerView.scrollBy(0, e3m.a(R.dimen.music_snippet_pack_recycler_height, j650Var.d.getContext()) / 2);
                    recyclerView.fling(0, 2000);
                }
                break;
            case 10:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 11:
                JSONObject jSONObject = (JSONObject) obj;
                ((tm70) this.receiver).getClass();
                String optString = jSONObject.optString("package_name");
                String A = f370.A("bank_name", jSONObject);
                if (A != null && (r2 = f370.A("schema", jSONObject)) != null && (r15 = f370.A("bank_id", jSONObject)) != null) {
                    break;
                }
                break;
            case 12:
                kr5 kr5Var = (kr5) obj;
                eka0 eka0Var = (eka0) this.receiver;
                eka0Var.getClass();
                String b2 = kr5Var.b(0);
                if (b2 == null) {
                    b2 = null;
                } else if (drm0.N(b2)) {
                    b2 = i5s.a(new StringBuilder("https://"), a0a.d, "/images/camera_400.png?ava=1");
                }
                eka0Var.e.load(kr5Var.b(0));
                eka0Var.d.c(kr5.a(kr5Var, null, new b7r0(b2, 1), 7));
                break;
            case 13:
                Throwable th = (Throwable) obj;
                ((d9i0) this.receiver).getClass();
                L.i(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 14:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.receiver;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, (com.vk.video.ui.discovery.minimizable.c) obj);
                break;
            default:
                l5v0.a((l5v0) this.receiver, (Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0);
                break;
            case 3:
                super(1, obj, rwd.class, "aspectRatioClicked", "aspectRatioClicked(Lcom/vk/clips/editor/aspectratio/impl/AspectRatioButton;)V", 0);
                break;
            case 6:
                super(1, obj, xfg0.class, "mapReverseGeocodingResult", "mapReverseGeocodingResult(Lcom/vk/api/generated/market/dto/MarketReferenceDto;)Lcom/vk/search/params/impl/domain/model/geo/ReverseGeocodeResult;", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, tm70.class, "parseItem", "parseItem(Lorg/json/JSONObject;)Lcom/vk/api/generated/money/dto/MoneyNspkMemberDto;", 0);
                break;
            case 15:
                super(1, obj, l5v0.class, "onUpdateError", "onUpdateError(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
