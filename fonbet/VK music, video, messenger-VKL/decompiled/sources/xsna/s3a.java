package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.catalog.mvi.section.impl.di.CatalogComponentImpl;
import com.vk.dialogsscreen.impl.di.DialogsScreenFeatureComponentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.settings.impl.di.component.ManageCommunitiesNotificationsComponentImpl;
import com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent;
import com.vk.superapp.permission.js.bridge.impl.di.JsPermissionDelegateComponentImpl;
import com.vk.video.profile.di.VideoProfileNavigationComponentImpl;
import com.vkontakte.android.task.di.components.SuperAppPip2Component;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.asu0;
import xsna.p2i0;
import xsna.y390;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s3a implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s3a(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        p2i0 a;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogComponentImpl.j;
                return new f1u();
            case 1:
                qcy<Object>[] qcyVarArr2 = DefaultPlayerUIComponentImpl.h;
                return new t4b0();
            case 2:
                return gxq.a;
            case 3:
                List<String> list = p2i0.b;
                a = p2i0.a.a(p2i0.b);
                a.b(new Regex("\"(text)\":(\"(?:\\\\\"|[^\"])*\")", (Set<? extends RegexOption>) Collections.singleton(RegexOption.IGNORE_CASE)), new gky(0));
                return a;
            case 4:
                qcy<Object>[] qcyVarArr3 = NewsFeedComponentImpl.D;
                return new wfc0();
            case 5:
                asu0.a.getClass();
                return asu0.v();
            case 6:
                return new psd0();
            case 7:
                dsw<UserId, v390> dswVar = y390.a;
                return y390.a.a();
            case 8:
                try {
                    failure = new JsPermissionDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsPermissionDelegateComponent.Companion.getClass();
                Object b = JsPermissionDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 9:
                qcy<Object>[] qcyVarArr4 = SuperAppPip2Component.f;
                return new io.reactivex.rxjava3.subjects.f();
            case 10:
                return new Handler(Looper.getMainLooper());
            case 11:
                return new ManageCommunitiesNotificationsComponentImpl.a();
            case 12:
                return new VideoProfileNavigationComponentImpl.a();
            case 13:
                return new DialogsScreenFeatureComponentImpl.a(new k55(15));
            default:
                asu0.a.getClass();
                return asu0.y() ? asu0.h() : asu0.E((asu0.a) asu0.G(2, asu0.m).invoke(), "vk-rlottie-thread-");
        }
    }
}
