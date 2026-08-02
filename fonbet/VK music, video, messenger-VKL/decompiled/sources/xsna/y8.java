package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.log.L;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.e9k0;
import xsna.m1j;
import xsna.rzn;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y8 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ y8(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                xtw xtwVar = (xtw) obj;
                return ((io.reactivex.rxjava3.core.q) xtwVar.b).L(new d9(new c9(xtwVar.a, objArr2 == true ? 1 : 0), objArr == true ? 1 : 0), false);
            case 1:
                int i = AsrRecordStartFragment.U;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 2:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.f.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 3:
                lyd.a.a("AudioExtractionEditorController", (Throwable) obj);
                return s3q0.a;
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                Serializer.c<CatalogExtendedData> cVar = CatalogExtendedData.CREATOR;
                return ((Owner) obj).b;
            case 6:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 7:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, false, 7);
            case 8:
                return fnd.c();
            case 9:
                return new y3e(R.layout.clips_favorites_footer_loading, (ViewGroup) obj);
            case 10:
                return qjg.a((mue) obj);
            case 11:
                j2r0 j2r0Var = qgj0.a;
                return (ClipVideoFile) qgj0.c((ShortVideoGetResponseDto) obj).get(0);
            case 12:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 13:
                return Integer.valueOf(((fzg) obj).i);
            case 14:
                return s3q0.a;
            case 15:
                return m1j.c.a;
            case 16:
                String str = ((c9k) obj).n;
                return str == null ? "" : str;
            case 17:
                return String.valueOf(((Long) obj).longValue());
            case 18:
                return io.reactivex.rxjava3.core.q.O((List) obj);
            case 19:
                cvk.u(R.string.audio_book_network_error, false);
                return s3q0.a;
            case 20:
                rzn rznVar = new rzn((Context) obj);
                rznVar.setRightContent(new rzn.a.C3643a("Немного текста"));
                tlo0.Companion.getClass();
                rznVar.setText(new tlo0.h("Текст"));
                return rznVar;
            case 21:
                int i2 = FriendsRecommendationsFragment.b0;
                g620.q(0);
                return s3q0.a;
            case 22:
                return (JSONObject) obj;
            case 23:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.r);
            case 24:
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<s3q0> sgi0Var = ngi0.y;
                s3q0 s3q0Var = s3q0.a;
                ((tgi0) obj).a(sgi0Var, s3q0Var);
                return s3q0Var;
            case 25:
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "ItemTags.NAME");
                return s3q0.a;
            case 27:
                return xh2.c(anp.e(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).b(anp.m(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), null, 2)), anp.f(jq2.d(90, 0, null, 6), 2));
            case 28:
                return ((pg00) obj).getClass();
            default:
                int i3 = kwg0.a;
                return s3q0.a;
        }
    }

    public /* synthetic */ y8(Object obj, int i) {
        this.b = i;
    }
}
