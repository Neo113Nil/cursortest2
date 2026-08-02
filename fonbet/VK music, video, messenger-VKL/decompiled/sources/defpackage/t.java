package defpackage;

import com.vk.core.files.a;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.common.js.bridge.api.events.SetLocation$Response;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.io.File;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.drm0;
import xsna.gzs;
import xsna.oyw0;
import xsna.s3q0;
import xsna.sct0;
import xsna.vhk0;
import xsna.wh50;
import xsna.wmq0;
import xsna.xwv0;
import xsna.z3u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj3;
                String str = (String) obj2;
                SetLocation$Response setLocation$Response = (SetLocation$Response) obj;
                xwv0 xwv0Var = l0Var.d;
                if (xwv0Var != null) {
                    xwv0Var.p(drm0.N(str) ? null : str);
                }
                b.p(l0Var.L0().a, new JsMethod("VKWebAppSetLocation"), setLocation$Response, null, null, false, null, 60);
                break;
            case 1:
                break;
            case 2:
                ((wmq0) obj3).h((CommunityProfileContentItem) obj2, (ExtendedUserProfile) obj);
                break;
            case 3:
                ((sct0) obj3).b.removeParticipantView((ConversationVideoTrackParticipantKey) obj2, (TextureViewRenderer) obj);
                break;
            case 4:
                ((z3u0) obj3).o.invoke((StoryUserViewer) ((wh50) obj2).getValue(), Integer.valueOf(((Number) ((wh50) obj).getValue()).intValue()));
                break;
            default:
                oyw0 oyw0Var = (oyw0) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                if (((Ref$ObjectRef) obj3).element == 0) {
                    oyw0Var.f.invoke(oyw0Var.b, null);
                }
                ref$ObjectRef.element = null;
                File file = oyw0Var.c.c;
                Regex regex = a.a;
                vhk0.d(file);
                break;
        }
        return s3q0.a;
    }
}
