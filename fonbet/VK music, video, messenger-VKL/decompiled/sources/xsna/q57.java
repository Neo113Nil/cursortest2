package xsna;

import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.core.native_loader.NativeLib;
import com.vk.friends.groupinvite.impl.di.InviteFriendsComponentImpl;
import com.vk.im.chat.impl.ChatComponentImpl;
import com.vk.log.L;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent;
import com.vk.superapp.local.storage.js.bridge.impl.di.JsLocalStorageDelegateComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.Result;
import xsna.xuo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q57 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ q57(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return new n67();
            case 1:
                return new ClipsAttachmentsComponentImpl.a();
            case 2:
                return new com.vk.profile.community.details.impl.invitelink.b(0);
            case 3:
                qcy<Object>[] qcyVarArr = DefaultPlayerUIComponentImpl.h;
                return new zza0(BottomPlayerAppearance.COMPACT);
            case 4:
                return bng.b;
            case 5:
                L.a.getClass();
                return L.b("api_errors.log", false);
            case 6:
                return NativeLib.h();
            case 7:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                return new r40();
            case 8:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_LIKES_FILLED_FOOTER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 9:
                int i = dx90.W;
                return Boolean.FALSE;
            case 10:
                return new dhv();
            case 11:
                try {
                    failure = new JsLocalStorageDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsLocalStorageDelegateComponent.Companion.getClass();
                Object b = JsLocalStorageDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 12:
                return new xuo0.a();
            case 13:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 14:
                return new InviteFriendsComponentImpl.a();
            case 15:
                return new ChatComponentImpl.a();
            case 16:
                return asu0.a.b(5, 0L, "vk-stat-thread");
            default:
                return new cf1();
        }
    }

    public /* synthetic */ q57(VKApplication vKApplication) {
        this.b = 13;
    }
}
