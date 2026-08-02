package xsna;

import android.graphics.Path;
import android.os.HandlerThread;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.playlists.di.stub.ClipsPlaylistsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.cart.api.di.CartComponent$Companion$STUB$1;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.vkclient.js.bridge.impl.di.JsVkclientDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.media.AsyncDNSResolver;
import xsna.jx4;
import xsna.ucm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class iy2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ iy2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        GroupsFieldsDto groupsFieldsDto;
        HandlerThread handlerThread_delegate$lambda$1;
        switch (this.b) {
            case 0:
                List c0 = drm0.c0(ky2.d, new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    try {
                        groupsFieldsDto = GroupsFieldsDto.valueOf((String) it.next());
                    } catch (Throwable unused) {
                        groupsFieldsDto = null;
                    }
                    if (groupsFieldsDto != null) {
                        arrayList.add(groupsFieldsDto);
                    }
                }
                return arrayList;
            case 1:
                handlerThread_delegate$lambda$1 = AsyncDNSResolver.handlerThread_delegate$lambda$1();
                return handlerThread_delegate$lambda$1;
            case 2:
                return new jx4.a.C3152a();
            case 3:
                return new ups0(0);
            case 4:
                return s3q0.a;
            case 5:
                return new ne6();
            case 6:
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr = CartComponent$Companion$STUB$1.f;
                return new vv9();
            case 9:
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                return new c4e();
            case 11:
                qcy<Object>[] qcyVarArr3 = ClipsPlaylistsComponentStub.d;
                return new ClipsPlaylistsComponentStub.d();
            case 12:
                qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                return new ul70();
            case 13:
                ComFeatures comFeatures = ComFeatures.COM_COMMUNITY_ADDRESSES_FIX;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 14:
                return new a390();
            case 15:
                return s3q0.a;
            case 16:
                return -1;
            case 17:
                int i = DeprecatedAttachActivity.K0;
                return s3q0.a;
            case 18:
                return ucm.a.h();
            case 19:
                int i2 = DiscoverSearchFragment.s0;
                return s3q0.a;
            case 20:
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                return Boolean.valueOf(fxc0.B().J().l());
            case 21:
                return new xrm(null, null, null, null, 15);
            case 22:
                return rli0.w(rli0.w(rli0.v(rli0.w(rli0.v(rli0.v(new i5g(ule0.a), ule0.h), ule0.c), "business_notify"), ule0.g), "chat_mention"), "money_request");
            case 23:
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.lineTo(0.3665f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.cubicTo(0.4725262f, 0.06240991f, 0.6154161f, 0.5f, 0.68325f, 0.5f);
                path.cubicTo(0.7547506f, 0.5f, 0.7572583f, 0.8145101f, 1.0f, 1.0f);
                return new PathInterpolator(path);
            case 24:
                qcy<Object>[] qcyVarArr5 = JsVkclientDelegateComponentImpl.b;
                return new u7y();
            case 25:
                return new Regex("((m\\.)?vkvideo\\.ru)");
            case 26:
                return new oqf0();
            case 27:
                return new bri();
            case 28:
                return new dja("local_block_id");
            default:
                return s3q0.a;
        }
    }
}
