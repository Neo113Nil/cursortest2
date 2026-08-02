package xsna;

import android.view.View;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.analytics.impl.tracker.di.AbstractPlayerAnalyticsComponent;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.uxd0;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ImageList imageList;
        ovv0 J;
        dvv0 a;
        switch (this.b) {
            case 0:
                MusicPlaybackQueueComponent musicPlaybackQueueComponent = (MusicPlaybackQueueComponent) this.c;
                OfflineAudioComponent offlineAudioComponent = (OfflineAudioComponent) this.d;
                AuthBridgeComponent authBridgeComponent = (AuthBridgeComponent) this.e;
                qcy<Object>[] qcyVarArr = AbstractPlayerAnalyticsComponent.g;
                return new t05(musicPlaybackQueueComponent.P2(), offlineAudioComponent.O2(), authBridgeComponent.s());
            case 1:
                amu amuVar = (amu) this.c;
                uxd0.a.InterfaceC3848a interfaceC3848a = (uxd0.a.InterfaceC3848a) this.d;
                View view = (View) this.e;
                xxd0 c = amuVar.j.c();
                xxd0.b bVar = c instanceof xxd0.b ? (xxd0.b) c : null;
                if (bVar != null && (imageList = bVar.k) != null) {
                    if (!imageList.Jb()) {
                        imageList = null;
                    }
                    if (imageList != null) {
                        amuVar.e(io.reactivex.rxjava3.kotlin.c.g(interfaceC3848a.o(UserProfileAvatarsInteractor.a(amuVar.v, com.vk.dto.common.a.b(amuVar.c.f))), new sx4(amuVar, view, imageList, 5), null, 2));
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 2:
                r6y r6yVar = (r6y) this.c;
                VkUiCommand vkUiCommand = (VkUiCommand) this.d;
                String str = (String) this.e;
                fvv0 M = r6yVar.M();
                if (M != null && (J = M.J()) != null && (a = J.a(vkUiCommand)) != null) {
                    a.a(str);
                }
                return s3q0.a;
            default:
                bag0 bag0Var = (bag0) this.c;
                ftm0 ftm0Var = (ftm0) this.d;
                azl azlVar = (azl) this.e;
                ftm0Var.getClass();
                bag0Var.d = ftm0Var;
                bag0Var.c = azlVar.getDensity();
                throw null;
        }
    }

    public /* synthetic */ jg(bag0 bag0Var, ftm0 ftm0Var, azl azlVar, Ref$IntRef ref$IntRef) {
        this.b = 3;
        this.c = bag0Var;
        this.d = ftm0Var;
        this.e = azlVar;
    }
}
