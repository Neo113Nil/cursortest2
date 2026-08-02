package xsna;

import android.app.Application;
import android.net.ConnectivityManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingAuthorLoadException;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.reefton.utils.ReefNetworkUtil;
import com.vk.video.profile.presentation.NestedViewPagerHost;
import com.vk.voip.call_effects.CallEffectsDependency;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.c9t0;
import xsna.gij;
import xsna.hh8;
import xsna.nt80;
import xsna.o080;
import xsna.qtk0;
import xsna.tj50;
import xsna.xcc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y160 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ y160(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.j == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        PostingAuthorLoadException postingAuthorLoadException;
        PostingCreationEntryPoint postingCreationEntryPoint;
        switch (this.b) {
            case 0:
                View view = (View) obj;
                int i = NestedViewPagerHost.e;
                if (!(view instanceof ViewPager) && !(view instanceof ViewPager2)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 1:
                ((View) obj).setPadding(0, 0, 0, 0);
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                f080 f080Var = f080.b;
                ao8 ao8Var = ao8.d;
                h0u0 a = aVar.a(f080Var, ao8Var);
                h0u0 a2 = aVar.a(g080.b, ao8Var);
                o080.a.b bVar = new o080.a.b();
                bVar.a = a;
                bVar.b = a2;
                return bVar;
            case 3:
                return ((JSONObject) obj).getJSONObject("response");
            case 4:
                Throwable th = (Throwable) obj;
                if (th instanceof PostingAuthorLoadException) {
                    postingAuthorLoadException = (PostingAuthorLoadException) th;
                } else {
                    postingAuthorLoadException = new PostingAuthorLoadException(sv1.u(th) ? xcc0.a.a : new xcc0.c(th), th);
                }
                return io.reactivex.rxjava3.core.x.i(postingAuthorLoadException);
            case 5:
                return ((PostingState.Editing) obj).i.j;
            case 6:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 7:
                return Integer.valueOf(((yaw) obj).a);
            case 8:
                qof0 qof0Var = (qof0) obj;
                hof0 d = qof0Var.d();
                fnf0 a3 = qof0Var.a();
                Application application = qof0Var.a;
                return new ReefNetworkUtil(d, a3, (SubscriptionManager) application.getSystemService("telephony_subscription_service"), (ConnectivityManager) application.getSystemService("connectivity"), (TelephonyManager) application.getSystemService("phone"));
            case 9:
                return Boolean.FALSE;
            case 10:
                return s3q0.a;
            case 11:
                StoryEntry storyEntry = (StoryEntry) obj;
                storyEntry.h0 = EmptyList.b;
                storyEntry.Z = 0;
                storyEntry.A = 0;
                return s3q0.a;
            case 12:
                L.i((Throwable) obj);
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                return TemplateDetailsState.a((TemplateDetailsState) obj, null, null, true, 7);
            case 15:
                xdd xddVar = ((ced) obj).a;
                UserId userId = xddVar.h;
                ClipUploadParams clipUploadParams = xddVar.b.b;
                boolean z = clipUploadParams.g;
                switch (obk.$EnumSwitchMapping$1[wrp.a(clipUploadParams.c).ordinal()]) {
                    case 1:
                        postingCreationEntryPoint = PostingCreationEntryPoint.FeedPlus;
                        break;
                    case 2:
                        postingCreationEntryPoint = PostingCreationEntryPoint.ProfilePlusButton;
                        break;
                    case 3:
                        postingCreationEntryPoint = PostingCreationEntryPoint.ProfileWallButton;
                        break;
                    case 4:
                    case 5:
                        postingCreationEntryPoint = PostingCreationEntryPoint.GroupWallButton;
                        break;
                    case 6:
                        postingCreationEntryPoint = PostingCreationEntryPoint.CommunityCreationOnboardingBlock;
                        break;
                    default:
                        postingCreationEntryPoint = PostingCreationEntryPoint.Other;
                        break;
                }
                return new gij.a(userId, postingCreationEntryPoint, z);
            case 16:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                VKList vKList = new VKList(ums0.e(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52));
                vKList.n(shortVideoGetOwnerVideosResponseDto.g());
                return vKList;
            case 17:
                return s3q0.a;
            case 18:
                return Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(((Integer) obj).intValue()));
            case 19:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 20:
                c9t0 c9t0Var = (c9t0) obj;
                if (!(c9t0Var instanceof c9t0.e)) {
                    return null;
                }
                c9t0.e eVar = (c9t0.e) c9t0Var;
                qtk0<u490> qtk0Var = eVar.e;
                if (!(qtk0Var instanceof qtk0.a)) {
                    return null;
                }
                qtk0.a aVar2 = (qtk0.a) qtk0Var;
                WarningNotification warningNotification = ((u490) aVar2.a).v;
                if (warningNotification == null || eVar.h.contains(Integer.valueOf(warningNotification.b))) {
                    return null;
                }
                Owner owner = ((u490) aVar2.a).a;
                return new q9t0();
            case 21:
                return ((VideoUploadEvent.Removed) obj).c.r1();
            case 22:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((CallEffectsDependency.DynamicLibsState) obj) == CallEffectsDependency.DynamicLibsState.LOADED);
            default:
                hh8 hh8Var = (hh8) obj;
                if (hh8Var instanceof hh8.a) {
                    hh8.a aVar3 = (hh8.a) hh8Var;
                    nt80<dfw0> nt80Var = aVar3.f;
                    nt80Var.getClass();
                    if (nt80Var instanceof nt80.c) {
                        break;
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
        }
    }

    public /* synthetic */ y160(Object obj, int i) {
        this.b = i;
    }
}
