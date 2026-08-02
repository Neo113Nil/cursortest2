package xsna;

import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.gson.GsonBuilder;
import com.vk.attachpicker.StubFragment;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.comments.impl.di.CommentsComponentImpl;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.profile.community.impl.di.CommunityComponentImpl;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.a5n0;
import xsna.ds60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ o6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        JSONArray optJSONArray;
        boolean z = false;
        switch (this.b) {
            case 0:
                return new Regex("(?:(\\d+):)?([0-5]?\\d):([0-5]?\\d)(?![:\\d])");
            case 1:
                return new jq10(new bv10());
            case 2:
                fz5 fz5Var = fz5.d;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return fz5Var.t(context);
            case 3:
                return io.reactivex.rxjava3.subjects.d.O0(EmptyList.b);
            case 4:
                int i = BroadcastScheduledFragment.U;
                return zjq.b.i();
            case 5:
                Parcelable.Creator<ChannelMsgSendConfig> creator = ChannelMsgSendConfig.CREATOR;
                return new GsonBuilder().setDateFormat(1).disableHtmlEscaping().create();
            case 6:
                Features.Type type = Features.Type.FEATURE_VIDEO_ENCODER_EXTENDED_LOGGING;
                type.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(type));
            case 7:
                return new Handler(Looper.getMainLooper());
            case 8:
                b.d i2 = com.vk.toggle.b.A.i(VideoFeatures.AV1_WHITELIST);
                if (i2 != null && (g = i2.g()) != null && (optJSONArray = g.optJSONArray("devices")) != null) {
                    z = f370.O(optJSONArray).contains(Build.MANUFACTURER + ' ' + Build.MODEL);
                }
                return Boolean.valueOf(z);
            case 9:
                qcy<Object>[] qcyVarArr = CommentsComponentImpl.g;
                return new agg();
            case 10:
                qcy<Object>[] qcyVarArr2 = CommunityComponentImpl.c;
                return new e0i();
            case 11:
                return s3q0.a;
            case 12:
                int i3 = DeprecatedAttachActivity.K0;
                return new StubFragment();
            case 13:
                return new q5x();
            case 14:
                return new StringBuilder();
            case 15:
                qcy<Object>[] qcyVarArr3 = GeoPostsFragment.q0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 16:
                Path path = new Path();
                path.moveTo(38.5f, 20.0f);
                path.cubicTo(38.5f, 30.217f, 30.217f, 38.5f, 20.0f, 38.5f);
                path.cubicTo(9.783f, 38.5f, 1.5f, 30.217f, 1.5f, 20.0f);
                path.cubicTo(1.5f, 9.783f, 9.783f, 1.5f, 20.0f, 1.5f);
                path.cubicTo(30.217f, 1.5f, 38.5f, 9.783f, 38.5f, 20.0f);
                path.close();
                path.moveTo(38.5f, 20.0f);
                path.close();
                path.moveTo(38.5f, 20.0f);
                return path;
            case 17:
                return new Regex("/vkpay#([A-Za-z0-9_/&=\\-]+)$");
            case 18:
                return "cancellAllLoading ";
            case 19:
                return s3q0.a;
            case 20:
                return Boolean.valueOf(MusicFeatures.PODCAST_EPISODE_DOWNLOAD.h());
            case 21:
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                r55 r55Var = r55.a;
                return r55.a();
            case 24:
                return new ze7();
            case 25:
                qcy<Object>[] qcyVarArr4 = PostingComponentImpl.j;
                return new com.vk.posting.presentation.root.a();
            case 26:
                return s3q0.a;
            case 27:
                qcy<Object>[] qcyVarArr5 = SharingImEngineScopedComponentImpl.g;
                return new k70();
            case 28:
                return e43.l(a5n0.b.a.b, new a5n0.a.b(ds60.a.C2747a.b), new a5n0.a.b(ds60.a.b.b), a5n0.a.c.b);
            default:
                return new o9n0();
        }
    }
}
