package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.stories.dto.StoriesSaveResponseDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.im.engine.internal.sync.longpoll.LongPollSyncManager$InitialSyncState;
import com.vk.log.L;
import com.vk.onboardingscreens.impl.recomthemes.presentation.fragment.UserRecomThemesFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.cwb0;
import xsna.f3t;
import xsna.f3u0;
import xsna.xn50;
import xsna.y8b;

/* compiled from: ChannelProfileInfoModel.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class n9b extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                y8b y8bVar = (y8b) obj;
                i9b i9bVar = (i9b) this.receiver;
                bzb0 bzb0Var = i9bVar.h;
                Context context = i9bVar.f;
                h9k0 h9k0Var = i9bVar.i;
                if (epx.f(y8bVar, y8b.b.a)) {
                    h9k0Var.c(context.getString(R.string.vkim_channels_leaving_from_channel_success), new d7k0(R.string.vkim_channels_profile_cancel, new sz(i9bVar, 11)));
                } else if (epx.f(y8bVar, y8b.a.a)) {
                    h9k0Var.f(context.getString(R.string.vkim_channels_notifications_unsubscribe_error));
                } else if (epx.f(y8bVar, y8b.d.a)) {
                    bzb0Var.c(cwb0.r0.e, new f5(i9bVar, 14));
                } else {
                    if (!epx.f(y8bVar, y8b.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bzb0Var.a();
                }
                return s3q0.a;
            case 1:
                RecyclerView.e0 findViewHolderForAdapterPosition = ((o9e) this.receiver).a.findViewHolderForAdapterPosition(((Number) obj).intValue());
                f3t.a aVar = findViewHolderForAdapterPosition instanceof f3t.a ? (f3t.a) findViewHolderForAdapterPosition : null;
                if (aVar != null) {
                    aVar.h6();
                }
                return s3q0.a;
            case 2:
                com.vk.clips.viewer.impl.grid.b bVar = (com.vk.clips.viewer.impl.grid.b) this.receiver;
                bVar.getClass();
                mce mceVar = new mce((ClipGridParams) obj, new ngj0());
                bVar.B = mceVar;
                return mceVar;
            case 3:
                ((d3h) this.receiver).l((String) obj);
                return s3q0.a;
            case 4:
                afm afmVar = (afm) this.receiver;
                f9w f9wVar = afm.F;
                afmVar.getClass();
                afm.F.a((Throwable) obj);
                afmVar.D.i = false;
                return s3q0.a;
            case 5:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 6:
                ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext((LongPollSyncManager$InitialSyncState) obj);
                return s3q0.a;
            case 7:
                ((io.reactivex.rxjava3.subjects.g) this.receiver).onNext((List) obj);
                return s3q0.a;
            case 8:
                vgg vggVar = (vgg) obj;
                s6k0 s6k0Var = (s6k0) this.receiver;
                s6k0Var.getClass();
                Throwable th = vggVar.a;
                CheckPresenterInfo checkPresenterInfo = s6k0Var.y;
                if (checkPresenterInfo != null) {
                    if (!(th instanceof VKApiExecutionException)) {
                        vggVar.c();
                    } else if (((VKApiExecutionException) th).s() != 1004) {
                        vggVar.c();
                    } else if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                        z2a0 z2a0Var = s6k0Var.D;
                        String str = s6k0Var.x;
                        z2a0Var.getClass();
                        r04 a = z2a0.a(str, checkPresenterInfo);
                        s6k0Var.o0((String) a.a, (bv3) a.b, (ma) a.c, wbu0.a(s6k0Var.b, th, false).a);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        vggVar.c();
                    }
                }
                return s3q0.a;
            case 9:
                f3u0 f3u0Var = (f3u0) obj;
                jrq0 jrq0Var = (jrq0) this.receiver;
                jrq0Var.getClass();
                if (epx.f(f3u0Var, f3u0.c.C2850c.c)) {
                    u5p0 u5p0Var = jrq0Var.b;
                    (u5p0Var != null ? u5p0Var : null).invoke(UserProfileAction.d.e.g.b);
                } else if (epx.f(f3u0Var, f3u0.c.d.c)) {
                    u5p0 u5p0Var2 = jrq0Var.b;
                    (u5p0Var2 != null ? u5p0Var2 : null).invoke(UserProfileAction.d.e.i.b);
                } else if (epx.f(f3u0Var, f3u0.c.e.c)) {
                    u5p0 u5p0Var3 = jrq0Var.b;
                    (u5p0Var3 != null ? u5p0Var3 : null).invoke(UserProfileAction.d.e.n.b);
                } else if (epx.f(f3u0Var, f3u0.c.a.c)) {
                    u5p0 u5p0Var4 = jrq0Var.b;
                    (u5p0Var4 != null ? u5p0Var4 : null).invoke(UserProfileAction.d.e.b.b);
                } else if (epx.f(f3u0Var, f3u0.a.C2849a.d)) {
                    u5p0 u5p0Var5 = jrq0Var.b;
                    (u5p0Var5 != null ? u5p0Var5 : null).invoke(UserProfileAction.d.e.a.b);
                } else if (epx.f(f3u0Var, f3u0.a.e.d)) {
                    u5p0 u5p0Var6 = jrq0Var.b;
                    (u5p0Var6 != null ? u5p0Var6 : null).invoke(UserProfileAction.d.e.j.b);
                } else if (epx.f(f3u0Var, f3u0.a.b.d)) {
                    u5p0 u5p0Var7 = jrq0Var.b;
                    (u5p0Var7 != null ? u5p0Var7 : null).invoke(UserProfileAction.d.e.c.b);
                } else if (epx.f(f3u0Var, f3u0.a.f.d)) {
                    u5p0 u5p0Var8 = jrq0Var.b;
                    (u5p0Var8 != null ? u5p0Var8 : null).invoke(UserProfileAction.d.e.k.b);
                } else if (epx.f(f3u0Var, f3u0.a.i.d)) {
                    u5p0 u5p0Var9 = jrq0Var.b;
                    (u5p0Var9 != null ? u5p0Var9 : null).invoke(UserProfileAction.d.e.n.b);
                } else if (epx.f(f3u0Var, f3u0.a.d.d)) {
                    u5p0 u5p0Var10 = jrq0Var.b;
                    (u5p0Var10 != null ? u5p0Var10 : null).invoke(UserProfileAction.d.e.C1685e.b);
                } else if (epx.f(f3u0Var, f3u0.a.g.d)) {
                    u5p0 u5p0Var11 = jrq0Var.b;
                    (u5p0Var11 != null ? u5p0Var11 : null).invoke(UserProfileAction.d.e.l.b);
                } else if (epx.f(f3u0Var, f3u0.a.h.d)) {
                    u5p0 u5p0Var12 = jrq0Var.b;
                    (u5p0Var12 != null ? u5p0Var12 : null).invoke(UserProfileAction.d.e.m.b);
                } else if (epx.f(f3u0Var, f3u0.a.c.d)) {
                    u5p0 u5p0Var13 = jrq0Var.b;
                    (u5p0Var13 != null ? u5p0Var13 : null).invoke(UserProfileAction.d.e.C1684d.b);
                } else if (epx.f(f3u0Var, f3u0.a.j.d)) {
                    u5p0 u5p0Var14 = jrq0Var.b;
                    (u5p0Var14 != null ? u5p0Var14 : null).invoke(UserProfileAction.d.e.o.b);
                } else if (f3u0Var instanceof f3u0.c.b) {
                    jrq0Var.a(((f3u0.c.b) f3u0Var).c);
                } else {
                    if (!(f3u0Var instanceof f3u0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jrq0Var.a(((f3u0.b) f3u0Var).a);
                }
                return s3q0.a;
            case 10:
                UserRecomThemesFragment userRecomThemesFragment = (UserRecomThemesFragment) this.receiver;
                userRecomThemesFragment.getClass();
                xn50.a.c(userRecomThemesFragment, (dyq0) obj);
                return s3q0.a;
            case 11:
                ((ekm0) this.receiver).getClass();
                return ekm0.a((StoriesSaveResponseDto) obj);
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9b(UserRecomThemesFragment userRecomThemesFragment) {
        super(1, userRecomThemesFragment, UserRecomThemesFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9b(Object obj, int i) {
        super(1, obj, d3h.class, "openUrl", "openUrl(Ljava/lang/String;)V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                break;
            case 7:
                super(1, obj, io.reactivex.rxjava3.subjects.g.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                break;
            case 8:
                super(1, obj, s6k0.class, "onPhoneConfirmCommonError", "onPhoneConfirmCommonError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0);
                break;
            case 9:
            case 10:
            default:
                break;
            case 11:
                super(1, obj, ekm0.class, "mapSaveResponse", "mapSaveResponse(Lcom/vk/api/generated/stories/dto/StoriesSaveResponseDto;)Lcom/vk/dto/stories/model/StoryEntry;", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
