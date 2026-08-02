package xsna;

import android.widget.ImageView;
import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.AttachWithCounterView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.superapp.vkworkout.widget.impl.di.VkWorkoutWidgetComponentImpl;
import com.vk.voip.miniapps.impl.di.VoipMiniAppCallComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ip implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ip(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                String a = bnj0.a.a(((jp) obj).a.a);
                if (a != null) {
                    return erm0.D0(16, a).getBytes(emb.b);
                }
                throw new IllegalStateException("Secret Key for account manager cannot be created");
            case 1:
                return io.reactivex.rxjava3.core.q.P(0L, 30L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.schedulers.a.c()).U(new d43(new c43((com.vk.metrics.performance.power.a) obj), 0));
            case 2:
                int i2 = AttachWithCounterView.w;
                return (ImageView) ((AttachWithCounterView) obj).findViewById(R.id.attach_icon);
            case 3:
                int i3 = ClipsControlsView.P;
                return (VkImageSimple) ((ClipsControlsView) obj).findViewById(R.id.camera_clips_music_bg);
            case 4:
                return ((StorefrontComponent) ((LinksBridgeComponentImpl) obj).p.getValue()).a();
            case 5:
                NewsFeedComponentImpl newsFeedComponentImpl = (NewsFeedComponentImpl) obj;
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                nwy nwyVar = newsFeedComponentImpl.j;
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                qcy<Object> qcyVar = qcyVarArr2[7];
                v30 v30Var = (v30) nwyVar.c();
                com.vk.core.utils.newtork.b bVar = com.vk.core.utils.newtork.b.a;
                nwy nwyVar2 = newsFeedComponentImpl.i;
                qcy<Object> qcyVar2 = qcyVarArr2[6];
                return new r60(v30Var, bVar, (l40) nwyVar2.c());
            case 6:
                return (Executor) ((bpn0) obj).getValue();
            case 7:
                jau0 jau0Var = (jau0) obj;
                return new AccountManagerComponentImpl.a(jau0Var.b, new s6r0(jau0Var.h, new bpn0(new u94(jau0Var))), new r6r0(), jau0Var.i);
            case 8:
                int i4 = VkBlurView.C;
                ((VkBlurView) obj).invalidate();
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr3 = VkWorkoutWidgetComponentImpl.c;
                c3w0 c3w0Var = new c3w0();
                i3w0 i3w0Var = new i3w0();
                return new u2w0(new w6r(c3w0Var, i3w0Var), new bxt(((VkWorkoutWidgetComponentImpl) obj).a.Wb(), c3w0Var), i3w0Var, new i7o0());
            default:
                return new wsw0(((VoipMiniAppCallComponentImpl) obj).b);
        }
    }
}
