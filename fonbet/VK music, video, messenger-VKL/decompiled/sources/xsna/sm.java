package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.log.L;
import com.vk.music.playlist.display.domain.f;
import com.vk.music.playlist.display.presentation.MusicPlaylistPaginationState;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.k840;
import xsna.kib;
import xsna.m1j;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sm implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ sm(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        if (r10 != false) goto L73;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return AlbumChooseState.a((AlbumChooseState) obj, null, null, 0, false, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 2:
                AudioBook audioBook = (AudioBook) obj;
                qh4 a = k840.a.a();
                bpn0 bpn0Var = o25.a;
                a.B(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), audioBook);
                return s3q0.a;
            case 3:
                bwt0.p0((View) obj, true);
                return s3q0.a;
            case 4:
                return new dl7((ViewGroup) obj);
            case 5:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                kib.a aVar = (kib.a) obj;
                return new mib(aVar.a, aVar.b, aVar.c, aVar.d);
            case 7:
                qgi0.r((tgi0) obj, "CHAT_SETTINGS_TOP_BAR_CLOSE_BUTTON_TAG");
                return s3q0.a;
            case 8:
                View view = new View(((ViewGroup) obj).getContext());
                float f = 0;
                view.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
                return new abd(view);
            case 9:
                ClipsCoauthorsSelectorMviState.a aVar2 = (ClipsCoauthorsSelectorMviState.a) obj;
                return new d8p0(aVar2.b, fnd.e(aVar2.c), false);
            case 10:
                return s3q0.a;
            case 11:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 12:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th2);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 13:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof VKApiExecutionException) {
                    Context context = e43.a;
                    j03.i(context != null ? context : null, (VKApiExecutionException) th3);
                }
                return s3q0.a;
            case 14:
                awd0 awd0Var = (awd0) obj;
                if (awd0Var.a == 3) {
                    i8q0 i8q0Var = awd0Var instanceof i8q0 ? (i8q0) awd0Var : null;
                    if (i8q0Var != null) {
                        g620.t(i8q0Var.b);
                        hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                    }
                }
                return s3q0.a;
            case 15:
                tj50.a aVar3 = (tj50.a) obj;
                tr0 tr0Var = new tr0(11);
                ao8 ao8Var = ao8.d;
                return new m1j.e(aVar3.a(new ur0(19), ao8Var), aVar3.a(new d40(22), ao8Var), aVar3.a(new qm(14), ao8Var), aVar3.a(new g53(11), ao8Var), aVar3.a(tr0Var, ao8Var));
            case 16:
                c9k c9kVar = (c9k) obj;
                if (c9kVar.r > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    List<UploadImageModel> list = c9kVar.x;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (((UploadImageModel) it.next()).e instanceof ProgressInfo.Loading) {
                            }
                        }
                    }
                    if (c9kVar.c()) {
                        z = c9kVar.h();
                        break;
                    } else {
                        z = true;
                        break;
                    }
                }
                r3 = false;
                return Boolean.valueOf(r3);
            case 17:
                nlk.b.getClass();
                nlk.e((List) obj);
                return s3q0.a;
            case 18:
                return s3q0.a;
            case 19:
                return ((w9m) obj).a;
            case 20:
                List list2 = (List) obj;
                h6n0 h6n0Var = (h6n0) list2.get(0);
                h6n0 h6n0Var2 = (h6n0) list2.get(1);
                return h6n0.a(h6n0Var2, m420.a(h6n0Var2.a, false, h6n0Var.a.a.size(), 7));
            case 21:
                int i = f.a.$EnumSwitchMapping$0[((yfn) obj).s.e.ordinal()];
                if (i == 1) {
                    return MusicPlaylistPaginationState.LOADING;
                }
                if (i == 2) {
                    return MusicPlaylistPaginationState.ERROR;
                }
                if (i == 3) {
                    return MusicPlaylistPaginationState.COMPLETED;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.c = ((VkAuthValidatePhoneResult) obj).zb();
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                L.i((Throwable) obj);
                return s3q0.a;
            case 25:
                return EmptyList.b;
            case 26:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 27:
                try {
                    return new GetStoriesResponse(((JSONObject) obj).optJSONObject("response"));
                } catch (Throwable th4) {
                    com.vk.metrics.eventtracking.b.a.a(th4);
                    return null;
                }
            case 28:
                ysg0.b.a(new pru0());
                return s3q0.a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.internal.operators.single.a0.b;
                }
                vdx0 vdx0Var = e370.e;
                return (vdx0Var != null ? vdx0Var : null).y().a().q(asu0.a.c());
        }
    }

    public /* synthetic */ sm(fnd fndVar) {
        this.b = 9;
    }
}
