package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.channelrestrictions.ChannelRestrictionsComponentImpl;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.im.engine.models.SourceType;
import com.vk.im.engine.models.attaches.ButtonIconType;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g13 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g13(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        eh50<Object> eh50Var;
        boolean z2;
        boolean z3;
        int i;
        Integer c;
        boolean z4 = true;
        switch (this.b) {
            case 0:
                return new y6p0(-3.4028235E38f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 1:
                return new StringBuilder();
            case 2:
                return ButtonIconType.h();
            case 3:
                return Pattern.compile(".*/call/join/.*");
            case 4:
                return new SimpleDateFormat("dd MMMM HH:mm", Locale.getDefault());
            case 5:
                qcy<Object>[] qcyVarArr = ChannelRestrictionsComponentImpl.c;
                return new j71();
            case 6:
                return s3q0.a;
            case 7:
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            case 8:
                return g620.f().getExperiments().l();
            case 9:
                return new it50((ibr0) h0f.f.getValue());
            case 10:
                return new hmg();
            case 11:
                return new alt();
            case 12:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return context.getString(R.string.clip_description_collapse);
            case 13:
                return new u4e(new Handler(Looper.getMainLooper()), 16);
            case 14:
                return new d20();
            case 15:
                return new tw80();
            case 16:
                return Pattern.compile("^\\s+|\\s+$|<<|>>| -- |<br>|\n\n\n", 2);
            case 17:
                qcy<Object>[] qcyVarArr2 = NewsfeedFragment.J0;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_PHOTO;
                feedFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (!bVar.a(feedFeatures)) {
                    FeedFeatures feedFeatures2 = FeedFeatures.FRIEND_COMMENTS_PHOTO;
                    feedFeatures2.getClass();
                    if (!bVar.a(feedFeatures2)) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 18:
                return Integer.valueOf(cn70.b(0));
            case 19:
                return new t2c0();
            case 20:
                return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new y0d0());
            case 21:
                StringBuilder sb = new StringBuilder("mostPopularOwners = ");
                ReentrantLock reentrantLock = xf9.e.c;
                reentrantLock.lock();
                try {
                    ph50<MutableCameraBounds, fh50<Object>> ph50Var = xf9.f;
                    if (ph50Var.f()) {
                        eh50Var = pp70.a;
                    } else {
                        eh50<Object> eh50Var2 = new eh50<>(ph50Var.e);
                        Object[] objArr = ph50Var.b;
                        Object[] objArr2 = ph50Var.c;
                        long[] jArr = ph50Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8;
                                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((j & 255) < 128) {
                                            int i6 = (i2 << 3) + i5;
                                            Object obj = objArr[i6];
                                            z3 = z4;
                                            fh50 fh50Var = (fh50) objArr2[i6];
                                            i = i3;
                                            Object[] objArr3 = fh50Var.a;
                                            int i7 = fh50Var.b;
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                Object obj2 = objArr3[i8];
                                                int i9 = i8;
                                                eh50Var2.i(obj2, eh50Var2.c(0, obj2) + 1);
                                                i8 = i9 + 1;
                                            }
                                        } else {
                                            z3 = z4;
                                            i = i3;
                                        }
                                        j >>= i;
                                        i5++;
                                        i3 = i;
                                        z4 = z3;
                                    }
                                    z2 = z4;
                                    if (i4 != i3) {
                                    }
                                } else {
                                    z2 = z4;
                                }
                                if (i2 != length) {
                                    i2++;
                                    z4 = z2;
                                }
                            }
                        }
                        eh50Var = eh50Var2;
                    }
                    reentrantLock.unlock();
                    sb.append(eh50Var);
                    return sb.toString();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 22:
                return SourceType.h();
            case 23:
                qcy<Object>[] qcyVarArr3 = StoryEditorExtDepsComponentImpl.r;
                return new nsj0(y501.a());
            case 24:
                FeedFeatures feedFeatures3 = FeedFeatures.FRIEND_COMMENTS_PHOTO;
                feedFeatures3.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures3));
            case 25:
                int i10 = UserProfileFragment.p0;
                return k840.a.g().b();
            case 26:
                s7n0 b = bbq.b();
                return Integer.valueOf(Math.max(((b == null || (c = b.c()) == null) ? -1 : c.intValue()) + 1, 5));
            case 27:
                int i11 = VideoCatalogSearchRootVh.S;
                VideoFeatures videoFeatures = VideoFeatures.LAZY_ERROR_VIEW;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 28:
                return s3q0.a;
            default:
                int i12 = VideoNewProfileHeaderViewV2.y;
                return Boolean.valueOf(fxc0.B().J().N1());
        }
    }
}
